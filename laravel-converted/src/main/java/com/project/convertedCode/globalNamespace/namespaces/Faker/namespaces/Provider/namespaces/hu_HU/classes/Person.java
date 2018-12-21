package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.hu_HU.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/hu_HU/Person.php

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
    public Object title(RuntimeEnv env, Object... args) {
        Object gender = assignParameter(args, 0, true);
        if (null == gender) {
            gender = ZVal.getNull();
        }
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
                        .method("titleMale")
                        .call()
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\hu_HU\\Person";

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
        public Object titleMale(RuntimeEnv env, Object... args) {
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
                                                            .hu_HU
                                                            .classes
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .title)
                            .value());
        }

        @ConvertedMethod
        public Object firstNameMaleNe(RuntimeEnv env, Object... args) {
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
                                                            .hu_HU
                                                            .classes
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .firstNameMaleNe)
                            .value());
        }

        @ConvertedMethod
        public Object titleFemale(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
                            .method("titleMale")
                            .call()
                            .value());
        }

        @ConvertedMethod
        public Object suffix(RuntimeEnv env, Object... args) {
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
                                                            .hu_HU
                                                            .classes
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .suffix)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object maleNameFormats =
                ZVal.arrayFromList(
                        "{{lastName}} {{firstNameMale}}",
                        "{{title}} {{lastName}} {{firstNameMale}}",
                        "{{lastName}} {{firstNameMale}} {{suffix}}",
                        "{{title}} {{lastName}} {{firstNameMale}} {{suffix}}");

        public Object femaleNameFormats =
                ZVal.arrayFromList(
                        "{{lastName}} {{firstNameFemale}}",
                        "{{title}} {{lastName}} {{firstNameFemale}}",
                        "{{lastName}} {{firstNameFemale}} {{suffix}}",
                        "{{title}} {{lastName}} {{firstNameFemale}} {{suffix}}",
                        "{{lastName}} {{firstNameMaleNe}}",
                        "{{title}} {{lastName}} {{firstNameMaleNe}}");

        public Object firstNameMale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Albert",
                                    "Attila",
                                    "Bal\u00E1zs",
                                    "Bence",
                                    "Botond",
                                    "Dori\u00E1n",
                                    "Endre",
                                    "Ern\u0151",
                                    "G\u00E1bor",
                                    "G\u00E9za",
                                    "Imre",
                                    "Istv\u00E1n",
                                    "Kevin",
                                    "Korn\u00E9l",
                                    "Krist\u00F3f",
                                    "L\u00E1szl\u00F3",
                                    "Mil\u00E1n",
                                    "Noel",
                                    "Oliv\u00E9r",
                                    "Ott\u00F3",
                                    "Patrik",
                                    "P\u00E9ter",
                                    "Rich\u00E1rd",
                                    "Rudolf",
                                    "S\u00E1ndor",
                                    "Vilmos",
                                    "Vince",
                                    "Zolt\u00E1n",
                                    "Zsolt",
                                    "\u00C1d\u00E1m",
                                    "\u00C1rmin",
                                    "\u00C1ron",
                                    "Antal",
                                    "Barna",
                                    "Barnab\u00E1s",
                                    "Bendeg\u00FAz",
                                    "Benedek",
                                    "Hunor",
                                    "Jen\u0151",
                                    "J\u00E1nos",
                                    "Mih\u00E1ly",
                                    "M\u00E1ty\u00E1s",
                                    "Szerv\u00E1c",
                                    "Zsombor",
                                    "Z\u00E9t\u00E9ny",
                                    "\u00C1rp\u00E1d");
                        });

        public Object firstNameMaleNe =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Albertn\u00E9",
                                    "Attil\u00E1n\u00E9",
                                    "Bal\u00E1zsn\u00E9",
                                    "Benc\u00E9n\u00E9",
                                    "Botondn\u00E9",
                                    "Dori\u00E1nn\u00E9",
                                    "Endren\u00E9",
                                    "Ern\u0151n\u00E9",
                                    "G\u00E1born\u00E9",
                                    "G\u00E9zan\u00E9",
                                    "Imr\u00E9n\u00E9",
                                    "Istv\u00E1nn\u00E9",
                                    "Kevinn\u00E9",
                                    "Korn\u00E9ln\u00E9",
                                    "Krist\u00F3fn\u00E9",
                                    "L\u00E1szl\u00F3n\u00E9",
                                    "Mil\u00E1nn\u00E9",
                                    "Noeln\u00E9",
                                    "Oliv\u00E9rn\u00E9",
                                    "Ott\u00F3n\u00E9",
                                    "Patrikn\u00E9",
                                    "P\u00E9tern\u00E9",
                                    "Rich\u00E1rdn\u00E9",
                                    "Rudolfn\u00E9",
                                    "S\u00E1ndorn\u00E9",
                                    "Vilmosn\u00E9",
                                    "Vinc\u00E9n\u00E9",
                                    "Zolt\u00E1nn\u00E9",
                                    "Zsoltn\u00E9",
                                    "\u00C1d\u00E1mn\u00E9",
                                    "\u00C1rminn\u00E9",
                                    "\u00C1ronn\u00E9",
                                    "Antaln\u00E9",
                                    "Barn\u00E1n\u00E9",
                                    "Barnab\u00E1sn\u00E9",
                                    "Bendeg\u00FAz",
                                    "Benedekn\u00E9",
                                    "Hunorn\u00E9",
                                    "Jen\u0151n\u00E9",
                                    "J\u00E1nosn\u00E9",
                                    "Mih\u00E1lyn\u00E9",
                                    "M\u00E1ty\u00E1sn\u00E9",
                                    "Szerv\u00E1cn\u00E9",
                                    "Zsomborn\u00E9",
                                    "Z\u00E9t\u00E9nyn\u00E9",
                                    "\u00C1rp\u00E1dn\u00E9");
                        });

        public Object firstNameFemale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Ad\u00E9l",
                                    "Alexa",
                                    "Andrea",
                                    "Ang\u00E9la",
                                    "Anik\u00F3",
                                    "Beatrix",
                                    "Bettina",
                                    "Dalma",
                                    "Dorina",
                                    "Dorottya",
                                    "Evelin",
                                    "Fanni",
                                    "Fl\u00F3ra",
                                    "Gabriella",
                                    "Georgina",
                                    "Gitta",
                                    "Gizella",
                                    "Gr\u00E9ta",
                                    "Henrietta",
                                    "Izabella",
                                    "Johanna",
                                    "Judit",
                                    "Julianna",
                                    "J\u00E1zmin",
                                    "Kata",
                                    "Katalin",
                                    "Katinka",
                                    "Klaudia",
                                    "K\u00EDra",
                                    "Lili\u00E1na",
                                    "Linda",
                                    "Liza",
                                    "L\u00E9na",
                                    "L\u00EDvia",
                                    "Maja",
                                    "Marianna",
                                    "Marietta",
                                    "Martina",
                                    "Mia",
                                    "Milla",
                                    "Mirella",
                                    "M\u00E1ria",
                                    "M\u00E1rton",
                                    "M\u00EDra",
                                    "Nikoletta",
                                    "Ol\u00EDvia",
                                    "Patr\u00EDcia",
                                    "Ram\u00F3na",
                                    "Rebeka",
                                    "Soma",
                                    "Szandra",
                                    "S\u00E1ra",
                                    "Val\u00E9ria",
                                    "Zita",
                                    "Aranka",
                                    "Bor\u00F3ka",
                                    "Bogl\u00E1rka",
                                    "Csenge",
                                    "Em\u0151ke",
                                    "Erzs\u00E9bet",
                                    "Hanga",
                                    "Henriett",
                                    "Kincs\u0151",
                                    "Panna",
                                    "Szabina",
                                    "Szonja",
                                    "Vir\u00E1g",
                                    "Zs\u00F3ka");
                        });

        public Object lastName =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Antal",
                                    "Bakos",
                                    "Balla",
                                    "Balog",
                                    "Balogh",
                                    "Bal\u00E1zs",
                                    "Barna",
                                    "Barta",
                                    "Bir\u00F3",
                                    "Bodn\u00E1r",
                                    "Bogd\u00E1n",
                                    "Bogn\u00E1r",
                                    "Borb\u00E9ly",
                                    "Boros",
                                    "Budai",
                                    "B\u00E1lint",
                                    "Csonka",
                                    "De\u00E1k",
                                    "Dobos",
                                    "Dud\u00E1s",
                                    "Farag\u00F3",
                                    "Farkas",
                                    "Fazekas",
                                    "Feh\u00E9r",
                                    "Fekete",
                                    "Fodor",
                                    "F\u00E1bi\u00E1n",
                                    "F\u00FCl\u00F6p",
                                    "Guly\u00E1s",
                                    "G\u00E1l",
                                    "G\u00E1sp\u00E1r",
                                    "Hajdu",
                                    "Hal\u00E1sz",
                                    "Heged\u00FCs",
                                    "Heged\u0171s",
                                    "Horv\u00E1th",
                                    "Ill\u00E9s",
                                    "Jakab",
                                    "Juh\u00E1sz",
                                    "J\u00F3n\u00E1s",
                                    "Katona",
                                    "Kelemen",
                                    "Kerekes",
                                    "Kir\u00E1ly",
                                    "Kis",
                                    "Kiss",
                                    "Kocsis",
                                    "Kov\u00E1cs",
                                    "Kozma",
                                    "Lakatos",
                                    "Lengyel",
                                    "Luk\u00E1cs",
                                    "L\u00E1szl\u00F3",
                                    "Magyar",
                                    "Major",
                                    "Moln\u00E1r",
                                    "M\u00E1t\u00E9",
                                    "M\u00E9sz\u00E1ros",
                                    "Nagy",
                                    "Nemes",
                                    "Nov\u00E1k",
                                    "N\u00E9meth",
                                    "Ol\u00E1h",
                                    "Orb\u00E1n",
                                    "Orosz",
                                    "Ors\u00F3s",
                                    "Pap",
                                    "Papp",
                                    "Pataki",
                                    "Pint\u00E9r",
                                    "P\u00E1l",
                                    "P\u00E1sztor",
                                    "P\u00E9ter",
                                    "R\u00E1cz",
                                    "Simon",
                                    "Sipos",
                                    "Somogyi",
                                    "So\u00F3s",
                                    "Szab\u00F3",
                                    "Szalai",
                                    "Szekeres",
                                    "Szil\u00E1gyi",
                                    "Sz\u00E9kely",
                                    "Sz\u00FCcs",
                                    "Sz\u0151ke",
                                    "Sz\u0171cs",
                                    "S\u00E1ndor",
                                    "Tak\u00E1cs",
                                    "Tam\u00E1s",
                                    "T\u00F3th",
                                    "T\u00F6r\u00F6k",
                                    "Varga",
                                    "Vass",
                                    "Veres",
                                    "Vincze",
                                    "Vir\u00E1g",
                                    "V\u00E1radi",
                                    "V\u00E9gh",
                                    "V\u00F6r\u00F6s");
                        });

        public Object title = ZVal.arrayFromList("Dr.", "Prof.", "id.", "ifj.");

        public Object suffix = ZVal.arrayFromList("PhD");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\hu_HU\\Person")
                    .setLookup(
                            Person.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "femaleNameFormats",
                            "firstNameFemale",
                            "firstNameMale",
                            "firstNameMaleNe",
                            "lastName",
                            "maleNameFormats",
                            "suffix",
                            "title")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/hu_HU/Person.php")
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
