package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.namespaces.Curl.classes.Util;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractProcessingHandler;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/IFTTTHandler.php

*/

public class IFTTTHandler extends AbstractProcessingHandler {

    public Object eventName = null;

    public Object secretKey = null;

    public IFTTTHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IFTTTHandler.class) {
            this.__construct(env, args);
        }
    }

    public IFTTTHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eventName")
    @ConvertedParameter(index = 1, name = "secretKey")
    @ConvertedParameter(index = 2, name = "level")
    @ConvertedParameter(
        index = 3,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object eventName = assignParameter(args, 0, false);
        Object secretKey = assignParameter(args, 1, false);
        Object level = assignParameter(args, 2, true);
        if (null == level) {
            level = Logger.CONST_ERROR;
        }
        Object bubble = assignParameter(args, 3, true);
        if (null == bubble) {
            bubble = true;
        }
        this.eventName = eventName;
        this.secretKey = secretKey;
        super.__construct(env, level, bubble);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object write(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object postString = null;
        Object ch = null;
        Object postData = null;
        postData =
                ZVal.newArray(
                        new ZPair("value1", record.arrayGet(env, "channel")),
                        new ZPair("value2", record.arrayGet(env, "level_name")),
                        new ZPair("value3", record.arrayGet(env, "message")));
        postString = NamespaceGlobal.json_encode.env(env).call(postData).value();
        ch = NamespaceGlobal.curl_init.env(env).call().value();
        NamespaceGlobal.curl_setopt
                .env(env)
                .call(
                        ch,
                        10002,
                        "https://maker.ifttt.com/trigger/"
                                + toStringR(this.eventName, env)
                                + "/with/key/"
                                + toStringR(this.secretKey, env));
        NamespaceGlobal.curl_setopt.env(env).call(ch, 47, true);
        NamespaceGlobal.curl_setopt.env(env).call(ch, 19913, true);
        NamespaceGlobal.curl_setopt.env(env).call(ch, 10015, postString);
        NamespaceGlobal.curl_setopt
                .env(env)
                .call(ch, 10023, ZVal.arrayFromList("Content-Type: application/json"));
        Util.runtimeStaticObject.execute(env, ch);
        return null;
    }

    public static final Object CONST_class = "Monolog\\Handler\\IFTTTHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends AbstractProcessingHandler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Handler\\IFTTTHandler")
                    .setLookup(
                            IFTTTHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bubble", "eventName", "formatter", "level", "processors", "secretKey")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/IFTTTHandler.php")
                    .addInterface("Monolog\\Handler\\HandlerInterface")
                    .addExtendsClass("Monolog\\Handler\\AbstractProcessingHandler")
                    .addExtendsClass("Monolog\\Handler\\AbstractHandler")
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
