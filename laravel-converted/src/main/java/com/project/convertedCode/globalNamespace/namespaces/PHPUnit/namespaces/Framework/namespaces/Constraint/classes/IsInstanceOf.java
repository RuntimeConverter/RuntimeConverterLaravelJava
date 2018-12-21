package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.nativeClasses.exceptions.ReflectionException;
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
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/IsInstanceOf.php

*/

public class IsInstanceOf extends Constraint {

    public Object className = null;

    public IsInstanceOf(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IsInstanceOf.class) {
            this.__construct(env, args);
        }
    }

    public IsInstanceOf(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, false);
        super.__construct(env);
        this.className = className;
        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call("is instance of %s \"%s\"", this.getType(env), this.className)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object matches(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, false);
        return ZVal.assign(ZVal.checkInstanceTypeMatch(other, this.className));
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
                                "%s is an instance of %s \"%s\"",
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("exporter")
                                                .value(),
                                        "shortenedExport",
                                        IsInstanceOf.class,
                                        other),
                                this.getType(env),
                                this.className)
                        .value());
    }

    @ConvertedMethod
    private Object getType(RuntimeEnv env, Object... args) {
        Object reflection = null;
        Object e = null;
        try {
            reflection = new ReflectionClass(env, this.className);
            if (ZVal.isTrue(env.callMethod(reflection, "isInterface", IsInstanceOf.class))) {
                return "interface";
            }

        } catch (ConvertedException convertedException127) {
            if (convertedException127.instanceOf(
                    ReflectionException.class, "ReflectionException")) {
                e = convertedException127.getObject();
            } else {
                throw convertedException127;
            }
        }

        return "class";
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Constraint\\IsInstanceOf";

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
                    .setName("PHPUnit\\Framework\\Constraint\\IsInstanceOf")
                    .setLookup(
                            IsInstanceOf.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("className", "exporter")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/Constraint/IsInstanceOf.php")
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
