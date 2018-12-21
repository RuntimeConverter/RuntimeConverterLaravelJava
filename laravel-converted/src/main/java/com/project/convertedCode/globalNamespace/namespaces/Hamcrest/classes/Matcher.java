package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.SelfDescribing;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Matcher.php

*/

public interface Matcher extends SelfDescribing {

    public static final Object CONST_class = "Hamcrest\\Matcher";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    public Object matches(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    @ConvertedParameter(index = 1, name = "description", typeHint = "Hamcrest\\Description")
    public Object describeMismatch(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Matcher")
                    .setLookup(Matcher.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Matcher.php")
                    .addInterface("Hamcrest\\SelfDescribing")
                    .get();
}
