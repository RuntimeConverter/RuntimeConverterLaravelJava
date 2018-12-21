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

 vendor/nunomaduro/collision/src/Contracts/Writer.php

*/

public interface Writer {

    public static final Object CONST_class = "NunoMaduro\\Collision\\Contracts\\Writer";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ignore", typeHint = "array")
    public Object ignoreFilesIn(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "show", typeHint = "bool")
    public Object showTrace(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "show", typeHint = "bool")
    public Object showEditor(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "inspector", typeHint = "Whoops\\Exception\\Inspector")
    public Object write(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    public Object setOutput(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getOutput(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("NunoMaduro\\Collision\\Contracts\\Writer")
                    .setLookup(Writer.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/nunomaduro/collision/src/Contracts/Writer.php")
                    .get();
}
