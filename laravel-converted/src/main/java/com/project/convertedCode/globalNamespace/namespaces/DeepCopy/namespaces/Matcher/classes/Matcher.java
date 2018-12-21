package com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.Matcher.classes;

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

 vendor/myclabs/deep-copy/src/DeepCopy/Matcher/Matcher.php

*/

public interface Matcher {

    public static final Object CONST_class = "DeepCopy\\Matcher\\Matcher";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "object")
    @ConvertedParameter(index = 1, name = "property")
    public Object matches(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("DeepCopy\\Matcher\\Matcher")
                    .setLookup(Matcher.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/myclabs/deep-copy/src/DeepCopy/Matcher/Matcher.php")
                    .get();
}
