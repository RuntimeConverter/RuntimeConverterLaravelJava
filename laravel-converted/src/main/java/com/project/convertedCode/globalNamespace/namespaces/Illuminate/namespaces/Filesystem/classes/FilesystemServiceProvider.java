package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Filesystem.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Filesystem.classes.FilesystemManager;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.ServiceProvider;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Filesystem.classes.Filesystem;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Filesystem/FilesystemServiceProvider.php

*/

public class FilesystemServiceProvider extends ServiceProvider {

    public FilesystemServiceProvider(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FilesystemServiceProvider.class) {
            this.__construct(env, args);
        }
    }

    public FilesystemServiceProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object register(RuntimeEnv env, Object... args) {
        this.registerNativeFilesystem(env);
        this.registerFlysystem(env);
        return null;
    }

    @ConvertedMethod
    protected Object registerNativeFilesystem(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Filesystem")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Filesystem/FilesystemServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                FilesystemServiceProvider.class,
                "files",
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Filesystem",
                        this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        return ZVal.assign(new Filesystem(env));
                    }
                });
        return null;
    }

    @ConvertedMethod
    protected Object registerFlysystem(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Filesystem")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Filesystem/FilesystemServiceProvider.php");
        this.registerManager(env);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                FilesystemServiceProvider.class,
                "filesystem.disk",
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Filesystem",
                        this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        return ZVal.assign(
                                env.callMethod(
                                        new ReferenceClassProperty(_closureThisVar, "app", env)
                                                .arrayGet(env, "filesystem"),
                                        "disk",
                                        FilesystemServiceProvider.class,
                                        FilesystemServiceProvider.this.getDefaultDriver(env)));
                    }
                });
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                FilesystemServiceProvider.class,
                "filesystem.cloud",
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Filesystem",
                        this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        return ZVal.assign(
                                env.callMethod(
                                        new ReferenceClassProperty(_closureThisVar, "app", env)
                                                .arrayGet(env, "filesystem"),
                                        "disk",
                                        FilesystemServiceProvider.class,
                                        FilesystemServiceProvider.this.getCloudDriver(env)));
                    }
                });
        return null;
    }

    @ConvertedMethod
    protected Object registerManager(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Filesystem")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Filesystem/FilesystemServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                FilesystemServiceProvider.class,
                "filesystem",
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Filesystem",
                        this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        return ZVal.assign(
                                new FilesystemManager(
                                        env,
                                        toObjectR(_closureThisVar)
                                                .accessProp(this, env)
                                                .name("app")
                                                .value()));
                    }
                });
        return null;
    }

    @ConvertedMethod
    protected Object getDefaultDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "app", env)
                        .arrayGet(env, "config", "filesystems.default"));
    }

    @ConvertedMethod
    protected Object getCloudDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "app", env)
                        .arrayGet(env, "config", "filesystems.cloud"));
    }

    public static final Object CONST_class = "Illuminate\\Filesystem\\FilesystemServiceProvider";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ServiceProvider.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Filesystem\\FilesystemServiceProvider")
                    .setLookup(
                            FilesystemServiceProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "defer")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Filesystem/FilesystemServiceProvider.php")
                    .addExtendsClass("Illuminate\\Support\\ServiceProvider")
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
