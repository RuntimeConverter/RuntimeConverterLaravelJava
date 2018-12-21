package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Arrays.classes;

import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.Util;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.TypeSafeDiagnosingMatcher;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Arrays.classes.SeriesMatchingOnce;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Arrays/IsArrayContainingInOrder.php

*/

public class IsArrayContainingInOrder extends TypeSafeDiagnosingMatcher {

    public Object _elementMatchers = null;

    public IsArrayContainingInOrder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IsArrayContainingInOrder.class) {
            this.__construct(env, args);
        }
    }

    public IsArrayContainingInOrder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "elementMatchers", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object elementMatchers = assignParameter(args, 0, false);
        super.__construct(env, CONST_TYPE_ARRAY);
        Util.runtimeStaticObject.checkAllAreMatchers(env, elementMatchers);
        this._elementMatchers = elementMatchers;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "array")
    @ConvertedParameter(index = 1, name = "mismatchDescription", typeHint = "Hamcrest\\Description")
    protected Object matchesSafelyWithDiagnosticDescription(RuntimeEnv env, Object... args) {
        Object array = assignParameter(args, 0, false);
        Object mismatchDescription = assignParameter(args, 1, false);
        Object series = null;
        Object element = null;
        series = new SeriesMatchingOnce(env, this._elementMatchers, mismatchDescription);
        for (ZPair zpairResult157 : ZVal.getIterable(array, env, true)) {
            element = ZVal.assign(zpairResult157.getValue());
            if (!ZVal.isTrue(
                    env.callMethod(series, "matches", IsArrayContainingInOrder.class, element))) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(env.callMethod(series, "isFinished", IsArrayContainingInOrder.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "description", typeHint = "Hamcrest\\Description")
    public Object describeTo(RuntimeEnv env, Object... args) {
        Object description = assignParameter(args, 0, false);
        env.callMethod(
                description,
                "appendList",
                IsArrayContainingInOrder.class,
                "[",
                ", ",
                "]",
                this._elementMatchers);
        return null;
    }

    public static final Object CONST_class = "Hamcrest\\Arrays\\IsArrayContainingInOrder";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends TypeSafeDiagnosingMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object arrayContaining(RuntimeEnv env, Object... args) {
            Object ___args = null;
            ___args =
                    function_func_get_args
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call()
                            .value();
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Hamcrest
                            .namespaces
                            .Arrays
                            .classes
                            .IsArrayContainingInOrder(
                            env, Util.runtimeStaticObject.createMatcherArray(env, ___args)));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Arrays\\IsArrayContainingInOrder")
                    .setLookup(
                            IsArrayContainingInOrder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_elementMatchers", "_expectedSubtype", "_expectedType")
                    .setFilename(
                            "vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Arrays/IsArrayContainingInOrder.php")
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
