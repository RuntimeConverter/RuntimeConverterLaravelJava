package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Calculator.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Calculator/Iban.php

*/

public class Iban extends RuntimeClassBase {

    public Iban(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Iban(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Faker\\Calculator\\Iban";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "iban")
        public Object checksum(RuntimeEnv env, Object... args) {
            Object iban = assignParameter(args, 0, false);
            Object checksum = null;
            Object checkString = null;
            checkString =
                    toStringR(function_substr.f.env(env).call(iban, 4).value(), env)
                            + toStringR(function_substr.f.env(env).call(iban, 0, 2).value(), env)
                            + "00";
            checkString =
                    NamespaceGlobal.preg_replace_callback
                            .env(env)
                            .call(
                                    "/[A-Z]/",
                                    ZVal.arrayFromList("self", "alphaToNumberCallback"),
                                    checkString)
                            .value();
            checksum = ZVal.subtract(98, runtimeStaticObject.mod97(env, checkString));
            return ZVal.assign(NamespaceGlobal.str_pad.env(env).call(checksum, 2, "0", 0).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "match")
        private Object alphaToNumberCallback(RuntimeEnv env, Object... args) {
            ReferenceContainer match = new BasicReferenceContainer(assignParameter(args, 0, false));
            return ZVal.assign(runtimeStaticObject.alphaToNumber(env, match.arrayGet(env, 0)));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "char")
        public Object alphaToNumber(RuntimeEnv env, Object... args) {
            Object _pChar = assignParameter(args, 0, false);
            return ZVal.assign(
                    ZVal.subtract(NamespaceGlobal.ord.env(env).call(_pChar).value(), 55));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "number")
        public Object mod97(RuntimeEnv env, Object... args) {
            ReferenceContainer number =
                    new BasicReferenceContainer(assignParameter(args, 0, false));
            Object size = null;
            Object checksum = null;
            ReferenceContainer i = new BasicReferenceContainer(null);
            checksum = ZVal.assign(ZVal.toLong(number.arrayGet(env, 0)));
            for (i.setObject(1), size = function_strlen.f.env(env).call(number.getObject()).value();
                    ZVal.isLessThan(i.getObject(), '<', size);
                    i.setObject(ZVal.increment(i.getObject()))) {
                checksum =
                        ZVal.modulus(
                                ZVal.add(
                                        ZVal.multiply(10, checksum),
                                        ZVal.toLong(number.arrayGet(env, i.getObject()))),
                                97);
            }

            return ZVal.assign(checksum);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "iban")
        public Object isValid(RuntimeEnv env, Object... args) {
            Object iban = assignParameter(args, 0, false);
            return ZVal.assign(
                    ZVal.strictEqualityCheck(
                            runtimeStaticObject.checksum(env, iban),
                            "===",
                            function_substr.f.env(env).call(iban, 2, 2).value()));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Calculator\\Iban")
                    .setLookup(
                            Iban.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Calculator/Iban.php")
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
