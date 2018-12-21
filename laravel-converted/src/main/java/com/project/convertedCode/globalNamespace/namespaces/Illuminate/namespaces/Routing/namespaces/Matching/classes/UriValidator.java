package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.namespaces.Matching.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.namespaces.Matching.classes.ValidatorInterface;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Routing/Matching/UriValidator.php

*/

public class UriValidator extends RuntimeClassBase implements ValidatorInterface {

    public UriValidator(RuntimeEnv env, Object... args) {
        super(env);
    }

    public UriValidator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "route", typeHint = "Illuminate\\Routing\\Route")
    @ConvertedParameter(index = 1, name = "request", typeHint = "Illuminate\\Http\\Request")
    public Object matches(RuntimeEnv env, Object... args) {
        Object route = assignParameter(args, 0, false);
        Object request = assignParameter(args, 1, false);
        Object path = null;
        path =
                ZVal.assign(
                        ZVal.equalityCheck(env.callMethod(request, "path", UriValidator.class), "/")
                                ? "/"
                                : "/"
                                        + toStringR(
                                                env.callMethod(request, "path", UriValidator.class),
                                                env));
        return ZVal.assign(
                function_preg_match
                        .f
                        .env(env)
                        .call(
                                env.callMethod(
                                        env.callMethod(route, "getCompiled", UriValidator.class),
                                        "getRegex",
                                        UriValidator.class),
                                NamespaceGlobal.rawurldecode.env(env).call(path).value())
                        .value());
    }

    public static final Object CONST_class = "Illuminate\\Routing\\Matching\\UriValidator";

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
                    .setName("Illuminate\\Routing\\Matching\\UriValidator")
                    .setLookup(
                            UriValidator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Routing/Matching/UriValidator.php")
                    .addInterface("Illuminate\\Routing\\Matching\\ValidatorInterface")
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
