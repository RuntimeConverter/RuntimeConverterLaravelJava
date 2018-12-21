package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.Exception;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeClasses.errors.PHPError;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.ErrorException;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Exception/ThrowUpException.php

*/

public class ThrowUpException extends PHPException implements Exception {

    public ThrowUpException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ThrowUpException.class) {
            this.__construct(env, args);
        }
    }

    public ThrowUpException(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception", typeHint = "Exception")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, false);
        Object message = null;
        message =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "Throwing %s with message '%s'",
                                function_get_class.f.env(env).call(exception).value(),
                                env.callMethod(exception, "getMessage", ThrowUpException.class))
                        .value();
        super.__construct(
                env,
                message,
                env.callMethod(exception, "getCode", ThrowUpException.class),
                exception);
        return null;
    }

    @ConvertedMethod
    public Object getRawMessage(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this, "getPrevious", ThrowUpException.class),
                        "getMessage",
                        ThrowUpException.class));
    }

    public static final Object CONST_class = "Psy\\Exception\\ThrowUpException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends PHPException.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "throwable")
        public Object fromThrowable(RuntimeEnv env, Object... args) {
            Object throwable = assignParameter(args, 0, false);
            if (ZVal.isTrue(ZVal.checkInstanceType(throwable, PHPError.class, "Error"))) {
                throwable = ErrorException.runtimeStaticObject.fromError(env, throwable);
            }

            if (!ZVal.isTrue(ZVal.checkInstanceType(throwable, PHPException.class, "Exception"))) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env, "throw-up can only throw Exceptions and Errors"));
            }

            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Psy
                            .namespaces
                            .Exception
                            .classes
                            .ThrowUpException(env, throwable));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Exception\\ThrowUpException")
                    .setLookup(
                            ThrowUpException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/psy/psysh/src/Exception/ThrowUpException.php")
                    .addInterface("Psy\\Exception\\Exception")
                    .addInterface("Throwable")
                    .addExtendsClass("Exception")
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
