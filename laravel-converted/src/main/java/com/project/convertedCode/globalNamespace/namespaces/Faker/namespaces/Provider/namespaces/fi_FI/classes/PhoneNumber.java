package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.fi_FI.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/fi_FI/PhoneNumber.php

*/

public class PhoneNumber
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .PhoneNumber {

    public PhoneNumber(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PhoneNumber.class) {
            this.__construct(env, args);
        }
    }

    public PhoneNumber(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object landLineAreaCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, PhoneNumber.class)
                        .method("randomElement")
                        .addReferenceArgs(
                                new RuntimeArgsWithReferences()
                                        .add(
                                                0,
                                                env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Faker
                                                                .namespaces
                                                                .Provider
                                                                .namespaces
                                                                .fi_FI
                                                                .classes
                                                                .PhoneNumber
                                                                .RequestStaticProperties
                                                                .class,
                                                        "landLineareaCodes")))
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
                                                        .fi_FI
                                                        .classes
                                                        .PhoneNumber
                                                        .RequestStaticProperties
                                                        .class)
                                        .landLineareaCodes)
                        .value());
    }

    @ConvertedMethod
    public Object e164landLineAreaCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_substr
                        .f
                        .env(env)
                        .call(
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, PhoneNumber.class)
                                        .method("randomElement")
                                        .addReferenceArgs(
                                                new RuntimeArgsWithReferences()
                                                        .add(
                                                                0,
                                                                env
                                                                        .getRequestStaticPropertiesReference(
                                                                                com.project
                                                                                        .convertedCode
                                                                                        .globalNamespace
                                                                                        .namespaces
                                                                                        .Faker
                                                                                        .namespaces
                                                                                        .Provider
                                                                                        .namespaces
                                                                                        .fi_FI
                                                                                        .classes
                                                                                        .PhoneNumber
                                                                                        .RequestStaticProperties
                                                                                        .class,
                                                                                "landLineareaCodes")))
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
                                                                        .fi_FI
                                                                        .classes
                                                                        .PhoneNumber
                                                                        .RequestStaticProperties
                                                                        .class)
                                                        .landLineareaCodes)
                                        .value(),
                                1)
                        .value());
    }

    @ConvertedMethod
    public Object mobileNetworkAreaCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, PhoneNumber.class)
                        .method("randomElement")
                        .addReferenceArgs(
                                new RuntimeArgsWithReferences()
                                        .add(
                                                0,
                                                env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Faker
                                                                .namespaces
                                                                .Provider
                                                                .namespaces
                                                                .fi_FI
                                                                .classes
                                                                .PhoneNumber
                                                                .RequestStaticProperties
                                                                .class,
                                                        "mobileNetworkAreaCodes")))
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
                                                        .fi_FI
                                                        .classes
                                                        .PhoneNumber
                                                        .RequestStaticProperties
                                                        .class)
                                        .mobileNetworkAreaCodes)
                        .value());
    }

    @ConvertedMethod
    public Object e164MobileNetworkAreaCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_substr
                        .f
                        .env(env)
                        .call(
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, PhoneNumber.class)
                                        .method("randomElement")
                                        .addReferenceArgs(
                                                new RuntimeArgsWithReferences()
                                                        .add(
                                                                0,
                                                                env
                                                                        .getRequestStaticPropertiesReference(
                                                                                com.project
                                                                                        .convertedCode
                                                                                        .globalNamespace
                                                                                        .namespaces
                                                                                        .Faker
                                                                                        .namespaces
                                                                                        .Provider
                                                                                        .namespaces
                                                                                        .fi_FI
                                                                                        .classes
                                                                                        .PhoneNumber
                                                                                        .RequestStaticProperties
                                                                                        .class,
                                                                                "mobileNetworkAreaCodes")))
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
                                                                        .fi_FI
                                                                        .classes
                                                                        .PhoneNumber
                                                                        .RequestStaticProperties
                                                                        .class)
                                                        .mobileNetworkAreaCodes)
                                        .value(),
                                1)
                        .value());
    }

    @ConvertedMethod
    public Object numberFormat(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, PhoneNumber.class)
                        .method("randomElement")
                        .addReferenceArgs(
                                new RuntimeArgsWithReferences()
                                        .add(
                                                0,
                                                env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Faker
                                                                .namespaces
                                                                .Provider
                                                                .namespaces
                                                                .fi_FI
                                                                .classes
                                                                .PhoneNumber
                                                                .RequestStaticProperties
                                                                .class,
                                                        "numberFormats")))
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
                                                        .fi_FI
                                                        .classes
                                                        .PhoneNumber
                                                        .RequestStaticProperties
                                                        .class)
                                        .numberFormats)
                        .value());
    }

    @ConvertedMethod
    public Object separator(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, PhoneNumber.class)
                        .method("randomElement")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(ZVal.arrayFromList(" ", "-"))
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\fi_FI\\PhoneNumber";

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
                    .PhoneNumber
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object landLineareaCodes =
                ZVal.arrayFromList(
                        "02", "03", "05", "06", "08", "09", "013", "014", "015", "016", "017",
                        "018", "019");

        public Object mobileNetworkAreaCodes = ZVal.arrayFromList("040", "050", "044", "045");

        public Object numberFormats = ZVal.arrayFromList("### ####", "#######");

        public Object formats =
                ZVal.arrayFromList(
                        "+358 ({{ e164MobileNetworkAreaCode }}) {{ numberFormat }}",
                        "+358 {{ e164MobileNetworkAreaCode }} {{ numberFormat }}",
                        "+358 ({{ e164landLineAreaCode }}) {{ numberFormat }}",
                        "+358 {{ e164landLineAreaCode }} {{ numberFormat }}",
                        "{{ mobileNetworkAreaCode }}{{ separator }}{{ numberFormat }}",
                        "{{ landLineAreaCode }}{{ separator }}{{ numberFormat }}");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\fi_FI\\PhoneNumber")
                    .setLookup(
                            PhoneNumber.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "formats",
                            "landLineareaCodes",
                            "mobileNetworkAreaCodes",
                            "numberFormats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/fi_FI/PhoneNumber.php")
                    .addExtendsClass("Faker\\Provider\\PhoneNumber")
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
