package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.classes;

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

 vendor/mockery/mockery/library/Mockery/Generator/TargetClassInterface.php

*/

public interface TargetClassInterface {

    public static final Object CONST_class = "Mockery\\Generator\\TargetClassInterface";

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getMethods(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getInterfaces(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getNamespaceName(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getShortName(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object isAbstract(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object isFinal(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object inNamespace(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "interface")
    public Object implementsInterface(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object hasInternalAncestor(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Mockery\\Generator\\TargetClassInterface")
                    .setLookup(TargetClassInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/mockery/mockery/library/Mockery/Generator/TargetClassInterface.php")
                    .get();
}
