package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Pagination.classes;

import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Pagination.classes.AbstractPaginator;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Jsonable;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Pagination.classes.UrlWindow;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.ArrayAccess;
import com.runtimeconverter.runtime.nativeInterfaces.IteratorAggregate;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.HtmlString;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Arrayable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.nativeInterfaces.JsonSerializable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Collection;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Pagination/LengthAwarePaginator.php

*/

public class LengthAwarePaginator extends AbstractPaginator
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
                        .LengthAwarePaginator {

    public Object total = null;

    public Object lastPage = null;

    public LengthAwarePaginator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == LengthAwarePaginator.class) {
            this.__construct(env, args);
        }
    }

    public LengthAwarePaginator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "items")
    @ConvertedParameter(index = 1, name = "total")
    @ConvertedParameter(index = 2, name = "perPage")
    @ConvertedParameter(
        index = 3,
        name = "currentPage",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object items = assignParameter(args, 0, false);
        Object total = assignParameter(args, 1, false);
        Object perPage = assignParameter(args, 2, false);
        Object currentPage = assignParameter(args, 3, true);
        if (null == currentPage) {
            currentPage = ZVal.getNull();
        }
        Object options = assignParameter(args, 4, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object value = null;
        Object key = null;
        for (ZPair zpairResult505 : ZVal.getIterable(options, env, false)) {
            key = ZVal.assign(zpairResult505.getKey());
            value = ZVal.assign(zpairResult505.getValue());
            toObjectR(this).accessProp(this, env).name(key).set(value);
        }

        this.total = total;
        toObjectR(this).accessProp(this, env).name("perPage").set(perPage);
        this.lastPage =
                NamespaceGlobal.max
                        .env(env)
                        .call(
                                ZVal.toLong(
                                        NamespaceGlobal.ceil
                                                .env(env)
                                                .call(ZVal.divide(total, perPage))
                                                .value()),
                                1)
                        .value();
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
        toObjectR(this)
                .accessProp(this, env)
                .name("currentPage")
                .set(
                        this.setCurrentPage(
                                env,
                                currentPage,
                                toObjectR(this).accessProp(this, env).name("pageName").value()));
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
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "currentPage")
    @ConvertedParameter(index = 1, name = "pageName")
    protected Object setCurrentPage(RuntimeEnv env, Object... args) {
        Object currentPage = assignParameter(args, 0, false);
        ReferenceContainer pageName = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object ternaryExpressionTemp = null;
        currentPage =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = currentPage)
                                ? ternaryExpressionTemp
                                : StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, LengthAwarePaginator.class)
                                        .method("resolveCurrentPage")
                                        .addReferenceArgs(
                                                new RuntimeArgsWithReferences().add(0, pageName))
                                        .call(pageName.getObject())
                                        .value());
        return ZVal.assign(
                ZVal.isTrue(
                                env.callMethod(
                                        this,
                                        "isValidPageNumber",
                                        LengthAwarePaginator.class,
                                        currentPage))
                        ? ZVal.toLong(currentPage)
                        : 1);
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
                                                        env, this, LengthAwarePaginator.class)
                                                .method("viewFactory")
                                                .call()
                                                .value(),
                                        "make",
                                        LengthAwarePaginator.class,
                                        ZVal.isTrue(ternaryExpressionTemp = view)
                                                ? ternaryExpressionTemp
                                                : env.getRequestStaticProperties(
                                                                AbstractPaginator
                                                                        .RequestStaticProperties
                                                                        .class)
                                                        .defaultView,
                                        function_array_merge
                                                .f
                                                .env(env)
                                                .call(
                                                        data,
                                                        ZVal.newArray(
                                                                new ZPair("paginator", this),
                                                                new ZPair(
                                                                        "elements",
                                                                        this.elements(env))))
                                                .value()),
                                "render",
                                LengthAwarePaginator.class)));
    }

    @ConvertedMethod
    protected Object elements(RuntimeEnv env, Object... args) {
        ReferenceContainer window = new BasicReferenceContainer(null);
        window.setObject(UrlWindow.runtimeStaticObject.make(env, this));
        return ZVal.assign(
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair(0, window.arrayGet(env, "first")),
                                        new ZPair(
                                                1,
                                                function_is_array
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        window.arrayGet(
                                                                                env, "slider"))
                                                                .getBool()
                                                        ? "..."
                                                        : ZVal.getNull()),
                                        new ZPair(2, window.arrayGet(env, "slider")),
                                        new ZPair(
                                                3,
                                                function_is_array
                                                                .f
                                                                .env(env)
                                                                .call(window.arrayGet(env, "last"))
                                                                .getBool()
                                                        ? "..."
                                                        : ZVal.getNull()),
                                        new ZPair(4, window.arrayGet(env, "last"))))
                        .value());
    }

    @ConvertedMethod
    public Object total(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.total);
    }

    @ConvertedMethod
    public Object hasMorePages(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isLessThan(
                        env.callMethod(this, "currentPage", LengthAwarePaginator.class),
                        '<',
                        this.lastPage(env)));
    }

    @ConvertedMethod
    public Object nextPageUrl(RuntimeEnv env, Object... args) {
        if (ZVal.isGreaterThan(
                this.lastPage(env),
                '>',
                env.callMethod(this, "currentPage", LengthAwarePaginator.class))) {
            return ZVal.assign(
                    env.callMethod(
                            this,
                            "url",
                            LengthAwarePaginator.class,
                            ZVal.add(
                                    env.callMethod(this, "currentPage", LengthAwarePaginator.class),
                                    1)));
        }

        return null;
    }

    @ConvertedMethod
    public Object lastPage(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.lastPage);
    }

    @ConvertedMethod
    public Object toArray(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "current_page",
                                env.callMethod(this, "currentPage", LengthAwarePaginator.class)),
                        new ZPair(
                                "data",
                                env.callMethod(
                                        toObjectR(this).accessProp(this, env).name("items").value(),
                                        "toArray",
                                        LengthAwarePaginator.class)),
                        new ZPair(
                                "first_page_url",
                                env.callMethod(this, "url", LengthAwarePaginator.class, 1)),
                        new ZPair(
                                "from",
                                env.callMethod(this, "firstItem", LengthAwarePaginator.class)),
                        new ZPair("last_page", this.lastPage(env)),
                        new ZPair(
                                "last_page_url",
                                env.callMethod(
                                        this,
                                        "url",
                                        LengthAwarePaginator.class,
                                        this.lastPage(env))),
                        new ZPair("next_page_url", this.nextPageUrl(env)),
                        new ZPair(
                                "path", toObjectR(this).accessProp(this, env).name("path").value()),
                        new ZPair(
                                "per_page",
                                env.callMethod(this, "perPage", LengthAwarePaginator.class)),
                        new ZPair(
                                "prev_page_url",
                                env.callMethod(
                                        this, "previousPageUrl", LengthAwarePaginator.class)),
                        new ZPair(
                                "to", env.callMethod(this, "lastItem", LengthAwarePaginator.class)),
                        new ZPair("total", this.total(env))));
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

    public static final Object CONST_class = "Illuminate\\Pagination\\LengthAwarePaginator";

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
                    .setName("Illuminate\\Pagination\\LengthAwarePaginator")
                    .setLookup(
                            LengthAwarePaginator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "currentPage",
                            "fragment",
                            "items",
                            "lastPage",
                            "pageName",
                            "path",
                            "perPage",
                            "query",
                            "total")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Pagination/LengthAwarePaginator.php")
                    .addInterface("Illuminate\\Contracts\\Support\\Arrayable")
                    .addInterface("ArrayAccess")
                    .addInterface("Countable")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
                    .addInterface("JsonSerializable")
                    .addInterface("Illuminate\\Contracts\\Support\\Jsonable")
                    .addInterface("Illuminate\\Contracts\\Pagination\\LengthAwarePaginator")
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
