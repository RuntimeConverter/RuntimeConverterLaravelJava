package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.View.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.View.namespaces.Engines.classes.CompilerEngine;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.View.classes.Factory;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.View.namespaces.Engines.classes.FileEngine;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.View.namespaces.Compilers.classes.BladeCompiler;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.View.namespaces.Engines.classes.EngineResolver;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.View.namespaces.Engines.classes.PhpEngine;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.View.classes.FileViewFinder;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.ServiceProvider;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/View/ViewServiceProvider.php

*/

public class ViewServiceProvider extends ServiceProvider {

    public ViewServiceProvider(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ViewServiceProvider.class) {
            this.__construct(env, args);
        }
    }

    public ViewServiceProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object register(RuntimeEnv env, Object... args) {
        this.registerFactory(env);
        this.registerViewFinder(env);
        this.registerEngineResolver(env);
        return null;
    }

    @ConvertedMethod
    public Object registerFactory(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/View")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/View/ViewServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                ViewServiceProvider.class,
                "view",
                new Closure(env, runtimeConverterFunctionClassConstants, "Illuminate\\View", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        ReferenceContainer app =
                                new BasicReferenceContainer(assignParameter(args, 0, false));
                        Object resolver = null;
                        Object factory = null;
                        Object finder = null;
                        resolver = ZVal.assign(app.arrayGet(env, "view.engine.resolver"));
                        finder = ZVal.assign(app.arrayGet(env, "view.finder"));
                        factory =
                                ViewServiceProvider.this.createFactory(
                                        env, resolver, finder, app.arrayGet(env, "events"));
                        env.callMethod(
                                factory,
                                "setContainer",
                                ViewServiceProvider.class,
                                app.getObject());
                        env.callMethod(
                                factory,
                                "share",
                                ViewServiceProvider.class,
                                "app",
                                app.getObject());
                        return ZVal.assign(factory);
                    }
                });
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resolver")
    @ConvertedParameter(index = 1, name = "finder")
    @ConvertedParameter(index = 2, name = "events")
    protected Object createFactory(RuntimeEnv env, Object... args) {
        Object resolver = assignParameter(args, 0, false);
        Object finder = assignParameter(args, 1, false);
        Object events = assignParameter(args, 2, false);
        return ZVal.assign(new Factory(env, resolver, finder, events));
    }

    @ConvertedMethod
    public Object registerViewFinder(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/View")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/View/ViewServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "bind",
                ViewServiceProvider.class,
                "view.finder",
                new Closure(env, runtimeConverterFunctionClassConstants, "Illuminate\\View", this) {
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
                                new FileViewFinder(
                                        env,
                                        app.arrayGet(env, "files"),
                                        app.arrayGet(env, "config", "view.paths")));
                    }
                });
        return null;
    }

    @ConvertedMethod
    public Object registerEngineResolver(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/View")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/View/ViewServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                ViewServiceProvider.class,
                "view.engine.resolver",
                new Closure(env, runtimeConverterFunctionClassConstants, "Illuminate\\View", this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        ReferenceContainer resolver = new BasicReferenceContainer(null);
                        Object engine = null;
                        resolver.setObject(new EngineResolver(env));
                        for (ZPair zpairResult650 :
                                ZVal.getIterable(
                                        ZVal.arrayFromList("file", "php", "blade"), env, true)) {
                            engine = ZVal.assign(zpairResult650.getValue());
                            env.callMethod(
                                    _closureThisVar,
                                    new RuntimeArgsWithReferences().add(0, resolver),
                                    "register"
                                            + toStringR(
                                                    NamespaceGlobal.ucfirst
                                                            .env(env)
                                                            .call(engine)
                                                            .value(),
                                                    env)
                                            + "Engine",
                                    ViewServiceProvider.class,
                                    resolver.getObject());
                        }

                        return ZVal.assign(resolver.getObject());
                    }
                });
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resolver")
    public Object registerFileEngine(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/View")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/View/ViewServiceProvider.php");
        Object resolver = assignParameter(args, 0, false);
        env.callMethod(
                resolver,
                "register",
                ViewServiceProvider.class,
                "file",
                new Closure(env, runtimeConverterFunctionClassConstants, "Illuminate\\View", this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        return ZVal.assign(new FileEngine(env));
                    }
                });
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resolver")
    public Object registerPhpEngine(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/View")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/View/ViewServiceProvider.php");
        Object resolver = assignParameter(args, 0, false);
        env.callMethod(
                resolver,
                "register",
                ViewServiceProvider.class,
                "php",
                new Closure(env, runtimeConverterFunctionClassConstants, "Illuminate\\View", this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        return ZVal.assign(new PhpEngine(env));
                    }
                });
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resolver")
    public Object registerBladeEngine(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/View")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/View/ViewServiceProvider.php");
        Object resolver = assignParameter(args, 0, false);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                ViewServiceProvider.class,
                "blade.compiler",
                new Closure(env, runtimeConverterFunctionClassConstants, "Illuminate\\View", this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        return ZVal.assign(
                                new BladeCompiler(
                                        env,
                                        new ReferenceClassProperty(_closureThisVar, "app", env)
                                                .arrayGet(env, "files"),
                                        new ReferenceClassProperty(_closureThisVar, "app", env)
                                                .arrayGet(env, "config", "view.compiled")));
                    }
                });
        env.callMethod(
                resolver,
                "register",
                ViewServiceProvider.class,
                "blade",
                new Closure(env, runtimeConverterFunctionClassConstants, "Illuminate\\View", this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        return ZVal.assign(
                                new CompilerEngine(
                                        env,
                                        new ReferenceClassProperty(_closureThisVar, "app", env)
                                                .arrayGet(env, "blade.compiler")));
                    }
                });
        return null;
    }

    public static final Object CONST_class = "Illuminate\\View\\ViewServiceProvider";

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
                    .setName("Illuminate\\View\\ViewServiceProvider")
                    .setLookup(
                            ViewServiceProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "defer")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/View/ViewServiceProvider.php")
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
