package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.hy_AM.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/hy_AM/Company.php

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
        for (ZPair zpairResult126 :
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
                                                .hy_AM
                                                .classes
                                                .Company
                                                .RequestStaticProperties
                                                .class)
                                .catchPhraseWords,
                        env,
                        true)) {
            word = zpairResult126;
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
        for (ZPair zpairResult127 :
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
                                                .hy_AM
                                                .classes
                                                .Company
                                                .RequestStaticProperties
                                                .class)
                                .bsWords,
                        env,
                        true)) {
            word = zpairResult127;
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

    public static final Object CONST_class = "Faker\\Provider\\hy_AM\\Company";

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
                        "{{lastName}} {{companySuffix}}",
                        "{{lastName}} {{companySuffix}}",
                        "{{lastName}} {{companySuffix}}",
                        "{{lastName}} {{companySuffix}}",
                        "{{lastName}} {{companySuffix}}",
                        "{{lastName}} {{companySuffix}}",
                        "{{lastName}} {{companySuffix}}",
                        "{{lastName}} \u0565\u0572\u0562\u0561\u0575\u0580\u0576\u0565\u0580");

        public Object catchPhraseWords = ZVal.newArray();

        public Object bsWords = ZVal.newArray();

        public Object companySuffix =
                ZVal.arrayFromList(
                        "\u054D\u054A\u0538",
                        "\u0587 \u0578\u0580\u0564\u056B\u0576\u0565\u0580",
                        "\u0553\u0532\u0538",
                        "\u0532\u0532\u0538");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\hy_AM\\Company")
                    .setLookup(
                            Company.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "bsWords", "catchPhraseWords", "companySuffix", "formats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/hy_AM/Company.php")
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
