package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.bn_BD.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/bn_BD/Person.php

*/

public class Person
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .Person {

    public Person(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Person.class) {
            this.__construct(env, args);
        }
    }

    public Person(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Faker\\Provider\\bn_BD\\Person";

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
                    .Person
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object maleNameFormats =
                ZVal.arrayFromList(
                        "{{firstNameMale}} {{lastName}}",
                        "{{firstNameMale}} {{lastName}}",
                        "{{firstNameMale}} {{lastName}}",
                        "{{titleMale}} {{firstNameMale}} {{lastName}}");

        public Object femaleNameFormats =
                ZVal.arrayFromList(
                        "{{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}}",
                        "{{titleFemale}} {{firstNameFemale}} {{lastName}}");

        public Object firstNameMale =
                ZVal.arrayFromList(
                        "\u0985\u09A8\u09A8\u09CD\u09A4",
                        "\u0986\u09AC\u09CD\u09A6\u09C1\u09B2\u09CD\u09B2\u09BE\u09B9",
                        "\u0986\u09B9\u09B8\u09BE\u09A8",
                        "\u0987\u09AE\u09B0\u09C1\u09B2",
                        "\u0995\u09B0\u09BF\u09AE",
                        "\u099C\u09B2\u09BF\u09B2",
                        "\u09AC\u09B0\u0995\u09A4",
                        "\u09AE\u09BE\u09B8\u09A8\u09C1\u09A8",
                        "\u09B0\u09B9\u09BF\u09AE",
                        "\u09B0\u09BF\u09AB\u09BE\u09A4",
                        "\u09B9\u09BE\u09B8\u09A8\u09BE\u09A4",
                        "\u09B9\u09BE\u09B8\u09BE\u09A8");

        public Object firstNameFemale =
                ZVal.arrayFromList(
                        "\u099C\u09BE\u09B0\u09BF\u09A8",
                        "\u099C\u09C7\u09B0\u09BF\u09A8",
                        "\u09AB\u09BE\u09B0\u09B9\u09BE\u09A8\u09BE",
                        "\u09AB\u09BE\u09B9\u09AE\u09C7\u09A6\u09BE",
                        "\u09AE\u09BE\u09B9\u099C\u09BE\u09AC\u09BF\u09A8",
                        "\u09AE\u09C7\u09B9\u09A8\u09BE\u099C",
                        "\u09B0\u09B9\u09BF\u09AE\u09BE",
                        "\u09B2\u09BE\u09AC\u09A8\u09C0",
                        "\u09B8\u09BE\u09AC\u09B0\u09BF\u09A8",
                        "\u09B8\u09BE\u09AC\u09B0\u09BF\u09A8\u09BE",
                        "\u09B9\u09BE\u09B8\u09BF\u09A8",
                        "\u09B0\u09B9\u09AE\u09A4");

        public Object lastName =
                ZVal.arrayFromList(
                        "\u0996\u09BE\u09A8",
                        "\u09B6\u09C7\u0996",
                        "\u09B6\u09BF\u0995\u09A6\u09BE\u09B0",
                        "\u0986\u09B2\u09C0",
                        "\u09A4\u09BE\u09B8\u09A8\u09C0\u09AE",
                        "\u09A4\u09BE\u09AC\u09BE\u09B8\u09B8\u09C1\u09AE");

        public Object titleMale = ZVal.arrayFromList("\u09AE\u09BF.");

        public Object titleFemale =
                ZVal.arrayFromList("\u09AE\u09BF\u09B8\u09C7\u09B8.", "\u09AE\u09BF\u09B8.");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\bn_BD\\Person")
                    .setLookup(
                            Person.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "femaleNameFormats",
                            "firstNameFemale",
                            "firstNameMale",
                            "lastName",
                            "maleNameFormats",
                            "titleFemale",
                            "titleMale")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/bn_BD/Person.php")
                    .addExtendsClass("Faker\\Provider\\Person")
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
