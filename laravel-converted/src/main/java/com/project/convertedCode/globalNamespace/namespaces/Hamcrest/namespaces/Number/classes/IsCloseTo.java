package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Number.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.TypeSafeMatcher;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Number/IsCloseTo.php

*/

public class IsCloseTo extends TypeSafeMatcher {

    public Object _value = null;

    public Object _delta = null;

    public IsCloseTo(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IsCloseTo.class) {
            this.__construct(env, args);
        }
    }

    public IsCloseTo(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(index = 1, name = "delta")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object delta = assignParameter(args, 1, false);
        super.__construct(env, CONST_TYPE_NUMERIC);
        this._value = value;
        this._delta = delta;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    protected Object matchesSafely(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        return ZVal.assign(ZVal.isLessThanOrEqualTo(this._actualDelta(env, item), "<=", 0.0));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    @ConvertedParameter(index = 1, name = "mismatchDescription", typeHint = "Hamcrest\\Description")
    protected Object describeMismatchSafely(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        Object mismatchDescription = assignParameter(args, 1, false);
        env.callMethod(
                env.callMethod(
                        env.callMethod(mismatchDescription, "appendValue", IsCloseTo.class, item),
                        "appendText",
                        IsCloseTo.class,
                        " differed by "),
                "appendValue",
                IsCloseTo.class,
                this._actualDelta(env, item));
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
                                        description,
                                        "appendText",
                                        IsCloseTo.class,
                                        "a numeric value within "),
                                "appendValue",
                                IsCloseTo.class,
                                this._delta),
                        "appendText",
                        IsCloseTo.class,
                        " of "),
                "appendValue",
                IsCloseTo.class,
                this._value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    private Object _actualDelta(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.subtract(
                        NamespaceGlobal.abs.env(env).call(ZVal.subtract(item, this._value)).value(),
                        this._delta));
    }

    public static final Object CONST_class = "Hamcrest\\Number\\IsCloseTo";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends TypeSafeMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "delta")
        public Object closeTo(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object delta = assignParameter(args, 1, false);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Hamcrest
                            .namespaces
                            .Number
                            .classes
                            .IsCloseTo(env, value, delta));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Number\\IsCloseTo")
                    .setLookup(
                            IsCloseTo.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_delta", "_expectedSubtype", "_expectedType", "_value")
                    .setFilename(
                            "vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Number/IsCloseTo.php")
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
