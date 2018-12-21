package com.project.convertedCode.globalNamespace.namespaces.Whoops.classes;

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

 vendor/filp/whoops/src/Whoops/RunInterface.php

*/

public interface RunInterface {

    public static final Object CONST_EXCEPTION_HANDLER = "handleException";

    public static final Object CONST_ERROR_HANDLER = "handleError";

    public static final Object CONST_SHUTDOWN_HANDLER = "handleShutdown";

    public static final Object CONST_class = "Whoops\\RunInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "handler")
    public Object pushHandler(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object popHandler(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getHandlers(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object clearHandlers(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object register(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object unregister(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "exit",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object allowQuit(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "patterns")
    @ConvertedParameter(
        index = 1,
        name = "levels",
        defaultValue = "10240",
        defaultValueType = "number"
    )
    public Object silenceErrorsInPaths(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "code",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object sendHttpCode(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "send",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object writeToOutput(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception")
    public Object handleException(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    @ConvertedParameter(index = 1, name = "message")
    @ConvertedParameter(
        index = 2,
        name = "file",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "line",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object handleError(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object handleShutdown(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Whoops\\RunInterface")
                    .setLookup(RunInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/filp/whoops/src/Whoops/RunInterface.php")
                    .get();
}
