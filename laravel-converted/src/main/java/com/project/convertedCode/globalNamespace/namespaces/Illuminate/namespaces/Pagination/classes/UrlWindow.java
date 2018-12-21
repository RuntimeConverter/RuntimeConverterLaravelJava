package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Pagination.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Pagination/UrlWindow.php

*/

public class UrlWindow extends RuntimeClassBase {

    public Object paginator = null;

    public UrlWindow(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == UrlWindow.class) {
            this.__construct(env, args);
        }
    }

    public UrlWindow(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "paginator",
        typeHint = "Illuminate\\Contracts\\Pagination\\LengthAwarePaginator"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object paginator = assignParameter(args, 0, false);
        this.paginator = paginator;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "onEachSide",
        defaultValue = "3",
        defaultValueType = "number"
    )
    public Object get(RuntimeEnv env, Object... args) {
        Object onEachSide = assignParameter(args, 0, true);
        if (null == onEachSide) {
            onEachSide = 3;
        }
        if (ZVal.isLessThan(
                env.callMethod(this.paginator, "lastPage", UrlWindow.class),
                '<',
                ZVal.add(ZVal.multiply(onEachSide, 2), 6))) {
            return ZVal.assign(this.getSmallSlider(env));
        }

        return ZVal.assign(this.getUrlSlider(env, onEachSide));
    }

    @ConvertedMethod
    protected Object getSmallSlider(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "first",
                                env.callMethod(
                                        this.paginator,
                                        "getUrlRange",
                                        UrlWindow.class,
                                        1,
                                        this.lastPage(env))),
                        new ZPair("slider", ZVal.getNull()),
                        new ZPair("last", ZVal.getNull())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "onEachSide")
    protected Object getUrlSlider(RuntimeEnv env, Object... args) {
        Object onEachSide = assignParameter(args, 0, false);
        Object window = null;
        window = ZVal.multiply(onEachSide, 2);
        if (!ZVal.isTrue(this.hasPages(env))) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair("first", ZVal.getNull()),
                            new ZPair("slider", ZVal.getNull()),
                            new ZPair("last", ZVal.getNull())));
        }

        if (ZVal.isLessThanOrEqualTo(this.currentPage(env), "<=", window)) {
            return ZVal.assign(this.getSliderTooCloseToBeginning(env, window));

        } else if (ZVal.isGreaterThan(
                this.currentPage(env), '>', ZVal.subtract(this.lastPage(env), window))) {
            return ZVal.assign(this.getSliderTooCloseToEnding(env, window));
        }

        return ZVal.assign(this.getFullSlider(env, onEachSide));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "window")
    protected Object getSliderTooCloseToBeginning(RuntimeEnv env, Object... args) {
        Object window = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "first",
                                env.callMethod(
                                        this.paginator,
                                        "getUrlRange",
                                        UrlWindow.class,
                                        1,
                                        ZVal.add(window, 2))),
                        new ZPair("slider", ZVal.getNull()),
                        new ZPair("last", this.getFinish(env))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "window")
    protected Object getSliderTooCloseToEnding(RuntimeEnv env, Object... args) {
        Object window = assignParameter(args, 0, false);
        Object last = null;
        last =
                env.callMethod(
                        this.paginator,
                        "getUrlRange",
                        UrlWindow.class,
                        ZVal.subtract(this.lastPage(env), ZVal.add(window, 2)),
                        this.lastPage(env));
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("first", this.getStart(env)),
                        new ZPair("slider", ZVal.getNull()),
                        new ZPair("last", last)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "onEachSide")
    protected Object getFullSlider(RuntimeEnv env, Object... args) {
        Object onEachSide = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("first", this.getStart(env)),
                        new ZPair("slider", this.getAdjacentUrlRange(env, onEachSide)),
                        new ZPair("last", this.getFinish(env))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "onEachSide")
    public Object getAdjacentUrlRange(RuntimeEnv env, Object... args) {
        Object onEachSide = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this.paginator,
                        "getUrlRange",
                        UrlWindow.class,
                        ZVal.subtract(this.currentPage(env), onEachSide),
                        ZVal.add(this.currentPage(env), onEachSide)));
    }

    @ConvertedMethod
    public Object getStart(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.paginator, "getUrlRange", UrlWindow.class, 1, 2));
    }

    @ConvertedMethod
    public Object getFinish(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this.paginator,
                        "getUrlRange",
                        UrlWindow.class,
                        ZVal.subtract(this.lastPage(env), 1),
                        this.lastPage(env)));
    }

    @ConvertedMethod
    public Object hasPages(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isGreaterThan(
                        env.callMethod(this.paginator, "lastPage", UrlWindow.class), '>', 1));
    }

    @ConvertedMethod
    protected Object currentPage(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.paginator, "currentPage", UrlWindow.class));
    }

    @ConvertedMethod
    protected Object lastPage(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.paginator, "lastPage", UrlWindow.class));
    }

    public static final Object CONST_class = "Illuminate\\Pagination\\UrlWindow";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "paginator",
            typeHint = "Illuminate\\Contracts\\Pagination\\LengthAwarePaginator"
        )
        @ConvertedParameter(
            index = 1,
            name = "onEachSide",
            defaultValue = "3",
            defaultValueType = "number"
        )
        public Object make(RuntimeEnv env, Object... args) {
            Object paginator = assignParameter(args, 0, false);
            Object onEachSide = assignParameter(args, 1, true);
            if (null == onEachSide) {
                onEachSide = 3;
            }
            return ZVal.assign(
                    env.callMethod(
                            env.createNewWithLateStaticBindings(this, paginator),
                            "get",
                            UrlWindow.class,
                            onEachSide));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Pagination\\UrlWindow")
                    .setLookup(
                            UrlWindow.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("paginator")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Pagination/UrlWindow.php")
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
