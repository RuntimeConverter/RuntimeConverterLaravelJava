package com.project.convertedCode.globalNamespace.namespaces.NunoMaduro.namespaces.Collision.namespaces.Contracts.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nunomaduro/collision/src/Contracts/Provider.php

*/

public interface Provider {

    public static final Object CONST_class = "NunoMaduro\\Collision\\Contracts\\Provider";

    @ConvertedMethod
    public Object register(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getHandler(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("NunoMaduro\\Collision\\Contracts\\Provider")
                    .setLookup(Provider.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/nunomaduro/collision/src/Contracts/Provider.php")
                    .get();
}
