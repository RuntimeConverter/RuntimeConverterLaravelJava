package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.fr_CH.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_key;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_current;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/fr_CH/Address.php

*/

public class Address
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .namespaces
                .fr_FR
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
                                                                .fr_CH
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
                                                        .fr_CH
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .cityNames)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\fr_CH\\Address";

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
                    .namespaces
                    .fr_FR
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
                                                            .fr_CH
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .streetPrefix)
                            .value());
        }

        @ConvertedMethod
        public Object canton(RuntimeEnv env, Object... args) {
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
                                                            .fr_CH
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .canton)
                            .value());
        }

        @ConvertedMethod
        public Object cantonShort(RuntimeEnv env, Object... args) {
            Object canton = null;
            canton =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("canton")
                            .call()
                            .value();
            return ZVal.assign(function_key.f.env(env).call(canton).value());
        }

        @ConvertedMethod
        public Object cantonName(RuntimeEnv env, Object... args) {
            Object canton = null;
            canton =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("canton")
                            .call()
                            .value();
            return ZVal.assign(function_current.f.env(env).call(canton).value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object buildingNumber = ZVal.arrayFromList("###", "##", "#", "#a", "#b", "#c");

        public Object streetPrefix =
                ZVal.arrayFromList(
                        "Rue", "Rue", "Chemin", "Avenue", "Boulevard", "Place", "Impasse");

        public Object postcode = ZVal.arrayFromList("####");

        public Object cityNames =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Aarau",
                                    "Aarberg",
                                    "Aarburg",
                                    "Agno",
                                    "Aigle VD",
                                    "Altdorf",
                                    "Altst\u00E4tten",
                                    "Appenzell",
                                    "Arbon",
                                    "Ascona",
                                    "Aubonne",
                                    "Avenches",
                                    "Baden",
                                    "Bad Zurzach",
                                    "B\u00E2le",
                                    "Bellinzone",
                                    "Berne",
                                    "Berom\u00FCnster",
                                    "Berthoud",
                                    "Biasca",
                                    "Bienne",
                                    "Bischofszell",
                                    "Boudry",
                                    "Bourg-Saint-Pierre",
                                    "Bremgarten AG",
                                    "Brigue",
                                    "Brugg",
                                    "Bulle",
                                    "B\u00FClach",
                                    "Cerlier",
                                    "Ch\u00E2tel-Saint-Denis",
                                    "Coire",
                                    "Conthey",
                                    "Coppet",
                                    "Cossonay",
                                    "Croglio",
                                    "Cudrefin",
                                    "Cully",
                                    "Del\u00E9mont",
                                    "Diessenhofen",
                                    "\u00C9challens",
                                    "Eglisau",
                                    "Elgg",
                                    "Estavayer-le-Lac",
                                    "Frauenfeld",
                                    "Fribourg",
                                    "Gen\u00E8ve",
                                    "Glaris",
                                    "Gordola",
                                    "Grandcour",
                                    "Grandson",
                                    "Greifensee",
                                    "Gr\u00FCningen",
                                    "Gruy\u00E8res",
                                    "Hermance",
                                    "Huttwil",
                                    "Ilanz",
                                    "Kaiserstuhl",
                                    "Klingnau",
                                    "La Chaux-de-Fonds",
                                    "La Neuveville",
                                    "La Sarraz",
                                    "La Tour-de-Peilz",
                                    "La Tour-de-Tr\u00EAme",
                                    "Le Landeron",
                                    "Les Cl\u00E9es",
                                    "Lachen",
                                    "Langenthal",
                                    "Laufon",
                                    "Laufenburg",
                                    "Laupen",
                                    "Lausanne",
                                    "Lenzburg",
                                    "Lo\u00E8che",
                                    "Lichtensteig",
                                    "Liestal",
                                    "Locarno",
                                    "Losone",
                                    "Lugano",
                                    "Lutry",
                                    "Lucerne",
                                    "Maienfeld",
                                    "Martigny",
                                    "Mellingen",
                                    "Mendrisio",
                                    "Monthey",
                                    "Morat",
                                    "Morcote",
                                    "Morges",
                                    "Moudon",
                                    "Moutier",
                                    "M\u00FCnchenstein",
                                    "Neuch\u00E2tel",
                                    "Neunkirch",
                                    "Nidau",
                                    "Nyon",
                                    "Olten",
                                    "Orbe",
                                    "Orsi\u00E8res",
                                    "Payerne",
                                    "Porrentruy",
                                    "Rapperswil",
                                    "Regensberg",
                                    "Rheinau",
                                    "Rheineck",
                                    "Rheinfelden",
                                    "Riva San Vitale",
                                    "Rolle",
                                    "Romainm\u00F4tier",
                                    "Romont FR",
                                    "Rorschach",
                                    "Rue",
                                    "Saillon",
                                    "Saint-Maurice",
                                    "Saint-Prex",
                                    "Saint-Ursanne",
                                    "Sala",
                                    "Saint-Gall",
                                    "Sargans",
                                    "Sarnen",
                                    "Schaffhouse",
                                    "Schwytz",
                                    "Sembrancher",
                                    "Sempach",
                                    "Sion",
                                    "Soleure",
                                    "Spl\u00FCgen",
                                    "Stans",
                                    "Steckborn",
                                    "Stein am Rhein",
                                    "Sursee",
                                    "Thoune",
                                    "Thusis",
                                    "Unterseen",
                                    "Uznach",
                                    "Valangin",
                                    "Vevey",
                                    "Villeneuve",
                                    "Vi\u00E8ge",
                                    "Waldenburg",
                                    "Walenstadt",
                                    "Wangen an der Aare",
                                    "Werdenberg",
                                    "Wiedlisbach",
                                    "Wil",
                                    "Willisau",
                                    "Winterthour",
                                    "Yverdon-les-Bains",
                                    "Zofingue",
                                    "Zoug",
                                    "Zurich");
                        });

        public Object canton =
                ZVal.newArray(
                        new ZPair(0, ZVal.newArray(new ZPair("AG", "Argovie"))),
                        new ZPair(
                                1,
                                ZVal.newArray(
                                        new ZPair("AI", "Appenzell Rhodes-Int\u00E9rieures"))),
                        new ZPair(
                                2,
                                ZVal.newArray(
                                        new ZPair("AR", "Appenzell Rhodes-Ext\u00E9rieures"))),
                        new ZPair(3, ZVal.newArray(new ZPair("BE", "Berne"))),
                        new ZPair(4, ZVal.newArray(new ZPair("BL", "B\u00E2le-Campagne"))),
                        new ZPair(5, ZVal.newArray(new ZPair("BS", "B\u00E2le-Ville"))),
                        new ZPair(6, ZVal.newArray(new ZPair("FR", "Fribourg"))),
                        new ZPair(7, ZVal.newArray(new ZPair("GE", "Gen\u00E8ve"))),
                        new ZPair(8, ZVal.newArray(new ZPair("GL", "Glaris"))),
                        new ZPair(9, ZVal.newArray(new ZPair("GR", "Grisons"))),
                        new ZPair(10, ZVal.newArray(new ZPair("JU", "Jura"))),
                        new ZPair(11, ZVal.newArray(new ZPair("LU", "Lucerne"))),
                        new ZPair(12, ZVal.newArray(new ZPair("NE", "Neuch\u00E2tel"))),
                        new ZPair(13, ZVal.newArray(new ZPair("NW", "Nidwald"))),
                        new ZPair(14, ZVal.newArray(new ZPair("OW", "Obwald"))),
                        new ZPair(15, ZVal.newArray(new ZPair("SG", "Saint-Gall"))),
                        new ZPair(16, ZVal.newArray(new ZPair("SH", "Schaffhouse"))),
                        new ZPair(17, ZVal.newArray(new ZPair("SO", "Soleure"))),
                        new ZPair(18, ZVal.newArray(new ZPair("SZ", "Schwytz"))),
                        new ZPair(19, ZVal.newArray(new ZPair("TG", "Thurgovie"))),
                        new ZPair(20, ZVal.newArray(new ZPair("TI", "Tessin"))),
                        new ZPair(21, ZVal.newArray(new ZPair("UR", "Uri"))),
                        new ZPair(22, ZVal.newArray(new ZPair("VD", "Vaud"))),
                        new ZPair(23, ZVal.newArray(new ZPair("VS", "Valais"))),
                        new ZPair(24, ZVal.newArray(new ZPair("ZG", "Zoug"))),
                        new ZPair(25, ZVal.newArray(new ZPair("ZH", "Zurich"))));

        public Object cityFormats = ZVal.arrayFromList("{{cityName}}");

        public Object streetNameFormats =
                ZVal.arrayFromList(
                        "{{streetPrefix}} {{lastName}}",
                        "{{streetPrefix}} de {{cityName}}",
                        "{{streetPrefix}} de {{lastName}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList("{{streetName}} {{buildingNumber}}");

        public Object addressFormats =
                ZVal.arrayFromList("{{streetAddress}}\n{{postcode}} {{city}}");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\fr_CH\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "buildingNumber",
                            "canton",
                            "cityFormats",
                            "cityNames",
                            "postcode",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetPrefix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/fr_CH/Address.php")
                    .addExtendsClass("Faker\\Provider\\fr_FR\\Address")
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
