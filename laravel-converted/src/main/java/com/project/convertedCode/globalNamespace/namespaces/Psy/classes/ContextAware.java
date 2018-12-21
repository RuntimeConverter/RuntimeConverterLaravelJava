package com.project.convertedCode.globalNamespace.namespaces.Psy.classes;

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

 vendor/psy/psysh/src/ContextAware.php

*/

public interface ContextAware {

    public static final Object CONST_class = "Psy\\ContextAware";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "context", typeHint = "Psy\\Context")
    public Object setContext(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\ContextAware")
                    .setLookup(ContextAware.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/psy/psysh/src/ContextAware.php")
                    .get();
}
