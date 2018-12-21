package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.fr_FR.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.fr_FR.classes.Address;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_key;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/fr_FR/Person.php

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
        name = "formatted",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object nir(RuntimeEnv env, Object... args) {
        Object gender = assignParameter(args, 0, true);
        if (null == gender) {
            gender = ZVal.getNull();
        }
        Object formatted = assignParameter(args, 1, true);
        if (null == formatted) {
            formatted = false;
        }
        Object nirInteger = null;
        Object nir = null;
        Object department = null;
        if (ZVal.strictEqualityCheck(
                gender,
                "===",
                ClassConstantUtils.getConstantValueLateStatic(env, this, "GENDER_MALE"))) {
            nir = 1;

        } else if (ZVal.strictEqualityCheck(
                gender,
                "===",
                ClassConstantUtils.getConstantValueLateStatic(env, this, "GENDER_FEMALE"))) {
            nir = 2;

        } else {
            nir = env.callMethod(this, "numberBetween", Person.class, 1, 2);
        }

        nir =
                toStringR(nir, env)
                        + toStringR(env.callMethod(this, "numerify", Person.class, "##"), env)
                        + toStringR(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "%02d",
                                                env.callMethod(
                                                        this, "numberBetween", Person.class, 1, 12))
                                        .value(),
                                env);
        department =
                function_key.f.env(env).call(Address.runtimeStaticObject.department(env)).value();
        nir = toStringR(nir, env) + toStringR(department, env);
        if (ZVal.strictEqualityCheck(
                function_strlen.f.env(env).call(department).value(), "===", 2)) {
            nir =
                    toStringR(nir, env)
                            + toStringR(env.callMethod(this, "numerify", Person.class, "###"), env);

        } else if (ZVal.strictEqualityCheck(
                function_strlen.f.env(env).call(department).value(), "===", 3)) {
            nir =
                    toStringR(nir, env)
                            + toStringR(env.callMethod(this, "numerify", Person.class, "##"), env);
        }

        nir =
                toStringR(nir, env)
                        + toStringR(env.callMethod(this, "numerify", Person.class, "###"), env);
        if (ZVal.strictEqualityCheck(department, "===", "2A")) {
            nirInteger = function_str_replace.f.env(env).call("2A", "19", nir).value();

        } else if (ZVal.strictEqualityCheck(department, "===", "2B")) {
            nirInteger = function_str_replace.f.env(env).call("2B", "18", nir).value();

        } else {
            nirInteger = ZVal.assign(nir);
        }

        nir =
                toStringR(nir, env)
                        + toStringR(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "%02d",
                                                ZVal.subtract(97, ZVal.modulus(nirInteger, 97)))
                                        .value(),
                                env);
        if (ZVal.isTrue(formatted)) {
            nir =
                    toStringR(function_substr.f.env(env).call(nir, 0, 1).value(), env)
                            + " "
                            + toStringR(function_substr.f.env(env).call(nir, 1, 2).value(), env)
                            + " "
                            + toStringR(function_substr.f.env(env).call(nir, 3, 2).value(), env)
                            + " "
                            + toStringR(function_substr.f.env(env).call(nir, 5, 2).value(), env)
                            + " "
                            + toStringR(function_substr.f.env(env).call(nir, 7, 3).value(), env)
                            + " "
                            + toStringR(function_substr.f.env(env).call(nir, 10, 3).value(), env)
                            + " "
                            + toStringR(function_substr.f.env(env).call(nir, 13, 2).value(), env);
        }

        return ZVal.assign(nir);
    }

    public static final Object CONST_class = "Faker\\Provider\\fr_FR\\Person";

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
        public Object prefix(RuntimeEnv env, Object... args) {
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
                                                            .fr_FR
                                                            .classes
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .prefix)
                            .value());
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
                        "{{firstNameMale}} {{lastName}}",
                        "{{firstNameMale}} {{prefix}} {{lastName}}",
                        "{{firstNameMale}} {{lastName}}-{{lastName}}",
                        "{{firstNameMale}}-{{firstNameMale}} {{lastName}}");

        public Object femaleNameFormats =
                ZVal.arrayFromList(
                        "{{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{prefix}} {{lastName}}",
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
                                    "Alexandre",
                                    "Alfred",
                                    "Alphonse",
                                    "Andr\u00E9",
                                    "Antoine",
                                    "Arthur",
                                    "Auguste",
                                    "Augustin",
                                    "Benjamin",
                                    "Beno\u00EEt",
                                    "Bernard",
                                    "Bertrand",
                                    "Charles",
                                    "Christophe",
                                    "Daniel",
                                    "David",
                                    "Denis",
                                    "\u00C9douard",
                                    "\u00C9mile",
                                    "Emmanuel",
                                    "\u00C9ric",
                                    "\u00C9tienne",
                                    "Eug\u00E8ne",
                                    "Fran\u00E7ois",
                                    "Franck",
                                    "Fr\u00E9d\u00E9ric",
                                    "Gabriel",
                                    "Georges",
                                    "G\u00E9rard",
                                    "Gilbert",
                                    "Gilles",
                                    "Gr\u00E9goire",
                                    "Guillaume",
                                    "Guy",
                                    "William",
                                    "Henri",
                                    "Honor\u00E9",
                                    "Hugues",
                                    "Isaac",
                                    "Jacques",
                                    "Jean",
                                    "J\u00E9r\u00F4me",
                                    "Joseph",
                                    "Jules",
                                    "Julien",
                                    "Laurent",
                                    "L\u00E9on",
                                    "Louis",
                                    "Luc",
                                    "Lucas",
                                    "Marc",
                                    "Marcel",
                                    "Martin",
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
                                    "R\u00E9my",
                                    "Ren\u00E9",
                                    "Richard",
                                    "Robert",
                                    "Roger",
                                    "Roland",
                                    "S\u00E9bastien",
                                    "St\u00E9phane",
                                    "Th\u00E9odore",
                                    "Th\u00E9ophile",
                                    "Thibaut",
                                    "Thibault",
                                    "Thierry",
                                    "Thomas",
                                    "Timoth\u00E9e",
                                    "Tristan",
                                    "Victor",
                                    "Vincent",
                                    "Xavier",
                                    "Yves",
                                    "Zacharie",
                                    "Claude",
                                    "Dominique");
                        });

        public Object firstNameFemale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Ad\u00E9la\u00EFde",
                                    "Ad\u00E8le",
                                    "Adrienne",
                                    "Agathe",
                                    "Agn\u00E8s",
                                    "Aim\u00E9e",
                                    "Alexandrie",
                                    "Alix",
                                    "Alexandria",
                                    "Alex",
                                    "Alice",
                                    "Am\u00E9lie",
                                    "Ana\u00EFs",
                                    "Anastasie",
                                    "Andr\u00E9e",
                                    "Anne",
                                    "Anouk",
                                    "Antoinette",
                                    "Arnaude",
                                    "Astrid",
                                    "Audrey",
                                    "Aur\u00E9lie",
                                    "Aurore",
                                    "Bernadette",
                                    "Brigitte",
                                    "Capucine",
                                    "Caroline",
                                    "Catherine",
                                    "C\u00E9cile",
                                    "C\u00E9line",
                                    "C\u00E9lina",
                                    "Chantal",
                                    "Charlotte",
                                    "Christelle",
                                    "Christiane",
                                    "Christine",
                                    "Claire",
                                    "Claudine",
                                    "Cl\u00E9mence",
                                    "Colette",
                                    "Constance",
                                    "Corinne",
                                    "Danielle",
                                    "Denise",
                                    "Diane",
                                    "Doroth\u00E9e",
                                    "\u00C9dith",
                                    "\u00C9l\u00E9onore",
                                    "\u00C9lisabeth",
                                    "\u00C9lise",
                                    "\u00C9lodie",
                                    "\u00C9milie",
                                    "Emmanuelle",
                                    "Fran\u00E7oise",
                                    "Fr\u00E9d\u00E9rique",
                                    "Gabrielle",
                                    "Genevi\u00E8ve",
                                    "H\u00E9l\u00E8ne",
                                    "Henriette",
                                    "Hortense",
                                    "In\u00E8s",
                                    "Isabelle",
                                    "Jacqueline",
                                    "Jeanne",
                                    "Jeannine",
                                    "Jos\u00E9phine",
                                    "Josette",
                                    "Julie",
                                    "Juliette",
                                    "Laetitia",
                                    "Laure",
                                    "Laurence",
                                    "Lorraine",
                                    "Louise",
                                    "Luce",
                                    "Lucie",
                                    "Lucy",
                                    "Madeleine",
                                    "Manon",
                                    "Marcelle",
                                    "Margaux",
                                    "Margaud",
                                    "Margot",
                                    "Marguerite",
                                    "Margot",
                                    "Margaret",
                                    "Maggie",
                                    "Marianne",
                                    "Marie",
                                    "Marine",
                                    "Marthe",
                                    "Martine",
                                    "Maryse",
                                    "Mathilde",
                                    "Mich\u00E8le",
                                    "Michelle",
                                    "Michelle",
                                    "Monique",
                                    "Nathalie",
                                    "Nath",
                                    "Nathalie",
                                    "Nicole",
                                    "No\u00E9mi",
                                    "Oc\u00E9ane",
                                    "Odette",
                                    "Olivie",
                                    "Patricia",
                                    "Paulette",
                                    "Pauline",
                                    "P\u00E9n\u00E9lope",
                                    "Philippine",
                                    "Ren\u00E9e",
                                    "Sabine",
                                    "Simone",
                                    "Sophie",
                                    "St\u00E9phanie",
                                    "Susanne",
                                    "Suzanne",
                                    "Susan",
                                    "Suzanne",
                                    "Sylvie",
                                    "Th\u00E9r\u00E8se",
                                    "Valentine",
                                    "Val\u00E9rie",
                                    "V\u00E9ronique",
                                    "Victoire",
                                    "Virginie",
                                    "Zo\u00E9",
                                    "Camille",
                                    "Dominique");
                        });

        public Object lastName =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Martin",
                                    "Bernard",
                                    "Thomas",
                                    "Robert",
                                    "Petit",
                                    "Dubois",
                                    "Richard",
                                    "Garcia",
                                    "Durand",
                                    "Moreau",
                                    "Lefebvre",
                                    "Simon",
                                    "Laurent",
                                    "Michel",
                                    "Leroy",
                                    "Martinez",
                                    "David",
                                    "Fontaine",
                                    "Da Silva",
                                    "Morel",
                                    "Fournier",
                                    "Dupont",
                                    "Bertrand",
                                    "Lambert",
                                    "Rousseau",
                                    "Girard",
                                    "Roux",
                                    "Vincent",
                                    "Lefevre",
                                    "Boyer",
                                    "Lopez",
                                    "Bonnet",
                                    "Andre",
                                    "Francois",
                                    "Mercier",
                                    "Muller",
                                    "Guerin",
                                    "Legrand",
                                    "Sanchez",
                                    "Garnier",
                                    "Chevalier",
                                    "Faure",
                                    "Perez",
                                    "Clement",
                                    "Fernandez",
                                    "Blanc",
                                    "Robin",
                                    "Morin",
                                    "Gauthier",
                                    "Pereira",
                                    "Perrin",
                                    "Roussel",
                                    "Henry",
                                    "Duval",
                                    "Gautier",
                                    "Nicolas",
                                    "Masson",
                                    "Marie",
                                    "Noel",
                                    "Ferreira",
                                    "Lemaire",
                                    "Mathieu",
                                    "Riviere",
                                    "Denis",
                                    "Marchand",
                                    "Rodriguez",
                                    "Dumont",
                                    "Payet",
                                    "Lucas",
                                    "Dufour",
                                    "Dos Santos",
                                    "Joly",
                                    "Blanchard",
                                    "Meunier",
                                    "Rodrigues",
                                    "Caron",
                                    "Gerard",
                                    "Fernandes",
                                    "Brunet",
                                    "Meyer",
                                    "Barbier",
                                    "Leroux",
                                    "Renard",
                                    "Goncalves",
                                    "Gaillard",
                                    "Brun",
                                    "Roy",
                                    "Picard",
                                    "Giraud",
                                    "Roger",
                                    "Schmitt",
                                    "Colin",
                                    "Arnaud",
                                    "Vidal",
                                    "Gonzalez",
                                    "Lemoine",
                                    "Roche",
                                    "Aubert",
                                    "Olivier",
                                    "Leclercq",
                                    "Pierre",
                                    "Philippe",
                                    "Bourgeois",
                                    "Renaud",
                                    "Martins",
                                    "Leclerc",
                                    "Guillaume",
                                    "Lacroix",
                                    "Lecomte",
                                    "Benoit",
                                    "Fabre",
                                    "Carpentier",
                                    "Vasseur",
                                    "Louis",
                                    "Hubert",
                                    "Jean",
                                    "Dumas",
                                    "Rolland",
                                    "Grondin",
                                    "Rey",
                                    "Huet",
                                    "Gomez",
                                    "Dupuis",
                                    "Guillot",
                                    "Berger",
                                    "Moulin",
                                    "Hoarau",
                                    "Menard",
                                    "Deschamps",
                                    "Fleury",
                                    "Adam",
                                    "Boucher",
                                    "Poirier",
                                    "Bertin",
                                    "Charles",
                                    "Aubry",
                                    "Da Costa",
                                    "Royer",
                                    "Dupuy",
                                    "Maillard",
                                    "Paris",
                                    "Baron",
                                    "Lopes",
                                    "Guyot",
                                    "Carre",
                                    "Jacquet",
                                    "Renault",
                                    "Herve",
                                    "Charpentier",
                                    "Klein",
                                    "Cousin",
                                    "Collet",
                                    "Leger",
                                    "Ribeiro",
                                    "Hernandez",
                                    "Bailly",
                                    "Schneider",
                                    "Le Gall",
                                    "Ruiz",
                                    "Langlois",
                                    "Bouvier",
                                    "Gomes",
                                    "Prevost",
                                    "Julien",
                                    "Lebrun",
                                    "Breton",
                                    "Germain",
                                    "Millet",
                                    "Boulanger",
                                    "Remy",
                                    "Le Roux",
                                    "Daniel",
                                    "Marques",
                                    "Maillot",
                                    "Leblanc",
                                    "Le Goff",
                                    "Barre",
                                    "Perrot",
                                    "Leveque",
                                    "Marty",
                                    "Benard",
                                    "Monnier",
                                    "Hamon",
                                    "Pelletier",
                                    "Alves",
                                    "Etienne",
                                    "Marchal",
                                    "Poulain",
                                    "Tessier",
                                    "Lemaitre",
                                    "Guichard",
                                    "Besson",
                                    "Mallet",
                                    "Hoareau",
                                    "Gillet",
                                    "Weber",
                                    "Jacob",
                                    "Collin",
                                    "Chevallier",
                                    "Perrier",
                                    "Michaud",
                                    "Carlier",
                                    "Delaunay",
                                    "Chauvin",
                                    "Alexandre",
                                    "Marechal",
                                    "Antoine",
                                    "Lebon",
                                    "Cordier",
                                    "Lejeune",
                                    "Bouchet",
                                    "Pasquier",
                                    "Legros",
                                    "Delattre",
                                    "Humbert",
                                    "De Oliveira",
                                    "Briand",
                                    "Lamy",
                                    "Launay",
                                    "Gilbert",
                                    "Perret",
                                    "Lesage",
                                    "Gay",
                                    "Nguyen",
                                    "Navarro",
                                    "Besnard",
                                    "Pichon",
                                    "Hebert",
                                    "Cohen",
                                    "Pons",
                                    "Lebreton",
                                    "Sauvage",
                                    "De Sousa",
                                    "Pineau",
                                    "Albert",
                                    "Jacques",
                                    "Pinto",
                                    "Barthelemy",
                                    "Turpin",
                                    "Bigot",
                                    "Lelievre",
                                    "Georges",
                                    "Reynaud",
                                    "Ollivier",
                                    "Martel",
                                    "Voisin",
                                    "Leduc",
                                    "Guillet",
                                    "Vallee",
                                    "Coulon",
                                    "Camus",
                                    "Marin",
                                    "Teixeira",
                                    "Costa",
                                    "Mahe",
                                    "Didier",
                                    "Charrier",
                                    "Gaudin",
                                    "Bodin",
                                    "Guillou",
                                    "Gregoire",
                                    "Gros",
                                    "Blanchet",
                                    "Buisson",
                                    "Blondel",
                                    "Paul",
                                    "Dijoux",
                                    "Barbe",
                                    "Hardy",
                                    "Laine",
                                    "Evrard",
                                    "Laporte",
                                    "Rossi",
                                    "Joubert",
                                    "Regnier",
                                    "Tanguy",
                                    "Gimenez",
                                    "Allard",
                                    "Devaux",
                                    "Morvan",
                                    "Levy",
                                    "Dias",
                                    "Courtois",
                                    "Lenoir",
                                    "Berthelot",
                                    "Pascal",
                                    "Vaillant",
                                    "Guilbert",
                                    "Thibault",
                                    "Moreno",
                                    "Duhamel",
                                    "Colas",
                                    "Masse",
                                    "Baudry",
                                    "Bruneau",
                                    "Verdier",
                                    "Delorme",
                                    "Blin",
                                    "Guillon",
                                    "Mary",
                                    "Coste",
                                    "Pruvost",
                                    "Maury",
                                    "Allain",
                                    "Valentin",
                                    "Godard",
                                    "Joseph",
                                    "Brunel",
                                    "Marion",
                                    "Texier",
                                    "Seguin",
                                    "Raynaud",
                                    "Bourdon",
                                    "Raymond",
                                    "Bonneau",
                                    "Chauvet",
                                    "Maurice",
                                    "Legendre",
                                    "Loiseau",
                                    "Ferrand",
                                    "Toussaint",
                                    "Techer",
                                    "Lombard",
                                    "Lefort",
                                    "Couturier",
                                    "Bousquet",
                                    "Diaz",
                                    "Riou",
                                    "Clerc",
                                    "Weiss",
                                    "Imbert",
                                    "Jourdan",
                                    "Delahaye",
                                    "Gilles",
                                    "Guibert",
                                    "Begue",
                                    "Descamps",
                                    "Delmas",
                                    "Peltier",
                                    "Dupre",
                                    "Chartier",
                                    "Martineau",
                                    "Laroche",
                                    "Leconte",
                                    "Maillet",
                                    "Parent",
                                    "Labbe",
                                    "Potier",
                                    "Bazin",
                                    "Normand",
                                    "Pottier",
                                    "Torres",
                                    "Lagarde",
                                    "Blot",
                                    "Jacquot",
                                    "Lemonnier",
                                    "Grenier",
                                    "Rocher",
                                    "Bonnin",
                                    "Boutin",
                                    "Fischer",
                                    "Munoz",
                                    "Neveu",
                                    "Lacombe",
                                    "Mendes",
                                    "Delannoy",
                                    "Auger",
                                    "Wagner",
                                    "Fouquet",
                                    "Mace",
                                    "Ramos",
                                    "Pages",
                                    "Petitjean",
                                    "Chauveau",
                                    "Foucher",
                                    "Peron",
                                    "Guyon",
                                    "Gallet",
                                    "Rousset",
                                    "Traore",
                                    "Bernier",
                                    "Vallet",
                                    "Letellier",
                                    "Bouvet",
                                    "Hamel",
                                    "Chretien",
                                    "Faivre",
                                    "Boulay",
                                    "Thierry",
                                    "Samson",
                                    "Ledoux",
                                    "Salmon",
                                    "Gosselin",
                                    "Lecoq",
                                    "Pires",
                                    "Leleu",
                                    "Becker",
                                    "Diallo",
                                    "Merle",
                                    "Valette");
                        });

        public Object titleMale = ZVal.arrayFromList("M.", "Dr.", "Pr.", "Me.");

        public Object titleFemale = ZVal.arrayFromList("Mme.", "Mlle", "Dr.", "Pr.", "Me.");

        public Object prefix = ZVal.arrayFromList("de", "de la", "Le", "du");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\fr_FR\\Person")
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
                            "prefix",
                            "titleFemale",
                            "titleMale")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/fr_FR/Person.php")
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
