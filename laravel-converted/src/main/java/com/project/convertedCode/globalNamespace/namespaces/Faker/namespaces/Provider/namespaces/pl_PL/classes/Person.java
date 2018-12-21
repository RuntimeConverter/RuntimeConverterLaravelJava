package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.pl_PL.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/pl_PL/Person.php

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
    public Object lastName(RuntimeEnv env, Object... args) {
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
                            .method("lastNameMale")
                            .call()
                            .value());

        } else if (ZVal.strictEqualityCheck(
                gender,
                "===",
                ClassConstantUtils.getConstantValueLateStatic(env, this, "GENDER_FEMALE"))) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
                            .method("lastNameFemale")
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
                                                                        .pl_PL
                                                                        .classes
                                                                        .Person
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "lastNameFormat")))
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
                                                                .pl_PL
                                                                .classes
                                                                .Person
                                                                .RequestStaticProperties
                                                                .class)
                                                .lastNameFormat)
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "gender",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object title(RuntimeEnv env, Object... args) {
        Object gender = assignParameter(args, 0, true);
        if (null == gender) {
            gender = ZVal.getNull();
        }
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
                                                                .pl_PL
                                                                .classes
                                                                .Person
                                                                .RequestStaticProperties
                                                                .class,
                                                        "title")))
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
                                                        .pl_PL
                                                        .classes
                                                        .Person
                                                        .RequestStaticProperties
                                                        .class)
                                        .title)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\pl_PL\\Person";

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
        public Object lastNameMale(RuntimeEnv env, Object... args) {
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
                                                            .pl_PL
                                                            .classes
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .lastNameMale)
                            .value());
        }

        @ConvertedMethod
        public Object lastNameFemale(RuntimeEnv env, Object... args) {
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
                                                            .pl_PL
                                                            .classes
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .lastNameFemale)
                            .value());
        }

        @ConvertedMethod
        public Object titleMale(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.callNonStaticMethodStatically(
                            env,
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Faker
                                    .namespaces
                                    .Provider
                                    .namespaces
                                    .pl_PL
                                    .classes
                                    .Person
                                    .class,
                            "title"));
        }

        @ConvertedMethod
        public Object titleFemale(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.callNonStaticMethodStatically(
                            env,
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Faker
                                    .namespaces
                                    .Provider
                                    .namespaces
                                    .pl_PL
                                    .classes
                                    .Person
                                    .class,
                            "title"));
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "birthdate",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 1,
            name = "sex",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object pesel(RuntimeEnv env, Object... args) {
            Object birthdate = assignParameter(args, 0, true);
            if (null == birthdate) {
                birthdate = ZVal.getNull();
            }
            Object sex = assignParameter(args, 1, true);
            if (null == sex) {
                sex = ZVal.getNull();
            }
            ReferenceContainer result = new BasicReferenceContainer(null);
            Object fullYear = null;
            Object month = null;
            Object year = null;
            Object length = null;
            Object checksum = null;
            ReferenceContainer i = new BasicReferenceContainer(null);
            ReferenceContainer weights = new BasicReferenceContainer(null);
            Object day = null;
            if (ZVal.strictEqualityCheck(birthdate, "===", ZVal.getNull())) {
                birthdate = DateTime.runtimeStaticObject.dateTimeThisCentury(env);
            }

            weights.setObject(ZVal.arrayFromList(1, 3, 7, 9, 1, 3, 7, 9, 1, 3));
            length = function_count.f.env(env).call(weights.getObject()).value();
            fullYear =
                    ZVal.assign(
                            ZVal.toLong(env.callMethod(birthdate, "format", Person.class, "Y")));
            year = ZVal.assign(ZVal.toLong(env.callMethod(birthdate, "format", Person.class, "y")));
            month =
                    ZVal.add(
                            env.callMethod(birthdate, "format", Person.class, "m"),
                            ZVal.multiply(
                                    ZVal.modulus(
                                            ZVal.subtract(
                                                    ZVal.toLong(ZVal.divide(fullYear, 100)), 14),
                                            5),
                                    20));
            day = env.callMethod(birthdate, "format", Person.class, "d");
            result.setObject(
                    ZVal.newArray(
                            new ZPair(0, ZVal.toLong(ZVal.divide(year, 10))),
                            new ZPair(1, ZVal.modulus(year, 10)),
                            new ZPair(2, ZVal.toLong(ZVal.divide(month, 10))),
                            new ZPair(3, ZVal.modulus(month, 10)),
                            new ZPair(4, ZVal.toLong(ZVal.divide(day, 10))),
                            new ZPair(5, ZVal.modulus(day, 10))));
            for (i.setObject(6);
                    ZVal.isLessThan(i.getObject(), '<', length);
                    i.setObject(ZVal.increment(i.getObject()))) {
                result.arrayAccess(env, i.getObject())
                        .set(
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, Person.class)
                                        .method("randomDigit")
                                        .call()
                                        .value());
            }

            if (ZVal.equalityCheck(sex, "M")) {
                result.arrayAccess(env, ZVal.subtract(length, 1))
                        .set(
                                ZAssignment.or(
                                        "|=", result.arrayGet(env, ZVal.subtract(length, 1)), 1));

            } else if (ZVal.equalityCheck(sex, "F")) {
                result.arrayAccess(env, ZVal.subtract(length, 1))
                        .set(
                                ZAssignment.xor(
                                        "^=", result.arrayGet(env, ZVal.subtract(length, 1)), 1));
            }

            checksum = 0;
            for (i.setObject(0);
                    ZVal.isLessThan(i.getObject(), '<', length);
                    i.setObject(ZVal.increment(i.getObject()))) {
                checksum =
                        ZAssignment.add(
                                "+=",
                                checksum,
                                ZVal.multiply(
                                        weights.arrayGet(env, i.getObject()),
                                        result.arrayGet(env, i.getObject())));
            }

            checksum = ZVal.modulus(ZVal.subtract(10, ZVal.modulus(checksum, 10)), 10);
            result.arrayAppend(env).set(checksum);
            return ZVal.assign(
                    NamespaceGlobal.implode.env(env).call("", result.getObject()).value());
        }

        @ConvertedMethod
        public Object personalIdentityNumber(RuntimeEnv env, Object... args) {
            ReferenceContainer high = new BasicReferenceContainer(null);
            Object size = null;
            ReferenceContainer low = new BasicReferenceContainer(null);
            Object checksum = null;
            Object range = null;
            ReferenceContainer i = new BasicReferenceContainer(null);
            ReferenceContainer weights = new BasicReferenceContainer(null);
            range = NamespaceGlobal.str_split.env(env).call("ABCDEFGHIJKLMNPRSTUVWXYZ").value();
            low.setObject(
                    ZVal.newArray(
                            new ZPair(0, "A"),
                            new ZPair(
                                    1,
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Person.class)
                                            .method("randomElement")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(range)
                                            .value()),
                            new ZPair(
                                    2,
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Person.class)
                                            .method("randomElement")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(range)
                                            .value())));
            high.setObject(
                    ZVal.newArray(
                            new ZPair(
                                    0,
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Person.class)
                                            .method("randomDigit")
                                            .call()
                                            .value()),
                            new ZPair(
                                    1,
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Person.class)
                                            .method("randomDigit")
                                            .call()
                                            .value()),
                            new ZPair(
                                    2,
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Person.class)
                                            .method("randomDigit")
                                            .call()
                                            .value()),
                            new ZPair(
                                    3,
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Person.class)
                                            .method("randomDigit")
                                            .call()
                                            .value()),
                            new ZPair(
                                    4,
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Person.class)
                                            .method("randomDigit")
                                            .call()
                                            .value())));
            weights.setObject(ZVal.arrayFromList(7, 3, 1, 7, 3, 1, 7, 3));
            checksum = 0;
            for (i.setObject(0), size = function_count.f.env(env).call(low.getObject()).value();
                    ZVal.isLessThan(i.getObject(), '<', size);
                    i.setObject(ZVal.increment(i.getObject()))) {
                checksum =
                        ZAssignment.add(
                                "+=",
                                checksum,
                                ZVal.multiply(
                                        weights.arrayGet(env, i.getObject()),
                                        ZVal.subtract(
                                                NamespaceGlobal.ord
                                                        .env(env)
                                                        .call(low.arrayGet(env, i.getObject()))
                                                        .value(),
                                                55)));
            }

            for (i.setObject(0), size = function_count.f.env(env).call(high.getObject()).value();
                    ZVal.isLessThan(i.getObject(), '<', size);
                    i.setObject(ZVal.increment(i.getObject()))) {
                checksum =
                        ZAssignment.add(
                                "+=",
                                checksum,
                                ZVal.multiply(
                                        weights.arrayGet(env, ZVal.add(i.getObject(), 3)),
                                        high.arrayGet(env, i.getObject())));
            }

            checksum = ZAssignment.modulus("%=", checksum, 10);
            return ZVal.assign(
                    toStringR(
                                    NamespaceGlobal.implode
                                            .env(env)
                                            .call("", low.getObject())
                                            .value(),
                                    env)
                            + toStringR(checksum, env)
                            + toStringR(
                                    NamespaceGlobal.implode
                                            .env(env)
                                            .call("", high.getObject())
                                            .value(),
                                    env));
        }

        @ConvertedMethod
        public Object taxpayerIdentificationNumber(RuntimeEnv env, Object... args) {
            ReferenceContainer result = new BasicReferenceContainer(null);
            Object size = null;
            Object checksum = null;
            ReferenceContainer i = new BasicReferenceContainer(null);
            ReferenceContainer weights = new BasicReferenceContainer(null);
            weights.setObject(ZVal.arrayFromList(6, 5, 7, 2, 3, 4, 5, 6, 7));
            result.setObject(ZVal.newArray());
            do {
                result.setObject(
                        ZVal.newArray(
                                new ZPair(
                                        0,
                                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                                        env, this, Person.class)
                                                .method("randomDigitNotNull")
                                                .call()
                                                .value()),
                                new ZPair(
                                        1,
                                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                                        env, this, Person.class)
                                                .method("randomDigitNotNull")
                                                .call()
                                                .value()),
                                new ZPair(
                                        2,
                                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                                        env, this, Person.class)
                                                .method("randomDigitNotNull")
                                                .call()
                                                .value()),
                                new ZPair(
                                        3,
                                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                                        env, this, Person.class)
                                                .method("randomDigit")
                                                .call()
                                                .value()),
                                new ZPair(
                                        4,
                                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                                        env, this, Person.class)
                                                .method("randomDigit")
                                                .call()
                                                .value()),
                                new ZPair(
                                        5,
                                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                                        env, this, Person.class)
                                                .method("randomDigit")
                                                .call()
                                                .value()),
                                new ZPair(
                                        6,
                                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                                        env, this, Person.class)
                                                .method("randomDigit")
                                                .call()
                                                .value()),
                                new ZPair(
                                        7,
                                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                                        env, this, Person.class)
                                                .method("randomDigit")
                                                .call()
                                                .value()),
                                new ZPair(
                                        8,
                                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                                        env, this, Person.class)
                                                .method("randomDigit")
                                                .call()
                                                .value())));
                checksum = 0;
                for (i.setObject(0),
                                size = function_count.f.env(env).call(result.getObject()).value();
                        ZVal.isLessThan(i.getObject(), '<', size);
                        i.setObject(ZVal.increment(i.getObject()))) {
                    checksum =
                            ZAssignment.add(
                                    "+=",
                                    checksum,
                                    ZVal.multiply(
                                            weights.arrayGet(env, i.getObject()),
                                            result.arrayGet(env, i.getObject())));
                }

                checksum = ZAssignment.modulus("%=", checksum, 11);

            } while (ZVal.equalityCheck(checksum, 10));

            result.arrayAppend(env).set(checksum);
            return ZVal.assign(
                    NamespaceGlobal.implode.env(env).call("", result.getObject()).value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object lastNameFormat = ZVal.arrayFromList("{{lastNameMale}}", "{{lastNameFemale}}");

        public Object maleNameFormats =
                ZVal.arrayFromList(
                        "{{firstNameMale}} {{lastNameMale}}",
                        "{{firstNameMale}} {{lastNameMale}}",
                        "{{firstNameMale}} {{lastNameMale}}",
                        "{{title}} {{firstNameMale}} {{lastNameMale}}",
                        "{{firstNameMale}} {{lastNameMale}}",
                        "{{title}} {{title}} {{firstNameMale}} {{lastNameMale}}");

        public Object femaleNameFormats =
                ZVal.arrayFromList(
                        "{{firstNameFemale}} {{lastNameFemale}}",
                        "{{firstNameFemale}} {{lastNameFemale}}",
                        "{{firstNameFemale}} {{lastNameFemale}}",
                        "{{title}} {{firstNameFemale}} {{lastNameFemale}}",
                        "{{firstNameFemale}} {{lastNameFemale}}",
                        "{{title}} {{title}} {{firstNameFemale}} {{lastNameFemale}}");

        public Object firstNameMale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Adam",
                                    "Adrian",
                                    "Alan",
                                    "Albert",
                                    "Aleks",
                                    "Aleksander",
                                    "Alex",
                                    "Andrzej",
                                    "Antoni",
                                    "Arkadiusz",
                                    "Artur",
                                    "Bartek",
                                    "B\u0142a\u017Cej",
                                    "Borys",
                                    "Bruno",
                                    "Cezary",
                                    "Cyprian",
                                    "Damian",
                                    "Daniel",
                                    "Dariusz",
                                    "Dawid",
                                    "Dominik",
                                    "Emil",
                                    "Ernest",
                                    "Eryk",
                                    "Fabian",
                                    "Filip",
                                    "Franciszek",
                                    "Fryderyk",
                                    "Gabriel",
                                    "Grzegorz",
                                    "Gustaw",
                                    "Hubert",
                                    "Ignacy",
                                    "Igor",
                                    "Iwo",
                                    "Jacek",
                                    "Jakub",
                                    "Jan",
                                    "Jeremi",
                                    "Jerzy",
                                    "J\u0119drzej",
                                    "J\u00F3zef",
                                    "Julian",
                                    "Juliusz",
                                    "Kacper",
                                    "Kajetan",
                                    "Kamil",
                                    "Karol",
                                    "Kazimierz",
                                    "Konrad",
                                    "Konstanty",
                                    "Kornel",
                                    "Krystian",
                                    "Krzysztof",
                                    "Ksawery",
                                    "Leon",
                                    "Leonard",
                                    "\u0141ukasz",
                                    "Maciej",
                                    "Maks",
                                    "Maksymilian",
                                    "Marcel",
                                    "Marcin",
                                    "Marek",
                                    "Mariusz",
                                    "Mateusz",
                                    "Maurycy",
                                    "Micha\u0142",
                                    "Mieszko",
                                    "Miko\u0142aj",
                                    "Mi\u0142osz",
                                    "Natan",
                                    "Nataniel",
                                    "Nikodem",
                                    "Norbert",
                                    "Olaf",
                                    "Olgierd",
                                    "Oliwier",
                                    "Oskar",
                                    "Patryk",
                                    "Pawe\u0142",
                                    "Piotr",
                                    "Przemys\u0142aw",
                                    "Rados\u0142aw",
                                    "Rafa\u0142",
                                    "Robert",
                                    "Ryszard",
                                    "Sebastian",
                                    "Stanis\u0142aw",
                                    "Stefan",
                                    "Szymon",
                                    "Tadeusz",
                                    "Tomasz",
                                    "Tymon",
                                    "Tymoteusz",
                                    "Wiktor",
                                    "Witold",
                                    "Wojciech");
                        });

        public Object firstNameFemale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Ada",
                                    "Adrianna",
                                    "Agata",
                                    "Agnieszka",
                                    "Aleksandra",
                                    "Alicja",
                                    "Amelia",
                                    "Anastazja",
                                    "Angelika",
                                    "Aniela",
                                    "Anita",
                                    "Anna",
                                    "Anna",
                                    "Antonina",
                                    "Apolonia",
                                    "Aurelia",
                                    "Barbara",
                                    "Bianka",
                                    "Blanka",
                                    "Dagmara",
                                    "Daria",
                                    "Dominika",
                                    "Dorota",
                                    "Eliza",
                                    "El\u017Cbieta",
                                    "Emilia",
                                    "Ewa",
                                    "Ewelina",
                                    "Gabriela",
                                    "Hanna",
                                    "Helena",
                                    "Ida",
                                    "Iga",
                                    "Inga",
                                    "Izabela",
                                    "Jagoda",
                                    "Janina",
                                    "Joanna",
                                    "Julia",
                                    "Julianna",
                                    "Julita",
                                    "Justyna",
                                    "Kaja",
                                    "Kalina",
                                    "Kamila",
                                    "Karina",
                                    "Karolina",
                                    "Katarzyna",
                                    "Kinga",
                                    "Klara",
                                    "Klaudia",
                                    "Kornelia",
                                    "Krystyna",
                                    "Laura",
                                    "Lena",
                                    "Lidia",
                                    "Liliana",
                                    "Liwia",
                                    "\u0141ucja",
                                    "Magdalena",
                                    "Maja",
                                    "Malwina",
                                    "Ma\u0142gorzata",
                                    "Marcelina",
                                    "Maria",
                                    "Marianna",
                                    "Marika",
                                    "Marta",
                                    "Martyna",
                                    "Matylda",
                                    "Melania",
                                    "Michalina",
                                    "Milena",
                                    "Monika",
                                    "Nadia",
                                    "Natalia",
                                    "Natasza",
                                    "Nela",
                                    "Nicole",
                                    "Nikola",
                                    "Nina",
                                    "Olga",
                                    "Oliwia",
                                    "Patrycja",
                                    "Paulina",
                                    "Pola",
                                    "Roksana",
                                    "Rozalia",
                                    "R\u00F3\u017Ca",
                                    "Sandra",
                                    "Sara",
                                    "Sonia",
                                    "Sylwia",
                                    "Tola",
                                    "Urszula",
                                    "Weronika",
                                    "Wiktoria",
                                    "Zofia",
                                    "Zuzanna");
                        });

        public Object lastNameMale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Adamczyk",
                                    "Adamski",
                                    "Andrzejewski",
                                    "Baran",
                                    "Baranowski",
                                    "B\u0105k",
                                    "B\u0142aszczyk",
                                    "Borkowski",
                                    "Borowski",
                                    "Brzezi\u0144ski",
                                    "Chmielewski",
                                    "Cie\u015Blak",
                                    "Czarnecki",
                                    "Czerwi\u0144ski",
                                    "D\u0105browski",
                                    "Duda",
                                    "Dudek",
                                    "Gajewski",
                                    "G\u0142owacki",
                                    "G\u00F3rski",
                                    "Grabowski",
                                    "Jab\u0142o\u0144ski",
                                    "Jakubowski",
                                    "Jankowski",
                                    "Jasi\u0144ski",
                                    "Jaworski",
                                    "Kaczmarczyk",
                                    "Kaczmarek",
                                    "Kalinowski",
                                    "Kami\u0144ski",
                                    "Ka\u017Amierczak",
                                    "Ko\u0142odziej",
                                    "Konieczny",
                                    "Kowalczyk",
                                    "Kowalski",
                                    "Koz\u0142owski",
                                    "Krajewski",
                                    "Krawczyk",
                                    "Kr\u00F3l",
                                    "Krupa",
                                    "Kubiak",
                                    "Kucharski",
                                    "Kwiatkowski",
                                    "Laskowski",
                                    "Lewandowski",
                                    "Lis",
                                    "Maciejewski",
                                    "Majewski",
                                    "Makowski",
                                    "Malinowski",
                                    "Marciniak",
                                    "Mazur",
                                    "Mazurek",
                                    "Michalak",
                                    "Michalski",
                                    "Mr\u00F3z",
                                    "Nowak",
                                    "Nowakowski",
                                    "Nowicki",
                                    "Olszewski",
                                    "Ostrowski",
                                    "Pawlak",
                                    "Paw\u0142owski",
                                    "Pietrzak",
                                    "Piotrowski",
                                    "Przybylski",
                                    "Rutkowski",
                                    "Sadowski",
                                    "Sawicki",
                                    "Sikora",
                                    "Sikorski",
                                    "Sobczak",
                                    "Soko\u0142owski",
                                    "St\u0119pie\u0144",
                                    "Szczepa\u0144ski",
                                    "Szewczyk",
                                    "Szulc",
                                    "Szyma\u0144ski",
                                    "Szymczak",
                                    "Tomaszewski",
                                    "Urba\u0144ski",
                                    "Walczak",
                                    "Wasilewski",
                                    "Wieczorek",
                                    "Wilk",
                                    "Wi\u015Bniewski",
                                    "Witkowski",
                                    "W\u0142odarczyk",
                                    "Wojciechowski",
                                    "Wo\u017Aniak",
                                    "W\u00F3jcik",
                                    "Wr\u00F3bel",
                                    "Wr\u00F3blewski",
                                    "Wysocki",
                                    "Zaj\u0105c",
                                    "Zakrzewski",
                                    "Zalewski",
                                    "Zawadzki",
                                    "Zieli\u0144ski",
                                    "Zi\u00F3\u0142kowski");
                        });

        public Object lastNameFemale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Adamczyk",
                                    "Adamska",
                                    "Andrzejewska",
                                    "Baran",
                                    "Baranowska",
                                    "B\u0105k",
                                    "B\u0142aszczyk",
                                    "Borkowska",
                                    "Borowska",
                                    "Brzezi\u0144ska",
                                    "Chmielewska",
                                    "Cie\u015Blak",
                                    "Czarnecka",
                                    "Czerwi\u0144ska",
                                    "D\u0105browska",
                                    "Duda",
                                    "Dudek",
                                    "Gajewska",
                                    "G\u0142owacka",
                                    "G\u00F3recka",
                                    "G\u00F3rska",
                                    "Grabowska",
                                    "Jab\u0142o\u0144ska",
                                    "Jakubowska",
                                    "Jankowska",
                                    "Jasi\u0144ska",
                                    "Jaworska",
                                    "Kaczmarczyk",
                                    "Kaczmarek",
                                    "Kalinowska",
                                    "Kami\u0144ska",
                                    "Ka\u017Amierczak",
                                    "Ko\u0142odziej",
                                    "Kowalczyk",
                                    "Kowalska",
                                    "Koz\u0142owska",
                                    "Krajewska",
                                    "Krawczyk",
                                    "Kr\u00F3l",
                                    "Krupa",
                                    "Kubiak",
                                    "Kucharska",
                                    "Kwiatkowska",
                                    "Laskowska",
                                    "Lewandowska",
                                    "Lis",
                                    "Maciejewska",
                                    "Majewska",
                                    "Makowska",
                                    "Malinowska",
                                    "Marciniak",
                                    "Mazur",
                                    "Mazurek",
                                    "Michalak",
                                    "Michalska",
                                    "Mr\u00F3z",
                                    "Nowak",
                                    "Nowakowska",
                                    "Nowicka",
                                    "Olszewska",
                                    "Ostrowska",
                                    "Pawlak",
                                    "Paw\u0142owska",
                                    "Pietrzak",
                                    "Piotrowska",
                                    "Przybylska",
                                    "Rutkowska",
                                    "Sadowska",
                                    "Sawicka",
                                    "Sikora",
                                    "Sikorska",
                                    "Sobczak",
                                    "Soko\u0142owska",
                                    "St\u0119pie\u0144",
                                    "Szczepa\u0144ska",
                                    "Szewczyk",
                                    "Szulc",
                                    "Szyma\u0144ska",
                                    "Szymczak",
                                    "Tomaszewska",
                                    "Urba\u0144ska",
                                    "Walczak",
                                    "Wasilewska",
                                    "Wieczorek",
                                    "Wilk",
                                    "Wi\u015Bniewska",
                                    "Witkowska",
                                    "W\u0142odarczyk",
                                    "Wojciechowska",
                                    "Wo\u017Aniak",
                                    "W\u00F3jcik",
                                    "Wr\u00F3bel",
                                    "Wr\u00F3blewska",
                                    "Wysocka",
                                    "Zaj\u0105c",
                                    "Zakrzewska",
                                    "Zalewska",
                                    "Zawadzka",
                                    "Zieli\u0144ska",
                                    "Zi\u00F3\u0142kowska");
                        });

        public Object title = ZVal.arrayFromList("mgr", "in\u017C.", "dr", "doc.");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\pl_PL\\Person")
                    .setLookup(
                            Person.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "femaleNameFormats",
                            "firstNameFemale",
                            "firstNameMale",
                            "lastNameFemale",
                            "lastNameFormat",
                            "lastNameMale",
                            "maleNameFormats",
                            "title")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/pl_PL/Person.php")
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
