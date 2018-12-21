package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.en_SG.classes;

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
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/en_SG/PhoneNumber.php

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
    public Object tollFreeInternationalNumber(RuntimeEnv env, Object... args) {
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
                                                                .en_SG
                                                                .classes
                                                                .PhoneNumber
                                                                .RequestStaticProperties
                                                                .class,
                                                        "tollFreeInternationalNumber")))
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
                                                        .en_SG
                                                        .classes
                                                        .PhoneNumber
                                                        .RequestStaticProperties
                                                        .class)
                                        .tollFreeInternationalNumber)
                        .value());
    }

    @ConvertedMethod
    public Object tollFreeLineNumber(RuntimeEnv env, Object... args) {
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
                                                                .en_SG
                                                                .classes
                                                                .PhoneNumber
                                                                .RequestStaticProperties
                                                                .class,
                                                        "tollFreeLineNumber")))
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
                                                        .en_SG
                                                        .classes
                                                        .PhoneNumber
                                                        .RequestStaticProperties
                                                        .class)
                                        .tollFreeLineNumber)
                        .value());
    }

    @ConvertedMethod
    public Object premiumPhoneNumber(RuntimeEnv env, Object... args) {
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
                                                                .en_SG
                                                                .classes
                                                                .PhoneNumber
                                                                .RequestStaticProperties
                                                                .class,
                                                        "premiumPhoneNumber")))
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
                                                        .en_SG
                                                        .classes
                                                        .PhoneNumber
                                                        .RequestStaticProperties
                                                        .class)
                                        .premiumPhoneNumber)
                        .value());
    }

    @ConvertedMethod
    public Object mobileNumber(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object format = null;
        format =
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
                                                                .en_SG
                                                                .classes
                                                                .PhoneNumber
                                                                .RequestStaticProperties
                                                                .class,
                                                        "mobileNumberFormats")))
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
                                                        .en_SG
                                                        .classes
                                                        .PhoneNumber
                                                        .RequestStaticProperties
                                                        .class)
                                        .mobileNumberFormats)
                        .value();
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, PhoneNumber.class)
                        .method("numerify")
                        .addReferenceArgs(
                                rLastRefArgs =
                                        new RuntimeArgsWithReferences()
                                                .add(
                                                        0,
                                                        handleReturnReference(
                                                                env.callMethod(
                                                                        toObjectR(this)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("generator")
                                                                                .value(),
                                                                        "parse",
                                                                        PhoneNumber.class,
                                                                        format))))
                        .call(rLastRefArgs.get(0))
                        .value());
    }

    @ConvertedMethod
    public Object fixedLineNumber(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object format = null;
        format =
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
                                                                .en_SG
                                                                .classes
                                                                .PhoneNumber
                                                                .RequestStaticProperties
                                                                .class,
                                                        "fixedLineNumberFormats")))
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
                                                        .en_SG
                                                        .classes
                                                        .PhoneNumber
                                                        .RequestStaticProperties
                                                        .class)
                                        .fixedLineNumberFormats)
                        .value();
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, PhoneNumber.class)
                        .method("numerify")
                        .addReferenceArgs(
                                rLastRefArgs =
                                        new RuntimeArgsWithReferences()
                                                .add(
                                                        0,
                                                        handleReturnReference(
                                                                env.callMethod(
                                                                        toObjectR(this)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("generator")
                                                                                .value(),
                                                                        "parse",
                                                                        PhoneNumber.class,
                                                                        format))))
                        .call(rLastRefArgs.get(0))
                        .value());
    }

    @ConvertedMethod
    public Object voipNumber(RuntimeEnv env, Object... args) {
        Object format = null;
        format =
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
                                                                .en_SG
                                                                .classes
                                                                .PhoneNumber
                                                                .RequestStaticProperties
                                                                .class,
                                                        "voipNumber")))
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
                                                        .en_SG
                                                        .classes
                                                        .PhoneNumber
                                                        .RequestStaticProperties
                                                        .class)
                                        .voipNumber)
                        .value();
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        PhoneNumber.class,
                        format));
    }

    @ConvertedMethod
    public Object internationalCodePrefix(RuntimeEnv env, Object... args) {
        Object format = null;
        format =
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
                                                                .en_SG
                                                                .classes
                                                                .PhoneNumber
                                                                .RequestStaticProperties
                                                                .class,
                                                        "internationalCodePrefix")))
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
                                                        .en_SG
                                                        .classes
                                                        .PhoneNumber
                                                        .RequestStaticProperties
                                                        .class)
                                        .internationalCodePrefix)
                        .value();
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        PhoneNumber.class,
                        format));
    }

    @ConvertedMethod
    public Object zeroToEight(RuntimeEnv env, Object... args) {
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
                                                                .en_SG
                                                                .classes
                                                                .PhoneNumber
                                                                .RequestStaticProperties
                                                                .class,
                                                        "zeroToEight")))
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
                                                        .en_SG
                                                        .classes
                                                        .PhoneNumber
                                                        .RequestStaticProperties
                                                        .class)
                                        .zeroToEight)
                        .value());
    }

    @ConvertedMethod
    public Object oneToNine(RuntimeEnv env, Object... args) {
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
                                                                .en_SG
                                                                .classes
                                                                .PhoneNumber
                                                                .RequestStaticProperties
                                                                .class,
                                                        "oneToNine")))
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
                                                        .en_SG
                                                        .classes
                                                        .PhoneNumber
                                                        .RequestStaticProperties
                                                        .class)
                                        .oneToNine)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\en_SG\\PhoneNumber";

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

        public Object internationalCodePrefix = ZVal.arrayFromList("+65", "65");

        public Object zeroToEight = ZVal.arrayFromList(0, 1, 2, 3, 4, 5, 6, 7, 8);

        public Object oneToNine = ZVal.arrayFromList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        public Object mobileNumberFormats =
                ZVal.arrayFromList(
                        "{{internationalCodePrefix}}9{{zeroToEight}}## ####",
                        "{{internationalCodePrefix}} 9{{zeroToEight}}## ####",
                        "9{{zeroToEight}}## ####",
                        "{{internationalCodePrefix}}8{{oneToNine}}## ####",
                        "{{internationalCodePrefix}} 8{{oneToNine}}## ####",
                        "8{{oneToNine}}## ####",
                        "{{internationalCodePrefix}}7{{oneToNine}}## ####",
                        "{{internationalCodePrefix}} 7{{oneToNine}}## ####",
                        "7{{oneToNine}}## ####");

        public Object fixedLineNumberFormats =
                ZVal.arrayFromList(
                        "{{internationalCodePrefix}}6### ####",
                        "{{internationalCodePrefix}} 6### ####",
                        "6### ####");

        public Object formats = ZVal.arrayFromList("{{mobileNumber}}", "{{fixedLineNumber}}");

        public Object voipNumber =
                ZVal.arrayFromList(
                        "{{internationalCodePrefix}}3### ####",
                        "{{internationalCodePrefix}} 3### ####",
                        "3### ####");

        public Object tollFreeInternationalNumber = ZVal.arrayFromList("800 ### ####");

        public Object tollFreeLineNumber = ZVal.arrayFromList("1800 ### ####");

        public Object premiumPhoneNumber = ZVal.arrayFromList("1900 ### ####");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\en_SG\\PhoneNumber")
                    .setLookup(
                            PhoneNumber.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "fixedLineNumberFormats",
                            "formats",
                            "internationalCodePrefix",
                            "mobileNumberFormats",
                            "oneToNine",
                            "premiumPhoneNumber",
                            "tollFreeInternationalNumber",
                            "tollFreeLineNumber",
                            "voipNumber",
                            "zeroToEight")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/en_SG/PhoneNumber.php")
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
