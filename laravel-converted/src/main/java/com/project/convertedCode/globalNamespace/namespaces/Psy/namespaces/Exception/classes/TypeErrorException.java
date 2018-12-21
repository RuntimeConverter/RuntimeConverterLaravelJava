package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
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
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Exception/TypeErrorException.php

*/

public class TypeErrorException extends PHPException implements Exception {

    public Object rawMessage = null;

    public TypeErrorException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TypeErrorException.class) {
            this.__construct(env, args);
        }
    }

    public TypeErrorException(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "code", defaultValue = "0", defaultValueType = "number")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, true);
        if (null == message) {
            message = "";
        }
        Object code = assignParameter(args, 1, true);
        if (null == code) {
            code = 0;
        }
        this.rawMessage = message;
        message =
                function_preg_replace
                        .f
                        .env(env)
                        .call("/, called in .*?: eval\\(\\)'d code/", "", message)
                        .value();
        super.__construct(
                env, function_sprintf.f.env(env).call("TypeError: %s", message).value(), code);
        return null;
    }

    @ConvertedMethod
    public Object getRawMessage(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.rawMessage);
    }

    public static final Object CONST_class = "Psy\\Exception\\TypeErrorException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends PHPException.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "e", typeHint = "TypeError")
        public Object fromTypeError(RuntimeEnv env, Object... args) {
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
                            .TypeErrorException(
                            env,
                            env.callMethod(e, "getMessage", TypeErrorException.class),
                            env.callMethod(e, "getCode", TypeErrorException.class)));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Exception\\TypeErrorException")
                    .setLookup(
                            TypeErrorException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("rawMessage")
                    .setFilename("vendor/psy/psysh/src/Exception/TypeErrorException.php")
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
