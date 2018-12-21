package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.datastructures.SplObjectStorage;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/TraversableContains.php

*/

public class TraversableContains extends Constraint {

    public Object checkForObjectIdentity = null;

    public Object checkForNonObjectIdentity = null;

    public Object value = null;

    public TraversableContains(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TraversableContains.class) {
            this.__construct(env, args);
        }
    }

    public TraversableContains(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(
        index = 1,
        name = "checkForObjectIdentity",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "checkForNonObjectIdentity",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object checkForObjectIdentity = assignParameter(args, 1, true);
        if (null == checkForObjectIdentity) {
            checkForObjectIdentity = true;
        }
        Object checkForNonObjectIdentity = assignParameter(args, 2, true);
        if (null == checkForNonObjectIdentity) {
            checkForNonObjectIdentity = false;
        }
        super.__construct(env);
        this.checkForObjectIdentity = checkForObjectIdentity;
        this.checkForNonObjectIdentity = checkForNonObjectIdentity;
        this.value = value;
        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        if (ZVal.toBool(function_is_string.f.env(env).call(this.value).value())
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                function_strpos.f.env(env).call(this.value, "\n").value(),
                                "!==",
                                false))) {
            return ZVal.assign("contains \"" + toStringR(this.value, env) + "\"");
        }

        return ZVal.assign(
                "contains "
                        + toStringR(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("exporter")
                                                .value(),
                                        "export",
                                        TraversableContains.class,
                                        this.value),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object matches(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, false);
        Object element = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(other, SplObjectStorage.class, "SplObjectStorage"))) {
            return ZVal.assign(
                    env.callMethod(
                            other,
                            new RuntimeArgsWithReferences()
                                    .add(0, new ReferenceClassProperty(this, "value", env)),
                            "contains",
                            TraversableContains.class,
                            this.value));
        }

        if (function_is_object.f.env(env).call(this.value).getBool()) {
            for (ZPair zpairResult1135 : ZVal.getIterable(other, env, true)) {
                element = ZVal.assign(zpairResult1135.getValue());
                if (ZVal.toBool(this.checkForObjectIdentity)
                        && ZVal.toBool(ZVal.strictEqualityCheck(element, "===", this.value))) {
                    return ZVal.assign(true);
                }

                if (ZVal.toBool(!ZVal.isTrue(this.checkForObjectIdentity))
                        && ZVal.toBool(ZVal.equalityCheck(element, this.value))) {
                    return ZVal.assign(true);
                }
            }

        } else {
            for (ZPair zpairResult1136 : ZVal.getIterable(other, env, true)) {
                element = ZVal.assign(zpairResult1136.getValue());
                if (ZVal.toBool(this.checkForNonObjectIdentity)
                        && ZVal.toBool(ZVal.strictEqualityCheck(element, "===", this.value))) {
                    return ZVal.assign(true);
                }

                if (ZVal.toBool(!ZVal.isTrue(this.checkForNonObjectIdentity))
                        && ZVal.toBool(ZVal.equalityCheck(element, this.value))) {
                    return ZVal.assign(true);
                }
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object failureDescription(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, false);
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%s %s",
                                function_is_array.f.env(env).call(other).getBool()
                                        ? "an array"
                                        : "a traversable",
                                this.toString(env))
                        .value());
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Constraint\\TraversableContains";

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
                    .setName("PHPUnit\\Framework\\Constraint\\TraversableContains")
                    .setLookup(
                            TraversableContains.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "checkForNonObjectIdentity",
                            "checkForObjectIdentity",
                            "exporter",
                            "value")
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/Constraint/TraversableContains.php")
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
