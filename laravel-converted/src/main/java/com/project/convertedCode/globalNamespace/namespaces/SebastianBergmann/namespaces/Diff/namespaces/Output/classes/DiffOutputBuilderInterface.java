package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.namespaces.Output.classes;

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

 vendor/sebastian/diff/src/Output/DiffOutputBuilderInterface.php

*/

public interface DiffOutputBuilderInterface {

    public static final Object CONST_class =
            "SebastianBergmann\\Diff\\Output\\DiffOutputBuilderInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "diff", typeHint = "array")
    public Object getDiff(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Diff\\Output\\DiffOutputBuilderInterface")
                    .setLookup(DiffOutputBuilderInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/sebastian/diff/src/Output/DiffOutputBuilderInterface.php")
                    .get();
}
