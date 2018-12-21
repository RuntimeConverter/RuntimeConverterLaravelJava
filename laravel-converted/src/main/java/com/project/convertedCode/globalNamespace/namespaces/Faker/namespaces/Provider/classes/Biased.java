package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes.Base;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.math.function_floor;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/Biased.php

*/

public class Biased extends Base {

    public Biased(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Biased.class) {
            this.__construct(env, args);
        }
    }

    public Biased(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "min", defaultValue = "0", defaultValueType = "number")
    @ConvertedParameter(index = 1, name = "max", defaultValue = "100", defaultValueType = "number")
    @ConvertedParameter(index = 2, name = "function")
    public Object biasedNumberBetween(RuntimeEnv env, Object... args) {
        Object min = assignParameter(args, 0, true);
        if (null == min) {
            min = 0;
        }
        Object max = assignParameter(args, 1, true);
        if (null == max) {
            max = 100;
        }
        Object function = assignParameter(args, 2, true);
        if (null == function) {
            function = "sqrt";
        }
        Object x = null;
        Object y = null;
        do {
            x =
                    ZVal.divide(
                            NamespaceGlobal.mt_rand.env(env).call().value(),
                            NamespaceGlobal.mt_getrandmax.env(env).call().value());
            y =
                    ZVal.divide(
                            NamespaceGlobal.mt_rand.env(env).call().value(),
                            ZVal.add(NamespaceGlobal.mt_getrandmax.env(env).call().value(), 1));

        } while (ZVal.isLessThan(
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(function, x)
                        .value(),
                '<',
                y));

        return ZVal.assign(
                function_floor
                        .f
                        .env(env)
                        .call(ZVal.add(ZVal.multiply(x, ZVal.add(ZVal.subtract(max, min), 1)), min))
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\Biased";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Base.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        protected Object unbiased(RuntimeEnv env, Object... args) {
            return 1;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "x")
        protected Object linearLow(RuntimeEnv env, Object... args) {
            Object x = assignParameter(args, 0, false);
            return ZVal.assign(ZVal.subtract(1, x));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "x")
        protected Object linearHigh(RuntimeEnv env, Object... args) {
            Object x = assignParameter(args, 0, false);
            return ZVal.assign(x);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\Biased")
                    .setLookup(
                            Biased.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/Biased.php")
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
