package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.uk_UA.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/uk_UA/Company.php

*/

public class Company
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .Company {

    public Company(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Company.class) {
            this.__construct(env, args);
        }
    }

    public Company(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object companyUrl(RuntimeEnv env, Object... args) {
        Object format = null;
        format =
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
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
                                                                .Company
                                                                .RequestStaticProperties
                                                                .class,
                                                        "urlFormats")))
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
                                                        .Company
                                                        .RequestStaticProperties
                                                        .class)
                                        .urlFormats)
                        .value();
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Company.class,
                        format));
    }

    public static final Object CONST_class = "Faker\\Provider\\uk_UA\\Company";

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
                    .Company
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object companyPrefix(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
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
                                                            .Company
                                                            .RequestStaticProperties
                                                            .class)
                                            .companyPrefix)
                            .value());
        }

        @ConvertedMethod
        public Object companyName(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
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
                                                            .Company
                                                            .RequestStaticProperties
                                                            .class)
                                            .companyName)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object formats =
                ZVal.arrayFromList(
                        "{{companyName}}",
                        "{{companyPrefix}} \"{{companyName}}\"",
                        "{{companyName}}-{{companySuffix}}",
                        "{{companyPrefix}} \"{{companyName}}-{{companySuffix}}\"");

        public Object urlFormats =
                ZVal.arrayFromList("{{companyName}}", "{{companyName}}-{{companySuffix}}");

        public Object companyPrefix =
                ZVal.arrayFromList(
                        "\u0422\u041E\u0412",
                        "\u041F\u041F",
                        "\u041F\u0410\u0422",
                        "\u041F\u0440\u0410\u0422");

        public Object companySuffix =
                ZVal.arrayFromList(
                        "\u0421\u0435\u0440\u0432\u0456\u0441",
                        "\u041F\u043B\u044E\u0441",
                        "\u0413\u0440\u0443\u043F",
                        "\u0421\u0442\u0438\u043B\u044C",
                        "\u0414\u0438\u0437\u0430\u0439\u043D");

        public Object companyName =
                ZVal.arrayFromList(
                        "\u0412\u0435\u043A\u0442\u043E\u0440",
                        "\u0415\u0434\u0435\u043B\u044C\u0432\u0435\u0439\u0441",
                        "\u0421\u043C\u0430\u0440\u0442",
                        "\u0410\u043B\u044C\u0444\u0430",
                        "\u0421\u0438\u0441\u0442\u0435\u043C\u0430",
                        "\u0423\u043D\u0456\u0432\u0435\u0440\u0441\u0430\u043B",
                        "\u0406\u043D\u0444\u043E\u043A\u043E\u043C",
                        "\u041C\u0430\u043A\u0441",
                        "\u041F\u043B\u0430\u043D\u0435\u0442\u0430",
                        "\u0412\u0435\u043A\u0442\u043E\u0440",
                        "\u041F\u0440\u0438\u0432\u0430\u0442",
                        "\u0415\u043A\u043E",
                        "\u041C\u0435\u0433\u0430",
                        "\u041C\u0435\u0433\u0430\u043C\u0430\u043A\u0441",
                        "\u041C\u0443\u043B\u044C\u0442\u0438",
                        "\u041C\u0430\u0439\u043D\u0435\u0440");

        public Object jobTitleFormat =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u0410\u0433\u0440\u043E\u043D\u043E\u043C",
                                    "\u0410\u0434\u0432\u043E\u043A\u0430\u0442",
                                    "\u0410\u043A\u0442\u043E\u0440",
                                    "\u0410\u043A\u0443\u0448\u0435\u0440",
                                    "\u0410\u043D\u0442\u0440\u043E\u043F\u043E\u043B\u043E\u0433",
                                    "\u0410\u043F\u0442\u0435\u043A\u0430\u0440",
                                    "\u0410\u0440\u0445\u0456\u0442\u0435\u043A\u0442\u043E\u0440",
                                    "\u0410\u0440\u0445\u0435\u043E\u043B\u043E\u0433",
                                    "\u0410\u0441\u0442\u0440\u043E\u043D\u0430\u0432\u0442",
                                    "\u0410\u0441\u0442\u0440\u043E\u0444\u0456\u0437\u0438\u043A",
                                    "\u0410\u0432\u0442\u043E\u0441\u043B\u044E\u0441\u0430\u0440",
                                    "\u0410\u0433\u0435\u043D\u0442",
                                    "\u0411\u0430\u0440\u0438\u0441\u0442\u0430",
                                    "\u0411\u0430\u0440\u043C\u0435\u043D",
                                    "\u0411\u0456\u0431\u043B\u0456\u043E\u0433\u0440\u0430\u0444",
                                    "\u0411\u0456\u043E\u043B\u043E\u0433",
                                    "\u0411\u0456\u0437\u043D\u0435\u0441\u043C\u0435\u043D",
                                    "\u0411\u043E\u0442\u0430\u043D\u0456\u043A",
                                    "\u0411\u0443\u0434\u0456\u0432\u0435\u043B\u044C\u043D\u0438\u043A",
                                    "\u0411\u0443\u0434\u043D\u0438\u043A",
                                    "\u0411\u0443\u0445\u0433\u0430\u043B\u0442\u0435\u0440",
                                    "\u0411\u0456\u0431\u043B\u0456\u043E\u0442\u0435\u043A\u0430\u0440",
                                    "\u0412\u0430\u043D\u0442\u0430\u0436\u043D\u0438\u043A",
                                    "\u0412\u0435\u0434\u0443\u0447\u0438\u0439",
                                    "\u0412\u0435\u0442\u0435\u0440\u0438\u043D\u0430\u0440",
                                    "\u0412\u0438\u043F\u0440\u043E\u0431\u0443\u0432\u0430\u0447",
                                    "\u0412\u043E\u0434\u0456\u0439",
                                    "\u0412\u0447\u0438\u0442\u0435\u043B\u044C",
                                    "\u0412\u0456\u0437\u0430\u0436\u0438\u0441\u0442",
                                    "\u0413\u0430\u0440\u0434\u0435\u0440\u043E\u0431\u043D\u0438\u043A",
                                    "\u0413\u0435\u043E\u0433\u0440\u0430\u0444",
                                    "\u0413\u0435\u043E\u043B\u043E\u0433",
                                    "\u0413\u0435\u043E\u0444\u0456\u0437\u0438\u043A",
                                    "\u0413\u0438\u0446\u0435\u043B\u044C",
                                    "\u0413\u0456\u043D\u0435\u043A\u043E\u043B\u043E\u0433",
                                    "\u0413\u0456\u0440\u043D\u0438\u043A",
                                    "\u0413\u0456\u0440\u043D\u0438\u0447\u0438\u0439 \u0456\u043D\u0436\u0435\u043D\u0435\u0440",
                                    "\u0413\u043E\u043B\u043E\u0432\u043D\u0438\u0439 \u043C\u0435\u0440\u043A\u0448\u0435\u0439\u0434\u0435\u0440",
                                    "\u0413\u0440\u0430\u0444\u0456\u043A",
                                    "\u0413\u0440\u043E\u043C\u0430\u0434\u0441\u044C\u043A\u0438\u0439 \u0434\u0456\u044F\u0447",
                                    "\u0490\u0440\u0443\u043D\u0442\u043E\u0437\u043D\u0430\u0432\u0435\u0446\u044C",
                                    "\u0414\u0430\u043D\u0442\u0438\u0441\u0442",
                                    "\u0414\u0435\u0440\u0436\u0430\u0432\u043D\u0438\u0439 \u0441\u043B\u0443\u0436\u0431\u043E\u0432\u0435\u0446\u044C",
                                    "\u0414\u0435\u0442\u0435\u043A\u0442\u0438\u0432",
                                    "\u0414\u0438\u0437\u0430\u0439\u043D\u0435\u0440",
                                    "\u0414\u0438\u043F\u043B\u043E\u043C\u0430\u0442",
                                    "\u0414\u0438\u0440\u0438\u0433\u0435\u043D\u0442",
                                    "\u0414\u0456-\u0434\u0436\u0435\u0439",
                                    "\u0414\u043E\u043C\u043E\u0440\u043E\u0431\u0456\u0442\u043D\u0438\u0446\u044F",
                                    "\u0414\u043E\u0446\u0435\u043D\u0442",
                                    "\u0414\u0440\u0430\u043C\u0430\u0442\u0443\u0440\u0433",
                                    "\u0415\u043A\u043E\u043D\u043E\u043C\u0456\u0441\u0442",
                                    "\u0415\u043B\u0435\u043A\u0442\u0440\u0438\u043A",
                                    "\u0415\u043B\u0435\u043A\u0442\u0440\u043E\u043C\u043E\u043D\u0442\u0435\u0440",
                                    "\u0415\u043B\u0435\u043A\u0442\u0440\u043E\u043C\u043E\u043D\u0442\u0430\u0436\u043D\u0438\u043A",
                                    "\u0415\u043B\u0435\u043A\u0442\u0440\u043E\u0441\u043B\u044E\u0441\u0430\u0440",
                                    "\u0415\u043B\u0435\u043A\u0442\u0440\u043E\u0442\u0435\u0445\u043D\u0456\u043A",
                                    "\u0415\u043F\u0456\u0434\u0435\u043C\u0456\u043E\u043B\u043E\u0433",
                                    "\u0415\u0442\u043D\u043E\u0433\u0440\u0430\u0444",
                                    "\u0415\u043A\u043E\u043B\u043E\u0433",
                                    "\u0404\u0432\u043D\u0443\u0445",
                                    "\u0404\u0433\u0435\u0440",
                                    "\u0416\u0443\u0440\u043D\u0430\u043B\u0456\u0441\u0442",
                                    "\u0416\u0438\u0432\u043E\u043F\u0438\u0441\u0435\u0446\u044C",
                                    "\u0417\u043E\u043B\u043E\u0442\u0430\u0440",
                                    "\u0417\u043E\u043E\u043B\u043E\u0433",
                                    "\u0406\u043D\u0436\u0435\u043D\u0435\u0440 \u043A\u043E\u043C\u043F\u2019\u044E\u0442\u0435\u0440\u043D\u043E\u0457 \u0442\u0435\u0445\u043D\u0456\u043A\u0438",
                                    "\u0406\u043D\u0436\u0435\u043D\u0435\u0440",
                                    "\u0406\u043A\u043E\u043D\u043E\u043F\u0438\u0441\u0435\u0446\u044C",
                                    "\u0406\u0441\u0442\u043E\u0440\u0438\u043A",
                                    "\u0406\u043D\u0441\u043F\u0435\u043A\u0442\u043E\u0440",
                                    "\u0406\u043D\u0441\u0442\u0440\u0443\u043A\u0442\u043E\u0440",
                                    "\u041A\u0430\u0441\u043A\u0430\u0434\u0435\u0440",
                                    "\u041A\u043B\u0430\u0432\u0456\u0448\u043D\u0438\u043A",
                                    "\u041A\u043B\u043E\u0443\u043D",
                                    "\u041A\u043E\u043C\u043F\u043E\u0437\u0438\u0442\u043E\u0440",
                                    "\u041A\u043E\u043D\u0441\u044C\u0454\u0440\u0436",
                                    "\u041A\u043E\u043D\u0441\u0442\u0440\u0443\u043A\u0442\u043E\u0440",
                                    "\u041A\u043E\u0443\u0447",
                                    "\u041A\u0440\u0430\u0454\u0437\u043D\u0430\u0432\u0435\u0446\u044C",
                                    "\u041A\u0440\u0438\u043C\u0456\u043D\u0430\u043B\u0456\u0441\u0442",
                                    "\u041A\u0443\u0448\u043D\u0456\u0440",
                                    "\u041A\u0456\u043D\u043E\u0430\u043A\u0442\u043E\u0440",
                                    "\u041A\u0456\u043D\u043E\u043A\u0440\u0438\u0442\u0438\u043A",
                                    "\u041A\u0456\u043D\u043E\u0440\u0435\u0436\u0438\u0441\u0435\u0440",
                                    "\u041A\u0443\u0440\u2019\u0454\u0440",
                                    "\u041A\u0443\u0445\u0430\u0440",
                                    "\u041A\u0456\u043D\u043E\u043B\u043E\u0433",
                                    "\u041A\u0440\u0443\u043F\u2019\u0454",
                                    "\u041B\u0430\u0431\u043E\u0440\u0430\u043D\u0442",
                                    "\u041B\u044C\u043E\u0442\u0447\u0438\u043A",
                                    "\u041B\u0456\u043A\u0430\u0440",
                                    "\u041B\u0456\u043F\u043D\u0438\u043A \u0430\u0440\u0445\u0456\u0442\u0435\u043A\u0442\u0443\u0440\u043D\u0438\u0445 \u0434\u0435\u0442\u0430\u043B\u0435\u0439",
                                    "\u041B\u0456\u0441\u043D\u0438\u0447\u0438\u0439",
                                    "\u041B\u0456\u0442\u0435\u0440\u0430\u0442\u0443\u0440\u043E\u0437\u043D\u0430\u0432\u0435\u0446\u044C",
                                    "\u041B\u043E\u0433\u043E\u043F\u0435\u0434",
                                    "\u041B\u043E\u043A\u0441\u043C\u0430\u0439\u0441\u0442\u0435\u0440",
                                    "\u041B\u043E\u0440",
                                    "\u041C\u0430\u0442\u0435\u043C\u0430\u0442\u0438\u043A",
                                    "\u041C\u0430\u0448\u0438\u043D\u0456\u0441\u0442",
                                    "\u041C\u0435\u0434\u0438\u043A",
                                    "\u041C\u0435\u043D\u0435\u0434\u0436\u0435\u0440",
                                    "\u041C\u0438\u0441\u0442\u0435\u0446\u0442\u0432\u043E\u0437\u043D\u0430\u0432\u0435\u0446\u044C",
                                    "\u041C\u0456\u0440\u043E\u0448\u043D\u0438\u043A",
                                    "\u041C\u0456\u043A\u0440\u043E\u0431\u0456\u043E\u043B\u043E\u0433",
                                    "\u041C\u0456\u043D\u0435\u0440\u0430\u043B\u043E\u0433",
                                    "\u041C\u043E\u0432\u043E\u0437\u043D\u0430\u0432\u0435\u0446\u044C",
                                    "\u041C\u043E\u0434\u0435\u043B\u044C\u0454\u0440",
                                    "\u041C\u043E\u0434\u0435\u043B\u044C\u043D\u0438\u043A",
                                    "\u041C\u0443\u0437\u0438\u043A\u0430\u043D\u0442",
                                    "\u041C\u0443\u0437\u0438\u043A\u043E\u0437\u043D\u0430\u0432\u0435\u0446\u044C",
                                    "\u041C\u0443\u0437\u0438\u0447\u043D\u0438\u0439 \u0440\u0435\u0434\u0430\u043A\u0442\u043E\u0440",
                                    "\u041C\u0430\u0440\u043A\u0435\u0442\u043E\u043B\u043E\u0433",
                                    "\u041C\u2019\u044F\u0441\u043D\u0438\u043A",
                                    "\u041C\u0456\u043A\u0440\u043E\u0431\u0456\u043E\u043B\u043E\u0433",
                                    "\u041D\u0430\u043C\u043E\u0442\u0443\u0432\u0430\u043B\u044C\u043D\u0438\u043A",
                                    "\u041D\u0430\u0443\u043A\u043E\u0432\u0435\u0446\u044C",
                                    "\u041D\u044F\u043D\u044F",
                                    "\u041D\u043E\u0442\u0430\u0440\u0456\u0443\u0441",
                                    "\u041D\u0430\u0432\u0456\u0434\u043D\u0438\u043A-\u043E\u043F\u0435\u0440\u0430\u0442\u043E\u0440",
                                    "\u041E\u0437\u0435\u043B\u0435\u043D\u044E\u0432\u0430\u0447",
                                    "\u041E\u043A\u0443\u043B\u0456\u0441\u0442",
                                    "\u041E\u043D\u043A\u043E\u043B\u043E\u0433",
                                    "\u041E\u043F\u0435\u0440\u0430\u0442\u043E\u0440",
                                    "\u041E\u0440\u0433\u0430\u043D\u0456\u0437\u0430\u0442\u043E\u0440",
                                    "\u041E\u0445\u043E\u0440\u043E\u043D\u0435\u0446\u044C",
                                    "\u041E\u0445\u043E\u0440\u043E\u043D\u043D\u0438\u043A",
                                    "\u041F\u0430\u0431\u043B\u0456\u043A \u0440\u0438\u043B\u0435\u0439\u0448\u043D\u0437",
                                    "\u041F\u0430\u043B\u0435\u043E\u043D\u0442\u043E\u043B\u043E\u0433",
                                    "\u041F\u0430\u0440\u0430\u043B\u0435\u0433\u0430\u043B",
                                    "\u041F\u0430\u0440\u0444\u0443\u043C\u0435\u0440",
                                    "\u041F\u0430\u0441\u0456\u0447\u043D\u0438\u043A",
                                    "\u041F\u0430\u0442\u043E\u043B\u043E\u0433\u043E\u0430\u043D\u0430\u0442\u043E\u043C",
                                    "\u041F\u0435\u0434\u0430\u0433\u043E\u0433",
                                    "\u041F\u0435\u043A\u0430\u0440",
                                    "\u041F\u0435\u0440\u0435\u043A\u043B\u0430\u0434\u0430\u0447",
                                    "\u041F\u0435\u0440\u0443\u043A\u0430\u0440",
                                    "\u041F\u0435\u0442\u0440\u043E\u0433\u0440\u0430\u0444",
                                    "\u041F\u0438\u0441\u044C\u043C\u0435\u043D\u043D\u0438\u043A",
                                    "\u041F\u0456\u0430\u043D\u0456\u0441\u0442",
                                    "\u041F\u0456\u0434\u043F\u0440\u0438\u0454\u043C\u0435\u0446\u044C",
                                    "\u041F\u0456\u043B\u043E\u0442",
                                    "\u041F\u0440\u0430\u0432\u043D\u0438\u043A",
                                    "\u041F\u0440\u0438\u0431\u0438\u0440\u0430\u043B\u044C\u043D\u0438\u043A",
                                    "\u041F\u0440\u043E\u0433\u0440\u0430\u043C\u0456\u0441\u0442",
                                    "\u041F\u0440\u043E\u0432\u0456\u0437\u043E\u0440",
                                    "\u041F\u0440\u043E\u043A\u0443\u0440\u043E\u0440",
                                    "\u041F\u0440\u043E\u043C\u0438\u0441\u043B\u043E\u0432\u0435\u0446\u044C",
                                    "\u041F\u0440\u043E\u0444\u0435\u0441\u043E\u0440",
                                    "\u041F\u0441\u0438\u0445\u043E\u043B\u043E\u0433",
                                    "\u041F\u043E\u043B\u0456\u0442\u0438\u043A",
                                    "\u041F\u0443\u0431\u043B\u0456\u0446\u0438\u0441\u0442",
                                    "\u041F\u0440\u043E\u0434\u044E\u0441\u0435\u0440",
                                    "\u0420\u0435\u0432\u0456\u0437\u043E\u0440",
                                    "\u0420\u0435\u0436\u0438\u0441\u0435\u0440",
                                    "\u0420\u0456\u0437\u043D\u043E\u0440\u043E\u0431\u043E\u0447\u0438\u0439",
                                    "\u0420\u0435\u0430\u0431\u0456\u043B\u0456\u0442\u043E\u043B\u043E\u0433",
                                    "\u0420\u0435\u0434\u0430\u043A\u0442\u043E\u0440",
                                    "\u0420\u0435\u0441\u0442\u0430\u0432\u0440\u0430\u0442\u043E\u0440",
                                    "\u0420\u0456\u0435\u043B\u0442\u043E\u0440",
                                    "\u0421\u0430\u043D\u0442\u0435\u0445\u043D\u0456\u043A",
                                    "\u0421\u0432\u044F\u0449\u0435\u043D\u0438\u043A",
                                    "\u0421\u043A\u043B\u0430\u0434\u0430\u043B\u044C\u043D\u0438\u043A",
                                    "\u0421\u043A\u0443\u043B\u044C\u043F\u0442\u043E\u0440",
                                    "\u0421\u043E\u0446\u0456\u043E\u043B\u043E\u0433",
                                    "\u0421\u043F\u0456\u0432\u0430\u043A",
                                    "\u0421\u043F\u043E\u0440\u0442\u0441\u043C\u0435\u043D",
                                    "\u0421\u0446\u0435\u043D\u0430\u0440\u0438\u0441\u0442",
                                    "\u0421\u0442\u0440\u0456\u043D\u0433\u0435\u0440",
                                    "\u0421\u0442\u0440\u043E\u043F\u0430\u043B\u044C\u043D\u0438\u043A",
                                    "\u0421\u0442\u043E\u043C\u0430\u0442\u043E\u043B\u043E\u0433",
                                    "\u0421\u043B\u0456\u0434\u0447\u0438\u0439",
                                    "\u0421\u0442\u0438\u043B\u0456\u0441\u0442",
                                    "\u0421\u0435\u043A\u0440\u0435\u0442\u0430\u0440",
                                    "\u0421\u0442\u0440\u0456\u043B\u043E\u0447\u043D\u0438\u043A",
                                    "\u0421\u0442\u044E\u0430\u0440\u0434\u0435\u0441\u0430",
                                    "\u0421\u0443\u0434\u0434\u044F",
                                    "\u0421\u0442\u0438\u043B\u0456\u0441\u0442",
                                    "\u0422\u0430\u043A\u0441\u0438\u0441\u0442",
                                    "\u0422\u0430\u043C\u0430\u0434\u0430",
                                    "\u0422\u0430\u043D\u0446\u0456\u0432\u043D\u0438\u043A",
                                    "\u0422\u0435\u043D\u0456\u0441\u0438\u0441\u0442",
                                    "\u0422\u0435\u0440\u0430\u043F\u0435\u0432\u0442",
                                    "\u0422\u043A\u0430\u0447",
                                    "\u0422\u043E\u043A\u0430\u0440",
                                    "\u0422\u0440\u0430\u043A\u0442\u043E\u0440\u0438\u0441\u0442",
                                    "\u0424\u0430\u0440\u043C\u0430\u0446\u0435\u0432\u0442",
                                    "\u0424\u0435\u0440\u043C\u0435\u0440",
                                    "\u0424\u0456\u0437\u0438\u043A",
                                    "\u0424\u0456\u043B\u043E\u043B\u043E\u0433",
                                    "\u0424\u043E\u043B\u044C\u043A\u043B\u043E\u0440\u0438\u0441\u0442",
                                    "\u0424\u043E\u0440\u043C\u0443\u0432\u0430\u043B\u044C\u043D\u0438\u043A",
                                    "\u0424\u043E\u0442\u043E\u0433\u0440\u0430\u0444",
                                    "\u0424\u0443\u0442\u0431\u043E\u043B\u0456\u0441\u0442",
                                    "\u0424\u043B\u043E\u0440\u0438\u0441\u0442",
                                    "\u0424\u0456\u043D\u0430\u043D\u0441\u0438\u0441\u0442",
                                    "\u0425\u0456\u0440\u0443\u0440\u0433",
                                    "\u0425\u0456\u043C\u0456\u043A",
                                    "\u0425\u0443\u0434\u043E\u0436\u043D\u0438\u043A",
                                    "\u0425\u043E\u0440\u0435\u043E\u0433\u0440\u0430\u0444",
                                    "\u0425\u043E\u0440\u043C\u0435\u0439\u0441\u0442\u0435\u0440",
                                    "\u0428\u0435\u0440\u0438\u0444",
                                    "\u0428\u0432\u0430\u0447\u043A\u0430",
                                    "\u0428\u0442\u0443\u043A\u0430\u0442\u0443\u0440",
                                    "\u042E\u0432\u0435\u043B\u0456\u0440",
                                    "\u042E\u0440\u0438\u0441\u0442");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\uk_UA\\Company")
                    .setLookup(
                            Company.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "companyName",
                            "companyPrefix",
                            "companySuffix",
                            "formats",
                            "jobTitleFormat",
                            "urlFormats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/uk_UA/Company.php")
                    .addExtendsClass("Faker\\Provider\\Company")
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
