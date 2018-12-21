package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.th_TH.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/th_TH/Company.php

*/

public class Company
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .Company {

    public Company(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Company.class) {
            this.__construct(env, args);
        }
    }

    public Company(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object slogan(RuntimeEnv env, Object... args) {
        ReferenceContainer result = new BasicReferenceContainer(null);
        ReferenceContainer slogan = new BasicReferenceContainer(null);
        result.setObject(ZVal.newArray());
        for (ZPair zpairResult134 :
                ZVal.getIterable(
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
                                                .Company
                                                .RequestStaticProperties
                                                .class)
                                .slogans,
                        env,
                        true)) {
            slogan = zpairResult134;
            result.arrayAppend(env)
                    .set(
                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, Company.class)
                                    .method("randomElement")
                                    .addReferenceArgs(
                                            new RuntimeArgsWithReferences().add(0, slogan))
                                    .call(slogan.getObject())
                                    .value());
        }

        return ZVal.assign(NamespaceGlobal.implode.env(env).call(result.getObject()).value());
    }

    public static final Object CONST_class = "Faker\\Provider\\th_TH\\Company";

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
                    .Company
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object slogans =
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.arrayFromList(
                                        "\u0E40\u0E0A\u0E37\u0E48\u0E2D\u0E21\u0E15\u0E48\u0E2D",
                                        "\u0E2A\u0E23\u0E23\u0E2A\u0E23\u0E49\u0E32\u0E07",
                                        "\u0E40\u0E0A\u0E37\u0E48\u0E2D\u0E21\u0E42\u0E22\u0E07",
                                        "\u0E2A\u0E48\u0E07\u0E40\u0E2A\u0E23\u0E34\u0E21",
                                        "\u0E40\u0E1B\u0E25\u0E35\u0E48\u0E22\u0E19",
                                        "\u0E1B\u0E23\u0E30\u0E2A\u0E32\u0E19",
                                        "\u0E1E\u0E31\u0E12\u0E19\u0E32")),
                        new ZPair(
                                1,
                                ZVal.arrayFromList(
                                        "\u0E15\u0E25\u0E32\u0E14",
                                        "\u0E2D\u0E38\u0E15\u0E2A\u0E32\u0E2B\u0E01\u0E23\u0E23\u0E21",
                                        "\u0E42\u0E04\u0E23\u0E07\u0E2A\u0E23\u0E49\u0E32\u0E07",
                                        "\u0E40\u0E17\u0E04\u0E42\u0E19\u0E42\u0E25\u0E22\u0E35",
                                        "\u0E40\u0E19\u0E37\u0E49\u0E2D\u0E2B\u0E32",
                                        "\u0E2A\u0E16\u0E32\u0E1B\u0E31\u0E15\u0E22\u0E01\u0E23\u0E23\u0E21",
                                        "\u0E23\u0E30\u0E1A\u0E1A",
                                        "\u0E04\u0E27\u0E32\u0E21\u0E04\u0E34\u0E14",
                                        "\u0E1C\u0E39\u0E49\u0E43\u0E0A\u0E49",
                                        "\u0E40\u0E04\u0E23\u0E37\u0E2D\u0E02\u0E48\u0E32\u0E22",
                                        "\u0E1B\u0E23\u0E30\u0E2A\u0E1A\u0E01\u0E32\u0E23\u0E13\u0E4C")),
                        new ZPair(
                                2,
                                ZVal.arrayFromList(
                                        "\u0E17\u0E35\u0E48\u0E41\u0E02\u0E47\u0E07\u0E41\u0E01\u0E23\u0E48\u0E07",
                                        "\u0E17\u0E35\u0E48\u0E21\u0E35\u0E04\u0E38\u0E13\u0E04\u0E48\u0E32",
                                        "\u0E17\u0E35\u0E48\u0E2A\u0E23\u0E49\u0E32\u0E07\u0E2A\u0E23\u0E23\u0E04\u0E4C",
                                        "24 \u0E0A\u0E31\u0E48\u0E27\u0E42\u0E21\u0E07",
                                        "\u0E2D\u0E22\u0E48\u0E32\u0E07\u0E2A\u0E32\u0E01\u0E25",
                                        "\u0E2A\u0E39\u0E48\u0E1C\u0E39\u0E49\u0E1A\u0E23\u0E34\u0E42\u0E20\u0E04",
                                        "\u0E17\u0E35\u0E48\u0E19\u0E48\u0E32\u0E14\u0E36\u0E07\u0E14\u0E39\u0E14",
                                        "\u0E2D\u0E22\u0E48\u0E32\u0E07\u0E21\u0E35\u0E1B\u0E23\u0E30\u0E2A\u0E34\u0E17\u0E18\u0E34\u0E20\u0E32\u0E1E",
                                        "\u0E2D\u0E22\u0E48\u0E32\u0E07\u0E44\u0E23\u0E49\u0E23\u0E2D\u0E22\u0E15\u0E48\u0E2D",
                                        "\u0E2D\u0E22\u0E48\u0E32\u0E07\u0E44\u0E23\u0E49\u0E17\u0E35\u0E48\u0E15\u0E34",
                                        "\u0E17\u0E35\u0E48\u0E1B\u0E23\u0E31\u0E1A\u0E15\u0E31\u0E27\u0E44\u0E14\u0E49",
                                        "\u0E04\u0E38\u0E13\u0E20\u0E32\u0E1E\u0E2A\u0E32\u0E01\u0E25",
                                        "\u0E1E\u0E23\u0E49\u0E2D\u0E21\u0E43\u0E0A\u0E49\u0E07\u0E32\u0E19",
                                        "\u0E17\u0E35\u0E48\u0E21\u0E35\u0E04\u0E27\u0E32\u0E21\u0E2B\u0E21\u0E32\u0E22",
                                        "\u0E17\u0E35\u0E48\u0E42\u0E1B\u0E23\u0E48\u0E07\u0E43\u0E2A",
                                        "\u0E40\u0E1E\u0E37\u0E48\u0E2D\u0E01\u0E32\u0E23\u0E40\u0E1B\u0E25\u0E35\u0E48\u0E22\u0E19\u0E41\u0E1B\u0E25\u0E07",
                                        "\u0E2A\u0E21\u0E31\u0E22\u0E43\u0E2B\u0E21\u0E48",
                                        "\u0E23\u0E39\u0E1B\u0E41\u0E1A\u0E1A\u0E43\u0E2B\u0E21\u0E48")));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\th_TH\\Company")
                    .setLookup(
                            Company.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("slogans")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/th_TH/Company.php")
                    .addExtendsClass("Faker\\Provider\\Company")
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
