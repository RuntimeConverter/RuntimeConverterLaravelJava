package com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Handler.classes;

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

 vendor/filp/whoops/src/Whoops/Handler/HandlerInterface.php

*/

public interface HandlerInterface {

    public static final Object CONST_class = "Whoops\\Handler\\HandlerInterface";

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "run", typeHint = "Whoops\\RunInterface")
    public Object setRun(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception")
    public Object setException(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "inspector", typeHint = "Whoops\\Exception\\Inspector")
    public Object setInspector(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Whoops\\Handler\\HandlerInterface")
                    .setLookup(HandlerInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/filp/whoops/src/Whoops/Handler/HandlerInterface.php")
                    .get();
}
