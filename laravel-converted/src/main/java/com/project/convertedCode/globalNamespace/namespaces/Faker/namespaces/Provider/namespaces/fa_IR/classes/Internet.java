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
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/fa_IR/Internet.php

*/

public class Internet
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .Internet {

    public Internet(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Internet.class) {
            this.__construct(env, args);
        }
    }

    public Internet(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object userName(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object format = null;
        format =
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Internet.class)
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
                                                                .Internet
                                                                .RequestStaticProperties
                                                                .class,
                                                        "userNameFormats")))
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
                                                        .Internet
                                                        .RequestStaticProperties
                                                        .class)
                                        .userNameFormats)
                        .value();
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Internet.class)
                        .method("bothify")
                        .addReferenceArgs(
                                rLastRefArgs =
                                        new RuntimeArgsWithReferences()
                                                .add(
                                                        0,
                                                        handleReturnReference(
                                                                env.callMethod(
                                                                        toObjectR(this)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("generator")
                                                                                .value(),
                                                                        "parse",
                                                                        Internet.class,
                                                                        format))))
                        .call(rLastRefArgs.get(0))
                        .value());
    }

    @ConvertedMethod
    public Object domainName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, Internet.class)
                                        .method("randomElement")
                                        .addReferenceArgs(
                                                new RuntimeArgsWithReferences()
                                                        .add(
                                                                0,
                                                                env
                                                                        .getRequestStaticPropertiesReference(
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
                                                                                        .Internet
                                                                                        .RequestStaticProperties
                                                                                        .class,
                                                                                "lastNameAscii")))
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
                                                                        .Internet
                                                                        .RequestStaticProperties
                                                                        .class)
                                                        .lastNameAscii)
                                        .value(),
                                env)
                        + "."
                        + toStringR(env.callMethod(this, "tld", Internet.class), env));
    }

    public static final Object CONST_class = "Faker\\Provider\\fa_IR\\Internet";

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
                    .Internet
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object lastNameAscii(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Internet.class)
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
                                                            .Internet
                                                            .RequestStaticProperties
                                                            .class)
                                            .lastNameAscii)
                            .value());
        }

        @ConvertedMethod
        public Object firstNameAscii(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Internet.class)
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
                                                            .Internet
                                                            .RequestStaticProperties
                                                            .class)
                                            .firstNameAscii)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object userNameFormats =
                ZVal.arrayFromList(
                        "{{lastNameAscii}}.{{firstNameAscii}}",
                        "{{firstNameAscii}}.{{lastNameAscii}}",
                        "{{firstNameAscii}}##",
                        "?{{lastNameAscii}}");

        public Object safeEmailTld = ZVal.arrayFromList("com", "ir", "me", "net", "org");

        public Object tld =
                ZVal.arrayFromList(
                        "biz", "com", "info", "ac.ir", "sch.ir", "co.ir", "ir", "net", "org");

        public Object lastNameAscii =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "abdullahi",
                                    "abbasi",
                                    "abedini",
                                    "ahadi",
                                    "ahmadi",
                                    "akbari",
                                    "alizadeh",
                                    "asadi",
                                    "baraghani",
                                    "babaei",
                                    "chamran",
                                    "ebrahimi",
                                    "esfahani",
                                    "fanaei",
                                    "farahani",
                                    "farsi",
                                    "fekri",
                                    "ghasemi",
                                    "ghorbani",
                                    "hamadani",
                                    "hamidi",
                                    "heidari",
                                    "hijazi",
                                    "husseini",
                                    "jahanbani",
                                    "jalili",
                                    "jamshidi",
                                    "javadi",
                                    "kadivar",
                                    "karimi",
                                    "kashani",
                                    "kazmi",
                                    "khadem",
                                    "khalaji",
                                    "khomeini",
                                    "khorsandi",
                                    "mahdavi",
                                    "mahmoudi",
                                    "mahmoudieh",
                                    "majidi",
                                    "mazanderani",
                                    "mirzaei",
                                    "mokri",
                                    "mohammady",
                                    "mousavi",
                                    "nabavi",
                                    "naceri",
                                    "nafisi",
                                    "najafi",
                                    "nalci",
                                    "namazi",
                                    "namdar",
                                    "nariman",
                                    "nazari",
                                    "nili",
                                    "norouzi",
                                    "pahlavi",
                                    "paria",
                                    "pashaei",
                                    "pejman",
                                    "qazwini",
                                    "rahimi",
                                    "rahmani",
                                    "rajaei",
                                    "ramadani",
                                    "rashidi",
                                    "rezaei",
                                    "salari",
                                    "salehi",
                                    "salemi",
                                    "shahbazi",
                                    "shahriari",
                                    "shahidi",
                                    "shirazi",
                                    "shojaei",
                                    "soleimani",
                                    "soomekh",
                                    "soroush",
                                    "tabatabaei",
                                    "talebi",
                                    "tousi",
                                    "yazdani",
                                    "yazdi",
                                    "yousefi",
                                    "zandi",
                                    "zare");
                        });

        public Object firstNameAscii =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "abbas",
                                    "afshin",
                                    "ahmad",
                                    "ali",
                                    "amir",
                                    "anahita",
                                    "anousheh",
                                    "arash",
                                    "ardeshir",
                                    "arezu",
                                    "aria",
                                    "arian",
                                    "arman",
                                    "ashraf",
                                    "atoosa",
                                    "azadeh",
                                    "azar",
                                    "babak",
                                    "bahar",
                                    "bahare",
                                    "bardia",
                                    "behnaz",
                                    "benyamin",
                                    "bita",
                                    "dalir",
                                    "dariush",
                                    "davoud",
                                    "donya",
                                    "ebrahim",
                                    "ehsan",
                                    "eskandar",
                                    "esmaeel",
                                    "farangis",
                                    "farbod",
                                    "farhad",
                                    "farideh",
                                    "farnaz",
                                    "farrokh",
                                    "farshid",
                                    "farzaneh",
                                    "fateme",
                                    "fereshteh",
                                    "garshasp",
                                    "hanie",
                                    "hashem",
                                    "hirbod",
                                    "hoda",
                                    "hormoz",
                                    "hossein",
                                    "jaleh",
                                    "jamshid",
                                    "javad",
                                    "kamran",
                                    "karim",
                                    "kasra",
                                    "katayoun",
                                    "kazem",
                                    "khorshid",
                                    "khosrow",
                                    "kiana",
                                    "kiarash",
                                    "kourosh",
                                    "laleh",
                                    "leila",
                                    "mahdi",
                                    "mahmoud",
                                    "mahshid",
                                    "majid",
                                    "manuchehr",
                                    "marjan",
                                    "maryam",
                                    "marzban",
                                    "massoud",
                                    "mazdak",
                                    "maziar",
                                    "mehran",
                                    "mehrdad",
                                    "meysam",
                                    "milad",
                                    "mina",
                                    "mithra",
                                    "mohammad",
                                    "mohsen",
                                    "musa",
                                    "nasrin",
                                    "nazanin",
                                    "niloufar",
                                    "omid",
                                    "parastoo",
                                    "parisa",
                                    "parsa",
                                    "parvin",
                                    "parviz",
                                    "payam",
                                    "payvand",
                                    "pedram",
                                    "piruz",
                                    "pouria",
                                    "ramin",
                                    "reyhan",
                                    "reza",
                                    "roksaneh",
                                    "rostam",
                                    "roxana",
                                    "roya",
                                    "sahar",
                                    "saman",
                                    "samir",
                                    "sara",
                                    "sassan",
                                    "sepehr",
                                    "sepideh",
                                    "shahin",
                                    "shahryar",
                                    "shapour",
                                    "shervin",
                                    "shirin",
                                    "simin",
                                    "soheila",
                                    "sohrab",
                                    "soraya",
                                    "soroush",
                                    "tara",
                                    "taraneh",
                                    "turan",
                                    "vahid",
                                    "yaghoub",
                                    "yahya",
                                    "yasamin",
                                    "yasaman",
                                    "younes",
                                    "yousef",
                                    "zahra",
                                    "zarine",
                                    "zeynab",
                                    "zhila");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\fa_IR\\Internet")
                    .setLookup(
                            Internet.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "firstNameAscii",
                            "lastNameAscii",
                            "safeEmailTld",
                            "tld",
                            "userNameFormats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/fa_IR/Internet.php")
                    .addExtendsClass("Faker\\Provider\\Internet")
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
