package com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Converter.namespaces.Time.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Exception.classes.UnsatisfiedDependencyException;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Converter.classes.TimeConverterInterface;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/ramsey/uuid/src/Converter/Time/DegradedTimeConverter.php

*/

public class DegradedTimeConverter extends RuntimeClassBase implements TimeConverterInterface {

    public DegradedTimeConverter(RuntimeEnv env, Object... args) {
        super(env);
    }

    public DegradedTimeConverter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "seconds")
    @ConvertedParameter(index = 1, name = "microSeconds")
    public Object calculateTime(RuntimeEnv env, Object... args) {
        Object seconds = assignParameter(args, 0, false);
        Object microSeconds = assignParameter(args, 1, false);
        throw ZVal.getException(
                env,
                new UnsatisfiedDependencyException(
                        env,
                        "When calling "
                                + toStringR("DegradedTimeConverter::calculateTime", env)
                                + " on a 32-bit system, "
                                + "Moontoast\\Math\\BigNumber must be present."));
    }

    public static final Object CONST_class = "Ramsey\\Uuid\\Converter\\Time\\DegradedTimeConverter";

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
                    .setName("Ramsey\\Uuid\\Converter\\Time\\DegradedTimeConverter")
                    .setLookup(
                            DegradedTimeConverter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/ramsey/uuid/src/Converter/Time/DegradedTimeConverter.php")
                    .addInterface("Ramsey\\Uuid\\Converter\\TimeConverterInterface")
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
