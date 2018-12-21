package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ComparisonFailure;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_float;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/IsIdentical.php

*/

public class IsIdentical extends Constraint {

    public Object value = null;

    public IsIdentical(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IsIdentical.class) {
            this.__construct(env, args);
        }
    }

    public IsIdentical(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        super.__construct(env);
        this.value = value;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    @ConvertedParameter(index = 1, name = "description")
    @ConvertedParameter(
        index = 2,
        name = "returnResult",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object evaluate(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, false);
        Object description = assignParameter(args, 1, true);
        if (null == description) {
            description = "";
        }
        Object returnResult = assignParameter(args, 2, true);
        if (null == returnResult) {
            returnResult = false;
        }
        Object success = null;
        Object f = null;
        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.toBool(
                                                                        ZVal.toBool(
                                                                                        function_is_float
                                                                                                .f
                                                                                                .env(
                                                                                                        env)
                                                                                                .call(
                                                                                                        this
                                                                                                                .value)
                                                                                                .value())
                                                                                && ZVal.toBool(
                                                                                        function_is_float
                                                                                                .f
                                                                                                .env(
                                                                                                        env)
                                                                                                .call(
                                                                                                        other)
                                                                                                .value()))
                                                                && ZVal.toBool(
                                                                        !NamespaceGlobal.is_infinite
                                                                                .env(env)
                                                                                .call(this.value)
                                                                                .getBool()))
                                                && ZVal.toBool(
                                                        !NamespaceGlobal.is_infinite
                                                                .env(env)
                                                                .call(other)
                                                                .getBool()))
                                && ZVal.toBool(
                                        !NamespaceGlobal.is_nan
                                                .env(env)
                                                .call(this.value)
                                                .getBool()))
                && ZVal.toBool(!NamespaceGlobal.is_nan.env(env).call(other).getBool())) {
            success =
                    ZVal.isLessThan(
                            NamespaceGlobal.abs
                                    .env(env)
                                    .call(ZVal.subtract(this.value, other))
                                    .value(),
                            '<',
                            CONST_EPSILON);

        } else {
            success = ZVal.strictEqualityCheck(this.value, "===", other);
        }

        if (ZVal.isTrue(returnResult)) {
            return ZVal.assign(success);
        }

        if (!ZVal.isTrue(success)) {
            f = ZVal.getNull();
            if (ZVal.toBool(function_is_string.f.env(env).call(this.value).value())
                    && ZVal.toBool(function_is_string.f.env(env).call(other).value())) {
                f =
                        new ComparisonFailure(
                                env,
                                this.value,
                                other,
                                function_sprintf.f.env(env).call("'%s'", this.value).value(),
                                function_sprintf.f.env(env).call("'%s'", other).value());
            }

            if (ZVal.toBool(function_is_array.f.env(env).call(this.value).value())
                    && ZVal.toBool(function_is_array.f.env(env).call(other).value())) {
                f =
                        new ComparisonFailure(
                                env,
                                this.value,
                                other,
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("exporter")
                                                .value(),
                                        "export",
                                        IsIdentical.class,
                                        this.value),
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("exporter")
                                                .value(),
                                        "export",
                                        IsIdentical.class,
                                        other));
            }

            env.callMethod(this, "fail", IsIdentical.class, other, description, f);
        }

        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        if (function_is_object.f.env(env).call(this.value).getBool()) {
            return ZVal.assign(
                    "is identical to an object of class \""
                            + toStringR(function_get_class.f.env(env).call(this.value).value(), env)
                            + "\"");
        }

        return ZVal.assign(
                "is identical to "
                        + toStringR(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("exporter")
                                                .value(),
                                        "export",
                                        IsIdentical.class,
                                        this.value),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object failureDescription(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, false);
        if (ZVal.toBool(function_is_object.f.env(env).call(this.value).value())
                && ZVal.toBool(function_is_object.f.env(env).call(other).value())) {
            return "two variables reference the same object";
        }

        if (ZVal.toBool(function_is_string.f.env(env).call(this.value).value())
                && ZVal.toBool(function_is_string.f.env(env).call(other).value())) {
            return "two strings are identical";
        }

        if (ZVal.toBool(function_is_array.f.env(env).call(this.value).value())
                && ZVal.toBool(function_is_array.f.env(env).call(other).value())) {
            return "two arrays are identical";
        }

        return ZVal.assign(super.failureDescription(env, other));
    }

    public static final Object CONST_EPSILON = 1.0E-10;

    public static final Object CONST_class = "PHPUnit\\Framework\\Constraint\\IsIdentical";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Constraint.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Constraint\\IsIdentical")
                    .setLookup(
                            IsIdentical.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("exporter", "value")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/Constraint/IsIdentical.php")
                    .addInterface("Countable")
                    .addInterface("PHPUnit\\Framework\\SelfDescribing")
                    .addExtendsClass("PHPUnit\\Framework\\Constraint\\Constraint")
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
