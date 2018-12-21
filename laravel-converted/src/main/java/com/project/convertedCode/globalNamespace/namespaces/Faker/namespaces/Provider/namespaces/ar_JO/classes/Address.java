package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.ar_JO.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/ar_JO/Address.php

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

    public static final Object CONST_class = "Faker\\Provider\\ar_JO\\Address";

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
                                                            .ar_JO
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
                                                            .ar_JO
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
                                                            .ar_JO
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .streetPrefix)
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
                                                                            .ar_JO
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
                                                            .ar_JO
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .state)
                            .value());
        }

        @ConvertedMethod
        public Object stateAbbr(RuntimeEnv env, Object... args) {
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
                                                            .ar_JO
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .stateAbbr)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object streetPrefix = ZVal.arrayFromList("\u0634\u0627\u0631\u0639");

        public Object cityPrefix =
                ZVal.arrayFromList(
                        "\u0634\u0645\u0627\u0644",
                        "\u0634\u0631\u0642",
                        "\u063A\u0631\u0628",
                        "\u062C\u0646\u0648\u0628",
                        "\u0648\u0633\u0637");

        public Object cityName =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u0627\u0631\u0628\u062F",
                                    "\u0623\u0628\u0648 \u0646\u0635\u064A\u0631",
                                    "\u0627\u0644\u062C\u0628\u064A\u0647\u0647",
                                    "\u0627\u0644\u062D\u0635\u0646",
                                    "\u0627\u0644\u0631\u0635\u064A\u0641\u0629",
                                    "\u0627\u0644\u0631\u0645\u062B\u0627",
                                    "\u0627\u0644\u0632\u0631\u0642\u0627\u0621",
                                    "\u0627\u0644\u0633\u0644\u0637",
                                    "\u0627\u0644\u0634\u0647\u064A\u062F \u0639\u0632\u0645\u064A",
                                    "\u0627\u0644\u0635\u0631\u064A\u062D",
                                    "\u0627\u0644\u0636\u0644\u064A\u0644",
                                    "\u0627\u0644\u0637\u0641\u064A\u0644\u0629",
                                    "\u0627\u0644\u0639\u0642\u0628\u0629",
                                    "\u0627\u0644\u0642\u0648\u064A\u0633\u0645\u0629",
                                    "\u0627\u0644\u0643\u0631\u0643",
                                    "\u0627\u0644\u0645\u0634\u0627\u0631\u0639",
                                    "\u0627\u0644\u0645\u0641\u0631\u0642",
                                    "\u0627\u0644\u0647\u0627\u0634\u0645\u064A\u0629",
                                    "\u0627\u0645 \u0642\u0635\u064A\u0631",
                                    "\u0627\u064A\u062F\u0648\u0646",
                                    "\u0628\u064A\u062A \u0631\u0627\u0633",
                                    "\u062A\u0644\u0627\u0639 \u0627\u0644\u0639\u0644\u064A",
                                    "\u062C\u0631\u0634",
                                    "\u0633\u0627\u0643\u0628",
                                    "\u0633\u062D\u0627\u0628",
                                    "\u0634\u0641\u0627 \u0628\u062F\u0631\u0627\u0646",
                                    "\u0635\u0648\u064A\u0644\u062D",
                                    "\u0639\u0645\u0627\u0646",
                                    "\u0639\u0646\u062C\u0631\u0647",
                                    "\u0639\u064A\u0646 \u0627\u0644\u0628\u0627\u0634\u0627",
                                    "\u063A\u0648\u0631 \u0627\u0644\u0635\u0627\u0641\u064A",
                                    "\u0643\u0631\u064A\u0645\u0647",
                                    "\u0643\u0641\u0631\u0646\u062C\u0647",
                                    "\u0645\u0627\u062F\u0628\u0627",
                                    "\u0645\u062E\u064A\u0645 \u0627\u0644\u0628\u0642\u0639\u0647",
                                    "\u0645\u062E\u064A\u0645 \u062D\u0637\u064A\u0646",
                                    "\u0645\u0631\u062C \u0627\u0644\u062D\u0645\u0627\u0645",
                                    "\u0645\u0639\u0627\u0646",
                                    "\u0646\u0627\u0639\u0648\u0631",
                                    "\u0648\u0627\u062F\u064A \u0627\u0644\u0633\u064A\u0631");
                        });

        public Object buildingNumber = ZVal.arrayFromList("#####", "####", "##");

        public Object postcode = ZVal.arrayFromList("#####", "#####-####");

        public Object state =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u0622\u064A\u0648\u0627",
                                    "\u0623\u0631\u0643\u0646\u0633\u0627\u0633",
                                    "\u0623\u0631\u064A\u0632\u0648\u0646\u0627",
                                    "\u0623\u0644\u0627\u0628\u0627\u0645\u0627",
                                    "\u0623\u0644\u0627\u0633\u0643\u0627",
                                    "\u0623\u0648\u0631\u064A\u063A\u0648\u0646",
                                    "\u0623\u0648\u0643\u0644\u0627\u0647\u0648\u0645\u0627",
                                    "\u0623\u0648\u0647\u0627\u064A\u0648",
                                    "\u0623\u064A\u062F\u0627\u0647\u0648",
                                    "\u0625\u0644\u064A\u0646\u0648\u064A",
                                    "\u0625\u0646\u062F\u064A\u0627\u0646\u0627",
                                    "\u0627\u0644\u0627\u0628\u0627\u0645\u0627",
                                    "\u0627\u0644\u062C\u0632\u0631 \u0627\u0644\u0639\u0630\u0631\u0627\u0621 \u0627\u0644\u0623\u0645\u0631\u064A\u0643\u064A\u0629",
                                    "\u0628\u0646\u0633    \u064A\u0644\u0641\u0627\u0646\u064A\u0627",
                                    "\u0628\u0648\u0631\u062A\u0648 \u0631\u064A\u0643\u0648",
                                    "\u062A\u0643\u0633\u0627\u0633",
                                    "\u062A\u064A\u0646\u064A\u0633\u064A",
                                    "\u062C\u0632\u0631 \u0645\u0627\u0631\u064A\u0627\u0646\u0627 \u0627\u0644\u0634\u0645\u0627\u0644\u064A\u0629",
                                    "\u062C\u0648\u0631\u062C\u064A\u0627",
                                    "\u062F\u0627\u0643\u0648\u062A\u0627 \u0627\u0644\u062C\u0646\u0648\u0628\u064A\u0629",
                                    "\u062F\u0627\u0643\u0648\u062A\u0627 \u0627\u0644\u0634\u0645\u0627\u0644\u064A\u0629",
                                    "\u062F\u064A\u0644\u0627\u0648\u064A\u0631",
                                    "\u0631\u0648\u062F \u0622\u064A\u0644\u0627\u0646\u062F",
                                    "\u0633\u0627\u0645\u0648\u0627 \u0627\u0644\u0623\u0645\u0631\u064A\u0643\u064A\u0629",
                                    "\u063A\u0648\u0627\u0645",
                                    "\u0641\u0631\u062C\u064A\u0646\u064A\u0627 \u0627\u0644\u063A\u0631\u0628\u064A\u0629",
                                    "\u0641\u0644\u0648\u0631\u064A\u062F\u0627",
                                    "\u0641\u064A\u0631\u062C\u064A\u0646\u064A\u0627",
                                    "\u0641\u064A\u0631\u062C\u064A\u0646\u064A\u0627 \u0627\u0644\u063A\u0631\u0628\u064A\u0629",
                                    "\u0641\u064A\u0631\u0645\u0648\u0646\u062A",
                                    "\u0643\u0627\u0631\u0648\u0644\u0627\u064A\u0646\u0627 \u0627\u0644\u062C\u0646\u0648\u0628\u064A\u0629",
                                    "\u0643\u0627\u0631\u0648\u0644\u0627\u064A\u0646\u0627 \u0627\u0644\u0634\u0645\u0627\u0644\u064A\u0629",
                                    "\u0643\u0627\u0631\u0648\u0644\u064A\u0646\u0627 \u0627\u0644\u0634\u0645\u0627\u0644\u064A\u0629",
                                    "\u0643\u0627\u0644\u064A\u0641\u0648\u0631\u0646\u064A\u0627",
                                    "\u0643\u0627\u0646\u0633\u0627\u0633",
                                    "\u0643\u0646\u062A\u0627\u0643\u064A",
                                    "\u0643\u0648\u0644\u0648\u0631\u0627\u062F\u0648",
                                    "\u0643\u0648\u0646\u064A\u062A\u064A\u0643\u062A",
                                    "\u0644\u0648\u064A\u0632\u064A\u0627\u0646\u0627",
                                    "\u0645\u0627\u0631\u064A\u0644\u0627\u0646\u062F",
                                    "\u0645\u0627\u0633\u0627\u062A\u0634\u0648\u0633\u062A\u0633",
                                    "\u0645\u0627\u064A\u0646",
                                    "\u0645\u0633\u064A\u0633\u064A\u0628\u064A",
                                    "\u0645\u0648\u0646\u062A\u0627\u0646\u0627",
                                    "\u0645\u064A\u0631\u064A\u0644\u0627\u0646\u062F",
                                    "\u0645\u064A\u0632\u0648\u0631\u064A",
                                    "\u0645\u064A\u0634\u064A\u063A\u0627\u0646",
                                    "\u0645\u064A\u0646",
                                    "\u0645\u064A\u0646\u064A\u0633\u0648\u062A\u0627",
                                    "\u0646\u0628\u0631\u0627\u0633\u0643\u0627",
                                    "\u0646\u064A\u0641\u0627\u062F\u0627",
                                    "\u0646\u064A\u0648 \u062C\u064A\u0631\u0633\u064A",
                                    "\u0646\u064A\u0648 \u0645\u064A\u0643\u0633\u064A\u0643\u0648",
                                    "\u0646\u064A\u0648\u0647\u0627\u0645\u0634\u064A\u0631",
                                    "\u0646\u064A\u0648\u064A\u0648\u0631\u0643",
                                    "\u0647\u0627\u0648\u0627\u064A",
                                    "\u0648\u0627\u0634\u0646\u0637\u0646",
                                    "\u0648\u0627\u064A\u0648\u0645\u0646\u063A",
                                    "\u0648\u064A\u0633\u0643\u0646\u0633\u0646",
                                    "\u064A\u0648\u062A\u0627");
                        });

        public Object stateAbbr =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DC", "DE", "FL",
                                    "GA", "HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", "MA",
                                    "MD", "ME", "MI", "MN", "MO", "MS", "MT", "NC", "ND", "NE",
                                    "NH", "NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "RI",
                                    "SC", "SD", "TN", "TX", "UT", "VA", "VT", "WA", "WI", "WV",
                                    "WY");
                        });

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u0627\u0644\u0643\u0627\u0631\u064A\u0628\u064A",
                                    "\u0623\u0645\u0631\u064A\u0643\u0627 \u0627\u0644\u0648\u0633\u0637\u0649",
                                    "\u0623\u0646\u062A\u064A\u062C\u0648\u0627 \u0648\u0628\u0631\u0628\u0648\u062F\u0627",
                                    "\u0623\u0646\u062C\u0648\u0644\u0627",
                                    "\u0623\u0646\u062C\u0648\u064A\u0644\u0627",
                                    "\u0623\u0646\u062F\u0648\u0631\u0627",
                                    "\u0627\u0646\u062F\u0648\u0646\u064A\u0633\u064A\u0627",
                                    "\u0623\u0648\u0631\u062C\u0648\u0627\u064A",
                                    "\u0623\u0648\u0631\u0648\u0628\u0627",
                                    "\u0623\u0648\u0632\u0628\u0643\u0633\u062A\u0627\u0646",
                                    "\u0623\u0648\u063A\u0646\u062F\u0627",
                                    "\u0623\u0648\u0642\u064A\u0627\u0646\u0648\u0633\u064A\u0627",
                                    "\u0623\u0648\u0642\u064A\u0627\u0646\u0648\u0633\u064A\u0627 \u0627\u0644\u0646\u0627\u0626\u064A\u0629",
                                    "\u0623\u0648\u0643\u0631\u0627\u0646\u064A\u0627",
                                    "\u0627\u064A\u0631\u0627\u0646",
                                    "\u0623\u064A\u0631\u0644\u0646\u062F\u0627",
                                    "\u0623\u064A\u0633\u0644\u0646\u062F\u0627",
                                    "\u0627\u064A\u0637\u0627\u0644\u064A\u0627",
                                    "\u0628\u0627\u0628\u0648\u0627 \u063A\u064A\u0646\u064A\u0627 \u0627\u0644\u062C\u062F\u064A\u062F\u0629",
                                    "\u0628\u0627\u0631\u0627\u062C\u0648\u0627\u064A",
                                    "\u0628\u0627\u0643\u0633\u062A\u0627\u0646",
                                    "\u0628\u0627\u0644\u0627\u0648",
                                    "\u0628\u062A\u0633\u0648\u0627\u0646\u0627",
                                    "\u0628\u062A\u0643\u0627\u064A\u0631\u0646",
                                    "\u0628\u0631\u0628\u0627\u062F\u0648\u0633",
                                    "\u0628\u0631\u0645\u0648\u062F\u0627",
                                    "\u0628\u0631\u0648\u0646\u0627\u064A",
                                    "\u0628\u0644\u062C\u064A\u0643\u0627",
                                    "\u0628\u0644\u063A\u0627\u0631\u064A\u0627",
                                    "\u0628\u0644\u064A\u0632",
                                    "\u0628\u0646\u062C\u0644\u0627\u062F\u064A\u0634",
                                    "\u0628\u0646\u0645\u0627",
                                    "\u0628\u0646\u064A\u0646",
                                    "\u0628\u0648\u062A\u0627\u0646",
                                    "\u0628\u0648\u0631\u062A\u0648\u0631\u064A\u0643\u0648",
                                    "\u0628\u0648\u0631\u0643\u064A\u0646\u0627 \u0641\u0627\u0633\u0648",
                                    "\u0628\u0648\u0631\u0648\u0646\u062F\u064A",
                                    "\u0628\u0648\u0644\u0646\u062F\u0627",
                                    "\u0628\u0648\u0644\u064A\u0641\u064A\u0627",
                                    "\u0628\u0648\u0644\u064A\u0646\u064A\u0632\u064A\u0627",
                                    "\u0628\u0648\u0644\u064A\u0646\u064A\u0632\u064A\u0627 \u0627\u0644\u0641\u0631\u0646\u0633\u064A\u0629",
                                    "\u0628\u064A\u0631\u0648",
                                    "\u062A\u0627\u0646\u0632\u0627\u0646\u064A\u0627",
                                    "\u062A\u0627\u064A\u0644\u0646\u062F",
                                    "\u062A\u0627\u064A\u0648\u0627\u0646",
                                    "\u062A\u0631\u0643\u0645\u0627\u0646\u0633\u062A\u0627\u0646",
                                    "\u062A\u0631\u0643\u064A\u0627",
                                    "\u062A\u0631\u064A\u0646\u064A\u062F\u0627\u062F \u0648\u062A\u0648\u0628\u0627\u063A\u0648",
                                    "\u062A\u0634\u0627\u062F",
                                    "\u062A\u0648\u062C\u0648",
                                    "\u062A\u0648\u0641\u0627\u0644\u0648",
                                    "\u062A\u0648\u0643\u064A\u0644\u0648",
                                    "\u062A\u0648\u0646\u062C\u0627",
                                    "\u062A\u0648\u0646\u0633",
                                    "\u062A\u064A\u0645\u0648\u0631 \u0627\u0644\u0634\u0631\u0642\u064A\u0629",
                                    "\u062C\u0627\u0645\u0627\u064A\u0643\u0627",
                                    "\u062C\u0628\u0644 \u0637\u0627\u0631\u0642",
                                    "\u062C\u0631\u064A\u0646\u0627\u062F\u0627",
                                    "\u062C\u0631\u064A\u0646\u0644\u0627\u0646\u062F",
                                    "\u062C\u0632\u0631 \u0627\u0644\u0623\u0646\u062A\u064A\u0644 \u0627\u0644\u0647\u0648\u0644\u0646\u062F\u064A\u0629",
                                    "\u062C\u0632\u0631 \u0627\u0644\u062A\u0631\u0643 \u0648\u062C\u0627\u064A\u0643\u0648\u0633",
                                    "\u062C\u0632\u0631 \u0627\u0644\u0642\u0645\u0631",
                                    "\u062C\u0632\u0631 \u0627\u0644\u0643\u0627\u064A\u0645\u0646",
                                    "\u062C\u0632\u0631 \u0627\u0644\u0645\u0627\u0631\u0634\u0627\u0644",
                                    "\u062C\u0632\u0631 \u0627\u0644\u0645\u0644\u062F\u064A\u0641",
                                    "\u062C\u0632\u0631 \u0627\u0644\u0648\u0644\u0627\u064A\u0627\u062A \u0627\u0644\u0645\u062A\u062D\u062F\u0629 \u0627\u0644\u0628\u0639\u064A\u062F\u0629 \u0627\u0644\u0635\u063A\u064A\u0631\u0629",
                                    "\u062C\u0632\u0631 \u0623\u0648\u0644\u0627\u0646",
                                    "\u062C\u0632\u0631 \u0633\u0644\u064A\u0645\u0627\u0646",
                                    "\u062C\u0632\u0631 \u0641\u0627\u0631\u0648",
                                    "\u062C\u0632\u0631 \u0641\u0631\u062C\u064A\u0646 \u0627\u0644\u0623\u0645\u0631\u064A\u0643\u064A\u0629",
                                    "\u062C\u0632\u0631 \u0641\u0631\u062C\u064A\u0646 \u0627\u0644\u0628\u0631\u064A\u0637\u0627\u0646\u064A\u0629",
                                    "\u062C\u0632\u0631 \u0641\u0648\u0643\u0644\u0627\u0646\u062F",
                                    "\u062C\u0632\u0631 \u0643\u0648\u0643",
                                    "\u062C\u0632\u0631 \u0643\u0648\u0643\u0648\u0633",
                                    "\u062C\u0632\u0631 \u0645\u0627\u0631\u064A\u0627\u0646\u0627 \u0627\u0644\u0634\u0645\u0627\u0644\u064A\u0629",
                                    "\u062C\u0632\u0631 \u0648\u0627\u0644\u0633 \u0648\u0641\u0648\u062A\u0648\u0646\u0627",
                                    "\u062C\u0632\u064A\u0631\u0629 \u0627\u0644\u0643\u0631\u064A\u0633\u0645\u0627\u0633",
                                    "\u062C\u0632\u064A\u0631\u0629 \u0628\u0648\u0641\u064A\u0647",
                                    "\u062C\u0632\u064A\u0631\u0629 \u0645\u0627\u0646",
                                    "\u062C\u0632\u064A\u0631\u0629 \u0646\u0648\u0631\u0641\u0648\u0643",
                                    "\u062C\u0632\u064A\u0631\u0629 \u0647\u064A\u0631\u062F \u0648\u0645\u0627\u0643\u062F\u0648\u0646\u0627\u0644\u062F",
                                    "\u062C\u0645\u0647\u0648\u0631\u064A\u0629 \u0627\u0641\u0631\u064A\u0642\u064A\u0627 \u0627\u0644\u0648\u0633\u0637\u0649",
                                    "\u062C\u0645\u0647\u0648\u0631\u064A\u0629 \u0627\u0644\u062A\u0634\u064A\u0643",
                                    "\u062C\u0645\u0647\u0648\u0631\u064A\u0629 \u0627\u0644\u062F\u0648\u0645\u064A\u0646\u064A\u0643",
                                    "\u062C\u0645\u0647\u0648\u0631\u064A\u0629 \u0627\u0644\u0643\u0648\u0646\u063A\u0648 \u0627\u0644\u062F\u064A\u0645\u0642\u0631\u0627\u0637\u064A\u0629",
                                    "\u062C\u0645\u0647\u0648\u0631\u064A\u0629 \u062C\u0646\u0648\u0628 \u0627\u0641\u0631\u064A\u0642\u064A\u0627",
                                    "\u062C\u0646\u0648\u0628 \u0622\u0633\u064A\u0627",
                                    "\u062C\u0646\u0648\u0628 \u0623\u0648\u0631\u0648\u0628\u0627",
                                    "\u062C\u0646\u0648\u0628 \u0634\u0631\u0642 \u0622\u0633\u064A\u0627",
                                    "\u062C\u0646\u0648\u0628 \u0648\u0633\u0637 \u0622\u0633\u064A\u0627",
                                    "\u062C\u0648\u0627\u062A\u064A\u0645\u0627\u0644\u0627",
                                    "\u062C\u0648\u0627\u062F\u0644\u0648\u0628",
                                    "\u062C\u0648\u0627\u0645",
                                    "\u062C\u0648\u0631\u062C\u064A\u0627",
                                    "\u062C\u0648\u0631\u062C\u064A\u0627 \u0627\u0644\u062C\u0646\u0648\u0628\u064A\u0629 \u0648\u062C\u0632\u0631 \u0633\u0627\u0646\u062F\u0648\u064A\u062A\u0634 \u0627\u0644\u062C\u0646\u0648\u0628\u064A\u0629",
                                    "\u062C\u064A\u0628\u0648\u062A\u064A",
                                    "\u062C\u064A\u0631\u0633\u064A",
                                    "\u062F\u0648\u0645\u064A\u0646\u064A\u0643\u0627",
                                    "\u0631\u0648\u0627\u0646\u062F\u0627",
                                    "\u0631\u0648\u0633\u064A\u0627",
                                    "\u0631\u0648\u0633\u064A\u0627 \u0627\u0644\u0628\u064A\u0636\u0627\u0621",
                                    "\u0631\u0648\u0645\u0627\u0646\u064A\u0627",
                                    "\u0631\u0648\u064A\u0646\u064A\u0648\u0646",
                                    "\u0632\u0627\u0645\u0628\u064A\u0627",
                                    "\u0632\u064A\u0645\u0628\u0627\u0628\u0648\u064A",
                                    "\u0633\u0627\u062D\u0644 \u0627\u0644\u0639\u0627\u062C",
                                    "\u0633\u0627\u0645\u0648\u0627",
                                    "\u0633\u0627\u0645\u0648\u0627 \u0627\u0644\u0623\u0645\u0631\u064A\u0643\u064A\u0629",
                                    "\u0633\u0627\u0646\u062A \u0628\u064A\u064A\u0631 \u0648\u0645\u064A\u0643\u0648\u0644\u0648\u0646",
                                    "\u0633\u0627\u0646\u062A \u0641\u0646\u0633\u0646\u062A \u0648\u063A\u0631\u0646\u0627\u062F\u064A\u0646",
                                    "\u0633\u0627\u0646\u062A \u0643\u064A\u062A\u0633 \u0648\u0646\u064A\u0641\u064A\u0633",
                                    "\u0633\u0627\u0646\u062A \u0644\u0648\u0633\u064A\u0627",
                                    "\u0633\u0627\u0646\u062A \u0645\u0627\u0631\u062A\u064A\u0646",
                                    "\u0633\u0627\u0646\u062A \u0647\u064A\u0644\u0646\u0627",
                                    "\u0633\u0627\u0646 \u0645\u0627\u0631\u064A\u0646\u0648",
                                    "\u0633\u0627\u0648 \u062A\u0648\u0645\u064A \u0648\u0628\u0631\u064A\u0646\u0633\u064A\u0628\u064A",
                                    "\u0633\u0631\u064A\u0644\u0627\u0646\u0643\u0627",
                                    "\u0633\u0641\u0627\u0644\u0628\u0627\u0631\u062F \u0648\u062C\u0627\u0646 \u0645\u0627\u064A\u0627\u0646",
                                    "\u0633\u0644\u0648\u0641\u0627\u0643\u064A\u0627",
                                    "\u0633\u0644\u0648\u0641\u064A\u0646\u064A\u0627",
                                    "\u0633\u0646\u063A\u0627\u0641\u0648\u0631\u0629",
                                    "\u0633\u0648\u0627\u0632\u064A\u0644\u0627\u0646\u062F",
                                    "\u0633\u0648\u0631\u064A\u0627",
                                    "\u0633\u0648\u0631\u064A\u0646\u0627\u0645",
                                    "\u0633\u0648\u064A\u0633\u0631\u0627",
                                    "\u0633\u064A\u0631\u0627\u0644\u064A\u0648\u0646",
                                    "\u0633\u064A\u0634\u0644",
                                    "\u0634\u0631\u0642 \u0622\u0633\u064A\u0627",
                                    "\u0634\u0631\u0642 \u0627\u0641\u0631\u064A\u0642\u064A\u0627",
                                    "\u0634\u0631\u0642 \u0623\u0648\u0631\u0648\u0628\u0627",
                                    "\u0634\u0645\u0627\u0644 \u0627\u0641\u0631\u064A\u0642\u064A\u0627",
                                    "\u0634\u0645\u0627\u0644 \u0623\u0645\u0631\u064A\u0643\u0627",
                                    "\u0634\u0645\u0627\u0644 \u0623\u0648\u0631\u0648\u0628\u0627",
                                    "\u0634\u064A\u0644\u064A",
                                    "\u0635\u0631\u0628\u064A\u0627",
                                    "\u0635\u0631\u0628\u064A\u0627 \u0648\u0627\u0644\u062C\u0628\u0644 \u0627\u0644\u0623\u0633\u0648\u062F",
                                    "\u0637\u0627\u062C\u0643\u0633\u062A\u0627\u0646",
                                    "\u0639\u0645\u0627\u0646",
                                    "\u063A\u0627\u0645\u0628\u064A\u0627",
                                    "\u063A\u0627\u0646\u0627",
                                    "\u063A\u0631\u0628 \u0622\u0633\u064A\u0627",
                                    "\u063A\u0631\u0628 \u0627\u0641\u0631\u064A\u0642\u064A\u0627",
                                    "\u063A\u0631\u0628 \u0623\u0648\u0631\u0648\u0628\u0627",
                                    "\u063A\u0648\u064A\u0627\u0646\u0627",
                                    "\u063A\u064A\u0627\u0646\u0627",
                                    "\u063A\u064A\u0646\u064A\u0627",
                                    "\u063A\u064A\u0646\u064A\u0627 \u0627\u0644\u0627\u0633\u062A\u0648\u0627\u0626\u064A\u0629",
                                    "\u063A\u064A\u0646\u064A\u0627 \u0628\u064A\u0633\u0627\u0648",
                                    "\u0641\u0627\u0646\u0648\u0627\u062A\u0648",
                                    "\u0641\u0631\u0646\u0633\u0627",
                                    "\u0641\u0644\u0633\u0637\u064A\u0646",
                                    "\u0641\u0646\u0632\u0648\u064A\u0644\u0627",
                                    "\u0641\u0646\u0644\u0646\u062F\u0627",
                                    "\u0641\u064A\u062A\u0646\u0627\u0645",
                                    "\u0641\u064A\u062C\u064A",
                                    "\u0642\u0628\u0631\u0635",
                                    "\u0642\u0631\u063A\u064A\u0632\u0633\u062A\u0627\u0646",
                                    "\u0642\u0637\u0631",
                                    "\u0643\u0627\u0632\u0627\u062E\u0633\u062A\u0627\u0646",
                                    "\u0643\u0627\u0644\u064A\u062F\u0648\u0646\u064A\u0627 \u0627\u0644\u062C\u062F\u064A\u062F\u0629",
                                    "\u0643\u0631\u0648\u0627\u062A\u064A\u0627",
                                    "\u0643\u0645\u0628\u0648\u062F\u064A\u0627",
                                    "\u0643\u0646\u062F\u0627",
                                    "\u0643\u0648\u0628\u0627",
                                    "\u0643\u0648\u0631\u064A\u0627 \u0627\u0644\u062C\u0646\u0648\u0628\u064A\u0629",
                                    "\u0643\u0648\u0631\u064A\u0627 \u0627\u0644\u0634\u0645\u0627\u0644\u064A\u0629",
                                    "\u0643\u0648\u0633\u062A\u0627\u0631\u064A\u0643\u0627",
                                    "\u0643\u0648\u0644\u0648\u0645\u0628\u064A\u0627",
                                    "\u0643\u0648\u0645\u0646\u0648\u0644\u062B \u0627\u0644\u062F\u0648\u0644 \u0627\u0644\u0645\u0633\u062A\u0642\u0644\u0629",
                                    "\u0643\u064A\u0631\u064A\u0628\u0627\u062A\u064A",
                                    "\u0643\u064A\u0646\u064A\u0627",
                                    "\u0644\u0627\u062A\u0641\u064A\u0627",
                                    "\u0644\u0627\u0648\u0633",
                                    "\u0644\u0628\u0646\u0627\u0646",
                                    "\u0644\u0648\u0643\u0633\u0645\u0628\u0648\u0631\u062C",
                                    "\u0644\u064A\u0628\u064A\u0627",
                                    "\u0644\u064A\u0628\u064A\u0631\u064A\u0627",
                                    "\u0644\u064A\u062A\u0648\u0627\u0646\u064A\u0627",
                                    "\u0644\u064A\u062E\u062A\u0646\u0634\u062A\u0627\u064A\u0646",
                                    "\u0644\u064A\u0633\u0648\u062A\u0648",
                                    "\u0645\u0627\u0631\u062A\u064A\u0646\u064A\u0643",
                                    "\u0645\u0627\u0643\u0627\u0648 \u0627\u0644\u0635\u064A\u0646\u064A\u0629",
                                    "\u0645\u0627\u0644\u0637\u0627",
                                    "\u0645\u0627\u0644\u064A",
                                    "\u0645\u0627\u0644\u064A\u0632\u064A\u0627",
                                    "\u0645\u0627\u064A\u0648\u062A",
                                    "\u0645\u062F\u063A\u0634\u0642\u0631",
                                    "\u0645\u0635\u0631",
                                    "\u0645\u0642\u062F\u0648\u0646\u064A\u0627",
                                    "\u0645\u0644\u0627\u0648\u064A",
                                    "\u0645\u0646\u063A\u0648\u0644\u064A\u0627",
                                    "\u0645\u0648\u0631\u064A\u062A\u0627\u0646\u064A\u0627",
                                    "\u0645\u0648\u0631\u064A\u0634\u064A\u0648\u0633",
                                    "\u0645\u0648\u0632\u0645\u0628\u064A\u0642",
                                    "\u0645\u0648\u0644\u062F\u0627\u0641\u064A\u0627",
                                    "\u0645\u0648\u0646\u0627\u0643\u0648",
                                    "\u0645\u0648\u0646\u062A\u0633\u0631\u0627\u062A",
                                    "\u0645\u064A\u0627\u0646\u0645\u0627\u0631",
                                    "\u0645\u064A\u0643\u0631\u0648\u0646\u064A\u0632\u064A\u0627",
                                    "\u0645\u064A\u0644\u0627\u0646\u064A\u0632\u064A\u0627",
                                    "\u0646\u0627\u0645\u064A\u0628\u064A\u0627",
                                    "\u0646\u0648\u0631\u0648",
                                    "\u0646\u064A\u0628\u0627\u0644",
                                    "\u0646\u064A\u062C\u064A\u0631\u064A\u0627",
                                    "\u0646\u064A\u0643\u0627\u0631\u0627\u062C\u0648\u0627",
                                    "\u0646\u064A\u0648\u0632\u064A\u0644\u0627\u0646\u062F\u0627",
                                    "\u0646\u064A\u0648\u064A",
                                    "\u0647\u0627\u064A\u062A\u064A",
                                    "\u0647\u0646\u062F\u0648\u0631\u0627\u0633",
                                    "\u0647\u0648\u0644\u0646\u062F\u0627",
                                    "\u0647\u0648\u0646\u062C \u0643\u0648\u0646\u062C \u0627\u0644\u0635\u064A\u0646\u064A\u0629",
                                    "\u0648\u0633\u0637 \u0622\u0633\u064A\u0627",
                                    "\u0648\u0633\u0637 \u0627\u0641\u0631\u064A\u0642\u064A\u0627");
                        });

        public Object cityFormats =
                ZVal.arrayFromList("{{cityPrefix}} {{cityName}}", "{{cityName}}");

        public Object streetNameFormats =
                ZVal.arrayFromList("{{streetPrefix}} {{firstName}} {{lastName}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList(
                        "{{buildingNumber}} {{streetName}}",
                        "{{buildingNumber}} {{streetName}} {{secondaryAddress}}");

        public Object addressFormats = ZVal.arrayFromList("{{streetAddress}}\n{{city}}");

        public Object secondaryAddressFormats =
                ZVal.arrayFromList(
                        "\u0634\u0642\u0629 \u0631\u0642\u0645. ##",
                        "\u0628\u0646\u0627\u064A\u0629 \u0631\u0642\u0645 ##");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\ar_JO\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "buildingNumber",
                            "cityFormats",
                            "cityName",
                            "cityPrefix",
                            "country",
                            "postcode",
                            "secondaryAddressFormats",
                            "state",
                            "stateAbbr",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetPrefix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/ar_JO/Address.php")
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
