package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Arrays.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.FeatureMatcher;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.Util;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes.IsNot;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes.DescribedAs;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Arrays/IsArrayWithSize.php

*/

public class IsArrayWithSize extends FeatureMatcher {

    public IsArrayWithSize(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IsArrayWithSize.class) {
            this.__construct(env, args);
        }
    }

    public IsArrayWithSize(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sizeMatcher", typeHint = "Hamcrest\\Matcher")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object sizeMatcher = assignParameter(args, 0, false);
        super.__construct(
                env,
                CONST_TYPE_ARRAY,
                ZVal.getNull(),
                sizeMatcher,
                "an array with size",
                "array size");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "array")
    protected Object featureValueOf(RuntimeEnv env, Object... args) {
        Object array = assignParameter(args, 0, false);
        return ZVal.assign(function_count.f.env(env).call(array).value());
    }

    public static final Object CONST_class = "Hamcrest\\Arrays\\IsArrayWithSize";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends FeatureMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "size")
        public Object arrayWithSize(RuntimeEnv env, Object... args) {
            Object size = assignParameter(args, 0, false);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Hamcrest
                            .namespaces
                            .Arrays
                            .classes
                            .IsArrayWithSize(
                            env, Util.runtimeStaticObject.wrapValueWithIsEqual(env, size)));
        }

        @ConvertedMethod
        public Object emptyArray(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    DescribedAs.runtimeStaticObject.describedAs(
                            env, "an empty array", runtimeStaticObject.arrayWithSize(env, 0)));
        }

        @ConvertedMethod
        public Object nonEmptyArray(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    DescribedAs.runtimeStaticObject.describedAs(
                            env,
                            "a non-empty array",
                            runtimeStaticObject.arrayWithSize(
                                    env, IsNot.runtimeStaticObject.not(env, 0))));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Arrays\\IsArrayWithSize")
                    .setLookup(
                            IsArrayWithSize.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "_expectedSubtype",
                            "_expectedType",
                            "_featureDescription",
                            "_featureName",
                            "_subMatcher")
                    .setFilename(
                            "vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Arrays/IsArrayWithSize.php")
                    .addInterface("Hamcrest\\Matcher")
                    .addInterface("Hamcrest\\SelfDescribing")
                    .addExtendsClass("Hamcrest\\FeatureMatcher")
                    .addExtendsClass("Hamcrest\\TypeSafeDiagnosingMatcher")
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
