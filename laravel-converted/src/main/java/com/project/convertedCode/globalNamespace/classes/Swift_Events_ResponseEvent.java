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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Events/ResponseEvent.php

*/

public class Swift_Events_ResponseEvent extends Swift_Events_EventObject {

    public Object valid = null;

    public Object response = null;

    public Swift_Events_ResponseEvent(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Events_ResponseEvent.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Events_ResponseEvent(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "source", typeHint = "Swift_Transport")
    @ConvertedParameter(index = 1, name = "response")
    @ConvertedParameter(
        index = 2,
        name = "valid",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object source = assignParameter(args, 0, false);
        Object response = assignParameter(args, 1, false);
        Object valid = assignParameter(args, 2, true);
        if (null == valid) {
            valid = false;
        }
        super.__construct(env, source);
        this.response = response;
        this.valid = valid;
        return null;
    }

    @ConvertedMethod
    public Object getResponse(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.response);
    }

    @ConvertedMethod
    public Object isValid(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.valid);
    }

    public static final Object CONST_class = "Swift_Events_ResponseEvent";

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
                    .setName("Swift_Events_ResponseEvent")
                    .setLookup(
                            Swift_Events_ResponseEvent.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bubbleCancelled", "response", "source", "valid")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Events/ResponseEvent.php")
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
