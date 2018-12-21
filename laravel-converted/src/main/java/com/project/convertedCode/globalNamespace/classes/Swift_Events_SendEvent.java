package com.project.convertedCode.globalNamespace.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Swift_Events_EventObject;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Events/SendEvent.php

*/

public class Swift_Events_SendEvent extends Swift_Events_EventObject {

    public Object message = null;

    public Object failedRecipients = ZVal.newArray();

    public Object result = null;

    public Swift_Events_SendEvent(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Events_SendEvent.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Events_SendEvent(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "source", typeHint = "Swift_Transport")
    @ConvertedParameter(index = 1, name = "message", typeHint = "Swift_Mime_SimpleMessage")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object source = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, false);
        super.__construct(env, source);
        this.message = message;
        this.result = CONST_RESULT_PENDING;
        return null;
    }

    @ConvertedMethod
    public Object getTransport(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "getSource", Swift_Events_SendEvent.class));
    }

    @ConvertedMethod
    public Object getMessage(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.message);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "recipients")
    public Object setFailedRecipients(RuntimeEnv env, Object... args) {
        Object recipients = assignParameter(args, 0, false);
        this.failedRecipients = recipients;
        return null;
    }

    @ConvertedMethod
    public Object getFailedRecipients(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.failedRecipients);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result")
    public Object setResult(RuntimeEnv env, Object... args) {
        Object result = assignParameter(args, 0, false);
        this.result = result;
        return null;
    }

    @ConvertedMethod
    public Object getResult(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.result);
    }

    public static final Object CONST_RESULT_PENDING = 1;

    public static final Object CONST_RESULT_SPOOLED = 17;

    public static final Object CONST_RESULT_SUCCESS = 16;

    public static final Object CONST_RESULT_TENTATIVE = 256;

    public static final Object CONST_RESULT_FAILED = 4096;

    public static final Object CONST_class = "Swift_Events_SendEvent";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends Swift_Events_EventObject.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Events_SendEvent")
                    .setLookup(
                            Swift_Events_SendEvent.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bubbleCancelled", "failedRecipients", "message", "result", "source")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Events/SendEvent.php")
                    .addInterface("Swift_Events_Event")
                    .addExtendsClass("Swift_Events_EventObject")
                    .get();

    @Override
    public ReflectionClassData getRuntimeConverterReflectionData() {
        return runtimeConverterReflectionData;
    }

    @Override
    public Object converterRuntimeCallExtended(
            RuntimeEnv env,
            String method,
            Class<?> caller,
            PassByReferenceArgs passByReferenceArgs,
            Object... args) {
        return RuntimeClassBase.converterRuntimeCallExtendedWithDataStatic(
                this,
                runtimeConverterReflectionData,
                env,
                method,
                caller,
                passByReferenceArgs,
                args);
    }
}
