package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Builder.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Builder.classes.ParametersMatch;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/MockObject/Builder/MethodNameMatch.php

*/

public interface MethodNameMatch extends ParametersMatch {

    public static final Object CONST_class =
            "PHPUnit\\Framework\\MockObject\\Builder\\MethodNameMatch";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object method(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\MockObject\\Builder\\MethodNameMatch")
                    .setLookup(MethodNameMatch.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/MockObject/Builder/MethodNameMatch.php")
                    .addInterface("PHPUnit\\Framework\\MockObject\\Builder\\ParametersMatch")
                    .addInterface("PHPUnit\\Framework\\MockObject\\Builder\\Match")
                    .addInterface("PHPUnit\\Framework\\MockObject\\Builder\\Stub")
                    .addInterface("PHPUnit\\Framework\\MockObject\\Builder\\Identity")
                    .get();
}
