package com.project.convertedCode.globalNamespace.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/SmtpAgent.php

*/

public interface Swift_Transport_SmtpAgent {

    public static final Object CONST_class = "Swift_Transport_SmtpAgent";

    @ConvertedMethod
    public Object getBuffer(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    @ConvertedParameter(index = 1, name = "codes", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "failures",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object executeCommand(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Transport_SmtpAgent")
                    .setLookup(Swift_Transport_SmtpAgent.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/SmtpAgent.php")
                    .get();
}
