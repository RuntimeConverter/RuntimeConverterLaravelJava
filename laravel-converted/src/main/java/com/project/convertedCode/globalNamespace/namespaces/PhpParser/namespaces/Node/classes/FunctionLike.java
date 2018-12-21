package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.Node;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Node/FunctionLike.php

*/

public interface FunctionLike extends Node {

    public static final Object CONST_class = "PhpParser\\Node\\FunctionLike";

    @ConvertedMethod
    public Object returnsByRef(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getParams(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getReturnType(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getStmts(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PhpParser\\Node\\FunctionLike")
                    .setLookup(FunctionLike.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Node/FunctionLike.php")
                    .addInterface("PhpParser\\Node")
                    .get();
}
