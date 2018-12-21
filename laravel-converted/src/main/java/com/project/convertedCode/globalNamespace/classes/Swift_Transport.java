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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport.php

*/

public interface Swift_Transport {

    public static final Object CONST_class = "Swift_Transport";

    @ConvertedMethod
    public Object isStarted(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object start(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object stop(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object ping(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "Swift_Mime_SimpleMessage")
    @ConvertedParameter(
        index = 1,
        name = "failedRecipients",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object send(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "plugin", typeHint = "Swift_Events_EventListener")
    public Object registerPlugin(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Transport")
                    .setLookup(Swift_Transport.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport.php")
                    .get();
}
