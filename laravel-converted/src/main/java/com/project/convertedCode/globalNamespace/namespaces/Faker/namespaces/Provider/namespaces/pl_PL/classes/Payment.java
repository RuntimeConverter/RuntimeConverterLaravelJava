package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.pl_PL.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/pl_PL/Payment.php

*/

public class Payment
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .Payment {

    public Payment(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Payment.class) {
            this.__construct(env, args);
        }
    }

    public Payment(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Faker\\Provider\\pl_PL\\Payment";

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
                    .Payment
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object bank(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Payment.class)
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
                                                            .pl_PL
                                                            .classes
                                                            .Payment
                                                            .RequestStaticProperties
                                                            .class)
                                            .banks)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "prefix")
        @ConvertedParameter(index = 1, name = "countryCode")
        @ConvertedParameter(
            index = 2,
            name = "length",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object bankAccountNumber(RuntimeEnv env, Object... args) {
            Object prefix = assignParameter(args, 0, true);
            if (null == prefix) {
                prefix = "";
            }
            Object countryCode = assignParameter(args, 1, true);
            if (null == countryCode) {
                countryCode = "PL";
            }
            Object length = assignParameter(args, 2, true);
            if (null == length) {
                length = ZVal.getNull();
            }
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Payment.class)
                            .method("iban")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(countryCode, prefix, length)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "iban")
        @ConvertedParameter(index = 1, name = "countryCode")
        protected Object addBankCodeChecksum(RuntimeEnv env, Object... args) {
            ReferenceContainer iban = new BasicReferenceContainer(assignParameter(args, 0, false));
            Object countryCode = assignParameter(args, 1, true);
            if (null == countryCode) {
                countryCode = "PL";
            }
            Object checksum = null;
            ReferenceContainer i = new BasicReferenceContainer(null);
            ReferenceContainer weights = new BasicReferenceContainer(null);
            if (ZVal.toBool(ZVal.notEqualityCheck(countryCode, "PL"))
                    || ZVal.toBool(
                            ZVal.isLessThanOrEqualTo(
                                    function_strlen.f.env(env).call(iban.getObject()).value(),
                                    "<=",
                                    8))) {
                return ZVal.assign(iban.getObject());
            }

            checksum = 0;
            weights.setObject(ZVal.arrayFromList(7, 1, 3, 9, 7, 1, 3));
            for (i.setObject(0);
                    ZVal.isLessThan(i.getObject(), '<', 7);
                    i.setObject(ZVal.increment(i.getObject()))) {
                checksum =
                        ZAssignment.add(
                                "+=",
                                checksum,
                                ZVal.multiply(
                                        weights.arrayGet(env, i.getObject()),
                                        ZVal.toLong(iban.arrayGet(env, i.getObject()))));
            }

            checksum = ZVal.modulus(checksum, 10);
            return ZVal.assign(
                    toStringR(function_substr.f.env(env).call(iban.getObject(), 0, 7).value(), env)
                            + toStringR(checksum, env)
                            + toStringR(
                                    function_substr.f.env(env).call(iban.getObject(), 8).value(),
                                    env));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object banks =
                ZVal.newArray(
                        new ZPair(
                                "251",
                                "Aareal Bank Aktiengesellschaft (Sp\u00F3\u0142ka Akcyjna) - Oddzia\u0142 w Polsce"),
                        new ZPair("249", "Alior Bank SA"),
                        new ZPair(
                                "247",
                                "Banco Espirito Santo de Investimento, S.A. Sp\u00F3\u0142ka Akcyjna Oddzia\u0142 w Polsce"),
                        new ZPair("238", "Banco Mais S.A. (SA) Oddzia\u0142 w Polsce"),
                        new ZPair("106", "Bank BPH SA"),
                        new ZPair("219", "Bank DnB NORD Polska SA"),
                        new ZPair("203", "Bank Gospodarki \u017Bywno\u015Bciowej SA"),
                        new ZPair("113", "Bank Gospodarstwa Krajowego"),
                        new ZPair("122", "Bank Handlowo - Kredytowy SA (w likwidacji 31.03.92)"),
                        new ZPair("103", "Bank Handlowy w Warszawie SA"),
                        new ZPair("116", "Bank Millennium SA"),
                        new ZPair("154", "Bank Ochrony \u015Arodowiska SA"),
                        new ZPair(
                                "260",
                                "Bank of China (Luxembourg)S.A. Sp\u00F3\u0142ka Akcyjna Oddzia\u0142 w Polsce"),
                        new ZPair("221", "Bank of Tokyo-Mitsubishi UFJ (Polska) SA"),
                        new ZPair("132", "Bank Pocztowy SA"),
                        new ZPair("124", "Bank Polska Kasa Opieki SA"),
                        new ZPair("193", "BANK POLSKIEJ SP\u00D3\u0141DZIELCZO\u015ACI SA"),
                        new ZPair("109", "Bank Zachodni WBK SA"),
                        new ZPair("224", "Banque PSA Finance SA Oddzia\u0142 w Polsce"),
                        new ZPair("160", "BNP PARIBAS BANK POLSKA SA"),
                        new ZPair("235", "BNP PARIBAS SA Oddzia\u0142 w Polsce"),
                        new ZPair(
                                "243", "BNP Paribas Securities Services SKAOddzia\u0142 w Polsce"),
                        new ZPair("229", "BPI Bank Polskich Inwestycji SA"),
                        new ZPair("215", "BRE Bank Hipoteczny SA"),
                        new ZPair("114", "BRE Bank SA"),
                        new ZPair(
                                "239",
                                "CAIXABANK, S.A. (SP\u00D3\u0141KA AKCYJNA)ODDZIA\u0141 W POLSCE"),
                        new ZPair(
                                "254",
                                "Citibank Europe plc (Publiczna Sp\u00F3\u0142ka Akcyjna) Oddzia\u0142 w Polsce"),
                        new ZPair("194", "Credit Agricole Bank Polska SA"),
                        new ZPair(
                                "252",
                                "CREDIT SUISSE (LUXEMBOURG) S.A. Sp\u00F3\u0142ka Akcyjna, Oddzia\u0142 w Polsce"),
                        new ZPair("236", "Danske Bank A/S SA Oddzia\u0142 w Polsce"),
                        new ZPair("191", "Deutsche Bank PBC SA"),
                        new ZPair("188", "Deutsche Bank Polska SA"),
                        new ZPair("174", "DZ BANK Polska SA"),
                        new ZPair(
                                "241",
                                "Elavon Financial Services Limited (Sp\u00F3\u0142ka z ograniczon\u0105 odpowiedzialno\u015Bci\u0105) Oddzia\u0142 w Polsce"),
                        new ZPair("147", "Euro Bank SA"),
                        new ZPair(
                                "265",
                                "EUROCLEAR Bank SA/NV (Sp\u00F3\u0142ka Akcyjna) - Oddzia\u0142 w Polsce"),
                        new ZPair("207", "FCE Bank Polska SA"),
                        new ZPair("214", "Fiat Bank Polska SA"),
                        new ZPair("253", "FM Bank SA"),
                        new ZPair("248", "Getin Noble Bank SA"),
                        new ZPair("128", "HSBC Bank Polska SA"),
                        new ZPair("195", "Idea Bank SA"),
                        new ZPair("255", "Ikano Bank GmbH (Sp. z o.o.) Oddzia\u0142 w Polsce"),
                        new ZPair(
                                "262",
                                "Industrial and Commercial Bank of China (Europe) S.A. (Sp\u00F3\u0142ka Akcyjna) Oddzia\u0142 w Polsce"),
                        new ZPair("105", "ING Bank \u015Al\u0105ski SA"),
                        new ZPair(
                                "266",
                                "Intesa Sanpaolo S.p.A. Sp\u00F3\u0142ka Akcyjna Oddzia\u0142 w Polsce"),
                        new ZPair("168", "INVEST - BANK SA"),
                        new ZPair(
                                "258",
                                "J.P. Morgan Europe Limited Sp. z o.o. Oddzia\u0142 w Polsce"),
                        new ZPair("158", "Mercedes-Benz Bank Polska SA"),
                        new ZPair("130", "Meritum Bank ICB SA"),
                        new ZPair("101", "Narodowy Bank Polski"),
                        new ZPair("256", "Nordea Bank AB SA Oddzia\u0142 w Polsce"),
                        new ZPair("144", "NORDEA BANK POLSKA SA"),
                        new ZPair("232", "Nykredit Realkredit A/S SA - Oddzia\u0142 w Polsce"),
                        new ZPair("189", "Pekao Bank Hipoteczny SA"),
                        new ZPair("187", "Polski Bank Przedsi\u0119biorczo\u015Bci SA"),
                        new ZPair("102", "Powszechna Kasa Oszcz\u0119dno\u015Bci Bank Polski SA"),
                        new ZPair("200", "Rabobank Polska SA"),
                        new ZPair("175", "Raiffeisen Bank Polska SA"),
                        new ZPair("167", "RBS Bank (Polska) SA"),
                        new ZPair(
                                "264", "RCI Banque Sp\u00F3\u0142ka Akcyjna Oddzia\u0142 w Polsce"),
                        new ZPair("212", "Santander Consumer Bank SA"),
                        new ZPair(
                                "263",
                                "Saxo Bank A/S Sp\u00F3\u0142ka Akcyjna Oddzia\u0142 w Polsce"),
                        new ZPair("161", "SGB-Bank SA"),
                        new ZPair(
                                "237",
                                "Skandinaviska Enskilda Banken AB (SA) - Oddzia\u0142 w Polsce"),
                        new ZPair("184", "Societe Generale SA Oddzia\u0142 w Polsce"),
                        new ZPair("225", "Svenska Handelsbanken AB SA Oddzia\u0142 w Polsce"),
                        new ZPair("227", "Sygma Banque Societe Anonyme (SA) Oddzia\u0142 w Polsce"),
                        new ZPair("216", "Toyota Bank Polska SA"),
                        new ZPair(
                                "257",
                                "UBS Limited (sp\u00F3\u0142ka z ograniczon\u0105 odpowiedzialno\u015Bci\u0105) Oddzia\u0142 w Polsce"),
                        new ZPair(
                                "261",
                                "Vanquis Bank Limited (sp\u00F3\u0142ka z ograniczon\u0105 odpowiedzialno\u015Bci\u0105) Oddzia\u0142 w Polsce"),
                        new ZPair("213", "VOLKSWAGEN BANK POLSKA SA"));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\pl_PL\\Payment")
                    .setLookup(
                            Payment.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("banks")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/pl_PL/Payment.php")
                    .addExtendsClass("Faker\\Provider\\Payment")
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
