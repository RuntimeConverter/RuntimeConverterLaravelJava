package com.project.convertedCode.globalNamespace.namespaces.Laravel.namespaces.Tinker.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.functions.config_path;
import com.runtimeconverter.runtime.nativeFunctions.file.function_realpath;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.ServiceProvider;
import java.lang.Class;
import com.project.convertedCode.globalNamespace.namespaces.Laravel.namespaces.Tinker.namespaces.Console.classes.TinkerCommand;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.classes.Application;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/tinker/src/TinkerServiceProvider.php

*/

public class TinkerServiceProvider extends ServiceProvider {

    public TinkerServiceProvider(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.defer = true;
        if (this.getClass() == TinkerServiceProvider.class) {
            this.__construct(env, args);
        }
    }

    public TinkerServiceProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object boot(RuntimeEnv env, Object... args) {
        Object raw = null;
        Object ternaryExpressionTemp = null;
        Object source = null;
        source =
                ZVal.assign(
                        ZVal.isTrue(
                                        ternaryExpressionTemp =
                                                function_realpath
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                raw =
                                                                        toStringR(
                                                                                        env
                                                                                                .addRootFilesystemPrefix(
                                                                                                        "/vendor/laravel/tinker/src"),
                                                                                        env)
                                                                                + "/../config/tinker.php")
                                                        .value())
                                ? ternaryExpressionTemp
                                : raw);
        if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                toObjectR(this).accessProp(this, env).name("app").value(),
                                Application.class,
                                "Illuminate\\Foundation\\Application"))
                && ZVal.toBool(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("app").value(),
                                "runningInConsole",
                                TinkerServiceProvider.class))) {
            env.callMethod(
                    this,
                    "publishes",
                    TinkerServiceProvider.class,
                    ZVal.newArray(
                            new ZPair(source, config_path.f.env(env).call("tinker.php").value())));

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        toObjectR(this).accessProp(this, env).name("app").value(),
                        (Class) null,
                        "LumenApplication",
                        env))) {
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("app").value(),
                    "configure",
                    TinkerServiceProvider.class,
                    "tinker");
        }

        env.callMethod(this, "mergeConfigFrom", TinkerServiceProvider.class, source, "tinker");
        return null;
    }

    @ConvertedMethod
    public Object register(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/tinker/src")
                        .setFile("/vendor/laravel/tinker/src/TinkerServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                TinkerServiceProvider.class,
                "command.tinker",
                new Closure(env, runtimeConverterFunctionClassConstants, "Laravel\\Tinker", this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        return ZVal.assign(new TinkerCommand(env));
                    }
                });
        env.callMethod(
                this,
                "commands",
                TinkerServiceProvider.class,
                ZVal.arrayFromList("command.tinker"));
        return null;
    }

    @ConvertedMethod
    public Object provides(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.arrayFromList("command.tinker"));
    }

    public static final Object CONST_class = "Laravel\\Tinker\\TinkerServiceProvider";

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
                    .setName("Laravel\\Tinker\\TinkerServiceProvider")
                    .setLookup(
                            TinkerServiceProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "defer", "defer")
                    .setFilename("vendor/laravel/tinker/src/TinkerServiceProvider.php")
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
