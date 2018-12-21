package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Arrays.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_current;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Arrays/SeriesMatchingOnce.php

*/

public class SeriesMatchingOnce extends RuntimeClassBase {

    public Object _elementMatchers = null;

    public Object _keys = null;

    public Object _mismatchDescription = null;

    public Object _nextMatchKey = null;

    public SeriesMatchingOnce(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SeriesMatchingOnce.class) {
            this.__construct(env, args);
        }
    }

    public SeriesMatchingOnce(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "elementMatchers", typeHint = "array")
    @ConvertedParameter(index = 1, name = "mismatchDescription", typeHint = "Hamcrest\\Description")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object elementMatchers = assignParameter(args, 0, false);
        Object mismatchDescription = assignParameter(args, 1, false);
        this._elementMatchers = elementMatchers;
        this._keys = function_array_keys.f.env(env).call(elementMatchers).value();
        this._mismatchDescription = mismatchDescription;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    public Object matches(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(this._isNotSurplus(env, item))
                        && ZVal.toBool(this._isMatched(env, item)));
    }

    @ConvertedMethod
    public Object isFinished(RuntimeEnv env, Object... args) {
        Object nextMatcher = null;
        if (!ZVal.isEmpty(this._elementMatchers)) {
            nextMatcher = function_current.f.env(env).call(this._elementMatchers).value();
            env.callMethod(
                    env.callMethod(
                            this._mismatchDescription,
                            "appendText",
                            SeriesMatchingOnce.class,
                            "No item matched: "),
                    "appendDescriptionOf",
                    SeriesMatchingOnce.class,
                    nextMatcher);
            return ZVal.assign(false);
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    private Object _isNotSurplus(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        if (ZVal.isEmpty(this._elementMatchers)) {
            env.callMethod(
                    env.callMethod(
                            this._mismatchDescription,
                            "appendText",
                            SeriesMatchingOnce.class,
                            "Not matched: "),
                    "appendValue",
                    SeriesMatchingOnce.class,
                    item);
            return ZVal.assign(false);
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    private Object _isMatched(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        Object nextMatcher = null;
        this._nextMatchKey = function_array_shift.f.env(env).call(this._keys).value();
        nextMatcher = function_array_shift.f.env(env).call(this._elementMatchers).value();
        if (!ZVal.isTrue(env.callMethod(nextMatcher, "matches", SeriesMatchingOnce.class, item))) {
            this._describeMismatch(env, nextMatcher, item);
            return ZVal.assign(false);
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "matcher", typeHint = "Hamcrest\\Matcher")
    @ConvertedParameter(index = 1, name = "item")
    private Object _describeMismatch(RuntimeEnv env, Object... args) {
        Object matcher = assignParameter(args, 0, false);
        Object item = assignParameter(args, 1, false);
        env.callMethod(
                this._mismatchDescription,
                "appendText",
                SeriesMatchingOnce.class,
                "item with key " + toStringR(this._nextMatchKey, env) + ": ");
        env.callMethod(
                matcher,
                "describeMismatch",
                SeriesMatchingOnce.class,
                item,
                this._mismatchDescription);
        return null;
    }

    public static final Object CONST_class = "Hamcrest\\Arrays\\SeriesMatchingOnce";

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
                    .setName("Hamcrest\\Arrays\\SeriesMatchingOnce")
                    .setLookup(
                            SeriesMatchingOnce.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "_elementMatchers", "_keys", "_mismatchDescription", "_nextMatchKey")
                    .setFilename(
                            "vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Arrays/SeriesMatchingOnce.php")
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
