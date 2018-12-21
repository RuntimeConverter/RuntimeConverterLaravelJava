package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.cs_CZ.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
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
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/cs_CZ/Company.php

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
    public Object catchPhraseNoun(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
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
                                                                .cs_CZ
                                                                .classes
                                                                .Company
                                                                .RequestStaticProperties
                                                                .class,
                                                        "noun")))
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
                                                        .cs_CZ
                                                        .classes
                                                        .Company
                                                        .RequestStaticProperties
                                                        .class)
                                        .noun)
                        .value());
    }

    @ConvertedMethod
    public Object catchPhraseAttribute(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
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
                                                                .cs_CZ
                                                                .classes
                                                                .Company
                                                                .RequestStaticProperties
                                                                .class,
                                                        "attribute")))
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
                                                        .cs_CZ
                                                        .classes
                                                        .Company
                                                        .RequestStaticProperties
                                                        .class)
                                        .attribute)
                        .value());
    }

    @ConvertedMethod
    public Object catchPhraseVerb(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
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
                                                                .cs_CZ
                                                                .classes
                                                                .Company
                                                                .RequestStaticProperties
                                                                .class,
                                                        "verb")))
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
                                                        .cs_CZ
                                                        .classes
                                                        .Company
                                                        .RequestStaticProperties
                                                        .class)
                                        .verb)
                        .value());
    }

    @ConvertedMethod
    public Object catchPhrase(RuntimeEnv env, Object... args) {
        Object format = null;
        format =
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
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
                                                                .cs_CZ
                                                                .classes
                                                                .Company
                                                                .RequestStaticProperties
                                                                .class,
                                                        "catchPhraseFormats")))
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
                                                        .cs_CZ
                                                        .classes
                                                        .Company
                                                        .RequestStaticProperties
                                                        .class)
                                        .catchPhraseFormats)
                        .value();
        return ZVal.assign(
                NamespaceGlobal.ucfirst
                        .env(env)
                        .call(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("generator")
                                                .value(),
                                        "parse",
                                        Company.class,
                                        format))
                        .value());
    }

    @ConvertedMethod
    public Object ico(RuntimeEnv env, Object... args) {
        Object p = null;
        ReferenceContainer split = new BasicReferenceContainer(null);
        Object prod = null;
        Object mod = null;
        Object ico = null;
        Object i = null;
        ico =
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Company.class)
                        .method("numerify")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call("#######")
                        .value();
        split.setObject(NamespaceGlobal.str_split.env(env).call(ico).value());
        prod = 0;
        for (ZPair zpairResult114 :
                ZVal.getIterable(ZVal.arrayFromList(8, 7, 6, 5, 4, 3, 2), env, false)) {
            i = ZVal.assign(zpairResult114.getKey());
            p = ZVal.assign(zpairResult114.getValue());
            prod = ZAssignment.add("+=", prod, ZVal.multiply(p, split.arrayGet(env, i)));
        }

        mod = ZVal.modulus(prod, 11);
        if (ZVal.toBool(ZVal.strictEqualityCheck(mod, "===", 0))
                || ZVal.toBool(ZVal.strictEqualityCheck(mod, "===", 10))) {
            return ZVal.assign(toStringR(ico, env) + "1");

        } else if (ZVal.strictEqualityCheck(mod, "===", 1)) {
            return ZVal.assign(toStringR(ico, env) + "0");
        }

        return ZVal.assign(toStringR(ico, env) + toStringR(ZVal.subtract(11, mod), env));
    }

    public static final Object CONST_class = "Faker\\Provider\\cs_CZ\\Company";

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
                        "{{lastName}} {{lastName}} {{companySuffix}}",
                        "{{lastName}}-{{lastName}} {{companySuffix}}",
                        "{{lastName}} a {{lastName}} {{companySuffix}}");

        public Object catchPhraseFormats =
                ZVal.arrayFromList(
                        "{{catchPhraseVerb}} {{catchPhraseNoun}} {{catchPhraseAttribute}}",
                        "{{catchPhraseVerb}} {{catchPhraseNoun}} a {{catchPhraseNoun}} {{catchPhraseAttribute}}",
                        "{{catchPhraseVerb}} {{catchPhraseNoun}} {{catchPhraseAttribute}} a {{catchPhraseAttribute}}",
                        "Ne{{catchPhraseVerb}} {{catchPhraseNoun}} {{catchPhraseAttribute}}");

        public Object noun =
                ZVal.arrayFromList(
                        "bezpe\u010Dnost",
                        "pohodl\u00ED",
                        "seo",
                        "rychlost",
                        "testov\u00E1n\u00ED",
                        "\u00FAdr\u017Ebu",
                        "odeb\u00EDr\u00E1n\u00ED",
                        "v\u00FDstavbu",
                        "n\u00E1vrh",
                        "prodej",
                        "n\u00E1kup",
                        "zprost\u0159edkov\u00E1n\u00ED",
                        "odvoz",
                        "p\u0159epravu",
                        "pron\u00E1jem");

        public Object verb =
                ZVal.arrayFromList(
                        "zaji\u0161\u0165ujeme",
                        "nab\u00EDz\u00EDme",
                        "d\u011Bl\u00E1me",
                        "provozujeme",
                        "realizujeme",
                        "p\u0159edstihujeme",
                        "mobilizujeme");

        public Object attribute =
                ZVal.arrayFromList(
                        "pro v\u00E1s",
                        "pro va\u0161\u00ED slu\u017Ebu",
                        "a jsme jedni\u010Dka na trhu",
                        "pro lep\u0161\u00ED sv\u011Bt",
                        "zdarma",
                        "se z\u00E1rukou",
                        "s inovac\u00ED",
                        "turb\u00EDny",
                        "mrakodrap\u016F",
                        "lampi\u00F3nk\u016F a sv\u00ED\u010Dek",
                        "bourac\u00ED techniky",
                        "n\u00E1kupn\u00EDch ko\u0161\u00EDk\u016F",
                        "va\u0161eho webu",
                        "pro va\u0161e z\u00E1kazn\u00EDky",
                        "za n\u00EDzkou cenu",
                        "jako jedin\u00ED na trhu",
                        "webu",
                        "internetu",
                        "va\u0161\u00ED rodiny",
                        "va\u0161ich zn\u00E1m\u00FDch",
                        "va\u0161ich str\u00E1nek",
                        "\u010Dehokoliv na sv\u011Bt\u011B",
                        "za hubi\u010Dku");

        public Object companySuffix =
                ZVal.arrayFromList(
                        "s.r.o.", "s.r.o.", "s.r.o.", "s.r.o.", "a.s.", "o.p.s.", "o.s.");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\cs_CZ\\Company")
                    .setLookup(
                            Company.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "attribute",
                            "catchPhraseFormats",
                            "companySuffix",
                            "formats",
                            "noun",
                            "verb")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/cs_CZ/Company.php")
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
