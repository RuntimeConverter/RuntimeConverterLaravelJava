package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.Exception;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Exception/ErrorException.php

*/

public class ErrorException extends com.runtimeconverter.runtime.nativeClasses.errors.ErrorException
        implements Exception {

    public Object rawMessage = null;

    public ErrorException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ErrorException.class) {
            this.__construct(env, args);
        }
    }

    public ErrorException(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "code", defaultValue = "0", defaultValueType = "number")
    @ConvertedParameter(
        index = 2,
        name = "severity",
        defaultValue = "1",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 3,
        name = "filename",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "lineno",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "previous",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object message = assignParameter(args, 0, true);
        if (null == message) {
            message = "";
        }
        Object code = assignParameter(args, 1, true);
        if (null == code) {
            code = 0;
        }
        Object severity = assignParameter(args, 2, true);
        if (null == severity) {
            severity = 1;
        }
        Object filename = assignParameter(args, 3, true);
        if (null == filename) {
            filename = ZVal.getNull();
        }
        Object lineno = assignParameter(args, 4, true);
        if (null == lineno) {
            lineno = ZVal.getNull();
        }
        Object previous = assignParameter(args, 5, true);
        if (null == previous) {
            previous = ZVal.getNull();
        }
        Object type = null;
        this.rawMessage = message;
        if (ZVal.toBool(!ZVal.isEmpty(filename))
                && ZVal.toBool(
                        function_preg_match
                                .f
                                .env(env)
                                .call("{Psy[/\\\\]ExecutionLoop}", filename)
                                .value())) {
            filename = "";
        }

        SwitchEnumType77 switchVariable77 =
                ZVal.getEnum(
                        severity,
                        SwitchEnumType77.DEFAULT_CASE,
                        SwitchEnumType77.DYNAMIC_TYPE_271,
                        2048,
                        SwitchEnumType77.DYNAMIC_TYPE_272,
                        8,
                        SwitchEnumType77.DYNAMIC_TYPE_273,
                        1024,
                        SwitchEnumType77.DYNAMIC_TYPE_274,
                        2,
                        SwitchEnumType77.DYNAMIC_TYPE_275,
                        32,
                        SwitchEnumType77.DYNAMIC_TYPE_276,
                        128,
                        SwitchEnumType77.DYNAMIC_TYPE_277,
                        512,
                        SwitchEnumType77.DYNAMIC_TYPE_278,
                        8192,
                        SwitchEnumType77.DYNAMIC_TYPE_279,
                        16384,
                        SwitchEnumType77.DYNAMIC_TYPE_280,
                        4096);
        switch (switchVariable77) {
            case DYNAMIC_TYPE_271:
                type = "Strict error";
                break;
            case DYNAMIC_TYPE_272:
            case DYNAMIC_TYPE_273:
                type = "Notice";
                break;
            case DYNAMIC_TYPE_274:
            case DYNAMIC_TYPE_275:
            case DYNAMIC_TYPE_276:
            case DYNAMIC_TYPE_277:
                type = "Warning";
                break;
            case DYNAMIC_TYPE_278:
            case DYNAMIC_TYPE_279:
                type = "Deprecated";
                break;
            case DYNAMIC_TYPE_280:
                type = "Recoverable fatal error";
                break;
            case DEFAULT_CASE:
                type = "Error";
                break;
        }
        ;
        message =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "PHP %s:  %s%s on line %d",
                                type,
                                message,
                                ZVal.isTrue(filename) ? " in " + toStringR(filename, env) : "",
                                lineno)
                        .value();
        super.__construct(env, message, code, severity, filename, lineno, previous);
        return null;
    }

    @ConvertedMethod
    public Object getRawMessage(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.rawMessage);
    }

    public static final Object CONST_class = "Psy\\Exception\\ErrorException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.runtimeconverter
                    .runtime
                    .nativeClasses
                    .errors
                    .ErrorException
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "errno")
        @ConvertedParameter(index = 1, name = "errstr")
        @ConvertedParameter(index = 2, name = "errfile")
        @ConvertedParameter(index = 3, name = "errline")
        public Object throwException(RuntimeEnv env, Object... args) {
            Object errno = assignParameter(args, 0, false);
            Object errstr = assignParameter(args, 1, false);
            Object errfile = assignParameter(args, 2, false);
            Object errline = assignParameter(args, 3, false);
            throw ZVal.getException(
                    env,
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Psy
                            .namespaces
                            .Exception
                            .classes
                            .ErrorException(env, errstr, 0, errno, errfile, errline));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "e", typeHint = "Error")
        public Object fromError(RuntimeEnv env, Object... args) {
            Object e = assignParameter(args, 0, false);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Psy
                            .namespaces
                            .Exception
                            .classes
                            .ErrorException(
                            env,
                            env.callMethod(e, "getMessage", ErrorException.class),
                            env.callMethod(e, "getCode", ErrorException.class),
                            1,
                            env.callMethod(e, "getFile", ErrorException.class),
                            env.callMethod(e, "getLine", ErrorException.class),
                            e));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Exception\\ErrorException")
                    .setLookup(
                            ErrorException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("rawMessage")
                    .setFilename("vendor/psy/psysh/src/Exception/ErrorException.php")
                    .addInterface("Psy\\Exception\\Exception")
                    .addInterface("Throwable")
                    .addExtendsClass("ErrorException")
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

    private enum SwitchEnumType77 {
        DYNAMIC_TYPE_271,
        DYNAMIC_TYPE_272,
        DYNAMIC_TYPE_273,
        DYNAMIC_TYPE_274,
        DYNAMIC_TYPE_275,
        DYNAMIC_TYPE_276,
        DYNAMIC_TYPE_277,
        DYNAMIC_TYPE_278,
        DYNAMIC_TYPE_279,
        DYNAMIC_TYPE_280,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
