package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.classes.AuthManager;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Auth.classes.Authenticatable;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.ServiceProvider;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Auth/AuthServiceProvider.php

*/

public class AuthServiceProvider extends ServiceProvider {

    public AuthServiceProvider(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AuthServiceProvider.class) {
            this.__construct(env, args);
        }
    }

    public AuthServiceProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object register(RuntimeEnv env, Object... args) {
        this.registerAuthenticator(env);
        this.registerUserResolver(env);
        this.registerAccessGate(env);
        this.registerRequestRebindHandler(env);
        return null;
    }

    @ConvertedMethod
    protected Object registerAuthenticator(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Auth")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Auth/AuthServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                AuthServiceProvider.class,
                "auth",
                new Closure(env, runtimeConverterFunctionClassConstants, "Illuminate\\Auth", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ReferenceContainer app =
                                new BasicReferenceContainer(assignParameter(args, 0, false));
                        app.arrayAccess(env, "auth.loaded").set(true);
                        return ZVal.assign(new AuthManager(env, app.getObject()));
                    }
                });
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                AuthServiceProvider.class,
                "auth.driver",
                new Closure(env, runtimeConverterFunctionClassConstants, "Illuminate\\Auth", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ReferenceContainer app =
                                new BasicReferenceContainer(assignParameter(args, 0, false));
                        return ZVal.assign(
                                env.callMethod(
                                        app.arrayGet(env, "auth"),
                                        "guard",
                                        AuthServiceProvider.class));
                    }
                });
        return null;
    }

    @ConvertedMethod
    protected Object registerUserResolver(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Auth")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Auth/AuthServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "bind",
                AuthServiceProvider.class,
                Authenticatable.CONST_class,
                new Closure(env, runtimeConverterFunctionClassConstants, "Illuminate\\Auth", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ReferenceContainer app =
                                new BasicReferenceContainer(assignParameter(args, 0, false));
                        return ZVal.assign(
                                function_call_user_func
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call(
                                                env.callMethod(
                                                        app.arrayGet(env, "auth"),
                                                        "userResolver",
                                                        AuthServiceProvider.class))
                                        .value());
                    }
                });
        return null;
    }

    @ConvertedMethod
    protected Object registerAccessGate(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Auth")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Auth/AuthServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                AuthServiceProvider.class,
                com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Illuminate
                        .namespaces
                        .Contracts
                        .namespaces
                        .Auth
                        .namespaces
                        .Access
                        .classes
                        .Gate
                        .CONST_class,
                new Closure(env, runtimeConverterFunctionClassConstants, "Illuminate\\Auth", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ContextConstants runtimeConverterFunctionClassConstants =
                                new ContextConstants()
                                        .setDir("/vendor/laravel/framework/src/Illuminate/Auth")
                                        .setFile(
                                                "/vendor/laravel/framework/src/Illuminate/Auth/AuthServiceProvider.php");
                        Object app = assignParameter(args, 0, false);
                        return ZVal.assign(
                                new com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Illuminate
                                        .namespaces
                                        .Auth
                                        .namespaces
                                        .Access
                                        .classes
                                        .Gate(
                                        env,
                                        app,
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Illuminate\\Auth",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                ReferenceContainer app =
                                                        new BasicReferenceContainer(null);
                                                app =
                                                        this.contextReferences
                                                                .getReferenceContainer("app");
                                                return ZVal.assign(
                                                        function_call_user_func
                                                                .f
                                                                .env(env)
                                                                .addReferenceArgs(
                                                                        new RuntimeArgsWithInfo(
                                                                                args, this))
                                                                .call(
                                                                        env.callMethod(
                                                                                app.arrayGet(
                                                                                        env,
                                                                                        "auth"),
                                                                                "userResolver",
                                                                                AuthServiceProvider
                                                                                        .class))
                                                                .value());
                                            }
                                        }.use("app", app)));
                    }
                });
        return null;
    }

    @ConvertedMethod
    protected Object registerRequestRebindHandler(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Auth")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Auth/AuthServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "rebinding",
                AuthServiceProvider.class,
                "request",
                new Closure(env, runtimeConverterFunctionClassConstants, "Illuminate\\Auth", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    @ConvertedParameter(index = 1, name = "request")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ContextConstants runtimeConverterFunctionClassConstants =
                                new ContextConstants()
                                        .setDir("/vendor/laravel/framework/src/Illuminate/Auth")
                                        .setFile(
                                                "/vendor/laravel/framework/src/Illuminate/Auth/AuthServiceProvider.php");
                        Object app = assignParameter(args, 0, false);
                        Object request = assignParameter(args, 1, false);
                        env.callMethod(
                                request,
                                "setUserResolver",
                                AuthServiceProvider.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Auth",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(
                                        index = 0,
                                        name = "guard",
                                        defaultValue = "NULL",
                                        defaultValueType = "constant"
                                    )
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object guard = assignParameter(args, 0, true);
                                        if (null == guard) {
                                            guard = ZVal.getNull();
                                        }
                                        ReferenceContainer app = new BasicReferenceContainer(null);
                                        app = this.contextReferences.getReferenceContainer("app");
                                        return ZVal.assign(
                                                function_call_user_func
                                                        .f
                                                        .env(env)
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithInfo(args, this))
                                                        .call(
                                                                env.callMethod(
                                                                        app.arrayGet(env, "auth"),
                                                                        "userResolver",
                                                                        AuthServiceProvider.class),
                                                                guard)
                                                        .value());
                                    }
                                }.use("app", app));
                        return null;
                    }
                });
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Auth\\AuthServiceProvider";

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
                    .setName("Illuminate\\Auth\\AuthServiceProvider")
                    .setLookup(
                            AuthServiceProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "defer")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Auth/AuthServiceProvider.php")
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
