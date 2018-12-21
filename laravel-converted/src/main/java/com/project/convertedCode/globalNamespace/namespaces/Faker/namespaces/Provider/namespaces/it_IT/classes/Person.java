package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.it_IT.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/it_IT/Person.php

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

    public static final Object CONST_class = "Faker\\Provider\\it_IT\\Person";

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
                                                            .it_IT
                                                            .classes
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .suffix)
                            .value());
        }

        @ConvertedMethod
        public Object taxId(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    NamespaceGlobal.strtoupper
                            .env(env)
                            .call(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Person.class)
                                            .method("bothify")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call("??????##?##?###?")
                                            .value())
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
                        "{{titleMale}} {{firstNameMale}} {{lastName}}",
                        "{{firstNameMale}} {{lastName}}",
                        "{{titleMale}} {{firstNameMale}} {{lastName}}");

        public Object femaleNameFormats =
                ZVal.arrayFromList(
                        "{{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}}",
                        "{{titleFemale}} {{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}}",
                        "{{titleFemale}} {{firstNameFemale}} {{lastName}}");

        public Object firstNameMale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Aaron",
                                    "Abramo",
                                    "Adriano",
                                    "Akira",
                                    "Alan",
                                    "Alberto",
                                    "Albino",
                                    "Alessandro",
                                    "Alessio",
                                    "Amedeo",
                                    "Amos",
                                    "Anastasio",
                                    "Anselmo",
                                    "Antimo",
                                    "Antonino",
                                    "Antonio",
                                    "Ariel",
                                    "Armando",
                                    "Aroldo",
                                    "Arturo",
                                    "Augusto",
                                    "Battista",
                                    "Bernardo",
                                    "Boris",
                                    "Caio",
                                    "Carlo",
                                    "Carmelo",
                                    "Ciro",
                                    "Damiano",
                                    "Danny",
                                    "Dante",
                                    "Davide",
                                    "Davis",
                                    "Demis",
                                    "Dimitri",
                                    "Domingo",
                                    "Dylan",
                                    "Edilio",
                                    "Egidio",
                                    "Elio",
                                    "Emanuel",
                                    "Emidio",
                                    "Enrico",
                                    "Enzo",
                                    "Ercole",
                                    "Ermes",
                                    "Ethan",
                                    "Ettore",
                                    "Eusebio",
                                    "Fabiano",
                                    "Fabio",
                                    "Ferdinando",
                                    "Fernando",
                                    "Fiorenzo",
                                    "Flavio",
                                    "Folco",
                                    "Fulvio",
                                    "Furio",
                                    "Gabriele",
                                    "Gaetano",
                                    "Gastone",
                                    "Gavino",
                                    "Gerlando",
                                    "Germano",
                                    "Giacinto",
                                    "Gianantonio",
                                    "Giancarlo",
                                    "Gianmarco",
                                    "Gianmaria",
                                    "Gioacchino",
                                    "Giordano",
                                    "Giorgio",
                                    "Giuliano",
                                    "Giulio",
                                    "Graziano",
                                    "Gregorio",
                                    "Guido",
                                    "Harry",
                                    "Hector",
                                    "Iacopo",
                                    "Ian",
                                    "Ilario",
                                    "Italo",
                                    "Ivano",
                                    "Jack",
                                    "Jacopo",
                                    "Jari",
                                    "Jarno",
                                    "Joey",
                                    "Joseph",
                                    "Joshua",
                                    "Kai",
                                    "Karim",
                                    "Kris",
                                    "Lamberto",
                                    "Lauro",
                                    "Lazzaro",
                                    "Leonardo",
                                    "Liborio",
                                    "Lino",
                                    "Lorenzo",
                                    "Loris",
                                    "Ludovico",
                                    "Luigi",
                                    "Manfredi",
                                    "Manuele",
                                    "Marco",
                                    "Mariano",
                                    "Marino",
                                    "Marvin",
                                    "Marzio",
                                    "Matteo",
                                    "Mattia",
                                    "Mauro",
                                    "Max",
                                    "Michael",
                                    "Mirco",
                                    "Mirko",
                                    "Modesto",
                                    "Moreno",
                                    "Nabil",
                                    "Nadir",
                                    "Nathan",
                                    "Nazzareno",
                                    "Nick",
                                    "Nico",
                                    "Noah",
                                    "Noel",
                                    "Omar",
                                    "Oreste",
                                    "Osvaldo",
                                    "Pablo",
                                    "Patrizio",
                                    "Pietro",
                                    "Priamo",
                                    "Quirino",
                                    "Raoul",
                                    "Renato",
                                    "Renzo",
                                    "Rocco",
                                    "Rodolfo",
                                    "Romeo",
                                    "Romolo",
                                    "Rudy",
                                    "Sabatino",
                                    "Sabino",
                                    "Samuel",
                                    "Sandro",
                                    "Santo",
                                    "Sebastian",
                                    "Sesto",
                                    "Silvano",
                                    "Silverio",
                                    "Sirio",
                                    "Siro",
                                    "Timoteo",
                                    "Timothy",
                                    "Tommaso",
                                    "Ubaldo",
                                    "Umberto",
                                    "Vinicio",
                                    "Walter",
                                    "Xavier",
                                    "Yago",
                                    "Alighieri",
                                    "Alighiero",
                                    "Amerigo",
                                    "Arcibaldo",
                                    "Arduino",
                                    "Artes",
                                    "Audenico",
                                    "Ausonio",
                                    "Bacchisio",
                                    "Baldassarre",
                                    "Bettino",
                                    "Bortolo",
                                    "Caligola",
                                    "Cecco",
                                    "Cirino",
                                    "Cleros",
                                    "Costantino",
                                    "Costanzo",
                                    "Danthon",
                                    "Demian",
                                    "Domiziano",
                                    "Edipo",
                                    "Egisto",
                                    "Eliziario",
                                    "Eriberto",
                                    "Erminio",
                                    "Eustachio",
                                    "Evangelista",
                                    "Fiorentino",
                                    "Giacobbe",
                                    "Gianleonardo",
                                    "Gianriccardo",
                                    "Giobbe",
                                    "Ippolito",
                                    "Isira",
                                    "Joannes",
                                    "Kociss",
                                    "Laerte",
                                    "Maggiore",
                                    "Muzio",
                                    "Nestore",
                                    "Odino",
                                    "Odone",
                                    "Olo",
                                    "Oretta",
                                    "Orfeo",
                                    "Osea",
                                    "Pacifico",
                                    "Pericle",
                                    "Piererminio",
                                    "Pierfrancesco",
                                    "Piersilvio",
                                    "Primo",
                                    "Quarto",
                                    "Quasimodo",
                                    "Radames",
                                    "Radio",
                                    "Raniero",
                                    "Rosalino",
                                    "Rosolino",
                                    "Rufo",
                                    "Secondo",
                                    "Tancredi",
                                    "Tazio",
                                    "Terzo",
                                    "Teseo",
                                    "Tolomeo",
                                    "Trevis",
                                    "Tristano",
                                    "Ulrico",
                                    "Valdo",
                                    "Zaccaria",
                                    "Dindo",
                                    "Serse");
                        });

        public Object firstNameFemale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Assia",
                                    "Benedetta",
                                    "Bibiana",
                                    "Brigitta",
                                    "Carmela",
                                    "Celeste",
                                    "Cira",
                                    "Claudia",
                                    "Concetta",
                                    "Cristyn",
                                    "Deborah",
                                    "Demi",
                                    "Diana",
                                    "Donatella",
                                    "Doriana",
                                    "Edvige",
                                    "Elda",
                                    "Elga",
                                    "Elsa",
                                    "Emilia",
                                    "Enrica",
                                    "Erminia",
                                    "Evita",
                                    "Fatima",
                                    "Felicia",
                                    "Filomena",
                                    "Fortunata",
                                    "Gilda",
                                    "Giovanna",
                                    "Giulietta",
                                    "Grazia",
                                    "Helga",
                                    "Ileana",
                                    "Ingrid",
                                    "Ione",
                                    "Irene",
                                    "Isabel",
                                    "Ivonne",
                                    "Jelena",
                                    "Kayla",
                                    "Kristel",
                                    "Laura",
                                    "Leone",
                                    "Lia",
                                    "Lidia",
                                    "Lisa",
                                    "Loredana",
                                    "Loretta",
                                    "Luce",
                                    "Lucia",
                                    "Lucrezia",
                                    "Luna",
                                    "Maika",
                                    "Marcella",
                                    "Maria",
                                    "Marianita",
                                    "Mariapia",
                                    "Marina",
                                    "Maristella",
                                    "Maruska",
                                    "Matilde",
                                    "Mercedes",
                                    "Michele",
                                    "Miriam",
                                    "Miriana",
                                    "Monia",
                                    "Morgana",
                                    "Naomi",
                                    "Neri",
                                    "Nicoletta",
                                    "Ninfa",
                                    "Noemi",
                                    "Nunzia",
                                    "Olimpia",
                                    "Ortensia",
                                    "Penelope",
                                    "Prisca",
                                    "Rebecca",
                                    "Rita",
                                    "Rosalba",
                                    "Rosaria",
                                    "Rosita",
                                    "Ruth",
                                    "Samira",
                                    "Sarita",
                                    "Sasha",
                                    "Shaira",
                                    "Thea",
                                    "Ursula",
                                    "Vania",
                                    "Vera",
                                    "Vienna",
                                    "Artemide",
                                    "Cassiopea",
                                    "Cesidia",
                                    "Clea",
                                    "Cleopatra",
                                    "Clodovea",
                                    "Cosetta",
                                    "Damiana",
                                    "Danuta",
                                    "Diamante",
                                    "Eufemia",
                                    "Flaviana",
                                    "Gelsomina",
                                    "Genziana",
                                    "Giacinta",
                                    "Guendalina",
                                    "Jole",
                                    "Mariagiulia",
                                    "Marieva",
                                    "Mietta",
                                    "Nayade",
                                    "Piccarda",
                                    "Selvaggia",
                                    "Sibilla",
                                    "Soriana",
                                    "Sue ellen",
                                    "Tosca",
                                    "Violante",
                                    "Vitalba",
                                    "Zelida");
                        });

        public Object lastName =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Rossi",
                                    "Russo",
                                    "Ferrari",
                                    "Esposito",
                                    "Bianchi",
                                    "Romano",
                                    "Colombo",
                                    "Ricci",
                                    "Marino",
                                    "Greco",
                                    "Bruno",
                                    "Gallo",
                                    "Conti",
                                    "De luca",
                                    "Mancini",
                                    "Costa",
                                    "Giordano",
                                    "Rizzo",
                                    "Lombardi",
                                    "Moretti",
                                    "Barbieri",
                                    "Fontana",
                                    "Santoro",
                                    "Mariani",
                                    "Rinaldi",
                                    "Caruso",
                                    "Ferrara",
                                    "Galli",
                                    "Martini",
                                    "Leone",
                                    "Longo",
                                    "Gentile",
                                    "Martinelli",
                                    "Vitale",
                                    "Lombardo",
                                    "Serra",
                                    "Coppola",
                                    "De Santis",
                                    "D'angelo",
                                    "Marchetti",
                                    "Parisi",
                                    "Villa",
                                    "Conte",
                                    "Ferraro",
                                    "Ferri",
                                    "Fabbri",
                                    "Bianco",
                                    "Marini",
                                    "Grasso",
                                    "Valentini",
                                    "Messina",
                                    "Sala",
                                    "De Angelis",
                                    "Gatti",
                                    "Pellegrini",
                                    "Palumbo",
                                    "Sanna",
                                    "Farina",
                                    "Rizzi",
                                    "Monti",
                                    "Cattaneo",
                                    "Morelli",
                                    "Amato",
                                    "Silvestri",
                                    "Mazza",
                                    "Testa",
                                    "Grassi",
                                    "Pellegrino",
                                    "Carbone",
                                    "Giuliani",
                                    "Benedetti",
                                    "Barone",
                                    "Rossetti",
                                    "Caputo",
                                    "Montanari",
                                    "Guerra",
                                    "Palmieri",
                                    "Bernardi",
                                    "Martino",
                                    "Fiore",
                                    "De rosa",
                                    "Ferretti",
                                    "Bellini",
                                    "Basile",
                                    "Riva",
                                    "Donati",
                                    "Piras",
                                    "Vitali",
                                    "Battaglia",
                                    "Sartori",
                                    "Neri",
                                    "Costantini",
                                    "Milani",
                                    "Pagano",
                                    "Ruggiero",
                                    "Sorrentino",
                                    "D'amico",
                                    "Orlando",
                                    "Damico",
                                    "Negri");
                        });

        public Object titleMale = ZVal.arrayFromList("Sig.", "Dott.", "Dr.", "Ing.");

        public Object titleFemale = ZVal.arrayFromList("Sig.ra", "Dott.", "Dr.", "Ing.");

        public Object suffix = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\it_IT\\Person")
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
                            "suffix",
                            "titleFemale",
                            "titleMale")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/it_IT/Person.php")
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
