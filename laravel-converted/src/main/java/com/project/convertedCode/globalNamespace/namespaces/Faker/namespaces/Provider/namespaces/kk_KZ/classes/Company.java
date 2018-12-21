package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.kk_KZ.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/kk_KZ/Company.php

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
                                                                .kk_KZ
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
                                                        .kk_KZ
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

    public static final Object CONST_class = "Faker\\Provider\\kk_KZ\\Company";

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
                                                            .kk_KZ
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
                                                            .kk_KZ
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
                                                            .kk_KZ
                                                            .classes
                                                            .Company
                                                            .RequestStaticProperties
                                                            .class)
                                            .companyNameSuffixes)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "registrationDate",
            typeHint = "DateTime",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object businessIdentificationNumber(RuntimeEnv env, Object... args) {
            Object registrationDate = assignParameter(args, 0, true);
            if (null == registrationDate) {
                registrationDate = ZVal.getNull();
            }
            Object randomDigits = null;
            Object legalEntityAdditionalType = null;
            Object dateAsString = null;
            Object legalEntityType = null;
            if (!ZVal.isTrue(registrationDate)) {
                registrationDate = DateTime.runtimeStaticObject.dateTimeThisYear(env);
            }

            dateAsString = env.callMethod(registrationDate, "format", Company.class, "ym");
            legalEntityType =
                    ZVal.assign(
                            toStringR(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Company.class)
                                            .method("numberBetween")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(4, 6)
                                            .value(),
                                    env));
            legalEntityAdditionalType =
                    ZVal.assign(
                            toStringR(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Company.class)
                                            .method("numberBetween")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(0, 3)
                                            .value(),
                                    env));
            randomDigits =
                    ZVal.assign(
                            toStringR(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Company.class)
                                            .method("numerify")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call("######")
                                            .value(),
                                    env));
            return ZVal.assign(
                    toStringR(dateAsString, env)
                            + toStringR(legalEntityType, env)
                            + toStringR(legalEntityAdditionalType, env)
                            + toStringR(randomDigits, env));
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
                ZVal.arrayFromList("\u0410\u049A", "\u0416\u0428\u0421", "\u0416\u0410\u049A");

        public Object companyNameSuffixes =
                ZVal.arrayFromList(
                        "\u049A\u04B1\u0440\u044B\u043B\u044B\u0441",
                        "\u041C\u0430\u0448\u0438\u043D\u0430",
                        "\u0411\u04B1\u0437\u0443",
                        "-\u041C",
                        "\u041B\u0438\u0437\u0438\u043D\u0433",
                        "\u0421\u0442\u0440\u0430\u0445",
                        "\u041A\u043E\u043C",
                        "\u0422\u0435\u043B\u0435\u043A\u043E\u043C");

        public Object companyElements =
                ZVal.arrayFromList(
                        "\u049A\u0430\u0437\u0430\u049B",
                        "\u041A\u0456\u0442\u0430\u043F",
                        "\u0426\u0435\u043C\u0435\u043D\u0442",
                        "\u041B\u0438\u0444\u0442",
                        "\u041A\u0440\u0435\u043F",
                        "\u0410\u0432\u0442\u043E",
                        "\u0422\u0435\u043B\u0435",
                        "\u0422\u0440\u0430\u043D\u0441",
                        "\u0410\u043B\u043C\u0430\u0437",
                        "\u041C\u0435\u0442\u0438\u0437",
                        "\u041C\u043E\u0442\u043E\u0440",
                        "\u049A\u0430\u0437",
                        "\u0422\u0435\u0445",
                        "\u0421\u0430\u043D\u0442\u0435\u0445",
                        "\u0410\u043B\u043C\u0430\u0442\u044B",
                        "\u0410\u0441\u0442\u0430\u043D\u0430",
                        "\u042D\u043B\u0435\u043A\u0442\u0440\u043E");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\kk_KZ\\Company")
                    .setLookup(
                            Company.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "companyElements",
                            "companyNameFormats",
                            "companyNameSuffixes",
                            "companyPrefixes")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/kk_KZ/Company.php")
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
