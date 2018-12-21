package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Support.namespaces.Providers.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes.Router;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.RuntimeStack;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.ServiceProvider;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Routing.classes.UrlGenerator;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Support/Providers/RouteServiceProvider.php

*/

public class RouteServiceProvider extends ServiceProvider {

    public Object namespace = null;

    public RouteServiceProvider(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RouteServiceProvider.class) {
            this.__construct(env, args);
        }
    }

    public RouteServiceProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object boot(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Support/Providers")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Support/Providers/RouteServiceProvider.php");
        this.setRootControllerNamespace(env);
        if (ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("app").value(),
                        "routesAreCached",
                        RouteServiceProvider.class))) {
            this.loadCachedRoutes(env);

        } else {
            this.loadRoutes(env);
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("app").value(),
                    "booted",
                    RouteServiceProvider.class,
                    new Closure(
                            env,
                            runtimeConverterFunctionClassConstants,
                            "Illuminate\\Foundation\\Support\\Providers",
                            this) {
                        @Override
                        @ConvertedMethod
                        public Object run(
                                RuntimeEnv env,
                                Object thisvar,
                                PassByReferenceArgs runtimePassByReferenceArgs,
                                Object... args) {
                            Object _closureThisVar = this.getClosureThisVar();
                            env.callMethod(
                                    env.callMethod(
                                            new ReferenceClassProperty(_closureThisVar, "app", env)
                                                    .arrayGet(env, "router"),
                                            "getRoutes",
                                            RouteServiceProvider.class),
                                    "refreshNameLookups",
                                    RouteServiceProvider.class);
                            env.callMethod(
                                    env.callMethod(
                                            new ReferenceClassProperty(_closureThisVar, "app", env)
                                                    .arrayGet(env, "router"),
                                            "getRoutes",
                                            RouteServiceProvider.class),
                                    "refreshActionLookups",
                                    RouteServiceProvider.class);
                            return null;
                        }
                    });
        }

        return null;
    }

    @ConvertedMethod
    protected Object setRootControllerNamespace(RuntimeEnv env, Object... args) {
        if (!function_is_null.f.env(env).call(this.namespace).getBool()) {
            env.callMethod(
                    new ReferenceClassProperty(this, "app", env)
                            .arrayGet(env, UrlGenerator.CONST_class),
                    "setRootControllerNamespace",
                    RouteServiceProvider.class,
                    this.namespace);
        }

        return null;
    }

    @ConvertedMethod
    protected Object loadCachedRoutes(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Support/Providers")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Support/Providers/RouteServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "booted",
                RouteServiceProvider.class,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Foundation\\Support\\Providers",
                        this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ContextConstants runtimeConverterFunctionClassConstants =
                                new ContextConstants()
                                        .setDir(
                                                "/vendor/laravel/framework/src/Illuminate/Foundation/Support/Providers")
                                        .setFile(
                                                "/vendor/laravel/framework/src/Illuminate/Foundation/Support/Providers/RouteServiceProvider.php");
                        RuntimeStack stack = new RuntimeStack();
                        stack.setupGlobals(env);
                        Scope27 scope = new Scope27();
                        stack.pushScope(scope);
                        scope._thisVarAlias = this;
                        try {
                            Object _closureThisVar = this.getClosureThisVar();
                            env.include(
                                    toStringR(
                                            env.callMethod(
                                                    toObjectR(_closureThisVar)
                                                            .accessProp(this, env)
                                                            .name("app")
                                                            .value(),
                                                    "getCachedRoutesPath",
                                                    RouteServiceProvider.class),
                                            env),
                                    stack,
                                    runtimeConverterFunctionClassConstants,
                                    true,
                                    false);
                            throw new IncludeEventException(null);
                        } catch (IncludeEventException runtimeConverterIncludeException) {
                            return runtimeConverterIncludeException.returnValue;
                        }
                    }
                });
        return null;
    }

    @ConvertedMethod
    protected Object loadRoutes(RuntimeEnv env, Object... args) {
        if (function_method_exists.f.env(env).call(this, "map").getBool()) {
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("app").value(),
                    "call",
                    RouteServiceProvider.class,
                    ZVal.newArray(new ZPair(0, this), new ZPair(1, "map")));
        }

        return null;
    }

    @ConvertedMethod
    public Object register(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                env.callMethod(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("app")
                                                                .value(),
                                                        "make",
                                                        RouteServiceProvider.class,
                                                        Router.CONST_class)),
                                        new ZPair(1, method)),
                                parameters)
                        .value());
    }

    public static final Object CONST_class =
            "Illuminate\\Foundation\\Support\\Providers\\RouteServiceProvider";

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
                    .setName("Illuminate\\Foundation\\Support\\Providers\\RouteServiceProvider")
                    .setLookup(
                            RouteServiceProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "defer", "namespace")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Support/Providers/RouteServiceProvider.php")
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

    private static class Scope27 implements UpdateRuntimeScopeInterface {

        Object _thisVarAlias;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("this", this._thisVarAlias);
        }

        public void updateScope(RuntimeStack stack) {

            this._thisVarAlias = stack.getVariable("this");
        }
    }
}
