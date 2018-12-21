package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes;

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

 vendor/symfony/console/Input/InputInterface.php

*/

public interface InputInterface {

    public static final Object CONST_class = "Symfony\\Component\\Console\\Input\\InputInterface";

    @ConvertedMethod
    public Object getFirstArgument(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values")
    @ConvertedParameter(
        index = 1,
        name = "onlyParams",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object hasParameterOption(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "onlyParams",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object getParameterOption(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "definition",
        typeHint = "Symfony\\Component\\Console\\Input\\InputDefinition"
    )
    public Object bind(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object validate(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getArguments(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getArgument(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "value")
    public Object setArgument(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object hasArgument(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getOptions(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getOption(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "value")
    public Object setOption(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object hasOption(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object isInteractive(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "interactive")
    public Object setInteractive(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Input\\InputInterface")
                    .setLookup(InputInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/symfony/console/Input/InputInterface.php")
                    .get();
}
