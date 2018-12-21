package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/NamespacedItemResolver.php

*/

public class NamespacedItemResolver extends RuntimeClassBase {

    public Object parsed = ZVal.newArray();

    public NamespacedItemResolver(RuntimeEnv env, Object... args) {
        super(env);
    }

    public NamespacedItemResolver(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object parseKey(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object parsed = null;
        Object segments = null;
        if (arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "parsed", env), env, key)) {
            return ZVal.assign(new ReferenceClassProperty(this, "parsed", env).arrayGet(env, key));
        }

        if (ZVal.strictEqualityCheck(
                function_strpos.f.env(env).call(key, "::").value(), "===", false)) {
            segments = function_explode.f.env(env).call(".", key).value();
            parsed = this.parseBasicSegments(env, segments);

        } else {
            parsed = this.parseNamespacedSegments(env, key);
        }

        return ZVal.assign(
                new ReferenceClassProperty(this, "parsed", env).arrayAccess(env, key).set(parsed));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "segments", typeHint = "array")
    protected Object parseBasicSegments(RuntimeEnv env, Object... args) {
        ReferenceContainer segments = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object item = null;
        Object group = null;
        group = ZVal.assign(segments.arrayGet(env, 0));
        item =
                ZVal.assign(
                        ZVal.strictEqualityCheck(
                                        function_count
                                                .f
                                                .env(env)
                                                .call(segments.getObject())
                                                .value(),
                                        "===",
                                        1)
                                ? ZVal.getNull()
                                : NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                ".",
                                                function_array_slice
                                                        .f
                                                        .env(env)
                                                        .call(segments.getObject(), 1)
                                                        .value())
                                        .value());
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(0, ZVal.getNull()), new ZPair(1, group), new ZPair(2, item)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    protected Object parseNamespacedSegments(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object runtimeTempArrayResult83 = null;
        Object item = null;
        Object itemSegments = null;
        Object namespace = null;
        Object groupAndItem = null;
        ZVal.list(
                runtimeTempArrayResult83 = function_explode.f.env(env).call("::", key).value(),
                (namespace = listGet(runtimeTempArrayResult83, 0, env)),
                (item = listGet(runtimeTempArrayResult83, 1, env)));
        itemSegments = function_explode.f.env(env).call(".", item).value();
        groupAndItem =
                function_array_slice
                        .f
                        .env(env)
                        .call(this.parseBasicSegments(env, itemSegments), 1)
                        .value();
        return ZVal.assign(
                function_array_merge
                        .f
                        .env(env)
                        .call(ZVal.newArray(new ZPair(0, namespace)), groupAndItem)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "parsed")
    public Object setParsedKey(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object parsed = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "parsed", env).arrayAccess(env, key).set(parsed);
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Support\\NamespacedItemResolver";

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
                    .setName("Illuminate\\Support\\NamespacedItemResolver")
                    .setLookup(
                            NamespacedItemResolver.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("parsed")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Support/NamespacedItemResolver.php")
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
