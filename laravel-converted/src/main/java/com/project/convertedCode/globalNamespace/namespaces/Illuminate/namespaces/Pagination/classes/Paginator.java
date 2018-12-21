package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Pagination.classes;

import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Pagination.classes.AbstractPaginator;
import com.runtimeconverter.runtime.nativeInterfaces.JsonSerializable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Jsonable;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.ArrayAccess;
import com.runtimeconverter.runtime.nativeInterfaces.IteratorAggregate;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Collection;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.HtmlString;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Arrayable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Pagination/Paginator.php

*/

public class Paginator extends AbstractPaginator
        implements Arrayable,
                ArrayAccess,
                Countable,
                IteratorAggregate,
                JsonSerializable,
                Jsonable,
                com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Illuminate
                        .namespaces
                        .Contracts
                        .namespaces
                        .Pagination
                        .classes
                        .Paginator {

    public Object hasMore = null;

    public Paginator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Paginator.class) {
            this.__construct(env, args);
        }
    }

    public Paginator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "items")
    @ConvertedParameter(index = 1, name = "perPage")
    @ConvertedParameter(
        index = 2,
        name = "currentPage",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object items = assignParameter(args, 0, false);
        Object perPage = assignParameter(args, 1, false);
        Object currentPage = assignParameter(args, 2, true);
        if (null == currentPage) {
            currentPage = ZVal.getNull();
        }
        Object options = assignParameter(args, 3, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object value = null;
        Object key = null;
        for (ZPair zpairResult506 : ZVal.getIterable(options, env, false)) {
            key = ZVal.assign(zpairResult506.getKey());
            value = ZVal.assign(zpairResult506.getValue());
            toObjectR(this).accessProp(this, env).name(key).set(value);
        }

        toObjectR(this).accessProp(this, env).name("perPage").set(perPage);
        toObjectR(this)
                .accessProp(this, env)
                .name("currentPage")
                .set(this.setCurrentPage(env, currentPage));
        toObjectR(this)
                .accessProp(this, env)
                .name("path")
                .set(
                        ZVal.strictNotEqualityCheck(
                                        toObjectR(this).accessProp(this, env).name("path").value(),
                                        "!==",
                                        "/")
                                ? function_rtrim
                                        .f
                                        .env(env)
                                        .call(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("path")
                                                        .value(),
                                                "/")
                                        .value()
                                : toObjectR(this).accessProp(this, env).name("path").value());
        this.setItems(env, items);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "currentPage")
    protected Object setCurrentPage(RuntimeEnv env, Object... args) {
        Object currentPage = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        currentPage =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = currentPage)
                                ? ternaryExpressionTemp
                                : StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, Paginator.class)
                                        .method("resolveCurrentPage")
                                        .call()
                                        .value());
        return ZVal.assign(
                ZVal.isTrue(env.callMethod(this, "isValidPageNumber", Paginator.class, currentPage))
                        ? ZVal.toLong(currentPage)
                        : 1);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "items")
    protected Object setItems(RuntimeEnv env, Object... args) {
        Object items = assignParameter(args, 0, false);
        toObjectR(this)
                .accessProp(this, env)
                .name("items")
                .set(
                        ZVal.isTrue(
                                        ZVal.checkInstanceType(
                                                items,
                                                Collection.class,
                                                "Illuminate\\Support\\Collection"))
                                ? items
                                : Collection.runtimeStaticObject.make(env, items));
        this.hasMore =
                ZVal.isGreaterThan(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("items").value(),
                                "count",
                                Paginator.class),
                        '>',
                        toObjectR(this).accessProp(this, env).name("perPage").value());
        toObjectR(this)
                .accessProp(this, env)
                .name("items")
                .set(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("items").value(),
                                "slice",
                                Paginator.class,
                                0,
                                toObjectR(this).accessProp(this, env).name("perPage").value()));
        return null;
    }

    @ConvertedMethod
    public Object nextPageUrl(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.hasMorePages(env))) {
            return ZVal.assign(
                    env.callMethod(
                            this,
                            "url",
                            Paginator.class,
                            ZVal.add(env.callMethod(this, "currentPage", Paginator.class), 1)));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "view",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 1, name = "data", defaultValue = "", defaultValueType = "array")
    public Object links(RuntimeEnv env, Object... args) {
        Object view = assignParameter(args, 0, true);
        if (null == view) {
            view = ZVal.getNull();
        }
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        return ZVal.assign(this.render(env, view, data));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "view",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 1, name = "data", defaultValue = "", defaultValueType = "array")
    public Object render(RuntimeEnv env, Object... args) {
        Object view = assignParameter(args, 0, true);
        if (null == view) {
            view = ZVal.getNull();
        }
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                new HtmlString(
                        env,
                        env.callMethod(
                                env.callMethod(
                                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                                        env, this, Paginator.class)
                                                .method("viewFactory")
                                                .call()
                                                .value(),
                                        "make",
                                        Paginator.class,
                                        ZVal.isTrue(ternaryExpressionTemp = view)
                                                ? ternaryExpressionTemp
                                                : env.getRequestStaticProperties(
                                                                AbstractPaginator
                                                                        .RequestStaticProperties
                                                                        .class)
                                                        .defaultSimpleView,
                                        function_array_merge
                                                .f
                                                .env(env)
                                                .call(
                                                        data,
                                                        ZVal.newArray(new ZPair("paginator", this)))
                                                .value()),
                                "render",
                                Paginator.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "hasMore",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object hasMorePagesWhen(RuntimeEnv env, Object... args) {
        Object hasMore = assignParameter(args, 0, true);
        if (null == hasMore) {
            hasMore = true;
        }
        this.hasMore = hasMore;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object hasMorePages(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.hasMore);
    }

    @ConvertedMethod
    public Object toArray(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "current_page",
                                env.callMethod(this, "currentPage", Paginator.class)),
                        new ZPair(
                                "data",
                                env.callMethod(
                                        toObjectR(this).accessProp(this, env).name("items").value(),
                                        "toArray",
                                        Paginator.class)),
                        new ZPair(
                                "first_page_url", env.callMethod(this, "url", Paginator.class, 1)),
                        new ZPair("from", env.callMethod(this, "firstItem", Paginator.class)),
                        new ZPair("next_page_url", this.nextPageUrl(env)),
                        new ZPair(
                                "path", toObjectR(this).accessProp(this, env).name("path").value()),
                        new ZPair("per_page", env.callMethod(this, "perPage", Paginator.class)),
                        new ZPair(
                                "prev_page_url",
                                env.callMethod(this, "previousPageUrl", Paginator.class)),
                        new ZPair("to", env.callMethod(this, "lastItem", Paginator.class))));
    }

    @ConvertedMethod
    public Object jsonSerialize(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.toArray(env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "options",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object toJson(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, true);
        if (null == options) {
            options = 0;
        }
        return ZVal.assign(
                NamespaceGlobal.json_encode
                        .env(env)
                        .call(this.jsonSerialize(env), options)
                        .value());
    }

    public static final Object CONST_class = "Illuminate\\Pagination\\Paginator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractPaginator.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Pagination\\Paginator")
                    .setLookup(
                            Paginator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "currentPage",
                            "fragment",
                            "hasMore",
                            "items",
                            "pageName",
                            "path",
                            "perPage",
                            "query")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Pagination/Paginator.php")
                    .addInterface("Illuminate\\Contracts\\Support\\Arrayable")
                    .addInterface("ArrayAccess")
                    .addInterface("Countable")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
                    .addInterface("JsonSerializable")
                    .addInterface("Illuminate\\Contracts\\Support\\Jsonable")
                    .addInterface("Illuminate\\Contracts\\Pagination\\Paginator")
                    .addInterface("Illuminate\\Contracts\\Support\\Htmlable")
                    .addExtendsClass("Illuminate\\Pagination\\AbstractPaginator")
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
