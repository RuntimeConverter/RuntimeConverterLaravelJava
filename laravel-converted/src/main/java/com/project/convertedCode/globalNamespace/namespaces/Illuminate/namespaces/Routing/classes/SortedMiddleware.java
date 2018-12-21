package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_splice;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.functions.head;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_search;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Collection;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Routing/SortedMiddleware.php

*/

public class SortedMiddleware extends Collection {

    public SortedMiddleware(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SortedMiddleware.class) {
            this.__construct(env, args);
        }
    }

    public SortedMiddleware(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "priorityMap", typeHint = "array")
    @ConvertedParameter(index = 1, name = "middlewares")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object priorityMap = assignParameter(args, 0, false);
        Object middlewares = assignParameter(args, 1, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        middlewares, Collection.class, "Illuminate\\Support\\Collection"))) {
            middlewares = env.callMethod(middlewares, "all", SortedMiddleware.class);
        }

        toObjectR(this)
                .accessProp(this, env)
                .name("items")
                .set(this.sortMiddleware(env, priorityMap, middlewares));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "priorityMap")
    @ConvertedParameter(index = 1, name = "middlewares")
    protected Object sortMiddleware(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object priorityMap = assignParameter(args, 0, false);
        Object middlewares = assignParameter(args, 1, false);
        Object priorityIndex = null;
        Object lastPriorityIndex = null;
        Object stripped = null;
        Object index = null;
        Object lastIndex = null;
        Object middleware = null;
        lastIndex = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult537 : ZVal.getIterable(middlewares, env, false)) {
            index = ZVal.assign(zpairResult537.getKey());
            middleware = ZVal.assign(zpairResult537.getValue());
            if (!function_is_string.f.env(env).call(middleware).getBool()) {
                continue;
            }

            stripped =
                    head.f
                            .env(env)
                            .call(function_explode.f.env(env).call(":", middleware).value())
                            .value();
            if (function_in_array.f.env(env).call(stripped, priorityMap).getBool()) {
                priorityIndex =
                        function_array_search.f.env(env).call(stripped, priorityMap).value();
                if (ZVal.toBool(ZVal.isset(lastPriorityIndex))
                        && ZVal.toBool(ZVal.isLessThan(priorityIndex, '<', lastPriorityIndex))) {
                    return ZVal.assign(
                            this.sortMiddleware(
                                    env,
                                    priorityMap,
                                    function_array_values
                                            .f
                                            .env(env)
                                            .call(
                                                    this.moveMiddleware(
                                                            env, middlewares, index, lastIndex))
                                            .value()));
                }

                lastIndex = ZVal.assign(index);
                lastPriorityIndex = ZVal.assign(priorityIndex);
            }
        }

        return ZVal.assign(
                function_array_values
                        .f
                        .env(env)
                        .call(function_array_unique.f.env(env).call(middlewares, 0).value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "middlewares")
    @ConvertedParameter(index = 1, name = "from")
    @ConvertedParameter(index = 2, name = "to")
    protected Object moveMiddleware(RuntimeEnv env, Object... args) {
        ReferenceContainer middlewares =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        Object from = assignParameter(args, 1, false);
        Object to = assignParameter(args, 2, false);
        function_array_splice
                .f
                .env(env)
                .call(middlewares.getObject(), to, 0, middlewares.arrayGet(env, from));
        arrayActionR(ArrayAction.UNSET, middlewares, env, ZVal.add(from, 1));
        return ZVal.assign(middlewares.getObject());
    }

    public static final Object CONST_class = "Illuminate\\Routing\\SortedMiddleware";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Collection.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Routing\\SortedMiddleware")
                    .setLookup(
                            SortedMiddleware.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("items")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Routing/SortedMiddleware.php")
                    .addInterface("ArrayAccess")
                    .addInterface("Illuminate\\Contracts\\Support\\Arrayable")
                    .addInterface("Countable")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
                    .addInterface("Illuminate\\Contracts\\Support\\Jsonable")
                    .addInterface("JsonSerializable")
                    .addExtendsClass("Illuminate\\Support\\Collection")
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
