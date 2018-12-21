package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.bn_BD.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.bn_BD.classes.Utils;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/bn_BD/Address.php

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

    public static final Object CONST_class = "Faker\\Provider\\bn_BD\\Address";

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
        public Object cityPrefix(RuntimeEnv env, Object... args) {
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
                                                            .bn_BD
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .cityPrefix)
                            .value());
        }

        @ConvertedMethod
        public Object state(RuntimeEnv env, Object... args) {
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
                                                            .bn_BD
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .state)
                            .value());
        }

        @ConvertedMethod
        public Object streetNumber(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    Utils.runtimeStaticObject.getBanglaNumber(
                            env,
                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, Address.class)
                                    .method("numberBetween")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(1, 100)
                                    .value()));
        }

        @ConvertedMethod
        public Object banglaStreetName(RuntimeEnv env, Object... args) {
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
                                                            .bn_BD
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .streetNames)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object cityPrefix =
                ZVal.arrayFromList(
                        "\u09A6\u0995\u09CD\u09B7\u09BF\u09A8",
                        "\u09AA\u09C2\u09B0\u09CD\u09AC",
                        "\u09AA\u09B6\u09CD\u099A\u09BF\u09AE",
                        "\u0989\u09A4\u09CD\u09A4\u09B0",
                        "\u09A8\u09A4\u09C1\u09A8",
                        "\u09B2\u09C7\u0987\u0995",
                        "\u09AA\u09CB\u09B0\u09CD\u099F");

        public Object citySuffix =
                ZVal.arrayFromList(
                        "\u099F\u09BE\u0989\u09A8",
                        "\u09A4\u09B2\u09BE",
                        "\u09B9\u09BE\u099F",
                        "\u0996\u09BE\u09A8\u09BE");

        public Object streetNames =
                ZVal.arrayFromList(
                        "\u09AC\u09B0\u0995\u09A4",
                        "\u09B9\u09BE\u099C\u09C0",
                        "\u0995\u09B0\u09BF\u09AE\u0989\u09A6\u09CD\u09A6\u09BF\u09A8");

        public Object streetSuffix =
                ZVal.arrayFromList(
                        "\u09A4\u09B2\u09C0",
                        "\u0997\u09B2\u09BF",
                        "\u099A\u09BF\u09AA\u09BE",
                        "\u09AC\u09CD\u09B0\u09C0\u099C",
                        "\u09B8\u09DC\u0995",
                        "\u09AC\u09BE\u0987\u09AA\u09BE\u09B8",
                        "\u0995\u09CD\u09AF\u09BE\u09AE\u09CD\u09AA");

        public Object postcode = ZVal.arrayFromList("#####", "#####-####");

        public Object state =
                ZVal.arrayFromList(
                        "\u0996\u09C1\u09B2\u09A8\u09BE",
                        "\u09AC\u09B0\u09BF\u09B6\u09BE\u09B2",
                        "\u099A\u09BF\u099F\u09BE\u0997\u0982",
                        "\u09A2\u09BE\u0995\u09BE",
                        "\u09B0\u09BE\u099C\u09B6\u09BE\u09B9\u09C0",
                        "\u09B8\u09BF\u09B2\u09C7\u099F",
                        "\u0995\u09C1\u09AE\u09BF\u09B2\u09CD\u09B2\u09BE");

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u0985\u09B8\u09CD\u099F\u09CD\u09B0\u09BF\u09AF\u09BC\u09BE",
                                    "\u0985\u09B8\u09CD\u099F\u09CD\u09B0\u09C7\u09B2\u09BF\u09AF\u09BC\u09BE",
                                    "\u0985\u09CD\u09AF\u09BE\u0999\u09CD\u0997\u09CB\u09B2\u09BE",
                                    "\u0985\u09CD\u09AF\u09BE\u09A8\u09CD\u099F\u09BE\u09B0\u09CD\u0995\u099F\u09BF\u0995\u09BE",
                                    "\u0985\u09CD\u09AF\u09BE\u09B8\u09B8\u09C7\u09A8\u09B6\u09A8 \u0986\u0987\u09B2\u09CD\u09AF\u09BE\u09A8\u09CD\u09A1",
                                    "\u0986\u0987\u09AD\u09B0\u09BF \u0995\u09CB\u09B8\u09CD\u099F",
                                    "\u0986\u0987\u09B2 \u0985\u09AB \u09AE\u09CD\u09AF\u09BE\u09A8",
                                    "\u0986\u0987\u09B8\u09B2\u09CD\u09AF\u09BE\u09A8\u09CD\u09A1",
                                    "\u0986\u099C\u09BE\u09B0\u09AC\u09BE\u0987\u099C\u09BE\u09A8",
                                    "\u0986\u09AB\u0997\u09BE\u09A8\u09BF\u09B8\u09CD\u09A4\u09BE\u09A8",
                                    "\u0986\u09AE\u09C7\u09B0\u09BF\u0995\u09BE\u09A8 \u09B8\u09BE\u09AE\u09CB\u09AF\u09BC\u09BE",
                                    "\u0986\u09AF\u09BC\u09BE\u09B0\u09B2\u09CD\u09AF\u09BE\u09A8\u09CD\u09A1",
                                    "\u0986\u09B0\u09C1\u09AC\u09BE",
                                    "\u0986\u09B0\u09CD\u099C\u09C7\u09A8\u09CD\u099F\u09BF\u09A8\u09BE",
                                    "\u0986\u09B0\u09CD\u09AE\u09C7\u09A8\u09BF\u09AF\u09BC\u09BE",
                                    "\u0986\u09B2\u099C\u09C7\u09B0\u09BF\u09AF\u09BC\u09BE",
                                    "\u0986\u09B2\u09AC\u09CD\u09AF\u09BE\u09A8\u09BF\u09AF\u09BC\u09BE",
                                    "\u0986\u09B2\u09BE\u09A8\u09CD\u09A1 \u09A6\u09CD\u09AC\u09C0\u09AA\u09AA\u09C1\u099E\u09CD\u099C",
                                    "\u0987\u0989\u0995\u09CD\u09B0\u09C7\u0987\u09A8",
                                    "\u0987\u0995\u09C1\u09AF\u09BC\u09C7\u09A1\u09B0",
                                    "\u0987\u09A4\u09BE\u09B2\u09C0",
                                    "\u0987\u09A8\u09CD\u09A6\u09CB\u09A8\u09C7\u09B6\u09BF\u09AF\u09BC\u09BE",
                                    "\u0987\u09AB\u09BF\u0993\u09AA\u09BF\u09AF\u09BC\u09BE",
                                    "\u0987\u09AF\u09BC\u09C7\u09AE\u09C7\u09A8",
                                    "\u0987\u09B0\u09BE\u0995",
                                    "\u0987\u09B0\u09BE\u09A8",
                                    "\u0987\u09B0\u09BF\u09A4\u09CD\u09B0\u09BF\u09AF\u09BC\u09BE",
                                    "\u0987\u09B8\u09CD\u09B0\u09BE\u09AF\u09BC\u09C7\u09B2",
                                    "\u0989\u0997\u09BE\u09A8\u09CD\u09A1\u09BE",
                                    "\u0989\u099C\u09AC\u09C7\u0995\u09BF\u09B8\u09CD\u09A4\u09BE\u09A8",
                                    "\u0989\u09A4\u09CD\u09A4\u09B0 \u0995\u09CB\u09B0\u09BF\u09AF\u09BC\u09BE",
                                    "\u0989\u09A4\u09CD\u09A4\u09B0\u09BE\u099E\u09CD\u099A\u09B2\u09C0\u09AF\u09BC \u09AE\u09BE\u09B0\u09BF\u09AF\u09BC\u09BE\u09A8\u09BE \u09A6\u09CD\u09AC\u09C0\u09AA\u09AA\u09C1\u099E\u09CD\u099C",
                                    "\u0989\u09B0\u09C1\u0997\u09C1\u09AF\u09BC\u09C7",
                                    "\u098F\u09A8\u09CD\u099F\u09BF\u0997\u09C1\u09AF\u09BC\u09BE \u0993 \u09AC\u09BE\u09B0\u09AC\u09C1\u09A1\u09BE",
                                    "\u098F\u09B2 \u09B8\u09BE\u09B2\u09AD\u09C7\u09A6\u09B0",
                                    "\u098F\u09B8\u09CD\u09A4\u09CB\u09A8\u09BF\u09AF\u09BC\u09BE",
                                    "\u098F\u09CD\u09AF\u09BE\u0999\u09CD\u0997\u09C1\u0987\u09B2\u09BE",
                                    "\u098F\u09CD\u09AF\u09BE\u09A8\u09CD\u09A1\u09CB\u09B0\u09BE",
                                    "\u0993\u09AE\u09BE\u09A8",
                                    "\u0993\u09AF\u09BC\u09BE\u09B2\u09BF\u09B8 \u0993 \u09AB\u09C1\u099F\u09C1\u09A8\u09BE",
                                    "\u0995\u0999\u09CD\u0997\u09CB - \u09AC\u09CD\u09B0\u09BE\u099C\u09BE\u09AD\u09BF\u09B2",
                                    "\u0995\u0999\u09CD\u0997\u09CB-\u0995\u09BF\u09A8\u09B6\u09BE\u09B8\u09BE",
                                    "\u0995\u09AE\u09CB\u09B0\u09CB\u09B8",
                                    "\u0995\u09AE\u09CD\u09AC\u09CB\u09A1\u09BF\u09AF\u09BC\u09BE",
                                    "\u0995\u09B8\u09CB\u09AD\u09CB",
                                    "\u0995\u09BE\u099C\u09BE\u0995\u09B8\u09CD\u09A5\u09BE\u09A8",
                                    "\u0995\u09BE\u09A4\u09BE\u09B0",
                                    "\u0995\u09BE\u09A8\u09BE\u09A1\u09BE",
                                    "\u0995\u09BF\u0989\u09AC\u09BE",
                                    "\u0995\u09BF\u0989\u09B0\u09BE\u09B8\u09BE\u0993",
                                    "\u0995\u09BF\u09B0\u09BF\u09AC\u09BE\u09A4\u09BF",
                                    "\u0995\u09BF\u09B0\u09CD\u0997\u09BF\u099C\u09BF\u09AF\u09BC\u09BE",
                                    "\u0995\u09C1\u0989\u099F\u09BE \u098F\u09AC\u0982 \u09AE\u09C7\u09B2\u09BF\u09B2\u09BE",
                                    "\u0995\u09C1\u0995 \u09A6\u09CD\u09AC\u09C0\u09AA\u09AA\u09C1\u099E\u09CD\u099C",
                                    "\u0995\u09C1\u09AF\u09BC\u09C7\u09A4",
                                    "\u0995\u09C7\u09A8\u09BF\u09AF\u09BC\u09BE",
                                    "\u0995\u09C7\u09AA\u09AD\u09BE\u09B0\u09CD\u09A6\u09C7",
                                    "\u0995\u09C7\u09AE\u09CD\u09AF\u09BE\u09A8 \u09A6\u09CD\u09AC\u09C0\u09AA\u09AA\u09C1\u099E\u09CD\u099C",
                                    "\u0995\u09CB\u0995\u09CB\u09B8 (\u0995\u09A6\u09CD\u09AC\u09C0\u09AA\u09AA\u09C1\u099E\u09CD\u099C",
                                    "\u0995\u09CB\u09B2\u09CB\u09AE\u09CD\u09AC\u09BF\u09AF\u09BC\u09BE",
                                    "\u0995\u09CB\u09B8\u09CD\u099F\u09BE\u09B0\u09BF\u0995\u09BE",
                                    "\u0995\u09CD\u09AF\u09BE\u09A8\u09BE\u09B0\u09BF \u09A6\u09CD\u09AC\u09C0\u09AA\u09AA\u09C1\u099E\u09CD\u099C",
                                    "\u0995\u09CD\u09AF\u09BE\u09AE\u09C7\u09B0\u09C1\u09A8",
                                    "\u0995\u09CD\u09AF\u09BE\u09B0\u09BF\u09AC\u09BF\u09AF\u09BC\u09BE\u09A8 \u09A8\u09C7\u09A6\u09BE\u09B0\u09B2\u09CD\u09AF\u09BE\u09A8\u09CD\u09A1\u09B8",
                                    "\u0995\u09CD\u09B0\u09BF\u09B8\u09AE\u09BE\u09B8 \u09A6\u09CD\u09AC\u09C0\u09AA",
                                    "\u0995\u09CD\u09B0\u09CB\u09AF\u09BC\u09C7\u09B6\u09BF\u09AF\u09BC\u09BE",
                                    "\u0997\u09BE\u09AE\u09CD\u09AC\u09BF\u09AF\u09BC\u09BE",
                                    "\u0997\u09BF\u09A8\u09BF",
                                    "\u0997\u09BF\u09A8\u09BF-\u09AC\u09BF\u09B8\u09BE\u0989",
                                    "\u0997\u09BF\u09AF\u09BC\u09BE\u09A8\u09BE",
                                    "\u0997\u09C1\u09AF\u09BC\u09BE\u09A6\u09C7\u09B2\u09CC\u09AA",
                                    "\u0997\u09C1\u09AF\u09BC\u09BE\u09AE",
                                    "\u0997\u09CB\u09AF\u09BC\u09BE\u099F\u09BF\u09AE\u09BE\u09B2\u09BE",
                                    "\u0997\u09CD\u09AF\u09BE\u09AC\u09A8",
                                    "\u0997\u09CD\u09B0\u09BE\u099E\u09CD\u099C\u09BF",
                                    "\u0997\u09CD\u09B0\u09C0\u09A8\u09B2\u09CD\u09AF\u09BE\u09A8\u09CD\u09A1",
                                    "\u0997\u09CD\u09B0\u09C0\u09B8",
                                    "\u0997\u09CD\u09B0\u09C7\u09A8\u09BE\u09A1\u09BE",
                                    "\u0998\u09BE\u09A8\u09BE",
                                    "\u099A\u09BE\u09A6",
                                    "\u099A\u09BF\u09B2\u09BF",
                                    "\u099A\u09C0\u09A8",
                                    "\u099A\u09C7\u0995 \u09AA\u09CD\u09B0\u099C\u09BE\u09A4\u09A8\u09CD\u09A4\u09CD\u09B0",
                                    "\u099C\u09B0\u09CD\u099C\u09BF\u09AF\u09BC\u09BE",
                                    "\u099C\u09B0\u09CD\u09A1\u09A8",
                                    "\u099C\u09BE\u09AA\u09BE\u09A8",
                                    "\u099C\u09BE\u09AE\u09CD\u09AC\u09BF\u09AF\u09BC\u09BE",
                                    "\u099C\u09BE\u09B0\u09CD\u09AE\u09BE\u09A8\u09BF",
                                    "\u099C\u09BE\u09B0\u09CD\u09B8\u09BF",
                                    "\u099C\u09BF\u09AC\u09C1\u09A4\u09BF",
                                    "\u099C\u09BF\u09AC\u09CD\u09B0\u09BE\u09B2\u09CD\u099F\u09BE\u09B0",
                                    "\u099C\u09BF\u09AE\u09CD\u09AC\u09BE\u09AC\u09CB\u09AF\u09BC\u09C7",
                                    "\u099C\u09CD\u09AF\u09BE\u09AE\u09BE\u0987\u0995\u09BE",
                                    "\u099F\u09C1\u09AD\u09BE\u09B2\u09C1",
                                    "\u099F\u09CB\u0995\u09C7\u09B2\u09BE\u0989",
                                    "\u099F\u09CB\u0997\u09CB",
                                    "\u099F\u09CB\u0999\u09CD\u0997\u09BE",
                                    "\u099F\u09CD\u09B0\u09BF\u09B8\u09CD\u099F\u09BE\u09A8 \u09A1\u09BE \u0995\u09C1\u09A8\u09B9\u09BE",
                                    "\u09A1\u09C7\u09A8\u09AE\u09BE\u09B0\u09CD\u0995",
                                    "\u09A1\u09CB\u09AE\u09BF\u09A8\u09BF\u0995\u09BE",
                                    "\u09A1\u09CB\u09AE\u09C7\u09A8\u09BF\u0995\u09BE\u09A8 \u09AA\u09CD\u09B0\u099C\u09BE\u09A4\u09A8\u09CD\u09A4\u09CD\u09B0",
                                    "\u09A4\u09BE\u0987\u0993\u09AF\u09BC\u09BE\u09A8",
                                    "\u09A4\u09BE\u099C\u09BF\u0995\u09B8\u09CD\u09A5\u09BE\u09A8",
                                    "\u09A4\u09BE\u099E\u09CD\u099C\u09BE\u09A8\u09BF\u09AF\u09BC\u09BE",
                                    "\u09A4\u09BF\u0989\u09A8\u09BF\u09B6\u09BF\u09AF\u09BC\u09BE",
                                    "\u09A4\u09BF\u09AE\u09C1\u09B0-\u09B2\u09C7\u09B8\u09CD\u09A4\u09C7",
                                    "\u09A4\u09C1\u09B0\u09B8\u09CD\u0995",
                                    "\u09A4\u09C1\u09B0\u09CD\u0995\u09AE\u09C7\u09A8\u09BF\u09B8\u09CD\u09A4\u09BE\u09A8",
                                    "\u09A4\u09C1\u09B0\u09CD\u0995\u09B8 \u0993 \u0995\u09BE\u0987\u0995\u09CB\u09B8 \u09A6\u09CD\u09AC\u09C0\u09AA\u09AA\u09C1\u099E\u09CD\u099C",
                                    "\u09A4\u09CD\u09B0\u09BF\u09A8\u09BF\u09A8\u09BE\u09A6 \u0993 \u099F\u09CB\u09AC\u09CD\u09AF\u09BE\u0997\u09CB",
                                    "\u09A5\u09BE\u0987\u09B2\u09CD\u09AF\u09BE\u09A8\u09CD\u09A1",
                                    "\u09A6\u0995\u09CD\u09B7\u09BF\u09A3 \u0986\u09AB\u09CD\u09B0\u09BF\u0995\u09BE",
                                    "\u09A6\u0995\u09CD\u09B7\u09BF\u09A3 \u0995\u09CB\u09B0\u09BF\u09AF\u09BC\u09BE",
                                    "\u09A6\u0995\u09CD\u09B7\u09BF\u09A3 \u099C\u09B0\u09CD\u099C\u09BF\u09AF\u09BC\u09BE \u0993 \u09A6\u0995\u09CD\u09B7\u09BF\u09A3 \u09B8\u09CD\u09AF\u09BE\u09A8\u09CD\u09A1\u0989\u0987\u099A \u09A6\u09CD\u09AC\u09C0\u09AA\u09AA\u09C1\u099E\u09CD\u099C",
                                    "\u09A6\u0995\u09CD\u09B7\u09BF\u09A8 \u09B8\u09C1\u09A6\u09BE\u09A8",
                                    "\u09A6\u09BF\u09AF\u09BC\u09C7\u0997\u09CB \u0997\u09BE\u09B0\u09CD\u09B8\u09BF\u09AF\u09BC\u09BE",
                                    "\u09A8\u09B0\u0993\u09AF\u09BC\u09C7",
                                    "\u09A8\u09BE\u0987\u099C\u09BE\u09B0",
                                    "\u09A8\u09BE\u0987\u099C\u09C7\u09B0\u09BF\u09AF\u09BC\u09BE",
                                    "\u09A8\u09BE\u0989\u09B0\u09C1",
                                    "\u09A8\u09BE\u09AE\u09BF\u09AC\u09BF\u09AF\u09BC\u09BE",
                                    "\u09A8\u09BF\u0989 \u0995\u09CD\u09AF\u09BE\u09B2\u09C7\u09A1\u09CB\u09A8\u09BF\u09AF\u09BC\u09BE",
                                    "\u09A8\u09BF\u0989\u099C\u09BF\u09B2\u09CD\u09AF\u09BE\u09A8\u09CD\u09A1",
                                    "\u09A8\u09BF\u0989\u09AF\u09BC\u09C7",
                                    "\u09A8\u09BF\u0995\u09BE\u09B0\u09BE\u0997\u09C1\u09AF\u09BC\u09BE",
                                    "\u09A8\u09BF\u09B0\u0995\u09CD\u09B7\u09C0\u09AF\u09BC \u0997\u09BF\u09A8\u09BF",
                                    "\u09A8\u09BF\u09B0\u09AB\u09CB\u0995 \u09A6\u09CD\u09AC\u09C0\u09AA",
                                    "\u09A8\u09C7\u09A6\u09BE\u09B0\u09B2\u09CD\u09AF\u09BE\u09A8\u09CD\u09A1\u09B8",
                                    "\u09A8\u09C7\u09AA\u09BE\u09B2",
                                    "\u09AA\u09B0\u09CD\u09A4\u09C1\u0997\u09BE\u09B2",
                                    "\u09AA\u09B6\u09CD\u099A\u09BF\u09AE \u09B8\u09BE\u09B9\u09BE\u09B0\u09BE",
                                    "\u09AA\u09BE\u0995\u09BF\u09B8\u09CD\u09A4\u09BE\u09A8",
                                    "\u09AA\u09BE\u09A8\u09BE\u09AE\u09BE",
                                    "\u09AA\u09BE\u09AA\u09C1\u09AF\u09BC\u09BE \u09A8\u09BF\u0989 \u0997\u09BF\u09A8\u09BF",
                                    "\u09AA\u09BE\u09B2\u09BE\u0989",
                                    "\u09AA\u09BF\u099F\u0995\u09C7\u09AF\u09BC\u09BE\u09B0\u09CD\u09A8 \u09A6\u09CD\u09AC\u09C0\u09AA\u09AA\u09C1\u099E\u09CD\u099C",
                                    "\u09AA\u09BF\u09B0\u09C1",
                                    "\u09AA\u09C1\u09AF\u09BC\u09C7\u09B0\u09CD\u09A4\u09CB \u09B0\u09BF\u0995\u09CB",
                                    "\u09AA\u09CB\u09B2\u09CD\u09AF\u09BE\u09A8\u09CD\u09A1",
                                    "\u09AA\u09CD\u09AF\u09BE\u09B0\u09BE\u0997\u09C1\u09AF\u09BC\u09C7",
                                    "\u09AB\u0995\u09B2\u09CD\u09AF\u09BE\u09A8\u09CD\u09A1 \u09A6\u09CD\u09AC\u09C0\u09AA\u09AA\u09C1\u099E\u09CD\u099C",
                                    "\u09AB\u09B0\u09BE\u09B8\u09C0 \u0997\u09BE\u09AF\u09BC\u09BE\u09A8\u09BE",
                                    "\u09AB\u09B0\u09BE\u09B8\u09C0 \u09A6\u0995\u09CD\u09B7\u09BF\u09A3\u09BE\u099E\u09CD\u099A\u09B2",
                                    "\u09AB\u09B0\u09BE\u09B8\u09C0 \u09AA\u09B2\u09BF\u09A8\u09C7\u09B6\u09BF\u09AF\u09BC\u09BE",
                                    "\u09AB\u09BF\u099C\u09BF",
                                    "\u09AB\u09BF\u09A8\u09B2\u09CD\u09AF\u09BE\u09A8\u09CD\u09A1",
                                    "\u09AB\u09BF\u09B2\u09BF\u09AA\u09BE\u0987\u09A8",
                                    "\u09AB\u09BF\u09B2\u09BF\u09B8\u09CD\u09A4\u09BF\u09A8 \u0985\u099E\u09CD\u099A\u09B2\u09B8\u09AE\u09C2\u09B9",
                                    "\u09AB\u09CD\u09AF\u09BE\u09B0\u0993 \u09A6\u09CD\u09AC\u09C0\u09AA\u09AA\u09C1\u099E\u09CD\u099C",
                                    "\u09AB\u09CD\u09B0\u09BE\u09A8\u09CD\u09B8",
                                    "\u09AC\u09A4\u09B8\u09CB\u09AF\u09BC\u09BE\u09A8\u09BE",
                                    "\u09AC\u09B8\u09A8\u09BF\u09AF\u09BC\u09BE \u0993 \u09B9\u09BE\u09B0\u09CD\u099C\u09C7\u0997\u09CB\u09AD\u09BF\u09A8\u09BE",
                                    "\u09AC\u09BE\u0982\u09B2\u09BE\u09A6\u09C7\u09B6",
                                    "\u09AC\u09BE\u09B0\u09AC\u09BE\u09A6\u09CB\u09B8",
                                    "\u09AC\u09BE\u09B0\u09AE\u09C1\u09A1\u09BE",
                                    "\u09AC\u09BE\u09B9\u09B0\u09BE\u0987\u09A8",
                                    "\u09AC\u09BE\u09B9\u09BE\u09AE\u09BE \u09A6\u09CD\u09AC\u09C0\u09AA\u09AA\u09C1\u099E\u09CD\u099C",
                                    "\u09AC\u09C1\u09B0\u0995\u09BF\u09A8\u09BE \u09AB\u09BE\u09B8\u09CB",
                                    "\u09AC\u09C1\u09B0\u09C1\u09A8\u09CD\u09A1\u09BF",
                                    "\u09AC\u09C1\u09B2\u0997\u09C7\u09B0\u09BF\u09AF\u09BC\u09BE",
                                    "\u09AC\u09C7\u09A8\u09BF\u09A8",
                                    "\u09AC\u09C7\u09B2\u099C\u09BF\u09AF\u09BC\u09BE\u09AE",
                                    "\u09AC\u09C7\u09B2\u09BF\u099C",
                                    "\u09AC\u09C7\u09B2\u09CB\u09B0\u09C1\u09B6\u09BF\u09AF\u09BC\u09BE",
                                    "\u09AC\u09CB\u09B2\u09BF\u09AD\u09BF\u09AF\u09BC\u09BE",
                                    "\u09AC\u09CD\u09B0\u09BE\u099C\u09BF\u09B2",
                                    "\u09AC\u09CD\u09B0\u09BF\u099F\u09BF\u09B6 \u09AD\u09BE\u09B0\u09A4 \u09AE\u09B9\u09BE\u09B8\u09BE\u0997\u09B0\u09C0\u09AF\u09BC \u0985\u099E\u09CD\u099A\u09B2",
                                    "\u09AC\u09CD\u09B0\u09BF\u099F\u09BF\u09B6 \u09AD\u09BE\u09B0\u09CD\u099C\u09BF\u09A8 \u09A6\u09CD\u09AC\u09C0\u09AA\u09AA\u09C1\u099E\u09CD\u099C",
                                    "\u09AC\u09CD\u09B0\u09C1\u09A8\u09C7\u0987",
                                    "\u09AD\u09BE\u09A8\u09C1\u09AF\u09BC\u09BE\u099F\u09C1",
                                    "\u09AD\u09BE\u09B0\u09A4",
                                    "\u09AD\u09BF\u09AF\u09BC\u09C7\u09A4\u09A8\u09BE\u09AE",
                                    "\u09AD\u09C1\u099F\u09BE\u09A8",
                                    "\u09AD\u09C7\u09A8\u09C7\u099C\u09C1\u09AF\u09BC\u09C7\u09B2\u09BE",
                                    "\u09AD\u09CD\u09AF\u09BE\u099F\u09BF\u0995\u09BE\u09A8 \u09B8\u09BF\u099F\u09BF",
                                    "\u09AE\u0999\u09CD\u0997\u09CB\u09B2\u09BF\u09AF\u09BC\u09BE",
                                    "\u09AE\u09A7\u09CD\u09AF \u0986\u09AB\u09CD\u09B0\u09BF\u0995\u09BE\u09B0 \u09AA\u09CD\u09B0\u099C\u09BE\u09A4\u09A8\u09CD\u09A4\u09CD\u09B0",
                                    "\u09AE\u09A8\u09CD\u099F\u09B8\u09C7\u09B0\u09BE\u099F",
                                    "\u09AE\u09A8\u09CD\u099F\u09BF\u09A8\u09BF\u0997\u09CD\u09B0\u09CB",
                                    "\u09AE\u09B0\u09BF\u09A4\u09BE\u09A8\u09BF\u09AF\u09BC\u09BE",
                                    "\u09AE\u09B0\u09BF\u09B6\u09BE\u09B8",
                                    "\u09AE\u09BE\u0987\u0995\u09CD\u09B0\u09CB\u09A8\u09C7\u09B6\u09BF\u09AF\u09BC\u09BE",
                                    "\u09AE\u09BE\u09A6\u09BE\u0997\u09BE\u09B8\u09CD\u0995\u09BE\u09B0",
                                    "\u09AE\u09BE\u09AF\u09BC\u09BE\u09A8\u09AE\u09BE\u09B0 (\u09AC\u09BE",
                                    "\u09AE\u09BE\u09AF\u09BC\u09CB\u09A4\u09CD\u09A4\u09C7",
                                    "\u09AE\u09BE\u09B0\u09CD\u0995\u09BF\u09A8 \u09AD\u09BE\u09B0\u09CD\u099C\u09BF\u09A8 \u09A6\u09CD\u09AC\u09C0\u09AA\u09AA\u09C1\u099E\u09CD\u099C",
                                    "\u09AE\u09BE\u09B0\u09CD\u0995\u09BF\u09A8 \u09AF\u09C1\u0995\u09CD\u09A4\u09B0\u09BE\u09B7\u09CD\u099F\u09CD\u09B0",
                                    "\u09AE\u09BE\u09B0\u09CD\u099F\u09BF\u09A8\u09BF\u0995",
                                    "\u09AE\u09BE\u09B0\u09CD\u09B6\u09BE\u09B2 \u09A6\u09CD\u09AC\u09C0\u09AA\u09AA\u09C1\u099E\u09CD\u099C",
                                    "\u09AE\u09BE\u09B2\u09A6\u09CD\u09AC\u09C0\u09AA",
                                    "\u09AE\u09BE\u09B2\u09AF\u09BC\u09C7\u09B6\u09BF\u09AF\u09BC\u09BE",
                                    "\u09AE\u09BE\u09B2\u09BE\u0989\u0987",
                                    "\u09AE\u09BE\u09B2\u09BF",
                                    "\u09AE\u09BE\u09B2\u09CD\u099F\u09BE",
                                    "\u09AE\u09BF\u09B6\u09B0",
                                    "\u09AE\u09C7\u0995\u09CD\u09B8\u09BF\u0995\u09CB",
                                    "\u09AE\u09CB\u099C\u09BE\u09AE\u09CD\u09AC\u09BF\u0995",
                                    "\u09AE\u09CB\u09A8\u09BE\u0995\u09CB",
                                    "\u09AE\u09CB\u09B0\u0995\u09CD\u0995\u09CB",
                                    "\u09AE\u09CB\u09B2\u09CD\u09A6\u09BE\u09AD\u09BF\u09AF\u09BC\u09BE",
                                    "\u09AE\u09CD\u09AF\u09BE\u0995\u09BE\u0993 \u098F\u09B8 \u098F \u0986\u09B0 \u099A\u09BE\u09AF\u09BC\u09A8\u09BE",
                                    "\u09AE\u09CD\u09AF\u09BE\u09B8\u09BE\u09A1\u09CB\u09A8\u09BF\u09AF\u09BC\u09BE",
                                    "\u09AF\u09C1\u0995\u09CD\u09A4\u09B0\u09BE\u099C\u09CD\u09AF",
                                    "\u09AF\u09C1\u0995\u09CD\u09A4\u09B0\u09BE\u09B7\u09CD\u099F\u09CD\u09B0\u09C7\u09B0 \u09AA\u09BE\u09B0\u09CD\u09B6\u09CD\u09AC\u09AC\u09B0\u09CD\u09A4\u09C0 \u09A6\u09CD\u09AC\u09C0\u09AA\u09AA\u09C1\u099E\u09CD\u099C",
                                    "\u09B0\u09BE\u09B6\u09BF\u09AF\u09BC\u09BE",
                                    "\u09B0\u09BF\u0987\u0989\u09A8\u09BF\u09AF\u09BC\u09A8",
                                    "\u09B0\u09C1\u09AE\u09BE\u09A8\u09BF\u09AF\u09BC\u09BE",
                                    "\u09B0\u09C1\u09AF\u09BC\u09BE\u09A8\u09CD\u09A1\u09BE",
                                    "\u09B2\u09BE\u0987\u09AC\u09C7\u09B0\u09BF\u09AF\u09BC\u09BE",
                                    "\u09B2\u09BE\u0993\u09B8",
                                    "\u09B2\u09BE\u0995\u09CD\u09B8\u09C7\u09AE\u09AC\u09BE\u09B0\u09CD\u0997",
                                    "\u09B2\u09BE\u09A4\u09CD\u09AD\u09BF\u09AF\u09BC\u09BE",
                                    "\u09B2\u09BF\u099A\u09C7\u09A8\u09B8\u09CD\u099F\u09C7\u0987\u09A8",
                                    "\u09B2\u09BF\u09A5\u09C1\u09AF\u09BC\u09BE\u09A8\u09BF\u09AF\u09BC\u09BE",
                                    "\u09B2\u09BF\u09AC\u09BF\u09AF\u09BC\u09BE",
                                    "\u09B2\u09C7\u09AC\u09BE\u09A8\u09A8",
                                    "\u09B2\u09C7\u09B8\u09CB\u09A5\u09CB",
                                    "\u09B6\u09CD\u09B0\u09C0\u09B2\u0999\u09CD\u0995\u09BE",
                                    "\u09B6\u09CD\u09B2\u09CB\u09AD\u09BE\u0995\u09BF\u09AF\u09BC\u09BE",
                                    "\u09B8\u0982\u09AF\u09C1\u0995\u09CD\u09A4 \u0986\u09B0\u09AC \u0986\u09AE\u09BF\u09B0\u09BE\u09A4",
                                    "\u09B8\u09B2\u09CB\u09AE\u09A8 \u09A6\u09CD\u09AC\u09C0\u09AA\u09AA\u09C1\u099E\u09CD\u099C",
                                    "\u09B8\u09BE\u0987\u09AA\u09CD\u09B0\u09BE\u09B8",
                                    "\u09B8\u09BE\u0993\u099F\u09CB\u09AE\u09BE \u0993 \u09AA\u09CD\u09B0\u09BF\u09A8\u09CD\u09B8\u09BF\u09AA\u09BF",
                                    "\u09B8\u09BE\u09A8 \u09AE\u09BE\u09B0\u09BF\u09A8\u09CB",
                                    "\u09B8\u09BE\u09AE\u09CB\u09AF\u09BC\u09BE",
                                    "\u09B8\u09BE\u09B0\u09CD\u09AC\u09BF\u09AF\u09BC\u09BE",
                                    "\u09B8\u09BF\u0999\u09CD\u0997\u09BE\u09AA\u09C1\u09B0",
                                    "\u09B8\u09BF\u09A8\u09CD\u099F \u09AE\u09BE\u09B0\u09CD\u099F\u09C7\u09A8",
                                    "\u09B8\u09BF\u09AF\u09BC\u09C7\u09B0\u09BE\u09B2\u09BF\u0993\u09A8",
                                    "\u09B8\u09BF\u09B0\u09BF\u09AF\u09BC\u09BE",
                                    "\u09B8\u09BF\u09B8\u09BF\u09B2\u09BF",
                                    "\u09B8\u09C1\u0987\u099C\u09BE\u09B0\u09B2\u09CD\u09AF\u09BE\u09A8\u09CD\u09A1",
                                    "\u09B8\u09C1\u0987\u09A1\u09C7\u09A8",
                                    "\u09B8\u09C1\u09A6\u09BE\u09A8",
                                    "\u09B8\u09C1\u09B0\u09BF\u09A8\u09BE\u09AE",
                                    "\u09B8\u09C7\u09A8\u09C7\u0997\u09BE\u09B2",
                                    "\u09B8\u09C7\u09A8\u09CD\u099F \u0995\u09BF\u099F\u09B8 \u0993 \u09A8\u09C7\u09AD\u09BF\u09B8",
                                    "\u09B8\u09C7\u09A8\u09CD\u099F \u09AA\u09BF\u09AF\u09BC\u09C7\u09B0 \u0993 \u09AE\u09BF\u0995\u09C1\u09AF\u09BC\u09C7\u09B2\u09A8",
                                    "\u09B8\u09C7\u09A8\u09CD\u099F \u09AC\u09BE\u09B0\u09A5\u09C7\u09B2\u09BF\u09AE\u09BF",
                                    "\u09B8\u09C7\u09A8\u09CD\u099F \u09AD\u09BF\u09A8\u09B8\u09C7\u09A8\u09CD\u099F \u0993 \u09A6\u09CD\u09AF\u09BE \u0997\u09CD\u09B0\u09C7\u09A8\u09BE\u09A1\u09BF\u09A8\u09B8",
                                    "\u09B8\u09C7\u09A8\u09CD\u099F \u09AE\u09BE\u09B0\u09CD\u099F\u09BF\u09A8",
                                    "\u09B8\u09C7\u09A8\u09CD\u099F \u09B2\u09C1\u09B8\u09BF\u09AF\u09BC\u09BE",
                                    "\u09B8\u09C7\u09A8\u09CD\u099F \u09B9\u09C7\u09B2\u09C7\u09A8\u09BE",
                                    "\u09B8\u09CB\u09AE\u09BE\u09B2\u09BF\u09AF\u09BC\u09BE",
                                    "\u09B8\u09CB\u09AF\u09BC\u09BE\u099C\u09BF\u09B2\u09CD\u09AF\u09BE\u09A8\u09CD\u09A1",
                                    "\u09B8\u09CC\u09A6\u09BF \u0986\u09B0\u09AC",
                                    "\u09B8\u09CD\u09AA\u09C7\u09A8",
                                    "\u09B8\u09CD\u09AC\u09BE\u09B2\u09AC\u09BE\u09B0\u09CD\u09A1 \u0993 \u099C\u09BE\u09A8 \u09AE\u09C7\u09AF\u09BC\u09C7\u09A8",
                                    "\u09B8\u09CD\u09B2\u09CB\u09AD\u09BE\u09A8\u09BF\u09AF\u09BC\u09BE",
                                    "\u09B9\u0982\u0995\u0982 \u098F\u09B8\u098F\u0986\u09B0 \u099A\u09C0\u09A8\u09BE",
                                    "\u09B9\u09A3\u09CD\u09A1\u09C1\u09B0\u09BE\u09B8",
                                    "\u09B9\u09BE\u0987\u09A4\u09BF",
                                    "\u09B9\u09BE\u0999\u09CD\u0997\u09C7\u09B0\u09BF");
                        });

        public Object cityFormats = ZVal.arrayFromList("{{cityPrefix}}{{citySuffix}}");

        public Object streetNameFormats =
                ZVal.arrayFromList("{{banglaStreetName}} {{streetSuffix}}");

        public Object streetAddressFormats = ZVal.arrayFromList("{{streetNumber}} {{streetName}}");

        public Object addressFormats = ZVal.arrayFromList("{{streetAddress}}, {{city}} {{state}}");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\bn_BD\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "cityFormats",
                            "cityPrefix",
                            "citySuffix",
                            "country",
                            "postcode",
                            "state",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetNames",
                            "streetSuffix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/bn_BD/Address.php")
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
