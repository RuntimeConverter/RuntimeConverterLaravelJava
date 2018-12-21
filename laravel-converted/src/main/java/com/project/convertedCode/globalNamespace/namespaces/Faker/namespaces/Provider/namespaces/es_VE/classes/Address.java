package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.es_VE.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/es_VE/Address.php

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
                .es_ES
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

    public static final Object CONST_class = "Faker\\Provider\\es_VE\\Address";

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
                    .es_ES
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
                                                            .es_VE
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .streetPrefix)
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
                                                            .es_VE
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .cityPrefix)
                            .value());
        }

        @ConvertedMethod
        public Object secondaryAddress(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("numerify")
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
                                                                            .es_VE
                                                                            .classes
                                                                            .Address
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .secondaryAddressFormats)
                                            .value())
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
                                                            .es_VE
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
                ZVal.arrayFromList(
                        "San",
                        "Santa",
                        "Puerto",
                        "Valle",
                        "Villa",
                        "Parroquia",
                        "El",
                        "Los",
                        "La",
                        "Las");

        public Object citySuffix =
                ZVal.arrayFromList(
                        "del Valle", "de Mara", "de Altagracia", "de Asis", "del Tuy", "de Mata");

        public Object buildingNumber = ZVal.arrayFromList("###", "##", "#");

        public Object streetPrefix =
                ZVal.arrayFromList(
                        "Calle", "Avenida", "Av.", "Cl.", "Carretera", "Callej\u00F3n", "Vereda");

        public Object streetSuffix = ZVal.arrayFromList("Norte", "Este", " Sur", " Oeste");

        public Object postcode = ZVal.arrayFromList("####");

        public Object state =
                ZVal.arrayFromList(
                        "Amazonas",
                        "Anzo\u00E1tegui",
                        "Apure",
                        "Aragua",
                        "Barinas",
                        "Bol\u00EDvar",
                        "Carabobo",
                        "Cojedes",
                        "Delta Amacuro",
                        "Distrito Capital",
                        "Falc\u00F3n",
                        "Gu\u00E1rico",
                        "Lara",
                        "M\u00E9rida",
                        "Miranda",
                        "Monagas",
                        "Nueva Esparta",
                        "Portuguesa",
                        "Sucre",
                        "T\u00E1chira",
                        "Trujillo",
                        "Vargas",
                        "Yaracuy",
                        "Zulia");

        public Object cityFormats =
                ZVal.arrayFromList(
                        "{{cityPrefix}} {{firstName}}{{citySuffix}}",
                        "{{cityPrefix}} {{firstName}}",
                        "{{firstName}} {{citySuffix}}",
                        "{{lastName}} {{citySuffix}}");

        public Object streetNameFormats =
                ZVal.arrayFromList(
                        "{{streetPrefix}} {{firstName}}",
                        "{{streetPrefix}} {{lastName}}",
                        "{{streetPrefix}} {{firstName}} {{lastName}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList(
                        "{{streetName}}, {{buildingNumber}}, {{secondaryAddress}}",
                        "{{streetName}}, {{secondaryAddress}}");

        public Object addressFormats =
                ZVal.arrayFromList(
                        "{{streetAddress}}, {{city}} Edo. {{state}}",
                        "{{streetAddress}}, {{city}} Edo. {{state}}, {{postcode}}");

        public Object secondaryAddressFormats =
                ZVal.arrayFromList(
                        "Nro #", "Piso #", "Casa #", "Hab. #", "Apto #", "Nro ##", "Piso ##",
                        "Casa ##", "Hab. ##", "Apto ##");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\es_VE\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "buildingNumber",
                            "cityFormats",
                            "cityPrefix",
                            "citySuffix",
                            "postcode",
                            "secondaryAddressFormats",
                            "state",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetPrefix",
                            "streetSuffix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/es_VE/Address.php")
                    .addExtendsClass("Faker\\Provider\\es_ES\\Address")
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
