package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.el_GR.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/el_GR/PhoneNumber.php

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

    public static final Object CONST_class = "Faker\\Provider\\el_GR\\PhoneNumber";

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

        @ConvertedMethod
        public Object mobilePhoneNumber(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, PhoneNumber.class)
                            .method("numerify")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, PhoneNumber.class)
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
                                                                            .el_GR
                                                                            .classes
                                                                            .PhoneNumber
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .mobileFormats)
                                            .value())
                            .value());
        }

        @ConvertedMethod
        public Object tollFreeNumber(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, PhoneNumber.class)
                            .method("numerify")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, PhoneNumber.class)
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
                                                                            .el_GR
                                                                            .classes
                                                                            .PhoneNumber
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .tollFreeFormats)
                                            .value())
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object formats =
                ZVal.arrayFromList(
                        "+30 2# ########",
                        "+30 2## #######",
                        "+30 2### ######",
                        "+302#########",
                        "+3069########",
                        "+30 69 ########",
                        "+30 69########",
                        "+30 69# #######",
                        "+30 69# ### ####",
                        "+30 69# #### ###",
                        "+30 69## ######",
                        "+30 69## ## ## ##",
                        "+30 69## ### ###",
                        "2#########",
                        "2## #######",
                        "2### ######",
                        "69########",
                        "69# #######",
                        "69# ### ####",
                        "69# #### ###",
                        "69## ######",
                        "69## ## ## ##",
                        "69## ### ###");

        public Object mobileFormats =
                ZVal.arrayFromList(
                        "+3069########",
                        "+30 69########",
                        "+30 69# #######",
                        "+30 69# ### ####",
                        "+30 69# #### ###",
                        "+30 69## ######",
                        "+30 69## ## ## ##",
                        "+30 69## ### ###",
                        "69########",
                        "69# #######",
                        "69# ### ####",
                        "69# #### ###",
                        "69## ######",
                        "69## ## ## ##",
                        "69## ### ###");

        public Object tollFreeFormats =
                ZVal.arrayFromList(
                        "+30 800#######",
                        "+30 800 #######",
                        "+30 800 ## #####",
                        "+30 800 ### ####",
                        "800#######",
                        "800 #######",
                        "800 ## #####",
                        "800 ### ####");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\el_GR\\PhoneNumber")
                    .setLookup(
                            PhoneNumber.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("formats", "mobileFormats", "tollFreeFormats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/el_GR/PhoneNumber.php")
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
