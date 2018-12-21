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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Events/CommandEvent.php

*/

public class Swift_Events_CommandEvent extends Swift_Events_EventObject {

    public Object command = null;

    public Object successCodes = ZVal.newArray();

    public Swift_Events_CommandEvent(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Events_CommandEvent.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Events_CommandEvent(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "source", typeHint = "Swift_Transport")
    @ConvertedParameter(index = 1, name = "command")
    @ConvertedParameter(
        index = 2,
        name = "successCodes",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object source = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        Object successCodes = assignParameter(args, 2, true);
        if (null == successCodes) {
            successCodes = ZVal.newArray();
        }
        super.__construct(env, source);
        this.command = command;
        this.successCodes = successCodes;
        return null;
    }

    @ConvertedMethod
    public Object getCommand(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.command);
    }

    @ConvertedMethod
    public Object getSuccessCodes(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.successCodes);
    }

    public static final Object CONST_class = "Swift_Events_CommandEvent";

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
                    .setName("Swift_Events_CommandEvent")
                    .setLookup(
                            Swift_Events_CommandEvent.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bubbleCancelled", "command", "source", "successCodes")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Events/CommandEvent.php")
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
