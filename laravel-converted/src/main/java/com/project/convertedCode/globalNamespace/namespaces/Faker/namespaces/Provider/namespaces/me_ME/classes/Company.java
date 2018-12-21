package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.me_ME.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/me_ME/Company.php

*/

public class Company
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .Company {

    public Company(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Company.class) {
            this.__construct(env, args);
        }
    }

    public Company(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Faker\\Provider\\me_ME\\Company";

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
                    .Company
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object companyType(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
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
                                                            .me_ME
                                                            .classes
                                                            .Company
                                                            .RequestStaticProperties
                                                            .class)
                                            .types)
                            .value());
        }

        @ConvertedMethod
        public Object companyName(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
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
                                                            .me_ME
                                                            .classes
                                                            .Company
                                                            .RequestStaticProperties
                                                            .class)
                                            .names)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object formats = ZVal.arrayFromList("{{companyName}} {{companyType}}");

        public Object names =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "13 Jul - Planta\u017Ee ",
                                    "19 Decembar Podgorica",
                                    "Agrokombinat 13 Jul",
                                    "Agrokombinat 13 Jul",
                                    "Atlas Banka",
                                    "Autoremont Osmanagi\u0107",
                                    "Bo\u017Eur-Velexport",
                                    "Businessmontenegro Podgorica",
                                    "Cemex Montenegro",
                                    "Centralna Depozitarna Agencija ",
                                    "Centroko\u017Ea-Produkt ",
                                    "CG Broker",
                                    "CMC AD Podgorica",
                                    "Crnagoradrvo",
                                    "Crnagoraput",
                                    "Crnogorska Komercijalna Banka ",
                                    "Crnogorski Telekom",
                                    "Doclea Express Podgorica",
                                    "Dru\u0161tvo Za Upravljanje Investicionim Fondom Atlas Mont",
                                    "Drvoimpex",
                                    "Drvoimpex",
                                    "Drvoimpex",
                                    "Drvoimpex-Bams",
                                    "Drvoimpex-Fincom",
                                    "Drvoimpex-Gm Podgorica",
                                    "Drvoimpex-Mobile",
                                    "Duklja - Zora",
                                    "Duklja Podgorica",
                                    "Duklja-Pekara",
                                    "Duvanski Kombinat, Podgorica",
                                    "Elastik-Plastika Ad Podgorica",
                                    "Erste Bank Ad Podgorica",
                                    "Euromarket Banka Nlb Grupa ",
                                    "Exal",
                                    "Export-Import Servisimport Si",
                                    "Fond Zajedni\u010Dkog Ulaganja Moneta",
                                    "Goricapromet Podgorica",
                                    "Gornji Ibar A.D.",
                                    "Gp Radnik Beton",
                                    "Gra\u0111evinar Podgorica",
                                    "Gross Market Podgorica",
                                    "H.T.P.Velika Pla\u017Ea A.D",
                                    "Higijena Podgorica",
                                    "Hipotekarna Banka",
                                    "Hotel Ravnjak",
                                    "Industriaimpex A.D.",
                                    "Inpek",
                                    "Institut Za \u0160umarstvo ",
                                    "Intours",
                                    "Invest Banka Montenegro",
                                    "Izdava\u010Dko-Prometno Dru\u0161tvo Ljetopis",
                                    "Lov\u0107en Podgorica",
                                    "Lov\u0107en-Re",
                                    "Lov\u0107eninvest Podgorica",
                                    "Lutrija Crne Gore",
                                    "Margomarket Podgorica",
                                    "Ma\u0161inopromet",
                                    "Ma\u0161inopromet-Commerce",
                                    "Mesopromet Podgorica",
                                    "Mljekara",
                                    "Moneta A.D.",
                                    "Montenegroberza Akcionarsko Dru\u0161tvo",
                                    "Mora\u010Da Podgorica",
                                    "Mora\u010Da Sa P.O.",
                                    "Nex Montenegro",
                                    "Novogradnja Ad Podgorica",
                                    "Osiguravaju\u0107e Dru\u0161tvo Swiss Osiguranje",
                                    "Papir",
                                    "Podgoricaekspres",
                                    "Progas Podgorica",
                                    "Promet",
                                    "Prva Banka Crne Gore Podgorica",
                                    "Ribnica Commerce",
                                    "Sava Montenegro Podgorica",
                                    "Si Promet A.D.",
                                    "Sigmobil",
                                    "Societe Generale Banka Montenegro Ad",
                                    "Solar 80 - Elastik",
                                    "Stadion",
                                    "\u0160umarsko Preduze\u0107e ",
                                    "Tehnomarketi",
                                    "Tpc Ra\u017Enatovi\u0107",
                                    "Trend A.D.",
                                    "Trgopress",
                                    "Unifarm ",
                                    "Utip Crna Gora",
                                    "Vatrostalna Podgorica",
                                    "Velepromet Podgorica",
                                    "Veletrgovina-Kola\u0161in",
                                    "Velimport Podgorica",
                                    "Volumentrade Podgorica",
                                    "\u017Deljeznica Crne Gore",
                                    "Zetatrans");
                        });

        public Object types = ZVal.arrayFromList("A.D.", "A.D PODGORICA");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\me_ME\\Company")
                    .setLookup(
                            Company.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("formats", "names", "types")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/me_ME/Company.php")
                    .addExtendsClass("Faker\\Provider\\Company")
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
