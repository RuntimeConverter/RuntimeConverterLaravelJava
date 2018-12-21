package com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.TypeFilter.classes;

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

 vendor/myclabs/deep-copy/src/DeepCopy/TypeFilter/TypeFilter.php

*/

public interface TypeFilter {

    public static final Object CONST_class = "DeepCopy\\TypeFilter\\TypeFilter";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "element")
    public Object apply(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("DeepCopy\\TypeFilter\\TypeFilter")
                    .setLookup(TypeFilter.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/myclabs/deep-copy/src/DeepCopy/TypeFilter/TypeFilter.php")
                    .get();
}
