package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.namespaces.Exceptions.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Routing/Exceptions/UrlGenerationException.php

*/

public class UrlGenerationException extends PHPException {

    public UrlGenerationException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == UrlGenerationException.class) {
            this.__construct(env, args);
        }
    }

    public UrlGenerationException(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class =
            "Illuminate\\Routing\\Exceptions\\UrlGenerationException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends PHPException.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "route")
        public Object forMissingParameters(RuntimeEnv env, Object... args) {
            Object route = assignParameter(args, 0, false);
            return ZVal.assign(
                    env.createNewWithLateStaticBindings(
                            this,
                            "Missing required parameters for [Route: "
                                    + toStringR(
                                            env.callMethod(
                                                    route, "getName", UrlGenerationException.class),
                                            env)
                                    + "] [URI: "
                                    + toStringR(
                                            env.callMethod(
                                                    route, "uri", UrlGenerationException.class),
                                            env)
                                    + "]."));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Routing\\Exceptions\\UrlGenerationException")
                    .setLookup(
                            UrlGenerationException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Routing/Exceptions/UrlGenerationException.php")
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
