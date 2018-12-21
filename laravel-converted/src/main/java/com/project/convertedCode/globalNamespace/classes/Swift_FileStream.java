package com.project.convertedCode.globalNamespace.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.classes.Swift_OutputByteStream;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/FileStream.php

*/

public interface Swift_FileStream extends Swift_OutputByteStream {

    public static final Object CONST_class = "Swift_FileStream";

    @ConvertedMethod
    public Object getPath(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_FileStream")
                    .setLookup(Swift_FileStream.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/swiftmailer/swiftmailer/lib/classes/Swift/FileStream.php")
                    .addInterface("Swift_OutputByteStream")
                    .get();
}
