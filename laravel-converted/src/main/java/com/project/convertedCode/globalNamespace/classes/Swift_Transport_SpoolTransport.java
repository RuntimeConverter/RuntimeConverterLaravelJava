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
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/SpoolTransport.php

*/

public class Swift_Transport_SpoolTransport extends RuntimeClassBase implements Swift_Transport {

    public Object spool = null;

    public Object eventDispatcher = null;

    public Swift_Transport_SpoolTransport(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Transport_SpoolTransport.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Transport_SpoolTransport(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "eventDispatcher",
        typeHint = "Swift_Events_EventDispatcher"
    )
    @ConvertedParameter(
        index = 1,
        name = "spool",
        typeHint = "Swift_Spool",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object eventDispatcher = assignParameter(args, 0, false);
        Object spool = assignParameter(args, 1, true);
        if (null == spool) {
            spool = ZVal.getNull();
        }
        this.eventDispatcher = eventDispatcher;
        this.spool = spool;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "spool", typeHint = "Swift_Spool")
    public Object setSpool(RuntimeEnv env, Object... args) {
        Object spool = assignParameter(args, 0, false);
        this.spool = spool;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getSpool(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.spool);
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
        Object success = null;
        if (ZVal.isTrue(
                evt =
                        env.callMethod(
                                this.eventDispatcher,
                                "createSendEvent",
                                Swift_Transport_SpoolTransport.class,
                                this,
                                message))) {
            env.callMethod(
                    this.eventDispatcher,
                    "dispatchEvent",
                    Swift_Transport_SpoolTransport.class,
                    evt,
                    "beforeSendPerformed");
            if (ZVal.isTrue(
                    env.callMethod(evt, "bubbleCancelled", Swift_Transport_SpoolTransport.class))) {
                return 0;
            }
        }

        success =
                env.callMethod(
                        this.spool, "queueMessage", Swift_Transport_SpoolTransport.class, message);
        if (ZVal.isTrue(evt)) {
            env.callMethod(
                    evt,
                    "setResult",
                    Swift_Transport_SpoolTransport.class,
                    ZVal.isTrue(success)
                            ? Swift_Events_SendEvent.CONST_RESULT_SPOOLED
                            : Swift_Events_SendEvent.CONST_RESULT_FAILED);
            env.callMethod(
                    this.eventDispatcher,
                    "dispatchEvent",
                    Swift_Transport_SpoolTransport.class,
                    evt,
                    "sendPerformed");
        }

        return 1;
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
                Swift_Transport_SpoolTransport.class,
                plugin);
        return null;
    }

    public static final Object CONST_class = "Swift_Transport_SpoolTransport";

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
                    .setName("Swift_Transport_SpoolTransport")
                    .setLookup(
                            Swift_Transport_SpoolTransport.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("eventDispatcher", "spool")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/SpoolTransport.php")
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
