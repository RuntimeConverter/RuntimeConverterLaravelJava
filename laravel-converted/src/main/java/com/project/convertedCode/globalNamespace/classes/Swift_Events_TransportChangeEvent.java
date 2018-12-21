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
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Events/TransportChangeEvent.php

*/

public class Swift_Events_TransportChangeEvent extends Swift_Events_EventObject {

    public Swift_Events_TransportChangeEvent(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Events_TransportChangeEvent.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Events_TransportChangeEvent(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getTransport(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this, "getSource", Swift_Events_TransportChangeEvent.class));
    }

    public static final Object CONST_class = "Swift_Events_TransportChangeEvent";

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
                    .setName("Swift_Events_TransportChangeEvent")
                    .setLookup(
                            Swift_Events_TransportChangeEvent.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bubbleCancelled", "source")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Events/TransportChangeEvent.php")
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
