package com.project.convertedCode.globalNamespace.namespaces.NunoMaduro.namespaces.Collision.namespaces.Contracts.namespaces.Adapters.namespaces.Phpunit.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestListener;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nunomaduro/collision/src/Contracts/Adapters/Phpunit/Listener.php

*/

public interface Listener extends TestListener {

    public static final Object CONST_class =
            "NunoMaduro\\Collision\\Contracts\\Adapters\\Phpunit\\Listener";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "t", typeHint = "Throwable")
    public Object render(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("NunoMaduro\\Collision\\Contracts\\Adapters\\Phpunit\\Listener")
                    .setLookup(Listener.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/nunomaduro/collision/src/Contracts/Adapters/Phpunit/Listener.php")
                    .addInterface("PHPUnit\\Framework\\TestListener")
                    .get();
}
