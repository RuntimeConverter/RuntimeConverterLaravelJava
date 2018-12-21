package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.ro_RO.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.nativeFunctions.array.function_range;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/ro_RO/Person.php

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
    @ConvertedParameter(
        index = 1,
        name = "dateOfBirth",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "county",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "isResident",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object cnp(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object gender = assignParameter(args, 0, true);
        if (null == gender) {
            gender = ZVal.getNull();
        }
        Object dateOfBirth = assignParameter(args, 1, true);
        if (null == dateOfBirth) {
            dateOfBirth = ZVal.getNull();
        }
        Object county = assignParameter(args, 2, true);
        if (null == county) {
            county = ZVal.getNull();
        }
        Object isResident = assignParameter(args, 3, true);
        if (null == isResident) {
            isResident = true;
        }
        Object date = null;
        Object countyCode = null;
        Object cnp = null;
        Object checksum = null;
        ReferenceContainer genders = new BasicReferenceContainer(null);
        genders.setObject(
                ZVal.newArray(
                        new ZPair(
                                0,
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Faker
                                        .namespaces
                                        .Provider
                                        .namespaces
                                        .ro_RO
                                        .classes
                                        .Person
                                        .CONST_GENDER_MALE),
                        new ZPair(
                                1,
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Faker
                                        .namespaces
                                        .Provider
                                        .namespaces
                                        .ro_RO
                                        .classes
                                        .Person
                                        .CONST_GENDER_FEMALE)));
        if (ZVal.isEmpty(gender)) {
            gender =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
                            .method("randomElement")
                            .addReferenceArgs(new RuntimeArgsWithReferences().add(0, genders))
                            .call(genders.getObject())
                            .value();

        } else if (!function_in_array.f.env(env).call(gender, genders.getObject()).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Gender must be '{Person::GENDER_MALE}' or '{Person::GENDER_FEMALE}'"));
        }

        date = this.getDateOfBirth(env, dateOfBirth);
        if (function_is_null.f.env(env).call(county).getBool()) {
            countyCode =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
                            .method("randomElement")
                            .addReferenceArgs(
                                    rLastRefArgs =
                                            new RuntimeArgsWithReferences()
                                                    .add(
                                                            0,
                                                            handleReturnReference(
                                                                    function_array_values
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
                                                                                                            .ro_RO
                                                                                                            .classes
                                                                                                            .Person
                                                                                                            .RequestStaticProperties
                                                                                                            .class)
                                                                                            .cnpCountyCodes)
                                                                            .value())))
                            .call(rLastRefArgs.get(0))
                            .value();

        } else if (!function_array_key_exists
                .f
                .env(env)
                .call(
                        county,
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Faker
                                                .namespaces
                                                .Provider
                                                .namespaces
                                                .ro_RO
                                                .classes
                                                .Person
                                                .RequestStaticProperties
                                                .class)
                                .cnpCountyCodes)
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Invalid county code '" + toStringR(county, env) + "' received"));

        } else {
            countyCode =
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
                                                    .ro_RO
                                                    .classes
                                                    .Person
                                                    .RequestStaticProperties
                                                    .class,
                                            "cnpCountyCodes")
                                    .arrayGet(env, county));
        }

        cnp =
                toStringR(
                                toStringR(
                                        env.callMethod(
                                                this,
                                                "getGenderDigit",
                                                Person.class,
                                                date,
                                                gender,
                                                isResident),
                                        env),
                                env)
                        + toStringR(env.callMethod(date, "format", Person.class, "ymd"), env)
                        + toStringR(countyCode, env)
                        + toStringR(
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, Person.class)
                                        .method("numerify")
                                        .addReferenceArgs(new RuntimeArgsWithReferences())
                                        .call("##%")
                                        .value(),
                                env);
        checksum = this.getChecksumDigit(env, cnp);
        return ZVal.assign(toStringR(cnp, env) + toStringR(checksum, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dateOfBirth")
    protected Object getDateOfBirth(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object dateOfBirth = assignParameter(args, 0, false);
        ReferenceContainer dateOfBirthParts = new BasicReferenceContainer(null);
        Object date = null;
        Object dateOfBirthFinal = null;
        Object baseDate = null;
        if (ZVal.isEmpty(dateOfBirth)) {
            dateOfBirthParts.setObject(
                    ZVal.newArray(
                            new ZPair(
                                    0,
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Person.class)
                                            .method("numberBetween")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(1800, 2099)
                                            .value())));

        } else {
            dateOfBirthParts.setObject(function_explode.f.env(env).call("-", dateOfBirth).value());
        }

        baseDate =
                com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider
                        .classes.DateTime.runtimeStaticObject.dateTimeBetween(
                        env,
                        "first day of " + toStringR(dateOfBirthParts.arrayGet(env, 0), env),
                        "last day of " + toStringR(dateOfBirthParts.arrayGet(env, 0), env));
        SwitchEnumType14 switchVariable14 =
                ZVal.getEnum(
                        function_count.f.env(env).call(dateOfBirthParts.getObject()).value(),
                        SwitchEnumType14.DEFAULT_CASE,
                        SwitchEnumType14.INTEGER_1,
                        1,
                        SwitchEnumType14.INTEGER_2,
                        2,
                        SwitchEnumType14.INTEGER_3,
                        3);
        switch (switchVariable14) {
            case INTEGER_1:
                dateOfBirthParts
                        .arrayAppend(env)
                        .set(env.callMethod(baseDate, "format", Person.class, "m"));
            case INTEGER_2:
                dateOfBirthParts
                        .arrayAppend(env)
                        .set(env.callMethod(baseDate, "format", Person.class, "d"));
            case INTEGER_3:
                break;
            case DEFAULT_CASE:
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                "Invalid date of birth - must be null or in the 'Y-m-d', 'Y-m', 'Y' format"));
        }
        ;
        if (ZVal.toBool(ZVal.isLessThan(dateOfBirthParts.arrayGet(env, 0), '<', 1800))
                || ZVal.toBool(ZVal.isGreaterThan(dateOfBirthParts.arrayGet(env, 0), '>', 2099))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Invalid date of birth - year must be between 1900 and 2099, '"
                                    + toStringR(dateOfBirthParts.arrayGet(env, 0), env)
                                    + "' received"));
        }

        dateOfBirthFinal =
                NamespaceGlobal.implode.env(env).call("-", dateOfBirthParts.getObject()).value();
        date =
                com.runtimeconverter.runtime.nativeClasses.date.DateTime.runtimeStaticObject
                        .createFromFormat(env, "Y-m-d", dateOfBirthFinal);
        if (ZVal.strictNotEqualityCheck(
                env.callMethod(date, "format", Person.class, "Y-m-d"), "!==", dateOfBirthFinal)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Invalid date of birth - '"
                                    + toStringR(
                                            env.callMethod(date, "format", Person.class, "Y-m-d"),
                                            env)
                                    + "' generated based on '"
                                    + toStringR(dateOfBirth, env)
                                    + "' received"));
        }

        return ZVal.assign(date);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object getChecksumDigit(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object checkNumber = null;
        Object checksum = null;
        Object digit = null;
        checkNumber = 279146358279L;
        checksum = 0;
        for (ZPair zpairResult131 :
                ZVal.getIterable(function_range.f.env(env).call(0, 11).value(), env, true)) {
            digit = ZVal.assign(zpairResult131.getValue());
            checksum =
                    ZAssignment.add(
                            "+=",
                            checksum,
                            ZVal.multiply(
                                    ZVal.toLong(
                                            function_substr
                                                    .f
                                                    .env(env)
                                                    .call(value, digit, 1)
                                                    .value()),
                                    ZVal.toLong(
                                            function_substr
                                                    .f
                                                    .env(env)
                                                    .call(checkNumber, digit, 1)
                                                    .value())));
        }

        checksum = ZVal.modulus(checksum, 11);
        return ZVal.assign(ZVal.equalityCheck(checksum, 10) ? 1 : checksum);
    }

    public static final Object CONST_class = "Faker\\Provider\\ro_RO\\Person";

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
        @ConvertedParameter(index = 0, name = "dateOfBirth", typeHint = "DateTime")
        @ConvertedParameter(index = 1, name = "gender")
        @ConvertedParameter(index = 2, name = "isResident")
        protected Object getGenderDigit(RuntimeEnv env, Object... args) {
            Object dateOfBirth = assignParameter(args, 0, false);
            Object gender = assignParameter(args, 1, false);
            Object isResident = assignParameter(args, 2, false);
            if (!ZVal.isTrue(isResident)) {
                return 9;
            }

            if (ZVal.isLessThan(
                    env.callMethod(dateOfBirth, "format", Person.class, "Y"), '<', 1900)) {
                if (ZVal.equalityCheck(
                        gender,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Faker
                                .namespaces
                                .Provider
                                .namespaces
                                .ro_RO
                                .classes
                                .Person
                                .CONST_GENDER_MALE)) {
                    return 3;
                }

                return 4;
            }

            if (ZVal.isLessThan(
                    env.callMethod(dateOfBirth, "format", Person.class, "Y"), '<', 2000)) {
                if (ZVal.equalityCheck(
                        gender,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Faker
                                .namespaces
                                .Provider
                                .namespaces
                                .ro_RO
                                .classes
                                .Person
                                .CONST_GENDER_MALE)) {
                    return 1;
                }

                return 2;
            }

            if (ZVal.equalityCheck(
                    gender,
                    com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Faker
                            .namespaces
                            .Provider
                            .namespaces
                            .ro_RO
                            .classes
                            .Person
                            .CONST_GENDER_MALE)) {
                return 5;
            }

            return 6;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object maleNameFormats =
                ZVal.arrayFromList(
                        "{{firstNameMale}} {{lastName}}",
                        "{{firstNameMale}} {{lastName}}",
                        "{{firstNameMale}} {{lastName}}",
                        "{{titleMale}} {{firstNameMale}} {{lastName}}");

        public Object femaleNameFormats =
                ZVal.arrayFromList(
                        "{{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}}",
                        "{{titleFemale}} {{firstNameFemale}} {{lastName}}");

        public Object firstNameFemale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Ada",
                                    "Adela",
                                    "Adelaida",
                                    "Adelina",
                                    "Adina",
                                    "Adriana",
                                    "Agata",
                                    "Aglaia",
                                    "Agripina",
                                    "Aida",
                                    "Alberta",
                                    "Albertina",
                                    "Alexandra",
                                    "Alexandrina",
                                    "Alida",
                                    "Alina",
                                    "Alice",
                                    "Alis",
                                    "Alma",
                                    "Amalia",
                                    "Amelia",
                                    "Amanda",
                                    "Ana",
                                    "Anabela",
                                    "Anaida",
                                    "Anamaria",
                                    "Anastasia",
                                    "Anca",
                                    "Ancu\u021Ba",
                                    "Anda",
                                    "Andra",
                                    "Andrada",
                                    "Andreea",
                                    "Anemona",
                                    "Aneta",
                                    "Angela",
                                    "Anghelina",
                                    "Anica",
                                    "Ani\u0219oara",
                                    "Antoaneta",
                                    "Antonia",
                                    "Antonela",
                                    "Anu\u021Ba",
                                    "Ariadna",
                                    "Ariana",
                                    "Arina",
                                    "Aristi\u021Ba",
                                    "Artemisa",
                                    "Astrid",
                                    "Atena",
                                    "Augustina",
                                    "Aura",
                                    "Aurelia",
                                    "Aureliana",
                                    "Aurica",
                                    "Aurora",
                                    "Beatrice",
                                    "Betina",
                                    "Bianca",
                                    "Blanduzia",
                                    "Bogdana",
                                    "Br\u00E2ndu\u0219a",
                                    "Camelia",
                                    "Carina",
                                    "Carla",
                                    "Carmen",
                                    "Carmina",
                                    "Carolina",
                                    "Casandra",
                                    "Casiana",
                                    "Caterina",
                                    "Catinca",
                                    "Catrina",
                                    "Catrinel",
                                    "C\u0103t\u0103lina",
                                    "Cecilia",
                                    "Celia",
                                    "Cerasela",
                                    "Cezara",
                                    "Cipriana",
                                    "Clara",
                                    "Clarisa",
                                    "Claudia",
                                    "Clementina",
                                    "Cleopatra",
                                    "Codrina",
                                    "Codru\u021Ba",
                                    "Constantina",
                                    "Constan\u021Ba",
                                    "Consuela",
                                    "Coralia",
                                    "Corina",
                                    "Cornelia",
                                    "Cosmina",
                                    "Crengu\u021Ba",
                                    "Crina",
                                    "Cristina",
                                    "Daciana",
                                    "Dafina",
                                    "Daiana",
                                    "Dalia",
                                    "Dana",
                                    "Daniela",
                                    "Daria",
                                    "Dariana",
                                    "Delia",
                                    "Demetra",
                                    "Denisa",
                                    "Despina",
                                    "Diana",
                                    "Dida",
                                    "Didina",
                                    "Dimitrina",
                                    "Dina",
                                    "Dochia",
                                    "Doina",
                                    "Domnica",
                                    "Dora",
                                    "Doriana",
                                    "Dorina",
                                    "Dorli",
                                    "Draga",
                                    "Dumitra",
                                    "Dumitrana",
                                    "Ecaterina",
                                    "Eftimia",
                                    "Elena",
                                    "Eleonora",
                                    "Eliana",
                                    "Elisabeta",
                                    "Elisaveta",
                                    "Eliza",
                                    "Elodia",
                                    "Elvira",
                                    "Emilia",
                                    "Emanuela",
                                    "Erica",
                                    "Estera",
                                    "Eufrosina",
                                    "Eugenia",
                                    "Eusebia",
                                    "Eva",
                                    "Evanghelina",
                                    "Evelina",
                                    "Fabia",
                                    "Fabiana",
                                    "Felicia",
                                    "Filofteia",
                                    "Fiona",
                                    "Flavia",
                                    "Floare",
                                    "Floarea",
                                    "Flora",
                                    "Floriana",
                                    "Florica",
                                    "Florina",
                                    "Florentina",
                                    "Floren\u021Ba",
                                    "Francesca",
                                    "Frusina",
                                    "Gabriela",
                                    "Geanina",
                                    "Gen\u021Biana",
                                    "Georgeta",
                                    "Georgia",
                                    "Georgiana",
                                    "Geta",
                                    "Gherghina",
                                    "Gianina",
                                    "Gina",
                                    "Giorgiana",
                                    "Gra\u021Biana",
                                    "Gra\u021Biela",
                                    "Hortensia",
                                    "Henrieta",
                                    "Heracleea",
                                    "Iasmina",
                                    "Ica",
                                    "Ileana",
                                    "Ilinca",
                                    "Ilona",
                                    "Ina",
                                    "Ioana",
                                    "Ioanina",
                                    "Iolanda",
                                    "Ionela",
                                    "Ionelia",
                                    "Iosefina",
                                    "Irina",
                                    "Iridenta",
                                    "Iris",
                                    "Isabela",
                                    "Iulia",
                                    "Iuliana",
                                    "Iustina",
                                    "Ivona",
                                    "Izabela",
                                    "Jana",
                                    "Janeta",
                                    "Janina",
                                    "Jasmina",
                                    "Jeana",
                                    "Julia",
                                    "Julieta",
                                    "Larisa",
                                    "Laura",
                                    "Lauren\u021Bia",
                                    "Lavinia",
                                    "L\u0103cr\u0103mioara",
                                    "Leana",
                                    "Lelia",
                                    "Leontina",
                                    "Leopoldina",
                                    "Leti\u021Bia",
                                    "Lia",
                                    "Liana",
                                    "Lidia",
                                    "Ligia",
                                    "Lili",
                                    "Liliana",
                                    "Lioara",
                                    "Livia",
                                    "Loredana",
                                    "Lorelei",
                                    "Lorena",
                                    "Luana",
                                    "Lucia",
                                    "Luciana",
                                    "Lucre\u021Bia",
                                    "Ludovica",
                                    "Ludmila",
                                    "Luiza",
                                    "Lumini\u021Ba",
                                    "Magdalena",
                                    "Maia",
                                    "Manuela",
                                    "Mara",
                                    "Marcela",
                                    "Marga",
                                    "Margareta",
                                    "Marcheta",
                                    "Maria",
                                    "Mariana",
                                    "Maricica",
                                    "Marilena",
                                    "Marina",
                                    "Marinela",
                                    "Marioara",
                                    "Marta",
                                    "Matilda",
                                    "Malvina",
                                    "M\u0103d\u0103lina",
                                    "M\u0103lina",
                                    "M\u0103rioara",
                                    "M\u0103riuca",
                                    "Melania",
                                    "Melina",
                                    "Mihaela",
                                    "Milena",
                                    "Mina",
                                    "Minodora",
                                    "Mioara",
                                    "Mirabela",
                                    "Mirela",
                                    "Mirona",
                                    "Miruna",
                                    "Mona",
                                    "Monalisa",
                                    "Monica",
                                    "Nadia",
                                    "Narcisa",
                                    "Natalia",
                                    "Nata\u0219a",
                                    "Noemi",
                                    "Nicoleta",
                                    "Niculina",
                                    "Nidia",
                                    "Nora",
                                    "Norica",
                                    "Oana",
                                    "Octavia",
                                    "Octaviana",
                                    "Ofelia",
                                    "Olga",
                                    "Olimpia",
                                    "Olivia",
                                    "Ortansa",
                                    "Otilia",
                                    "Ozana",
                                    "Pamela",
                                    "Paraschiva",
                                    "Paula",
                                    "Paulica",
                                    "Paulina",
                                    "Patricia",
                                    "Petronela",
                                    "Petru\u021Ba",
                                    "Pompilia",
                                    "Profira",
                                    "Rada",
                                    "Rafila",
                                    "Raluca",
                                    "Ramona",
                                    "Rebeca",
                                    "Renata",
                                    "Rica",
                                    "Roberta",
                                    "Robertina",
                                    "Rodica",
                                    "Romani\u021Ba",
                                    "Romina",
                                    "Roza",
                                    "Rozalia",
                                    "Roxana",
                                    "Roxelana",
                                    "Ruxanda",
                                    "Ruxandra",
                                    "Sabina",
                                    "Sabrina",
                                    "Safta",
                                    "Salomea",
                                    "Sanda",
                                    "Saveta",
                                    "Savina",
                                    "S\u00E2nziana",
                                    "Semenica",
                                    "Severina",
                                    "Sidonia",
                                    "Silvia",
                                    "Silvana",
                                    "Silviana",
                                    "Simina",
                                    "Simona",
                                    "Smaranda",
                                    "Sofia",
                                    "Sonia",
                                    "Sorana",
                                    "Sorina",
                                    "Speran\u021Ba",
                                    "Stana",
                                    "Stanca",
                                    "Stela",
                                    "Steliana",
                                    "Stelu\u021Ba",
                                    "Suzana",
                                    "Svetlana",
                                    "\u0218tefana",
                                    "\u0218tefania",
                                    "Tamara",
                                    "Tania",
                                    "Tatiana",
                                    "Teea",
                                    "Teodora",
                                    "Teodosia",
                                    "Teona",
                                    "Tiberia",
                                    "Timea",
                                    "Tinca",
                                    "Tincu\u021Ba",
                                    "Tudora",
                                    "Tudori\u021Ba",
                                    "Tudosia",
                                    "Valentina",
                                    "Valeria",
                                    "Vanesa",
                                    "Varvara",
                                    "Vasilica",
                                    "Venera",
                                    "Vera",
                                    "Veronica",
                                    "Veta",
                                    "Vicen\u021Bia",
                                    "Victoria",
                                    "Violeta",
                                    "Viorela",
                                    "Viorica",
                                    "Virginia",
                                    "Viviana",
                                    "Voichi\u021Ba",
                                    "Xenia",
                                    "Zaharia",
                                    "Zamfira",
                                    "Zaraza",
                                    "Zenobia",
                                    "Zenovia",
                                    "Zina",
                                    "Zoe");
                        });

        public Object firstNameMale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Achim",
                                    "Adam",
                                    "Adelin",
                                    "Adonis",
                                    "Adrian",
                                    "Adi",
                                    "Agnos",
                                    "Albert",
                                    "Alex",
                                    "Alexandru",
                                    "Alexe",
                                    "Aleodor",
                                    "Alin",
                                    "Alistar",
                                    "Amedeu",
                                    "Amza",
                                    "Anatolie",
                                    "Andrei",
                                    "Angel",
                                    "Anghel",
                                    "Antim",
                                    "Anton",
                                    "Antonie",
                                    "Antoniu",
                                    "Arian",
                                    "Aristide",
                                    "Arsenie",
                                    "Augustin",
                                    "Aurel",
                                    "Aurelian",
                                    "Auric\u0103",
                                    "Avram",
                                    "Axinte",
                                    "Barbu",
                                    "Bartolomeu",
                                    "Basarab",
                                    "B\u0103nel",
                                    "Bebe",
                                    "Beniamin",
                                    "Benone",
                                    "Bernard",
                                    "Bogdan",
                                    "Br\u0103du\u021B",
                                    "Bucur",
                                    "Caius",
                                    "Camil",
                                    "Cantemir",
                                    "Carol",
                                    "Casian",
                                    "Cazimir",
                                    "C\u0103lin",
                                    "C\u0103t\u0103lin",
                                    "Cedrin",
                                    "Cezar",
                                    "Ciprian",
                                    "Claudiu",
                                    "Codin",
                                    "Codrin",
                                    "Codru\u021B",
                                    "Cornel",
                                    "Corneliu",
                                    "Corvin",
                                    "Constantin",
                                    "Cosmin",
                                    "Costache",
                                    "Costel",
                                    "Costin",
                                    "Crin",
                                    "Cristea",
                                    "Cristian",
                                    "Cristobal",
                                    "Cristofor",
                                    "Dacian",
                                    "Damian",
                                    "Dan",
                                    "Daniel",
                                    "Darius",
                                    "David",
                                    "Decebal",
                                    "Denis",
                                    "Dinu",
                                    "Dominic",
                                    "Dorel",
                                    "Dorian",
                                    "Dorin",
                                    "Dorinel",
                                    "Doru",
                                    "Drago\u0219",
                                    "Ducu",
                                    "Dumitru",
                                    "Edgar",
                                    "Edmond",
                                    "Eduard",
                                    "Eftimie",
                                    "Emil",
                                    "Emilian",
                                    "Emanoil",
                                    "Emanuel",
                                    "Emanuil",
                                    "Eremia",
                                    "Eric",
                                    "Ernest",
                                    "Eugen",
                                    "Eusebiu",
                                    "Eusta\u021Biu",
                                    "Fabian",
                                    "Felix",
                                    "Filip",
                                    "Fiodor",
                                    "Flaviu",
                                    "Florea",
                                    "Florentin",
                                    "Florian",
                                    "Florin",
                                    "Francisc",
                                    "Frederic",
                                    "Gabi",
                                    "Gabriel",
                                    "Gelu",
                                    "George",
                                    "Georgel",
                                    "Georgian",
                                    "Ghenadie",
                                    "Gheorghe",
                                    "Gheorghi\u021B\u0103",
                                    "Ghi\u021B\u0103",
                                    "Gic\u0103",
                                    "Gicu",
                                    "Giorgian",
                                    "Gra\u021Bian",
                                    "Gregorian",
                                    "Grigore",
                                    "Haralamb",
                                    "Haralambie",
                                    "Hora\u021Biu",
                                    "Horea",
                                    "Horia",
                                    "Iacob",
                                    "Iancu",
                                    "Ianis",
                                    "Ieremia",
                                    "Ilarie",
                                    "Ilarion",
                                    "Ilie",
                                    "Inocen\u021Biu",
                                    "Ioan",
                                    "Ion",
                                    "Ionel",
                                    "Ionic\u0103",
                                    "Ionu\u021B",
                                    "Iosif",
                                    "Irinel",
                                    "Iulian",
                                    "Iuliu",
                                    "Iurie",
                                    "Iustin",
                                    "Iustinian",
                                    "Ivan",
                                    "Jan",
                                    "Jean",
                                    "Jenel",
                                    "Ladislau",
                                    "Lasc\u0103r",
                                    "Lauren\u021Biu",
                                    "Laurian",
                                    "Laz\u0103r",
                                    "Leonard",
                                    "Leontin",
                                    "Lic\u0103",
                                    "Liviu",
                                    "Lorin",
                                    "Luca",
                                    "Lucen\u021Biu",
                                    "Lucian",
                                    "Lucre\u021Biu",
                                    "Ludovic",
                                    "Manole",
                                    "Marcel",
                                    "Marcu",
                                    "Marian",
                                    "Marin",
                                    "Marius",
                                    "Martin",
                                    "Matei",
                                    "Maxim",
                                    "Maximilian",
                                    "M\u0103d\u0103lin",
                                    "Mihai",
                                    "Mihail",
                                    "Mihnea",
                                    "Mircea",
                                    "Miron",
                                    "Mitic\u0103",
                                    "Mitru\u021B",
                                    "Mugur",
                                    "Mugurel",
                                    "Nae",
                                    "Narcis",
                                    "Nechifor",
                                    "Nelu",
                                    "Nichifor",
                                    "Nicoar\u0103",
                                    "Nicodim",
                                    "Nicolae",
                                    "Nicolaie",
                                    "Nicu",
                                    "Nicu\u021B\u0103",
                                    "Niculi\u021B\u0103",
                                    "Nicu\u0219or",
                                    "Norbert",
                                    "Norman",
                                    "Octav",
                                    "Octavian",
                                    "Octaviu",
                                    "Olimpian",
                                    "Olimpiu",
                                    "Oliviu",
                                    "Ovidiu",
                                    "Pamfil",
                                    "Panait",
                                    "Panagachie",
                                    "Paul",
                                    "Pavel",
                                    "P\u0103tru",
                                    "Petre",
                                    "Petric\u0103",
                                    "Petri\u0219or",
                                    "Petru",
                                    "Petru\u021B",
                                    "Pompiliu",
                                    "Radu",
                                    "Rafael",
                                    "Rare\u0219",
                                    "Raul",
                                    "R\u0103ducu",
                                    "R\u0103zvan",
                                    "Relu",
                                    "Remus",
                                    "Robert",
                                    "Romeo",
                                    "Romulus",
                                    "Sabin",
                                    "Sandu",
                                    "Sava",
                                    "Sebastian",
                                    "Sergiu",
                                    "Sever",
                                    "Severin",
                                    "Silvian",
                                    "Silviu",
                                    "Simi",
                                    "Simion",
                                    "Sinic\u0103",
                                    "Sorin",
                                    "Stan",
                                    "Stancu",
                                    "Stelian",
                                    "Sandu",
                                    "\u0218erban",
                                    "\u0218tefan",
                                    "Teodor",
                                    "Teofil",
                                    "Teohari",
                                    "Theodor",
                                    "Tiberiu",
                                    "Timotei",
                                    "Titus",
                                    "Todor",
                                    "Toma",
                                    "Traian",
                                    "Tudor",
                                    "Valentin",
                                    "Valeriu",
                                    "Valter",
                                    "Vasile",
                                    "Vasilic\u0103",
                                    "Veniamin",
                                    "Vicen\u021Biu",
                                    "Victor",
                                    "Vincen\u021Biu",
                                    "Viorel",
                                    "Visarion",
                                    "Vlad",
                                    "Vladimir",
                                    "Vlaicu",
                                    "Voicu",
                                    "Zamfir",
                                    "Zeno");
                        });

        public Object lastName =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Achim",
                                    "Adam",
                                    "Albu",
                                    "Aldea",
                                    "Alexa",
                                    "Alexandrescu",
                                    "Alexandru",
                                    "Alexe",
                                    "Andrei",
                                    "Anghel",
                                    "Antal",
                                    "Anton",
                                    "Apostol",
                                    "Ardelean",
                                    "Ardeleanu",
                                    "Avram",
                                    "Baciu",
                                    "Badea",
                                    "Balan",
                                    "Balint",
                                    "Banica",
                                    "Banu",
                                    "Barbu",
                                    "Barbulescu",
                                    "Bejan",
                                    "Biro",
                                    "Blaga",
                                    "Boboc",
                                    "Bodea",
                                    "Bogdan",
                                    "Bota",
                                    "Botezatu",
                                    "Bratu",
                                    "Bucur",
                                    "Buda",
                                    "Bunea",
                                    "Burlacu",
                                    "Calin",
                                    "Catana",
                                    "Cazacu",
                                    "Chiriac",
                                    "Chirila",
                                    "Chirita",
                                    "Chis",
                                    "Chivu",
                                    "Ciobanu",
                                    "Ciocan",
                                    "Cojocaru",
                                    "Coman",
                                    "Constantin",
                                    "Constantinescu",
                                    "Cornea",
                                    "Cosma",
                                    "Costache",
                                    "Costea",
                                    "Costin",
                                    "Covaci",
                                    "Cozma",
                                    "Craciun",
                                    "Cretu",
                                    "Crisan",
                                    "Cristea",
                                    "Cristescu",
                                    "Croitoru",
                                    "Cucu",
                                    "Damian",
                                    "Dan",
                                    "Danciu",
                                    "Danila",
                                    "Dascalu",
                                    "David",
                                    "Diaconescu",
                                    "Diaconu",
                                    "Dima",
                                    "Dinca",
                                    "Dinu",
                                    "Dobre",
                                    "Dobrescu",
                                    "Dogaru",
                                    "Dragan",
                                    "Draghici",
                                    "Dragoi",
                                    "Dragomir",
                                    "Dumitrache",
                                    "Dumitrascu",
                                    "Dumitrescu",
                                    "Dumitriu",
                                    "Dumitru",
                                    "Duta",
                                    "Enache",
                                    "Ene",
                                    "Farcas",
                                    "Filimon",
                                    "Filip",
                                    "Florea",
                                    "Florescu",
                                    "Fodor",
                                    "Fratila",
                                    "Gabor",
                                    "Gal",
                                    "Ganea",
                                    "Gavrila",
                                    "Georgescu",
                                    "Gheorghe",
                                    "Gheorghita",
                                    "Gheorghiu",
                                    "Gherman",
                                    "Ghita",
                                    "Giurgiu",
                                    "Grecu",
                                    "Grigoras",
                                    "Grigore",
                                    "Grigorescu",
                                    "Grosu",
                                    "Groza",
                                    "Horvath",
                                    "Iacob",
                                    "Iancu",
                                    "Ichim",
                                    "Ignat",
                                    "Ilie",
                                    "Iliescu",
                                    "Ion",
                                    "Ionescu",
                                    "Ionita",
                                    "Iordache",
                                    "Iorga",
                                    "Iosif",
                                    "Irimia",
                                    "Ispas",
                                    "Istrate",
                                    "Ivan",
                                    "Ivascu",
                                    "Kiss",
                                    "Kovacs",
                                    "Lazar",
                                    "Luca",
                                    "Lungu",
                                    "Lupu",
                                    "Macovei",
                                    "Maftei",
                                    "Man",
                                    "Manea",
                                    "Manolache",
                                    "Manole",
                                    "Marcu",
                                    "Marginean",
                                    "Marian",
                                    "Marin",
                                    "Marinescu",
                                    "Martin",
                                    "Mateescu",
                                    "Matei",
                                    "Maxim",
                                    "Mazilu",
                                    "Micu",
                                    "Mihai",
                                    "Mihaila",
                                    "Mihailescu",
                                    "Mihalache",
                                    "Mihalcea",
                                    "Milea",
                                    "Militaru",
                                    "Mircea",
                                    "Mirea",
                                    "Miron",
                                    "Miu",
                                    "Mocanu",
                                    "Moga",
                                    "Moise",
                                    "Moldovan",
                                    "Moldoveanu",
                                    "Molnar",
                                    "Morar",
                                    "Moraru",
                                    "Muntean",
                                    "Munteanu",
                                    "Muresan",
                                    "Musat",
                                    "Nagy",
                                    "Nastase",
                                    "Neacsu",
                                    "Neagoe",
                                    "Neagu",
                                    "Neamtu",
                                    "Nechita",
                                    "Necula",
                                    "Nedelcu",
                                    "Negoita",
                                    "Negrea",
                                    "Negru",
                                    "Nemes",
                                    "Nica",
                                    "Nicoara",
                                    "Nicolae",
                                    "Nicolescu",
                                    "Niculae",
                                    "Niculescu",
                                    "Nistor",
                                    "Nita",
                                    "Nitu",
                                    "Oancea",
                                    "Olariu",
                                    "Olaru",
                                    "Oltean",
                                    "Olteanu",
                                    "Oprea",
                                    "Opris",
                                    "Paduraru",
                                    "Pana",
                                    "Panait",
                                    "Paraschiv",
                                    "Parvu",
                                    "Pasca",
                                    "Pascu",
                                    "Patrascu",
                                    "Paun",
                                    "Pavel",
                                    "Petcu",
                                    "Peter",
                                    "Petre",
                                    "Petrea",
                                    "Petrescu",
                                    "Pintea",
                                    "Pintilie",
                                    "Pirvu",
                                    "Pop",
                                    "Popa",
                                    "Popescu",
                                    "Popovici",
                                    "Preda",
                                    "Prodan",
                                    "Puiu",
                                    "Radoi",
                                    "Radu",
                                    "Radulescu",
                                    "Roman",
                                    "Rosca",
                                    "Rosu",
                                    "Rotaru",
                                    "Rus",
                                    "Rusu",
                                    "Sabau",
                                    "Sandor",
                                    "Sandu",
                                    "Sarbu",
                                    "Sava",
                                    "Savu",
                                    "Serban",
                                    "Sima",
                                    "Simion",
                                    "Simionescu",
                                    "Simon",
                                    "Sirbu",
                                    "Soare",
                                    "Solomon",
                                    "Staicu",
                                    "Stan",
                                    "Stanciu",
                                    "Stancu",
                                    "Stanescu",
                                    "Stefan",
                                    "Stefanescu",
                                    "Stoian",
                                    "Stoica",
                                    "Stroe",
                                    "Suciu",
                                    "Szabo",
                                    "Szasz",
                                    "Szekely",
                                    "Tamas",
                                    "Tanase",
                                    "Tataru",
                                    "Teodorescu",
                                    "Toader",
                                    "Toma",
                                    "Tomescu",
                                    "Toth",
                                    "Trandafir",
                                    "Trif",
                                    "Trifan",
                                    "Tudor",
                                    "Tudorache",
                                    "Tudose",
                                    "Turcu",
                                    "Ungureanu",
                                    "Ursu",
                                    "Vaduva",
                                    "Varga",
                                    "Vasile",
                                    "Vasilescu",
                                    "Vasiliu",
                                    "Veres",
                                    "Vintila",
                                    "Visan",
                                    "Vlad",
                                    "Voicu",
                                    "Voinea",
                                    "Zaharia",
                                    "Zamfir");
                        });

        public Object titleMale = ZVal.arrayFromList("dl.", "ing.", "dr.");

        public Object titleFemale = ZVal.arrayFromList("d-na.", "d-\u0219oara", "ing.", "dr.");

        public Object cnpCountyCodes =
                ZVal.newArray(
                        new ZPair("AB", "01"),
                        new ZPair("AR", "02"),
                        new ZPair("AG", "03"),
                        new ZPair("B", "40"),
                        new ZPair("BC", "04"),
                        new ZPair("BH", "05"),
                        new ZPair("BN", "06"),
                        new ZPair("BT", "07"),
                        new ZPair("BV", "08"),
                        new ZPair("BR", "09"),
                        new ZPair("BZ", "10"),
                        new ZPair("CS", "11"),
                        new ZPair("CL", "51"),
                        new ZPair("CJ", "12"),
                        new ZPair("CT", "13"),
                        new ZPair("CV", "14"),
                        new ZPair("DB", "15"),
                        new ZPair("DJ", "16"),
                        new ZPair("GL", "17"),
                        new ZPair("GR", "52"),
                        new ZPair("GJ", "18"),
                        new ZPair("HR", "19"),
                        new ZPair("HD", "20"),
                        new ZPair("IL", "21"),
                        new ZPair("IS", "22"),
                        new ZPair("IF", "23"),
                        new ZPair("MM", "24"),
                        new ZPair("MH", "25"),
                        new ZPair("MS", "26"),
                        new ZPair("NT", "27"),
                        new ZPair("OT", "28"),
                        new ZPair("PH", "29"),
                        new ZPair("SM", "30"),
                        new ZPair("SJ", "31"),
                        new ZPair("SB", "32"),
                        new ZPair("SV", "33"),
                        new ZPair("TR", "34"),
                        new ZPair("TM", "35"),
                        new ZPair("TL", "36"),
                        new ZPair("VS", "37"),
                        new ZPair("VL", "38"),
                        new ZPair("VN", "39"),
                        new ZPair("B1", "41"),
                        new ZPair("B2", "42"),
                        new ZPair("B3", "43"),
                        new ZPair("B4", "44"),
                        new ZPair("B5", "45"),
                        new ZPair("B6", "46"));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\ro_RO\\Person")
                    .setLookup(
                            Person.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "cnpCountyCodes",
                            "femaleNameFormats",
                            "firstNameFemale",
                            "firstNameMale",
                            "lastName",
                            "maleNameFormats",
                            "titleFemale",
                            "titleMale")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/ro_RO/Person.php")
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

    private enum SwitchEnumType14 {
        INTEGER_1,
        INTEGER_2,
        INTEGER_3,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
