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

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Arrays/IsArrayContaining.php

*/

public class IsArrayContaining extends TypeSafeMatcher {

    public Object _elementMatcher = null;

    public IsArrayContaining(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IsArrayContaining.class) {
            this.__construct(env, args);
        }
    }

    public IsArrayContaining(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "elementMatcher", typeHint = "Hamcrest\\Matcher")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object elementMatcher = assignParameter(args, 0, false);
        super.__construct(env, CONST_TYPE_ARRAY);
        this._elementMatcher = elementMatcher;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "array")
    protected Object matchesSafely(RuntimeEnv env, Object... args) {
        Object array = assignParameter(args, 0, false);
        Object element = null;
        for (ZPair zpairResult155 : ZVal.getIterable(array, env, true)) {
            element = ZVal.assign(zpairResult155.getValue());
            if (ZVal.isTrue(
                    env.callMethod(
                            this._elementMatcher, "matches", IsArrayContaining.class, element))) {
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
        env.callMethod(
                env.callMethod(mismatchDescription, "appendText", IsArrayContaining.class, "was "),
                "appendValue",
                IsArrayContaining.class,
                array);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "description", typeHint = "Hamcrest\\Description")
    public Object describeTo(RuntimeEnv env, Object... args) {
        Object description = assignParameter(args, 0, false);
        env.callMethod(
                env.callMethod(
                        description, "appendText", IsArrayContaining.class, "an array containing "),
                "appendDescriptionOf",
                IsArrayContaining.class,
                this._elementMatcher);
        return null;
    }

    public static final Object CONST_class = "Hamcrest\\Arrays\\IsArrayContaining";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends TypeSafeMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "item")
        public Object hasItemInArray(RuntimeEnv env, Object... args) {
            Object item = assignParameter(args, 0, false);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Hamcrest
                            .namespaces
                            .Arrays
                            .classes
                            .IsArrayContaining(
                            env, Util.runtimeStaticObject.wrapValueWithIsEqual(env, item)));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Arrays\\IsArrayContaining")
                    .setLookup(
                            IsArrayContaining.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_elementMatcher", "_expectedSubtype", "_expectedType")
                    .setFilename(
                            "vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Arrays/IsArrayContaining.php")
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
