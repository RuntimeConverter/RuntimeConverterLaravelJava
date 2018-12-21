package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.classes.Swift_Transport;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.classes.Swift_Events_SendEvent;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/NullTransport.php

*/

public class Swift_Transport_NullTransport extends RuntimeClassBase implements Swift_Transport {

    public Object eventDispatcher = null;

    public Swift_Transport_NullTransport(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Transport_NullTransport.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Transport_NullTransport(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "eventDispatcher",
        typeHint = "Swift_Events_EventDispatcher"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object eventDispatcher = assignParameter(args, 0, false);
        this.eventDispatcher = eventDispatcher;
        return null;
    }

    @ConvertedMethod
    public Object isStarted(RuntimeEnv env, Object... args) {
        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object start(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    public Object stop(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    public Object ping(RuntimeEnv env, Object... args) {
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "Swift_Mime_SimpleMessage")
    @ConvertedParameter(
        index = 1,
        name = "failedRecipients",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object send(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        Object message = assignParameter(args, 0, false);
        ReferenceContainer failedRecipients =
                assignParameterRef(runtimePassByReferenceArgs, args, 1, true);
        if (null == failedRecipients.getObject()) {
            failedRecipients.setObject(ZVal.getNull());
        }
        Object evt = null;
        Object count = null;
        if (ZVal.isTrue(
                evt =
                        env.callMethod(
                                this.eventDispatcher,
                                "createSendEvent",
                                Swift_Transport_NullTransport.class,
                                this,
                                message))) {
            env.callMethod(
                    this.eventDispatcher,
                    "dispatchEvent",
                    Swift_Transport_NullTransport.class,
                    evt,
                    "beforeSendPerformed");
            if (ZVal.isTrue(
                    env.callMethod(evt, "bubbleCancelled", Swift_Transport_NullTransport.class))) {
                return 0;
            }
        }

        if (ZVal.isTrue(evt)) {
            env.callMethod(
                    evt,
                    "setResult",
                    Swift_Transport_NullTransport.class,
                    Swift_Events_SendEvent.CONST_RESULT_SUCCESS);
            env.callMethod(
                    this.eventDispatcher,
                    "dispatchEvent",
                    Swift_Transport_NullTransport.class,
                    evt,
                    "sendPerformed");
        }

        count =
                ZVal.add(
                        ZVal.add(
                                function_count
                                        .f
                                        .env(env)
                                        .call(
                                                rToArrayCast(
                                                        env.callMethod(
                                                                message,
                                                                "getTo",
                                                                Swift_Transport_NullTransport
                                                                        .class)))
                                        .value(),
                                function_count
                                        .f
                                        .env(env)
                                        .call(
                                                rToArrayCast(
                                                        env.callMethod(
                                                                message,
                                                                "getCc",
                                                                Swift_Transport_NullTransport
                                                                        .class)))
                                        .value()),
                        function_count
                                .f
                                .env(env)
                                .call(
                                        rToArrayCast(
                                                env.callMethod(
                                                        message,
                                                        "getBcc",
                                                        Swift_Transport_NullTransport.class)))
                                .value());
        return ZVal.assign(count);
    }

    public Object send(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "plugin", typeHint = "Swift_Events_EventListener")
    public Object registerPlugin(RuntimeEnv env, Object... args) {
        Object plugin = assignParameter(args, 0, false);
        env.callMethod(
                this.eventDispatcher,
                "bindEventListener",
                Swift_Transport_NullTransport.class,
                plugin);
        return null;
    }

    public static final Object CONST_class = "Swift_Transport_NullTransport";

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
                    .setName("Swift_Transport_NullTransport")
                    .setLookup(
                            Swift_Transport_NullTransport.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("eventDispatcher")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/NullTransport.php")
                    .addInterface("Swift_Transport")
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
