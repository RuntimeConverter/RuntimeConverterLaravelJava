package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Type.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes.IsTypeOf;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Type/IsBoolean.php

*/

public class IsBoolean extends IsTypeOf {

    public IsBoolean(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IsBoolean.class) {
            this.__construct(env, args);
        }
    }

    public IsBoolean(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        super.__construct(env, "boolean");
        return null;
    }

    public static final Object CONST_class = "Hamcrest\\Type\\IsBoolean";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends IsTypeOf.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object booleanValue(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Hamcrest
                            .namespaces
                            .Type
                            .classes
                            .IsBoolean(env));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Type\\IsBoolean")
                    .setLookup(
                            IsBoolean.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_theType")
                    .setFilename(
                            "vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Type/IsBoolean.php")
                    .addInterface("Hamcrest\\Matcher")
                    .addInterface("Hamcrest\\SelfDescribing")
                    .addExtendsClass("Hamcrest\\Core\\IsTypeOf")
                    .addExtendsClass("Hamcrest\\BaseMatcher")
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
