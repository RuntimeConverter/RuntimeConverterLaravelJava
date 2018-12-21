package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.de_DE.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/de_DE/Payment.php

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

    public static final Object CONST_class = "Faker\\Provider\\de_DE\\Payment";

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
                countryCode = "DE";
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
                                                            .de_DE
                                                            .classes
                                                            .Payment
                                                            .RequestStaticProperties
                                                            .class)
                                            .banks)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object banks =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Bank 1 Saar",
                                    "Bayerische Landesbank",
                                    "BBBank",
                                    "Berliner Sparkasse",
                                    "Berliner Volksbank",
                                    "Braunschweigische Landessparkasse",
                                    "Commerzbank",
                                    "DekaBank Deutsche Girozentrale",
                                    "Deutsche Apotheker- und \u00C4rztebank",
                                    "Deutsche Bank",
                                    "Deutsche Kreditbank",
                                    "Deutsche Pfandbriefbank",
                                    "Dortmunder Volksbank",
                                    "DZ Bank",
                                    "Erzgebirgssparkasse",
                                    "Frankfurter Sparkasse",
                                    "Frankfurter Volksbank",
                                    "Hamburger Sparkasse",
                                    "Hannoversche Volksbank",
                                    "HSGV",
                                    "HSH Nordbank",
                                    "ING-DiBa",
                                    "KfW",
                                    "Kreissparkasse Esslingen-N\u00FCrtingen",
                                    "Kreissparkasse Heilbronn",
                                    "Kreissparkasse K\u00F6ln",
                                    "Kreissparkasse Ludwigsburg",
                                    "Kreissparkasse M\u00FCnchen Starnberg Ebersberg",
                                    "L-Bank",
                                    "Landesbank Baden-W\u00FCrttemberg",
                                    "Landesbank Hessen-Th\u00FCringen",
                                    "Landessparkasse zu Oldenburg",
                                    "Landwirtschaftliche Rentenbank",
                                    "Mittelbrandenburgische Sparkasse in Potsdam",
                                    "Nassauische Sparkasse",
                                    "Norddeutsche Landesbank",
                                    "NRW.Bank",
                                    "Osts\u00E4chsische Sparkasse Dresden",
                                    "Postbank",
                                    "Sparkasse Hannover",
                                    "Sparkasse K\u00F6lnBonn",
                                    "Sparkasse Mainfranken W\u00FCrzburg",
                                    "Sparkasse N\u00FCrnberg",
                                    "Sparkasse Pforzheim Calw",
                                    "Stadtsparkasse M\u00FCnchen",
                                    "Unicredit Bank",
                                    "Vereinigte Volksbank",
                                    "Volksbank, Hildesheim-Lehrte-Pattensen",
                                    "Volksbank Alzey-Worms",
                                    "Volksbank Braunschweig Wolfsburg",
                                    "Volksbank Darmstadt - S\u00FCdhessen",
                                    "Volksbank Hohenlohe",
                                    "Volksbank Kraichgau Wiesloch-Sinsheim",
                                    "Volksbank L\u00FCneburger Heide",
                                    "Volksbank Mittelhessen",
                                    "Volksbank Paderborn-H\u00F6xter-Detmold",
                                    "Volksbank Raiffeisenbank Rosenheim-Chiemsee",
                                    "Volksbank Stuttgart",
                                    "VR Bank Main-Kinzig-B\u00FCdingen",
                                    "WGZ Bank");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\de_DE\\Payment")
                    .setLookup(
                            Payment.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("banks")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/de_DE/Payment.php")
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
