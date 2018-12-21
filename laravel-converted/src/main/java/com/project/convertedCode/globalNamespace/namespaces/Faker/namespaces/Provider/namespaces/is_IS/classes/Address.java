package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.is_IS.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/is_IS/Address.php

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

    public static final Object CONST_class = "Faker\\Provider\\is_IS\\Address";

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
                                                            .is_IS
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .cityNames)
                            .value());
        }

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
                                                            .is_IS
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .streetPrefix)
                            .value());
        }

        @ConvertedMethod
        public Object buildingNumber(RuntimeEnv env, Object... args) {
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
                                                                                            .is_IS
                                                                                            .classes
                                                                                            .Address
                                                                                            .RequestStaticProperties
                                                                                            .class)
                                                                            .buildingNumber)
                                                            .value())
                                            .value())
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
                                                            .is_IS
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .regionNames)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Afganistan",
                                    "Alban\u00EDa",
                                    "Als\u00EDr",
                                    "Andorra",
                                    "Ang\u00F3la",
                                    "Angvilla",
                                    "Ant\u00EDgva og Barb\u00FAda",
                                    "Argent\u00EDna",
                                    "Armen\u00EDa",
                                    "Ar\u00FAba",
                                    "Aserba\u00EDdsjan",
                                    "Austur-Kong\u00F3",
                                    "Austurr\u00EDki",
                                    "Austur-T\u00EDmor",
                                    "\u00C1landseyjar",
                                    "\u00C1stral\u00EDa",
                                    "Bahamaeyjar",
                                    "Bandar\u00EDkin",
                                    "Bandar\u00EDska Sam\u00F3a",
                                    "Bangladess",
                                    "Barbados",
                                    "Barein",
                                    "Belg\u00EDa",
                                    "Bel\u00EDs",
                                    "Ben\u00EDn",
                                    "Berm\u00FAdaeyjar",
                                    "Bosn\u00EDa og Herseg\u00F3v\u00EDna",
                                    "Botsvana",
                                    "Bouvet-eyja",
                                    "B\u00F3liv\u00EDa",
                                    "Brasil\u00EDa",
                                    "Bresku Indlandshafseyjar",
                                    "Bretland",
                                    "Br\u00FAnei",
                                    "B\u00FAlgar\u00EDa",
                                    "B\u00FArk\u00EDna Fas\u00F3",
                                    "B\u00FAr\u00FAnd\u00ED",
                                    "B\u00FAtan",
                                    "Cayman-eyjar",
                                    "Chile",
                                    "Cooks-eyjar",
                                    "Danm\u00F6rk",
                                    "Dj\u00EDb\u00FAt\u00ED",
                                    "D\u00F3min\u00EDka",
                                    "D\u00F3min\u00EDska l\u00FD\u00F0veldi\u00F0",
                                    "Egyptaland",
                                    "Eistland",
                                    "Ekvador",
                                    "El Salvador",
                                    "England",
                                    "Er\u00EDtrea",
                                    "E\u00FE\u00ED\u00F3p\u00EDa",
                                    "Falklandseyjar",
                                    "Filippseyjar",
                                    "Finnland",
                                    "F\u00EDdjieyjar",
                                    "F\u00EDlabeinsstr\u00F6ndin",
                                    "Frakkland",
                                    "Franska Gv\u00E6jana",
                                    "Franska P\u00F3l\u00FDnes\u00EDa",
                                    "Fr\u00F6nsku su\u00F0l\u00E6gu landsv\u00E6\u00F0in",
                                    "F\u00E6reyjar",
                                    "Gabon",
                                    "Gamb\u00EDa",
                                    "Gana",
                                    "Georg\u00EDa",
                                    "G\u00EDbraltar",
                                    "G\u00EDnea",
                                    "G\u00EDnea-Biss\u00E1",
                                    "Grenada",
                                    "Grikkland",
                                    "Gr\u00E6nh\u00F6f\u00F0aeyjar",
                                    "Gr\u00E6nland",
                                    "Gvadel\u00FApeyjar",
                                    "Gvam",
                                    "Gvatemala",
                                    "Gv\u00E6jana",
                                    "Ha\u00EDt\u00ED",
                                    "Heard og McDonalds-eyjar",
                                    "Holland",
                                    "Hollensku Antillur",
                                    "Hond\u00FAras",
                                    "Hong Kong",
                                    "Hv\u00EDta-R\u00FAssland",
                                    "Indland",
                                    "Ind\u00F3nes\u00EDa",
                                    "\u00CDrak",
                                    "\u00CDran",
                                    "\u00CDrland",
                                    "\u00CDsland",
                                    "\u00CDsrael",
                                    "\u00CDtal\u00EDa",
                                    "Jama\u00EDka",
                                    "Japan",
                                    "Jemen",
                                    "J\u00F3laey",
                                    "J\u00F3mfr\u00FAaeyjar",
                                    "J\u00F3rdan\u00EDa",
                                    "Kamb\u00F3d\u00EDa",
                                    "Kamer\u00FAn",
                                    "Kanada",
                                    "Kasakstan",
                                    "Katar",
                                    "Ken\u00EDa",
                                    "Kirgisistan",
                                    "K\u00EDna",
                                    "K\u00EDribat\u00ED",
                                    "Kong\u00F3",
                                    "Austur-Kong\u00F3",
                                    "Vestur-Kong\u00F3",
                                    "Kostar\u00EDka",
                                    "K\u00F3koseyjar",
                                    "K\u00F3lumb\u00EDa",
                                    "K\u00F3moreyjar",
                                    "K\u00F3rea",
                                    "Nor\u00F0ur-K\u00F3rea;",
                                    "Su\u00F0ur-K\u00F3rea",
                                    "Kr\u00F3at\u00EDa",
                                    "K\u00FAba",
                                    "K\u00FAveit",
                                    "K\u00FDpur",
                                    "Laos",
                                    "Les\u00F3t\u00F3",
                                    "Lettland",
                                    "Liechtenstein",
                                    "Lith\u00E1en",
                                    "L\u00EDbanon",
                                    "L\u00EDber\u00EDa",
                                    "L\u00EDb\u00EDa",
                                    "L\u00FAxemborg",
                                    "Madagaskar",
                                    "Maka\u00F3",
                                    "Maked\u00F3n\u00EDa",
                                    "Malas\u00EDa",
                                    "Malav\u00ED",
                                    "Mald\u00EDveyjar",
                                    "Mal\u00ED",
                                    "Malta",
                                    "Marokk\u00F3",
                                    "Marshall-eyjar",
                                    "Martin\u00EDk",
                                    "Mayotte",
                                    "M\u00E1ritan\u00EDa",
                                    "M\u00E1rit\u00EDus",
                                    "Mex\u00EDk\u00F3",
                                    "Mi\u00F0-Afr\u00EDkul\u00FD\u00F0veldi\u00F0",
                                    "Mi\u00F0baugs-G\u00EDnea",
                                    "M\u00EDkr\u00F3nes\u00EDa",
                                    "Mjanmar",
                                    "Mold\u00F3va",
                                    "Mong\u00F3l\u00EDa",
                                    "Montserrat",
                                    "M\u00F3nak\u00F3",
                                    "M\u00F3samb\u00EDk",
                                    "Namib\u00EDa",
                                    "N\u00E1r\u00FA",
                                    "Nepal",
                                    "Niue",
                                    "N\u00EDger",
                                    "N\u00EDger\u00EDa",
                                    "N\u00EDkaragva",
                                    "Nor\u00F0ur-\u00CDrland",
                                    "Nor\u00F0ur-K\u00F3rea",
                                    "Nor\u00F0ur-Mar\u00EDanaeyjar",
                                    "Noregur",
                                    "Norfolkeyja",
                                    "N\u00FDja-Kaled\u00F3n\u00EDa",
                                    "N\u00FDja-Sj\u00E1land",
                                    "\u00D3man",
                                    "Pakistan",
                                    "Pal\u00E1",
                                    "Palest\u00EDna",
                                    "Panama",
                                    "Pap\u00FAa N\u00FDja-G\u00EDnea",
                                    "Paragv\u00E6",
                                    "P\u00E1fagar\u00F0ur",
                                    "Per\u00FA",
                                    "Pitcairn",
                                    "Port\u00FAgal",
                                    "P\u00F3lland",
                                    "P\u00FAert\u00F3 R\u00EDk\u00F3",
                                    "R\u00E9union",
                                    "R\u00FAanda",
                                    "R\u00FAmen\u00EDa",
                                    "R\u00FAssland",
                                    "Sal\u00F3monseyjar",
                                    "Samb\u00EDa",
                                    "Sameinu\u00F0u arab\u00EDsku furstad\u00E6min",
                                    "Sam\u00F3a",
                                    "San Mar\u00EDn\u00F3",
                                    "Sankti Helena",
                                    "Sankti Krist\u00F3fer og Nevis",
                                    "Sankti L\u00FAs\u00EDa",
                                    "Sankti Pierre og Miquelon",
                                    "Sankti Vinsent og Grenad\u00EDneyjar",
                                    "Sa\u00F3 T\u00F3me og Prins\u00EDpe",
                                    "S\u00E1di-Arab\u00EDa",
                                    "Senegal",
                                    "Serb\u00EDa",
                                    "Seychelles-eyjar",
                                    "Simbabve",
                                    "Singap\u00FAr",
                                    "S\u00EDerra Le\u00F3ne",
                                    "Skotland",
                                    "Sl\u00F3vak\u00EDa",
                                    "Sl\u00F3ven\u00EDa",
                                    "Sm\u00E1eyjar Bandar\u00EDkjanna",
                                    "S\u00F3mal\u00EDa",
                                    "Sp\u00E1nn",
                                    "Sr\u00ED Lanka",
                                    "Su\u00F0ur-Afr\u00EDka",
                                    "Su\u00F0ur-Georg\u00EDa og Su\u00F0ur-Sandv\u00EDkureyjar",
                                    "Su\u00F0ur-K\u00F3rea",
                                    "Su\u00F0urskautslandi\u00F0",
                                    "S\u00FAdan",
                                    "S\u00FAr\u00EDnam",
                                    "Jan Mayen",
                                    "Svartfjallaland",
                                    "Svas\u00EDland",
                                    "Sviss",
                                    "Sv\u00ED\u00FEj\u00F3\u00F0",
                                    "S\u00FDrland",
                                    "Tadsjikistan",
                                    "Ta\u00EDland",
                                    "Ta\u00EDvan",
                                    "Tansan\u00EDa",
                                    "T\u00E9kkland",
                                    "Tonga",
                                    "T\u00F3g\u00F3",
                                    "T\u00F3kel\u00E1",
                                    "Tr\u00EDnidad og T\u00F3bag\u00F3",
                                    "Tsjad",
                                    "Tsjetsjen\u00EDa",
                                    "Turks- og Caicos-eyjar",
                                    "T\u00FAnis",
                                    "T\u00FArkmenistan",
                                    "T\u00FAval\u00FA",
                                    "Tyrkland",
                                    "Ungverjaland",
                                    "\u00DAganda",
                                    "\u00DAkra\u00EDna",
                                    "\u00DAr\u00FAgv\u00E6",
                                    "\u00DAsbekistan",
                                    "Van\u00FAat\u00FA",
                                    "Venes\u00FAela",
                                    "Vestur-Kong\u00F3",
                                    "Vestur-Sahara",
                                    "V\u00EDetnam",
                                    "Wales",
                                    "Wallis- og F\u00FAt\u00FAnaeyjar",
                                    "\u00DE\u00FDskaland");
                        });

        public Object cityNames =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Reykjav\u00EDk",
                                    "Seltjarnarnes",
                                    "Vogar",
                                    "K\u00F3pavogur",
                                    "Gar\u00F0ab\u00E6r",
                                    "Hafnarfj\u00F6r\u00F0ur",
                                    "Reykjanesb\u00E6r",
                                    "Grindav\u00EDk",
                                    "Sandger\u00F0i",
                                    "Gar\u00F0ur",
                                    "Reykjanesb\u00E6r",
                                    "Mosfellsb\u00E6r",
                                    "Akranes",
                                    "Borgarnes",
                                    "Reykholt",
                                    "Stykkish\u00F3lmur",
                                    "Flatey",
                                    "Grundarfj\u00F6r\u00F0ur",
                                    "\u00D3lafsv\u00EDk",
                                    "Sn\u00E6fellsb\u00E6r",
                                    "Hellissandur",
                                    "B\u00FA\u00F0ardalur",
                                    "Reykh\u00F3lahreppur",
                                    "\u00CDsafj\u00F6r\u00F0ur",
                                    "Hn\u00EDfsdalur",
                                    "Bolungarv\u00EDk",
                                    "S\u00FA\u00F0av\u00EDk",
                                    "Flateyri",
                                    "Su\u00F0ureyri",
                                    "Patreksfj\u00F6r\u00F0ur",
                                    "T\u00E1lknafj\u00F6r\u00F0ur",
                                    "B\u00EDldudalur",
                                    "\u00DEingeyri",
                                    "Sta\u00F0ur",
                                    "H\u00F3lmav\u00EDk",
                                    "Drangsnes",
                                    "\u00C1rneshreppur",
                                    "Hvammstangi",
                                    "Bl\u00F6ndu\u00F3s",
                                    "Skagastr\u00F6nd",
                                    "Sau\u00F0\u00E1rkr\u00F3kur",
                                    "Varmahl\u00ED\u00F0",
                                    "Hofs\u00F3s",
                                    "Flj\u00F3t",
                                    "Siglufj\u00F6r\u00F0ur",
                                    "Akureyri",
                                    "Greniv\u00EDk",
                                    "Gr\u00EDmsey",
                                    "Dalv\u00EDk",
                                    "\u00D3lafsfj\u00F6r\u00F0ur",
                                    "Hr\u00EDsey",
                                    "H\u00FAsav\u00EDk",
                                    "Fossh\u00F3ll",
                                    "Laugar",
                                    "M\u00FDvatn",
                                    "K\u00F3pasker",
                                    "Raufarh\u00F6fn",
                                    "\u00DE\u00F3rsh\u00F6fn",
                                    "Bakkafj\u00F6r\u00F0ur",
                                    "Vopnafj\u00F6r\u00F0ur",
                                    "Egilssta\u00F0ir",
                                    "Sey\u00F0isfj\u00F6r\u00F0ur",
                                    "Mj\u00F3ifj\u00F6r\u00F0ur",
                                    "Borgarfj\u00F6r\u00F0ur",
                                    "Rey\u00F0arfj\u00F6r\u00F0ur",
                                    "Eskifj\u00F6r\u00F0ur",
                                    "Neskaupsta\u00F0ur",
                                    "F\u00E1skr\u00FA\u00F0sfj\u00F6r\u00F0ur",
                                    "St\u00F6\u00F0varfj\u00F6r\u00F0ur",
                                    "Brei\u00F0dalsv\u00EDk",
                                    "Dj\u00FApivogur",
                                    "H\u00F6fn",
                                    "Selfoss",
                                    "Hverager\u00F0i",
                                    "\u00DEorl\u00E1ksh\u00F6fn",
                                    "\u00D6lfus",
                                    "Eyrarbakki",
                                    "Stokkseyri",
                                    "Laugarvatn",
                                    "Fl\u00FA\u00F0ir",
                                    "Hella",
                                    "Hvolsv\u00F6llur",
                                    "V\u00EDk",
                                    "Kirkjub\u00E6jarklaustur",
                                    "Vestmannaeyjar");
                        });

        public Object streetSuffix =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u00E1s",
                                    "bakki",
                                    "braut",
                                    "b\u00E6r",
                                    "br\u00FAn",
                                    "berg",
                                    "fold",
                                    "gata",
                                    "gr\u00F3f",
                                    "gar\u00F0ar",
                                    "h\u00F6f\u00F0i",
                                    "heimar",
                                    "hamar",
                                    "h\u00F3lar",
                                    "h\u00E1ls",
                                    "kv\u00EDsl",
                                    "l\u00E6kur",
                                    "leiti",
                                    "land",
                                    "m\u00FAli",
                                    "nes",
                                    "rimi",
                                    "st\u00EDgur",
                                    "str\u00E6ti",
                                    "stekkur",
                                    "sl\u00F3\u00F0",
                                    "sk\u00F3gar",
                                    "sel",
                                    "teigur",
                                    "t\u00FAn",
                                    "vangur",
                                    "vegur",
                                    "vogur",
                                    "va\u00F0");
                        });

        public Object streetPrefix =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "A\u00F0al",
                                    "Austur",
                                    "Bakka",
                                    "Braga",
                                    "B\u00E1ru",
                                    "Brunn",
                                    "Fiski",
                                    "Leifs",
                                    "T\u00FDs",
                                    "Birki",
                                    "Su\u00F0ur",
                                    "Nor\u00F0ur",
                                    "Vestur",
                                    "Austur",
                                    "Sanda",
                                    "Sk\u00F3gar",
                                    "St\u00F3r",
                                    "Sunnu",
                                    "Tungu",
                                    "Tangar",
                                    "\u00DAlfarfells",
                                    "Vagn",
                                    "Vind",
                                    "Ysti",
                                    "\u00DEing",
                                    "Hamra",
                                    "H\u00F3la",
                                    "Kr\u00EDu",
                                    "I\u00F0u",
                                    "Sp\u00F3a",
                                    "Starra",
                                    "Uglu",
                                    "Vals");
                        });

        public Object postcode = ZVal.arrayFromList("%##");

        public Object regionNames =
                ZVal.arrayFromList(
                        "H\u00F6fu\u00F0borgarsv\u00E6\u00F0i\u00F0",
                        "Nor\u00F0urland",
                        "Su\u00F0urland",
                        "Vesturland",
                        "Vestfir\u00F0ir",
                        "Austurland",
                        "Su\u00F0urnes");

        public Object buildingNumber =
                ZVal.arrayFromList("%##", "%#", "%#", "%", "%", "%", "%?", "% ?");

        public Object cityFormats = ZVal.arrayFromList("{{cityName}}");

        public Object streetNameFormats =
                ZVal.arrayFromList(
                        "{{streetPrefix}}{{streetSuffix}}",
                        "{{streetPrefix}}{{streetSuffix}}",
                        "{{firstNameMale}}{{streetSuffix}}",
                        "{{firstNameFemale}}{{streetSuffix}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList("{{streetName}} {{buildingNumber}}");

        public Object addressFormats =
                ZVal.arrayFromList("{{streetAddress}}\n{{postcode}} {{city}}");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\is_IS\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "buildingNumber",
                            "cityFormats",
                            "cityNames",
                            "country",
                            "postcode",
                            "regionNames",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetPrefix",
                            "streetSuffix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/is_IS/Address.php")
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
