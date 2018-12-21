package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.ko_KR.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/ko_KR/Address.php

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
    public Object metropolitanCity(RuntimeEnv env, Object... args) {
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
                                                                .ko_KR
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "metropolitanCity")))
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
                                                        .ko_KR
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .metropolitanCity)
                        .value());
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
                                                                .ko_KR
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
                                                        .ko_KR
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .city)
                        .value());
    }

    @ConvertedMethod
    public Object borough(RuntimeEnv env, Object... args) {
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
                                                                .ko_KR
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "borough")))
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
                                                        .ko_KR
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .borough)
                        .value());
    }

    @ConvertedMethod
    public Object streetName(RuntimeEnv env, Object... args) {
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
                                                                .ko_KR
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "streetName")))
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
                                                        .ko_KR
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .streetName)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\ko_KR\\Address";

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
                                                            .ko_KR
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

        public Object postcode = ZVal.arrayFromList("#####");

        public Object buildingNumber = ZVal.arrayFromList("####", "###");

        public Object metropolitanCity =
                ZVal.arrayFromList(
                        "\uC11C\uC6B8\uD2B9\uBCC4\uC2DC",
                        "\uBD80\uC0B0\uAD11\uC5ED\uC2DC",
                        "\uB300\uAD6C\uAD11\uC5ED\uC2DC",
                        "\uC778\uCC9C\uAD11\uC5ED\uC2DC",
                        "\uAD11\uC8FC\uAD11\uC5ED\uC2DC",
                        "\uB300\uC804\uAD11\uC5ED\uC2DC",
                        "\uC6B8\uC0B0\uAD11\uC5ED\uC2DC");

        public Object province =
                ZVal.arrayFromList(
                        "\uACBD\uAE30\uB3C4",
                        "\uAC15\uC6D0\uB3C4",
                        "\uCDA9\uCCAD\uBD81\uB3C4",
                        "\uCDA9\uCCAD\uB0A8\uB3C4",
                        "\uC804\uB77C\uBD81\uB3C4",
                        "\uC804\uB77C\uB0A8\uB3C4",
                        "\uACBD\uC0C1\uBD81\uB3C4",
                        "\uACBD\uC0C1\uB0A8\uB3C4",
                        "\uC81C\uC8FC\uD2B9\uBCC4\uC790\uCE58\uB3C4");

        public Object city =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\uD30C\uC8FC\uC2DC",
                                    "\uC218\uC6D0\uC2DC",
                                    "\uC218\uC6D0\uC2DC \uAD8C\uC120\uAD6C",
                                    "\uC218\uC6D0\uC2DC \uD314\uB2EC\uAD6C",
                                    "\uC218\uC6D0\uC2DC \uC601\uD1B5\uAD6C",
                                    "\uC131\uB0A8\uC2DC",
                                    "\uC131\uB0A8\uC2DC \uC218\uC815\uAD6C",
                                    "\uC131\uB0A8\uC2DC \uC911\uC6D0\uAD6C",
                                    "\uD654\uC131\uC2DC",
                                    "\uC131\uB0A8\uC2DC \uBD84\uB2F9\uAD6C",
                                    "\uC548\uC591\uC2DC",
                                    "\uC548\uC591\uC2DC \uB9CC\uC548\uAD6C",
                                    "\uC548\uC591\uC2DC \uB3D9\uC548\uAD6C",
                                    "\uBD80\uCC9C\uC2DC",
                                    "\uBD80\uCC9C\uC2DC \uC6D0\uBBF8\uAD6C",
                                    "\uBD80\uCC9C\uC2DC \uC18C\uC0AC\uAD6C",
                                    "\uBD80\uCC9C\uC2DC \uC624\uC815\uAD6C",
                                    "\uAD11\uBA85\uC2DC",
                                    "\uD3C9\uD0DD\uC2DC",
                                    "\uC774\uCC9C\uC2DC",
                                    "\uB3D9\uB450\uCC9C\uC2DC",
                                    "\uC548\uC0B0\uC2DC",
                                    "\uC548\uC0B0\uC2DC \uC0C1\uB85D\uAD6C",
                                    "\uC548\uC0B0\uC2DC \uB2E8\uC6D0\uAD6C",
                                    "\uC548\uC131\uC2DC",
                                    "\uACE0\uC591\uC2DC",
                                    "\uACE0\uC591\uC2DC \uB355\uC591\uAD6C",
                                    "\uACE0\uC591\uC2DC \uC77C\uC0B0\uB3D9\uAD6C",
                                    "\uACE0\uC591\uC2DC \uC77C\uC0B0\uC11C\uAD6C",
                                    "\uACFC\uCC9C\uC2DC",
                                    "\uAD6C\uB9AC\uC2DC",
                                    "\uB0A8\uC591\uC8FC\uC2DC",
                                    "\uC624\uC0B0\uC2DC",
                                    "\uC2DC\uD765\uC2DC",
                                    "\uAD70\uD3EC\uC2DC",
                                    "\uC758\uC655\uC2DC",
                                    "\uD558\uB0A8\uC2DC",
                                    "\uAE40\uD3EC\uC2DC",
                                    "\uC6A9\uC778\uC2DC",
                                    "\uC6A9\uC778\uC2DC \uCC98\uC778\uAD6C",
                                    "\uC6A9\uC778\uC2DC \uAE30\uD765\uAD6C",
                                    "\uC6A9\uC778\uC2DC \uC218\uC9C0\uAD6C",
                                    "\uC5F0\uCC9C\uAD70",
                                    "\uAC00\uD3C9\uAD70",
                                    "\uC591\uD3C9\uAD70",
                                    "\uAD11\uC8FC\uC2DC",
                                    "\uD3EC\uCC9C\uC2DC",
                                    "\uC591\uC8FC\uC2DC",
                                    "\uC218\uC6D0\uC2DC \uC7A5\uC548\uAD6C",
                                    "\uC758\uC815\uBD80\uC2DC",
                                    "\uC5EC\uC8FC\uC2DC");
                        });

        public Object borough =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\uC885\uB85C\uAD6C",
                                    "\uC911\uAD6C",
                                    "\uC6A9\uC0B0\uAD6C",
                                    "\uC131\uB3D9\uAD6C",
                                    "\uAD11\uC9C4\uAD6C",
                                    "\uB3D9\uB300\uBB38\uAD6C",
                                    "\uC911\uB791\uAD6C",
                                    "\uC131\uBD81\uAD6C",
                                    "\uAC15\uBD81\uAD6C",
                                    "\uB3C4\uBD09\uAD6C",
                                    "\uB178\uC6D0\uAD6C",
                                    "\uC740\uD3C9\uAD6C",
                                    "\uC11C\uB300\uBB38\uAD6C",
                                    "\uB9C8\uD3EC\uAD6C",
                                    "\uC591\uCC9C\uAD6C",
                                    "\uAC15\uC11C\uAD6C",
                                    "\uAD6C\uB85C\uAD6C",
                                    "\uAE08\uCC9C\uAD6C",
                                    "\uC601\uB4F1\uD3EC\uAD6C",
                                    "\uB3D9\uC791\uAD6C",
                                    "\uAD00\uC545\uAD6C",
                                    "\uC11C\uCD08\uAD6C",
                                    "\uAC15\uB0A8\uAD6C",
                                    "\uC1A1\uD30C\uAD6C",
                                    "\uAC15\uB3D9\uAD6C",
                                    "\uB3D9\uAD6C",
                                    "\uC11C\uAD6C",
                                    "\uB0A8\uAD6C",
                                    "\uBD81\uAD6C",
                                    "\uC911\uAD6C");
                        });

        public Object streetName =
                ZVal.arrayFromList(
                        "\uC555\uAD6C\uC815\uB85C",
                        "\uB3C4\uC0B0\uB300\uB85C",
                        "\uD559\uB3D9\uB85C",
                        "\uBD09\uC740\uC0AC\uB85C",
                        "\uD14C\uD5E4\uB780\uB85C",
                        "\uC5ED\uC0BC\uB85C",
                        "\uB17C\uD604\uB85C",
                        "\uC5B8\uC8FC\uB85C",
                        "\uAC15\uB0A8\uB300\uB85C",
                        "\uC591\uC7AC\uCC9C\uB85C",
                        "\uC0BC\uC131\uB85C",
                        "\uC601\uB3D9\uB300\uB85C",
                        "\uAC1C\uD3EC\uB85C",
                        "\uC120\uB989\uB85C",
                        "\uBC18\uD3EC\uB300\uB85C",
                        "\uC11C\uCD08\uC911\uC559\uB85C",
                        "\uC11C\uCD08\uB300\uB85C",
                        "\uC7A0\uC2E4\uB85C",
                        "\uC11D\uCD0C\uD638\uC218\uB85C",
                        "\uBC31\uC81C\uACE0\uBD84\uB85C",
                        "\uAC00\uB77D\uB85C",
                        "\uC624\uAE08\uB85C");

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\uAC00\uB098",
                                    "\uAC00\uBD09",
                                    "\uAC00\uC774\uC544\uB098",
                                    "\uAC10\uBE44\uC544",
                                    "\uACFC\uD14C\uB9D0\uB77C",
                                    "\uADF8\uB808\uB098\uB2E4",
                                    "\uADF8\uB9AC\uC2A4",
                                    "\uAE30\uB2C8",
                                    "\uAE30\uB2C8\uBE44\uC0AC\uC6B0",
                                    "\uB098\uACE0\uB974\uB178\uCE74\uB77C\uBC14\uD750 \uACF5\uD654\uAD6D",
                                    "\uB098\uBBF8\uBE44\uC544",
                                    "\uB098\uC6B0\uB8E8",
                                    "\uB098\uC774\uC9C0\uB9AC\uC544",
                                    "\uB0A8\uC218\uB2E8",
                                    "\uB0A8\uC544\uD504\uB9AC\uCE74 \uACF5\uD654\uAD6D",
                                    "\uB0A8\uC624\uC138\uD2F0\uC57C",
                                    "\uB124\uB35C\uB780\uB4DC",
                                    "\uB124\uD314",
                                    "\uB178\uB974\uC6E8\uC774",
                                    "\uB274\uC9C8\uB79C\uB4DC",
                                    "\uB2C8\uC81C\uB974",
                                    "\uB2C8\uCE74\uB77C\uACFC",
                                    "\uB300\uD55C\uBBFC\uAD6D",
                                    "\uB374\uB9C8\uD06C",
                                    "\uB3C4\uBBF8\uB2C8\uCE74",
                                    "\uB3C4\uBBF8\uB2C8\uCE74 \uACF5\uD654\uAD6D",
                                    "\uB3C5\uC77C",
                                    "\uB3D9\uD2F0\uBAA8\uB974",
                                    "\uB77C\uC624\uC2A4",
                                    "\uB77C\uC774\uBCA0\uB9AC\uC544",
                                    "\uB77C\uD2B8\uBE44\uC544",
                                    "\uB7EC\uC2DC\uC544",
                                    "\uB808\uBC14\uB17C",
                                    "\uB808\uC18C\uD1A0",
                                    "\uB8E8\uB9C8\uB2C8\uC544",
                                    "\uB8E9\uC148\uBD80\uB974\uD06C",
                                    "\uB974\uC644\uB2E4",
                                    "\uB9AC\uBE44\uC544",
                                    "\uB9AC\uD22C\uC544\uB2C8\uC544",
                                    "\uB9AC\uD788\uD150\uC288\uD0C0\uC778",
                                    "\uB9C8\uB2E4\uAC00\uC2A4\uCE74\uB974",
                                    "\uB9C8\uC15C \uC81C\uB3C4",
                                    "\uB9C8\uCF00\uB3C4\uB2C8\uC544 \uACF5\uD654\uAD6D",
                                    "\uB9D0\uB77C\uC704",
                                    "\uB9D0\uB808\uC774\uC2DC\uC544",
                                    "\uB9D0\uB9AC",
                                    "\uBA55\uC2DC\uCF54",
                                    "\uBAA8\uB098\uCF54",
                                    "\uBAA8\uB85C\uCF54",
                                    "\uBAA8\uB9AC\uC154\uC2A4",
                                    "\uBAA8\uB9AC\uD0C0\uB2C8",
                                    "\uBAA8\uC7A0\uBE44\uD06C",
                                    "\uBAAC\uD14C\uB124\uADF8\uB85C",
                                    "\uBAB0\uB3C4\uBC14",
                                    "\uBAB0\uB514\uBE0C",
                                    "\uBAB0\uD0C0",
                                    "\uBABD\uACE8",
                                    "\uBBF8\uAD6D",
                                    "\uBBF8\uC580\uB9C8",
                                    "\uBBF8\uD06C\uB85C\uB124\uC2DC\uC544 \uC5F0\uBC29",
                                    "\uBC14\uB204\uC544\uD22C",
                                    "\uBC14\uB808\uC778",
                                    "\uBC14\uBCA0\uC774\uB3C4\uC2A4",
                                    "\uBC14\uD2F0\uCE78",
                                    "\uBC14\uD558\uB9C8",
                                    "\uBC29\uAE00\uB77C\uB370\uC2DC",
                                    "\uBCA0\uB0C9",
                                    "\uBCA0\uB124\uC218\uC5D8\uB77C",
                                    "\uBCA0\uD2B8\uB0A8",
                                    "\uBCA8\uAE30\uC5D0",
                                    "\uBCA8\uB77C\uB8E8\uC2A4",
                                    "\uBCA8\uB9AC\uC988",
                                    "\uBCF4\uC2A4\uB2C8\uC544 \uD5E4\uB974\uCCB4\uACE0\uBE44\uB098",
                                    "\uBCF4\uCE20\uC640\uB098",
                                    "\uBCFC\uB9AC\uBE44\uC544",
                                    "\uBD80\uB8EC\uB514",
                                    "\uBD80\uB974\uD0A4\uB098\uD30C\uC18C",
                                    "\uBD80\uD0C4",
                                    "\uBD81\uD0A4\uD504\uB85C\uC2A4",
                                    "\uBD88\uAC00\uB9AC\uC544",
                                    "\uBE0C\uB77C\uC9C8",
                                    "\uBE0C\uB8E8\uB098\uC774",
                                    "\uC0AC\uBAA8\uC544",
                                    "\uC0AC\uC6B0\uB514\uC544\uB77C\uBE44\uC544",
                                    "\uC0AC\uD558\uB77C \uC544\uB78D \uBBFC\uC8FC \uACF5\uD654\uAD6D (\uC11C\uC0AC\uD558\uB77C)",
                                    "\uC0B0\uB9C8\uB9AC\uB178",
                                    "\uC0C1\uD22C\uBA54 \uD504\uB9B0\uC2DC\uD398",
                                    "\uC138\uB124\uAC08",
                                    "\uC138\uB974\uBE44\uC544",
                                    "\uC138\uC774\uC178",
                                    "\uC138\uC778\uD2B8 \uB8E8\uC2DC\uC544",
                                    "\uC138\uC778\uD2B8 \uD0A4\uCE20 \uB124\uBE44\uC2A4",
                                    "\uC138\uC778\uD2B8\uBE48\uC13C\uD2B8 \uADF8\uB808\uB098\uB518",
                                    "\uC18C\uB9D0\uB9AC\uC544",
                                    "\uC18C\uB9D0\uB9B4\uB780\uB4DC (\uC18C\uB9D0\uB9AC\uC544 \uC601\uD1A0)",
                                    "\uC194\uB85C\uBAAC \uC81C\uB3C4",
                                    "\uC218\uB2E8",
                                    "\uC218\uB9AC\uB0A8",
                                    "\uC2A4\uB9AC\uB791\uCE74",
                                    "\uC2A4\uC640\uC9C8\uB780\uB4DC",
                                    "\uC2A4\uC6E8\uB374",
                                    "\uC2A4\uC704\uC2A4",
                                    "\uC2A4\uD398\uC778",
                                    "\uC2AC\uB85C\uBC14\uD0A4\uC544",
                                    "\uC2AC\uB85C\uBCA0\uB2C8\uC544",
                                    "\uC2DC\uB9AC\uC544",
                                    "\uC2DC\uC5D0\uB77C\uB9AC\uC628",
                                    "\uC2F1\uAC00\uD3EC\uB974",
                                    "\uC544\uB78D\uC5D0\uBBF8\uB9AC\uD2B8",
                                    "\uC544\uB974\uBA54\uB2C8\uC544",
                                    "\uC544\uB974\uD5E8\uD2F0\uB098",
                                    "\uC544\uC774\uC2AC\uB780\uB4DC",
                                    "\uC544\uC77C\uB79C\uB4DC",
                                    "\uC544\uC81C\uB974\uBC14\uC774\uC794",
                                    "\uC544\uD504\uAC00\uB2C8\uC2A4\uD0C4",
                                    "\uC548\uB3C4\uB77C",
                                    "\uC54C\uBC14\uB2C8\uC544",
                                    "\uC54C\uC81C\uB9AC",
                                    "\uC555\uD558\uC2A4",
                                    "\uC559\uACE8\uB77C",
                                    "\uC564\uD2F0\uAC00 \uBC14\uBD80\uB2E4",
                                    "\uC5D0\uB9AC\uD2B8\uB808\uC544",
                                    "\uC5D0\uC2A4\uD1A0\uB2C8\uC544",
                                    "\uC5D0\uCF70\uB3C4\uB974",
                                    "\uC5D0\uD2F0\uC624\uD53C\uC544",
                                    "\uC5D8\uC0B4\uBC14\uB3C4\uB974",
                                    "\uC601\uAD6D",
                                    "\uC608\uBA58",
                                    "\uC624\uB9CC",
                                    "\uC624\uC2A4\uD2B8\uB808\uC77C\uB9AC\uC544",
                                    "\uC624\uC2A4\uD2B8\uB9AC\uC544",
                                    "\uC628\uB450\uB77C\uC2A4",
                                    "\uC694\uB974\uB2E8",
                                    "\uC6B0\uAC04\uB2E4",
                                    "\uC6B0\uB8E8\uACFC\uC774",
                                    "\uC6B0\uC988\uBCA0\uD0A4\uC2A4\uD0C4",
                                    "\uC6B0\uD06C\uB77C\uC774\uB098",
                                    "\uC774\uB780",
                                    "\uC774\uB77C\uD06C",
                                    "\uC774\uC2A4\uB77C\uC5D8",
                                    "\uC774\uC9D1\uD2B8",
                                    "\uC774\uD0C8\uB9AC\uC544",
                                    "\uC778\uB3C4",
                                    "\uC778\uB3C4\uB124\uC2DC\uC544",
                                    "\uC77C\uBCF8",
                                    "\uC790\uBA54\uC774\uCE74",
                                    "\uC7A0\uBE44\uC544",
                                    "\uC801\uB3C4 \uAE30\uB2C8",
                                    "\uC870\uC120\uBBFC\uC8FC\uC8FC\uC758\uC778\uBBFC\uACF5\uD654\uAD6D",
                                    "\uC870\uC9C0\uC544",
                                    "\uC911\uC559\uC544\uD504\uB9AC\uCE74 \uACF5\uD654\uAD6D",
                                    "\uC911\uD654\uBBFC\uAD6D",
                                    "\uC911\uD654\uC778\uBBFC\uACF5\uD654\uAD6D",
                                    "\uC9C0\uBD80\uD2F0",
                                    "\uC9D0\uBC14\uBE0C\uC6E8",
                                    "\uCC28\uB4DC",
                                    "\uCCB4\uCF54",
                                    "\uCE60\uB808",
                                    "\uCE74\uBA54\uB8EC",
                                    "\uCE74\uBCF4\uBCA0\uB974\uB370",
                                    "\uCE74\uC790\uD750\uC2A4\uD0C4",
                                    "\uCE74\uD0C0\uB974",
                                    "\uCE84\uBCF4\uB514\uC544",
                                    "\uCE90\uB098\uB2E4",
                                    "\uCF00\uB0D0",
                                    "\uCF54\uBAA8\uB85C",
                                    "\uCF54\uC18C\uBCF4 \uACF5\uD654\uAD6D",
                                    "\uCF54\uC2A4\uD0C0\uB9AC\uCE74",
                                    "\uCF54\uD2B8\uB514\uBD80\uC544\uB974",
                                    "\uCF5C\uB86C\uBE44\uC544",
                                    "\uCF69\uACE0 \uACF5\uD654\uAD6D",
                                    "\uCF69\uACE0 \uBBFC\uC8FC \uACF5\uD654\uAD6D",
                                    "\uCFE0\uBC14",
                                    "\uCFE0\uC6E8\uC774\uD2B8",
                                    "\uD06C\uB85C\uC544\uD2F0\uC544",
                                    "\uD0A4\uB974\uAE30\uC2A4\uC2A4\uD0C4",
                                    "\uD0A4\uB9AC\uBC14\uC2DC",
                                    "\uD0A4\uD504\uB85C\uC2A4",
                                    "\uD0C0\uC774",
                                    "\uD0C0\uC9C0\uD0A4\uC2A4\uD0C4",
                                    "\uD0C4\uC790\uB2C8\uC544",
                                    "\uD130\uD0A4",
                                    "\uD1A0\uACE0",
                                    "\uD1B5\uAC00",
                                    "\uD22C\uB974\uD06C\uBA54\uB2C8\uC2A4\uD0C4",
                                    "\uD22C\uBC1C\uB8E8",
                                    "\uD280\uB2C8\uC9C0",
                                    "\uD2B8\uB780\uC2A4\uB2C8\uC2A4\uD2B8\uB9AC\uC544",
                                    "\uD2B8\uB9AC\uB2C8\uB2E4\uB4DC \uD1A0\uBC14\uACE0",
                                    "\uD30C\uB098\uB9C8",
                                    "\uD30C\uB77C\uACFC\uC774",
                                    "\uD30C\uD0A4\uC2A4\uD0C4",
                                    "\uD30C\uD478\uC544 \uB274\uAE30\uB2C8",
                                    "\uD314\uB77C\uC6B0",
                                    "\uD314\uB808\uC2A4\uD0C0\uC778\uAD6D",
                                    "\uD398\uB8E8",
                                    "\uD3EC\uB974\uD22C\uAC08",
                                    "\uD3F4\uB780\uB4DC",
                                    "\uD504\uB791\uC2A4",
                                    "\uD53C\uC9C0",
                                    "\uD540\uB780\uB4DC",
                                    "\uD544\uB9AC\uD540",
                                    "\uD5DD\uAC00\uB9AC");
                        });

        public Object addressFormats =
                ZVal.arrayFromList(
                        "{{metropolitanCity}} {{borough}} {{streetName}} {{buildingNumber}}",
                        "{{province}} {{city}} {{streetName}} {{buildingNumber}}");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\ko_KR\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "borough",
                            "buildingNumber",
                            "city",
                            "country",
                            "metropolitanCity",
                            "postcode",
                            "province",
                            "streetName")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/ko_KR/Address.php")
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
