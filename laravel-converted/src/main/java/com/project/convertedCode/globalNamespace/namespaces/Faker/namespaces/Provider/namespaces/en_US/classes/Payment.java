package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.en_US.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/en_US/Payment.php

*/

public class Payment
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .Payment {

    public Payment(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Payment.class) {
            this.__construct(env, args);
        }
    }

    public Payment(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object bankAccountNumber(RuntimeEnv env, Object... args) {
        Object length = null;
        length =
                ZVal.add(
                        ZVal.add(
                                ZVal.add(
                                        ZVal.add(
                                                runtimeStaticObject.numberBetween(env, 0, 3),
                                                runtimeStaticObject.numberBetween(env, 0, 3)),
                                        runtimeStaticObject.numberBetween(env, 0, 3)),
                                runtimeStaticObject.numberBetween(env, 0, 3)),
                        5);
        return ZVal.assign(
                runtimeStaticObject.numerify(
                        env, function_str_repeat.f.env(env).call("#", length).value()));
    }

    @ConvertedMethod
    public Object bankRoutingNumber(RuntimeEnv env, Object... args) {
        Object clearingCenter = null;
        Object result = null;
        Object institution = null;
        Object district = null;
        Object state = null;
        Object type = null;
        district = runtimeStaticObject.numberBetween(env, 1, 12);
        type = runtimeStaticObject.randomElement(env, ZVal.arrayFromList(0, 0, 0, 0, 20, 20, 60));
        clearingCenter = runtimeStaticObject.randomDigitNotNull(env);
        state = runtimeStaticObject.randomDigit(env);
        institution = runtimeStaticObject.randomNumber(env, 4, true);
        result =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%02d%01d%01d%04d",
                                ZVal.add(district, type), clearingCenter, state, institution)
                        .value();
        return ZVal.assign(
                toStringR(result, env)
                        + toStringR(
                                runtimeStaticObject.calculateRoutingNumberChecksum(env, result),
                                env));
    }

    public static final Object CONST_class = "Faker\\Provider\\en_US\\Payment";

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
                    .Payment
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "routing")
        public Object calculateRoutingNumberChecksum(RuntimeEnv env, Object... args) {
            ReferenceContainer routing =
                    new BasicReferenceContainer(assignParameter(args, 0, false));
            return ZVal.assign(
                    ZVal.modulus(
                            ZVal.add(
                                    ZVal.add(
                                            ZVal.multiply(
                                                    7,
                                                    ZVal.add(
                                                            ZVal.add(
                                                                    routing.arrayGet(env, 0),
                                                                    routing.arrayGet(env, 3)),
                                                            routing.arrayGet(env, 6))),
                                            ZVal.multiply(
                                                    3,
                                                    ZVal.add(
                                                            ZVal.add(
                                                                    routing.arrayGet(env, 1),
                                                                    routing.arrayGet(env, 4)),
                                                            routing.arrayGet(env, 7)))),
                                    ZVal.multiply(
                                            9,
                                            ZVal.add(
                                                    routing.arrayGet(env, 2),
                                                    routing.arrayGet(env, 5)))),
                            10));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\en_US\\Payment")
                    .setLookup(
                            Payment.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/en_US/Payment.php")
                    .addExtendsClass("Faker\\Provider\\Payment")
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
