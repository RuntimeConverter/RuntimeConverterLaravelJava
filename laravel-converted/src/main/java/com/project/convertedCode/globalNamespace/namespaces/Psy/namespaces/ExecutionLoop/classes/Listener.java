package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.ExecutionLoop.classes;

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

 vendor/psy/psysh/src/ExecutionLoop/Listener.php

*/

public interface Listener {

    public static final Object CONST_class = "Psy\\ExecutionLoop\\Listener";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "shell", typeHint = "Psy\\Shell")
    public Object beforeRun(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "shell", typeHint = "Psy\\Shell")
    public Object beforeLoop(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "shell", typeHint = "Psy\\Shell")
    @ConvertedParameter(index = 1, name = "input")
    public Object onInput(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "shell", typeHint = "Psy\\Shell")
    @ConvertedParameter(index = 1, name = "code")
    public Object onExecute(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "shell", typeHint = "Psy\\Shell")
    public Object afterLoop(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "shell", typeHint = "Psy\\Shell")
    public Object afterRun(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\ExecutionLoop\\Listener")
                    .setLookup(Listener.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/psy/psysh/src/ExecutionLoop/Listener.php")
                    .get();
}
