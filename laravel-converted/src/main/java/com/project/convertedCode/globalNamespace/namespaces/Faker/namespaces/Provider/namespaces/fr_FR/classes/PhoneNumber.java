package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.fr_FR.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/fr_FR/PhoneNumber.php

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
    public Object phoneNumber07(RuntimeEnv env, Object... args) {
        Object phoneNumber = null;
        phoneNumber = this.phoneNumber07WithSeparator(env);
        phoneNumber = function_str_replace.f.env(env).call(" ", "", phoneNumber).value();
        return ZVal.assign(phoneNumber);
    }

    @ConvertedMethod
    public Object phoneNumber07WithSeparator(RuntimeEnv env, Object... args) {
        Object phoneNumber = null;
        phoneNumber =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "numberBetween",
                        PhoneNumber.class,
                        3,
                        9);
        phoneNumber =
                toStringR(phoneNumber, env)
                        + toStringR(
                                env.callMethod(this, "numerify", PhoneNumber.class, "# ## ## ##"),
                                env);
        return ZVal.assign(phoneNumber);
    }

    public static final Object CONST_class = "Faker\\Provider\\fr_FR\\PhoneNumber";

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
                                                                            .fr_FR
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

        public Object formats =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "+33 (0)1 ## ## ## ##",
                                    "+33 (0)1 ## ## ## ##",
                                    "+33 (0)2 ## ## ## ##",
                                    "+33 (0)3 ## ## ## ##",
                                    "+33 (0)4 ## ## ## ##",
                                    "+33 (0)5 ## ## ## ##",
                                    "+33 (0)6 ## ## ## ##",
                                    "+33 (0)7 {{phoneNumber07WithSeparator}}",
                                    "+33 (0)8 ## ## ## ##",
                                    "+33 (0)9 ## ## ## ##",
                                    "+33 1 ## ## ## ##",
                                    "+33 1 ## ## ## ##",
                                    "+33 2 ## ## ## ##",
                                    "+33 3 ## ## ## ##",
                                    "+33 4 ## ## ## ##",
                                    "+33 5 ## ## ## ##",
                                    "+33 6 ## ## ## ##",
                                    "+33 7 {{phoneNumber07WithSeparator}}",
                                    "+33 8 ## ## ## ##",
                                    "+33 9 ## ## ## ##",
                                    "01########",
                                    "01########",
                                    "02########",
                                    "03########",
                                    "04########",
                                    "05########",
                                    "06########",
                                    "07{{phoneNumber07}}",
                                    "08########",
                                    "09########",
                                    "01 ## ## ## ##",
                                    "01 ## ## ## ##",
                                    "02 ## ## ## ##",
                                    "03 ## ## ## ##",
                                    "04 ## ## ## ##",
                                    "05 ## ## ## ##",
                                    "06 ## ## ## ##",
                                    "07 {{phoneNumber07WithSeparator}}",
                                    "08 ## ## ## ##",
                                    "09 ## ## ## ##");
                        });

        public Object mobileFormats =
                ZVal.arrayFromList(
                        "+33 6 ## ## ## ##",
                        "+33 7 {{phoneNumber07WithSeparator}}",
                        "06########",
                        "07########",
                        "06 ## ## ## ##",
                        "07 ## ## ## ##");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\fr_FR\\PhoneNumber")
                    .setLookup(
                            PhoneNumber.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("formats", "mobileFormats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/fr_FR/PhoneNumber.php")
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
