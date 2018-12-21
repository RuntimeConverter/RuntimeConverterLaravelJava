package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.ka_GE.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/ka_GE/Color.php

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

    public static final Object CONST_class = "Faker\\Provider\\ka_GE\\Color";

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
                        "\u10D0\u10DA\u10D8\u10E1\u10E4\u10D4\u10E0\u10D8",
                        "\u10D5\u10D0\u10E0\u10D3\u10D8\u10E1\u10E4\u10D4\u10E0\u10D8",
                        "\u10D7\u10D4\u10D7\u10E0\u10D8",
                        "\u10D8\u10D0\u10E1\u10D0\u10DB\u10DC\u10D8\u10E1\u10E4\u10D4\u10E0\u10D8",
                        "\u10DA\u10E3\u10E0\u10EF\u10D8",
                        "\u10DB\u10E3\u10E5\u10D8 \u10DA\u10E3\u10E0\u10EF\u10D8",
                        "\u10DB\u10EC\u10D5\u10D0\u10DC\u10D4",
                        "\u10DC\u10D0\u10E0\u10D8\u10DC\u10EF\u10D8\u10E1\u10E4\u10D4\u10E0\u10D8",
                        "\u10DC\u10D0\u10EA\u10E0\u10D8\u10E1\u10E4\u10D4\u10E0\u10D8",
                        "\u10E1\u10D0\u10DA\u10D0\u10D7\u10D8\u10E1\u10E4\u10D4\u10E0\u10D8",
                        "\u10E6\u10D8\u10D0 \u10DB\u10EC\u10D5\u10D0\u10DC\u10D4",
                        "\u10E7\u10D0\u10D5\u10D8\u10E1\u10E4\u10D4\u10E0\u10D8",
                        "\u10E7\u10D5\u10D8\u10D7\u10D4\u10DA\u10D8",
                        "\u10EA\u10D8\u10E1\u10E4\u10D4\u10E0\u10D8",
                        "\u10EC\u10D8\u10D7\u10D4\u10DA\u10D8");

        public Object allColorNames =
                ZVal.arrayFromList(
                        "\u10D0\u10DA\u10D8\u10E1\u10E4\u10D4\u10E0\u10D8",
                        "\u10D5\u10D0\u10E0\u10D3\u10D8\u10E1\u10E4\u10D4\u10E0\u10D8",
                        "\u10D7\u10D4\u10D7\u10E0\u10D8",
                        "\u10D8\u10D0\u10E1\u10D0\u10DB\u10DC\u10D8\u10E1\u10E4\u10D4\u10E0\u10D8",
                        "\u10DA\u10E3\u10E0\u10EF\u10D8",
                        "\u10DB\u10E3\u10E5\u10D8 \u10DA\u10E3\u10E0\u10EF\u10D8",
                        "\u10DB\u10EC\u10D5\u10D0\u10DC\u10D4",
                        "\u10DC\u10D0\u10E0\u10D8\u10DC\u10EF\u10D8\u10E1\u10E4\u10D4\u10E0\u10D8",
                        "\u10DC\u10D0\u10EA\u10E0\u10D8\u10E1\u10E4\u10D4\u10E0\u10D8",
                        "\u10E1\u10D0\u10DA\u10D0\u10D7\u10D8\u10E1\u10E4\u10D4\u10E0\u10D8",
                        "\u10E6\u10D8\u10D0 \u10DB\u10EC\u10D5\u10D0\u10DC\u10D4",
                        "\u10E7\u10D0\u10D5\u10D8\u10E1\u10E4\u10D4\u10E0\u10D8",
                        "\u10E7\u10D5\u10D8\u10D7\u10D4\u10DA\u10D8",
                        "\u10EA\u10D8\u10E1\u10E4\u10D4\u10E0\u10D8",
                        "\u10EC\u10D8\u10D7\u10D4\u10DA\u10D8");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\ka_GE\\Color")
                    .setLookup(
                            Color.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("allColorNames", "safeColorNames")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/ka_GE/Color.php")
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
