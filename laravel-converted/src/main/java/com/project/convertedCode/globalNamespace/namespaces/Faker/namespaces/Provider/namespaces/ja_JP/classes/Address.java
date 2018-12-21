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
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/ja_JP/Address.php

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
    public Object secondaryAddress(RuntimeEnv env, Object... args) {
        Object format = null;
        format =
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
                                                                .ja_JP
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "secondaryAddressFormats")))
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
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .secondaryAddressFormats)
                        .value();
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Address.class,
                        format));
    }

    public static final Object CONST_class = "Faker\\Provider\\ja_JP\\Address";

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
        public Object postcode1(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("numberBetween")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(100, 999)
                            .value());
        }

        @ConvertedMethod
        public Object postcode2(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("numberBetween")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(1000, 9999)
                            .value());
        }

        @ConvertedMethod
        public Object postcode(RuntimeEnv env, Object... args) {
            Object postcode1 = null;
            Object postcode2 = null;
            postcode1 =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("postcode1")
                            .call()
                            .value();
            postcode2 =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("postcode2")
                            .call()
                            .value();
            return ZVal.assign(toStringR(postcode1, env) + toStringR(postcode2, env));
        }

        @ConvertedMethod
        public Object prefecture(RuntimeEnv env, Object... args) {
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
                                                            .ja_JP
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .prefecture)
                            .value());
        }

        @ConvertedMethod
        public Object ward(RuntimeEnv env, Object... args) {
            Object ward = null;
            Object suffix = null;
            ward =
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
                                                            .ja_JP
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .ward)
                            .value();
            suffix =
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
                                                            .ja_JP
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .wardSuffix)
                            .value();
            return ZVal.assign(toStringR(ward, env) + toStringR(suffix, env));
        }

        @ConvertedMethod
        public Object areaNumber(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("numberBetween")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(1, 10)
                            .value());
        }

        @ConvertedMethod
        public Object buildingNumber(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("numberBetween")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(101, 110)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u30A2\u30D5\u30AC\u30CB\u30B9\u30BF\u30F3",
                                    "\u30A2\u30EB\u30D0\u30CB\u30A2",
                                    "\u30A2\u30EB\u30B8\u30A7\u30EA\u30A2",
                                    "\u30A2\u30E1\u30EA\u30AB\u9818\u30B5\u30E2\u30A2",
                                    "\u30A2\u30F3\u30C9\u30E9",
                                    "\u30A2\u30F3\u30B4\u30E9",
                                    "\u30A2\u30F3\u30AE\u30E9",
                                    "\u5357\u6975\u5927\u9678",
                                    "\u30A2\u30F3\u30C6\u30A3\u30B0\u30A2\u30D0\u30FC\u30D6\u30FC\u30C0",
                                    "\u30A2\u30EB\u30BC\u30F3\u30C1\u30F3",
                                    "\u30A2\u30EB\u30E1\u30CB\u30A2",
                                    "\u30A2\u30EB\u30D0",
                                    "\u30AA\u30FC\u30B9\u30C8\u30E9\u30EA\u30A2",
                                    "\u30AA\u30FC\u30B9\u30C8\u30EA\u30A2",
                                    "\u30A2\u30BC\u30EB\u30D0\u30A4\u30B8\u30E3\u30F3",
                                    "\u30D0\u30CF\u30DE",
                                    "\u30D0\u30FC\u30EC\u30FC\u30F3",
                                    "\u30D0\u30F3\u30B0\u30E9\u30C7\u30B7\u30E5",
                                    "\u30D0\u30EB\u30D0\u30C9\u30B9",
                                    "\u30D9\u30E9\u30EB\u30FC\u30B7",
                                    "\u30D9\u30EB\u30AE\u30FC",
                                    "\u30D9\u30EA\u30FC\u30BA",
                                    "\u30D9\u30CA\u30F3",
                                    "\u30D0\u30DF\u30E5\u30FC\u30C0\u5CF6",
                                    "\u30D6\u30FC\u30BF\u30F3",
                                    "\u30DC\u30EA\u30D3\u30A2",
                                    "\u30DC\u30B9\u30CB\u30A2\u30FB\u30D8\u30EB\u30C4\u30A7\u30B4\u30D3\u30CA",
                                    "\u30DC\u30C4\u30EF\u30CA",
                                    "\u30D6\u30FC\u30D9\u5CF6",
                                    "\u30D6\u30E9\u30B8\u30EB",
                                    "\u30A4\u30AE\u30EA\u30B9\u9818\u30A4\u30F3\u30C9\u6D0B\u5730\u57DF",
                                    "\u30A4\u30AE\u30EA\u30B9\u9818\u30F4\u30A1\u30FC\u30B8\u30F3\u8AF8\u5CF6",
                                    "\u30D6\u30EB\u30CD\u30A4",
                                    "\u30D6\u30EB\u30AC\u30EA\u30A2",
                                    "\u30D6\u30EB\u30AD\u30CA\u30D5\u30A1\u30BD",
                                    "\u30D6\u30EB\u30F3\u30B8",
                                    "\u30AB\u30F3\u30DC\u30B8\u30A2",
                                    "\u30AB\u30E1\u30EB\u30FC\u30F3",
                                    "\u30AB\u30CA\u30C0",
                                    "\u30AB\u30FC\u30DC\u30D9\u30EB\u30C7",
                                    "\u30B1\u30A4\u30DE\u30F3\u8AF8\u5CF6",
                                    "\u4E2D\u592E\u30A2\u30D5\u30EA\u30AB\u5171\u548C\u56FD",
                                    "\u30C1\u30E3\u30C9",
                                    "\u30C1\u30EA",
                                    "\u4E2D\u56FD",
                                    "\u30AF\u30EA\u30B9\u30DE\u30B9\u5CF6",
                                    "\u30B3\u30B3\u30B9\u8AF8\u5CF6",
                                    "\u30B3\u30ED\u30F3\u30D3\u30A2",
                                    "\u30B3\u30E2\u30ED",
                                    "\u30B3\u30F3\u30B4\u5171\u548C\u56FD",
                                    "\u30AF\u30C3\u30AF\u8AF8\u5CF6",
                                    "\u30B3\u30B9\u30BF\u30EA\u30AB",
                                    "\u30B3\u30FC\u30C8\u30B8\u30DC\u30EF\u30FC\u30EB",
                                    "\u30AF\u30ED\u30A2\u30C1\u30A2",
                                    "\u30AD\u30E5\u30FC\u30D0",
                                    "\u30AD\u30D7\u30ED\u30B9\u5171\u548C\u56FD",
                                    "\u30C1\u30A7\u30B3\u5171\u548C\u56FD",
                                    "\u30C7\u30F3\u30DE\u30FC\u30AF",
                                    "\u30B8\u30D6\u30C1\u5171\u548C\u56FD",
                                    "\u30C9\u30DF\u30CB\u30AB\u56FD",
                                    "\u30C9\u30DF\u30CB\u30AB\u5171\u548C\u56FD",
                                    "\u30A8\u30AF\u30A2\u30C9\u30EB",
                                    "\u30A8\u30B8\u30D7\u30C8",
                                    "\u30A8\u30EB\u30B5\u30EB\u30D0\u30C9\u30EB",
                                    "\u8D64\u9053\u30AE\u30CB\u30A2\u5171\u548C\u56FD",
                                    "\u30A8\u30EA\u30C8\u30EA\u30A2",
                                    "\u30A8\u30B9\u30C8\u30CB\u30A2",
                                    "\u30A8\u30C1\u30AA\u30D4\u30A2",
                                    "\u30D5\u30A7\u30ED\u30FC\u8AF8\u5CF6",
                                    "\u30D5\u30A9\u30FC\u30AF\u30E9\u30F3\u30C9\u8AF8\u5CF6",
                                    "\u30D5\u30A3\u30B8\u30FC\u5171\u548C\u56FD",
                                    "\u30D5\u30A3\u30F3\u30E9\u30F3\u30C9",
                                    "\u30D5\u30E9\u30F3\u30B9",
                                    "\u30D5\u30E9\u30F3\u30B9\u9818\u30AE\u30A2\u30CA",
                                    "\u30D5\u30E9\u30F3\u30B9\u9818\u30DD\u30EA\u30CD\u30B7\u30A2",
                                    "\u30D5\u30E9\u30F3\u30B9\u9818\u6975\u5357\u8AF8\u5CF6",
                                    "\u30AC\u30DC\u30F3",
                                    "\u30AC\u30F3\u30D3\u30A2",
                                    "\u30B0\u30EB\u30B8\u30A2",
                                    "\u30C9\u30A4\u30C4",
                                    "\u30AC\u30FC\u30CA",
                                    "\u30B8\u30D6\u30E9\u30EB\u30BF\u30EB",
                                    "\u30AE\u30EA\u30B7\u30E3",
                                    "\u30B0\u30EA\u30FC\u30F3\u30E9\u30F3\u30C9",
                                    "\u30B0\u30EC\u30CA\u30C0",
                                    "\u30B0\u30A2\u30C9\u30EB\u30FC\u30D7",
                                    "\u30B0\u30A2\u30E0",
                                    "\u30B0\u30A2\u30C6\u30DE\u30E9",
                                    "\u30AC\u30FC\u30F3\u30B8\u30FC",
                                    "\u30AE\u30CB\u30A2",
                                    "\u30AE\u30CB\u30A2\u30D3\u30B5\u30A6",
                                    "\u30AC\u30A4\u30A2\u30CA",
                                    "\u30CF\u30A4\u30C1",
                                    "\u30CF\u30FC\u30C9\u5CF6\u3068\u30DE\u30AF\u30C9\u30CA\u30EB\u30C9\u8AF8\u5CF6",
                                    "\u30D0\u30C1\u30AB\u30F3\u5E02\u56FD",
                                    "\u30DB\u30F3\u30B8\u30E5\u30E9\u30B9",
                                    "\u9999\u6E2F",
                                    "\u30CF\u30F3\u30AC\u30EA\u30FC",
                                    "\u30A2\u30A4\u30B9\u30E9\u30F3\u30C9",
                                    "\u30A4\u30F3\u30C9",
                                    "\u30A4\u30F3\u30C9\u30CD\u30B7\u30A2",
                                    "\u30A4\u30E9\u30F3",
                                    "\u30A4\u30E9\u30AF",
                                    "\u30A2\u30A4\u30EB\u30E9\u30F3\u30C9\u5171\u548C\u56FD",
                                    "\u30DE\u30F3\u5CF6",
                                    "\u30A4\u30B9\u30E9\u30A8\u30EB",
                                    "\u30A4\u30BF\u30EA\u30A2",
                                    "\u30B8\u30E3\u30DE\u30A4\u30AB",
                                    "\u65E5\u672C",
                                    "\u30B8\u30E3\u30FC\u30B8\u30FC\u5CF6",
                                    "\u30E8\u30EB\u30C0\u30F3",
                                    "\u30AB\u30B6\u30D5\u30B9\u30BF\u30F3",
                                    "\u30B1\u30CB\u30A2",
                                    "\u30AD\u30EA\u30D0\u30B9",
                                    "\u671D\u9BAE",
                                    "\u97D3\u56FD",
                                    "\u30AF\u30A6\u30A7\u30FC\u30C8",
                                    "\u30AD\u30EB\u30AE\u30B9\u5171\u548C\u56FD",
                                    "\u30E9\u30AA\u30B9\u4EBA\u6C11\u6C11\u4E3B\u5171\u548C\u56FD",
                                    "\u30E9\u30C8\u30D3\u30A2",
                                    "\u30EC\u30D0\u30CE\u30F3",
                                    "\u30EC\u30BD\u30C8",
                                    "\u30EA\u30D9\u30EA\u30A2",
                                    "\u30EA\u30D3\u30A2\u56FD",
                                    "\u30EA\u30D2\u30C6\u30F3\u30B7\u30E5\u30BF\u30A4\u30F3",
                                    "\u30EA\u30C8\u30A2\u30CB\u30A2",
                                    "\u30EB\u30AF\u30BB\u30F3\u30D6\u30EB\u30AF",
                                    "\u30DE\u30AB\u30AA",
                                    "\u30DE\u30B1\u30C9\u30CB\u30A2\u5171\u548C\u56FD",
                                    "\u30DE\u30C0\u30AC\u30B9\u30AB\u30EB",
                                    "\u30DE\u30E9\u30A6\u30A3",
                                    "\u30DE\u30EC\u30FC\u30B7\u30A2",
                                    "\u30E2\u30EB\u30C7\u30A3\u30D6",
                                    "\u30DE\u30EA",
                                    "\u30DE\u30EB\u30BF\u5171\u548C\u56FD",
                                    "\u30DE\u30FC\u30B7\u30E3\u30EB\u8AF8\u5CF6",
                                    "\u30DE\u30EB\u30C6\u30A3\u30CB\u30FC\u30AF",
                                    "\u30E2\u30FC\u30EA\u30BF\u30CB\u30A2\u30FB\u30A4\u30B9\u30E9\u30E0\u5171\u548C\u56FD",
                                    "\u30E2\u30FC\u30EA\u30B7\u30E3\u30B9",
                                    "\u30DE\u30E8\u30C3\u30C8",
                                    "\u30E1\u30AD\u30B7\u30B3",
                                    "\u30DF\u30AF\u30ED\u30CD\u30B7\u30A2\u9023\u90A6",
                                    "\u30E2\u30EB\u30C9\u30D0\u5171\u548C\u56FD",
                                    "\u30E2\u30CA\u30B3\u516C\u56FD",
                                    "\u30E2\u30F3\u30B4\u30EB",
                                    "\u30E2\u30F3\u30C6\u30CD\u30B0\u30ED\u5171\u548C\u56FD",
                                    "\u30E2\u30F3\u30C8\u30BB\u30E9\u30C8",
                                    "\u30E2\u30ED\u30C3\u30B3",
                                    "\u30E2\u30B6\u30F3\u30D3\u30FC\u30AF",
                                    "\u30DF\u30E3\u30F3\u30DE\u30FC",
                                    "\u30CA\u30DF\u30D3\u30A2",
                                    "\u30CA\u30A6\u30EB",
                                    "\u30CD\u30D1\u30FC\u30EB",
                                    "\u30AA\u30E9\u30F3\u30C0\u9818\u30A2\u30F3\u30C6\u30A3\u30EB",
                                    "\u30AA\u30E9\u30F3\u30C0",
                                    "\u30CB\u30E5\u30FC\u30AB\u30EC\u30C9\u30CB\u30A2",
                                    "\u30CB\u30E5\u30FC\u30B8\u30FC\u30E9\u30F3\u30C9",
                                    "\u30CB\u30AB\u30E9\u30B0\u30A2",
                                    "\u30CB\u30B8\u30A7\u30FC\u30EB",
                                    "\u30CA\u30A4\u30B8\u30A7\u30EA\u30A2",
                                    "\u30CB\u30FC\u30B9",
                                    "\u30CE\u30FC\u30D5\u30A9\u30FC\u30AF\u5CF6",
                                    "\u5317\u30DE\u30EA\u30A2\u30CA\u8AF8\u5CF6",
                                    "\u30CE\u30EB\u30A6\u30A7\u30FC",
                                    "\u30AA\u30DE\u30FC\u30F3",
                                    "\u30D1\u30AD\u30B9\u30BF\u30F3",
                                    "\u30D1\u30E9\u30AA",
                                    "\u30D1\u30EC\u30B9\u30C1\u30CA\u81EA\u6CBB\u533A",
                                    "\u30D1\u30CA\u30DE",
                                    "\u30D1\u30D7\u30A2\u30CB\u30E5\u30FC\u30AE\u30CB\u30A2",
                                    "\u30D1\u30E9\u30B0\u30A2\u30A4",
                                    "\u30DA\u30EB\u30FC",
                                    "\u30D5\u30A3\u30EA\u30D4\u30F3",
                                    "\u30D4\u30C8\u30B1\u30A2\u30F3\u8AF8\u5CF6",
                                    "\u30DD\u30FC\u30E9\u30F3\u30C9",
                                    "\u30DD\u30EB\u30C8\u30AC\u30EB",
                                    "\u30D7\u30A8\u30EB\u30C8\u30EA\u30B3",
                                    "\u30AB\u30BF\u30FC\u30EB",
                                    "\u30EC\u30E6\u30CB\u30AA\u30F3",
                                    "\u30EB\u30FC\u30DE\u30CB\u30A2",
                                    "\u30ED\u30B7\u30A2",
                                    "\u30EB\u30EF\u30F3\u30C0",
                                    "\u30B5\u30F3\u30FB\u30D0\u30EB\u30C6\u30EB\u30DF\u30FC\u5CF6",
                                    "\u30BB\u30F3\u30C8\u30D8\u30EC\u30CA",
                                    "\u30BB\u30F3\u30C8\u30AF\u30EA\u30B9\u30C8\u30D5\u30A1\u30FC\u30FB\u30CD\u30A4\u30D3\u30B9\u9023\u90A6",
                                    "\u30BB\u30F3\u30C8\u30EB\u30B7\u30A2",
                                    "\u30BB\u30F3\u30C8\u30FB\u30DE\u30FC\u30C1\u30F3\u5CF6",
                                    "\u30B5\u30F3\u30D4\u30A8\u30FC\u30EB\u5CF6\u30FB\u30DF\u30AF\u30ED\u30F3\u5CF6",
                                    "\u30BB\u30F3\u30C8\u30D3\u30F3\u30BB\u30F3\u30C8\u30FB\u30B0\u30EC\u30CA\u30C7\u30A3\u30FC\u30F3",
                                    "\u30B5\u30E2\u30A2",
                                    "\u30B5\u30F3\u30DE\u30EA\u30CE",
                                    "\u30B5\u30F3\u30C8\u30E1\u30D7\u30EA\u30F3\u30B7\u30DA",
                                    "\u30B5\u30A6\u30B8\u30A2\u30E9\u30D3\u30A2",
                                    "\u30BB\u30CD\u30AC\u30EB",
                                    "\u30BB\u30EB\u30D3\u30A2",
                                    "\u30BB\u30A4\u30B7\u30A7\u30EB",
                                    "\u30B7\u30A8\u30E9\u30EC\u30AA\u30CD",
                                    "\u30B7\u30F3\u30AC\u30DD\u30FC\u30EB",
                                    "\u30B9\u30ED\u30D0\u30AD\u30A2",
                                    "\u30B9\u30ED\u30D9\u30CB\u30A2",
                                    "\u30BD\u30ED\u30E2\u30F3\u8AF8\u5CF6",
                                    "\u30BD\u30DE\u30EA\u30A2",
                                    "\u5357\u30A2\u30D5\u30EA\u30AB\u5171\u548C\u56FD",
                                    "\u30B5\u30A6\u30B9\u30B8\u30E7\u30FC\u30B8\u30A2\u30FB\u30B5\u30A6\u30B9\u30B5\u30F3\u30C9\u30A6\u30A3\u30C3\u30C1\u8AF8\u5CF6",
                                    "\u30B9\u30DA\u30A4\u30F3",
                                    "\u30B9\u30EA\u30E9\u30F3\u30AB",
                                    "\u30B9\u30FC\u30C0\u30F3",
                                    "\u30B9\u30EA\u30CA\u30E0",
                                    "\u30B9\u30F4\u30A1\u30FC\u30EB\u30D0\u30EB\u8AF8\u5CF6\u304A\u3088\u3073\u30E4\u30F3\u30DE\u30A4\u30A8\u30F3\u5CF6",
                                    "\u30B9\u30EF\u30B8\u30E9\u30F3\u30C9\u738B\u56FD",
                                    "\u30B9\u30A6\u30A7\u30FC\u30C7\u30F3",
                                    "\u30B9\u30A4\u30B9",
                                    "\u30B7\u30EA\u30A2",
                                    "\u53F0\u6E7E",
                                    "\u30BF\u30B8\u30AD\u30B9\u30BF\u30F3\u5171\u548C\u56FD",
                                    "\u30BF\u30F3\u30B6\u30CB\u30A2",
                                    "\u30BF\u30A4",
                                    "\u6771\u30C6\u30A3\u30E2\u30FC\u30EB",
                                    "\u30C8\u30FC\u30B4",
                                    "\u30C8\u30B1\u30E9\u30A6",
                                    "\u30C8\u30F3\u30AC",
                                    "\u30C8\u30EA\u30CB\u30C0\u30FC\u30C9\u30FB\u30C8\u30D0\u30B4",
                                    "\u30C1\u30E5\u30CB\u30B8\u30A2",
                                    "\u30C8\u30EB\u30B3",
                                    "\u30C8\u30EB\u30AF\u30E1\u30CB\u30B9\u30BF\u30F3",
                                    "\u30BF\u30FC\u30AF\u30B9\u30FB\u30AB\u30A4\u30B3\u30B9\u8AF8\u5CF6",
                                    "\u30C4\u30D0\u30EB",
                                    "\u30A6\u30AC\u30F3\u30C0",
                                    "\u30A6\u30AF\u30E9\u30A4\u30CA",
                                    "\u30A2\u30E9\u30D6\u9996\u9577\u56FD\u9023\u90A6",
                                    "\u30A4\u30AE\u30EA\u30B9",
                                    "\u30A2\u30E1\u30EA\u30AB\u5408\u8846\u56FD",
                                    "\u5408\u8846\u56FD\u9818\u6709\u5C0F\u96E2\u5CF6",
                                    "\u30A2\u30E1\u30EA\u30AB\u9818\u30F4\u30A1\u30FC\u30B8\u30F3\u8AF8\u5CF6",
                                    "\u30A6\u30EB\u30B0\u30A2\u30A4",
                                    "\u30A6\u30BA\u30D9\u30AD\u30B9\u30BF\u30F3",
                                    "\u30D0\u30CC\u30A2\u30C4",
                                    "\u30D9\u30CD\u30BA\u30A8\u30E9",
                                    "\u30D9\u30C8\u30CA\u30E0",
                                    "\u30A6\u30A9\u30EA\u30B9\u30FB\u30D5\u30C4\u30CA",
                                    "\u897F\u30B5\u30CF\u30E9",
                                    "\u30A4\u30A8\u30E1\u30F3",
                                    "\u30B6\u30F3\u30D3\u30A2",
                                    "\u30B8\u30F3\u30D0\u30D6\u30A8");
                        });

        public Object prefecture =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u5317\u6D77\u9053",
                                    "\u9752\u68EE\u770C",
                                    "\u5CA9\u624B\u770C",
                                    "\u5BAE\u57CE\u770C",
                                    "\u79CB\u7530\u770C",
                                    "\u5C71\u5F62\u770C",
                                    "\u798F\u5CF6\u770C",
                                    "\u8328\u57CE\u770C",
                                    "\u6803\u6728\u770C",
                                    "\u7FA4\u99AC\u770C",
                                    "\u57FC\u7389\u770C",
                                    "\u5343\u8449\u770C",
                                    "\u6771\u4EAC\u90FD",
                                    "\u795E\u5948\u5DDD\u770C",
                                    "\u65B0\u6F5F\u770C",
                                    "\u5BCC\u5C71\u770C",
                                    "\u77F3\u5DDD\u770C",
                                    "\u798F\u4E95\u770C",
                                    "\u5C71\u68A8\u770C",
                                    "\u9577\u91CE\u770C",
                                    "\u5C90\u961C\u770C",
                                    "\u9759\u5CA1\u770C",
                                    "\u611B\u77E5\u770C",
                                    "\u4E09\u91CD\u770C",
                                    "\u6ECB\u8CC0\u770C",
                                    "\u4EAC\u90FD\u5E9C",
                                    "\u5927\u962A\u5E9C",
                                    "\u5175\u5EAB\u770C",
                                    "\u5948\u826F\u770C",
                                    "\u548C\u6B4C\u5C71\u770C",
                                    "\u9CE5\u53D6\u770C",
                                    "\u5CF6\u6839\u770C",
                                    "\u5CA1\u5C71\u770C",
                                    "\u5E83\u5CF6\u770C",
                                    "\u5C71\u53E3\u770C",
                                    "\u5FB3\u5CF6\u770C",
                                    "\u9999\u5DDD\u770C",
                                    "\u611B\u5A9B\u770C",
                                    "\u9AD8\u77E5\u770C",
                                    "\u798F\u5CA1\u770C",
                                    "\u4F50\u8CC0\u770C",
                                    "\u9577\u5D0E\u770C",
                                    "\u718A\u672C\u770C",
                                    "\u5927\u5206\u770C",
                                    "\u5BAE\u5D0E\u770C",
                                    "\u9E7F\u5150\u5CF6\u770C",
                                    "\u6C96\u7E04\u770C");
                        });

        public Object ward =
                ZVal.arrayFromList("\u4E2D\u592E", "\u5317", "\u6771", "\u5357", "\u897F");

        public Object citySuffix = ZVal.arrayFromList("\u5E02");

        public Object wardSuffix = ZVal.arrayFromList("\u533A");

        public Object streetSuffix = ZVal.arrayFromList("\u753A");

        public Object postcodeFormats = ZVal.arrayFromList("{{postcode1}}{{postcode2}}");

        public Object cityFormats = ZVal.arrayFromList("{{lastName}}{{citySuffix}}");

        public Object streetNameFormats = ZVal.arrayFromList("{{lastName}}{{streetSuffix}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList(
                        "{{streetName}}{{lastName}}{{areaNumber}}-{{areaNumber}}-{{areaNumber}}");

        public Object addressFormats =
                ZVal.arrayFromList(
                        "{{postcode}}  {{prefecture}}{{city}}{{ward}}{{streetAddress}}",
                        "{{postcode}}  {{prefecture}}{{city}}{{ward}}{{streetAddress}} {{secondaryAddress}}");

        public Object secondaryAddressFormats =
                ZVal.arrayFromList(
                        "\u30CF\u30A4\u30C4{{lastName}}{{buildingNumber}}\u53F7",
                        "\u30B3\u30FC\u30DD{{lastName}}{{buildingNumber}}\u53F7");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\ja_JP\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "cityFormats",
                            "citySuffix",
                            "country",
                            "postcodeFormats",
                            "prefecture",
                            "secondaryAddressFormats",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetSuffix",
                            "ward",
                            "wardSuffix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/ja_JP/Address.php")
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
