package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-common/src/File.php

*/

public interface File {

    public static final Object CONST_class = "phpDocumentor\\Reflection\\File";

    @ConvertedMethod
    public Object getContents(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object md5(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object path(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\File")
                    .setLookup(File.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpdocumentor/reflection-common/src/File.php")
                    .get();
}
