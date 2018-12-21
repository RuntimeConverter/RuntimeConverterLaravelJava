package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.en_PH.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/en_PH/PhoneNumber.php

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

    public static final Object CONST_class = "Faker\\Provider\\en_PH\\PhoneNumber";

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
        public Object mobileNumber(RuntimeEnv env, Object... args) {
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
                                                                            .en_PH
                                                                            .classes
                                                                            .PhoneNumber
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .mobileFormats)
                                            .value())
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object mobileFormats =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "+63 (813) ###-####",
                                    "+63 (817) ###-####",
                                    "+63 (900) ###-####",
                                    "+63 (905) ###-####",
                                    "+63 (906) ###-####",
                                    "+63 (907) ###-####",
                                    "+63 (908) ###-####",
                                    "+63 (909) ###-####",
                                    "+63 (910) ###-####",
                                    "+63 (911) ###-####",
                                    "+63 (912) ###-####",
                                    "+63 (915) ###-####",
                                    "+63 (916) ###-####",
                                    "+63 (917) ###-####",
                                    "+63 (918) ###-####",
                                    "+63 (919) ###-####",
                                    "+63 (920) ###-####",
                                    "+63 (921) ###-####",
                                    "+63 (922) ###-####",
                                    "+63 (923) ###-####",
                                    "+63 (925) ###-####",
                                    "+63 (926) ###-####",
                                    "+63 (927) ###-####",
                                    "+63 (928) ###-####",
                                    "+63 (929) ###-####",
                                    "+63 (930) ###-####",
                                    "+63 (931) ###-####",
                                    "+63 (932) ###-####",
                                    "+63 (933) ###-####",
                                    "+63 (934) ###-####",
                                    "+63 (935) ###-####",
                                    "+63 (936) ###-####",
                                    "+63 (937) ###-####",
                                    "+63 (938) ###-####",
                                    "+63 (939) ###-####",
                                    "+63 (940) ###-####",
                                    "+63 (942) ###-####",
                                    "+63 (943) ###-####",
                                    "+63 (944) ###-####",
                                    "+63 (946) ###-####",
                                    "+63 (947) ###-####",
                                    "+63 (948) ###-####",
                                    "+63 (949) ###-####",
                                    "+63 (971) ###-####",
                                    "+63 (973) ###-####",
                                    "+63 (974) ###-####",
                                    "+63 (975) ###-####",
                                    "+63 (977) ###-####",
                                    "+63 (978) ###-####",
                                    "+63 (979) ###-####",
                                    "+63 (980) ###-####",
                                    "+63 (989) ###-####",
                                    "+63 (994) ###-####",
                                    "+63 (996) ###-####",
                                    "+63 (997) ###-####",
                                    "+63 (998) ###-####",
                                    "+63 (999) ###-####",
                                    "(0813) ###-####",
                                    "(0817) ###-####",
                                    "(0900) ###-####",
                                    "(0905) ###-####",
                                    "(0906) ###-####",
                                    "(0907) ###-####",
                                    "(0908) ###-####",
                                    "(0909) ###-####",
                                    "(0910) ###-####",
                                    "(0911) ###-####",
                                    "(0912) ###-####",
                                    "(0915) ###-####",
                                    "(0916) ###-####",
                                    "(0917) ###-####",
                                    "(0918) ###-####",
                                    "(0919) ###-####",
                                    "(0920) ###-####",
                                    "(0921) ###-####",
                                    "(0922) ###-####",
                                    "(0923) ###-####",
                                    "(0925) ###-####",
                                    "(0926) ###-####",
                                    "(0927) ###-####",
                                    "(0928) ###-####",
                                    "(0929) ###-####",
                                    "(0930) ###-####",
                                    "(0931) ###-####",
                                    "(0932) ###-####",
                                    "(0933) ###-####",
                                    "(0934) ###-####",
                                    "(0935) ###-####",
                                    "(0936) ###-####",
                                    "(0937) ###-####",
                                    "(0938) ###-####",
                                    "(0939) ###-####",
                                    "(0940) ###-####",
                                    "(0942) ###-####",
                                    "(0943) ###-####",
                                    "(0944) ###-####",
                                    "(0946) ###-####",
                                    "(0947) ###-####",
                                    "(0948) ###-####",
                                    "(0949) ###-####",
                                    "(0971) ###-####",
                                    "(0973) ###-####",
                                    "(0974) ###-####",
                                    "(0975) ###-####",
                                    "(0977) ###-####",
                                    "(0978) ###-####",
                                    "(0979) ###-####",
                                    "(0980) ###-####",
                                    "(0989) ###-####",
                                    "(0994) ###-####",
                                    "(0996) ###-####",
                                    "(0997) ###-####",
                                    "(0998) ###-####",
                                    "(0999) ###-####");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\en_PH\\PhoneNumber")
                    .setLookup(
                            PhoneNumber.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("mobileFormats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/en_PH/PhoneNumber.php")
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
