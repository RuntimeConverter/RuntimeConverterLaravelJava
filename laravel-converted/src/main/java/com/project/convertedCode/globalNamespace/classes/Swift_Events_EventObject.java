package com.project.convertedCode.globalNamespace.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Swift_Events_Event;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Events/EventObject.php

*/

public class Swift_Events_EventObject extends RuntimeClassBase implements Swift_Events_Event {

    public Object source = null;

    public Object bubbleCancelled = false;

    public Swift_Events_EventObject(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Events_EventObject.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Events_EventObject(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "source")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object source = assignParameter(args, 0, false);
        this.source = source;
        return null;
    }

    @ConvertedMethod
    public Object getSource(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.source);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "cancel",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object cancelBubble(RuntimeEnv env, Object... args) {
        Object cancel = assignParameter(args, 0, true);
        if (null == cancel) {
            cancel = true;
        }
        this.bubbleCancelled = cancel;
        return null;
    }

    @ConvertedMethod
    public Object bubbleCancelled(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.bubbleCancelled);
    }

    public static final Object CONST_class = "Swift_Events_EventObject";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Events_EventObject")
                    .setLookup(
                            Swift_Events_EventObject.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bubbleCancelled", "source")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Events/EventObject.php")
                    .addInterface("Swift_Events_Event")
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
