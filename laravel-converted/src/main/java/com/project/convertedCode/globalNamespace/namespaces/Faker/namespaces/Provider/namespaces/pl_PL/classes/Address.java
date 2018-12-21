package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.pl_PL.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/pl_PL/Address.php

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
                                                                .pl_PL
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
                                                        .pl_PL
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
                                                                .pl_PL
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
                                                        .pl_PL
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .street)
                        .value());
    }

    @ConvertedMethod
    public Object state(RuntimeEnv env, Object... args) {
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
                                                                .pl_PL
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "state")))
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
                                                        .pl_PL
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .state)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\pl_PL\\Address";

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
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object streetAddressFormats =
                ZVal.arrayFromList("{{streetName}} {{buildingNumber}}");

        public Object addressFormats =
                ZVal.arrayFromList("{{streetAddress}}, {{postcode}} {{city}}");

        public Object buildingNumber = ZVal.arrayFromList("##A", "##", "##A/##", "##/##");

        public Object postcode = ZVal.arrayFromList("##-###");

        public Object state =
                ZVal.arrayFromList(
                        "dolno\u015Bl\u0105skie",
                        "kujawsko-pomorskie",
                        "lubelskie",
                        "lubuskie",
                        "\u0142\u00F3dzkie",
                        "ma\u0142opolskie",
                        "mazowieckie",
                        "opolskie",
                        "podkarpackie",
                        "podlaskie",
                        "pomorskie",
                        "\u015Bl\u0105skie",
                        "\u015Bwi\u0119tokrzyskie",
                        "warmi\u0144sko-mazurskie",
                        "wielkopolskie",
                        "zachodniopomorskie");

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Afganistan",
                                    "Albania",
                                    "Algieria",
                                    "Andora",
                                    "Angola",
                                    "Antigua i Barbuda",
                                    "Arabia Saudyjska",
                                    "Argentyna",
                                    "Armenia",
                                    "Australia",
                                    "Austria",
                                    "Azerbejd\u017Can",
                                    "Bahamy",
                                    "Bahrajn",
                                    "Bangladesz",
                                    "Barbados",
                                    "Belgia",
                                    "Belize",
                                    "Benin",
                                    "Bhutan",
                                    "Bia\u0142oru\u015B",
                                    "Birma",
                                    "Boliwia",
                                    "Bo\u015Bnia i Hercegowina",
                                    "Botswana",
                                    "Brazylia",
                                    "Brunei",
                                    "Bu\u0142garia",
                                    "Burkina Faso",
                                    "Burundi",
                                    "Chile",
                                    "Chiny",
                                    "Chorwacja",
                                    "Cypr",
                                    "Czad",
                                    "Czarnog\u00F3ra",
                                    "Czechy",
                                    "Dania",
                                    "Demokratyczna Republika Konga",
                                    "Dominika",
                                    "Dominikana",
                                    "D\u017Cibuti",
                                    "Egipt",
                                    "Ekwador",
                                    "Erytrea",
                                    "Estonia",
                                    "Etiopia",
                                    "Fid\u017Ci",
                                    "Filipiny",
                                    "Finlandia",
                                    "Francja",
                                    "Gabon",
                                    "Gambia",
                                    "Ghana",
                                    "Grecja",
                                    "Grenada",
                                    "Gruzja",
                                    "Gujana",
                                    "Gwatemala",
                                    "Gwinea",
                                    "Gwinea Bissau",
                                    "Gwinea R\u00F3wnikowa",
                                    "Haiti",
                                    "Hiszpania",
                                    "Holandia",
                                    "Honduras",
                                    "Indie",
                                    "Indonezja",
                                    "Irak",
                                    "Iran",
                                    "Irlandia",
                                    "Islandia",
                                    "Izrael",
                                    "Jamajka",
                                    "Japonia",
                                    "Jemen",
                                    "Jordania",
                                    "Kambod\u017Ca",
                                    "Kamerun",
                                    "Kanada",
                                    "Katar",
                                    "Kazachstan",
                                    "Kenia",
                                    "Kirgistan",
                                    "Kiribati",
                                    "Kolumbia",
                                    "Komory",
                                    "Kongo",
                                    "Korea Po\u0142udniowa",
                                    "Korea P\u00F3\u0142nocna",
                                    "Kostaryka",
                                    "Kuba",
                                    "Kuwejt",
                                    "Laos",
                                    "Lesotho",
                                    "Liban",
                                    "Liberia",
                                    "Libia",
                                    "Liechtenstein",
                                    "Litwa",
                                    "Luksemburg",
                                    "\u0141otwa",
                                    "Macedonia",
                                    "Madagaskar",
                                    "Malawi",
                                    "Malediwy",
                                    "Malezja",
                                    "Mali",
                                    "Malta",
                                    "Maroko",
                                    "Mauretania",
                                    "Mauritius",
                                    "Meksyk",
                                    "Mikronezja",
                                    "Mo\u0142dawia",
                                    "Monako",
                                    "Mongolia",
                                    "Mozambik",
                                    "Namibia",
                                    "Nauru",
                                    "Nepal",
                                    "Niemcy",
                                    "Niger",
                                    "Nigeria",
                                    "Nikaragua",
                                    "Norwegia",
                                    "Nowa Zelandia",
                                    "Oman",
                                    "Pakistan",
                                    "Palau",
                                    "Panama",
                                    "Papua-Nowa Gwinea",
                                    "Paragwaj",
                                    "Peru",
                                    "Polska",
                                    "Portugalia",
                                    "Republika Po\u0142udniowej Afryki",
                                    "Republika \u015Arodkowoafryka\u0144ska",
                                    "Republika Zielonego Przyl\u0105dka",
                                    "Rosja",
                                    "Rumunia",
                                    "Rwanda",
                                    "Saint Kitts i Nevis",
                                    "Saint Lucia",
                                    "Saint Vincent i Grenadyny",
                                    "Salwador",
                                    "Samoa",
                                    "San Marino",
                                    "Senegal",
                                    "Serbia",
                                    "Seszele",
                                    "Sierra Leone",
                                    "Singapur",
                                    "S\u0142owacja",
                                    "S\u0142owenia",
                                    "Somalia",
                                    "Sri Lanka",
                                    "Stany Zjednoczone",
                                    "Suazi",
                                    "Sudan",
                                    "Surinam",
                                    "Syria",
                                    "Szwajcaria",
                                    "Szwecja",
                                    "Tad\u017Cykistan",
                                    "Tajlandia",
                                    "Tanzania",
                                    "Timor Wschodni",
                                    "Togo",
                                    "Tonga",
                                    "Trynidad i Tobago",
                                    "Tunezja",
                                    "Turcja",
                                    "Turkmenistan",
                                    "Tuvalu",
                                    "Uganda",
                                    "Ukraina",
                                    "Urugwaj",
                                    "Uzbekistan",
                                    "Vanuatu",
                                    "Watykan",
                                    "Wenezuela",
                                    "W\u0119gry",
                                    "Wielka Brytania",
                                    "Wietnam",
                                    "W\u0142ochy",
                                    "Wybrze\u017Ce Ko\u015Bci S\u0142oniowej",
                                    "Wyspy Marshalla",
                                    "Wyspy Salomona",
                                    "Wyspy \u015Awi\u0119tego Tomasza i Ksi\u0105\u017C\u0119ca",
                                    "Zambia",
                                    "Zimbabwe",
                                    "Zjednoczone Emiraty Arabskie");
                        });

        public Object city =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Babienica",
                                    "Bartoszyce",
                                    "Be\u0142chat\u00F3w",
                                    "Bezrzecze",
                                    "B\u0119dzin",
                                    "Bia\u0142a Podlaska",
                                    "Bia\u0142ystok",
                                    "Bielawa",
                                    "Bielsko-Bia\u0142a",
                                    "Bieru\u0144",
                                    "Bochnia",
                                    "Bogacz\u00F3w",
                                    "Bogatynia",
                                    "Bogusz\u00F3w-Gorce",
                                    "Boles\u0142awiec",
                                    "Braniewo",
                                    "Brodnica",
                                    "Brzeg",
                                    "Busko-Zdr\u00F3j",
                                    "Bydgoszcz",
                                    "Bytom",
                                    "Che\u0142m",
                                    "Chojnice",
                                    "Chorz\u00F3w",
                                    "Chrzan\u00F3w",
                                    "Ciechan\u00F3w",
                                    "Cieszyn",
                                    "Czaplinek",
                                    "Czarna Woda",
                                    "Czechowice-Dziedzice",
                                    "Czelad\u017A",
                                    "Czerwionka-Leszczyny",
                                    "Cz\u0119stochowa",
                                    "Dar\u0142owo",
                                    "D\u0105browa G\u00F3rnicza",
                                    "D\u0119bica",
                                    "D\u0119bog\u00F3rze",
                                    "Dzier\u017Coni\u00F3w",
                                    "Elbl\u0105g",
                                    "E\u0142k",
                                    "Franciszk\u00F3w",
                                    "Gda\u0144sk",
                                    "Gdynia",
                                    "Gi\u017Cycko",
                                    "Gliwice",
                                    "G\u0142og\u00F3w",
                                    "Gniezno",
                                    "Go\u0142ubie",
                                    "Gorlice",
                                    "Gorz\u00F3w Wielkopolski",
                                    "Grodzisk Mazowiecki",
                                    "Grudzi\u0105dz",
                                    "Ilkowice",
                                    "I\u0142awa",
                                    "Inowroc\u0142aw",
                                    "Jadowniki",
                                    "Jaros\u0142aw",
                                    "Jaroszowa Wola",
                                    "Jas\u0142o",
                                    "Jastarnia",
                                    "Jastrz\u0119bie",
                                    "Jastrz\u0119bie-Zdr\u00F3j",
                                    "Jawor",
                                    "Jaworzno",
                                    "Jelcz-Laskowice",
                                    "Jelenia G\u00F3ra",
                                    "Jemielnica",
                                    "Jeziorna",
                                    "J\u00F3zef\u00F3w",
                                    "Kalisz",
                                    "Kamienica Kr\u00F3lewska",
                                    "Kamieniec Z\u0105bkowicki",
                                    "Kamie\u0144",
                                    "Katowice",
                                    "K\u0119dzierzyn-Ko\u017Ale",
                                    "K\u0119trzyn",
                                    "Kielce",
                                    "Kluczbork",
                                    "K\u0142obuck",
                                    "K\u0142odzko",
                                    "Knur\u00F3w",
                                    "Kolonowskie",
                                    "Ko\u0142o",
                                    "Ko\u0142obrzeg",
                                    "Konin",
                                    "Konstancin-Jeziorna",
                                    "Koszalin",
                                    "Koszwa\u0142y",
                                    "Ko\u015Bcian",
                                    "Ko\u015Bcierzyna",
                                    "Kozienice",
                                    "Krak\u00F3w",
                                    "Krapkowice",
                                    "Kra\u015Bnik",
                                    "Kr\u0119piec",
                                    "Krosno",
                                    "Krotoszyn",
                                    "Kutno",
                                    "Ku\u017Anica Mas\u0142o\u0144ska",
                                    "Kwidzyn",
                                    "Legionowo",
                                    "Legnica",
                                    "Leszno",
                                    "L\u0119bork",
                                    "L\u0119dziny",
                                    "Lidzbark Warmi\u0144ski",
                                    "Lubart\u00F3w",
                                    "Lubin",
                                    "Lublin",
                                    "Lubliniec",
                                    "Lubojenka",
                                    "Lubo\u0144",
                                    "\u0141awy",
                                    "\u0141aziska G\u00F3rne",
                                    "\u0141\u0119czna",
                                    "\u0141omianki",
                                    "\u0141om\u017Ca",
                                    "\u0141o\u015B",
                                    "\u0141owicz",
                                    "\u0141\u00F3d\u017A",
                                    "Magdalenka",
                                    "Malbork",
                                    "Marylka",
                                    "Mielec",
                                    "Miko\u0142\u00F3w",
                                    "Mokrzyska",
                                    "Mys\u0142owice",
                                    "Myszk\u00F3w",
                                    "Nowa Ruda",
                                    "Nowa S\u00F3l",
                                    "Nowe Kramsko",
                                    "Nowy Dw\u00F3r Mazowiecki",
                                    "Nowy S\u0105cz",
                                    "Nowy Targ",
                                    "Nysa",
                                    "Olkusz",
                                    "Olsztyn",
                                    "Opole",
                                    "Orzesze",
                                    "Os\u00F3wiec",
                                    "Ostro\u0142\u0119ka",
                                    "Ostrowiec \u015Awi\u0119tokrzyski",
                                    "Ostr\u00F3da",
                                    "Ostr\u00F3w Mazowiecka",
                                    "Ostr\u00F3w Wielkopolski",
                                    "Ostrzesz\u00F3w",
                                    "O\u015Bwi\u0119cim",
                                    "Otwock",
                                    "Pabianice",
                                    "Paw\u0142owice",
                                    "P\u0119cice",
                                    "Piaseczno",
                                    "Piekary \u015Al\u0105skie",
                                    "Pieszyce",
                                    "Pilchowo",
                                    "Pi\u0142a",
                                    "Piotrk\u00F3w Trybunalski",
                                    "Pisz",
                                    "P\u0142az\u00F3w",
                                    "P\u0142ock",
                                    "Police",
                                    "Post\u0119p",
                                    "Pozna\u0144",
                                    "Pruszcz Gda\u0144ski",
                                    "Pruszk\u00F3w",
                                    "Przemy\u015Bl",
                                    "Prz\u0119dzel",
                                    "Pszczyna",
                                    "Pu\u0142awy",
                                    "Pu\u0142tusk",
                                    "Racib\u00F3rz",
                                    "Radom",
                                    "Radomsko",
                                    "Ruda \u015Al\u0105ska",
                                    "Rumia",
                                    "Rybnik",
                                    "Rynarzewo",
                                    "Rzesz\u00F3w",
                                    "Sandomierz",
                                    "Sanok",
                                    "Siedlce",
                                    "Siemianowice \u015Al\u0105skie",
                                    "Sieradz",
                                    "Skalbmierz",
                                    "Skar\u017Cysko-Kamienna",
                                    "Skierniewice",
                                    "S\u0142upsk",
                                    "Sochaczew",
                                    "Sopot",
                                    "Sosnowiec",
                                    "Stalowa Wola",
                                    "Starachowice",
                                    "Stargard Szczeci\u0144ski",
                                    "Starogard Gda\u0144ski",
                                    "Studzienice",
                                    "Sulej\u00F3wek",
                                    "Suwa\u0142ki",
                                    "Swarz\u0119dz",
                                    "Szczawin",
                                    "Szczecin",
                                    "Szczecinek",
                                    "Szczytno",
                                    "Sz\u00F3wsko",
                                    "Szteklin",
                                    "Szwecja",
                                    "\u015Arem",
                                    "\u015Awidnica",
                                    "\u015Awidnik",
                                    "\u015Awidwin",
                                    "\u015Awiebodzice",
                                    "\u015Awiebodzin",
                                    "\u015Awiecie",
                                    "\u015Awi\u0119toch\u0142owice",
                                    "\u015Awinouj\u015Bcie",
                                    "Tarnobrzeg",
                                    "Tarnowskie G\u00F3ry",
                                    "Tarn\u00F3w",
                                    "Tczew",
                                    "Tomasz\u00F3w Mazowiecki",
                                    "Toru\u0144",
                                    "Trzebiat\u00F3w",
                                    "Turek",
                                    "Tychy",
                                    "Ustka",
                                    "Wa\u0142brzych",
                                    "Warszawa",
                                    "W\u0105growiec",
                                    "Wejherowo",
                                    "Wilkowice",
                                    "W\u0142adys\u0142awowo",
                                    "W\u0142oc\u0142awek",
                                    "Wodzis\u0142aw \u015Al\u0105ski",
                                    "Wola Kiedrzy\u0144ska",
                                    "Wroc\u0142aw",
                                    "Wrze\u015Bnia",
                                    "Wyszk\u00F3w",
                                    "Zabrze",
                                    "Zakopane",
                                    "Zamo\u015B\u0107",
                                    "Zawiercie",
                                    "Z\u0105bki",
                                    "Zborowskie",
                                    "Zdu\u0144ska Wola",
                                    "Zgierz",
                                    "Zgorzelec",
                                    "Zielona G\u00F3ra",
                                    "\u017Bary",
                                    "\u017Bory",
                                    "\u017Byrard\u00F3w",
                                    "\u017Bywiec");
                        });

        public Object street =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "1 Maja",
                                    "3 Maja",
                                    "11 Listopada",
                                    "Agrestowa",
                                    "Akacjowa",
                                    "Andersa W\u0142adys\u0142awa",
                                    "Armii Krajowej",
                                    "Asnyka Adama",
                                    "Astr\u00F3w",
                                    "Azaliowa",
                                    "Baczy\u0144skiego Krzysztofa Kamila",
                                    "Ba\u0142tycka",
                                    "Barlickiego Norberta",
                                    "Batalion\u00F3w Ch\u0142opskich",
                                    "Batorego Stefana",
                                    "Bema J\u00F3zefa",
                                    "Bema J\u00F3zefa",
                                    "Beskidzka",
                                    "Bia\u0142ostocka",
                                    "Bielska",
                                    "Bieszczadzka",
                                    "B\u0142\u0119kitna",
                                    "Boczna",
                                    "Bogus\u0142awskiego Wojciecha",
                                    "Bohater\u00F3w Westerplatte",
                                    "Boles\u0142awa Chrobrego",
                                    "Boles\u0142awa Krzywoustego",
                                    "Borowa",
                                    "Botaniczna",
                                    "Bracka",
                                    "Bratk\u00F3w",
                                    "Broniewskiego W\u0142adys\u0142awa",
                                    "Brzechwy Jana",
                                    "Brzoskwiniowa",
                                    "Brzozowa",
                                    "Budowlanych",
                                    "Bukowa",
                                    "Bursztynowa",
                                    "Bydgoska",
                                    "Bytomska",
                                    "Cedrowa",
                                    "Cegielniana",
                                    "Ceglana",
                                    "Chabrowa",
                                    "Che\u0142mo\u0144skiego J\u00F3zefa",
                                    "Ch\u0142odna",
                                    "Ch\u0142opska",
                                    "Chmielna",
                                    "Chopina Fryderyka",
                                    "Chorzowska",
                                    "Chrobrego Boles\u0142awa",
                                    "Ciasna",
                                    "Cicha",
                                    "Cieszy\u0144ska",
                                    "Cisowa",
                                    "Cmentarna",
                                    "Curie-Sk\u0142odowskiej Marii",
                                    "Czarnieckiego Stefana",
                                    "Czere\u015Bniowa",
                                    "Cz\u0119stochowska",
                                    "Czwartak\u00F3w",
                                    "Daleka",
                                    "Daszy\u0144skiego Ignacego",
                                    "D\u0105browskiego Jana Henryka",
                                    "D\u0105browskiego Jaros\u0142awa",
                                    "D\u0105browskiego Jaros\u0142awa",
                                    "D\u0105browskiej Marii",
                                    "D\u0105browszczak\u00F3w",
                                    "D\u0105br\u00F3wki",
                                    "D\u0119bowa",
                                    "Diamentowa",
                                    "D\u0142uga",
                                    "D\u0142ugosza Jana",
                                    "Dmowskiego Romana",
                                    "Dobra",
                                    "Dolna",
                                    "Do\u017Cynkowa",
                                    "Drzyma\u0142y Micha\u0142a",
                                    "Dubois Stanis\u0142awa",
                                    "Dworcowa",
                                    "Dworska",
                                    "Dzia\u0142kowa",
                                    "Energetyk\u00F3w",
                                    "Fabryczna",
                                    "Fa\u0142ata Juliana",
                                    "Fio\u0142kowa",
                                    "Folwarczna",
                                    "Franciszka\u0144ska",
                                    "Francuska",
                                    "Fredry Aleksandra",
                                    "Gagarina Jurija",
                                    "Gajowa",
                                    "Ga\u0142czy\u0144skiego Konstantego Ildefonsa",
                                    "Gda\u0144ska",
                                    "Gdy\u0144ska",
                                    "Gliwicka",
                                    "G\u0142ogowa",
                                    "G\u0142ogowska",
                                    "G\u0142owackiego Bartosza",
                                    "G\u0142\u00F3wna",
                                    "Gminna",
                                    "Gnie\u017Anie\u0144ska",
                                    "Gojawiczy\u0144skiej Poli",
                                    "Go\u0142\u0119bia",
                                    "Go\u015Bcinna",
                                    "G\u00F3rna",
                                    "G\u00F3rnicza",
                                    "G\u00F3rno\u015Bl\u0105ska",
                                    "Grabowa",
                                    "Graniczna",
                                    "Granitowa",
                                    "Grochowska",
                                    "Grodzka",
                                    "Grota-Roweckiego Stefana",
                                    "Grottgera Artura",
                                    "Gr\u00F3jecka",
                                    "Grunwaldzka",
                                    "Grzybowa",
                                    "Hallera J\u00F3zefa",
                                    "Handlowa",
                                    "Harcerska",
                                    "Hetma\u0144ska",
                                    "Ho\u017Ca",
                                    "Husarska",
                                    "Hutnicza",
                                    "In\u017Cynierska",
                                    "Iwaszkiewicza Jaros\u0142awa",
                                    "Jagiello\u0144ska",
                                    "Jagiello\u0144skie Os.",
                                    "Jagie\u0142\u0142y W\u0142adys\u0142awa",
                                    "Jagodowa",
                                    "Ja\u0142owcowa",
                                    "Jana Paw\u0142a II",
                                    "Jana Paw\u0142a II Al.",
                                    "Jaracza Stefana",
                                    "Jarz\u0119binowa",
                                    "Jask\u00F3\u0142cza",
                                    "Jasna",
                                    "Jastrz\u0119bia",
                                    "Ja\u015Bminowa",
                                    "Jaworowa",
                                    "Jerozolimskie Al.",
                                    "Jesienna",
                                    "Jesionowa",
                                    "Je\u017Cynowa",
                                    "Jod\u0142owa",
                                    "Kalinowa",
                                    "Kaliska",
                                    "Kamienna",
                                    "Kar\u0142owicza Mieczys\u0142awa",
                                    "Karpacka",
                                    "Kartuska",
                                    "Kasprowicza Jana",
                                    "Kasprzaka Marcina",
                                    "Kasztanowa",
                                    "Kaszubska",
                                    "Katowicka",
                                    "Kazimierza Wielkiego",
                                    "Kielecka",
                                    "Kili\u0144skiego Jana",
                                    "Kleeberga Franciszka",
                                    "Klonowa",
                                    "K\u0142osowa",
                                    "Kochanowskiego Jana",
                                    "Kolberga Oskara",
                                    "Kolejowa",
                                    "Kolorowa",
                                    "Ko\u0142\u0142\u0105taja Hugo",
                                    "Ko\u0142\u0142\u0105taja Hugona",
                                    "Ko\u0142obrzeska",
                                    "Konarskiego Stanis\u0142awa",
                                    "Konopnickiej Marii",
                                    "Konstytucji 3 Maja",
                                    "Konwaliowa",
                                    "Kopalniana",
                                    "Kopernika Miko\u0142aja",
                                    "Koralowa",
                                    "Korczaka Janusza",
                                    "Korfantego Wojciecha",
                                    "Kosmonaut\u00F3w",
                                    "Kossaka Juliusza",
                                    "Kosynier\u00F3w",
                                    "Koszali\u0144ska",
                                    "Koszykowa",
                                    "Ko\u015Bcielna",
                                    "Ko\u015Bciuszki Tadeusza",
                                    "Ko\u015Bciuszki Tadeusza Pl.",
                                    "Kowalska",
                                    "Krakowska",
                                    "Kra\u0144cowa",
                                    "Krasickiego Ignacego",
                                    "Krasi\u0144skiego Zygmunta",
                                    "Kraszewskiego J\u00F3zefa Ignacego",
                                    "Kresowa",
                                    "Kr\u0119ta",
                                    "Kr\u00F3lewska",
                                    "Kr\u00F3lowej Jadwigi",
                                    "Kr\u00F3tka",
                                    "Krucza",
                                    "Kruczkowskiego Leona",
                                    "Krzywa",
                                    "Ksi\u0119\u017Cycowa",
                                    "Kujawska",
                                    "Kusoci\u0144skiego Janusza",
                                    "Kwiatkowskiego Eugeniusza",
                                    "Kwiatowa",
                                    "Lawendowa",
                                    "Lazurowa",
                                    "Lechicka",
                                    "Legion\u00F3w",
                                    "Legnicka",
                                    "Lelewela Joachima",
                                    "Leszczynowa",
                                    "Le\u015Bmiana Boles\u0142awa",
                                    "Le\u015Bna",
                                    "Letnia",
                                    "Ligonia Juliusza",
                                    "Liliowa",
                                    "Limanowskiego Boles\u0142awa",
                                    "Lipowa",
                                    "Lisia",
                                    "Litewska",
                                    "Lompy J\u00F3zefa",
                                    "Lotnicza",
                                    "Lotnik\u00F3w",
                                    "Lubelska",
                                    "Ludowa",
                                    "Lwowska",
                                    "\u0141ab\u0119dzia",
                                    "\u0141agiewnicka",
                                    "\u0141anowa",
                                    "\u0141\u0105czna",
                                    "\u0141\u0105kowa",
                                    "\u0141okietka W\u0142adys\u0142awa",
                                    "\u0141om\u017Cy\u0144ska",
                                    "\u0141owicka",
                                    "\u0141\u00F3dzka",
                                    "\u0141ukasiewicza Ignacego",
                                    "\u0141u\u017Cycka",
                                    "Maczka Stanis\u0142awa",
                                    "Magazynowa",
                                    "Majowa",
                                    "Makowa",
                                    "Makuszy\u0144skiego Kornela",
                                    "Malczewskiego Jacka",
                                    "Malinowa",
                                    "Ma\u0142a",
                                    "Ma\u0142achowskiego Stanis\u0142awa",
                                    "Ma\u0142opolska",
                                    "Marsza\u0142kowska",
                                    "Matejki Jana",
                                    "Mazowiecka",
                                    "Mazurska",
                                    "Miarki Karola",
                                    "Mickiewicza Adama",
                                    "Miedziana",
                                    "Mieszka I",
                                    "Mi\u0142a",
                                    "Miodowa",
                                    "M\u0142ynarska",
                                    "M\u0142y\u0144ska",
                                    "Modli\u0144ska",
                                    "Modra",
                                    "Modrzejewskiej Heleny",
                                    "Modrzewiowa",
                                    "Mokra",
                                    "Moniuszki Stanis\u0142awa",
                                    "Morcinka Gustawa",
                                    "Morelowa",
                                    "Morska",
                                    "Mostowa",
                                    "My\u015Bliwska",
                                    "Nadbrze\u017Cna",
                                    "Nadrzeczna",
                                    "Na\u0142kowskiej Zofii",
                                    "Narutowicza Gabriela",
                                    "Nieca\u0142a",
                                    "Niedzia\u0142kowskiego Mieczys\u0142awa",
                                    "Niemcewicza Juliana Ursyna",
                                    "Niepodleg\u0142o\u015Bci",
                                    "Niepodleg\u0142o\u015Bci Al.",
                                    "Niska",
                                    "Norwida Cypriana Kamila",
                                    "Nowa",
                                    "Nowowiejska",
                                    "Nowowiejskiego Feliksa",
                                    "Nowy \u015Awiat",
                                    "Obro\u0144c\u00F3w Westerplatte",
                                    "Odrodzenia",
                                    "Odrza\u0144ska",
                                    "Ogrodowa",
                                    "Okopowa",
                                    "Ok\u00F3lna",
                                    "Okr\u0119\u017Cna",
                                    "Okrzei Stefana",
                                    "Okulickiego Leopolda",
                                    "Olchowa",
                                    "Olimpijska",
                                    "Olszty\u0144ska",
                                    "Opolska",
                                    "Orkana W\u0142adys\u0142awa",
                                    "Orla",
                                    "Orzechowa",
                                    "Orzeszkowej Elizy",
                                    "Osiedlowa",
                                    "O\u015Bwi\u0119cimska",
                                    "Owocowa",
                                    "Paderewskiego Ignacego",
                                    "Parkowa",
                                    "Partyzant\u00F3w",
                                    "Patriot\u00F3w",
                                    "Pawia",
                                    "Per\u0142owa",
                                    "Piaskowa",
                                    "Piastowska",
                                    "Piastowskie Os.",
                                    "Piekarska",
                                    "Pi\u0119kna",
                                    "Pi\u0142sudskiego J\u00F3zefa",
                                    "Pi\u0142sudskiego J\u00F3zefa",
                                    "Pi\u0142sudskiego J\u00F3zefa Al.",
                                    "Piotrkowska",
                                    "Piwna",
                                    "Plater Emilii",
                                    "Plebiscytowa",
                                    "P\u0142ocka",
                                    "Pocztowa",
                                    "Podchor\u0105\u017Cych",
                                    "Podg\u00F3rna",
                                    "Podhala\u0144ska",
                                    "Podle\u015Bna",
                                    "Podmiejska",
                                    "Podwale",
                                    "Pogodna",
                                    "Pokoju",
                                    "Pola Wincentego",
                                    "Polna",
                                    "Po\u0142udniowa",
                                    "Pomorska",
                                    "Poniatowskiego J\u00F3zefa",
                                    "Poniatowskiego J\u00F3zefa",
                                    "Popie\u0142uszki Jerzego",
                                    "Poprzeczna",
                                    "Portowa",
                                    "Porzeczkowa",
                                    "Powsta\u0144c\u00F3w",
                                    "Powsta\u0144c\u00F3w \u015Al\u0105skich",
                                    "Powsta\u0144c\u00F3w Wielkopolskich",
                                    "Poziomkowa",
                                    "Pozna\u0144ska",
                                    "P\u00F3\u0142nocna",
                                    "Promienna",
                                    "Prosta",
                                    "Prusa Boles\u0142awa",
                                    "Przechodnia",
                                    "Przemys\u0142owa",
                                    "Przybyszewskiego Stanis\u0142awa",
                                    "Przyja\u017Ani",
                                    "Pszenna",
                                    "Ptasia",
                                    "Pu\u0142askiego Kazimierza",
                                    "Pu\u0142askiego Kazimierza",
                                    "Pu\u0142awska",
                                    "Puszkina Aleksandra",
                                    "Rac\u0142awicka",
                                    "Radomska",
                                    "Radosna",
                                    "Rataja Macieja",
                                    "Reja Miko\u0142aja",
                                    "Rejtana Tadeusza",
                                    "Reymonta W\u0142adys\u0142awa",
                                    "Reymonta W\u0142adys\u0142awa Stanis\u0142awa",
                                    "Robotnicza",
                                    "Rodzinna",
                                    "Rolna",
                                    "Rolnicza",
                                    "R\u00F3wna",
                                    "R\u00F3\u017Cana",
                                    "Rubinowa",
                                    "Rumiankowa",
                                    "Rybacka",
                                    "Rybna",
                                    "Rybnicka",
                                    "Rycerska",
                                    "Rynek",
                                    "Rynek Rynek",
                                    "Rzeczna",
                                    "Rzemie\u015Blnicza",
                                    "Sadowa",
                                    "Sandomierska",
                                    "Saper\u00F3w",
                                    "Sawickiej Hanki",
                                    "S\u0105dowa",
                                    "S\u0105siedzka",
                                    "Senatorska",
                                    "Siemiradzkiego Henryka",
                                    "Sienkiewicza Henryka",
                                    "Sienna",
                                    "Siewna",
                                    "Sikorskiego W\u0142adys\u0142awa",
                                    "Sikorskiego W\u0142adys\u0142awa",
                                    "Skargi Piotra",
                                    "Skargi Piotra",
                                    "Sk\u0142adowa",
                                    "Sk\u0142odowskiej-Curie Marii",
                                    "Sko\u015Bna",
                                    "Skrajna",
                                    "S\u0142oneczna",
                                    "S\u0142onecznikowa",
                                    "S\u0142owackiego Juliusza",
                                    "S\u0142owia\u0144ska",
                                    "S\u0142owicza",
                                    "Sobieskiego Jana",
                                    "Sobieskiego Jana III",
                                    "Sokola",
                                    "Solidarno\u015Bci Al.",
                                    "Solna",
                                    "Solskiego Ludwika",
                                    "Sosnowa",
                                    "Sowia",
                                    "Sowi\u0144skiego J\u00F3zefa",
                                    "Spacerowa",
                                    "Spokojna",
                                    "Sportowa",
                                    "Sp\u00F3\u0142dzielcza",
                                    "Srebrna",
                                    "Staffa Leopolda",
                                    "Stalowa",
                                    "Staromiejska",
                                    "Starowiejska",
                                    "Staszica Stanis\u0142awa",
                                    "Stawowa",
                                    "Stolarska",
                                    "Stra\u017Cacka",
                                    "Stroma",
                                    "Struga Andrzeja",
                                    "Strumykowa",
                                    "Strzelecka",
                                    "Studzienna",
                                    "Stwosza Wita",
                                    "Sucha",
                                    "Sucharskiego Henryka",
                                    "Szafirowa",
                                    "Szarych Szereg\u00F3w",
                                    "Szczeci\u0144ska",
                                    "Szcz\u0119\u015Bliwa",
                                    "Szeroka",
                                    "Szewska",
                                    "Szkolna",
                                    "Szmaragdowa",
                                    "Szpitalna",
                                    "Szymanowskiego Karola",
                                    "\u015Aciegiennego Piotra",
                                    "\u015Al\u0105ska",
                                    "\u015Arednia",
                                    "\u015Arodkowa",
                                    "\u015Awidnicka",
                                    "\u015Awierkowa",
                                    "\u015Awi\u0119toja\u0144ska",
                                    "\u015Awi\u0119tokrzyska",
                                    "Targowa",
                                    "Tatrza\u0144ska",
                                    "T\u0119czowa",
                                    "Topolowa",
                                    "Torowa",
                                    "Toru\u0144ska",
                                    "Towarowa",
                                    "Traugutta Romualda",
                                    "Truskawkowa",
                                    "Tulipanowa",
                                    "Tulipan\u00F3w",
                                    "Turkusowa",
                                    "Turystyczna",
                                    "Tuwima Juliana",
                                    "Tylna",
                                    "Tysi\u0105clecia",
                                    "U\u0142a\u0144ska",
                                    "Urocza",
                                    "Wa\u0142owa",
                                    "Wandy",
                                    "Wa\u0144kowicza Melchiora",
                                    "Wapienna",
                                    "Warmi\u0144ska",
                                    "Warszawska",
                                    "Wary\u0144skiego Ludwika",
                                    "W\u0105ska",
                                    "Wczasowa",
                                    "Weso\u0142a",
                                    "W\u0119glowa",
                                    "Widok",
                                    "Wiejska",
                                    "Wielkopolska",
                                    "Wieniawskiego Henryka",
                                    "Wierzbowa",
                                    "Wilcza",
                                    "Wile\u0144ska",
                                    "Willowa",
                                    "Wiosenna",
                                    "Wi\u015Bniowa",
                                    "Witosa Wincentego",
                                    "W\u0142adys\u0142awa IV",
                                    "Wodna",
                                    "Wojska Polskiego",
                                    "Wojska Polskiego Al.",
                                    "Wolno\u015Bci",
                                    "Wolno\u015Bci Pl.",
                                    "Wolska",
                                    "Wo\u0142odyjowskiego Micha\u0142a",
                                    "Wroc\u0142awska",
                                    "Wronia",
                                    "Wr\u00F3blewskiego Walerego",
                                    "Wrzosowa",
                                    "Wschodnia",
                                    "Wsp\u00F3lna",
                                    "Wybickiego J\u00F3zefa",
                                    "Wysoka",
                                    "Wyspia\u0144skiego Stanis\u0142awa",
                                    "Wyszy\u0144skiego Stefana",
                                    "Wyzwolenia",
                                    "Wyzwolenia Al.",
                                    "Zachodnia",
                                    "Zacisze",
                                    "Zaj\u0119cza",
                                    "Zak\u0105tek",
                                    "Zakopia\u0144ska",
                                    "Zamenhofa Ludwika",
                                    "Zamkowa",
                                    "Zapolskiej Gabrieli",
                                    "Zbo\u017Cowa",
                                    "Zdrojowa",
                                    "Zgierska",
                                    "Zielna",
                                    "Zielona",
                                    "Z\u0142ota",
                                    "Zwierzyniecka",
                                    "Zwyci\u0119stwa",
                                    "\u0179r\u00F3dlana",
                                    "\u017Babia",
                                    "\u017Beglarska",
                                    "\u017Belazna",
                                    "\u017Beromskiego Stefana",
                                    "\u017Bniwna",
                                    "\u017Bo\u0142nierska",
                                    "\u017B\u00F3\u0142kiewskiego Stanis\u0142awa",
                                    "\u017Burawia",
                                    "\u017Bwirki Franciszka i Wigury Stanis\u0142awa",
                                    "\u017Bwirki i Wigury",
                                    "\u017Bwirowa",
                                    "\u017Bytnia");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\pl_PL\\Address")
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
                            "state",
                            "street",
                            "streetAddressFormats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/pl_PL/Address.php")
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
