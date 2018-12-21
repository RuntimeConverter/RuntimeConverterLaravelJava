package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.sr_Latn_RS.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/sr_Latn_RS/Address.php

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
                                                                .sr_Latn_RS
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
                                                        .sr_Latn_RS
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .cityNames)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\sr_Latn_RS\\Address";

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
                                                            .sr_Latn_RS
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
                                                            .sr_Latn_RS
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .street)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object postcode = ZVal.arrayFromList("#####");

        public Object streetPrefix = ZVal.arrayFromList("Bulevar");

        public Object street =
                ZVal.arrayFromList(
                        "Kralja Milana",
                        "Cara Du\u0161ana",
                        "Nikole Tesle",
                        "Mihajla Pupina",
                        "Nikole Pa\u0161i\u0107a");

        public Object streetNameFormats =
                ZVal.arrayFromList("{{street}}", "{{streetPrefix}} {{street}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList("{{streetName}} {{buildingNumber}}");

        public Object cityFormats = ZVal.arrayFromList("{{cityName}}");

        public Object cityNames =
                ZVal.arrayFromList(
                        "Beograd",
                        "Valjevo",
                        "Vranje",
                        "Zaje\u010Dar",
                        "Zrenjanin",
                        "Jagodina",
                        "Kragujevac",
                        "Kraljevo",
                        "Kru\u0161evac",
                        "Leskovac",
                        "Loznica",
                        "Ni\u0161",
                        "Novi Pazar",
                        "Novi Sad",
                        "Pan\u010Devo",
                        "Po\u017Earevac",
                        "Pri\u0161tina",
                        "Smederevo",
                        "Sombor",
                        "Sremska Mitrovica",
                        "Subotica",
                        "U\u017Eice",
                        "\u010Ca\u010Dak",
                        "\u0160abac");

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Ostrvo Asension",
                                    "Andora",
                                    "Ujedinjeni Arapski Emirati",
                                    "Avganistan",
                                    "Antigva i Barbuda",
                                    "Angvila",
                                    "Albanija",
                                    "Armenija",
                                    "Holandski Antili",
                                    "Angola",
                                    "Antarktika",
                                    "Argentina",
                                    "Ameri\u010Dka Samoa",
                                    "Austrija",
                                    "Australija",
                                    "Aruba",
                                    "Alandska ostrva",
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
                                    "Sv. Bartolomej",
                                    "Bermuda",
                                    "Brunej",
                                    "Bolivija",
                                    "Brazil",
                                    "Bahami",
                                    "Butan",
                                    "Buve Ostrva",
                                    "Bocvana",
                                    "Belorusija",
                                    "Belise",
                                    "Kanada",
                                    "Kokos (Keling) Ostrva",
                                    "Demokratska Republika Kongo",
                                    "Centralno Afri\u010Dka Republika",
                                    "Kongo",
                                    "\u0160vajcarska",
                                    "Obala Slonova\u010De",
                                    "Kukova Ostrva",
                                    "\u010Cile",
                                    "Kamerun",
                                    "Kina",
                                    "Kolumbija",
                                    "Ostrvo Kliperton",
                                    "Kostarika",
                                    "Srbija i Crna Gora",
                                    "Kuba",
                                    "Kape Verde",
                                    "Bo\u017Ei\u0107na Ostrva",
                                    "Kipar",
                                    "\u010Ce\u0161ka",
                                    "Nema\u010Dka",
                                    "Dijego Garsija",
                                    "D\u017Eibuti",
                                    "Danska",
                                    "Dominika",
                                    "Dominikanska Republika",
                                    "Al\u017Eir",
                                    "Seuta i Melilja",
                                    "Ekvador",
                                    "Estonija",
                                    "Egipat",
                                    "Zapadna Sahara",
                                    "Eritreja",
                                    "\u0160panija",
                                    "Etiopija",
                                    "Evropska unija",
                                    "Finska",
                                    "Fid\u017Ei",
                                    "Folklandska Ostrva",
                                    "Mikronezija",
                                    "Farska Ostrva",
                                    "Francuska",
                                    "Gabon",
                                    "Velika Britanija",
                                    "Grenada",
                                    "Gruzija",
                                    "Francuska Gvajana",
                                    "Gurnsi",
                                    "Gana",
                                    "Gibraltar",
                                    "Grenland",
                                    "Gambija",
                                    "Gvineja",
                                    "Gvadelupe",
                                    "Ekvatorijalna Gvineja",
                                    "Gr\u010Dka",
                                    "Ju\u017Ena D\u017Eord\u017Eija i Ju\u017Ena Sendvi\u010D Ostrva",
                                    "Gvatemala",
                                    "Guam",
                                    "Gvineja-Bisao",
                                    "Gvajana",
                                    "Hong Kong (S. A. R. Kina)",
                                    "Herd i Mekdonald Ostrva",
                                    "Honduras",
                                    "Hrvatska",
                                    "Haiti",
                                    "Ma\u0111arska",
                                    "Kanarska ostrva",
                                    "Indonezija",
                                    "Irska",
                                    "Izrael",
                                    "Ostrvo Man",
                                    "Indija",
                                    "Britansko Indijska Okeanska Teritorija",
                                    "Irak",
                                    "Iran",
                                    "Island",
                                    "Italija",
                                    "D\u017Eersi",
                                    "Jamajka",
                                    "Jordan",
                                    "Japan",
                                    "Kenija",
                                    "Kirgizstan",
                                    "Kambod\u017Ea",
                                    "Kiribati",
                                    "Komorska Ostrva",
                                    "Sent Kits i Nevis",
                                    "Severna Koreja",
                                    "Ju\u017Ena Koreja",
                                    "Kuvajt",
                                    "Kajmanska Ostrva",
                                    "Kazahstan",
                                    "Laos",
                                    "Liban",
                                    "Sent Lucija",
                                    "Lihten\u0161tajn",
                                    "\u0160ri Lanka",
                                    "Liberija",
                                    "Lesoto",
                                    "Litvanija",
                                    "Luksemburg",
                                    "Letonija",
                                    "Libija",
                                    "Maroko",
                                    "Monako",
                                    "Moldavija",
                                    "Crna Gora",
                                    "Sv. Martin",
                                    "Madagaskar",
                                    "Mar\u0161alska Ostrva",
                                    "Makedonija",
                                    "Mali",
                                    "Mijanmar",
                                    "Mongolija",
                                    "Makao (S. A. R. Kina)",
                                    "Severna Marijanska Ostrva",
                                    "Martinik",
                                    "Mauritanija",
                                    "Monserat",
                                    "Malta",
                                    "Mauricius",
                                    "Maldivi",
                                    "Malavi",
                                    "Meksiko",
                                    "Malezija",
                                    "Mozambik",
                                    "Namibija",
                                    "Nova Kaledonija",
                                    "Niger",
                                    "Norfolk Ostrvo",
                                    "Nigerija",
                                    "Nikaragva",
                                    "Holandija",
                                    "Norve\u0161ka",
                                    "Nepal",
                                    "Nauru",
                                    "Niue",
                                    "Novi Zeland",
                                    "Oman",
                                    "Panama",
                                    "Peru",
                                    "Francuska Polinezija",
                                    "Papua Nova Gvineja",
                                    "Filipini",
                                    "Pakistan",
                                    "Poljska",
                                    "Sen Pjer i Mikelon",
                                    "Pitcairn",
                                    "Porto Riko",
                                    "Palestinska Teritorija",
                                    "Portugal",
                                    "Palau",
                                    "Paragvaj",
                                    "Katar",
                                    "Ostala okeanija",
                                    "Rejunion",
                                    "Rumunija",
                                    "Srbija",
                                    "Rusija",
                                    "Ruanda",
                                    "Saudijska Arabija",
                                    "Solomonska Ostrva",
                                    "Sej\u0161eli",
                                    "Sudan",
                                    "\u0160vedska",
                                    "Singapur",
                                    "Sveta Jelena",
                                    "Slovenija",
                                    "Svalbard i Janmajen Ostrva",
                                    "Slova\u010Dka",
                                    "Sijera Leone",
                                    "San Marino",
                                    "Senegal",
                                    "Somalija",
                                    "Surinam",
                                    "Sao Tome i Principe",
                                    "Salvador",
                                    "Sirija",
                                    "Svazilend",
                                    "Tristan da Kunja",
                                    "Turks i Kajkos Ostrva",
                                    "\u010Cad",
                                    "Francuske Ju\u017Ene Teritorije",
                                    "Togo",
                                    "Tajland",
                                    "Tad\u017Eikistan",
                                    "Tokelau",
                                    "Isto\u010Dni Timor",
                                    "Turkmenistan",
                                    "Tunis",
                                    "Tonga",
                                    "Turska",
                                    "Trinidad i Tobago",
                                    "Tuvalu",
                                    "Tajvan",
                                    "Tanzanija",
                                    "Ukrajina",
                                    "Uganda",
                                    "Manja Udaljena Ostrva SAD",
                                    "Sjedinjene Ameri\u010Dke Dr\u017Eave",
                                    "Urugvaj",
                                    "Uzbekistan",
                                    "Vatikan",
                                    "Sent Vinsent i Grenadini",
                                    "Venecuela",
                                    "Britanska Devi\u010Danska Ostrva",
                                    "S.A.D. Devi\u010Danska Ostrva",
                                    "Vijetnam",
                                    "Vanuatu",
                                    "Valis i Futuna Ostrva",
                                    "Samoa",
                                    "Jemen",
                                    "Majote",
                                    "Ju\u017Enoafri\u010Dka Republika",
                                    "Zambija",
                                    "Zimbabve");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\sr_Latn_RS\\Address")
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
                    .setFilename(
                            "vendor/fzaninotto/faker/src/Faker/Provider/sr_Latn_RS/Address.php")
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
