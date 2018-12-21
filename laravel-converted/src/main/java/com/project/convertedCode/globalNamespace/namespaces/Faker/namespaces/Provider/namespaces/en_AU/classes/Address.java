package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.en_AU.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/en_AU/Address.php

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

    public static final Object CONST_class = "Faker\\Provider\\en_AU\\Address";

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
        public Object buildingLetter(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("toUpper")
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
                                                                            .en_AU
                                                                            .classes
                                                                            .Address
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .buildingLetters)
                                            .value())
                            .value());
        }

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
                                                            .en_AU
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .cityPrefix)
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
                                                            .en_AU
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .streetSuffix)
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
                                                            .en_AU
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .state)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object cityPrefix =
                ZVal.arrayFromList("North", "East", "West", "South", "New", "Lake", "Port", "St.");

        public Object buildingNumber = ZVal.arrayFromList("###", "##", "#");

        public Object buildingLetters = ZVal.arrayFromList("A", "B", "C", "D");

        public Object streetSuffix =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Access",
                                    "Alley",
                                    "Alleyway",
                                    "Amble",
                                    "Anchorage",
                                    "Approach",
                                    "Arcade",
                                    "Artery",
                                    "Avenue",
                                    "Basin",
                                    "Beach",
                                    "Bend",
                                    "Block",
                                    "Boulevard",
                                    "Brace",
                                    "Brae",
                                    "Break",
                                    "Bridge",
                                    "Broadway",
                                    "Brow",
                                    "Bypass",
                                    "Byway",
                                    "Causeway",
                                    "Centre",
                                    "Centreway",
                                    "Chase",
                                    "Circle",
                                    "Circlet",
                                    "Circuit",
                                    "Circus",
                                    "Close",
                                    "Colonnade",
                                    "Common",
                                    "Concourse",
                                    "Copse",
                                    "Corner",
                                    "Corso",
                                    "Court",
                                    "Courtyard",
                                    "Cove",
                                    "Crescent",
                                    "Crest",
                                    "Cross",
                                    "Crossing",
                                    "Crossroad",
                                    "Crossway",
                                    "Cruiseway",
                                    "Cul-de-sac",
                                    "Cutting",
                                    "Dale",
                                    "Dell",
                                    "Deviation",
                                    "Dip",
                                    "Distributor",
                                    "Drive",
                                    "Driveway",
                                    "Edge",
                                    "Elbow",
                                    "End",
                                    "Entrance",
                                    "Esplanade",
                                    "Estate",
                                    "Expressway",
                                    "Extension",
                                    "Fairway",
                                    "Fire Track",
                                    "Firetrail",
                                    "Flat",
                                    "Follow",
                                    "Footway",
                                    "Foreshore",
                                    "Formation",
                                    "Freeway",
                                    "Front",
                                    "Frontage",
                                    "Gap",
                                    "Garden",
                                    "Gardens",
                                    "Gate",
                                    "Gates",
                                    "Glade",
                                    "Glen",
                                    "Grange",
                                    "Green",
                                    "Ground",
                                    "Grove",
                                    "Gully",
                                    "Heights",
                                    "Highroad",
                                    "Highway",
                                    "Hill",
                                    "Interchange",
                                    "Intersection",
                                    "Junction",
                                    "Key",
                                    "Landing",
                                    "Lane",
                                    "Laneway",
                                    "Lees",
                                    "Line",
                                    "Link",
                                    "Little",
                                    "Lookout",
                                    "Loop",
                                    "Lower",
                                    "Mall",
                                    "Meander",
                                    "Mew",
                                    "Mews",
                                    "Motorway",
                                    "Mount",
                                    "Nook",
                                    "Outlook",
                                    "Parade",
                                    "Park",
                                    "Parklands",
                                    "Parkway",
                                    "Part",
                                    "Pass",
                                    "Path",
                                    "Pathway",
                                    "Piazza",
                                    "Place",
                                    "Plateau",
                                    "Plaza",
                                    "Pocket",
                                    "Point",
                                    "Port",
                                    "Promenade",
                                    "Quad",
                                    "Quadrangle",
                                    "Quadrant",
                                    "Quay",
                                    "Quays",
                                    "Ramble",
                                    "Ramp",
                                    "Range",
                                    "Reach",
                                    "Reserve",
                                    "Rest",
                                    "Retreat",
                                    "Ride",
                                    "Ridge",
                                    "Ridgeway",
                                    "Right Of Way",
                                    "Ring",
                                    "Rise",
                                    "River",
                                    "Riverway",
                                    "Riviera",
                                    "Road",
                                    "Roads",
                                    "Roadside",
                                    "Roadway",
                                    "Ronde",
                                    "Rosebowl",
                                    "Rotary",
                                    "Round",
                                    "Route",
                                    "Row",
                                    "Rue",
                                    "Run",
                                    "Service Way",
                                    "Siding",
                                    "Slope",
                                    "Sound",
                                    "Spur",
                                    "Square",
                                    "Stairs",
                                    "State Highway",
                                    "Steps",
                                    "Strand",
                                    "Street",
                                    "Strip",
                                    "Subway",
                                    "Tarn",
                                    "Terrace",
                                    "Thoroughfare",
                                    "Tollway",
                                    "Top",
                                    "Tor",
                                    "Towers",
                                    "Track",
                                    "Trail",
                                    "Trailer",
                                    "Triangle",
                                    "Trunkway",
                                    "Turn",
                                    "Underpass",
                                    "Upper",
                                    "Vale",
                                    "Viaduct",
                                    "View",
                                    "Villas",
                                    "Vista",
                                    "Wade",
                                    "Walk",
                                    "Walkway",
                                    "Way",
                                    "Wynd");
                        });

        public Object postcode =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "1###", "20##", "21##", "22##", "23##", "24##", "25##", "2619",
                                    "262#", "263#", "264#", "265#", "266#", "267#", "268#", "269#",
                                    "27##", "28##", "292#", "293#", "294#", "295#", "296#", "297#",
                                    "298#", "299#", "02##", "260#", "261#", "290#", "291#", "2920",
                                    "3###", "8###", "4###", "9###", "5###", "6###", "7###", "08##",
                                    "09##");
                        });

        public Object state =
                ZVal.arrayFromList(
                        "Australian Capital Territory",
                        "New South Wales",
                        "Northern Territory",
                        "Queensland",
                        "South Australia",
                        "Tasmania",
                        "Victoria",
                        "Western Australia");

        public Object stateAbbr =
                ZVal.arrayFromList("ACT", "NSW", "NT", "QLD", "SA", "TAS", "VIC", "WA");

        public Object streetAddressFormats =
                ZVal.arrayFromList(
                        "{{buildingNumber}} {{streetName}}",
                        "{{buildingNumber}}{{buildingLetter}} {{streetName}}",
                        "{{secondaryAddress}} {{buildingNumber}} {{streetName}}");

        public Object secondaryAddressFormats =
                ZVal.arrayFromList(
                        "Apt. ###",
                        "Flat ##",
                        "Suite ###",
                        "Unit ##",
                        "Level #",
                        "### /",
                        "## /",
                        "# /");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\en_AU\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "buildingLetters",
                            "buildingNumber",
                            "cityPrefix",
                            "postcode",
                            "secondaryAddressFormats",
                            "state",
                            "stateAbbr",
                            "streetAddressFormats",
                            "streetSuffix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/en_AU/Address.php")
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
