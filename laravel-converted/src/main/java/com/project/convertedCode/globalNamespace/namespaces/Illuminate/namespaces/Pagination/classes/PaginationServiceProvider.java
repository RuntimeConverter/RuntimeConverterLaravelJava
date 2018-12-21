package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Pagination.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.filter.function_filter_var;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Pagination.classes.Paginator;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.ServiceProvider;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Pagination/PaginationServiceProvider.php

*/

public class PaginationServiceProvider extends ServiceProvider {

    public PaginationServiceProvider(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PaginationServiceProvider.class) {
            this.__construct(env, args);
        }
    }

    public PaginationServiceProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object boot(RuntimeEnv env, Object... args) {
        env.callMethod(
                this,
                "loadViewsFrom",
                PaginationServiceProvider.class,
                toStringR(
                                env.addRootFilesystemPrefix(
                                        "/vendor/laravel/framework/src/Illuminate/Pagination"),
                                env)
                        + "/resources/views",
                "pagination");
        if (ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("app").value(),
                        "runningInConsole",
                        PaginationServiceProvider.class))) {
            env.callMethod(
                    this,
                    "publishes",
                    PaginationServiceProvider.class,
                    ZVal.newArray(
                            new ZPair(
                                    toStringR(
                                                    env.addRootFilesystemPrefix(
                                                            "/vendor/laravel/framework/src/Illuminate/Pagination"),
                                                    env)
                                            + "/resources/views",
                                    env.callMethod(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("app")
                                                    .value(),
                                            "resourcePath",
                                            PaginationServiceProvider.class,
                                            "views/vendor/pagination"))),
                    "laravel-pagination");
        }

        return null;
    }

    @ConvertedMethod
    public Object register(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Pagination")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Pagination/PaginationServiceProvider.php");
        Paginator.runtimeStaticObject.viewFactoryResolver(
                env,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Pagination",
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
                                new ReferenceClassProperty(_closureThisVar, "app", env)
                                        .arrayGet(env, "view"));
                    }
                });
        Paginator.runtimeStaticObject.currentPathResolver(
                env,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Pagination",
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
                                                .arrayGet(env, "request"),
                                        "url",
                                        PaginationServiceProvider.class));
                    }
                });
        Paginator.runtimeStaticObject.currentPageResolver(
                env,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Pagination",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "pageName")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object pageName = assignParameter(args, 0, true);
                        if (null == pageName) {
                            pageName = "page";
                        }
                        Object page = null;
                        page =
                                env.callMethod(
                                        new ReferenceClassProperty(_closureThisVar, "app", env)
                                                .arrayGet(env, "request"),
                                        "input",
                                        PaginationServiceProvider.class,
                                        pageName);
                        if (ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                function_filter_var
                                                        .f
                                                        .env(env)
                                                        .call(page, 257)
                                                        .value(),
                                                "!==",
                                                false))
                                && ZVal.toBool(
                                        ZVal.isGreaterThanOrEqualTo(ZVal.toLong(page), ">=", 1))) {
                            return ZVal.assign(ZVal.toLong(page));
                        }

                        return 1;
                    }
                });
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Pagination\\PaginationServiceProvider";

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
                    .setName("Illuminate\\Pagination\\PaginationServiceProvider")
                    .setLookup(
                            PaginationServiceProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "defer")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Pagination/PaginationServiceProvider.php")
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
