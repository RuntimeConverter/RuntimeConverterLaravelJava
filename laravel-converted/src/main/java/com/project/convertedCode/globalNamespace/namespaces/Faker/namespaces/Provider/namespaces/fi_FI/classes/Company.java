package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.fi_FI.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/fi_FI/Company.php

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

    @ConvertedMethod
    public Object catchPhrase(RuntimeEnv env, Object... args) {
        ReferenceContainer result = new BasicReferenceContainer(null);
        ReferenceContainer word = new BasicReferenceContainer(null);
        result.setObject(ZVal.newArray());
        for (ZPair zpairResult123 :
                ZVal.getIterable(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Faker
                                                .namespaces
                                                .Provider
                                                .namespaces
                                                .fi_FI
                                                .classes
                                                .Company
                                                .RequestStaticProperties
                                                .class)
                                .catchPhraseWords,
                        env,
                        true)) {
            word = zpairResult123;
            result.arrayAppend(env)
                    .set(
                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, Company.class)
                                    .method("randomElement")
                                    .addReferenceArgs(new RuntimeArgsWithReferences().add(0, word))
                                    .call(word.getObject())
                                    .value());
        }

        return ZVal.assign(NamespaceGlobal.join.env(env).call(result.getObject(), " ").value());
    }

    @ConvertedMethod
    public Object bs(RuntimeEnv env, Object... args) {
        ReferenceContainer result = new BasicReferenceContainer(null);
        ReferenceContainer word = new BasicReferenceContainer(null);
        result.setObject(ZVal.newArray());
        for (ZPair zpairResult124 :
                ZVal.getIterable(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Faker
                                                .namespaces
                                                .Provider
                                                .namespaces
                                                .fi_FI
                                                .classes
                                                .Company
                                                .RequestStaticProperties
                                                .class)
                                .bsWords,
                        env,
                        true)) {
            word = zpairResult124;
            result.arrayAppend(env)
                    .set(
                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, Company.class)
                                    .method("randomElement")
                                    .addReferenceArgs(new RuntimeArgsWithReferences().add(0, word))
                                    .call(word.getObject())
                                    .value());
        }

        return ZVal.assign(NamespaceGlobal.join.env(env).call(result.getObject(), " ").value());
    }

    public static final Object CONST_class = "Faker\\Provider\\fi_FI\\Company";

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
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object formats =
                ZVal.arrayFromList(
                        "{{lastName}} {{companySuffix}}",
                        "{{lastName}}-{{lastName}}",
                        "{{lastName}}, {{lastName}} and {{lastName}}");

        public Object catchPhraseWords =
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.arrayFromLambdaExpression(
                                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                        () -> {
                                            return ZVal.arrayFromList(
                                                    "Ainoa",
                                                    "Adaptiivinen",
                                                    "Automatisoitu",
                                                    "Avoin",
                                                    "Avoimen l\u00E4hdekoodin",
                                                    "Digitalisoitu",
                                                    "Dynaaminen",
                                                    "Erikoistunut",
                                                    "Ennakoiva",
                                                    "Ergonominen",
                                                    "Hallittu",
                                                    "Hajautettu",
                                                    "Horisontaalinen",
                                                    "Integroitu",
                                                    "Innovatiivinen",
                                                    "Jaettava",
                                                    "Keskittynyt",
                                                    "K\u00E4ytt\u00E4j\u00E4yst\u00E4v\u00E4llinen",
                                                    "Laajenettu",
                                                    "Laajennettava",
                                                    "Lievitt\u00E4v\u00E4",
                                                    "Maailmanlaajuinen",
                                                    "Muokattava",
                                                    "Monitoroitu",
                                                    "Monikerroksinen",
                                                    "Ohjelmoitava",
                                                    "Optimoitu",
                                                    "Organisoitu",
                                                    "Orgaaninen",
                                                    "Rinnastettava",
                                                    "R\u00E4\u00E4t\u00E4l\u00F6it\u00E4v\u00E4",
                                                    "Saumaton",
                                                    "Tasapainotettava",
                                                    "T\u00E4ysin yhteensopiva",
                                                    "Yhteensopiva",
                                                    "Yksinomainen",
                                                    "Vaiheittainen",
                                                    "Virtuaalinen",
                                                    "Vision\u00E4\u00E4rinen",
                                                    "Valinnainen",
                                                    "Verkostoitunut");
                                        })),
                        new ZPair(
                                1,
                                ZVal.arrayFromLambdaExpression(
                                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                        () -> {
                                            return ZVal.arrayFromList(
                                                    "24/7",
                                                    "3. sukupolven",
                                                    "4. sukupolven",
                                                    "5. sukupolven",
                                                    "6. sukupolven",
                                                    "alueellinen",
                                                    "analysoiva",
                                                    "assymmetrinen",
                                                    "asynkroninen",
                                                    "asiakasl\u00E4ht\u00F6inen",
                                                    "dynaaminen",
                                                    "globaali",
                                                    "heuristinen",
                                                    "hybridi",
                                                    "inkrementaalinen",
                                                    "interaktiivinen",
                                                    "kahtiajakautuva",
                                                    "kaksisuuntainen",
                                                    "konkreettinen",
                                                    "korkean tason",
                                                    "logistinen",
                                                    "johdonmukainen",
                                                    "maksimaalinen",
                                                    "moniajettava",
                                                    "multimedia",
                                                    "optimaalinen",
                                                    "optimoiva",
                                                    "omistautunut",
                                                    "paikallinen",
                                                    "reaaliaikainen",
                                                    "seuraavan sukupolven",
                                                    "skaalautuva",
                                                    "systeeminen");
                                        })),
                        new ZPair(
                                2,
                                ZVal.arrayFromLambdaExpression(
                                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                        () -> {
                                            return ZVal.arrayFromList(
                                                    "algoritmi",
                                                    "yhteis\u00F6",
                                                    "analysaattori",
                                                    "sovellus",
                                                    "l\u00E4hestymistapa",
                                                    "arkkitehtuuri",
                                                    "arkisto",
                                                    "ryhm\u00E4",
                                                    "sovitin",
                                                    "benchmark",
                                                    "kapasiteetti",
                                                    "tietokanta",
                                                    "piiri",
                                                    "emulaatio",
                                                    "konsepti",
                                                    "firmware",
                                                    "rakenne",
                                                    "funktio",
                                                    "rauta",
                                                    "help-desk",
                                                    "hierarkia",
                                                    "hubi",
                                                    "implementaatio",
                                                    "intranet",
                                                    "malli",
                                                    "ohjelmisto",
                                                    "ratkaisu",
                                                    "strategia",
                                                    "menestys",
                                                    "projekti",
                                                    "tuote",
                                                    "tuki",
                                                    "www-sivusto",
                                                    "synergia",
                                                    "protokolla",
                                                    "koodaus",
                                                    "ennuste",
                                                    "joustavuus",
                                                    "extranet",
                                                    "salaus",
                                                    "kompleksisuus",
                                                    "ydin",
                                                    "asenne",
                                                    "liitto",
                                                    "internetratkaisu",
                                                    "asennus",
                                                    "monitorointi",
                                                    "infrastruktuuri");
                                        })));

        public Object bsWords =
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.arrayFromLambdaExpression(
                                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                        () -> {
                                            return ZVal.arrayFromList(
                                                    "implementoi",
                                                    "k\u00E4ytt\u00E4\u00E4",
                                                    "integroi",
                                                    "optimoi",
                                                    "kehitt\u00E4\u00E4",
                                                    "muuntaa",
                                                    "omaksuu",
                                                    "mahdollistaa",
                                                    "orkestoi",
                                                    "uudelleenkeksii",
                                                    "ker\u00E4\u00E4",
                                                    "kokoaa",
                                                    "kasvattaa",
                                                    "parantaa",
                                                    "helpottaa",
                                                    "toimittaa",
                                                    "antaa",
                                                    "t\u00E4ytt\u00E4\u00E4",
                                                    "vapauttaa",
                                                    "ajaa",
                                                    "jatkaa",
                                                    "mullistaa",
                                                    "iteroi",
                                                    "generoi",
                                                    "hy\u00F6dynt\u00E4\u00E4",
                                                    "brandaa",
                                                    "muokkaa",
                                                    "kasvattaa",
                                                    "kytkee",
                                                    "innovoi",
                                                    "viljelee",
                                                    "visualisoi");
                                        })),
                        new ZPair(
                                1,
                                ZVal.arrayFromLambdaExpression(
                                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                        () -> {
                                            return ZVal.arrayFromList(
                                                    "maailmanluokan",
                                                    "24/7",
                                                    "maailmanlaajuisia",
                                                    "interaktiivisia",
                                                    "seksikk\u00E4it\u00E4",
                                                    "rikkaita",
                                                    "vision\u00E4\u00E4risi\u00E4",
                                                    "parhaita",
                                                    "viraaleja",
                                                    "dynaamisia",
                                                    "strategisia",
                                                    "vallankumouksellisia",
                                                    "24/365",
                                                    "e-bisnes",
                                                    "virtuaalisia",
                                                    "intuitiivisia",
                                                    "ennakoivia",
                                                    "kitkattomia",
                                                    "jaettuja",
                                                    "reaaliaikaisia",
                                                    "huippuluokan",
                                                    "tehokkaita",
                                                    "suorituskykyisi\u00E4",
                                                    "pystyvi\u00E4",
                                                    "laajennettavissa olevia",
                                                    "venyvi\u00E4",
                                                    "yhteisvaikutteisia",
                                                    "seuraavan sukupolven",
                                                    "plug-and-play",
                                                    "yhteisty\u00F6kykyisi\u00E4",
                                                    "kustomoituja",
                                                    "langattomia",
                                                    "selkeit\u00E4",
                                                    "avoimen l\u00E4hdekoodin");
                                        })),
                        new ZPair(
                                2,
                                ZVal.arrayFromList(
                                        "kanavia",
                                        "silm\u00E4munia",
                                        "ratkaisuja",
                                        "e-palveluja",
                                        "portaaleja",
                                        "teknologioita",
                                        "k\u00E4ytt\u00E4ji\u00E4",
                                        "verkkoja",
                                        "palveluita",
                                        "ohjelmia",
                                        "web-ohjelmistoja",
                                        "kokemuksia",
                                        "systeemej\u00E4",
                                        "rajapintoja",
                                        "yhteis\u00F6j\u00E4",
                                        "markkinarakoja",
                                        "skeemoja",
                                        "arkkitehtuureja",
                                        "malleja",
                                        "sis\u00E4lt\u00F6\u00E4",
                                        "mainoksia")));

        public Object companySuffix =
                ZVal.arrayFromList("OY", "AB", "OY AB", "RY", "OYj", "Tmi.", "Inc.", "Ltd");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\fi_FI\\Company")
                    .setLookup(
                            Company.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "bsWords", "catchPhraseWords", "companySuffix", "formats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/fi_FI/Company.php")
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
