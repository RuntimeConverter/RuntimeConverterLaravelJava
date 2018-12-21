package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.fr_BE.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/fr_BE/Address.php

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
                                                                .fr_BE
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
                                                        .fr_BE
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .cityNames)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\fr_BE\\Address";

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
        public Object province(RuntimeEnv env, Object... args) {
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
                                                            .fr_BE
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .province)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object postcode = ZVal.arrayFromList("####");

        public Object streetAddressFormats =
                ZVal.arrayFromList("{{streetName}} {{buildingNumber}}");

        public Object streetNameFormats = ZVal.arrayFromList("{{streetSuffix}} {{lastName}}");

        public Object cityFormats = ZVal.arrayFromList("{{cityName}}");

        public Object addressFormats =
                ZVal.arrayFromList("{{streetAddress}}\n {{postcode}} {{city}}");

        public Object streetSuffix =
                ZVal.arrayFromList(
                        "rue",
                        "avenue",
                        "boulevard",
                        "chemin",
                        "chauss\u00E9e",
                        "impasse",
                        "place");

        public Object cityNames =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Aarschot",
                                    "Alost",
                                    "Andenne",
                                    "Antoing",
                                    "Anvers",
                                    "Arlon",
                                    "Ath",
                                    "Audenarde",
                                    "Bastogne",
                                    "Beaumont",
                                    "Beauraing",
                                    "Beringen",
                                    "Bilzen",
                                    "Binche",
                                    "Blankenberge",
                                    "Bouillon",
                                    "Braine-le-Comte",
                                    "Bree",
                                    "Bruges",
                                    "Bruxelles",
                                    "Charleroi",
                                    "Ch\u00E2telet",
                                    "Chi\u00E8vres",
                                    "Chimay",
                                    "Chiny",
                                    "Ciney",
                                    "Comines-Warneton",
                                    "Courtrai",
                                    "Couvin",
                                    "Damme",
                                    "Deinze",
                                    "Diest",
                                    "Dilsen-Stokkem",
                                    "Dinant",
                                    "Dixmude",
                                    "Durbuy",
                                    "Eeklo",
                                    "Enghien",
                                    "Eupen",
                                    "Fleurus",
                                    "Florenville",
                                    "Fontaine-l'\u00C9v\u00EAque",
                                    "Fosses-la-Ville",
                                    "Furnes",
                                    "Gand",
                                    "Geel",
                                    "Gembloux",
                                    "Genappe",
                                    "Genk",
                                    "Gistel",
                                    "Grammont",
                                    "Hal",
                                    "Halen",
                                    "Hamont-Achel",
                                    "Hannut",
                                    "Harelbeke",
                                    "Hasselt",
                                    "Herck-la-Ville",
                                    "Herentals",
                                    "Herstal",
                                    "Herve",
                                    "Hoogstraten",
                                    "Houffalize",
                                    "Huy",
                                    "Izegem",
                                    "Jodoigne",
                                    "La Louvi\u00E8re",
                                    "La Roche-en-Ardenne",
                                    "Landen",
                                    "L\u00E9au",
                                    "Le R\u0153ulx",
                                    "Lessines",
                                    "Leuze-en-Hainaut",
                                    "Li\u00E8ge",
                                    "Lierre",
                                    "Limbourg",
                                    "Lokeren",
                                    "Lommel",
                                    "Looz",
                                    "Lo-Reninge",
                                    "Louvain",
                                    "Maaseik",
                                    "Malines",
                                    "Malmedy",
                                    "Marche-en-Famenne",
                                    "Menin",
                                    "Messines",
                                    "Mons",
                                    "Montaigu-Zichem",
                                    "Mortsel",
                                    "Mouscron",
                                    "Namur",
                                    "Neufch\u00E2teau",
                                    "Nieuport",
                                    "Ninove",
                                    "Nivelles",
                                    "Ostende",
                                    "Ottignies-Louvain-la-Neuve",
                                    "Oudenburg",
                                    "Peer",
                                    "P\u00E9ruwelz",
                                    "Philippeville",
                                    "Poperinge",
                                    "Renaix",
                                    "Rochefort",
                                    "Roulers",
                                    "Saint-Ghislain",
                                    "Saint-Hubert",
                                    "Saint-Nicolas",
                                    "Saint-Trond",
                                    "Saint-Vith",
                                    "Seraing",
                                    "Soignies",
                                    "Stavelot",
                                    "Termonde",
                                    "Thuin",
                                    "Tielt",
                                    "Tirlemont",
                                    "Tongres",
                                    "Torhout",
                                    "Tournai",
                                    "Turnhout",
                                    "Verviers",
                                    "Vilvorde",
                                    "Virton",
                                    "Vis\u00E9",
                                    "Walcourt",
                                    "Waregem",
                                    "Waremme",
                                    "Wavre",
                                    "Wervik",
                                    "Ypres",
                                    "Zottegem");
                        });

        public Object region = ZVal.arrayFromList("Wallonie", "Flandre", "Bruxelles-Capitale");

        public Object province =
                ZVal.arrayFromList(
                        "Anvers",
                        "Limbourg",
                        "Flandre orientale",
                        "Brabant flamand",
                        "Flandre occidentale",
                        "Hainaut",
                        "Li\u00E8ge",
                        "Luxembourg",
                        "Namur",
                        "Brabant wallon");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\fr_BE\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "cityFormats",
                            "cityNames",
                            "postcode",
                            "province",
                            "region",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetSuffix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/fr_BE/Address.php")
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
