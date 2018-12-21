package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.zh_CN.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/zh_CN/Payment.php

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

    public static final Object CONST_class = "Faker\\Provider\\zh_CN\\Payment";

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
                                                            .zh_CN
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
                ZVal.arrayFromList(
                        "\u6E24\u6D77\u94F6\u884C",
                        "\u5E7F\u53D1\u94F6\u884C",
                        "\u56FD\u5BB6\u5F00\u53D1\u94F6\u884C",
                        "\u6052\u4E30\u94F6\u884C",
                        "\u534E\u590F\u94F6\u884C",
                        "\u4EA4\u901A\u94F6\u884C",
                        "\u5E73\u5B89\u94F6\u884C",
                        "\u4E0A\u6D77\u6D66\u4E1C\u53D1\u5C55\u94F6\u884C",
                        "\u5174\u4E1A\u94F6\u884C",
                        "\u62DB\u5546\u94F6\u884C",
                        "\u6D59\u5546\u94F6\u884C",
                        "\u4E2D\u56FD\u5DE5\u5546\u94F6\u884C",
                        "\u4E2D\u56FD\u5149\u5927\u94F6\u884C",
                        "\u4E2D\u56FD\u5EFA\u8BBE\u94F6\u884C",
                        "\u4E2D\u56FD\u6C11\u751F\u94F6\u884C",
                        "\u4E2D\u56FD\u519C\u4E1A\u94F6\u884C",
                        "\u4E2D\u56FD\u94F6\u884C",
                        "\u4E2D\u56FD\u90AE\u653F\u50A8\u84C4\u94F6\u884C",
                        "\u4E2D\u4FE1\u94F6\u884C");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\zh_CN\\Payment")
                    .setLookup(
                            Payment.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("banks")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/zh_CN/Payment.php")
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
