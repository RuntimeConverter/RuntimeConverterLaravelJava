package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.en_GB.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/en_GB/Person.php

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

    public static final Object CONST_class = "Faker\\Provider\\en_GB\\Person";

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

        public Object maleNameFormats = ZVal.arrayFromList("{{firstNameMale}} {{lastName}}");

        public Object femaleNameFormats = ZVal.arrayFromList("{{firstNameFemale}} {{lastName}}");

        public Object firstNameMale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Aaron",
                                    "Adam",
                                    "Adrian",
                                    "Aiden",
                                    "Alan",
                                    "Alex",
                                    "Alexander",
                                    "Alfie",
                                    "Andrew",
                                    "Andy",
                                    "Anthony",
                                    "Archie",
                                    "Arthur",
                                    "Barry",
                                    "Ben",
                                    "Benjamin",
                                    "Bradley",
                                    "Brandon",
                                    "Bruce",
                                    "Callum",
                                    "Cameron",
                                    "Charles",
                                    "Charlie",
                                    "Chris",
                                    "Christian",
                                    "Christopher",
                                    "Colin",
                                    "Connor",
                                    "Craig",
                                    "Dale",
                                    "Damien",
                                    "Dan",
                                    "Daniel",
                                    "Darren",
                                    "Dave",
                                    "David",
                                    "Dean",
                                    "Dennis",
                                    "Dominic",
                                    "Duncan",
                                    "Dylan",
                                    "Edward",
                                    "Elliot",
                                    "Elliott",
                                    "Ethan",
                                    "Finley",
                                    "Frank",
                                    "Fred",
                                    "Freddie",
                                    "Gary",
                                    "Gavin",
                                    "George",
                                    "Gordon",
                                    "Graham",
                                    "Grant",
                                    "Greg",
                                    "Harley",
                                    "Harrison",
                                    "Harry",
                                    "Harvey",
                                    "Henry",
                                    "Ian",
                                    "Isaac",
                                    "Jack",
                                    "Jackson",
                                    "Jacob",
                                    "Jake",
                                    "James",
                                    "Jamie",
                                    "Jason",
                                    "Jayden",
                                    "Jeremy",
                                    "Jim",
                                    "Joe",
                                    "Joel",
                                    "John",
                                    "Jonathan",
                                    "Jordan",
                                    "Joseph",
                                    "Joshua",
                                    "Karl",
                                    "Keith",
                                    "Ken",
                                    "Kevin",
                                    "Kieran",
                                    "Kyle",
                                    "Lee",
                                    "Leo",
                                    "Lewis",
                                    "Liam",
                                    "Logan",
                                    "Louis",
                                    "Lucas",
                                    "Luke",
                                    "Mark",
                                    "Martin",
                                    "Mason",
                                    "Matthew",
                                    "Max",
                                    "Michael",
                                    "Mike",
                                    "Mohammed",
                                    "Muhammad",
                                    "Nathan",
                                    "Neil",
                                    "Nick",
                                    "Noah",
                                    "Oliver",
                                    "Oscar",
                                    "Owen",
                                    "Patrick",
                                    "Paul",
                                    "Pete",
                                    "Peter",
                                    "Philip",
                                    "Quentin",
                                    "Ray",
                                    "Reece",
                                    "Riley",
                                    "Rob",
                                    "Ross",
                                    "Ryan",
                                    "Samuel",
                                    "Scott",
                                    "Sean",
                                    "Sebastian",
                                    "Stefan",
                                    "Stephen",
                                    "Steve",
                                    "Theo",
                                    "Thomas",
                                    "Tim",
                                    "Toby",
                                    "Tom",
                                    "Tony",
                                    "Tyler",
                                    "Wayne",
                                    "Will",
                                    "William",
                                    "Zachary",
                                    "Zach");
                        });

        public Object firstNameFemale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Abbie",
                                    "Abigail",
                                    "Adele",
                                    "Alexa",
                                    "Alexandra",
                                    "Alice",
                                    "Alison",
                                    "Amanda",
                                    "Amber",
                                    "Amelia",
                                    "Amy",
                                    "Anna",
                                    "Ashley",
                                    "Ava",
                                    "Beth",
                                    "Bethany",
                                    "Becky",
                                    "Caitlin",
                                    "Candice",
                                    "Carlie",
                                    "Carmen",
                                    "Carole",
                                    "Caroline",
                                    "Carrie",
                                    "Charlotte",
                                    "Chelsea",
                                    "Chloe",
                                    "Claire",
                                    "Courtney",
                                    "Daisy",
                                    "Danielle",
                                    "Donna",
                                    "Eden",
                                    "Eileen",
                                    "Eleanor",
                                    "Elizabeth",
                                    "Ella",
                                    "Ellie",
                                    "Elsie",
                                    "Emily",
                                    "Emma",
                                    "Erin",
                                    "Eva",
                                    "Evelyn",
                                    "Evie",
                                    "Faye",
                                    "Fiona",
                                    "Florence",
                                    "Francesca",
                                    "Freya",
                                    "Georgia",
                                    "Grace",
                                    "Hannah",
                                    "Heather",
                                    "Helen",
                                    "Helena",
                                    "Hollie",
                                    "Holly",
                                    "Imogen",
                                    "Isabel",
                                    "Isabella",
                                    "Isabelle",
                                    "Isla",
                                    "Isobel",
                                    "Jade",
                                    "Jane",
                                    "Jasmine",
                                    "Jennifer",
                                    "Jessica",
                                    "Joanne",
                                    "Jodie",
                                    "Julia",
                                    "Julie",
                                    "Justine",
                                    "Karen",
                                    "Karlie",
                                    "Katie",
                                    "Keeley",
                                    "Kelly",
                                    "Kimberly",
                                    "Kirsten",
                                    "Kirsty",
                                    "Laura",
                                    "Lauren",
                                    "Layla",
                                    "Leah",
                                    "Leanne",
                                    "Lexi",
                                    "Lilly",
                                    "Lily",
                                    "Linda",
                                    "Lindsay",
                                    "Lisa",
                                    "Lizzie",
                                    "Lola",
                                    "Lucy",
                                    "Maisie",
                                    "Mandy",
                                    "Maria",
                                    "Mary",
                                    "Matilda",
                                    "Megan",
                                    "Melissa",
                                    "Mia",
                                    "Millie",
                                    "Molly",
                                    "Naomi",
                                    "Natalie",
                                    "Natasha",
                                    "Nicole",
                                    "Nikki",
                                    "Olivia",
                                    "Patricia",
                                    "Paula",
                                    "Pauline",
                                    "Phoebe",
                                    "Poppy",
                                    "Rachel",
                                    "Rebecca",
                                    "Rosie",
                                    "Rowena",
                                    "Roxanne",
                                    "Ruby",
                                    "Ruth",
                                    "Sabrina",
                                    "Sally",
                                    "Samantha",
                                    "Sarah",
                                    "Sasha",
                                    "Scarlett",
                                    "Selina",
                                    "Shannon",
                                    "Sienna",
                                    "Sofia",
                                    "Sonia",
                                    "Sophia",
                                    "Sophie",
                                    "Stacey",
                                    "Stephanie",
                                    "Suzanne",
                                    "Summer",
                                    "Tanya",
                                    "Tara",
                                    "Teagan",
                                    "Theresa",
                                    "Tiffany",
                                    "Tina",
                                    "Tracy",
                                    "Vanessa",
                                    "Vicky",
                                    "Victoria",
                                    "Wendy",
                                    "Yasmine",
                                    "Yvette",
                                    "Yvonne",
                                    "Zoe");
                        });

        public Object lastName =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Adams",
                                    "Allen",
                                    "Anderson",
                                    "Bailey",
                                    "Baker",
                                    "Bell",
                                    "Bennett",
                                    "Brown",
                                    "Butler",
                                    "Campbell",
                                    "Carter",
                                    "Chapman",
                                    "Clark",
                                    "Clarke",
                                    "Collins",
                                    "Cook",
                                    "Cooper",
                                    "Cox",
                                    "Davies",
                                    "Davis",
                                    "Edwards",
                                    "Ellis",
                                    "Evans",
                                    "Fox",
                                    "Graham",
                                    "Gray",
                                    "Green",
                                    "Griffiths",
                                    "Hall",
                                    "Harris",
                                    "Harrison",
                                    "Hill",
                                    "Holmes",
                                    "Hughes",
                                    "Hunt",
                                    "Hunter",
                                    "Jackson",
                                    "James",
                                    "Johnson",
                                    "Jones",
                                    "Kelly",
                                    "Kennedy",
                                    "Khan",
                                    "King",
                                    "Knight",
                                    "Lee",
                                    "Lewis",
                                    "Lloyd",
                                    "Marshall",
                                    "Martin",
                                    "Mason",
                                    "Matthews",
                                    "Miller",
                                    "Mitchell",
                                    "Moore",
                                    "Morgan",
                                    "Morris",
                                    "Murphy",
                                    "Murray",
                                    "Owen",
                                    "Palmer",
                                    "Parker",
                                    "Patel",
                                    "Phillips",
                                    "Powell",
                                    "Price",
                                    "Reid",
                                    "Reynolds",
                                    "Richards",
                                    "Richardson",
                                    "Roberts",
                                    "Robertson",
                                    "Robinson",
                                    "Rogers",
                                    "Rose",
                                    "Ross",
                                    "Russell",
                                    "Saunders",
                                    "Scott",
                                    "Shaw",
                                    "Simpson",
                                    "Smith",
                                    "Stevens",
                                    "Stewart",
                                    "Taylor",
                                    "Thomas",
                                    "Thompson",
                                    "Turner",
                                    "Walker",
                                    "Walsh",
                                    "Ward",
                                    "Watson",
                                    "White",
                                    "Wilkinson",
                                    "Williams",
                                    "Wilson",
                                    "Wood",
                                    "Wright",
                                    "Young");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\en_GB\\Person")
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
                            "maleNameFormats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/en_GB/Person.php")
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
