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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/Esmtp/Authenticator.php

*/

public interface Swift_Transport_Esmtp_Authenticator {

    public static final Object CONST_class = "Swift_Transport_Esmtp_Authenticator";

    @ConvertedMethod
    public Object getAuthKeyword(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "agent", typeHint = "Swift_Transport_SmtpAgent")
    @ConvertedParameter(index = 1, name = "username")
    @ConvertedParameter(index = 2, name = "password")
    public Object authenticate(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Transport_Esmtp_Authenticator")
                    .setLookup(Swift_Transport_Esmtp_Authenticator.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/Esmtp/Authenticator.php")
                    .get();
}
