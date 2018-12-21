package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Testing.namespaces.Constraints.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Testing/Constraints/SeeInOrder.php

*/

public class SeeInOrder extends Constraint {

    public Object content = null;

    public Object failedValue = null;

    public SeeInOrder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SeeInOrder.class) {
            this.__construct(env, args);
        }
    }

    public SeeInOrder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, false);
        this.content = content;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values")
    public Object matches(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object values = assignParameter(args, 0, false);
        Object valuePosition = null;
        Object position = null;
        Object value = null;
        position = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult439 : ZVal.getIterable(values, env, true)) {
            value = ZVal.assign(zpairResult439.getValue());
            if (ZVal.isEmpty(value)) {
                continue;
            }

            valuePosition =
                    NamespaceGlobal.mb_strpos.env(env).call(this.content, value, position).value();
            if (ZVal.toBool(ZVal.strictEqualityCheck(valuePosition, "===", false))
                    || ZVal.toBool(ZVal.isLessThan(valuePosition, '<', position))) {
                this.failedValue = value;
                return ZVal.assign(false);
            }

            position =
                    ZVal.add(valuePosition, NamespaceGlobal.mb_strlen.env(env).call(value).value());
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values")
    public Object failureDescription(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, false);
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "Failed asserting that '%s' contains \"%s\" in specified order.",
                                this.content, this.failedValue)
                        .value());
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toObjectR(new ReflectionClass(env, this))
                        .accessProp(this, env)
                        .name("name")
                        .value());
    }

    public static final Object CONST_class =
            "Illuminate\\Foundation\\Testing\\Constraints\\SeeInOrder";

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
                    .setName("Illuminate\\Foundation\\Testing\\Constraints\\SeeInOrder")
                    .setLookup(
                            SeeInOrder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("content", "exporter", "failedValue")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Testing/Constraints/SeeInOrder.php")
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
