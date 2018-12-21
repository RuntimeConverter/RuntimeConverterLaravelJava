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
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Number/OrderingComparison.php

*/

public class OrderingComparison extends TypeSafeMatcher {

    public Object _value = null;

    public Object _minCompare = null;

    public Object _maxCompare = null;

    public OrderingComparison(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == OrderingComparison.class) {
            this.__construct(env, args);
        }
    }

    public OrderingComparison(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(index = 1, name = "minCompare")
    @ConvertedParameter(index = 2, name = "maxCompare")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object minCompare = assignParameter(args, 1, false);
        Object maxCompare = assignParameter(args, 2, false);
        super.__construct(env, CONST_TYPE_NUMERIC);
        this._value = value;
        this._minCompare = minCompare;
        this._maxCompare = maxCompare;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object matchesSafely(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, false);
        Object compare = null;
        compare = this._compare(env, this._value, other);
        return ZVal.assign(
                ZVal.toBool(ZVal.isLessThanOrEqualTo(this._minCompare, "<=", compare))
                        && ZVal.toBool(ZVal.isLessThanOrEqualTo(compare, "<=", this._maxCompare)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    @ConvertedParameter(index = 1, name = "mismatchDescription", typeHint = "Hamcrest\\Description")
    protected Object describeMismatchSafely(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        Object mismatchDescription = assignParameter(args, 1, false);
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                mismatchDescription,
                                                "appendValue",
                                                OrderingComparison.class,
                                                item),
                                        "appendText",
                                        OrderingComparison.class,
                                        " was "),
                                "appendText",
                                OrderingComparison.class,
                                this._comparison(env, this._compare(env, this._value, item))),
                        "appendText",
                        OrderingComparison.class,
                        " "),
                "appendValue",
                OrderingComparison.class,
                this._value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "description", typeHint = "Hamcrest\\Description")
    public Object describeTo(RuntimeEnv env, Object... args) {
        Object description = assignParameter(args, 0, false);
        env.callMethod(
                env.callMethod(description, "appendText", OrderingComparison.class, "a value "),
                "appendText",
                OrderingComparison.class,
                this._comparison(env, this._minCompare));
        if (ZVal.notEqualityCheck(this._minCompare, this._maxCompare)) {
            env.callMethod(
                    env.callMethod(description, "appendText", OrderingComparison.class, " or "),
                    "appendText",
                    OrderingComparison.class,
                    this._comparison(env, this._maxCompare));
        }

        env.callMethod(
                env.callMethod(description, "appendText", OrderingComparison.class, " "),
                "appendValue",
                OrderingComparison.class,
                this._value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "left")
    @ConvertedParameter(index = 1, name = "right")
    private Object _compare(RuntimeEnv env, Object... args) {
        Object left = assignParameter(args, 0, false);
        Object right = assignParameter(args, 1, false);
        Object a = null;
        Object b = null;
        a = ZVal.assign(left);
        b = ZVal.assign(right);
        if (ZVal.isLessThan(a, '<', b)) {
            return -1;

        } else if (ZVal.equalityCheck(a, b)) {
            return 0;

        } else {
            return 1;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "compare")
    private Object _comparison(RuntimeEnv env, Object... args) {
        Object compare = assignParameter(args, 0, false);
        if (ZVal.isGreaterThan(compare, '>', 0)) {
            return "less than";

        } else if (ZVal.equalityCheck(compare, 0)) {
            return "equal to";

        } else {
            return "greater than";
        }
    }

    public static final Object CONST_class = "Hamcrest\\Number\\OrderingComparison";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends TypeSafeMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object comparesEqualTo(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Hamcrest
                            .namespaces
                            .Number
                            .classes
                            .OrderingComparison(env, value, 0, 0));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object greaterThan(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Hamcrest
                            .namespaces
                            .Number
                            .classes
                            .OrderingComparison(env, value, -1, -1));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object greaterThanOrEqualTo(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Hamcrest
                            .namespaces
                            .Number
                            .classes
                            .OrderingComparison(env, value, -1, 0));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object lessThan(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Hamcrest
                            .namespaces
                            .Number
                            .classes
                            .OrderingComparison(env, value, 1, 1));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object lessThanOrEqualTo(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Hamcrest
                            .namespaces
                            .Number
                            .classes
                            .OrderingComparison(env, value, 0, 1));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Number\\OrderingComparison")
                    .setLookup(
                            OrderingComparison.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "_expectedSubtype",
                            "_expectedType",
                            "_maxCompare",
                            "_minCompare",
                            "_value")
                    .setFilename(
                            "vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Number/OrderingComparison.php")
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
