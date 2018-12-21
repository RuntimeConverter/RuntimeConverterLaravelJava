package com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Converter.namespaces.Number.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Converter.classes.NumberConverterInterface;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Exception.classes.UnsatisfiedDependencyException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/ramsey/uuid/src/Converter/Number/DegradedNumberConverter.php

*/

public class DegradedNumberConverter extends RuntimeClassBase implements NumberConverterInterface {

    public DegradedNumberConverter(RuntimeEnv env, Object... args) {
        super(env);
    }

    public DegradedNumberConverter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "hex")
    public Object fromHex(RuntimeEnv env, Object... args) {
        Object hex = assignParameter(args, 0, false);
        throw ZVal.getException(
                env,
                new UnsatisfiedDependencyException(
                        env,
                        "Cannot call "
                                + toStringR("DegradedNumberConverter::fromHex", env)
                                + " without support for large "
                                + "integers, since integer is an unsigned "
                                + "128-bit integer; Moontoast\\Math\\BigNumber is required."));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "integer")
    public Object toHex(RuntimeEnv env, Object... args) {
        Object integer = assignParameter(args, 0, false);
        throw ZVal.getException(
                env,
                new UnsatisfiedDependencyException(
                        env,
                        "Cannot call "
                                + toStringR("DegradedNumberConverter::toHex", env)
                                + " without support for large "
                                + "integers, since integer is an unsigned "
                                + "128-bit integer; Moontoast\\Math\\BigNumber is required. "));
    }

    public static final Object CONST_class =
            "Ramsey\\Uuid\\Converter\\Number\\DegradedNumberConverter";

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
                    .setName("Ramsey\\Uuid\\Converter\\Number\\DegradedNumberConverter")
                    .setLookup(
                            DegradedNumberConverter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/ramsey/uuid/src/Converter/Number/DegradedNumberConverter.php")
                    .addInterface("Ramsey\\Uuid\\Converter\\NumberConverterInterface")
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
