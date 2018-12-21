package com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes;

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

 vendor/league/flysystem/src/PluginInterface.php

*/

public interface PluginInterface {

    public static final Object CONST_class = "League\\Flysystem\\PluginInterface";

    @ConvertedMethod
    public Object getMethod(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "filesystem",
        typeHint = "League\\Flysystem\\FilesystemInterface"
    )
    public Object setFilesystem(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("League\\Flysystem\\PluginInterface")
                    .setLookup(PluginInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/league/flysystem/src/PluginInterface.php")
                    .get();
}
