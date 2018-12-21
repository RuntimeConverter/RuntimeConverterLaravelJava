package com.project.convertedCode.globalNamespace.namespaces.Cron.classes;

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

 vendor/dragonmantank/cron-expression/src/Cron/FieldInterface.php

*/

public interface FieldInterface {

    public static final Object CONST_class = "Cron\\FieldInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "date", typeHint = "DateTime")
    @ConvertedParameter(index = 1, name = "value")
    public Object isSatisfiedBy(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "date", typeHint = "DateTime")
    @ConvertedParameter(
        index = 1,
        name = "invert",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object increment(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object validate(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Cron\\FieldInterface")
                    .setLookup(FieldInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/dragonmantank/cron-expression/src/Cron/FieldInterface.php")
                    .get();
}
