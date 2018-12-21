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
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/ko_KR/Internet.php

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
                                                                .ko_KR
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
                                                        .ko_KR
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
                                                                                        .ko_KR
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
                                                                        .ko_KR
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

    public static final Object CONST_class = "Faker\\Provider\\ko_KR\\Internet";

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
                                                            .ko_KR
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
                                                            .ko_KR
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

        public Object safeEmailTld = ZVal.arrayFromList("com", "kr", "me", "net", "org");

        public Object tld = ZVal.arrayFromList("biz", "com", "info", "kr", "net", "org");

        public Object lastNameAscii =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "ahn", "bae", "baek", "chang", "cheon", "cho", "choi", "chung",
                                    "gang", "go", "gwak", "gwon", "ha", "han", "heo", "hong",
                                    "hwang", "jang", "jeon", "jo", "jung", "kang", "kim", "ko",
                                    "kwak", "kwon", "lee", "lim", "moon", "nam", "no", "oh", "park",
                                    "ryu", "seo", "shim", "shin", "son", "song", "yang", "yoon",
                                    "yu");
                        });

        public Object firstNameAscii =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "areum",
                                    "arin",
                                    "banhee",
                                    "bom",
                                    "bomi",
                                    "bomin",
                                    "boram",
                                    "byungcheol",
                                    "byungho",
                                    "chaehyun",
                                    "chaewon",
                                    "changyoung",
                                    "daesoo",
                                    "daesun",
                                    "dayoung",
                                    "dohyunn",
                                    "dongha",
                                    "donghyun",
                                    "donghyun",
                                    "dongyoon",
                                    "doyoon",
                                    "doyoun",
                                    "eunae",
                                    "eunhee",
                                    "eunhye",
                                    "eunhyoung",
                                    "eunji",
                                    "eunjin",
                                    "eunju",
                                    "eunjung",
                                    "eunkyoung",
                                    "eunmi",
                                    "eunsang",
                                    "eunseo",
                                    "eunsung",
                                    "eunteck",
                                    "eunyoung",
                                    "gangeun",
                                    "ganghee",
                                    "garam",
                                    "geongeun",
                                    "gunho",
                                    "gunwoo",
                                    "haeun",
                                    "hana",
                                    "hanna",
                                    "hayun",
                                    "heekyoung",
                                    "heewon",
                                    "hojin",
                                    "homin",
                                    "hongsun",
                                    "hyejin",
                                    "hyemin",
                                    "hyena",
                                    "hyerim",
                                    "hyesuk",
                                    "hyesun",
                                    "hyeyoun",
                                    "hyoil",
                                    "hyojin",
                                    "hyounjung",
                                    "hyuksang",
                                    "hyungcheol",
                                    "hyungmin",
                                    "hyunji",
                                    "hyunjong",
                                    "hyunjoo",
                                    "hyunjun",
                                    "hyunkyu",
                                    "hyunwoo",
                                    "hyunyoung",
                                    "ingyu",
                                    "inhwa",
                                    "jaecheo",
                                    "jaeho",
                                    "jaehun",
                                    "jaehyuk",
                                    "jaehyun",
                                    "jaeyeon",
                                    "jaeyun",
                                    "jia",
                                    "jieun",
                                    "jihee",
                                    "jihoo",
                                    "jihoon",
                                    "jihye",
                                    "jihyeon",
                                    "jimin",
                                    "jina",
                                    "jinhee",
                                    "jinho",
                                    "jinsoo",
                                    "jinwoo",
                                    "jisuk",
                                    "jisun",
                                    "jiwon",
                                    "jiwoo",
                                    "jiye",
                                    "jiyeon",
                                    "jiyoung",
                                    "jonghun",
                                    "jongju",
                                    "jongsoo",
                                    "jughyung",
                                    "juhee",
                                    "jumi",
                                    "jumyoung",
                                    "jun",
                                    "junbum",
                                    "jungeun",
                                    "jungho",
                                    "junghun",
                                    "junghwa",
                                    "jungmin",
                                    "jungnam",
                                    "jungran",
                                    "jungshik",
                                    "jungsoo",
                                    "jungsoo",
                                    "jungwoong",
                                    "junho",
                                    "junhyuk",
                                    "junhyung",
                                    "junseo",
                                    "junyoung",
                                    "juwon",
                                    "juyeon",
                                    "kisoo",
                                    "kiyun",
                                    "kubum",
                                    "kwangsoo",
                                    "kyungchoon",
                                    "kyunghwan",
                                    "kyungjoo",
                                    "kyungseok",
                                    "kyungsoo",
                                    "kyusan",
                                    "mijung",
                                    "mikyoung",
                                    "mina",
                                    "mincheol",
                                    "minhee",
                                    "minhwan",
                                    "minhyoung",
                                    "minjae",
                                    "minji",
                                    "minjun",
                                    "minseo",
                                    "minseok",
                                    "minsoo",
                                    "minsung",
                                    "mira",
                                    "miran",
                                    "miyoung",
                                    "moonchang",
                                    "moonyong",
                                    "myungho",
                                    "myungshik",
                                    "naeun",
                                    "nahyoung",
                                    "namho",
                                    "namsoo",
                                    "naree",
                                    "naroo",
                                    "nayun",
                                    "nuree",
                                    "saemi",
                                    "sangah",
                                    "sangcheol",
                                    "sangho",
                                    "sanghun",
                                    "sanghyun",
                                    "sangjun",
                                    "sangmyoung",
                                    "sangsoo",
                                    "sangsun",
                                    "sangwoo",
                                    "sangwook",
                                    "seoho",
                                    "seohyeon",
                                    "seojun",
                                    "seoyeon",
                                    "seoyoung",
                                    "seoyun",
                                    "seulki",
                                    "seungho",
                                    "seunghyun",
                                    "seungmin",
                                    "sewon",
                                    "sieun",
                                    "sinae",
                                    "siwoo",
                                    "sojung",
                                    "somin",
                                    "soyoun",
                                    "soyoung",
                                    "subin",
                                    "sujin",
                                    "sujung",
                                    "sumin",
                                    "sungeun",
                                    "sunggon",
                                    "sungho",
                                    "sunghun",
                                    "sunghyun",
                                    "sungjin",
                                    "sungmi",
                                    "sungmin",
                                    "sungmin",
                                    "sungryung",
                                    "sungsoo",
                                    "sunhang",
                                    "sunho",
                                    "sunjung",
                                    "sunwoo",
                                    "sunyoung",
                                    "sunyup",
                                    "suran",
                                    "suwon",
                                    "suwon",
                                    "suyoun",
                                    "taehee",
                                    "taeho",
                                    "taehyun",
                                    "wonhee",
                                    "wonjin",
                                    "wonjun",
                                    "woojin",
                                    "yeji",
                                    "yejin",
                                    "yejun",
                                    "yeojin",
                                    "yeon",
                                    "yewon",
                                    "youngcheol",
                                    "younggil",
                                    "youngha",
                                    "youngho",
                                    "younghun",
                                    "younghwa",
                                    "youngil",
                                    "youngjin",
                                    "youngjin",
                                    "youngshik",
                                    "youngsoo",
                                    "youngtae",
                                    "youngwhan",
                                    "youngwhan",
                                    "younhee",
                                    "younsun",
                                    "yujin",
                                    "yujung",
                                    "yunkyoung",
                                    "yunmi",
                                    "yunseo",
                                    "yunyoung",
                                    "yuri");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\ko_KR\\Internet")
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
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/ko_KR/Internet.php")
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
