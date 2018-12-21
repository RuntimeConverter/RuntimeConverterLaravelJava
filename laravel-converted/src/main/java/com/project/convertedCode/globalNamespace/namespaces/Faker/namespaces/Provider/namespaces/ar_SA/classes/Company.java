package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.ar_SA.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Calculator.classes.Luhn;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/ar_SA/Company.php

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
    public Object companyPrefix(RuntimeEnv env, Object... args) {
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
                                                                .ar_SA
                                                                .classes
                                                                .Company
                                                                .RequestStaticProperties
                                                                .class,
                                                        "companyPrefix")))
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
                                                        .ar_SA
                                                        .classes
                                                        .Company
                                                        .RequestStaticProperties
                                                        .class)
                                        .companyPrefix)
                        .value());
    }

    @ConvertedMethod
    public Object catchPhrase(RuntimeEnv env, Object... args) {
        ReferenceContainer result = new BasicReferenceContainer(null);
        ReferenceContainer word = new BasicReferenceContainer(null);
        result.setObject(ZVal.newArray());
        for (ZPair zpairResult112 :
                ZVal.getIterable(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Faker
                                                .namespaces
                                                .Provider
                                                .namespaces
                                                .ar_SA
                                                .classes
                                                .Company
                                                .RequestStaticProperties
                                                .class)
                                .catchPhraseWords,
                        env,
                        true)) {
            word = zpairResult112;
            result.arrayAppend(env)
                    .set(
                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, Company.class)
                                    .method("randomElement")
                                    .addReferenceArgs(new RuntimeArgsWithReferences().add(0, word))
                                    .call(word.getObject())
                                    .value());
        }

        return ZVal.assign(NamespaceGlobal.join.env(env).call(result.getObject(), " ").value());
    }

    @ConvertedMethod
    public Object bs(RuntimeEnv env, Object... args) {
        ReferenceContainer result = new BasicReferenceContainer(null);
        ReferenceContainer word = new BasicReferenceContainer(null);
        result.setObject(ZVal.newArray());
        for (ZPair zpairResult113 :
                ZVal.getIterable(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Faker
                                                .namespaces
                                                .Provider
                                                .namespaces
                                                .ar_SA
                                                .classes
                                                .Company
                                                .RequestStaticProperties
                                                .class)
                                .bsWords,
                        env,
                        true)) {
            word = zpairResult113;
            result.arrayAppend(env)
                    .set(
                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, Company.class)
                                    .method("randomElement")
                                    .addReferenceArgs(new RuntimeArgsWithReferences().add(0, word))
                                    .call(word.getObject())
                                    .value());
        }

        return ZVal.assign(NamespaceGlobal.join.env(env).call(result.getObject(), " ").value());
    }

    public static final Object CONST_class = "Faker\\Provider\\ar_SA\\Company";

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
        public Object companyIdNumber(RuntimeEnv env, Object... args) {
            Object partialValue = null;
            partialValue =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
                            .method("numerify")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    toStringR(700, env)
                                            + toStringR(
                                                    function_str_repeat
                                                            .f
                                                            .env(env)
                                                            .call("#", 6)
                                                            .value(),
                                                    env))
                            .value();
            return ZVal.assign(Luhn.runtimeStaticObject.generateLuhnNumber(env, partialValue));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object formats =
                ZVal.arrayFromList(
                        "{{lastName}} {{companySuffix}}",
                        "{{companyPrefix}} {{lastName}} {{companySuffix}}",
                        "{{companyPrefix}} {{lastName}}");

        public Object bsWords = ZVal.newArray(new ZPair(0, ZVal.newArray()));

        public Object catchPhraseWords =
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.arrayFromList(
                                        "\u0627\u0644\u062E\u062F\u0645\u0627\u062A",
                                        "\u0627\u0644\u062D\u0644\u0648\u0644",
                                        "\u0627\u0644\u0627\u0646\u0638\u0645\u0629")),
                        new ZPair(
                                1,
                                ZVal.arrayFromList(
                                        "\u0627\u0644\u0630\u0647\u0628\u064A\u0629",
                                        "\u0627\u0644\u0630\u0643\u064A\u0629",
                                        "\u0627\u0644\u0645\u062A\u0637\u0648\u0631\u0629",
                                        "\u0627\u0644\u0645\u062A\u0642\u062F\u0645\u0629",
                                        "\u0627\u0644\u062F\u0648\u0644\u064A\u0629",
                                        "\u0627\u0644\u0645\u062A\u062E\u0635\u0635\u0647",
                                        "\u0627\u0644\u0633\u0631\u064A\u0639\u0629",
                                        "\u0627\u0644\u0645\u062B\u0644\u0649",
                                        "\u0627\u0644\u0627\u0628\u062F\u0627\u0639\u064A\u0629",
                                        "\u0627\u0644\u0645\u062A\u0643\u0627\u0645\u0644\u0629",
                                        "\u0627\u0644\u0645\u062A\u063A\u064A\u0631\u0629",
                                        "\u0627\u0644\u0645\u062B\u0627\u0644\u064A\u0629")));

        public Object companyPrefix =
                ZVal.arrayFromList(
                        "\u0634\u0631\u0643\u0629",
                        "\u0645\u0624\u0633\u0633\u0629",
                        "\u0645\u062C\u0645\u0648\u0639\u0629",
                        "\u0645\u0643\u062A\u0628",
                        "\u0623\u0643\u0627\u062F\u064A\u0645\u064A\u0629",
                        "\u0645\u0639\u0631\u0636");

        public Object companySuffix =
                ZVal.arrayFromList(
                        "\u0648\u0623\u0648\u0644\u0627\u062F\u0647",
                        "\u0644\u0644\u0645\u0633\u0627\u0647\u0645\u0629 \u0627\u0644\u0645\u062D\u062F\u0648\u062F\u0629",
                        " \u0630.\u0645.\u0645",
                        "\u0645\u0633\u0627\u0647\u0645\u0629 \u0639\u0627\u0645\u0629",
                        "\u0648\u0634\u0631\u0643\u0627\u0626\u0647");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\ar_SA\\Company")
                    .setLookup(
                            Company.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "bsWords",
                            "catchPhraseWords",
                            "companyPrefix",
                            "companySuffix",
                            "formats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/ar_SA/Company.php")
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
