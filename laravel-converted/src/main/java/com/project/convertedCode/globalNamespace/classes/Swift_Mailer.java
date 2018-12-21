package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.classes.Swift_RfcComplianceException;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Swift_DependencyContainer;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mailer.php

*/

public class Swift_Mailer extends RuntimeClassBase {

    public Object transport = null;

    public Swift_Mailer(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Mailer.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Mailer(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "transport", typeHint = "Swift_Transport")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object transport = assignParameter(args, 0, false);
        this.transport = transport;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "service")
    public Object createMessage(RuntimeEnv env, Object... args) {
        Object service = assignParameter(args, 0, true);
        if (null == service) {
            service = "message";
        }
        return ZVal.assign(
                env.callMethod(
                        Swift_DependencyContainer.runtimeStaticObject.getInstance(env),
                        "lookup",
                        Swift_Mailer.class,
                        "message." + toStringR(service, env)));
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
        Object address = null;
        Object e = null;
        Object name = null;
        Object sent = null;
        failedRecipients.setObject(ZVal.assign(rToArrayCast(failedRecipients.getObject())));
        if (!ZVal.isTrue(env.callMethod(this.transport, "isStarted", Swift_Mailer.class))) {
            env.callMethod(this.transport, "start", Swift_Mailer.class);
        }

        sent = 0;
        try {
            sent =
                    env.callMethod(
                            this.transport,
                            new RuntimeArgsWithReferences().add(1, failedRecipients),
                            "send",
                            Swift_Mailer.class,
                            message,
                            failedRecipients.getObject());
        } catch (ConvertedException convertedException214) {
            if (convertedException214.instanceOf(
                    Swift_RfcComplianceException.class, "Swift_RfcComplianceException")) {
                e = convertedException214.getObject();
                for (ZPair zpairResult1513 :
                        ZVal.getIterable(
                                env.callMethod(message, "getTo", Swift_Mailer.class), env, false)) {
                    address = ZVal.assign(zpairResult1513.getKey());
                    name = ZVal.assign(zpairResult1513.getValue());
                    failedRecipients.arrayAppend(env).set(address);
                }

            } else {
                throw convertedException214;
            }
        }

        return ZVal.assign(sent);
    }

    public Object send(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "plugin", typeHint = "Swift_Events_EventListener")
    public Object registerPlugin(RuntimeEnv env, Object... args) {
        Object plugin = assignParameter(args, 0, false);
        env.callMethod(this.transport, "registerPlugin", Swift_Mailer.class, plugin);
        return null;
    }

    @ConvertedMethod
    public Object getTransport(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.transport);
    }

    public static final Object CONST_class = "Swift_Mailer";

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
                    .setName("Swift_Mailer")
                    .setLookup(
                            Swift_Mailer.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("transport")
                    .setFilename("vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mailer.php")
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
