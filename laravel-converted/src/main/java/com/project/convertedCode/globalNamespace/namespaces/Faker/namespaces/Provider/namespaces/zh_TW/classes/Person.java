package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.zh_TW.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/zh_TW/Person.php

*/

public class Person
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .Person {

    public Person(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Person.class) {
            this.__construct(env, args);
        }
    }

    public Person(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "gender",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object personalIdentityNumber(RuntimeEnv env, Object... args) {
        Object gender = assignParameter(args, 0, true);
        if (null == gender) {
            gender = ZVal.getNull();
        }
        Object birthPlace = null;
        Object birthPlaceCode = null;
        Object codes = null;
        Object genderCode = null;
        Object total = null;
        Object code = null;
        Object checkSumDigit = null;
        Object id = null;
        Object randomNumberCode = null;
        Object key = null;
        birthPlace =
                runtimeStaticObject.randomKey(
                        env,
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Faker
                                                .namespaces
                                                .Provider
                                                .namespaces
                                                .zh_TW
                                                .classes
                                                .Person
                                                .RequestStaticProperties
                                                .class)
                                .idBirthplaceCode);
        birthPlaceCode =
                ZVal.assign(
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Faker
                                                .namespaces
                                                .Provider
                                                .namespaces
                                                .zh_TW
                                                .classes
                                                .Person
                                                .RequestStaticProperties
                                                .class,
                                        "idBirthplaceCode")
                                .arrayGet(env, birthPlace));
        gender =
                ZVal.assign(
                        ZVal.notEqualityCheck(gender, ZVal.getNull())
                                ? gender
                                : runtimeStaticObject.randomElement(
                                        env,
                                        ZVal.newArray(
                                                new ZPair(0, CONST_GENDER_FEMALE),
                                                new ZPair(1, CONST_GENDER_MALE))));
        genderCode =
                ZVal.assign(ZVal.strictEqualityCheck(gender, "===", CONST_GENDER_MALE) ? 1 : 2);
        randomNumberCode = runtimeStaticObject.randomNumber(env, 7, true);
        codes =
                NamespaceGlobal.str_split
                        .env(env)
                        .call(
                                toStringR(birthPlaceCode, env)
                                        + toStringR(genderCode, env)
                                        + toStringR(randomNumberCode, env))
                        .value();
        total = 0;
        for (ZPair zpairResult136 : ZVal.getIterable(codes, env, false)) {
            key = ZVal.assign(zpairResult136.getKey());
            code = ZVal.assign(zpairResult136.getValue());
            total =
                    ZAssignment.add(
                            "+=",
                            total,
                            ZVal.multiply(
                                    code,
                                    env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Faker
                                                            .namespaces
                                                            .Provider
                                                            .namespaces
                                                            .zh_TW
                                                            .classes
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class,
                                                    "idDigitValidator")
                                            .arrayGet(env, key)));
        }

        checkSumDigit = ZVal.subtract(10, ZVal.modulus(total, 10));
        if (ZVal.equalityCheck(checkSumDigit, 10)) {
            checkSumDigit = 0;
        }

        id =
                toStringR(birthPlace, env)
                        + toStringR(genderCode, env)
                        + toStringR(randomNumberCode, env)
                        + toStringR(checkSumDigit, env);
        return ZVal.assign(id);
    }

    public static final Object CONST_class = "Faker\\Provider\\zh_TW\\Person";

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
                    .Person
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "pool")
        @ConvertedParameter(index = 1, name = "n")
        public Object randomName(RuntimeEnv env, Object... args) {
            Object pool = assignParameter(args, 0, false);
            Object n = assignParameter(args, 1, false);
            Object name = null;
            ReferenceContainer i = new BasicReferenceContainer(null);
            name = "";
            for (i.setObject(0);
                    ZVal.isLessThan(i.getObject(), '<', n);
                    i.setObject(ZVal.increment(i.getObject()))) {
                name =
                        toStringR(name, env)
                                + toStringR(
                                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                                        env, this, Person.class)
                                                .method("randomElement")
                                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                                .call(pool)
                                                .value(),
                                        env);
            }

            return ZVal.assign(name);
        }

        @ConvertedMethod
        public Object firstNameMale(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
                            .method("randomName")
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
                                                            .zh_TW
                                                            .classes
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .characterMale,
                                    NamespaceGlobal.mt_rand.env(env).call(1, 2).value())
                            .value());
        }

        @ConvertedMethod
        public Object firstNameFemale(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
                            .method("randomName")
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
                                                            .zh_TW
                                                            .classes
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .characterFemale,
                                    NamespaceGlobal.mt_rand.env(env).call(1, 2).value())
                            .value());
        }

        @ConvertedMethod
        public Object suffix(RuntimeEnv env, Object... args) {
            return "";
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object idBirthplaceCode =
                ZVal.newArray(
                        new ZPair("A", 10),
                        new ZPair("B", 11),
                        new ZPair("C", 12),
                        new ZPair("D", 13),
                        new ZPair("E", 14),
                        new ZPair("F", 15),
                        new ZPair("G", 16),
                        new ZPair("H", 17),
                        new ZPair("I", 34),
                        new ZPair("J", 18),
                        new ZPair("K", 19),
                        new ZPair("M", 21),
                        new ZPair("N", 22),
                        new ZPair("O", 35),
                        new ZPair("p", 23),
                        new ZPair("Q", 24),
                        new ZPair("T", 27),
                        new ZPair("U", 28),
                        new ZPair("V", 29),
                        new ZPair("W", 32),
                        new ZPair("X", 30),
                        new ZPair("Z", 33));

        public Object idDigitValidator = ZVal.arrayFromList(1, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1);

        public Object maleNameFormats = ZVal.arrayFromList("{{lastName}}{{firstNameMale}}");

        public Object femaleNameFormats = ZVal.arrayFromList("{{lastName}}{{firstNameFemale}}");

        public Object titleMale =
                ZVal.arrayFromList("\u5148\u751F", "\u535A\u58EB", "\u6559\u6388");

        public Object titleFemale =
                ZVal.arrayFromList("\u5C0F\u59D0", "\u592A\u592A", "\u535A\u58EB", "\u6559\u6388");

        public Object lastName =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u8D99",
                                    "\u9322",
                                    "\u5B6B",
                                    "\u674E",
                                    "\u5468",
                                    "\u5433",
                                    "\u912D",
                                    "\u738B",
                                    "\u99AE",
                                    "\u9673",
                                    "\u891A",
                                    "\u885B",
                                    "\u8523",
                                    "\u6C88",
                                    "\u97D3",
                                    "\u694A",
                                    "\u6731",
                                    "\u79E6",
                                    "\u5C24",
                                    "\u8A31",
                                    "\u4F55",
                                    "\u5442",
                                    "\u65BD",
                                    "\u5F35",
                                    "\u5B54",
                                    "\u66F9",
                                    "\u56B4",
                                    "\u83EF",
                                    "\u91D1",
                                    "\u9B4F",
                                    "\u9676",
                                    "\u59DC",
                                    "\u621A",
                                    "\u8B1D",
                                    "\u9112",
                                    "\u55BB",
                                    "\u67CF",
                                    "\u6C34",
                                    "\u7AC7",
                                    "\u7AE0",
                                    "\u96F2",
                                    "\u8607",
                                    "\u6F58",
                                    "\u845B",
                                    "\u595A",
                                    "\u8303",
                                    "\u5F6D",
                                    "\u90CE",
                                    "\u9B6F",
                                    "\u97CB",
                                    "\u660C",
                                    "\u99AC",
                                    "\u82D7",
                                    "\u9CF3",
                                    "\u82B1",
                                    "\u65B9",
                                    "\u4FDE",
                                    "\u4EFB",
                                    "\u8881",
                                    "\u67F3",
                                    "\u9146",
                                    "\u9B91",
                                    "\u53F2",
                                    "\u5510",
                                    "\u8CBB",
                                    "\u5EC9",
                                    "\u5C91",
                                    "\u859B",
                                    "\u96F7",
                                    "\u8CC0",
                                    "\u502A",
                                    "\u6E6F",
                                    "\u6ED5",
                                    "\u6BB7",
                                    "\u7F85",
                                    "\u7562",
                                    "\u90DD",
                                    "\u9114",
                                    "\u5B89",
                                    "\u5E38",
                                    "\u6A02",
                                    "\u4E8E",
                                    "\u6642",
                                    "\u5085",
                                    "\u76AE",
                                    "\u535E",
                                    "\u9F4A",
                                    "\u5EB7",
                                    "\u4F0D",
                                    "\u4F59",
                                    "\u5143",
                                    "\u535C",
                                    "\u9867",
                                    "\u5B5F",
                                    "\u5E73",
                                    "\u9EC3",
                                    "\u548C",
                                    "\u7A46",
                                    "\u856D",
                                    "\u5C39",
                                    "\u59DA",
                                    "\u90B5",
                                    "\u6E5B",
                                    "\u6C6A",
                                    "\u7941",
                                    "\u6BDB",
                                    "\u79B9",
                                    "\u72C4",
                                    "\u7C73",
                                    "\u8C9D",
                                    "\u660E",
                                    "\u81E7",
                                    "\u8A08",
                                    "\u4F0F",
                                    "\u6210",
                                    "\u6234",
                                    "\u8AC7",
                                    "\u5B8B",
                                    "\u8305",
                                    "\u9F90",
                                    "\u718A",
                                    "\u7D00",
                                    "\u8212",
                                    "\u5C48",
                                    "\u9805",
                                    "\u795D",
                                    "\u8463",
                                    "\u6881",
                                    "\u675C",
                                    "\u962E",
                                    "\u85CD",
                                    "\u9594",
                                    "\u5E2D",
                                    "\u5B63",
                                    "\u9EBB",
                                    "\u5F37",
                                    "\u8CC8",
                                    "\u8DEF",
                                    "\u5A41",
                                    "\u5371",
                                    "\u6C5F",
                                    "\u7AE5",
                                    "\u984F",
                                    "\u90ED",
                                    "\u6885",
                                    "\u76DB",
                                    "\u6797",
                                    "\u5201",
                                    "\u937E",
                                    "\u5F90",
                                    "\u4E18",
                                    "\u99F1",
                                    "\u9AD8",
                                    "\u590F",
                                    "\u8521",
                                    "\u7530",
                                    "\u6A0A",
                                    "\u80E1",
                                    "\u51CC",
                                    "\u970D",
                                    "\u865E",
                                    "\u842C",
                                    "\u652F",
                                    "\u67EF",
                                    "\u661D",
                                    "\u7BA1",
                                    "\u76E7",
                                    "\u83AB",
                                    "\u7D93",
                                    "\u623F",
                                    "\u88D8",
                                    "\u7E46",
                                    "\u5E72",
                                    "\u89E3",
                                    "\u61C9",
                                    "\u5B97",
                                    "\u4E01",
                                    "\u5BA3",
                                    "\u8CC1",
                                    "\u9127",
                                    "\u90C1",
                                    "\u55AE",
                                    "\u676D",
                                    "\u6D2A",
                                    "\u5305",
                                    "\u8AF8",
                                    "\u5DE6",
                                    "\u77F3",
                                    "\u5D14",
                                    "\u5409",
                                    "\u9215",
                                    "\u9F94",
                                    "\u7A0B",
                                    "\u5D47",
                                    "\u90A2",
                                    "\u6ED1",
                                    "\u88F4",
                                    "\u9678",
                                    "\u69AE",
                                    "\u7FC1",
                                    "\u8340",
                                    "\u7F8A",
                                    "\u65BC",
                                    "\u60E0",
                                    "\u7504",
                                    "\u9EB4",
                                    "\u5BB6",
                                    "\u5C01",
                                    "\u82AE",
                                    "\u7FBF",
                                    "\u5132",
                                    "\u9773",
                                    "\u6C72",
                                    "\u90B4",
                                    "\u7CDC",
                                    "\u677E",
                                    "\u4E95",
                                    "\u6BB5",
                                    "\u5BCC",
                                    "\u5DEB",
                                    "\u70CF",
                                    "\u7126",
                                    "\u5DF4",
                                    "\u5F13",
                                    "\u7267",
                                    "\u9697",
                                    "\u5C71",
                                    "\u8C37",
                                    "\u8ECA",
                                    "\u4FAF",
                                    "\u5B93",
                                    "\u84EC",
                                    "\u5168",
                                    "\u90D7",
                                    "\u73ED",
                                    "\u4EF0",
                                    "\u79CB",
                                    "\u4EF2",
                                    "\u4F0A",
                                    "\u5BAE",
                                    "\u752F",
                                    "\u4EC7",
                                    "\u6B12",
                                    "\u66B4",
                                    "\u7518",
                                    "\u9204",
                                    "\u53B2",
                                    "\u620E",
                                    "\u7956",
                                    "\u6B66",
                                    "\u7B26",
                                    "\u5289",
                                    "\u666F",
                                    "\u8A79",
                                    "\u675F",
                                    "\u9F8D",
                                    "\u8449",
                                    "\u5E78",
                                    "\u53F8",
                                    "\u97F6",
                                    "\u90DC",
                                    "\u9ECE",
                                    "\u858A",
                                    "\u8584",
                                    "\u5370",
                                    "\u5BBF",
                                    "\u767D",
                                    "\u61F7",
                                    "\u84B2",
                                    "\u90B0",
                                    "\u5F9E",
                                    "\u9102",
                                    "\u7D22",
                                    "\u54B8",
                                    "\u7C4D",
                                    "\u8CF4",
                                    "\u5353",
                                    "\u85FA",
                                    "\u5C60",
                                    "\u8499",
                                    "\u6C60",
                                    "\u55AC",
                                    "\u9670",
                                    "\u9B31",
                                    "\u80E5",
                                    "\u80FD",
                                    "\u84BC",
                                    "\u96D9",
                                    "\u805E",
                                    "\u8398",
                                    "\u9EE8",
                                    "\u7FDF",
                                    "\u8B5A",
                                    "\u8CA2",
                                    "\u52DE",
                                    "\u9004",
                                    "\u59EC",
                                    "\u7533",
                                    "\u6276",
                                    "\u5835",
                                    "\u5189",
                                    "\u5BB0",
                                    "\u9148",
                                    "\u96CD",
                                    "\u90E4",
                                    "\u74A9",
                                    "\u6851",
                                    "\u6842",
                                    "\u6FEE",
                                    "\u725B",
                                    "\u58FD",
                                    "\u901A",
                                    "\u908A",
                                    "\u6248",
                                    "\u71D5",
                                    "\u5180",
                                    "\u90DF",
                                    "\u6D66",
                                    "\u5C1A",
                                    "\u8FB2",
                                    "\u6EAB",
                                    "\u5225",
                                    "\u838A",
                                    "\u664F",
                                    "\u67F4",
                                    "\u77BF",
                                    "\u95BB",
                                    "\u5145",
                                    "\u6155",
                                    "\u9023",
                                    "\u8339",
                                    "\u7FD2",
                                    "\u5BA6",
                                    "\u827E",
                                    "\u9B5A",
                                    "\u5BB9",
                                    "\u5411",
                                    "\u53E4",
                                    "\u6613",
                                    "\u614E",
                                    "\u6208",
                                    "\u5ED6",
                                    "\u5EBE",
                                    "\u7D42",
                                    "\u66A8",
                                    "\u5C45",
                                    "\u8861",
                                    "\u6B65",
                                    "\u90FD",
                                    "\u803F",
                                    "\u6EFF",
                                    "\u5F18",
                                    "\u5321",
                                    "\u570B",
                                    "\u6587",
                                    "\u5BC7",
                                    "\u5EE3",
                                    "\u797F",
                                    "\u95D5",
                                    "\u6771",
                                    "\u6B50",
                                    "\u6BB3",
                                    "\u6C83",
                                    "\u5229",
                                    "\u851A",
                                    "\u8D8A",
                                    "\u5914",
                                    "\u9686",
                                    "\u5E2B",
                                    "\u978F",
                                    "\u5399",
                                    "\u8076",
                                    "\u6641",
                                    "\u52FE",
                                    "\u6556",
                                    "\u878D",
                                    "\u51B7",
                                    "\u8A3E",
                                    "\u8F9B",
                                    "\u95DE",
                                    "\u90A3",
                                    "\u7C21",
                                    "\u9952",
                                    "\u7A7A",
                                    "\u66FE",
                                    "\u6BCB",
                                    "\u6C99",
                                    "\u4E5C",
                                    "\u990A",
                                    "\u97A0",
                                    "\u9808",
                                    "\u8C50",
                                    "\u5DE2",
                                    "\u95DC",
                                    "\u84AF",
                                    "\u76F8",
                                    "\u67E5",
                                    "\u540E",
                                    "\u834A",
                                    "\u7D05",
                                    "\u6E38",
                                    "\u7AFA",
                                    "\u6B0A",
                                    "\u902F",
                                    "\u84CB",
                                    "\u76CA",
                                    "\u6853",
                                    "\u516C",
                                    "\u4E07\u4FDF",
                                    "\u53F8\u99AC",
                                    "\u4E0A\u5B98",
                                    "\u6B50\u967D",
                                    "\u590F\u4FAF",
                                    "\u8AF8\u845B",
                                    "\u805E\u4EBA",
                                    "\u6771\u65B9",
                                    "\u8D6B\u9023",
                                    "\u7687\u752B",
                                    "\u5C09\u9072",
                                    "\u516C\u7F8A",
                                    "\u6FB9\u81FA",
                                    "\u516C\u51B6",
                                    "\u5B97\u653F",
                                    "\u6FEE\u967D",
                                    "\u6DF3\u4E8E",
                                    "\u55AE\u4E8E",
                                    "\u592A\u53D4",
                                    "\u7533\u5C60",
                                    "\u516C\u5B6B",
                                    "\u4EF2\u5B6B",
                                    "\u8ED2\u8F45",
                                    "\u4EE4\u72D0",
                                    "\u937E\u96E2",
                                    "\u5B87\u6587",
                                    "\u9577\u5B6B",
                                    "\u6155\u5BB9",
                                    "\u9BAE\u4E8E",
                                    "\u95AD\u4E18",
                                    "\u53F8\u5F92",
                                    "\u53F8\u7A7A",
                                    "\u4E93\u5B98",
                                    "\u53F8\u5BC7",
                                    "\u4EC9",
                                    "\u7763",
                                    "\u5B50\u8ECA",
                                    "\u9853\u5B6B",
                                    "\u7AEF\u6728",
                                    "\u5DEB\u99AC",
                                    "\u516C\u897F",
                                    "\u6F06\u96D5",
                                    "\u6A02\u6B63",
                                    "\u58E4\u99DF",
                                    "\u516C\u826F",
                                    "\u62D3\u8DCB",
                                    "\u593E\u8C37",
                                    "\u5BB0\u7236",
                                    "\u7A40\u6881",
                                    "\u6649",
                                    "\u695A",
                                    "\u9586",
                                    "\u6CD5",
                                    "\u6C5D",
                                    "\u9122",
                                    "\u6D82",
                                    "\u6B3D",
                                    "\u6BB5\u5E72",
                                    "\u767E\u91CC",
                                    "\u6771\u90ED",
                                    "\u5357\u9580",
                                    "\u547C\u5EF6",
                                    "\u6B78",
                                    "\u6D77",
                                    "\u7F8A\u820C",
                                    "\u5FAE\u751F",
                                    "\u5CB3",
                                    "\u5E25",
                                    "\u7DF1",
                                    "\u4EA2",
                                    "\u6CC1",
                                    "\u5F8C",
                                    "\u6709",
                                    "\u7434",
                                    "\u6881\u4E18",
                                    "\u5DE6\u4E18",
                                    "\u6771\u9580",
                                    "\u897F\u9580",
                                    "\u5546",
                                    "\u725F",
                                    "\u4F58",
                                    "\u4F74",
                                    "\u4F2F",
                                    "\u8CDE",
                                    "\u5357\u5BAE",
                                    "\u58A8",
                                    "\u54C8",
                                    "\u8B59",
                                    "\u7B2A",
                                    "\u5E74",
                                    "\u611B",
                                    "\u967D",
                                    "\u4F5F",
                                    "\u7B2C\u4E94",
                                    "\u8A00",
                                    "\u798F");
                        });

        public Object characterMale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u4F73", "\u4FCA", "\u4FE1", "\u5049", "\u5091", "\u51A0",
                                    "\u541B", "\u54F2", "\u5609", "\u5A01", "\u5B87", "\u5B89",
                                    "\u5B8F", "\u5B97", "\u5B9C", "\u5BB6", "\u5EAD", "\u5EF7",
                                    "\u5EFA", "\u5F65", "\u5FC3", "\u5FD7", "\u601D", "\u627F",
                                    "\u6587", "\u67CF", "\u6A3A", "\u744B", "\u7A4E", "\u7F8E",
                                    "\u7FF0", "\u83EF", "\u8A69", "\u8C6A", "\u8CE2", "\u8ED2",
                                    "\u9298", "\u9716");
                        });

        public Object characterFemale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u4F36", "\u4F69", "\u4F73", "\u4F9D", "\u5100", "\u51A0",
                                    "\u541B", "\u5609", "\u5982", "\u5A1F", "\u5A49", "\u5A77",
                                    "\u5B89", "\u5B9C", "\u5BB6", "\u5EAD", "\u5FC3", "\u601D",
                                    "\u6021", "\u60E0", "\u6167", "\u6587", "\u6B23", "\u6DB5",
                                    "\u6DD1", "\u73B2", "\u73CA", "\u742A", "\u742C", "\u745C",
                                    "\u7A4E", "\u7B51", "\u7B71", "\u7F8E", "\u82AC", "\u82B3",
                                    "\u83EF", "\u840D", "\u8431", "\u84C9", "\u8A69", "\u8C9E",
                                    "\u90C1", "\u923A", "\u96C5", "\u96EF", "\u975C", "\u99A8");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\zh_TW\\Person")
                    .setLookup(
                            Person.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "characterFemale",
                            "characterMale",
                            "femaleNameFormats",
                            "idBirthplaceCode",
                            "idDigitValidator",
                            "lastName",
                            "maleNameFormats",
                            "titleFemale",
                            "titleMale")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/zh_TW/Person.php")
                    .addExtendsClass("Faker\\Provider\\Person")
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
