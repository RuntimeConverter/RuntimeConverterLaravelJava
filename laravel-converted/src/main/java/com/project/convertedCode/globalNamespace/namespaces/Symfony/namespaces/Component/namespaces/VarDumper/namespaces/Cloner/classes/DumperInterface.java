package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes;

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

 vendor/symfony/var-dumper/Cloner/DumperInterface.php

*/

public interface DumperInterface {

    public static final Object CONST_class =
            "Symfony\\Component\\VarDumper\\Cloner\\DumperInterface";

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "cursor",
        typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Cursor"
    )
    @ConvertedParameter(index = 1, name = "type")
    @ConvertedParameter(index = 2, name = "value")
    public Object dumpScalar(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "cursor",
        typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Cursor"
    )
    @ConvertedParameter(index = 1, name = "str")
    @ConvertedParameter(index = 2, name = "bin")
    @ConvertedParameter(index = 3, name = "cut")
    public Object dumpString(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "cursor",
        typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Cursor"
    )
    @ConvertedParameter(index = 1, name = "type")
    @ConvertedParameter(index = 2, name = "class")
    @ConvertedParameter(index = 3, name = "hasChild")
    public Object enterHash(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "cursor",
        typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Cursor"
    )
    @ConvertedParameter(index = 1, name = "type")
    @ConvertedParameter(index = 2, name = "class")
    @ConvertedParameter(index = 3, name = "hasChild")
    @ConvertedParameter(index = 4, name = "cut")
    public Object leaveHash(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Cloner\\DumperInterface")
                    .setLookup(DumperInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/symfony/var-dumper/Cloner/DumperInterface.php")
                    .get();
}
