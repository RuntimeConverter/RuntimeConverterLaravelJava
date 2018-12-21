package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_walk;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Cache/TagSet.php

*/

public class TagSet extends RuntimeClassBase {

    public Object store = null;

    public Object names = ZVal.newArray();

    public TagSet(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TagSet.class) {
            this.__construct(env, args);
        }
    }

    public TagSet(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "store", typeHint = "Illuminate\\Contracts\\Cache\\Store")
    @ConvertedParameter(
        index = 1,
        name = "names",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object store = assignParameter(args, 0, false);
        Object names = assignParameter(args, 1, true);
        if (null == names) {
            names = ZVal.newArray();
        }
        this.store = store;
        this.names = names;
        return null;
    }

    @ConvertedMethod
    public Object reset(RuntimeEnv env, Object... args) {
        function_array_walk
                .f
                .env(env)
                .call(this.names, ZVal.newArray(new ZPair(0, this), new ZPair(1, "resetTag")));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object resetTag(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object id = null;
        env.callMethod(
                this.store,
                "forever",
                TagSet.class,
                this.tagKey(env, name),
                id =
                        function_str_replace
                                .f
                                .env(env)
                                .call(
                                        ".",
                                        "",
                                        NamespaceGlobal.uniqid.env(env).call("", true).value())
                                .value());
        return ZVal.assign(id);
    }

    @ConvertedMethod
    public Object getNamespace(RuntimeEnv env, Object... args) {
        return ZVal.assign(NamespaceGlobal.implode.env(env).call("|", this.tagIds(env)).value());
    }

    @ConvertedMethod
    protected Object tagIds(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_array_map
                        .f
                        .env(env)
                        .call(ZVal.newArray(new ZPair(0, this), new ZPair(1, "tagId")), this.names)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object tagId(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isTrue(
                                ternaryExpressionTemp =
                                        env.callMethod(
                                                this.store,
                                                "get",
                                                TagSet.class,
                                                this.tagKey(env, name)))
                        ? ternaryExpressionTemp
                        : this.resetTag(env, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object tagKey(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign("tag:" + toStringR(name, env) + ":key");
    }

    @ConvertedMethod
    public Object getNames(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.names);
    }

    public static final Object CONST_class = "Illuminate\\Cache\\TagSet";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Cache\\TagSet")
                    .setLookup(
                            TagSet.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("names", "store")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Cache/TagSet.php")
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
