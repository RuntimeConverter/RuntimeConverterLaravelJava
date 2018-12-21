package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes;

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
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Core/HasToString.php

*/

public class HasToString extends FeatureMatcher {

    public HasToString(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == HasToString.class) {
            this.__construct(env, args);
        }
    }

    public HasToString(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "toStringMatcher", typeHint = "Hamcrest\\Matcher")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object toStringMatcher = assignParameter(args, 0, false);
        super.__construct(
                env,
                CONST_TYPE_OBJECT,
                ZVal.getNull(),
                toStringMatcher,
                "an object with toString()",
                "toString()");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "actual")
    @ConvertedParameter(index = 1, name = "mismatchDescription", typeHint = "Hamcrest\\Description")
    public Object matchesSafelyWithDiagnosticDescription(RuntimeEnv env, Object... args) {
        Object actual = assignParameter(args, 0, false);
        Object mismatchDescription = assignParameter(args, 1, false);
        if (ZVal.toBool(function_method_exists.f.env(env).call(actual, "toString").value())
                || ZVal.toBool(
                        function_method_exists.f.env(env).call(actual, "__toString").value())) {
            return ZVal.assign(
                    super.matchesSafelyWithDiagnosticDescription(env, actual, mismatchDescription));
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "actual")
    protected Object featureValueOf(RuntimeEnv env, Object... args) {
        Object actual = assignParameter(args, 0, false);
        if (function_method_exists.f.env(env).call(actual, "toString").getBool()) {
            return ZVal.assign(env.callMethod(actual, "toString", HasToString.class));
        }

        return ZVal.assign(toStringR(actual, env));
    }

    public static final Object CONST_class = "Hamcrest\\Core\\HasToString";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends FeatureMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "matcher")
        public Object hasToString(RuntimeEnv env, Object... args) {
            Object matcher = assignParameter(args, 0, false);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Hamcrest
                            .namespaces
                            .Core
                            .classes
                            .HasToString(
                            env, Util.runtimeStaticObject.wrapValueWithIsEqual(env, matcher)));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Core\\HasToString")
                    .setLookup(
                            HasToString.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "_expectedSubtype",
                            "_expectedType",
                            "_featureDescription",
                            "_featureName",
                            "_subMatcher")
                    .setFilename(
                            "vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Core/HasToString.php")
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
