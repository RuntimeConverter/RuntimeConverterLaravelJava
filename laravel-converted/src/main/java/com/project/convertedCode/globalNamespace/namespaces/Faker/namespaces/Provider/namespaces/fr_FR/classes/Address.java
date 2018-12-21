package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.fr_FR.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/fr_FR/Address.php

*/

public class Address
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .Address {

    public Address(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Address.class) {
            this.__construct(env, args);
        }
    }

    public Address(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Faker\\Provider\\fr_FR\\Address";

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
                    .Address
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object streetPrefix(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
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
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .streetPrefix)
                            .value());
        }

        @ConvertedMethod
        public Object region(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
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
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .regions)
                            .value());
        }

        @ConvertedMethod
        public Object department(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
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
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .departments)
                            .value());
        }

        @ConvertedMethod
        public Object departmentName(RuntimeEnv env, Object... args) {
            ReferenceContainer randomDepartmentName = new BasicReferenceContainer(null);
            randomDepartmentName.setObject(
                    function_array_values
                            .f
                            .env(env)
                            .call(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Address.class)
                                            .method("department")
                                            .call()
                                            .value())
                            .value());
            return ZVal.assign(randomDepartmentName.arrayGet(env, 0));
        }

        @ConvertedMethod
        public Object departmentNumber(RuntimeEnv env, Object... args) {
            ReferenceContainer randomDepartmentNumber = new BasicReferenceContainer(null);
            randomDepartmentNumber.setObject(
                    function_array_keys
                            .f
                            .env(env)
                            .call(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Address.class)
                                            .method("department")
                                            .call()
                                            .value())
                            .value());
            return ZVal.assign(randomDepartmentNumber.arrayGet(env, 0));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object citySuffix =
                ZVal.arrayFromList(
                        "Ville",
                        "Bourg",
                        "-les-Bains",
                        "-sur-Mer",
                        "-la-For\u00EAt",
                        "boeuf",
                        "nec",
                        "dan");

        public Object streetPrefix =
                ZVal.arrayFromList(
                        "rue", "rue", "chemin", "avenue", "boulevard", "place", "impasse");

        public Object cityFormats =
                ZVal.arrayFromList(
                        "{{lastName}}",
                        "{{lastName}}",
                        "{{lastName}}",
                        "{{lastName}}",
                        "{{lastName}}{{citySuffix}}",
                        "{{lastName}}{{citySuffix}}",
                        "{{lastName}}{{citySuffix}}",
                        "{{lastName}}-sur-{{lastName}}");

        public Object streetNameFormats =
                ZVal.arrayFromList(
                        "{{streetPrefix}} {{lastName}}",
                        "{{streetPrefix}} {{firstName}} {{lastName}}",
                        "{{streetPrefix}} de {{lastName}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList(
                        "{{streetName}}",
                        "{{buildingNumber}}, {{streetName}}",
                        "{{buildingNumber}}, {{streetName}}",
                        "{{buildingNumber}}, {{streetName}}",
                        "{{buildingNumber}}, {{streetName}}",
                        "{{buildingNumber}}, {{streetName}}");

        public Object addressFormats =
                ZVal.arrayFromList("{{streetAddress}}\n{{postcode}} {{city}}");

        public Object buildingNumber = ZVal.arrayFromList("%", "%#", "%#", "%#", "%##");

        public Object postcode = ZVal.arrayFromList("#####", "## ###");

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Afghanistan",
                                    "Afrique du sud",
                                    "Albanie",
                                    "Alg\u00E9rie",
                                    "Allemagne",
                                    "Andorre",
                                    "Angola",
                                    "Anguilla",
                                    "Antarctique",
                                    "Antigua et Barbuda",
                                    "Antilles n\u00E9erlandaises",
                                    "Arabie saoudite",
                                    "Argentine",
                                    "Arm\u00E9nie",
                                    "Aruba",
                                    "Australie",
                                    "Autriche",
                                    "Azerba\u00EFdjan",
                                    "Bahamas",
                                    "Bahrain",
                                    "Bangladesh",
                                    "Belgique",
                                    "Belize",
                                    "Benin",
                                    "Bermudes (Les)",
                                    "Bhoutan",
                                    "Bi\u00E9lorussie",
                                    "Bolivie",
                                    "Bosnie-Herz\u00E9govine",
                                    "Botswana",
                                    "Bouvet (\u00CEles)",
                                    "Brunei",
                                    "Br\u00E9sil",
                                    "Bulgarie",
                                    "Burkina Faso",
                                    "Burundi",
                                    "Cambodge",
                                    "Cameroun",
                                    "Canada",
                                    "Cap Vert",
                                    "Cayman (\u00CEles)",
                                    "Chili",
                                    "Chine (R\u00E9p. pop.)",
                                    "Christmas (\u00CEle)",
                                    "Chypre",
                                    "Cocos (\u00CEles)",
                                    "Colombie",
                                    "Comores",
                                    "Cook (\u00CEles)",
                                    "Cor\u00E9e du Nord",
                                    "Cor\u00E9e, Sud",
                                    "Costa Rica",
                                    "Croatie",
                                    "Cuba",
                                    "C\u00F4te d'Ivoire",
                                    "Danemark",
                                    "Djibouti",
                                    "Dominique",
                                    "\u00C9gypte",
                                    "El Salvador",
                                    "\u00C9mirats arabes unis",
                                    "\u00C9quateur",
                                    "\u00C9rythr\u00E9e",
                                    "Espagne",
                                    "Estonie",
                                    "\u00C9tats-Unis",
                                    "Ethiopie",
                                    "Falkland (\u00CEle)",
                                    "Fidji (R\u00E9publique des)",
                                    "Finlande",
                                    "France",
                                    "F\u00E9ro\u00E9 (\u00CEles)",
                                    "Gabon",
                                    "Gambie",
                                    "Ghana",
                                    "Gibraltar",
                                    "Grenade",
                                    "Groenland",
                                    "Gr\u00E8ce",
                                    "Guadeloupe",
                                    "Guam",
                                    "Guatemala",
                                    "Guin\u00E9e",
                                    "Guin\u00E9e Equatoriale",
                                    "Guin\u00E9e-Bissau",
                                    "Guyane",
                                    "Guyane fran\u00E7aise",
                                    "G\u00E9orgie",
                                    "G\u00E9orgie du Sud et Sandwich du Sud (\u00CEles)",
                                    "Ha\u00EFti",
                                    "Heard et McDonald (\u00CEles)",
                                    "Honduras",
                                    "Hong Kong",
                                    "Hongrie",
                                    "\u00CEles Mineures \u00C9loign\u00E9es des \u00C9tats-Unis",
                                    "Inde",
                                    "Indon\u00E9sie",
                                    "Irak",
                                    "Iran",
                                    "Irlande",
                                    "Islande",
                                    "Isra\u00EBl",
                                    "Italie",
                                    "Jama\u00EFque",
                                    "Japon",
                                    "Jordanie",
                                    "Kazakhstan",
                                    "Kenya",
                                    "Kirghizistan",
                                    "Kiribati",
                                    "Koweit",
                                    "La Barbad",
                                    "Laos",
                                    "Lesotho",
                                    "Lettonie",
                                    "Liban",
                                    "Libye",
                                    "Lib\u00E9ria",
                                    "Liechtenstein",
                                    "Lithuanie",
                                    "Luxembourg",
                                    "Macau",
                                    "Mac\u00E9doine",
                                    "Madagascar",
                                    "Malaisie",
                                    "Malawi",
                                    "Maldives (\u00CEles)",
                                    "Mali",
                                    "Malte",
                                    "Mariannes du Nord (\u00CEles)",
                                    "Maroc",
                                    "Marshall (\u00CEles)",
                                    "Martinique",
                                    "Maurice",
                                    "Mauritanie",
                                    "Mayotte",
                                    "Mexique",
                                    "Micron\u00E9sie (\u00C9tats f\u00E9d\u00E9r\u00E9s de)",
                                    "Moldavie",
                                    "Monaco",
                                    "Mongolie",
                                    "Montserrat",
                                    "Mozambique",
                                    "Myanmar",
                                    "Namibie",
                                    "Nauru",
                                    "Nepal",
                                    "Nicaragua",
                                    "Niger",
                                    "Nigeria",
                                    "Niue",
                                    "Norfolk (\u00CEles)",
                                    "Norv\u00E8ge",
                                    "Nouvelle Cal\u00E9donie",
                                    "Nouvelle-Z\u00E9lande",
                                    "Oman",
                                    "Ouganda",
                                    "Ouzb\u00E9kistan",
                                    "Pakistan",
                                    "Palau",
                                    "Panama",
                                    "Papouasie-Nouvelle-Guin\u00E9e",
                                    "Paraguay",
                                    "Pays-Bas",
                                    "Philippines",
                                    "Pitcairn (\u00CEles)",
                                    "Pologne",
                                    "Polyn\u00E9sie fran\u00E7aise",
                                    "Porto Rico",
                                    "Portugal",
                                    "P\u00E9rou",
                                    "Qatar",
                                    "Roumanie",
                                    "Royaume-Uni",
                                    "Russie",
                                    "Rwanda",
                                    "R\u00E9p. D\u00E9m. du Congo",
                                    "R\u00E9publique centrafricaine",
                                    "R\u00E9publique Dominicaine",
                                    "R\u00E9publique tch\u00E8que",
                                    "R\u00E9union (La)",
                                    "Sahara Occidental",
                                    "Saint Pierre et Miquelon",
                                    "Saint Vincent et les Grenadines",
                                    "Saint-Kitts et Nevis",
                                    "Saint-Marin (R\u00E9p. de)",
                                    "Sainte H\u00E9l\u00E8ne",
                                    "Sainte Lucie",
                                    "Samoa",
                                    "Samoa",
                                    "Seychelles",
                                    "Sierra Leone",
                                    "Singapour",
                                    "Slovaquie",
                                    "Slov\u00E9nie",
                                    "Somalie",
                                    "Soudan",
                                    "Sri Lanka",
                                    "Suisse",
                                    "Suriname",
                                    "Su\u00E8de",
                                    "Svalbard et Jan Mayen (\u00CEles)",
                                    "Swaziland",
                                    "Syrie",
                                    "S\u00E3o Tom\u00E9 et Pr\u00EDncipe (R\u00E9p.)",
                                    "S\u00E9n\u00E9gal",
                                    "Tadjikistan",
                                    "Taiwan",
                                    "Tanzanie",
                                    "Tchad",
                                    "Territoire britannique de l'oc\u00E9an Indien",
                                    "Territoires fran\u00E7ais du sud",
                                    "Thailande",
                                    "Timor",
                                    "Togo",
                                    "Tokelau",
                                    "Tonga",
                                    "Trinit\u00E9 et Tobago",
                                    "Tunisie",
                                    "Turkm\u00E9nistan",
                                    "Turks et Ca\u00EFques (\u00CEles)",
                                    "Turquie",
                                    "Tuvalu",
                                    "Ukraine",
                                    "Uruguay",
                                    "Vanuatu",
                                    "Vatican (Etat du)",
                                    "Venezuela",
                                    "Vierges (\u00CEles)",
                                    "Vierges britanniques (\u00CEles)",
                                    "Vietnam",
                                    "Wallis et Futuna (\u00CEles)",
                                    "Yemen",
                                    "Yougoslavie",
                                    "Zambie",
                                    "Za\u00EFre",
                                    "Zimbabwe");
                        });

        public Object regions =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Alsace",
                                    "Aquitaine",
                                    "Auvergne",
                                    "Bourgogne",
                                    "Bretagne",
                                    "Centre",
                                    "Champagne-Ardenne",
                                    "Corse",
                                    "Franche-Comt\u00E9",
                                    "\u00CEle-de-France",
                                    "Languedoc-Roussillon",
                                    "Limousin",
                                    "Lorraine",
                                    "Midi-Pyr\u00E9n\u00E9es",
                                    "Nord-Pas-de-Calais",
                                    "Basse-Normandie",
                                    "Haute-Normandie",
                                    "Pays-de-Loire",
                                    "Picardie",
                                    "Poitou-Charentes",
                                    "Provence-Alpes-C\u00F4te d'Azur",
                                    "Rhone-Alpes",
                                    "Guadeloupe",
                                    "Martinique",
                                    "Guyane",
                                    "R\u00E9union",
                                    "Saint-Pierre-et-Miquelon",
                                    "Mayotte",
                                    "Saint-Barth\u00E9l\u00E9my",
                                    "Saint-Martin",
                                    "Wallis-et-Futuna",
                                    "Polyn\u00E9sie fran\u00E7aise",
                                    "Nouvelle-Cal\u00E9donie");
                        });

        public Object departments =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.newArray(
                                    new ZPair(0, ZVal.newArray(new ZPair("01", "Ain"))),
                                    new ZPair(1, ZVal.newArray(new ZPair("02", "Aisne"))),
                                    new ZPair(2, ZVal.newArray(new ZPair("03", "Allier"))),
                                    new ZPair(
                                            3,
                                            ZVal.newArray(
                                                    new ZPair("04", "Alpes-de-Haute-Provence"))),
                                    new ZPair(4, ZVal.newArray(new ZPair("05", "Hautes-Alpes"))),
                                    new ZPair(5, ZVal.newArray(new ZPair("06", "Alpes-Maritimes"))),
                                    new ZPair(6, ZVal.newArray(new ZPair("07", "Ard\u00E8che"))),
                                    new ZPair(7, ZVal.newArray(new ZPair("08", "Ardennes"))),
                                    new ZPair(8, ZVal.newArray(new ZPair("09", "Ari\u00E8ge"))),
                                    new ZPair(9, ZVal.newArray(new ZPair("10", "Aube"))),
                                    new ZPair(10, ZVal.newArray(new ZPair("11", "Aude"))),
                                    new ZPair(11, ZVal.newArray(new ZPair("12", "Aveyron"))),
                                    new ZPair(
                                            12,
                                            ZVal.newArray(
                                                    new ZPair("13", "Bouches-du-Rh\u00F4ne"))),
                                    new ZPair(13, ZVal.newArray(new ZPair("14", "Calvados"))),
                                    new ZPair(14, ZVal.newArray(new ZPair("15", "Cantal"))),
                                    new ZPair(15, ZVal.newArray(new ZPair("16", "Charente"))),
                                    new ZPair(
                                            16,
                                            ZVal.newArray(new ZPair("17", "Charente-Maritime"))),
                                    new ZPair(17, ZVal.newArray(new ZPair("18", "Cher"))),
                                    new ZPair(18, ZVal.newArray(new ZPair("19", "Corr\u00E8ze"))),
                                    new ZPair(19, ZVal.newArray(new ZPair("2A", "Corse-du-Sud"))),
                                    new ZPair(20, ZVal.newArray(new ZPair("2B", "Haute-Corse"))),
                                    new ZPair(21, ZVal.newArray(new ZPair("21", "C\u00F4te-d'Or"))),
                                    new ZPair(
                                            22,
                                            ZVal.newArray(new ZPair("22", "C\u00F4tes-d'Armor"))),
                                    new ZPair(23, ZVal.newArray(new ZPair("23", "Creuse"))),
                                    new ZPair(24, ZVal.newArray(new ZPair("24", "Dordogne"))),
                                    new ZPair(25, ZVal.newArray(new ZPair("25", "Doubs"))),
                                    new ZPair(26, ZVal.newArray(new ZPair("26", "Dr\u00F4me"))),
                                    new ZPair(27, ZVal.newArray(new ZPair("27", "Eure"))),
                                    new ZPair(28, ZVal.newArray(new ZPair("28", "Eure-et-Loir"))),
                                    new ZPair(29, ZVal.newArray(new ZPair("29", "Finist\u00E8re"))),
                                    new ZPair(30, ZVal.newArray(new ZPair("30", "Gard"))),
                                    new ZPair(31, ZVal.newArray(new ZPair("31", "Haute-Garonne"))),
                                    new ZPair(32, ZVal.newArray(new ZPair("32", "Gers"))),
                                    new ZPair(33, ZVal.newArray(new ZPair("33", "Gironde"))),
                                    new ZPair(34, ZVal.newArray(new ZPair("34", "H\u00E9rault"))),
                                    new ZPair(
                                            35, ZVal.newArray(new ZPair("35", "Ille-et-Vilaine"))),
                                    new ZPair(36, ZVal.newArray(new ZPair("36", "Indre"))),
                                    new ZPair(37, ZVal.newArray(new ZPair("37", "Indre-et-Loire"))),
                                    new ZPair(38, ZVal.newArray(new ZPair("38", "Is\u00E8re"))),
                                    new ZPair(39, ZVal.newArray(new ZPair("39", "Jura"))),
                                    new ZPair(40, ZVal.newArray(new ZPair("40", "Landes"))),
                                    new ZPair(41, ZVal.newArray(new ZPair("41", "Loir-et-Cher"))),
                                    new ZPair(42, ZVal.newArray(new ZPair("42", "Loire"))),
                                    new ZPair(43, ZVal.newArray(new ZPair("43", "Haute-Loire"))),
                                    new ZPair(
                                            44, ZVal.newArray(new ZPair("44", "Loire-Atlantique"))),
                                    new ZPair(45, ZVal.newArray(new ZPair("45", "Loiret"))),
                                    new ZPair(46, ZVal.newArray(new ZPair("46", "Lot"))),
                                    new ZPair(47, ZVal.newArray(new ZPair("47", "Lot-et-Garonne"))),
                                    new ZPair(48, ZVal.newArray(new ZPair("48", "Loz\u00E8re"))),
                                    new ZPair(49, ZVal.newArray(new ZPair("49", "Maine-et-Loire"))),
                                    new ZPair(50, ZVal.newArray(new ZPair("50", "Manche"))),
                                    new ZPair(51, ZVal.newArray(new ZPair("51", "Marne"))),
                                    new ZPair(52, ZVal.newArray(new ZPair("52", "Haute-Marne"))),
                                    new ZPair(53, ZVal.newArray(new ZPair("53", "Mayenne"))),
                                    new ZPair(
                                            54,
                                            ZVal.newArray(new ZPair("54", "Meurthe-et-Moselle"))),
                                    new ZPair(55, ZVal.newArray(new ZPair("55", "Meuse"))),
                                    new ZPair(56, ZVal.newArray(new ZPair("56", "Morbihan"))),
                                    new ZPair(57, ZVal.newArray(new ZPair("57", "Moselle"))),
                                    new ZPair(58, ZVal.newArray(new ZPair("58", "Ni\u00E8vre"))),
                                    new ZPair(59, ZVal.newArray(new ZPair("59", "Nord"))),
                                    new ZPair(60, ZVal.newArray(new ZPair("60", "Oise"))),
                                    new ZPair(61, ZVal.newArray(new ZPair("61", "Orne"))),
                                    new ZPair(62, ZVal.newArray(new ZPair("62", "Pas-de-Calais"))),
                                    new ZPair(
                                            63, ZVal.newArray(new ZPair("63", "Puy-de-D\u00F4me"))),
                                    new ZPair(
                                            64,
                                            ZVal.newArray(
                                                    new ZPair(
                                                            "64",
                                                            "Pyr\u00E9n\u00E9es-Atlantiques"))),
                                    new ZPair(
                                            65,
                                            ZVal.newArray(
                                                    new ZPair("65", "Hautes-Pyr\u00E9n\u00E9es"))),
                                    new ZPair(
                                            66,
                                            ZVal.newArray(
                                                    new ZPair(
                                                            "66",
                                                            "Pyr\u00E9n\u00E9es-Orientales"))),
                                    new ZPair(67, ZVal.newArray(new ZPair("67", "Bas-Rhin"))),
                                    new ZPair(68, ZVal.newArray(new ZPair("68", "Haut-Rhin"))),
                                    new ZPair(69, ZVal.newArray(new ZPair("69", "Rh\u00F4ne"))),
                                    new ZPair(
                                            70, ZVal.newArray(new ZPair("70", "Haute-Sa\u00F4ne"))),
                                    new ZPair(
                                            71,
                                            ZVal.newArray(new ZPair("71", "Sa\u00F4ne-et-Loire"))),
                                    new ZPair(72, ZVal.newArray(new ZPair("72", "Sarthe"))),
                                    new ZPair(73, ZVal.newArray(new ZPair("73", "Savoie"))),
                                    new ZPair(74, ZVal.newArray(new ZPair("74", "Haute-Savoie"))),
                                    new ZPair(75, ZVal.newArray(new ZPair("75", "Paris"))),
                                    new ZPair(76, ZVal.newArray(new ZPair("76", "Seine-Maritime"))),
                                    new ZPair(77, ZVal.newArray(new ZPair("77", "Seine-et-Marne"))),
                                    new ZPair(78, ZVal.newArray(new ZPair("78", "Yvelines"))),
                                    new ZPair(
                                            79, ZVal.newArray(new ZPair("79", "Deux-S\u00E8vres"))),
                                    new ZPair(80, ZVal.newArray(new ZPair("80", "Somme"))),
                                    new ZPair(81, ZVal.newArray(new ZPair("81", "Tarn"))),
                                    new ZPair(
                                            82, ZVal.newArray(new ZPair("82", "Tarn-et-Garonne"))),
                                    new ZPair(83, ZVal.newArray(new ZPair("83", "Var"))),
                                    new ZPair(84, ZVal.newArray(new ZPair("84", "Vaucluse"))),
                                    new ZPair(85, ZVal.newArray(new ZPair("85", "Vend\u00E9e"))),
                                    new ZPair(86, ZVal.newArray(new ZPair("86", "Vienne"))),
                                    new ZPair(87, ZVal.newArray(new ZPair("87", "Haute-Vienne"))),
                                    new ZPair(88, ZVal.newArray(new ZPair("88", "Vosges"))),
                                    new ZPair(89, ZVal.newArray(new ZPair("89", "Yonne"))),
                                    new ZPair(
                                            90,
                                            ZVal.newArray(
                                                    new ZPair("90", "Territoire de Belfort"))),
                                    new ZPair(91, ZVal.newArray(new ZPair("91", "Essonne"))),
                                    new ZPair(92, ZVal.newArray(new ZPair("92", "Hauts-de-Seine"))),
                                    new ZPair(
                                            93,
                                            ZVal.newArray(new ZPair("93", "Seine-Saint-Denis"))),
                                    new ZPair(94, ZVal.newArray(new ZPair("94", "Val-de-Marne"))),
                                    new ZPair(95, ZVal.newArray(new ZPair("95", "Val-d'Oise"))),
                                    new ZPair(96, ZVal.newArray(new ZPair("971", "Guadeloupe"))),
                                    new ZPair(97, ZVal.newArray(new ZPair("972", "Martinique"))),
                                    new ZPair(98, ZVal.newArray(new ZPair("973", "Guyane"))),
                                    new ZPair(
                                            99, ZVal.newArray(new ZPair("974", "La R\u00E9union"))),
                                    new ZPair(100, ZVal.newArray(new ZPair("976", "Mayotte"))));
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\fr_FR\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "buildingNumber",
                            "cityFormats",
                            "citySuffix",
                            "country",
                            "departments",
                            "postcode",
                            "regions",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetPrefix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/fr_FR/Address.php")
                    .addExtendsClass("Faker\\Provider\\Address")
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
