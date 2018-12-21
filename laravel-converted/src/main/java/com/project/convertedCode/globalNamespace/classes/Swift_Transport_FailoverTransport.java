package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.classes.Swift_TransportException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.classes.Swift_Transport_LoadBalancedTransport;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/FailoverTransport.php

*/

public class Swift_Transport_FailoverTransport extends Swift_Transport_LoadBalancedTransport {

    public Object currentTransport = null;

    public Swift_Transport_FailoverTransport(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Transport_FailoverTransport.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Transport_FailoverTransport(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        super.__construct(env);
        return null;
    }

    @ConvertedMethod
    public Object ping(RuntimeEnv env, Object... args) {
        Object maxTransports = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object transport = null;
        maxTransports =
                function_count
                        .f
                        .env(env)
                        .call(toObjectR(this).accessProp(this, env).name("transports").value())
                        .value();
        for (i.setObject(0);
                ZVal.toBool(ZVal.isLessThan(i.getObject(), '<', maxTransports))
                        && ZVal.toBool(transport = this.getNextTransport(env));
                i.setObject(ZVal.increment(i.getObject()))) {
            if (ZVal.isTrue(
                    env.callMethod(transport, "ping", Swift_Transport_FailoverTransport.class))) {
                return ZVal.assign(true);

            } else {
                this.killCurrentTransport(env);
            }
        }

        return ZVal.assign(
                ZVal.isGreaterThan(
                        function_count
                                .f
                                .env(env)
                                .call(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("transports")
                                                .value())
                                .value(),
                        '>',
                        0));
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
        Object maxTransports = null;
        Object e = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object transport = null;
        Object sent = null;
        maxTransports =
                function_count
                        .f
                        .env(env)
                        .call(toObjectR(this).accessProp(this, env).name("transports").value())
                        .value();
        sent = 0;
        toObjectR(this).accessProp(this, env).name("lastUsedTransport").set(ZVal.getNull());
        for (i.setObject(0);
                ZVal.toBool(ZVal.isLessThan(i.getObject(), '<', maxTransports))
                        && ZVal.toBool(transport = this.getNextTransport(env));
                i.setObject(ZVal.increment(i.getObject()))) {
            try {
                if (!ZVal.isTrue(
                        env.callMethod(
                                transport, "isStarted", Swift_Transport_FailoverTransport.class))) {
                    env.callMethod(transport, "start", Swift_Transport_FailoverTransport.class);
                }

                if (ZVal.isTrue(
                        sent =
                                env.callMethod(
                                        transport,
                                        new RuntimeArgsWithReferences().add(1, failedRecipients),
                                        "send",
                                        Swift_Transport_FailoverTransport.class,
                                        message,
                                        failedRecipients.getObject()))) {
                    toObjectR(this).accessProp(this, env).name("lastUsedTransport").set(transport);
                    return ZVal.assign(sent);
                }

            } catch (ConvertedException convertedException235) {
                if (convertedException235.instanceOf(
                        Swift_TransportException.class, "Swift_TransportException")) {
                    e = convertedException235.getObject();
                    this.killCurrentTransport(env);
                } else {
                    throw convertedException235;
                }
            }
        }

        if (ZVal.equalityCheck(
                0,
                function_count
                        .f
                        .env(env)
                        .call(toObjectR(this).accessProp(this, env).name("transports").value())
                        .value())) {
            throw ZVal.getException(
                    env,
                    new Swift_TransportException(
                            env,
                            "All Transports in FailoverTransport failed, or no Transports available"));
        }

        return ZVal.assign(sent);
    }

    public Object send(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    protected Object getNextTransport(RuntimeEnv env, Object... args) {
        if (!ZVal.isset(this.currentTransport)) {
            this.currentTransport = super.getNextTransport(env);
        }

        return ZVal.assign(this.currentTransport);
    }

    @ConvertedMethod
    protected Object killCurrentTransport(RuntimeEnv env, Object... args) {
        this.currentTransport = ZVal.getNull();
        super.killCurrentTransport(env);
        return null;
    }

    public static final Object CONST_class = "Swift_Transport_FailoverTransport";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends Swift_Transport_LoadBalancedTransport.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Transport_FailoverTransport")
                    .setLookup(
                            Swift_Transport_FailoverTransport.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "currentTransport", "deadTransports", "lastUsedTransport", "transports")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/FailoverTransport.php")
                    .addInterface("Swift_Transport")
                    .addExtendsClass("Swift_Transport_LoadBalancedTransport")
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
