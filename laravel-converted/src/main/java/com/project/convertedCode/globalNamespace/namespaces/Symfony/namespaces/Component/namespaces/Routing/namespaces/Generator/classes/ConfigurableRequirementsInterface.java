package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Generator.classes;

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

 vendor/symfony/routing/Generator/ConfigurableRequirementsInterface.php

*/

public interface ConfigurableRequirementsInterface {

    public static final Object CONST_class =
            "Symfony\\Component\\Routing\\Generator\\ConfigurableRequirementsInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "enabled")
    public Object setStrictRequirements(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object isStrictRequirements(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\Routing\\Generator\\ConfigurableRequirementsInterface")
                    .setLookup(ConfigurableRequirementsInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/symfony/routing/Generator/ConfigurableRequirementsInterface.php")
                    .get();
}
