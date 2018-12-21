package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.fr_CA.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/fr_CA/Person.php

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

    public static final Object CONST_class = "Faker\\Provider\\fr_CA\\Person";

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
                        "{{firstNameMale}} {{lastName}}",
                        "{{firstNameMale}} {{lastName}}",
                        "{{firstNameMale}} {{lastName}}",
                        "{{firstNameMale}} {{lastName}}",
                        "{{firstNameMale}} {{lastName}}",
                        "{{firstNameMale}} {{lastName}}-{{lastName}}",
                        "{{firstNameMale}}-{{firstNameMale}} {{lastName}}");

        public Object femaleNameFormats =
                ZVal.arrayFromList(
                        "{{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}}-{{lastName}}",
                        "{{firstNameFemale}}-{{firstNameFemale}} {{lastName}}");

        public Object firstNameMale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Adrien",
                                    "Aim\u00E9",
                                    "Alain",
                                    "Albert",
                                    "Alexandre",
                                    "Alfred",
                                    "Alphonse",
                                    "Alysson",
                                    "Andr\u00E9",
                                    "Anthony",
                                    "Antoine",
                                    "Arthur",
                                    "Auguste",
                                    "Augustin",
                                    "Augustine",
                                    "Benjamin",
                                    "Benoit",
                                    "Beno\u00EEt",
                                    "Bernard",
                                    "Bertrand",
                                    "Charles",
                                    "Christian",
                                    "Christophe",
                                    "Claude",
                                    "Daniel",
                                    "David",
                                    "Denis",
                                    "Dominic",
                                    "Emmanuel",
                                    "Eug\u00E8ne",
                                    "Fran\u00E7is",
                                    "Fran\u00E7ois",
                                    "Fr\u00E9d\u00E9ric",
                                    "Gabriel",
                                    "Georges",
                                    "Gilbert",
                                    "Gilles",
                                    "Gr\u00E9gory",
                                    "Guillaume",
                                    "Guy",
                                    "G\u00E9rard",
                                    "Henri",
                                    "Hugues",
                                    "Isaac",
                                    "Jacques",
                                    "Joseph",
                                    "Jules",
                                    "Julien",
                                    "J\u00E9r\u00F4me",
                                    "Laurent",
                                    "Louis",
                                    "Luc",
                                    "Lucas",
                                    "L\u00E9on",
                                    "Marc",
                                    "Marcel",
                                    "Martin",
                                    "Mathieu",
                                    "Matthieu",
                                    "Maurice",
                                    "Michel",
                                    "Nicolas",
                                    "No\u00EBl",
                                    "Olivier",
                                    "Patrick",
                                    "Paul",
                                    "Philippe",
                                    "Pierre",
                                    "Raymond",
                                    "Ren\u00E9",
                                    "Richard",
                                    "Robert",
                                    "Roger",
                                    "Roland",
                                    "R\u00E9my",
                                    "Simone",
                                    "St\u00E9phane",
                                    "S\u00E9bastien",
                                    "Thierry",
                                    "Thomas",
                                    "Th\u00E9o",
                                    "Th\u00E9ophile",
                                    "Timoth\u00E9e",
                                    "Tristan",
                                    "Victor",
                                    "Vincent",
                                    "William",
                                    "Xavier",
                                    "Yvan",
                                    "Yves",
                                    "Yvon",
                                    "Zacharie",
                                    "\u00C9douard",
                                    "\u00C9manuelle",
                                    "\u00C9mile",
                                    "\u00C9ric",
                                    "\u00C9tienne",
                                    "Honor\u00E9");
                        });

        public Object firstNameFemale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Adrienne",
                                    "Ad\u00E8le",
                                    "Agathe",
                                    "Aim\u00E9e",
                                    "Alexandra",
                                    "Alice",
                                    "Aline",
                                    "Am\u00E9lie",
                                    "Ana\u00EFs",
                                    "Andr\u00E9e",
                                    "Ann",
                                    "Anne",
                                    "Annette",
                                    "Annie",
                                    "Anouk",
                                    "Arianne",
                                    "Audrey",
                                    "Aurore",
                                    "Aur\u00E9lie",
                                    "Bernadette",
                                    "Brigitte",
                                    "Camille",
                                    "Caroline",
                                    "Catherine",
                                    "Chantal",
                                    "Charlotte",
                                    "Christiane",
                                    "Christine",
                                    "Claire",
                                    "Claudine",
                                    "Colette",
                                    "Corrine",
                                    "C\u00E9cile",
                                    "C\u00E9line",
                                    "Danielle",
                                    "Denise",
                                    "Dominique",
                                    "Eug\u00E9nie",
                                    "Eve",
                                    "Fran\u00E7oise",
                                    "Fr\u00E9d\u00E9rique",
                                    "Gabrielle",
                                    "Genevi\u00E8ve",
                                    "H\u00E9l\u00E8ne",
                                    "Isabelle",
                                    "Jacqueline",
                                    "Jean",
                                    "Jeanne",
                                    "Jeannine",
                                    "Jos\u00E9phine",
                                    "Julie",
                                    "Laurence",
                                    "Louise",
                                    "Luce",
                                    "Lucie",
                                    "Madeleine",
                                    "Maggie",
                                    "Manon",
                                    "Margot",
                                    "Marguerite",
                                    "Marianne",
                                    "Marie",
                                    "Marthe",
                                    "Martine",
                                    "Maryse",
                                    "Mathilde",
                                    "Michelle",
                                    "Mich\u00E8le",
                                    "Monique",
                                    "Nancy",
                                    "Nathalie",
                                    "Nicole",
                                    "No\u00E9mie",
                                    "Odette",
                                    "Olivia",
                                    "Patrice",
                                    "Patricia",
                                    "Paule",
                                    "Paulette",
                                    "Pauline",
                                    "P\u00E9n\u00E9lope",
                                    "Ren\u00E9e",
                                    "Rolande",
                                    "Sophie",
                                    "St\u00E9phanie",
                                    "Susanne",
                                    "Suzanne",
                                    "Sylvie",
                                    "Th\u00E9r\u00E8se",
                                    "Val\u00E9rie",
                                    "Virginie",
                                    "V\u00E9ronique",
                                    "Yvonne",
                                    "Zo\u00E9",
                                    "\u00C9dith",
                                    "\u00C9lisabeth",
                                    "\u00C9lise",
                                    "\u00C9lodie",
                                    "\u00C9milie",
                                    "\u00C9rika",
                                    "Honor\u00E9e");
                        });

        public Object lastName =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Allard",
                                    "Arsenault",
                                    "Audet",
                                    "Beaudoin",
                                    "Beaulieu",
                                    "B\u00E9dard",
                                    "B\u00E9langer",
                                    "Beno\u00EEt",
                                    "Bergeron",
                                    "Bernard",
                                    "Bernier",
                                    "Bertrand",
                                    "B\u00E9rub\u00E9",
                                    "Bilodeau",
                                    "Blais",
                                    "Blanchette",
                                    "Boisvert",
                                    "Boivin",
                                    "Bolduc",
                                    "Bouchard",
                                    "Boucher",
                                    "Boudreau",
                                    "Caron",
                                    "Carrier",
                                    "Champagne",
                                    "Charbonneau",
                                    "Cloutier",
                                    "C\u00F4t\u00E9",
                                    "Couture",
                                    "Cyr",
                                    "Demers",
                                    "Desch\u00EAnes",
                                    "Desjardins",
                                    "Desrosiers",
                                    "Dion",
                                    "Dionne",
                                    "Drouin",
                                    "Dub\u00E9",
                                    "Dubois",
                                    "Dufour",
                                    "Dupuis",
                                    "Fillion",
                                    "Fontaine",
                                    "Fortier",
                                    "Fortin",
                                    "Fournier",
                                    "Gagn\u00E9",
                                    "Gagnon",
                                    "Gaudreault",
                                    "Gauthier",
                                    "Gigu\u00E8re",
                                    "Gilbert",
                                    "Gingras",
                                    "Girard",
                                    "Giroux",
                                    "Goulet",
                                    "Gosselin",
                                    "Gravel",
                                    "Grenier",
                                    "Guay",
                                    "Hamel",
                                    "Harvey",
                                    "H\u00E9bert",
                                    "Houle",
                                    "Jean",
                                    "Jacques",
                                    "Labelle",
                                    "Lachance",
                                    "Lacroix",
                                    "Lalonde",
                                    "Lambert",
                                    "Landry",
                                    "Langlois",
                                    "Lapierre",
                                    "Lapointe",
                                    "Larouche",
                                    "Lauzon",
                                    "Lavoie",
                                    "Leblanc",
                                    "Leduc",
                                    "Leclerc",
                                    "Lefebvre",
                                    "Legault",
                                    "Lemay",
                                    "Lemieux",
                                    "Lepage",
                                    "Lessard",
                                    "L\u00E9vesque",
                                    "Martel",
                                    "Martin",
                                    "M\u00E9nard",
                                    "Mercier",
                                    "Michaud",
                                    "Moreau",
                                    "Morin",
                                    "Nadeau",
                                    "Nguyen",
                                    "Ouellet",
                                    "Paquette",
                                    "Paradis",
                                    "Parent",
                                    "Pelletier",
                                    "Perreault",
                                    "Perron",
                                    "Picard",
                                    "Plante",
                                    "Poirier",
                                    "Poulin",
                                    "Proulx",
                                    "Raymond",
                                    "Renaud",
                                    "Richard",
                                    "Rioux",
                                    "Robert",
                                    "Rousseau",
                                    "Roy",
                                    "Savard",
                                    "Simard",
                                    "St-Pierre",
                                    "Tardif",
                                    "Tessier",
                                    "Th\u00E9riault",
                                    "Therrien",
                                    "Thibault",
                                    "Tremblay",
                                    "Trudel",
                                    "Turcotte",
                                    "Vachon",
                                    "Vaillancourt",
                                    "Villeneuve");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\fr_CA\\Person")
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
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/fr_CA/Person.php")
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
