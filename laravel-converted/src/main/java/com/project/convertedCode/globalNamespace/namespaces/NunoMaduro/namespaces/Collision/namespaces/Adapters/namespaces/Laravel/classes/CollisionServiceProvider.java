package com.project.convertedCode.globalNamespace.namespaces.NunoMaduro.namespaces.Collision.namespaces.Adapters.namespaces.Laravel.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.ServiceProvider;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nunomaduro/collision/src/Adapters/Laravel/CollisionServiceProvider.php

*/

public class CollisionServiceProvider extends ServiceProvider {

    public CollisionServiceProvider(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.defer = true;
        if (this.getClass() == CollisionServiceProvider.class) {
            this.__construct(env, args);
        }
    }

    public CollisionServiceProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object register(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/nunomaduro/collision/src/Adapters/Laravel")
                        .setFile(
                                "/vendor/nunomaduro/collision/src/Adapters/Laravel/CollisionServiceProvider.php");
        Object appExceptionHandler = null;
        if (ZVal.toBool(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("app").value(),
                                "runningInConsole",
                                CollisionServiceProvider.class))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        toObjectR(this).accessProp(this, env).name("app").value(),
                                        "runningUnitTests",
                                        CollisionServiceProvider.class)))) {
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("app").value(),
                    "singleton",
                    CollisionServiceProvider.class,
                    com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .NunoMaduro
                            .namespaces
                            .Collision
                            .namespaces
                            .Contracts
                            .namespaces
                            .Adapters
                            .namespaces
                            .Phpunit
                            .classes
                            .Listener
                            .CONST_class,
                    com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .NunoMaduro
                            .namespaces
                            .Collision
                            .namespaces
                            .Adapters
                            .namespaces
                            .Phpunit
                            .classes
                            .Listener
                            .CONST_class);
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("app").value(),
                    "bind",
                    CollisionServiceProvider.class,
                    com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .NunoMaduro
                            .namespaces
                            .Collision
                            .namespaces
                            .Contracts
                            .classes
                            .Provider
                            .CONST_class,
                    com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .NunoMaduro
                            .namespaces
                            .Collision
                            .classes
                            .Provider
                            .CONST_class);
            appExceptionHandler =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("app").value(),
                            "make",
                            CollisionServiceProvider.class,
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Contracts
                                    .namespaces
                                    .Debug
                                    .classes
                                    .ExceptionHandler
                                    .CONST_class);
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("app").value(),
                    "singleton",
                    CollisionServiceProvider.class,
                    com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Illuminate
                            .namespaces
                            .Contracts
                            .namespaces
                            .Debug
                            .classes
                            .ExceptionHandler
                            .CONST_class,
                    new Closure(
                            env,
                            runtimeConverterFunctionClassConstants,
                            "NunoMaduro\\Collision\\Adapters\\Laravel",
                            this) {
                        @Override
                        @ConvertedMethod
                        @ConvertedParameter(index = 0, name = "app")
                        public Object run(
                                RuntimeEnv env,
                                Object thisvar,
                                PassByReferenceArgs runtimePassByReferenceArgs,
                                Object... args) {
                            Object app = assignParameter(args, 0, false);
                            Object appExceptionHandler = null;
                            appExceptionHandler =
                                    this.contextReferences.getCapturedValue("appExceptionHandler");
                            return ZVal.assign(
                                    new com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .NunoMaduro
                                            .namespaces
                                            .Collision
                                            .namespaces
                                            .Adapters
                                            .namespaces
                                            .Laravel
                                            .classes
                                            .ExceptionHandler(env, app, appExceptionHandler));
                        }
                    }.use("appExceptionHandler", appExceptionHandler));
        }

        return null;
    }

    @ConvertedMethod
    public Object provides(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                0,
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .NunoMaduro
                                        .namespaces
                                        .Collision
                                        .namespaces
                                        .Contracts
                                        .classes
                                        .Provider
                                        .CONST_class)));
    }

    public static final Object CONST_class =
            "NunoMaduro\\Collision\\Adapters\\Laravel\\CollisionServiceProvider";

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
                    .setName("NunoMaduro\\Collision\\Adapters\\Laravel\\CollisionServiceProvider")
                    .setLookup(
                            CollisionServiceProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "defer", "defer")
                    .setFilename(
                            "vendor/nunomaduro/collision/src/Adapters/Laravel/CollisionServiceProvider.php")
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
