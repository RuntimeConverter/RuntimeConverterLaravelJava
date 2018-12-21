package com.project.convertedCode.globalNamespace.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Swift_Signer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Signers/BodySigner.php

*/

public interface Swift_Signers_BodySigner extends Swift_Signer {

    public static final Object CONST_class = "Swift_Signers_BodySigner";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "Swift_Message")
    public Object signMessage(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getAlteredHeaders(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Signers_BodySigner")
                    .setLookup(Swift_Signers_BodySigner.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Signers/BodySigner.php")
                    .addInterface("Swift_Signer")
                    .get();
}
