package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.hy_AM.classes;

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
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/hy_AM/PhoneNumber.php

*/

public class PhoneNumber
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .PhoneNumber {

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
                                                                                                                                .namespaces
                                                                                                                                .hy_AM
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
                                                                                                                .namespaces
                                                                                                                .hy_AM
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
    public Object code(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, PhoneNumber.class)
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
                                                                .hy_AM
                                                                .classes
                                                                .PhoneNumber
                                                                .RequestStaticProperties
                                                                .class,
                                                        "codes")))
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
                                                        .hy_AM
                                                        .classes
                                                        .PhoneNumber
                                                        .RequestStaticProperties
                                                        .class)
                                        .codes)
                        .value());
    }

    @ConvertedMethod
    public Object numberFormat(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, PhoneNumber.class)
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
                                                                .hy_AM
                                                                .classes
                                                                .PhoneNumber
                                                                .RequestStaticProperties
                                                                .class,
                                                        "numberFormats")))
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
                                                        .hy_AM
                                                        .classes
                                                        .PhoneNumber
                                                        .RequestStaticProperties
                                                        .class)
                                        .numberFormats)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\hy_AM\\PhoneNumber";

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
                    .PhoneNumber
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object codes =
                ZVal.arrayFromList(91, 96, 99, 43, 77, 93, 94, 98, 97, 77, 55, 95, 41, 49);

        public Object numberFormats = ZVal.arrayFromList("######", "##-##-##", "###-###");

        public Object formats =
                ZVal.arrayFromList(
                        "0{{code}} {{numberFormat}}",
                        "(0{{code}}) {{numberFormat}}",
                        "+374{{code}} {{numberFormat}}",
                        "+374 {{code}} {{numberFormat}}");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\hy_AM\\PhoneNumber")
                    .setLookup(
                            PhoneNumber.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("codes", "formats", "numberFormats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/hy_AM/PhoneNumber.php")
                    .addExtendsClass("Faker\\Provider\\PhoneNumber")
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
