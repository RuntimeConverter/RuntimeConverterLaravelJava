package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Builder.classes;

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

 vendor/phpunit/phpunit/src/Framework/MockObject/Builder/NamespaceMatch.php

*/

public interface NamespaceMatch {

    public static final Object CONST_class =
            "PHPUnit\\Framework\\MockObject\\Builder\\NamespaceMatch";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    public Object lookupId(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    @ConvertedParameter(
        index = 1,
        name = "builder",
        typeHint = "PHPUnit\\Framework\\MockObject\\Builder\\Match"
    )
    public Object registerId(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\MockObject\\Builder\\NamespaceMatch")
                    .setLookup(NamespaceMatch.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/MockObject/Builder/NamespaceMatch.php")
                    .get();
}
