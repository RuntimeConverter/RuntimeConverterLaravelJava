package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.TypeSafeMatcher;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
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
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes.AllOf;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Core/IsCollectionContaining.php

*/

public class IsCollectionContaining extends TypeSafeMatcher {

    public Object _elementMatcher = null;

    public IsCollectionContaining(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IsCollectionContaining.class) {
            this.__construct(env, args);
        }
    }

    public IsCollectionContaining(NoConstructor n) {
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
    @ConvertedParameter(index = 0, name = "items")
    protected Object matchesSafely(RuntimeEnv env, Object... args) {
        Object items = assignParameter(args, 0, false);
        Object item = null;
        for (ZPair zpairResult169 : ZVal.getIterable(items, env, true)) {
            item = ZVal.assign(zpairResult169.getValue());
            if (ZVal.isTrue(
                    env.callMethod(
                            this._elementMatcher, "matches", IsCollectionContaining.class, item))) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "items")
    @ConvertedParameter(index = 1, name = "mismatchDescription", typeHint = "Hamcrest\\Description")
    protected Object describeMismatchSafely(RuntimeEnv env, Object... args) {
        Object items = assignParameter(args, 0, false);
        Object mismatchDescription = assignParameter(args, 1, false);
        env.callMethod(
                env.callMethod(
                        mismatchDescription, "appendText", IsCollectionContaining.class, "was "),
                "appendValue",
                IsCollectionContaining.class,
                items);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "description", typeHint = "Hamcrest\\Description")
    public Object describeTo(RuntimeEnv env, Object... args) {
        Object description = assignParameter(args, 0, false);
        env.callMethod(
                env.callMethod(
                        description,
                        "appendText",
                        IsCollectionContaining.class,
                        "a collection containing "),
                "appendDescriptionOf",
                IsCollectionContaining.class,
                this._elementMatcher);
        return null;
    }

    public static final Object CONST_class = "Hamcrest\\Core\\IsCollectionContaining";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends TypeSafeMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object hasItem(RuntimeEnv env, Object... args) {
            Object ___args = null;
            Object firstArg = null;
            ___args =
                    function_func_get_args
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call()
                            .value();
            firstArg = function_array_shift.f.env(env).call(___args).value();
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Hamcrest
                            .namespaces
                            .Core
                            .classes
                            .IsCollectionContaining(
                            env, Util.runtimeStaticObject.wrapValueWithIsEqual(env, firstArg)));
        }

        @ConvertedMethod
        public Object hasItems(RuntimeEnv env, Object... args) {
            Object ___args = null;
            ReferenceContainer matchers = new BasicReferenceContainer(null);
            Object arg = null;
            ___args =
                    function_func_get_args
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call()
                            .value();
            matchers.setObject(ZVal.newArray());
            for (ZPair zpairResult170 : ZVal.getIterable(___args, env, true)) {
                arg = ZVal.assign(zpairResult170.getValue());
                matchers.arrayAppend(env).set(runtimeStaticObject.hasItem(env, arg));
            }

            return ZVal.assign(AllOf.runtimeStaticObject.allOf(env, matchers.getObject()));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Core\\IsCollectionContaining")
                    .setLookup(
                            IsCollectionContaining.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_elementMatcher", "_expectedSubtype", "_expectedType")
                    .setFilename(
                            "vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Core/IsCollectionContaining.php")
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
