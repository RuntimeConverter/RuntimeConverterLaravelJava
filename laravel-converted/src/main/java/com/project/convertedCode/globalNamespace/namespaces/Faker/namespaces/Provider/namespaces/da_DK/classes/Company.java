package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.da_DK.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/da_DK/Company.php

*/

public class Company
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .Company {

    public Company(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Company.class) {
            this.__construct(env, args);
        }
    }

    public Company(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Faker\\Provider\\da_DK\\Company";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Faker
                    .namespaces
                    .Provider
                    .classes
                    .Company
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object cvr(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
                            .method("numerify")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Faker
                                                            .namespaces
                                                            .Provider
                                                            .namespaces
                                                            .da_DK
                                                            .classes
                                                            .Company
                                                            .RequestStaticProperties
                                                            .class)
                                            .cvrFormat)
                            .value());
        }

        @ConvertedMethod
        public Object p(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
                            .method("numerify")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Faker
                                                            .namespaces
                                                            .Provider
                                                            .namespaces
                                                            .da_DK
                                                            .classes
                                                            .Company
                                                            .RequestStaticProperties
                                                            .class)
                                            .pFormat)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object formats =
                ZVal.arrayFromList(
                        "{{lastName}} {{companySuffix}}",
                        "{{lastName}} {{companySuffix}}",
                        "{{lastName}} {{companySuffix}}",
                        "{{firstname}} {{lastName}} {{companySuffix}}",
                        "{{middleName}} {{companySuffix}}",
                        "{{middleName}} {{companySuffix}}",
                        "{{middleName}} {{companySuffix}}",
                        "{{firstname}} {{middleName}} {{companySuffix}}",
                        "{{lastName}} & {{lastName}} {{companySuffix}}",
                        "{{lastName}} og {{lastName}} {{companySuffix}}",
                        "{{lastName}} & {{lastName}} {{companySuffix}}",
                        "{{lastName}} og {{lastName}} {{companySuffix}}",
                        "{{middleName}} & {{middleName}} {{companySuffix}}",
                        "{{middleName}} og {{middleName}} {{companySuffix}}",
                        "{{middleName}} & {{lastName}}",
                        "{{middleName}} og {{lastName}}");

        public Object companySuffix = ZVal.arrayFromList("ApS", "A/S", "I/S", "K/S");

        public Object cvrFormat = "%#######";

        public Object pFormat = "%#########";
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\da_DK\\Company")
                    .setLookup(
                            Company.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("companySuffix", "cvrFormat", "formats", "pFormat")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/da_DK/Company.php")
                    .addExtendsClass("Faker\\Provider\\Company")
                    .addExtendsClass("Faker\\Provider\\Base")
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
