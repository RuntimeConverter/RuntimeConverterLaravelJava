package com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes;

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

 vendor/nikic/php-parser/lib/PhpParser/Parser.php

*/

public interface Parser {

    public static final Object CONST_class = "PhpParser\\Parser";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "errorHandler",
        typeHint = "PhpParser\\ErrorHandler",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object parse(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PhpParser\\Parser")
                    .setLookup(Parser.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Parser.php")
                    .get();
}
