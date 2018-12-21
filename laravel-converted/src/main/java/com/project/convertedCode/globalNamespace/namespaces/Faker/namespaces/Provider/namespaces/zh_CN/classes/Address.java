package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.zh_CN.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/zh_CN/Address.php

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
    public Object city(RuntimeEnv env, Object... args) {
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
                                                                .zh_CN
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "cites")))
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
                                                        .zh_CN
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .cites)
                        .value());
    }

    @ConvertedMethod
    public Object state(RuntimeEnv env, Object... args) {
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
                                                                .zh_CN
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "states")))
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
                                                        .zh_CN
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .states)
                        .value());
    }

    @ConvertedMethod
    public Object stateAbbr(RuntimeEnv env, Object... args) {
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
                                                                .zh_CN
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "stateAbbr")))
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
                                                        .zh_CN
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .stateAbbr)
                        .value());
    }

    @ConvertedMethod
    public Object address(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(this.city(env), env)
                        + toStringR(
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, Address.class)
                                        .method("area")
                                        .call()
                                        .value(),
                                env));
    }

    public static final Object CONST_class = "Faker\\Provider\\zh_CN\\Address";

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
        public Object area(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
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
                                                            .zh_CN
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .areas)
                            .value());
        }

        @ConvertedMethod
        public Object country(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
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
                                                            .zh_CN
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .country)
                            .value());
        }

        @ConvertedMethod
        public Object postcode(RuntimeEnv env, Object... args) {
            Object prefix = null;
            Object suffix = null;
            prefix =
                    NamespaceGlobal.str_pad
                            .env(env)
                            .call(NamespaceGlobal.mt_rand.env(env).call(1, 85).value(), 2, 0, 0)
                            .value();
            suffix = "00";
            return ZVal.assign(
                    toStringR(prefix, env)
                            + toStringR(NamespaceGlobal.mt_rand.env(env).call(10, 88).value(), env)
                            + toStringR(suffix, env));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object cites =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u5317\u4EAC",
                                    "\u4E0A\u6D77",
                                    "\u5929\u6D25",
                                    "\u91CD\u5E86",
                                    "\u54C8\u5C14\u6EE8",
                                    "\u957F\u6625",
                                    "\u6C88\u9633",
                                    "\u547C\u548C\u6D69\u7279",
                                    "\u77F3\u5BB6\u5E84",
                                    "\u4E4C\u9C81\u6728\u9F50",
                                    "\u5170\u5DDE",
                                    "\u897F\u5B81",
                                    "\u897F\u5B89",
                                    "\u94F6\u5DDD",
                                    "\u90D1\u5DDE",
                                    "\u6D4E\u5357",
                                    "\u592A\u539F",
                                    "\u5408\u80A5",
                                    "\u6B66\u6C49",
                                    "\u957F\u6C99",
                                    "\u5357\u4EAC",
                                    "\u6210\u90FD",
                                    "\u8D35\u9633",
                                    "\u6606\u660E",
                                    "\u5357\u5B81",
                                    "\u62C9\u8428",
                                    "\u676D\u5DDE",
                                    "\u5357\u660C",
                                    "\u5E7F\u5DDE",
                                    "\u798F\u5DDE",
                                    "\u6D77\u53E3",
                                    "\u9999\u6E2F",
                                    "\u6FB3\u95E8");
                        });

        public Object states =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u5317\u4EAC\u5E02",
                                    "\u5929\u6D25\u5E02",
                                    "\u6CB3\u5317\u7701",
                                    "\u5C71\u897F\u7701",
                                    "\u5185\u8499\u53E4\u81EA\u6CBB\u533A",
                                    "\u8FBD\u5B81\u7701",
                                    "\u5409\u6797\u7701",
                                    "\u9ED1\u9F99\u6C5F\u7701",
                                    "\u4E0A\u6D77\u5E02",
                                    "\u6C5F\u82CF\u7701",
                                    "\u6D59\u6C5F\u7701",
                                    "\u5B89\u5FBD\u7701",
                                    "\u798F\u5EFA\u7701",
                                    "\u6C5F\u897F\u7701",
                                    "\u5C71\u4E1C\u7701",
                                    "\u6CB3\u5357\u7701",
                                    "\u6E56\u5317\u7701",
                                    "\u6E56\u5357\u7701",
                                    "\u5E7F\u4E1C\u7701",
                                    "\u5E7F\u897F\u58EE\u65CF\u81EA\u6CBB\u533A",
                                    "\u6D77\u5357\u7701",
                                    "\u91CD\u5E86\u5E02",
                                    "\u56DB\u5DDD\u7701",
                                    "\u8D35\u5DDE\u7701",
                                    "\u4E91\u5357\u7701",
                                    "\u897F\u85CF\u81EA\u6CBB\u533A",
                                    "\u9655\u897F\u7701",
                                    "\u7518\u8083\u7701",
                                    "\u9752\u6D77\u7701",
                                    "\u5B81\u590F\u56DE\u65CF\u81EA\u6CBB\u533A",
                                    "\u65B0\u7586\u7EF4\u543E\u5C14\u81EA\u6CBB\u533A",
                                    "\u9999\u6E2F\u7279\u522B\u884C\u653F\u533A",
                                    "\u6FB3\u95E8\u7279\u522B\u884C\u653F\u533A",
                                    "\u53F0\u6E7E\u7701");
                        });

        public Object stateAbbr =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u4EAC", "\u7696", "\u6E1D", "\u95FD", "\u7518", "\u7CA4",
                                    "\u6842", "\u9ED4", "\u743C", "\u5180", "\u8C6B", "\u9ED1",
                                    "\u9102", "\u6E58", "\u5409", "\u82CF", "\u8D63", "\u8FBD",
                                    "\u8499", "\u5B81", "\u9752", "\u9C81", "\u664B", "\u9655",
                                    "\u6CAA", "\u5DDD", "\u6D25", "\u85CF", "\u65B0", "\u6EC7",
                                    "\u6D59", "\u6E2F", "\u6FB3", "\u53F0");
                        });

        public Object areas =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u897F\u590F\u533A",
                                    "\u6C38\u5DDD\u533A",
                                    "\u79C0\u82F1\u533A",
                                    "\u9AD8\u6E2F\u533A",
                                    "\u6E05\u57CE\u533A",
                                    "\u5174\u5C71\u533A",
                                    "\u9521\u5C71\u533A",
                                    "\u6E05\u6CB3\u533A",
                                    "\u9F99\u6F6D\u533A",
                                    "\u534E\u9F99\u533A",
                                    "\u6D77\u9675\u533A",
                                    "\u6EE8\u57CE\u533A",
                                    "\u4E1C\u4E3D\u533A",
                                    "\u9AD8\u576A\u533A",
                                    "\u6C99\u6E7E\u533A",
                                    "\u5E73\u5C71\u533A",
                                    "\u57CE\u5317\u533A",
                                    "\u6D77\u6E2F\u533A",
                                    "\u6C99\u5E02\u533A",
                                    "\u53CC\u6EE6\u533A",
                                    "\u957F\u5BFF\u533A",
                                    "\u5C71\u4EAD\u533A",
                                    "\u5357\u6E56\u533A",
                                    "\u6D54\u9633\u533A",
                                    "\u5357\u957F\u533A",
                                    "\u53CB\u597D\u533A",
                                    "\u5B89\u6B21\u533A",
                                    "\u7FD4\u5B89\u533A",
                                    "\u6C88\u6CB3\u533A",
                                    "\u9B4F\u90FD\u533A",
                                    "\u897F\u5CF0\u533A",
                                    "\u8427\u5C71\u533A",
                                    "\u91D1\u5E73\u533A",
                                    "\u6C88\u5317\u65B0\u533A",
                                    "\u5B5D\u5357\u533A",
                                    "\u4E0A\u8857\u533A",
                                    "\u57CE\u4E1C\u533A",
                                    "\u7267\u91CE\u533A",
                                    "\u5927\u4E1C\u533A",
                                    "\u767D\u4E91\u533A",
                                    "\u82B1\u6EAA\u533A",
                                    "\u5409\u5229\u533A",
                                    "\u65B0\u57CE\u533A",
                                    "\u6000\u67D4\u533A",
                                    "\u516D\u679D\u7279\u533A",
                                    "\u6DAA\u57CE\u533A",
                                    "\u6E05\u6D66\u533A",
                                    "\u5357\u6EAA\u533A",
                                    "\u6DC4\u5DDD\u533A",
                                    "\u9AD8\u660E\u533A",
                                    "\u91D1\u6C34\u533A",
                                    "\u4E2D\u539F\u533A",
                                    "\u9AD8\u65B0\u5F00\u53D1\u533A",
                                    "\u7ECF\u6D4E\u5F00\u53D1\u65B0\u533A",
                                    "\u65B0\u533A");
                        });

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u963F\u5BCC\u6C57",
                                    "\u963F\u62C9\u65AF\u52A0",
                                    "\u963F\u5C14\u5DF4\u5C3C\u4E9A",
                                    "\u963F\u5C14\u53CA\u5229\u4E9A",
                                    "\u5B89\u9053\u5C14",
                                    "\u5B89\u54E5\u62C9",
                                    "\u5B89\u572D\u62C9\u5C9B\u82F1",
                                    "\u5B89\u63D0\u74DC\u548C\u5DF4\u5E03\u8FBE",
                                    "\u963F\u6839\u5EF7",
                                    "\u4E9A\u7F8E\u5C3C\u4E9A",
                                    "\u963F\u9C81\u5DF4\u5C9B",
                                    "\u963F\u68EE\u677E",
                                    "\u6FB3\u5927\u5229\u4E9A",
                                    "\u5965\u5730\u5229",
                                    "\u963F\u585E\u62DC\u7586",
                                    "\u5DF4\u6797",
                                    "\u5B5F\u52A0\u62C9\u56FD",
                                    "\u5DF4\u5DF4\u591A\u65AF",
                                    "\u767D\u4FC4\u7F57\u65AF",
                                    "\u6BD4\u5229\u65F6",
                                    "\u4F2F\u5229\u5179",
                                    "\u8D1D\u5B81",
                                    "\u767E\u6155\u5927\u7FA4\u5C9B",
                                    "\u4E0D\u4E39",
                                    "\u73BB\u5229\u7EF4\u4E9A",
                                    "\u6CE2\u65AF\u5C3C\u4E9A\u548C\u9ED1\u585E\u54E5\u7EF4\u90A3",
                                    "\u535A\u8328\u74E6\u7EB3",
                                    "\u5DF4\u897F",
                                    "\u4FDD\u52A0\u5229\u4E9A",
                                    "\u5E03\u57FA\u7EB3\u6CD5\u7D22",
                                    "\u5E03\u9686\u8FEA",
                                    "\u5580\u9EA6\u9686",
                                    "\u52A0\u62FF\u5927",
                                    "\u52A0\u90A3\u5229\u7FA4\u5C9B",
                                    "\u4F5B\u5F97\u89D2",
                                    "\u5F00\u66FC\u7FA4\u5C9B",
                                    "\u4E2D\u975E",
                                    "\u4E4D\u5F97",
                                    "\u667A\u5229",
                                    "\u5723\u8BDE\u5C9B",
                                    "\u79D1\u79D1\u65AF\u5C9B",
                                    "\u54E5\u4F26\u6BD4\u4E9A",
                                    "\u5DF4\u54C8\u9A6C\u56FD",
                                    "\u591A\u7C73\u5C3C\u514B\u56FD",
                                    "\u79D1\u6469\u7F57",
                                    "\u521A\u679C",
                                    "\u79D1\u514B\u7FA4\u5C9B",
                                    "\u54E5\u65AF\u8FBE\u9ECE\u52A0",
                                    "\u514B\u7F57\u5730\u4E9A",
                                    "\u53E4\u5DF4",
                                    "\u585E\u6D66\u8DEF\u65AF",
                                    "\u6377\u514B",
                                    "\u4E39\u9EA6",
                                    "\u8FEA\u6208\u52A0\u897F\u4E9A\u5C9B",
                                    "\u5409\u5E03\u63D0",
                                    "\u591A\u7C73\u5C3C\u52A0\u5171\u548C\u56FD",
                                    "\u5384\u74DC\u591A\u5C14",
                                    "\u57C3\u53CA",
                                    "\u8428\u5C14\u74E6\u591A",
                                    "\u8D64\u9053\u51E0\u5185\u4E9A",
                                    "\u5384\u7ACB\u7279\u91CC\u4E9A",
                                    "\u7231\u6C99\u5C3C\u4E9A",
                                    "\u57C3\u585E\u4FC4\u6BD4\u4E9A",
                                    "\u798F\u514B\u5170\u7FA4\u5C9B",
                                    "\u6CD5\u7F57\u7FA4\u5C9B",
                                    "\u6590\u6D4E",
                                    "\u82AC\u5170",
                                    "\u6CD5\u56FD",
                                    "\u6CD5\u5C5E\u572D\u4E9A\u90A3",
                                    "\u6CD5\u5C5E\u6CE2\u91CC\u5C3C\u897F\u4E9A",
                                    "\u52A0\u84EC",
                                    "\u5188\u6BD4\u4E9A",
                                    "\u683C\u9C81\u5409\u4E9A",
                                    "\u5FB7\u56FD",
                                    "\u52A0\u7EB3",
                                    "\u76F4\u5E03\u7F57\u9640",
                                    "\u5E0C\u814A",
                                    "\u683C\u9675\u5170\u5C9B",
                                    "\u683C\u6797\u7EB3\u8FBE",
                                    "\u74DC\u5FB7\u7F57\u666E\u5C9B",
                                    "\u5173\u5C9B",
                                    "\u5371\u5730\u9A6C\u62C9",
                                    "\u51E0\u5185\u4E9A",
                                    "\u51E0\u5185\u4E9A\u6BD4\u7ECD",
                                    "\u572D\u4E9A\u90A3",
                                    "\u6D77\u5730",
                                    "\u590F\u5A01\u5937",
                                    "\u6D2A\u90FD\u62C9\u65AF",
                                    "\u5308\u7259\u5229",
                                    "\u51B0\u5C9B",
                                    "\u5370\u5EA6",
                                    "\u5370\u5EA6\u5C3C\u897F\u4E9A",
                                    "\u4F0A\u90CE",
                                    "\u4F0A\u62C9\u514B",
                                    "\u7231\u5C14\u5170",
                                    "\u4EE5\u8272\u5217",
                                    "\u610F\u5927\u5229",
                                    "\u79D1\u7279\u8FEA\u74E6",
                                    "\u7259\u4E70\u52A0",
                                    "\u65E5\u672C",
                                    "\u7EA6\u65E6",
                                    "\u67EC\u57D4\u585E",
                                    "\u54C8\u8428\u514B\u65AF\u5766",
                                    "\u80AF\u5C3C\u4E9A",
                                    "\u57FA\u91CC\u5DF4\u65AF",
                                    "\u671D\u9C9C",
                                    "\u97E9\u56FD",
                                    "\u79D1\u5A01\u7279",
                                    "\u5409\u5C14\u5409\u65AF\u65AF\u5766",
                                    "\u8001\u631D",
                                    "\u62C9\u8131\u7EF4\u4E9A",
                                    "\u9ECE\u5DF4\u5AE9",
                                    "\u83B1\u7D22\u6258",
                                    "\u5229\u6BD4\u91CC\u4E9A",
                                    "\u5229\u6BD4\u4E9A",
                                    "\u5217\u652F\u6566\u58EB\u767B",
                                    "\u7ACB\u9676\u5B9B",
                                    "\u5362\u68EE\u5821",
                                    "\u9A6C\u5176\u987F",
                                    "\u9A6C\u8FBE\u52A0\u65AF\u52A0",
                                    "\u9A6C\u62C9\u7EF4",
                                    "\u9A6C\u6765\u897F\u4E9A",
                                    "\u9A6C\u5C14\u4EE3\u592B",
                                    "\u9A6C\u91CC",
                                    "\u9A6C\u8033\u4ED6",
                                    "\u9A6C\u91CC\u4E9A\u7EB3\u7FA4\u5C9B",
                                    "\u9A6C\u7ECD\u5C14\u7FA4\u5C9B",
                                    "\u9A6C\u63D0\u5C3C\u514B",
                                    "\u6BDB\u91CC\u5854\u5C3C\u4E9A",
                                    "\u6BDB\u91CC\u6C42\u65AF",
                                    "\u9A6C\u7EA6\u7279\u5C9B",
                                    "\u58A8\u897F\u54E5",
                                    "\u5BC6\u514B\u7F57\u5C3C\u897F\u4E9A",
                                    "\u4E2D\u9014\u5C9B",
                                    "\u6469\u5C14\u591A\u74E6",
                                    "\u6469\u7EB3\u54E5",
                                    "\u8499\u53E4",
                                    "\u8499\u7279\u585E\u62C9\u7279\u5C9B",
                                    "\u6469\u6D1B\u54E5",
                                    "\u83AB\u6851\u6BD4\u514B",
                                    "\u7F05\u7538",
                                    "\u7EB3\u7C73\u6BD4\u4E9A",
                                    "\u7459\u9C81",
                                    "\u5C3C\u6CCA\u5C14",
                                    "\u8377\u5170",
                                    "\u8377\u5C5E\u5B89\u7684\u5217\u65AF\u7FA4\u5C9B",
                                    "\u65B0\u5580\u91CC\u591A\u5C3C\u4E9A\u7FA4\u5C9B",
                                    "\u65B0\u897F\u5170",
                                    "\u5C3C\u52A0\u62C9\u74DC",
                                    "\u5C3C\u65E5\u5C14",
                                    "\u5C3C\u65E5\u5229\u4E9A",
                                    "\u7EBD\u57C3\u5C9B",
                                    "\u8BFA\u798F\u514B\u5C9B",
                                    "\u632A\u5A01",
                                    "\u963F\u66FC",
                                    "\u5E15\u52B3",
                                    "\u5DF4\u62FF\u9A6C",
                                    "\u5DF4\u5E03\u4E9A\u65B0\u51E0\u5185\u4E9A",
                                    "\u5DF4\u62C9\u572D",
                                    "\u79D8\u9C81",
                                    "\u83F2\u5F8B\u5BBE",
                                    "\u6CE2\u5170",
                                    "\u8461\u8404\u7259",
                                    "\u5DF4\u57FA\u65AF\u5766",
                                    "\u6CE2\u591A\u9ECE\u5404",
                                    "\u5361\u5854\u5C14",
                                    "\u7559\u5C3C\u6C6A\u5C9B",
                                    "\u7F57\u9A6C\u5C3C\u4E9A",
                                    "\u4FC4\u7F57\u65AF",
                                    "\u5362\u65FA\u8FBE",
                                    "\u4E1C\u8428\u6469\u4E9A",
                                    "\u897F\u8428\u6469\u4E9A",
                                    "\u5723\u9A6C\u529B\u8BFA",
                                    "\u5723\u76AE\u57C3\u5C14\u5C9B\u53CA\u5BC6\u514B\u9686\u5C9B",
                                    "\u5723\u591A\u7F8E\u548C\u666E\u6797\u897F\u6BD4",
                                    "\u6C99\u7279\u963F\u62C9\u4F2F",
                                    "\u585E\u5185\u52A0\u5C14",
                                    "\u585E\u820C\u5C14",
                                    "\u65B0\u52A0\u5761",
                                    "\u65AF\u6D1B\u4F10\u514B",
                                    "\u65AF\u6D1B\u6587\u5C3C\u4E9A",
                                    "\u6240\u7F57\u95E8\u7FA4\u5C9B",
                                    "\u7D22\u9A6C\u91CC",
                                    "\u5357\u975E",
                                    "\u897F\u73ED\u7259",
                                    "\u65AF\u91CC\u5170\u5361",
                                    "\u5723\u514B\u91CC\u65AF\u6258\u5F17\u548C\u5C3C\u7EF4\u65AF",
                                    "\u5723\u8D6B\u52D2\u62FF",
                                    "\u5723\u5362\u897F\u4E9A",
                                    "\u5723\u6587\u68EE\u7279\u5C9B",
                                    "\u82CF\u4E39",
                                    "\u82CF\u91CC\u5357",
                                    "\u65AF\u5A01\u58EB\u5170",
                                    "\u745E\u5178",
                                    "\u745E\u58EB",
                                    "\u53D9\u5229\u4E9A",
                                    "\u5854\u5409\u514B\u65AF\u5766",
                                    "\u5766\u6851\u5C3C\u4E9A",
                                    "\u6CF0\u56FD",
                                    "\u963F\u62C9\u4F2F\u8054\u5408\u914B\u957F\u56FD",
                                    "\u591A\u54E5",
                                    "\u6258\u514B\u52B3\u7FA4\u5C9B",
                                    "\u6C64\u52A0",
                                    "\u7279\u7ACB\u5C3C\u8FBE\u548C\u591A\u5DF4\u54E5",
                                    "\u7A81\u5C3C\u65AF",
                                    "\u571F\u8033\u5176",
                                    "\u571F\u5E93\u66FC\u65AF\u5766",
                                    "\u7279\u514B\u65AF\u548C\u51EF\u79D1\u65AF\u7FA4\u5C9B(",
                                    "\u56FE\u74E6\u5362",
                                    "\u7F8E\u56FD",
                                    "\u4E4C\u5E72\u8FBE",
                                    "\u4E4C\u514B\u5170",
                                    "\u82F1\u56FD",
                                    "\u4E4C\u62C9\u572D",
                                    "\u4E4C\u5179\u522B\u514B\u65AF\u5766",
                                    "\u74E6\u52AA\u963F\u56FE",
                                    "\u68B5\u8482\u5188",
                                    "\u59D4\u5185\u745E\u62C9",
                                    "\u8D8A\u5357",
                                    "\u7EF4\u5C14\u4EAC\u7FA4\u5C9B",
                                    "\u7EF4\u5C14\u4EAC\u7FA4\u5C9B\u548C\u5723\u7F57\u514B\u4F0A",
                                    "\u5A01\u514B\u5C9B",
                                    "\u74E6\u91CC\u65AF\u548C\u5BCC\u58EB\u90A3\u7FA4\u5C9B",
                                    "\u897F\u6492\u54C8\u62C9",
                                    "\u4E5F\u95E8",
                                    "\u5357\u65AF\u62C9\u592B",
                                    "\u624E\u4F0A\u5C14",
                                    "\u8D5E\u6BD4\u4E9A",
                                    "\u6851\u7ED9\u5DF4\u5C14",
                                    "\u6D25\u5DF4\u5E03\u97E6",
                                    "\u4E2D\u534E\u4EBA\u6C11\u5171\u548C\u56FD",
                                    "\u4E2D\u56FD");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\zh_CN\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("areas", "cites", "country", "stateAbbr", "states")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/zh_CN/Address.php")
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
