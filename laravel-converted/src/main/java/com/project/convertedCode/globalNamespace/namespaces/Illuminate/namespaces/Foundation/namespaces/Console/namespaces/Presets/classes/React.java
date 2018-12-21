package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.namespaces.Presets.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.namespaces.Presets.classes.Preset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.functions.base_path;
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
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Filesystem.classes.Filesystem;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Console/Presets/React.php

*/

public class React extends Preset {

    public React(RuntimeEnv env, Object... args) {
        super(env);
    }

    public React(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Console\\Presets\\React";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Preset.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object install(RuntimeEnv env, Object... args) {
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, React.class)
                    .method("ensureComponentDirectoryExists")
                    .call()
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, React.class)
                    .method("updatePackages")
                    .call()
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, React.class)
                    .method("updateWebpackConfiguration")
                    .call()
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, React.class)
                    .method("updateBootstrapping")
                    .call()
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, React.class)
                    .method("updateComponent")
                    .call()
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, React.class)
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
                                    new ZPair("babel-preset-react", "^6.23.0"),
                                    new ZPair("react", "^16.2.0"),
                                    new ZPair("react-dom", "^16.2.0")),
                            Arr.runtimeStaticObject.except(
                                    env, packages, ZVal.arrayFromList("vue"))));
        }

        @ConvertedMethod
        protected Object updateWebpackConfiguration(RuntimeEnv env, Object... args) {
            NamespaceGlobal.copy
                    .env(env)
                    .call(
                            toStringR(
                                            env.addRootFilesystemPrefix(
                                                    "/vendor/laravel/framework/src/Illuminate/Foundation/Console/Presets"),
                                            env)
                                    + "/react-stubs/webpack.mix.js",
                            base_path.f.env(env).call("webpack.mix.js").value());
            return null;
        }

        @ConvertedMethod
        protected Object updateComponent(RuntimeEnv env, Object... args) {
            env.callMethod(
                    new Filesystem(env),
                    "delete",
                    React.class,
                    resource_path
                            .f
                            .env(env)
                            .call("assets/js/components/ExampleComponent.vue")
                            .value());
            NamespaceGlobal.copy
                    .env(env)
                    .call(
                            toStringR(
                                            env.addRootFilesystemPrefix(
                                                    "/vendor/laravel/framework/src/Illuminate/Foundation/Console/Presets"),
                                            env)
                                    + "/react-stubs/Example.js",
                            resource_path
                                    .f
                                    .env(env)
                                    .call("assets/js/components/Example.js")
                                    .value());
            return null;
        }

        @ConvertedMethod
        protected Object updateBootstrapping(RuntimeEnv env, Object... args) {
            NamespaceGlobal.copy
                    .env(env)
                    .call(
                            toStringR(
                                            env.addRootFilesystemPrefix(
                                                    "/vendor/laravel/framework/src/Illuminate/Foundation/Console/Presets"),
                                            env)
                                    + "/react-stubs/app.js",
                            resource_path.f.env(env).call("assets/js/app.js").value());
            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Foundation\\Console\\Presets\\React")
                    .setLookup(
                            React.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Console/Presets/React.php")
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
