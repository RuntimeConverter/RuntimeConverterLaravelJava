package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Bootstrap.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Facade;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.classes.PackageManifest;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.classes.AliasLoader;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Bootstrap/RegisterFacades.php

*/

public class RegisterFacades extends RuntimeClassBase {

    public RegisterFacades(RuntimeEnv env, Object... args) {
        super(env);
    }

    public RegisterFacades(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "app",
        typeHint = "Illuminate\\Contracts\\Foundation\\Application"
    )
    public Object bootstrap(RuntimeEnv env, Object... args) {
        Object app = assignParameter(args, 0, false);
        Facade.runtimeStaticObject.clearResolvedInstances(env);
        Facade.runtimeStaticObject.setFacadeApplication(env, app);
        env.callMethod(
                AliasLoader.runtimeStaticObject.getInstance(
                        env,
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(
                                                env.callMethod(
                                                        app,
                                                        "make",
                                                        RegisterFacades.class,
                                                        "config"),
                                                "get",
                                                RegisterFacades.class,
                                                "app.aliases",
                                                ZVal.newArray()),
                                        env.callMethod(
                                                env.callMethod(
                                                        app,
                                                        "make",
                                                        RegisterFacades.class,
                                                        PackageManifest.CONST_class),
                                                "aliases",
                                                RegisterFacades.class))
                                .value()),
                "register",
                RegisterFacades.class);
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Bootstrap\\RegisterFacades";

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
                    .setName("Illuminate\\Foundation\\Bootstrap\\RegisterFacades")
                    .setLookup(
                            RegisterFacades.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Bootstrap/RegisterFacades.php")
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
