package com.project.convertedCode.globalNamespace.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Swift_InputByteStream;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/KeyCache/KeyCacheInputStream.php

*/

public interface Swift_KeyCache_KeyCacheInputStream extends Swift_InputByteStream {

    public static final Object CONST_class = "Swift_KeyCache_KeyCacheInputStream";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keyCache", typeHint = "Swift_KeyCache")
    public Object setKeyCache(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nsKey")
    public Object setNsKey(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "itemKey")
    public Object setItemKey(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "is", typeHint = "Swift_InputByteStream")
    public Object setWriteThroughStream(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object __clone(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_KeyCache_KeyCacheInputStream")
                    .setLookup(Swift_KeyCache_KeyCacheInputStream.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/KeyCache/KeyCacheInputStream.php")
                    .addInterface("Swift_InputByteStream")
                    .get();
}
