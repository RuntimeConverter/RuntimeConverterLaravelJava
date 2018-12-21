package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.hy_AM.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/hy_AM/Address.php

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
    public Object address(RuntimeEnv env, Object... args) {
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
                                                                .hy_AM
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "addressFormats")))
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
                                                        .hy_AM
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .addressFormats)
                        .value();
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Address.class,
                        format));
    }

    @ConvertedMethod
    public Object city(RuntimeEnv env, Object... args) {
        return ZVal.assign(
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
                                                                .hy_AM
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "city")))
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
                                                        .hy_AM
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .city)
                        .value());
    }

    @ConvertedMethod
    public Object streetPrefix(RuntimeEnv env, Object... args) {
        return ZVal.assign(
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
                                                                .hy_AM
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "streetPrefix")))
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
                                                        .hy_AM
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .streetPrefix)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\hy_AM\\Address";

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
        public Object buildingNumber(RuntimeEnv env, Object... args) {
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
                                                                            .hy_AM
                                                                            .classes
                                                                            .Address
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .buildingNumber)
                                            .value())
                            .value());
        }

        @ConvertedMethod
        public Object country(RuntimeEnv env, Object... args) {
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
                                                            .hy_AM
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .country)
                            .value());
        }

        @ConvertedMethod
        public Object postcode(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("toUpper")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Address.class)
                                            .method("bothify")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(
                                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                    env, this, Address.class)
                                                            .method("randomElement")
                                                            .addReferenceArgs(
                                                                    new RuntimeArgsWithReferences())
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
                                                                                            .hy_AM
                                                                                            .classes
                                                                                            .Address
                                                                                            .RequestStaticProperties
                                                                                            .class)
                                                                            .postcode)
                                                            .value())
                                            .value())
                            .value());
        }

        @ConvertedMethod
        public Object regionSuffix(RuntimeEnv env, Object... args) {
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
                                                            .hy_AM
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .regionSuffix)
                            .value());
        }

        @ConvertedMethod
        public Object region(RuntimeEnv env, Object... args) {
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
                                                            .hy_AM
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .region)
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
                                                            .hy_AM
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .cityPrefix)
                            .value());
        }

        @ConvertedMethod
        public Object street(RuntimeEnv env, Object... args) {
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
                                                            .hy_AM
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .street)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object cityPrefix =
                ZVal.arrayFromList(
                        "\u0584\u0561\u0572\u0561\u0584", "\u0563\u0575\u0578\u0582\u0572");

        public Object regionSuffix = ZVal.arrayFromList("\u0574\u0561\u0580\u0566");

        public Object streetPrefix = ZVal.arrayFromList("\u0583\u0578\u0572\u0578\u0581");

        public Object buildingNumber = ZVal.arrayFromList("##");

        public Object postcode = ZVal.arrayFromList("00##");

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u0544\u0578\u0576\u0561\u056F\u0578",
                                    "\u054D\u056B\u0576\u0563\u0561\u057A\u0578\u0582\u0580",
                                    "\u054E\u0561\u057F\u056B\u056F\u0561\u0576",
                                    "\u0544\u0561\u056C\u0564\u056B\u057E\u0576\u0565\u0580",
                                    "\u0544\u0561\u056C\u0569\u0561",
                                    "\u0532\u0561\u0570\u0580\u0565\u0575\u0576",
                                    "\u0532\u0561\u0576\u0563\u056C\u0561\u0564\u0565\u0577",
                                    "\u0532\u0561\u0580\u0562\u0561\u0564\u0578\u057D",
                                    "\u0549\u056B\u0576\u0561\u057D\u057F\u0561\u0576\u056B \u0540\u0561\u0576\u0580\u0561\u057A\u0565\u057F\u0578\u0582\u0569\u0575\u0578\u0582\u0576",
                                    "\u054D\u0561\u0576 \u0544\u0561\u0580\u056B\u0576\u0578",
                                    "\u0540\u0561\u0580\u0561\u057E\u0561\u0575\u056B\u0576 \u053F\u0578\u0580\u0565\u0561",
                                    "\u0546\u056B\u0564\u0565\u0580\u056C\u0561\u0576\u0564\u0576\u0565\u0580",
                                    "\u053C\u056B\u0562\u0561\u0576\u0561\u0576",
                                    "\u0544\u0561\u0580\u0577\u0561\u056C\u0575\u0561\u0576 \u056F\u0572\u0566\u056B\u0576\u0565\u0580",
                                    "\u0540\u0576\u0564\u056F\u0561\u057D\u057F\u0561\u0576",
                                    "\u053F\u0578\u0574\u0578\u0580\u0576\u0565\u0580",
                                    "\u053B\u057D\u0580\u0561\u0575\u0565\u056C",
                                    "\u0532\u0578\u0582\u0580\u0578\u0582\u0576\u0564\u056B",
                                    "\u0540\u0561\u056B\u0569\u056B",
                                    "\u0532\u0565\u056C\u0563\u056B\u0561",
                                    "\u0543\u0561\u057A\u0578\u0576\u056B\u0561",
                                    "\u0556\u056B\u056C\u056B\u057A\u056B\u0576\u0576\u0565\u0580",
                                    "\u0547\u0580\u056B \u053C\u0561\u0576\u056F\u0561",
                                    "\u0533\u0580\u0565\u0576\u0561\u0564\u0561",
                                    "\u054D\u0561\u056C\u057E\u0561\u0564\u0578\u0580",
                                    "\u054E\u056B\u0565\u057F\u0576\u0561\u0574",
                                    "\u0543\u0561\u0574\u0561\u0575\u056F\u0561",
                                    "\u0531\u0576\u0563\u056C\u056B\u0561",
                                    "\u054F\u0580\u056B\u0576\u056B\u0564\u0561\u0564 \u0587 \u054F\u0578\u0562\u0561\u0563\u0578",
                                    "\u0533\u0565\u0580\u0574\u0561\u0576\u056B\u0561",
                                    "\u054A\u0561\u056F\u056B\u057D\u057F\u0561\u0576",
                                    "\u0546\u0565\u057A\u0561\u056C",
                                    "\u0534\u0578\u0574\u056B\u0576\u056B\u056F\u0561\u0576\u0561",
                                    "\u0531\u0576\u057F\u056B\u0563\u0578\u0582\u0561 \u0587 \u0532\u0561\u0580\u0562\u0578\u0582\u0564\u0561",
                                    "\u053B\u057F\u0561\u056C\u056B\u0561",
                                    "\u053C\u0575\u0578\u0582\u0584\u057D\u0565\u0574\u0562\u0578\u0582\u0580\u0563",
                                    "\u0547\u057E\u0565\u0575\u0581\u0561\u0580\u056B\u0561",
                                    "\u0531\u0576\u0564\u0578\u0580\u0580\u0561",
                                    "\u0546\u056B\u0563\u0565\u0580\u056B\u0561",
                                    "\u0533\u0561\u0574\u0562\u056B\u0561",
                                    "\u0554\u0578\u0582\u057E\u0565\u0575\u0569",
                                    "\u0544\u056B\u056F\u0580\u0578\u0576\u0565\u0566\u056B\u0561",
                                    "\u0548\u0582\u0563\u0561\u0576\u0564\u0561",
                                    "\u0549\u056B\u0576\u0561\u057D\u057F\u0561\u0576",
                                    "\u0539\u0561\u056B\u056C\u0561\u0576\u0564",
                                    "\u0544\u0561\u056C\u0561\u057E\u056B",
                                    "\u0549\u0565\u056D\u056B\u0561",
                                    "\u0544\u0578\u056C\u0564\u0578\u057E\u0561",
                                    "\u0534\u0561\u0576\u056B\u0561",
                                    "\u053B\u0576\u0564\u0578\u0576\u0565\u0566\u056B\u0561",
                                    "\u0533\u057E\u0561\u057F\u0565\u0574\u0561\u056C\u0561",
                                    "\u053C\u0565\u0570\u0561\u057D\u057F\u0561\u0576",
                                    "\u054D\u056B\u0580\u056B\u0561",
                                    "\u053F\u056B\u057A\u0580\u0578\u057D",
                                    "\u0556\u0580\u0561\u0576\u057D\u056B\u0561",
                                    "\u054A\u0578\u0580\u057F\u0578\u0582\u0563\u0561\u056C\u056B\u0561",
                                    "\u054F\u0578\u0563\u0578",
                                    "\u054D\u056C\u0578\u057E\u0561\u056F\u056B\u0561",
                                    "\u0540\u0578\u0582\u0576\u0563\u0561\u0580\u056B\u0561",
                                    "\u0531\u056C\u0562\u0561\u0576\u056B\u0561",
                                    "\u053F\u0578\u0582\u0562\u0561",
                                    "\u0533\u0561\u0576\u0561",
                                    "\u0540\u0561\u0575\u0561\u057D\u057F\u0561\u0576",
                                    "\u0539\u0578\u0582\u0580\u0584\u056B\u0561",
                                    "\u054D\u056C\u0578\u057E\u0565\u0576\u056B\u0561",
                                    "\u0531\u057E\u057D\u057F\u0580\u056B\u0561",
                                    "\u0531\u0564\u0580\u0562\u0565\u057B\u0561\u0576",
                                    "\u054D\u0565\u0580\u0562\u056B\u0561",
                                    "\u054C\u0578\u0582\u0574\u056B\u0576\u056B\u0561",
                                    "\u053B\u057D\u057A\u0561\u0576\u056B\u0561",
                                    "\u0532\u0578\u057D\u0576\u056B\u0561 \u0587 \u0540\u0565\u0580\u0581\u0565\u0563\u0578\u057E\u056B\u0576\u0561",
                                    "\u053F\u0578\u057D\u057F\u0561 \u054C\u056B\u056F\u0561",
                                    "\u0544\u0561\u056C\u0561\u0575\u0566\u056B\u0561",
                                    "\u0544\u0561\u056F\u0565\u0564\u0578\u0576\u056B\u0561",
                                    "\u0540\u0578\u0582\u0576\u0561\u057D\u057F\u0561\u0576",
                                    "\u0535\u0563\u056B\u057A\u057F\u0578\u057D",
                                    "\u053F\u0561\u0574\u0562\u0578\u057B\u0561",
                                    "\u0532\u0565\u0576\u056B\u0576",
                                    "\u0535\u0569\u0578\u057E\u057A\u056B\u0561",
                                    "\u053D\u0578\u0580\u057E\u0561\u0569\u056B\u0561",
                                    "\u0532\u056B\u0580\u0574\u0561",
                                    "\u054D\u057E\u0561\u0566\u056B\u056C\u0565\u0576\u0564",
                                    "\u0531\u0580\u0587\u0565\u056C\u0575\u0561\u0576 \u0539\u056B\u0574\u0578\u0580",
                                    "\u0548\u0582\u056F\u0580\u0561\u056B\u0576\u0561",
                                    "\u054D\u056B\u0565\u0580\u0561 \u053C\u0565\u0578\u0576\u0565",
                                    "\u0544\u0561\u0580\u0578\u056F\u0578",
                                    "\u0540\u0578\u0576\u0564\u0578\u0582\u0580\u0561\u057D",
                                    "\u0540\u0578\u0580\u0564\u0561\u0576\u0561\u0576",
                                    "\u0554\u0565\u0576\u056B\u0561",
                                    "\u0532\u0580\u0578\u0582\u0576\u0565\u0575",
                                    "\u053B\u0580\u0561\u0584",
                                    "\u054E\u0580\u0561\u057D\u057F\u0561\u0576",
                                    "\u0539\u0578\u0582\u0576\u056B\u057D",
                                    "\u0532\u0578\u0582\u056C\u0572\u0561\u0580\u056B\u0561",
                                    "\u054D\u0565\u0576\u0565\u0563\u0561\u056C",
                                    "\u0548\u0582\u0566\u0562\u0565\u056F\u057D\u057F\u0561\u0576",
                                    "\u0532\u0578\u0582\u0580\u056F\u056B\u0576\u0561 \u0556\u0561\u057D\u0578",
                                    "\u0544\u0565\u0584\u057D\u056B\u056F\u0561",
                                    "\u053C\u056B\u057F\u057E\u0561",
                                    "\u054F\u0561\u057B\u056B\u056F\u057D\u057F\u0561\u0576",
                                    "\u0537\u056F\u057E\u0561\u0564\u0578\u0580",
                                    "\u0556\u056B\u057B\u056B",
                                    "\u0537\u0580\u056B\u0569\u0580\u0565\u0561",
                                    "\u053B\u0580\u0561\u0576",
                                    "\u0532\u0565\u056C\u0561\u057C\u0578\u0582\u057D",
                                    "\u0546\u056B\u056F\u0561\u0580\u0561\u0563\u0578\u0582\u0561",
                                    "\u0531\u0586\u0572\u0561\u0576\u057D\u057F\u0561\u0576",
                                    "\u054A\u0561\u056C\u0561\u0578\u0582",
                                    "\u0535\u0574\u0565\u0576",
                                    "\u054F\u0561\u0576\u0566\u0561\u0576\u056B\u0561",
                                    "\u054A\u0561\u0576\u0561\u0574\u0561",
                                    "\u0533\u057E\u056B\u0576\u0565\u0561",
                                    "\u053F\u0561\u0574\u0565\u0580\u0578\u0582\u0576",
                                    "\u0540\u0561\u0580\u0561\u057E\u0561\u0575\u056B\u0576 \u0531\u0586\u0580\u056B\u056F\u0561",
                                    "\u053F\u0578\u056C\u0578\u0582\u0574\u0562\u056B\u0561",
                                    "\u0544\u0561\u0564\u0561\u0563\u0561\u057D\u056F\u0561\u0580",
                                    "\u053C\u0561\u057F\u057E\u056B\u0561",
                                    "\u053C\u056B\u0562\u0565\u0580\u056B\u0561",
                                    "\u053F\u0578\u0576\u0563\u0578",
                                    "\u0536\u056B\u0574\u0562\u0561\u0562\u057E\u0565",
                                    "\u054E\u0565\u0576\u0565\u057D\u0578\u0582\u0565\u056C\u0561",
                                    "\u0537\u057D\u057F\u0578\u0576\u056B\u0561",
                                    "\u0544\u0578\u0566\u0561\u0574\u0562\u056B\u056F",
                                    "\u053C\u0561\u0578\u057D",
                                    "\u0532\u0580\u0561\u0566\u056B\u056C\u056B\u0561",
                                    "\u054A\u0565\u0580\u0578\u0582",
                                    "\u0532\u0561\u0570\u0561\u0574\u0576\u0565\u0580",
                                    "\u0549\u056B\u056C\u056B",
                                    "\u0547\u057E\u0565\u0564\u056B\u0561",
                                    "\u0548\u0582\u0580\u0578\u0582\u0563\u057E\u0561\u0575",
                                    "\u054E\u0561\u0576\u0578\u0582\u0561\u057F\u0578\u0582",
                                    "\u0532\u0578\u0582\u0569\u0561\u0576",
                                    "\u0536\u0561\u0574\u0562\u056B\u0561",
                                    "\u054D\u0578\u0582\u0564\u0561\u0576",
                                    "\u054D\u0578\u0574\u0561\u056C\u056B",
                                    "\u0546\u0578\u0580 \u0536\u0565\u056C\u0561\u0576\u0564\u056B\u0561",
                                    "\u054A\u0561\u0580\u0561\u0563\u057E\u0561\u0575",
                                    "\u0556\u056B\u0576\u056C\u0561\u0576\u0564\u056B\u0561",
                                    "\u0531\u0580\u0563\u0565\u0576\u057F\u056B\u0576\u0561",
                                    "\u0531\u056C\u056A\u056B\u0580",
                                    "\u0546\u0578\u0580\u057E\u0565\u0563\u056B\u0561",
                                    "\u0532\u0565\u056C\u056B\u0566",
                                    "\u0540\u0561\u0580\u0561\u057E\u0561\u0575\u056B\u0576 \u054D\u0578\u0582\u0564\u0561\u0576",
                                    "\u0544\u0561\u056C\u056B",
                                    "\u0531\u0576\u0563\u0578\u056C\u0561",
                                    "\u0539\u0578\u0582\u0580\u0584\u0574\u0565\u0576\u057D\u057F\u0561\u0576",
                                    "\u0555\u0574\u0561\u0576",
                                    "\u0532\u0578\u056C\u056B\u057E\u056B\u0561",
                                    "\u054C\u0578\u0582\u057D\u0561\u057D\u057F\u0561\u0576",
                                    "\u0533\u0561\u0562\u0578\u0576",
                                    "\u0542\u0561\u0566\u0561\u056D\u057D\u057F\u0561\u0576",
                                    "\u053C\u056B\u0562\u056B\u0561",
                                    "\u0533\u0561\u0575\u0561\u0576\u0561",
                                    "\u053F\u0561\u0576\u0561\u0564\u0561",
                                    "\u0532\u0578\u057F\u057D\u057E\u0561\u0576\u0561",
                                    "\u0544\u0561\u057E\u0580\u056B\u057F\u0561\u0576\u056B\u0561",
                                    "\u053B\u057D\u056C\u0561\u0576\u0564\u056B\u0561",
                                    "\u054D\u0578\u0582\u0580\u056B\u0576\u0561\u0574",
                                    "\u0531\u057E\u057D\u057F\u0580\u0561\u056C\u056B\u0561",
                                    "\u0546\u0561\u0574\u056B\u0562\u056B\u0561",
                                    "\u0544\u0578\u0576\u0572\u0578\u056C\u056B\u0561");
                        });

        public Object region =
                ZVal.arrayFromList(
                        "\u0531\u0580\u0561\u0563\u0561\u056E\u0578\u057F\u0576\u056B",
                        "\u0531\u0580\u0561\u0580\u0561\u057F\u056B",
                        "\u0531\u0580\u0574\u0561\u057E\u056B\u0580\u056B",
                        "\u0533\u0565\u0572\u0561\u0580\u0584\u0578\u0582\u0576\u056B\u0584\u056B",
                        "\u053C\u0578\u057C\u0578\u0582",
                        "\u053F\u0578\u057F\u0561\u0575\u0584\u056B",
                        "\u0547\u056B\u0580\u0561\u056F\u056B",
                        "\u054D\u0575\u0578\u0582\u0576\u056B\u0584\u056B",
                        "\u054E\u0561\u0575\u0578\u0581 \u0541\u0578\u0580\u056B",
                        "\u054F\u0561\u057E\u0578\u0582\u0577\u056B");

        public Object city =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u0531\u0562\u0578\u057E\u0575\u0561\u0576",
                                    "\u0531\u0563\u0561\u0580\u0561\u056F",
                                    "\u0531\u056C\u0561\u057E\u0565\u0580\u0564\u056B",
                                    "\u0531\u056D\u0569\u0561\u056C\u0561",
                                    "\u0531\u0575\u0580\u0578\u0582\u0574",
                                    "\u0531\u0577\u057F\u0561\u0580\u0561\u056F",
                                    "\u0531\u057A\u0561\u0580\u0561\u0576",
                                    "\u0531\u0580\u0561\u0580\u0561\u057F",
                                    "\u0531\u0580\u0569\u056B\u056F",
                                    "\u0531\u0580\u0574\u0561\u057E\u056B\u0580",
                                    "\u0531\u0580\u057F\u0561\u0577\u0561\u057F",
                                    "\u0532\u0565\u0580\u0564",
                                    "\u0532\u0575\u0578\u0582\u0580\u0565\u0572\u0561\u057E\u0561\u0576",
                                    "\u0533\u0561\u057E\u0561\u057C",
                                    "\u0533\u0575\u0578\u0582\u0574\u0580\u056B",
                                    "\u0533\u0578\u0580\u056B\u057D",
                                    "\u0534\u0561\u057D\u057F\u0561\u056F\u0565\u0580\u057F",
                                    "\u0534\u056B\u056C\u056B\u057B\u0561\u0576",
                                    "\u0535\u0572\u0565\u0563\u0576\u0561\u0571\u0578\u0580",
                                    "\u0535\u0572\u057E\u0561\u0580\u0564",
                                    "\u0535\u0580\u0587\u0561\u0576",
                                    "\u0537\u057B\u0574\u056B\u0561\u056E\u056B\u0576",
                                    "\u0539\u0561\u056C\u056B\u0576",
                                    "\u0539\u0578\u0582\u0574\u0561\u0576\u0575\u0561\u0576",
                                    "\u053B\u057B\u0587\u0561\u0576",
                                    "\u053E\u0561\u0572\u056F\u0561\u0571\u0578\u0580",
                                    "\u053F\u0561\u057A\u0561\u0576",
                                    "\u0540\u0580\u0561\u0566\u0564\u0561\u0576",
                                    "\u0543\u0561\u0574\u0562\u0561\u0580\u0561\u056F",
                                    "\u0544\u0561\u057D\u056B\u057D",
                                    "\u0544\u0561\u0580\u0561\u056C\u056B\u056F",
                                    "\u0544\u0561\u0580\u057F\u0578\u0582\u0576\u056B",
                                    "\u0544\u0565\u056E\u0561\u0574\u0578\u0580",
                                    "\u0544\u0565\u0572\u0580\u056B",
                                    "\u0546\u0578\u0580",
                                    "\u0546\u0578\u0575\u0565\u0574\u0562\u0565\u0580\u0575\u0561\u0576",
                                    "\u0547\u0561\u0574\u056C\u0578\u0582\u0572",
                                    "\u0549\u0561\u0580\u0565\u0576\u0581\u0561\u057E\u0561\u0576",
                                    "\u054B\u0565\u0580\u0574\u0578\u0582\u056F",
                                    "\u054D\u056B\u057D\u056B\u0561\u0576",
                                    "\u054D\u057A\u056B\u057F\u0561\u056F",
                                    "\u054D\u057F\u0565\u0583\u0561\u0576\u0561\u057E\u0561\u0576",
                                    "\u054D\u0587\u0561\u0576",
                                    "\u054E\u0561\u0575\u0584",
                                    "\u054E\u0561\u0576\u0561\u0571\u0578\u0580",
                                    "\u054E\u0561\u0580\u0564\u0565\u0576\u056B\u057D",
                                    "\u054E\u0565\u0564\u056B",
                                    "\u054F\u0561\u0577\u056B\u0580",
                                    "\u0554\u0561\u057B\u0561\u0580\u0561\u0576");
                        });

        public Object street =
                ZVal.arrayFromList(
                        "\u054A\u0578\u0582\u0577\u056F\u056B\u0576",
                        "\u054F\u0565\u0580\u0575\u0561\u0576",
                        "\u0531\u0562\u0578\u057E\u0575\u0561\u0576",
                        "\u0531\u0563\u0561\u0569\u0561\u0576\u0563\u0565\u0572\u0578\u057D",
                        "\u0531\u0576\u0564\u0580\u0561\u0576\u056B\u056F",
                        "\u0555\u057F\u0575\u0561\u0576",
                        "\u053C\u0578\u0582\u056F\u0561\u0577\u056B\u0576",
                        "\u054F\u056B\u0579\u056B\u0576\u0561",
                        "\u0547\u056B\u0576\u0561\u0580\u0561\u0580\u0576\u0565\u0580",
                        "\u053C\u0565\u0576\u056B\u0576\u0563\u0580\u0561\u0564\u0575\u0561\u0576",
                        "\u053F\u056B\u0587\u0575\u0561\u0576");

        public Object addressFormats =
                ZVal.arrayFromList(
                        "{{region}} {{regionSuffix}}, {{cityPrefix}} {{city}}, {{street}} {{buildingNumber}} {{streetPrefix}}, {{postcode}}");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\hy_AM\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "buildingNumber",
                            "city",
                            "cityPrefix",
                            "country",
                            "postcode",
                            "region",
                            "regionSuffix",
                            "street",
                            "streetPrefix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/hy_AM/Address.php")
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
