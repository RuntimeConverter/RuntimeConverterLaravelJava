package com.project.convertedCode.globalNamespace.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Swift_InputByteStream;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.classes.Swift_OutputByteStream;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/IoBuffer.php

*/

public interface Swift_Transport_IoBuffer extends Swift_InputByteStream, Swift_OutputByteStream {

    public static final Object CONST_TYPE_SOCKET = 1;

    public static final Object CONST_TYPE_PROCESS = 16;

    public static final Object CONST_class = "Swift_Transport_IoBuffer";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "params", typeHint = "array")
    public Object initialize(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "param")
    @ConvertedParameter(index = 1, name = "value")
    public Object setParam(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object terminate(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "replacements", typeHint = "array")
    public Object setWriteTranslations(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sequence")
    public Object readLine(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Transport_IoBuffer")
                    .setLookup(Swift_Transport_IoBuffer.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/IoBuffer.php")
                    .addInterface("Swift_InputByteStream")
                    .addInterface("Swift_OutputByteStream")
                    .get();
}
