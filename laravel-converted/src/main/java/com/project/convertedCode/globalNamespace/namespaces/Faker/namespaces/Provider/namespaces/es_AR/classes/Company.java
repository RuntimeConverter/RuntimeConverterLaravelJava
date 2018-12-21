package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.es_AR.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/es_AR/Company.php

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
        for (ZPair zpairResult117 :
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
                                                .es_AR
                                                .classes
                                                .Company
                                                .RequestStaticProperties
                                                .class)
                                .catchPhraseWords,
                        env,
                        true)) {
            word = zpairResult117;
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
        for (ZPair zpairResult118 :
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
                                                .es_AR
                                                .classes
                                                .Company
                                                .RequestStaticProperties
                                                .class)
                                .bsWords,
                        env,
                        true)) {
            word = zpairResult118;
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

    public static final Object CONST_class = "Faker\\Provider\\es_AR\\Company";

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
                        "{{lastName}} y {{lastName}}",
                        "{{lastName}} de {{lastName}}",
                        "{{lastName}}, {{lastName}} y {{lastName}}");

        public Object catchPhraseWords =
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.arrayFromLambdaExpression(
                                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                        () -> {
                                            return ZVal.arrayFromList(
                                                    "Adaptive",
                                                    "Advanced",
                                                    "Ameliorated",
                                                    "Assimilated",
                                                    "Automated",
                                                    "Balanced",
                                                    "Business-focused",
                                                    "Centralized",
                                                    "Cloned",
                                                    "Compatible",
                                                    "Configurable",
                                                    "Cross-group",
                                                    "Cross-platform",
                                                    "Customer-focused",
                                                    "Customizable",
                                                    "Decentralized",
                                                    "De-engineered",
                                                    "Devolved",
                                                    "Digitized",
                                                    "Distributed",
                                                    "Diverse",
                                                    "Down-sized",
                                                    "Enhanced",
                                                    "Enterprise-wide",
                                                    "Ergonomic",
                                                    "Exclusive",
                                                    "Expanded",
                                                    "Extended",
                                                    "Facetoface",
                                                    "Focused",
                                                    "Front-line",
                                                    "Fully-configurable",
                                                    "Function-based",
                                                    "Fundamental",
                                                    "Future-proofed",
                                                    "Grass-roots",
                                                    "Horizontal",
                                                    "Implemented",
                                                    "Innovative",
                                                    "Integrated",
                                                    "Intuitive",
                                                    "Inverse",
                                                    "Managed",
                                                    "Mandatory",
                                                    "Monitored",
                                                    "Multi-channelled",
                                                    "Multi-lateral",
                                                    "Multi-layered",
                                                    "Multi-tiered",
                                                    "Networked",
                                                    "Object-based",
                                                    "Open-architected",
                                                    "Open-source",
                                                    "Operative",
                                                    "Optimized",
                                                    "Optional",
                                                    "Organic",
                                                    "Organized",
                                                    "Persevering",
                                                    "Persistent",
                                                    "Phased",
                                                    "Polarised",
                                                    "Pre-emptive",
                                                    "Proactive",
                                                    "Profit-focused",
                                                    "Profound",
                                                    "Programmable",
                                                    "Progressive",
                                                    "Public-key",
                                                    "Quality-focused",
                                                    "Reactive",
                                                    "Realigned",
                                                    "Re-contextualized",
                                                    "Re-engineered",
                                                    "Reduced",
                                                    "Reverse-engineered",
                                                    "Right-sized",
                                                    "Robust",
                                                    "Seamless",
                                                    "Secured",
                                                    "Self-enabling",
                                                    "Sharable",
                                                    "Stand-alone",
                                                    "Streamlined",
                                                    "Switchable",
                                                    "Synchronised",
                                                    "Synergistic",
                                                    "Synergized",
                                                    "Team-oriented",
                                                    "Total",
                                                    "Triple-buffered",
                                                    "Universal",
                                                    "Up-sized",
                                                    "Upgradable",
                                                    "User-centric",
                                                    "User-friendly",
                                                    "Versatile",
                                                    "Virtual",
                                                    "Visionary",
                                                    "Vision-oriented");
                                        })),
                        new ZPair(
                                1,
                                ZVal.arrayFromLambdaExpression(
                                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                        () -> {
                                            return ZVal.arrayFromList(
                                                    "24hour",
                                                    "24/7",
                                                    "3rdgeneration",
                                                    "4thgeneration",
                                                    "5thgeneration",
                                                    "6thgeneration",
                                                    "actuating",
                                                    "analyzing",
                                                    "assymetric",
                                                    "asynchronous",
                                                    "attitude-oriented",
                                                    "background",
                                                    "bandwidth-monitored",
                                                    "bi-directional",
                                                    "bifurcated",
                                                    "bottom-line",
                                                    "clear-thinking",
                                                    "client-driven",
                                                    "client-server",
                                                    "coherent",
                                                    "cohesive",
                                                    "composite",
                                                    "context-sensitive",
                                                    "contextually-based",
                                                    "content-based",
                                                    "dedicated",
                                                    "demand-driven",
                                                    "didactic",
                                                    "directional",
                                                    "discrete",
                                                    "disintermediate",
                                                    "dynamic",
                                                    "eco-centric",
                                                    "empowering",
                                                    "encompassing",
                                                    "even-keeled",
                                                    "executive",
                                                    "explicit",
                                                    "exuding",
                                                    "fault-tolerant",
                                                    "foreground",
                                                    "fresh-thinking",
                                                    "full-range",
                                                    "global",
                                                    "grid-enabled",
                                                    "heuristic",
                                                    "high-level",
                                                    "holistic",
                                                    "homogeneous",
                                                    "human-resource",
                                                    "hybrid",
                                                    "impactful",
                                                    "incremental",
                                                    "intangible",
                                                    "interactive",
                                                    "intermediate",
                                                    "leadingedge",
                                                    "local",
                                                    "logistical",
                                                    "maximized",
                                                    "methodical",
                                                    "mission-critical",
                                                    "mobile",
                                                    "modular",
                                                    "motivating",
                                                    "multimedia",
                                                    "multi-state",
                                                    "multi-tasking",
                                                    "national",
                                                    "needs-based",
                                                    "neutral",
                                                    "nextgeneration",
                                                    "non-volatile",
                                                    "object-oriented",
                                                    "optimal",
                                                    "optimizing",
                                                    "radical",
                                                    "real-time",
                                                    "reciprocal",
                                                    "regional",
                                                    "responsive",
                                                    "scalable",
                                                    "secondary",
                                                    "solution-oriented",
                                                    "stable",
                                                    "static",
                                                    "systematic",
                                                    "systemic",
                                                    "system-worthy",
                                                    "tangible",
                                                    "tertiary",
                                                    "transitional",
                                                    "uniform",
                                                    "upward-trending",
                                                    "user-facing",
                                                    "value-added",
                                                    "web-enabled",
                                                    "well-modulated",
                                                    "zeroadministration",
                                                    "zerodefect",
                                                    "zerotolerance");
                                        })),
                        new ZPair(
                                2,
                                ZVal.arrayFromLambdaExpression(
                                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                        () -> {
                                            return ZVal.arrayFromList(
                                                    "ability",
                                                    "access",
                                                    "adapter",
                                                    "algorithm",
                                                    "alliance",
                                                    "analyzer",
                                                    "application",
                                                    "approach",
                                                    "architecture",
                                                    "archive",
                                                    "artificialintelligence",
                                                    "array",
                                                    "attitude",
                                                    "benchmark",
                                                    "budgetarymanagement",
                                                    "capability",
                                                    "capacity",
                                                    "challenge",
                                                    "circuit",
                                                    "collaboration",
                                                    "complexity",
                                                    "concept",
                                                    "conglomeration",
                                                    "contingency",
                                                    "core",
                                                    "customerloyalty",
                                                    "database",
                                                    "data-warehouse",
                                                    "definition",
                                                    "emulation",
                                                    "encoding",
                                                    "encryption",
                                                    "extranet",
                                                    "firmware",
                                                    "flexibility",
                                                    "focusgroup",
                                                    "forecast",
                                                    "frame",
                                                    "framework",
                                                    "function",
                                                    "functionalities",
                                                    "GraphicInterface",
                                                    "groupware",
                                                    "GraphicalUserInterface",
                                                    "hardware",
                                                    "help-desk",
                                                    "hierarchy",
                                                    "hub",
                                                    "implementation",
                                                    "info-mediaries",
                                                    "infrastructure",
                                                    "initiative",
                                                    "installation",
                                                    "instructionset",
                                                    "interface",
                                                    "internetsolution",
                                                    "intranet",
                                                    "knowledgeuser",
                                                    "knowledgebase",
                                                    "localareanetwork",
                                                    "leverage",
                                                    "matrices",
                                                    "matrix",
                                                    "methodology",
                                                    "middleware",
                                                    "migration",
                                                    "model",
                                                    "moderator",
                                                    "monitoring",
                                                    "moratorium",
                                                    "neural-net",
                                                    "openarchitecture",
                                                    "opensystem",
                                                    "orchestration",
                                                    "paradigm",
                                                    "parallelism",
                                                    "policy",
                                                    "portal",
                                                    "pricingstructure",
                                                    "processimprovement",
                                                    "product",
                                                    "productivity",
                                                    "project",
                                                    "projection",
                                                    "protocol",
                                                    "securedline",
                                                    "service-desk",
                                                    "software",
                                                    "solution",
                                                    "standardization",
                                                    "strategy",
                                                    "structure",
                                                    "success",
                                                    "superstructure",
                                                    "support",
                                                    "synergy",
                                                    "systemengine",
                                                    "task-force",
                                                    "throughput",
                                                    "time-frame",
                                                    "toolset",
                                                    "utilisation",
                                                    "website",
                                                    "workforce");
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

        public Object companySuffix =
                ZVal.arrayFromList(
                        "e Hijo",
                        "e Hija",
                        "e Hijos",
                        "y Asoc.",
                        "y Flia.",
                        "SRL",
                        "SA",
                        "S. de H.");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\es_AR\\Company")
                    .setLookup(
                            Company.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "bsWords", "catchPhraseWords", "companySuffix", "formats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/es_AR/Company.php")
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
