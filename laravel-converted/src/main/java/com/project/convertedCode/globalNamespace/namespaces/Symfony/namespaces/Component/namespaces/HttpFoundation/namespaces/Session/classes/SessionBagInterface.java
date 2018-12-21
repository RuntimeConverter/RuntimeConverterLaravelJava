package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.classes;

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

 vendor/symfony/http-foundation/Session/SessionBagInterface.php

*/

public interface SessionBagInterface {

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\Session\\SessionBagInterface";

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "array", typeHint = "array")
    public Object initialize(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args);

    @ConvertedMethod
    public Object getStorageKey(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object clear(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpFoundation\\Session\\SessionBagInterface")
                    .setLookup(SessionBagInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/symfony/http-foundation/Session/SessionBagInterface.php")
                    .get();
}
