package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.ExpectationFailedException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/Composite.php

*/

public abstract class Composite extends Constraint {

    public Object innerConstraint = null;

    public Composite(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Composite.class) {
            this.__construct(env, args);
        }
    }

    public Composite(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "innerConstraint",
        typeHint = "PHPUnit\\Framework\\Constraint\\Constraint"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object innerConstraint = assignParameter(args, 0, false);
        super.__construct(env);
        this.innerConstraint = innerConstraint;
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
        Object e = null;
        try {
            return ZVal.assign(
                    env.callMethod(
                            this.innerConstraint,
                            "evaluate",
                            Composite.class,
                            other,
                            description,
                            returnResult));
        } catch (ConvertedException convertedException125) {
            if (convertedException125.instanceOf(
                    ExpectationFailedException.class,
                    "PHPUnit\\Framework\\ExpectationFailedException")) {
                e = convertedException125.getObject();
                env.callMethod(
                        this,
                        "fail",
                        Composite.class,
                        other,
                        description,
                        env.callMethod(e, "getComparisonFailure", Composite.class));
            } else {
                throw convertedException125;
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_count.f.env(env).call(this.innerConstraint).value());
    }

    @ConvertedMethod
    protected Object innerConstraint(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.innerConstraint);
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Constraint\\Composite";

    @ConvertedMethod()
    public abstract Object toString(RuntimeEnv env, Object... args);

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
                    .setName("PHPUnit\\Framework\\Constraint\\Composite")
                    .setLookup(
                            Composite.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("exporter", "innerConstraint")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/Constraint/Composite.php")
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
