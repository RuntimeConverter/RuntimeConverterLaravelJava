package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.lt_LT.classes;

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
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/lt_LT/Address.php

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
    public Object address(RuntimeEnv env, Object... args) {
        Object format = null;
        format =
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
                                                                .lt_LT
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "addressFormats")))
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
                                                        .lt_LT
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .addressFormats)
                        .value();
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Address.class,
                        format));
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
                                                                .lt_LT
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
                                                        .lt_LT
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .city)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\lt_LT\\Address";

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
        public Object buildingNumber(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("numerify")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Address.class)
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
                                                                            .lt_LT
                                                                            .classes
                                                                            .Address
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .buildingNumber)
                                            .value())
                            .value());
        }

        @ConvertedMethod
        public Object country(RuntimeEnv env, Object... args) {
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
                                                            .lt_LT
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .country)
                            .value());
        }

        @ConvertedMethod
        public Object postcode(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("toUpper")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Address.class)
                                            .method("bothify")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(
                                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                    env, this, Address.class)
                                                            .method("randomElement")
                                                            .addReferenceArgs(
                                                                    new RuntimeArgsWithReferences())
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
                                                                                            .lt_LT
                                                                                            .classes
                                                                                            .Address
                                                                                            .RequestStaticProperties
                                                                                            .class)
                                                                            .postcode)
                                                            .value())
                                            .value())
                            .value());
        }

        @ConvertedMethod
        public Object regionSuffix(RuntimeEnv env, Object... args) {
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
                                                            .lt_LT
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .regionSuffix)
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
                                                            .lt_LT
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .region)
                            .value());
        }

        @ConvertedMethod
        public Object citySuffix(RuntimeEnv env, Object... args) {
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
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .citySuffix)
                            .value());
        }

        @ConvertedMethod
        public Object streetSuffix(RuntimeEnv env, Object... args) {
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
                                                            .lt_LT
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .streetSuffix)
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
                                                            .lt_LT
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

        public Object cityPrefix = ZVal.arrayFromList("miestas");

        public Object regionSuffix = ZVal.arrayFromList("regionas");

        public Object streetSuffix =
                ZVal.arrayFromList("g.", "gatv\u0117", "prospektas", "al\u0117ja");

        public Object buildingNumber = ZVal.arrayFromList("##");

        public Object postcode = ZVal.arrayFromList("LT-#####");

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Afganistanas",
                                    "Airija",
                                    "Aland\u0173 salos",
                                    "Albanija",
                                    "Al\u017Eyras",
                                    "Amerikos Samoa",
                                    "Andora",
                                    "Angilija",
                                    "Angola",
                                    "Antarktis",
                                    "Antigva ir Barbuda",
                                    "Argentina",
                                    "Arm\u0117nija",
                                    "Aruba",
                                    "Australija",
                                    "Austrija",
                                    "Azerbaid\u017Eanas",
                                    "Bahamos",
                                    "Bahreinas",
                                    "Baltarusija",
                                    "Banglade\u0161as",
                                    "Barbadosas",
                                    "Belgija",
                                    "Belizas",
                                    "Beninas",
                                    "Bermuda",
                                    "Bisau Gvin\u0117ja",
                                    "Bolivija",
                                    "Bosnija ir Hercegovina",
                                    "Botsvana",
                                    "Bouvet sala",
                                    "Brazilija",
                                    "Brun\u0117jus",
                                    "Bulgarija",
                                    "Burkina Fasas",
                                    "Burundis",
                                    "Butanas",
                                    "Centrin\u0117s Afrikos Respublika",
                                    "Danija",
                                    "Did\u017Eioji Britanija",
                                    "Did\u017Eiosios Britanijos Mergeli\u0173 salos",
                                    "Dominika",
                                    "Dominikos Respublika",
                                    "Dramblio Kaulo Krantas",
                                    "D\u017Eersis",
                                    "D\u017Eibutis",
                                    "Egiptas",
                                    "Ekvadoras",
                                    "Eritr\u0117ja",
                                    "Estija",
                                    "Etiopija",
                                    "Falklando salos",
                                    "Farer\u0173 salos",
                                    "Fid\u017Eis",
                                    "Filipinai",
                                    "Gabonas",
                                    "Gajana",
                                    "Gambija",
                                    "Gana",
                                    "Gibraltaras",
                                    "Graikija",
                                    "Grenada",
                                    "Grenlandija",
                                    "Gruzija",
                                    "Guamas",
                                    "Guernsis",
                                    "Gvadelup\u0117",
                                    "Gvatemala",
                                    "Gvin\u0117ja",
                                    "Haitis",
                                    "Heardo ir McDonaldo Sal\u0173 Sritis",
                                    "Hond\u016Bras",
                                    "Indija",
                                    "Indijos vandenyno brit\u0173 sritis",
                                    "Indonezija",
                                    "Irakas",
                                    "Iranas",
                                    "Islandija",
                                    "Ispanija",
                                    "Italija",
                                    "Izraelis",
                                    "Jamaika",
                                    "Japonija",
                                    "Jemenas",
                                    "Jordanija",
                                    "Jungtiniai Arab\u0173 Emyratai",
                                    "Jungtini\u0173\n    Valstij\u0173 ma\u017Eosios aplinkin\u0117s salos",
                                    "Jungtin\u0117s Valstijos",
                                    "Juodkalnija",
                                    "Kaiman\u0173 salos",
                                    "Kal\u0117d\u0173 sala",
                                    "Kambod\u017Ea",
                                    "Kamer\u016Bnas",
                                    "Kanada",
                                    "Kataras",
                                    "Kazachstanas",
                                    "Kenija",
                                    "Kinija",
                                    "Kinijos S.A.R.Honkongas",
                                    "Kipras",
                                    "Kirgiztanas",
                                    "Kiribatis",
                                    "Kokos\u0173 salos",
                                    "Kolumbija",
                                    "Komorai",
                                    "Kongas",
                                    "Kongo Demokratin\u0117\n    Respublika",
                                    "Kosta Rika",
                                    "Kroatija",
                                    "Kuba",
                                    "Kuko salos",
                                    "Kuveitas",
                                    "Laosas",
                                    "Latvija",
                                    "Lenkija",
                                    "Lesotas",
                                    "Libanas",
                                    "Liberija",
                                    "Libija",
                                    "Lichten\u0161teinas",
                                    "Lietuva",
                                    "Liuksemburgas",
                                    "Macao",
                                    "Madagaskaras",
                                    "Makedonija",
                                    "Malaizija",
                                    "Malavis",
                                    "Maldivai",
                                    "Malis",
                                    "Malta",
                                    "Marianos \u0161iaurin\u0117s salos",
                                    "Marokas",
                                    "Martinika",
                                    "Mar\u0161alo Salos",
                                    "Mauricijus",
                                    "Mauritanija",
                                    "Mayotte\u2019as",
                                    "Meino sala",
                                    "Meksika",
                                    "Mergeli\u0173 salos\n    (JAV)",
                                    "Mianmaras",
                                    "Mikronezija",
                                    "Moldova",
                                    "Monakas",
                                    "Mongolija",
                                    "Montserratas",
                                    "Mozambikas",
                                    "Namibija",
                                    "Naujoji Kaledonija",
                                    "Naujoji Zelandija",
                                    "Nauru",
                                    "Nepalas",
                                    "Ne\u017Einoma ar neteisinga sritis",
                                    "Nigerija",
                                    "Nigeris",
                                    "Nikaragva",
                                    "Niue",
                                    "Norfolko sala",
                                    "Norvegija",
                                    "Nyderlandai",
                                    "Olandijos Antilai",
                                    "Omanas",
                                    "Pakistanas",
                                    "Palau",
                                    "Palestinos teritorija",
                                    "Panama",
                                    "Papua Naujoji Gvin\u0117ja",
                                    "Paragvajus",
                                    "Peru",
                                    "Piet\u0173\n    Afrika",
                                    "Piet\u0173 D\u017Eord\u017Eija ir Piet\u0173 Sandvi\u010Do salos",
                                    "Piet\u0173 Kor\u0117ja",
                                    "Pitkernas",
                                    "Portugalija",
                                    "Pranc\u016Bzija",
                                    "Pranc\u016Bzijos Gviana",
                                    "Pranc\u016Bzijos Piet\u0173 sritys",
                                    "Pranc\u016Bz\u0173 Polinezija",
                                    "Puerto Rikas",
                                    "Pusiaujo Gvin\u0117ja",
                                    "Reunionas",
                                    "Ruanda",
                                    "Rumunija",
                                    "Rusijos Federacija",
                                    "Ryt\u0173 Timoras",
                                    "Saint-Martin",
                                    "Saliamono salos",
                                    "Salvadoras",
                                    "Samoa",
                                    "San Marinas",
                                    "San Tom\u0117 ir Princip\u0117",
                                    "Saudo Arabija",
                                    "Sei\u0161eliai",
                                    "Sen Pjeras ir\n    Mikelonas",
                                    "Senegalas",
                                    "Sent Kitsas ir Nevis",
                                    "Serbija",
                                    "Serbija ir Juodkalnija",
                                    "Siera Leon\u0117",
                                    "Singap\u016Bras",
                                    "Sirija",
                                    "Slovakija",
                                    "Slov\u0117nija",
                                    "Somalis",
                                    "Sudanas",
                                    "Suomija",
                                    "Surinamas",
                                    "Svalbardo ir Jan Majen salos",
                                    "Svazilendas",
                                    "Tad\u017Eikistanas",
                                    "Tailandas",
                                    "Taivanas",
                                    "Tanzanija",
                                    "Togas",
                                    "Tokelau",
                                    "Tonga",
                                    "Trinidadas ir\n    Tobagas",
                                    "Tunisas",
                                    "Turkija",
                                    "Turkm\u0117nistanas",
                                    "Turkso ir Caicoso salos",
                                    "Tuvalu",
                                    "Uganda",
                                    "Ukraina",
                                    "Urugvajus",
                                    "Uzbekistanas",
                                    "Vakar\u0173 Sachara",
                                    "Vanuatu",
                                    "Vatikanas",
                                    "Venesuela",
                                    "Vengrija",
                                    "Vietnamas",
                                    "Vokietija",
                                    "Wallisas ir Futuna",
                                    "Zambija",
                                    "Zimbabv\u0117",
                                    "\u010Cadas",
                                    "\u010Cekija",
                                    "\u010Cil\u0117",
                                    "\u0160iaur\u0117s Kor\u0117ja",
                                    "\u0160ri Lanka",
                                    "\u0160vedija",
                                    "\u0160veicarija",
                                    "\u0160ventasis Vincentas ir Grenadinai",
                                    "\u0160vento Baltramiejaus sala",
                                    "\u0160ventoji Elena",
                                    "\u0160ventoji Liucija",
                                    "\u017Daliasis Ky\u0161ulys");
                        });

        public Object region =
                ZVal.arrayFromList(
                        "Auk\u0161taitija", "Dz\u016Bkija", "Suvalkija", "\u017Demaitija");

        public Object city =
                ZVal.arrayFromList(
                        "Vilnius",
                        "Kaunas",
                        "Klaip\u0117da",
                        "\u0160iauliai",
                        "Panev\u0117\u017Eys",
                        "Alytus",
                        "Marijampol\u0117",
                        "Ma\u017Eeikiai",
                        "Jonava",
                        "Utena",
                        "K\u0117dainiai",
                        "Tel\u0161iai",
                        "Visaginas",
                        "Taurag\u0117",
                        "Ukmerg\u0117");

        public Object street =
                ZVal.arrayFromList(
                        "Klaip\u0117dos",
                        "Vilniaus",
                        "Kauno",
                        "\u017Dalgirio",
                        "Saltoni\u0161ki\u0173",
                        "Laisv\u0117s",
                        "Did\u017Eioji",
                        "Liep\u0173");

        public Object addressFormats =
                ZVal.arrayFromList(
                        "{{street}} {{streetSuffix}} {{buildingNumber}}-{{buildingNumber}}, {{city}}",
                        "{{street}} {{streetSuffix}} {{buildingNumber}}, {{city}}",
                        "{{street}} {{streetSuffix}} {{buildingNumber}}, {{city}} {{postcode}}");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\lt_LT\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "buildingNumber",
                            "city",
                            "cityPrefix",
                            "country",
                            "postcode",
                            "region",
                            "regionSuffix",
                            "street",
                            "streetSuffix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/lt_LT/Address.php")
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
