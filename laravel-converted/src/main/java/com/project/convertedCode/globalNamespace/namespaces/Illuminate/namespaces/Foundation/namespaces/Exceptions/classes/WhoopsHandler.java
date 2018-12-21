package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Exceptions.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.functions.base_path;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_flip;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Handler.classes.PrettyPageHandler;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Filesystem.classes.Filesystem;
import com.project.convertedCode.globalNamespace.functions.config;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Exceptions/WhoopsHandler.php

*/

public class WhoopsHandler extends RuntimeClassBase {

    public WhoopsHandler(RuntimeEnv env, Object... args) {
        super(env);
    }

    public WhoopsHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object forDebug(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Exceptions")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Exceptions/WhoopsHandler.php");
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                new PrettyPageHandler(env),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Foundation\\Exceptions",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "handler")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object handler = assignParameter(args, 0, false);
                                        env.callMethod(
                                                handler,
                                                "handleUnconditionally",
                                                WhoopsHandler.class,
                                                true);
                                        env.callMethod(
                                                env.callMethod(
                                                        WhoopsHandler.this.registerApplicationPaths(
                                                                env, handler),
                                                        "registerBlacklist",
                                                        WhoopsHandler.class,
                                                        handler),
                                                "registerEditor",
                                                WhoopsHandler.class,
                                                handler);
                                        return null;
                                    }
                                })
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "handler")
    protected Object registerApplicationPaths(RuntimeEnv env, Object... args) {
        Object handler = assignParameter(args, 0, false);
        env.callMethod(
                handler,
                "setApplicationPaths",
                WhoopsHandler.class,
                function_array_flip.f.env(env).call(this.directoriesExceptVendor(env)).value());
        return ZVal.assign(this);
    }

    @ConvertedMethod
    protected Object directoriesExceptVendor(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                Arr.runtimeStaticObject.except(
                        env,
                        function_array_flip
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(
                                                new Filesystem(env),
                                                "directories",
                                                WhoopsHandler.class,
                                                base_path.f.env(env).call().value()))
                                .value(),
                        ZVal.newArray(new ZPair(0, base_path.f.env(env).call("vendor").value()))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "handler")
    protected Object registerBlacklist(RuntimeEnv env, Object... args) {
        Object handler = assignParameter(args, 0, false);
        Object secret = null;
        Object secrets = null;
        Object key = null;
        for (ZPair zpairResult414 :
                ZVal.getIterable(
                        config.f.env(env).call("app.debug_blacklist", ZVal.newArray()).value(),
                        env,
                        false)) {
            key = ZVal.assign(zpairResult414.getKey());
            secrets = ZVal.assign(zpairResult414.getValue());
            for (ZPair zpairResult415 : ZVal.getIterable(secrets, env, true)) {
                secret = ZVal.assign(zpairResult415.getValue());
                env.callMethod(handler, "blacklist", WhoopsHandler.class, key, secret);
            }
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "handler")
    protected Object registerEditor(RuntimeEnv env, Object... args) {
        Object handler = assignParameter(args, 0, false);
        if (config.f.env(env).call("app.editor", false).getBool()) {
            env.callMethod(
                    handler,
                    "setEditor",
                    WhoopsHandler.class,
                    config.f.env(env).call("app.editor").value());
        }

        return ZVal.assign(this);
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Exceptions\\WhoopsHandler";

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
                    .setName("Illuminate\\Foundation\\Exceptions\\WhoopsHandler")
                    .setLookup(
                            WhoopsHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Exceptions/WhoopsHandler.php")
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
