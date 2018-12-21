package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.en_ZA.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/en_ZA/Address.php

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
                .en_US
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

    public static final Object CONST_class = "Faker\\Provider\\en_ZA\\Address";

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
                    .en_US
                    .classes
                    .Address
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object cityPrefix(RuntimeEnv env, Object... args) {
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
                                                            .en_ZA
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .cityPrefix)
                            .value());
        }

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
                                                                            .en_ZA
                                                                            .classes
                                                                            .Address
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .secondaryAddressFormats)
                                            .value())
                            .value());
        }

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
                                                            .en_ZA
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .province)
                            .value());
        }

        @ConvertedMethod
        public Object provinceAbbr(RuntimeEnv env, Object... args) {
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
                                                            .en_ZA
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .provinceAbbr)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object cityPrefix =
                ZVal.arrayFromList("North", "East", "West", "South", "New", "Lake", "Port");

        public Object citySuffix =
                ZVal.arrayFromList(
                        "fontein", "town", "ton", "land", "ville", "berg", "burgh", "borough",
                        "bury", "view", "port", "mouth", "stad", "furt", "chester", "mouth", "fort",
                        "haven", "side", "shire");

        public Object buildingNumber = ZVal.arrayFromList("#####", "####", "###");

        public Object streetSuffix =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Alley",
                                    "Avenue",
                                    "Branch",
                                    "Bridge",
                                    "Brook",
                                    "Brooks",
                                    "Burg",
                                    "Burgs",
                                    "Bypass",
                                    "Camp",
                                    "Canyon",
                                    "Cape",
                                    "Causeway",
                                    "Center",
                                    "Centers",
                                    "Circle",
                                    "Circles",
                                    "Cliff",
                                    "Cliffs",
                                    "Club",
                                    "Common",
                                    "Corner",
                                    "Corners",
                                    "Course",
                                    "Court",
                                    "Courts",
                                    "Cove",
                                    "Coves",
                                    "Creek",
                                    "Crescent",
                                    "Crest",
                                    "Crossing",
                                    "Crossroad",
                                    "Curve",
                                    "Dale",
                                    "Dam",
                                    "Divide",
                                    "Drive",
                                    "Drive",
                                    "Drives",
                                    "Estate",
                                    "Estates",
                                    "Expressway",
                                    "Extension",
                                    "Extensions",
                                    "Fall",
                                    "Falls",
                                    "Ferry",
                                    "Field",
                                    "Fields",
                                    "Flat",
                                    "Flats",
                                    "Ford",
                                    "Fords",
                                    "Forest",
                                    "Forge",
                                    "Forges",
                                    "Fork",
                                    "Forks",
                                    "Fort",
                                    "Freeway",
                                    "Garden",
                                    "Gardens",
                                    "Gateway",
                                    "Glen",
                                    "Glens",
                                    "Green",
                                    "Greens",
                                    "Grove",
                                    "Groves",
                                    "Harbor",
                                    "Harbors",
                                    "Haven",
                                    "Heights",
                                    "Highway",
                                    "Hill",
                                    "Hills",
                                    "Hollow",
                                    "Inlet",
                                    "Inlet",
                                    "Island",
                                    "Island",
                                    "Islands",
                                    "Islands",
                                    "Isle",
                                    "Isle",
                                    "Junction",
                                    "Junctions",
                                    "Key",
                                    "Keys",
                                    "Knoll",
                                    "Knolls",
                                    "Lake",
                                    "Lakes",
                                    "Land",
                                    "Landing",
                                    "Lane",
                                    "Light",
                                    "Lights",
                                    "Loaf",
                                    "Lock",
                                    "Locks",
                                    "Locks",
                                    "Lodge",
                                    "Lodge",
                                    "Loop",
                                    "Mall",
                                    "Manor",
                                    "Manors",
                                    "Meadow",
                                    "Meadows",
                                    "Mews",
                                    "Mill",
                                    "Mills",
                                    "Mission",
                                    "Mission",
                                    "Motorway",
                                    "Mount",
                                    "Mountain",
                                    "Mountain",
                                    "Mountains",
                                    "Mountains",
                                    "Neck",
                                    "Orchard",
                                    "Oval",
                                    "Overpass",
                                    "Park",
                                    "Parks",
                                    "Parkway",
                                    "Parkways",
                                    "Pass",
                                    "Passage",
                                    "Path",
                                    "Pike",
                                    "Pine",
                                    "Pines",
                                    "Place",
                                    "Plain",
                                    "Plains",
                                    "Plains",
                                    "Plaza",
                                    "Plaza",
                                    "Point",
                                    "Points",
                                    "Port",
                                    "Port",
                                    "Ports",
                                    "Ports",
                                    "Prairie",
                                    "Prairie",
                                    "Radial",
                                    "Ramp",
                                    "Ranch",
                                    "Rapid",
                                    "Rapids",
                                    "Rest",
                                    "Ridge",
                                    "Ridges",
                                    "River",
                                    "Road",
                                    "Road",
                                    "Roads",
                                    "Roads",
                                    "Route",
                                    "Row",
                                    "Rue",
                                    "Run",
                                    "Shoal",
                                    "Shoals",
                                    "Shore",
                                    "Shores",
                                    "Skyway",
                                    "Spring",
                                    "Springs",
                                    "Springs",
                                    "Spur",
                                    "Spurs",
                                    "Square",
                                    "Square",
                                    "Squares",
                                    "Squares",
                                    "Station",
                                    "Station",
                                    "Stravenue",
                                    "Stravenue",
                                    "Stream",
                                    "Stream",
                                    "Street",
                                    "Street",
                                    "Streets",
                                    "Summit",
                                    "Summit",
                                    "Terrace",
                                    "Throughway",
                                    "Trace",
                                    "Track",
                                    "Trafficway",
                                    "Trail",
                                    "Trail",
                                    "Tunnel",
                                    "Tunnel",
                                    "Turnpike",
                                    "Turnpike",
                                    "Underpass",
                                    "Union",
                                    "Unions",
                                    "Valley",
                                    "Valleys",
                                    "Via",
                                    "Viaduct",
                                    "View",
                                    "Views",
                                    "Village",
                                    "Village",
                                    "Villages",
                                    "Ville",
                                    "Vista",
                                    "Vista",
                                    "Walk",
                                    "Walks",
                                    "Wall",
                                    "Way",
                                    "Ways",
                                    "Well",
                                    "Wells");
                        });

        public Object postcode = ZVal.arrayFromList("####");

        public Object province =
                ZVal.arrayFromList(
                        "Eastern Cape",
                        "Free State",
                        "Gauteng",
                        "KwaZulu-Natal",
                        "Limpopo",
                        "Mpumalanga",
                        "North-West",
                        "Northern Cape",
                        "Western Cape");

        public Object provinceAbbr =
                ZVal.arrayFromList("EC", "FS", "GP", "KZN", "LP", "MP", "NW", "NC", "WC");

        public Object cityFormats =
                ZVal.arrayFromList(
                        "{{cityPrefix}} {{firstName}}{{citySuffix}}",
                        "{{cityPrefix}} {{firstName}}",
                        "{{firstName}}{{citySuffix}}",
                        "{{lastName}}{{citySuffix}}");

        public Object streetNameFormats =
                ZVal.arrayFromList(
                        "{{firstName}} {{streetSuffix}}", "{{lastName}} {{streetSuffix}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList(
                        "{{buildingNumber}} {{streetName}}",
                        "{{buildingNumber}} {{streetName}} {{secondaryAddress}}");

        public Object addressFormats =
                ZVal.arrayFromList("{{streetAddress}}\n{{city}}, {{provinceAbbr}} {{postcode}}");

        public Object secondaryAddressFormats = ZVal.arrayFromList("Apt. ###", "Suite ###");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\en_ZA\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "buildingNumber",
                            "cityFormats",
                            "cityPrefix",
                            "citySuffix",
                            "postcode",
                            "province",
                            "provinceAbbr",
                            "secondaryAddressFormats",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetSuffix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/en_ZA/Address.php")
                    .addExtendsClass("Faker\\Provider\\en_US\\Address")
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
