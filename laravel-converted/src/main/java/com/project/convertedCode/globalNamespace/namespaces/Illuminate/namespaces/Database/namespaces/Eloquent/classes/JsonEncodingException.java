package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Eloquent/JsonEncodingException.php

*/

public class JsonEncodingException extends RuntimeException {

    public JsonEncodingException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == JsonEncodingException.class) {
            this.__construct(env, args);
        }
    }

    public JsonEncodingException(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class =
            "Illuminate\\Database\\Eloquent\\JsonEncodingException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends RuntimeException.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "model")
        @ConvertedParameter(index = 1, name = "message")
        public Object forModel(RuntimeEnv env, Object... args) {
            Object model = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, false);
            return ZVal.assign(
                    env.createNewWithLateStaticBindings(
                            this,
                            "Error encoding model ["
                                    + toStringR(
                                            function_get_class.f.env(env).call(model).value(), env)
                                    + "] with ID ["
                                    + toStringR(
                                            env.callMethod(
                                                    model, "getKey", JsonEncodingException.class),
                                            env)
                                    + "] to JSON: "
                                    + toStringR(message, env)));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "model")
        @ConvertedParameter(index = 1, name = "key")
        @ConvertedParameter(index = 2, name = "message")
        public Object forAttribute(RuntimeEnv env, Object... args) {
            Object model = assignParameter(args, 0, false);
            Object key = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, false);
            Object _pClass = null;
            _pClass = function_get_class.f.env(env).call(model).value();
            return ZVal.assign(
                    env.createNewWithLateStaticBindings(
                            this,
                            "Unable to encode attribute ["
                                    + toStringR(key, env)
                                    + "] for model ["
                                    + toStringR(_pClass, env)
                                    + "] to JSON: "
                                    + toStringR(message, env)
                                    + "."));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Eloquent\\JsonEncodingException")
                    .setLookup(
                            JsonEncodingException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Eloquent/JsonEncodingException.php")
                    .addInterface("Throwable")
                    .addExtendsClass("RuntimeException")
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
