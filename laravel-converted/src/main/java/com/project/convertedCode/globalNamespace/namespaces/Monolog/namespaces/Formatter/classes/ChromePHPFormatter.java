package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.FormatterInterface;
import com.runtimeconverter.runtime.nativeFunctions.array.function_reset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Formatter/ChromePHPFormatter.php

*/

public class ChromePHPFormatter extends RuntimeClassBase implements FormatterInterface {

    public Object logLevels =
            ZVal.newArray(
                    new ZPair(Logger.CONST_DEBUG, "log"),
                    new ZPair(Logger.CONST_INFO, "info"),
                    new ZPair(Logger.CONST_NOTICE, "info"),
                    new ZPair(Logger.CONST_WARNING, "warn"),
                    new ZPair(Logger.CONST_ERROR, "error"),
                    new ZPair(Logger.CONST_CRITICAL, "error"),
                    new ZPair(Logger.CONST_ALERT, "error"),
                    new ZPair(Logger.CONST_EMERGENCY, "error"));

    public ChromePHPFormatter(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ChromePHPFormatter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object format(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object backtrace = null;
        ReferenceContainer message = new BasicReferenceContainer(null);
        backtrace = "unknown";
        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, record, env, "extra", "file"))
                && ZVal.toBool(arrayActionR(ArrayAction.ISSET, record, env, "extra", "line"))) {
            backtrace =
                    toStringR(record.arrayGet(env, "extra", "file"), env)
                            + " : "
                            + toStringR(record.arrayGet(env, "extra", "line"), env);
            arrayActionR(ArrayAction.UNSET, record, env, "extra", "file");
            arrayActionR(ArrayAction.UNSET, record, env, "extra", "line");
        }

        message.setObject(ZVal.newArray(new ZPair("message", record.arrayGet(env, "message"))));
        if (ZVal.isTrue(record.arrayGet(env, "context"))) {
            message.arrayAccess(env, "context").set(record.arrayGet(env, "context"));
        }

        if (ZVal.isTrue(record.arrayGet(env, "extra"))) {
            message.arrayAccess(env, "extra").set(record.arrayGet(env, "extra"));
        }

        if (ZVal.strictEqualityCheck(
                function_count.f.env(env).call(message.getObject()).value(), "===", 1)) {
            message.setObject(function_reset.f.env(env).call(message.getObject()).value());
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(0, record.arrayGet(env, "channel")),
                        new ZPair(1, message.getObject()),
                        new ZPair(2, backtrace),
                        new ZPair(
                                3,
                                new ReferenceClassProperty(this, "logLevels", env)
                                        .arrayGet(env, record.arrayGet(env, "level")))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "records", typeHint = "array")
    public Object formatBatch(RuntimeEnv env, Object... args) {
        Object records = assignParameter(args, 0, false);
        ReferenceContainer formatted = new BasicReferenceContainer(null);
        Object record = null;
        formatted.setObject(ZVal.newArray());
        for (ZPair zpairResult737 : ZVal.getIterable(records, env, true)) {
            record = ZVal.assign(zpairResult737.getValue());
            formatted.arrayAppend(env).set(this.format(env, record));
        }

        return ZVal.assign(formatted.getObject());
    }

    public static final Object CONST_class = "Monolog\\Formatter\\ChromePHPFormatter";

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
                    .setName("Monolog\\Formatter\\ChromePHPFormatter")
                    .setLookup(
                            ChromePHPFormatter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("logLevels")
                    .setFilename(
                            "vendor/monolog/monolog/src/Monolog/Formatter/ChromePHPFormatter.php")
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
