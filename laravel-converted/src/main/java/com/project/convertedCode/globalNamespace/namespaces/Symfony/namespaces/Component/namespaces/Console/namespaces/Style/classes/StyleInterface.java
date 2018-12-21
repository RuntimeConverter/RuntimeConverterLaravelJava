package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Style.classes;

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

 vendor/symfony/console/Style/StyleInterface.php

*/

public interface StyleInterface {

    public static final Object CONST_class = "Symfony\\Component\\Console\\Style\\StyleInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    public Object title(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    public Object section(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "elements", typeHint = "array")
    public Object listing(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    public Object text(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    public Object success(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    public Object error(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    public Object warning(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    public Object note(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    public Object caution(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "headers", typeHint = "array")
    @ConvertedParameter(index = 1, name = "rows", typeHint = "array")
    public Object table(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "question")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "validator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object ask(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "question")
    @ConvertedParameter(
        index = 1,
        name = "validator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object askHidden(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "question")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object confirm(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "question")
    @ConvertedParameter(index = 1, name = "choices", typeHint = "array")
    @ConvertedParameter(
        index = 2,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object choice(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "count", defaultValue = "1", defaultValueType = "number")
    public Object newLine(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "max", defaultValue = "0", defaultValueType = "number")
    public Object progressStart(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "step", defaultValue = "1", defaultValueType = "number")
    public Object progressAdvance(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object progressFinish(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Style\\StyleInterface")
                    .setLookup(StyleInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/symfony/console/Style/StyleInterface.php")
                    .get();
}
