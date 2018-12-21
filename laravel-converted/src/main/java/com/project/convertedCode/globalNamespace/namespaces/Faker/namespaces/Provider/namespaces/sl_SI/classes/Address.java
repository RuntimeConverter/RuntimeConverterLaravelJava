package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.sl_SI.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/sl_SI/Address.php

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
                                                                .sl_SI
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
                                                        .sl_SI
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .street)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\sl_SI\\Address";

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
        public Object cityName(RuntimeEnv env, Object... args) {
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
                                                            .sl_SI
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .city)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object city =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Ajdov\u0161\u010Dina",
                                    "Apa\u010De",
                                    "Beltinci",
                                    "Benedikt",
                                    "Bistrica ob Sotli",
                                    "Bled",
                                    "Bloke",
                                    "Bohinj",
                                    "Borovnica",
                                    "Bovec",
                                    "Braslov\u010De",
                                    "Brda",
                                    "Brezovica",
                                    "Bre\u017Eice",
                                    "Cankova",
                                    "Celje",
                                    "Cerklje na Gorenjskem",
                                    "Cerknica",
                                    "Cerkno",
                                    "Cerkvenjak",
                                    "Cirkulane",
                                    "Destrnik",
                                    "Diva\u010Da",
                                    "Dobje",
                                    "Dobrepolje",
                                    "Dobrna",
                                    "Dobrova - Polhov Gradec",
                                    "Dobrovnik",
                                    "Dol pri Ljubljani",
                                    "Dolenjske Toplice",
                                    "Dom\u017Eale",
                                    "Dornava",
                                    "Dravograd",
                                    "Duplek",
                                    "Gorenja vas - Poljane",
                                    "Gori\u0161nica",
                                    "Gorje",
                                    "Gornja Radgona",
                                    "Gornji Grad",
                                    "Gornji Petrovci",
                                    "Grad",
                                    "Grosuplje",
                                    "Hajdina",
                                    "Hodo\u0161",
                                    "Horjul",
                                    "Ho\u010De - Slivnica",
                                    "Hrastnik",
                                    "Hrpelje - Kozina",
                                    "Idrija",
                                    "Ig",
                                    "Ilirska Bistrica",
                                    "Ivan\u010Dna Gorica",
                                    "Izola",
                                    "Jesenice",
                                    "Jezersko",
                                    "Jur\u0161inci",
                                    "Kamnik",
                                    "Kanal ob So\u010Di",
                                    "Kidri\u010Devo",
                                    "Kobarid",
                                    "Kobilje",
                                    "Komen",
                                    "Komenda",
                                    "Koper",
                                    "Kostanjevica na Krki",
                                    "Kostel",
                                    "Kozje",
                                    "Ko\u010Devje",
                                    "Kranj",
                                    "Kranjska Gora",
                                    "Kri\u017Eevci",
                                    "Kr\u0161ko",
                                    "Kungota",
                                    "Kuzma",
                                    "La\u0161ko",
                                    "Lenart",
                                    "Lendava",
                                    "Litija",
                                    "Ljubljana",
                                    "Ljubno",
                                    "Ljutomer",
                                    "Log - Dragomer",
                                    "Logatec",
                                    "Lovrenc na Pohorju",
                                    "Lo\u0161ka Dolina",
                                    "Lo\u0161ki Potok",
                                    "Lukovica",
                                    "Lu\u010De",
                                    "Maj\u0161perk",
                                    "Makole",
                                    "Maribor",
                                    "Markovci",
                                    "Medvode",
                                    "Menge\u0161",
                                    "Metlika",
                                    "Me\u017Eica",
                                    "Miklav\u017E na Dravskem polju",
                                    "Miren - Kostanjevica",
                                    "Mirna Pe\u010D",
                                    "Mislinja",
                                    "Mokronog - Trebelno",
                                    "Moravske Toplice",
                                    "Morav\u010De",
                                    "Mozirje",
                                    "Murska Sobota",
                                    "Muta",
                                    "Naklo",
                                    "Nazarje",
                                    "Nova Gorica",
                                    "Novo mesto",
                                    "Odranci",
                                    "Oplotnica",
                                    "Ormo\u017E",
                                    "Osilnica",
                                    "Pesnica",
                                    "Piran",
                                    "Pivka",
                                    "Podlehnik",
                                    "Podvelka",
                                    "Pod\u010Detrtek",
                                    "Polj\u010Dane",
                                    "Polzela",
                                    "Postojna",
                                    "Prebold",
                                    "Preddvor",
                                    "Prevalje",
                                    "Ptuj",
                                    "Puconci",
                                    "Radenci",
                                    "Rade\u010De",
                                    "Radlje ob Dravi",
                                    "Radovljica",
                                    "Ravne na Koro\u0161kem",
                                    "Razkri\u017Eje",
                                    "Ra\u010De - Fram",
                                    "Ren\u010De - Vogrsko",
                                    "Re\u010Dica ob Savinji",
                                    "Ribnica na Pohorju",
                                    "Ribnica",
                                    "Rogatec",
                                    "Roga\u0161ka Slatina",
                                    "Roga\u0161ovci",
                                    "Ru\u0161e",
                                    "Selnica ob Dravi",
                                    "Semi\u010D",
                                    "Sevnica",
                                    "Se\u017Eana",
                                    "Slovenj Gradec",
                                    "Slovenska Bistrica",
                                    "Slovenske Konjice",
                                    "Sodra\u017Eica",
                                    "Sol\u010Dava",
                                    "Sredi\u0161\u010De ob Dravi",
                                    "Star\u0161e",
                                    "Stra\u017Ea",
                                    "Sveta Ana",
                                    "Sveta Trojica v Slovenskih goricah",
                                    "Sveti Andra\u017E v Slovenskih goricah",
                                    "Sveti Jurij ob \u0160\u010Davnici",
                                    "Sveti Jurij v Slovenskih goricah",
                                    "Sveti Toma\u017E",
                                    "Tabor",
                                    "Ti\u0161ina",
                                    "Tolmin",
                                    "Trbovlje",
                                    "Trebnje",
                                    "Trnovska vas",
                                    "Trzin",
                                    "Tr\u017Ei\u010D",
                                    "Turni\u0161\u010De",
                                    "Velenje",
                                    "Velika Polana",
                                    "Velike La\u0161\u010De",
                                    "Ver\u017Eej",
                                    "Videm",
                                    "Vipava",
                                    "Vitanje",
                                    "Vodice",
                                    "Vojnik",
                                    "Vransko",
                                    "Vrhnika",
                                    "Vuzenica",
                                    "Zagorje ob Savi",
                                    "Zavr\u010D",
                                    "Zre\u010De",
                                    "\u010Cren\u0161ovci",
                                    "\u010Crna na Koro\u0161kem",
                                    "\u010Crnomelj",
                                    "\u0160alovci",
                                    "\u0160empeter - Vrtojba",
                                    "\u0160entilj",
                                    "\u0160entjernej",
                                    "\u0160entjur",
                                    "\u0160entrupert",
                                    "\u0160en\u010Dur",
                                    "\u0160kocjan",
                                    "\u0160kofja Loka",
                                    "\u0160kofljica",
                                    "\u0160marje pri Jel\u0161ah",
                                    "\u0160marje\u0161ke Toplice",
                                    "\u0160martno ob Paki",
                                    "\u0160martno pri Litiji",
                                    "\u0160o\u0161tanj",
                                    "\u0160tore",
                                    "\u017Dalec",
                                    "\u017Delezniki",
                                    "\u017Detale",
                                    "\u017Diri",
                                    "\u017Dirovnica",
                                    "\u017Du\u017Eemberk");
                        });

        public Object buildingNumber = ZVal.arrayFromList("1##", "##", "##", "##", "##", "#");

        public Object postcode = ZVal.arrayFromList("###0");

        public Object street =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u0160olska ulica",
                                    "Pre\u0161ernova ulica",
                                    "Cankarjeva ulica",
                                    "Vrtna ulica",
                                    "Gregor\u010Di\u010Deva ulica",
                                    "Kajuhova ulica",
                                    "Pre\u010Dna ulica",
                                    "Levstikova ulica",
                                    "Trubarjeva ulica",
                                    "Mladinska ulica",
                                    "Gub\u010Deva ulica",
                                    "Ljubljanska cesta",
                                    "Partizanska ulica",
                                    "Maistrova ulica",
                                    "Ro\u017Ena ulica",
                                    "Bevkova ulica",
                                    "Jur\u010Di\u010Deva ulica",
                                    "\u017Dupan\u010Di\u010Deva ulica",
                                    "Kolodvorska ulica",
                                    "Partizanska cesta",
                                    "Gasilska ulica",
                                    "Kidri\u010Deva ulica",
                                    "A\u0161ker\u010Deva ulica",
                                    "Kratka ulica",
                                    "Nova ulica",
                                    "Obrtni\u0161ka ulica",
                                    "Tom\u0161i\u010Deva ulica",
                                    "Cvetli\u010Dna ulica",
                                    "Mariborska cesta",
                                    "Ob potoku",
                                    "Trg svobode",
                                    "Ulica talcev",
                                    "Kettejeva ulica",
                                    "Kosovelova ulica",
                                    "Fin\u017Egarjeva ulica",
                                    "Ob gozdu",
                                    "Stara cesta",
                                    "Vegova ulica",
                                    "Pre\u017Eihova ulica",
                                    "Son\u010Dna ulica",
                                    "Gradi\u0161\u010De",
                                    "Pristava",
                                    "Brezje",
                                    "Dolenja vas",
                                    "Potok",
                                    "Ravne",
                                    "Brdo",
                                    "Dobrava",
                                    "Draga",
                                    "Javorje",
                                    "Kal",
                                    "Laze",
                                    "Log",
                                    "Planina",
                                    "Podkraj",
                                    "Selce",
                                    "Trnovec",
                                    "Bistrica",
                                    "Gorenja vas",
                                    "Gorica",
                                    "Lipa",
                                    "Nova vas",
                                    "Podgora",
                                    "Podgorje",
                                    "Podgrad",
                                    "Ponikve",
                                    "Sela",
                                    "Selo",
                                    "\u0160kocjan",
                                    "Vrh");
                        });

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Afganistan",
                                    "Albanija",
                                    "Al\u017Eirija",
                                    "Andora",
                                    "Angola",
                                    "Antigva in Barbuda",
                                    "Argentina",
                                    "Armenija",
                                    "Avstralija",
                                    "Avstrija",
                                    "Azerbajd\u017Ean",
                                    "Bahami",
                                    "Bahrajn",
                                    "Banglade\u0161",
                                    "Barbados",
                                    "Belgija",
                                    "Belize",
                                    "Belorusija",
                                    "Benin",
                                    "Bocvana",
                                    "Bolgarija",
                                    "Bolivija",
                                    "Bosna in Hercegovina",
                                    "Brazilija",
                                    "Brunej",
                                    "Burkina Faso",
                                    "Burundi",
                                    "Butan",
                                    "Ciper",
                                    "\u010Cad",
                                    "\u010Ce\u0161ka",
                                    "\u010Cile",
                                    "\u010Crna gora",
                                    "Danska",
                                    "Dominika",
                                    "Dominikanska republika",
                                    "D\u017Eibuti",
                                    "Egipt",
                                    "Ekvador",
                                    "Ekvatorialna Gvineja",
                                    "Eritreja",
                                    "Estonija",
                                    "Etiopija",
                                    "Fid\u017Ei",
                                    "Filipini",
                                    "Finska",
                                    "Francija",
                                    "Gabon",
                                    "Gambija",
                                    "Gana",
                                    "Gr\u010Dija",
                                    "Grenada",
                                    "Gruzija",
                                    "Gvajana",
                                    "Gvatemala",
                                    "Gvineja",
                                    "Gvineja Bissau",
                                    "Haiti",
                                    "Honduras",
                                    "Hrva\u0161ka",
                                    "Indija",
                                    "Indonezija",
                                    "Irak",
                                    "Iran",
                                    "Irska",
                                    "Islandija",
                                    "Italija",
                                    "Izrael",
                                    "Jamajka",
                                    "Japonska",
                                    "Jemen",
                                    "Jordanija",
                                    "Ju\u017Ena Afrika",
                                    "Ju\u017Ena Koreja",
                                    "Kambod\u017Ea",
                                    "Kamerun",
                                    "Kanada",
                                    "Katar",
                                    "Kazahstan",
                                    "Kenija",
                                    "Kirgizistan",
                                    "Kiribati",
                                    "Kitajska",
                                    "Kolumbija",
                                    "Komori",
                                    "Kongo",
                                    "Demokrati\u010Dna republika Kongo",
                                    "Kostarika",
                                    "Kuba",
                                    "Kuvajt",
                                    "Laos",
                                    "Latvija",
                                    "Lesoto",
                                    "Libanon",
                                    "Liberija",
                                    "Libija",
                                    "Lihten\u0161tajn",
                                    "Litva",
                                    "Luksemburg",
                                    "Madagaskar",
                                    "Mad\u017Earska",
                                    "Makedonija",
                                    "Malavi",
                                    "Maldivi",
                                    "Malezija",
                                    "Mali",
                                    "Malta",
                                    "Maroko",
                                    "Marshallovi otoki",
                                    "Mauritius",
                                    "Mavretanija",
                                    "Mehika",
                                    "Mikronezija",
                                    "Mjanmar",
                                    "Moldavija",
                                    "Monako",
                                    "Mongolija",
                                    "Mozambik",
                                    "Namibija",
                                    "Nauru",
                                    "Nem\u010Dija",
                                    "Nepal",
                                    "Niger",
                                    "Nigerija",
                                    "Nikaragva",
                                    "Nizozemska",
                                    "Norve\u0161ka",
                                    "Nova Zelandija",
                                    "Oman",
                                    "Pakistan",
                                    "Palau",
                                    "Panama",
                                    "Papua Nova Gvineja",
                                    "Paragvaj",
                                    "Peru",
                                    "Poljska",
                                    "Portugalska",
                                    "Romunija",
                                    "Ruanda",
                                    "Rusija",
                                    "Saint Kitts in Nevis",
                                    "Saint Lucia",
                                    "Saint Vincent in Grenadine",
                                    "Salomonovi otoki",
                                    "Salvador",
                                    "San Marino",
                                    "Sao Tome in Principe",
                                    "Saudova Arabija",
                                    "Sej\u0161eli",
                                    "Senegal",
                                    "Severna Koreja",
                                    "Sierra Leone",
                                    "Singapur",
                                    "Sirija",
                                    "Slonoko\u0161\u010Dena obala",
                                    "Slova\u0161ka",
                                    "Slovenija",
                                    "Somalija",
                                    "Srbija",
                                    "Srednjeafri\u0161ka republika",
                                    "Sudan",
                                    "Surinam",
                                    "Svazi",
                                    "\u0160panija",
                                    "\u0160rilanka",
                                    "\u0160vedska",
                                    "\u0160vica",
                                    "Tad\u017Eikistan",
                                    "Tajska",
                                    "Tajvan",
                                    "Tanzanija",
                                    "Togo",
                                    "Tonga",
                                    "Trinidad in Tobago",
                                    "Tunizija",
                                    "Tur\u010Dija",
                                    "Turkmenistan",
                                    "Tuvalu",
                                    "Uganda",
                                    "Ukrajina",
                                    "Urugvaj",
                                    "Uzbekistan",
                                    "Vanuatu",
                                    "Vatikan",
                                    "Velika Britanija",
                                    "Venezuela",
                                    "Vietnam",
                                    "Vzhodni Timor",
                                    "Zahodna Samoa",
                                    "Zambija",
                                    "Zdru\u017Eene dr\u017Eave Amerike",
                                    "Zdru\u017Eeni arabski emirati",
                                    "Zelenortski otoki",
                                    "Zimbabve");
                        });

        public Object cityFormats = ZVal.arrayFromList("{{cityName}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList("{{streetName}} {{buildingNumber}}");

        public Object addressFormats =
                ZVal.arrayFromList("{{streetAddress}}\\n {{postcode}}\\n {{cityName}}");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\sl_SI\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "buildingNumber",
                            "city",
                            "cityFormats",
                            "country",
                            "postcode",
                            "street",
                            "streetAddressFormats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/sl_SI/Address.php")
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
