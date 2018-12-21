package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractProcessingHandler;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.LineFormatter;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/ErrorLogHandler.php

*/

public class ErrorLogHandler extends AbstractProcessingHandler {

    public Object messageType = null;

    public Object expandNewlines = null;

    public ErrorLogHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ErrorLogHandler.class) {
            this.__construct(env, args);
        }
    }

    public ErrorLogHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messageType")
    @ConvertedParameter(index = 1, name = "level")
    @ConvertedParameter(
        index = 2,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "expandNewlines",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object messageType = assignParameter(args, 0, true);
        if (null == messageType) {
            messageType = CONST_OPERATING_SYSTEM;
        }
        Object level = assignParameter(args, 1, true);
        if (null == level) {
            level = Logger.CONST_DEBUG;
        }
        Object bubble = assignParameter(args, 2, true);
        if (null == bubble) {
            bubble = true;
        }
        Object expandNewlines = assignParameter(args, 3, true);
        if (null == expandNewlines) {
            expandNewlines = false;
        }
        Object message = null;
        super.__construct(env, level, bubble);
        if (ZVal.strictEqualityCheck(
                false,
                "===",
                function_in_array
                        .f
                        .env(env)
                        .call(messageType, runtimeStaticObject.getAvailableTypes(env))
                        .value())) {
            message =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "The given message type \"%s\" is not supported",
                                    NamespaceGlobal.print_r
                                            .env(env)
                                            .call(messageType, true)
                                            .value())
                            .value();
            throw ZVal.getException(env, new InvalidArgumentException(env, message));
        }

        this.messageType = messageType;
        this.expandNewlines = expandNewlines;
        return null;
    }

    @ConvertedMethod
    protected Object getDefaultFormatter(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new LineFormatter(
                        env, "[%datetime%] %channel%.%level_name%: %message% %context% %extra%"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object write(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object line = null;
        Object lines = null;
        if (ZVal.isTrue(this.expandNewlines)) {
            lines =
                    NamespaceGlobal.preg_split
                            .env(env)
                            .call("{[\\r\\n]+}", toStringR(record.arrayGet(env, "formatted"), env))
                            .value();
            for (ZPair zpairResult773 : ZVal.getIterable(lines, env, true)) {
                line = ZVal.assign(zpairResult773.getValue());
                NamespaceGlobal.error_log.env(env).call(line, this.messageType);
            }

        } else {
            NamespaceGlobal.error_log
                    .env(env)
                    .call(toStringR(record.arrayGet(env, "formatted"), env), this.messageType);
        }

        return null;
    }

    public static final Object CONST_OPERATING_SYSTEM = 0;

    public static final Object CONST_SAPI = 4;

    public static final Object CONST_class = "Monolog\\Handler\\ErrorLogHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends AbstractProcessingHandler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object getAvailableTypes(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    ZVal.newArray(new ZPair(0, CONST_OPERATING_SYSTEM), new ZPair(1, CONST_SAPI)));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Handler\\ErrorLogHandler")
                    .setLookup(
                            ErrorLogHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bubble",
                            "expandNewlines",
                            "formatter",
                            "level",
                            "messageType",
                            "processors")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/ErrorLogHandler.php")
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
