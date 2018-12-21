package com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Generator.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Generator.classes.RandomGeneratorInterface;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.date.function_microtime;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/ramsey/uuid/src/Generator/CombGenerator.php

*/

public class CombGenerator extends RuntimeClassBase implements RandomGeneratorInterface {

    public Object randomGenerator = null;

    public Object converter = null;

    public CombGenerator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CombGenerator.class) {
            this.__construct(env, args);
        }
    }

    public CombGenerator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "generator",
        typeHint = "Ramsey\\Uuid\\Generator\\RandomGeneratorInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "numberConverter",
        typeHint = "Ramsey\\Uuid\\Converter\\NumberConverterInterface"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object generator = assignParameter(args, 0, false);
        Object numberConverter = assignParameter(args, 1, false);
        this.converter = numberConverter;
        this.randomGenerator = generator;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "length")
    public Object generate(RuntimeEnv env, Object... args) {
        Object length = assignParameter(args, 0, false);
        Object lsbTime = null;
        Object hash = null;
        if (ZVal.toBool(ZVal.isLessThan(length, '<', CONST_TIMESTAMP_BYTES))
                || ZVal.toBool(ZVal.isLessThan(length, '<', 0))) {
            throw ZVal.getException(
                    env, new InvalidArgumentException(env, "Length must be a positive integer."));
        }

        hash = "";
        if (ZVal.toBool(ZVal.isGreaterThan(CONST_TIMESTAMP_BYTES, '>', 0))
                && ZVal.toBool(ZVal.isGreaterThan(length, '>', CONST_TIMESTAMP_BYTES))) {
            hash =
                    env.callMethod(
                            this.randomGenerator,
                            "generate",
                            CombGenerator.class,
                            ZVal.subtract(length, CONST_TIMESTAMP_BYTES));
        }

        lsbTime =
                NamespaceGlobal.str_pad
                        .env(env)
                        .call(
                                env.callMethod(
                                        this.converter,
                                        "toHex",
                                        CombGenerator.class,
                                        this.timestamp(env)),
                                ZVal.multiply(CONST_TIMESTAMP_BYTES, 2),
                                "0",
                                0)
                        .value();
        return ZVal.assign(
                NamespaceGlobal.hex2bin
                        .env(env)
                        .call(
                                toStringR(
                                                NamespaceGlobal.str_pad
                                                        .env(env)
                                                        .call(
                                                                NamespaceGlobal.bin2hex
                                                                        .env(env)
                                                                        .call(hash)
                                                                        .value(),
                                                                ZVal.subtract(
                                                                        length,
                                                                        CONST_TIMESTAMP_BYTES),
                                                                "0")
                                                        .value(),
                                                env)
                                        + toStringR(lsbTime, env))
                        .value());
    }

    @ConvertedMethod
    private Object timestamp(RuntimeEnv env, Object... args) {
        ReferenceContainer time = new BasicReferenceContainer(null);
        time.setObject(
                function_explode
                        .f
                        .env(env)
                        .call(" ", function_microtime.f.env(env).call(false).value())
                        .value());
        return ZVal.assign(
                toStringR(time.arrayGet(env, 1), env)
                        + toStringR(
                                function_substr
                                        .f
                                        .env(env)
                                        .call(time.arrayGet(env, 0), 2, 5)
                                        .value(),
                                env));
    }

    public static final Object CONST_TIMESTAMP_BYTES = 6;

    public static final Object CONST_class = "Ramsey\\Uuid\\Generator\\CombGenerator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Ramsey\\Uuid\\Generator\\CombGenerator")
                    .setLookup(
                            CombGenerator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("converter", "randomGenerator")
                    .setFilename("vendor/ramsey/uuid/src/Generator/CombGenerator.php")
                    .addInterface("Ramsey\\Uuid\\Generator\\RandomGeneratorInterface")
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
