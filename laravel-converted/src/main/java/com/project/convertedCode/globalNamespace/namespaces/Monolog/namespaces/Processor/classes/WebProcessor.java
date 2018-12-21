package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Processor.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.UnexpectedValueException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeInterfaces.ArrayAccess;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Processor/WebProcessor.php

*/

public class WebProcessor extends RuntimeClassBase {

    public Object serverData = null;

    public Object extraFields =
            ZVal.newArray(
                    new ZPair("url", "REQUEST_URI"),
                    new ZPair("ip", "REMOTE_ADDR"),
                    new ZPair("http_method", "REQUEST_METHOD"),
                    new ZPair("server", "SERVER_NAME"),
                    new ZPair("referrer", "HTTP_REFERER"));

    public WebProcessor(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == WebProcessor.class) {
            this.__construct(env, args);
        }
    }

    public WebProcessor(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "serverData",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "extraFields",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object serverData = assignParameter(args, 0, true);
        if (null == serverData) {
            serverData = ZVal.getNull();
        }
        ReferenceContainer extraFields =
                new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == extraFields.getObject()) {
            extraFields.setObject(ZVal.getNull());
        }
        Object fieldName = null;
        ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", serverData)) {
            this.serverData = _SERVER.getObject();

        } else if (ZVal.toBool(function_is_array.f.env(env).call(serverData).value())
                || ZVal.toBool(
                        ZVal.checkInstanceType(serverData, ArrayAccess.class, "ArrayAccess"))) {
            this.serverData = serverData;

        } else {
            throw ZVal.getException(
                    env,
                    new UnexpectedValueException(
                            env,
                            "$serverData must be an array or object implementing ArrayAccess."));
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", extraFields.getObject())) {
            if (arrayActionR(ArrayAction.ISSET, extraFields, env, 0)) {
                for (ZPair zpairResult818 :
                        ZVal.getIterable(
                                function_array_keys.f.env(env).call(this.extraFields).value(),
                                env,
                                true)) {
                    fieldName = ZVal.assign(zpairResult818.getValue());
                    if (!function_in_array
                            .f
                            .env(env)
                            .call(fieldName, extraFields.getObject())
                            .getBool()) {
                        arrayActionR(
                                ArrayAction.UNSET,
                                new ReferenceClassProperty(this, "extraFields", env),
                                env,
                                fieldName);
                    }
                }

            } else {
                this.extraFields = extraFields.getObject();
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object __invoke(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "serverData", env),
                env,
                "REQUEST_URI")) {
            return ZVal.assign(record.getObject());
        }

        record.arrayAccess(env, "extra")
                .set(this.appendExtraFields(env, record.arrayGet(env, "extra")));
        return ZVal.assign(record.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "extraName")
    @ConvertedParameter(index = 1, name = "serverName")
    public Object addExtraField(RuntimeEnv env, Object... args) {
        Object extraName = assignParameter(args, 0, false);
        Object serverName = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "extraFields", env)
                .arrayAccess(env, extraName)
                .set(serverName);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "extra", typeHint = "array")
    private Object appendExtraFields(RuntimeEnv env, Object... args) {
        ReferenceContainer extra = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object extraName = null;
        Object serverName = null;
        for (ZPair zpairResult819 : ZVal.getIterable(this.extraFields, env, false)) {
            extraName = ZVal.assign(zpairResult819.getKey());
            serverName = ZVal.assign(zpairResult819.getValue());
            extra.arrayAccess(env, extraName)
                    .set(
                            arrayActionR(
                                            ArrayAction.ISSET,
                                            new ReferenceClassProperty(this, "serverData", env),
                                            env,
                                            serverName)
                                    ? new ReferenceClassProperty(this, "serverData", env)
                                            .arrayGet(env, serverName)
                                    : ZVal.getNull());
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "serverData", env),
                env,
                "UNIQUE_ID")) {
            extra.arrayAccess(env, "unique_id")
                    .set(
                            new ReferenceClassProperty(this, "serverData", env)
                                    .arrayGet(env, "UNIQUE_ID"));
        }

        return ZVal.assign(extra.getObject());
    }

    public static final Object CONST_class = "Monolog\\Processor\\WebProcessor";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Processor\\WebProcessor")
                    .setLookup(
                            WebProcessor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("extraFields", "serverData")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Processor/WebProcessor.php")
                    .get();

    @Override
    public ReflectionClassData getRuntimeConverterReflectionData() {
        return runtimeConverterReflectionData;
    }

    @Override
    public Object converterRuntimeCallExtended(
            RuntimeEnv env,
            String method,
            Class<?> caller,
            PassByReferenceArgs passByReferenceArgs,
            Object... args) {
        return RuntimeClassBase.converterRuntimeCallExtendedWithDataStatic(
                this,
                runtimeConverterReflectionData,
                env,
                method,
                caller,
                passByReferenceArgs,
                args);
    }
}
