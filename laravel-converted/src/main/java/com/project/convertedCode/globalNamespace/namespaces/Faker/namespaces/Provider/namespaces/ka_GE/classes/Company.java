package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.ka_GE.classes;

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
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/ka_GE/Company.php

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

    @ConvertedMethod
    public Object company(RuntimeEnv env, Object... args) {
        Object format = null;
        format =
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
                        .method("randomElement")
                        .addReferenceArgs(
                                new RuntimeArgsWithReferences()
                                        .add(
                                                0,
                                                env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Faker
                                                                .namespaces
                                                                .Provider
                                                                .namespaces
                                                                .ka_GE
                                                                .classes
                                                                .Company
                                                                .RequestStaticProperties
                                                                .class,
                                                        "companyNameFormats")))
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
                                                        .ka_GE
                                                        .classes
                                                        .Company
                                                        .RequestStaticProperties
                                                        .class)
                                        .companyNameFormats)
                        .value();
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Company.class,
                        format));
    }

    public static final Object CONST_class = "Faker\\Provider\\ka_GE\\Company";

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
                                                            .ka_GE
                                                            .classes
                                                            .Company
                                                            .RequestStaticProperties
                                                            .class)
                                            .companyPrefixes)
                            .value());
        }

        @ConvertedMethod
        public Object companyNameElement(RuntimeEnv env, Object... args) {
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
                                                            .ka_GE
                                                            .classes
                                                            .Company
                                                            .RequestStaticProperties
                                                            .class)
                                            .companyElements)
                            .value());
        }

        @ConvertedMethod
        public Object companyNameSuffix(RuntimeEnv env, Object... args) {
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
                                                            .ka_GE
                                                            .classes
                                                            .Company
                                                            .RequestStaticProperties
                                                            .class)
                                            .companyNameSuffixes)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object companyPrefixes =
                ZVal.arrayFromList(
                        "\u10E8\u10DE\u10E1",
                        "\u10E8\u10DE\u10E1",
                        "\u10E8\u10DE\u10E1",
                        "\u10E1\u10E1",
                        "\u10E1\u10E1",
                        "\u10E1\u10E1",
                        "\u10D9\u10E1",
                        "\u10E1\u10E1 \u10D9\u10DD\u10E0\u10DE\u10DD\u10E0\u10D0\u10EA\u10D8\u10D0",
                        "\u10D8\u10DB",
                        "\u10E1\u10DE\u10E1",
                        "\u10D9\u10DD\u10DD\u10DE\u10D4\u10E0\u10D0\u10E2\u10D8\u10D5\u10D8");

        public Object companyNameSuffixes =
                ZVal.arrayFromList(
                        "\u10E1\u10D0\u10D1\u10ED\u10DD",
                        "\u10D4\u10E5\u10E1\u10DE\u10D4\u10D3\u10D8\u10EA\u10D8\u10D0",
                        "\u10DE\u10E0\u10DD\u10DB\u10D8",
                        "\u10D9\u10DD\u10DB\u10DE\u10DA\u10D4\u10E5\u10E1\u10D8",
                        "\u10D0\u10D5\u10E2\u10DD",
                        "\u10DA\u10D8\u10D6\u10D8\u10DC\u10D2\u10D8",
                        "\u10D7\u10E0\u10D0\u10E1\u10D7\u10D8",
                        "\u10D4\u10D8\u10D3\u10D8",
                        "\u10DE\u10DA\u10E3\u10E1\u10D8",
                        "\u10DA\u10D0\u10D1\u10D8",
                        "\u10D9\u10D0\u10D5\u10E8\u10D8\u10E0\u10D8",
                        " \u10D3\u10D0 \u10D9\u10DD\u10DB\u10DE\u10D0\u10DC\u10D8\u10D0");

        public Object companyElements =
                ZVal.arrayFromList(
                        "\u10EA\u10D4\u10DB",
                        "\u10D2\u10D4\u10DD",
                        "\u10E5\u10D0\u10E0",
                        "\u10E5\u10D8\u10DB",
                        "\u10DA\u10D8\u10E4\u10E2",
                        "\u10E2\u10D4\u10DA\u10D4",
                        "\u10E0\u10D0\u10D3\u10D8\u10DD",
                        "\u10E2\u10E0\u10D0\u10DC\u10E1",
                        "\u10D0\u10DA\u10DB\u10D0\u10E1",
                        "\u10DB\u10D4\u10E2\u10E0\u10DD",
                        "\u10DB\u10DD\u10E2\u10DD\u10E0",
                        "\u10E2\u10D4\u10E5",
                        "\u10E1\u10D0\u10DC\u10E2\u10D4\u10E5",
                        "\u10D4\u10DA\u10D4\u10E5\u10E2\u10E0\u10DD",
                        "\u10E0\u10D4\u10D0\u10E5\u10E2\u10DD",
                        "\u10E2\u10D4\u10E5\u10E1\u10E2\u10D8\u10DA",
                        "\u10D9\u10D0\u10D1\u10D4\u10DA",
                        "\u10DB\u10D0\u10D5\u10D0\u10DA",
                        "\u10E2\u10D4\u10DA",
                        "\u10E2\u10D4\u10E5\u10DC\u10DD");

        public Object companyNameFormats =
                ZVal.arrayFromList(
                        "{{companyPrefix}} {{companyNameElement}}{{companyNameSuffix}}",
                        "{{companyPrefix}} {{companyNameElement}}{{companyNameElement}}{{companyNameSuffix}}",
                        "{{companyPrefix}} {{companyNameElement}}{{companyNameElement}}{{companyNameElement}}{{companyNameSuffix}}",
                        "{{companyPrefix}} {{companyNameElement}}{{companyNameElement}}{{companyNameElement}}{{companyNameSuffix}}");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\ka_GE\\Company")
                    .setLookup(
                            Company.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "companyElements",
                            "companyNameFormats",
                            "companyNameSuffixes",
                            "companyPrefixes")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/ka_GE/Company.php")
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
