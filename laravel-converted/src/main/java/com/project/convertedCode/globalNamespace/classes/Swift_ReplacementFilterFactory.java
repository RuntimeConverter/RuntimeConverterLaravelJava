package com.project.convertedCode.globalNamespace.classes;

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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/ReplacementFilterFactory.php

*/

public interface Swift_ReplacementFilterFactory {

    public static final Object CONST_class = "Swift_ReplacementFilterFactory";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "search")
    @ConvertedParameter(index = 1, name = "replace")
    public Object createFilter(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_ReplacementFilterFactory")
                    .setLookup(Swift_ReplacementFilterFactory.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/ReplacementFilterFactory.php")
                    .get();
}
