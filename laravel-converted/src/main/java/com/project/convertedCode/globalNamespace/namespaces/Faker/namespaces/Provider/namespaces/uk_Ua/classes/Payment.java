package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.uk_Ua.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/uk_UA/Payment.php

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

    public static final Object CONST_class = "Faker\\Provider\\uk_Ua\\Payment";

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
        public Object bank(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Payment.class)
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
                                                            .uk_Ua
                                                            .classes
                                                            .Payment
                                                            .RequestStaticProperties
                                                            .class)
                                            .banks)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object banks =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u0410-\u0411\u0430\u043D\u043A",
                                    "\u0410\u0432\u0430\u043D\u0433\u0430\u0440\u0434",
                                    "\u0410\u0439\u0431\u043E\u043A\u0441 \u0411\u0430\u043D\u043A",
                                    "\u0410\u043A\u043E\u0440\u0434\u0431\u0430\u043D\u043A",
                                    "\u0410\u043B\u044C\u043F\u0430\u0440\u0456 \u0411\u0430\u043D\u043A",
                                    "\u0410\u043B\u044C\u0442\u0431\u0430\u043D\u043A",
                                    "\u0410\u043B\u044C\u0444\u0430-\u0411\u0430\u043D\u043A",
                                    "\u0410\u043B\u044C\u044F\u043D\u0441",
                                    "\u0410\u043F\u0435\u043A\u0441-\u0431\u0430\u043D\u043A",
                                    "\u0410\u0440\u043A\u0430\u0434\u0430",
                                    "\u0410\u0441\u0432\u0456\u043E \u0411\u0430\u043D\u043A",
                                    "\u0411\u0430\u043D\u043A 3/4",
                                    "\u0411\u041C \u0411\u0430\u043D\u043A",
                                    "\u0411\u043E\u0433\u0443\u0441\u043B\u0430\u0432",
                                    "\u0411\u0422\u0410 \u0411\u0430\u043D\u043A",
                                    "\u0412\u0435\u0440\u043D\u0443\u043C \u0411\u0430\u043D\u043A",
                                    "\u0412\u043E\u0441\u0442\u043E\u043A",
                                    "\u0412\u0422\u0411",
                                    "VS Bank",
                                    "\u0413\u0435\u0444\u0435\u0441\u0442",
                                    "\u0413\u043B\u043E\u0431\u0443\u0441",
                                    "\u0413\u0440\u0430\u043D\u0442",
                                    "DV Bank",
                                    "Deutsche Bank",
                                    "\u0415\u043A\u0441\u043F\u0440\u0435\u0441-\u0411\u0430\u043D\u043A",
                                    "\u0404\u0432\u0440\u043E\u043F\u0440\u043E\u043C\u0431\u0430\u043D\u043A",
                                    "\u0417\u0435\u043C\u0435\u043B\u044C\u043D\u0438\u0439 \u043A\u0430\u043F\u0456\u0442\u0430\u043B",
                                    "\u0406\u0434\u0435\u044F \u0411\u0430\u043D\u043A",
                                    "\u0406\u043D\u0432\u0435\u0441\u0442\u0438\u0446\u0456\u0439",
                                    "ING",
                                    "\u0406\u043D\u0434\u0443\u0441\u0442\u0440\u0456\u0430\u043B\u0431\u0430\u043D\u043A",
                                    "\u041A\u043E\u043C\u0435\u0440\u0446\u0456\u0439\u043D\u0438\u0439 \u0406\u043D\u0434\u0443\u0441\u0442\u0440\u0456\u0430\u043B\u044C\u043D\u0438\u0439 \u0411\u0430\u043D\u043A",
                                    "\u041A\u043B\u0456\u0440\u0438\u043D\u0433\u043E\u0432\u0438\u0439",
                                    "\u041A\u043E\u043C\u0456\u043D\u0432\u0435\u0441\u0442\u0431\u0430\u043D\u043A",
                                    "\u041A\u043E\u043D\u043A\u043E\u0440\u0434",
                                    "\u041A\u0440\u0435\u0434\u0438\u0442 \u0414\u043D\u0456\u043F\u0440\u043E",
                                    "\u041A\u0440\u0435\u0434\u0438\u0442 \u0404\u0432\u0440\u043E\u043F\u0430 \u0411\u0430\u043D\u043A",
                                    "\u041A\u0440\u0435\u0434\u0438\u0442 \u041E\u043F\u0442\u0438\u043C\u0430 \u0411\u0430\u043D\u043A",
                                    "\u041A\u0440\u0435\u0434\u0438\u0442\u0432\u0435\u0441\u0442",
                                    "Cr\u00E9dit Agricole",
                                    "\u041A\u0440\u0435\u0434\u043E\u0431\u0430\u043D\u043A",
                                    "\u041A\u0440\u0438\u0441\u0442\u0430\u043B\u0431\u0430\u043D\u043A",
                                    "\u041B\u044C\u0432\u0456\u0432",
                                    "\u041C\u0430\u0440\u0444\u0456\u043D \u0431\u0430\u043D\u043A",
                                    "\u041C\u0435\u0433\u0430\u0431\u0430\u043D\u043A",
                                    "\u041C\u0435\u0442\u0430\u0411\u0430\u043D\u043A",
                                    "\u041C\u0456\u0436\u043D\u0430\u0440\u043E\u0434\u043D\u0438\u0439 \u0456\u043D\u0432\u0435\u0441\u0442\u0438\u0446\u0456\u0439\u043D\u0438\u0439 \u0431\u0430\u043D\u043A",
                                    "\u041C\u0456\u0441\u0442\u043E \u0411\u0430\u043D\u043A",
                                    "\u041C\u043E\u0442\u043E\u0440 \u0411\u0430\u043D\u043A",
                                    "\u041E\u043A\u0441\u0456 \u0411\u0430\u043D\u043A",
                                    "OTP Bank",
                                    "\u041E\u0449\u0430\u0434\u0431\u0430\u043D\u043A",
                                    "\u041F\u0435\u0440\u0448\u0438\u0439 \u0406\u043D\u0432\u0435\u0441\u0442\u0438\u0446\u0456\u0439\u043D\u0438\u0439 \u0411\u0430\u043D\u043A",
                                    "\u041F\u0456\u0432\u0434\u0435\u043D\u043D\u0438\u0439",
                                    "Piraeus Bank",
                                    "\u041F\u043E\u043B\u0456\u043A\u043E\u043C\u0431\u0430\u043D\u043A",
                                    "\u041F\u043E\u043B\u0442\u0430\u0432\u0430-\u0431\u0430\u043D\u043A",
                                    "\u041F\u043E\u0440\u0442\u0430\u043B",
                                    "\u041F\u0440\u0430\u0432\u0435\u043A\u0441-\u0411\u0430\u043D\u043A",
                                    "\u041F\u0440\u0435\u043C\u0456\u0443\u043C",
                                    "\u041F\u0440\u0438\u0432\u0430\u0442\u0411\u0430\u043D\u043A",
                                    "\u041F\u0440\u043E\u041A\u0440\u0435\u0434\u0438\u0442 \u0411\u0430\u043D\u043A",
                                    "\u041F\u0440\u043E\u043C\u0456\u043D\u0432\u0435\u0441\u0442\u0431\u0430\u043D\u043A",
                                    "\u041F\u0423\u041C\u0411",
                                    "\u041F\u0440\u043E\u043C\u0438\u0441\u043B\u043E\u0432\u043E-\u0444\u0456\u043D\u0430\u043D\u0441\u043E\u0432\u0438\u0439 \u0431\u0430\u043D\u043A",
                                    "\u0420\u0430\u0434\u0430\u0431\u0430\u043D\u043A",
                                    "\u0420\u0430\u0439\u0444\u0444\u0430\u0439\u0437\u0435\u043D \u0410\u0432\u0430\u043B\u044C",
                                    "\u0420\u0412\u0421 \u0431\u0430\u043D\u043A",
                                    "\u0420\u0435\u0433\u0456\u043E\u043D-\u0431\u0430\u043D\u043A",
                                    "\u0420\u043E\u0437\u0440\u0430\u0445\u0443\u043D\u043A\u043E\u0432\u0438\u0439 \u0446\u0435\u043D\u0442\u0440",
                                    "\u0421\u0431\u0435\u0440\u0431\u0430\u043D\u043A",
                                    "SEB",
                                    "\u0421\u0456\u0442\u0456\u0431\u0430\u043D\u043A",
                                    "\u0421\u0456\u0447",
                                    "\u0422\u0430\u0441\u043A\u043E\u043C\u0431\u0430\u043D\u043A",
                                    "\u0422\u0440\u0430\u0441\u0442-\u041A\u0430\u043F\u0456\u0442\u0430\u043B",
                                    "\u0423\u043A\u0440\u0430\u0457\u043D\u0441\u044C\u043A\u0438\u0439 \u041A\u0430\u043F\u0456\u0442\u0430\u043B",
                                    "\u0423\u043A\u0440\u0430\u0457\u043D\u0441\u044C\u043A\u0438\u0439 \u0431\u0430\u043D\u043A \u0440\u0435\u043A\u043E\u043D\u0441\u0442\u0440\u0443\u043A\u0446\u0456\u0457 \u0442\u0430 \u0440\u043E\u0437\u0432\u0438\u0442\u043A\u0443",
                                    "\u0423\u043A\u0440\u0431\u0443\u0434\u0456\u043D\u0432\u0435\u0441\u0442\u0431\u0430\u043D\u043A",
                                    "\u0423\u043A\u0440\u0433\u0430\u0437\u0431\u0430\u043D\u043A",
                                    "\u0423\u043A\u0440\u0435\u043A\u0441\u0456\u043C\u0431\u0430\u043D\u043A",
                                    "\u0423\u043A\u0440\u0421\u0438\u0431\u0431\u0430\u043D\u043A",
                                    "\u0423\u043A\u0440\u0441\u043E\u0446\u0431\u0430\u043D\u043A",
                                    "\u0423\u043D\u0456\u0432\u0435\u0440\u0441\u0430\u043B \u0411\u0430\u043D\u043A",
                                    "\u0424\u0430\u043C\u0456\u043B\u044C\u043D\u0438\u0439",
                                    "\u0424\u0456\u043D\u0430\u043D\u0441\u043E\u0432\u0438\u0439 \u043F\u0430\u0440\u0442\u043D\u0435\u0440",
                                    "Forward Bank",
                                    "\u0426\u0435\u043D\u0442\u0440",
                                    "Unex");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\uk_Ua\\Payment")
                    .setLookup(
                            Payment.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("banks")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/uk_UA/Payment.php")
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
