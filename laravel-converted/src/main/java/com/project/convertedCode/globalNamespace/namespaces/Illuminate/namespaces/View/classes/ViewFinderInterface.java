package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.View.classes;

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

 vendor/laravel/framework/src/Illuminate/View/ViewFinderInterface.php

*/

public interface ViewFinderInterface {

    public static final Object CONST_HINT_PATH_DELIMITER = "::";

    public static final Object CONST_class = "Illuminate\\View\\ViewFinderInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "view")
    public Object find(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "location")
    public Object addLocation(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "namespace")
    @ConvertedParameter(index = 1, name = "hints")
    public Object addNamespace(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "namespace")
    @ConvertedParameter(index = 1, name = "hints")
    public Object prependNamespace(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "namespace")
    @ConvertedParameter(index = 1, name = "hints")
    public Object replaceNamespace(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "extension")
    public Object addExtension(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object flush(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\View\\ViewFinderInterface")
                    .setLookup(ViewFinderInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/View/ViewFinderInterface.php")
                    .get();
}
