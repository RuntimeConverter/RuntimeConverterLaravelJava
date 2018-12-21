package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.ja_JP.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/ja_JP/Person.php

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
    public Object kanaName(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object gender = assignParameter(args, 0, true);
        if (null == gender) {
            gender = ZVal.getNull();
        }
        Object format = null;
        if (ZVal.strictEqualityCheck(
                gender,
                "===",
                ClassConstantUtils.getConstantValueLateStatic(env, this, "GENDER_MALE"))) {
            format =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
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
                                                                    .Person
                                                                    .RequestStaticProperties
                                                                    .class,
                                                            "maleKanaNameFormats")))
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
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .maleKanaNameFormats)
                            .value();

        } else if (ZVal.strictEqualityCheck(
                gender,
                "===",
                ClassConstantUtils.getConstantValueLateStatic(env, this, "GENDER_FEMALE"))) {
            format =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
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
                                                                    .Person
                                                                    .RequestStaticProperties
                                                                    .class,
                                                            "femaleKanaNameFormats")))
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
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .femaleKanaNameFormats)
                            .value();

        } else {
            format =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
                            .method("randomElement")
                            .addReferenceArgs(
                                    rLastRefArgs =
                                            new RuntimeArgsWithReferences()
                                                    .add(
                                                            0,
                                                            handleReturnReference(
                                                                    function_array_merge
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
                                                                                                            .ja_JP
                                                                                                            .classes
                                                                                                            .Person
                                                                                                            .RequestStaticProperties
                                                                                                            .class)
                                                                                            .maleKanaNameFormats,
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
                                                                                                            .ja_JP
                                                                                                            .classes
                                                                                                            .Person
                                                                                                            .RequestStaticProperties
                                                                                                            .class)
                                                                                            .femaleKanaNameFormats)
                                                                            .value())))
                            .call(rLastRefArgs.get(0))
                            .value();
        }

        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Person.class,
                        format));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "gender",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object firstKanaName(RuntimeEnv env, Object... args) {
        Object gender = assignParameter(args, 0, true);
        if (null == gender) {
            gender = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(
                gender,
                "===",
                ClassConstantUtils.getConstantValueLateStatic(env, this, "GENDER_MALE"))) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
                            .method("firstKanaNameMale")
                            .call()
                            .value());

        } else if (ZVal.strictEqualityCheck(
                gender,
                "===",
                ClassConstantUtils.getConstantValueLateStatic(env, this, "GENDER_FEMALE"))) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
                            .method("firstKanaNameFemale")
                            .call()
                            .value());
        }

        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Person.class,
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
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
                                                                        .Person
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "firstKanaNameFormat")))
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
                                                                .Person
                                                                .RequestStaticProperties
                                                                .class)
                                                .firstKanaNameFormat)
                                .value()));
    }

    public static final Object CONST_class = "Faker\\Provider\\ja_JP\\Person";

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
        public Object firstKanaNameMale(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
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
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .firstKanaNameMale)
                            .value());
        }

        @ConvertedMethod
        public Object firstKanaNameFemale(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
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
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .firstKanaNameFemale)
                            .value());
        }

        @ConvertedMethod
        public Object lastKanaName(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
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
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .lastKanaName)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object maleNameFormats = ZVal.arrayFromList("{{lastName}} {{firstNameMale}}");

        public Object femaleNameFormats = ZVal.arrayFromList("{{lastName}} {{firstNameFemale}}");

        public Object firstNameMale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u6643",
                                    "\u7BE4\u53F8",
                                    "\u6CBB",
                                    "\u548C\u4E5F",
                                    "\u4EAC\u52A9",
                                    "\u5065\u4E00",
                                    "\u4FEE\u5E73",
                                    "\u7FD4\u592A",
                                    "\u6DF3",
                                    "\u8061\u592A\u90CE",
                                    "\u592A\u4E00",
                                    "\u592A\u90CE",
                                    "\u62D3\u771F",
                                    "\u7FFC",
                                    "\u667A\u4E5F",
                                    "\u76F4\u6A39",
                                    "\u76F4\u4EBA",
                                    "\u82F1\u6A39",
                                    "\u6D69",
                                    "\u5B66",
                                    "\u5145",
                                    "\u7A14",
                                    "\u88D5\u6A39",
                                    "\u88D5\u592A",
                                    "\u5EB7\u5F18",
                                    "\u967D\u4E00",
                                    "\u6D0B\u4ECB",
                                    "\u4EAE\u4ECB",
                                    "\u6DBC\u5E73",
                                    "\u96F6");
                        });

        public Object firstNameFemale =
                ZVal.arrayFromList(
                        "\u660E\u7F8E",
                        "\u3042\u3059\u304B",
                        "\u9999\u7E54",
                        "\u52A0\u5948",
                        "\u304F\u307F\u5B50",
                        "\u3055\u3086\u308A",
                        "\u77E5\u5B9F",
                        "\u5343\u4EE3",
                        "\u76F4\u5B50",
                        "\u4E03\u590F",
                        "\u82B1\u5B50",
                        "\u6625\u9999",
                        "\u771F\u7DBE",
                        "\u821E",
                        "\u7F8E\u52A0\u5B50",
                        "\u5E79",
                        "\u6843\u5B50",
                        "\u7D50\u8863",
                        "\u88D5\u7F8E\u5B50",
                        "\u967D\u5B50",
                        "\u91CC\u4F73");

        public Object lastName =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u9752\u7530",
                                    "\u9752\u5C71",
                                    "\u77F3\u7530",
                                    "\u4E95\u9AD8",
                                    "\u4F0A\u85E4",
                                    "\u4E95\u4E0A",
                                    "\u5B87\u91CE",
                                    "\u6C5F\u53E4\u7530",
                                    "\u5927\u57A3",
                                    "\u52A0\u85E4",
                                    "\u52A0\u7D0D",
                                    "\u559C\u5D8B",
                                    "\u6728\u6751",
                                    "\u6850\u5C71",
                                    "\u5DE5\u85E4",
                                    "\u5C0F\u6CC9",
                                    "\u5C0F\u6797",
                                    "\u8FD1\u85E4",
                                    "\u6589\u85E4",
                                    "\u5742\u672C",
                                    "\u4F50\u3005\u6728",
                                    "\u4F50\u85E4",
                                    "\u7B39\u7530",
                                    "\u9234\u6728",
                                    "\u6749\u5C71",
                                    "\u9AD8\u6A4B",
                                    "\u7530\u4E2D",
                                    "\u7530\u8FBA",
                                    "\u6D25\u7530",
                                    "\u4E2D\u5CF6",
                                    "\u4E2D\u6751",
                                    "\u6E1A",
                                    "\u4E2D\u6D25\u5DDD",
                                    "\u897F\u4E4B\u5712",
                                    "\u91CE\u6751",
                                    "\u539F\u7530",
                                    "\u6D5C\u7530",
                                    "\u5EE3\u5DDD",
                                    "\u85E4\u672C",
                                    "\u677E\u672C",
                                    "\u4E09\u5B85",
                                    "\u5BAE\u6CA2",
                                    "\u6751\u5C71",
                                    "\u5C71\u5CB8",
                                    "\u5C71\u53E3",
                                    "\u5C71\u7530",
                                    "\u5C71\u672C",
                                    "\u5409\u7530",
                                    "\u5409\u672C",
                                    "\u82E5\u677E",
                                    "\u6E21\u8FBA");
                        });

        public Object firstKanaNameFormat =
                ZVal.arrayFromList("{{firstKanaNameMale}}", "{{firstKanaNameFemale}}");

        public Object maleKanaNameFormats =
                ZVal.arrayFromList("{{lastKanaName}} {{firstKanaNameMale}}");

        public Object femaleKanaNameFormats =
                ZVal.arrayFromList("{{lastKanaName}} {{firstKanaNameFemale}}");

        public Object firstKanaNameMale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u30A2\u30AD\u30E9",
                                    "\u30A2\u30C4\u30B7",
                                    "\u30AA\u30B5\u30E0",
                                    "\u30AB\u30BA\u30E4",
                                    "\u30AD\u30E7\u30A6\u30B9\u30B1",
                                    "\u30B1\u30F3\u30A4\u30C1",
                                    "\u30B7\u30E5\u30A6\u30D8\u30A4",
                                    "\u30B7\u30E7\u30A6\u30BF",
                                    "\u30B8\u30E5\u30F3",
                                    "\u30BD\u30A6\u30BF\u30ED\u30A6",
                                    "\u30BF\u30A4\u30C1",
                                    "\u30BF\u30ED\u30A6",
                                    "\u30BF\u30AF\u30DE",
                                    "\u30C4\u30D0\u30B5",
                                    "\u30C8\u30E2\u30E4",
                                    "\u30CA\u30AA\u30AD",
                                    "\u30CA\u30AA\u30C8",
                                    "\u30D2\u30C7\u30AD",
                                    "\u30D2\u30ED\u30B7",
                                    "\u30DE\u30CA\u30D6",
                                    "\u30DF\u30C4\u30EB",
                                    "\u30DF\u30CE\u30EB",
                                    "\u30E6\u30A6\u30AD",
                                    "\u30E6\u30A6\u30BF",
                                    "\u30E4\u30B9\u30D2\u30ED",
                                    "\u30E8\u30A6\u30A4\u30C1",
                                    "\u30E8\u30A6\u30B9\u30B1",
                                    "\u30EA\u30E7\u30A6\u30B9\u30B1",
                                    "\u30EA\u30E7\u30A6\u30D8\u30A4",
                                    "\u30EC\u30A4");
                        });

        public Object firstKanaNameFemale =
                ZVal.arrayFromList(
                        "\u30A2\u30B1\u30DF",
                        "\u30A2\u30B9\u30AB",
                        "\u30AB\u30AA\u30EA",
                        "\u30AB\u30CA",
                        "\u30AF\u30DF\u30B3",
                        "\u30B5\u30E6\u30EA",
                        "\u30B5\u30C8\u30DF",
                        "\u30C1\u30E8",
                        "\u30CA\u30AA\u30B3",
                        "\u30CA\u30CA\u30DF",
                        "\u30CF\u30CA\u30B3",
                        "\u30CF\u30EB\u30AB",
                        "\u30DE\u30A2\u30E4",
                        "\u30DE\u30A4",
                        "\u30DF\u30AB\u30B3",
                        "\u30DF\u30AD",
                        "\u30E2\u30E2\u30B3",
                        "\u30E6\u30A4",
                        "\u30E6\u30DF\u30B3",
                        "\u30E8\u30A6\u30B3",
                        "\u30EA\u30AB");

        public Object lastKanaName =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u30A2\u30AA\u30BF",
                                    "\u30A2\u30AA\u30E4\u30DE",
                                    "\u30A4\u30B7\u30C0",
                                    "\u30A4\u30C0\u30AB",
                                    "\u30A4\u30C8\u30A6",
                                    "\u30A6\u30CE",
                                    "\u30A8\u30B3\u30C0",
                                    "\u30AA\u30AA\u30AC\u30AD",
                                    "\u30AB\u30CE\u30A6",
                                    "\u30AB\u30CE\u30A6",
                                    "\u30AD\u30B8\u30DE",
                                    "\u30AD\u30E0\u30E9",
                                    "\u30AD\u30EA\u30E4\u30DE",
                                    "\u30AF\u30C9\u30A6",
                                    "\u30B3\u30A4\u30BA\u30DF",
                                    "\u30B3\u30D0\u30E4\u30B7",
                                    "\u30B3\u30F3\u30C9\u30A6",
                                    "\u30B5\u30A4\u30C8\u30A6",
                                    "\u30B5\u30AB\u30E2\u30C8",
                                    "\u30B5\u30B5\u30AD",
                                    "\u30B5\u30C8\u30A6",
                                    "\u30B5\u30B5\u30C0",
                                    "\u30B9\u30BA\u30AD",
                                    "\u30B9\u30AE\u30E4\u30DE",
                                    "\u30BF\u30AB\u30CF\u30B7",
                                    "\u30BF\u30CA\u30AB",
                                    "\u30BF\u30CA\u30D9",
                                    "\u30C4\u30C0",
                                    "\u30CA\u30AB\u30B8\u30DE",
                                    "\u30CA\u30AB\u30E0\u30E9",
                                    "\u30CA\u30AE\u30B5",
                                    "\u30CA\u30AB\u30C4\u30AC\u30EF",
                                    "\u30CB\u30B7\u30CE\u30BD\u30CE",
                                    "\u30CE\u30E0\u30E9",
                                    "\u30CF\u30E9\u30C0",
                                    "\u30CF\u30DE\u30C0",
                                    "\u30D2\u30ED\u30AB\u30EF",
                                    "\u30D5\u30B8\u30E2\u30C8",
                                    "\u30DE\u30C4\u30E2\u30C8",
                                    "\u30DF\u30E4\u30B1",
                                    "\u30DF\u30E4\u30B6\u30EF",
                                    "\u30E0\u30E9\u30E4\u30DE",
                                    "\u30E4\u30DE\u30AE\u30B7",
                                    "\u30E4\u30DE\u30B0\u30C1",
                                    "\u30E4\u30DE\u30C0",
                                    "\u30E4\u30DE\u30E2\u30C8",
                                    "\u30E8\u30B7\u30C0",
                                    "\u30E8\u30B7\u30E2\u30C8",
                                    "\u30EF\u30AB\u30DE\u30C4",
                                    "\u30EF\u30BF\u30CA\u30D9");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\ja_JP\\Person")
                    .setLookup(
                            Person.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "femaleKanaNameFormats",
                            "femaleNameFormats",
                            "firstKanaNameFemale",
                            "firstKanaNameFormat",
                            "firstKanaNameMale",
                            "firstNameFemale",
                            "firstNameMale",
                            "lastKanaName",
                            "lastName",
                            "maleKanaNameFormats",
                            "maleNameFormats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/ja_JP/Person.php")
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
