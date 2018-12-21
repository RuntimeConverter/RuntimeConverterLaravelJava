package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.cs_CZ.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/cs_CZ/Address.php

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

    @ConvertedMethod
    public Object city(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
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
                                                                .cs_CZ
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "city")))
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
                                                        .cs_CZ
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .city)
                        .value());
    }

    @ConvertedMethod
    public Object streetName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
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
                                                                .cs_CZ
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "street")))
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
                                                        .cs_CZ
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .street)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\cs_CZ\\Address";

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
                                                            .cs_CZ
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .regions)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object streetAddressFormats =
                ZVal.arrayFromList(
                        "{{streetName}}",
                        "{{streetName}} {{buildingNumber}}",
                        "{{streetName}} {{buildingNumber}}",
                        "{{streetName}} {{buildingNumber}}",
                        "{{streetName}} {{buildingNumber}}");

        public Object addressFormats =
                ZVal.arrayFromList(
                        "{{streetAddress}}\n{{region}}\n{{postcode}} {{city}}",
                        "{{streetAddress}}\n{{postcode}} {{city}}",
                        "{{streetAddress}}\n{{postcode}} {{city}}",
                        "{{streetAddress}}\n{{postcode}} {{city}}",
                        "{{streetAddress}}\n{{postcode}} {{city}}",
                        "{{streetAddress}}\n{{postcode}} {{city}}",
                        "{{streetAddress}}\n{{postcode}} {{city}}\n\u010Cesk\u00E1 republika");

        public Object buildingNumber =
                ZVal.arrayFromList("%", "%%", "%/%%", "%%/%%", "%/%%%", "%%/%%%");

        public Object postcode = ZVal.arrayFromList("#####", "### ##");

        public Object city =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Brno",
                                    "B\u0159eclav",
                                    "Cheb",
                                    "Chomutov",
                                    "Chrudim",
                                    "\u010Cerno\u0161ice",
                                    "\u010Cesk\u00E1 L\u00EDpa",
                                    "\u010Cesk\u00E9 Bud\u011Bjovice",
                                    "\u010Cesk\u00FD T\u011B\u0161\u00EDn",
                                    "D\u011B\u010D\u00EDn",
                                    "Fr\u00FDdek-M\u00EDstek",
                                    "Havl\u00ED\u010Dk\u016Fv Brod",
                                    "Hav\u00ED\u0159ov",
                                    "Hodon\u00EDn",
                                    "Hradec Kr\u00E1lov\u00E9",
                                    "Jablonec nad Nisou",
                                    "Jihlava",
                                    "Karlovy Vary",
                                    "Karvin\u00E1",
                                    "Kladno",
                                    "Kol\u00EDn",
                                    "Krnov",
                                    "Krom\u011B\u0159\u00ED\u017E",
                                    "Liberec",
                                    "Litom\u011B\u0159ice",
                                    "Litv\u00EDnov",
                                    "Mlad\u00E1 Boleslav",
                                    "Most",
                                    "Nov\u00FD Ji\u010D\u00EDn",
                                    "Olomouc",
                                    "Opava",
                                    "Orlov\u00E1",
                                    "Ostrava",
                                    "Pardubice",
                                    "Plze\u0148",
                                    "Praha",
                                    "Prost\u011Bjov",
                                    "P\u00EDsek",
                                    "P\u0159erov",
                                    "P\u0159\u00EDbram",
                                    "Sokolov",
                                    "\u0160umperk",
                                    "Teplice",
                                    "Trutnov",
                                    "T\u00E1bor",
                                    "T\u0159eb\u00ED\u010D",
                                    "T\u0159inec",
                                    "Uhersk\u00E9 Hradi\u0161t\u011B",
                                    "\u00DAst\u00ED nad Labem",
                                    "Vala\u0161sk\u00E9 Mezi\u0159\u00ED\u010D\u00ED",
                                    "Vset\u00EDn",
                                    "Zl\u00EDn",
                                    "Znojmo");
                        });

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Afgh\u00E1nist\u00E1n",
                                    "Alb\u00E1nie",
                                    "Al\u017E\u00EDrsko",
                                    "Andorra",
                                    "Angola",
                                    "Antigua a Barbuda",
                                    "Argentina",
                                    "Arm\u00E9nie",
                                    "Austr\u00E1lie",
                                    "\u00C1zerb\u00E1jd\u017E\u00E1n",
                                    "Bahamy",
                                    "Bahrajn",
                                    "Banglad\u00E9\u0161",
                                    "Barbados",
                                    "Belgie",
                                    "Belize",
                                    "Benin",
                                    "B\u011Blorusko",
                                    "Bh\u00FAt\u00E1n",
                                    "Bol\u00EDvie",
                                    "Bosna a Hercegovina",
                                    "Botswana",
                                    "Braz\u00EDlie",
                                    "Brunej",
                                    "Bulharsko",
                                    "Burkina Faso",
                                    "Burundi",
                                    "Cookovy ostrovy",
                                    "\u010Cad",
                                    "\u010Cern\u00E1 Hora",
                                    "\u010Cesk\u00E1 republika",
                                    "\u010C\u00EDna",
                                    "D\u00E1nsko",
                                    "Demokratick\u00E1 republika Kongo",
                                    "Dominika",
                                    "Dominik\u00E1nsk\u00E1 republika",
                                    "D\u017Eibutsko",
                                    "Egypt",
                                    "Ekv\u00E1dor",
                                    "Eritrea",
                                    "Estonsko",
                                    "Etiopie",
                                    "Fid\u017Ei",
                                    "Filip\u00EDny",
                                    "Finsko",
                                    "Francie",
                                    "Gabon",
                                    "Gambie",
                                    "Ghana",
                                    "Grenada",
                                    "Gruzie",
                                    "Guatemala",
                                    "Guinea",
                                    "Guinea-Bissau",
                                    "Guyana",
                                    "Haiti",
                                    "Honduras",
                                    "Chile",
                                    "Chorvatsko",
                                    "Indie",
                                    "Indon\u00E9sie",
                                    "Ir\u00E1k",
                                    "\u00CDr\u00E1n",
                                    "Irsko",
                                    "Island",
                                    "It\u00E1lie",
                                    "Izrael",
                                    "Jamajka",
                                    "Japonsko",
                                    "Jemen",
                                    "Jihoafrick\u00E1 republika",
                                    "Ji\u017En\u00ED Korea",
                                    "Ji\u017En\u00ED S\u00FAd\u00E1n",
                                    "Jord\u00E1nsko",
                                    "Kambod\u017Ea",
                                    "Kamerun",
                                    "Kanada",
                                    "Kapverdy",
                                    "Katar",
                                    "Kazachst\u00E1n",
                                    "Ke\u0148a",
                                    "Kiribati",
                                    "Kolumbie",
                                    "Komory",
                                    "Republika Kongo",
                                    "Kostarika",
                                    "Kuba",
                                    "Kuvajt",
                                    "Kypr",
                                    "Kyrgyzst\u00E1n",
                                    "Laos",
                                    "Lesotho",
                                    "Libanon",
                                    "Lib\u00E9rie",
                                    "Libye",
                                    "Lichten\u0161tejnsko",
                                    "Litva",
                                    "Loty\u0161sko",
                                    "Lucembursko",
                                    "Madagaskar",
                                    "Ma\u010Farsko",
                                    "Makedonie",
                                    "Malajsie",
                                    "Malawi",
                                    "Maledivy",
                                    "Mali",
                                    "Malta",
                                    "Maroko",
                                    "Marshallovy ostrovy",
                                    "Maurit\u00E1nie",
                                    "Mauricius",
                                    "Mexiko",
                                    "Federativn\u00ED st\u00E1ty Mikron\u00E9sie",
                                    "Moldavsko",
                                    "Monako",
                                    "Mongolsko",
                                    "Mosambik",
                                    "Myanmar",
                                    "Namibie",
                                    "Nauru",
                                    "Nep\u00E1l",
                                    "N\u011Bmecko",
                                    "Niger",
                                    "Nig\u00E9rie",
                                    "Nikaragua",
                                    "Niue",
                                    "Nizozemsko",
                                    "Norsko",
                                    "Nov\u00FD Z\u00E9land",
                                    "Om\u00E1n",
                                    "P\u00E1kist\u00E1n",
                                    "Palau",
                                    "Panama",
                                    "Papua-Nov\u00E1 Guinea",
                                    "Paraguay",
                                    "Peru",
                                    "Pob\u0159e\u017E\u00ED slonoviny",
                                    "Polsko",
                                    "Portugalsko",
                                    "Rakousko",
                                    "Rovn\u00EDkov\u00E1 Guinea",
                                    "Rumunsko",
                                    "Rusko",
                                    "Rwanda",
                                    "\u0158ecko",
                                    "Salvador",
                                    "Samoa",
                                    "San Marino",
                                    "Sa\u00FAdsk\u00E1 Ar\u00E1bie",
                                    "Senegal",
                                    "Severn\u00ED Korea",
                                    "Seychely",
                                    "Sierra Leone",
                                    "Singapur",
                                    "Slovensko",
                                    "Slovinsko",
                                    "Som\u00E1lsko",
                                    "Spojen\u00E9 arabsk\u00E9 emir\u00E1ty",
                                    "Spojen\u00E9 kr\u00E1lovstv\u00ED",
                                    "Spojen\u00E9 st\u00E1ty americk\u00E9",
                                    "Srbsko",
                                    "St\u0159edoafrick\u00E1 republika",
                                    "Surinam",
                                    "S\u00FAd\u00E1n",
                                    "Svat\u00E1 Lucie",
                                    "Svat\u00FD Kry\u0161tof a Nevis",
                                    "Svat\u00FD Tom\u00E1\u0161 a Princ\u016Fv ostrov",
                                    "Svat\u00FD Vincenc a Grenadiny",
                                    "Svazijsko",
                                    "S\u00FDrie",
                                    "\u0160alamounovy ostrovy",
                                    "\u0160pan\u011Blsko",
                                    "\u0160r\u00ED Lanka",
                                    "\u0160v\u00E9dsko",
                                    "\u0160v\u00FDcarsko",
                                    "T\u00E1d\u017Eikist\u00E1n",
                                    "Tanzanie",
                                    "Thajsko",
                                    "Togo",
                                    "Tonga",
                                    "Trinidad a Tobago",
                                    "Tunisko",
                                    "Turecko",
                                    "Turkmenist\u00E1n",
                                    "Tuvalu",
                                    "Uganda",
                                    "Ukrajina",
                                    "Uruguay",
                                    "Uzbekist\u00E1n",
                                    "Vanuatu",
                                    "Vatik\u00E1n",
                                    "Venezuela",
                                    "Vietnam",
                                    "V\u00FDchodn\u00ED Timor",
                                    "Zambie",
                                    "Zimbabwe");
                        });

        public Object regions =
                ZVal.arrayFromList(
                        "Hlavn\u00ED m\u011Bsto Praha",
                        "Jihomoravsk\u00FD kraj",
                        "Jiho\u010Desk\u00FD kraj",
                        "Karlovarsk\u00FD kraj",
                        "Kr\u00E1lov\u00E9hradeck\u00FD kraj",
                        "Libereck\u00FD kraj",
                        "Moravskoslezsk\u00FD kraj",
                        "Olomouck\u00FD kraj",
                        "Pardubick\u00FD kraj",
                        "Plze\u0148sk\u00FD kraj",
                        "St\u0159edo\u010Desk\u00FD kraj",
                        "Vyso\u010Dina",
                        "Zl\u00EDnsk\u00FD kraj",
                        "\u00DAsteck\u00FD kraj");

        public Object street =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Al\u017E\u00EDrsk\u00E1",
                                    "Angelovova",
                                    "Anton\u00EDnsk\u00E1",
                                    "Arm\u00E9nsk\u00E1",
                                    "\u010Celkovick\u00E1",
                                    "\u010Cervenkova",
                                    "\u010Ceskoslovensk\u00E9ho exilu",
                                    "Chlum\u00EDnsk\u00E1",
                                    "Chl\u00E1dkova",
                                    "Diska\u0159sk\u00E1",
                                    "Do Kope\u010Dka",
                                    "Do Vozovny",
                                    "Do Vr\u0161ku",
                                    "Doubravick\u00E1",
                                    "Doudova",
                                    "Drahot\u00EDnsk\u00E1",
                                    "D\u011Blnick\u00E1",
                                    "Gener\u00E1la \u0160i\u0161ky",
                                    "Gon\u010Darenkova",
                                    "Gutova",
                                    "Havl\u00EDnova",
                                    "Havran\u00ED",
                                    "Helmova",
                                    "He\u010Dkova",
                                    "Holubinkov\u00E1",
                                    "Hol\u00EDnsk\u00E1",
                                    "Horn\u00ED Hrdlo\u0159ezsk\u00E1",
                                    "Horn\u00ED Stromky",
                                    "Hostiva\u0159sk\u00E9 n\u00E1m.",
                                    "Houba\u0159sk\u00E1",
                                    "Ho\u0159ansk\u00E1",
                                    "Hrachovsk\u00E1",
                                    "Hrad III. n\u00E1dvo\u0159\u00ED",
                                    "Hrdlo\u0159ezsk\u00E1",
                                    "Jensk\u00E1",
                                    "Jerevansk\u00E1",
                                    "Je\u017Eovick\u00E1",
                                    "K B\u0159ezince",
                                    "K Dobr\u00E9 Vod\u011B",
                                    "K Ho\u0159avce",
                                    "K Hru\u0161ovu",
                                    "K H\u00E1ji",
                                    "K N\u00E1vsi",
                                    "K Pades\u00E1tn\u00EDku",
                                    "K Pyramidce",
                                    "K Samot\u011B",
                                    "K Vinici",
                                    "K Vystrkovu",
                                    "Karlovarsk\u00E1",
                                    "Karl\u00EDnsk\u00E9 n\u00E1m.",
                                    "Ka\u0148kova",
                                    "Ke Kyjovu",
                                    "Ke Stadionu",
                                    "Kejnick\u00E1",
                                    "Klatovsk\u00E1",
                                    "Kohoutov\u00FDch",
                                    "Kopansk\u00E1",
                                    "Kralupsk\u00E1",
                                    "Kukelsk\u00E1",
                                    "Kuku\u010D\u00EDnova",
                                    "Kune\u0161ova",
                                    "Kvestorsk\u00E1",
                                    "K\u0159i\u0161\u0165anova",
                                    "Lan\u017Ehotsk\u00E1",
                                    "Le\u0161t\u00EDnsk\u00E1",
                                    "Lindavsk\u00E1",
                                    "Litevsk\u00E1",
                                    "Lojovick\u00E1",
                                    "Luke\u0161ova",
                                    "Malt\u00E9zsk\u00E9 n\u00E1m\u011Bst\u00ED",
                                    "Melodick\u00E1",
                                    "Me\u010D\u00EDkov\u00E1",
                                    "Milady Hor\u00E1kov\u00E9",
                                    "M\u0161ensk\u00E1",
                                    "N. A. N\u011Bkrasova",
                                    "Na D\u011Bdince",
                                    "Na Habrov\u00E9",
                                    "Na Jezerce",
                                    "Na J\u00EDlech",
                                    "Na Petynce",
                                    "Na Rozcest\u00ED",
                                    "Na Sedli\u0161ti",
                                    "Na Vrchu",
                                    "Na V\u00FD\u0161in\u011B",
                                    "Na \u00DAbo\u010D\u00ED",
                                    "Na \u0160tamberku",
                                    "Nad Hlin\u00EDkem",
                                    "Nad H\u0159i\u0161t\u011Bm",
                                    "Nad Klikovkou",
                                    "Nad libe\u0148sk\u00FDm n\u00E1dra\u017E\u00EDm",
                                    "Nad Nuslemi",
                                    "Nad Sl\u00E1vi\u00ED",
                                    "Nad Trnkovem",
                                    "Nad \u0160auerov\u00FDmi sady",
                                    "Net\u0159ebsk\u00E1",
                                    "Nivnick\u00E1",
                                    "N\u00E1dra\u017En\u00ED",
                                    "n\u00E1m. Pod L\u00EDpou",
                                    "n\u00E1m. P\u0159ed bateriemi",
                                    "n\u00E1m. Svatopluka \u010Cecha",
                                    "Odlehl\u00E1",
                                    "Okrasn\u00E1",
                                    "Omsk\u00E1",
                                    "Otavova",
                                    "Ov\u00E1lov\u00E1",
                                    "Palack\u00E9ho n\u00E1m.",
                                    "Pavli\u0161ovsk\u00E1",
                                    "Pa\u0161kova",
                                    "Pet\u0159\u00EDnsk\u00E9 sady",
                                    "Pilovsk\u00E1",
                                    "Pod Bruskou",
                                    "Pod novou \u0161kolou",
                                    "Pod soutrat\u00EDm",
                                    "Pod Svahem",
                                    "Pod \u00DAtesy",
                                    "Pohledn\u00E1",
                                    "Po\u0161epn\u00E9ho n\u00E1m.",
                                    "Prokopov\u00FDch",
                                    "P\u00E1vovsk\u00E9 n\u00E1m\u011Bst\u00ED",
                                    "P\u011Btipesk\u00E9ho",
                                    "P\u0159\u00EDbramsk\u00E1",
                                    "Radbuzsk\u00E1",
                                    "Radnick\u00E9 schody",
                                    "Raichlova",
                                    "Roentgenova",
                                    "Rozko\u0161n\u00E9ho",
                                    "Rozrazilov\u00E1",
                                    "Ruzy\u0148sk\u00E1",
                                    "\u0158\u00EDmovsk\u00E1",
                                    "\u0158\u00ED\u010Dn\u00ED",
                                    "Satalick\u00E1",
                                    "Schoellerova",
                                    "Smrkov\u00E1",
                                    "Souvratn\u00ED",
                                    "Sovova",
                                    "Sportovn\u00ED",
                                    "Stadionov\u00E1",
                                    "Statkov\u00E1",
                                    "Stavebn\u00ED",
                                    "\u0160irok\u00E1",
                                    "\u0160koln\u00ED",
                                    "Tatransk\u00E1",
                                    "Tomsova",
                                    "Toru\u0148sk\u00E1",
                                    "To\u010Densk\u00E1",
                                    "Trnkovo n\u00E1m\u011Bst\u00ED",
                                    "Truhl\u00E1\u0159ova",
                                    "Tvrdonick\u00E1",
                                    "T\u00FDmlova",
                                    "U Ber\u00E1nky",
                                    "U Chmelnice",
                                    "U Chodovsk\u00E9ho h\u0159bitova",
                                    "U Dr\u00E1\u017Eky",
                                    "U Fo\u0159ta",
                                    "U Kam\u00FDku",
                                    "U Klubovny",
                                    "U Lesa",
                                    "U Pek\u00E1ren",
                                    "U Pra\u0161n\u00E9 br\u00E1ny",
                                    "U Pr\u00E1delny",
                                    "U Silnice",
                                    "U Sladovny",
                                    "U Slovanky",
                                    "U Soutoku",
                                    "U Trojice",
                                    "U Vinice",
                                    "U vinn\u00FDch sklep\u016F",
                                    "U Vod\u00E1rny",
                                    "U Vorl\u00EDk\u016F",
                                    "U zelen\u00E9ho pt\u00E1ka",
                                    "U \u010Cek\u00E1rny",
                                    "U \u017Dupansk\u00FDch",
                                    "Ukrajinsk\u00E1",
                                    "\u00DAjezdsk\u00E1",
                                    "V J\u00E1m\u011B",
                                    "V P\u0159edn\u00EDm Hloub\u011Bt\u00EDn\u011B",
                                    "V Rohu",
                                    "V Uli\u010Dce",
                                    "Val\u010D\u00EDkova",
                                    "Ve Lhotce",
                                    "Ve Vr\u0161\u00EDch",
                                    "Velenick\u00E1",
                                    "Violkov\u00E1",
                                    "Vla\u0161sk\u00E1",
                                    "Vod\u011Bradsk\u00E1",
                                    "Vydersk\u00E1",
                                    "Vysoko\u0161kolsk\u00E1",
                                    "V\u00FDpadov\u00E1",
                                    "V\u0159esovick\u00E1",
                                    "Za Pek\u00E1rnou",
                                    "Z\u00E1meck\u00E1");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\cs_CZ\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "buildingNumber",
                            "city",
                            "country",
                            "postcode",
                            "regions",
                            "street",
                            "streetAddressFormats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/cs_CZ/Address.php")
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
