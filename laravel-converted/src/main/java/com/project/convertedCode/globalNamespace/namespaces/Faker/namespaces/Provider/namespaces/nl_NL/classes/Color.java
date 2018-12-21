package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.nl_NL.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/nl_NL/Color.php

*/

public class Color
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .Color {

    public Color(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Color.class) {
            this.__construct(env, args);
        }
    }

    public Color(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Faker\\Provider\\nl_NL\\Color";

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
                    .Color
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object safeColorNames =
                ZVal.arrayFromList(
                        "zwart",
                        "kastanjebruin",
                        "donkergroen",
                        "marine",
                        "olijfgroen",
                        "purper",
                        "groenblauw",
                        "limoen",
                        "blauw",
                        "zilver",
                        "grijs",
                        "geel",
                        "fuchsia",
                        "cyaan",
                        "wit");

        public Object allColorNames =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Cyaan",
                                    "Aquamarijn",
                                    "Aquamarijn",
                                    "Ultramarijn",
                                    "Beige",
                                    "Zwart",
                                    "Blauw",
                                    "Blauwviolet",
                                    "Bruin",
                                    "Groen",
                                    "Chocoladebruin",
                                    "Koraal",
                                    "Korenbloemblauw",
                                    "Vermiljoen",
                                    "Cyaan",
                                    "Donkerblauw",
                                    "Donkercyaan",
                                    "Donkergrijs",
                                    "Donkergroen",
                                    "Donkergrijs",
                                    "Donkerkaki",
                                    "Donkermagenta",
                                    "Donkerolijfgroen",
                                    "Donkeroranje",
                                    "Donkerrood",
                                    "Donkerzalm",
                                    "Donkerzeegroen",
                                    "Donkerleigrijs",
                                    "Donkerleigrijs",
                                    "Donkerturkoois",
                                    "Donkerviolet",
                                    "Dieproze",
                                    "Diep\u00A0hemelsblauw",
                                    "Vuurvaste baksteen",
                                    "Fluweelwit",
                                    "Bosgroen",
                                    "Fuchsia",
                                    "Goud",
                                    "Grijs",
                                    "Donkergroen",
                                    "Groengeel",
                                    "Grijs",
                                    "Acaciaroze",
                                    "Indisch rood",
                                    "Indigo",
                                    "Ivoor",
                                    "Kaki",
                                    "Lavendel",
                                    "Grasgroen",
                                    "Lichtblauw",
                                    "Lichtkoraal",
                                    "Lichtcyaan",
                                    "Lichtgrijs",
                                    "Lichtgroen",
                                    "Lichtgrijs",
                                    "Lichtroze",
                                    "Lichtzalm",
                                    "Lichtzeegroen",
                                    "Lichthemelsblauw",
                                    "Lichtleigrijs",
                                    "Lichtleigrijs",
                                    "Staalblauw",
                                    "Lichtgeel",
                                    "Limoen",
                                    "Limoengroen",
                                    "Linnen",
                                    "Magenta",
                                    "Kastanjebruin",
                                    "Middenblauw",
                                    "Midlentegroen",
                                    "Middenvioletrood",
                                    "Midnachtsblauw",
                                    "Mint",
                                    "Marine",
                                    "Kant",
                                    "Olijfgroen",
                                    "Oranje",
                                    "Oranjerood",
                                    "Oranjerood",
                                    "Orchidee",
                                    "Bleekgroen",
                                    "Lichtturkoois",
                                    "Roze",
                                    "Pruim",
                                    "Purper",
                                    "Rood",
                                    "Koningsblauw",
                                    "Zalm",
                                    "Zandbruin",
                                    "Zeegroen",
                                    "Schelp",
                                    "Sienna",
                                    "Zilver",
                                    "Hemelsblauw",
                                    "Leigrijs",
                                    "Leigrijs",
                                    "Sneeuwwit",
                                    "Lentegroen",
                                    "Donkerstaalblauw",
                                    "Groenblauw",
                                    "Distel",
                                    "Tomaat",
                                    "Transparant",
                                    "Turkoois",
                                    "Violet",
                                    "Wit",
                                    "Rookwit",
                                    "Geel",
                                    "Groengeel");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\nl_NL\\Color")
                    .setLookup(
                            Color.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("allColorNames", "safeColorNames")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/nl_NL/Color.php")
                    .addExtendsClass("Faker\\Provider\\Color")
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
