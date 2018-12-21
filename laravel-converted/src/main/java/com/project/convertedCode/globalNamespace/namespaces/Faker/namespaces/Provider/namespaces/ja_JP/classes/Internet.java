package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.ja_JP.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/ja_JP/Internet.php

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
                                                                .ja_JP
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
                                                        .ja_JP
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
                                                                                        .ja_JP
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
                                                                        .ja_JP
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

    public static final Object CONST_class = "Faker\\Provider\\ja_JP\\Internet";

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
                                                            .ja_JP
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
                                                            .ja_JP
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

        public Object safeEmailTld = ZVal.arrayFromList("org", "com", "net", "jp", "jp", "jp");

        public Object freeEmailDomain =
                ZVal.arrayFromList("gmail.com", "yahoo.co.jp", "hotmail.co.jp", "mail.goo.ne.jp");

        public Object tld =
                ZVal.arrayFromList(
                        "com", "com", "com", "biz", "info", "net", "org", "jp", "jp", "jp");

        public Object lastNameAscii =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "aota",
                                    "aoyama",
                                    "ishida",
                                    "idaka",
                                    "ito",
                                    "uno",
                                    "ekoda",
                                    "ogaki",
                                    "kato",
                                    "kanou",
                                    "kijima",
                                    "kimura",
                                    "kiriyama",
                                    "kudo",
                                    "koizumi",
                                    "kobayashi",
                                    "kondo",
                                    "saito",
                                    "sakamoto",
                                    "sasaki",
                                    "sato",
                                    "sasada",
                                    "suzuki",
                                    "sugiyama",
                                    "takahashi",
                                    "tanaka",
                                    "tanabe",
                                    "tsuda",
                                    "nakajima",
                                    "nakamura",
                                    "nagisa",
                                    "nakatsugawa",
                                    "nishinosono",
                                    "nomura",
                                    "harada",
                                    "hamada",
                                    "hirokawa",
                                    "fujimoto",
                                    "matsumoto",
                                    "miyake",
                                    "miyazawa",
                                    "murayama",
                                    "yamagishi",
                                    "yamaguchi",
                                    "yamada",
                                    "yamamoto",
                                    "yoshida",
                                    "yoshimoto",
                                    "wakamatsu",
                                    "watanabe");
                        });

        public Object firstNameAscii =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "akira",
                                    "atsushi",
                                    "osamu",
                                    "akemi",
                                    "asuka",
                                    "kazuya",
                                    "kyosuke",
                                    "kenichi",
                                    "kaori",
                                    "kana",
                                    "kumiko",
                                    "shuhei",
                                    "shota",
                                    "jun",
                                    "soutaro",
                                    "sayuri",
                                    "satomi",
                                    "taichi",
                                    "taro",
                                    "takuma",
                                    "tsubasa",
                                    "tomoya",
                                    "chiyo",
                                    "naoki",
                                    "naoto",
                                    "naoko",
                                    "nanami",
                                    "hideki",
                                    "hiroshi",
                                    "hanako",
                                    "haruka",
                                    "manabu",
                                    "mitsuru",
                                    "minoru",
                                    "maaya",
                                    "mai",
                                    "mikako",
                                    "miki",
                                    "momoko",
                                    "yuki",
                                    "yuta",
                                    "yasuhiro",
                                    "youichi",
                                    "yosuke",
                                    "yui",
                                    "yumiko",
                                    "yoko",
                                    "ryosuke",
                                    "ryohei",
                                    "rei",
                                    "rika");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\ja_JP\\Internet")
                    .setLookup(
                            Internet.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "firstNameAscii",
                            "freeEmailDomain",
                            "lastNameAscii",
                            "safeEmailTld",
                            "tld",
                            "userNameFormats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/ja_JP/Internet.php")
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
