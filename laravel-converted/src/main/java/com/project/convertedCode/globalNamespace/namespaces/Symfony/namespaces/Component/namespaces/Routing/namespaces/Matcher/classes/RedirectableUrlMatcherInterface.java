package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Matcher.classes;

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

 vendor/symfony/routing/Matcher/RedirectableUrlMatcherInterface.php

*/

public interface RedirectableUrlMatcherInterface {

    public static final Object CONST_class =
            "Symfony\\Component\\Routing\\Matcher\\RedirectableUrlMatcherInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "route")
    @ConvertedParameter(
        index = 2,
        name = "scheme",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object redirect(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\Routing\\Matcher\\RedirectableUrlMatcherInterface")
                    .setLookup(RedirectableUrlMatcherInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/symfony/routing/Matcher/RedirectableUrlMatcherInterface.php")
                    .get();
}
