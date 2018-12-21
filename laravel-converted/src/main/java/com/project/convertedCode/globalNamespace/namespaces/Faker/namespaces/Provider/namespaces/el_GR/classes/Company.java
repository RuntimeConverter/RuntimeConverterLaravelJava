package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.el_GR.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/el_GR/Company.php

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

    public static final Object CONST_class = "Faker\\Provider\\el_GR\\Company";

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

        @ConvertedMethod
        public Object doy(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
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
                                                            .el_GR
                                                            .classes
                                                            .Company
                                                            .RequestStaticProperties
                                                            .class)
                                            .doy)
                            .value());
        }

        @ConvertedMethod(name = "object")
        public Object _object(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
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
                                                            .el_GR
                                                            .classes
                                                            .Company
                                                            .RequestStaticProperties
                                                            .class)
                                            .οbject)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object companySuffix =
                ZVal.arrayFromList(
                        "\u039F.\u0395", "\u0395.\u0395", "\u0391.\u0395", "\u0395.\u03A0.\u0395");

        public Object companyFormats =
                ZVal.arrayFromList(
                        "{{lastName}} {{firstName}} {{companySuffix}}",
                        "{{lastName}}-{{firstName}}");

        public Object grafm = ZVal.arrayFromList("#########");

        public Object doy =
                ZVal.arrayFromList(
                        "\u0391' \u0391\u03B8\u03AE\u03BD\u03B1\u03C2",
                        "\u0392' \u0391\u03B8\u03AE\u03BD\u03B1\u03C2",
                        "\u0393' \u0391\u03B8\u03AE\u03BD\u03B1\u03C2",
                        "\u03A3\u03A4' \u0391\u03B8\u03AE\u03BD\u03B1\u03C2",
                        "\u0393\u03B1\u03BB\u03AC\u03C4\u03C3\u03B9\u03BF\u03C5",
                        "\u0391' \u03A0\u03B5\u03B9\u03C1\u03B1\u03B9\u03AC",
                        "\u0392' \u03A0\u03B5\u03B9\u03C1\u03B1\u03B9\u03AC",
                        "\u0393' \u03A0\u03B5\u03B9\u03C1\u03B1\u03B9\u03AC",
                        "\u0391' \u0398\u03B5\u03C3\u03C3\u03B1\u03BB\u03BF\u03BD\u03AF\u03BA\u03B7\u03C2",
                        "\u0392' \u0398\u03B5\u03C3\u03C3\u03B1\u03BB\u03BF\u03BD\u03AF\u03BA\u03B7\u03C2",
                        "\u0393\u03BB\u03C5\u03C6\u03AC\u03B4\u03B1\u03C2",
                        "\u03A9\u03C1\u03BF\u03C0\u03BF\u03CD",
                        "\u039A\u03B1\u03BB\u03B9\u03B8\u03AD\u03B1\u03C2",
                        "\u0391\u03B3\u03AF\u03BF\u03C5 \u0394\u03B7\u03BC\u03B7\u03C4\u03C1\u03AF\u03BF\u03C5",
                        "\u039D\u03AD\u03B1\u03C2 \u03A3\u03BC\u03CD\u03C1\u03BD\u03B7\u03C2",
                        "\u0391\u03BC\u03B1\u03C1\u03BF\u03C5\u03C3\u03AF\u03BF\u03C5",
                        "\u0398\u03AE\u03C1\u03B1\u03C2",
                        "\u0391\u03BC\u03BF\u03C1\u03B3\u03BF\u03CD",
                        "\u03A0\u03B1\u03C4\u03C1\u03CE\u03BD",
                        "\u0394\u039F\u03A5 \u03A0\u039B\u039F\u0399\u03A9\u039D",
                        "\u03A6\u0391\u0395\u0395 \u0391\u0398\u0397\u039D\u03A9\u039D");

        public Object οbject =
                ZVal.arrayFromList(
                        "\u03A0\u03C1\u03BF\u03B3\u03C1\u03B1\u03BC\u03BC\u03B1\u03C4\u03B9\u03C3\u03C4\u03AE\u03C2",
                        "\u0394\u03B9\u03BA\u03B7\u03B3\u03CC\u03C1\u03BF\u03C2",
                        "\u0393\u03B9\u03B1\u03C4\u03C1\u03CC\u03C2",
                        "\u0393\u03C1\u03B1\u03C6\u03AF\u03C3\u03C4\u03B1\u03C2",
                        "\u0391\u03C1\u03C7\u03B1\u03B9\u03BF\u03BB\u03CC\u03B3\u03BF\u03C2",
                        "\u0395\u03BA\u03C0\u03B1\u03B9\u03B4\u03B5\u03C5\u03C4\u03B9\u03BA\u03CC\u03C2",
                        "\u039C\u03B5\u03C4\u03B1\u03C6\u03C1\u03B1\u03C3\u03C4\u03AE\u03C2",
                        "\u039C\u03B7\u03C7\u03B1\u03BD\u03BF\u03BB\u03CC\u03B3\u03BF\u03C2-\u03BC\u03B7\u03C7\u03B1\u03BD\u03B9\u03BA\u03CC\u03C2",
                        "\u0391\u03C1\u03C7\u03B9\u03C4\u03AD\u03BA\u03C4\u03BF\u03BD\u03B1\u03C2",
                        "\u0394\u03B7\u03BC\u03BF\u03C3\u03B9\u03BF\u03B3\u03C1\u03AC\u03C6\u03BF\u03C2",
                        "\u03A5\u03C0\u03B7\u03C1\u03B5\u03C3\u03AF\u03B5\u03C2 \u0394\u03B9\u03B1\u03B4\u03B9\u03BA\u03C4\u03CD\u03BF\u03C5",
                        "\u03A1\u03B1\u03B4\u03B9\u03BF\u03C6\u03C9\u03BD\u03B9\u03BA\u03AD\u03C2 \u03C0\u03B1\u03C1\u03B1\u03B3\u03C9\u03B3\u03AD\u03C2",
                        "\u039A\u03B1\u03C1\u03B1\u03B3\u03BA\u03B9\u03BF\u03B6\u03BF\u03C0\u03B1\u03AF\u03C7\u03C4\u03B7\u03C2",
                        "\u039A\u03BF\u03C5\u03BB\u03BF\u03C5\u03C1\u03AC\u03C2",
                        "\u039A\u03BF\u03BC\u03C0\u03AC\u03C1\u03C3\u03BF\u03C2",
                        "\u039A\u03B1\u03BB\u03BB\u03B9\u03C4\u03B5\u03C7\u03BD\u03B9\u03BA\u03CC\u03C2 \u03C0\u03C1\u03AC\u03BA\u03C4\u03BF\u03C1\u03B1\u03C2",
                        "\u0395\u03B9\u03C3\u03B1\u03B3\u03C9\u03B3\u03B1\u03AF-\u03B5\u03BE\u03B1\u03B3\u03C9\u03B3\u03B1\u03AF",
                        "\u03A9\u03C1\u03BF\u03BB\u03BF\u03B3\u03BF\u03C0\u03BF\u03B9\u03CC\u03C2",
                        "\u039A\u03B1\u03B8\u03B5\u03BA\u03BB\u03BF\u03C0\u03BF\u03B9\u03CC\u03C2");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\el_GR\\Company")
                    .setLookup(
                            Company.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "companyFormats", "companySuffix", "doy", "grafm", "\u03BFbject")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/el_GR/Company.php")
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
