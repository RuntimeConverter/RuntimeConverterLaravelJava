package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.namespaces.Presets.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_ksort;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.functions.resource_path;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Filesystem.classes.Filesystem;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.functions.base_path;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Console/Presets/Preset.php

*/

public class Preset extends RuntimeClassBase {

    public Preset(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Preset(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Console\\Presets\\Preset";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        protected Object ensureComponentDirectoryExists(RuntimeEnv env, Object... args) {
            Object directory = null;
            Object filesystem = null;
            filesystem = new Filesystem(env);
            if (!ZVal.isTrue(
                    env.callMethod(
                            filesystem,
                            "isDirectory",
                            Preset.class,
                            directory =
                                    resource_path
                                            .f
                                            .env(env)
                                            .call("assets/js/components")
                                            .value()))) {
                env.callMethod(filesystem, "makeDirectory", Preset.class, directory, 493, true);
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "dev",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        protected Object updatePackages(RuntimeEnv env, Object... args) {
            Object dev = assignParameter(args, 0, true);
            if (null == dev) {
                dev = true;
            }
            Object configurationKey = null;
            ReferenceContainer packages = new BasicReferenceContainer(null);
            if (!function_file_exists
                    .f
                    .env(env)
                    .call(base_path.f.env(env).call("package.json").value())
                    .getBool()) {
                return null;
            }

            configurationKey = ZVal.assign(ZVal.isTrue(dev) ? "devDependencies" : "dependencies");
            packages.setObject(
                    NamespaceGlobal.json_decode
                            .env(env)
                            .call(
                                    function_file_get_contents
                                            .f
                                            .env(env)
                                            .call(base_path.f.env(env).call("package.json").value())
                                            .value(),
                                    true)
                            .value());
            packages.arrayAccess(env, configurationKey)
                    .set(
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Preset.class)
                                    .method("updatePackageArray")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(
                                            function_array_key_exists
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    configurationKey,
                                                                    packages.getObject())
                                                            .getBool()
                                                    ? packages.arrayGet(env, configurationKey)
                                                    : ZVal.newArray())
                                    .value());
            function_ksort.f.env(env).call(packages.arrayGet(env, configurationKey));
            NamespaceGlobal.file_put_contents
                    .env(env)
                    .call(
                            base_path.f.env(env).call("package.json").value(),
                            toStringR(
                                            NamespaceGlobal.json_encode
                                                    .env(env)
                                                    .call(
                                                            packages.getObject(),
                                                            ZVal.toLong(64) | ZVal.toLong(128))
                                                    .value(),
                                            env)
                                    + toStringR("\n", env));
            return null;
        }

        @ConvertedMethod
        protected Object removeNodeModules(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir(
                                    "/vendor/laravel/framework/src/Illuminate/Foundation/Console/Presets")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Foundation/Console/Presets/Preset.php");
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
                                @ConvertedParameter(index = 0, name = "files")
                                public Object run(
                                        RuntimeEnv env,
                                        Object thisvar,
                                        PassByReferenceArgs runtimePassByReferenceArgs,
                                        Object... args) {
                                    Object files = assignParameter(args, 0, false);
                                    env.callMethod(
                                            files,
                                            "deleteDirectory",
                                            Preset.class,
                                            base_path.f.env(env).call("node_modules").value());
                                    env.callMethod(
                                            files,
                                            "delete",
                                            Preset.class,
                                            base_path.f.env(env).call("yarn.lock").value());
                                    return null;
                                }
                            });
            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Foundation\\Console\\Presets\\Preset")
                    .setLookup(
                            Preset.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Console/Presets/Preset.php")
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
