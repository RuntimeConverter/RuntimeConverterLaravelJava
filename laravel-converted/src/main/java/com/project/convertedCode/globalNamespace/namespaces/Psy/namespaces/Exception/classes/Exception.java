package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Exception/Exception.php

*/

public interface Exception {

    public static final Object CONST_class = "Psy\\Exception\\Exception";

    @ConvertedMethod
    public Object getRawMessage(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Exception\\Exception")
                    .setLookup(Exception.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/psy/psysh/src/Exception/Exception.php")
                    .get();
}
