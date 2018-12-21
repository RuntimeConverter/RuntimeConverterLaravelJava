package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.ru_RU.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Calculator.classes.Inn;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/ru_RU/Company.php

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
    public Object company(RuntimeEnv env, Object... args) {
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
                                                                .ru_RU
                                                                .classes
                                                                .Company
                                                                .RequestStaticProperties
                                                                .class,
                                                        "companyNameFormats")))
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
                                                        .Company
                                                        .RequestStaticProperties
                                                        .class)
                                        .companyNameFormats)
                        .value();
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Company.class,
                        format));
    }

    public static final Object CONST_class = "Faker\\Provider\\ru_RU\\Company";

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
                                                            .ru_RU
                                                            .classes
                                                            .Company
                                                            .RequestStaticProperties
                                                            .class)
                                            .companyPrefixes)
                            .value());
        }

        @ConvertedMethod
        public Object companyNameElement(RuntimeEnv env, Object... args) {
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
                                                            .ru_RU
                                                            .classes
                                                            .Company
                                                            .RequestStaticProperties
                                                            .class)
                                            .companyElements)
                            .value());
        }

        @ConvertedMethod
        public Object companyNameSuffix(RuntimeEnv env, Object... args) {
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
                                                            .ru_RU
                                                            .classes
                                                            .Company
                                                            .RequestStaticProperties
                                                            .class)
                                            .companyNameSuffixes)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "area_code")
        public Object inn(RuntimeEnv env, Object... args) {
            Object area_code = assignParameter(args, 0, true);
            if (null == area_code) {
                area_code = "";
            }
            Object inn_base = null;
            if (ZVal.toBool(ZVal.strictEqualityCheck(area_code, "===", ""))
                    || ZVal.toBool(
                            ZVal.equalityCheck(
                                    NamespaceGlobal.intval.env(env).call(area_code).value(), 0))) {
                area_code =
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
                                .method("numberBetween")
                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                .call(1, 91)
                                .value();

            } else {
                area_code = NamespaceGlobal.intval.env(env).call(area_code).value();
            }

            area_code = NamespaceGlobal.str_pad.env(env).call(area_code, 2, "0", 0).value();
            inn_base =
                    toStringR(area_code, env)
                            + toStringR(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Company.class)
                                            .method("numerify")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call("#######")
                                            .value(),
                                    env);
            return ZVal.assign(
                    toStringR(inn_base, env)
                            + toStringR(Inn.runtimeStaticObject.checksum(env, inn_base), env));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "inn")
        public Object kpp(RuntimeEnv env, Object... args) {
            Object inn = assignParameter(args, 0, true);
            if (null == inn) {
                inn = "";
            }
            if (ZVal.toBool(ZVal.equalityCheck(inn, ""))
                    || ZVal.toBool(
                            ZVal.isLessThan(
                                    function_strlen.f.env(env).call(inn).value(), '<', 4))) {
                inn =
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
                                .method("inn")
                                .call()
                                .value();
            }

            return ZVal.assign(
                    toStringR(function_substr.f.env(env).call(inn, 0, 4).value(), env) + "01001");
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object companyNameFormats =
                ZVal.arrayFromList(
                        "{{companyPrefix}} {{companyNameElement}}",
                        "{{companyPrefix}} {{companyNameElement}}{{companyNameElement}}",
                        "{{companyPrefix}} {{companyNameElement}}{{companyNameElement}}{{companyNameElement}}",
                        "{{companyPrefix}} {{companyNameElement}}{{companyNameElement}}{{companyNameElement}}{{companyNameSuffix}}");

        public Object companyPrefixes =
                ZVal.arrayFromList(
                        "\u041E\u041E\u041E",
                        "\u0417\u0410\u041E",
                        "\u041E\u041E\u041E \u041A\u043E\u043C\u043F\u0430\u043D\u0438\u044F",
                        "\u041E\u0410\u041E",
                        "\u041E\u0410\u041E",
                        "\u041F\u0410\u041E",
                        "\u041C\u041A\u041A",
                        "\u041C\u0424\u041E");

        public Object companyNameSuffixes =
                ZVal.arrayFromList(
                        "\u041C\u0430\u0448",
                        "\u041D\u0430\u043B\u0430\u0434\u043A\u0430",
                        "\u042D\u043A\u0441\u043F\u0435\u0434\u0438\u0446\u0438\u044F",
                        "\u041F\u0440\u043E\u043C",
                        "\u041A\u043E\u043C\u043F\u043B\u0435\u043A\u0441",
                        "\u041C\u0430\u0448\u0438\u043D\u0430",
                        "\u0421\u043D\u043E\u0441",
                        "-\u041C",
                        "\u041B\u0438\u0437\u0438\u043D\u0433",
                        "\u0422\u0440\u0430\u0441\u0442",
                        "\u0421\u043D\u0430\u0431",
                        "-H",
                        "\u0422\u0440\u0435\u0441\u0442",
                        "\u0411\u0430\u043D\u043A",
                        "\u041E\u043F\u0442",
                        "\u041F\u0440\u043E\u0444",
                        "\u0421\u0431\u044B\u0442",
                        "\u0426\u0435\u043D\u0442\u0440");

        public Object companyElements =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u0416\u0435\u043B\u0414\u043E\u0440",
                                    "\u0413\u0430\u0440\u0430\u0436",
                                    "\u0426\u0435\u043C\u0435\u043D\u0442",
                                    "\u0410\u0441\u0431\u043E\u0446\u0435\u043C\u0435\u043D\u0442",
                                    "\u0421\u0442\u0440\u043E\u0439",
                                    "\u041B\u0438\u0444\u0442",
                                    "\u041A\u0440\u0435\u043F",
                                    "\u0410\u0432\u0442\u043E",
                                    "\u0422\u0435\u043B\u0435",
                                    "\u0422\u0440\u0430\u043D\u0441",
                                    "\u0410\u043B\u043C\u0430\u0437",
                                    "\u041C\u0435\u0442\u0438\u0437",
                                    "\u041C\u043E\u0442\u043E\u0440",
                                    "\u0420\u043E\u0441",
                                    "\u0422\u044F\u0436",
                                    "\u0422\u0435\u0445",
                                    "\u0421\u0430\u043D\u0442\u0435\u0445",
                                    "\u0423\u0440\u0430\u043B",
                                    "\u0411\u0430\u0448\u043A\u0438\u0440",
                                    "\u0422\u0432\u0435\u0440\u044C",
                                    "\u041A\u0430\u0437\u0430\u043D\u044C",
                                    "\u041E\u0431\u043B",
                                    "\u0411\u0443\u0445",
                                    "\u0425\u043E\u0437",
                                    "\u042D\u043B\u0435\u043A\u0442\u0440\u043E",
                                    "\u0422\u0435\u043A\u0441\u0442\u0438\u043B\u044C",
                                    "\u0412\u043E\u0441\u0442\u043E\u043A",
                                    "\u041E\u0440\u0438\u043E\u043D",
                                    "\u042E\u043F\u0438\u0442\u0435\u0440",
                                    "\u0424\u0438\u043D\u0430\u043D\u0441",
                                    "\u041C\u0438\u043A\u0440\u043E",
                                    "\u0420\u0430\u0434\u0438\u043E",
                                    "\u041C\u043E\u0431\u0430\u0439\u043B",
                                    "\u0414\u0438\u0437\u0430\u0439\u043D",
                                    "\u041C\u0435\u0442\u0430\u043B",
                                    "\u041D\u0435\u0444\u0442\u044C",
                                    "\u0422\u0435\u043B\u0435\u043A\u043E\u043C",
                                    "\u0418\u043D\u0444\u043E",
                                    "\u0421\u0435\u0440\u0432\u0438\u0441",
                                    "\u0421\u043E\u0444\u0442",
                                    "IT",
                                    "\u0420\u044B\u0431",
                                    "\u0413\u043B\u0430\u0432",
                                    "\u0412\u0435\u043A\u0442\u043E\u0440",
                                    "\u0420\u0435\u043C",
                                    "\u0413\u043E\u0440",
                                    "\u0413\u0430\u0437",
                                    "\u041C\u043E\u043D\u0442\u0430\u0436",
                                    "\u041C\u043E\u0440",
                                    "\u0420\u0435\u0447",
                                    "\u0424\u043B\u043E\u0442",
                                    "C\u0438\u0431",
                                    "\u041A\u0430\u0437",
                                    "\u0418\u043D\u0436",
                                    "\u0412\u043E\u0434",
                                    "\u041F\u0438\u0432",
                                    "\u0425\u043C\u0435\u043B\u044C",
                                    "\u041C\u044F\u0441",
                                    "\u0422\u043E\u043C\u0441\u043A",
                                    "\u041E\u043C\u0441\u043A",
                                    "\u0421\u0435\u0432\u0435\u0440",
                                    "\u041B\u0435\u043D");
                        });

        public Object jobTitleFormat =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u0410\u0431\u0440\u0430\u0437\u0438\u0432\u043E\u0441\u0442\u0440\u0443\u0439\u0449\u0438\u043A",
                                    "\u0410\u0432\u0442\u043E\u0438\u043D\u0441\u0442\u0440\u0443\u043A\u0442\u043E\u0440",
                                    "\u0410\u0434\u043C\u0438\u043D\u0438\u0441\u0442\u0440\u0430\u0442\u043E\u0440",
                                    "\u0410\u0440\u0442-\u0434\u0438\u0440\u0435\u043A\u0442\u043E\u0440",
                                    "\u0410\u0440\u0445\u0438\u0432\u0438\u0441\u0442",
                                    "\u0411\u0430\u0440\u0438\u0441\u0442\u0430",
                                    "\u0411\u0430\u0440\u043C\u0435\u043D",
                                    "\u0411\u0435\u0441\u0442\u0438\u0430\u0440\u0438\u0439 (\u0433\u043B\u0430\u0434\u0438\u0430\u0442\u043E\u0440)",
                                    "\u0411\u0438\u0437\u043D\u0435\u0441-\u0430\u043D\u0430\u043B\u0438\u0442\u0438\u043A",
                                    "\u0411\u0443\u0445\u0433\u0430\u043B\u0442\u0435\u0440",
                                    "\u0412\u0435\u0442\u0435\u0440\u0438\u043D\u0430\u0440",
                                    "\u0412\u043E\u0434\u0438\u0442\u0435\u043B\u044C",
                                    "\u0412\u043E\u0434\u043E\u043B\u0430\u0437",
                                    "\u0413\u0435\u0439\u043C\u0434\u0438\u0437\u0430\u0439\u043D\u0435\u0440",
                                    "\u0413\u0435\u0440\u043E\u043B\u044C\u0434",
                                    "\u0413\u0438\u0442\u0430\u0440\u043D\u044B\u0439 \u043C\u0430\u0441\u0442\u0435\u0440",
                                    "\u0413\u043E\u0440\u043D\u044B\u0439 \u043F\u0440\u043E\u0432\u043E\u0434\u043D\u0438\u043A",
                                    "\u0414\u0435\u0442\u0435\u043A\u0442\u0438\u0432",
                                    "\u0414\u0438\u0434\u0436\u0435\u0439",
                                    "\u0414\u0438\u043A\u0442\u043E\u0440",
                                    "\u0414\u0438\u043F\u043B\u043E\u043C\u0430\u0442",
                                    "\u0415\u0433\u0435\u0440\u044C",
                                    "\u0416\u043E\u043A\u0435\u0439",
                                    "\u0417\u0443\u0431\u043D\u043E\u0439 \u0442\u0435\u0445\u043D\u0438\u043A",
                                    "\u0418\u043D\u0442\u0435\u043B\u043B\u0435\u043A\u0442\u0443\u0430\u043B",
                                    "\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u043E\u043D\u043D\u044B\u0439 \u0440\u0430\u0431\u043E\u0442\u043D\u0438\u043A",
                                    "\u041A\u0430\u0441\u0441\u0438\u0440",
                                    "\u041A\u043E\u0432\u0431\u043E\u0439",
                                    "\u041A\u0440\u0435\u0430\u0442\u0438\u0432\u043D\u044B\u0439 \u0434\u0438\u0440\u0435\u043A\u0442\u043E\u0440",
                                    "\u041A\u0440\u0438\u0442\u0438\u043A",
                                    "\u041A\u0440\u0443\u043F\u044C\u0435",
                                    "\u041B\u0435\u0441\u043E\u0440\u0443\u0431",
                                    "\u041B\u0438\u043D\u0433\u0432\u0438\u0441\u0442",
                                    "\u041C\u0430\u0448\u0438\u043D\u0438\u0441\u0442",
                                    "\u041C\u0435\u043D\u0435\u0434\u0436\u0435\u0440",
                                    "\u041C\u0443\u0437\u044B\u043A\u0430\u043D\u0442",
                                    "\u041D\u0430\u0443\u0447\u043D\u044B\u0439 \u0441\u043E\u0442\u0440\u0443\u0434\u043D\u0438\u043A",
                                    "\u041E\u0444\u0438\u0441-\u043C\u0435\u043D\u0435\u0434\u0436\u0435\u0440",
                                    "\u041F\u0435\u0447\u043D\u0438\u043A",
                                    "\u041F\u0438\u0430\u043D\u0438\u0441\u0442",
                                    "\u041F\u0438\u0441\u0430\u0442\u0435\u043B\u044C",
                                    "\u041F\u0440\u043E\u0434\u044E\u0441\u0435\u0440",
                                    "\u041F\u0440\u043E\u043C\u043E\u0443\u0442\u0435\u0440",
                                    "\u041F\u0441\u0438\u0445\u043E\u043B\u043E\u0433",
                                    "\u0420\u0430\u0434\u0438\u0441\u0442",
                                    "\u0420\u0435\u0434\u0430\u043A\u0442\u043E\u0440",
                                    "\u0421\u0430\u0434\u043E\u0432\u043D\u0438\u043A",
                                    "\u0421\u0438\u0441\u0442\u0435\u043C\u043D\u044B\u0439 \u0430\u043D\u0430\u043B\u0438\u0442\u0438\u043A",
                                    "\u0421\u0442\u0438\u043B\u0438\u0441\u0442",
                                    "\u0421\u0442\u043E\u043B\u044F\u0440",
                                    "\u0421\u0442\u043E\u0440\u043E\u0436",
                                    "\u0422\u0435\u043B\u0435\u0444\u043E\u043D\u0438\u0441\u0442\u043A\u0430",
                                    "\u0422\u0435\u043B\u043E\u0445\u0440\u0430\u043D\u0438\u0442\u0435\u043B\u044C",
                                    "\u0422\u0435\u0445\u043D\u0438\u0447\u0435\u0441\u043A\u0438\u0439 \u043F\u0438\u0441\u0430\u0442\u0435\u043B\u044C",
                                    "\u0423\u0447\u0451\u043D\u044B\u0439",
                                    "\u0424\u0438\u0437\u0438\u043A",
                                    "\u0424\u0438\u043D\u0430\u043D\u0441\u043E\u0432\u044B\u0439 \u0441\u043E\u0432\u0435\u0442\u043D\u0438\u043A",
                                    "\u0424\u043E\u0442\u043E\u0433\u0440\u0430\u0444",
                                    "\u0424\u0440\u0435\u0437\u0435\u0440\u043E\u0432\u0449\u0438\u043A",
                                    "\u0425\u0443\u0434\u043E\u0436\u043D\u0438\u043A",
                                    "\u0427\u0430\u0431\u0430\u043D",
                                    "\u0428\u0442\u0443\u0440\u043C\u0430\u043D",
                                    "\u042D\u043A\u043E\u043D\u043E\u043C\u0438\u0441\u0442",
                                    "\u042D\u043B\u0435\u043A\u0442\u0440\u043E\u043C\u043E\u043D\u0442\u0451\u0440");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\ru_RU\\Company")
                    .setLookup(
                            Company.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "companyElements",
                            "companyNameFormats",
                            "companyNameSuffixes",
                            "companyPrefixes",
                            "jobTitleFormat")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/ru_RU/Company.php")
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
