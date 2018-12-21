package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.classes.SessionManager;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.namespaces.Middleware.classes.StartSession;
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

 vendor/laravel/framework/src/Illuminate/Session/SessionServiceProvider.php

*/

public class SessionServiceProvider extends ServiceProvider {

    public SessionServiceProvider(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SessionServiceProvider.class) {
            this.__construct(env, args);
        }
    }

    public SessionServiceProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object register(RuntimeEnv env, Object... args) {
        this.registerSessionManager(env);
        this.registerSessionDriver(env);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                SessionServiceProvider.class,
                StartSession.CONST_class);
        return null;
    }

    @ConvertedMethod
    protected Object registerSessionManager(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Session")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Session/SessionServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                SessionServiceProvider.class,
                "session",
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Session", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object app = assignParameter(args, 0, false);
                        return ZVal.assign(new SessionManager(env, app));
                    }
                });
        return null;
    }

    @ConvertedMethod
    protected Object registerSessionDriver(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Session")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Session/SessionServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                SessionServiceProvider.class,
                "session.store",
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Session", this) {
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
                                                SessionServiceProvider.class,
                                                "session"),
                                        "driver",
                                        SessionServiceProvider.class));
                    }
                });
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Session\\SessionServiceProvider";

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
                    .setName("Illuminate\\Session\\SessionServiceProvider")
                    .setLookup(
                            SessionServiceProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "defer")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Session/SessionServiceProvider.php")
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
