package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.it_IT.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/it_IT/Company.php

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
        for (ZPair zpairResult128 :
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
                                                .it_IT
                                                .classes
                                                .Company
                                                .RequestStaticProperties
                                                .class)
                                .catchPhraseWords,
                        env,
                        true)) {
            word = zpairResult128;
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
        for (ZPair zpairResult129 :
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
                                                .it_IT
                                                .classes
                                                .Company
                                                .RequestStaticProperties
                                                .class)
                                .bsWords,
                        env,
                        true)) {
            word = zpairResult129;
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

    public static final Object CONST_class = "Faker\\Provider\\it_IT\\Company";

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
        public Object vatId(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
                            .method("numerify")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call("IT###########")
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object formats =
                ZVal.arrayFromList(
                        "{{lastName}} {{companySuffix}}",
                        "{{lastName}}-{{lastName}} {{companySuffix}}",
                        "{{lastName}}, {{lastName}} e {{lastName}} {{companySuffix}}");

        public Object catchPhraseWords =
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.arrayFromLambdaExpression(
                                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                        () -> {
                                            return ZVal.arrayFromList(
                                                    "Abilit\u00E0",
                                                    "Access",
                                                    "Adattatore",
                                                    "Algoritmo",
                                                    "Alleanza",
                                                    "Analizzatore",
                                                    "Applicazione",
                                                    "Approccio",
                                                    "Architettura",
                                                    "Archivio",
                                                    "Intelligenza artificiale",
                                                    "Array",
                                                    "Attitudine",
                                                    "Benchmark",
                                                    "Capacit\u00E0",
                                                    "Sfida",
                                                    "Circuito",
                                                    "Collaborazione",
                                                    "Complessit\u00E0",
                                                    "Concetto",
                                                    "Conglomerato",
                                                    "Contingenza",
                                                    "Core",
                                                    "Database",
                                                    "Data-warehouse",
                                                    "Definizione",
                                                    "Emulazione",
                                                    "Codifica",
                                                    "Criptazione",
                                                    "Firmware",
                                                    "Flessibilit\u00E0",
                                                    "Previsione",
                                                    "Frame",
                                                    "framework",
                                                    "Funzione",
                                                    "Funzionalit\u00E0",
                                                    "Interfaccia grafica",
                                                    "Hardware",
                                                    "Help-desk",
                                                    "Gerarchia",
                                                    "Hub",
                                                    "Implementazione",
                                                    "Infrastruttura",
                                                    "Iniziativa",
                                                    "Installazione",
                                                    "Set di istruzioni",
                                                    "Interfaccia",
                                                    "Soluzione internet",
                                                    "Intranet",
                                                    "Conoscenza base",
                                                    "Matrici",
                                                    "Matrice",
                                                    "Metodologia",
                                                    "Middleware",
                                                    "Migrazione",
                                                    "Modello",
                                                    "Moderazione",
                                                    "Monitoraggio",
                                                    "Moratoria",
                                                    "Rete",
                                                    "Architettura aperta",
                                                    "Sistema aperto",
                                                    "Orchestrazione",
                                                    "Paradigma",
                                                    "Parallelismo",
                                                    "Policy",
                                                    "Portale",
                                                    "Struttura di prezzo",
                                                    "Prodotto",
                                                    "Produttivit\u00E0",
                                                    "Progetto",
                                                    "Proiezione",
                                                    "Protocollo",
                                                    "Servizio clienti",
                                                    "Software",
                                                    "Soluzione",
                                                    "Standardizzazione",
                                                    "Strategia",
                                                    "Struttura",
                                                    "Successo",
                                                    "Sovrastruttura",
                                                    "Supporto",
                                                    "Sinergia",
                                                    "Task-force",
                                                    "Finestra temporale",
                                                    "Strumenti",
                                                    "Utilizzazione",
                                                    "Sito web",
                                                    "Forza lavoro");
                                        })),
                        new ZPair(
                                1,
                                ZVal.arrayFromLambdaExpression(
                                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                        () -> {
                                            return ZVal.arrayFromList(
                                                    "adattiva",
                                                    "avanzata",
                                                    "migliorata",
                                                    "assimilata",
                                                    "automatizzata",
                                                    "bilanciata",
                                                    "centralizzata",
                                                    "compatibile",
                                                    "configurabile",
                                                    "cross-platform",
                                                    "decentralizzata",
                                                    "digitalizzata",
                                                    "distribuita",
                                                    "piccola",
                                                    "ergonomica",
                                                    "esclusiva",
                                                    "espansa",
                                                    "estesa",
                                                    "configurabile",
                                                    "fondamentale",
                                                    "orizzontale",
                                                    "implementata",
                                                    "innovativa",
                                                    "integrata",
                                                    "intuitiva",
                                                    "inversa",
                                                    "gestita",
                                                    "obbligatoria",
                                                    "monitorata",
                                                    "multi-canale",
                                                    "multi-laterale",
                                                    "open-source",
                                                    "operativa",
                                                    "ottimizzata",
                                                    "organica",
                                                    "persistente",
                                                    "polarizzata",
                                                    "proattiva",
                                                    "programmabile",
                                                    "progressiva",
                                                    "reattiva",
                                                    "riallineata",
                                                    "ricontestualizzata",
                                                    "ridotta",
                                                    "robusta",
                                                    "sicura",
                                                    "condivisibile",
                                                    "stand-alone",
                                                    "switchabile",
                                                    "sincronizzata",
                                                    "sinergica",
                                                    "totale",
                                                    "universale",
                                                    "user-friendly",
                                                    "versatile",
                                                    "virtuale",
                                                    "visionaria");
                                        })),
                        new ZPair(
                                2,
                                ZVal.arrayFromLambdaExpression(
                                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                        () -> {
                                            return ZVal.arrayFromList(
                                                    "24 ore",
                                                    "24/7",
                                                    "terza generazione",
                                                    "quarta generazione",
                                                    "quinta generazione",
                                                    "sesta generazione",
                                                    "asimmetrica",
                                                    "asincrona",
                                                    "background",
                                                    "bi-direzionale",
                                                    "biforcata",
                                                    "bottom-line",
                                                    "coerente",
                                                    "coesiva",
                                                    "composita",
                                                    "sensibile al contesto",
                                                    "basta sul contesto",
                                                    "basata sul contenuto",
                                                    "dedicata",
                                                    "didattica",
                                                    "direzionale",
                                                    "discreta",
                                                    "dinamica",
                                                    "eco-centrica",
                                                    "esecutiva",
                                                    "esplicita",
                                                    "full-range",
                                                    "globale",
                                                    "euristica",
                                                    "alto livello",
                                                    "olistica",
                                                    "omogenea",
                                                    "ibrida",
                                                    "impattante",
                                                    "incrementale",
                                                    "intangibile",
                                                    "interattiva",
                                                    "intermediaria",
                                                    "locale",
                                                    "logistica",
                                                    "massimizzata",
                                                    "metodica",
                                                    "mission-critical",
                                                    "mobile",
                                                    "modulare",
                                                    "motivazionale",
                                                    "multimedia",
                                                    "multi-tasking",
                                                    "nazionale",
                                                    "neutrale",
                                                    "nextgeneration",
                                                    "non-volatile",
                                                    "object-oriented",
                                                    "ottima",
                                                    "ottimizzante",
                                                    "radicale",
                                                    "real-time",
                                                    "reciproca",
                                                    "regionale",
                                                    "responsiva",
                                                    "scalabile",
                                                    "secondaria",
                                                    "stabile",
                                                    "statica",
                                                    "sistematica",
                                                    "sistemica",
                                                    "tangibile",
                                                    "terziaria",
                                                    "uniforme",
                                                    "valore aggiunto");
                                        })));

        public Object bsWords =
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.arrayFromLambdaExpression(
                                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                        () -> {
                                            return ZVal.arrayFromList(
                                                    "partnerships",
                                                    "comunit\u00E0",
                                                    "ROI",
                                                    "soluzioni",
                                                    "e-services",
                                                    "nicchie",
                                                    "tecnologie",
                                                    "contenuti",
                                                    "supply-chains",
                                                    "convergenze",
                                                    "relazioni",
                                                    "architetture",
                                                    "interfacce",
                                                    "mercati",
                                                    "e-commerce",
                                                    "sistemi",
                                                    "modelli",
                                                    "schemi",
                                                    "reti",
                                                    "applicazioni",
                                                    "metriche",
                                                    "e-business",
                                                    "funzionalit\u00E0",
                                                    "esperienze",
                                                    "webservices",
                                                    "metodologie");
                                        })),
                        new ZPair(
                                1,
                                ZVal.arrayFromLambdaExpression(
                                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                        () -> {
                                            return ZVal.arrayFromList(
                                                    "implementate",
                                                    "utilizzo",
                                                    "integrate",
                                                    "ottimali",
                                                    "evolutive",
                                                    "abilitate",
                                                    "reinventate",
                                                    "aggregate",
                                                    "migliorate",
                                                    "incentivate",
                                                    "monetizzate",
                                                    "sinergizzate",
                                                    "strategiche",
                                                    "deploy",
                                                    "marchi",
                                                    "accrescitive",
                                                    "target",
                                                    "sintetizzate",
                                                    "spedizioni",
                                                    "massimizzate",
                                                    "innovazione",
                                                    "guida",
                                                    "estensioni",
                                                    "generate",
                                                    "exploit",
                                                    "transizionali",
                                                    "matrici",
                                                    "ricontestualizzate");
                                        })),
                        new ZPair(
                                2,
                                ZVal.arrayFromLambdaExpression(
                                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                        () -> {
                                            return ZVal.arrayFromList(
                                                    "valore aggiunto",
                                                    "verticalizzate",
                                                    "proattive",
                                                    "forti",
                                                    "rivoluzionari",
                                                    "scalabili",
                                                    "innovativi",
                                                    "intuitivi",
                                                    "strategici",
                                                    "e-business",
                                                    "mission-critical",
                                                    "24/7",
                                                    "globali",
                                                    "B2B",
                                                    "B2C",
                                                    "granulari",
                                                    "virtuali",
                                                    "virali",
                                                    "dinamiche",
                                                    "magnetiche",
                                                    "web",
                                                    "interattive",
                                                    "sexy",
                                                    "back-end",
                                                    "real-time",
                                                    "efficienti",
                                                    "front-end",
                                                    "distributivi",
                                                    "estensibili",
                                                    "mondiali",
                                                    "open-source",
                                                    "cross-platform",
                                                    "sinergiche",
                                                    "out-of-the-box",
                                                    "enterprise",
                                                    "integrate",
                                                    "di impatto",
                                                    "wireless",
                                                    "trasparenti",
                                                    "next-generation",
                                                    "cutting-edge",
                                                    "visionari",
                                                    "plug-and-play",
                                                    "collaborative",
                                                    "olistiche",
                                                    "ricche");
                                        })));

        public Object companySuffix = ZVal.arrayFromList("SPA", "e figli", "Group", "s.r.l.");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\it_IT\\Company")
                    .setLookup(
                            Company.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "bsWords", "catchPhraseWords", "companySuffix", "formats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/it_IT/Company.php")
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
