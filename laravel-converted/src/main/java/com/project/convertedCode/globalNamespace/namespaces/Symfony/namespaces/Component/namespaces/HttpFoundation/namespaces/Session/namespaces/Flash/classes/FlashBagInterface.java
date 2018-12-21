package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Flash.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.classes.SessionBagInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/Session/Flash/FlashBagInterface.php

*/

public interface FlashBagInterface extends SessionBagInterface {

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\Session\\Flash\\FlashBagInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(index = 1, name = "message")
    public Object add(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(index = 1, name = "message")
    public Object set(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(
        index = 1,
        name = "default",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object peek(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object peekAll(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(
        index = 1,
        name = "default",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object get(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object all(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages", typeHint = "array")
    public Object setAll(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    public Object has(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object keys(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\HttpFoundation\\Session\\Flash\\FlashBagInterface")
                    .setLookup(FlashBagInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/symfony/http-foundation/Session/Flash/FlashBagInterface.php")
                    .addInterface(
                            "Symfony\\Component\\HttpFoundation\\Session\\SessionBagInterface")
                    .get();
}
