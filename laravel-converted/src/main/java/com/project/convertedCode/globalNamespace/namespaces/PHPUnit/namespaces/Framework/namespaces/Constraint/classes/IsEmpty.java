package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/IsEmpty.php

*/

public class IsEmpty extends Constraint {

    public IsEmpty(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IsEmpty.class) {
            this.__construct(env, args);
        }
    }

    public IsEmpty(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return "is empty";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object matches(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, false);
        if (ZVal.isTrue(ZVal.checkInstanceType(other, Countable.class, "Countable"))) {
            return ZVal.assign(
                    ZVal.strictEqualityCheck(
                            function_count.f.env(env).call(other).value(), "===", 0));
        }

        return ZVal.isEmpty(other);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object failureDescription(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, false);
        ReferenceContainer type = new BasicReferenceContainer(null);
        type.setObject(NamespaceGlobal.gettype.env(env).call(other).value());
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%s %s %s",
                                ZVal.toBool(ZVal.equalityCheck(type.arrayGet(env, 0), "a"))
                                                || ZVal.toBool(
                                                        ZVal.equalityCheck(
                                                                type.arrayGet(env, 0), "o"))
                                        ? "an"
                                        : "a",
                                type.getObject(),
                                this.toString(env))
                        .value());
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Constraint\\IsEmpty";

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
                    .setName("PHPUnit\\Framework\\Constraint\\IsEmpty")
                    .setLookup(
                            IsEmpty.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("exporter")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/Constraint/IsEmpty.php")
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
