package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Calculator.classes.Luhn;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes.Base;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/PhoneNumber.php

*/

public class PhoneNumber extends Base {

    public PhoneNumber(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PhoneNumber.class) {
            this.__construct(env, args);
        }
    }

    public PhoneNumber(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object phoneNumber(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, PhoneNumber.class)
                        .method("numerify")
                        .addReferenceArgs(
                                rLastRefArgs =
                                        new RuntimeArgsWithReferences()
                                                .add(
                                                        0,
                                                        handleReturnReference(
                                                                env.callMethod(
                                                                        toObjectR(this)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("generator")
                                                                                .value(),
                                                                        "parse",
                                                                        PhoneNumber.class,
                                                                        StaticMethodUtils
                                                                                .accessUnknownLateStaticMethod(
                                                                                        env,
                                                                                        this,
                                                                                        PhoneNumber
                                                                                                .class)
                                                                                .method(
                                                                                        "randomElement")
                                                                                .addReferenceArgs(
                                                                                        new RuntimeArgsWithReferences()
                                                                                                .add(
                                                                                                        0,
                                                                                                        env
                                                                                                                .getRequestStaticPropertiesReference(
                                                                                                                        com.project
                                                                                                                                .convertedCode
                                                                                                                                .globalNamespace
                                                                                                                                .namespaces
                                                                                                                                .Faker
                                                                                                                                .namespaces
                                                                                                                                .Provider
                                                                                                                                .classes
                                                                                                                                .PhoneNumber
                                                                                                                                .RequestStaticProperties
                                                                                                                                .class,
                                                                                                                        "formats")))
                                                                                .call(
                                                                                        env
                                                                                                .getRequestStaticProperties(
                                                                                                        com.project
                                                                                                                .convertedCode
                                                                                                                .globalNamespace
                                                                                                                .namespaces
                                                                                                                .Faker
                                                                                                                .namespaces
                                                                                                                .Provider
                                                                                                                .classes
                                                                                                                .PhoneNumber
                                                                                                                .RequestStaticProperties
                                                                                                                .class)
                                                                                                .formats)
                                                                                .value()))))
                        .call(rLastRefArgs.get(0))
                        .value());
    }

    @ConvertedMethod
    public Object e164PhoneNumber(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        ReferenceContainer formats = new BasicReferenceContainer(null);
        formats.setObject(ZVal.arrayFromList("+%############"));
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, PhoneNumber.class)
                        .method("numerify")
                        .addReferenceArgs(
                                rLastRefArgs =
                                        new RuntimeArgsWithReferences()
                                                .add(
                                                        0,
                                                        handleReturnReference(
                                                                env.callMethod(
                                                                        toObjectR(this)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("generator")
                                                                                .value(),
                                                                        "parse",
                                                                        PhoneNumber.class,
                                                                        StaticMethodUtils
                                                                                .accessUnknownLateStaticMethod(
                                                                                        env,
                                                                                        this,
                                                                                        PhoneNumber
                                                                                                .class)
                                                                                .method(
                                                                                        "randomElement")
                                                                                .addReferenceArgs(
                                                                                        new RuntimeArgsWithReferences()
                                                                                                .add(
                                                                                                        0,
                                                                                                        formats))
                                                                                .call(
                                                                                        formats
                                                                                                .getObject())
                                                                                .value()))))
                        .call(rLastRefArgs.get(0))
                        .value());
    }

    @ConvertedMethod
    public Object imei(RuntimeEnv env, Object... args) {
        Object imei = null;
        imei =
                ZVal.assign(
                        toStringR(
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, PhoneNumber.class)
                                        .method("numerify")
                                        .addReferenceArgs(new RuntimeArgsWithReferences())
                                        .call("##############")
                                        .value(),
                                env));
        imei =
                toStringR(imei, env)
                        + toStringR(Luhn.runtimeStaticObject.computeCheckDigit(env, imei), env);
        return ZVal.assign(imei);
    }

    public static final Object CONST_class = "Faker\\Provider\\PhoneNumber";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Base.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object formats = ZVal.arrayFromList("###-###-###");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\PhoneNumber")
                    .setLookup(
                            PhoneNumber.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("formats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/PhoneNumber.php")
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
