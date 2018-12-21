package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/ClassHasAttribute.php

*/

public class ClassHasAttribute extends Constraint {

    public Object attributeName = null;

    public ClassHasAttribute(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ClassHasAttribute.class) {
            this.__construct(env, args);
        }
    }

    public ClassHasAttribute(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributeName", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object attributeName = assignParameter(args, 0, false);
        super.__construct(env);
        this.attributeName = attributeName;
        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call("has attribute \"%s\"", this.attributeName)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object matches(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, false);
        Object _pClass = null;
        _pClass = new ReflectionClass(env, other);
        return ZVal.assign(
                env.callMethod(
                        _pClass, "hasProperty", ClassHasAttribute.class, this.attributeName));
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
                                "%sclass \"%s\" %s",
                                function_is_object.f.env(env).call(other).getBool()
                                        ? "object of "
                                        : "",
                                function_is_object.f.env(env).call(other).getBool()
                                        ? function_get_class.f.env(env).call(other).value()
                                        : other,
                                this.toString(env))
                        .value());
    }

    @ConvertedMethod
    protected Object attributeName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.attributeName);
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Constraint\\ClassHasAttribute";

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
                    .setName("PHPUnit\\Framework\\Constraint\\ClassHasAttribute")
                    .setLookup(
                            ClassHasAttribute.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributeName", "exporter")
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/Constraint/ClassHasAttribute.php")
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
