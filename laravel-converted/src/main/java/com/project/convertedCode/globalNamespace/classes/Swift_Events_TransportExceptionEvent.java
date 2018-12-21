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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Events/TransportExceptionEvent.php

*/

public class Swift_Events_TransportExceptionEvent extends Swift_Events_EventObject {

    public Object exception = null;

    public Swift_Events_TransportExceptionEvent(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Events_TransportExceptionEvent.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Events_TransportExceptionEvent(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "transport", typeHint = "Swift_Transport")
    @ConvertedParameter(index = 1, name = "ex", typeHint = "Swift_TransportException")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object transport = assignParameter(args, 0, false);
        Object ex = assignParameter(args, 1, false);
        super.__construct(env, transport);
        this.exception = ex;
        return null;
    }

    @ConvertedMethod
    public Object getException(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.exception);
    }

    public static final Object CONST_class = "Swift_Events_TransportExceptionEvent";

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
                    .setName("Swift_Events_TransportExceptionEvent")
                    .setLookup(
                            Swift_Events_TransportExceptionEvent.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bubbleCancelled", "exception", "source")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Events/TransportExceptionEvent.php")
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
