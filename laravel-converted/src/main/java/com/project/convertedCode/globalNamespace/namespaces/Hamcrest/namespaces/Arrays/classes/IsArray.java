package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Arrays.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.TypeSafeMatcher;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.Util;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Arrays/IsArray.php

*/

public class IsArray extends TypeSafeMatcher {

    public Object _elementMatchers = null;

    public IsArray(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IsArray.class) {
            this.__construct(env, args);
        }
    }

    public IsArray(NoConstructor n) {
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
    protected Object matchesSafely(RuntimeEnv env, Object... args) {
        ReferenceContainer array = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object k = null;
        Object matcher = null;
        if (ZVal.notEqualityCheck(
                function_array_keys.f.env(env).call(array.getObject()).value(),
                function_array_keys.f.env(env).call(this._elementMatchers).value())) {
            return ZVal.assign(false);
        }

        for (ZPair zpairResult153 : ZVal.getIterable(this._elementMatchers, env, false)) {
            k = ZVal.assign(zpairResult153.getKey());
            matcher = ZVal.assign(zpairResult153.getValue());
            if (!ZVal.isTrue(
                    env.callMethod(matcher, "matches", IsArray.class, array.arrayGet(env, k)))) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "actual")
    @ConvertedParameter(index = 1, name = "mismatchDescription", typeHint = "Hamcrest\\Description")
    protected Object describeMismatchSafely(RuntimeEnv env, Object... args) {
        ReferenceContainer actual = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object mismatchDescription = assignParameter(args, 1, false);
        Object k = null;
        Object matcher = null;
        if (ZVal.notEqualityCheck(
                function_count.f.env(env).call(actual.getObject()).value(),
                function_count.f.env(env).call(this._elementMatchers).value())) {
            env.callMethod(
                    mismatchDescription,
                    "appendText",
                    IsArray.class,
                    "array length was "
                            + toStringR(
                                    function_count.f.env(env).call(actual.getObject()).value(),
                                    env));
            return null;

        } else if (ZVal.notEqualityCheck(
                function_array_keys.f.env(env).call(actual.getObject()).value(),
                function_array_keys.f.env(env).call(this._elementMatchers).value())) {
            env.callMethod(
                    env.callMethod(
                            mismatchDescription, "appendText", IsArray.class, "array keys were "),
                    "appendValueList",
                    IsArray.class,
                    this.descriptionStart(env),
                    this.descriptionSeparator(env),
                    this.descriptionEnd(env),
                    function_array_keys.f.env(env).call(actual.getObject()).value());
            return null;
        }

        for (ZPair zpairResult154 : ZVal.getIterable(this._elementMatchers, env, false)) {
            k = ZVal.assign(zpairResult154.getKey());
            matcher = ZVal.assign(zpairResult154.getValue());
            if (!ZVal.isTrue(
                    env.callMethod(matcher, "matches", IsArray.class, actual.arrayGet(env, k)))) {
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                mismatchDescription,
                                                "appendText",
                                                IsArray.class,
                                                "element "),
                                        "appendValue",
                                        IsArray.class,
                                        k),
                                "appendText",
                                IsArray.class,
                                " was "),
                        "appendValue",
                        IsArray.class,
                        actual.arrayGet(env, k));
                return null;
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "description", typeHint = "Hamcrest\\Description")
    public Object describeTo(RuntimeEnv env, Object... args) {
        Object description = assignParameter(args, 0, false);
        env.callMethod(
                description,
                "appendList",
                IsArray.class,
                this.descriptionStart(env),
                this.descriptionSeparator(env),
                this.descriptionEnd(env),
                this._elementMatchers);
        return null;
    }

    @ConvertedMethod
    protected Object descriptionStart(RuntimeEnv env, Object... args) {
        return "[";
    }

    @ConvertedMethod
    protected Object descriptionSeparator(RuntimeEnv env, Object... args) {
        return ", ";
    }

    @ConvertedMethod
    protected Object descriptionEnd(RuntimeEnv env, Object... args) {
        return "]";
    }

    public static final Object CONST_class = "Hamcrest\\Arrays\\IsArray";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends TypeSafeMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object anArray(RuntimeEnv env, Object... args) {
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
                            .IsArray(
                            env, Util.runtimeStaticObject.createMatcherArray(env, ___args)));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Arrays\\IsArray")
                    .setLookup(
                            IsArray.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_elementMatchers", "_expectedSubtype", "_expectedType")
                    .setFilename(
                            "vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Arrays/IsArray.php")
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
