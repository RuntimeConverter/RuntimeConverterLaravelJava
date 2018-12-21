package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.kk_KZ.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/kk_KZ/Person.php

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

    public static final Object CONST_GENDER_MALE = 0;

    public static final Object CONST_GENDER_FEMALE = 1;

    public static final Object CONST_CENTURY_19TH = 0;

    public static final Object CONST_CENTURY_20TH = 1;

    public static final Object CONST_CENTURY_21ST = 2;

    public static final Object CONST_MALE_CENTURY_19TH = 1;

    public static final Object CONST_MALE_CENTURY_20TH = 3;

    public static final Object CONST_MALE_CENTURY_21ST = 5;

    public static final Object CONST_FEMALE_CENTURY_19TH = 2;

    public static final Object CONST_FEMALE_CENTURY_20TH = 4;

    public static final Object CONST_FEMALE_CENTURY_21ST = 6;

    public static final Object CONST_class = "Faker\\Provider\\kk_KZ\\Person";

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
        @ConvertedParameter(index = 0, name = "year")
        private Object getCenturyByYear(RuntimeEnv env, Object... args) {
            Object year = assignParameter(args, 0, false);
            if (ZVal.toBool(ZVal.isGreaterThanOrEqualTo(year, ">=", 2000))
                    && ZVal.toBool(
                            ZVal.isLessThanOrEqualTo(
                                    year, "<=", DateTime.runtimeStaticObject.year(env)))) {
                return ZVal.assign(CONST_CENTURY_21ST);

            } else if (ZVal.isGreaterThanOrEqualTo(year, ">=", 1900)) {
                return ZVal.assign(CONST_CENTURY_20TH);

            } else if (ZVal.isGreaterThanOrEqualTo(year, ">=", 1800)) {
                return ZVal.assign(CONST_CENTURY_19TH);
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "birthDate",
            typeHint = "DateTime",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(index = 1, name = "gender")
        public Object individualIdentificationNumber(RuntimeEnv env, Object... args) {
            Object birthDate = assignParameter(args, 0, true);
            if (null == birthDate) {
                birthDate = ZVal.getNull();
            }
            Object gender = assignParameter(args, 1, true);
            if (null == gender) {
                gender = CONST_GENDER_MALE;
            }
            Object century = null;
            Object population = null;
            Object iin = null;
            if (!ZVal.isTrue(birthDate)) {
                birthDate = DateTime.runtimeStaticObject.dateTimeBetween(env);
            }

            population = NamespaceGlobal.mt_rand.env(env).call(1000, 2000).value();
            century =
                    runtimeStaticObject.getCenturyByYear(
                            env,
                            ZVal.toLong(env.callMethod(birthDate, "format", Person.class, "Y")));
            iin = env.callMethod(birthDate, "format", Person.class, "ymd");
            iin =
                    toStringR(iin, env)
                            + toStringR(
                                    toStringR(
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
                                                                    .Person
                                                                    .RequestStaticProperties
                                                                    .class,
                                                            "genderCenturyMap")
                                                    .arrayGet(env, gender, century),
                                            env),
                                    env);
            iin = toStringR(iin, env) + toStringR(toStringR(population, env), env);
            return ZVal.assign(
                    toStringR(iin, env)
                            + toStringR(
                                    toStringR(runtimeStaticObject.checkSum(env, iin), env), env));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "iinValue")
        public Object checkSum(RuntimeEnv env, Object... args) {
            Object iinValue = assignParameter(args, 0, false);
            Object controlDigit = null;
            controlDigit =
                    runtimeStaticObject.getControlDigit(
                            env,
                            iinValue,
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
                                                    .Person
                                                    .RequestStaticProperties
                                                    .class)
                                    .firstSequenceBitWeights);
            if (ZVal.strictEqualityCheck(controlDigit, "===", 10)) {
                return ZVal.assign(
                        runtimeStaticObject.getControlDigit(
                                env,
                                iinValue,
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
                                                        .Person
                                                        .RequestStaticProperties
                                                        .class)
                                        .secondSequenceBitWeights));
            }

            return ZVal.assign(controlDigit);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "iinValue")
        @ConvertedParameter(index = 1, name = "sequence")
        protected Object getControlDigit(RuntimeEnv env, Object... args) {
            ReferenceContainer iinValue =
                    new BasicReferenceContainer(assignParameter(args, 0, false));
            ReferenceContainer sequence =
                    new BasicReferenceContainer(assignParameter(args, 1, false));
            ReferenceContainer i = new BasicReferenceContainer(null);
            Object sum = null;
            sum = 0;
            for (i.setObject(0);
                    ZVal.isLessThanOrEqualTo(i.getObject(), "<=", 10);
                    i.setObject(ZVal.increment(i.getObject()))) {
                sum =
                        ZAssignment.add(
                                "+=",
                                sum,
                                ZVal.multiply(
                                        ZVal.toLong(iinValue.arrayGet(env, i.getObject())),
                                        sequence.arrayGet(env, i.getObject())));
            }

            return ZVal.assign(ZVal.modulus(sum, 11));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object firstSequenceBitWeights =
                ZVal.arrayFromList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

        public Object secondSequenceBitWeights =
                ZVal.arrayFromList(3, 4, 5, 6, 7, 8, 9, 10, 11, 1, 2);

        public Object genderCenturyMap =
                ZVal.newArray(
                        new ZPair(
                                CONST_GENDER_MALE,
                                ZVal.newArray(
                                        new ZPair(CONST_CENTURY_19TH, CONST_MALE_CENTURY_19TH),
                                        new ZPair(CONST_CENTURY_20TH, CONST_MALE_CENTURY_20TH),
                                        new ZPair(CONST_CENTURY_21ST, CONST_MALE_CENTURY_21ST))),
                        new ZPair(
                                CONST_GENDER_FEMALE,
                                ZVal.newArray(
                                        new ZPair(CONST_CENTURY_19TH, CONST_FEMALE_CENTURY_19TH),
                                        new ZPair(CONST_CENTURY_20TH, CONST_FEMALE_CENTURY_20TH),
                                        new ZPair(CONST_CENTURY_21ST, CONST_FEMALE_CENTURY_21ST))));

        public Object maleNameFormats =
                ZVal.arrayFromList("{{lastName}}\u04B1\u043B\u044B {{firstNameMale}}");

        public Object femaleNameFormats =
                ZVal.arrayFromList("{{lastName}}\u049B\u044B\u0437\u044B {{firstNameFemale}}");

        public Object firstNameMale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u0410\u044B\u043B\u0493\u0430\u0437\u044B",
                                    "\u04D8\u0431\u0434\u0456\u049B\u0430\u0434\u044B\u0440",
                                    "\u0411\u0430\u0431\u0430\u0493\u043E\u0436\u0430",
                                    "\u0492\u0430\u0439\u0441\u0430",
                                    "\u0414\u04D9\u043C\u0435\u043D",
                                    "\u0415\u0433\u0456\u0437\u0431\u0435\u043A",
                                    "\u0416\u0430\u0437\u044B\u043B\u0431\u0435\u043A",
                                    "\u0417\u04B1\u043B\u043F\u044B\u049B\u0430\u0440",
                                    "\u0418\u0433\u0456\u0441\u0456\u043D",
                                    "\u041A\u04D9\u0434\u0456\u0440\u0436\u0430\u043D",
                                    "\u049A\u0430\u0434\u044B\u0440\u049B\u0430\u043D",
                                    "\u041B\u0430\u0442\u0438\u0444",
                                    "\u041C\u0430\u0493\u0430\u0437",
                                    "\u041D\u0430\u0440\u043C\u0430\u0493\u0430\u043C\u0431\u0435\u0442",
                                    "\u041E\u04A3\u0430\u043B\u0431\u0430\u0439",
                                    "\u04E8\u043D\u0434\u0456\u0440\u0456\u0441",
                                    "\u041F\u0435\u0440\u0434\u0435\u0431\u0435\u043A",
                                    "\u0420\u0430\u049B\u0430\u0442",
                                    "\u0421\u0430\u0493\u044B\u043D\u0434\u044B\u049B",
                                    "\u0422\u0430\u043D\u0430\u0431\u0430\u0439",
                                    "\u0423\u0430\u0439\u044B\u0441",
                                    "\u04B0\u0439\u044B\u049B\u0431\u0430\u0439",
                                    "\u04AE\u0440\u0456\u043C\u0431\u0430\u0439",
                                    "\u0424\u0430\u0439\u0437\u0440\u0430\u0445\u043C\u0430\u043D",
                                    "\u0425\u0430\u043D\u0433\u0435\u043B\u0434\u0456",
                                    "\u0428\u0430\u0442\u0442\u044B\u049B",
                                    "\u042B\u0441\u0442\u0430\u043C\u0431\u0430\u049B\u044B",
                                    "\u0406\u0431\u043D\u0438");
                        });

        public Object firstNameFemale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u0410\u0441\u044B\u043B\u0442\u0430\u0441",
                                    "\u04D8\u0443\u0436\u0430",
                                    "\u0411\u04AF\u043B\u0434\u0456\u0440\u0448\u0456\u043D",
                                    "\u0413\u04AF\u043B\u0448\u0430\u0448",
                                    "\u0492\u0430\u0444\u0443\u0440\u0430",
                                    "\u0414\u0456\u043B\u0434\u04D9",
                                    "\u0415\u0440\u043A\u0435\u0436\u0430\u043D",
                                    "\u0416\u0456\u0431\u0435\u043A",
                                    "\u0417\u044B\u043B\u0438\u049B\u0430",
                                    "\u0418\u0440\u0430\u0434\u0430",
                                    "\u041A\u04AF\u043D\u0441\u04B1\u043B\u0443",
                                    "\u049A\u044B\u0440\u043C\u044B\u0437\u044B",
                                    "\u041B\u04D9\u0442\u0438\u043F\u0430",
                                    "\u041C\u04AF\u0448\u0442\u04D9\u0440\u0438",
                                    "\u041D\u04B1\u0440\u0448\u0430\u0440\u0430",
                                    "\u041E\u0440\u044B\u043D\u0448\u0430",
                                    "\u04E8\u0440\u0437\u0438\u044F",
                                    "\u041F\u0435\u0440\u0438\u0437\u0430\u0442",
                                    "\u0420\u0443\u0445\u0438\u044F",
                                    "\u0421\u044B\u043D\u0434\u044B\u0431\u0430\u043B\u0430",
                                    "\u0422\u04B1\u0440\u0441\u044B\u043D\u0430\u0439",
                                    "\u0423\u04D9\u0441\u0438\u043C\u0430",
                                    "\u04B0\u0440\u049B\u0438\u044F",
                                    "\u04AE\u0440\u0438\u044F",
                                    "\u0424\u0438\u0440\u0443\u0437\u0430",
                                    "\u0425\u0430\u0444\u0438\u0437\u0430",
                                    "\u0428\u044B\u0440\u044B\u043D\u0433\u04AF\u043B",
                                    "\u042B\u0440\u044B\u0441\u0442\u044B",
                                    "\u0406\u04A3\u043A\u04D9\u0440");
                        });

        public Object lastName =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u0410\u0434\u044B\u0440\u0431\u0430\u0439",
                                    "\u04D8\u0436\u0456\u0431\u0430\u0439",
                                    "\u0411\u0430\u0439\u0431\u04E9\u0440\u0456",
                                    "\u0492\u0438\u0437\u0430\u0442",
                                    "\u0414\u0456\u043B\u0434\u0430\u0431\u0435\u043A",
                                    "\u0415\u0448\u043C\u04B1\u0445\u0430\u043C\u0431\u0435\u0442",
                                    "\u0416\u0456\u0433\u0435\u0440",
                                    "\u0417\u0456\u043A\u0456\u0440\u0438\u044F",
                                    "\u0418\u0441\u0430",
                                    "\u041A\u0443\u043D\u0442\u0443",
                                    "\u049A\u044B\u0434\u044B\u0440",
                                    "\u041B\u04B1\u049B\u043F\u0430\u043D",
                                    "\u041C\u044B\u0448\u044B\u0440\u0431\u0430\u0439",
                                    "\u041D\u044B\u0441\u044B\u043D\u0431\u0430\u0439",
                                    "\u041E\u0448\u0430\u049B\u0431\u0430\u0439",
                                    "\u04E8\u0442\u0435\u0442\u0456\u043B\u0435\u0443",
                                    "\u041F\u0456\u0440\u04D9\u043B\u0456",
                                    "\u0420\u04AF\u0441\u0442\u0435\u043C",
                                    "\u0421\u044B\u0440\u043C\u04B1\u0445\u0430\u043C\u0431\u0435\u0442",
                                    "\u0422\u0456\u043B\u0435\u043C\u0456\u0441",
                                    "\u0423\u04D9\u043B\u0456",
                                    "\u04B0\u043B\u044B\u049B\u0431\u0435\u043A",
                                    "\u04AE\u0441\u0442\u0435\u043C",
                                    "\u0424\u0430\u0445\u0438\u0440",
                                    "\u0425\u04B1\u0441\u0430\u0439\u044B\u043D",
                                    "\u0428\u0456\u043B\u0434\u0435\u0431\u0430\u0439",
                                    "\u042B\u0441\u0442\u0430\u043C\u0431\u0430\u049B\u044B",
                                    "\u0406\u0441\u043C\u0435\u0442");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\kk_KZ\\Person")
                    .setLookup(
                            Person.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "femaleNameFormats",
                            "firstNameFemale",
                            "firstNameMale",
                            "firstSequenceBitWeights",
                            "genderCenturyMap",
                            "lastName",
                            "maleNameFormats",
                            "secondSequenceBitWeights")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/kk_KZ/Person.php")
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
