package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/Type.php

*/

public final class Type extends RuntimeClassBase {

    public Type(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Type(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "PHPUnit\\Util\\Type";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "type", typeHint = "string")
        public Object isType(RuntimeEnv env, Object... args) {
            Object type = assignParameter(args, 0, false);
            SwitchEnumType69 switchVariable69 =
                    ZVal.getEnum(
                            type,
                            SwitchEnumType69.DEFAULT_CASE,
                            SwitchEnumType69.STRING_numeric,
                            "numeric",
                            SwitchEnumType69.STRING_integer,
                            "integer",
                            SwitchEnumType69.STRING_int,
                            "int",
                            SwitchEnumType69.STRING_iterable,
                            "iterable",
                            SwitchEnumType69.STRING_float,
                            "float",
                            SwitchEnumType69.STRING_string,
                            "string",
                            SwitchEnumType69.STRING_boolean,
                            "boolean",
                            SwitchEnumType69.STRING_bool,
                            "bool",
                            SwitchEnumType69.STRING_null,
                            "null",
                            SwitchEnumType69.STRING_array,
                            "array",
                            SwitchEnumType69.STRING_object,
                            "object",
                            SwitchEnumType69.STRING_resource,
                            "resource",
                            SwitchEnumType69.STRING_scalar,
                            "scalar");
            switch (switchVariable69) {
                case STRING_numeric:
                case STRING_integer:
                case STRING_int:
                case STRING_iterable:
                case STRING_float:
                case STRING_string:
                case STRING_boolean:
                case STRING_bool:
                case STRING_null:
                case STRING_array:
                case STRING_object:
                case STRING_resource:
                case STRING_scalar:
                    return ZVal.assign(true);
                case DEFAULT_CASE:
                    return ZVal.assign(false);
            }
            ;
            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\Type")
                    .setLookup(
                            Type.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Util/Type.php")
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

    private enum SwitchEnumType69 {
        STRING_numeric,
        STRING_integer,
        STRING_int,
        STRING_iterable,
        STRING_float,
        STRING_string,
        STRING_boolean,
        STRING_bool,
        STRING_null,
        STRING_array,
        STRING_object,
        STRING_resource,
        STRING_scalar,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
