package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.lv_LV.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/lv_LV/Color.php

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

    public static final Object CONST_class = "Faker\\Provider\\lv_LV\\Color";

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
                        "balts",
                        "melns",
                        "sarkans",
                        "za\u013C\u0161",
                        "dzeltens",
                        "zils",
                        "br\u016Bns",
                        "purpurs",
                        "roz\u0101",
                        "oran\u017Es",
                        "pel\u0113ks");

        public Object allColorNames =
                ZVal.arrayFromList(
                        "b\u0113\u0161s",
                        "palss \u0161atens",
                        "bordo",
                        "marengo",
                        "m\u0113\u013C\u0161",
                        "sirms",
                        "ruds",
                        "r\u016Bsgans",
                        "\u0101bolains",
                        "b\u0113rs",
                        "d\u016Bkans",
                        "loss",
                        "p\u0101ts",
                        "salns",
                        "zelts",
                        "sudrabs",
                        "var\u0161",
                        "bronza",
                        "zeltains",
                        "subrabains");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\lv_LV\\Color")
                    .setLookup(
                            Color.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("allColorNames", "safeColorNames")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/lv_LV/Color.php")
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
