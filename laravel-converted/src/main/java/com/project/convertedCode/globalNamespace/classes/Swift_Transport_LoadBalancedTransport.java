package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.classes.Swift_TransportException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.project.convertedCode.globalNamespace.classes.Swift_Transport;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/LoadBalancedTransport.php

*/

public class Swift_Transport_LoadBalancedTransport extends RuntimeClassBase
        implements Swift_Transport {

    public Object deadTransports = ZVal.newArray();

    public Object transports = ZVal.newArray();

    public Object lastUsedTransport = ZVal.getNull();

    public Swift_Transport_LoadBalancedTransport(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Transport_LoadBalancedTransport.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Transport_LoadBalancedTransport(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "transports", typeHint = "array")
    public Object setTransports(RuntimeEnv env, Object... args) {
        Object transports = assignParameter(args, 0, false);
        this.transports = transports;
        this.deadTransports = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    public Object getTransports(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_array_merge.f.env(env).call(this.transports, this.deadTransports).value());
    }

    @ConvertedMethod
    public Object getLastUsedTransport(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.lastUsedTransport);
    }

    @ConvertedMethod
    public Object isStarted(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isGreaterThan(
                        function_count.f.env(env).call(this.transports).value(), '>', 0));
    }

    @ConvertedMethod
    public Object start(RuntimeEnv env, Object... args) {
        this.transports =
                function_array_merge.f.env(env).call(this.transports, this.deadTransports).value();
        return null;
    }

    @ConvertedMethod
    public Object stop(RuntimeEnv env, Object... args) {
        Object transport = null;
        for (ZPair zpairResult1615 : ZVal.getIterable(this.transports, env, true)) {
            transport = ZVal.assign(zpairResult1615.getValue());
            env.callMethod(transport, "stop", Swift_Transport_LoadBalancedTransport.class);
        }

        return null;
    }

    @ConvertedMethod
    public Object ping(RuntimeEnv env, Object... args) {
        Object transport = null;
        for (ZPair zpairResult1616 : ZVal.getIterable(this.transports, env, true)) {
            transport = ZVal.assign(zpairResult1616.getValue());
            if (!ZVal.isTrue(
                    env.callMethod(
                            transport, "ping", Swift_Transport_LoadBalancedTransport.class))) {
                this.killCurrentTransport(env);
            }
        }

        return ZVal.assign(
                ZVal.isGreaterThan(
                        function_count.f.env(env).call(this.transports).value(), '>', 0));
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
        int runtimeConverterBreakCount;
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
        maxTransports = function_count.f.env(env).call(this.transports).value();
        sent = 0;
        this.lastUsedTransport = ZVal.getNull();
        runtimeConverterBreakCount = 0;
        for (i.setObject(0);
                ZVal.toBool(ZVal.isLessThan(i.getObject(), '<', maxTransports))
                        && ZVal.toBool(transport = this.getNextTransport(env));
                i.setObject(ZVal.increment(i.getObject()))) {
            try {
                if (!ZVal.isTrue(
                        env.callMethod(
                                transport,
                                "isStarted",
                                Swift_Transport_LoadBalancedTransport.class))) {
                    env.callMethod(transport, "start", Swift_Transport_LoadBalancedTransport.class);
                }

                if (ZVal.isTrue(
                        sent =
                                env.callMethod(
                                        transport,
                                        new RuntimeArgsWithReferences().add(1, failedRecipients),
                                        "send",
                                        Swift_Transport_LoadBalancedTransport.class,
                                        message,
                                        failedRecipients.getObject()))) {
                    this.lastUsedTransport = transport;
                    break;
                }

            } catch (ConvertedException convertedException236) {
                if (convertedException236.instanceOf(
                        Swift_TransportException.class, "Swift_TransportException")) {
                    e = convertedException236.getObject();
                    this.killCurrentTransport(env);
                } else {
                    throw convertedException236;
                }
            }
        }

        if (ZVal.equalityCheck(0, function_count.f.env(env).call(this.transports).value())) {
            throw ZVal.getException(
                    env,
                    new Swift_TransportException(
                            env,
                            "All Transports in LoadBalancedTransport failed, or no Transports available"));
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
        Object transport = null;
        for (ZPair zpairResult1617 : ZVal.getIterable(this.transports, env, true)) {
            transport = ZVal.assign(zpairResult1617.getValue());
            env.callMethod(
                    transport,
                    "registerPlugin",
                    Swift_Transport_LoadBalancedTransport.class,
                    plugin);
        }

        return null;
    }

    @ConvertedMethod
    protected Object getNextTransport(RuntimeEnv env, Object... args) {
        Object next = null;
        if (ZVal.isTrue(next = function_array_shift.f.env(env).call(this.transports).value())) {
            new ReferenceClassProperty(this, "transports", env).arrayAppend(env).set(next);
        }

        return ZVal.assign(next);
    }

    @ConvertedMethod
    protected Object killCurrentTransport(RuntimeEnv env, Object... args) {
        Object e = null;
        Object transport = null;
        if (ZVal.isTrue(transport = function_array_pop.f.env(env).call(this.transports).value())) {
            try {
                env.callMethod(transport, "stop", Swift_Transport_LoadBalancedTransport.class);
            } catch (ConvertedException convertedException237) {
                if (convertedException237.instanceOf(PHPException.class, "Exception")) {
                    e = convertedException237.getObject();
                } else {
                    throw convertedException237;
                }
            }

            new ReferenceClassProperty(this, "deadTransports", env).arrayAppend(env).set(transport);
        }

        return null;
    }

    public static final Object CONST_class = "Swift_Transport_LoadBalancedTransport";

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
                    .setName("Swift_Transport_LoadBalancedTransport")
                    .setLookup(
                            Swift_Transport_LoadBalancedTransport.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("deadTransports", "lastUsedTransport", "transports")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/LoadBalancedTransport.php")
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
