package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.hu_HU.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/hu_HU/Address.php

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

    public static final Object CONST_class = "Faker\\Provider\\hu_HU\\Address";

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
        public Object secondaryAddress(RuntimeEnv env, Object... args) {
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
                                                                            .hu_HU
                                                                            .classes
                                                                            .Address
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .secondaryAddressFormats)
                                            .value())
                            .value());
        }

        @ConvertedMethod
        public Object state(RuntimeEnv env, Object... args) {
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
                                                            .hu_HU
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .state)
                            .value());
        }

        @ConvertedMethod
        public Object capital(RuntimeEnv env, Object... args) {
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
                                                            .hu_HU
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .capitals)
                            .value());
        }

        @ConvertedMethod
        public Object bigCity(RuntimeEnv env, Object... args) {
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
                                                            .hu_HU
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .bigCities)
                            .value());
        }

        @ConvertedMethod
        public Object smallerCity(RuntimeEnv env, Object... args) {
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
                                                            .hu_HU
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .smallerCities)
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
                                            .call(46.26274, 47.564721)
                                            .value()),
                            new ZPair(
                                    "longitude",
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Address.class)
                                            .method("longitude")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(17.077949, 20.60456)
                                            .value())));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object cityFormats =
                ZVal.arrayFromList(
                        "{{capital}}",
                        "{{capital}}",
                        "{{capital}}",
                        "{{bigCity}}",
                        "{{bigCity}}",
                        "{{smallerCity}}");

        public Object streetNameFormats =
                ZVal.arrayFromList(
                        "{{firstName}} {{streetSuffix}}", "{{lastName}} {{streetSuffix}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList(
                        "{{streetName}} {{buildingNumber}}.",
                        "{{streetName}} {{buildingNumber}}. {{secondaryAddress}}");

        public Object addressFormats =
                ZVal.arrayFromList("{{postcode}} {{city}}, {{streetAddress}}");

        public Object secondaryAddressFormats = ZVal.arrayFromList("##. emelet", "##. ajt\u00F3");

        public Object buildingNumber = ZVal.arrayFromList("###", "##", "##", "#");

        public Object streetSuffix =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u00E1rok",
                                    "\u00E1tj\u00E1r\u00F3",
                                    "d\u0171l\u0151sor",
                                    "d\u0171l\u0151\u00FAt",
                                    "erd\u0151sor",
                                    "fasor",
                                    "fordul\u00F3",
                                    "g\u00E1t",
                                    "hat\u00E1rsor",
                                    "hat\u00E1r\u00FAt",
                                    "h\u00EDd",
                                    "j\u00E1tsz\u00F3t\u00E9r",
                                    "kert",
                                    "k\u00F6r\u00F6nd",
                                    "k\u00F6rt\u00E9r",
                                    "k\u00F6r\u00FAt",
                                    "k\u00F6z",
                                    "lak\u00F3telep",
                                    "lej\u00E1r\u00F3",
                                    "lejt\u0151",
                                    "l\u00E9pcs\u0151",
                                    "liget",
                                    "m\u00E9ly\u00FAt",
                                    "orom",
                                    "orsz\u00E1g\u00FAt",
                                    "\u00F6sv\u00E9ny",
                                    "park",
                                    "part",
                                    "pincesor",
                                    "rakpart",
                                    "s\u00E9t\u00E1ny",
                                    "s\u00E9ta\u00FAt",
                                    "sor",
                                    "sug\u00E1r\u00FAt",
                                    "t\u00E9r",
                                    "tere",
                                    "turista\u00FAt",
                                    "udvar",
                                    "\u00FAt",
                                    "\u00FAtja",
                                    "utca",
                                    "\u00FCd\u00FCl\u0151part");
                        });

        public Object postcode = ZVal.arrayFromList("####");

        public Object state =
                ZVal.arrayFromList(
                        "Budapest",
                        "B\u00E1cs-Kiskun",
                        "Baranya",
                        "B\u00E9k\u00E9s",
                        "Borsod-Aba\u00FAj-Zempl\u00E9n",
                        "Csongr\u00E1d",
                        "Fej\u00E9r",
                        "Gy\u0151r-Moson-Sopron",
                        "Hajd\u00FA-Bihar",
                        "Heves",
                        "J\u00E1sz-Nagykun-Szolnok",
                        "Kom\u00E1rom-Esztergom",
                        "N\u00F3gr\u00E1d",
                        "Pest",
                        "Somogy",
                        "Szabolcs-Szatm\u00E1r-Bereg",
                        "Tolna",
                        "Vas",
                        "Veszpr\u00E9m",
                        "Zala");

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Afganiszt\u00E1n",
                                    "Alb\u00E1nia",
                                    "Alg\u00E9ria",
                                    "Amerikai Egyes\u00FClt \u00C1llamok",
                                    "Andorra",
                                    "Angola",
                                    "Antigua \u00E9s Barbuda",
                                    "Argent\u00EDna",
                                    "Ausztria",
                                    "Ausztr\u00E1lia",
                                    "Azerbajdzs\u00E1n",
                                    "Bahama-szigetek",
                                    "Bahrein",
                                    "Banglades",
                                    "Barbados",
                                    "Belgium",
                                    "Belize",
                                    "Benin",
                                    "Bhut\u00E1n",
                                    "Bol\u00EDvia",
                                    "Bosznia-Hercegovina",
                                    "Botswana",
                                    "Braz\u00EDlia",
                                    "Brunei",
                                    "Bulg\u00E1ria",
                                    "Burkina Faso",
                                    "Burma",
                                    "Burundi",
                                    "Chile",
                                    "Ciprus",
                                    "Costa Rica",
                                    "Csehorsz\u00E1g",
                                    "Cs\u00E1d",
                                    "Dominikai K\u00F6zt\u00E1rsas\u00E1g",
                                    "Dominikai K\u00F6z\u00F6ss\u00E9g",
                                    "Dzsibuti",
                                    "D\u00E1nia",
                                    "D\u00E9l-Afrika",
                                    "D\u00E9l-Korea",
                                    "D\u00E9l-Szud\u00E1n",
                                    "Ecuador",
                                    "Egyenl\u00EDt\u0151i-Guinea",
                                    "Egyes\u00FClt Arab Em\u00EDrs\u00E9gek",
                                    "Egyes\u00FClt Kir\u00E1lys\u00E1g",
                                    "Egyiptom",
                                    "Elef\u00E1ntcsontpart",
                                    "Eritrea",
                                    "Eti\u00F3pia",
                                    "Feh\u00E9roroszorsz\u00E1g",
                                    "Fidzsi-szigetek",
                                    "Finnorsz\u00E1g",
                                    "Franciaorsz\u00E1g",
                                    "F\u00FCl\u00F6p-szigetek",
                                    "Gabon",
                                    "Gambia",
                                    "Gh\u00E1na",
                                    "Grenada",
                                    "Gr\u00FAzia",
                                    "Guatemala",
                                    "Guinea",
                                    "Guyana",
                                    "G\u00F6r\u00F6gorsz\u00E1g",
                                    "Haiti",
                                    "Hollandia",
                                    "Horv\u00E1torsz\u00E1g",
                                    "India",
                                    "Indon\u00E9zia",
                                    "Irak",
                                    "Ir\u00E1n",
                                    "Izland",
                                    "Izrael",
                                    "Jap\u00E1n",
                                    "Jemen",
                                    "Jord\u00E1nia",
                                    "Kambodzsa",
                                    "Kamerun",
                                    "Kanada",
                                    "Katar",
                                    "Kazahszt\u00E1n",
                                    "Kelet-Timor",
                                    "Kenya",
                                    "Kirgiziszt\u00E1n",
                                    "Kiribati",
                                    "Kolumbia",
                                    "Kong\u00F3i Demokratikus K\u00F6zt\u00E1rsas\u00E1g",
                                    "Kong\u00F3i K\u00F6zt\u00E1rsas\u00E1g",
                                    "Kuba",
                                    "Kuvait",
                                    "K\u00EDna",
                                    "K\u00F6z\u00E9p-Afrika",
                                    "Laosz",
                                    "Lengyelorsz\u00E1g",
                                    "Lesotho",
                                    "Lettorsz\u00E1g",
                                    "Libanon",
                                    "Lib\u00E9ria",
                                    "Liechtenstein",
                                    "Litv\u00E1nia",
                                    "Luxemburg",
                                    "L\u00EDbia",
                                    "Maced\u00F3nia",
                                    "Madagaszk\u00E1r",
                                    "Magyarorsz\u00E1g",
                                    "Malawi",
                                    "Mald\u00EDv-szigetek",
                                    "Mali",
                                    "Mal\u00E1jzia",
                                    "Marokk\u00F3",
                                    "Marshall-szigetek",
                                    "Maurit\u00E1nia",
                                    "Mexik\u00F3",
                                    "Mikron\u00E9zia",
                                    "Moldova",
                                    "Monaco",
                                    "Mong\u00F3lia",
                                    "Montenegr\u00F3",
                                    "Mozambik",
                                    "M\u00E1lta",
                                    "Nam\u00EDbia",
                                    "Nauru",
                                    "Nep\u00E1l",
                                    "Nicaragua",
                                    "Niger",
                                    "Nig\u00E9ria",
                                    "Norv\u00E9gia",
                                    "N\u00E9metorsz\u00E1g",
                                    "Olaszorsz\u00E1g",
                                    "Om\u00E1n",
                                    "Oroszorsz\u00E1g",
                                    "Pakiszt\u00E1n",
                                    "Palau",
                                    "Panama",
                                    "Paraguay",
                                    "Peru",
                                    "Portug\u00E1lia",
                                    "P\u00E1pua \u00DAj-Guinea",
                                    "Rom\u00E1nia",
                                    "Ruanda",
                                    "Saint Kitts \u00E9s Nevis",
                                    "Saint Vincent",
                                    "Salamon-szigetek",
                                    "Salvador",
                                    "San Marino",
                                    "Seychelle-szigetek",
                                    "Spanyolorsz\u00E1g",
                                    "Sr\u00ED Lanka",
                                    "Suriname",
                                    "Sv\u00E1jc",
                                    "Sv\u00E9dorsz\u00E1g",
                                    "Szamoa",
                                    "Sza\u00FAd-Ar\u00E1bia",
                                    "Szeneg\u00E1l",
                                    "Szerbia",
                                    "Szingap\u00FAr",
                                    "Szlov\u00E1kia",
                                    "Szlov\u00E9nia",
                                    "Szom\u00E1lia",
                                    "Szud\u00E1n",
                                    "Szv\u00E1zif\u00F6ld",
                                    "Sz\u00EDria",
                                    "S\u00E3o Tom\u00E9 \u00E9s Pr\u00EDncipe",
                                    "Tadzsikiszt\u00E1n",
                                    "Tanz\u00E1nia",
                                    "Thaif\u00F6ld",
                                    "Togo",
                                    "Tonga",
                                    "Trinidad \u00E9s Tobago",
                                    "Tun\u00E9zia",
                                    "Tuvalu",
                                    "T\u00F6r\u00F6korsz\u00E1g",
                                    "T\u00FCrkmeniszt\u00E1n",
                                    "Uganda",
                                    "Ukrajna",
                                    "Uruguay",
                                    "Vanuatu",
                                    "Venezuela",
                                    "Vietn\u00E1m",
                                    "Zambia",
                                    "Zimbabwe",
                                    "Z\u00F6ld-foki-szigetek",
                                    "\u00C9szak-Korea",
                                    "\u00C9sztorsz\u00E1g",
                                    "\u00CDrorsz\u00E1g",
                                    "\u00D6rm\u00E9nyorsz\u00E1g",
                                    "\u00DAj-Z\u00E9land",
                                    "\u00DCzbegiszt\u00E1n");
                        });

        public Object capitals = ZVal.arrayFromList("Budapest");

        public Object bigCities =
                ZVal.arrayFromList(
                        "\n        B\u00E9k\u00E9scsaba",
                        "Debrecen",
                        "Duna\u00FAjv\u00E1ros",
                        "Eger",
                        "\u00C9rd",
                        "Gy\u0151r",
                        "H\u00F3dmez\u0151v\u00E1s\u00E1rhely",
                        "Kaposv\u00E1r",
                        "Kecskem\u00E9t",
                        "Miskolc",
                        "Nagykanizsa",
                        "Ny\u00EDregyh\u00E1za",
                        "P\u00E9cs",
                        "Salg\u00F3tarj\u00E1n",
                        "Sopron",
                        "Szeged",
                        "Sz\u00E9kesfeh\u00E9rv\u00E1r",
                        "Szeksz\u00E1rd",
                        "Szolnok",
                        "Szombathely",
                        "Tatab\u00E1nya",
                        "Veszpr\u00E9m",
                        "Zalaegerszeg");

        public Object smallerCities =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Ajka",
                                    "Asz\u00F3d",
                                    "B\u00E1csalm\u00E1s",
                                    "Baja",
                                    "Baktal\u00F3r\u00E1nth\u00E1za",
                                    "Balassagyarmat",
                                    "Balatonalm\u00E1di",
                                    "Balatonf\u00FCred",
                                    "Balmaz\u00FAjv\u00E1ros",
                                    "Barcs",
                                    "B\u00E1tonyterenye",
                                    "B\u00E9k\u00E9s",
                                    "B\u00E9lap\u00E1tfalva",
                                    "Beretty\u00F3\u00FAjfalu",
                                    "Bicske",
                                    "B\u00F3ly",
                                    "Bonyh\u00E1d",
                                    "Budakeszi",
                                    "Cegl\u00E9d",
                                    "Celld\u00F6m\u00F6lk",
                                    "Cig\u00E1nd",
                                    "Csenger",
                                    "Csongr\u00E1d",
                                    "Csorna",
                                    "Csurg\u00F3",
                                    "Dabas",
                                    "Derecske",
                                    "Devecser",
                                    "Domb\u00F3v\u00E1r",
                                    "Dunakeszi",
                                    "Edel\u00E9ny",
                                    "Encs",
                                    "Enying",
                                    "Esztergom",
                                    "Feh\u00E9rgyarmat",
                                    "Fony\u00F3d",
                                    "F\u00FCzesabony",
                                    "G\u00E1rdony",
                                    "G\u00F6d\u00F6ll\u0151",
                                    "G\u00F6nc",
                                    "Gy\u00E1l",
                                    "Gyomaendr\u0151d",
                                    "Gy\u00F6ngy\u00F6s",
                                    "Gyula",
                                    "Hajd\u00FAb\u00F6sz\u00F6rm\u00E9ny",
                                    "Hajd\u00FAhadh\u00E1z",
                                    "Hajd\u00FAn\u00E1n\u00E1s",
                                    "Hajd\u00FAszoboszl\u00F3",
                                    "Hatvan",
                                    "Heves",
                                    "Ibr\u00E1ny",
                                    "J\u00E1noshalma",
                                    "J\u00E1szap\u00E1ti",
                                    "J\u00E1szber\u00E9ny",
                                    "Kalocsa",
                                    "Kapuv\u00E1r",
                                    "Karcag",
                                    "Kazincbarcika",
                                    "Kemecse",
                                    "Keszthely",
                                    "Kisb\u00E9r",
                                    "Kisk\u0151r\u00F6s",
                                    "Kiskunf\u00E9legyh\u00E1za",
                                    "Kiskunhalas",
                                    "Kiskunmajsa",
                                    "Kistelek",
                                    "Kisv\u00E1rda",
                                    "Kom\u00E1rom",
                                    "Koml\u00F3",
                                    "K\u00F6rmend",
                                    "K\u0151szeg",
                                    "Kunhegyes",
                                    "Kunszentm\u00E1rton",
                                    "Kunszentmikl\u00F3s",
                                    "Lenti",
                                    "Letenye",
                                    "Mak\u00F3",
                                    "Marcali",
                                    "Martonv\u00E1s\u00E1r",
                                    "M\u00E1t\u00E9szalka",
                                    "Mez\u0151cs\u00E1t",
                                    "Mez\u0151kov\u00E1csh\u00E1za",
                                    "Mez\u0151k\u00F6vesd",
                                    "Mez\u0151t\u00FAr",
                                    "Moh\u00E1cs",
                                    "Monor",
                                    "M\u00F3r",
                                    "M\u00F3rahalom",
                                    "Mosonmagyar\u00F3v\u00E1r",
                                    "Nagyat\u00E1d",
                                    "Nagyk\u00E1ll\u00F3",
                                    "Nagyk\u00E1ta",
                                    "Nagyk\u0151r\u00F6s",
                                    "Ny\u00EDradony",
                                    "Ny\u00EDrb\u00E1tor",
                                    "Orosh\u00E1za",
                                    "Oroszl\u00E1ny",
                                    "\u00D3zd",
                                    "Paks",
                                    "Pannonhalma",
                                    "P\u00E1pa",
                                    "P\u00E1szt\u00F3",
                                    "P\u00E9csv\u00E1rad",
                                    "P\u00E9terv\u00E1s\u00E1ra",
                                    "Pilisv\u00F6r\u00F6sv\u00E1r",
                                    "Polg\u00E1rdi",
                                    "P\u00FCsp\u00F6klad\u00E1ny",
                                    "Putnok",
                                    "R\u00E1ckeve",
                                    "R\u00E9ts\u00E1g",
                                    "S\u00E1rbog\u00E1rd",
                                    "Sarkad",
                                    "S\u00E1rospatak",
                                    "S\u00E1rv\u00E1r",
                                    "S\u00E1sd",
                                    "S\u00E1toralja\u00FAjhely",
                                    "Sellye",
                                    "Sikl\u00F3s",
                                    "Si\u00F3fok",
                                    "S\u00FCmeg",
                                    "Szarvas",
                                    "Sz\u00E9cs\u00E9ny",
                                    "Szeghalom",
                                    "Szentendre",
                                    "Szentes",
                                    "Szentgotth\u00E1rd",
                                    "Szentl\u0151rinc",
                                    "Szerencs",
                                    "Szigetszentmikl\u00F3s",
                                    "Szigetv\u00E1r",
                                    "Sziksz\u00F3",
                                    "Szob",
                                    "Tab",
                                    "Tam\u00E1si",
                                    "Tapolca",
                                    "Tata",
                                    "T\u00E9t",
                                    "Tiszaf\u00FCred",
                                    "Tiszak\u00E9cske",
                                    "Tisza\u00FAjv\u00E1ros",
                                    "Tiszavasv\u00E1ri",
                                    "Tokaj",
                                    "Tolna",
                                    "T\u00F6r\u00F6kszentmikl\u00F3s",
                                    "V\u00E1c",
                                    "V\u00E1rpalota",
                                    "V\u00E1s\u00E1rosnam\u00E9ny",
                                    "Vasv\u00E1r",
                                    "Vecs\u00E9s",
                                    "Z\u00E1hony",
                                    "Zalaszentgr\u00F3t",
                                    "Zirc");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\hu_HU\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "bigCities",
                            "buildingNumber",
                            "capitals",
                            "cityFormats",
                            "country",
                            "postcode",
                            "secondaryAddressFormats",
                            "smallerCities",
                            "state",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetSuffix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/hu_HU/Address.php")
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
