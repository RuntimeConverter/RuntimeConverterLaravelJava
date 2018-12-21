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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/EncodingObserver.php

*/

public interface Swift_Mime_EncodingObserver {

    public static final Object CONST_class = "Swift_Mime_EncodingObserver";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "encoder", typeHint = "Swift_Mime_ContentEncoder")
    public Object encoderChanged(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Mime_EncodingObserver")
                    .setLookup(Swift_Mime_EncodingObserver.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/EncodingObserver.php")
                    .get();
}
