package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.RuntimeStack;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Console.classes.Kernel;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Console/RouteCacheCommand.php

*/

public class RouteCacheCommand extends Command {

    public Object files = null;

    public RouteCacheCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = "route:cache";
        this.description = "Create a route cache file for faster route registration";
        if (this.getClass() == RouteCacheCommand.class) {
            this.__construct(env, args);
        }
    }

    public RouteCacheCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "files", typeHint = "Illuminate\\Filesystem\\Filesystem")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object files = assignParameter(args, 0, false);
        super.__construct(env);
        this.files = files;
        return null;
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        Object routes = null;
        Object route = null;
        env.callMethod(this, "call", RouteCacheCommand.class, "route:clear");
        routes = this.getFreshApplicationRoutes(env);
        if (ZVal.strictEqualityCheck(function_count.f.env(env).call(routes).value(), "===", 0)) {
            return ZVal.assign(
                    env.callMethod(
                            this,
                            "error",
                            RouteCacheCommand.class,
                            "Your application doesn't have any routes."));
        }

        for (ZPair zpairResult409 : ZVal.getIterable(routes, env, true)) {
            route = ZVal.assign(zpairResult409.getValue());
            env.callMethod(route, "prepareForSerialization", RouteCacheCommand.class);
        }

        env.callMethod(
                this.files,
                "put",
                RouteCacheCommand.class,
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("laravel").value(),
                        "getCachedRoutesPath",
                        RouteCacheCommand.class),
                this.buildRouteCacheFile(env, routes));
        env.callMethod(this, "info", RouteCacheCommand.class, "Routes cached successfully!");
        return null;
    }

    @ConvertedMethod
    protected Object getFreshApplicationRoutes(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Console")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Console/RouteCacheCommand.php");
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                env.callMethod(
                                        handleReturnReference(this.getFreshApplication(env))
                                                .arrayGet(env, "router"),
                                        "getRoutes",
                                        RouteCacheCommand.class),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Foundation\\Console",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "routes")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object routes = assignParameter(args, 0, false);
                                        env.callMethod(
                                                routes,
                                                "refreshNameLookups",
                                                RouteCacheCommand.class);
                                        env.callMethod(
                                                routes,
                                                "refreshActionLookups",
                                                RouteCacheCommand.class);
                                        return null;
                                    }
                                })
                        .value());
    }

    @ConvertedMethod
    protected Object getFreshApplication(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope26 scope = new Scope26();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Console")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Foundation/Console/RouteCacheCommand.php");
            throw new IncludeEventException(
                    ZVal.assign(
                            tap.f
                                    .env(env)
                                    .call(
                                            env.include(
                                                    toStringR(
                                                                    env.callMethod(
                                                                            toObjectR(
                                                                                            scope._thisVarAlias)
                                                                                    .accessProp(
                                                                                            this,
                                                                                            env)
                                                                                    .name("laravel")
                                                                                    .value(),
                                                                            "bootstrapPath",
                                                                            RouteCacheCommand
                                                                                    .class),
                                                                    env)
                                                            + "/app.php",
                                                    stack,
                                                    runtimeConverterFunctionClassConstants,
                                                    true,
                                                    false),
                                            new Closure(
                                                    env,
                                                    runtimeConverterFunctionClassConstants,
                                                    "Illuminate\\Foundation\\Console",
                                                    this) {
                                                @Override
                                                @ConvertedMethod
                                                @ConvertedParameter(index = 0, name = "app")
                                                public Object run(
                                                        RuntimeEnv env,
                                                        Object thisvar,
                                                        PassByReferenceArgs
                                                                runtimePassByReferenceArgs,
                                                        Object... args) {
                                                    Object app = assignParameter(args, 0, false);
                                                    env.callMethod(
                                                            env.callMethod(
                                                                    app,
                                                                    "make",
                                                                    RouteCacheCommand.class,
                                                                    Kernel.CONST_class),
                                                            "bootstrap",
                                                            RouteCacheCommand.class);
                                                    return null;
                                                }
                                            })
                                    .value()));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "routes",
        typeHint = "Illuminate\\Routing\\RouteCollection"
    )
    protected Object buildRouteCacheFile(RuntimeEnv env, Object... args) {
        Object routes = assignParameter(args, 0, false);
        Object stub = null;
        stub =
                env.callMethod(
                        this.files,
                        "get",
                        RouteCacheCommand.class,
                        toStringR(
                                        env.addRootFilesystemPrefix(
                                                "/vendor/laravel/framework/src/Illuminate/Foundation/Console"),
                                        env)
                                + "/stubs/routes.stub");
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                "{{routes}}",
                                NamespaceGlobal.base64_encode
                                        .env(env)
                                        .call(function_serialize.f.env(env).call(routes).value())
                                        .value(),
                                stub)
                        .value());
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Console\\RouteCacheCommand";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Command.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Foundation\\Console\\RouteCacheCommand")
                    .setLookup(
                            RouteCacheCommand.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "aliases",
                            "application",
                            "applicationDefinitionMerged",
                            "applicationDefinitionMergedWithArgs",
                            "code",
                            "definition",
                            "description",
                            "description",
                            "description",
                            "files",
                            "help",
                            "helperSet",
                            "hidden",
                            "hidden",
                            "ignoreValidationErrors",
                            "input",
                            "laravel",
                            "name",
                            "name",
                            "name",
                            "output",
                            "processTitle",
                            "signature",
                            "synopsis",
                            "usages",
                            "verbosity",
                            "verbosityMap")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Console/RouteCacheCommand.php")
                    .addExtendsClass("Illuminate\\Console\\Command")
                    .addExtendsClass("Symfony\\Component\\Console\\Command\\Command")
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

    private static class Scope26 implements UpdateRuntimeScopeInterface {

        Object _thisVarAlias;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("this", this._thisVarAlias);
        }

        public void updateScope(RuntimeStack stack) {

            this._thisVarAlias = stack.getVariable("this");
        }
    }
}
