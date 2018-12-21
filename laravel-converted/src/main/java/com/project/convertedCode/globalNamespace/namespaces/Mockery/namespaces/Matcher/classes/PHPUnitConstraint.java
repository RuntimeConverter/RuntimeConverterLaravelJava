package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.exceptions.missingDefinitions.ClassNotFoundDuringConversion;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes.MatcherAbstract;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import java.lang.Class;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.AssertionFailedError;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Matcher/PHPUnitConstraint.php

*/

public class PHPUnitConstraint extends MatcherAbstract {

    public Object constraint = null;

    public Object rethrow = null;

    public PHPUnitConstraint(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PHPUnitConstraint.class) {
            this.__construct(env, args);
        }
    }

    public PHPUnitConstraint(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "constraint")
    @ConvertedParameter(
        index = 1,
        name = "rethrow",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object constraint = assignParameter(args, 0, false);
        Object rethrow = assignParameter(args, 1, true);
        if (null == rethrow) {
            rethrow = false;
        }
        if (ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        constraint,
                                        (Class) null,
                                        "PHPUnit_Framework_Constraint",
                                        env)))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        constraint,
                                        (Class) null,
                                        "PHPUnit\\Framework\\Constraint",
                                        env)))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Constraint must be one of \\PHPUnit\\Framework\\Constraint or "
                                    + "\\PHPUnit_Framework_Constraint"));
        }

        this.constraint = constraint;
        this.rethrow = rethrow;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "actual")
    public Object match(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer actual = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        Object e = null;
        try {
            env.callMethod(
                    this.constraint, "evaluate", PHPUnitConstraint.class, actual.getObject());
            return ZVal.assign(true);
        } catch (ConvertedException convertedException85) {
            if (ClassNotFoundDuringConversion.missingClassInCatchBlock(
                    "PHPUnit_Framework_AssertionFailedError")) {
                e = convertedException85.getObject();
                if (ZVal.isTrue(this.rethrow)) {
                    throw ZVal.getException(env, e);
                }

                return ZVal.assign(false);
            } else if (convertedException85.instanceOf(
                    AssertionFailedError.class, "PHPUnit\\Framework\\AssertionFailedError")) {
                e = convertedException85.getObject();
                if (ZVal.isTrue(this.rethrow)) {
                    throw ZVal.getException(env, e);
                }

                return ZVal.assign(false);
            } else {
                throw convertedException85;
            }
        }
    }

    public Object match(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return "<Constraint>";
    }

    public static final Object CONST_class = "Mockery\\Matcher\\PHPUnitConstraint";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends MatcherAbstract.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Mockery\\Matcher\\PHPUnitConstraint")
                    .setLookup(
                            PHPUnitConstraint.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_expected", "constraint", "rethrow")
                    .setFilename(
                            "vendor/mockery/mockery/library/Mockery/Matcher/PHPUnitConstraint.php")
                    .addExtendsClass("Mockery\\Matcher\\MatcherAbstract")
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
