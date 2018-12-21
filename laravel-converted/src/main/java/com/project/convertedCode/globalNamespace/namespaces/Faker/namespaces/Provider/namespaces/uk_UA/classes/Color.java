package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.uk_UA.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/uk_UA/Color.php

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

    public static final Object CONST_class = "Faker\\Provider\\uk_UA\\Color";

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
                        "\u0447\u043E\u0440\u043D\u0438\u0439",
                        "\u0442\u0435\u043C\u043D\u043E-\u0431\u043E\u0440\u0434\u043E\u0432\u0438\u0439",
                        "\u0437\u0435\u043B\u0435\u043D\u0438\u0439",
                        "\u0442\u0435\u043C\u043D\u043E-\u0441\u0438\u043D\u0456\u0439",
                        "\u043E\u043B\u0438\u0432\u043A\u043E\u0432\u0438\u0439",
                        "\u0444\u0456\u043E\u043B\u0435\u0442\u043E\u0432\u0438\u0439",
                        "\u043F\u043E\u043C\u0430\u0440\u0430\u043D\u0447\u0435\u0432\u0438\u0439",
                        "\u0441\u0438\u043D\u0456\u0439",
                        "\u0447\u0435\u0440\u0432\u043E\u043D\u0438\u0439",
                        "\u0441\u0456\u0440\u0438\u0439",
                        "\u0436\u043E\u0432\u0442\u0438\u0439",
                        "\u0431\u043B\u0430\u043A\u0438\u0442\u043D\u0438\u0439",
                        "\u043C\u043E\u0440\u0441\u044C\u043A\u0430 \u0445\u0432\u0438\u043B\u044F",
                        "\u0431\u0456\u043B\u0438\u0439");

        public Object allColorNames =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u0411\u0443\u0440\u0448\u0442\u0438\u043D\u043E\u0432\u0438\u0439",
                                    "\u0410\u0431\u0440\u0438\u043A\u043E\u0441\u043E\u0432\u0438\u0439",
                                    "\u0417\u0435\u043B\u0435\u043D\u0438\u0439 \u0430\u0440\u043C\u0456\u0439\u0441\u044C\u043A\u0438\u0439",
                                    "\u0421\u043F\u0430\u0440\u0436\u0435\u0432\u0438\u0439",
                                    "\u0410\u043C\u0430\u0440\u0430\u043D\u0442\u043E\u0432\u0438\u0439",
                                    "\u042F\u043D\u0442\u0430\u0440\u043D\u0438\u0439",
                                    "\u041D\u0456\u0436\u043D\u043E-\u0431\u043B\u0430\u043A\u0438\u0442\u043D\u0438\u0439",
                                    "\u0410\u043C\u0435\u0442\u0438\u0441\u0442\u043E\u0432\u0438\u0439",
                                    "\u041C\u0430\u0442\u043E\u0432\u0438\u0439 \u0431\u0456\u043B\u0438\u0439",
                                    "\u0410\u043D\u0442\u0438\u0447\u043D\u0438\u0439 \u0431\u0456\u043B\u0438\u0439",
                                    "\u0421\u043C\u0430\u0440\u0430\u0433\u0434\u043E\u0432\u0438\u0439",
                                    "\u0421\u043F\u0430\u0440\u0436\u0430",
                                    "\u0417\u0430\u0445\u0438\u0441\u043D\u0438\u0439 \u0441\u0438\u043D\u0456\u0439",
                                    "\u0416\u043E\u0432\u0442\u043E-\u0437\u0435\u043B\u0435\u043D\u0438\u0439",
                                    "\u0421\u0456\u0440\u0430 \u0441\u043F\u0430\u0440\u0436\u0430",
                                    "\u0406\u043D\u0434\u0438\u0433\u043E",
                                    "\u041B\u0430\u0432\u0430\u043D\u0434\u043D\u0438\u0439",
                                    "\u0425\u0430\u043A\u0456",
                                    "\u041D\u0435\u0444\u0440\u0438\u0442\u043E\u0432\u0438\u0439",
                                    "\u041B\u0430\u0439\u043C",
                                    "\u0413\u0456\u0440\u0447\u0438\u0447\u043D\u0438\u0439",
                                    "\u0427\u043E\u0440\u043D\u0438\u0439",
                                    "\u041C\u0430\u043B\u0430\u0445\u0456\u0442\u043E\u0432\u0438\u0439",
                                    "\u0421\u0438\u043D\u0456\u0439",
                                    "\u0412\u043E\u0434\u0430 \u043F\u043B\u044F\u0436\u0430 \u0411\u043E\u043D\u0434\u0456",
                                    "\u041B\u0430\u0442\u0443\u043D\u0438\u0439",
                                    "\u041F\u0443\u0440\u043F\u0443\u0440\u043D\u0438\u0439",
                                    "\u041E\u0440\u0445\u0456\u0434\u0435\u044F",
                                    "\u0411\u043B\u0456\u0434\u043E-\u0431\u0440\u0443\u043D\u0430\u0442\u043D\u0438\u0439",
                                    "\u0417\u0435\u043B\u0435\u043D\u0430 \u0441\u043E\u0441\u043D\u0430",
                                    "\u0413\u0430\u0440\u0431\u0443\u0437",
                                    "\u041B\u0430\u0437\u0443\u0440\u043D\u0438\u0439",
                                    "\u041A\u0430\u0448\u0442\u0430\u043D\u043E\u0432\u0438\u0439",
                                    "\u0428\u043E\u043A\u043E\u043B\u0430\u0434\u043D\u0438\u0439",
                                    "\u0423\u043C\u0431\u0440\u0430",
                                    "\u041A\u043E\u0431\u0430\u043B\u044C\u0442\u043E\u0432\u0438\u0439",
                                    "\u041A\u0440\u0435\u043C\u043E\u0432\u0438\u0439",
                                    "\u0426\u0438\u0430\u043D",
                                    "\u0406\u0440\u0436\u0430\u0432\u0438\u0439",
                                    "\u0424\u0443\u043A\u0441\u0438\u044F",
                                    "\u0428\u0430\u0444\u0440\u0430\u043D\u043E\u0432\u0438\u0439",
                                    "\u041B\u043B\u044F\u043D\u0438\u0439",
                                    "\u0417\u043E\u043B\u043E\u0442\u0438\u0439",
                                    "\u0417\u0435\u043B\u0435\u043D\u0438\u0439",
                                    "\u041B\u0438\u043C\u043E\u043D\u043D\u0438\u0439",
                                    "\u041B\u0456\u043B\u043E\u0432\u0438\u0439",
                                    "\u041F\u0435\u0440\u0441\u044C\u043A\u0438\u0439 \u0441\u0438\u043D\u0456\u0439",
                                    "\u041E\u0445\u0440\u0430",
                                    "\u041F\u0430\u043D\u0433",
                                    "\u0421\u043B\u0438\u0432\u043E\u0432\u0438\u0439",
                                    "\u0424\u0456\u043E\u043B\u0435\u0442\u043E\u0432\u043E-\u0447\u0435\u0440\u0432\u043E\u043D\u0438\u0439",
                                    "\u0421\u0456\u0440\u0438\u0439",
                                    "\u0411\u0430\u0433\u0440\u044F\u043D\u0438\u0439",
                                    "\u0421\u0440\u0456\u0431\u043D\u0438\u0439",
                                    "\u0411\u043E\u043B\u043E\u0442\u043D\u0438\u0439",
                                    "\u041F\u0448\u0435\u043D\u0438\u0447\u043D\u0438\u0439",
                                    "\u041F\u0430\u0441\u0442\u0435\u043B\u044C\u043D\u043E-\u0437\u0435\u043B\u0435\u043D\u0438\u0439",
                                    "\u0423\u043C\u0431\u0440\u0430",
                                    "\u041B\u043E\u0441\u043E\u0441\u0435\u0432\u0438\u0439",
                                    "\u0421\u0438\u043D\u044F \u0441\u0442\u0430\u043B\u044C");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\uk_UA\\Color")
                    .setLookup(
                            Color.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("allColorNames", "safeColorNames")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/uk_UA/Color.php")
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
