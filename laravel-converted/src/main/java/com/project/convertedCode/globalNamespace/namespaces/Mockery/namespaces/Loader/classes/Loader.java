package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Loader.classes;

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

 vendor/mockery/mockery/library/Mockery/Loader/Loader.php

*/

public interface Loader {

    public static final Object CONST_class = "Mockery\\Loader\\Loader";

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "definition",
        typeHint = "Mockery\\Generator\\MockDefinition"
    )
    public Object load(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Mockery\\Loader\\Loader")
                    .setLookup(Loader.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/mockery/mockery/library/Mockery/Loader/Loader.php")
                    .get();
}
