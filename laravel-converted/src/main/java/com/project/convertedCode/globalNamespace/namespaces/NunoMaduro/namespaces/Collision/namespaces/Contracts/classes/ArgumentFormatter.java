package com.project.convertedCode.globalNamespace.namespaces.NunoMaduro.namespaces.Collision.namespaces.Contracts.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nunomaduro/collision/src/Contracts/ArgumentFormatter.php

*/

public interface ArgumentFormatter {

    public static final Object CONST_class = "NunoMaduro\\Collision\\Contracts\\ArgumentFormatter";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "arguments", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "recursive",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object format(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("NunoMaduro\\Collision\\Contracts\\ArgumentFormatter")
                    .setLookup(ArgumentFormatter.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/nunomaduro/collision/src/Contracts/ArgumentFormatter.php")
                    .get();
}
