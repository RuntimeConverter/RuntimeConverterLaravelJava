package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes;

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

 vendor/sebastian/diff/src/LongestCommonSubsequenceCalculator.php

*/

public interface LongestCommonSubsequenceCalculator {

    public static final Object CONST_class =
            "SebastianBergmann\\Diff\\LongestCommonSubsequenceCalculator";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "from", typeHint = "array")
    @ConvertedParameter(index = 1, name = "to", typeHint = "array")
    public Object calculate(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Diff\\LongestCommonSubsequenceCalculator")
                    .setLookup(LongestCommonSubsequenceCalculator.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/sebastian/diff/src/LongestCommonSubsequenceCalculator.php")
                    .get();
}
