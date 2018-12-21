package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZAssignment;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.IsEqual;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;
import static com.runtimeconverter.runtime.ZVal.assignParameterVarArgs;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/LogicalOr.php

*/

public class LogicalOr extends Constraint {

    public Object constraints = ZVal.newArray();

    public LogicalOr(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == LogicalOr.class) {
            this.__construct(env, args);
        }
    }

    public LogicalOr(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "constraints", typeHint = "array")
    public Object setConstraints(RuntimeEnv env, Object... args) {
        Object constraints = assignParameter(args, 0, false);
        Object constraint = null;
        this.constraints = ZVal.newArray();
        for (ZPair zpairResult1126 : ZVal.getIterable(constraints, env, true)) {
            constraint = ZVal.assign(zpairResult1126.getValue());
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            constraint,
                            Constraint.class,
                            "PHPUnit\\Framework\\Constraint\\Constraint"))) {
                constraint = new IsEqual(env, constraint);
            }

            new ReferenceClassProperty(this, "constraints", env).arrayAppend(env).set(constraint);
        }

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
        int runtimeConverterBreakCount;
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
        Object constraint = null;
        success = false;
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1127 : ZVal.getIterable(this.constraints, env, true)) {
            constraint = ZVal.assign(zpairResult1127.getValue());
            if (ZVal.isTrue(
                    env.callMethod(
                            constraint, "evaluate", LogicalOr.class, other, description, true))) {
                success = true;
                break;
            }
        }

        if (ZVal.isTrue(returnResult)) {
            return ZVal.assign(success);
        }

        if (!ZVal.isTrue(success)) {
            env.callMethod(this, "fail", LogicalOr.class, other, description);
        }

        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        Object constraint = null;
        Object text = null;
        Object key = null;
        text = "";
        for (ZPair zpairResult1128 : ZVal.getIterable(this.constraints, env, false)) {
            key = ZVal.assign(zpairResult1128.getKey());
            constraint = ZVal.assign(zpairResult1128.getValue());
            if (ZVal.isGreaterThan(key, '>', 0)) {
                text = toStringR(text, env) + " or ";
            }

            text =
                    toStringR(text, env)
                            + toStringR(
                                    env.callMethod(constraint, "toString", LogicalOr.class), env);
        }

        return ZVal.assign(text);
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        Object count = null;
        Object constraint = null;
        count = 0;
        for (ZPair zpairResult1129 : ZVal.getIterable(this.constraints, env, true)) {
            constraint = ZVal.assign(zpairResult1129.getValue());
            count =
                    ZAssignment.add(
                            "+=", count, function_count.f.env(env).call(constraint).value());
        }

        return ZVal.assign(count);
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Constraint\\LogicalOr";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Constraint.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "constraints",
            typeHint = "PHPUnit\\Framework\\Constraint\\Constraint"
        )
        public Object fromConstraints(RuntimeEnv env, Object... args) {
            Object constraints = assignParameterVarArgs(args, 0);
            Object constraint = null;
            constraint =
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .PHPUnit
                            .namespaces
                            .Framework
                            .namespaces
                            .Constraint
                            .classes
                            .LogicalOr(env);
            toObjectR(constraint)
                    .accessProp(this, env)
                    .name("constraints")
                    .set(function_array_values.f.env(env).call(constraints).value());
            return ZVal.assign(constraint);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Constraint\\LogicalOr")
                    .setLookup(
                            LogicalOr.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("constraints", "exporter")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/Constraint/LogicalOr.php")
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
