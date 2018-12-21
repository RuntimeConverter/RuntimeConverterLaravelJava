package com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/league/flysystem/src/FilesystemInterface.php

*/

public interface FilesystemInterface {

    public static final Object CONST_class = "League\\Flysystem\\FilesystemInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object has(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object read(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object readStream(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory")
    @ConvertedParameter(
        index = 1,
        name = "recursive",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object listContents(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getMetadata(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getSize(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getMimetype(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getTimestamp(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getVisibility(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "contents")
    @ConvertedParameter(
        index = 2,
        name = "config",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object write(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "resource")
    @ConvertedParameter(
        index = 2,
        name = "config",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object writeStream(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "contents")
    @ConvertedParameter(
        index = 2,
        name = "config",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object update(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "resource")
    @ConvertedParameter(
        index = 2,
        name = "config",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object updateStream(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "newpath")
    public Object rename(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "newpath")
    public Object copy(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object delete(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dirname")
    public Object deleteDir(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dirname")
    @ConvertedParameter(
        index = 1,
        name = "config",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object createDir(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "visibility")
    public Object setVisibility(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "contents")
    @ConvertedParameter(
        index = 2,
        name = "config",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object put(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "resource")
    @ConvertedParameter(
        index = 2,
        name = "config",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object putStream(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object readAndDelete(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(
        index = 1,
        name = "handler",
        typeHint = "League\\Flysystem\\Handler",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object get(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "plugin", typeHint = "League\\Flysystem\\PluginInterface")
    public Object addPlugin(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("League\\Flysystem\\FilesystemInterface")
                    .setLookup(FilesystemInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/league/flysystem/src/FilesystemInterface.php")
                    .get();
}
