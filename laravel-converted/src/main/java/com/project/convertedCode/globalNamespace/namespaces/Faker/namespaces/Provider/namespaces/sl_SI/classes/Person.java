package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.sl_SI.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/sl_SI/Person.php

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
                                                                .sl_SI
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
                                                        .sl_SI
                                                        .classes
                                                        .Person
                                                        .RequestStaticProperties
                                                        .class)
                                        .title)
                        .value());
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
                                                                .sl_SI
                                                                .classes
                                                                .Person
                                                                .RequestStaticProperties
                                                                .class,
                                                        "lastName")))
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
                                                        .sl_SI
                                                        .classes
                                                        .Person
                                                        .RequestStaticProperties
                                                        .class)
                                        .lastName)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\sl_SI\\Person";

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
                                    .sl_SI
                                    .classes
                                    .Person
                                    .class,
                            "lastName"));
        }

        @ConvertedMethod
        public Object lastNameFemale(RuntimeEnv env, Object... args) {
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
                                    .sl_SI
                                    .classes
                                    .Person
                                    .class,
                            "lastName"));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object maleNameFormats =
                ZVal.arrayFromList(
                        "{{firstNameMale}} {{lastName}}",
                        "{{firstNameMale}} {{lastName}}",
                        "{{firstNameMale}} {{lastName}}",
                        "{{firstNameMale}} {{lastName}}",
                        "{{title}} {{firstNameMale}} {{lastName}}");

        public Object femaleNameFormats =
                ZVal.arrayFromList(
                        "{{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}}",
                        "{{title}} {{firstNameFemale}} {{lastName}}");

        public Object firstNameMale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Adam",
                                    "Adolf",
                                    "Albert",
                                    "Albin",
                                    "Aleks",
                                    "Aleksandar",
                                    "Aleksander",
                                    "Aleksej",
                                    "Alen",
                                    "Alex",
                                    "Ale\u0161",
                                    "Alja\u017E",
                                    "Aljo\u0161a",
                                    "Alojz",
                                    "Alojzij",
                                    "Andra\u017E",
                                    "Andrej",
                                    "Anej",
                                    "Anton",
                                    "An\u017Ee",
                                    "Avgust",
                                    "A\u017Ebe",
                                    "Benjamin",
                                    "Bernard",
                                    "Bine",
                                    "Bla\u017E",
                                    "Bogdan",
                                    "Bogomir",
                                    "Bojan",
                                    "Bor",
                                    "Boris",
                                    "Borut",
                                    "Bo\u0161tjan",
                                    "Bo\u017Eidar",
                                    "Branko",
                                    "Brin",
                                    "Bruno",
                                    "Ciril",
                                    "Cvetko",
                                    "Damijan",
                                    "Damir",
                                    "Damjan",
                                    "Daniel",
                                    "Danijel",
                                    "Danilo",
                                    "Darko",
                                    "David",
                                    "Davor",
                                    "Davorin",
                                    "Dejan",
                                    "Denis",
                                    "Domen",
                                    "Dominik",
                                    "Dragan",
                                    "Drago",
                                    "Du\u0161an",
                                    "Edin",
                                    "Edvard",
                                    "Elvis",
                                    "Emil",
                                    "Enej",
                                    "Erazem",
                                    "Erik",
                                    "Ernest",
                                    "Ervin",
                                    "Ferdinand",
                                    "Filip",
                                    "Franc",
                                    "Franci",
                                    "Franjo",
                                    "Fran\u010Di\u0161ek",
                                    "Gaber",
                                    "Gabriel",
                                    "Gal",
                                    "Ga\u0161per",
                                    "Goran",
                                    "Gorazd",
                                    "Grega",
                                    "Gregor",
                                    "Hasan",
                                    "Ian",
                                    "Ignac",
                                    "Igor",
                                    "Ivan",
                                    "Ivo",
                                    "Izak",
                                    "Izidor",
                                    "Iztok",
                                    "Jaka",
                                    "Jakob",
                                    "Jan",
                                    "Janez",
                                    "Jani",
                                    "Janko",
                                    "Jasmin",
                                    "Ja\u0161a",
                                    "Jernej",
                                    "Jon",
                                    "Josip",
                                    "Jo\u0161ko",
                                    "Jo\u0161t",
                                    "Jo\u017Ee",
                                    "Jo\u017Eef",
                                    "Jure",
                                    "Jurij",
                                    "Karel",
                                    "Karl",
                                    "Kevin",
                                    "Klemen",
                                    "Kristijan",
                                    "Kristjan",
                                    "Ladislav",
                                    "Lan",
                                    "Lenart",
                                    "Leon",
                                    "Leopold",
                                    "Liam",
                                    "Lovro",
                                    "Ludvik",
                                    "Luka",
                                    "Lukas",
                                    "Mai",
                                    "Maj",
                                    "Maks",
                                    "Maksimiljan",
                                    "Marcel",
                                    "Marijan",
                                    "Mario",
                                    "Marjan",
                                    "Mark",
                                    "Marko",
                                    "Martin",
                                    "Matej",
                                    "Matev\u017E",
                                    "Matic",
                                    "Matija",
                                    "Matja\u017E",
                                    "Max",
                                    "Metod",
                                    "Miha",
                                    "Mihael",
                                    "Milan",
                                    "Milo\u0161",
                                    "Miran",
                                    "Mirko",
                                    "Miro",
                                    "Miroslav",
                                    "Mirsad",
                                    "Mitja",
                                    "Mladen",
                                    "Nace",
                                    "Nal",
                                    "Nejc",
                                    "Nenad",
                                    "Nik",
                                    "Niko",
                                    "Nikola",
                                    "Nikolaj",
                                    "Nino",
                                    "Oskar",
                                    "O\u017Ebej",
                                    "Patrik",
                                    "Pavel",
                                    "Petar",
                                    "Peter",
                                    "Primo\u017E",
                                    "Rado",
                                    "Radovan",
                                    "Rafael",
                                    "Rajko",
                                    "Renato",
                                    "Rene",
                                    "Robert",
                                    "Rok",
                                    "Roman",
                                    "Rudi",
                                    "Rudolf",
                                    "Samir",
                                    "Samo",
                                    "Sandi",
                                    "Sa\u0161a",
                                    "Sa\u0161o",
                                    "Sebastijan",
                                    "Sebastjan",
                                    "Senad",
                                    "Sergej",
                                    "Silvester",
                                    "Silvo",
                                    "Simon",
                                    "Slavko",
                                    "Slobodan",
                                    "Sre\u010Dko",
                                    "Stanislav",
                                    "Stanko",
                                    "Sta\u0161",
                                    "Stjepan",
                                    "Stojan",
                                    "Svit",
                                    "Tadej",
                                    "Tai",
                                    "Taj",
                                    "Tarik",
                                    "Teo",
                                    "Tev\u017E",
                                    "Tian",
                                    "Tilen",
                                    "Tim",
                                    "Timotej",
                                    "Tine",
                                    "Tja\u0161",
                                    "Toma\u017E",
                                    "Tomislav",
                                    "Tristan",
                                    "Urban",
                                    "Uro\u0161",
                                    "Val",
                                    "Valentin",
                                    "Valter",
                                    "Vid",
                                    "Viktor",
                                    "Viljem",
                                    "Vincenc",
                                    "Vinko",
                                    "Vito",
                                    "Vladimir",
                                    "Vlado",
                                    "Vojko",
                                    "Zdenko",
                                    "Zdravko",
                                    "Zlatko",
                                    "Zoran",
                                    "Zvonko",
                                    "\u0160tefan",
                                    "\u017Dak",
                                    "\u017Dan",
                                    "\u017Deljko",
                                    "\u017Diga");
                        });

        public Object firstNameFemale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Ajda",
                                    "Ajla",
                                    "Albina",
                                    "Aleksandra",
                                    "Alenka",
                                    "Alina",
                                    "Alja",
                                    "Alojzija",
                                    "Amalija",
                                    "Ana Marija",
                                    "Ana",
                                    "Andreja",
                                    "Andrejka",
                                    "Aneja",
                                    "Angela",
                                    "Anica",
                                    "Anika",
                                    "Anita",
                                    "Anja",
                                    "Anka",
                                    "Antonija",
                                    "Barbara",
                                    "Bernarda",
                                    "Blanka",
                                    "Bojana",
                                    "Branka",
                                    "Breda",
                                    "Brigita",
                                    "Brina",
                                    "Cecilija",
                                    "Cvetka",
                                    "Damjana",
                                    "Danica",
                                    "Daniela",
                                    "Danijela",
                                    "Darinka",
                                    "Darja",
                                    "Da\u0161a",
                                    "Doroteja",
                                    "Dragica",
                                    "Du\u0161anka",
                                    "Ela",
                                    "Elena",
                                    "Elizabeta",
                                    "Ella",
                                    "Ema",
                                    "Emilija",
                                    "Erika",
                                    "Erna",
                                    "Eva",
                                    "Fran\u010Di\u0161ka",
                                    "Gabrijela",
                                    "Gaja",
                                    "Gloria",
                                    "Gordana",
                                    "Hana",
                                    "Hedvika",
                                    "Helena",
                                    "Hermina",
                                    "Ida",
                                    "Ines",
                                    "Inja",
                                    "Irena",
                                    "Iris",
                                    "Irma",
                                    "Iva",
                                    "Ivana",
                                    "Ivanka",
                                    "Ivica",
                                    "Iza",
                                    "Izabela",
                                    "Jana",
                                    "Janja",
                                    "Jasmina",
                                    "Jasna",
                                    "Jelena",
                                    "Jelka",
                                    "Jerca",
                                    "Jerneja",
                                    "Jolanda",
                                    "Jo\u017Eefa",
                                    "Jo\u017Eica",
                                    "Julia",
                                    "Julija",
                                    "Julijana",
                                    "Justina",
                                    "Kaja",
                                    "Karin",
                                    "Karmen",
                                    "Karolina",
                                    "Katarina",
                                    "Katja",
                                    "Kiara",
                                    "Kim",
                                    "Klara",
                                    "Klavdija",
                                    "Kristina",
                                    "Ksenija",
                                    "Lana",
                                    "Lara",
                                    "Larisa",
                                    "Laura",
                                    "Lea",
                                    "Leja",
                                    "Lejla",
                                    "Lia",
                                    "Lidija",
                                    "Lili",
                                    "Lilijana",
                                    "Liljana",
                                    "Lina",
                                    "Liza",
                                    "Ljubica",
                                    "Ljudmila",
                                    "Loti",
                                    "Lucija",
                                    "Luna",
                                    "Magda",
                                    "Magdalena",
                                    "Maja",
                                    "Majda",
                                    "Manca",
                                    "Marica",
                                    "Marija",
                                    "Marijana",
                                    "Marina",
                                    "Marinka",
                                    "Marjana",
                                    "Marjanca",
                                    "Marjeta",
                                    "Marjetka",
                                    "Marta",
                                    "Martina",
                                    "Maru\u0161a",
                                    "Mateja",
                                    "Matilda",
                                    "Ma\u0161a",
                                    "Melita",
                                    "Meta",
                                    "Metka",
                                    "Mia",
                                    "Mihaela",
                                    "Mija",
                                    "Mila",
                                    "Milena",
                                    "Milica",
                                    "Milka",
                                    "Mira",
                                    "Mirjam",
                                    "Mirjana",
                                    "Miroslava",
                                    "Mojca",
                                    "Monika",
                                    "Nada",
                                    "Nadja",
                                    "Naja",
                                    "Nastja",
                                    "Natalija",
                                    "Nata\u0161a",
                                    "Neja",
                                    "Neli",
                                    "Nevenka",
                                    "Ne\u017Ea",
                                    "Nika",
                                    "Nikolina",
                                    "Nina",
                                    "Nives",
                                    "Nu\u0161a",
                                    "Olga",
                                    "Patricija",
                                    "Pavla",
                                    "Petra",
                                    "Pia",
                                    "Pika",
                                    "Polona",
                                    "Polonca",
                                    "Rebeka",
                                    "Renata",
                                    "Romana",
                                    "Rozalija",
                                    "Sabina",
                                    "Sandra",
                                    "Sanja",
                                    "Sara",
                                    "Sa\u0161a",
                                    "Silva",
                                    "Simona",
                                    "Slavica",
                                    "Slavka",
                                    "Sofia",
                                    "Sofija",
                                    "Sonja",
                                    "Stanislava",
                                    "Stanka",
                                    "Stela",
                                    "Suzana",
                                    "Tadeja",
                                    "Taja",
                                    "Tajda",
                                    "Tamara",
                                    "Tanja",
                                    "Tara",
                                    "Tatjana",
                                    "Tea",
                                    "Teja",
                                    "Terezija",
                                    "Tia",
                                    "Tiana",
                                    "Tija",
                                    "Tina",
                                    "Tinkara",
                                    "Tisa",
                                    "Tja\u0161a",
                                    "Ula",
                                    "Ur\u0161a",
                                    "Ur\u0161ka",
                                    "Valentina",
                                    "Valerija",
                                    "Vanja",
                                    "Vera",
                                    "Veronika",
                                    "Vesna",
                                    "Vida",
                                    "Viktorija",
                                    "Vita",
                                    "Vlasta",
                                    "Zala",
                                    "Zara",
                                    "Zarja",
                                    "Zdenka",
                                    "Zlatka",
                                    "Zofija",
                                    "Zoja",
                                    "Zora",
                                    "Zvonka",
                                    "\u0160pela",
                                    "\u0160tefanija",
                                    "\u0160tefka",
                                    "\u017Dana",
                                    "\u017Diva");
                        });

        public Object lastName =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Ambro\u017Ei\u010D",
                                    "Babi\u010D",
                                    "Bajc",
                                    "Bergant",
                                    "Bevc",
                                    "Bezjak",
                                    "Bizjak",
                                    "Blatnik",
                                    "Bla\u017Ei\u010D",
                                    "Bogataj",
                                    "Bo\u017Ei\u010D",
                                    "Bregar",
                                    "Breznik",
                                    "Bukovec",
                                    "Cerar",
                                    "Cvetko",
                                    "Debeljak",
                                    "Dem\u0161ar",
                                    "Dolenc",
                                    "Dolinar",
                                    "Dolin\u0161ek",
                                    "Erjavec",
                                    "Er\u017Een",
                                    "Filipi\u010D",
                                    "Fras",
                                    "Furlan",
                                    "Gaj\u0161ek",
                                    "Godec",
                                    "Golob",
                                    "Gomboc",
                                    "Gorenc",
                                    "Gorjup",
                                    "Gregori\u010D",
                                    "Hafner",
                                    "Hod\u017Ei\u0107",
                                    "Horvat",
                                    "Hozjan",
                                    "Ho\u010Devar",
                                    "Hren",
                                    "Hribar",
                                    "Hribernik",
                                    "Hrovat",
                                    "Humar",
                                    "Ili\u0107",
                                    "Ivan\u010Di\u010D",
                                    "Jamnik",
                                    "Jane\u017Ei\u010D",
                                    "Jarc",
                                    "Javornik",
                                    "Jazbec",
                                    "Jelen",
                                    "Jenko",
                                    "Jereb",
                                    "Jeri\u010D",
                                    "Jerman",
                                    "Jovanovi\u0107",
                                    "Jug",
                                    "Kalan",
                                    "Kastelic",
                                    "Kau\u010Di\u010D",
                                    "Kav\u010Di\u010D",
                                    "Klemen\u010Di\u010D",
                                    "Knez",
                                    "Kobal",
                                    "Kocjan\u010Di\u010D",
                                    "Kodri\u010D",
                                    "Kokalj",
                                    "Kokol",
                                    "Kolar",
                                    "Kolari\u010D",
                                    "Kolenc",
                                    "Koren",
                                    "Koro\u0161ec",
                                    "Kos",
                                    "Kosi",
                                    "Kotnik",
                                    "Kova\u010D",
                                    "Kova\u010Devi\u0107",
                                    "Kova\u010Di\u010D",
                                    "Ko\u010Devar",
                                    "Ko\u0161ir",
                                    "Ko\u017Eelj",
                                    "Krajnc",
                                    "Kralj",
                                    "Kramar",
                                    "Kramberger",
                                    "Kranjc",
                                    "Kranjec",
                                    "Kristan",
                                    "Krivec",
                                    "Kuhar",
                                    "Kumer",
                                    "Lah",
                                    "Lavri\u010D",
                                    "Lazar",
                                    "Leban",
                                    "Lebar",
                                    "Lesjak",
                                    "Leskovar",
                                    "Le\u0161nik",
                                    "Likar",
                                    "Logar",
                                    "Majcen",
                                    "Markovi\u0107",
                                    "Markovi\u010D",
                                    "Marolt",
                                    "Mavri\u010D",
                                    "Ma\u010Dek",
                                    "Medved",
                                    "Megli\u010D",
                                    "Miheli\u010D",
                                    "Miklav\u010Di\u010D",
                                    "Mlakar",
                                    "Mlinar",
                                    "Mlinari\u010D",
                                    "Mohori\u010D",
                                    "Mo\u010Dnik",
                                    "Mrak",
                                    "Nemec",
                                    "Nikoli\u0107",
                                    "Novak",
                                    "Oblak",
                                    "Pavlin",
                                    "Pavli\u010D",
                                    "Perko",
                                    "Petek",
                                    "Petri\u010D",
                                    "Petrovi\u0107",
                                    "Petrovi\u010D",
                                    "Pe\u010Dnik",
                                    "Pintar",
                                    "Pintari\u010D",
                                    "Pirc",
                                    "Pirnat",
                                    "Podgor\u0161ek",
                                    "Poga\u010Dar",
                                    "Poga\u010Dnik",
                                    "Popovi\u0107",
                                    "Poto\u010Dnik",
                                    "Pov\u0161e",
                                    "Primo\u017Ei\u010D",
                                    "Pu\u0161nik",
                                    "Rajh",
                                    "Ram\u0161ak",
                                    "Resnik",
                                    "Ribi\u010D",
                                    "Rozman",
                                    "Ro\u017Ei\u010D",
                                    "Ro\u017Eman",
                                    "Rupnik",
                                    "Rus",
                                    "Rutar",
                                    "Savi\u0107",
                                    "Sever",
                                    "Simoni\u010D",
                                    "Sitar",
                                    "Skok",
                                    "Smrekar",
                                    "Stopar",
                                    "Su\u0161nik",
                                    "Tav\u010Dar",
                                    "Toma\u017Ei\u010D",
                                    "Tom\u0161i\u010D",
                                    "Toplak",
                                    "Tratnik",
                                    "Tr\u010Dek",
                                    "Turk",
                                    "Ur\u0161i\u010D",
                                    "Vidic",
                                    "Vidmar",
                                    "Vidovi\u010D",
                                    "Vodopivec",
                                    "Volk",
                                    "Vovk",
                                    "Zadravec",
                                    "Zajc",
                                    "Zakraj\u0161ek",
                                    "Zalar",
                                    "Zalokar",
                                    "Zalo\u017Enik",
                                    "Zemlji\u010D",
                                    "Zorko",
                                    "Zorman",
                                    "Zupan",
                                    "Zupanc",
                                    "Zupan\u010Di\u010D",
                                    "Zver",
                                    "\u010Ceh",
                                    "\u010Cerne",
                                    "\u010Cuk",
                                    "\u0160inkovec",
                                    "\u0160kof",
                                    "\u0160mid",
                                    "\u0160trukelj",
                                    "\u0160u\u0161tar",
                                    "\u017Dagar",
                                    "\u017Deleznik",
                                    "\u017Dibert",
                                    "\u017Di\u017Eek",
                                    "\u017Dnidar\u0161i\u010D");
                        });

        public Object title =
                ZVal.arrayFromList(
                        "dr.",
                        "mag.",
                        "in\u017E.",
                        "univ. dipl.",
                        "dipl.",
                        "univ. dipl. in\u017E.",
                        "dipl. in\u017E.",
                        "prof.",
                        "akad.",
                        "dr. med.",
                        "spec.");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\sl_SI\\Person")
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
                            "title")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/sl_SI/Person.php")
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
