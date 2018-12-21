package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_replace_recursive;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeClasses.spl.misc.ArrayObject;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ComparisonFailure;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeInterfaces.Traversable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/ArraySubset.php

*/

public class ArraySubset extends Constraint {

    public Object subset = null;

    public Object checkForObjectIdentity = null;

    public ArraySubset(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ArraySubset.class) {
            this.__construct(env, args);
        }
    }

    public ArraySubset(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "subset", typeHint = "iterable")
    @ConvertedParameter(
        index = 1,
        name = "checkForObjectIdentity",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object subset = assignParameter(args, 0, false);
        Object checkForObjectIdentity = assignParameter(args, 1, true);
        if (null == checkForObjectIdentity) {
            checkForObjectIdentity = false;
        }
        super.__construct(env);
        this.checkForObjectIdentity = checkForObjectIdentity;
        this.subset = subset;
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
        Object result = null;
        Object patched = null;
        Object f = null;
        other = this.toArray(env, other);
        this.subset = this.toArray(env, this.subset);
        patched = function_array_replace_recursive.f.env(env).call(other, this.subset).value();
        if (ZVal.isTrue(this.checkForObjectIdentity)) {
            result = ZVal.strictEqualityCheck(other, "===", patched);

        } else {
            result = ZVal.equalityCheck(other, patched);
        }

        if (ZVal.isTrue(returnResult)) {
            return ZVal.assign(result);
        }

        if (!ZVal.isTrue(result)) {
            f =
                    new ComparisonFailure(
                            env,
                            patched,
                            other,
                            NamespaceGlobal.print_r.env(env).call(patched, true).value(),
                            NamespaceGlobal.print_r.env(env).call(other, true).value());
            env.callMethod(this, "fail", ArraySubset.class, other, description, f);
        }

        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                "has the subset "
                        + toStringR(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("exporter")
                                                .value(),
                                        "export",
                                        ArraySubset.class,
                                        this.subset),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object failureDescription(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, false);
        return ZVal.assign("an array " + toStringR(this.toString(env), env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other", typeHint = "iterable")
    private Object toArray(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, false);
        if (function_is_array.f.env(env).call(other).getBool()) {
            return ZVal.assign(other);
        }

        if (ZVal.isTrue(ZVal.checkInstanceType(other, ArrayObject.class, "ArrayObject"))) {
            return ZVal.assign(env.callMethod(other, "getArrayCopy", ArraySubset.class));
        }

        if (ZVal.isTrue(ZVal.checkInstanceType(other, Traversable.class, "Traversable"))) {
            return ZVal.assign(NamespaceGlobal.iterator_to_array.env(env).call(other).value());
        }

        return ZVal.assign(rToArrayCast(other));
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Constraint\\ArraySubset";

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
                    .setName("PHPUnit\\Framework\\Constraint\\ArraySubset")
                    .setLookup(
                            ArraySubset.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("checkForObjectIdentity", "exporter", "subset")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/Constraint/ArraySubset.php")
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
