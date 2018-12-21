package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Processor.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_memory_get_peak_usage;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Processor.classes.MemoryProcessor;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Processor/MemoryPeakUsageProcessor.php

*/

public class MemoryPeakUsageProcessor extends MemoryProcessor {

    public MemoryPeakUsageProcessor(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MemoryPeakUsageProcessor.class) {
            this.__construct(env, args);
        }
    }

    public MemoryPeakUsageProcessor(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object __invoke(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object bytes = null;
        Object formatted = null;
        bytes =
                function_memory_get_peak_usage
                        .f
                        .env(env)
                        .call(toObjectR(this).accessProp(this, env).name("realUsage").value())
                        .value();
        formatted = env.callMethod(this, "formatBytes", MemoryPeakUsageProcessor.class, bytes);
        record.arrayAccess(env, "extra", "memory_peak_usage").set(formatted);
        return ZVal.assign(record.getObject());
    }

    public static final Object CONST_class = "Monolog\\Processor\\MemoryPeakUsageProcessor";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends MemoryProcessor.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Processor\\MemoryPeakUsageProcessor")
                    .setLookup(
                            MemoryPeakUsageProcessor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("realUsage", "useFormatting")
                    .setFilename(
                            "vendor/monolog/monolog/src/Monolog/Processor/MemoryPeakUsageProcessor.php")
                    .addExtendsClass("Monolog\\Processor\\MemoryProcessor")
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
