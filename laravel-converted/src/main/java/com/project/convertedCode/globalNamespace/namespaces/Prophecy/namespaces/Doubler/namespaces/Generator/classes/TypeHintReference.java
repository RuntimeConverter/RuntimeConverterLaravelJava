package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.Generator.classes;

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

 vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/TypeHintReference.php

*/

public final class TypeHintReference extends RuntimeClassBase {

    public TypeHintReference(RuntimeEnv env, Object... args) {
        super(env);
    }

    public TypeHintReference(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    public Object isBuiltInParamTypeHint(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        SwitchEnumType53 switchVariable53 =
                ZVal.getEnum(
                        type,
                        SwitchEnumType53.DEFAULT_CASE,
                        SwitchEnumType53.STRING_self,
                        "self",
                        SwitchEnumType53.STRING_array,
                        "array",
                        SwitchEnumType53.STRING_callable,
                        "callable",
                        SwitchEnumType53.STRING_bool,
                        "bool",
                        SwitchEnumType53.STRING_float,
                        "float",
                        SwitchEnumType53.STRING_int,
                        "int",
                        SwitchEnumType53.STRING_string,
                        "string",
                        SwitchEnumType53.STRING_iterable,
                        "iterable",
                        SwitchEnumType53.STRING_object,
                        "object");
        switch (switchVariable53) {
            case STRING_self:
            case STRING_array:
                return ZVal.assign(true);
            case STRING_callable:
                return ZVal.assign(ZVal.isGreaterThanOrEqualTo(70211, ">=", 50400));
            case STRING_bool:
            case STRING_float:
            case STRING_int:
            case STRING_string:
                return ZVal.assign(ZVal.isGreaterThanOrEqualTo(70211, ">=", 70000));
            case STRING_iterable:
                return ZVal.assign(ZVal.isGreaterThanOrEqualTo(70211, ">=", 70100));
            case STRING_object:
                return ZVal.assign(ZVal.isGreaterThanOrEqualTo(70211, ">=", 70200));
            case DEFAULT_CASE:
                return ZVal.assign(false);
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    public Object isBuiltInReturnTypeHint(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        if (ZVal.strictEqualityCheck(type, "===", "void")) {
            return ZVal.assign(ZVal.isGreaterThanOrEqualTo(70211, ">=", 70100));
        }

        return ZVal.assign(this.isBuiltInParamTypeHint(env, type));
    }

    public static final Object CONST_class = "Prophecy\\Doubler\\Generator\\TypeHintReference";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Doubler\\Generator\\TypeHintReference")
                    .setLookup(
                            TypeHintReference.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Doubler/Generator/TypeHintReference.php")
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

    private enum SwitchEnumType53 {
        STRING_self,
        STRING_array,
        STRING_callable,
        STRING_bool,
        STRING_float,
        STRING_int,
        STRING_string,
        STRING_iterable,
        STRING_object,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
