package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Type.classes;

import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_scalar;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes.IsTypeOf;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Type/IsScalar.php

*/

public class IsScalar extends IsTypeOf {

    public IsScalar(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IsScalar.class) {
            this.__construct(env, args);
        }
    }

    public IsScalar(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        super.__construct(env, "scalar");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    public Object matches(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        return ZVal.assign(function_is_scalar.f.env(env).call(item).value());
    }

    public static final Object CONST_class = "Hamcrest\\Type\\IsScalar";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends IsTypeOf.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object scalarValue(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Hamcrest
                            .namespaces
                            .Type
                            .classes
                            .IsScalar(env));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Type\\IsScalar")
                    .setLookup(
                            IsScalar.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_theType")
                    .setFilename("vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Type/IsScalar.php")
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
