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

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Description.php

*/

public interface Description {

    public static final Object CONST_class = "Hamcrest\\Description";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "text")
    public Object appendText(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", typeHint = "Hamcrest\\SelfDescribing")
    public Object appendDescriptionOf(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object appendValue(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "start")
    @ConvertedParameter(index = 1, name = "separator")
    @ConvertedParameter(index = 2, name = "end")
    @ConvertedParameter(index = 3, name = "values")
    public Object appendValueList(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "start")
    @ConvertedParameter(index = 1, name = "separator")
    @ConvertedParameter(index = 2, name = "end")
    @ConvertedParameter(index = 3, name = "values")
    public Object appendList(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Description")
                    .setLookup(Description.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Description.php")
                    .get();
}
