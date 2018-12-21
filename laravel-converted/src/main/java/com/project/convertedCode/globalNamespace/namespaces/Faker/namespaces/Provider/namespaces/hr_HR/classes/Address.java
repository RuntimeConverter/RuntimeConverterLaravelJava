package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.hr_HR.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/hr_HR/Address.php

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
                                                                .hr_HR
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
                                                        .hr_HR
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .cityNames)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\hr_HR\\Address";

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
                                                            .hr_HR
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .streets)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object streets =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Baranjska ulica",
                                    "Batina jug",
                                    "Beljska ulica",
                                    "Biljski sokak",
                                    "Blatna ulica",
                                    "Bra\u010Dka ulica",
                                    "Crkvena ulica",
                                    "Daljok",
                                    "Dravska ulica",
                                    "Dra\u017E-planina",
                                    "Dubrova\u010Dka ulica",
                                    "Dunavska ulica",
                                    "Glavna ulica",
                                    "Grobljanska ulica",
                                    "Jorgovanska ulica",
                                    "Karana\u010Dka",
                                    "Ken\u0111ija",
                                    "Kod plota",
                                    "Kolodvorska ulica",
                                    "Komar\u010Dev prolaz",
                                    "Konkolo\u0161",
                                    "Kru\u0161eva\u010Dka ulica",
                                    "Lugarnica \u0160arkanj",
                                    "Mirna ulica",
                                    "Nova ulica",
                                    "Osje\u010Dka ulica",
                                    "Partizanska ulica",
                                    "Planina istok",
                                    "Planina jug",
                                    "Planina zapad",
                                    "Planina",
                                    "Planinska ulica",
                                    "Popova\u010Dka ulica",
                                    "Primo\u0161tenska ulica",
                                    "Radni\u010Dka ulica",
                                    "Ribarska ulica",
                                    "Ritska ulica",
                                    "Sala\u0161i",
                                    "Savska ulica",
                                    "Slavonska ulica",
                                    "Srednja ulica",
                                    "Staklena ulica",
                                    "Sun\u010Dana ulica",
                                    "Trg Josipa bana Jela\u010Di\u0107a",
                                    "Trg Slobode",
                                    "Trg Stipe \u0110urina",
                                    "Trg hrvatske mlade\u017Ei",
                                    "Ulica 1. svibnja",
                                    "Ulica 30. svibnja",
                                    "Ulica Adolfa Waldingera",
                                    "Ulica Alojzija Stepinca",
                                    "Ulica Ankice Dobrokes",
                                    "Ulica Ante Kova\u010Di\u0107a",
                                    "Ulica Ante Star\u010Devi\u0107a",
                                    "Ulica Antuna Augustin\u010Di\u0107a",
                                    "Ulica Antuna Gustava Mato\u0161a",
                                    "Ulica Aranji Jano\u0161a",
                                    "Ulica Augusta Cesarca",
                                    "Ulica Augusta \u0160enoe",
                                    "Ulica Bartoka Bele",
                                    "Ulica Biljske satnije ZNH RH",
                                    "Ulica Borisa Kidri\u010Da",
                                    "Ulica Branka Gavelle",
                                    "Ulica Branka Radi\u010Devi\u0107a",
                                    "Ulica Dore Peja\u010Devi\u0107",
                                    "Ulica Dositeja Obradovi\u0107a",
                                    "Ulica Do\u017Ea \u0110er\u0111a",
                                    "Ulica Dragutina Tadijanovi\u0107a",
                                    "Ulica Eugena Kvaternika",
                                    "Ulica Eugena Savojskog",
                                    "Ulica Frana Krste Frankopana",
                                    "Ulica Franca Liszta",
                                    "Ulica Franje Ra\u010Dkoga",
                                    "Ulica Gustava Krkleca",
                                    "Ulica Hrvatske vojske",
                                    "Ulica Imre Nagya",
                                    "Ulica Ivana Gorana Kova\u010Di\u0107a",
                                    "Ulica Ivana Gunduli\u0107a",
                                    "Ulica Ivana Kozarca",
                                    "Ulica Ivana Ma\u017Eurani\u0107a",
                                    "Ulica Ivana Me\u0161trovi\u0107a",
                                    "Ulica Ivana Milutinovi\u0107a",
                                    "Ulica Ivane Brli\u0107-Ma\u017Eurani\u0107",
                                    "Ulica Ive Grgi\u0107a",
                                    "Ulica Ive Lole Ribara",
                                    "Ulica Ive Petru\u0161i\u0107a",
                                    "Ulica Izidora Kr\u0161njavoga",
                                    "Ulica I\u0161tvana Vencela",
                                    "Ulica Janka Dra\u0161kovi\u0107a",
                                    "Ulica Janusa Pannoniusa",
                                    "Ulica Jerka Zlatari\u0107a",
                                    "Ulica Jokai Mora",
                                    "Ulica Josipa B\u00F6sendorfera",
                                    "Ulica Josipa Jurja Strossmayera",
                                    "Ulica Josipa Kozarca",
                                    "Ulica Josipa Kra\u0161a",
                                    "Ulica Josipa Pan\u010Di\u0107a",
                                    "Ulica Josipa Runjanina",
                                    "Ulica Jovana Jovanovi\u0107a Zmaja",
                                    "Ulica Jovana Lazi\u0107a",
                                    "Ulica Jozsefa Antala",
                                    "Ulica Julija Bene\u0161i\u0107a",
                                    "Ulica Julija Klovi\u0107a",
                                    "Ulica Ko\u0161ut Lajo\u0161a",
                                    "Ulica Lajo\u0161a Ko\u0161uta",
                                    "Ulica Lavoslava Ru\u017Ei\u010Dke",
                                    "Ulica Ljudevita Gaja",
                                    "Ulica Ljudevita Posavskog",
                                    "Ulica Marije Juri\u0107 Zagorke",
                                    "Ulica Marina Dr\u017Ei\u0107a",
                                    "Ulica Marka Maruli\u0107a",
                                    "Ulica Marka Ore\u0161kovi\u0107a",
                                    "Ulica Matije Antuna Relkovi\u0107a",
                                    "Ulica Matije Gupca",
                                    "Ulica Matije Petra Katan\u010Di\u0107a",
                                    "Ulica Matka Pei\u0107a",
                                    "Ulica Mije Zlatari\u0107a",
                                    "Ulica Miladina Popovi\u0107a",
                                    "Ulica Miroslava Krle\u017Ee",
                                    "Ulica Nikole Tesle",
                                    "Ulica Obrada Ribi\u0107a",
                                    "Ulica Petefi \u0160andora",
                                    "Ulica Petra Berislavi\u0107a",
                                    "Ulica Petra Dobrovi\u0107a",
                                    "Ulica Petra Drap\u0161ina",
                                    "Ulica Petra Petrovi\u0107a Njego\u0161a",
                                    "Ulica Petra Preradovi\u0107a",
                                    "Ulica Petra Zrinskog",
                                    "Ulica Republike",
                                    "Ulica Ru\u0111era Bo\u0161kovi\u0107a",
                                    "Ulica Sare Berti\u0107",
                                    "Ulica Silvija Strahimira Kranj\u010Devi\u0107a",
                                    "Ulica Stipe Matovi\u0107a",
                                    "Ulica Stjepana Brodari\u0107a",
                                    "Ulica Stjepana Radi\u0107a",
                                    "Ulica Stjepana Stjepanova",
                                    "Ulica Svetozara Mileti\u0107a",
                                    "Ulica Tina Ujevi\u0107a",
                                    "Ulica Toldi Ferenca",
                                    "Ulica Vasilja Ga\u0107e\u0161e",
                                    "Ulica Vatroslava Lisinskog",
                                    "Ulica Vladana Desnice",
                                    "Ulica Vladimira Filakovca",
                                    "Ulica Vladimira Nazora",
                                    "Ulica Vladimira Preloga",
                                    "Ulica Vladka Ma\u010Deka",
                                    "Ulica Vojina Baki\u0107a",
                                    "Ulica Vuka Stefanovi\u0107a Karad\u017Ei\u0107a",
                                    "Ulica Zvonka Brki\u0107a",
                                    "Ulica bana Jela\u010Di\u0107a",
                                    "Ulica bijelog lopo\u010Da",
                                    "Ulica bra\u0107e Radi\u0107",
                                    "Ulica crne rode",
                                    "Ulica domovinske zahvalnosti",
                                    "Ulica dr Franje Tu\u0111mana",
                                    "Ulica dr. Ante Star\u010Devi\u0107a",
                                    "Ulica dr. Franje Tu\u0111mana",
                                    "Ulica dr. Kamila Firingera",
                                    "Ulica hrvatskih branitelja",
                                    "Ulica kardinala Franje \u0160efera",
                                    "Ulica kneza Branimira",
                                    "Ulica kneza Domagoja",
                                    "Ulica kneza Trpimira",
                                    "Ulica kralja Kre\u0161imira",
                                    "Ulica kralja Petra Kre\u0161imira IV",
                                    "Ulica kralja Tomislava",
                                    "Ulica kralja Zvonimira",
                                    "Ulica republike",
                                    "Ulica svetog Ivana Nepomuka",
                                    "Ulica svetog Martina",
                                    "Ulica svetog kri\u017Ea",
                                    "Ulica \u0110ure \u0110akovi\u0107a",
                                    "Ulica \u0160andora Petefija",
                                    "Ulica \u0160ovakova",
                                    "Ulica \u0161portova",
                                    "Ulica \u017Darka Zrenjanina",
                                    "Ulica \u017Dikice Jovanovi\u0107a \u0160panca",
                                    "Ulica \u017Ertava domovinskog rata",
                                    "Vatrogasna ulica",
                                    "Velebitska ulica",
                                    "Vijenac Nikole Tesle",
                                    "Vinogradska ulica",
                                    "Virska ulica",
                                    "Vukovarska ulica",
                                    "Zagreba\u010Dka ulica",
                                    "\u0160e\u0107eranska ulica",
                                    "\u0160kolska ulica");
                        });

        public Object streetNameFormats = ZVal.arrayFromList("{{street}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList("{{streetName}} {{buildingNumber}}");

        public Object addressFormats =
                ZVal.arrayFromList("{{streetAddress}}, {{postcode}} {{city}}");

        public Object cityFormats = ZVal.arrayFromList("{{cityName}}");

        public Object postcode = ZVal.arrayFromList("#####");

        public Object cityNames =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Bakar",
                                    "Beli Manastir",
                                    "Beli\u0161\u0107e",
                                    "Benkovac",
                                    "Biograd na Moru",
                                    "Bjelovar",
                                    "Buje",
                                    "Buzet",
                                    "Cres",
                                    "Crikvenica",
                                    "Daruvar",
                                    "Delnice",
                                    "Dodatak:Imena europskih gradova na razli\u010Ditim jezicima",
                                    "Donja Stubica",
                                    "Donji Miholjac",
                                    "Drni\u0161",
                                    "Dubrovnik",
                                    "Duga Resa",
                                    "Dugo Selo",
                                    "Gare\u0161nica",
                                    "Glina",
                                    "Gospi\u0107",
                                    "Grubi\u0161no Polje",
                                    "Hrvatska Kostajnica",
                                    "Hvar",
                                    "Ilok",
                                    "Imotski",
                                    "Ivanec",
                                    "Ivani\u0107-Grad",
                                    "Jastrebarsko",
                                    "Karlovac",
                                    "Kastav",
                                    "Ka\u0161tela",
                                    "Klanjec",
                                    "Knin",
                                    "Komi\u017Ea",
                                    "Koprivnica",
                                    "Kor\u010Dula",
                                    "Kraljevica",
                                    "Krapina",
                                    "Kri\u017Eevci",
                                    "Krk",
                                    "Kutina",
                                    "Kutjevo",
                                    "Labin",
                                    "Lepoglava",
                                    "Lipik",
                                    "Ludbreg",
                                    "Makarska",
                                    "Mali Lo\u0161inj",
                                    "Metkovi\u0107",
                                    "Mursko Sredi\u0161\u0107e",
                                    "Na\u0161ice",
                                    "Nin",
                                    "Nova Gradi\u0161ka",
                                    "Novalja",
                                    "Novi Marof",
                                    "Novi Vinodolski",
                                    "Novigrad",
                                    "Novska",
                                    "Obrovac",
                                    "Ogulin",
                                    "Omi\u0161",
                                    "Opatija",
                                    "Opuzen",
                                    "Orahovica",
                                    "Oroslavje",
                                    "Osijek",
                                    "Otok",
                                    "Oto\u010Dac",
                                    "Ozalj",
                                    "Pag",
                                    "Pakrac",
                                    "Pazin",
                                    "Petrinja",
                                    "Pleternica",
                                    "Plo\u010De",
                                    "Popova\u010Da",
                                    "Pore\u010D",
                                    "Po\u017Eega",
                                    "Pregrada",
                                    "Prelog",
                                    "Pula",
                                    "Rab",
                                    "Rijeka",
                                    "Rovinj",
                                    "Samobor",
                                    "Senj",
                                    "Sinj",
                                    "Sisak",
                                    "Skradin",
                                    "Slatina",
                                    "Slavonski Brod",
                                    "Slunj",
                                    "Solin",
                                    "Split",
                                    "Stari Grad",
                                    "Supetar",
                                    "Sveta Nedelja",
                                    "Sveti Ivan Zelina",
                                    "Trilj",
                                    "Trogir",
                                    "Umag",
                                    "Valpovo",
                                    "Vara\u017Edin",
                                    "Vara\u017Edinske Toplice",
                                    "Velika Gorica",
                                    "Vinkovci",
                                    "Virovitica",
                                    "Vis",
                                    "Vodice",
                                    "Vodnjan",
                                    "Vrbovec",
                                    "Vrbovsko",
                                    "Vrgorac",
                                    "Vrlika",
                                    "Vukovar",
                                    "Zabok",
                                    "Zadar",
                                    "Zagreb",
                                    "Zapre\u0161i\u0107",
                                    "Zlatar",
                                    "\u010Cabar",
                                    "\u010Cakovec",
                                    "\u010Cazma",
                                    "\u0110akovo",
                                    "\u0110ur\u0111evac",
                                    "\u0160ibenik",
                                    "\u017Dupanja");
                        });

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Andora",
                                    "Ujedinjeni Arapski Emirati",
                                    "Afganistan",
                                    "Albanija",
                                    "Armenija",
                                    "Nizozemski Antili",
                                    "Angola",
                                    "Antarktika",
                                    "Argentina",
                                    "Ameri\u010Dka Samoa",
                                    "Austrija",
                                    "Australija",
                                    "Azerbejd\u017Ean",
                                    "Bosna i Hercegovina",
                                    "Barbados",
                                    "Banglade\u0161",
                                    "Belgija",
                                    "Burkina Faso",
                                    "Bugarska",
                                    "Bahrein",
                                    "Burundi",
                                    "Benin",
                                    "Bolivija",
                                    "Brazil",
                                    "Bjelorusija",
                                    "Belize",
                                    "Kanada",
                                    "\u0160vicarska",
                                    "Obala Bjelokosti",
                                    "\u010Cile",
                                    "Kamerun",
                                    "Kina",
                                    "Kolumbija",
                                    "Kostarika",
                                    "Srbija",
                                    "Crna Gora",
                                    "Kuba",
                                    "Cipar",
                                    "\u010Ce\u0161ka",
                                    "Njema\u010Dka",
                                    "Danska",
                                    "Dominikanska Republika",
                                    "Al\u017Eir",
                                    "Ekvador",
                                    "Estonija",
                                    "Egipat",
                                    "\u0160panjolska",
                                    "Etiopija",
                                    "Finska",
                                    "Farski Otoci",
                                    "Francuska",
                                    "Ujedinjeno Kraljevstvo",
                                    "Gruzija",
                                    "Gana",
                                    "Gibraltar",
                                    "Gambija",
                                    "Gr\u010Dka",
                                    "Gvatemala",
                                    "Honduras",
                                    "Hrvatska",
                                    "Ma\u0111arska",
                                    "Indonezija",
                                    "Irska",
                                    "Izrael",
                                    "Irak",
                                    "Iran",
                                    "Island",
                                    "Italija",
                                    "Jamajka",
                                    "Jordan",
                                    "Japan",
                                    "Sjeverna Koreja",
                                    "Ju\u017Ena Koreja",
                                    "Kuvajt",
                                    "Kazahstan",
                                    "Lihten\u0161tajn",
                                    "\u0160ri Lanka",
                                    "Luksemburg",
                                    "Libija",
                                    "Maroko",
                                    "Moldavija",
                                    "Makedonija",
                                    "Mali",
                                    "Malta",
                                    "Meksiko",
                                    "Malezija",
                                    "Mozambik",
                                    "Namibija",
                                    "Nigerija",
                                    "Nikaragva",
                                    "Nizozemska",
                                    "Norve\u0161ka",
                                    "Nepal",
                                    "Novi Zeland",
                                    "Oman",
                                    "Panama",
                                    "Peru",
                                    "Pakistan",
                                    "Poljska",
                                    "Portugal",
                                    "Paragvaj",
                                    "Katar",
                                    "Rumunjska",
                                    "Rusija",
                                    "Saudijska Arabija",
                                    "\u0160vedska",
                                    "Singapur",
                                    "Slovenija",
                                    "Slova\u010Dka",
                                    "San Marino",
                                    "Senegal",
                                    "Tajland",
                                    "Turska",
                                    "Trinidad i Tobago",
                                    "Ukrajina",
                                    "Sjedinjene Ameri\u010Dke Dr\u017Eave",
                                    "Urugvaj",
                                    "Uzbekistan");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\hr_HR\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "cityFormats",
                            "cityNames",
                            "country",
                            "postcode",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streets")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/hr_HR/Address.php")
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
