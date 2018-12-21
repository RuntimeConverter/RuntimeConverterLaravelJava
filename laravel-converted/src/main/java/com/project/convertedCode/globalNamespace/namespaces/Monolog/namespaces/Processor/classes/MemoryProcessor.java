package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Processor.classes;

import com.runtimeconverter.runtime.nativeFunctions.math.function_round;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Processor/MemoryProcessor.php

*/

public abstract class MemoryProcessor extends RuntimeClassBase {

    public Object realUsage = null;

    public Object useFormatting = null;

    public MemoryProcessor(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MemoryProcessor.class) {
            this.__construct(env, args);
        }
    }

    public MemoryProcessor(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "realUsage",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "useFormatting",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object realUsage = assignParameter(args, 0, true);
        if (null == realUsage) {
            realUsage = true;
        }
        Object useFormatting = assignParameter(args, 1, true);
        if (null == useFormatting) {
            useFormatting = true;
        }
        this.realUsage = ZVal.toBool(realUsage);
        this.useFormatting = ZVal.toBool(useFormatting);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bytes")
    protected Object formatBytes(RuntimeEnv env, Object... args) {
        Object bytes = assignParameter(args, 0, false);
        bytes = ZVal.assign(ZVal.toLong(bytes));
        if (!ZVal.isTrue(this.useFormatting)) {
            return ZVal.assign(bytes);
        }

        if (ZVal.isGreaterThan(bytes, '>', ZVal.multiply(1024, 1024))) {
            return ZVal.assign(
                    toStringR(
                                    function_round
                                            .f
                                            .env(env)
                                            .call(ZVal.divide(ZVal.divide(bytes, 1024), 1024), 2)
                                            .value(),
                                    env)
                            + " MB");

        } else if (ZVal.isGreaterThan(bytes, '>', 1024)) {
            return ZVal.assign(
                    toStringR(
                                    function_round
                                            .f
                                            .env(env)
                                            .call(ZVal.divide(bytes, 1024), 2)
                                            .value(),
                                    env)
                            + " KB");
        }

        return ZVal.assign(toStringR(bytes, env) + " B");
    }

    public static final Object CONST_class = "Monolog\\Processor\\MemoryProcessor";

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
                    .setName("Monolog\\Processor\\MemoryProcessor")
                    .setLookup(
                            MemoryProcessor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("realUsage", "useFormatting")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Processor/MemoryProcessor.php")
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
