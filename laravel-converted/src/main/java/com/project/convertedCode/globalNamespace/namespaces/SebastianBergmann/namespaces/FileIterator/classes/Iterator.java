package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.FileIterator.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.file.function_realpath;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.FilterIterator;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-file-iterator/src/Iterator.php

*/

public class Iterator extends FilterIterator {

    public Object basePath = null;

    public Object suffixes = ZVal.newArray();

    public Object prefixes = ZVal.newArray();

    public Object exclude = ZVal.newArray();

    public Iterator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Iterator.class) {
            this.__construct(env, args);
        }
    }

    public Iterator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "basePath", typeHint = "string")
    @ConvertedParameter(index = 1, name = "iterator", typeHint = "Iterator")
    @ConvertedParameter(
        index = 2,
        name = "suffixes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "prefixes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 4,
        name = "exclude",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object basePath = assignParameter(args, 0, false);
        Object iterator = assignParameter(args, 1, false);
        Object suffixes = assignParameter(args, 2, true);
        if (null == suffixes) {
            suffixes = ZVal.newArray();
        }
        Object prefixes = assignParameter(args, 3, true);
        if (null == prefixes) {
            prefixes = ZVal.newArray();
        }
        Object exclude = assignParameter(args, 4, true);
        if (null == exclude) {
            exclude = ZVal.newArray();
        }
        this.basePath = function_realpath.f.env(env).call(basePath).value();
        this.prefixes = prefixes;
        this.suffixes = suffixes;
        this.exclude =
                function_array_filter
                        .f
                        .env(env)
                        .call(function_array_map.f.env(env).call("realpath", exclude).value())
                        .value();
        super.__construct(env, iterator);
        return null;
    }

    @ConvertedMethod
    public Object accept(RuntimeEnv env, Object... args) {
        Object current = null;
        Object filename = null;
        Object realPath = null;
        current =
                env.callMethod(
                        env.callMethod(this, "getInnerIterator", Iterator.class),
                        "current",
                        Iterator.class);
        filename = env.callMethod(current, "getFilename", Iterator.class);
        realPath = env.callMethod(current, "getRealPath", Iterator.class);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(this.acceptPath(env, realPath))
                                        && ZVal.toBool(this.acceptPrefix(env, filename)))
                        && ZVal.toBool(this.acceptSuffix(env, filename)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path", typeHint = "string")
    private Object acceptPath(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object exclude = null;
        if (function_preg_match
                .f
                .env(env)
                .call(
                        "=/\\.[^/]*/=",
                        function_str_replace.f.env(env).call(this.basePath, "", path).value())
                .getBool()) {
            return ZVal.assign(false);
        }

        for (ZPair zpairResult1115 : ZVal.getIterable(this.exclude, env, true)) {
            exclude = ZVal.assign(zpairResult1115.getValue());
            if (ZVal.strictEqualityCheck(
                    function_strpos.f.env(env).call(path, exclude).value(), "===", 0)) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
    private Object acceptPrefix(RuntimeEnv env, Object... args) {
        Object filename = assignParameter(args, 0, false);
        return ZVal.assign(this.acceptSubString(env, filename, this.prefixes, CONST_PREFIX));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
    private Object acceptSuffix(RuntimeEnv env, Object... args) {
        Object filename = assignParameter(args, 0, false);
        return ZVal.assign(this.acceptSubString(env, filename, this.suffixes, CONST_SUFFIX));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
    @ConvertedParameter(index = 1, name = "subStrings", typeHint = "array")
    @ConvertedParameter(index = 2, name = "type", typeHint = "int")
    private Object acceptSubString(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object filename = assignParameter(args, 0, false);
        Object subStrings = assignParameter(args, 1, false);
        Object type = assignParameter(args, 2, false);
        Object string = null;
        Object matched = null;
        if (ZVal.isEmpty(subStrings)) {
            return ZVal.assign(true);
        }

        matched = false;
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1116 : ZVal.getIterable(subStrings, env, true)) {
            string = ZVal.assign(zpairResult1116.getValue());
            if (ZVal.toBool(
                            ZVal.toBool(ZVal.strictEqualityCheck(type, "===", CONST_PREFIX))
                                    && ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    function_strpos
                                                            .f
                                                            .env(env)
                                                            .call(filename, string)
                                                            .value(),
                                                    "===",
                                                    0)))
                    || ZVal.toBool(
                            ZVal.toBool(ZVal.strictEqualityCheck(type, "===", CONST_SUFFIX))
                                    && ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    function_substr
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    filename,
                                                                    ZVal.multiply(
                                                                            -1,
                                                                            function_strlen
                                                                                    .f
                                                                                    .env(env)
                                                                                    .call(string)
                                                                                    .value()))
                                                            .value(),
                                                    "===",
                                                    string)))) {
                matched = true;
                break;
            }
        }

        return ZVal.assign(matched);
    }

    public static final Object CONST_PREFIX = 0;

    public static final Object CONST_SUFFIX = 1;

    public static final Object CONST_class = "SebastianBergmann\\FileIterator\\Iterator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends FilterIterator.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\FileIterator\\Iterator")
                    .setLookup(
                            Iterator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("basePath", "exclude", "prefixes", "suffixes")
                    .setFilename("vendor/phpunit/php-file-iterator/src/Iterator.php")
                    .addInterface("OuterIterator")
                    .addInterface("Traversable")
                    .addInterface("Iterator")
                    .addExtendsClass("FilterIterator")
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
