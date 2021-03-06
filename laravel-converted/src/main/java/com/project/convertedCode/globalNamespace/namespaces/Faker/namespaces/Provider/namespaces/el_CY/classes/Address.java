package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.el_CY.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/el_CY/Address.php

*/

public class Address
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
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

    public static final Object CONST_class = "Faker\\Provider\\el_CY\\Address";

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
                    .Address
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object streetPrefix(RuntimeEnv env, Object... args) {
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
                                                            .el_CY
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .streetPrefix)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object citySuffix =
                ZVal.arrayFromList(
                        "\u039B\u03B5\u03C5\u03BA\u03C9\u03C3\u03AF\u03B1",
                        "\u039B\u03B5\u03BC\u03B5\u03C3\u03CC\u03C2",
                        "\u039B\u03AC\u03C1\u03BD\u03B1\u03BA\u03B1",
                        "\u03A0\u03AC\u03C6\u03BF\u03C2");

        public Object streetSuffix = ZVal.newArray();

        public Object streetPrefix =
                ZVal.arrayFromList(
                        "\u038C\u03B4\u03BF\u03C2",
                        "\u039F\u03B4\u03CC\u03C2",
                        "\u039B\u03B5\u03C9\u03C6\u03CC\u03C1\u03BF\u03C2");

        public Object cityFormats = ZVal.arrayFromList("{{citySuffix}}");

        public Object streetNameFormats =
                ZVal.arrayFromList(
                        "{{streetPrefix}} {{lastName}}",
                        "{{streetPrefix}} {{lastName}} {{lastName}}",
                        "{{streetPrefix}} \u0391\u03B3\u03AF\u03BF\u03C5 {{lastName}}",
                        "{{streetPrefix}} \u0392\u03B1\u03C3\u03B9\u03BB\u03AD\u03C9\u03C2 {{lastName}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList("{{streetName}}, {{buildingNumber}}");

        public Object buildingNumber = ZVal.arrayFromList("##", "#");

        public Object postcode = ZVal.arrayFromList("####");

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u0391\u03BD\u03B3\u03BA\u03CC\u03BB\u03B1",
                                    "\u0391\u03B6\u03B5\u03C1\u03BC\u03C0\u03B1\u03CA\u03C4\u03B6\u03AC\u03BD",
                                    "\u0391\u03AF\u03B3\u03C5\u03C0\u03C4\u03BF\u03C2",
                                    "\u0391\u03B9\u03B8\u03B9\u03BF\u03C0\u03AF\u03B1",
                                    "\u0391\u03CA\u03C4\u03AE",
                                    "\u0391\u03BB\u03B2\u03B1\u03BD\u03AF\u03B1",
                                    "\u0391\u03BB\u03B3\u03B5\u03C1\u03AF\u03B1",
                                    "\u0391\u03C1\u03B3\u03B5\u03BD\u03C4\u03B9\u03BD\u03AE",
                                    "\u0391\u03C1\u03BC\u03B5\u03BD\u03AF\u03B1",
                                    "\u0391\u03C5\u03C3\u03C4\u03C1\u03B1\u03BB\u03AF\u03B1",
                                    "\u0391\u03C5\u03C3\u03C4\u03C1\u03AF\u03B1",
                                    "\u0391\u03C6\u03B3\u03B1\u03BD\u03B9\u03C3\u03C4\u03AC\u03BD",
                                    "\u0392\u03AD\u03BB\u03B3\u03B9\u03BF",
                                    "\u0392\u03B5\u03BD\u03B5\u03B6\u03BF\u03C5\u03AD\u03BB\u03B1",
                                    "\u0392\u03B9\u03B5\u03C4\u03BD\u03AC\u03BC",
                                    "\u0392\u03BF\u03BB\u03B9\u03B2\u03AF\u03B1",
                                    "\u0392\u03BF\u03C3\u03BD\u03AF\u03B1 \u03BA\u03B1\u03B9 \u0395\u03C1\u03B6\u03B5\u03B3\u03BF\u03B2\u03AF\u03BD\u03B7",
                                    "\u0392\u03BF\u03C5\u03BB\u03B3\u03B1\u03C1\u03AF\u03B1",
                                    "\u0392\u03C1\u03B1\u03B6\u03B9\u03BB\u03AF\u03B1",
                                    "\u0393\u03B1\u03BB\u03BB\u03AF\u03B1",
                                    "\u0393\u03B5\u03C1\u03BC\u03B1\u03BD\u03AF\u03B1",
                                    "\u0393\u03B5\u03C9\u03C1\u03B3\u03AF\u03B1",
                                    "\u0393\u03C1\u03BF\u03B9\u03BB\u03B1\u03BD\u03B4\u03AF\u03B1",
                                    "\u0394\u03B1\u03BD\u03AF\u03B1",
                                    "\u0394\u03BF\u03BC\u03B9\u03BD\u03B9\u03BA\u03B1\u03BD\u03AE \u0394\u03B7\u03BC\u03BF\u03BA\u03C1\u03B1\u03C4\u03AF\u03B1",
                                    "\u0395\u03BB\u03B2\u03B5\u03C4\u03AF\u03B1",
                                    "\u0395\u03BB\u03BB\u03AC\u03B4\u03B1",
                                    "\u0395\u03C1\u03C5\u03B8\u03C1\u03B1\u03AF\u03B1",
                                    "\u0395\u03C3\u03B8\u03BF\u03BD\u03AF\u03B1",
                                    "\u0397\u03A0\u0391",
                                    "\u0397\u03BD\u03C9\u03BC\u03AD\u03BD\u03BF \u0392\u03B1\u03C3\u03AF\u03BB\u03B5\u03B9\u03BF",
                                    "\u0399\u03B1\u03C0\u03C9\u03BD\u03AF\u03B1",
                                    "\u0399\u03BD\u03B4\u03AF\u03B1",
                                    "\u0399\u03BD\u03B4\u03BF\u03BD\u03B7\u03C3\u03AF\u03B1",
                                    "\u0399\u03BF\u03C1\u03B4\u03B1\u03BD\u03AF\u03B1",
                                    "\u0399\u03C1\u03AC\u03BA",
                                    "\u0399\u03C1\u03AC\u03BD",
                                    "\u0399\u03C1\u03BB\u03B1\u03BD\u03B4\u03AF\u03B1",
                                    "\u0399\u03C3\u03BB\u03B1\u03BD\u03B4\u03AF\u03B1",
                                    "\u0399\u03C3\u03C0\u03B1\u03BD\u03AF\u03B1",
                                    "\u0399\u03C3\u03C1\u03B1\u03AE\u03BB",
                                    "\u0399\u03C4\u03B1\u03BB\u03AF\u03B1",
                                    "\u039A\u03B1\u03B6\u03B1\u03BA\u03C3\u03C4\u03AC\u03BD",
                                    "\u039A\u03B1\u03BC\u03C0\u03CC\u03C4\u03B6\u03B7",
                                    "\u039A\u03B1\u03BD\u03B1\u03B4\u03AC\u03C2",
                                    "\u039A\u03B5\u03BD\u03C4\u03C1\u03BF\u03B1\u03C6\u03C1\u03B9\u03BA\u03B1\u03BD\u03B9\u03BA\u03AE \u0394\u03B7\u03BC\u03BF\u03BA\u03C1\u03B1\u03C4\u03AF\u03B1",
                                    "\u039A\u03AD\u03BD\u03C5\u03B1",
                                    "\u039A\u03AF\u03BD\u03B1",
                                    "\u039A\u03B9\u03C1\u03B3\u03B9\u03B6\u03AF\u03B1",
                                    "\u039A\u03BF\u03BB\u03BF\u03BC\u03B2\u03AF\u03B1",
                                    "\u039A\u03BF\u03BC\u03CC\u03C1\u03B5\u03C2",
                                    "\u0394\u03B7\u03BC\u03BF\u03BA\u03C1\u03B1\u03C4\u03AF\u03B1 \u03C4\u03BF\u03C5 \u039A\u03BF\u03BD\u03B3\u03BA\u03CC",
                                    "\u039B\u03B1\u03CA\u03BA\u03AE \u0394\u03B7\u03BC\u03BF\u03BA\u03C1\u03B1\u03C4\u03AF\u03B1 \u03C4\u03BF\u03C5 \u039A\u03BF\u03BD\u03B3\u03BA\u03CC",
                                    "\u0392\u03CC\u03C1\u03B5\u03B9\u03B1 \u039A\u03BF\u03C1\u03AD\u03B1",
                                    "\u039D\u03CC\u03C4\u03B9\u03B1 \u039A\u03BF\u03C1\u03AD\u03B1",
                                    "\u039A\u03CC\u03C3\u03C4\u03B1 \u03A1\u03AF\u03BA\u03B1",
                                    "\u039A\u03BF\u03C5\u03B2\u03AD\u03B9\u03C4",
                                    "\u039A\u03C1\u03BF\u03B1\u03C4\u03AF\u03B1",
                                    "\u039A\u03CD\u03C0\u03C1\u03BF\u03C2",
                                    "\u039B\u03AC\u03BF\u03C2",
                                    "\u039B\u03B5\u03C4\u03C4\u03BF\u03BD\u03AF\u03B1",
                                    "\u039B\u03B5\u03C5\u03BA\u03BF\u03C1\u03C9\u03C3\u03AF\u03B1",
                                    "\u039B\u03AF\u03B2\u03B1\u03BD\u03BF\u03C2",
                                    "\u039B\u03B9\u03B2\u03B5\u03C1\u03AF\u03B1",
                                    "\u039B\u03B9\u03B2\u03CD\u03B7",
                                    "\u039B\u03B9\u03B8\u03BF\u03C5\u03B1\u03BD\u03AF\u03B1",
                                    "\u039B\u03BF\u03C5\u03BE\u03B5\u03BC\u03B2\u03BF\u03CD\u03C1\u03B3\u03BF",
                                    "\u039C\u03B1\u03B4\u03B1\u03B3\u03B1\u03C3\u03BA\u03AC\u03C1\u03B7",
                                    "\u039C\u03B1\u03BB\u03B1\u03B9\u03C3\u03AF\u03B1",
                                    "\u039C\u03AC\u03BB\u03C4\u03B1",
                                    "\u039C\u03B1\u03C1\u03CC\u03BA\u03BF",
                                    "\u039C\u03B1\u03C5\u03C1\u03AF\u03BA\u03B9\u03BF\u03C2",
                                    "\u039C\u03B1\u03C5\u03C1\u03B9\u03C4\u03B1\u03BD\u03AF\u03B1",
                                    "\u039C\u03B1\u03C5\u03C1\u03BF\u03B2\u03BF\u03CD\u03BD\u03B9\u03BF",
                                    "\u039C\u03B5\u03BE\u03B9\u03BA\u03CC",
                                    "\u039C\u03BF\u03B3\u03B3\u03BF\u03BB\u03AF\u03B1",
                                    "\u039C\u03BF\u03B6\u03B1\u03BC\u03B2\u03AF\u03BA\u03B7",
                                    "\u039C\u03BF\u03BB\u03B4\u03B1\u03B2\u03AF\u03B1",
                                    "\u039C\u03BF\u03BD\u03B1\u03BA\u03CC",
                                    "\u039C\u03C0\u03BF\u03C4\u03C3\u03BF\u03C5\u03AC\u03BD\u03B1",
                                    "\u039C\u03C0\u03BF\u03C5\u03C1\u03BF\u03CD\u03BD\u03C4\u03B9",
                                    "\u039C\u03C0\u03BF\u03C5\u03C4\u03AC\u03BD",
                                    "\u039D\u03AD\u03B1 \u0396\u03B7\u03BB\u03B1\u03BD\u03B4\u03AF\u03B1",
                                    "\u039D\u03B5\u03C0\u03AC\u03BB",
                                    "\u039D\u03AF\u03B3\u03B7\u03C1\u03B1\u03C2",
                                    "\u039D\u03B9\u03B3\u03B7\u03C1\u03AF\u03B1",
                                    "\u039D\u03B9\u03BA\u03B1\u03C1\u03AC\u03B3\u03BF\u03C5\u03B1",
                                    "\u039D\u03BF\u03C1\u03B2\u03B7\u03B3\u03AF\u03B1",
                                    "\u039D\u03CC\u03C4\u03B9\u03B1 \u0391\u03C6\u03C1\u03B9\u03BA\u03AE",
                                    "\u039F\u03BB\u03BB\u03B1\u03BD\u03B4\u03AF\u03B1",
                                    "\u039F\u03C5\u03B3\u03B3\u03B1\u03C1\u03AF\u03B1",
                                    "\u039F\u03C5\u03B3\u03BA\u03AC\u03BD\u03C4\u03B1",
                                    "\u039F\u03C5\u03B6\u03BC\u03C0\u03B5\u03BA\u03B9\u03C3\u03C4\u03AC\u03BD",
                                    "\u039F\u03C5\u03BA\u03C1\u03B1\u03BD\u03AF\u03B1",
                                    "\u039F\u03C5\u03C1\u03BF\u03C5\u03B3\u03BF\u03C5\u03AC\u03B7",
                                    "\u03A0\u03B1\u03BA\u03B9\u03C3\u03C4\u03AC\u03BD",
                                    "\u03A0\u03B1\u03BB\u03B1\u03B9\u03C3\u03C4\u03AF\u03BD\u03B7",
                                    "\u03A0\u03B1\u03BD\u03B1\u03BC\u03AC\u03C2",
                                    "\u03A0\u03B1\u03C1\u03B1\u03B3\u03BF\u03C5\u03AC\u03B7",
                                    "\u03A0\u03B5\u03C1\u03BF\u03CD",
                                    "\u03A0\u03BF\u03BB\u03C9\u03BD\u03AF\u03B1",
                                    "\u03A0\u03BF\u03C5\u03AD\u03C1\u03C4\u03BF \u03A1\u03AF\u03BA\u03BF",
                                    "\u03A0\u03BF\u03C1\u03C4\u03BF\u03B3\u03B1\u03BB\u03AF\u03B1",
                                    "\u03A0\u03C1\u03CE\u03B7\u03BD \u0393\u03B9\u03BF\u03C5\u03B3\u03BA\u03BF\u03C3\u03BB\u03B1\u03B2\u03B9\u03BA\u03AE \u0394\u03B7\u03BC\u03BF\u03BA\u03C1\u03B1\u03C4\u03AF\u03B1 \u03C4\u03B7\u03C2 \u039C\u03B1\u03BA\u03B5\u03B4\u03BF\u03BD\u03AF\u03B1\u03C2",
                                    "\u03A1\u03BF\u03C5\u03AC\u03BD\u03C4\u03B1",
                                    "\u03A1\u03BF\u03C5\u03BC\u03B1\u03BD\u03AF\u03B1",
                                    "\u03A1\u03C9\u03C3\u03AF\u03B1",
                                    "\u03A3\u03B1\u03BC\u03CC\u03B1",
                                    "\u03A3\u03B1\u03BF\u03C5\u03B4\u03B9\u03BA\u03AE \u0391\u03C1\u03B1\u03B2\u03AF\u03B1",
                                    "\u03A3\u03B5\u03BD\u03B5\u03B3\u03AC\u03BB\u03B7",
                                    "\u03A3\u03B5\u03C1\u03B2\u03AF\u03B1",
                                    "\u03A3\u03B9\u03B3\u03BA\u03B1\u03C0\u03BF\u03CD\u03C1\u03B7",
                                    "\u03A3\u03BB\u03BF\u03B2\u03B1\u03BA\u03AF\u03B1",
                                    "\u03A3\u03BB\u03BF\u03B2\u03B5\u03BD\u03AF\u03B1",
                                    "\u03A3\u03BF\u03BC\u03B1\u03BB\u03AF\u03B1",
                                    "\u03A3\u03BF\u03C5\u03B1\u03B6\u03B9\u03BB\u03AC\u03BD\u03B4\u03B7",
                                    "\u03A3\u03BF\u03C5\u03B4\u03AC\u03BD",
                                    "\u03A3\u03BF\u03C5\u03B7\u03B4\u03AF\u03B1",
                                    "\u03A3\u03BF\u03C5\u03C1\u03B9\u03BD\u03AC\u03BC",
                                    "\u03A3\u03C5\u03C1\u03AF\u03B1",
                                    "\u03A4\u03B1\u03CA\u03B2\u03AC\u03BD",
                                    "\u03A4\u03B1\u03CA\u03BB\u03AC\u03BD\u03B4\u03B7",
                                    "\u03A4\u03B1\u03BD\u03B6\u03B1\u03BD\u03AF\u03B1",
                                    "\u03A4\u03B1\u03C4\u03B6\u03B9\u03BA\u03B9\u03C3\u03C4\u03AC\u03BD",
                                    "\u03A4\u03B6\u03B1\u03BC\u03AC\u03B9\u03BA\u03B1",
                                    "\u03A4\u03CC\u03B3\u03BA\u03BF",
                                    "\u03A4\u03CC\u03BD\u03B3\u03BA\u03B1",
                                    "\u03A4\u03BF\u03C5\u03B2\u03B1\u03BB\u03BF\u03CD",
                                    "\u03A4\u03BF\u03C5\u03C1\u03BA\u03AF\u03B1",
                                    "\u03A4\u03BF\u03C5\u03C1\u03BA\u03BC\u03B5\u03BD\u03B9\u03C3\u03C4\u03AC\u03BD",
                                    "\u03A4\u03C3\u03B5\u03C7\u03AF\u03B1",
                                    "\u03A4\u03C5\u03BD\u03B7\u03C3\u03AF\u03B1",
                                    "\u03A5\u03B5\u03BC\u03AD\u03BD\u03B7",
                                    "\u03A6\u03B9\u03BB\u03B9\u03C0\u03C0\u03AF\u03BD\u03B5\u03C2",
                                    "\u03A6\u03B9\u03BD\u03BB\u03B1\u03BD\u03B4\u03AF\u03B1",
                                    "\u03A7\u03B9\u03BB\u03AE");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\el_CY\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "buildingNumber",
                            "cityFormats",
                            "citySuffix",
                            "country",
                            "postcode",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetPrefix",
                            "streetSuffix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/el_CY/Address.php")
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
