package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.JsonFormatter;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Formatter/LogglyFormatter.php

*/

public class LogglyFormatter extends JsonFormatter {

    public LogglyFormatter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == LogglyFormatter.class) {
            this.__construct(env, args);
        }
    }

    public LogglyFormatter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "batchMode")
    @ConvertedParameter(
        index = 1,
        name = "appendNewline",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object batchMode = assignParameter(args, 0, true);
        if (null == batchMode) {
            batchMode = CONST_BATCH_MODE_NEWLINES;
        }
        Object appendNewline = assignParameter(args, 1, true);
        if (null == appendNewline) {
            appendNewline = false;
        }
        super.__construct(env, batchMode, appendNewline);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object format(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, record, env, "datetime"))
                && ZVal.toBool(
                        ZVal.checkInstanceType(
                                record.arrayGet(env, "datetime"), DateTime.class, "DateTime"))) {
            record.arrayAccess(env, "timestamp")
                    .set(
                            env.callMethod(
                                    record.arrayGet(env, "datetime"),
                                    "format",
                                    LogglyFormatter.class,
                                    "Y-m-d\\TH:i:s.uO"));
        }

        return ZVal.assign(super.format(env, record.getObject()));
    }

    public static final Object CONST_class = "Monolog\\Formatter\\LogglyFormatter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends JsonFormatter.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Formatter\\LogglyFormatter")
                    .setLookup(
                            LogglyFormatter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "appendNewline", "batchMode", "dateFormat", "includeStacktraces")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Formatter/LogglyFormatter.php")
                    .addInterface("Monolog\\Formatter\\FormatterInterface")
                    .addExtendsClass("Monolog\\Formatter\\JsonFormatter")
                    .addExtendsClass("Monolog\\Formatter\\NormalizerFormatter")
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
