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
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/pl_PL/Company.php

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

    public static final Object CONST_class = "Faker\\Provider\\pl_PL\\Company";

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
        public Object companyPrefix(RuntimeEnv env, Object... args) {
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
                                                            .pl_PL
                                                            .classes
                                                            .Company
                                                            .RequestStaticProperties
                                                            .class)
                                            .companyPrefix)
                            .value());
        }

        @ConvertedMethod
        public Object regon(RuntimeEnv env, Object... args) {
            ReferenceContainer result = new BasicReferenceContainer(null);
            Object size = null;
            Object checksum = null;
            ReferenceContainer i = new BasicReferenceContainer(null);
            ReferenceContainer weights = new BasicReferenceContainer(null);
            Object regionNumber = null;
            weights.setObject(ZVal.arrayFromList(8, 9, 2, 3, 4, 5, 6, 7));
            regionNumber =
                    ZVal.add(
                            ZVal.multiply(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Company.class)
                                            .method("numberBetween")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(0, 49)
                                            .value(),
                                    2),
                            1);
            result.setObject(
                    ZVal.newArray(
                            new ZPair(0, ZVal.toLong(ZVal.divide(regionNumber, 10))),
                            new ZPair(1, ZVal.modulus(regionNumber, 10))));
            for (i.setObject(2), size = function_count.f.env(env).call(weights.getObject()).value();
                    ZVal.isLessThan(i.getObject(), '<', size);
                    i.setObject(ZVal.increment(i.getObject()))) {
                result.arrayAccess(env, i.getObject())
                        .set(
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, Company.class)
                                        .method("randomDigit")
                                        .call()
                                        .value());
            }

            checksum = 0;
            for (i.setObject(0), size = function_count.f.env(env).call(result.getObject()).value();
                    ZVal.isLessThan(i.getObject(), '<', size);
                    i.setObject(ZVal.increment(i.getObject()))) {
                checksum =
                        ZAssignment.add(
                                "+=",
                                checksum,
                                ZVal.multiply(
                                        weights.arrayGet(env, i.getObject()),
                                        result.arrayGet(env, i.getObject())));
            }

            checksum = ZAssignment.modulus("%=", checksum, 11);
            if (ZVal.equalityCheck(checksum, 10)) {
                checksum = 0;
            }

            result.arrayAppend(env).set(checksum);
            return ZVal.assign(
                    NamespaceGlobal.implode.env(env).call("", result.getObject()).value());
        }

        @ConvertedMethod
        public Object regonLocal(RuntimeEnv env, Object... args) {
            ReferenceContainer result = new BasicReferenceContainer(null);
            Object size = null;
            Object checksum = null;
            ReferenceContainer i = new BasicReferenceContainer(null);
            ReferenceContainer weights = new BasicReferenceContainer(null);
            weights.setObject(ZVal.arrayFromList(2, 4, 8, 5, 0, 9, 7, 3, 6, 1, 2, 4, 8));
            result.setObject(
                    NamespaceGlobal.str_split
                            .env(env)
                            .call(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Company.class)
                                            .method("regon")
                                            .call()
                                            .value())
                            .value());
            for (i.setObject(function_count.f.env(env).call(result.getObject()).value()),
                            size = function_count.f.env(env).call(weights.getObject()).value();
                    ZVal.isLessThan(i.getObject(), '<', size);
                    i.setObject(ZVal.increment(i.getObject()))) {
                result.arrayAccess(env, i.getObject())
                        .set(
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, Company.class)
                                        .method("randomDigit")
                                        .call()
                                        .value());
            }

            checksum = 0;
            for (i.setObject(0), size = function_count.f.env(env).call(result.getObject()).value();
                    ZVal.isLessThan(i.getObject(), '<', size);
                    i.setObject(ZVal.increment(i.getObject()))) {
                checksum =
                        ZAssignment.add(
                                "+=",
                                checksum,
                                ZVal.multiply(
                                        weights.arrayGet(env, i.getObject()),
                                        result.arrayGet(env, i.getObject())));
            }

            checksum = ZAssignment.modulus("%=", checksum, 11);
            if (ZVal.equalityCheck(checksum, 10)) {
                checksum = 0;
            }

            result.arrayAppend(env).set(checksum);
            return ZVal.assign(
                    NamespaceGlobal.implode.env(env).call("", result.getObject()).value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object formats =
                ZVal.arrayFromList(
                        "{{lastName}}",
                        "{{lastName}}",
                        "{{lastName}} {{companySuffix}}",
                        "{{lastName}} {{companySuffix}}",
                        "{{lastName}} {{companySuffix}}",
                        "{{lastName}} {{companySuffix}}",
                        "{{companyPrefix}} {{lastName}}",
                        "{{lastName}}-{{lastName}}");

        public Object companySuffix =
                ZVal.arrayFromList(
                        "S.A.",
                        "i syn",
                        "sp. z o.o.",
                        "sp. j.",
                        "sp. p.",
                        "sp. k.",
                        "S.K.A",
                        "s. c.",
                        "P.P.O.F");

        public Object companyPrefix =
                ZVal.arrayFromList("Grupa", "Fundacja", "Stowarzyszenie", "Sp\u00F3\u0142dzielnia");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\pl_PL\\Company")
                    .setLookup(
                            Company.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("companyPrefix", "companySuffix", "formats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/pl_PL/Company.php")
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
