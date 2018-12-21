package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.kk_KZ.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/kk_KZ/Color.php

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

    public static final Object CONST_class = "Faker\\Provider\\kk_KZ\\Color";

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
                        "\u049B\u0430\u0440\u0430",
                        "\u049B\u043E\u044E \u049B\u044B\u0437\u044B\u043B",
                        "\u0436\u0430\u0441\u044B\u043B",
                        "\u049B\u0430\u0440\u0430 \u043A\u04E9\u043A",
                        "\u0441\u0430\u0440\u0493\u044B\u0448 \u0442\u04AF\u0441",
                        "\u043A\u04AF\u043B\u0433\u0456\u043D",
                        "\u043A\u04E9\u043A",
                        "\u043A\u04E9\u043A",
                        "\u043A\u04AF\u043C\u0456\u0441",
                        "\u0441\u04B1\u0440",
                        "\u0441\u0430\u0440\u044B",
                        "\u049B\u044B\u0437\u044B\u043B\u043A\u04AF\u0440\u0435\u04A3 \u0442\u04AF\u0441",
                        "\u0442\u0435\u04A3\u0456\u0437 \u0442\u043E\u043B\u049B\u044B\u043D\u044B \u0442\u04AF\u0441",
                        "\u0430\u049B");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\kk_KZ\\Color")
                    .setLookup(
                            Color.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("safeColorNames")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/kk_KZ/Color.php")
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
