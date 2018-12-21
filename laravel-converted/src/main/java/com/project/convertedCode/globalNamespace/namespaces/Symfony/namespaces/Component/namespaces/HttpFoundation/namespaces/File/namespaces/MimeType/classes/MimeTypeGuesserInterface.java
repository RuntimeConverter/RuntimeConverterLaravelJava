package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.MimeType.classes;

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

 vendor/symfony/http-foundation/File/MimeType/MimeTypeGuesserInterface.php

*/

public interface MimeTypeGuesserInterface {

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\File\\MimeType\\MimeTypeGuesserInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object guess(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\HttpFoundation\\File\\MimeType\\MimeTypeGuesserInterface")
                    .setLookup(MimeTypeGuesserInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/symfony/http-foundation/File/MimeType/MimeTypeGuesserInterface.php")
                    .get();
}
