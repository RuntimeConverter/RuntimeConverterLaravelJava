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

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Arrays/IsArrayContainingKey.php

*/

public class IsArrayContainingKey extends TypeSafeMatcher {

    public Object _keyMatcher = null;

    public IsArrayContainingKey(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IsArrayContainingKey.class) {
            this.__construct(env, args);
        }
    }

    public IsArrayContainingKey(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keyMatcher", typeHint = "Hamcrest\\Matcher")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object keyMatcher = assignParameter(args, 0, false);
        super.__construct(env, CONST_TYPE_ARRAY);
        this._keyMatcher = keyMatcher;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "array")
    protected Object matchesSafely(RuntimeEnv env, Object... args) {
        Object array = assignParameter(args, 0, false);
        Object key = null;
        Object element = null;
        for (ZPair zpairResult158 : ZVal.getIterable(array, env, false)) {
            key = ZVal.assign(zpairResult158.getKey());
            element = ZVal.assign(zpairResult158.getValue());
            if (ZVal.isTrue(
                    env.callMethod(this._keyMatcher, "matches", IsArrayContainingKey.class, key))) {
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
                        IsArrayContainingKey.class,
                        "array was "),
                "appendText",
                IsArrayContainingKey.class,
                "[");
        loop = false;
        for (ZPair zpairResult159 : ZVal.getIterable(array, env, false)) {
            key = ZVal.assign(zpairResult159.getKey());
            value = ZVal.assign(zpairResult159.getValue());
            if (ZVal.isTrue(loop)) {
                env.callMethod(mismatchDescription, "appendText", IsArrayContainingKey.class, ", ");
            }

            env.callMethod(
                    env.callMethod(
                            env.callMethod(
                                    mismatchDescription,
                                    "appendValue",
                                    IsArrayContainingKey.class,
                                    key),
                            "appendText",
                            IsArrayContainingKey.class,
                            " => "),
                    "appendValue",
                    IsArrayContainingKey.class,
                    value);
            loop = true;
        }

        env.callMethod(mismatchDescription, "appendText", IsArrayContainingKey.class, "]");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "description", typeHint = "Hamcrest\\Description")
    public Object describeTo(RuntimeEnv env, Object... args) {
        Object description = assignParameter(args, 0, false);
        env.callMethod(
                env.callMethod(
                        description, "appendText", IsArrayContainingKey.class, "array with key "),
                "appendDescriptionOf",
                IsArrayContainingKey.class,
                this._keyMatcher);
        return null;
    }

    public static final Object CONST_class = "Hamcrest\\Arrays\\IsArrayContainingKey";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends TypeSafeMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "key")
        public Object hasKeyInArray(RuntimeEnv env, Object... args) {
            Object key = assignParameter(args, 0, false);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Hamcrest
                            .namespaces
                            .Arrays
                            .classes
                            .IsArrayContainingKey(
                            env, Util.runtimeStaticObject.wrapValueWithIsEqual(env, key)));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Arrays\\IsArrayContainingKey")
                    .setLookup(
                            IsArrayContainingKey.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_expectedSubtype", "_expectedType", "_keyMatcher")
                    .setFilename(
                            "vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Arrays/IsArrayContainingKey.php")
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
