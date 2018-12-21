package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes;

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

 vendor/symfony/console/Output/OutputInterface.php

*/

public interface OutputInterface {

    public static final Object CONST_VERBOSITY_QUIET = 16;

    public static final Object CONST_VERBOSITY_NORMAL = 32;

    public static final Object CONST_VERBOSITY_VERBOSE = 64;

    public static final Object CONST_VERBOSITY_VERY_VERBOSE = 128;

    public static final Object CONST_VERBOSITY_DEBUG = 256;

    public static final Object CONST_OUTPUT_NORMAL = 1;

    public static final Object CONST_OUTPUT_RAW = 2;

    public static final Object CONST_OUTPUT_PLAIN = 4;

    public static final Object CONST_class = "Symfony\\Component\\Console\\Output\\OutputInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages")
    @ConvertedParameter(
        index = 1,
        name = "newline",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "options",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object write(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages")
    @ConvertedParameter(
        index = 1,
        name = "options",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object writeln(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    public Object setVerbosity(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getVerbosity(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object isQuiet(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object isVerbose(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object isVeryVerbose(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object isDebug(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "decorated")
    public Object setDecorated(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object isDecorated(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "formatter",
        typeHint = "Symfony\\Component\\Console\\Formatter\\OutputFormatterInterface"
    )
    public Object setFormatter(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getFormatter(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Output\\OutputInterface")
                    .setLookup(OutputInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/symfony/console/Output/OutputInterface.php")
                    .get();
}
