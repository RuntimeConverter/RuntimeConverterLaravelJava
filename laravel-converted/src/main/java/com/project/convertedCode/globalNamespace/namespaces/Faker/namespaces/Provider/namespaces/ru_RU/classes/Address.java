package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.ru_RU.classes;

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
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/ru_RU/Address.php

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
    public Object address(RuntimeEnv env, Object... args) {
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
                                                                .ru_RU
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "addressFormats")))
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
                                                        .ru_RU
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .addressFormats)
                        .value();
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Address.class,
                        format));
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
                                                                .ru_RU
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "city")))
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
                                                        .ru_RU
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .city)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\ru_RU\\Address";

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
        public Object buildingNumber(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("numerify")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
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
                                                                            .ru_RU
                                                                            .classes
                                                                            .Address
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .buildingNumber)
                                            .value())
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
                                                            .ru_RU
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .country)
                            .value());
        }

        @ConvertedMethod
        public Object postcode(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("toUpper")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Address.class)
                                            .method("bothify")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(
                                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                    env, this, Address.class)
                                                            .method("randomElement")
                                                            .addReferenceArgs(
                                                                    new RuntimeArgsWithReferences())
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
                                                                                            .ru_RU
                                                                                            .classes
                                                                                            .Address
                                                                                            .RequestStaticProperties
                                                                                            .class)
                                                                            .postcode)
                                                            .value())
                                            .value())
                            .value());
        }

        @ConvertedMethod
        public Object regionSuffix(RuntimeEnv env, Object... args) {
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
                                                            .ru_RU
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .regionSuffix)
                            .value());
        }

        @ConvertedMethod
        public Object region(RuntimeEnv env, Object... args) {
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
                                                            .ru_RU
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .region)
                            .value());
        }

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
                                                            .ru_RU
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .cityPrefix)
                            .value());
        }

        @ConvertedMethod
        public Object streetPrefix(RuntimeEnv env, Object... args) {
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
                                                            .ru_RU
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .streetPrefix)
                            .value());
        }

        @ConvertedMethod
        public Object street(RuntimeEnv env, Object... args) {
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
                                                            .ru_RU
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .street)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object cityPrefix = ZVal.arrayFromList("\u0433\u043E\u0440\u043E\u0434");

        public Object regionSuffix =
                ZVal.arrayFromList("\u043E\u0431\u043B\u0430\u0441\u0442\u044C");

        public Object streetPrefix =
                ZVal.arrayFromList(
                        "\u043F\u0435\u0440.",
                        "\u0443\u043B.",
                        "\u043F\u0440.",
                        "\u0448\u043E\u0441\u0441\u0435",
                        "\u043F\u043B.",
                        "\u0431\u0443\u043B\u044C\u0432\u0430\u0440",
                        "\u0432\u044A\u0435\u0437\u0434",
                        "\u0441\u043F\u0443\u0441\u043A",
                        "\u043F\u0440\u043E\u0435\u0437\u0434",
                        "\u043D\u0430\u0431.");

        public Object buildingNumber = ZVal.arrayFromList("##");

        public Object postcode = ZVal.arrayFromList("######");

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u0423\u043A\u0440\u0430\u0438\u043D\u0430",
                                    "\u0420\u043E\u0441\u0441\u0438\u0439\u0441\u043A\u0430\u044F \u0424\u0435\u0434\u0435\u0440\u0430\u0446\u0438\u044F",
                                    "\u0421\u0428\u0410",
                                    "\u041A\u0430\u043D\u0430\u0434\u0430",
                                    "\u0410\u0432\u0441\u0442\u0440\u0430\u043B\u0438\u044F",
                                    "\u0410\u0432\u0441\u0442\u0440\u0438\u044F",
                                    "\u0410\u0437\u0435\u0440\u0431\u0430\u0439\u0434\u0436\u0430\u043D",
                                    "\u0410\u043B\u0430\u043D\u0434\u0441\u043A\u0438\u0435 \u043E\u0441\u0442\u0440\u043E\u0432\u0430",
                                    "\u0410\u043B\u0431\u0430\u043D\u0438\u044F",
                                    "\u0410\u043B\u0436\u0438\u0440",
                                    "\u0410\u043C\u0435\u0440\u0438\u043A\u0430\u043D\u0441\u043A\u0438\u0435 \u043E\u0441\u0442\u0440\u043E\u0432\u0430 \u0421\u0430\u043C\u043E\u0430",
                                    "\u0410\u043D\u0433\u0438\u043B\u044C\u044F",
                                    "\u0410\u043D\u0433\u043E\u043B\u0430",
                                    "\u0410\u043D\u0434\u043E\u0440\u0440\u0430",
                                    "\u0410\u043D\u0442\u0430\u0440\u043A\u0442\u0438\u043A\u0430",
                                    "\u0410\u043D\u0442\u0438\u0433\u0443\u0430 \u0438 \u0411\u0430\u0440\u0431\u0443\u0434\u0430",
                                    "\u0410\u0440\u0433\u0435\u043D\u0442\u0438\u043D\u0430",
                                    "\u0410\u0440\u043C\u0435\u043D\u0438\u044F",
                                    "\u0410\u0440\u0443\u0431\u0430",
                                    "\u0410\u0444\u0433\u0430\u043D\u0438\u0441\u0442\u0430\u043D, \u0418\u0441\u043B\u0430\u043C\u0441\u043A\u0430\u044F \u0420\u0435\u0441\u043F\u0443\u0431\u043B\u0438\u043A\u0430",
                                    "\u0411\u0430\u0433\u0430\u043C\u044B",
                                    "\u0411\u0430\u043D\u0433\u043B\u0430\u0434\u0435\u0448",
                                    "\u0411\u0430\u0440\u0431\u0430\u0434\u043E\u0441",
                                    "\u0411\u0430\u0445\u0440\u0435\u0439\u043D",
                                    "\u0411\u0435\u043B\u0438\u0437",
                                    "\u0411\u0435\u043B\u043E\u0440\u0443\u0441\u0441\u0438\u044F",
                                    "\u0411\u0435\u043B\u044C\u0433\u0438\u044F",
                                    "\u0411\u0435\u0440\u043C\u0443\u0434\u0441\u043A\u0438\u0435 \u041E\u0441\u0442\u0440\u043E\u0432\u0430",
                                    "\u0411\u043E\u043B\u0433\u0430\u0440\u0438\u044F",
                                    "\u0411\u043E\u043B\u0438\u0432\u0438\u044F",
                                    "\u0411\u043E\u0441\u043D\u0438\u044F \u0438 \u0413\u0435\u0440\u0446\u0435\u0433\u043E\u0432\u0438\u043D\u0430",
                                    "\u0411\u043E\u0442\u0441\u0432\u0430\u043D\u0430",
                                    "\u0411\u0440\u0430\u0437\u0438\u043B\u0438\u044F",
                                    "\u0411\u0440\u0438\u0442\u0430\u043D\u0441\u043A\u0430\u044F \u0442\u0435\u0440\u0440\u0438\u0442\u043E\u0440\u0438\u044F \u0418\u043D\u0434\u0438\u0439\u0441\u043A\u043E\u0433\u043E \u043E\u043A\u0435\u0430\u043D\u0430",
                                    "\u0411\u0440\u0443\u043D\u0435\u0439 \u0414\u0430\u0440\u0443\u0441\u0441\u0430\u043B\u0430\u043C",
                                    "\u0411\u0443\u0440\u043A\u0438\u043D\u0430 \u0424\u0430\u0441\u043E",
                                    "\u0411\u0443\u0440\u0443\u043D\u0434\u0438",
                                    "\u0411\u0443\u0442\u0430\u043D",
                                    "\u0412\u0430\u043D\u0443\u0430\u0442\u0443",
                                    "\u0412\u0435\u043B\u0438\u043A\u043E\u0431\u0440\u0438\u0442\u0430\u043D\u0438\u044F",
                                    "\u0412\u0435\u043D\u0433\u0440\u0438\u044F",
                                    "\u0412\u0435\u043D\u0435\u0441\u0443\u044D\u043B\u0430",
                                    "\u0412\u0438\u0440\u0433\u0438\u043D\u0441\u043A\u0438\u0435 \u043E-\u0432\u0430, \u0412\u0435\u043B\u0438\u043A\u043E\u0431\u0440\u0438\u0442\u0430\u043D\u0438\u044F",
                                    "\u0412\u0438\u0440\u0433\u0438\u043D\u0441\u043A\u0438\u0435 \u043E-\u0432\u0430, \u0421\u0428\u0410",
                                    "\u0412\u043E\u0441\u0442\u043E\u0447\u043D\u044B\u0439 \u0422\u0438\u043C\u043E\u0440",
                                    "\u0412\u044C\u0435\u0442\u043D\u0430\u043C",
                                    "\u0413\u0430\u0431\u043E\u043D",
                                    "\u0413\u0430\u0438\u0442\u0438",
                                    "\u0413\u0430\u0439\u0430\u043D\u0430",
                                    "\u0413\u0430\u043C\u0431\u0438\u044F",
                                    "\u0413\u0430\u043D\u0430",
                                    "\u0413\u0432\u0430\u0434\u0435\u043B\u0443\u043F\u0430",
                                    "\u0413\u0432\u0430\u0442\u0435\u043C\u0430\u043B\u0430",
                                    "\u0413\u0432\u0438\u043D\u0435\u044F",
                                    "\u0413\u0432\u0438\u043D\u0435\u044F-\u0411\u0438\u0441\u0441\u0430\u0443",
                                    "\u0413\u0435\u0440\u043C\u0430\u043D\u0438\u044F",
                                    "\u0413\u0438\u0431\u0440\u0430\u043B\u0442\u0430\u0440",
                                    "\u0413\u043E\u043D\u0433\u043A\u043E\u043D\u0433",
                                    "\u0413\u043E\u043D\u0434\u0443\u0440\u0430\u0441",
                                    "\u0413\u043E\u0441\u0443\u0434\u0430\u0440\u0441\u0442\u0432\u043E-\u0433\u043E\u0440\u043E\u0434 \u0412\u0430\u0442\u0438\u043A\u0430\u043D",
                                    "\u0413\u0440\u0435\u043D\u0430\u0434\u0430",
                                    "\u0413\u0440\u0435\u043D\u043B\u0430\u043D\u0434\u0438\u044F",
                                    "\u0413\u0440\u0435\u0446\u0438\u044F",
                                    "\u0413\u0440\u0443\u0437\u0438\u044F",
                                    "\u0413\u0443\u0430\u043C",
                                    "\u0414\u0430\u043D\u0438\u044F",
                                    "\u0414\u0436\u0435\u0440\u0441\u0438",
                                    "\u0414\u0436\u0438\u0431\u0443\u0442\u0438",
                                    "\u0414\u043E\u043C\u0438\u043D\u0438\u043A\u0430\u043D\u0441\u043A\u0430\u044F \u0420\u0435\u0441\u043F\u0443\u0431\u043B\u0438\u043A\u0430",
                                    "\u0415\u0433\u0438\u043F\u0435\u0442",
                                    "\u0417\u0430\u043C\u0431\u0438\u044F",
                                    "\u0417\u0430\u043F\u0430\u0434\u043D\u0430\u044F \u0421\u0430\u0445\u0430\u0440\u0430",
                                    "\u0417\u0438\u043C\u0431\u0430\u0431\u0432\u0435",
                                    "\u0418\u0437\u0440\u0430\u0438\u043B\u044C",
                                    "\u0418\u043D\u0434\u0438\u044F",
                                    "\u0418\u043D\u0434\u043E\u043D\u0435\u0437\u0438\u044F",
                                    "\u0418\u043E\u0440\u0434\u0430\u043D\u0438\u044F",
                                    "\u0418\u0440\u0430\u043A",
                                    "\u0418\u0440\u0430\u043D",
                                    "\u0418\u0440\u043B\u0430\u043D\u0434\u0438\u044F",
                                    "\u0418\u0441\u043B\u0430\u043D\u0434\u0438\u044F",
                                    "\u0418\u0441\u043F\u0430\u043D\u0438\u044F",
                                    "\u0418\u0442\u0430\u043B\u0438\u044F",
                                    "\u0419\u0435\u043C\u0435\u043D",
                                    "\u041A\u0430\u0437\u0430\u0445\u0441\u0442\u0430\u043D, \u0420\u0435\u0441\u043F\u0443\u0431\u043B\u0438\u043A\u0430",
                                    "\u041A\u0430\u0439\u043C\u0430\u043D\u043E\u0432\u044B \u041E\u0441\u0442\u0440\u043E\u0432\u0430",
                                    "\u041A\u0430\u043C\u0431\u043E\u0434\u0436\u0430",
                                    "\u041A\u0430\u043C\u0435\u0440\u0443\u043D",
                                    "\u041A\u0430\u0442\u0430\u0440",
                                    "\u041A\u0435\u043D\u0438\u044F",
                                    "\u041A\u0438\u043F\u0440",
                                    "\u041A\u0438\u0440\u0438\u0431\u0430\u0442\u0438",
                                    "\u041A\u0438\u0442\u0430\u0439",
                                    "\u041A\u043E\u043A\u043E\u0441\u043E\u0432\u044B\u0435 \u043E\u0441\u0442\u0440\u043E\u0432\u0430",
                                    "\u041A\u043E\u043B\u0443\u043C\u0431\u0438\u044F",
                                    "\u041A\u043E\u043C\u043E\u0440\u0441\u043A\u0438\u0435 \u041E\u0441\u0442\u0440\u043E\u0432\u0430",
                                    "\u041A\u043E\u043D\u0433\u043E, \u0414\u0435\u043C\u043E\u043A\u0440\u0430\u0442\u0438\u0447\u0435\u0441\u043A\u0430\u044F \u0420\u0435\u0441\u043F\u0443\u0431\u043B\u0438\u043A\u0430",
                                    "\u041A\u043E\u043D\u0433\u043E, \u0420\u0435\u0441\u043F\u0443\u0431\u043B\u0438\u043A\u0430",
                                    "\u041A\u043E\u0441\u0442\u0430-\u0420\u0438\u043A\u0430",
                                    "\u041A\u043E\u0442-\u0434\u2019\u0418\u0432\u0443\u0430\u0440",
                                    "\u041A\u0443\u0431\u0430",
                                    "\u041A\u0443\u0432\u0435\u0439\u0442",
                                    "\u041A\u044B\u0440\u0433\u044B\u0437\u0441\u0442\u0430\u043D",
                                    "\u041B\u0430\u043E\u0441",
                                    "\u041B\u0430\u0442\u0432\u0438\u044F",
                                    "\u041B\u0435\u0441\u043E\u0442\u043E",
                                    "\u041B\u0438\u0431\u0435\u0440\u0438\u044F",
                                    "\u041B\u0438\u0432\u0430\u043D",
                                    "\u041B\u0438\u0432\u0438\u044F",
                                    "\u041B\u0438\u0442\u0432\u0430",
                                    "\u041B\u0438\u0445\u0442\u0435\u043D\u0448\u0442\u0435\u0439\u043D",
                                    "\u041B\u044E\u043A\u0441\u0435\u043C\u0431\u0443\u0440\u0433",
                                    "\u041C\u0430\u0432\u0440\u0438\u043A\u0438\u0439",
                                    "\u041C\u0430\u0432\u0440\u0438\u0442\u0430\u043D\u0438\u044F",
                                    "\u041C\u0430\u0434\u0430\u0433\u0430\u0441\u043A\u0430\u0440, \u0420\u0435\u0441\u043F\u0443\u0431\u043B\u0438\u043A\u0430",
                                    "\u041C\u0430\u0439\u043E\u0442\u0442\u0430",
                                    "\u041C\u0430\u043A\u0430\u043E",
                                    "\u041C\u0430\u043A\u0435\u0434\u043E\u043D\u0438\u044F, \u0420\u0435\u0441\u043F\u0443\u0431\u043B\u0438\u043A\u0430",
                                    "\u041C\u0430\u043B\u0430\u0432\u0438",
                                    "\u041C\u0430\u043B\u0430\u0439\u0437\u0438\u044F",
                                    "\u041C\u0430\u043B\u0438",
                                    "\u041C\u0430\u043B\u044C\u0434\u0438\u0432\u044B",
                                    "\u041C\u0430\u043B\u044C\u0442\u0430",
                                    "\u041C\u0430\u0440\u043E\u043A\u043A\u043E",
                                    "\u041C\u0430\u0440\u0442\u0438\u043D\u0438\u043A",
                                    "\u041C\u0430\u0440\u0448\u0430\u043B\u043B\u043E\u0432\u044B \u041E\u0441\u0442\u0440\u043E\u0432\u0430",
                                    "\u041C\u0435\u043A\u0441\u0438\u043A\u0430",
                                    "\u041C\u0435\u043B\u043A\u0438\u0435 \u043E\u0442\u0434\u0430\u043B\u0435\u043D\u043D\u044B\u0435 \u043E\u0441\u0442\u0440\u043E\u0432\u0430 \u0421\u0428\u0410",
                                    "\u041C\u043E\u0437\u0430\u043C\u0431\u0438\u043A",
                                    "\u041C\u043E\u043B\u0434\u043E\u0432\u0430",
                                    "\u041C\u043E\u043D\u0430\u043A\u043E",
                                    "\u041C\u043E\u043D\u0433\u043E\u043B\u0438\u044F",
                                    "\u041C\u043E\u043D\u0442\u0441\u0435\u0440\u0440\u0430\u0442",
                                    "\u041C\u044C\u044F\u043D\u043C\u0430",
                                    "\u041D\u0430\u043C\u0438\u0431\u0438\u044F",
                                    "\u041D\u0430\u0443\u0440\u0443",
                                    "\u041D\u0435\u043F\u0430\u043B",
                                    "\u041D\u0438\u0433\u0435\u0440",
                                    "\u041D\u0438\u0433\u0435\u0440\u0438\u044F",
                                    "\u041D\u0438\u0434\u0435\u0440\u043B\u0430\u043D\u0434\u0441\u043A\u0438\u0435 \u0410\u043D\u0442\u0438\u043B\u044C\u0441\u043A\u0438\u0435 \u043E\u0441\u0442\u0440\u043E\u0432\u0430",
                                    "\u041D\u0438\u0434\u0435\u0440\u043B\u0430\u043D\u0434\u044B",
                                    "\u041D\u0438\u043A\u0430\u0440\u0430\u0433\u0443\u0430",
                                    "\u041D\u0438\u0443\u044D",
                                    "\u041D\u043E\u0432\u0430\u044F \u0417\u0435\u043B\u0430\u043D\u0434\u0438\u044F",
                                    "\u041D\u043E\u0432\u0430\u044F \u041A\u0430\u043B\u0435\u0434\u043E\u043D\u0438\u044F",
                                    "\u041D\u043E\u0440\u0432\u0435\u0433\u0438\u044F",
                                    "\u041E\u0431\u044A\u0435\u0434\u0438\u043D\u0451\u043D\u043D\u044B\u0435 \u0410\u0440\u0430\u0431\u0441\u043A\u0438\u0435 \u042D\u043C\u0438\u0440\u0430\u0442\u044B",
                                    "\u041E. \u0413\u0435\u0440\u043D\u0441\u0438",
                                    "\u041E\u043C\u0430\u043D",
                                    "\u041E\u0441\u0442\u0440\u043E\u0432\u0430 \u0417\u0435\u043B\u0435\u043D\u043E\u0433\u043E \u041C\u044B\u0441\u0430",
                                    "\u041E\u0441\u0442\u0440\u043E\u0432\u0430 \u041A\u0443\u043A\u0430",
                                    "\u041E\u0441\u0442\u0440\u043E\u0432\u0430 \u0422\u0435\u0440\u043A\u0441 \u0418 \u041A\u0430\u0439\u043A\u043E\u0441",
                                    "\u041E\u0441\u0442\u0440\u043E\u0432\u0430 \u0423\u043E\u043B\u043B\u0438\u0441 \u0438 \u0424\u0443\u0442\u0443\u043D\u0430",
                                    "\u041E\u0441\u0442\u0440\u043E\u0432\u0430 \u0425\u0435\u0440\u0434 \u0438 \u041C\u0430\u043A\u0434\u043E\u043D\u0430\u043B\u044C\u0434",
                                    "\u041E\u0441\u0442\u0440\u043E\u0432 \u0411\u0443\u0432\u0435",
                                    "\u041E\u0441\u0442\u0440\u043E\u0432 \u0414\u043E\u043C\u0438\u043D\u0438\u043A\u0430",
                                    "\u041E\u0441\u0442\u0440\u043E\u0432 \u041C\u044D\u043D",
                                    "\u041E\u0441\u0442\u0440\u043E\u0432 \u041D\u043E\u0440\u0444\u043E\u043B\u043A",
                                    "\u041E\u0441\u0442\u0440\u043E\u0432 \u0421\u0432\u044F\u0442\u043E\u0433\u043E \u041C\u0430\u0440\u0442\u0438\u043D\u0430",
                                    "\u041E\u0441\u0442\u0440\u043E\u0432 \u0421\u0432\u044F\u0442\u043E\u0439 \u0415\u043B\u0435\u043D\u044B",
                                    "\u041E. \u042E\u0436\u043D\u0430\u044F \u0413\u0435\u043E\u0440\u0433\u0438\u044F \u0418 \u042E\u0436\u043D\u044B\u0435 \u0421\u0430\u043D\u0434\u0432\u0438\u0447\u0435\u0432\u044B \u041E\u0441\u0442\u0440\u043E\u0432\u0430",
                                    "\u041F\u0430\u043A\u0438\u0441\u0442\u0430\u043D",
                                    "\u041F\u0430\u043B\u0430\u0443",
                                    "\u041F\u0430\u043B\u0435\u0441\u0442\u0438\u043D\u0430",
                                    "\u041F\u0430\u043D\u0430\u043C\u0430",
                                    "\u041F\u0430\u043F\u0443\u0430-\u041D\u043E\u0432\u0430\u044F \u0413\u0432\u0438\u043D\u0435\u044F",
                                    "\u041F\u0430\u0440\u0430\u0433\u0432\u0430\u0439",
                                    "\u041F\u0435\u0440\u0443",
                                    "\u041F\u0438\u0442\u043A\u0435\u0440\u043D",
                                    "\u041F\u043E\u043B\u044C\u0448\u0430",
                                    "\u041F\u043E\u0440\u0442\u0443\u0433\u0430\u043B\u0438\u044F",
                                    "\u041F\u0443\u044D\u0440\u0442\u043E-\u0420\u0438\u043A\u043E",
                                    "\u0420\u0435\u044E\u043D\u044C\u043E\u043D",
                                    "\u0420\u043E\u0436\u0434\u0435\u0441\u0442\u0432\u0435\u043D\u0441\u043A\u0438\u0435 \u043E\u0441\u0442\u0440\u043E\u0432\u0430",
                                    "\u0420\u0443\u0430\u043D\u0434\u0430",
                                    "\u0420\u0443\u043C\u044B\u043D\u0438\u044F",
                                    "\u0421\u0430\u043B\u044C\u0432\u0430\u0434\u043E\u0440",
                                    "\u0421\u0430\u043C\u043E\u0430",
                                    "\u0421\u0430\u043D-\u041C\u0430\u0440\u0438\u043D\u043E",
                                    "\u0421\u0430\u043D-\u0422\u043E\u043C\u0435 \u0438 \u041F\u0440\u0438\u043D\u0441\u0438\u043F\u0438",
                                    "\u0421\u0430\u0443\u0434\u043E\u0432\u0441\u043A\u0430\u044F \u0410\u0440\u0430\u0432\u0438\u044F",
                                    "\u0421\u0432\u0430\u0437\u0438\u043B\u0435\u043D\u0434",
                                    "\u0421\u0435\u0432\u0435\u0440\u043D\u0430\u044F \u041A\u043E\u0440\u0435\u044F",
                                    "\u0421\u0435\u0432\u0435\u0440\u043D\u044B\u0435 \u041C\u0430\u0440\u0438\u0430\u043D\u0441\u043A\u0438\u0435 \u041E\u0441\u0442\u0440\u043E\u0432\u0430",
                                    "\u0421\u0435\u0439\u0448\u0435\u043B\u044C\u0441\u043A\u0438\u0435 \u041E\u0441\u0442\u0440\u043E\u0432\u0430",
                                    "\u0421\u0435\u043D-\u0411\u0430\u0440\u0442\u0435\u043B\u044C\u043C\u0438",
                                    "\u0421\u0435\u043D\u0435\u0433\u0430\u043B",
                                    "\u0421\u0435\u043D-\u041F\u044C\u0435\u0440 \u0438 \u041C\u0438\u043A\u0435\u043B\u043E\u043D",
                                    "\u0421\u0435\u043D\u0442-\u0412\u0438\u043D\u0441\u0435\u043D\u0442 \u0438 \u0413\u0440\u0435\u043D\u0430\u0434\u0438\u043D\u044B",
                                    "\u0421\u0435\u043D\u0442-\u041A\u0438\u0442\u0442\u0441 \u0438 \u041D\u0435\u0432\u0438\u0441",
                                    "\u0421\u0435\u043D\u0442-\u041B\u044E\u0441\u0438\u044F",
                                    "\u0421\u0435\u0440\u0431\u0438\u044F",
                                    "\u0421\u0435\u0440\u0431\u0438\u044F \u0438 \u0427\u0435\u0440\u043D\u043E\u0433\u043E\u0440\u0438\u044F, \u0413\u043E\u0441\u0443\u0434\u0430\u0440\u0441\u0442\u0432\u0435\u043D\u043D\u044B\u0439 \u0421\u043E\u044E\u0437",
                                    "\u0421\u0438\u043D\u0433\u0430\u043F\u0443\u0440",
                                    "\u0421\u0438\u0440\u0438\u044F",
                                    "\u0421\u043B\u043E\u0432\u0430\u0446\u043A\u0430\u044F \u0440\u0435\u0441\u043F\u0443\u0431\u043B\u0438\u043A\u0430",
                                    "\u0421\u043B\u043E\u0432\u0435\u043D\u0438\u044F",
                                    "\u0421\u043E\u043B\u043E\u043C\u043E\u043D\u0441\u043A\u0438\u0435 \u043E\u0441\u0442\u0440\u043E\u0432\u0430",
                                    "\u0421\u043E\u043C\u0430\u043B\u0438",
                                    "\u0421\u0443\u0434\u0430\u043D",
                                    "\u0421\u0443\u0440\u0438\u043D\u0430\u043C",
                                    "\u0421\u044C\u0435\u0440\u0440\u0430-\u041B\u0435\u043E\u043D\u0435",
                                    "\u0422\u0430\u0434\u0436\u0438\u043A\u0438\u0441\u0442\u0430\u043D",
                                    "\u0422\u0430\u0439\u0432\u0430\u043D\u044C",
                                    "\u0422\u0430\u0439\u043B\u0430\u043D\u0434",
                                    "\u0422\u0430\u043D\u0437\u0430\u043D\u0438\u044F",
                                    "\u0422\u043E\u0433\u043E",
                                    "\u0422\u043E\u043A\u0435\u043B\u0430\u0443",
                                    "\u0422\u043E\u043D\u0433\u0430",
                                    "\u0422\u0440\u0438\u043D\u0438\u0434\u0430\u0434 \u0438 \u0422\u043E\u0431\u0430\u0433\u043E",
                                    "\u0422\u0443\u0432\u0430\u043B\u0443",
                                    "\u0422\u0443\u043D\u0438\u0441",
                                    "\u0422\u0443\u0440\u043A\u043C\u0435\u043D\u0438\u044F",
                                    "\u0422\u0443\u0440\u0446\u0438\u044F",
                                    "\u0423\u0433\u0430\u043D\u0434\u0430",
                                    "\u0423\u0437\u0431\u0435\u043A\u0438\u0441\u0442\u0430\u043D",
                                    "\u0423\u0440\u0443\u0433\u0432\u0430\u0439",
                                    "\u0424\u0430\u0440\u0435\u0440\u0441\u043A\u0438\u0435 \u043E\u0441\u0442\u0440\u043E\u0432\u0430",
                                    "\u0424\u0435\u0434\u0435\u0440\u0430\u0442\u0438\u0432\u043D\u044B\u0435 \u0428\u0442\u0430\u0442\u044B \u041C\u0438\u043A\u0440\u043E\u043D\u0435\u0437\u0438\u0438",
                                    "\u0424\u0438\u0434\u0436\u0438",
                                    "\u0424\u0438\u043B\u0438\u043F\u043F\u0438\u043D\u044B",
                                    "\u0424\u0438\u043D\u043B\u044F\u043D\u0434\u0438\u044F",
                                    "\u0424\u043E\u043B\u043A\u043B\u0435\u043D\u0434\u0441\u043A\u0438\u0435 \u043E-\u0432\u0430",
                                    "\u0424\u0440\u0430\u043D\u0446\u0438\u044F",
                                    "\u0424\u0440\u0430\u043D\u0446\u0443\u0437\u0441\u043A\u0430\u044F \u0413\u0432\u0438\u043D\u0435\u044F",
                                    "\u0424\u0440\u0430\u043D\u0446\u0443\u0437\u0441\u043A\u0430\u044F \u041F\u043E\u043B\u0438\u043D\u0435\u0437\u0438\u044F",
                                    "\u0424\u0440\u0430\u043D\u0446\u0443\u0437\u0441\u043A\u0438\u0435 \u042E\u0436\u043D\u044B\u0435 \u0422\u0435\u0440\u0440\u0438\u0442\u043E\u0440\u0438\u0438",
                                    "\u0425\u043E\u0440\u0432\u0430\u0442\u0438\u044F",
                                    "\u0427\u0430\u0434",
                                    "\u0427\u0435\u0440\u043D\u043E\u0433\u043E\u0440\u0438\u044F",
                                    "\u0427\u0435\u0448\u0441\u043A\u0430\u044F \u0420\u0435\u0441\u043F\u0443\u0431\u043B\u0438\u043A\u0430",
                                    "\u0427\u0438\u043B\u0438",
                                    "\u0428\u0432\u0435\u0439\u0446\u0430\u0440\u0438\u044F",
                                    "\u0428\u0432\u0435\u0446\u0438\u044F",
                                    "\u0428\u043F\u0438\u0446\u0431\u0435\u0440\u0433\u0435\u043D \u0438 \u042F\u043D-\u041C\u0430\u0439\u0435\u043D",
                                    "\u0428\u0440\u0438-\u041B\u0430\u043D\u043A\u0430",
                                    "\u042D\u043A\u0432\u0430\u0434\u043E\u0440",
                                    "\u042D\u043A\u0432\u0430\u0442\u043E\u0440\u0438\u0430\u043B\u044C\u043D\u0430\u044F \u0413\u0432\u0438\u043D\u0435\u044F",
                                    "\u042D\u0440\u0438\u0442\u0440\u0435\u044F",
                                    "\u042D\u0441\u0442\u043E\u043D\u0438\u044F",
                                    "\u042D\u0444\u0438\u043E\u043F\u0438\u044F",
                                    "\u042E\u0436\u043D\u0430\u044F \u041A\u043E\u0440\u0435\u044F",
                                    "\u042E\u0436\u043D\u043E-\u0410\u0444\u0440\u0438\u043A\u0430\u043D\u0441\u043A\u0430\u044F \u0420\u0435\u0441\u043F\u0443\u0431\u043B\u0438\u043A\u0430",
                                    "\u042F\u043C\u0430\u0439\u043A\u0430",
                                    "\u042F\u043F\u043E\u043D\u0438\u044F");
                        });

        public Object region =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u0410\u043C\u0443\u0440\u0441\u043A\u0430\u044F",
                                    "\u0410\u0440\u0445\u0430\u043D\u0433\u0435\u043B\u044C\u0441\u043A\u0430\u044F",
                                    "\u0410\u0441\u0442\u0440\u0430\u0445\u0430\u043D\u0441\u043A\u0430\u044F",
                                    "\u0411\u0435\u043B\u0433\u043E\u0440\u043E\u0434\u0441\u043A\u0430\u044F",
                                    "\u0411\u0440\u044F\u043D\u0441\u043A\u0430\u044F",
                                    "\u0412\u043B\u0430\u0434\u0438\u043C\u0438\u0440\u0441\u043A\u0430\u044F",
                                    "\u0412\u043E\u043B\u0433\u043E\u0433\u0440\u0430\u0434\u0441\u043A\u0430\u044F",
                                    "\u0412\u043E\u043B\u043E\u0433\u043E\u0434\u0441\u043A\u0430\u044F",
                                    "\u0412\u043E\u0440\u043E\u043D\u0435\u0436\u0441\u043A\u0430\u044F",
                                    "\u0418\u0432\u0430\u043D\u043E\u0432\u0441\u043A\u0430\u044F",
                                    "\u0418\u0440\u043A\u0443\u0442\u0441\u043A\u0430\u044F",
                                    "\u041A\u0430\u043B\u0438\u043D\u0438\u043D\u0433\u0440\u0430\u0434\u0441\u043A\u0430\u044F",
                                    "\u041A\u0430\u043B\u0443\u0436\u0441\u043A\u0430\u044F",
                                    "\u041A\u0435\u043C\u0435\u0440\u043E\u0432\u0441\u043A\u0430\u044F",
                                    "\u041A\u0438\u0440\u043E\u0432\u0441\u043A\u0430\u044F",
                                    "\u041A\u043E\u0441\u0442\u0440\u043E\u043C\u0441\u043A\u0430\u044F",
                                    "\u041A\u0443\u0440\u0433\u0430\u043D\u0441\u043A\u0430\u044F",
                                    "\u041A\u0443\u0440\u0441\u043A\u0430\u044F",
                                    "\u041B\u0435\u043D\u0438\u043D\u0433\u0440\u0430\u0434\u0441\u043A\u0430\u044F",
                                    "\u041B\u0438\u043F\u0435\u0446\u043A\u0430\u044F",
                                    "\u041C\u0430\u0433\u0430\u0434\u0430\u043D\u0441\u043A\u0430\u044F",
                                    "\u041C\u043E\u0441\u043A\u043E\u0432\u0441\u043A\u0430\u044F",
                                    "\u041C\u0443\u0440\u043C\u0430\u043D\u0441\u043A\u0430\u044F",
                                    "\u041D\u0438\u0436\u0435\u0433\u043E\u0440\u043E\u0434\u0441\u043A\u0430\u044F",
                                    "\u041D\u043E\u0432\u0433\u043E\u0440\u043E\u0434\u0441\u043A\u0430\u044F",
                                    "\u041D\u043E\u0432\u043E\u0441\u0438\u0431\u0438\u0440\u0441\u043A\u0430\u044F",
                                    "\u041E\u043C\u0441\u043A\u0430\u044F",
                                    "\u041E\u0440\u0435\u043D\u0431\u0443\u0440\u0433\u0441\u043A\u0430\u044F",
                                    "\u041E\u0440\u043B\u043E\u0432\u0441\u043A\u0430\u044F",
                                    "\u041F\u0435\u043D\u0437\u0435\u043D\u0441\u043A\u0430\u044F",
                                    "\u041F\u0441\u043A\u043E\u0432\u0441\u043A\u0430\u044F",
                                    "\u0420\u043E\u0441\u0442\u043E\u0432\u0441\u043A\u0430\u044F",
                                    "\u0420\u044F\u0437\u0430\u043D\u0441\u043A\u0430\u044F",
                                    "\u0421\u0430\u043C\u0430\u0440\u0441\u043A\u0430\u044F",
                                    "\u0421\u0430\u0440\u0430\u0442\u043E\u0432\u0441\u043A\u0430\u044F",
                                    "\u0421\u0430\u0445\u0430\u043B\u0438\u043D\u0441\u043A\u0430\u044F",
                                    "\u0421\u0432\u0435\u0440\u0434\u043B\u043E\u0432\u0441\u043A\u0430\u044F",
                                    "\u0421\u043C\u043E\u043B\u0435\u043D\u0441\u043A\u0430\u044F",
                                    "\u0422\u0430\u043C\u0431\u043E\u0432\u0441\u043A\u0430\u044F",
                                    "\u0422\u0432\u0435\u0440\u0441\u043A\u0430\u044F",
                                    "\u0422\u043E\u043C\u0441\u043A\u0430\u044F",
                                    "\u0422\u0443\u043B\u044C\u0441\u043A\u0430\u044F",
                                    "\u0422\u044E\u043C\u0435\u043D\u0441\u043A\u0430\u044F",
                                    "\u0423\u043B\u044C\u044F\u043D\u043E\u0432\u0441\u043A\u0430\u044F",
                                    "\u0427\u0435\u043B\u044F\u0431\u0438\u043D\u0441\u043A\u0430\u044F",
                                    "\u0427\u0438\u0442\u0438\u043D\u0441\u043A\u0430\u044F",
                                    "\u042F\u0440\u043E\u0441\u043B\u0430\u0432\u0441\u043A\u0430\u044F");
                        });

        public Object city =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u0411\u0430\u043B\u0430\u0448\u0438\u0445\u0430",
                                    "\u0412\u0438\u0434\u043D\u043E\u0435",
                                    "\u0412\u043E\u043B\u043E\u043A\u043E\u043B\u0430\u043C\u0441\u043A",
                                    "\u0412\u043E\u0441\u043A\u0440\u0435\u0441\u0435\u043D\u0441\u043A",
                                    "\u0414\u043C\u0438\u0442\u0440\u043E\u0432",
                                    "\u0414\u043E\u043C\u043E\u0434\u0435\u0434\u043E\u0432\u043E",
                                    "\u0414\u043E\u0440\u043E\u0445\u043E\u0432\u043E",
                                    "\u0415\u0433\u043E\u0440\u044C\u0435\u0432\u0441\u043A",
                                    "\u0417\u0430\u0440\u0430\u0439\u0441\u043A",
                                    "\u0418\u0441\u0442\u0440\u0430",
                                    "\u041A\u0430\u0448\u0438\u0440\u0430",
                                    "\u041A\u043B\u0438\u043D",
                                    "\u041A\u043E\u043B\u043E\u043C\u043D\u0430",
                                    "\u041A\u0440\u0430\u0441\u043D\u043E\u0433\u043E\u0440\u0441\u043A",
                                    "\u041B\u043E\u0442\u043E\u0448\u0438\u043D\u043E",
                                    "\u041B\u0443\u0445\u043E\u0432\u0438\u0446\u044B",
                                    "\u041B\u044E\u0431\u0435\u0440\u0446\u044B",
                                    "\u041C\u043E\u0436\u0430\u0439\u0441\u043A",
                                    "\u041C\u043E\u0441\u043A\u0432\u0430",
                                    "\u041C\u044B\u0442\u0438\u0449\u0438",
                                    "\u041D\u0430\u0440\u043E-\u0424\u043E\u043C\u0438\u043D\u0441\u043A",
                                    "\u041D\u043E\u0433\u0438\u043D\u0441\u043A",
                                    "\u041E\u0434\u0438\u043D\u0446\u043E\u0432\u043E",
                                    "\u041E\u0437\u0451\u0440\u044B",
                                    "\u041E\u0440\u0435\u0445\u043E\u0432\u043E-\u0417\u0443\u0435\u0432\u043E",
                                    "\u041F\u0430\u0432\u043B\u043E\u0432\u0441\u043A\u0438\u0439 \u041F\u043E\u0441\u0430\u0434",
                                    "\u041F\u043E\u0434\u043E\u043B\u044C\u0441\u043A",
                                    "\u041F\u0443\u0448\u043A\u0438\u043D\u043E",
                                    "\u0420\u0430\u043C\u0435\u043D\u0441\u043A\u043E\u0435",
                                    "\u0421\u0435\u0440\u0433\u0438\u0435\u0432 \u041F\u043E\u0441\u0430\u0434",
                                    "\u0421\u0435\u0440\u0435\u0431\u0440\u044F\u043D\u044B\u0435 \u041F\u0440\u0443\u0434\u044B",
                                    "\u0421\u0435\u0440\u043F\u0443\u0445\u043E\u0432",
                                    "\u0421\u043E\u043B\u043D\u0435\u0447\u043D\u043E\u0433\u043E\u0440\u0441\u043A",
                                    "\u0421\u0442\u0443\u043F\u0438\u043D\u043E",
                                    "\u0422\u0430\u043B\u0434\u043E\u043C",
                                    "\u0427\u0435\u0445\u043E\u0432",
                                    "\u0428\u0430\u0442\u0443\u0440\u0430",
                                    "\u0428\u0430\u0445\u043E\u0432\u0441\u043A\u0430\u044F",
                                    "\u0429\u0451\u043B\u043A\u043E\u0432\u043E");
                        });

        public Object street =
                ZVal.arrayFromList(
                        "\u041A\u043E\u0441\u0438\u043E\u0440\u0430",
                        "\u041B\u0430\u0434\u044B\u0433\u0438\u043D\u0430",
                        "\u041B\u0435\u043D\u0438\u043D\u0430",
                        "\u041B\u043E\u043C\u043E\u043D\u043E\u0441\u043E\u0432\u0430",
                        "\u0414\u043E\u043C\u043E\u0434\u0435\u0434\u043E\u0432\u0441\u043A\u0430\u044F",
                        "\u0413\u043E\u0433\u043E\u043B\u044F",
                        "1905 \u0433\u043E\u0434\u0430",
                        "\u0427\u0435\u0445\u043E\u0432\u0430",
                        "\u0421\u0442\u0430\u043B\u0438\u043D\u0430",
                        "\u041A\u043E\u0441\u043C\u043E\u043D\u0430\u0432\u0442\u043E\u0432",
                        "\u0413\u0430\u0433\u0430\u0440\u0438\u043D\u0430",
                        "\u0421\u043B\u0430\u0432\u044B",
                        "\u0411\u0443\u0445\u0430\u0440\u0435\u0441\u0442\u0441\u043A\u0430\u044F",
                        "\u0411\u0443\u0434\u0430\u043F\u0435\u0448\u0442\u0441\u0442\u043A\u0430\u044F",
                        "\u0411\u0430\u043B\u043A\u0430\u043D\u0441\u043A\u0430\u044F");

        public Object addressFormats =
                ZVal.arrayFromList(
                        "{{postcode}}, {{region}} {{regionSuffix}}, {{cityPrefix}} {{city}}, {{streetPrefix}} {{street}}, {{buildingNumber}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList("{{streetPrefix}} {{street}}, {{buildingNumber}}");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\ru_RU\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "buildingNumber",
                            "city",
                            "cityPrefix",
                            "country",
                            "postcode",
                            "region",
                            "regionSuffix",
                            "street",
                            "streetAddressFormats",
                            "streetPrefix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/ru_RU/Address.php")
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
