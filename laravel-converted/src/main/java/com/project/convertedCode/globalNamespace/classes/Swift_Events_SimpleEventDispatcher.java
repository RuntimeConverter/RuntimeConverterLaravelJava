package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.project.convertedCode.globalNamespace.classes.Swift_Events_TransportChangeEvent;
import com.project.convertedCode.globalNamespace.classes.Swift_Events_ResponseEvent;
import com.project.convertedCode.globalNamespace.classes.Swift_Events_CommandEvent;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.classes.Swift_Events_EventDispatcher;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.classes.Swift_Events_SendEvent;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.classes.Swift_Events_TransportExceptionEvent;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Events/SimpleEventDispatcher.php

*/

public class Swift_Events_SimpleEventDispatcher extends RuntimeClassBase
        implements Swift_Events_EventDispatcher {

    public Object eventMap = ZVal.newArray();

    public Object listeners = ZVal.newArray();

    public Object bubbleQueue = ZVal.newArray();

    public Swift_Events_SimpleEventDispatcher(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Events_SimpleEventDispatcher.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Events_SimpleEventDispatcher(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        this.eventMap =
                ZVal.newArray(
                        new ZPair("Swift_Events_CommandEvent", "Swift_Events_CommandListener"),
                        new ZPair("Swift_Events_ResponseEvent", "Swift_Events_ResponseListener"),
                        new ZPair("Swift_Events_SendEvent", "Swift_Events_SendListener"),
                        new ZPair(
                                "Swift_Events_TransportChangeEvent",
                                "Swift_Events_TransportChangeListener"),
                        new ZPair(
                                "Swift_Events_TransportExceptionEvent",
                                "Swift_Events_TransportExceptionListener"));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "source", typeHint = "Swift_Transport")
    @ConvertedParameter(index = 1, name = "message", typeHint = "Swift_Mime_SimpleMessage")
    public Object createSendEvent(RuntimeEnv env, Object... args) {
        Object source = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, false);
        return ZVal.assign(new Swift_Events_SendEvent(env, source, message));
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
    public Object createCommandEvent(RuntimeEnv env, Object... args) {
        Object source = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        Object successCodes = assignParameter(args, 2, true);
        if (null == successCodes) {
            successCodes = ZVal.newArray();
        }
        return ZVal.assign(new Swift_Events_CommandEvent(env, source, command, successCodes));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "source", typeHint = "Swift_Transport")
    @ConvertedParameter(index = 1, name = "response")
    @ConvertedParameter(index = 2, name = "valid")
    public Object createResponseEvent(RuntimeEnv env, Object... args) {
        Object source = assignParameter(args, 0, false);
        Object response = assignParameter(args, 1, false);
        Object valid = assignParameter(args, 2, false);
        return ZVal.assign(new Swift_Events_ResponseEvent(env, source, response, valid));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "source", typeHint = "Swift_Transport")
    public Object createTransportChangeEvent(RuntimeEnv env, Object... args) {
        Object source = assignParameter(args, 0, false);
        return ZVal.assign(new Swift_Events_TransportChangeEvent(env, source));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "source", typeHint = "Swift_Transport")
    @ConvertedParameter(index = 1, name = "ex", typeHint = "Swift_TransportException")
    public Object createTransportExceptionEvent(RuntimeEnv env, Object... args) {
        Object source = assignParameter(args, 0, false);
        Object ex = assignParameter(args, 1, false);
        return ZVal.assign(new Swift_Events_TransportExceptionEvent(env, source, ex));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "listener", typeHint = "Swift_Events_EventListener")
    public Object bindEventListener(RuntimeEnv env, Object... args) {
        Object listener = assignParameter(args, 0, false);
        Object l = null;
        for (ZPair zpairResult1506 : ZVal.getIterable(this.listeners, env, true)) {
            l = ZVal.assign(zpairResult1506.getValue());
            if (ZVal.strictEqualityCheck(l, "===", listener)) {
                return null;
            }
        }

        new ReferenceClassProperty(this, "listeners", env).arrayAppend(env).set(listener);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "evt", typeHint = "Swift_Events_EventObject")
    @ConvertedParameter(index = 1, name = "target")
    public Object dispatchEvent(RuntimeEnv env, Object... args) {
        Object evt = assignParameter(args, 0, false);
        Object target = assignParameter(args, 1, false);
        this.prepareBubbleQueue(env, evt);
        this.bubble(env, evt, target);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "evt", typeHint = "Swift_Events_EventObject")
    private Object prepareBubbleQueue(RuntimeEnv env, Object... args) {
        Object evt = assignParameter(args, 0, false);
        Object listener = null;
        Object evtClass = null;
        this.bubbleQueue = ZVal.newArray();
        evtClass = function_get_class.f.env(env).call(evt).value();
        for (ZPair zpairResult1507 : ZVal.getIterable(this.listeners, env, true)) {
            listener = ZVal.assign(zpairResult1507.getValue());
            if (ZVal.toBool(
                            function_array_key_exists
                                    .f
                                    .env(env)
                                    .call(evtClass, this.eventMap)
                                    .value())
                    && ZVal.toBool(
                            ZVal.checkInstanceTypeMatch(
                                    listener,
                                    new ReferenceClassProperty(this, "eventMap", env)
                                            .arrayGet(env, evtClass)))) {
                new ReferenceClassProperty(this, "bubbleQueue", env).arrayAppend(env).set(listener);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "evt", typeHint = "Swift_Events_EventObject")
    @ConvertedParameter(index = 1, name = "target")
    private Object bubble(RuntimeEnv env, Object... args) {
        ReferenceContainer evt = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object target = assignParameter(args, 1, false);
        Object listener = null;
        if (ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        evt.getObject(),
                                        "bubbleCancelled",
                                        Swift_Events_SimpleEventDispatcher.class)))
                && ZVal.toBool(
                        listener =
                                function_array_shift.f.env(env).call(this.bubbleQueue).value())) {
            env.callMethod(
                    listener,
                    new RuntimeArgsWithReferences().add(0, evt),
                    toStringR(target, env),
                    Swift_Events_SimpleEventDispatcher.class,
                    evt.getObject());
            this.bubble(env, evt.getObject(), target);
        }

        return null;
    }

    public static final Object CONST_class = "Swift_Events_SimpleEventDispatcher";

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
                    .setName("Swift_Events_SimpleEventDispatcher")
                    .setLookup(
                            Swift_Events_SimpleEventDispatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bubbleQueue", "eventMap", "listeners")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Events/SimpleEventDispatcher.php")
                    .addInterface("Swift_Events_EventDispatcher")
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
