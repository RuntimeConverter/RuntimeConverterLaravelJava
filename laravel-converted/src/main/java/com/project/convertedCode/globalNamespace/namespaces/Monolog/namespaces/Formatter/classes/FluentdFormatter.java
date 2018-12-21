package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.FormatterInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Formatter/FluentdFormatter.php

*/

public class FluentdFormatter extends RuntimeClassBase implements FormatterInterface {

    public Object levelTag = false;

    public FluentdFormatter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FluentdFormatter.class) {
            this.__construct(env, args);
        }
    }

    public FluentdFormatter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "levelTag",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object levelTag = assignParameter(args, 0, true);
        if (null == levelTag) {
            levelTag = false;
        }
        if (!function_function_exists.f.env(env).call("json_encode").getBool()) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            "PHP's json extension is required to use Monolog's FluentdUnixFormatter"));
        }

        this.levelTag = ZVal.toBool(levelTag);
        return null;
    }

    @ConvertedMethod
    public Object isUsingLevelsInTag(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.levelTag);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object format(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object tag = null;
        ReferenceContainer message = new BasicReferenceContainer(null);
        tag = ZVal.assign(record.arrayGet(env, "channel"));
        if (ZVal.isTrue(this.levelTag)) {
            tag =
                    toStringR(tag, env)
                            + "."
                            + toStringR(
                                    NamespaceGlobal.strtolower
                                            .env(env)
                                            .call(record.arrayGet(env, "level_name"))
                                            .value(),
                                    env);
        }

        message.setObject(
                ZVal.newArray(
                        new ZPair("message", record.arrayGet(env, "message")),
                        new ZPair("extra", record.arrayGet(env, "extra"))));
        if (!ZVal.isTrue(this.levelTag)) {
            message.arrayAccess(env, "level").set(record.arrayGet(env, "level"));
            message.arrayAccess(env, "level_name").set(record.arrayGet(env, "level_name"));
        }

        return ZVal.assign(
                NamespaceGlobal.json_encode
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair(0, tag),
                                        new ZPair(
                                                1,
                                                env.callMethod(
                                                        record.arrayGet(env, "datetime"),
                                                        "getTimestamp",
                                                        FluentdFormatter.class)),
                                        new ZPair(2, message.getObject())))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "records", typeHint = "array")
    public Object formatBatch(RuntimeEnv env, Object... args) {
        Object records = assignParameter(args, 0, false);
        Object record = null;
        Object message = null;
        message = "";
        for (ZPair zpairResult740 : ZVal.getIterable(records, env, true)) {
            record = ZVal.assign(zpairResult740.getValue());
            message = toStringR(message, env) + toStringR(this.format(env, record), env);
        }

        return ZVal.assign(message);
    }

    public static final Object CONST_class = "Monolog\\Formatter\\FluentdFormatter";

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
                    .setName("Monolog\\Formatter\\FluentdFormatter")
                    .setLookup(
                            FluentdFormatter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("levelTag")
                    .setFilename(
                            "vendor/monolog/monolog/src/Monolog/Formatter/FluentdFormatter.php")
                    .addInterface("Monolog\\Formatter\\FormatterInterface")
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
