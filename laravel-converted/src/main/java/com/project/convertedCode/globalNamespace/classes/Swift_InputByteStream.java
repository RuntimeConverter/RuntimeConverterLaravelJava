package com.project.convertedCode.globalNamespace.classes;

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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/InputByteStream.php

*/

public interface Swift_InputByteStream {

    public static final Object CONST_class = "Swift_InputByteStream";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bytes")
    public Object write(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object commit(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "is", typeHint = "self")
    public Object bind(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "is", typeHint = "self")
    public Object unbind(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object flushBuffers(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_InputByteStream")
                    .setLookup(Swift_InputByteStream.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/InputByteStream.php")
                    .get();
}
