package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Arrays.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.TypeSafeMatcher;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.Util;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Arrays/IsArrayContainingKeyValuePair.php

*/

public class IsArrayContainingKeyValuePair extends TypeSafeMatcher {

    public Object _keyMatcher = null;

    public Object _valueMatcher = null;

    public IsArrayContainingKeyValuePair(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IsArrayContainingKeyValuePair.class) {
            this.__construct(env, args);
        }
    }

    public IsArrayContainingKeyValuePair(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keyMatcher", typeHint = "Hamcrest\\Matcher")
    @ConvertedParameter(index = 1, name = "valueMatcher", typeHint = "Hamcrest\\Matcher")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object keyMatcher = assignParameter(args, 0, false);
        Object valueMatcher = assignParameter(args, 1, false);
        super.__construct(env, CONST_TYPE_ARRAY);
        this._keyMatcher = keyMatcher;
        this._valueMatcher = valueMatcher;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "array")
    protected Object matchesSafely(RuntimeEnv env, Object... args) {
        Object array = assignParameter(args, 0, false);
        Object value = null;
        Object key = null;
        for (ZPair zpairResult160 : ZVal.getIterable(array, env, false)) {
            key = ZVal.assign(zpairResult160.getKey());
            value = ZVal.assign(zpairResult160.getValue());
            if (ZVal.toBool(
                            env.callMethod(
                                    this._keyMatcher,
                                    "matches",
                                    IsArrayContainingKeyValuePair.class,
                                    key))
                    && ZVal.toBool(
                            env.callMethod(
                                    this._valueMatcher,
                                    "matches",
                                    IsArrayContainingKeyValuePair.class,
                                    value))) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "array")
    @ConvertedParameter(index = 1, name = "mismatchDescription", typeHint = "Hamcrest\\Description")
    protected Object describeMismatchSafely(RuntimeEnv env, Object... args) {
        Object array = assignParameter(args, 0, false);
        Object mismatchDescription = assignParameter(args, 1, false);
        Object loop = null;
        Object value = null;
        Object key = null;
        env.callMethod(
                env.callMethod(
                        mismatchDescription,
                        "appendText",
                        IsArrayContainingKeyValuePair.class,
                        "array was "),
                "appendText",
                IsArrayContainingKeyValuePair.class,
                "[");
        loop = false;
        for (ZPair zpairResult161 : ZVal.getIterable(array, env, false)) {
            key = ZVal.assign(zpairResult161.getKey());
            value = ZVal.assign(zpairResult161.getValue());
            if (ZVal.isTrue(loop)) {
                env.callMethod(
                        mismatchDescription,
                        "appendText",
                        IsArrayContainingKeyValuePair.class,
                        ", ");
            }

            env.callMethod(
                    env.callMethod(
                            env.callMethod(
                                    mismatchDescription,
                                    "appendValue",
                                    IsArrayContainingKeyValuePair.class,
                                    key),
                            "appendText",
                            IsArrayContainingKeyValuePair.class,
                            " => "),
                    "appendValue",
                    IsArrayContainingKeyValuePair.class,
                    value);
            loop = true;
        }

        env.callMethod(mismatchDescription, "appendText", IsArrayContainingKeyValuePair.class, "]");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "description", typeHint = "Hamcrest\\Description")
    public Object describeTo(RuntimeEnv env, Object... args) {
        Object description = assignParameter(args, 0, false);
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                description,
                                                "appendText",
                                                IsArrayContainingKeyValuePair.class,
                                                "array containing ["),
                                        "appendDescriptionOf",
                                        IsArrayContainingKeyValuePair.class,
                                        this._keyMatcher),
                                "appendText",
                                IsArrayContainingKeyValuePair.class,
                                " => "),
                        "appendDescriptionOf",
                        IsArrayContainingKeyValuePair.class,
                        this._valueMatcher),
                "appendText",
                IsArrayContainingKeyValuePair.class,
                "]");
        return null;
    }

    public static final Object CONST_class = "Hamcrest\\Arrays\\IsArrayContainingKeyValuePair";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends TypeSafeMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "key")
        @ConvertedParameter(index = 1, name = "value")
        public Object hasKeyValuePair(RuntimeEnv env, Object... args) {
            Object key = assignParameter(args, 0, false);
            Object value = assignParameter(args, 1, false);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Hamcrest
                            .namespaces
                            .Arrays
                            .classes
                            .IsArrayContainingKeyValuePair(
                            env,
                            Util.runtimeStaticObject.wrapValueWithIsEqual(env, key),
                            Util.runtimeStaticObject.wrapValueWithIsEqual(env, value)));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Arrays\\IsArrayContainingKeyValuePair")
                    .setLookup(
                            IsArrayContainingKeyValuePair.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "_expectedSubtype", "_expectedType", "_keyMatcher", "_valueMatcher")
                    .setFilename(
                            "vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Arrays/IsArrayContainingKeyValuePair.php")
                    .addInterface("Hamcrest\\Matcher")
                    .addInterface("Hamcrest\\SelfDescribing")
                    .addExtendsClass("Hamcrest\\TypeSafeMatcher")
                    .addExtendsClass("Hamcrest\\BaseMatcher")
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
