package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.sv_SE.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/sv_SE/Company.php

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
    public Object jobTitle(RuntimeEnv env, Object... args) {
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
                                                                .sv_SE
                                                                .classes
                                                                .Company
                                                                .RequestStaticProperties
                                                                .class,
                                                        "jobTitles")))
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
                                                        .sv_SE
                                                        .classes
                                                        .Company
                                                        .RequestStaticProperties
                                                        .class)
                                        .jobTitles)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\sv_SE\\Company";

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
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object formats =
                ZVal.arrayFromList(
                        "{{lastName}} {{companySuffix}}",
                        "{{lastName}} {{companySuffix}}",
                        "{{lastName}} {{companySuffix}}",
                        "{{firstName}} {{lastName}} {{companySuffix}}",
                        "{{lastName}} & {{lastName}} {{companySuffix}}",
                        "{{lastName}} & {{lastName}}",
                        "{{lastName}} och {{lastName}}",
                        "{{lastName}} och {{lastName}} {{companySuffix}}");

        public Object companySuffix = ZVal.arrayFromList("AB", "HB");

        public Object jobTitles =
                ZVal.arrayFromList(
                        "Automationsingenj\u00F6r",
                        "Bagare",
                        "Digital Designer",
                        "Ekonom",
                        "Ekonomichef",
                        "Elektronikingenj\u00F6r",
                        "F\u00F6rs\u00E4ljare",
                        "F\u00F6rs\u00E4ljningschef",
                        "Innovationsdirekt\u00F6r",
                        "Investeringsdirekt\u00F6r",
                        "Journalist",
                        "Kock",
                        "Kulturstrateg",
                        "L\u00E4kare",
                        "Lokf\u00F6rare",
                        "M\u00E4klare",
                        "Programmerare",
                        "Projektledare",
                        "Sjuksk\u00F6terska",
                        "Utvecklare",
                        "UX Designer",
                        "Webbutvecklare");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\sv_SE\\Company")
                    .setLookup(
                            Company.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("companySuffix", "formats", "jobTitles")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/sv_SE/Company.php")
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
