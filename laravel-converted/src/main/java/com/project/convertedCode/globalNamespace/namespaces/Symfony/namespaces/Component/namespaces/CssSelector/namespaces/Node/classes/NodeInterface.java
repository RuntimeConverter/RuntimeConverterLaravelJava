package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Node.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/css-selector/Node/NodeInterface.php

*/

public interface NodeInterface {

    public static final Object CONST_class = "Symfony\\Component\\CssSelector\\Node\\NodeInterface";

    @ConvertedMethod
    public Object getNodeName(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getSpecificity(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\CssSelector\\Node\\NodeInterface")
                    .setLookup(NodeInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/symfony/css-selector/Node/NodeInterface.php")
                    .get();
}
