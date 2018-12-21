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

 vendor/fzaninotto/faker/src/Faker/Provider/th_TH/Address.php

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

    public static final Object CONST_class = "Faker\\Provider\\th_TH\\Address";

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
                                                            .th_TH
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .cityPrefix)
                            .value());
        }

        @ConvertedMethod
        public Object province(RuntimeEnv env, Object... args) {
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
                                                            .th_TH
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .province)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object cityPrefix =
                ZVal.arrayFromList(
                        "\u0E40\u0E21\u0E37\u0E2D\u0E07",
                        "\u0E2B\u0E21\u0E39\u0E48\u0E1A\u0E49\u0E32\u0E19",
                        "\u0E17\u0E48\u0E32");

        public Object citySuffix =
                ZVal.arrayFromList(
                        "\u0E40\u0E2B\u0E19\u0E37\u0E2D",
                        "\u0E43\u0E15\u0E49",
                        "\u0E1A\u0E38\u0E23\u0E35");

        public Object buildingNumber = ZVal.arrayFromList("#####", "####", "###", "##", "##/###");

        public Object streetPrefix =
                ZVal.arrayFromList(
                        "\u0E0B\u0E2D\u0E22",
                        "\u0E16\u0E19\u0E19",
                        "\u0E2A\u0E30\u0E1E\u0E32\u0E19",
                        "\u0E27\u0E07\u0E40\u0E27\u0E35\u0E22\u0E19",
                        "\u0E41\u0E22\u0E01");

        public Object postcode = ZVal.arrayFromList("#####");

        public Object province =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u0E01\u0E23\u0E30\u0E1A\u0E35\u0E48",
                                    "\u0E01\u0E23\u0E38\u0E07\u0E40\u0E17\u0E1E\u0E21\u0E2B\u0E32\u0E19\u0E04\u0E23",
                                    "\u0E01\u0E32\u0E0D\u0E08\u0E19\u0E1A\u0E38\u0E23\u0E35",
                                    "\u0E01\u0E32\u0E2C\u0E2A\u0E34\u0E19\u0E18\u0E38\u0E4C",
                                    "\u0E01\u0E33\u0E41\u0E1E\u0E07\u0E40\u0E1E\u0E0A\u0E23",
                                    "\u0E02\u0E2D\u0E19\u0E41\u0E01\u0E48\u0E19",
                                    "\u0E08\u0E31\u0E19\u0E17\u0E1A\u0E38\u0E23\u0E35",
                                    "\u0E09\u0E30\u0E40\u0E0A\u0E34\u0E07\u0E40\u0E17\u0E23\u0E32",
                                    "\u0E0A\u0E25\u0E1A\u0E38\u0E23\u0E35",
                                    "\u0E0A\u0E31\u0E22\u0E19\u0E32\u0E17",
                                    "\u0E0A\u0E31\u0E22\u0E20\u0E39\u0E21\u0E34",
                                    "\u0E0A\u0E38\u0E21\u0E1E\u0E23",
                                    "\u0E15\u0E23\u0E31\u0E07",
                                    "\u0E15\u0E23\u0E32\u0E14",
                                    "\u0E15\u0E32\u0E01",
                                    "\u0E19\u0E04\u0E23\u0E19\u0E32\u0E22\u0E01",
                                    "\u0E19\u0E04\u0E23\u0E1B\u0E10\u0E21",
                                    "\u0E19\u0E04\u0E23\u0E1E\u0E19\u0E21",
                                    "\u0E19\u0E04\u0E23\u0E23\u0E32\u0E0A\u0E2A\u0E35\u0E21\u0E32",
                                    "\u0E19\u0E04\u0E23\u0E28\u0E23\u0E35\u0E18\u0E23\u0E23\u0E21\u0E23\u0E32\u0E0A",
                                    "\u0E19\u0E04\u0E23\u0E2A\u0E27\u0E23\u0E23\u0E04\u0E4C",
                                    "\u0E19\u0E19\u0E17\u0E1A\u0E38\u0E23\u0E35",
                                    "\u0E19\u0E23\u0E32\u0E18\u0E34\u0E27\u0E32\u0E2A",
                                    "\u0E19\u0E48\u0E32\u0E19",
                                    "\u0E1A\u0E36\u0E07\u0E01\u0E32\u0E2C",
                                    "\u0E1A\u0E38\u0E23\u0E35\u0E23\u0E31\u0E21\u0E22\u0E4C",
                                    "\u0E1B\u0E17\u0E38\u0E21\u0E18\u0E32\u0E19\u0E35",
                                    "\u0E1B\u0E23\u0E30\u0E08\u0E27\u0E1A\u0E04\u0E35\u0E23\u0E35\u0E02\u0E31\u0E19\u0E18\u0E4C",
                                    "\u0E1B\u0E23\u0E32\u0E08\u0E35\u0E19\u0E1A\u0E38\u0E23\u0E35",
                                    "\u0E1B\u0E31\u0E15\u0E15\u0E32\u0E19\u0E35",
                                    "\u0E1E\u0E23\u0E30\u0E19\u0E04\u0E23\u0E28\u0E23\u0E35\u0E2D\u0E22\u0E38\u0E18\u0E22\u0E32",
                                    "\u0E1E\u0E30\u0E40\u0E22\u0E32",
                                    "\u0E1E\u0E31\u0E07\u0E07\u0E32",
                                    "\u0E1E\u0E31\u0E17\u0E25\u0E38\u0E07",
                                    "\u0E1E\u0E34\u0E08\u0E34\u0E15\u0E23",
                                    "\u0E1E\u0E34\u0E29\u0E13\u0E38\u0E42\u0E25\u0E01",
                                    "\u0E20\u0E39\u0E40\u0E01\u0E47\u0E15",
                                    "\u0E21\u0E2B\u0E32\u0E2A\u0E32\u0E23\u0E04\u0E32\u0E21",
                                    "\u0E21\u0E38\u0E01\u0E14\u0E32\u0E2B\u0E32\u0E23",
                                    "\u0E22\u0E30\u0E25\u0E32",
                                    "\u0E22\u0E42\u0E2A\u0E18\u0E23",
                                    "\u0E23\u0E30\u0E19\u0E2D\u0E07",
                                    "\u0E23\u0E30\u0E22\u0E2D\u0E07",
                                    "\u0E23\u0E32\u0E0A\u0E1A\u0E38\u0E23\u0E35",
                                    "\u0E23\u0E49\u0E2D\u0E22\u0E40\u0E2D\u0E47\u0E14",
                                    "\u0E25\u0E1E\u0E1A\u0E38\u0E23\u0E35",
                                    "\u0E25\u0E33\u0E1B\u0E32\u0E07",
                                    "\u0E25\u0E33\u0E1E\u0E39\u0E19",
                                    "\u0E28\u0E23\u0E35\u0E2A\u0E30\u0E40\u0E01\u0E29",
                                    "\u0E2A\u0E01\u0E25\u0E19\u0E04\u0E23",
                                    "\u0E2A\u0E07\u0E02\u0E25\u0E32",
                                    "\u0E2A\u0E15\u0E39\u0E25",
                                    "\u0E2A\u0E21\u0E38\u0E17\u0E23\u0E1B\u0E23\u0E32\u0E01\u0E32\u0E23",
                                    "\u0E2A\u0E21\u0E38\u0E17\u0E23\u0E2A\u0E07\u0E04\u0E23\u0E32\u0E21",
                                    "\u0E2A\u0E21\u0E38\u0E17\u0E23\u0E2A\u0E32\u0E04\u0E23",
                                    "\u0E2A\u0E23\u0E30\u0E1A\u0E38\u0E23\u0E35",
                                    "\u0E2A\u0E23\u0E30\u0E41\u0E01\u0E49\u0E27",
                                    "\u0E2A\u0E34\u0E07\u0E2B\u0E4C\u0E1A\u0E38\u0E23\u0E35",
                                    "\u0E2A\u0E38\u0E1E\u0E23\u0E23\u0E13\u0E1A\u0E38\u0E23\u0E35",
                                    "\u0E2A\u0E38\u0E23\u0E32\u0E29\u0E0E\u0E23\u0E4C\u0E18\u0E32\u0E19\u0E35",
                                    "\u0E2A\u0E38\u0E23\u0E34\u0E19\u0E17\u0E23\u0E4C",
                                    "\u0E2A\u0E38\u0E42\u0E02\u0E17\u0E31\u0E22",
                                    "\u0E2B\u0E19\u0E2D\u0E07\u0E04\u0E32\u0E22",
                                    "\u0E2B\u0E19\u0E2D\u0E07\u0E1A\u0E31\u0E27\u0E25\u0E33\u0E20\u0E39",
                                    "\u0E2D\u0E33\u0E19\u0E32\u0E08\u0E40\u0E08\u0E23\u0E34\u0E0D",
                                    "\u0E2D\u0E38\u0E14\u0E23\u0E18\u0E32\u0E19\u0E35",
                                    "\u0E2D\u0E38\u0E15\u0E23\u0E14\u0E34\u0E15\u0E16\u0E4C",
                                    "\u0E2D\u0E38\u0E17\u0E31\u0E22\u0E18\u0E32\u0E19\u0E35",
                                    "\u0E2D\u0E38\u0E1A\u0E25\u0E23\u0E32\u0E0A\u0E18\u0E32\u0E19\u0E35",
                                    "\u0E2D\u0E48\u0E32\u0E07\u0E17\u0E2D\u0E07",
                                    "\u0E40\u0E0A\u0E35\u0E22\u0E07\u0E23\u0E32\u0E22",
                                    "\u0E40\u0E0A\u0E35\u0E22\u0E07\u0E43\u0E2B\u0E21\u0E48",
                                    "\u0E40\u0E1E\u0E0A\u0E23\u0E1A\u0E38\u0E23\u0E35",
                                    "\u0E40\u0E1E\u0E0A\u0E23\u0E1A\u0E39\u0E23\u0E13\u0E4C",
                                    "\u0E40\u0E25\u0E22",
                                    "\u0E41\u0E1E\u0E23\u0E48",
                                    "\u0E41\u0E21\u0E48\u0E2E\u0E48\u0E2D\u0E07\u0E2A\u0E2D\u0E19");
                        });

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u0E01\u0E23\u0E35\u0E0B",
                                    "\u0E01\u0E31\u0E21\u0E1E\u0E39\u0E0A\u0E32",
                                    "\u0E01\u0E31\u0E27\u0E40\u0E15\u0E21\u0E32\u0E25\u0E32",
                                    "\u0E01\u0E32\u0E15\u0E32\u0E23\u0E4C",
                                    "\u0E04\u0E2D\u0E0B\u0E2D\u0E27\u0E2D",
                                    "\u0E04\u0E32\u0E0B\u0E31\u0E04\u0E2A\u0E16\u0E32\u0E19",
                                    "\u0E04\u0E34\u0E23\u0E34\u0E1A\u0E32\u0E2A",
                                    "\u0E04\u0E34\u0E27\u0E1A\u0E32",
                                    "\u0E04\u0E35\u0E23\u0E4C\u0E01\u0E35\u0E0B\u0E2A\u0E16\u0E32\u0E19",
                                    "\u0E04\u0E39\u0E40\u0E27\u0E15",
                                    "\u0E08\u0E2D\u0E23\u0E4C\u0E40\u0E08\u0E35\u0E22",
                                    "\u0E08\u0E2D\u0E23\u0E4C\u0E41\u0E14\u0E19",
                                    "\u0E08\u0E32\u0E40\u0E21\u0E01\u0E32",
                                    "\u0E08\u0E35\u0E19",
                                    "\u0E0A\u0E34\u0E25\u0E35",
                                    "\u0E0B\u0E32\u0E19\u0E21\u0E32\u0E23\u0E35\u0E42\u0E19",
                                    "\u0E0B\u0E32\u0E21\u0E31\u0E27",
                                    "\u0E0B\u0E32\u0E2D\u0E38\u0E14\u0E35\u0E2D\u0E32\u0E23\u0E30\u0E40\u0E1A\u0E35\u0E22",
                                    "\u0E0B\u0E35\u0E40\u0E23\u0E35\u0E22",
                                    "\u0E0B\u0E39\u0E23\u0E34\u0E19\u0E32\u0E21",
                                    "\u0E0D\u0E35\u0E48\u0E1B\u0E38\u0E48\u0E19",
                                    "\u0E14\u0E2D\u0E21\u0E34\u0E19\u0E35\u0E01\u0E32",
                                    "\u0E15\u0E23\u0E34\u0E19\u0E34\u0E41\u0E14\u0E14\u0E41\u0E25\u0E30\u0E42\u0E15\u0E40\u0E1A\u0E42\u0E01",
                                    "\u0E15\u0E2D\u0E07\u0E01\u0E32",
                                    "\u0E15\u0E34\u0E21\u0E2D\u0E23\u0E4C-\u0E40\u0E25\u0E2A\u0E40\u0E15",
                                    "\u0E15\u0E38\u0E23\u0E01\u0E35",
                                    "\u0E15\u0E39\u0E27\u0E32\u0E25\u0E39",
                                    "\u0E17\u0E32\u0E08\u0E34\u0E01\u0E34\u0E2A\u0E16\u0E32\u0E19",
                                    "\u0E19\u0E04\u0E23\u0E23\u0E31\u0E10\u0E27\u0E32\u0E15\u0E34\u0E01\u0E31\u0E19",
                                    "\u0E19\u0E2D\u0E23\u0E4C\u0E40\u0E27\u0E22\u0E4C",
                                    "\u0E19\u0E32\u0E2D\u0E39\u0E23\u0E39",
                                    "\u0E19\u0E34\u0E01\u0E32\u0E23\u0E32\u0E01\u0E31\u0E27",
                                    "\u0E19\u0E34\u0E27\u0E0B\u0E35\u0E41\u0E25\u0E19\u0E14\u0E4C",
                                    "\u0E1A\u0E23\u0E32\u0E0B\u0E34\u0E25",
                                    "\u0E1A\u0E23\u0E39\u0E44\u0E19\u0E14\u0E32\u0E23\u0E38\u0E2A\u0E0B\u0E32\u0E25\u0E32\u0E21",
                                    "\u0E1A\u0E2D\u0E2A\u0E40\u0E19\u0E35\u0E22\u0E41\u0E25\u0E30\u0E40\u0E2E\u0E2D\u0E23\u0E4C\u0E40\u0E0B\u0E42\u0E01\u0E27\u0E35\u0E19\u0E32",
                                    "\u0E1A\u0E31\u0E07\u0E01\u0E25\u0E32\u0E40\u0E17\u0E28",
                                    "\u0E1A\u0E31\u0E25\u0E41\u0E01\u0E40\u0E23\u0E35\u0E22",
                                    "\u0E1A\u0E32\u0E23\u0E4C\u0E40\u0E1A\u0E42\u0E14\u0E2A",
                                    "\u0E1A\u0E32\u0E2B\u0E4C\u0E40\u0E23\u0E19",
                                    "\u0E1A\u0E32\u0E2E\u0E32\u0E21\u0E32\u0E2A",
                                    "\u0E1B\u0E32\u0E01\u0E35\u0E2A\u0E16\u0E32\u0E19",
                                    "\u0E1B\u0E32\u0E19\u0E32\u0E21\u0E32",
                                    "\u0E1B\u0E32\u0E1B\u0E31\u0E27\u0E19\u0E34\u0E27\u0E01\u0E34\u0E19\u0E35",
                                    "\u0E1B\u0E32\u0E23\u0E32\u0E01\u0E27\u0E31\u0E22",
                                    "\u0E1B\u0E32\u0E40\u0E25\u0E32",
                                    "\u0E1D\u0E23\u0E31\u0E48\u0E07\u0E40\u0E28\u0E2A",
                                    "\u0E1E\u0E21\u0E48\u0E32",
                                    "\u0E1F\u0E34\u0E08\u0E34",
                                    "\u0E1F\u0E34\u0E19\u0E41\u0E25\u0E19\u0E14\u0E4C",
                                    "\u0E1F\u0E34\u0E25\u0E34\u0E1B\u0E1B\u0E34\u0E19\u0E2A\u0E4C",
                                    "\u0E20\u0E39\u0E0F\u0E32\u0E19",
                                    "\u0E21\u0E2D\u0E07\u0E42\u0E01\u0E40\u0E25\u0E35\u0E22",
                                    "\u0E21\u0E2D\u0E19\u0E40\u0E15\u0E40\u0E19\u0E42\u0E01\u0E23",
                                    "\u0E21\u0E2D\u0E25\u0E15\u0E32",
                                    "\u0E21\u0E2D\u0E25\u0E42\u0E14\u0E27\u0E32",
                                    "\u0E21\u0E31\u0E25\u0E14\u0E35\u0E1F\u0E2A\u0E4C",
                                    "\u0E21\u0E32\u0E40\u0E25\u0E40\u0E0B\u0E35\u0E22",
                                    "\u0E22\u0E39\u0E40\u0E04\u0E23\u0E19",
                                    "\u0E23\u0E31\u0E2A\u0E40\u0E0B\u0E35\u0E22",
                                    "\u0E25\u0E31\u0E01\u0E40\u0E0B\u0E21\u0E40\u0E1A\u0E34\u0E23\u0E4C\u0E01",
                                    "\u0E25\u0E31\u0E15\u0E40\u0E27\u0E35\u0E22",
                                    "\u0E25\u0E32\u0E27",
                                    "\u0E25\u0E34\u0E01\u0E40\u0E15\u0E19\u0E2A\u0E44\u0E15\u0E19\u0E4C",
                                    "\u0E25\u0E34\u0E17\u0E31\u0E27\u0E40\u0E19\u0E35\u0E22",
                                    "\u0E28\u0E23\u0E35\u0E25\u0E31\u0E07\u0E01\u0E32",
                                    "\u0E2A\u0E27\u0E34\u0E15\u0E40\u0E0B\u0E2D\u0E23\u0E4C\u0E41\u0E25\u0E19\u0E14\u0E4C",
                                    "\u0E2A\u0E27\u0E35\u0E40\u0E14\u0E19",
                                    "\u0E2A\u0E2B\u0E23\u0E31\u0E10\u0E2D\u0E32\u0E2B\u0E23\u0E31\u0E1A\u0E40\u0E2D\u0E21\u0E34\u0E40\u0E23\u0E15\u0E2A\u0E4C",
                                    "\u0E2A\u0E2B\u0E23\u0E31\u0E10\u0E2D\u0E40\u0E21\u0E23\u0E34\u0E01\u0E32",
                                    "\u0E2A\u0E2B\u0E23\u0E32\u0E0A\u0E2D\u0E32\u0E13\u0E32\u0E08\u0E31\u0E01\u0E23",
                                    "\u0E2A\u0E32\u0E18\u0E32\u0E23\u0E13\u0E23\u0E31\u0E10\u0E21\u0E32\u0E0B\u0E34\u0E42\u0E14\u0E40\u0E19\u0E35\u0E22",
                                    "\u0E2A\u0E32\u0E18\u0E32\u0E23\u0E13\u0E23\u0E31\u0E10\u0E40\u0E0A\u0E47\u0E01",
                                    "\u0E2A\u0E32\u0E18\u0E32\u0E23\u0E13\u0E23\u0E31\u0E10\u0E42\u0E14\u0E21\u0E34\u0E19\u0E34\u0E01\u0E31\u0E19",
                                    "\u0E2A\u0E34\u0E07\u0E04\u0E42\u0E1B\u0E23\u0E4C",
                                    "\u0E2A\u0E40\u0E1B\u0E19",
                                    "\u0E2A\u0E42\u0E25\u0E27\u0E32\u0E40\u0E01\u0E35\u0E22",
                                    "\u0E2A\u0E42\u0E25\u0E27\u0E35\u0E40\u0E19\u0E35\u0E22",
                                    "\u0E2B\u0E21\u0E39\u0E48\u0E40\u0E01\u0E32\u0E30\u0E21\u0E32\u0E23\u0E4C\u0E41\u0E0A\u0E25\u0E25\u0E4C",
                                    "\u0E2B\u0E21\u0E39\u0E48\u0E40\u0E01\u0E32\u0E30\u0E42\u0E0B\u0E42\u0E25\u0E21\u0E2D\u0E19",
                                    "\u0E2D\u0E2D\u0E2A\u0E40\u0E15\u0E23\u0E35\u0E22",
                                    "\u0E2D\u0E2D\u0E2A\u0E40\u0E15\u0E23\u0E40\u0E25\u0E35\u0E22",
                                    "\u0E2D\u0E31\u0E19\u0E14\u0E2D\u0E23\u0E4C\u0E23\u0E32",
                                    "\u0E2D\u0E31\u0E1F\u0E01\u0E32\u0E19\u0E34\u0E2A\u0E16\u0E32\u0E19",
                                    "\u0E2D\u0E32\u0E23\u0E4C\u0E21\u0E35\u0E40\u0E19\u0E35\u0E22",
                                    "\u0E2D\u0E32\u0E23\u0E4C\u0E40\u0E08\u0E19\u0E15\u0E34\u0E19\u0E32",
                                    "\u0E2D\u0E32\u0E40\u0E0B\u0E2D\u0E23\u0E4C\u0E44\u0E1A\u0E08\u0E32\u0E19",
                                    "\u0E2D\u0E34\u0E15\u0E32\u0E25\u0E35",
                                    "\u0E2D\u0E34\u0E19\u0E40\u0E14\u0E35\u0E22",
                                    "\u0E2D\u0E34\u0E19\u0E42\u0E14\u0E19\u0E35\u0E40\u0E0B\u0E35\u0E22",
                                    "\u0E2D\u0E34\u0E23\u0E31\u0E01",
                                    "\u0E2D\u0E34\u0E2A\u0E23\u0E32\u0E40\u0E2D\u0E25",
                                    "\u0E2D\u0E34\u0E2B\u0E23\u0E48\u0E32\u0E19",
                                    "\u0E2D\u0E38\u0E0B\u0E40\u0E1A\u0E01\u0E34\u0E2A\u0E16\u0E32\u0E19",
                                    "\u0E2D\u0E38\u0E23\u0E38\u0E01\u0E27\u0E31\u0E22",
                                    "\u0E2E\u0E2D\u0E19\u0E14\u0E39\u0E23\u0E31\u0E2A",
                                    "\u0E2E\u0E31\u0E07\u0E01\u0E32\u0E23\u0E35",
                                    "\u0E40\u0E01\u0E23\u0E40\u0E19\u0E14\u0E32",
                                    "\u0E40\u0E01\u0E32\u0E2B\u0E25\u0E35\u0E40\u0E2B\u0E19\u0E37\u0E2D",
                                    "\u0E40\u0E01\u0E32\u0E2B\u0E25\u0E35\u0E43\u0E15\u0E49",
                                    "\u0E40\u0E0B\u0E19\u0E15\u0E4C\u0E04\u0E34\u0E15\u0E2A\u0E4C\u0E41\u0E25\u0E30\u0E40\u0E19\u0E27\u0E34\u0E2A",
                                    "\u0E40\u0E0B\u0E19\u0E15\u0E4C\u0E25\u0E39\u0E40\u0E0B\u0E35\u0E22",
                                    "\u0E40\u0E0B\u0E19\u0E15\u0E4C\u0E27\u0E34\u0E19\u0E40\u0E0B\u0E19\u0E15\u0E4C\u0E41\u0E25\u0E30\u0E40\u0E01\u0E23\u0E19\u0E32\u0E14\u0E35\u0E19\u0E2A\u0E4C",
                                    "\u0E40\u0E0B\u0E2D\u0E23\u0E4C\u0E40\u0E1A\u0E35\u0E22",
                                    "\u0E40\u0E14\u0E19\u0E21\u0E32\u0E23\u0E4C\u0E01",
                                    "\u0E40\u0E15\u0E34\u0E23\u0E4C\u0E01\u0E40\u0E21\u0E19\u0E34\u0E2A\u0E16\u0E32\u0E19",
                                    "\u0E40\u0E19\u0E1B\u0E32\u0E25",
                                    "\u0E40\u0E19\u0E40\u0E18\u0E2D\u0E23\u0E4C\u0E41\u0E25\u0E19\u0E14\u0E4C",
                                    "\u0E40\u0E1A\u0E25\u0E32\u0E23\u0E38\u0E2A",
                                    "\u0E40\u0E1A\u0E25\u0E35\u0E0B",
                                    "\u0E40\u0E1A\u0E25\u0E40\u0E22\u0E35\u0E22\u0E21",
                                    "\u0E40\u0E1B\u0E23\u0E39",
                                    "\u0E40\u0E21\u0E47\u0E01\u0E0B\u0E34\u0E42\u0E01",
                                    "\u0E40\u0E22\u0E2D\u0E23\u0E21\u0E19\u0E35",
                                    "\u0E40\u0E22\u0E40\u0E21\u0E19",
                                    "\u0E40\u0E25\u0E1A\u0E32\u0E19\u0E2D\u0E19",
                                    "\u0E40\u0E27\u0E35\u0E22\u0E14\u0E19\u0E32\u0E21",
                                    "\u0E40\u0E27\u0E40\u0E19\u0E0B\u0E38\u0E40\u0E2D\u0E25\u0E32",
                                    "\u0E40\u0E2D\u0E01\u0E27\u0E32\u0E14\u0E2D\u0E23\u0E4C",
                                    "\u0E40\u0E2D\u0E25\u0E0B\u0E31\u0E25\u0E27\u0E32\u0E14\u0E2D\u0E23\u0E4C",
                                    "\u0E40\u0E2D\u0E2A\u0E42\u0E15\u0E40\u0E19\u0E35\u0E22",
                                    "\u0E40\u0E2E\u0E15\u0E34",
                                    "\u0E41\u0E04\u0E19\u0E32\u0E14\u0E32",
                                    "\u0E41\u0E2D\u0E19\u0E15\u0E34\u0E01\u0E32\u0E41\u0E25\u0E30\u0E1A\u0E32\u0E23\u0E4C\u0E1A\u0E39\u0E14\u0E32",
                                    "\u0E41\u0E2D\u0E25\u0E40\u0E1A\u0E40\u0E19\u0E35\u0E22",
                                    "\u0E42\u0E04\u0E23\u0E40\u0E2D\u0E40\u0E0A\u0E35\u0E22",
                                    "\u0E42\u0E04\u0E25\u0E2D\u0E21\u0E40\u0E1A\u0E35\u0E22",
                                    "\u0E42\u0E1A\u0E25\u0E34\u0E40\u0E27\u0E35\u0E22",
                                    "\u0E42\u0E1B\u0E23\u0E15\u0E38\u0E40\u0E01\u0E2A",
                                    "\u0E42\u0E1B\u0E41\u0E25\u0E19\u0E14\u0E4C",
                                    "\u0E42\u0E21\u0E19\u0E32\u0E42\u0E01",
                                    "\u0E42\u0E23\u0E21\u0E32\u0E40\u0E19\u0E35\u0E22",
                                    "\u0E42\u0E2D\u0E21\u0E32\u0E19",
                                    "\u0E44\u0E0B\u0E1B\u0E23\u0E31\u0E2A",
                                    "\u0E44\u0E17\u0E22",
                                    "\u0E44\u0E21\u0E42\u0E04\u0E23\u0E19\u0E35\u0E40\u0E0B\u0E35\u0E22",
                                    "\u0E44\u0E2D\u0E0B\u0E4C\u0E41\u0E25\u0E19\u0E14\u0E4C",
                                    "\u0E44\u0E2D\u0E23\u0E4C\u0E41\u0E25\u0E19\u0E14\u0E4C");
                        });

        public Object cityFormats =
                ZVal.arrayFromList(
                        "{{cityPrefix}} {{firstName}}{{citySuffix}}",
                        "{{cityPrefix}} {{firstName}}",
                        "{{firstName}}{{citySuffix}}",
                        "{{lastName}}{{citySuffix}}");

        public Object streetNameFormats =
                ZVal.arrayFromList(
                        "{{firstName}} {{streetSuffix}}", "{{lastName}} {{streetSuffix}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList("{{buildingNumber}} {{streetName}}");

        public Object addressFormats =
                ZVal.arrayFromList("{{streetAddress}}\n{{city}}, {{postcode}}");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\th_TH\\Address")
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
                            "country",
                            "postcode",
                            "province",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetPrefix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/th_TH/Address.php")
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
