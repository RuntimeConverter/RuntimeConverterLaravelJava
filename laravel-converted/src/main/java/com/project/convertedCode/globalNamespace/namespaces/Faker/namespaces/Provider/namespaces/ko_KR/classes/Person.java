package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.ko_KR.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/ko_KR/Person.php

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

    public static final Object CONST_class = "Faker\\Provider\\ko_KR\\Person";

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

        public Object maleNameFormats = ZVal.arrayFromList("{{lastName}}{{firstNameMale}}");

        public Object femaleNameFormats = ZVal.arrayFromList("{{lastName}}{{firstNameFemale}}");

        public Object firstNameMale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\uAC74\uC6B0",
                                    "\uAC74\uD638",
                                    "\uACBD\uC11D",
                                    "\uACBD\uC218",
                                    "\uACBD\uCD98",
                                    "\uACBD\uD658",
                                    "\uAD11\uC218",
                                    "\uAD11\uD604",
                                    "\uAD6C\uBC94",
                                    "\uADDC\uC0B0",
                                    "\uAE30\uC218",
                                    "\uB0A8\uC218",
                                    "\uB0A8\uD638",
                                    "\uB300\uC120",
                                    "\uB300\uC218",
                                    "\uB3C4\uC724",
                                    "\uB3C4\uD604",
                                    "\uB3D9\uC724",
                                    "\uB3D9\uD558",
                                    "\uB3D9\uD604",
                                    "\uBA85\uC2DD",
                                    "\uBA85\uD638",
                                    "\uBB38\uC6A9",
                                    "\uBB38\uCC3D",
                                    "\uBBFC\uC11D",
                                    "\uBBFC\uC131",
                                    "\uBBFC\uC218",
                                    "\uBBFC\uC7AC",
                                    "\uBBFC\uC900",
                                    "\uBBFC\uCCA0",
                                    "\uBBFC\uD658",
                                    "\uBCD1\uCCA0",
                                    "\uBCD1\uD638",
                                    "\uC0C1\uC120",
                                    "\uC0C1\uC218",
                                    "\uC0C1\uC6B0",
                                    "\uC0C1\uC6B1",
                                    "\uC0C1\uC900",
                                    "\uC0C1\uCCA0",
                                    "\uC0C1\uD604",
                                    "\uC0C1\uD638",
                                    "\uC0C1\uD6C8",
                                    "\uC11C\uC900",
                                    "\uC11C\uD638",
                                    "\uC120\uC5FD",
                                    "\uC131\uACE4",
                                    "\uC131\uB839",
                                    "\uC131\uBBFC",
                                    "\uC131\uC218",
                                    "\uC131\uC9C4",
                                    "\uC131\uD604",
                                    "\uC131\uD638",
                                    "\uC131\uD6C8",
                                    "\uC218\uC6D0",
                                    "\uC2B9\uBBFC",
                                    "\uC2B9\uD604",
                                    "\uC2B9\uD638",
                                    "\uC2DC\uC6B0",
                                    "\uC601\uAE38",
                                    "\uC601\uC218",
                                    "\uC601\uC2DD",
                                    "\uC601\uC77C",
                                    "\uC601\uC9C4",
                                    "\uC601\uCCA0",
                                    "\uC601\uD558",
                                    "\uC601\uD638",
                                    "\uC601\uD658",
                                    "\uC608\uC900",
                                    "\uC6A9\uD0DC",
                                    "\uC6A9\uD658",
                                    "\uC6A9\uD6C8",
                                    "\uC6B0\uC9C4",
                                    "\uC6D0\uC900",
                                    "\uC6D0\uC9C4",
                                    "\uC6D0\uD76C",
                                    "\uC740\uC131",
                                    "\uC740\uD0DD",
                                    "\uC778\uADDC",
                                    "\uC7AC\uC724",
                                    "\uC7AC\uCCA0",
                                    "\uC7AC\uD601",
                                    "\uC7AC\uD604",
                                    "\uC7AC\uD638",
                                    "\uC7AC\uD6C8",
                                    "\uC815\uB0A8",
                                    "\uC815\uC218",
                                    "\uC815\uC2DD",
                                    "\uC815\uC6C5",
                                    "\uC815\uD638",
                                    "\uC815\uD6C8",
                                    "\uC885\uC218",
                                    "\uC885\uC8FC",
                                    "\uC885\uD6C8",
                                    "\uC8FC\uC6D0",
                                    "\uC8FC\uD615",
                                    "\uC900",
                                    "\uC900\uBC94",
                                    "\uC900\uC11C",
                                    "\uC900\uC601",
                                    "\uC900\uD601",
                                    "\uC900\uD615",
                                    "\uC900\uD638",
                                    "\uC911\uC218",
                                    "\uC9C0\uD6C4",
                                    "\uC9C0\uD6C8",
                                    "\uC9C4\uC218",
                                    "\uC9C4\uC6B0",
                                    "\uC9C4\uD638",
                                    "\uCC3D\uC6A9",
                                    "\uCC44\uD604",
                                    "\uD0DC\uD604",
                                    "\uD0DC\uD638",
                                    "\uD601\uC0C1",
                                    "\uD604\uADDC",
                                    "\uD604\uC6B0",
                                    "\uD604\uC885",
                                    "\uD604\uC900",
                                    "\uD615\uBBFC",
                                    "\uD615\uCCA0",
                                    "\uD638\uBBFC",
                                    "\uD638\uC9C4",
                                    "\uD64D\uC120",
                                    "\uD6A8\uC77C");
                        });

        public Object firstNameFemale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\uAC00\uB78C",
                                    "\uAC15\uC740",
                                    "\uAC15\uD76C",
                                    "\uACBD\uC740",
                                    "\uACBD\uC8FC",
                                    "\uADFC\uC601",
                                    "\uAE30\uC5F0",
                                    "\uB098\uB8E8",
                                    "\uB098\uB9AC",
                                    "\uB098\uC5F0",
                                    "\uB098\uC740",
                                    "\uB098\uD615",
                                    "\uB204\uB9AC",
                                    "\uB2E4\uC601",
                                    "\uB3C4\uC5F0",
                                    "\uB3D9\uD604",
                                    "\uBBF8\uACBD",
                                    "\uBBF8\uB77C",
                                    "\uBBF8\uB780",
                                    "\uBBF8\uC601",
                                    "\uBBF8\uC815",
                                    "\uBBFC\uC11C",
                                    "\uBBFC\uC544",
                                    "\uBBFC\uC9C0",
                                    "\uBBFC\uD615",
                                    "\uBBFC\uD76C",
                                    "\uBC18\uD76C",
                                    "\uBCF4\uB78C",
                                    "\uBCF4\uBBF8",
                                    "\uBCF4\uBBFC",
                                    "\uBD04",
                                    "\uC0C1\uBA85",
                                    "\uC0C8\uBBF8",
                                    "\uC11C\uC5F0",
                                    "\uC11C\uC601",
                                    "\uC11C\uC724",
                                    "\uC11C\uD604",
                                    "\uC120\uC601",
                                    "\uC120\uC6B0",
                                    "\uC120\uC815",
                                    "\uC120\uD638",
                                    "\uC131\uBBF8",
                                    "\uC131\uBBFC",
                                    "\uC131\uC740",
                                    "\uC138\uC6D0",
                                    "\uC18C\uBBFC",
                                    "\uC18C\uC5F0",
                                    "\uC18C\uC601",
                                    "\uC18C\uC815",
                                    "\uC218\uB780",
                                    "\uC218\uBBFC",
                                    "\uC218\uBE48",
                                    "\uC218\uC5F0",
                                    "\uC218\uC6D0",
                                    "\uC218\uC815",
                                    "\uC218\uC9C4",
                                    "\uC21C\uD56D",
                                    "\uC2AC\uAE30",
                                    "\uC2DC\uC740",
                                    "\uC2E0\uC560",
                                    "\uC544\uB984",
                                    "\uC544\uB9B0",
                                    "\uC5EC\uC9C4",
                                    "\uC5F0\uC120",
                                    "\uC5F0\uD76C",
                                    "\uC601\uC9C4",
                                    "\uC601\uD654",
                                    "\uC608\uC6D0",
                                    "\uC608\uC740",
                                    "\uC608\uC9C0",
                                    "\uC608\uC9C4",
                                    "\uC720\uB9AC",
                                    "\uC720\uC815",
                                    "\uC720\uC9C4",
                                    "\uC724\uACBD",
                                    "\uC724\uBBF8",
                                    "\uC724\uC11C",
                                    "\uC724\uC601",
                                    "\uC740\uACBD",
                                    "\uC740\uBBF8",
                                    "\uC740\uC0C1",
                                    "\uC740\uC11C",
                                    "\uC740\uC560",
                                    "\uC740\uC601",
                                    "\uC740\uC815",
                                    "\uC740\uC8FC",
                                    "\uC740\uC9C0",
                                    "\uC740\uC9C4",
                                    "\uC740\uD615",
                                    "\uC740\uD61C",
                                    "\uC740\uD76C",
                                    "\uC778\uD654",
                                    "\uC7AC\uC5F0",
                                    "\uC815\uB780",
                                    "\uC815\uBBFC",
                                    "\uC815\uC740",
                                    "\uC815\uD654",
                                    "\uC8FC\uBA85",
                                    "\uC8FC\uBBF8",
                                    "\uC8FC\uC5F0",
                                    "\uC8FC\uD76C",
                                    "\uC9C0\uBBFC",
                                    "\uC9C0\uC120",
                                    "\uC9C0\uC219",
                                    "\uC9C0\uC544",
                                    "\uC9C0\uC5F0",
                                    "\uC9C0\uC601",
                                    "\uC9C0\uC608",
                                    "\uC9C0\uC6B0",
                                    "\uC9C0\uC6D0",
                                    "\uC9C0\uC740",
                                    "\uC9C0\uD604",
                                    "\uC9C0\uD61C",
                                    "\uC9C0\uD76C",
                                    "\uC9C4\uC544",
                                    "\uC9C4\uD76C",
                                    "\uCC44\uC6D0",
                                    "\uD0DC\uD76C",
                                    "\uD558\uB098",
                                    "\uD558\uC724",
                                    "\uD558\uC740",
                                    "\uD55C\uB098",
                                    "\uD5E4\uC120",
                                    "\uD604\uC601",
                                    "\uD604\uC815",
                                    "\uD604\uC8FC",
                                    "\uD604\uC9C0",
                                    "\uD61C\uB098",
                                    "\uD61C\uB9BC",
                                    "\uD61C\uBBFC",
                                    "\uD61C\uC219",
                                    "\uD61C\uC5F0",
                                    "\uD61C\uC9C4",
                                    "\uD6A8\uC9C4",
                                    "\uD76C\uACBD",
                                    "\uD76C\uC6D0");
                        });

        public Object lastName =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\uAE40",
                                    "\uC774",
                                    "\uBC15",
                                    "\uCD5C",
                                    "\uC815",
                                    "\uAC15",
                                    "\uC870",
                                    "\uC724",
                                    "\uC7A5",
                                    "\uC784",
                                    "\uC624",
                                    "\uD55C",
                                    "\uC2E0",
                                    "\uC11C",
                                    "\uAD8C",
                                    "\uD669",
                                    "\uC548",
                                    "\uC1A1",
                                    "\uB958",
                                    "\uD64D",
                                    "\uC804",
                                    "\uACE0",
                                    "\uBB38",
                                    "\uC190",
                                    "\uC591",
                                    "\uBC30",
                                    "\uC870",
                                    "\uBC31",
                                    "\uD5C8",
                                    "\uB0A8",
                                    "\uC2EC",
                                    "\uC720",
                                    "\uB178",
                                    "\uD558",
                                    "\uC804",
                                    "\uC815",
                                    "\uACFD",
                                    "\uC131",
                                    "\uCC28",
                                    "\uC720",
                                    "\uAD6C",
                                    "\uC6B0",
                                    "\uC8FC",
                                    "\uC784",
                                    "\uB098",
                                    "\uC2E0",
                                    "\uBBFC",
                                    "\uC9C4",
                                    "\uC9C0",
                                    "\uC5C4",
                                    "\uC6D0",
                                    "\uCC44",
                                    "\uAC15",
                                    "\uCC9C",
                                    "\uC591",
                                    "\uACF5",
                                    "\uD604",
                                    "\uBC29",
                                    "\uBCC0",
                                    "\uD568",
                                    "\uB178",
                                    "\uC5FC",
                                    "\uC5EC",
                                    "\uCD94",
                                    "\uBCC0",
                                    "\uB3C4",
                                    "\uC11D",
                                    "\uC2E0",
                                    "\uC18C",
                                    "\uC120",
                                    "\uC8FC",
                                    "\uC124",
                                    "\uBC29",
                                    "\uB9C8",
                                    "\uC815",
                                    "\uAE38",
                                    "\uC704",
                                    "\uC5F0",
                                    "\uD45C",
                                    "\uBA85",
                                    "\uAE30",
                                    "\uAE08",
                                    "\uC655",
                                    "\uBC18",
                                    "\uC625",
                                    "\uC721",
                                    "\uC9C4",
                                    "\uC778",
                                    "\uB9F9",
                                    "\uC81C",
                                    "\uD0C1",
                                    "\uBAA8",
                                    "\uB0A8\uAD81",
                                    "\uC5EC",
                                    "\uC7A5",
                                    "\uC5B4",
                                    "\uC720",
                                    "\uAD6D",
                                    "\uC740",
                                    "\uD3B8");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\ko_KR\\Person")
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
                            "maleNameFormats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/ko_KR/Person.php")
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
