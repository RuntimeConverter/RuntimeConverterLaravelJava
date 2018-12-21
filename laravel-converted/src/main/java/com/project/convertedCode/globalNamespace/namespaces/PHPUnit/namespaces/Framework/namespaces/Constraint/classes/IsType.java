package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_scalar;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_float;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/IsType.php

*/

public class IsType extends Constraint {

    public Object type = null;

    public IsType(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IsType.class) {
            this.__construct(env, args);
        }
    }

    public IsType(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        super.__construct(env);
        if (!arrayActionR(ArrayAction.ISSET, CONST_KNOWN_TYPES, env, type)) {
            throw ZVal.getException(
                    env,
                    new Exception(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Type specified for PHPUnit\\Framework\\Constraint\\IsType <%s> "
                                                    + "is not a valid type.",
                                            type)
                                    .value()));
        }

        this.type = type;
        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_sprintf.f.env(env).call("is of type \"%s\"", this.type).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object matches(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, false);
        switch (toStringR(this.type)) {
            case "numeric":
                return ZVal.assign(function_is_numeric.f.env(env).call(other).value());
            case "integer":
            case "int":
                return ZVal.assign(function_is_int.f.env(env).call(other).value());
            case "double":
            case "float":
            case "real":
                return ZVal.assign(function_is_float.f.env(env).call(other).value());
            case "string":
                return ZVal.assign(function_is_string.f.env(env).call(other).value());
            case "boolean":
            case "bool":
                return ZVal.assign(function_is_bool.f.env(env).call(other).value());
            case "null":
                return ZVal.assign(ZVal.strictEqualityCheck(ZVal.getNull(), "===", other));
            case "array":
                return ZVal.assign(function_is_array.f.env(env).call(other).value());
            case "object":
                return ZVal.assign(function_is_object.f.env(env).call(other).value());
            case "resource":
                return ZVal.assign(
                        ZVal.toBool(function_is_resource.f.env(env).call(other).value())
                                || ZVal.toBool(
                                        function_is_string
                                                .f
                                                .env(env)
                                                .call(
                                                        NamespaceGlobal.get_resource_type
                                                                .env(env)
                                                                .call(other)
                                                                .value())
                                                .value()));
            case "scalar":
                return ZVal.assign(function_is_scalar.f.env(env).call(other).value());
            case "callable":
                return ZVal.assign(function_is_callable.f.env(env).call(other).value());
            case "iterable":
                return ZVal.assign(NamespaceGlobal.is_iterable.env(env).call(other).value());
        }
        ;
        return null;
    }

    public static final Object CONST_TYPE_ARRAY = "array";

    public static final Object CONST_TYPE_BOOL = "bool";

    public static final Object CONST_TYPE_FLOAT = "float";

    public static final Object CONST_TYPE_INT = "int";

    public static final Object CONST_TYPE_NULL = "null";

    public static final Object CONST_TYPE_NUMERIC = "numeric";

    public static final Object CONST_TYPE_OBJECT = "object";

    public static final Object CONST_TYPE_RESOURCE = "resource";

    public static final Object CONST_TYPE_STRING = "string";

    public static final Object CONST_TYPE_SCALAR = "scalar";

    public static final Object CONST_TYPE_CALLABLE = "callable";

    public static final Object CONST_TYPE_ITERABLE = "iterable";

    public static final Object CONST_KNOWN_TYPES =
            ZVal.newArray(
                    new ZPair("array", true),
                    new ZPair("boolean", true),
                    new ZPair("bool", true),
                    new ZPair("double", true),
                    new ZPair("float", true),
                    new ZPair("integer", true),
                    new ZPair("int", true),
                    new ZPair("null", true),
                    new ZPair("numeric", true),
                    new ZPair("object", true),
                    new ZPair("real", true),
                    new ZPair("resource", true),
                    new ZPair("string", true),
                    new ZPair("scalar", true),
                    new ZPair("callable", true),
                    new ZPair("iterable", true));

    public static final Object CONST_class = "PHPUnit\\Framework\\Constraint\\IsType";

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
                    .setName("PHPUnit\\Framework\\Constraint\\IsType")
                    .setLookup(
                            IsType.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("exporter", "type")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/Constraint/IsType.php")
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
