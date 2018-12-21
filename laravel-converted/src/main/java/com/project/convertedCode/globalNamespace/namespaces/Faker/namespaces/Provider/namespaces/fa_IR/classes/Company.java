package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.fa_IR.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/fa_IR/Company.php

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
    public Object contract(RuntimeEnv env, Object... args) {
        return ZVal.assign(
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
                                                                .fa_IR
                                                                .classes
                                                                .Company
                                                                .RequestStaticProperties
                                                                .class,
                                                        "contract")))
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
                                                        .fa_IR
                                                        .classes
                                                        .Company
                                                        .RequestStaticProperties
                                                        .class)
                                        .contract)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\fa_IR\\Company";

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
                                                            .fa_IR
                                                            .classes
                                                            .Company
                                                            .RequestStaticProperties
                                                            .class)
                                            .companyPrefix)
                            .value());
        }

        @ConvertedMethod
        public Object companyField(RuntimeEnv env, Object... args) {
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
                                                            .fa_IR
                                                            .classes
                                                            .Company
                                                            .RequestStaticProperties
                                                            .class)
                                            .companyField)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object formats =
                ZVal.arrayFromList(
                        "{{companyPrefix}} {{companyField}} {{firstName}}",
                        "{{companyPrefix}} {{companyField}} {{firstName}}",
                        "{{companyPrefix}} {{companyField}} {{firstName}}",
                        "{{companyPrefix}} {{companyField}} {{firstName}}",
                        "{{companyPrefix}} {{companyField}} {{lastName}}",
                        "{{companyField}} {{firstName}}",
                        "{{companyField}} {{firstName}}",
                        "{{companyField}} {{lastName}}");

        public Object companyPrefix =
                ZVal.arrayFromList(
                        "\u0634\u0631\u06A9\u062A",
                        "\u0645\u0648\u0633\u0633\u0647",
                        "\u0633\u0627\u0632\u0645\u0627\u0646",
                        "\u0628\u0646\u06CC\u0627\u062F");

        public Object companyField =
                ZVal.arrayFromList(
                        "\u0641\u0646\u0627\u0648\u0631\u06CC \u0627\u0637\u0644\u0627\u0639\u0627\u062A",
                        "\u0631\u0627\u0647 \u0648 \u0633\u0627\u062E\u062A\u0645\u0627\u0646",
                        "\u062A\u0648\u0633\u0639\u0647 \u0645\u0639\u0627\u062F\u0646",
                        "\u0627\u0633\u062A\u062E\u0631\u0627\u062C \u0648 \u0627\u06A9\u062A\u0634\u0627\u0641",
                        "\u0633\u0631\u0645\u0627\u06CC\u0647 \u06AF\u0630\u0627\u0631\u06CC",
                        "\u0646\u0633\u0627\u062C\u06CC",
                        "\u06A9\u0627\u0631\u06CC\u0627\u0628\u06CC",
                        "\u062A\u062C\u0647\u06CC\u0632\u0627\u062A \u0627\u062F\u0627\u0631\u06CC",
                        "\u062A\u0648\u0644\u06CC\u062F\u06CC",
                        "\u0641\u0648\u0644\u0627\u062F");

        public Object contract =
                ZVal.arrayFromList(
                        "\u0631\u0633\u0645\u06CC",
                        "\u067E\u06CC\u0645\u0627\u0646\u06CC",
                        "\u062A\u0645\u0627\u0645 \u0648\u0642\u062A",
                        "\u067E\u0627\u0631\u0647 \u0648\u0642\u062A",
                        "\u067E\u0631\u0648\u0698\u0647 \u0627\u06CC",
                        "\u0633\u0627\u0639\u062A\u06CC");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\fa_IR\\Company")
                    .setLookup(
                            Company.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("companyField", "companyPrefix", "contract", "formats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/fa_IR/Company.php")
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
