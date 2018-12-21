package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Builder.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Builder.classes.Match;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/MockObject/Builder/ParametersMatch.php

*/

public interface ParametersMatch extends Match {

    public static final Object CONST_class =
            "PHPUnit\\Framework\\MockObject\\Builder\\ParametersMatch";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "arguments")
    public Object with(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object withAnyParameters(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\MockObject\\Builder\\ParametersMatch")
                    .setLookup(ParametersMatch.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/MockObject/Builder/ParametersMatch.php")
                    .addInterface("PHPUnit\\Framework\\MockObject\\Builder\\Match")
                    .addInterface("PHPUnit\\Framework\\MockObject\\Builder\\Stub")
                    .addInterface("PHPUnit\\Framework\\MockObject\\Builder\\Identity")
                    .get();
}
