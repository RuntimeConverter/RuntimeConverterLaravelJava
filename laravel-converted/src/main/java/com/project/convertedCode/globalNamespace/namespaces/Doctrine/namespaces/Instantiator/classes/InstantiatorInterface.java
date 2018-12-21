package com.project.convertedCode.globalNamespace.namespaces.Doctrine.namespaces.Instantiator.classes;

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

 vendor/doctrine/instantiator/src/Doctrine/Instantiator/InstantiatorInterface.php

*/

public interface InstantiatorInterface {

    public static final Object CONST_class = "Doctrine\\Instantiator\\InstantiatorInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className")
    public Object instantiate(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Doctrine\\Instantiator\\InstantiatorInterface")
                    .setLookup(InstantiatorInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/doctrine/instantiator/src/Doctrine/Instantiator/InstantiatorInterface.php")
                    .get();
}
