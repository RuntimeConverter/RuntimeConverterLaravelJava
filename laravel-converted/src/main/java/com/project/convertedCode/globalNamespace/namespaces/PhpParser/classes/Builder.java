package com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Builder.php

*/

public interface Builder {

    public static final Object CONST_class = "PhpParser\\Builder";

    @ConvertedMethod
    public Object getNode(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PhpParser\\Builder")
                    .setLookup(Builder.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Builder.php")
                    .get();
}
