package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.th_TH.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/th_TH/Payment.php

*/

public class Payment
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .Payment {

    public Payment(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Payment.class) {
            this.__construct(env, args);
        }
    }

    public Payment(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Faker\\Provider\\th_TH\\Payment";

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
                    .Payment
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object bank(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Payment.class)
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
                                                            .th_TH
                                                            .classes
                                                            .Payment
                                                            .RequestStaticProperties
                                                            .class)
                                            .banks)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object banks =
                ZVal.arrayFromList(
                        "\u0E18\u0E19\u0E32\u0E04\u0E32\u0E23\u0E41\u0E2B\u0E48\u0E07\u0E1B\u0E23\u0E30\u0E40\u0E17\u0E28\u0E44\u0E17\u0E22",
                        "\u0E18\u0E19\u0E32\u0E04\u0E32\u0E23\u0E01\u0E23\u0E38\u0E07\u0E40\u0E17\u0E1E",
                        "\u0E18\u0E19\u0E32\u0E04\u0E32\u0E23\u0E01\u0E23\u0E38\u0E07\u0E28\u0E23\u0E35\u0E2D\u0E22\u0E38\u0E18\u0E22\u0E32",
                        "\u0E18\u0E19\u0E32\u0E04\u0E32\u0E23\u0E01\u0E2A\u0E34\u0E01\u0E23\u0E44\u0E17\u0E22",
                        "\u0E18\u0E19\u0E32\u0E04\u0E32\u0E23\u0E40\u0E01\u0E35\u0E22\u0E23\u0E15\u0E34\u0E19\u0E32\u0E04\u0E34\u0E19",
                        "\u0E18\u0E19\u0E32\u0E04\u0E32\u0E23\u0E0B\u0E35\u0E44\u0E2D\u0E40\u0E2D\u0E47\u0E21\u0E1A\u0E35\u0E44\u0E17\u0E22",
                        "\u0E18\u0E19\u0E32\u0E04\u0E32\u0E23\u0E17\u0E2B\u0E32\u0E23\u0E44\u0E17\u0E22",
                        "\u0E18\u0E19\u0E32\u0E04\u0E32\u0E23\u0E17\u0E34\u0E2A\u0E42\u0E01\u0E49",
                        "\u0E18\u0E19\u0E32\u0E04\u0E32\u0E23\u0E44\u0E17\u0E22\u0E1E\u0E32\u0E13\u0E34\u0E0A\u0E22\u0E4C",
                        "\u0E18\u0E19\u0E32\u0E04\u0E32\u0E23\u0E44\u0E17\u0E22\u0E40\u0E04\u0E23\u0E14\u0E34\u0E15\u0E40\u0E1E\u0E37\u0E48\u0E2D\u0E23\u0E32\u0E22\u0E22\u0E48\u0E2D\u0E22",
                        "\u0E18\u0E19\u0E32\u0E04\u0E32\u0E23\u0E18\u0E19\u0E0A\u0E32\u0E15",
                        "\u0E18\u0E19\u0E32\u0E04\u0E32\u0E23\u0E22\u0E39\u0E42\u0E2D\u0E1A\u0E35",
                        "\u0E18\u0E19\u0E32\u0E04\u0E32\u0E23\u0E41\u0E25\u0E19\u0E14\u0E4C \u0E41\u0E2D\u0E19\u0E14\u0E4C \u0E40\u0E2E\u0E32\u0E2A\u0E4C",
                        "\u0E18\u0E19\u0E32\u0E04\u0E32\u0E23\u0E2A\u0E41\u0E15\u0E19\u0E14\u0E32\u0E23\u0E4C\u0E14\u0E0A\u0E32\u0E23\u0E4C\u0E40\u0E15\u0E2D\u0E23\u0E4C\u0E14 (\u0E44\u0E17\u0E22)",
                        "\u0E18\u0E19\u0E32\u0E04\u0E32\u0E23\u0E01\u0E23\u0E38\u0E07\u0E44\u0E17\u0E22",
                        "\u0E18\u0E19\u0E32\u0E04\u0E32\u0E23\u0E1E\u0E31\u0E12\u0E19\u0E32\u0E27\u0E34\u0E2A\u0E32\u0E2B\u0E01\u0E34\u0E08\u0E02\u0E19\u0E32\u0E14\u0E01\u0E25\u0E32\u0E07\u0E41\u0E25\u0E30\u0E02\u0E19\u0E32\u0E14\u0E22\u0E48\u0E2D\u0E21\u0E41\u0E2B\u0E48\u0E07\u0E1B\u0E23\u0E30\u0E40\u0E17\u0E28\u0E44\u0E17\u0E22",
                        "\u0E18\u0E19\u0E32\u0E04\u0E32\u0E23\u0E40\u0E1E\u0E37\u0E48\u0E2D\u0E01\u0E32\u0E23\u0E40\u0E01\u0E29\u0E15\u0E23\u0E41\u0E25\u0E30\u0E2A\u0E2B\u0E01\u0E23\u0E13\u0E4C\u0E01\u0E32\u0E23\u0E40\u0E01\u0E29\u0E15\u0E23",
                        "\u0E18\u0E19\u0E32\u0E04\u0E32\u0E23\u0E40\u0E1E\u0E37\u0E48\u0E2D\u0E01\u0E32\u0E23\u0E2A\u0E48\u0E07\u0E2D\u0E2D\u0E01\u0E41\u0E25\u0E30\u0E19\u0E33\u0E40\u0E02\u0E49\u0E32\u0E41\u0E2B\u0E48\u0E07\u0E1B\u0E23\u0E30\u0E40\u0E17\u0E28\u0E44\u0E17\u0E22",
                        "\u0E18\u0E19\u0E32\u0E04\u0E32\u0E23\u0E2D\u0E2D\u0E21\u0E2A\u0E34\u0E19",
                        "\u0E18\u0E19\u0E32\u0E04\u0E32\u0E23\u0E2D\u0E32\u0E04\u0E32\u0E23\u0E2A\u0E07\u0E40\u0E04\u0E23\u0E32\u0E30\u0E2B\u0E4C",
                        "\u0E18\u0E19\u0E32\u0E04\u0E32\u0E23\u0E2D\u0E34\u0E2A\u0E25\u0E32\u0E21\u0E41\u0E2B\u0E48\u0E07\u0E1B\u0E23\u0E30\u0E40\u0E17\u0E28\u0E44\u0E17\u0E22",
                        "\u0E18\u0E19\u0E32\u0E04\u0E32\u0E23\u0E44\u0E2D\u0E0B\u0E35\u0E1A\u0E35\u0E0B\u0E35 (\u0E44\u0E17\u0E22)");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\th_TH\\Payment")
                    .setLookup(
                            Payment.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("banks")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/th_TH/Payment.php")
                    .addExtendsClass("Faker\\Provider\\Payment")
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
