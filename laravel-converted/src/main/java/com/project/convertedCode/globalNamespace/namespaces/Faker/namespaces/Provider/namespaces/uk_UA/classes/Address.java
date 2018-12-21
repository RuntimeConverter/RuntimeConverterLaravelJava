package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.uk_UA.classes;

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
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/uk_UA/Address.php

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
    public Object streetName(RuntimeEnv env, Object... args) {
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
                                                                .uk_UA
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
                                                        .uk_UA
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .street)
                        .value());
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
                                                                .uk_UA
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
                                                        .uk_UA
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .city)
                        .value());
    }

    @ConvertedMethod
    public Object cityAndRegion(RuntimeEnv env, Object... args) {
        Object city = null;
        Object format = null;
        Object regionAndCityNumber = null;
        Object region = null;
        regionAndCityNumber =
                NamespaceGlobal.rand
                        .env(env)
                        .call(
                                0,
                                ZVal.subtract(
                                        function_count
                                                .f
                                                .env(env)
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
                                                                                .uk_UA
                                                                                .classes
                                                                                .Address
                                                                                .RequestStaticProperties
                                                                                .class)
                                                                .region)
                                                .value(),
                                        1))
                        .value();
        region =
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
                                                .uk_UA
                                                .classes
                                                .Address
                                                .RequestStaticProperties
                                                .class,
                                        "region")
                                .arrayGet(env, regionAndCityNumber));
        city =
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
                                                .uk_UA
                                                .classes
                                                .Address
                                                .RequestStaticProperties
                                                .class,
                                        "city")
                                .arrayGet(env, regionAndCityNumber));
        format =
                ZVal.assign(
                        toStringR(region, env)
                                + " {{regionSuffix}}, {{cityPrefix}} "
                                + toStringR(city, env));
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Address.class,
                        format));
    }

    public static final Object CONST_class = "Faker\\Provider\\uk_UA\\Address";

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
        public Object citySuffix(RuntimeEnv env, Object... args) {
            return "";
        }

        @ConvertedMethod
        public Object streetSuffix(RuntimeEnv env, Object... args) {
            return "";
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
                                                                                            .uk_UA
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
                                                            .uk_UA
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
                                                            .uk_UA
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
                                                            .uk_UA
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
                                                            .uk_UA
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .streetPrefix)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object cityPrefix = ZVal.arrayFromList("\u043C\u0456\u0441\u0442\u043E");

        public Object regionSuffix =
                ZVal.arrayFromList("\u043E\u0431\u043B\u0430\u0441\u0442\u044C");

        public Object streetPrefix =
                ZVal.arrayFromList(
                        "\u0432\u0443\u043B.",
                        "\u043F\u0440\u043E\u0432.",
                        "\u043F\u043B.",
                        "\u043F\u0440\u043E\u0441\u043F.");

        public Object buildingNumber = ZVal.arrayFromList("##");

        public Object postcode = ZVal.arrayFromList("#####");

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u0410\u0444\u0433\u0430\u043D\u0456\u0441\u0442\u0430\u043D",
                                    "\u0410\u043B\u0431\u0430\u043D\u0456\u044F",
                                    "\u0410\u043B\u0436\u0438\u0440",
                                    "\u0410\u043D\u0434\u043E\u0440\u0440\u0430",
                                    "\u0410\u043D\u0433\u043E\u043B\u0430",
                                    "\u0410\u0440\u0433\u0435\u043D\u0442\u0438\u043D\u0430",
                                    "\u0412\u0456\u0440\u043C\u0435\u043D\u0456\u044F",
                                    "\u0410\u0432\u0441\u0442\u0440\u0430\u043B\u0456\u044F",
                                    "\u0410\u0432\u0441\u0442\u0440\u0456\u044F",
                                    "\u0410\u0437\u0435\u0440\u0431\u0430\u0439\u0434\u0436\u0430\u043D",
                                    "\u0411\u0430\u0433\u0430\u043C\u0441\u044C\u043A\u0456 \u043E\u0441\u0442\u0440\u043E\u0432\u0438",
                                    "\u0411\u0430\u0445\u0440\u0435\u0439\u043D",
                                    "\u0411\u0430\u043D\u0433\u043B\u0430\u0434\u0435\u0448",
                                    "\u0411\u0430\u0440\u0431\u0430\u0434\u043E\u0441",
                                    "\u0411\u0456\u043B\u043E\u0440\u0443\u0441\u044C",
                                    "\u0411\u0435\u043B\u044C\u0433\u0456\u044F",
                                    "\u0411\u0435\u043B\u0456\u0437",
                                    "\u0411\u0435\u043D\u0456\u043D",
                                    "\u0411\u0443\u0442\u0430\u043D",
                                    "\u0411\u043E\u043B\u0456\u0432\u0456\u044F",
                                    "\u0411\u043E\u0441\u043D\u0456\u044F \u0456 \u0413\u0435\u0440\u0446\u0435\u0433\u043E\u0432\u0438\u043D\u0430",
                                    "\u0411\u043E\u0442\u0441\u0432\u0430\u043D\u0430",
                                    "\u0411\u0440\u0430\u0437\u0438\u043B\u0456\u044F",
                                    "\u0411\u0440\u0443\u043D\u0435\u0439",
                                    "\u0411\u043E\u043B\u0433\u0430\u0440\u0456\u044F",
                                    "\u0411\u0443\u0440\u0443\u043D\u0434\u0456",
                                    "\u041A\u0430\u043C\u0431\u043E\u0434\u0436\u0430",
                                    "\u041A\u0430\u043C\u0435\u0440\u0443\u043D",
                                    "\u041A\u0430\u043D\u0430\u0434\u0430",
                                    "\u041A\u0430\u0431\u043E-\u0412\u0435\u0440\u0434\u0435",
                                    "\u0426\u0435\u043D\u0442\u0440\u0430\u043B\u044C\u043D\u043E-\u0410\u0444\u0440\u0438\u043A\u0430\u043D\u0441\u044C\u043A\u0430 \u0420\u0435\u0441\u043F\u0443\u0431\u043B\u0456\u043A\u0430",
                                    "\u0427\u0430\u0434",
                                    "\u0427\u0438\u043B\u0456",
                                    "\u041A\u0438\u0442\u0430\u0439",
                                    "\u041A\u043E\u043B\u0443\u043C\u0431\u0456\u044F",
                                    "\u041A\u043E\u043C\u043E\u0440\u0441\u044C\u043A\u0456 \u043E\u0441\u0442\u0440\u043E\u0432\u0438",
                                    "\u041A\u043E\u043D\u0433\u043E",
                                    "\u041A\u043E\u043D\u0433\u043E, \u0414\u0435\u043C\u043E\u043A\u0440\u0430\u0442\u0438\u0447\u043D\u0430 \u0420\u0435\u0441\u043F\u0443\u0431\u043B\u0456\u043A\u0430",
                                    "\u041A\u043E\u0441\u0442\u0430-\u0420\u0456\u043A\u0430",
                                    "\u0425\u043E\u0440\u0432\u0430\u0442\u0456\u044F",
                                    "\u041A\u0443\u0431\u0430",
                                    "\u041A\u0456\u043F\u0440",
                                    "\u0427\u0435\u0441\u044C\u043A\u0430 \u0440\u0435\u0441\u043F\u0443\u0431\u043B\u0456\u043A\u0430",
                                    "\u0414\u0430\u043D\u0456\u044F",
                                    "\u0414\u0436\u0438\u0431\u0443\u0442\u0456",
                                    "\u0414\u043E\u043C\u0456\u043D\u0456\u043A\u0430",
                                    "\u0414\u043E\u043C\u0456\u043D\u0456\u043A\u0430\u043D\u0441\u044C\u043A\u0430 \u0420\u0435\u0441\u043F\u0443\u0431\u043B\u0456\u043A\u0430",
                                    "\u0441\u0445\u0456\u0434\u043D\u0438\u0439 \u0422\u0438\u043C\u043E\u0440",
                                    "\u0415\u043A\u0432\u0430\u0434\u043E\u0440",
                                    "\u0404\u0433\u0438\u043F\u0435\u0442",
                                    "\u0421\u0430\u043B\u044C\u0432\u0430\u0434\u043E\u0440",
                                    "\u0415\u043A\u0432\u0430\u0442\u043E\u0440\u0456\u0430\u043B\u044C\u043D\u0430 \u0413\u0432\u0456\u043D\u0435\u044F",
                                    "\u0415\u0440\u0438\u0442\u0440\u0435\u044F",
                                    "\u0415\u0441\u0442\u043E\u043D\u0456\u044F",
                                    "\u0415\u0444\u0456\u043E\u043F\u0456\u044F",
                                    "\u0424\u0456\u0434\u0436\u0456",
                                    "\u0424\u0456\u043D\u043B\u044F\u043D\u0434\u0456\u044F",
                                    "\u0424\u0440\u0430\u043D\u0446\u0456\u044F",
                                    "\u0413\u0430\u0431\u043E\u043D",
                                    "\u0413\u0430\u043C\u0431\u0456\u044F",
                                    "\u0413\u0440\u0443\u0437\u0456\u044F",
                                    "\u041D\u0456\u043C\u0435\u0447\u0447\u0438\u043D\u0430",
                                    "\u0413\u0430\u043D\u0430",
                                    "\u0413\u0440\u0435\u0446\u0456\u044F",
                                    "\u0413\u0440\u0435\u043D\u0430\u0434\u0430",
                                    "\u0413\u0432\u0430\u0442\u0435\u043C\u0430\u043B\u0430",
                                    "\u0413\u0432\u0456\u043D\u0435\u044F",
                                    "\u0413\u0432\u0456\u043D\u0435\u044F-\u0411\u0456\u0441\u0430\u0443",
                                    "\u0413\u0430\u0439\u0430\u043D\u0430",
                                    "\u0413\u0430\u0457\u0442\u0456",
                                    "\u0413\u043E\u043D\u0434\u0443\u0440\u0430\u0441",
                                    "\u0423\u0433\u043E\u0440\u0449\u0438\u043D\u0430",
                                    "\u0406\u0441\u043B\u0430\u043D\u0434\u0456\u044F",
                                    "\u0406\u043D\u0434\u0456\u044F",
                                    "\u0406\u043D\u0434\u043E\u043D\u0435\u0437\u0456\u044F",
                                    "\u0406\u0440\u0430\u043D",
                                    "\u0406\u0440\u0430\u043A",
                                    "\u0406\u0440\u043B\u0430\u043D\u0434\u0456\u044F",
                                    "\u0406\u0437\u0440\u0430\u0457\u043B\u044C",
                                    "\u0406\u0442\u0430\u043B\u0456\u044F",
                                    "\u042F\u043C\u0430\u0439\u043A\u0430",
                                    "\u042F\u043F\u043E\u043D\u0456\u044F",
                                    "\u0419\u043E\u0440\u0434\u0430\u043D\u0456\u044F",
                                    "\u041A\u0430\u0437\u0430\u0445\u0441\u0442\u0430\u043D",
                                    "\u041A\u0435\u043D\u0456\u044F",
                                    "\u041A\u0456\u0440\u0456\u0431\u0430\u0442\u0456",
                                    "\u041F\u0456\u0432\u043D\u0456\u0447\u043D\u0430 \u041A\u043E\u0440\u0435\u044F",
                                    "\u041F\u0456\u0432\u0434\u0435\u043D\u043D\u0430 \u041A\u043E\u0440\u0435\u044F",
                                    "\u041A\u043E\u0441\u043E\u0432\u043E",
                                    "\u041A\u0443\u0432\u0435\u0439\u0442",
                                    "\u041A\u0438\u0440\u0433\u0438\u0437\u0456\u044F",
                                    "\u041B\u0430\u043E\u0441",
                                    "\u041B\u0430\u0442\u0432\u0456\u044F",
                                    "\u041B\u0456\u0432\u0430\u043D",
                                    "\u041B\u0435\u0441\u043E\u0442\u043E",
                                    "\u041B\u0456\u0431\u0435\u0440\u0456\u044F",
                                    "\u041B\u0456\u0432\u0456\u044F",
                                    "\u041B\u0456\u0445\u0442\u0435\u043D\u0448\u0442\u0435\u0439\u043D",
                                    "\u041B\u0438\u0442\u0432\u0430",
                                    "\u041B\u044E\u043A\u0441\u0435\u043C\u0431\u0443\u0440\u0433",
                                    "\u041C\u0430\u043A\u0435\u0434\u043E\u043D\u0456\u0457",
                                    "\u041C\u0430\u0434\u0430\u0433\u0430\u0441\u043A\u0430\u0440",
                                    "\u041C\u0430\u043B\u0430\u0432\u0456",
                                    "\u041C\u0430\u043B\u0430\u0439\u0437\u0456\u044F",
                                    "\u041C\u0430\u043B\u044C\u0434\u0456\u0432\u0438",
                                    "\u041C\u0430\u043B\u0456",
                                    "\u041C\u0430\u043B\u044C\u0442\u0430",
                                    "\u041C\u0430\u0440\u0448\u0430\u043B\u043B\u043E\u0432\u0456 \u043E\u0441\u0442\u0440\u043E\u0432\u0438",
                                    "\u041C\u0430\u0432\u0440\u0438\u0442\u0430\u043D\u0456\u044F",
                                    "\u041C\u0430\u0432\u0440\u0438\u043A\u0456\u0439",
                                    "\u041C\u0435\u043A\u0441\u0438\u043A\u0430",
                                    "\u041C\u0456\u043A\u0440\u043E\u043D\u0435\u0437\u0456\u044F",
                                    "\u041C\u043E\u043B\u0434\u043E\u0432\u0430",
                                    "\u041C\u043E\u043D\u0430\u043A\u043E",
                                    "\u041C\u043E\u043D\u0433\u043E\u043B\u0456\u044F",
                                    "\u0427\u043E\u0440\u043D\u043E\u0433\u043E\u0440\u0456\u044F",
                                    "\u041C\u0430\u0440\u043E\u043A\u043A\u043E",
                                    "\u041C\u043E\u0437\u0430\u043C\u0431\u0456\u043A",
                                    "\u041C'\u044F\u043D\u043C\u0430",
                                    "\u041D\u0430\u043C\u0456\u0431\u0456\u044F",
                                    "\u041D\u0430\u0443\u0440\u0443",
                                    "\u041D\u0435\u043F\u0430\u043B",
                                    "\u041D\u0456\u0434\u0435\u0440\u043B\u0430\u043D\u0434\u0438",
                                    "\u041D\u043E\u0432\u0430 \u0417\u0435\u043B\u0430\u043D\u0434\u0456\u044F",
                                    "\u041D\u0456\u043A\u0430\u0440\u0430\u0433\u0443\u0430",
                                    "\u041D\u0456\u0433\u0435\u0440",
                                    "\u041D\u0456\u0433\u0435\u0440\u0456\u044F",
                                    "\u041D\u043E\u0440\u0432\u0435\u0433\u0456\u044F",
                                    "\u041E\u043C\u0430\u043D",
                                    "\u041F\u0430\u043A\u0438\u0441\u0442\u0430\u043D",
                                    "\u041F\u0430\u043B\u0430\u0443",
                                    "\u041F\u0430\u043D\u0430\u043C\u0430",
                                    "\u041F\u0430\u043F\u0443\u0430-\u041D\u043E\u0432\u0430 \u0413\u0432\u0456\u043D\u0435\u044F",
                                    "\u041F\u0430\u0440\u0430\u0433\u0432\u0430\u0439",
                                    "\u041F\u0435\u0440\u0443",
                                    "\u0424\u0456\u043B\u0456\u043F\u043F\u0456\u043D\u0438",
                                    "\u041F\u043E\u043B\u044C\u0449\u0430",
                                    "\u041F\u043E\u0440\u0442\u0443\u0433\u0430\u043B\u0456\u044F",
                                    "\u041A\u0430\u0442\u0430\u0440",
                                    "\u0420\u0443\u043C\u0443\u043D\u0456\u044F",
                                    "\u0420\u043E\u0441\u0456\u0439\u0441\u044C\u043A\u0430 \u0424\u0435\u0434\u0435\u0440\u0430\u0446\u0456\u044F",
                                    "\u0420\u0443\u0430\u043D\u0434\u0430",
                                    "\u0421\u0435\u043D\u0442-\u041A\u0456\u0442\u0441 \u0456 \u041D\u0435\u0432\u0456\u0441",
                                    "\u0421\u0435\u043D\u0442-\u041B\u044E\u0441\u0456\u044F",
                                    "\u0421\u0435\u043D\u0442-\u0412\u0456\u043D\u0441\u0435\u043D\u0442 \u0456 \u0413\u0440\u0435\u043D\u0430\u0434\u0456\u043D\u0438",
                                    "\u0421\u0430\u043C\u043E\u0430",
                                    "\u0421\u0430\u0443\u0434\u0456\u0432\u0441\u044C\u043A\u0430 \u0410\u0440\u0430\u0432\u0456\u044F",
                                    "\u0421\u0435\u043D\u0435\u0433\u0430\u043B",
                                    "\u0421\u0435\u0440\u0431\u0456\u044F",
                                    "\u0421\u0435\u0439\u0448\u0435\u043B\u044C\u0441\u044C\u043A\u0456 \u043E\u0441\u0442\u0440\u043E\u0432\u0438",
                                    "\u0421\u044C\u0454\u0440\u0440\u0430-\u041B\u0435\u043E\u043D\u0435",
                                    "\u0421\u0456\u043D\u0433\u0430\u043F\u0443\u0440",
                                    "\u0421\u043B\u043E\u0432\u0430\u0447\u0447\u0438\u043D\u0430",
                                    "\u0421\u043B\u043E\u0432\u0435\u043D\u0456\u044F",
                                    "\u0421\u043E\u043B\u043E\u043C\u043E\u043D\u043E\u0432\u0456 \u043E\u0441\u0442\u0440\u043E\u0432\u0438",
                                    "\u0421\u043E\u043C\u0430\u043B\u0456",
                                    "\u041F\u0410\u0420",
                                    "\u0406\u0441\u043F\u0430\u043D\u0456\u044F",
                                    "\u0428\u0440\u0456 \u041B\u0430\u043D\u043A\u0430",
                                    "\u0421\u0443\u0434\u0430\u043D",
                                    "\u0421\u0443\u0440\u0456\u043D\u0430\u043C",
                                    "\u0421\u0432\u0430\u0437\u0456\u043B\u0435\u043D\u0434",
                                    "\u0428\u0432\u0435\u0446\u0456\u044F",
                                    "\u0428\u0432\u0435\u0439\u0446\u0430\u0440\u0456\u044F",
                                    "\u0421\u0438\u0440\u0456\u044F",
                                    "\u0422\u0430\u0439\u0432\u0430\u043D\u044C",
                                    "\u0422\u0430\u0434\u0436\u0438\u043A\u0438\u0441\u0442\u0430\u043D",
                                    "\u0422\u0430\u043D\u0437\u0430\u043D\u0456\u044F",
                                    "\u0422\u0430\u0457\u043B\u0430\u043D\u0434",
                                    "\u0422\u043E\u0433\u043E",
                                    "\u0422\u043E\u043D\u0433\u0430",
                                    "\u0422\u0440\u0438\u043D\u0456\u0434\u0430\u0434 \u0456 \u0422\u043E\u0431\u0430\u0433\u043E",
                                    "\u0422\u0443\u043D\u0456\u0441",
                                    "\u0422\u0443\u0440\u0435\u0447\u0447\u0438\u043D\u0430",
                                    "\u0422\u0443\u0440\u043A\u043C\u0435\u043D\u0456\u0441\u0442\u0430\u043D",
                                    "\u0422\u0443\u0432\u0430\u043B\u0443",
                                    "\u0423\u0433\u0430\u043D\u0434\u0430",
                                    "\u0423\u043A\u0440\u0430\u0457\u043D\u0430",
                                    "\u041E\u0431'\u0454\u0434\u043D\u0430\u043D\u0456 \u0410\u0440\u0430\u0431\u0441\u044C\u043A\u0456 \u0415\u043C\u0456\u0440\u0430\u0442\u0438",
                                    "\u0412\u0435\u043B\u0438\u043A\u043E\u0431\u0440\u0438\u0442\u0430\u043D\u0456\u044F",
                                    "\u0421\u043F\u043E\u043B\u0443\u0447\u0435\u043D\u0456 \u0428\u0442\u0430\u0442\u0438",
                                    "\u0423\u0440\u0443\u0433\u0432\u0430\u0439",
                                    "\u0423\u0437\u0431\u0435\u043A\u0438\u0441\u0442\u0430\u043D",
                                    "\u0412\u0430\u043D\u0443\u0430\u0442\u0443",
                                    "\u0412\u0430\u0442\u0438\u043A\u0430\u043D",
                                    "\u0412\u0435\u043D\u0435\u0441\u0443\u0435\u043B\u0430",
                                    "\u0412'\u0454\u0442\u043D\u0430\u043C",
                                    "\u0404\u043C\u0435\u043D",
                                    "\u0417\u0430\u043C\u0431\u0456\u044F",
                                    "\u0417\u0456\u043C\u0431\u0430\u0431\u0432\u0435");
                        });

        public Object region =
                ZVal.arrayFromList(
                        "\u0412\u0456\u043D\u043D\u0438\u0446\u044C\u043A\u0430",
                        "\u0412\u043E\u043B\u0438\u043D\u0441\u044C\u043A\u0430",
                        "\u0414\u043D\u0456\u043F\u0440\u043E\u043F\u0435\u0442\u0440\u043E\u0432\u0441\u044C\u043A\u0430",
                        "\u0414\u043E\u043D\u0435\u0446\u044C\u043A\u0430",
                        "\u0416\u0438\u0442\u043E\u043C\u0438\u0440\u0441\u044C\u043A\u0430",
                        "\u0417\u0430\u043A\u0430\u0440\u043F\u0430\u0442\u0441\u044C\u043A\u0430",
                        "\u0417\u0430\u043F\u043E\u0440\u0456\u0437\u044C\u043A\u0430",
                        "\u0406\u0432\u0430\u043D\u043E-\u0424\u0440\u0430\u043D\u043A\u0456\u0432\u0441\u044C\u043A\u0430",
                        "\u041A\u0438\u0457\u0432\u0441\u044C\u043A\u0430",
                        "\u041A\u0456\u0440\u043E\u0432\u043E\u0433\u0440\u0430\u0434\u0441\u044C\u043A\u0430",
                        "\u041B\u0443\u0433\u0430\u043D\u0441\u044C\u043A\u0430",
                        "\u041B\u044C\u0432\u0456\u0432\u0441\u044C\u043A\u0430",
                        "\u041C\u0438\u043A\u043E\u043B\u0430\u0457\u0432\u0441\u044C\u043A\u0430",
                        "\u041E\u0434\u0435\u0441\u044C\u043A\u0430",
                        "\u041F\u043E\u043B\u0442\u0430\u0432\u0441\u044C\u043A\u0430",
                        "\u0420\u0456\u0432\u043D\u0435\u043D\u0441\u044C\u043A\u0430",
                        "\u0421\u0443\u043C\u0441\u044C\u043A\u0430",
                        "\u0422\u0435\u0440\u043D\u043E\u043F\u0456\u043B\u044C\u0441\u044C\u043A\u0430",
                        "\u0425\u0430\u0440\u043A\u0456\u0432\u0441\u044C\u043A\u0430",
                        "\u0425\u0435\u0440\u0441\u043E\u043D\u0441\u044C\u043A\u0430",
                        "\u0425\u043C\u0435\u043B\u044C\u043D\u0438\u0446\u044C\u043A\u0430",
                        "\u0427\u0435\u0440\u043A\u0430\u0441\u044C\u043A\u0430",
                        "\u0427\u0435\u0440\u043D\u0456\u0432\u0435\u0446\u044C\u043A\u0430",
                        "\u0427\u0435\u0440\u043D\u0456\u0433\u0456\u0432\u0441\u044C\u043A\u0430");

        public Object city =
                ZVal.arrayFromList(
                        "\u0412\u0456\u043D\u043D\u0438\u0446\u044F",
                        "\u041B\u0443\u0446\u044C\u043A",
                        "\u0414\u043D\u0456\u043F\u0440\u043E\u043F\u0435\u0442\u0440\u043E\u0432\u0441\u044C\u043A",
                        "\u0414\u043E\u043D\u0435\u0446\u044C\u043A",
                        "\u0416\u0438\u0442\u043E\u043C\u0438\u0440",
                        "\u0423\u0436\u0433\u043E\u0440\u043E\u0434",
                        "\u0417\u0430\u043F\u043E\u0440\u0456\u0436\u0436\u044F",
                        "\u0406\u0432\u0430\u043D\u043E-\u0424\u0440\u0430\u043D\u043A\u0456\u0432\u0441\u044C\u043A",
                        "\u041A\u0438\u0457\u0432",
                        "\u041A\u0456\u0440\u043E\u0432\u043E\u0433\u0440\u0430\u0434",
                        "\u041B\u0443\u0433\u0430\u043D\u0441\u044C\u043A",
                        "\u041B\u044C\u0432\u0456\u0432",
                        "\u041C\u0438\u043A\u043E\u043B\u0430\u0457\u0432",
                        "\u041E\u0434\u0435\u0441\u0430",
                        "\u041F\u043E\u043B\u0442\u0430\u0432\u0430",
                        "\u0420\u0456\u0432\u043D\u0435",
                        "\u0421\u0443\u043C\u0438",
                        "\u0422\u0435\u0440\u043D\u043E\u043F\u0456\u043B\u044C",
                        "\u0425\u0430\u0440\u043A\u0456\u0432",
                        "\u0425\u0435\u0440\u0441\u043E\u043D",
                        "\u0425\u043C\u0435\u043B\u044C\u043D\u0438\u0446\u044C\u043A",
                        "\u0427\u0435\u0440\u043A\u0430\u0441\u0438",
                        "\u0427\u0435\u0440\u043D\u0456\u0432\u0446\u0456",
                        "\u0427\u0435\u0440\u043D\u0456\u0433\u0456\u0432");

        public Object street =
                ZVal.arrayFromList(
                        "\u0422\u0430\u0440\u0430\u0441\u0430 \u0428\u0435\u0432\u0447\u0435\u043D\u043A\u0430",
                        "\u041B\u0435\u0441\u0456 \u0423\u043A\u0440\u0430\u0457\u043D\u043A\u0438",
                        "\u041C\u0438\u0445\u0430\u0439\u043B\u0430 \u0413\u0440\u0443\u0448\u0435\u0432\u0441\u044C\u043A\u043E\u0433\u043E",
                        "\u0423\u0440\u0438\u0446\u044C\u043A\u043E\u0433\u043E",
                        "\u041F. \u041E\u0440\u043B\u0438\u043A\u0430",
                        "\u0425\u0440\u0435\u0449\u0430\u0442\u0438\u043A",
                        "\u0410\u0440\u0442\u0435\u043C\u0430",
                        "\u041A\u043E\u043F\u0438\u043B\u0435\u043D\u043A\u0430",
                        "\u0420\u0456\u0437\u043D\u0438\u0446\u044C\u043A\u0430",
                        "\u041B\u0443\u043A\u2019\u044F\u043D\u0456\u0432\u0441\u044C\u043A\u0430",
                        "\u041F\u0430\u0442\u043E\u0440\u0436\u0438\u043D\u0441\u044C\u043A\u043E\u0433\u043E",
                        "\u0421\u043E\u043B\u043E\u043C\u2019\u044F\u043D\u0441\u044C\u043A\u0430",
                        "\u0410\u0440\u0441\u0435\u043D\u0430\u043B\u044C\u043D\u0430",
                        "\u041C\u0435\u043B\u044C\u043D\u0438\u043A\u043E\u0432\u0430",
                        "\u0412\u043E\u043B\u043E\u0434\u0438\u043C\u0438\u0440\u0441\u044C\u043A\u0430",
                        "\u0424\u0456\u0437\u043A\u0443\u043B\u044C\u0442\u0443\u0440\u0438",
                        "\u041B\u044C\u0432\u0456\u0432\u0441\u044C\u043A\u0430",
                        "\u0428\u043E\u0442\u0430 \u0420\u0443\u0441\u0442\u0430\u0432\u0435\u043B\u0456",
                        "\u041F\u0440\u043E\u0440\u0456\u0437\u043D\u0430",
                        "\u0406. \u0424\u0440\u0430\u043D\u043Aa",
                        "\u0411. \u0413\u0440\u0456\u043D\u0447\u0435\u043D\u043A\u0430",
                        "\u0406\u043D\u0441\u0442\u0438\u0442\u0443\u0442\u0441\u044C\u043A\u0430",
                        "\u041F\u0438\u0440\u043E\u0433\u043E\u0432\u0430",
                        "\u041C. \u041A\u043E\u0446\u044E\u0431\u0438\u043D\u0441\u044C\u043A\u043E\u0433\u043E",
                        "\u0412\u043E\u043B\u043E\u0434\u0438\u043C\u0438\u0440\u0441\u044C\u043A\u0430");

        public Object addressFormats =
                ZVal.arrayFromList(
                        "{{postcode}}, {{cityAndRegion}}, {{streetPrefix}} {{streetName}}, {{buildingNumber}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList("{{streetPrefix}} {{streetName}}, {{buildingNumber}}");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\uk_UA\\Address")
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
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/uk_UA/Address.php")
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
