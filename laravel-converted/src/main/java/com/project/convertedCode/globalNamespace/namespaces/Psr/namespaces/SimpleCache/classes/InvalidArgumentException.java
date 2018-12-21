package com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.SimpleCache.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.SimpleCache.classes.CacheException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psr/simple-cache/src/InvalidArgumentException.php

*/

public interface InvalidArgumentException extends CacheException {

    public static final Object CONST_class = "Psr\\SimpleCache\\InvalidArgumentException";

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psr\\SimpleCache\\InvalidArgumentException")
                    .setLookup(InvalidArgumentException.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/psr/simple-cache/src/InvalidArgumentException.php")
                    .addInterface("Psr\\SimpleCache\\CacheException")
                    .get();
}
