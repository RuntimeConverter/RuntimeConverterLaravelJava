package com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.ReadInterface;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/league/flysystem/src/AdapterInterface.php

*/

public interface AdapterInterface extends ReadInterface {

    public static final Object CONST_VISIBILITY_PUBLIC = "public";

    public static final Object CONST_VISIBILITY_PRIVATE = "private";

    public static final Object CONST_class = "League\\Flysystem\\AdapterInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "contents")
    @ConvertedParameter(index = 2, name = "config", typeHint = "League\\Flysystem\\Config")
    public Object write(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "resource")
    @ConvertedParameter(index = 2, name = "config", typeHint = "League\\Flysystem\\Config")
    public Object writeStream(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "contents")
    @ConvertedParameter(index = 2, name = "config", typeHint = "League\\Flysystem\\Config")
    public Object update(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "resource")
    @ConvertedParameter(index = 2, name = "config", typeHint = "League\\Flysystem\\Config")
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
    @ConvertedParameter(index = 1, name = "config", typeHint = "League\\Flysystem\\Config")
    public Object createDir(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "visibility")
    public Object setVisibility(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("League\\Flysystem\\AdapterInterface")
                    .setLookup(AdapterInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/league/flysystem/src/AdapterInterface.php")
                    .addInterface("League\\Flysystem\\ReadInterface")
                    .get();
}
