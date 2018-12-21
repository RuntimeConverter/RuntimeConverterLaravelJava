package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.sk_SK.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/sk_SK/Company.php

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
        for (ZPair zpairResult132 :
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
                                                .sk_SK
                                                .classes
                                                .Company
                                                .RequestStaticProperties
                                                .class)
                                .catchPhraseWords,
                        env,
                        true)) {
            word = zpairResult132;
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
        for (ZPair zpairResult133 :
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
                                                .sk_SK
                                                .classes
                                                .Company
                                                .RequestStaticProperties
                                                .class)
                                .bsWords,
                        env,
                        true)) {
            word = zpairResult133;
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

    public static final Object CONST_class = "Faker\\Provider\\sk_SK\\Company";

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
                                                    "Adapt\u00EDvne",
                                                    "Automatick\u00E9",
                                                    "Vyv\u00E1\u017Een\u00E9",
                                                    "Obchodn\u00FD-s\u00FAstreden\u00FD",
                                                    "centralizovan\u00E9",
                                                    "Cloned",
                                                    "kompatibiln\u00E9",
                                                    "nastavite\u013En\u00FD",
                                                    "Cross-group",
                                                    "Cross-platform",
                                                    "z\u00E1kazn\u00EDka zameran\u00E9",
                                                    "Prisp\u00F4sobite\u013En\u00E9",
                                                    "Decentralizovan\u00E9",
                                                    "De-in\u017Einierstva",
                                                    "prenesen\u00FA",
                                                    "Digit\u00E1lne",
                                                    "distribuovan\u00E9",
                                                    "R\u00F4zne",
                                                    "Down ve\u013Ekosti",
                                                    "Roz\u0161\u00EDren\u00FD",
                                                    "Celopodnikov\u00E9 ",
                                                    " Ergonomick\u00E1",
                                                    "Expanded",
                                                    "Roz\u0161\u00EDren\u00E9",
                                                    "Plne konfigurovate\u013En\u00E9",
                                                    "Funkcia na b\u00E1ze",
                                                    "Z\u00E1kladn\u00FD",
                                                    "Perspekt\u00EDvne",
                                                    "inovat\u00EDvne",
                                                    "integrovan\u00E9",
                                                    "Intuit\u00EDvne",
                                                    "Inverzn\u00FD",
                                                    "Povinne monitorovan\u00E1",
                                                    "Multi-pre\u0161itia",
                                                    "multi-later\u00E1lne",
                                                    "Viacvrstvov\u00E1",
                                                    "Viacvrstvov\u00E1",
                                                    "Sie\u0165ov\u00E1",
                                                    "Objektovo zalo\u017Een\u00E1",
                                                    "Open-architekt\u00FAru",
                                                    "Open-source",
                                                    "Operat\u00EDvny",
                                                    "Optimalizovan\u00E9",
                                                    "Volite\u013En\u00FD",
                                                    "Organick\u00E9",
                                                    "Organizovan\u00E1",
                                                    "Trval\u00E9",
                                                    "Polarizovan\u00E9",
                                                    "Prevent\u00EDvne",
                                                    "Akt\u00EDvne",
                                                    "Na zisk zameran\u00E1",
                                                    "Hlbok\u00E1",
                                                    "programovate\u013En\u00FD",
                                                    "progres\u00EDvne",
                                                    "verejn\u00E9ho k\u013E\u00FA\u010Da",
                                                    "kvalita zameran\u00E9",
                                                    "reakt\u00EDvne",
                                                    "Rekon\u0161truovan\u00E9",
                                                    "Zn\u00ED\u017Een\u00E1",
                                                    "Pr\u00E1vo ve\u013Ek\u00E9",
                                                    "robustn\u00E9",
                                                    "Bezpe\u010Dn\u00E9",
                                                    "Jednoduch\u0161ie",
                                                    "Prep\u00EDnanie",
                                                    "Synchronizovan\u00E9",
                                                    "synergick\u00FD",
                                                    "spojil",
                                                    "t\u00EDm-orientovan\u00E1",
                                                    "Univerz\u00E1lne",
                                                    "U\u017E\u00EDvate\u013Esky pr\u00EDvetiv\u00FD",
                                                    "Univerz\u00E1lne",
                                                    "Virtu\u00E1lne",
                                                    "Vizion\u00E1rske");
                                        })),
                        new ZPair(
                                1,
                                ZVal.arrayFromLambdaExpression(
                                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                        () -> {
                                            return ZVal.arrayFromList(
                                                    "kontrola",
                                                    "anal\u00FDzu",
                                                    "asymetrick\u00FD",
                                                    "asynchr\u00F3nne",
                                                    "pr\u00EDstup orientovan\u00FD",
                                                    "pozad\u00ED",
                                                    "na \u0161\u00EDrku p\u00E1sma, monitorova\u0165",
                                                    "obojsmern\u00E1",
                                                    "roz\u0161tiepen\u00E9",
                                                    "jasne myslenie",
                                                    "klient-driven",
                                                    "klient-server",
                                                    "koherentn\u00E9",
                                                    "s\u00FAdr\u017Enosti",
                                                    "kompozitn\u00E9",
                                                    "kontextov\u00FD",
                                                    "kontextovo zalo\u017Een\u00E1",
                                                    "obsah na b\u00E1ze",
                                                    "oddan\u00FD",
                                                    "dopytom",
                                                    "u\u010Debn\u00FD",
                                                    "riadiace",
                                                    "diskr\u00E9tne",
                                                    "dynamick\u00E1",
                                                    "posilnenie",
                                                    "zah\u0155\u0148aj\u00FAci",
                                                    "mana\u017E\u00E9r",
                                                    "explicitn\u00E9",
                                                    "vy\u017Earuje",
                                                    "odoln\u00E9 proti chyb\u00E1m",
                                                    "popredia",
                                                    "\u010Derstv\u00E9 myslenia",
                                                    "Glob\u00E1lne",
                                                    "heuristick\u00FD",
                                                    "homog\u00E9nna",
                                                    "\u013Eudsk\u00FDch zdrojov",
                                                    "hybridn\u00FD",
                                                    "p\u00F4sobiv\u00FDch",
                                                    "\u010Diastkov\u00E9",
                                                    "nehmotnej",
                                                    "interakt\u00EDvny",
                                                    "stredn\u00E9",
                                                    "miestna",
                                                    "logistick\u00E9",
                                                    "maxim\u00E1lny",
                                                    "metodick\u00FA",
                                                    "kritick\u00E9",
                                                    "mobil",
                                                    "modul\u00E1rny",
                                                    "motivuje",
                                                    "multimedi\u00E1lny",
                                                    "multi-\u0161t\u00E1t",
                                                    "multi-tasking",
                                                    "n\u00E1rodn\u00FD",
                                                    "zalo\u017Een\u00E1 na skuto\u010Dn\u00FDch potreb\u00E1ch",
                                                    "neutr\u00E1lny",
                                                    "objektovo orientovan\u00FD",
                                                    "optim\u00E1lnu",
                                                    "optimaliz\u00E1cia",
                                                    "radik\u00E1lne",
                                                    "v re\u00E1lnom \u010Dase",
                                                    "vz\u00E1jomn\u00E1",
                                                    "region\u00E1lne",
                                                    "citliv\u00FD",
                                                    "\u0161k\u00E1lovate\u013En\u00E9",
                                                    "stredn\u00E9",
                                                    "zameriavalo na h\u013Eadanie rie\u0161enia",
                                                    "stabiln\u00FD",
                                                    "statick\u00E9",
                                                    "systematick\u00E9",
                                                    "syst\u00E9mov\u00E9",
                                                    "syst\u00E9m-hodn\u00FD",
                                                    "hmotn\u00E1",
                                                    "terci\u00E1rny",
                                                    "prechodn\u00E9",
                                                    "jednotn\u00FD",
                                                    "pridan\u00E1 hodnota",
                                                    "dobre modulovan\u00FD");
                                        })),
                        new ZPair(
                                2,
                                ZVal.arrayFromLambdaExpression(
                                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                        () -> {
                                            return ZVal.arrayFromList(
                                                    "schopnos\u0165",
                                                    "pr\u00EDstup",
                                                    "algoritmus",
                                                    "aliancie",
                                                    "analyz\u00E1tor",
                                                    "aplik\u00E1cie",
                                                    "pr\u00EDstup",
                                                    "architekt\u00FAra",
                                                    "arch\u00EDv",
                                                    "pole",
                                                    "postoj",
                                                    "referen\u010Dn\u00E9",
                                                    "schopnos\u0165",
                                                    "kapacita",
                                                    "v\u00FDzva",
                                                    "okruh",
                                                    "spolupr\u00E1ca",
                                                    "zlo\u017Eitos\u0165",
                                                    "koncept",
                                                    "konglomer\u00E1t",
                                                    "pohotovostn\u00FD",
                                                    "jadro",
                                                    "datab\u00E1za",
                                                    "sklad d\u00E1t",
                                                    "defin\u00EDcie",
                                                    "emul\u00E1cia",
                                                    "k\u00F3dovanie",
                                                    "\u0161ifrovanie",
                                                    "extranet",
                                                    "firmware",
                                                    "flexibilita",
                                                    "po\u010Dasia",
                                                    "r\u00E1m",
                                                    "r\u00E1mec",
                                                    "funkcie",
                                                    "funkcie",
                                                    "hardware",
                                                    "help-desk",
                                                    "hierarchie",
                                                    "h\u00FAb",
                                                    "vykon\u00E1vanie",
                                                    "infra\u0161trukt\u00FAra",
                                                    "iniciat\u00EDva",
                                                    "in\u0161tal\u00E1cia",
                                                    "rozhranie",
                                                    "encyklop\u00E9dia",
                                                    "p\u00E1kov\u00FD efekt",
                                                    "metodika",
                                                    "migr\u00E1cia",
                                                    "model",
                                                    "moder\u00E1tor",
                                                    "kontrola",
                                                    "morat\u00F3rium",
                                                    "neur\u00F3nov\u00E9-siete",
                                                    "paradigma",
                                                    "paraleln\u00E9",
                                                    "politika",
                                                    "port\u00E1l",
                                                    "produkt",
                                                    "produktivita",
                                                    "projekt",
                                                    "projekcie",
                                                    "protokol",
                                                    "slu\u017Eba",
                                                    "softv\u00E9r",
                                                    "rie\u0161enie",
                                                    "normaliz\u00E1cie",
                                                    "strat\u00E9gia",
                                                    "\u0161trukt\u00FAra",
                                                    "\u00FAspech",
                                                    "nadstavba",
                                                    "pomoc",
                                                    "synergia",
                                                    "priepustnos\u0165",
                                                    "\u010Dasovom horizonte",
                                                    "sadu n\u00E1strojov",
                                                    "vyu\u017Eitie",
                                                    "web",
                                                    "pracovn\u00E1 sila");
                                        })));

        public Object bsWords =
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.arrayFromLambdaExpression(
                                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                        () -> {
                                            return ZVal.arrayFromList(
                                                    "implement",
                                                    "utilize",
                                                    "integrate",
                                                    "streamline",
                                                    "optimize",
                                                    "evolve",
                                                    "transform",
                                                    "embrace",
                                                    "enable",
                                                    "orchestrate",
                                                    "leverage",
                                                    "reinvent",
                                                    "aggregate",
                                                    "architect",
                                                    "enhance",
                                                    "incentivize",
                                                    "morph",
                                                    "empower",
                                                    "envisioneer",
                                                    "monetize",
                                                    "harness",
                                                    "facilitate",
                                                    "seize",
                                                    "disintermediate",
                                                    "synergize",
                                                    "strategize",
                                                    "deploy",
                                                    "brand",
                                                    "grow",
                                                    "target",
                                                    "syndicate",
                                                    "synthesize",
                                                    "deliver",
                                                    "mesh",
                                                    "incubate",
                                                    "engage",
                                                    "maximize",
                                                    "benchmark",
                                                    "expedite",
                                                    "reintermediate",
                                                    "whiteboard",
                                                    "visualize",
                                                    "repurpose",
                                                    "innovate",
                                                    "scale",
                                                    "unleash",
                                                    "drive",
                                                    "extend",
                                                    "engineer",
                                                    "revolutionize",
                                                    "generate",
                                                    "exploit",
                                                    "transition",
                                                    "e-enable",
                                                    "iterate",
                                                    "cultivate",
                                                    "matrix",
                                                    "productize",
                                                    "redefine",
                                                    "recontextualize");
                                        })),
                        new ZPair(
                                1,
                                ZVal.arrayFromLambdaExpression(
                                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                        () -> {
                                            return ZVal.arrayFromList(
                                                    "clicks-and-mortar",
                                                    "value-added",
                                                    "vertical",
                                                    "proactive",
                                                    "robust",
                                                    "revolutionary",
                                                    "scalable",
                                                    "leading-edge",
                                                    "innovative",
                                                    "intuitive",
                                                    "strategic",
                                                    "e-business",
                                                    "mission-critical",
                                                    "sticky",
                                                    "one-to-one",
                                                    "24/7",
                                                    "end-to-end",
                                                    "global",
                                                    "B2B",
                                                    "B2C",
                                                    "granular",
                                                    "frictionless",
                                                    "virtual",
                                                    "viral",
                                                    "dynamic",
                                                    "24/365",
                                                    "best-of-breed",
                                                    "killer",
                                                    "magnetic",
                                                    "bleeding-edge",
                                                    "web-enabled",
                                                    "interactive",
                                                    "dot-com",
                                                    "sexy",
                                                    "back-end",
                                                    "real-time",
                                                    "efficient",
                                                    "front-end",
                                                    "distributed",
                                                    "seamless",
                                                    "extensible",
                                                    "turn-key",
                                                    "world-class",
                                                    "open-source",
                                                    "cross-platform",
                                                    "cross-media",
                                                    "synergistic",
                                                    "bricks-and-clicks",
                                                    "out-of-the-box",
                                                    "enterprise",
                                                    "integrated",
                                                    "impactful",
                                                    "wireless",
                                                    "transparent",
                                                    "next-generation",
                                                    "cutting-edge",
                                                    "user-centric",
                                                    "visionary",
                                                    "customized",
                                                    "ubiquitous",
                                                    "plug-and-play",
                                                    "collaborative",
                                                    "compelling",
                                                    "holistic",
                                                    "rich");
                                        })),
                        new ZPair(
                                2,
                                ZVal.arrayFromLambdaExpression(
                                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                        () -> {
                                            return ZVal.arrayFromList(
                                                    "synergies",
                                                    "web-readiness",
                                                    "paradigms",
                                                    "markets",
                                                    "partnerships",
                                                    "infrastructures",
                                                    "platforms",
                                                    "initiatives",
                                                    "channels",
                                                    "eyeballs",
                                                    "communities",
                                                    "ROI",
                                                    "solutions",
                                                    "e-tailers",
                                                    "e-services",
                                                    "action-items",
                                                    "portals",
                                                    "niches",
                                                    "technologies",
                                                    "content",
                                                    "vortals",
                                                    "supply-chains",
                                                    "convergence",
                                                    "relationships",
                                                    "architectures",
                                                    "interfaces",
                                                    "e-markets",
                                                    "e-commerce",
                                                    "systems",
                                                    "bandwidth",
                                                    "infomediaries",
                                                    "models",
                                                    "mindshare",
                                                    "deliverables",
                                                    "users",
                                                    "schemas",
                                                    "networks",
                                                    "applications",
                                                    "metrics",
                                                    "e-business",
                                                    "functionalities",
                                                    "experiences",
                                                    "webservices",
                                                    "methodologies");
                                        })));

        public Object companySuffix = ZVal.arrayFromList("s.r.o.", "a.s.", "v.o.s.");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\sk_SK\\Company")
                    .setLookup(
                            Company.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "bsWords", "catchPhraseWords", "companySuffix", "formats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/sk_SK/Company.php")
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
