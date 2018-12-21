package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Calculator.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Calculator/Inn.php

*/

public class Inn extends RuntimeClassBase {

    public Inn(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Inn(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Faker\\Calculator\\Inn";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "inn")
        public Object checksum(RuntimeEnv env, Object... args) {
            Object inn = assignParameter(args, 0, false);
            ReferenceContainer i = new BasicReferenceContainer(null);
            ReferenceContainer multipliers = new BasicReferenceContainer(null);
            Object sum = null;
            multipliers.setObject(
                    ZVal.newArray(
                            new ZPair(1, 2),
                            new ZPair(2, 4),
                            new ZPair(3, 10),
                            new ZPair(4, 3),
                            new ZPair(5, 5),
                            new ZPair(6, 9),
                            new ZPair(7, 4),
                            new ZPair(8, 6),
                            new ZPair(9, 8)));
            sum = 0;
            for (i.setObject(1);
                    ZVal.isLessThanOrEqualTo(i.getObject(), "<=", 9);
                    i.setObject(ZVal.increment(i.getObject()))) {
                sum =
                        ZAssignment.add(
                                "+=",
                                sum,
                                ZVal.multiply(
                                        NamespaceGlobal.intval
                                                .env(env)
                                                .call(
                                                        function_substr
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        inn,
                                                                        ZVal.subtract(
                                                                                i.getObject(), 1),
                                                                        1)
                                                                .value())
                                                .value(),
                                        multipliers.arrayGet(env, i.getObject())));
            }

            return ZVal.assign(
                    NamespaceGlobal.strval
                            .env(env)
                            .call(ZVal.modulus(ZVal.modulus(sum, 11), 10))
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "inn")
        public Object isValid(RuntimeEnv env, Object... args) {
            Object inn = assignParameter(args, 0, false);
            return ZVal.assign(
                    ZVal.strictEqualityCheck(
                            runtimeStaticObject.checksum(
                                    env, function_substr.f.env(env).call(inn, 0, -1).value()),
                            "===",
                            function_substr.f.env(env).call(inn, -1, 1).value()));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Calculator\\Inn")
                    .setLookup(
                            Inn.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Calculator/Inn.php")
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
