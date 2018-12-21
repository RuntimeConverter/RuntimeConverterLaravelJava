package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Passwords.classes;

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
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Passwords.classes.PasswordBrokerManager;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Auth/Passwords/PasswordResetServiceProvider.php

*/

public class PasswordResetServiceProvider extends ServiceProvider {

    public PasswordResetServiceProvider(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.defer = true;
        if (this.getClass() == PasswordResetServiceProvider.class) {
            this.__construct(env, args);
        }
    }

    public PasswordResetServiceProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object register(RuntimeEnv env, Object... args) {
        this.registerPasswordBroker(env);
        return null;
    }

    @ConvertedMethod
    protected Object registerPasswordBroker(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Auth/Passwords")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Auth/Passwords/PasswordResetServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                PasswordResetServiceProvider.class,
                "auth.password",
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Auth\\Passwords",
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
                        return ZVal.assign(new PasswordBrokerManager(env, app));
                    }
                });
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "bind",
                PasswordResetServiceProvider.class,
                "auth.password.broker",
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Auth\\Passwords",
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
                        return ZVal.assign(
                                env.callMethod(
                                        env.callMethod(
                                                app,
                                                "make",
                                                PasswordResetServiceProvider.class,
                                                "auth.password"),
                                        "broker",
                                        PasswordResetServiceProvider.class));
                    }
                });
        return null;
    }

    @ConvertedMethod
    public Object provides(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.arrayFromList("auth.password", "auth.password.broker"));
    }

    public static final Object CONST_class =
            "Illuminate\\Auth\\Passwords\\PasswordResetServiceProvider";

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
                    .setName("Illuminate\\Auth\\Passwords\\PasswordResetServiceProvider")
                    .setLookup(
                            PasswordResetServiceProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "defer", "defer")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Auth/Passwords/PasswordResetServiceProvider.php")
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
