package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.classes;

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

 vendor/laravel/framework/src/Illuminate/Session/ExistenceAwareInterface.php

*/

public interface ExistenceAwareInterface {

    public static final Object CONST_class = "Illuminate\\Session\\ExistenceAwareInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object setExists(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Session\\ExistenceAwareInterface")
                    .setLookup(ExistenceAwareInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Session/ExistenceAwareInterface.php")
                    .get();
}
