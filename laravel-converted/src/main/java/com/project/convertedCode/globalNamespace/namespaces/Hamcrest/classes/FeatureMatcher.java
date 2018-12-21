package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.TypeSafeDiagnosingMatcher;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/FeatureMatcher.php

*/

public abstract class FeatureMatcher extends TypeSafeDiagnosingMatcher {

    public Object _subMatcher = null;

    public Object _featureDescription = null;

    public Object _featureName = null;

    public FeatureMatcher(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FeatureMatcher.class) {
            this.__construct(env, args);
        }
    }

    public FeatureMatcher(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(index = 1, name = "subtype")
    @ConvertedParameter(index = 2, name = "subMatcher", typeHint = "Hamcrest\\Matcher")
    @ConvertedParameter(index = 3, name = "featureDescription")
    @ConvertedParameter(index = 4, name = "featureName")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        Object subtype = assignParameter(args, 1, false);
        Object subMatcher = assignParameter(args, 2, false);
        Object featureDescription = assignParameter(args, 3, false);
        Object featureName = assignParameter(args, 4, false);
        super.__construct(env, type, subtype);
        this._subMatcher = subMatcher;
        this._featureDescription = featureDescription;
        this._featureName = featureName;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "actual")
    @ConvertedParameter(index = 1, name = "mismatchDescription", typeHint = "Hamcrest\\Description")
    public Object matchesSafelyWithDiagnosticDescription(RuntimeEnv env, Object... args) {
        Object actual = assignParameter(args, 0, false);
        Object mismatchDescription = assignParameter(args, 1, false);
        Object featureValue = null;
        featureValue = env.callMethod(this, "featureValueOf", FeatureMatcher.class, actual);
        if (!ZVal.isTrue(
                env.callMethod(this._subMatcher, "matches", FeatureMatcher.class, featureValue))) {
            env.callMethod(
                    env.callMethod(
                            env.callMethod(
                                    mismatchDescription,
                                    "appendText",
                                    FeatureMatcher.class,
                                    this._featureName),
                            "appendText",
                            FeatureMatcher.class,
                            " was "),
                    "appendValue",
                    FeatureMatcher.class,
                    featureValue);
            return ZVal.assign(false);
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "description", typeHint = "Hamcrest\\Description")
    public final Object describeTo(RuntimeEnv env, Object... args) {
        Object description = assignParameter(args, 0, false);
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                description,
                                "appendText",
                                FeatureMatcher.class,
                                this._featureDescription),
                        "appendText",
                        FeatureMatcher.class,
                        " "),
                "appendDescriptionOf",
                FeatureMatcher.class,
                this._subMatcher);
        return null;
    }

    public static final Object CONST_class = "Hamcrest\\FeatureMatcher";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends TypeSafeDiagnosingMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\FeatureMatcher")
                    .setLookup(
                            FeatureMatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "_expectedSubtype",
                            "_expectedType",
                            "_featureDescription",
                            "_featureName",
                            "_subMatcher")
                    .setFilename(
                            "vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/FeatureMatcher.php")
                    .addInterface("Hamcrest\\Matcher")
                    .addInterface("Hamcrest\\SelfDescribing")
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
