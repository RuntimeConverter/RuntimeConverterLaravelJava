package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.namespaces.Presets.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.namespaces.Presets.classes.Preset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.functions.resource_path;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Console/Presets/Bootstrap.php

*/

public class Bootstrap extends Preset {

    public Bootstrap(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Bootstrap(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Console\\Presets\\Bootstrap";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Preset.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object install(RuntimeEnv env, Object... args) {
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Bootstrap.class)
                    .method("updatePackages")
                    .call()
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Bootstrap.class)
                    .method("updateSass")
                    .call()
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Bootstrap.class)
                    .method("removeNodeModules")
                    .call()
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "packages", typeHint = "array")
        protected Object updatePackageArray(RuntimeEnv env, Object... args) {
            Object packages = assignParameter(args, 0, false);
            return ZVal.assign(
                    ZVal.add(
                            ZVal.newArray(
                                    new ZPair("bootstrap", "^4.0.0"),
                                    new ZPair("jquery", "^3.2"),
                                    new ZPair("popper.js", "^1.12")),
                            packages));
        }

        @ConvertedMethod
        protected Object updateSass(RuntimeEnv env, Object... args) {
            NamespaceGlobal.copy
                    .env(env)
                    .call(
                            toStringR(
                                            env.addRootFilesystemPrefix(
                                                    "/vendor/laravel/framework/src/Illuminate/Foundation/Console/Presets"),
                                            env)
                                    + "/bootstrap-stubs/_variables.scss",
                            resource_path.f.env(env).call("assets/sass/_variables.scss").value());
            NamespaceGlobal.copy
                    .env(env)
                    .call(
                            toStringR(
                                            env.addRootFilesystemPrefix(
                                                    "/vendor/laravel/framework/src/Illuminate/Foundation/Console/Presets"),
                                            env)
                                    + "/bootstrap-stubs/app.scss",
                            resource_path.f.env(env).call("assets/sass/app.scss").value());
            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Foundation\\Console\\Presets\\Bootstrap")
                    .setLookup(
                            Bootstrap.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Console/Presets/Bootstrap.php")
                    .addExtendsClass("Illuminate\\Foundation\\Console\\Presets\\Preset")
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
