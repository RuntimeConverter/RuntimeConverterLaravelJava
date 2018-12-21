package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes;

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

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/SelfDescribing.php

*/

public interface SelfDescribing {

    public static final Object CONST_class = "Hamcrest\\SelfDescribing";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "description", typeHint = "Hamcrest\\Description")
    public Object describeTo(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\SelfDescribing")
                    .setLookup(SelfDescribing.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/SelfDescribing.php")
                    .get();
}
