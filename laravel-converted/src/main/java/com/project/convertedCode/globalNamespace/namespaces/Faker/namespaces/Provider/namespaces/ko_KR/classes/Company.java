package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.ko_KR.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/ko_KR/Company.php

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

    public static final Object CONST_class = "Faker\\Provider\\ko_KR\\Company";

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
        public Object companyPrefix(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
                            .method("randomElement")
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
                                                            .ko_KR
                                                            .classes
                                                            .Company
                                                            .RequestStaticProperties
                                                            .class)
                                            .companyPrefix)
                            .value());
        }

        @ConvertedMethod
        public Object companySuffix(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
                            .method("randomElement")
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
                                                            .ko_KR
                                                            .classes
                                                            .Company
                                                            .RequestStaticProperties
                                                            .class)
                                            .companySuffix)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object formats =
                ZVal.arrayFromList(
                        "{{companyPrefix}}{{firstName}}",
                        "{{companyPrefix}}{{firstName}}{{companySuffix}}",
                        "{{firstName}}{{companySuffix}}",
                        "{{firstName}}{{companySuffix}}",
                        "{{firstName}}{{companySuffix}}",
                        "{{firstName}}{{companySuffix}}");

        public Object companyPrefix =
                ZVal.arrayFromList("(\uC8FC)", "(\uC8FC)", "(\uC8FC)", "(\uC720)");

        public Object companySuffix =
                ZVal.arrayFromList(
                        "\uC804\uC790",
                        "\uAC74\uC124",
                        "\uC2DD\uD488",
                        "\uC778\uD130\uB137",
                        "\uADF8\uB8F9",
                        "\uC740\uD589",
                        "\uBCF4\uD5D8",
                        "\uC81C\uC57D",
                        "\uAE08\uC735",
                        "\uB124\uD2B8\uC6CD\uC2A4",
                        "\uAE30\uD68D",
                        "\uBBF8\uB514\uC5B4",
                        "\uC5F0\uAD6C\uC18C",
                        "\uBAA8\uBC14\uC77C",
                        "\uC2A4\uD29C\uB514\uC624",
                        "\uCE90\uD53C\uD0C8");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\ko_KR\\Company")
                    .setLookup(
                            Company.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("companyPrefix", "companySuffix", "formats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/ko_KR/Company.php")
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
