package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.ru_RU.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/ru_RU/Person.php

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
    public Object middleNameMale(RuntimeEnv env, Object... args) {
        return ZVal.assign(
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
                                                                .ru_RU
                                                                .classes
                                                                .Person
                                                                .RequestStaticProperties
                                                                .class,
                                                        "middleNameMale")))
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
                                                        .Person
                                                        .RequestStaticProperties
                                                        .class)
                                        .middleNameMale)
                        .value());
    }

    @ConvertedMethod
    public Object middleNameFemale(RuntimeEnv env, Object... args) {
        return ZVal.assign(
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
                                                                .ru_RU
                                                                .classes
                                                                .Person
                                                                .RequestStaticProperties
                                                                .class,
                                                        "middleNameFemale")))
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
                                                        .Person
                                                        .RequestStaticProperties
                                                        .class)
                                        .middleNameFemale)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "gender",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object middleName(RuntimeEnv env, Object... args) {
        Object gender = assignParameter(args, 0, true);
        if (null == gender) {
            gender = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(
                gender,
                "===",
                ClassConstantUtils.getConstantValueLateStatic(env, this, "GENDER_MALE"))) {
            return ZVal.assign(this.middleNameMale(env));

        } else if (ZVal.strictEqualityCheck(
                gender,
                "===",
                ClassConstantUtils.getConstantValueLateStatic(env, this, "GENDER_FEMALE"))) {
            return ZVal.assign(this.middleNameFemale(env));
        }

        return ZVal.assign(
                this.middleName(
                        env,
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
                                .method("randomElement")
                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                .call(
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        ClassConstantUtils
                                                                .getConstantValueLateStatic(
                                                                        env, this, "GENDER_MALE")),
                                                new ZPair(
                                                        1,
                                                        ClassConstantUtils
                                                                .getConstantValueLateStatic(
                                                                        env,
                                                                        this,
                                                                        "GENDER_FEMALE"))))
                                .value()));
    }

    public static final Object CONST_class = "Faker\\Provider\\ru_RU\\Person";

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
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object maleNameFormats =
                ZVal.arrayFromList(
                        "{{firstNameMale}} {{middleNameMale}} {{lastName}}",
                        "{{lastName}} {{firstNameMale}} {{middleNameMale}}");

        public Object femaleNameFormats =
                ZVal.arrayFromList(
                        "{{firstNameFemale}} {{middleNameFemale}} {{lastName}}\u0430",
                        "{{lastName}}\u0430 {{firstNameFemale}} {{middleNameFemale}}");

        public Object firstNameMale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u0410\u0431\u0440\u0430\u043C",
                                    "\u0410\u0432\u0433\u0443\u0441\u0442",
                                    "\u0410\u0434\u0430\u043C",
                                    "\u0410\u0434\u0440\u0438\u0430\u043D",
                                    "\u0410\u043A\u0438\u043C",
                                    "\u0410\u043B\u0435\u043A\u0441\u0430\u043D\u0434\u0440",
                                    "\u0410\u043B\u0435\u043A\u0441\u0435\u0439",
                                    "\u0410\u043B\u044C\u0431\u0435\u0440\u0442",
                                    "\u0410\u043D\u0430\u043D\u0438\u0439",
                                    "\u0410\u043D\u0430\u0442\u043E\u043B\u0438\u0439",
                                    "\u0410\u043D\u0434\u0440\u0435\u0439",
                                    "\u0410\u043D\u0442\u043E\u043D",
                                    "\u0410\u043D\u0442\u043E\u043D\u0438\u043D",
                                    "\u0410\u043F\u043E\u043B\u043B\u043E\u043D",
                                    "\u0410\u0440\u043A\u0430\u0434\u0438\u0439",
                                    "\u0410\u0440\u0441\u0435\u043D\u0438\u0439",
                                    "\u0410\u0440\u0442\u0435\u043C\u0438\u0439",
                                    "\u0410\u0440\u0442\u0443\u0440",
                                    "\u0410\u0440\u0442\u0451\u043C",
                                    "\u0410\u0444\u0430\u043D\u0430\u0441\u0438\u0439",
                                    "\u0411\u043E\u0433\u0434\u0430\u043D",
                                    "\u0411\u043E\u043B\u0435\u0441\u043B\u0430\u0432",
                                    "\u0411\u043E\u0440\u0438\u0441",
                                    "\u0411\u0440\u043E\u043D\u0438\u0441\u043B\u0430\u0432",
                                    "\u0412\u0430\u0434\u0438\u043C",
                                    "\u0412\u0430\u043B\u0435\u043D\u0442\u0438\u043D",
                                    "\u0412\u0430\u043B\u0435\u0440\u0438\u0430\u043D",
                                    "\u0412\u0430\u043B\u0435\u0440\u0438\u0439",
                                    "\u0412\u0430\u0441\u0438\u043B\u0438\u0439",
                                    "\u0412\u0435\u043D\u0438\u0430\u043C\u0438\u043D",
                                    "\u0412\u0438\u043A\u0435\u043D\u0442\u0438\u0439",
                                    "\u0412\u0438\u043A\u0442\u043E\u0440",
                                    "\u0412\u0438\u043B\u044C",
                                    "\u0412\u0438\u0442\u0430\u043B\u0438\u0439",
                                    "\u0412\u0438\u0442\u043E\u043B\u044C\u0434",
                                    "\u0412\u043B\u0430\u0434",
                                    "\u0412\u043B\u0430\u0434\u0438\u043C\u0438\u0440",
                                    "\u0412\u043B\u0430\u0434\u0438\u0441\u043B\u0430\u0432",
                                    "\u0412\u043B\u0430\u0434\u043B\u0435\u043D",
                                    "\u0412\u0441\u0435\u0432\u043E\u043B\u043E\u0434",
                                    "\u0412\u044F\u0447\u0435\u0441\u043B\u0430\u0432",
                                    "\u0413\u0430\u0432\u0440\u0438\u0438\u043B",
                                    "\u0413\u0430\u0440\u0440\u0438",
                                    "\u0413\u0435\u043D\u043D\u0430\u0434\u0438\u0439",
                                    "\u0413\u0435\u043E\u0440\u0433\u0438\u0439",
                                    "\u0413\u0435\u0440\u0430\u0441\u0438\u043C",
                                    "\u0413\u0435\u0440\u043C\u0430\u043D",
                                    "\u0413\u043B\u0435\u0431",
                                    "\u0413\u043E\u0440\u0434\u0435\u0439",
                                    "\u0413\u0440\u0438\u0433\u043E\u0440\u0438\u0439",
                                    "\u0414\u0430\u0432\u0438\u0434",
                                    "\u0414\u0430\u043D",
                                    "\u0414\u0430\u043D\u0438\u0438\u043B",
                                    "\u0414\u0430\u043D\u0438\u043B\u0430",
                                    "\u0414\u0435\u043D\u0438\u0441",
                                    "\u0414\u043C\u0438\u0442\u0440\u0438\u0439",
                                    "\u0414\u043E\u0431\u0440\u044B\u043D\u044F",
                                    "\u0414\u043E\u043D\u0430\u0442",
                                    "\u0415\u0432\u0433\u0435\u043D\u0438\u0439",
                                    "\u0415\u0433\u043E\u0440",
                                    "\u0415\u0444\u0438\u043C",
                                    "\u0417\u0430\u0445\u0430\u0440",
                                    "\u0418\u0432\u0430\u043D",
                                    "\u0418\u0433\u043D\u0430\u0442",
                                    "\u0418\u0433\u043D\u0430\u0442\u0438\u0439",
                                    "\u0418\u0433\u043E\u0440\u044C",
                                    "\u0418\u043B\u043B\u0430\u0440\u0438\u043E\u043D",
                                    "\u0418\u043B\u044C\u044F",
                                    "\u0418\u043C\u043C\u0430\u043D\u0443\u0438\u043B",
                                    "\u0418\u043D\u043D\u043E\u043A\u0435\u043D\u0442\u0438\u0439",
                                    "\u0418\u043E\u0441\u0438\u0444",
                                    "\u0418\u0440\u0430\u043A\u043B\u0438\u0439",
                                    "\u041A\u0438\u0440\u0438\u043B\u043B",
                                    "\u041A\u043B\u0438\u043C",
                                    "\u041A\u043E\u043D\u0441\u0442\u0430\u043D\u0442\u0438\u043D",
                                    "\u041A\u0443\u0437\u044C\u043C\u0430",
                                    "\u041B\u0430\u0432\u0440\u0435\u043D\u0442\u0438\u0439",
                                    "\u041B\u0435\u0432",
                                    "\u041B\u0435\u043E\u043D\u0438\u0434",
                                    "\u041C\u0430\u043A\u0430\u0440",
                                    "\u041C\u0430\u043A\u0441\u0438\u043C",
                                    "\u041C\u0430\u0440\u0430\u0442",
                                    "\u041C\u0430\u0440\u043A",
                                    "\u041C\u0430\u0442\u0432\u0435\u0439",
                                    "\u041C\u0438\u043B\u0430\u043D",
                                    "\u041C\u0438\u0440\u043E\u0441\u043B\u0430\u0432",
                                    "\u041C\u0438\u0445\u0430\u0438\u043B",
                                    "\u041D\u0430\u0437\u0430\u0440",
                                    "\u041D\u0435\u0441\u0442\u043E\u0440",
                                    "\u041D\u0438\u043A\u0438\u0442\u0430",
                                    "\u041D\u0438\u043A\u043E\u0434\u0438\u043C",
                                    "\u041D\u0438\u043A\u043E\u043B\u0430\u0439",
                                    "\u041E\u043B\u0435\u0433",
                                    "\u041F\u0430\u0432\u0435\u043B",
                                    "\u041F\u043B\u0430\u0442\u043E\u043D",
                                    "\u041F\u0440\u043E\u0445\u043E\u0440",
                                    "\u041F\u0451\u0442\u0440",
                                    "\u0420\u0430\u0434\u0438\u0441\u043B\u0430\u0432",
                                    "\u0420\u0430\u0444\u0430\u0438\u043B",
                                    "\u0420\u043E\u0431\u0435\u0440\u0442",
                                    "\u0420\u043E\u0434\u0438\u043E\u043D",
                                    "\u0420\u043E\u043C\u0430\u043D",
                                    "\u0420\u043E\u0441\u0442\u0438\u0441\u043B\u0430\u0432",
                                    "\u0420\u0443\u0441\u043B\u0430\u043D",
                                    "\u0421\u0430\u0432\u0430",
                                    "\u0421\u0430\u0432\u0432\u0430",
                                    "\u0421\u0432\u044F\u0442\u043E\u0441\u043B\u0430\u0432",
                                    "\u0421\u0435\u043C\u0451\u043D",
                                    "\u0421\u0435\u0440\u0433\u0435\u0439",
                                    "\u0421\u043F\u0430\u0440\u0442\u0430\u043A",
                                    "\u0421\u0442\u0430\u043D\u0438\u0441\u043B\u0430\u0432",
                                    "\u0421\u0442\u0435\u043F\u0430\u043D",
                                    "\u0421\u0442\u0435\u0444\u0430\u043D",
                                    "\u0422\u0430\u0440\u0430\u0441",
                                    "\u0422\u0438\u043C\u043E\u0444\u0435\u0439",
                                    "\u0422\u0438\u043C\u0443\u0440",
                                    "\u0422\u0438\u0442",
                                    "\u0422\u0440\u043E\u0444\u0438\u043C",
                                    "\u0424\u0435\u043B\u0438\u043A\u0441",
                                    "\u0424\u0438\u043B\u0438\u043F\u043F",
                                    "\u0424\u0451\u0434\u043E\u0440",
                                    "\u042D\u0434\u0443\u0430\u0440\u0434",
                                    "\u042D\u0440\u0438\u043A",
                                    "\u042E\u043B\u0438\u0430\u043D",
                                    "\u042E\u043B\u0438\u0439",
                                    "\u042E\u0440\u0438\u0439",
                                    "\u042F\u043A\u043E\u0432",
                                    "\u042F\u043D",
                                    "\u042F\u0440\u043E\u0441\u043B\u0430\u0432",
                                    "\u041C\u0438\u043B\u0430\u043D");
                        });

        public Object firstNameFemale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u0410\u043B\u0435\u043A\u0441\u0430\u043D\u0434\u0440\u0430",
                                    "\u0410\u043B\u0438\u043D\u0430",
                                    "\u0410\u043B\u0438\u0441\u0430",
                                    "\u0410\u043B\u043B\u0430",
                                    "\u0410\u043B\u044C\u0431\u0438\u043D\u0430",
                                    "\u0410\u043B\u0451\u043D\u0430",
                                    "\u0410\u043D\u0430\u0441\u0442\u0430\u0441\u0438\u044F",
                                    "\u0410\u043D\u0436\u0435\u043B\u0438\u043A\u0430",
                                    "\u0410\u043D\u043D\u0430",
                                    "\u0410\u043D\u0442\u043E\u043D\u0438\u043D\u0430",
                                    "\u0410\u043D\u0444\u0438\u0441\u0430",
                                    "\u0412\u0430\u043B\u0435\u043D\u0442\u0438\u043D\u0430",
                                    "\u0412\u0430\u043B\u0435\u0440\u0438\u044F",
                                    "\u0412\u0430\u0440\u0432\u0430\u0440\u0430",
                                    "\u0412\u0430\u0441\u0438\u043B\u0438\u0441\u0430",
                                    "\u0412\u0435\u0440\u0430",
                                    "\u0412\u0435\u0440\u043E\u043D\u0438\u043A\u0430",
                                    "\u0412\u0438\u043A\u0442\u043E\u0440\u0438\u044F",
                                    "\u0412\u043B\u0430\u0434\u043B\u0435\u043D\u0430",
                                    "\u0413\u0430\u043B\u0438\u043D\u0430",
                                    "\u0414\u0430\u0440\u044C\u044F",
                                    "\u0414\u0438\u0430\u043D\u0430",
                                    "\u0414\u0438\u043D\u0430",
                                    "\u0414\u043E\u043C\u0438\u043D\u0438\u043A\u0430",
                                    "\u0415\u0432\u0430",
                                    "\u0415\u0432\u0433\u0435\u043D\u0438\u044F",
                                    "\u0415\u043A\u0430\u0442\u0435\u0440\u0438\u043D\u0430",
                                    "\u0415\u043B\u0435\u043D\u0430",
                                    "\u0415\u043B\u0438\u0437\u0430\u0432\u0435\u0442\u0430",
                                    "\u0416\u0430\u043D\u043D\u0430",
                                    "\u0417\u0438\u043D\u0430\u0438\u0434\u0430",
                                    "\u0417\u043B\u0430\u0442\u0430",
                                    "\u0417\u043E\u044F",
                                    "\u0418\u0437\u0430\u0431\u0435\u043B\u043B\u0430",
                                    "\u0418\u0437\u043E\u043B\u044C\u0434\u0430",
                                    "\u0418\u043D\u0433\u0430",
                                    "\u0418\u043D\u0435\u0441\u0441\u0430",
                                    "\u0418\u043D\u043D\u0430",
                                    "\u0418\u0440\u0438\u043D\u0430",
                                    "\u0418\u0441\u043A\u0440\u0430",
                                    "\u041A\u0430\u043F\u0438\u0442\u043E\u043B\u0438\u043D\u0430",
                                    "\u041A\u043B\u0430\u0432\u0434\u0438\u044F",
                                    "\u041A\u043B\u0430\u0440\u0430",
                                    "\u041A\u043B\u0435\u043C\u0435\u043D\u0442\u0438\u043D\u0430",
                                    "\u041A\u0440\u0438\u0441\u0442\u0438\u043D\u0430",
                                    "\u041A\u0441\u0435\u043D\u0438\u044F",
                                    "\u041B\u0430\u0434\u0430",
                                    "\u041B\u0430\u0440\u0438\u0441\u0430",
                                    "\u041B\u0438\u0434\u0438\u044F",
                                    "\u041B\u0438\u043B\u0438\u044F",
                                    "\u041B\u044E\u0431\u043E\u0432\u044C",
                                    "\u041B\u044E\u0434\u043C\u0438\u043B\u0430",
                                    "\u041B\u044E\u0441\u044F",
                                    "\u041C\u0430\u0439\u044F",
                                    "\u041C\u0430\u043B\u044C\u0432\u0438\u043D\u0430",
                                    "\u041C\u0430\u0440\u0433\u0430\u0440\u0438\u0442\u0430",
                                    "\u041C\u0430\u0440\u0438\u043D\u0430",
                                    "\u041C\u0430\u0440\u0438\u044F",
                                    "\u041C\u0430\u0440\u0442\u0430",
                                    "\u041D\u0430\u0434\u0435\u0436\u0434\u0430",
                                    "\u041D\u0430\u0442\u0430\u043B\u044C\u044F",
                                    "\u041D\u0435\u043B\u043B\u0438",
                                    "\u041D\u0438\u043A\u0430",
                                    "\u041D\u0438\u043D\u0430",
                                    "\u041D\u043E\u043D\u043D\u0430",
                                    "\u041E\u043A\u0441\u0430\u043D\u0430",
                                    "\u041E\u043B\u0435\u0441\u044F",
                                    "\u041E\u043B\u044C\u0433\u0430",
                                    "\u041F\u043E\u043B\u0438\u043D\u0430",
                                    "\u0420\u0430\u0434\u0430",
                                    "\u0420\u0430\u0438\u0441\u0430",
                                    "\u0420\u0435\u0433\u0438\u043D\u0430",
                                    "\u0420\u0435\u043D\u0430\u0442\u0430",
                                    "\u0420\u043E\u0437\u0430\u043B\u0438\u043D\u0430",
                                    "\u0421\u0432\u0435\u0442\u043B\u0430\u043D\u0430",
                                    "\u0421\u043E\u0444\u044C\u044F",
                                    "\u0421\u043E\u0444\u0438\u044F",
                                    "\u0422\u0430\u0438\u0441\u0438\u044F",
                                    "\u0422\u0430\u043C\u0430\u0440\u0430",
                                    "\u0422\u0430\u0442\u044C\u044F\u043D\u0430",
                                    "\u0423\u043B\u044C\u044F\u043D\u0430",
                                    "\u0424\u0430\u0438\u043D\u0430",
                                    "\u0424\u0435\u0434\u043E\u0441\u044C\u044F",
                                    "\u0424\u043B\u043E\u0440\u0435\u043D\u0442\u0438\u043D\u0430",
                                    "\u042D\u043B\u044C\u0432\u0438\u0440\u0430",
                                    "\u042D\u043C\u0438\u043B\u0438\u044F",
                                    "\u042D\u043C\u043C\u0430",
                                    "\u042E\u043B\u0438\u044F",
                                    "\u042F\u043D\u0430",
                                    "\u042F\u0440\u043E\u0441\u043B\u0430\u0432\u0430");
                        });

        public Object middleNameMale =
                ZVal.arrayFromList(
                        "\u0410\u043B\u0435\u043A\u0441\u0430\u043D\u0434\u0440\u043E\u0432\u0438\u0447",
                        "\u0410\u043B\u0435\u043A\u0441\u0435\u0435\u0432\u0438\u0447",
                        "\u0410\u043D\u0434\u0440\u0435\u0435\u0432\u0438\u0447",
                        "\u0414\u043C\u0438\u0442\u0440\u0438\u0435\u0432\u0438\u0447",
                        "\u0415\u0432\u0433\u0435\u043D\u044C\u0435\u0432\u0438\u0447",
                        "\u0421\u0435\u0440\u0433\u0435\u0435\u0432\u0438\u0447",
                        "\u0418\u0432\u0430\u043D\u043E\u0432\u0438\u0447",
                        "\u0424\u0451\u0434\u043E\u0440\u043E\u0432\u0438\u0447",
                        "\u041B\u044C\u0432\u043E\u0432\u0438\u0447",
                        "\u0420\u043E\u043C\u0430\u043D\u043E\u0432\u0438\u0447",
                        "\u0412\u043B\u0430\u0434\u0438\u043C\u0438\u0440\u043E\u0432\u0438\u0447",
                        "\u0411\u043E\u0440\u0438\u0441\u043E\u0432\u0438\u0447",
                        "\u041C\u0430\u043A\u0441\u0438\u043C\u043E\u0432\u0438\u0447");

        public Object middleNameFemale =
                ZVal.arrayFromList(
                        "\u0410\u043B\u0435\u043A\u0441\u0430\u043D\u0434\u0440\u043E\u0432\u043D\u0430",
                        "\u0410\u043B\u0435\u043A\u0441\u0435\u0435\u0432\u043D\u0430",
                        "\u0410\u043D\u0434\u0440\u0435\u0435\u0432\u043D\u0430",
                        "\u0414\u043C\u0438\u0442\u0440\u0438\u0435\u0432\u043D\u0430",
                        "\u0415\u0432\u0433\u0435\u043D\u044C\u0435\u0432\u043D\u0430",
                        "\u0421\u0435\u0440\u0433\u0435\u0435\u0432\u043D\u0430",
                        "\u0418\u0432\u0430\u043D\u043E\u0432\u043D\u0430",
                        "\u0424\u0451\u0434\u043E\u0440\u043E\u0432\u043D\u0430",
                        "\u041B\u044C\u0432\u043E\u0432\u043D\u0430",
                        "\u0420\u043E\u043C\u0430\u043D\u043E\u0432\u043D\u0430",
                        "\u0412\u043B\u0430\u0434\u0438\u043C\u0438\u0440\u043E\u0432\u043D\u0430",
                        "\u0411\u043E\u0440\u0438\u0441\u043E\u0432\u043D\u0430",
                        "\u041C\u0430\u043A\u0441\u0438\u043C\u043E\u0432\u043D\u0430");

        public Object lastName =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u0421\u043C\u0438\u0440\u043D\u043E\u0432",
                                    "\u0418\u0432\u0430\u043D\u043E\u0432",
                                    "\u041A\u0443\u0437\u043D\u0435\u0446\u043E\u0432",
                                    "\u0421\u043E\u043A\u043E\u043B\u043E\u0432",
                                    "\u041F\u043E\u043F\u043E\u0432",
                                    "\u041B\u0435\u0431\u0435\u0434\u0435\u0432",
                                    "\u041A\u043E\u0437\u043B\u043E\u0432",
                                    "\u041D\u043E\u0432\u0438\u043A\u043E\u0432",
                                    "\u041C\u043E\u0440\u043E\u0437\u043E\u0432",
                                    "\u041F\u0435\u0442\u0440\u043E\u0432",
                                    "\u0412\u043E\u043B\u043A\u043E\u0432",
                                    "\u0421\u043E\u043B\u043E\u0432\u044C\u0451\u0432",
                                    "\u0412\u0430\u0441\u0438\u043B\u044C\u0435\u0432",
                                    "\u0417\u0430\u0439\u0446\u0435\u0432",
                                    "\u041F\u0430\u0432\u043B\u043E\u0432",
                                    "\u0421\u0435\u043C\u0451\u043D\u043E\u0432",
                                    "\u0413\u043E\u043B\u0443\u0431\u0435\u0432",
                                    "\u0412\u0438\u043D\u043E\u0433\u0440\u0430\u0434\u043E\u0432",
                                    "\u0411\u043E\u0433\u0434\u0430\u043D\u043E\u0432",
                                    "\u0412\u043E\u0440\u043E\u0431\u044C\u0451\u0432",
                                    "\u0424\u0451\u0434\u043E\u0440\u043E\u0432",
                                    "\u041C\u0438\u0445\u0430\u0439\u043B\u043E\u0432",
                                    "\u0411\u0435\u043B\u044F\u0435\u0432",
                                    "\u0422\u0430\u0440\u0430\u0441\u043E\u0432",
                                    "\u0411\u0435\u043B\u043E\u0432",
                                    "\u041A\u043E\u043C\u0430\u0440\u043E\u0432",
                                    "\u041E\u0440\u043B\u043E\u0432",
                                    "\u041A\u0438\u0441\u0435\u043B\u0451\u0432",
                                    "\u041C\u0430\u043A\u0430\u0440\u043E\u0432",
                                    "\u0410\u043D\u0434\u0440\u0435\u0435\u0432",
                                    "\u041A\u043E\u0432\u0430\u043B\u0451\u0432",
                                    "\u0418\u043B\u044C\u0438\u043D",
                                    "\u0413\u0443\u0441\u0435\u0432",
                                    "\u0422\u0438\u0442\u043E\u0432",
                                    "\u041A\u0443\u0437\u044C\u043C\u0438\u043D",
                                    "\u041A\u0443\u0434\u0440\u044F\u0432\u0446\u0435\u0432",
                                    "\u0411\u0430\u0440\u0430\u043D\u043E\u0432",
                                    "\u041A\u0443\u043B\u0438\u043A\u043E\u0432",
                                    "\u0410\u043B\u0435\u043A\u0441\u0435\u0435\u0432",
                                    "\u0421\u0442\u0435\u043F\u0430\u043D\u043E\u0432",
                                    "\u042F\u043A\u043E\u0432\u043B\u0435\u0432",
                                    "\u0421\u043E\u0440\u043E\u043A\u0438\u043D",
                                    "\u0421\u0435\u0440\u0433\u0435\u0435\u0432",
                                    "\u0420\u043E\u043C\u0430\u043D\u043E\u0432",
                                    "\u0417\u0430\u0445\u0430\u0440\u043E\u0432",
                                    "\u0411\u043E\u0440\u0438\u0441\u043E\u0432",
                                    "\u041A\u043E\u0440\u043E\u043B\u0451\u0432",
                                    "\u0413\u0435\u0440\u0430\u0441\u0438\u043C\u043E\u0432",
                                    "\u041F\u043E\u043D\u043E\u043C\u0430\u0440\u0451\u0432",
                                    "\u0413\u0440\u0438\u0433\u043E\u0440\u044C\u0435\u0432",
                                    "\u041B\u0430\u0437\u0430\u0440\u0435\u0432",
                                    "\u041C\u0435\u0434\u0432\u0435\u0434\u0435\u0432",
                                    "\u0415\u0440\u0448\u043E\u0432",
                                    "\u041D\u0438\u043A\u0438\u0442\u0438\u043D",
                                    "\u0421\u043E\u0431\u043E\u043B\u0435\u0432",
                                    "\u0420\u044F\u0431\u043E\u0432",
                                    "\u041F\u043E\u043B\u044F\u043A\u043E\u0432",
                                    "\u0426\u0432\u0435\u0442\u043A\u043E\u0432",
                                    "\u0414\u0430\u043D\u0438\u043B\u043E\u0432",
                                    "\u0416\u0443\u043A\u043E\u0432",
                                    "\u0424\u0440\u043E\u043B\u043E\u0432",
                                    "\u0416\u0443\u0440\u0430\u0432\u043B\u0451\u0432",
                                    "\u041D\u0438\u043A\u043E\u043B\u0430\u0435\u0432",
                                    "\u041A\u0440\u044B\u043B\u043E\u0432",
                                    "\u041C\u0430\u043A\u0441\u0438\u043C\u043E\u0432",
                                    "\u0421\u0438\u0434\u043E\u0440\u043E\u0432",
                                    "\u041E\u0441\u0438\u043F\u043E\u0432",
                                    "\u0411\u0435\u043B\u043E\u0443\u0441\u043E\u0432",
                                    "\u0424\u0435\u0434\u043E\u0442\u043E\u0432",
                                    "\u0414\u043E\u0440\u043E\u0444\u0435\u0435\u0432",
                                    "\u0415\u0433\u043E\u0440\u043E\u0432",
                                    "\u041C\u0430\u0442\u0432\u0435\u0435\u0432",
                                    "\u0411\u043E\u0431\u0440\u043E\u0432",
                                    "\u0414\u043C\u0438\u0442\u0440\u0438\u0435\u0432",
                                    "\u041A\u0430\u043B\u0438\u043D\u0438\u043D",
                                    "\u0410\u043D\u0438\u0441\u0438\u043C\u043E\u0432",
                                    "\u041F\u0435\u0442\u0443\u0445\u043E\u0432",
                                    "\u0410\u043D\u0442\u043E\u043D\u043E\u0432",
                                    "\u0422\u0438\u043C\u043E\u0444\u0435\u0435\u0432",
                                    "\u041D\u0438\u043A\u0438\u0444\u043E\u0440\u043E\u0432",
                                    "\u0412\u0435\u0441\u0435\u043B\u043E\u0432",
                                    "\u0424\u0438\u043B\u0438\u043F\u043F\u043E\u0432",
                                    "\u041C\u0430\u0440\u043A\u043E\u0432",
                                    "\u0411\u043E\u043B\u044C\u0448\u0430\u043A\u043E\u0432",
                                    "\u0421\u0443\u0445\u0430\u043D\u043E\u0432",
                                    "\u041C\u0438\u0440\u043E\u043D\u043E\u0432",
                                    "\u0428\u0438\u0440\u044F\u0435\u0432",
                                    "\u0410\u043B\u0435\u043A\u0441\u0430\u043D\u0434\u0440\u043E\u0432",
                                    "\u041A\u043E\u043D\u043E\u0432\u0430\u043B\u043E\u0432",
                                    "\u0428\u0435\u0441\u0442\u0430\u043A\u043E\u0432",
                                    "\u041A\u0430\u0437\u0430\u043A\u043E\u0432",
                                    "\u0415\u0444\u0438\u043C\u043E\u0432",
                                    "\u0414\u0435\u043D\u0438\u0441\u043E\u0432",
                                    "\u0413\u0440\u043E\u043C\u043E\u0432",
                                    "\u0424\u043E\u043C\u0438\u043D",
                                    "\u0414\u0430\u0432\u044B\u0434\u043E\u0432",
                                    "\u041C\u0435\u043B\u044C\u043D\u0438\u043A\u043E\u0432",
                                    "\u0429\u0435\u0440\u0431\u0430\u043A\u043E\u0432",
                                    "\u0411\u043B\u0438\u043D\u043E\u0432",
                                    "\u041A\u043E\u043B\u0435\u0441\u043D\u0438\u043A\u043E\u0432",
                                    "\u041A\u0430\u0440\u043F\u043E\u0432",
                                    "\u0410\u0444\u0430\u043D\u0430\u0441\u044C\u0435\u0432",
                                    "\u0412\u043B\u0430\u0441\u043E\u0432",
                                    "\u041C\u0430\u0441\u043B\u043E\u0432",
                                    "\u0418\u0441\u0430\u043A\u043E\u0432",
                                    "\u0422\u0438\u0445\u043E\u043D\u043E\u0432",
                                    "\u0410\u043A\u0441\u0451\u043D\u043E\u0432",
                                    "\u0413\u0430\u0432\u0440\u0438\u043B\u043E\u0432",
                                    "\u0420\u043E\u0434\u0438\u043E\u043D\u043E\u0432",
                                    "\u041A\u043E\u0442\u043E\u0432",
                                    "\u0413\u043E\u0440\u0431\u0443\u043D\u043E\u0432",
                                    "\u041A\u0443\u0434\u0440\u044F\u0448\u043E\u0432",
                                    "\u0411\u044B\u043A\u043E\u0432",
                                    "\u0417\u0443\u0435\u0432",
                                    "\u0422\u0440\u0435\u0442\u044C\u044F\u043A\u043E\u0432",
                                    "\u0421\u0430\u0432\u0435\u043B\u044C\u0435\u0432",
                                    "\u041F\u0430\u043D\u043E\u0432",
                                    "\u0420\u044B\u0431\u0430\u043A\u043E\u0432",
                                    "\u0421\u0443\u0432\u043E\u0440\u043E\u0432",
                                    "\u0410\u0431\u0440\u0430\u043C\u043E\u0432",
                                    "\u0412\u043E\u0440\u043E\u043D\u043E\u0432",
                                    "\u041C\u0443\u0445\u0438\u043D",
                                    "\u0410\u0440\u0445\u0438\u043F\u043E\u0432",
                                    "\u0422\u0440\u043E\u0444\u0438\u043C\u043E\u0432",
                                    "\u041C\u0430\u0440\u0442\u044B\u043D\u043E\u0432",
                                    "\u0415\u043C\u0435\u043B\u044C\u044F\u043D\u043E\u0432",
                                    "\u0413\u043E\u0440\u0448\u043A\u043E\u0432",
                                    "\u0427\u0435\u0440\u043D\u043E\u0432",
                                    "\u041E\u0432\u0447\u0438\u043D\u043D\u0438\u043A\u043E\u0432",
                                    "\u0421\u0435\u043B\u0435\u0437\u043D\u0451\u0432",
                                    "\u041F\u0430\u043D\u0444\u0438\u043B\u043E\u0432",
                                    "\u041A\u043E\u043F\u044B\u043B\u043E\u0432",
                                    "\u041C\u0438\u0445\u0435\u0435\u0432",
                                    "\u0413\u0430\u043B\u043A\u0438\u043D",
                                    "\u041D\u0430\u0437\u0430\u0440\u043E\u0432",
                                    "\u041B\u043E\u0431\u0430\u043D\u043E\u0432",
                                    "\u041B\u0443\u043A\u0438\u043D",
                                    "\u0411\u0435\u043B\u044F\u043A\u043E\u0432",
                                    "\u041F\u043E\u0442\u0430\u043F\u043E\u0432",
                                    "\u041D\u0435\u043A\u0440\u0430\u0441\u043E\u0432",
                                    "\u0425\u043E\u0445\u043B\u043E\u0432",
                                    "\u0416\u0434\u0430\u043D\u043E\u0432",
                                    "\u041D\u0430\u0443\u043C\u043E\u0432",
                                    "\u0428\u0438\u043B\u043E\u0432",
                                    "\u0412\u043E\u0440\u043E\u043D\u0446\u043E\u0432",
                                    "\u0415\u0440\u043C\u0430\u043A\u043E\u0432",
                                    "\u0414\u0440\u043E\u0437\u0434\u043E\u0432",
                                    "\u0418\u0433\u043D\u0430\u0442\u044C\u0435\u0432",
                                    "\u0421\u0430\u0432\u0438\u043D",
                                    "\u041B\u043E\u0433\u0438\u043D\u043E\u0432",
                                    "\u0421\u0430\u0444\u043E\u043D\u043E\u0432",
                                    "\u041A\u0430\u043F\u0443\u0441\u0442\u0438\u043D",
                                    "\u041A\u0438\u0440\u0438\u043B\u043B\u043E\u0432",
                                    "\u041C\u043E\u0438\u0441\u0435\u0435\u0432",
                                    "\u0415\u043B\u0438\u0441\u0435\u0435\u0432",
                                    "\u041A\u043E\u0448\u0435\u043B\u0435\u0432",
                                    "\u041A\u043E\u0441\u0442\u0438\u043D",
                                    "\u0413\u043E\u0440\u0431\u0430\u0447\u0451\u0432",
                                    "\u041E\u0440\u0435\u0445\u043E\u0432",
                                    "\u0415\u0444\u0440\u0435\u043C\u043E\u0432",
                                    "\u0418\u0441\u0430\u0435\u0432",
                                    "\u0415\u0432\u0434\u043E\u043A\u0438\u043C\u043E\u0432",
                                    "\u041A\u0430\u043B\u0430\u0448\u043D\u0438\u043A\u043E\u0432",
                                    "\u041A\u0430\u0431\u0430\u043D\u043E\u0432",
                                    "\u041D\u043E\u0441\u043A\u043E\u0432",
                                    "\u042E\u0434\u0438\u043D",
                                    "\u041A\u0443\u043B\u0430\u0433\u0438\u043D",
                                    "\u041B\u0430\u043F\u0438\u043D",
                                    "\u041F\u0440\u043E\u0445\u043E\u0440\u043E\u0432",
                                    "\u041D\u0435\u0441\u0442\u0435\u0440\u043E\u0432",
                                    "\u0425\u0430\u0440\u0438\u0442\u043E\u043D\u043E\u0432",
                                    "\u0410\u0433\u0430\u0444\u043E\u043D\u043E\u0432",
                                    "\u041C\u0443\u0440\u0430\u0432\u044C\u0451\u0432",
                                    "\u041B\u0430\u0440\u0438\u043E\u043D\u043E\u0432",
                                    "\u0424\u0435\u0434\u043E\u0441\u0435\u0435\u0432",
                                    "\u0417\u0438\u043C\u0438\u043D",
                                    "\u041F\u0430\u0445\u043E\u043C\u043E\u0432",
                                    "\u0428\u0443\u0431\u0438\u043D",
                                    "\u0418\u0433\u043D\u0430\u0442\u043E\u0432",
                                    "\u0424\u0438\u043B\u0430\u0442\u043E\u0432",
                                    "\u041A\u0440\u044E\u043A\u043E\u0432",
                                    "\u0420\u043E\u0433\u043E\u0432",
                                    "\u041A\u0443\u043B\u0430\u043A\u043E\u0432",
                                    "\u0422\u0435\u0440\u0435\u043D\u0442\u044C\u0435\u0432",
                                    "\u041C\u043E\u043B\u0447\u0430\u043D\u043E\u0432",
                                    "\u0412\u043B\u0430\u0434\u0438\u043C\u0438\u0440\u043E\u0432",
                                    "\u0410\u0440\u0442\u0435\u043C\u044C\u0435\u0432",
                                    "\u0413\u0443\u0440\u044C\u0435\u0432",
                                    "\u0417\u0438\u043D\u043E\u0432\u044C\u0435\u0432",
                                    "\u0413\u0440\u0438\u0448\u0438\u043D",
                                    "\u041A\u043E\u043D\u043E\u043D\u043E\u0432",
                                    "\u0414\u0435\u043C\u0435\u043D\u0442\u044C\u0435\u0432",
                                    "\u0421\u0438\u0442\u043D\u0438\u043A\u043E\u0432",
                                    "\u0421\u0438\u043C\u043E\u043D\u043E\u0432",
                                    "\u041C\u0438\u0448\u0438\u043D",
                                    "\u0424\u0430\u0434\u0435\u0435\u0432",
                                    "\u041A\u043E\u043C\u0438\u0441\u0441\u0430\u0440\u043E\u0432",
                                    "\u041C\u0430\u043C\u043E\u043D\u0442\u043E\u0432",
                                    "\u041D\u043E\u0441\u043E\u0432",
                                    "\u0413\u0443\u043B\u044F\u0435\u0432",
                                    "\u0428\u0430\u0440\u043E\u0432",
                                    "\u0423\u0441\u0442\u0438\u043D\u043E\u0432",
                                    "\u0412\u0438\u0448\u043D\u044F\u043A\u043E\u0432",
                                    "\u0415\u0432\u0441\u0435\u0435\u0432",
                                    "\u041B\u0430\u0432\u0440\u0435\u043D\u0442\u044C\u0435\u0432",
                                    "\u0411\u0440\u0430\u0433\u0438\u043D",
                                    "\u041A\u043E\u043D\u0441\u0442\u0430\u043D\u0442\u0438\u043D\u043E\u0432",
                                    "\u041A\u043E\u0440\u043D\u0438\u043B\u043E\u0432",
                                    "\u0410\u0432\u0434\u0435\u0435\u0432",
                                    "\u0417\u044B\u043A\u043E\u0432",
                                    "\u0411\u0438\u0440\u044E\u043A\u043E\u0432",
                                    "\u0428\u0430\u0440\u0430\u043F\u043E\u0432",
                                    "\u041D\u0438\u043A\u043E\u043D\u043E\u0432",
                                    "\u0429\u0443\u043A\u0438\u043D",
                                    "\u0414\u044C\u044F\u0447\u043A\u043E\u0432",
                                    "\u041E\u0434\u0438\u043D\u0446\u043E\u0432",
                                    "\u0421\u0430\u0437\u043E\u043D\u043E\u0432",
                                    "\u042F\u043A\u0443\u0448\u0435\u0432",
                                    "\u041A\u0440\u0430\u0441\u0438\u043B\u044C\u043D\u0438\u043A\u043E\u0432",
                                    "\u0413\u043E\u0440\u0434\u0435\u0435\u0432",
                                    "\u0421\u0430\u043C\u043E\u0439\u043B\u043E\u0432",
                                    "\u041A\u043D\u044F\u0437\u0435\u0432",
                                    "\u0411\u0435\u0441\u043F\u0430\u043B\u043E\u0432",
                                    "\u0423\u0432\u0430\u0440\u043E\u0432",
                                    "\u0428\u0430\u0448\u043A\u043E\u0432",
                                    "\u0411\u043E\u0431\u044B\u043B\u0451\u0432",
                                    "\u0414\u043E\u0440\u043E\u043D\u0438\u043D",
                                    "\u0411\u0435\u043B\u043E\u0437\u0451\u0440\u043E\u0432",
                                    "\u0420\u043E\u0436\u043A\u043E\u0432",
                                    "\u0421\u0430\u043C\u0441\u043E\u043D\u043E\u0432",
                                    "\u041C\u044F\u0441\u043D\u0438\u043A\u043E\u0432",
                                    "\u041B\u0438\u0445\u0430\u0447\u0451\u0432",
                                    "\u0411\u0443\u0440\u043E\u0432",
                                    "\u0421\u044B\u0441\u043E\u0435\u0432",
                                    "\u0424\u043E\u043C\u0438\u0447\u0451\u0432",
                                    "\u0420\u0443\u0441\u0430\u043A\u043E\u0432",
                                    "\u0421\u0442\u0440\u0435\u043B\u043A\u043E\u0432",
                                    "\u0413\u0443\u0449\u0438\u043D",
                                    "\u0422\u0435\u0442\u0435\u0440\u0438\u043D",
                                    "\u041A\u043E\u043B\u043E\u0431\u043E\u0432",
                                    "\u0421\u0443\u0431\u0431\u043E\u0442\u0438\u043D",
                                    "\u0424\u043E\u043A\u0438\u043D",
                                    "\u0411\u043B\u043E\u0445\u0438\u043D",
                                    "\u0421\u0435\u043B\u0438\u0432\u0435\u0440\u0441\u0442\u043E\u0432",
                                    "\u041F\u0435\u0441\u0442\u043E\u0432",
                                    "\u041A\u043E\u043D\u0434\u0440\u0430\u0442\u044C\u0435\u0432",
                                    "\u0421\u0438\u043B\u0438\u043D",
                                    "\u041C\u0435\u0440\u043A\u0443\u0448\u0435\u0432",
                                    "\u041B\u044B\u0442\u043A\u0438\u043D",
                                    "\u0422\u0443\u0440\u043E\u0432");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\ru_RU\\Person")
                    .setLookup(
                            Person.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "femaleNameFormats",
                            "firstNameFemale",
                            "firstNameMale",
                            "lastName",
                            "maleNameFormats",
                            "middleNameFemale",
                            "middleNameMale")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/ru_RU/Person.php")
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
