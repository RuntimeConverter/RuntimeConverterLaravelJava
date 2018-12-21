package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Readline.classes;

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

 vendor/psy/psysh/src/Readline/Readline.php

*/

public interface Readline {

    public static final Object CONST_class = "Psy\\Readline\\Readline";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "line")
    public Object addHistory(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object clearHistory(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object listHistory(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object readHistory(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "prompt",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object readline(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object redisplay(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object writeHistory(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Readline\\Readline")
                    .setLookup(Readline.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/psy/psysh/src/Readline/Readline.php")
                    .get();
}
