package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.Exception;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.errors.ErrorException;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Exception/FatalErrorException.php

*/

public class FatalErrorException extends ErrorException implements Exception {

    public Object rawMessage = null;

    public FatalErrorException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FatalErrorException.class) {
            this.__construct(env, args);
        }
    }

    public FatalErrorException(NoConstructor n) {
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
        Object ternaryExpressionTemp = null;
        if (ZVal.strictEqualityCheck(lineno, "===", -1)) {
            lineno = ZVal.getNull();
        }

        this.rawMessage = message;
        message =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "PHP Fatal error:  %s in %s on line %d",
                                message,
                                ZVal.isTrue(ternaryExpressionTemp = filename)
                                        ? ternaryExpressionTemp
                                        : "eval()'d code",
                                lineno)
                        .value();
        super.__construct(env, message, code, severity, filename, lineno, previous);
        return null;
    }

    @ConvertedMethod
    public Object getRawMessage(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.rawMessage);
    }

    public static final Object CONST_class = "Psy\\Exception\\FatalErrorException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ErrorException.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Exception\\FatalErrorException")
                    .setLookup(
                            FatalErrorException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("rawMessage")
                    .setFilename("vendor/psy/psysh/src/Exception/FatalErrorException.php")
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
}
