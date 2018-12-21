package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.ExpectationFailedException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.Factory;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ComparisonFailure;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/IsEqual.php

*/

public class IsEqual extends Constraint {

    public Object value = null;

    public Object delta = null;

    public Object maxDepth = null;

    public Object canonicalize = null;

    public Object ignoreCase = null;

    public IsEqual(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IsEqual.class) {
            this.__construct(env, args);
        }
    }

    public IsEqual(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(
        index = 1,
        name = "delta",
        typeHint = "float",
        defaultValue = "0.0",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 2,
        name = "maxDepth",
        typeHint = "int",
        defaultValue = "10",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 3,
        name = "canonicalize",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "ignoreCase",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object delta = assignParameter(args, 1, true);
        if (null == delta) {
            delta = 0.0;
        }
        Object maxDepth = assignParameter(args, 2, true);
        if (null == maxDepth) {
            maxDepth = 10;
        }
        Object canonicalize = assignParameter(args, 3, true);
        if (null == canonicalize) {
            canonicalize = false;
        }
        Object ignoreCase = assignParameter(args, 4, true);
        if (null == ignoreCase) {
            ignoreCase = false;
        }
        super.__construct(env);
        this.value = value;
        this.delta = delta;
        this.maxDepth = maxDepth;
        this.canonicalize = canonicalize;
        this.ignoreCase = ignoreCase;
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
        Object comparator = null;
        Object f = null;
        Object comparatorFactory = null;
        if (ZVal.strictEqualityCheck(this.value, "===", other)) {
            return ZVal.assign(true);
        }

        comparatorFactory = Factory.runtimeStaticObject.getInstance(env);
        try {
            comparator =
                    env.callMethod(
                            comparatorFactory,
                            "getComparatorFor",
                            IsEqual.class,
                            this.value,
                            other);
            env.callMethod(
                    comparator,
                    "assertEquals",
                    IsEqual.class,
                    this.value,
                    other,
                    this.delta,
                    this.canonicalize,
                    this.ignoreCase);
        } catch (ConvertedException convertedException126) {
            if (convertedException126.instanceOf(
                    ComparisonFailure.class, "SebastianBergmann\\Comparator\\ComparisonFailure")) {
                f = convertedException126.getObject();
                if (ZVal.isTrue(returnResult)) {
                    return ZVal.assign(false);
                }

                throw ZVal.getException(
                        env,
                        new ExpectationFailedException(
                                env,
                                function_trim
                                        .f
                                        .env(env)
                                        .call(
                                                toStringR(description, env)
                                                        + "\n"
                                                        + toStringR(
                                                                env.callMethod(
                                                                        f,
                                                                        "getMessage",
                                                                        IsEqual.class),
                                                                env))
                                        .value(),
                                f));
            } else {
                throw convertedException126;
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        Object delta = null;
        delta = "";
        if (function_is_string.f.env(env).call(this.value).getBool()) {
            if (ZVal.strictNotEqualityCheck(
                    function_strpos.f.env(env).call(this.value, "\n").value(), "!==", false)) {
                return "is equal to <text>";
            }

            return ZVal.assign(
                    function_sprintf.f.env(env).call("is equal to \"%s\"", this.value).value());
        }

        if (ZVal.notEqualityCheck(this.delta, 0)) {
            delta = function_sprintf.f.env(env).call(" with delta <%F>", this.delta).value();
        }

        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "is equal to %s%s",
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("exporter")
                                                .value(),
                                        "export",
                                        IsEqual.class,
                                        this.value),
                                delta)
                        .value());
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Constraint\\IsEqual";

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
                    .setName("PHPUnit\\Framework\\Constraint\\IsEqual")
                    .setLookup(
                            IsEqual.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "canonicalize", "delta", "exporter", "ignoreCase", "maxDepth", "value")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/Constraint/IsEqual.php")
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
