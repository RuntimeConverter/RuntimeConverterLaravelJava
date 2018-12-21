package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.me_ME.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/me_ME/Address.php

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
    public Object cityName(RuntimeEnv env, Object... args) {
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
                                                                .me_ME
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "cityNames")))
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
                                                        .me_ME
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .cityNames)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\me_ME\\Address";

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
                                                            .me_ME
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .streetPrefix)
                            .value());
        }

        @ConvertedMethod
        public Object street(RuntimeEnv env, Object... args) {
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
                                                            .me_ME
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .street)
                            .value());
        }

        @ConvertedMethod
        public Object localCoordinates(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    "latitude",
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Address.class)
                                            .method("latitude")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(42.43, 42.45)
                                            .value()),
                            new ZPair(
                                    "longitude",
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Address.class)
                                            .method("longitude")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(19.16, 19.27)
                                            .value())));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object postcode = ZVal.arrayFromList("#####");

        public Object streetPrefix = ZVal.arrayFromList("");

        public Object street =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "1. crnogorske brigade narodne odbrane",
                                    "1. maja",
                                    "1. proleterske brigade",
                                    "10. crnogorske brigade",
                                    "13. jula",
                                    "18. februara",
                                    "18. jula",
                                    "19. decembra",
                                    "2. crnogorskog bataljona",
                                    "2. proleterske dalmatinske brigade",
                                    "27. marta",
                                    "3. sand\u017Ea\u010Dke proleterske brigade",
                                    "4. jula",
                                    "4. proleterske brigade",
                                    "5. proleterske brigade",
                                    "6. crnogorske udarne brigade",
                                    "7. omladinske brigade",
                                    "8. crnogorske udarne brigade",
                                    "8. jula",
                                    "8. marta",
                                    "9. crnogorske brigade",
                                    "Admirala Zmajevi\u0107a",
                                    "Aerodromska",
                                    "Aleksandra Ace Priji\u0107a",
                                    "Aleksandra Lesa Ivanovi\u0107a",
                                    "Aleksandra Pu\u0161kina",
                                    "Alekse \u0160anti\u0107a",
                                    "Alfreda Tenisona",
                                    "Andrije Palta\u0161i\u0107a",
                                    "Andrijevi\u010Dka",
                                    "Antona \u010Cehova",
                                    "Arhitekte Milana Popovi\u0107a",
                                    "Arsenija \u010Carnojevi\u0107a",
                                    "Atinska",
                                    "AVNOJ-a",
                                    "Balkanska",
                                    "Bal\u0161i\u0107a",
                                    "Barska",
                                    "Belvederska",
                                    "Beogradska",
                                    "Berska",
                                    "Bjelasi\u010Dka",
                                    "Bjelopoljska",
                                    "Bla\u017Ea Jovanovi\u0107a",
                                    "Bohinjska",
                                    "Bokeljske mornarice",
                                    "Boke\u0161ka",
                                    "Bore i Ramiza",
                                    "Borisa Kidri\u010Da",
                                    "Bo\u0161ka Buhe",
                                    "Botunska",
                                    "Bracana Bracanovi\u0107a",
                                    "Bra\u0107e Ribar",
                                    "Branislava Leki\u0107a",
                                    "Branka \u0106opi\u0107a",
                                    "Branka Deleti\u0107a",
                                    "Branka Radi\u010Devi\u0107a",
                                    "Bratono\u017Ei\u0107ka",
                                    "Bratstva i jedinstva",
                                    "Bregalni\u010Dka",
                                    "Buda Tomovi\u0107a",
                                    "Budvanska",
                                    "Bulevar D\u017Eord\u017Ea Va\u0161ingtona",
                                    "Bulevar Ivana Crnojevi\u0107a",
                                    "Bulevar Mihaila Lali\u0107a",
                                    "Bulevar revolucije",
                                    "Bulevar Save Kova\u010Devi\u0107a",
                                    "Cara Lazara",
                                    "Carev laz",
                                    "Ceklinska",
                                    "Cetinjski put",
                                    "Crnogorskih serdara",
                                    "Crnojevi\u0107a",
                                    "Cvijetna",
                                    "Dajbabska",
                                    "Dalmatinska",
                                    "Danilovgradska",
                                    "Desanke Maksimovi\u0107",
                                    "Dositeja Obradovi\u0107a",
                                    "Dr Bla\u017Ea Rai\u010Devi\u0107a",
                                    "Dr Filipa \u0160o\u0107a",
                                    "Dr Milutina Ka\u017Ei\u0107a",
                                    "Dr Nika Miljani\u0107a",
                                    "Dr Sa\u0161e Bo\u017Eovi\u0107a",
                                    "Drvarska",
                                    "Dukljanska",
                                    "Dunavska",
                                    "Durmitorska",
                                    "Du\u0161ana Du\u0107e Mugo\u0161e",
                                    "Du\u0161ana Milutinovi\u0107a",
                                    "Du\u0161ana Vukoti\u0107a",
                                    "D\u017Ean",
                                    "\u0110e\u010Devi\u0107a",
                                    "\u0110oka Mira\u0161evi\u0107a",
                                    "\u0110uje Jovanovi\u0107a",
                                    "\u0110ure Dani\u010Di\u0107a",
                                    "Emila Zole",
                                    "Franca Pre\u0161erna",
                                    "Franca Rozmana",
                                    "Fru\u0161kogorska",
                                    "Fundinske bitke",
                                    "Gavra Vukovi\u0107a",
                                    "Gavrila Principa",
                                    "Generala Sava Orlovi\u0107a",
                                    "Georgi Dimitrova",
                                    "Geteova",
                                    "Goce Del\u010Deva",
                                    "Gojka Radonji\u0107a",
                                    "Goranska",
                                    "Gori\u010Dka",
                                    "Grahova\u010Dka",
                                    "Hajduk Veljkova",
                                    "Hercegnovska",
                                    "Hercegova\u010Dka",
                                    "Husinskih rudara",
                                    "Igmanska",
                                    "Ilije Mila\u010Di\u0107a",
                                    "Isidore Sekuli\u0107",
                                    "Ivana Cankara",
                                    "Ivana Gorana Kova\u010Di\u0107a",
                                    "Ivana Milutinovi\u0107a",
                                    "Ivana Vujo\u0161evi\u0107a",
                                    "Ivangradska",
                                    "Ive Andri\u0107a",
                                    "Iveze Vukova",
                                    "Jadranska",
                                    "Janka \u0110anovi\u0107a",
                                    "Janka Vukoti\u0107a",
                                    "Jaroslava \u010Cermaka",
                                    "Jelene Bal\u0161i\u0107",
                                    "Jerevanska",
                                    "Jezerska",
                                    "Josipa Broza Tita",
                                    "Jovana Cviji\u0107a",
                                    "Jovana \u0106etkovi\u0107a",
                                    "Jovana Toma\u0161evi\u0107a",
                                    "Kadinja\u010Da",
                                    "Kara\u0111or\u0111eva",
                                    "Kninska",
                                    "KNOJ-a",
                                    "Kola\u0161inska",
                                    "Komska",
                                    "Kosmajska",
                                    "Kosovska",
                                    "Kosovskih junaka",
                                    "Koste Racina",
                                    "Kotorska",
                                    "Kozara\u010Dka",
                                    "Kragujeva\u010Dka",
                                    "Kralja Nikole",
                                    "Kraljeva\u010Dka",
                                    "Lamela",
                                    "Lazara So\u010Dice",
                                    "Li\u010Dka",
                                    "Lov\u0107enska",
                                    "Ludviga Kube",
                                    "Luke Boljevi\u0107a",
                                    "Lutova\u010Dkih barjaktara",
                                    "Ljesanska",
                                    "Ljeskopoljska",
                                    "Ljube \u010Cupi\u0107a",
                                    "Ljube Nenadovi\u0107a",
                                    "Ljubljanska",
                                    "Ljubostinjskih junaka",
                                    "Ljubovi\u0107ka",
                                    "Majevi\u010Dka",
                                    "Manastirska",
                                    "Marka Ma\u0161anovi\u0107a",
                                    "Marka Miljanova",
                                    "Matije Gupca",
                                    "Mediteranska",
                                    "Medunska",
                                    "Me\u0161e Selimovi\u0107a",
                                    "Mila Milunovi\u0107a",
                                    "Mila Peruni\u010Di\u0107a",
                                    "Mila Radunovi\u0107a",
                                    "Miladina Popovi\u0107a",
                                    "Milana Ku\u010Da",
                                    "Milana Rai\u010Dkovi\u0107a",
                                    "Miloja Pavlovi\u0107a",
                                    "Milo\u0161a Obili\u0107a",
                                    "Miljana Vukova",
                                    "Miodraga Bulatovi\u0107a",
                                    "Mirka Banjevi\u0107a",
                                    "Mirka Ve\u0161ovi\u0107a",
                                    "Mitra Baki\u0107a",
                                    "Mojkova\u010Dka",
                                    "Mojsija Ze\u010Devi\u0107a",
                                    "Mora\u010Dka",
                                    "Moskovska",
                                    "Moskovski most",
                                    "Mosorska",
                                    "Most Milenijum",
                                    "Most \u017Ertava 5. maja 1944.",
                                    "Mu\u0161iki\u0107a",
                                    "Neznanih junaka",
                                    "Nikca od Rovina",
                                    "Nikole \u0110urkovi\u0107a",
                                    "Nikole Lopi\u010Di\u0107a",
                                    "Nikole Tesle",
                                    "Nik\u0161i\u0107ka",
                                    "Novaka Milo\u0161eva",
                                    "Novaka Ramova",
                                    "Novosadska",
                                    "Njego\u0161eva",
                                    "Obala Ribnice",
                                    "Obodska",
                                    "Ohridska",
                                    "Oktobarske revolucije",
                                    "Omera Abdovi\u0107a",
                                    "Omladinskih brigada",
                                    "Orijenska",
                                    "Pariske komune",
                                    "Partizanski put",
                                    "Pera Po\u010Deka",
                                    "Perojska",
                                    "Petra Ko\u010Di\u0107a",
                                    "Petra Lubarde",
                                    "Petra Prlje",
                                    "Pilota Cvetkovi\u0107a i Milojevi\u0107a",
                                    "Piperska",
                                    "Pivska",
                                    "Plavska",
                                    "Plitvi\u010Dka",
                                    "Plu\u017Einska",
                                    "Pljevaljska",
                                    "Pohorska",
                                    "Polimska",
                                    "Popa Bo\u0161ka Popovi\u0107a",
                                    "Predraga Golubovi\u0107a",
                                    "Princa Mihaila Petrovi\u0107a",
                                    "Pri\u0161tinska",
                                    "Prolaz Generala Do\u017Ei\u0107a",
                                    "Radni\u010Dka",
                                    "Radoja Jovanovi\u0107a",
                                    "Radomira Ivanovi\u0107a",
                                    "Radosava Buri\u0107a",
                                    "Radosava Popovi\u0107a",
                                    "Radovana Petrovi\u0107a",
                                    "Radovana Vukanovi\u0107a",
                                    "Radovana Zogovi\u0107a",
                                    "Radula Rusa Radulovi\u0107a",
                                    "Rista Stijovi\u0107a",
                                    "Rogamska",
                                    "Rova\u010Dka",
                                    "Ru\u017Ea",
                                    "Sarajevska",
                                    "Sava Lubarde",
                                    "Sava Nikoli\u0107a",
                                    "Savska",
                                    "Serdara Jola Pileti\u0107a",
                                    "Sergeja Jesenjina",
                                    "Sime Matavulja",
                                    "Simona Ivanova",
                                    "Sitni\u010Dka",
                                    "Skadarska",
                                    "SKOJ-a",
                                    "Skopska",
                                    "Slavonska",
                                    "Slobodana \u0160kerovi\u0107a",
                                    "Slobode",
                                    "Sloge",
                                    "Spasa Nikoli\u0107a",
                                    "Spasoja Raspopovi\u0107a",
                                    "Srednjo\u0161kolska",
                                    "Stanka Dragojevi\u0107a",
                                    "Stefana Mitrova Ljubi\u0161e",
                                    "Steva Boljevi\u0107a",
                                    "Steva Kraljevi\u0107a",
                                    "Studentska",
                                    "Svetog Petra Cetinjskog",
                                    "Svetozara Markovi\u0107a",
                                    "\u0160arki\u0107a",
                                    "\u0160avni\u010Dka",
                                    "\u0160panskih boraca",
                                    "\u0160pira Mugo\u0161e",
                                    "Tivatska",
                                    "Trebinjska",
                                    "Trg Bo\u017Eane Vu\u010Dini\u0107",
                                    "Trg golooto\u010Dkih \u017Ertava",
                                    "Trg Nikole Kova\u010Devi\u0107a",
                                    "Trg republike",
                                    "Trifuna \u0110uki\u0107a",
                                    "Triglavska",
                                    "Tripa Kukolja",
                                    "Tu\u0161ka",
                                    "Ulcinjska",
                                    "U\u017Ei\u010Dka",
                                    "Valtazara Bogi\u0161i\u0107a",
                                    "Vardarska",
                                    "Vasa Rai\u010Dkovi\u0107a",
                                    "Velimira Stojanovi\u0107a",
                                    "Velimira Terzi\u0107a",
                                    "Veljka Jankovi\u0107a",
                                    "Vezirov most",
                                    "Vinogradska",
                                    "Vitomira Vita Nikoli\u0107a",
                                    "Vlada \u0106etkovi\u0107a",
                                    "Vlada Martinovi\u0107a",
                                    "Vladike Danila",
                                    "Vladike Petra I",
                                    "Vladike Vasilija Petrovi\u0107a",
                                    "Vojisavljevi\u0107a",
                                    "Vojislava Gruji\u0107a",
                                    "Vojvode Ilije Plamenca",
                                    "Vojvode Mijajla Ni\u0161ina",
                                    "Vojvode Mirka Petrovi\u0107a",
                                    "Vojvode Raduna",
                                    "Vojvode Vase Bracanova",
                                    "Vojvo\u0111anska",
                                    "Vrela 2.",
                                    "Vrela 3.",
                                    "Vrela 4.",
                                    "Vrela 5.",
                                    "Vrela 6.",
                                    "Vu\u010Dedolska",
                                    "Vuka \u0110urovi\u0107a",
                                    "Vuka Karad\u017Ei\u0107a",
                                    "Vuka Mandu\u0161i\u0107a",
                                    "Vuka Mi\u0107unovi\u0107a",
                                    "Vukice Mitrovi\u0107",
                                    "Vukosava Bo\u017Eovi\u0107a",
                                    "Zagreba\u010Dka",
                                    "Zetskih vladara",
                                    "Zetskog odreda",
                                    "Zmaj Jovina",
                                    "\u017Dablja\u010Dka",
                                    "\u017Darka Zrenjanina",
                                    "\u017Dikice Jovanovi\u0107a \u0160panca",
                                    "\u017Drtava fa\u0161izma");
                        });

        public Object streetNameFormats =
                ZVal.arrayFromList("{{street}}", "{{streetPrefix}} {{street}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList("{{streetName}} {{buildingNumber}}");

        public Object cityFormats = ZVal.arrayFromList("{{cityName}}");

        public Object cityNames =
                ZVal.arrayFromList(
                        "Bar",
                        "Budva",
                        "Herceg Novi",
                        "Kotor",
                        "Tivat",
                        "Ulcinj",
                        "Podgorica",
                        "Cetinje",
                        "Nik\u0161i\u0107",
                        "Danilovgrad",
                        "\u017Dabljak",
                        "Kola\u0161in",
                        "Andrijevica",
                        "Berane",
                        "Bijelo Polje",
                        "Mojkovac",
                        "Plav",
                        "Plu\u017Eine",
                        "Pljevlja",
                        "Ro\u017Eaje",
                        "\u0160avnik",
                        "Petnjica",
                        "Gusinje",
                        "Petrovac",
                        "Sutomore");

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Alandska ostrva",
                                    "Albanija",
                                    "Al\u017Eir",
                                    "Ameri\u010Dka Samoa",
                                    "Andora",
                                    "Angola",
                                    "Angvila",
                                    "Antarktika",
                                    "Antigva i Barbuda",
                                    "Argentina",
                                    "Armenija",
                                    "Aruba",
                                    "Australija",
                                    "Austrija",
                                    "Avganistan",
                                    "Azerbejd\u017Ean",
                                    "Bahami",
                                    "Bahrein",
                                    "Banglade\u0161",
                                    "Barbados",
                                    "Belgija",
                                    "Belise",
                                    "Belorusija",
                                    "Benin",
                                    "Bermuda",
                                    "Bocvana",
                                    "Bolivija",
                                    "Bosna i Hercegovina",
                                    "Bo\u017Ei\u0107na Ostrva",
                                    "Brazil",
                                    "Britanska Devi\u010Danska Ostrva",
                                    "Britansko Indijska Okeanska Teritorija",
                                    "Brunej",
                                    "Bugarska",
                                    "Burkina Faso",
                                    "Burundi",
                                    "Butan",
                                    "Buve Ostrva",
                                    "\u010Cad",
                                    "Centralno Afri\u010Dka Republika",
                                    "\u010Ce\u0161ka",
                                    "\u010Cile",
                                    "Crna Gora",
                                    "Danska",
                                    "Demokratska Republika Kongo",
                                    "Dijego Garsija",
                                    "Dominika",
                                    "Dominikanska Republika",
                                    "D\u017Eersi",
                                    "D\u017Eibuti",
                                    "Egipat",
                                    "Ekvador",
                                    "Ekvatorijalna Gvineja",
                                    "Eritreja",
                                    "Estonija",
                                    "Etiopija",
                                    "Evropska unija",
                                    "Farska Ostrva",
                                    "Fid\u017Ei",
                                    "Filipini",
                                    "Finska",
                                    "Folklandska Ostrva",
                                    "Francuska",
                                    "Francuska Gvajana",
                                    "Francuska Polinezija",
                                    "Francuske Ju\u017Ene Teritorije",
                                    "Gabon",
                                    "Gambija",
                                    "Gana",
                                    "Gibraltar",
                                    "Gr\u010Dka",
                                    "Grenada",
                                    "Grenland",
                                    "Gruzija",
                                    "Guam",
                                    "Gurnsi",
                                    "Gvadelupe",
                                    "Gvajana",
                                    "Gvatemala",
                                    "Gvineja",
                                    "Gvineja-Bisao",
                                    "Haiti",
                                    "Herd i Mekdonald Ostrva",
                                    "Holandija",
                                    "Holandski Antili",
                                    "Honduras",
                                    "Hong Kong (S. A. R. Kina)",
                                    "Hrvatska",
                                    "Indija",
                                    "Indonezija",
                                    "Irak",
                                    "Iran",
                                    "Irska",
                                    "Island",
                                    "Isto\u010Dni Timor",
                                    "Italija",
                                    "Izrael",
                                    "Jamajka",
                                    "Japan",
                                    "Jemen",
                                    "Jordan",
                                    "Ju\u017Ena D\u017Eord\u017Eija i Ju\u017Ena Sendvi\u010D Ostrva",
                                    "Ju\u017Ena Koreja",
                                    "Ju\u017Enoafri\u010Dka Republika",
                                    "Kajmanska Ostrva",
                                    "Kambod\u017Ea",
                                    "Kamerun",
                                    "Kanada",
                                    "Kanarska ostrva",
                                    "Kape Verde",
                                    "Katar",
                                    "Kazahstan",
                                    "Kenija",
                                    "Kina",
                                    "Kipar",
                                    "Kirgizstan",
                                    "Kiribati",
                                    "Kokos (Keling) Ostrva",
                                    "Kolumbija",
                                    "Komorska Ostrva",
                                    "Kongo",
                                    "Kostarika",
                                    "Kuba",
                                    "Kukova Ostrva",
                                    "Kuvajt",
                                    "Laos",
                                    "Lesoto",
                                    "Letonija",
                                    "Liban",
                                    "Liberija",
                                    "Libija",
                                    "Lihten\u0161tajn",
                                    "Litvanija",
                                    "Luksemburg",
                                    "Madagaskar",
                                    "Ma\u0111arska",
                                    "Majote",
                                    "Makao (S. A. R. Kina)",
                                    "Makedonija",
                                    "Malavi",
                                    "Maldivi",
                                    "Malezija",
                                    "Mali",
                                    "Malta",
                                    "Manja Udaljena Ostrva SAD",
                                    "Maroko",
                                    "Mar\u0161alska Ostrva",
                                    "Martinik",
                                    "Mauricius",
                                    "Mauritanija",
                                    "Meksiko",
                                    "Mijanmar",
                                    "Mikronezija",
                                    "Moldavija",
                                    "Monako",
                                    "Mongolija",
                                    "Monserat",
                                    "Mozambik",
                                    "Namibija",
                                    "Nauru",
                                    "Nema\u010Dka",
                                    "Nepal",
                                    "Niger",
                                    "Nigerija",
                                    "Nikaragva",
                                    "Niue",
                                    "Norfolk Ostrvo",
                                    "Norve\u0161ka",
                                    "Nova Kaledonija",
                                    "Novi Zeland",
                                    "Obala Slonova\u010De",
                                    "Oman",
                                    "Ostala okeanija",
                                    "Ostrvo Asension",
                                    "Ostrvo Kliperton",
                                    "Ostrvo Man",
                                    "Pakistan",
                                    "Palau",
                                    "Palestinska Teritorija",
                                    "Panama",
                                    "Papua Nova Gvineja",
                                    "Paragvaj",
                                    "Peru",
                                    "Pitcairn",
                                    "Poljska",
                                    "Porto Riko",
                                    "Portugal",
                                    "Rejunion",
                                    "Ruanda",
                                    "Rumunija",
                                    "Rusija",
                                    "S.A.D. Devi\u010Danska Ostrva",
                                    "Salvador",
                                    "Samoa",
                                    "San Marino",
                                    "Sao Tome i Principe",
                                    "Saudijska Arabija",
                                    "Sej\u0161eli",
                                    "Sen Pjer i Mikelon",
                                    "Senegal",
                                    "Sent Kits i Nevis",
                                    "Sent Lucija",
                                    "Sent Vinsent i Grenadini",
                                    "Seuta i Melilja",
                                    "Severna Koreja",
                                    "Severna Marijanska Ostrva",
                                    "Sijera Leone",
                                    "Singapur",
                                    "Sirija",
                                    "Sjedinjene Ameri\u010Dke Dr\u017Eave",
                                    "Slova\u010Dka",
                                    "Slovenija",
                                    "Solomonska Ostrva",
                                    "Somalija",
                                    "\u0160panija",
                                    "Srbija",
                                    "\u0160ri Lanka",
                                    "Sudan",
                                    "Surinam",
                                    "Sv. Bartolomej",
                                    "Sv. Martin",
                                    "\u0160vajcarska",
                                    "Svalbard i Janmajen Ostrva",
                                    "Svazilend",
                                    "\u0160vedska",
                                    "Sveta Jelena",
                                    "Tad\u017Eikistan",
                                    "Tajland",
                                    "Tajvan",
                                    "Tanzanija",
                                    "Togo",
                                    "Tokelau",
                                    "Tonga",
                                    "Trinidad i Tobago",
                                    "Tristan da Kunja",
                                    "Tunis",
                                    "Turkmenistan",
                                    "Turks i Kajkos Ostrva",
                                    "Turska",
                                    "Tuvalu",
                                    "Uganda",
                                    "Ujedinjeni Arapski Emirati",
                                    "Ukrajina",
                                    "Urugvaj",
                                    "Uzbekistan",
                                    "Valis i Futuna Ostrva",
                                    "Vanuatu",
                                    "Vatikan",
                                    "Velika Britanija",
                                    "Venecuela",
                                    "Vijetnam",
                                    "Zambija",
                                    "Zapadna Sahara",
                                    "Zimbabve");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\me_ME\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "cityFormats",
                            "cityNames",
                            "country",
                            "postcode",
                            "street",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetPrefix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/me_ME/Address.php")
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
