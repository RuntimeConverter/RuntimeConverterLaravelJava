package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes;

import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.Util;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.DiagnosingMatcher;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Core/AllOf.php

*/

public class AllOf extends DiagnosingMatcher {

    public Object _matchers = null;

    public AllOf(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AllOf.class) {
            this.__construct(env, args);
        }
    }

    public AllOf(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "matchers", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object matchers = assignParameter(args, 0, false);
        Util.runtimeStaticObject.checkAllAreMatchers(env, matchers);
        this._matchers = matchers;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    @ConvertedParameter(index = 1, name = "mismatchDescription", typeHint = "Hamcrest\\Description")
    public Object matchesWithDiagnosticDescription(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        Object mismatchDescription = assignParameter(args, 1, false);
        Object matcher = null;
        for (ZPair zpairResult167 : ZVal.getIterable(this._matchers, env, true)) {
            matcher = ZVal.assign(zpairResult167.getValue());
            if (!ZVal.isTrue(env.callMethod(matcher, "matches", AllOf.class, item))) {
                env.callMethod(
                        env.callMethod(
                                mismatchDescription, "appendDescriptionOf", AllOf.class, matcher),
                        "appendText",
                        AllOf.class,
                        " ");
                env.callMethod(matcher, "describeMismatch", AllOf.class, item, mismatchDescription);
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "description", typeHint = "Hamcrest\\Description")
    public Object describeTo(RuntimeEnv env, Object... args) {
        Object description = assignParameter(args, 0, false);
        env.callMethod(description, "appendList", AllOf.class, "(", " and ", ")", this._matchers);
        return null;
    }

    public static final Object CONST_class = "Hamcrest\\Core\\AllOf";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends DiagnosingMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object allOf(RuntimeEnv env, Object... args) {
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
                            .Core
                            .classes
                            .AllOf(env, Util.runtimeStaticObject.createMatcherArray(env, ___args)));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Core\\AllOf")
                    .setLookup(
                            AllOf.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_matchers")
                    .setFilename("vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Core/AllOf.php")
                    .addInterface("Hamcrest\\Matcher")
                    .addInterface("Hamcrest\\SelfDescribing")
                    .addExtendsClass("Hamcrest\\DiagnosingMatcher")
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
