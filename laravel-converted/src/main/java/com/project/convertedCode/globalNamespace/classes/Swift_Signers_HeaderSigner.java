package com.project.convertedCode.globalNamespace.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Swift_InputByteStream;
import com.project.convertedCode.globalNamespace.classes.Swift_Signer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Signers/HeaderSigner.php

*/

public interface Swift_Signers_HeaderSigner extends Swift_Signer, Swift_InputByteStream {

    public static final Object CONST_class = "Swift_Signers_HeaderSigner";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "header_name")
    public Object ignoreHeader(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object startBody(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object endBody(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "headers", typeHint = "Swift_Mime_SimpleHeaderSet")
    public Object setHeaders(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "headers", typeHint = "Swift_Mime_SimpleHeaderSet")
    public Object addSignature(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getAlteredHeaders(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Signers_HeaderSigner")
                    .setLookup(Swift_Signers_HeaderSigner.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Signers/HeaderSigner.php")
                    .addInterface("Swift_Signer")
                    .addInterface("Swift_InputByteStream")
                    .get();
}
