package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Pagination.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Htmlable;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.filter.function_filter_var;
import com.runtimeconverter.runtime.nativeFunctions.array.function_range;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Pagination/AbstractPaginator.php

*/

public abstract class AbstractPaginator extends RuntimeClassBase implements Htmlable {

    public Object items = null;

    public Object perPage = null;

    public Object currentPage = null;

    public Object path = "/";

    public Object query = ZVal.newArray();

    public Object fragment = null;

    public Object pageName = "page";

    public AbstractPaginator(RuntimeEnv env, Object... args) {
        super(env);
    }

    public AbstractPaginator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "page")
    protected Object isValidPageNumber(RuntimeEnv env, Object... args) {
        Object page = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(ZVal.isGreaterThanOrEqualTo(page, ">=", 1))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        function_filter_var.f.env(env).call(page, 257).value(),
                                        "!==",
                                        false)));
    }

    @ConvertedMethod
    public Object previousPageUrl(RuntimeEnv env, Object... args) {
        if (ZVal.isGreaterThan(this.currentPage(env), '>', 1)) {
            return ZVal.assign(this.url(env, ZVal.subtract(this.currentPage(env), 1)));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "start")
    @ConvertedParameter(index = 1, name = "end")
    public Object getUrlRange(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Pagination")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Pagination/AbstractPaginator.php");
        Object start = assignParameter(args, 0, false);
        Object end = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                collect.f
                                        .env(env)
                                        .call(function_range.f.env(env).call(start, end).value())
                                        .value(),
                                "mapWithKeys",
                                AbstractPaginator.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Pagination",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "page")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object page = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                ZVal.newArray(
                                                        new ZPair(
                                                                page,
                                                                AbstractPaginator.this.url(
                                                                        env, page))));
                                    }
                                }),
                        "all",
                        AbstractPaginator.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "page")
    public Object url(RuntimeEnv env, Object... args) {
        Object page = assignParameter(args, 0, false);
        Object parameters = null;
        if (ZVal.isLessThanOrEqualTo(page, "<=", 0)) {
            page = 1;
        }

        parameters = ZVal.newArray(new ZPair(this.pageName, page));
        if (ZVal.isGreaterThan(function_count.f.env(env).call(this.query).value(), '>', 0)) {
            parameters = function_array_merge.f.env(env).call(this.query, parameters).value();
        }

        return ZVal.assign(
                toStringR(this.path, env)
                        + toStringR(
                                ZVal.isTrue(Str.runtimeStaticObject.contains(env, this.path, "?"))
                                        ? "&"
                                        : "?",
                                env)
                        + toStringR(
                                NamespaceGlobal.http_build_query
                                        .env(env)
                                        .call(parameters, "", "&")
                                        .value(),
                                env)
                        + toStringR(this.buildFragment(env), env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "fragment",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object fragment(RuntimeEnv env, Object... args) {
        Object fragment = assignParameter(args, 0, true);
        if (null == fragment) {
            fragment = ZVal.getNull();
        }
        if (function_is_null.f.env(env).call(fragment).getBool()) {
            return ZVal.assign(this.fragment);
        }

        this.fragment = fragment;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object appends(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        if (function_is_array.f.env(env).call(key).getBool()) {
            return ZVal.assign(this.appendArray(env, key));
        }

        return ZVal.assign(this.addQuery(env, key, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys", typeHint = "array")
    protected Object appendArray(RuntimeEnv env, Object... args) {
        Object keys = assignParameter(args, 0, false);
        Object value = null;
        Object key = null;
        for (ZPair zpairResult504 : ZVal.getIterable(keys, env, false)) {
            key = ZVal.assign(zpairResult504.getKey());
            value = ZVal.assign(zpairResult504.getValue());
            this.addQuery(env, key, value);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    protected Object addQuery(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        if (ZVal.strictNotEqualityCheck(key, "!==", this.pageName)) {
            new ReferenceClassProperty(this, "query", env).arrayAccess(env, key).set(value);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    protected Object buildFragment(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.isTrue(this.fragment) ? "#" + toStringR(this.fragment, env) : "");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "relation")
    @ConvertedParameter(index = 1, name = "relations")
    public Object loadMorph(RuntimeEnv env, Object... args) {
        Object relation = assignParameter(args, 0, false);
        Object relations = assignParameter(args, 1, false);
        env.callMethod(
                this.getCollection(env), "loadMorph", AbstractPaginator.class, relation, relations);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object items(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.items, "all", AbstractPaginator.class));
    }

    @ConvertedMethod
    public Object firstItem(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isGreaterThan(function_count.f.env(env).call(this.items).value(), '>', 0)
                        ? ZVal.add(
                                ZVal.multiply(ZVal.subtract(this.currentPage, 1), this.perPage), 1)
                        : ZVal.getNull());
    }

    @ConvertedMethod
    public Object lastItem(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isGreaterThan(function_count.f.env(env).call(this.items).value(), '>', 0)
                        ? ZVal.subtract(ZVal.add(this.firstItem(env), this.count(env)), 1)
                        : ZVal.getNull());
    }

    @ConvertedMethod
    public Object perPage(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.perPage);
    }

    @ConvertedMethod
    public Object hasPages(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(ZVal.notEqualityCheck(this.currentPage(env), 1))
                        || ZVal.toBool(
                                env.callMethod(this, "hasMorePages", AbstractPaginator.class)));
    }

    @ConvertedMethod
    public Object onFirstPage(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.isLessThanOrEqualTo(this.currentPage(env), "<=", 1));
    }

    @ConvertedMethod
    public Object currentPage(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.currentPage);
    }

    @ConvertedMethod
    public Object getPageName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.pageName);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setPageName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this.pageName = name;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object withPath(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(this.setPath(env, path));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object setPath(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        this.path = path;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getIterator(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.items, "getIterator", AbstractPaginator.class));
    }

    @ConvertedMethod
    public Object isEmpty(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.items, "isEmpty", AbstractPaginator.class));
    }

    @ConvertedMethod
    public Object isNotEmpty(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.items, "isNotEmpty", AbstractPaginator.class));
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.items, "count", AbstractPaginator.class));
    }

    @ConvertedMethod
    public Object getCollection(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.items);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "collection",
        typeHint = "Illuminate\\Support\\Collection"
    )
    public Object setCollection(RuntimeEnv env, Object... args) {
        Object collection = assignParameter(args, 0, false);
        this.items = collection;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object offsetExists(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this.items, "has", AbstractPaginator.class, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object offsetGet(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this.items, "get", AbstractPaginator.class, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object offsetSet(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        env.callMethod(this.items, "put", AbstractPaginator.class, key, value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object offsetUnset(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        env.callMethod(this.items, "forget", AbstractPaginator.class, key);
        return null;
    }

    @ConvertedMethod
    public Object toHtml(RuntimeEnv env, Object... args) {
        return ZVal.assign(toStringR(env.callMethod(this, "render", AbstractPaginator.class), env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        this.getCollection(env),
                        new RuntimeArgsWithReferences(),
                        toStringR(method, env),
                        AbstractPaginator.class,
                        PackedVaradicArgs.unpack(new PackedVaradicArgs(parameters))));
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(toStringR(env.callMethod(this, "render", AbstractPaginator.class), env));
    }

    public static final Object CONST_class = "Illuminate\\Pagination\\AbstractPaginator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "default")
        public Object resolveCurrentPath(RuntimeEnv env, Object... args) {
            Object _pDefault = assignParameter(args, 0, true);
            if (null == _pDefault) {
                _pDefault = "/";
            }
            if (ZVal.isset(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Pagination
                                            .classes
                                            .AbstractPaginator
                                            .RequestStaticProperties
                                            .class)
                            .currentPathResolver)) {
                return ZVal.assign(
                        function_call_user_func
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(
                                        env.getRequestStaticProperties(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Pagination
                                                                .classes
                                                                .AbstractPaginator
                                                                .RequestStaticProperties
                                                                .class)
                                                .currentPathResolver)
                                .value());
            }

            return ZVal.assign(_pDefault);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "resolver", typeHint = "Closure")
        public Object currentPathResolver(RuntimeEnv env, Object... args) {
            Object resolver = assignParameter(args, 0, false);
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Pagination
                                            .classes
                                            .AbstractPaginator
                                            .RequestStaticProperties
                                            .class)
                            .currentPathResolver =
                    resolver;
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "pageName")
        @ConvertedParameter(
            index = 1,
            name = "default",
            defaultValue = "1",
            defaultValueType = "number"
        )
        public Object resolveCurrentPage(RuntimeEnv env, Object... args) {
            Object pageName = assignParameter(args, 0, true);
            if (null == pageName) {
                pageName = "page";
            }
            Object _pDefault = assignParameter(args, 1, true);
            if (null == _pDefault) {
                _pDefault = 1;
            }
            if (ZVal.isset(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Pagination
                                            .classes
                                            .AbstractPaginator
                                            .RequestStaticProperties
                                            .class)
                            .currentPageResolver)) {
                return ZVal.assign(
                        function_call_user_func
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(
                                        env.getRequestStaticProperties(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Pagination
                                                                .classes
                                                                .AbstractPaginator
                                                                .RequestStaticProperties
                                                                .class)
                                                .currentPageResolver,
                                        pageName)
                                .value());
            }

            return ZVal.assign(_pDefault);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "resolver", typeHint = "Closure")
        public Object currentPageResolver(RuntimeEnv env, Object... args) {
            Object resolver = assignParameter(args, 0, false);
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Pagination
                                            .classes
                                            .AbstractPaginator
                                            .RequestStaticProperties
                                            .class)
                            .currentPageResolver =
                    resolver;
            return null;
        }

        @ConvertedMethod
        public Object viewFactory(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Illuminate
                                                            .namespaces
                                                            .Pagination
                                                            .classes
                                                            .AbstractPaginator
                                                            .RequestStaticProperties
                                                            .class)
                                            .viewFactoryResolver)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "resolver", typeHint = "Closure")
        public Object viewFactoryResolver(RuntimeEnv env, Object... args) {
            Object resolver = assignParameter(args, 0, false);
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Pagination
                                            .classes
                                            .AbstractPaginator
                                            .RequestStaticProperties
                                            .class)
                            .viewFactoryResolver =
                    resolver;
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "view")
        public Object defaultView(RuntimeEnv env, Object... args) {
            Object view = assignParameter(args, 0, false);
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Pagination
                                            .classes
                                            .AbstractPaginator
                                            .RequestStaticProperties
                                            .class)
                            .defaultView =
                    view;
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "view")
        public Object defaultSimpleView(RuntimeEnv env, Object... args) {
            Object view = assignParameter(args, 0, false);
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Pagination
                                            .classes
                                            .AbstractPaginator
                                            .RequestStaticProperties
                                            .class)
                            .defaultSimpleView =
                    view;
            return null;
        }

        @ConvertedMethod
        public Object useBootstrapThree(RuntimeEnv env, Object... args) {
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, AbstractPaginator.class)
                    .method("defaultView")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call("pagination::default")
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, AbstractPaginator.class)
                    .method("defaultSimpleView")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call("pagination::simple-default")
                    .value();
            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object currentPathResolver = null;

        public Object currentPageResolver = null;

        public Object viewFactoryResolver = null;

        public Object defaultView = "pagination::bootstrap-4";

        public Object defaultSimpleView = "pagination::simple-bootstrap-4";
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Pagination\\AbstractPaginator")
                    .setLookup(
                            AbstractPaginator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "currentPage",
                            "fragment",
                            "items",
                            "pageName",
                            "path",
                            "perPage",
                            "query")
                    .setStaticPropertyNames(
                            "currentPageResolver",
                            "currentPathResolver",
                            "defaultSimpleView",
                            "defaultView",
                            "viewFactoryResolver")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Pagination/AbstractPaginator.php")
                    .addInterface("Illuminate\\Contracts\\Support\\Htmlable")
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
