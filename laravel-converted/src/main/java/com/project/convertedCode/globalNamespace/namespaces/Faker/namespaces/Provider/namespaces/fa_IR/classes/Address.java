package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.fa_IR.classes;

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
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/fa_IR/Address.php

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

    @ConvertedMethod
    public Object building(RuntimeEnv env, Object... args) {
        Object format = null;
        format =
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
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
                                                                .fa_IR
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "buildingFormat")))
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
                                                        .fa_IR
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .buildingFormat)
                        .value();
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Address.class,
                        format));
    }

    public static final Object CONST_class = "Faker\\Provider\\fa_IR\\Address";

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
                                                            .fa_IR
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .cityPrefix)
                            .value());
        }

        @ConvertedMethod
        public Object cityName(RuntimeEnv env, Object... args) {
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
                                                            .fa_IR
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .cityName)
                            .value());
        }

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
                                                            .fa_IR
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .streetPrefix)
                            .value());
        }

        @ConvertedMethod
        public Object buildingNamePrefix(RuntimeEnv env, Object... args) {
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
                                                            .fa_IR
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .buildingNamePrefix)
                            .value());
        }

        @ConvertedMethod
        public Object buildingNumberPrefix(RuntimeEnv env, Object... args) {
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
                                                            .fa_IR
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .buildingNumberPrefix)
                            .value());
        }

        @ConvertedMethod
        public Object postcodePrefix(RuntimeEnv env, Object... args) {
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
                                                            .fa_IR
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .postcodePrefix)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object cityPrefix = ZVal.arrayFromList("\u0627\u0633\u062A\u0627\u0646");

        public Object streetPrefix = ZVal.arrayFromList("\u062E\u06CC\u0627\u0628\u0627\u0646");

        public Object buildingNamePrefix =
                ZVal.arrayFromList("\u0633\u0627\u062E\u062A\u0645\u0627\u0646");

        public Object buildingNumberPrefix =
                ZVal.arrayFromList("\u067E\u0644\u0627\u06A9", "\u0642\u0637\u0639\u0647");

        public Object postcodePrefix = ZVal.arrayFromList("\u06A9\u062F \u067E\u0633\u062A\u06CC");

        public Object cityName =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u0622\u0630\u0631\u0628\u0627\u06CC\u062C\u0627\u0646 \u0634\u0631\u0642\u06CC",
                                    "\u0622\u0630\u0631\u0628\u0627\u06CC\u062C\u0627\u0646 \u063A\u0631\u0628\u06CC",
                                    "\u0627\u0631\u062F\u0628\u06CC\u0644",
                                    "\u0627\u0635\u0641\u0647\u0627\u0646",
                                    "\u0627\u0644\u0628\u0631\u0632",
                                    "\u0627\u06CC\u0644\u0627\u0645",
                                    "\u0628\u0648\u0634\u0647\u0631",
                                    "\u062A\u0647\u0631\u0627\u0646",
                                    "\u062E\u0631\u0627\u0633\u0627\u0646 \u062C\u0646\u0648\u0628\u06CC",
                                    "\u062E\u0631\u0627\u0633\u0627\u0646 \u0631\u0636\u0648\u06CC",
                                    "\u062E\u0631\u0627\u0633\u0627\u0646 \u0634\u0645\u0627\u0644\u06CC",
                                    "\u062E\u0648\u0632\u0633\u062A\u0627\u0646",
                                    "\u0632\u0646\u062C\u0627\u0646",
                                    "\u0633\u0645\u0646\u0627\u0646",
                                    "\u0633\u06CC\u0633\u062A\u0627\u0646 \u0648 \u0628\u0644\u0648\u0686\u0633\u062A\u0627\u0646",
                                    "\u0641\u0627\u0631\u0633",
                                    "\u0642\u0632\u0648\u06CC\u0646",
                                    "\u0642\u0645",
                                    "\u0644\u0631\u0633\u062A\u0627\u0646",
                                    "\u0645\u0627\u0632\u0646\u062F\u0631\u0627\u0646",
                                    "\u0645\u0631\u06A9\u0632\u06CC",
                                    "\u0647\u0631\u0645\u0632\u06AF\u0627\u0646",
                                    "\u0647\u0645\u062F\u0627\u0646",
                                    "\u0686\u0647\u0627\u0631\u0645\u062D\u0627\u0644 \u0648 \u0628\u062E\u062A\u06CC\u0627\u0631\u06CC",
                                    "\u06A9\u0631\u062F\u0633\u062A\u0627\u0646",
                                    "\u06A9\u0631\u0645\u0627\u0646",
                                    "\u06A9\u0631\u0645\u0627\u0646\u0634\u0627\u0647",
                                    "\u06A9\u0647\u06AF\u06CC\u0644\u0648\u06CC\u0647 \u0648 \u0628\u0648\u06CC\u0631\u0627\u062D\u0645\u062F",
                                    "\u06AF\u0644\u0633\u062A\u0627\u0646",
                                    "\u06AF\u06CC\u0644\u0627\u0646",
                                    "\u06CC\u0632\u062F");
                        });

        public Object cityFormats =
                ZVal.arrayFromList("{{cityName}}", "{{cityPrefix}} {{cityName}}");

        public Object streetNameFormats = ZVal.arrayFromList("{{streetPrefix}} {{lastName}}");

        public Object streetAddressFormats = ZVal.arrayFromList("{{streetName}} {{building}}");

        public Object addressFormats =
                ZVal.arrayFromList(
                        "{{city}} {{streetAddress}} {{postcodePrefix}} {{postcode}}",
                        "{{city}} {{streetAddress}}");

        public Object buildingFormat =
                ZVal.arrayFromList(
                        "{{buildingNamePrefix}} {{firstName}} {{buildingNumberPrefix}} {{buildingNumber}}",
                        "{{buildingNamePrefix}} {{firstName}}");

        public Object postcode = ZVal.arrayFromList("##########");

        public Object country = ZVal.arrayFromList("\u0627\u06CC\u0631\u0627\u0646");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\fa_IR\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "buildingFormat",
                            "buildingNamePrefix",
                            "buildingNumberPrefix",
                            "cityFormats",
                            "cityName",
                            "cityPrefix",
                            "country",
                            "postcode",
                            "postcodePrefix",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetPrefix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/fa_IR/Address.php")
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
