package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.IsType;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.IsInstanceOf;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/TraversableContainsOnly.php

*/

public class TraversableContainsOnly extends Constraint {

    public Object constraint = null;

    public Object type = null;

    public TraversableContainsOnly(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TraversableContainsOnly.class) {
            this.__construct(env, args);
        }
    }

    public TraversableContainsOnly(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "isNativeType",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        Object isNativeType = assignParameter(args, 1, true);
        if (null == isNativeType) {
            isNativeType = true;
        }
        super.__construct(env);
        if (ZVal.isTrue(isNativeType)) {
            this.constraint = new IsType(env, type);

        } else {
            this.constraint = new IsInstanceOf(env, type);
        }

        this.type = type;
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
        Object item = null;
        Object success = null;
        success = true;
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1137 : ZVal.getIterable(other, env, true)) {
            item = ZVal.assign(zpairResult1137.getValue());
            if (!ZVal.isTrue(
                    env.callMethod(
                            this.constraint,
                            "evaluate",
                            TraversableContainsOnly.class,
                            item,
                            "",
                            true))) {
                success = false;
                break;
            }
        }

        if (ZVal.isTrue(returnResult)) {
            return ZVal.assign(success);
        }

        if (!ZVal.isTrue(success)) {
            env.callMethod(this, "fail", TraversableContainsOnly.class, other, description);
        }

        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign("contains only values of type \"" + toStringR(this.type, env) + "\"");
    }

    public static final Object CONST_class =
            "PHPUnit\\Framework\\Constraint\\TraversableContainsOnly";

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
                    .setName("PHPUnit\\Framework\\Constraint\\TraversableContainsOnly")
                    .setLookup(
                            TraversableContainsOnly.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("constraint", "exporter", "type")
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/Constraint/TraversableContainsOnly.php")
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
