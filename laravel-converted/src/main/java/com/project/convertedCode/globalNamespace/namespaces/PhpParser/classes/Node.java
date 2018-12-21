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

 vendor/nikic/php-parser/lib/PhpParser/Node.php

*/

public interface Node {

    public static final Object CONST_class = "PhpParser\\Node";

    @ConvertedMethod
    public Object getType(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getSubNodeNames(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getLine(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getStartLine(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getEndLine(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getStartTokenPos(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getEndTokenPos(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getStartFilePos(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getEndFilePos(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getComments(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getDocComment(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "docComment", typeHint = "PhpParser\\Comment\\Doc")
    public Object setDocComment(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key", typeHint = "string")
    @ConvertedParameter(index = 1, name = "value")
    public Object setAttribute(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key", typeHint = "string")
    public Object hasAttribute(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getAttribute(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getAttributes(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes", typeHint = "array")
    public Object setAttributes(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PhpParser\\Node")
                    .setLookup(Node.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Node.php")
                    .get();
}
