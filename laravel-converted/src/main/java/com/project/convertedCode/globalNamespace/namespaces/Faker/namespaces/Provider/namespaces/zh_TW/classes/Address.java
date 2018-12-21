package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.zh_TW.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/zh_TW/Address.php

*/

public class Address
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .Address {

    public Address(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Address.class) {
            this.__construct(env, args);
        }
    }

    public Address(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object street(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
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
                                                                .zh_TW
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "street")))
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
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .street)
                        .value());
    }

    @ConvertedMethod
    public Object city(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object city = null;
        Object county = null;
        county =
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                        .method("randomElement")
                        .addReferenceArgs(
                                rLastRefArgs =
                                        new RuntimeArgsWithReferences()
                                                .add(
                                                        0,
                                                        handleReturnReference(
                                                                function_array_keys
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                env
                                                                                        .getRequestStaticProperties(
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
                                                                                                        .Address
                                                                                                        .RequestStaticProperties
                                                                                                        .class)
                                                                                        .city)
                                                                        .value())))
                        .call(rLastRefArgs.get(0))
                        .value();
        city =
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                        .method("randomElement")
                        .addReferenceArgs(
                                new RuntimeArgsWithReferences()
                                        .add(
                                                0,
                                                new ArrayDimensionReference(
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
                                                                                .Address
                                                                                .RequestStaticProperties
                                                                                .class)
                                                                .city,
                                                        county)))
                        .call(
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
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class,
                                                "city")
                                        .arrayGet(env, county))
                        .value();
        return ZVal.assign(toStringR(county, env) + toStringR(city, env));
    }

    @ConvertedMethod
    public Object state(RuntimeEnv env, Object... args) {
        return "\u81FA\u7063\u7701";
    }

    public static final Object CONST_class = "Faker\\Provider\\zh_TW\\Address";

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
                    .Address
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object randomChineseNumber(RuntimeEnv env, Object... args) {
            ReferenceContainer digits = new BasicReferenceContainer(null);
            digits.setObject(
                    ZVal.arrayFromList(
                            "", "\u4E00", "\u4E8C", "\u4E09", "\u56DB", "\u4E94", "\u516D",
                            "\u4E03", "\u516B", "\u4E5D"));
            return ZVal.assign(
                    digits.arrayGet(
                            env,
                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, Address.class)
                                    .method("randomDigitNotNull")
                                    .call()
                                    .value()));
        }

        @ConvertedMethod
        public Object randomNumber2(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    ZVal.add(
                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, Address.class)
                                    .method("randomNumber")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(2)
                                    .value(),
                            1));
        }

        @ConvertedMethod
        public Object randomNumber3(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    ZVal.add(
                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, Address.class)
                                    .method("randomNumber")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(3)
                                    .value(),
                            1));
        }

        @ConvertedMethod
        public Object localLatitude(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    NamespaceGlobal.number_format
                            .env(env)
                            .call(
                                    ZVal.divide(
                                            NamespaceGlobal.mt_rand
                                                    .env(env)
                                                    .call(22000000, 25000000)
                                                    .value(),
                                            1000000),
                                    6)
                            .value());
        }

        @ConvertedMethod
        public Object localLongitude(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    NamespaceGlobal.number_format
                            .env(env)
                            .call(
                                    ZVal.divide(
                                            NamespaceGlobal.mt_rand
                                                    .env(env)
                                                    .call(120000000, 122000000)
                                                    .value(),
                                            1000000),
                                    6)
                            .value());
        }

        @ConvertedMethod
        public Object stateAbbr(RuntimeEnv env, Object... args) {
            return "\u81FA";
        }

        @ConvertedMethod
        public Object cityPrefix(RuntimeEnv env, Object... args) {
            return "";
        }

        @ConvertedMethod
        public Object citySuffix(RuntimeEnv env, Object... args) {
            return "";
        }

        @ConvertedMethod
        public Object secondaryAddress(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    toStringR(
                                    ZVal.add(
                                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                                            env, this, Address.class)
                                                    .method("randomNumber")
                                                    .addReferenceArgs(
                                                            new RuntimeArgsWithReferences())
                                                    .call(2)
                                                    .value(),
                                            1),
                                    env)
                            + toStringR(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Address.class)
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
                                                                            .zh_TW
                                                                            .classes
                                                                            .Address
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .secondaryAddressSuffix)
                                            .value(),
                                    env));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object streetNameFormats =
                ZVal.arrayFromList(
                        "{{street}}{{streetSuffix}}",
                        "{{street}}{{streetSuffix}}{{randomChineseNumber}}\u6BB5");

        public Object streetAddressFormats =
                ZVal.arrayFromList(
                        "{{streetName}}{{randomNumber3}}\u865F",
                        "{{streetName}}{{randomNumber3}}\u865F{{randomNumber2}}\u6A13",
                        "{{streetName}}{{randomNumber3}}\u5DF7{{randomNumber3}}\u865F",
                        "{{streetName}}{{randomNumber3}}\u5DF7{{randomNumber3}}\u865F{{randomNumber2}}\u6A13",
                        "{{streetName}}{{randomNumber3}}\u5DF7{{randomNumber3}}\u5F04{{randomNumber3}}\u865F",
                        "{{streetName}}{{randomNumber3}}\u5DF7{{randomNumber3}}\u5F04{{randomNumber3}}\u865F{{randomNumber2}}\u6A13");

        public Object secondaryAddressSuffix = ZVal.arrayFromList("\u5BA4", "\u623F");

        public Object addressFormats = ZVal.arrayFromList("{{postcode}} {{city}}{{streetAddress}}");

        public Object streetSuffix = ZVal.arrayFromList("\u8DEF", "\u8857");

        public Object street =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u6771\u82F1\u4E8C",
                                    "\u5927\u516C\u5341\u4E09",
                                    "\u7F8E\u8853\u5357\u4E00",
                                    "\u6F01\u6E2F",
                                    "\u5FB7\u7F8E",
                                    "\u798F\u6797",
                                    "\u69AE\u5B89",
                                    "\u5FE0\u5B5D\u5357",
                                    "\u65B0\u7ACB",
                                    "\u6E05\u58FD",
                                    "\u8C50\u5049",
                                    "\u83EF\u4E2D\u4E09",
                                    "\u8CF4\u660E",
                                    "\u6A39\u4EC1\u4E8C",
                                    "\u6587\u840A",
                                    "\u51F1\u5F97",
                                    "\u514B\u6B66",
                                    "\u8C50\u76DB",
                                    "\u5E9C\u524D\u56DB",
                                    "\u662D\u5FB7",
                                    "\u9CF3\u4EC1",
                                    "\u5BCC\u6F01\u4E94",
                                    "\u708E\u5CF0\u8857\u9752\u5E74\u5DF7",
                                    "\u5317\u5712",
                                    "\u8859\u570B\u4E00",
                                    "\u4E94\u548C",
                                    "\u5357\u6751",
                                    "\u5927\u57D4\u4E94",
                                    "\u5927\u6709\u56DB",
                                    "\u592A\u5E73",
                                    "\u745E\u767C",
                                    "\u5927\u5B78\u4E8C\u5341\u516B",
                                    "\u5409\u8208\u516D",
                                    "\u8D64\u6771\u4E00",
                                    "\u5927\u5B78\u4E8C\u5341\u4E09",
                                    "\u9F8D\u5FB7",
                                    "\u660C\u6587",
                                    "\u5929\u4EC1\u5317",
                                    "\u8CE2\u597D",
                                    "\u5D07\u967D",
                                    "\u6885\u9F8D",
                                    "\u7F85\u539D\u5927\u5775\u6751\u4E5D\u6C5F",
                                    "\u798F\u93AE",
                                    "\u5929\u7389",
                                    "\u65B0\u5317\u4E00",
                                    "\u81E5\u9F8D",
                                    "\u5E73\u751F",
                                    "\u7887\u5167",
                                    "\u8859\u570B\u4E09",
                                    "\u6176\u8C50\u4E5D",
                                    "\u5BCC\u6F01\u4E8C",
                                    "\u516C\u8208",
                                    "\u5764\u6210",
                                    "\u6C11\u5BCC\u5341\u516D",
                                    "\u5149\u69AE\u5317",
                                    "\u8D64\u5D01\u6771",
                                    "\u4E0A\u9E92\u9E9F",
                                    "\u516C\u9928\u6751\u6771\u5E73",
                                    "\u5B89\u8239",
                                    "\u8C50\u8208",
                                    "\u4E09\u89D2",
                                    "\u8C50\u88E1\u4E8C",
                                    "\u5609\u8C50\u4E5D",
                                    "\u5F8C\u5354",
                                    "\u6C38\u6A02\u5357",
                                    "\u51B7\u6C34",
                                    "\u5FB7\u967D",
                                    "\u6C34\u6C74\u4E00",
                                    "\u5DE5\u660E\u4E00",
                                    "\u74B0\u5C71\u4E5D\u5982",
                                    "\u6C38\u69AE\u4E8C",
                                    "\u6E05\u6F6D",
                                    "\u571F\u5730\u516C\u5DBA",
                                    "\u6B66\u6DF5\u4E09",
                                    "\u6587\u838A",
                                    "\u9577\u5104\u6771\u4E09",
                                    "\u820A\u57CE\u6771",
                                    "\u5927\u653F",
                                    "\u7389\u8208",
                                    "\u6C38\u6625\u5357",
                                    "\u570B\u76DB\u516B",
                                    "\u5DE5\u696D\u5340\u4E8C\u5341\u56DB",
                                    "\u5317\u4E00",
                                    "\u6A02\u7FA4\u4E8C",
                                    "\u6771\u7887",
                                    "\u9F8D\u83EF\u5357",
                                    "\u69AE\u8C50",
                                    "\u5927\u8C50",
                                    "\u6953\u6C5F",
                                    "\u89C0\u5149\u8857\u516B\u9023",
                                    "\u4FDD\u8208\u4E8C",
                                    "\u5B89\u901A\u4E8C",
                                    "\u548C\u9806\u4E09",
                                    "\u5F70\u6FF1\u6771\u4E03",
                                    "\u9EBB\u5712\u516D",
                                    "\u4E0A\u6A39\u6751\u5317\u5BE7",
                                    "\u9999\u8CD3\u8857\u5F97\u6708\u5DF7",
                                    "\u5149\u5E73",
                                    "\u8ECA\u5B50",
                                    "\u5D07\u79AE",
                                    "\u570B\u6176",
                                    "\u963F\u7389",
                                    "\u4E2D\u8857",
                                    "\u540C\u5FC3\u4E00",
                                    "\u7E23\u653F\u5341\u516D",
                                    "\u5FB7\u6B63",
                                    "\u6FF1\u4E00",
                                    "\u5065\u884C\u5317",
                                    "\u5927\u7063\u4E03",
                                    "\u5927\u660E",
                                    "\u4E09\u591A\u4E94",
                                    "\u5BCC\u88D5\u4E09",
                                    "\u5712\u5357\u4E09",
                                    "\u5B89\u6A02\u56DB",
                                    "\u65B0\u5B89\u4E03",
                                    "\u6CB3\u5357\u6771\u56DB",
                                    "\u4E2D\u5751",
                                    "\u660E\u91CE",
                                    "\u79C0\u5CF0",
                                    "\u6EAA\u5FC3",
                                    "\u6383\u53ED\u9802\u4E00",
                                    "\u5FA9\u8208\u5357",
                                    "\u679C\u5CF0",
                                    "\u65B0\u8208\u4E09",
                                    "\u516C\u5B89",
                                    "\u677E\u667A\u4E09",
                                    "\u570B\u5BCC\u4E8C\u5341\u516B",
                                    "\u7406\u60F3",
                                    "\u6587\u5DE5\u5341\u4E8C",
                                    "\u5927\u7AF9\u4E8C",
                                    "\u540D\u5C71\u516D",
                                    "\u6587\u83EF\u4E00",
                                    "\u6A39\u4EC1",
                                    "\u7E23\u653F\u516D",
                                    "\u6CF0\u6210",
                                    "\u6CB3\u6FF1",
                                    "\u5FB7\u5409",
                                    "\u7AF9\u6797",
                                    "\u5BCC\u53F0\u6771",
                                    "\u6771\u6CF0\u4E8C",
                                    "\u8336\u5C08\u4E8C",
                                    "\u6D77\u5EB7",
                                    "\u5EE3\u5B89\u4E8C",
                                    "\u8ECD\u798F\u5341\u516B",
                                    "\u5317\u6587",
                                    "\u65B0\u8208\u6D77\u57D4\u5730\u4E94",
                                    "\u79C0\u9686",
                                    "\u798F\u5FB7\u5357",
                                    "\u91CD\u5316",
                                    "\u5927\u5B89\u6E2F",
                                    "\u6771\u82F1\u4E09",
                                    "\u7CBE\u660E\u4E00",
                                    "\u5BF6\u5F37",
                                    "\u6CF0\u660C\u4E94",
                                    "\u7ACB\u529F",
                                    "\u6587\u660E\u4E00",
                                    "\u798F\u5409\u4E00",
                                    "\u8208\u7AF9",
                                    "\u5FB7\u6CC9",
                                    "\u4E2D\u6B63\u516D",
                                    "\u5DE5\u516B",
                                    "\u9E7D\u57D5\u5DF7\u4E09\u6C74",
                                    "\u9F8D\u5929",
                                    "\u529F\u5B89\u4E00",
                                    "\u708E\u5CF0",
                                    "\u8DEF\u79D1\u4E00",
                                    "\u6D77\u660E",
                                    "\u50D1\u548C",
                                    "\u677E\u5EC9",
                                    "\u798F\u8C50\u5357",
                                    "\u5357\u5712",
                                    "\u5B5D\u9806",
                                    "\u5BCC\u5F37",
                                    "\u4FDD\u5B9A\u4E00",
                                    "\u746A\u92C9\u9802",
                                    "\u5609\u8208",
                                    "\u7ACB\u5FB7\u56DB",
                                    "\u4E2D\u8ECA",
                                    "\u967D\u6771\u71DF\u5340\u5FE0\u4E09",
                                    "\u798F\u4E2D\u4E5D",
                                    "\u6771\u5341\u4E8C",
                                    "\u9802\u6E56\u4E94",
                                    "\u6CD5\u9662\u524D",
                                    "\u897F\u6D77",
                                    "\u58EB\u6797",
                                    "\u5317\u6FF1",
                                    "\u5BCC\u8FB2\u4E00",
                                    "\u539A\u5317",
                                    "\u5168\u798F",
                                    "\u5E73\u65B0\u4E00",
                                    "\u96C6\u9E7F\u5357",
                                    "\u5409\u5229\u516D",
                                    "\u5CA9\u7063",
                                    "\u65B0\u57FA",
                                    "\u79BE\u8C50\u4E8C",
                                    "\u6771\u89D2",
                                    "\u9752\u5CF6\u4E00",
                                    "\u52E2\u6797\u8857\u99A8\u5712\u4E00\u5DF7",
                                    "\u798F\u967D",
                                    "\u6587\u5357\u4E00",
                                    "\u6DB5\u78A7",
                                    "\u9326\u7530",
                                    "\u570B\u8CE2\u4E00",
                                    "\u5317\u7965",
                                    "\u65B0\u6210",
                                    "\u5149\u69AE\u6771",
                                    "\u4E09\u9DAF",
                                    "\u5927\u901A\u4E00",
                                    "\u5E73\u83C1",
                                    "\u7518\u8085\u4E8C",
                                    "\u53E4\u8CC0",
                                    "\u65B0\u5317\u516D",
                                    "\u5927\u5E84\u6751\u7530\u4E2D",
                                    "\u56DB\u5206\u5B50",
                                    "\u6587\u4E09\u4E00",
                                    "\u7AD9\u524D\u8857\u9435\u8DEF\u5357\u820D",
                                    "\u65B0\u5317\u4E8C",
                                    "\u6953\u6797\u5341",
                                    "\u4E2D\u5317\u4E8C",
                                    "\u5317\u5B89\u4E09",
                                    "\u4E2D\u83EF\u5357",
                                    "\u5149\u83EF\u897F",
                                    "\u5BE7\u590F\u6771\u4E8C",
                                    "\u6A39\u5FB7",
                                    "\u516B\u5FB7\u4E2D",
                                    "\u6587\u9928",
                                    "\u6B63\u82F1\u516B",
                                    "\u5927\u516C\u5341\u4E03",
                                    "\u9285\u79D1\u5357",
                                    "\u9577\u58FD\u4E09",
                                    "\u6F22\u7FD4",
                                    "\u592A\u5E73\u5341\u4E5D",
                                    "\u5B9C\u5E73",
                                    "\u7CBE\u6B66",
                                    "\u9F0E\u91D1\u4E2D",
                                    "\u93AE\u539F",
                                    "\u660E\u7FA9\u4E00",
                                    "\u65B0\u70CF",
                                    "\u862D\u6D32\u8857\u4E09\u758A\u6EAA",
                                    "\u516D\u5BB6\u516B",
                                    "\u5357\u52E2\u5751",
                                    "\u5DE5\u696D\u6771\u516D",
                                    "\u56DB\u5E73",
                                    "\u7518\u8085",
                                    "\u6C38\u5EB7",
                                    "\u96D9\u5341",
                                    "\u5927\u5730",
                                    "\u4E2D\u967D\u6771",
                                    "\u7ACB\u83EF",
                                    "\u7DAD\u63DA",
                                    "\u592A\u539F\u4E09",
                                    "\u6C34\u6E90",
                                    "\u91CD\u7ACB",
                                    "\u6C11\u4E3B\u56DB",
                                    "\u5357\u798F",
                                    "\u93AE\u570B",
                                    "\u6C38\u52DD",
                                    "\u65B0\u83EF",
                                    "\u67EF\u6797\u65B0",
                                    "\u5357\u6A4B\u4E00",
                                    "\u5927\u516C\u5341\u56DB",
                                    "\u52DD\u5229\u4E03",
                                    "\u4E09\u548C\u4E8C",
                                    "\u6771\u5E84",
                                    "\u6587\u532F",
                                    "\u4E2D\u65B0\u4E00",
                                    "\u677E\u4FE1\u4E00",
                                    "\u5BF6\u541B",
                                    "\u5E73\u5B89\u5357",
                                    "\u6587\u5B78",
                                    "\u5927\u83EF\u4E94",
                                    "\u884C\u7FA9",
                                    "\u767E\u4E94",
                                    "\u8349\u8859\u4E2D",
                                    "\u5609\u7965\u4E94",
                                    "\u5E73\u7B49",
                                    "\u5149\u7F8E",
                                    "\u6210\u529F\u5341\u516D",
                                    "\u7CBE\u8AA0\u4E09",
                                    "\u6C34\u7F8E",
                                    "\u6587\u5316\u5341",
                                    "\u6C11\u6B0A\u6771",
                                    "\u5927\u6176",
                                    "\u6E90\u6CC9",
                                    "\u6587\u6210\u5317",
                                    "\u5927\u576A\u4E94",
                                    "\u5149\u83EF\u516D",
                                    "\u7389\u6E05\u4E8C",
                                    "\u9F8D\u9CF3",
                                    "\u4E0A\u5C71\u4E8C",
                                    "\u897F\u5341\u56DB",
                                    "\u6587\u5EB7",
                                    "\u5D07\u5FB7\u5341\u4E8C",
                                    "\u5929\u6CC9\u4E00",
                                    "\u65B0\u5E84",
                                    "\u829D\u9EBB\u4E94",
                                    "\u4E2D\u5C71\u897F",
                                    "\u9577\u6625",
                                    "\u4E2D\u4E00",
                                    "\u516B\u5F35\u4E8C",
                                    "\u5609\u5B89\u516B",
                                    "\u6210\u5FB7\u4E5D",
                                    "\u4E09\u6751",
                                    "\u5FE0\u5B5D\u6771",
                                    "\u907C\u5317",
                                    "\u5F90\u5DDE\u4E00",
                                    "\u5F90\u5DDE\u4E94",
                                    "\u516D\u5F35",
                                    "\u4E2D\u897F",
                                    "\u5927\u5E73",
                                    "\u9806\u8208",
                                    "\u65B0\u5C55",
                                    "\u5357\u6FB3\u5357",
                                    "\u5409\u5229\u56DB",
                                    "\u4E45\u5B89\u4E8C",
                                    "\u6597\u516D\u4E94",
                                    "\u767B\u5C71",
                                    "\u8CB4\u6797",
                                    "\u6850\u7AF9",
                                    "\u793E\u6597",
                                    "\u4E2D\u6A02",
                                    "\u5C71\u6E56\u4E8C",
                                    "\u9577\u5712\u4E8C",
                                    "\u57E4\u5C3E",
                                    "\u61C9\u5316",
                                    "\u6C34\u7893\u4E8C",
                                    "\u5DBA\u9802\u4E5D\u5206",
                                    "\u4E2D\u548C",
                                    "\u5E78\u798F\u4E94",
                                    "\u9577\u5B89\u6771",
                                    "\u611B\u5BCC\u4E8C\u8857\u539A\u751F\u5DF7",
                                    "\u5D07\u5FB7\u4E09",
                                    "\u7532\u6A39",
                                    "\u7BE4\u4FE1",
                                    "\u91D1\u9F8D\u4E8C",
                                    "\u70BA\u96A8\u6771",
                                    "\u660E\u9CF3\u4E94",
                                    "\u8349\u6E56\u6751\u4EC1\u611B",
                                    "\u81F3\u5E73",
                                    "\u60DF\u99A8",
                                    "\u6FC3\u516C",
                                    "\u932B\u5B89",
                                    "\u4E2D\u5E84\u6771",
                                    "\u4FDD\u9806",
                                    "\u9F8D\u6A4B",
                                    "\u6587\u4E8C\u4E09",
                                    "\u901A\u660E",
                                    "\u6771\u4FE1",
                                    "\u79C0\u798F",
                                    "\u5149\u69AE",
                                    "\u68D2\u7403\u4E09",
                                    "\u7ACB\u9054",
                                    "\u9577\u6A02\u4E94",
                                    "\u6C38\u5B89",
                                    "\u700B\u967D",
                                    "\u6587\u5B8F\u4E00",
                                    "\u6597\u82D1",
                                    "\u65B0\u8208\u4E8C",
                                    "\u65B0\u4E94",
                                    "\u79D1\u96C5\u516D",
                                    "\u9752\u57D4\u516B",
                                    "\u6C38\u5B89\u6771",
                                    "\u884C\u5FE0",
                                    "\u6885\u4EAD\u6771",
                                    "\u4FDD\u69AE",
                                    "\u570B\u5BCC\u4E8C\u5341\u516D",
                                    "\u81EA\u5F37\u4E5D",
                                    "\u5B78\u9032",
                                    "\u7DDA\u6771",
                                    "\u4E2D\u8208\u4E8C",
                                    "\u67EF\u6797\u4E03",
                                    "\u570B\u76DB\u4E09",
                                    "\u5E73\u5B89",
                                    "\u91CD\u5EFA",
                                    "\u81E5\u9F8D",
                                    "\u677E\u6587",
                                    "\u82B1\u79C0",
                                    "\u592A\u539F\u56DB",
                                    "\u5317\u9580",
                                    "\u65B0\u751F\u4E09",
                                    "\u82B1\u65D7",
                                    "\u5927\u6E90\u5341\u4E5D",
                                    "\u5149\u83EF\u5341",
                                    "\u5167\u6C5F",
                                    "\u57D4\u8208",
                                    "\u829D\u67CF\u4E00",
                                    "\u5E9C\u4E2D",
                                    "\u4E7E\u8208",
                                    "\u83EF\u5EC8",
                                    "\u9577\u57E4",
                                    "\u65B0\u5BCC",
                                    "\u5C71\u660E",
                                    "\u57CE\u4E2D\u4E94",
                                    "\u5BCC\u88D5\u5341\u4E03",
                                    "\u4FEE\u660E",
                                    "\u8D0A\u5E84\u5927\u4EC1",
                                    "\u4E09\u548C",
                                    "\u79D1\u5927\u4E00",
                                    "\u5149\u5DDE\u4E00",
                                    "\u5E73\u7B49\u5341\u4E8C",
                                    "\u65B0\u5BEE\u4E00",
                                    "\u6771\u6797\u6771",
                                    "\u6C38\u65B0\u4E8C",
                                    "\u9802\u6A6B",
                                    "\u6771\u9580",
                                    "\u77F3\u5712",
                                    "\u5BF6\u6DF1",
                                    "\u9577\u9752",
                                    "\u91D1\u92D2\u4E00",
                                    "\u798F\u58FD",
                                    "\u9023\u96F2",
                                    "\u81EA\u7ACB\u4E8C",
                                    "\u5317\u8FB0\u4E00",
                                    "\u677E\u4E09",
                                    "\u5609\u6734",
                                    "\u93AE\u65B0\u4E8C",
                                    "\u838A\u656C",
                                    "\u4E2D\u8208\u5341",
                                    "\u5FE0\u660E\u4E03",
                                    "\u798F\u8208\u516B",
                                    "\u4E2D\u5FC3",
                                    "\u6D77\u53E3\u5317",
                                    "\u5DE5\u696D\u4E09",
                                    "\u5927\u5F18\u4E00",
                                    "\u89AA\u6C11",
                                    "\u82B3\u6A02",
                                    "\u8D64\u5D01\u5357",
                                    "\u6587\u958B",
                                    "\u4E94\u6B0A\u897F",
                                    "\u65B0\u8208\u6D77\u57D4\u5730\u4E09",
                                    "\u83EF\u6CF0\u4E00",
                                    "\u6587\u6F84",
                                    "\u4E2D\u5C71\u897F",
                                    "\u5D07\u5FB7\u4E8C\u5341\u4E5D",
                                    "\u5167\u5B9A\u4E03",
                                    "\u65B0\u57FA\u5317",
                                    "\u5357\u6FB3",
                                    "\u5C1A\u5FB7",
                                    "\u5F8C\u6E2F\u4E00",
                                    "\u897F\u5EFA",
                                    "\u529B\u884C\u4E94",
                                    "\u4E2D\u592E\u4E03",
                                    "\u82D3\u5B89",
                                    "\u88D5\u9686",
                                    "\u5E03\u897F",
                                    "\u9E7D\u7530",
                                    "\u5EFA\u570B\u5357",
                                    "\u9806\u8208",
                                    "\u671D\u5949",
                                    "\u8CDC\u5B89",
                                    "\u5D07\u5FB7\u5341\u516B",
                                    "\u9802\u5E84",
                                    "\u798F\u71DF",
                                    "\u5DE5\u696D\u4E8C\u5341",
                                    "\u5F90\u5DDE\u56DB",
                                    "\u9F0E\u611B",
                                    "\u9999\u6AB3\u4E8C",
                                    "\u7AF9\u793E",
                                    "\u60E0\u4E2D\u4E00",
                                    "\u91CD\u4EC1",
                                    "\u5FB7\u798F",
                                    "\u540C\u6E90",
                                    "\u4E0B\u838A\u65B0\u751F",
                                    "\u5EE3\u660E",
                                    "\u660E\u4EC1\u4E00",
                                    "\u4E2D\u6B63\u6771",
                                    "\u9CF3\u5C3E",
                                    "\u6FDF\u5357",
                                    "\u5FA9\u83EF\u56DB",
                                    "\u65B0\u57FA\u5357",
                                    "\u6F6D\u5DE5\u4E00",
                                    "\u5B78\u4E09",
                                    "\u9F8D\u5584\u4E8C",
                                    "\u516D\u8DEF\u4E03",
                                    "\u74B0\u7F8E",
                                    "\u5EFA\u8208\u4E09",
                                    "\u798F\u9326",
                                    "\u6C38\u7FA9\u4E5D",
                                    "\u548C\u7965\u4E03",
                                    "\u6F01\u6E2F\u4E2D\u4E00",
                                    "\u6A39\u6797\u516D",
                                    "\u6771\u4FE1",
                                    "\u58FD\u798F",
                                    "\u9CF3\u6960",
                                    "\u4E94\u798F\u516D",
                                    "\u5927\u6E90\u4E8C\u5341",
                                    "\u5357\u52E2\u5341",
                                    "\u4E2D\u6E2F\u4E09",
                                    "\u5C0F\u5751",
                                    "\u52DD\u5229\u5341\u4E94",
                                    "\u8001\u5438",
                                    "\u93AE\u65B0\u4E94",
                                    "\u540D\u6C34",
                                    "\u8607\u6E2F",
                                    "\u6AFB\u57CE\u4E09",
                                    "\u88D5\u5B5D\u4E09",
                                    "\u7A3B\u9999\u4E94",
                                    "\u8C50\u6E90",
                                    "\u5927\u529F",
                                    "\u965C\u897F");
                        });

        public Object city =
                ZVal.newArray(
                        new ZPair(
                                "\u65B0\u5317\u5E02",
                                ZVal.arrayFromLambdaExpression(
                                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                        () -> {
                                            return ZVal.arrayFromList(
                                                    "\u677F\u6A4B\u5340",
                                                    "\u4E09\u91CD\u5340",
                                                    "\u4E2D\u548C\u5340",
                                                    "\u6C38\u548C\u5340",
                                                    "\u65B0\u838A\u5340",
                                                    "\u65B0\u5E97\u5340",
                                                    "\u6A39\u6797\u5340",
                                                    "\u9DAF\u6B4C\u5340",
                                                    "\u4E09\u5CFD\u5340",
                                                    "\u6DE1\u6C34\u5340",
                                                    "\u6C50\u6B62\u5340",
                                                    "\u745E\u82B3\u5340",
                                                    "\u571F\u57CE\u5340",
                                                    "\u8606\u6D32\u5340",
                                                    "\u4E94\u80A1\u5340",
                                                    "\u6CF0\u5C71\u5340",
                                                    "\u6797\u53E3\u5340",
                                                    "\u6DF1\u5751\u5340",
                                                    "\u77F3\u7887\u5340",
                                                    "\u576A\u6797\u5340",
                                                    "\u4E09\u829D\u5340",
                                                    "\u77F3\u9580\u5340",
                                                    "\u516B\u91CC\u5340",
                                                    "\u5E73\u6EAA\u5340",
                                                    "\u96D9\u6EAA\u5340",
                                                    "\u8CA2\u5BEE\u5340",
                                                    "\u91D1\u5C71\u5340",
                                                    "\u842C\u91CC\u5340",
                                                    "\u70CF\u4F86\u5340");
                                        })),
                        new ZPair(
                                "\u5B9C\u862D\u7E23",
                                ZVal.arrayFromList(
                                        "\u5B9C\u862D\u5E02",
                                        "\u7F85\u6771\u93AE",
                                        "\u8607\u6FB3\u93AE",
                                        "\u982D\u57CE\u93AE",
                                        "\u7901\u6EAA\u9109",
                                        "\u58EF\u570D\u9109",
                                        "\u54E1\u5C71\u9109",
                                        "\u51AC\u5C71\u9109",
                                        "\u4E94\u7D50\u9109",
                                        "\u4E09\u661F\u9109",
                                        "\u5927\u540C\u9109",
                                        "\u5357\u6FB3\u9109")),
                        new ZPair(
                                "\u6843\u5712\u7E23",
                                ZVal.arrayFromList(
                                        "\u6843\u5712\u5E02",
                                        "\u4E2D\u58E2\u5E02",
                                        "\u5927\u6EAA\u93AE",
                                        "\u694A\u6885\u93AE",
                                        "\u8606\u7AF9\u9109",
                                        "\u5927\u5712\u9109",
                                        "\u9F9C\u5C71\u9109",
                                        "\u516B\u5FB7\u5E02",
                                        "\u9F8D\u6F6D\u9109",
                                        "\u5E73\u93AE\u5E02",
                                        "\u65B0\u5C4B\u9109",
                                        "\u89C0\u97F3\u9109",
                                        "\u5FA9\u8208\u9109")),
                        new ZPair(
                                "\u65B0\u7AF9\u7E23",
                                ZVal.arrayFromList(
                                        "\u7AF9\u5317\u5E02",
                                        "\u7AF9\u6771\u93AE",
                                        "\u65B0\u57D4\u93AE",
                                        "\u95DC\u897F\u93AE",
                                        "\u6E56\u53E3\u9109",
                                        "\u65B0\u8C50\u9109",
                                        "\u828E\u6797\u9109",
                                        "\u6A6B\u5C71\u9109",
                                        "\u5317\u57D4\u9109",
                                        "\u5BF6\u5C71\u9109",
                                        "\u5CE8\u7709\u9109",
                                        "\u5C16\u77F3\u9109",
                                        "\u4E94\u5CF0\u9109")),
                        new ZPair(
                                "\u82D7\u6817\u7E23",
                                ZVal.arrayFromList(
                                        "\u82D7\u6817\u5E02",
                                        "\u82D1\u88E1\u93AE",
                                        "\u901A\u9704\u93AE",
                                        "\u7AF9\u5357\u93AE",
                                        "\u982D\u4EFD\u93AE",
                                        "\u5F8C\u9F8D\u93AE",
                                        "\u5353\u862D\u93AE",
                                        "\u5927\u6E56\u9109",
                                        "\u516C\u9928\u9109",
                                        "\u9285\u947C\u9109",
                                        "\u5357\u5E84\u9109",
                                        "\u982D\u5C4B\u9109",
                                        "\u4E09\u7FA9\u9109",
                                        "\u897F\u6E56\u9109",
                                        "\u9020\u6A4B\u9109",
                                        "\u4E09\u7063\u9109",
                                        "\u7345\u6F6D\u9109",
                                        "\u6CF0\u5B89\u9109")),
                        new ZPair(
                                "\u81FA\u4E2D\u5E02",
                                ZVal.arrayFromLambdaExpression(
                                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                        () -> {
                                            return ZVal.arrayFromList(
                                                    "\u8C50\u539F\u5340",
                                                    "\u6771\u52E2\u5340",
                                                    "\u5927\u7532\u5340",
                                                    "\u6E05\u6C34\u5340",
                                                    "\u6C99\u9E7F\u5340",
                                                    "\u68A7\u68F2\u5340",
                                                    "\u540E\u91CC\u5340",
                                                    "\u795E\u5CA1\u5340",
                                                    "\u6F6D\u5B50\u5340",
                                                    "\u5927\u96C5\u5340",
                                                    "\u65B0\u793E\u5340",
                                                    "\u77F3\u5CA1\u5340",
                                                    "\u5916\u57D4\u5340",
                                                    "\u5927\u5B89\u5340",
                                                    "\u70CF\u65E5\u5340",
                                                    "\u5927\u809A\u5340",
                                                    "\u9F8D\u4E95\u5340",
                                                    "\u9727\u5CF0\u5340",
                                                    "\u592A\u5E73\u5340",
                                                    "\u5927\u91CC\u5340",
                                                    "\u548C\u5E73\u5340",
                                                    "\u4E2D\u5340",
                                                    "\u6771\u5340",
                                                    "\u5357\u5340",
                                                    "\u897F\u5340",
                                                    "\u5317\u5340",
                                                    "\u897F\u5C6F\u5340",
                                                    "\u5357\u5C6F\u5340",
                                                    "\u5317\u5C6F\u5340");
                                        })),
                        new ZPair(
                                "\u5F70\u5316\u7E23",
                                ZVal.arrayFromLambdaExpression(
                                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                        () -> {
                                            return ZVal.arrayFromList(
                                                    "\u5F70\u5316\u5E02",
                                                    "\u9E7F\u6E2F\u93AE",
                                                    "\u548C\u7F8E\u93AE",
                                                    "\u7DDA\u897F\u9109",
                                                    "\u4F38\u6E2F\u9109",
                                                    "\u798F\u8208\u9109",
                                                    "\u79C0\u6C34\u9109",
                                                    "\u82B1\u58C7\u9109",
                                                    "\u82AC\u5712\u9109",
                                                    "\u54E1\u6797\u93AE",
                                                    "\u6EAA\u6E56\u93AE",
                                                    "\u7530\u4E2D\u93AE",
                                                    "\u5927\u6751\u9109",
                                                    "\u57D4\u9E7D\u9109",
                                                    "\u57D4\u5FC3\u9109",
                                                    "\u6C38\u9756\u9109",
                                                    "\u793E\u982D\u9109",
                                                    "\u4E8C\u6C34\u9109",
                                                    "\u5317\u6597\u93AE",
                                                    "\u4E8C\u6797\u93AE",
                                                    "\u7530\u5C3E\u9109",
                                                    "\u57E4\u982D\u9109",
                                                    "\u82B3\u82D1\u9109",
                                                    "\u5927\u57CE\u9109",
                                                    "\u7AF9\u5858\u9109",
                                                    "\u6EAA\u5DDE\u9109");
                                        })),
                        new ZPair(
                                "\u5357\u6295\u7E23",
                                ZVal.arrayFromList(
                                        "\u5357\u6295\u5E02",
                                        "\u57D4\u91CC\u93AE",
                                        "\u8349\u5C6F\u93AE",
                                        "\u7AF9\u5C71\u93AE",
                                        "\u96C6\u96C6\u93AE",
                                        "\u540D\u9593\u9109",
                                        "\u9E7F\u8C37\u9109",
                                        "\u4E2D\u5BEE\u9109",
                                        "\u9B5A\u6C60\u9109",
                                        "\u570B\u59D3\u9109",
                                        "\u6C34\u91CC\u9109",
                                        "\u4FE1\u7FA9\u9109",
                                        "\u4EC1\u611B\u9109")),
                        new ZPair(
                                "\u96F2\u6797\u7E23",
                                ZVal.arrayFromList(
                                        "\u6597\u516D\u5E02",
                                        "\u6597\u5357\u93AE",
                                        "\u864E\u5C3E\u93AE",
                                        "\u897F\u87BA\u93AE",
                                        "\u571F\u5EAB\u93AE",
                                        "\u5317\u6E2F\u93AE",
                                        "\u53E4\u5751\u9109",
                                        "\u5927\u57E4\u9109",
                                        "\u83BF\u6850\u9109",
                                        "\u6797\u5167\u9109",
                                        "\u4E8C\u5D19\u9109",
                                        "\u5D19\u80CC\u9109",
                                        "\u9EA5\u5BEE\u9109",
                                        "\u6771\u52E2\u9109",
                                        "\u8912\u5FE0\u9109",
                                        "\u81FA\u897F\u9109",
                                        "\u5143\u9577\u9109",
                                        "\u56DB\u6E56\u9109",
                                        "\u53E3\u6E56\u9109",
                                        "\u6C34\u6797\u9109")),
                        new ZPair(
                                "\u5609\u7FA9\u7E23",
                                ZVal.arrayFromList(
                                        "\u592A\u4FDD\u5E02",
                                        "\u6734\u5B50\u5E02",
                                        "\u5E03\u888B\u93AE",
                                        "\u5927\u6797\u93AE",
                                        "\u6C11\u96C4\u9109",
                                        "\u6EAA\u53E3\u9109",
                                        "\u65B0\u6E2F\u9109",
                                        "\u516D\u8173\u9109",
                                        "\u6771\u77F3\u9109",
                                        "\u7FA9\u7AF9\u9109",
                                        "\u9E7F\u8349\u9109",
                                        "\u6C34\u4E0A\u9109",
                                        "\u4E2D\u57D4\u9109",
                                        "\u7AF9\u5D0E\u9109",
                                        "\u6885\u5C71\u9109",
                                        "\u756A\u8DEF\u9109",
                                        "\u5927\u57D4\u9109",
                                        "\u963F\u91CC\u5C71\u9109")),
                        new ZPair(
                                "\u81FA\u5357\u5E02",
                                ZVal.arrayFromLambdaExpression(
                                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                        () -> {
                                            return ZVal.arrayFromList(
                                                    "\u65B0\u71DF\u5340",
                                                    "\u9E7D\u6C34\u5340",
                                                    "\u767D\u6CB3\u5340",
                                                    "\u67F3\u71DF\u5340",
                                                    "\u5F8C\u58C1\u5340",
                                                    "\u6771\u5C71\u5340",
                                                    "\u9EBB\u8C46\u5340",
                                                    "\u4E0B\u71DF\u5340",
                                                    "\u516D\u7532\u5340",
                                                    "\u5B98\u7530\u5340",
                                                    "\u5927\u5167\u5340",
                                                    "\u4F73\u91CC\u5340",
                                                    "\u5B78\u7532\u5340",
                                                    "\u897F\u6E2F\u5340",
                                                    "\u4E03\u80A1\u5340",
                                                    "\u5C07\u8ECD\u5340",
                                                    "\u5317\u9580\u5340",
                                                    "\u65B0\u5316\u5340",
                                                    "\u5584\u5316\u5340",
                                                    "\u65B0\u5E02\u5340",
                                                    "\u5B89\u5B9A\u5340",
                                                    "\u5C71\u4E0A\u5340",
                                                    "\u7389\u4E95\u5340",
                                                    "\u6960\u897F\u5340",
                                                    "\u5357\u5316\u5340",
                                                    "\u5DE6\u93AE\u5340",
                                                    "\u4EC1\u5FB7\u5340",
                                                    "\u6B78\u4EC1\u5340",
                                                    "\u95DC\u5EDF\u5340",
                                                    "\u9F8D\u5D0E\u5340",
                                                    "\u6C38\u5EB7\u5340",
                                                    "\u6771\u5340",
                                                    "\u5357\u5340",
                                                    "\u897F\u5340",
                                                    "\u5317\u5340",
                                                    "\u4E2D\u5340",
                                                    "\u5B89\u5357\u5340",
                                                    "\u5B89\u5E73\u5340");
                                        })),
                        new ZPair(
                                "\u9AD8\u96C4\u5E02",
                                ZVal.arrayFromLambdaExpression(
                                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                        () -> {
                                            return ZVal.arrayFromList(
                                                    "\u9CF3\u5C71\u5340",
                                                    "\u6797\u5712\u5340",
                                                    "\u5927\u5BEE\u5340",
                                                    "\u5927\u6A39\u5340",
                                                    "\u5927\u793E\u5340",
                                                    "\u4EC1\u6B66\u5340",
                                                    "\u9CE5\u677E\u5340",
                                                    "\u5CA1\u5C71\u5340",
                                                    "\u6A4B\u982D\u5340",
                                                    "\u71D5\u5DE2\u5340",
                                                    "\u7530\u5BEE\u5340",
                                                    "\u963F\u84EE\u5340",
                                                    "\u8DEF\u7AF9\u5340",
                                                    "\u6E56\u5167\u5340",
                                                    "\u8304\u8423\u5340",
                                                    "\u6C38\u5B89\u5340",
                                                    "\u5F4C\u9640\u5340",
                                                    "\u6893\u5B98\u5340",
                                                    "\u65D7\u5C71\u5340",
                                                    "\u7F8E\u6FC3\u5340",
                                                    "\u516D\u9F9C\u5340",
                                                    "\u7532\u4ED9\u5340",
                                                    "\u6749\u6797\u5340",
                                                    "\u5167\u9580\u5340",
                                                    "\u8302\u6797\u5340",
                                                    "\u6843\u6E90\u5340",
                                                    "\u4E09\u6C11\u5340",
                                                    "\u9E7D\u57D5\u5340",
                                                    "\u9F13\u5C71\u5340",
                                                    "\u5DE6\u71DF\u5340",
                                                    "\u6960\u6893\u5340",
                                                    "\u4E09\u6C11\u5340",
                                                    "\u65B0\u8208\u5340",
                                                    "\u524D\u91D1\u5340",
                                                    "\u82D3\u96C5\u5340",
                                                    "\u524D\u93AE\u5340",
                                                    "\u65D7\u6D25\u5340",
                                                    "\u5C0F\u6E2F\u5340");
                                        })),
                        new ZPair(
                                "\u5C4F\u6771\u7E23",
                                ZVal.arrayFromLambdaExpression(
                                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                        () -> {
                                            return ZVal.arrayFromList(
                                                    "\u5C4F\u6771\u5E02",
                                                    "\u6F6E\u5DDE\u93AE",
                                                    "\u6771\u6E2F\u93AE",
                                                    "\u6046\u6625\u93AE",
                                                    "\u842C\u4E39\u9109",
                                                    "\u9577\u6CBB\u9109",
                                                    "\u9E9F\u6D1B\u9109",
                                                    "\u4E5D\u5982\u9109",
                                                    "\u91CC\u6E2F\u9109",
                                                    "\u9E7D\u57D4\u9109",
                                                    "\u9AD8\u6A39\u9109",
                                                    "\u842C\u5DD2\u9109",
                                                    "\u5167\u57D4\u9109",
                                                    "\u7AF9\u7530\u9109",
                                                    "\u65B0\u57E4\u9109",
                                                    "\u678B\u5BEE\u9109",
                                                    "\u65B0\u5712\u9109",
                                                    "\u5D01\u9802\u9109",
                                                    "\u6797\u908A\u9109",
                                                    "\u5357\u5DDE\u9109",
                                                    "\u4F73\u51AC\u9109",
                                                    "\u7409\u7403\u9109",
                                                    "\u8ECA\u57CE\u9109",
                                                    "\u6EFF\u5DDE\u9109",
                                                    "\u678B\u5C71\u9109",
                                                    "\u4E09\u5730\u9580\u9109",
                                                    "\u9727\u81FA\u9109",
                                                    "\u746A\u5BB6\u9109",
                                                    "\u6CF0\u6B66\u9109",
                                                    "\u4F86\u7FA9\u9109",
                                                    "\u6625\u65E5\u9109",
                                                    "\u7345\u5B50\u9109",
                                                    "\u7261\u4E39\u9109");
                                        })),
                        new ZPair(
                                "\u81FA\u6771\u7E23",
                                ZVal.arrayFromList(
                                        "\u81FA\u6771\u5E02",
                                        "\u6210\u529F\u93AE",
                                        "\u95DC\u5C71\u93AE",
                                        "\u5351\u5357\u9109",
                                        "\u9E7F\u91CE\u9109",
                                        "\u6C60\u4E0A\u9109",
                                        "\u6771\u6CB3\u9109",
                                        "\u9577\u6FF1\u9109",
                                        "\u592A\u9EBB\u91CC\u9109",
                                        "\u5927\u6B66\u9109",
                                        "\u7DA0\u5CF6\u9109",
                                        "\u6D77\u7AEF\u9109",
                                        "\u5EF6\u5E73\u9109",
                                        "\u91D1\u5CF0\u9109",
                                        "\u9054\u4EC1\u9109",
                                        "\u862D\u5DBC\u9109")),
                        new ZPair(
                                "\u82B1\u84EE\u7E23",
                                ZVal.arrayFromList(
                                        "\u82B1\u84EE\u5E02",
                                        "\u9CF3\u6797\u93AE",
                                        "\u7389\u91CC\u93AE",
                                        "\u65B0\u57CE\u9109",
                                        "\u5409\u5B89\u9109",
                                        "\u58FD\u8C50\u9109",
                                        "\u5149\u5FA9\u9109",
                                        "\u8C50\u6FF1\u9109",
                                        "\u745E\u7A57\u9109",
                                        "\u5BCC\u91CC\u9109",
                                        "\u79C0\u6797\u9109",
                                        "\u842C\u69AE\u9109",
                                        "\u5353\u6EAA\u9109")),
                        new ZPair(
                                "\u6F8E\u6E56\u7E23",
                                ZVal.arrayFromList(
                                        "\u99AC\u516C\u5E02",
                                        "\u6E56\u897F\u9109",
                                        "\u767D\u6C99\u9109",
                                        "\u897F\u5DBC\u9109",
                                        "\u671B\u5B89\u9109",
                                        "\u4E03\u7F8E\u9109")),
                        new ZPair(
                                "\u57FA\u9686\u5E02",
                                ZVal.arrayFromList(
                                        "\u4E2D\u6B63\u5340",
                                        "\u4E03\u5835\u5340",
                                        "\u6696\u6696\u5340",
                                        "\u4EC1\u611B\u5340",
                                        "\u4E2D\u5C71\u5340",
                                        "\u5B89\u6A02\u5340",
                                        "\u4FE1\u7FA9\u5340")),
                        new ZPair(
                                "\u65B0\u7AF9\u5E02",
                                ZVal.arrayFromList(
                                        "\u6771\u5340", "\u5317\u5340", "\u9999\u5C71\u5340")),
                        new ZPair(
                                "\u5609\u7FA9\u5E02",
                                ZVal.arrayFromList("\u6771\u5340", "\u897F\u5340")),
                        new ZPair(
                                "\u81FA\u5317\u5E02",
                                ZVal.arrayFromList(
                                        "\u677E\u5C71\u5340",
                                        "\u4FE1\u7FA9\u5340",
                                        "\u5927\u5B89\u5340",
                                        "\u4E2D\u5C71\u5340",
                                        "\u4E2D\u6B63\u5340",
                                        "\u5927\u540C\u5340",
                                        "\u842C\u83EF\u5340",
                                        "\u6587\u5C71\u5340",
                                        "\u5357\u6E2F\u5340",
                                        "\u5167\u6E56\u5340",
                                        "\u58EB\u6797\u5340",
                                        "\u5317\u6295\u5340")),
                        new ZPair(
                                "\u9023\u6C5F\u7E23",
                                ZVal.arrayFromList(
                                        "\u5357\u7AFF\u9109",
                                        "\u5317\u7AFF\u9109",
                                        "\u8392\u5149\u9109",
                                        "\u6771\u5F15\u9109")),
                        new ZPair(
                                "\u91D1\u9580\u7E23",
                                ZVal.arrayFromList(
                                        "\u91D1\u57CE\u93AE",
                                        "\u91D1\u6C99\u93AE",
                                        "\u91D1\u6E56\u93AE",
                                        "\u91D1\u5BE7\u9109",
                                        "\u70C8\u5DBC\u9109",
                                        "\u70CF\u5775\u9109")));

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u4E0D\u4E39",
                                    "\u4E2D\u975E",
                                    "\u4E39\u9EA5",
                                    "\u4F0A\u6717",
                                    "\u51B0\u5CF6",
                                    "\u525B\u679C",
                                    "\u52A0\u5F6D",
                                    "\u5317\u97D3",
                                    "\u5357\u975E",
                                    "\u5361\u9054",
                                    "\u5370\u5C3C",
                                    "\u5370\u5EA6",
                                    "\u53E4\u5DF4",
                                    "\u54E5\u5FB7",
                                    "\u57C3\u53CA",
                                    "\u591A\u54E5",
                                    "\u5BEE\u570B",
                                    "\u5C3C\u65E5",
                                    "\u5DF4\u66FC",
                                    "\u5DF4\u6797",
                                    "\u5DF4\u7D10",
                                    "\u5DF4\u897F",
                                    "\u5E0C\u81D8",
                                    "\u5E1B\u7409",
                                    "\u5FB7\u570B",
                                    "\u632A\u5A01",
                                    "\u6377\u514B",
                                    "\u6559\u5EF7",
                                    "\u6590\u6FDF",
                                    "\u65E5\u672C",
                                    "\u667A\u5229",
                                    "\u6771\u52A0",
                                    "\u67E5\u5FB7",
                                    "\u6C76\u840A",
                                    "\u6CD5\u570B",
                                    "\u6CE2\u862D",
                                    "\u6CE2\u8D6B",
                                    "\u6CF0\u570B",
                                    "\u6D77\u5730",
                                    "\u745E\u5178",
                                    "\u745E\u58EB",
                                    "\u7955\u9B6F",
                                    "\u79D8\u9B6F",
                                    "\u7D04\u65E6",
                                    "\u7D10\u57C3",
                                    "\u7DEC\u7538",
                                    "\u7F8E\u570B",
                                    "\u8056\u5C3C",
                                    "\u8056\u666E",
                                    "\u80AF\u4E9E",
                                    "\u82AC\u862D",
                                    "\u82F1\u570B",
                                    "\u8377\u862D",
                                    "\u8449\u9580",
                                    "\u8607\u4E39",
                                    "\u8AFE\u9B6F",
                                    "\u8C9D\u5357",
                                    "\u8D8A\u5357",
                                    "\u8FE6\u5F6D",
                                    "\u8FE6\u7D0D",
                                    "\u963F\u66FC",
                                    "\u963F\u806F",
                                    "\u97D3\u570B",
                                    "\u99AC\u5229",
                                    "\u4EE5\u8272\u5217",
                                    "\u4EE5\u8272\u5229",
                                    "\u4F0A\u62C9\u514B",
                                    "\u4FC4\u7F85\u65AF",
                                    "\u5229\u6BD4\u4E9E",
                                    "\u52A0\u62FF\u5927",
                                    "\u5308\u7259\u5229",
                                    "\u5357\u6975\u6D32",
                                    "\u5357\u8607\u4E39",
                                    "\u5384\u74DC\u591A",
                                    "\u5409\u5E03\u5730",
                                    "\u5410\u74E6\u9B6F",
                                    "\u54C8\u6492\u514B",
                                    "\u54C8\u85A9\u514B",
                                    "\u5580\u9EA5\u9686",
                                    "\u55AC\u6CBB\u4E9E",
                                    "\u571F\u5EAB\u66FC",
                                    "\u571F\u8033\u5176",
                                    "\u5854\u5409\u514B",
                                    "\u585E\u5E2D\u723E",
                                    "\u58A8\u897F\u54E5",
                                    "\u5927\u897F\u6D0B",
                                    "\u5967\u5730\u5229",
                                    "\u5B5F\u52A0\u62C9",
                                    "\u5B89\u54E5\u62C9",
                                    "\u5B89\u5730\u5361",
                                    "\u5B89\u9053\u723E",
                                    "\u5C1A\u6BD4\u4E9E",
                                    "\u5C3C\u4F2F\u723E",
                                    "\u5C3C\u6CCA\u723E",
                                    "\u5DF4\u54C8\u99AC",
                                    "\u5DF4\u62C9\u572D",
                                    "\u5DF4\u62FF\u99AC",
                                    "\u5DF4\u8C9D\u591A",
                                    "\u5E7E\u5167\u4E9E",
                                    "\u611B\u723E\u862D",
                                    "\u6240\u5728\u570B",
                                    "\u6469\u6D1B\u54E5",
                                    "\u6469\u7D0D\u54E5",
                                    "\u654D\u5229\u4E9E",
                                    "\u6558\u5229\u4E9E",
                                    "\u65B0\u52A0\u5761",
                                    "\u6771\u5E1D\u6C76",
                                    "\u67EC\u57D4\u5BE8",
                                    "\u6BD4\u5229\u6642",
                                    "\u6CE2\u624E\u90A3",
                                    "\u6CE2\u672D\u90A3",
                                    "\u70CF\u514B\u862D",
                                    "\u70CF\u5E72\u9054",
                                    "\u70CF\u62C9\u572D",
                                    "\u7259\u8CB7\u52A0",
                                    "\u7345\u5B50\u5C71",
                                    "\u7518\u6BD4\u4E9E",
                                    "\u76E7\u5B89\u9054",
                                    "\u76E7\u68EE\u5821",
                                    "\u79D1\u5A01\u7279",
                                    "\u79D1\u7D22\u592B",
                                    "\u79D1\u7D22\u6C83",
                                    "\u7ACB\u9676\u5B9B",
                                    "\u7D10\u897F\u862D",
                                    "\u7DAD\u5FB7\u89D2",
                                    "\u7FA9\u5927\u5229",
                                    "\u8056\u6587\u68EE",
                                    "\u827E\u585E\u4E9E",
                                    "\u83F2\u5F8B\u8CD3",
                                    "\u842C\u90A3\u675C",
                                    "\u8461\u8404\u7259",
                                    "\u84B2\u9686\u5730",
                                    "\u84CB\u4E9E\u7D0D",
                                    "\u85A9\u6469\u4E9E",
                                    "\u8607\u5229\u5357",
                                    "\u897F\u73ED\u7259",
                                    "\u8C9D\u91CC\u65AF",
                                    "\u8CF4\u7D22\u6258",
                                    "\u8F9B\u5DF4\u5A01",
                                    "\u963F\u5BCC\u6C57",
                                    "\u963F\u6839\u5EF7",
                                    "\u99AC\u5176\u9813",
                                    "\u99AC\u62C9\u5A01",
                                    "\u99AC\u723E\u4ED6",
                                    "\u9ECE\u5DF4\u5AE9",
                                    "\u4E9E\u585E\u62DC\u7136",
                                    "\u4E9E\u7F8E\u5C3C\u4E9E",
                                    "\u4FDD\u52A0\u5229\u4E9E",
                                    "\u5357\u65AF\u62C9\u592B",
                                    "\u5384\u5229\u5782\u4E9E",
                                    "\u53F2\u74E6\u6FDF\u862D",
                                    "\u5409\u723E\u5409\u65AF",
                                    "\u5409\u91CC\u5DF4\u65AF",
                                    "\u54E5\u502B\u6BD4\u4E9E",
                                    "\u5766\u5C1A\u5C3C\u4E9E",
                                    "\u585E\u5167\u52A0\u723E",
                                    "\u585E\u5185\u52A0\u723E",
                                    "\u585E\u723E\u7DAD\u4E9E",
                                    "\u591A\u660E\u5C3C\u52A0",
                                    "\u591A\u7C73\u5C3C\u514B",
                                    "\u5948\u53CA\u5229\u4E9E",
                                    "\u59D4\u5167\u745E\u62C9",
                                    "\u5B8F\u90FD\u62C9\u65AF",
                                    "\u5C3C\u52A0\u62C9\u74DC",
                                    "\u5DF4\u57FA\u65AF\u5766",
                                    "\u5EAB\u514B\u7FA4\u5CF6",
                                    "\u611B\u6C99\u5C3C\u4E9E",
                                    "\u62C9\u812B\u7DAD\u4E9E",
                                    "\u6469\u723E\u591A\u74E6",
                                    "\u6469\u91CC\u897F\u65AF",
                                    "\u65AF\u6D1B\u4F10\u514B",
                                    "\u65AF\u91CC\u862D\u5361",
                                    "\u683C\u745E\u90A3\u9054",
                                    "\u6A21\u91CC\u897F\u65AF",
                                    "\u6CE2\u591A\u9ECE\u5404",
                                    "\u6FB3\u5927\u5229\u4E9E",
                                    "\u70CF\u8332\u5225\u514B",
                                    "\u73BB\u5229\u7DAD\u4E9E",
                                    "\u74DC\u5730\u99AC\u62C9",
                                    "\u767D\u4FC4\u7F85\u65AF",
                                    "\u7A81\u5C3C\u897F\u4E9E",
                                    "\u7D0D\u7C73\u6BD4\u4E9E",
                                    "\u7D22\u99AC\u5229\u4E9E",
                                    "\u7D22\u99AC\u5C3C\u4E9E",
                                    "\u7F85\u99AC\u5C3C\u4E9E",
                                    "\u8056\u9732\u897F\u4E9E",
                                    "\u8056\u99AC\u5229\u8AFE",
                                    "\u83AB\u4E09\u6BD4\u514B",
                                    "\u83AB\u4E09\u9F3B\u514B",
                                    "\u845B\u6469\u806F\u76DF",
                                    "\u85A9\u723E\u74E6\u591A",
                                    "\u8863\u7D22\u6BD4\u4E9E",
                                    "\u897F\u85A9\u6469\u4E9E",
                                    "\u8C61\u7259\u6D77\u5CB8",
                                    "\u8CF4\u6BD4\u745E\u4E9E",
                                    "\u8CFD\u666E\u52D2\u65AF",
                                    "\u99AC\u4F86\u897F\u4E9E",
                                    "\u99AC\u723E\u5730\u592B",
                                    "\u514B\u7F85\u57C3\u897F\u4E9E",
                                    "\u5217\u652F\u6566\u65AF\u767B",
                                    "\u54E5\u65AF\u5927\u9ECE\u52A0",
                                    "\u5E03\u5409\u7D0D\u6CD5\u7D22",
                                    "\u5E03\u5409\u90A3\u6CD5\u7D22",
                                    "\u5E7E\u5167\u4E9E\u6BD4\u7D22",
                                    "\u5E7E\u5167\u4E9E\u6BD4\u7D39",
                                    "\u65AF\u6D1B\u7DAD\u5C3C\u4E9E",
                                    "\u7D22\u7F85\u9580\u7FA4\u5CF6",
                                    "\u8305\u5229\u5854\u5C3C\u4E9E",
                                    "\u8499\u7279\u5167\u54E5\u7F85",
                                    "\u8D64\u9053\u5E7E\u5167\u4E9E",
                                    "\u963F\u723E\u53CA\u5229\u4E9E",
                                    "\u963F\u723E\u53CA\u5C3C\u4E9E",
                                    "\u963F\u723E\u5DF4\u5C3C\u4E9E",
                                    "\u99AC\u7D39\u723E\u7FA4\u5CF6",
                                    "\u99AC\u9054\u52A0\u65AF\u52A0",
                                    "\u5BC6\u514B\u7F85\u5C3C\u897F\u4E9E",
                                    "\u6C99\u70CF\u5730\u963F\u62C9\u4F2F",
                                    "\u5343\u91CC\u9054\u53CA\u6258\u5DF4\u54E5");
                        });

        public Object postcode = ZVal.arrayFromList("###-##", "###");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\zh_TW\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "city",
                            "country",
                            "postcode",
                            "secondaryAddressSuffix",
                            "street",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetSuffix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/zh_TW/Address.php")
                    .addExtendsClass("Faker\\Provider\\Address")
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
