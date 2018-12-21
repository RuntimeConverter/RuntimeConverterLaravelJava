package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.namespaces.Presets.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.namespaces.Presets.classes.Preset;
import com.project.convertedCode.globalNamespace.functions.public_path;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.functions.base_path;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.functions.resource_path;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Filesystem.classes.Filesystem;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Console/Presets/None.php

*/

public class None extends Preset {

    public None(RuntimeEnv env, Object... args) {
        super(env);
    }

    public None(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Console\\Presets\\None";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Preset.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object install(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir(
                                    "/vendor/laravel/framework/src/Illuminate/Foundation/Console/Presets")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Foundation/Console/Presets/None.php");
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, None.class)
                    .method("updatePackages")
                    .call()
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, None.class)
                    .method("updateBootstrapping")
                    .call()
                    .value();
            tap.f
                    .env(env)
                    .call(
                            new Filesystem(env),
                            new Closure(
                                    env,
                                    runtimeConverterFunctionClassConstants,
                                    "Illuminate\\Foundation\\Console\\Presets",
                                    this) {
                                @Override
                                @ConvertedMethod
                                @ConvertedParameter(index = 0, name = "filesystem")
                                public Object run(
                                        RuntimeEnv env,
                                        Object thisvar,
                                        PassByReferenceArgs runtimePassByReferenceArgs,
                                        Object... args) {
                                    Object filesystem = assignParameter(args, 0, false);
                                    env.callMethod(
                                            filesystem,
                                            "deleteDirectory",
                                            None.class,
                                            resource_path
                                                    .f
                                                    .env(env)
                                                    .call("assets/js/components")
                                                    .value());
                                    env.callMethod(
                                            filesystem,
                                            "delete",
                                            None.class,
                                            resource_path
                                                    .f
                                                    .env(env)
                                                    .call("assets/sass/_variables.scss")
                                                    .value());
                                    env.callMethod(
                                            filesystem,
                                            "deleteDirectory",
                                            None.class,
                                            base_path.f.env(env).call("node_modules").value());
                                    env.callMethod(
                                            filesystem,
                                            "deleteDirectory",
                                            None.class,
                                            public_path.f.env(env).call("css").value());
                                    env.callMethod(
                                            filesystem,
                                            "deleteDirectory",
                                            None.class,
                                            public_path.f.env(env).call("js").value());
                                    return null;
                                }
                            });
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "packages", typeHint = "array")
        protected Object updatePackageArray(RuntimeEnv env, Object... args) {
            ReferenceContainer packages =
                    new BasicReferenceContainer(assignParameter(args, 0, false));
            arrayActionR(ArrayAction.UNSET, packages, env, "bootstrap");
            arrayActionR(ArrayAction.UNSET, packages, env, "jquery");
            arrayActionR(ArrayAction.UNSET, packages, env, "popper.js");
            arrayActionR(ArrayAction.UNSET, packages, env, "vue");
            arrayActionR(ArrayAction.UNSET, packages, env, "babel-preset-react");
            arrayActionR(ArrayAction.UNSET, packages, env, "react");
            arrayActionR(ArrayAction.UNSET, packages, env, "react-dom");
            return ZVal.assign(packages.getObject());
        }

        @ConvertedMethod
        protected Object updateBootstrapping(RuntimeEnv env, Object... args) {
            NamespaceGlobal.file_put_contents
                    .env(env)
                    .call(
                            resource_path.f.env(env).call("assets/sass/app.scss").value(),
                            "" + toStringR("\n", env));
            NamespaceGlobal.copy
                    .env(env)
                    .call(
                            toStringR(
                                            env.addRootFilesystemPrefix(
                                                    "/vendor/laravel/framework/src/Illuminate/Foundation/Console/Presets"),
                                            env)
                                    + "/none-stubs/app.js",
                            resource_path.f.env(env).call("assets/js/app.js").value());
            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Foundation\\Console\\Presets\\None")
                    .setLookup(
                            None.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Console/Presets/None.php")
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
