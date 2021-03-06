package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.en_UG.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/en_UG/Person.php

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
        }

        if (ZVal.strictEqualityCheck(
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
                                                                .en_UG
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
                                                        .en_UG
                                                        .classes
                                                        .Person
                                                        .RequestStaticProperties
                                                        .class)
                                        .lastName)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\en_UG\\Person";

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
                                                            .en_UG
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
                                                            .en_UG
                                                            .classes
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .lastNameFemale)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object maleNameFormats =
                ZVal.arrayFromList(
                        "{{firstNameMale}} {{lastName}}",
                        "{{lastName}} {{firstNameMale}}",
                        "{{firstNameMale}} {{lastNameMale}}",
                        "{{lastNameMale}} {{firstNameMale}}");

        public Object femaleNameFormats =
                ZVal.arrayFromList(
                        "{{firstNameFemale}} {{lastName}}",
                        "{{lastName}} {{firstNameFemale}}",
                        "{{firstNameFemale}} {{lastNameFemale}}",
                        "{{lastNameFemale}} {{firstNameFemale}}");

        public Object firstNameMale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Aaron",
                                    "Abdul",
                                    "Abdullah",
                                    "Abraham",
                                    "Adam",
                                    "Agustin",
                                    "Ahmad",
                                    "Ahmed",
                                    "Akeem",
                                    "Albert",
                                    "Alex",
                                    "Alfred",
                                    "Ali",
                                    "Allan",
                                    "Allen",
                                    "Alvin",
                                    "Amani",
                                    "Ambrose",
                                    "Amos",
                                    "Anderson",
                                    "Andrew",
                                    "Angel",
                                    "Anthony",
                                    "Arnold",
                                    "Arthur",
                                    "Austin",
                                    "Barnet",
                                    "Barry",
                                    "Ben",
                                    "Benjamin",
                                    "Bennie",
                                    "Benny",
                                    "Bernard",
                                    "Berry",
                                    "Berta",
                                    "Bertha",
                                    "Bill",
                                    "Billy",
                                    "Bobby",
                                    "Boyd",
                                    "Bradley",
                                    "Brian",
                                    "Bruce",
                                    "Caesar",
                                    "Caleb",
                                    "Carol",
                                    "Cecil",
                                    "Charles",
                                    "Charlie",
                                    "Chris",
                                    "Christian",
                                    "Christopher",
                                    "Cleveland",
                                    "Clifford",
                                    "Clinton",
                                    "Collin",
                                    "Conrad",
                                    "Dan",
                                    "Daren",
                                    "Dave",
                                    "David",
                                    "Dax",
                                    "Denis",
                                    "Dennis",
                                    "Derek",
                                    "Derick",
                                    "Derrick",
                                    "Don",
                                    "Donald",
                                    "Douglas",
                                    "Dylan",
                                    "Earnest",
                                    "Eddie",
                                    "Edgar",
                                    "Edison",
                                    "Edmond",
                                    "Edmund",
                                    "Edward",
                                    "Edwin",
                                    "Elias",
                                    "Elijah",
                                    "Elliot",
                                    "Emanuel",
                                    "Emmanuel",
                                    "Eric",
                                    "Ernest",
                                    "Ethan",
                                    "Eugene",
                                    "Ezra",
                                    "Felix",
                                    "Francis",
                                    "Frank",
                                    "Frankie",
                                    "Fred",
                                    "Gaetano",
                                    "Gaston",
                                    "Gavin",
                                    "Geoffrey",
                                    "George",
                                    "Gerald",
                                    "Gideon",
                                    "Gilbert",
                                    "Glen",
                                    "Godfrey",
                                    "Graham",
                                    "Gregory",
                                    "Hans",
                                    "Harold",
                                    "Henry",
                                    "Herbert",
                                    "Herman",
                                    "Hillary",
                                    "Howard",
                                    "Ian",
                                    "Isaac",
                                    "Isaiah",
                                    "Ismael",
                                    "Jabari",
                                    "Jack",
                                    "Jackson",
                                    "Jacob",
                                    "Jamaal",
                                    "Jamal",
                                    "Jasper",
                                    "Jayson",
                                    "Jeff",
                                    "Jeffery",
                                    "Jeremy",
                                    "Jimmy",
                                    "Joe",
                                    "Joel",
                                    "Joesph",
                                    "Johathan",
                                    "John",
                                    "Johnathan",
                                    "Johnny",
                                    "Johnson",
                                    "Jonathan",
                                    "Jordan",
                                    "Joseph",
                                    "Joshua",
                                    "Julian",
                                    "Julio",
                                    "Julius",
                                    "Junior",
                                    "Kaleb",
                                    "Keith",
                                    "Kelly",
                                    "Kelvin",
                                    "Ken",
                                    "Kennedy",
                                    "Kenneth",
                                    "Kevin",
                                    "Kim",
                                    "Lawrence",
                                    "Lewis",
                                    "Lincoln",
                                    "Lloyd",
                                    "Luis",
                                    "Luther",
                                    "Mackenzie",
                                    "Martin",
                                    "Marvin",
                                    "Mathew",
                                    "Mathias",
                                    "Matt",
                                    "Maurice",
                                    "Max",
                                    "Maxwell",
                                    "Mckenzie",
                                    "Micheal",
                                    "Mike",
                                    "Milton",
                                    "Mitchel",
                                    "Mitchell",
                                    "Mohamed",
                                    "Mohammad",
                                    "Mohammed",
                                    "Morris",
                                    "Moses",
                                    "Muhammad",
                                    "Myles",
                                    "Nasir",
                                    "Nat",
                                    "Nathan",
                                    "Newton",
                                    "Nicholas",
                                    "Nick",
                                    "Nicklaus",
                                    "Nickolas",
                                    "Nicolas",
                                    "Noah",
                                    "Norbert",
                                    "Oscar",
                                    "Owen",
                                    "Patrick",
                                    "Paul",
                                    "Peter",
                                    "Philip",
                                    "Rashad",
                                    "Rasheed",
                                    "Raul",
                                    "Ray",
                                    "Raymond",
                                    "Reagan",
                                    "Regan",
                                    "Richard",
                                    "Richie",
                                    "Rick",
                                    "Robb",
                                    "Robbie",
                                    "Robert",
                                    "Robin",
                                    "Roger",
                                    "Rogers",
                                    "Ronald",
                                    "Rowland",
                                    "Royal",
                                    "Ryan",
                                    "Sam",
                                    "Samson",
                                    "Sean",
                                    "Shawn",
                                    "Sid",
                                    "Sidney",
                                    "Solomon",
                                    "Steve",
                                    "Stevie",
                                    "Stewart",
                                    "Stuart",
                                    "Taylor",
                                    "Theodore",
                                    "Thomas",
                                    "Timmy",
                                    "Timothy",
                                    "Titus",
                                    "Tom",
                                    "Tony",
                                    "Travis",
                                    "Trevor",
                                    "Troy",
                                    "Trystan",
                                    "Tyler",
                                    "Tyson",
                                    "Victor",
                                    "Vince",
                                    "Vincent",
                                    "Vinnie",
                                    "Walter",
                                    "Warren",
                                    "Wilford",
                                    "Wilfred",
                                    "Will",
                                    "William",
                                    "Willis",
                                    "Willy",
                                    "Wilson");
                        });

        public Object firstNameFemale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Abigail",
                                    "Adela",
                                    "Adrianna",
                                    "Adrienne",
                                    "Aisha",
                                    "Alice",
                                    "Alisha",
                                    "Alison",
                                    "Amanda",
                                    "Amelia",
                                    "Amina",
                                    "Amy",
                                    "Anabel",
                                    "Anabelle",
                                    "Angela",
                                    "Angelina",
                                    "Angie",
                                    "Anita",
                                    "Anna",
                                    "Annamarie",
                                    "Anne",
                                    "Annette",
                                    "April",
                                    "Arianna",
                                    "Ariela",
                                    "Asha",
                                    "Ashley",
                                    "Ashly",
                                    "Audrey",
                                    "Aurelia",
                                    "Barbara",
                                    "Beatrice",
                                    "Bella",
                                    "Bernadette",
                                    "Beth",
                                    "Bethany",
                                    "Bethel",
                                    "Betsy",
                                    "Bette",
                                    "Bettie",
                                    "Betty",
                                    "Blanche",
                                    "Bonita",
                                    "Bonnie",
                                    "Brenda",
                                    "Bridget",
                                    "Bridgette",
                                    "Carissa",
                                    "Carol",
                                    "Carole",
                                    "Carolina",
                                    "Caroline",
                                    "Carolyn",
                                    "Carolyne",
                                    "Catharine",
                                    "Catherine",
                                    "Cathrine",
                                    "Cathryn",
                                    "Cathy",
                                    "Cecelia",
                                    "Cecile",
                                    "Cecilia",
                                    "Charity",
                                    "Charlotte",
                                    "Chloe",
                                    "Christina",
                                    "Christine",
                                    "Cindy",
                                    "Claire",
                                    "Clara",
                                    "Clarissa",
                                    "Claudine",
                                    "Cristal",
                                    "Crystal",
                                    "Cynthia",
                                    "Dahlia",
                                    "Daisy",
                                    "Daniela",
                                    "Daniella",
                                    "Danielle",
                                    "Daphne",
                                    "Daphnee",
                                    "Daphney",
                                    "Darlene",
                                    "Deborah",
                                    "Destiny",
                                    "Diana",
                                    "Dianna",
                                    "Dina",
                                    "Dolly",
                                    "Dolores",
                                    "Donna",
                                    "Dora",
                                    "Dorothy",
                                    "Dorris",
                                    "Edna",
                                    "Edwina",
                                    "Edyth",
                                    "Elizabeth",
                                    "Ella",
                                    "Ellen",
                                    "Elsa",
                                    "Elsie",
                                    "Emelia",
                                    "Emilia",
                                    "Emilie",
                                    "Emily",
                                    "Emma",
                                    "Emmanuelle",
                                    "Erica",
                                    "Esta",
                                    "Esther",
                                    "Estella",
                                    "Eunice",
                                    "Eva",
                                    "Eve",
                                    "Eveline",
                                    "Evelyn",
                                    "Fabiola",
                                    "Fatima",
                                    "Fiona",
                                    "Flavia",
                                    "Flo",
                                    "Florence",
                                    "Frances",
                                    "Francesca",
                                    "Francisca",
                                    "Frida",
                                    "Gabriella",
                                    "Gabrielle",
                                    "Genevieve",
                                    "Georgiana",
                                    "Geraldine",
                                    "Gertrude",
                                    "Gladys",
                                    "Gloria",
                                    "Grace",
                                    "Gracie",
                                    "Helen",
                                    "Hellen",
                                    "Hilda",
                                    "Hillary",
                                    "Hope",
                                    "Imelda",
                                    "Isabel",
                                    "Isabell",
                                    "Isabella",
                                    "Isabelle",
                                    "Jackie",
                                    "Jacklyn",
                                    "Jacky",
                                    "Jaclyn",
                                    "Jacquelyn",
                                    "Jane",
                                    "Janelle",
                                    "Janet",
                                    "Jaquelin",
                                    "Jaqueline",
                                    "Jenifer",
                                    "Jennifer",
                                    "Jessica",
                                    "Joan",
                                    "Josephine",
                                    "Joy",
                                    "Joyce",
                                    "Juanita",
                                    "Julia",
                                    "Juliana",
                                    "Julie",
                                    "Juliet",
                                    "Justine",
                                    "Katarina",
                                    "Katherine",
                                    "Katheryn",
                                    "Katrina",
                                    "Laura",
                                    "Leah",
                                    "Leila",
                                    "Lilian",
                                    "Lillian",
                                    "Lilly",
                                    "Lina",
                                    "Linda",
                                    "Lisa",
                                    "Lora",
                                    "Loraine",
                                    "Lucie",
                                    "Lucy",
                                    "Lulu",
                                    "Lydia",
                                    "Mabel",
                                    "Maggie",
                                    "Mandy",
                                    "Margaret",
                                    "Margarete",
                                    "Margret",
                                    "Maria",
                                    "Mariah",
                                    "Mariam",
                                    "Marian",
                                    "Mariana",
                                    "Mariane",
                                    "Marianna",
                                    "Marianne",
                                    "Marie",
                                    "Marilyne",
                                    "Marina",
                                    "Marion",
                                    "Marjorie",
                                    "Marjory",
                                    "Marlene",
                                    "Mary",
                                    "Matilda",
                                    "Maudie",
                                    "Maureen",
                                    "Maya",
                                    "Meagan",
                                    "Melisa",
                                    "Melissa",
                                    "Melody",
                                    "Michele",
                                    "Michelle",
                                    "Minerva",
                                    "Minnie",
                                    "Miracle",
                                    "Monica",
                                    "Nadia",
                                    "Naomi",
                                    "Naomie",
                                    "Natalia",
                                    "Natalie",
                                    "Natasha",
                                    "Nichole",
                                    "Nicole",
                                    "Nina",
                                    "Nora",
                                    "Pamela",
                                    "Patience",
                                    "Patricia",
                                    "Pauline",
                                    "Pearl",
                                    "Phoebe",
                                    "Phyllis",
                                    "Pink",
                                    "Pinkie",
                                    "Priscilla",
                                    "Prudence",
                                    "Rachael",
                                    "Rachel",
                                    "Rebeca",
                                    "Rebecca",
                                    "Rhoda",
                                    "Rita",
                                    "Robyn",
                                    "Rose",
                                    "Rosemary",
                                    "Ruth",
                                    "Ruthe",
                                    "Ruthie",
                                    "Sabina",
                                    "Sabrina",
                                    "Salma",
                                    "Samantha",
                                    "Sandra",
                                    "Sandy",
                                    "Sarah",
                                    "Serena",
                                    "Shakira",
                                    "Sharon",
                                    "Sheila",
                                    "Sierra",
                                    "Sonia",
                                    "Sonya",
                                    "Sophia",
                                    "Sophie",
                                    "Stacey",
                                    "Stacy",
                                    "Stella",
                                    "Susan",
                                    "Susana",
                                    "Susanna",
                                    "Susie",
                                    "Suzanne",
                                    "Sylvia",
                                    "Tabitha",
                                    "Teresa",
                                    "Tess",
                                    "Theresa",
                                    "Tia",
                                    "Tiffany",
                                    "Tina",
                                    "Tracy",
                                    "Trinity",
                                    "Trisha",
                                    "Trudie",
                                    "Trycia",
                                    "Ursula",
                                    "Valentine",
                                    "Valerie",
                                    "Vanessa",
                                    "Veronica",
                                    "Vickie",
                                    "Vicky",
                                    "Victoria",
                                    "Viola",
                                    "Violet",
                                    "Violette",
                                    "Viva",
                                    "Vivian",
                                    "Viviane",
                                    "Vivianne",
                                    "Vivien",
                                    "Vivienne",
                                    "Wanda",
                                    "Wendy",
                                    "Whitney",
                                    "Wilma",
                                    "Winifred",
                                    "Yvette",
                                    "Yvonne",
                                    "Zita",
                                    "Zoe");
                        });

        public Object lastNameMale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Mubiru",
                                    "Muwanguzi",
                                    "Muwonge",
                                    "Nsamba",
                                    "Obol",
                                    "Odeke",
                                    "Okumu",
                                    "Okumuringa",
                                    "Opega",
                                    "Opio",
                                    "Orishaba",
                                    "Osiki",
                                    "Ouma",
                                    "Sekandi",
                                    "Semande",
                                    "Serwanga",
                                    "Ssebatta",
                                    "Ssebugulu",
                                    "Ssebunya",
                                    "Ssebuuma",
                                    "Ssebyala",
                                    "Ssegawa",
                                    "Ssekabira",
                                    "Ssekanjako",
                                    "Ssekate",
                                    "Ssekibuule",
                                    "Ssekidde",
                                    "Ssekiranda",
                                    "Ssekitooleko",
                                    "Ssekubulwa",
                                    "Ssempija",
                                    "Ssempungu",
                                    "Ssemwezi",
                                    "Ssendege",
                                    "Ssenjovu",
                                    "Ssenkaali",
                                    "Ssentezza",
                                    "Ssentongo",
                                    "Sserubiri",
                                    "Sseruyinda",
                                    "Ssettende");
                        });

        public Object lastNameFemale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Abol",
                                    "Adeke",
                                    "Aketch",
                                    "Akoth",
                                    "Akumu",
                                    "Aol",
                                    "Apega",
                                    "Apio",
                                    "Auma",
                                    "Awori",
                                    "Ayo",
                                    "Babirye",
                                    "Chandiru",
                                    "Dushime",
                                    "Kabatesi",
                                    "Kabonesa",
                                    "Kaitesi",
                                    "Kakiiza",
                                    "Kakuze",
                                    "Kaliisa",
                                    "Karungi",
                                    "Katusiime",
                                    "Kebirungi",
                                    "Kyomi",
                                    "Kyoshabire",
                                    "Mahoro",
                                    "Murungi",
                                    "Nabaale",
                                    "Nabaggala",
                                    "Nabakooza",
                                    "Nabaloga",
                                    "Nabankema",
                                    "Nabasirye",
                                    "Nabaweesi",
                                    "Nabayunga",
                                    "Nabbona",
                                    "Nabise",
                                    "Nabukeera",
                                    "Nabunya",
                                    "Nabuufu",
                                    "Nabuuso",
                                    "Nabwami",
                                    "Nakaayi",
                                    "Nakabugo",
                                    "Nakabuye",
                                    "Nakafeero",
                                    "Nakalanzi",
                                    "Nakalunda",
                                    "Nakasinde",
                                    "Nakasolya",
                                    "Nakasumba",
                                    "Nakato",
                                    "Nakaweesa",
                                    "Nakazibwe",
                                    "Nakiboneka",
                                    "Nakidde",
                                    "Nakigozi",
                                    "Nakiguli",
                                    "Nakimbugwe",
                                    "Nakimuli",
                                    "Nakinobe",
                                    "Nakiridde",
                                    "Nakisige",
                                    "Nakitende",
                                    "Nakiyemba",
                                    "Nakku",
                                    "Nakyagaba",
                                    "Nakyanzi",
                                    "Nalubuga",
                                    "Nalubwama",
                                    "Nalukwago",
                                    "Naluyima",
                                    "Nalweyiso",
                                    "Nalwoga",
                                    "Namaganda",
                                    "Namagembe",
                                    "Namatovu",
                                    "Nambi",
                                    "Nambogo",
                                    "Nambooze",
                                    "Nambuusi",
                                    "Namenya",
                                    "Namiiro",
                                    "Namirembe",
                                    "Nampemba",
                                    "Nampijja",
                                    "Namubiru",
                                    "Namuddu",
                                    "Namugenyi",
                                    "Namugwanya",
                                    "Namukwaya",
                                    "Namuleme",
                                    "Namulindwa",
                                    "Namutebi",
                                    "Nankindu",
                                    "Nankinga",
                                    "Nanteeza",
                                    "Nantongo",
                                    "Nanvule",
                                    "Nanyanzi",
                                    "Nanyombi",
                                    "Nanyondo",
                                    "Nanyonjo",
                                    "Nassimwba",
                                    "Nazziwa",
                                    "Ndagire");
                        });

        public Object lastName =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Abayisenga",
                                    "Agaba",
                                    "Ahebwe",
                                    "Aisu",
                                    "Akankunda",
                                    "Akankwasa",
                                    "Akashaba",
                                    "Akashabe",
                                    "Ampumuza",
                                    "Ankunda",
                                    "Asasira",
                                    "Asiimwe",
                                    "Atuhe",
                                    "Atuhire",
                                    "Atukunda",
                                    "Atukwase",
                                    "Atwine",
                                    "Aurishaba",
                                    "Badru",
                                    "Baguma",
                                    "Bakabulindi",
                                    "Bamwiine",
                                    "Barigye",
                                    "Bbosa",
                                    "Bisheko",
                                    "Biyinzika",
                                    "Bugala",
                                    "Bukenya",
                                    "Buyinza",
                                    "Bwana",
                                    "Byanyima",
                                    "Byaruhanga",
                                    "Ddamulira",
                                    "Gamwera",
                                    "Ijaga",
                                    "Isyagi",
                                    "Kaaya",
                                    "Kabanda",
                                    "Kabuubi",
                                    "Kabuye",
                                    "Kafeero",
                                    "Kagambira",
                                    "Kakooza",
                                    "Kalumba",
                                    "Kanshabe",
                                    "Kansiime",
                                    "Kanyesigye",
                                    "Kareiga",
                                    "Kasekende",
                                    "Kasumba",
                                    "Kateregga",
                                    "Katusiime",
                                    "Kawooya",
                                    "Kawuki",
                                    "Kayemba",
                                    "Kazibwe",
                                    "Kibirige",
                                    "Kiconco",
                                    "Kiganda",
                                    "Kijjoba",
                                    "Kirabira",
                                    "Kirabo",
                                    "Kirigwajjo",
                                    "Kisitu",
                                    "Kitovu",
                                    "Kityamuwesi",
                                    "Kivumbi",
                                    "Kiwanuka",
                                    "Kyambadde",
                                    "Lunyoro",
                                    "Mbabazi",
                                    "Migisha",
                                    "Mugisa",
                                    "Mugisha",
                                    "Muhwezi",
                                    "Mukalazi",
                                    "Mulalira",
                                    "Munyagwa",
                                    "Murungi",
                                    "Mushabe",
                                    "Musinguzi",
                                    "Mutabuza",
                                    "Muyambi",
                                    "Mwesige",
                                    "Mwesigye",
                                    "Nabasa",
                                    "Nabimanya",
                                    "Nankunda",
                                    "Natukunda",
                                    "Nayebare",
                                    "Nimukunda",
                                    "Ninsiima",
                                    "Nkoojo",
                                    "Nkurunungi",
                                    "Nuwagaba",
                                    "Nuwamanya",
                                    "Nyeko",
                                    "Obol",
                                    "Odeke",
                                    "Okumu",
                                    "Okumuringa",
                                    "Opega",
                                    "Orishaba",
                                    "Osiki",
                                    "Ouma",
                                    "Rubalema",
                                    "Rusiimwa",
                                    "Rwabyoma",
                                    "Tamale",
                                    "Tendo",
                                    "Tizikara",
                                    "Tuhame",
                                    "Tumusiime",
                                    "Tumwebaze",
                                    "Tumwesigye",
                                    "Tumwiine",
                                    "Turyasingura",
                                    "Tusiime",
                                    "Twasiima",
                                    "Twesigomwe",
                                    "Wasswa",
                                    "Wavamuno",
                                    "Were");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\en_UG\\Person")
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
                            "lastNameFemale",
                            "lastNameMale",
                            "maleNameFormats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/en_UG/Person.php")
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
