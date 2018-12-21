package com.project.convertedCode.globalNamespace.namespaces.NunoMaduro.namespaces.Collision.namespaces.Contracts.classes;

import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Handler.classes.HandlerInterface;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nunomaduro/collision/src/Contracts/Handler.php

*/

public interface Handler extends HandlerInterface {

    public static final Object CONST_class = "NunoMaduro\\Collision\\Contracts\\Handler";

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    public Object setOutput(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getWriter(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("NunoMaduro\\Collision\\Contracts\\Handler")
                    .setLookup(Handler.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/nunomaduro/collision/src/Contracts/Handler.php")
                    .addInterface("Whoops\\Handler\\HandlerInterface")
                    .get();
}
