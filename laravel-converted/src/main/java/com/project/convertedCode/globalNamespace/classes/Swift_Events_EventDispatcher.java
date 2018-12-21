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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Events/EventDispatcher.php

*/

public interface Swift_Events_EventDispatcher {

    public static final Object CONST_class = "Swift_Events_EventDispatcher";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "source", typeHint = "Swift_Transport")
    @ConvertedParameter(index = 1, name = "message", typeHint = "Swift_Mime_SimpleMessage")
    public Object createSendEvent(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "source", typeHint = "Swift_Transport")
    @ConvertedParameter(index = 1, name = "command")
    @ConvertedParameter(
        index = 2,
        name = "successCodes",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object createCommandEvent(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "source", typeHint = "Swift_Transport")
    @ConvertedParameter(index = 1, name = "response")
    @ConvertedParameter(index = 2, name = "valid")
    public Object createResponseEvent(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "source", typeHint = "Swift_Transport")
    public Object createTransportChangeEvent(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "source", typeHint = "Swift_Transport")
    @ConvertedParameter(index = 1, name = "ex", typeHint = "Swift_TransportException")
    public Object createTransportExceptionEvent(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "listener", typeHint = "Swift_Events_EventListener")
    public Object bindEventListener(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "evt", typeHint = "Swift_Events_EventObject")
    @ConvertedParameter(index = 1, name = "target")
    public Object dispatchEvent(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Events_EventDispatcher")
                    .setLookup(Swift_Events_EventDispatcher.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Events/EventDispatcher.php")
                    .get();
}
