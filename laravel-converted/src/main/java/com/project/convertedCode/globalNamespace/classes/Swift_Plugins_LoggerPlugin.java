package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.classes.Swift_Plugins_Logger;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Swift_Events_CommandListener;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.classes.Swift_TransportException;
import com.project.convertedCode.globalNamespace.classes.Swift_Events_ResponseListener;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.project.convertedCode.globalNamespace.classes.Swift_Events_TransportChangeListener;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.classes.Swift_Events_TransportExceptionListener;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/LoggerPlugin.php

*/

public class Swift_Plugins_LoggerPlugin extends RuntimeClassBase
        implements Swift_Events_CommandListener,
                Swift_Events_ResponseListener,
                Swift_Events_TransportChangeListener,
                Swift_Events_TransportExceptionListener,
                Swift_Plugins_Logger {

    public Object logger = null;

    public Swift_Plugins_LoggerPlugin(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Plugins_LoggerPlugin.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Plugins_LoggerPlugin(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "logger", typeHint = "Swift_Plugins_Logger")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object logger = assignParameter(args, 0, false);
        this.logger = logger;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "entry")
    public Object add(RuntimeEnv env, Object... args) {
        ReferenceContainer entry = new BasicReferenceContainer(assignParameter(args, 0, false));
        env.callMethod(
                this.logger,
                new RuntimeArgsWithReferences().add(0, entry),
                "add",
                Swift_Plugins_LoggerPlugin.class,
                entry.getObject());
        return null;
    }

    @ConvertedMethod
    public Object clear(RuntimeEnv env, Object... args) {
        env.callMethod(this.logger, "clear", Swift_Plugins_LoggerPlugin.class);
        return null;
    }

    @ConvertedMethod
    public Object dump(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.logger, "dump", Swift_Plugins_LoggerPlugin.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "evt", typeHint = "Swift_Events_CommandEvent")
    public Object commandSent(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object evt = assignParameter(args, 0, false);
        Object command = null;
        command = env.callMethod(evt, "getCommand", Swift_Plugins_LoggerPlugin.class);
        env.callMethod(
                this.logger,
                rLastRefArgs =
                        new RuntimeArgsWithReferences()
                                .add(
                                        0,
                                        handleReturnReference(
                                                function_sprintf
                                                        .f
                                                        .env(env)
                                                        .call(">> %s", command)
                                                        .value())),
                "add",
                Swift_Plugins_LoggerPlugin.class,
                rLastRefArgs.get(0));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "evt", typeHint = "Swift_Events_ResponseEvent")
    public Object responseReceived(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object evt = assignParameter(args, 0, false);
        Object response = null;
        response = env.callMethod(evt, "getResponse", Swift_Plugins_LoggerPlugin.class);
        env.callMethod(
                this.logger,
                rLastRefArgs =
                        new RuntimeArgsWithReferences()
                                .add(
                                        0,
                                        handleReturnReference(
                                                function_sprintf
                                                        .f
                                                        .env(env)
                                                        .call("<< %s", response)
                                                        .value())),
                "add",
                Swift_Plugins_LoggerPlugin.class,
                rLastRefArgs.get(0));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "evt", typeHint = "Swift_Events_TransportChangeEvent")
    public Object beforeTransportStarted(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object evt = assignParameter(args, 0, false);
        Object transportName = null;
        transportName =
                function_get_class
                        .f
                        .env(env)
                        .call(env.callMethod(evt, "getSource", Swift_Plugins_LoggerPlugin.class))
                        .value();
        env.callMethod(
                this.logger,
                rLastRefArgs =
                        new RuntimeArgsWithReferences()
                                .add(
                                        0,
                                        handleReturnReference(
                                                function_sprintf
                                                        .f
                                                        .env(env)
                                                        .call("++ Starting %s", transportName)
                                                        .value())),
                "add",
                Swift_Plugins_LoggerPlugin.class,
                rLastRefArgs.get(0));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "evt", typeHint = "Swift_Events_TransportChangeEvent")
    public Object transportStarted(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object evt = assignParameter(args, 0, false);
        Object transportName = null;
        transportName =
                function_get_class
                        .f
                        .env(env)
                        .call(env.callMethod(evt, "getSource", Swift_Plugins_LoggerPlugin.class))
                        .value();
        env.callMethod(
                this.logger,
                rLastRefArgs =
                        new RuntimeArgsWithReferences()
                                .add(
                                        0,
                                        handleReturnReference(
                                                function_sprintf
                                                        .f
                                                        .env(env)
                                                        .call("++ %s started", transportName)
                                                        .value())),
                "add",
                Swift_Plugins_LoggerPlugin.class,
                rLastRefArgs.get(0));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "evt", typeHint = "Swift_Events_TransportChangeEvent")
    public Object beforeTransportStopped(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object evt = assignParameter(args, 0, false);
        Object transportName = null;
        transportName =
                function_get_class
                        .f
                        .env(env)
                        .call(env.callMethod(evt, "getSource", Swift_Plugins_LoggerPlugin.class))
                        .value();
        env.callMethod(
                this.logger,
                rLastRefArgs =
                        new RuntimeArgsWithReferences()
                                .add(
                                        0,
                                        handleReturnReference(
                                                function_sprintf
                                                        .f
                                                        .env(env)
                                                        .call("++ Stopping %s", transportName)
                                                        .value())),
                "add",
                Swift_Plugins_LoggerPlugin.class,
                rLastRefArgs.get(0));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "evt", typeHint = "Swift_Events_TransportChangeEvent")
    public Object transportStopped(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object evt = assignParameter(args, 0, false);
        Object transportName = null;
        transportName =
                function_get_class
                        .f
                        .env(env)
                        .call(env.callMethod(evt, "getSource", Swift_Plugins_LoggerPlugin.class))
                        .value();
        env.callMethod(
                this.logger,
                rLastRefArgs =
                        new RuntimeArgsWithReferences()
                                .add(
                                        0,
                                        handleReturnReference(
                                                function_sprintf
                                                        .f
                                                        .env(env)
                                                        .call("++ %s stopped", transportName)
                                                        .value())),
                "add",
                Swift_Plugins_LoggerPlugin.class,
                rLastRefArgs.get(0));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "evt", typeHint = "Swift_Events_TransportExceptionEvent")
    public Object exceptionThrown(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object evt = assignParameter(args, 0, false);
        Object code = null;
        Object e = null;
        Object message = null;
        e = env.callMethod(evt, "getException", Swift_Plugins_LoggerPlugin.class);
        message = env.callMethod(e, "getMessage", Swift_Plugins_LoggerPlugin.class);
        code = env.callMethod(e, "getCode", Swift_Plugins_LoggerPlugin.class);
        env.callMethod(
                this.logger,
                rLastRefArgs =
                        new RuntimeArgsWithReferences()
                                .add(
                                        0,
                                        handleReturnReference(
                                                function_sprintf
                                                        .f
                                                        .env(env)
                                                        .call("!! %s (code: %s)", message, code)
                                                        .value())),
                "add",
                Swift_Plugins_LoggerPlugin.class,
                rLastRefArgs.get(0));
        message = toStringR(message, env) + toStringR("\n", env);
        message = toStringR(message, env) + "Log data:" + toStringR("\n", env);
        message =
                toStringR(message, env)
                        + toStringR(
                                env.callMethod(
                                        this.logger, "dump", Swift_Plugins_LoggerPlugin.class),
                                env);
        env.callMethod(evt, "cancelBubble", Swift_Plugins_LoggerPlugin.class);
        throw ZVal.getException(
                env,
                new Swift_TransportException(
                        env,
                        message,
                        code,
                        env.callMethod(e, "getPrevious", Swift_Plugins_LoggerPlugin.class)));
    }

    public static final Object CONST_class = "Swift_Plugins_LoggerPlugin";

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
                    .setName("Swift_Plugins_LoggerPlugin")
                    .setLookup(
                            Swift_Plugins_LoggerPlugin.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("logger")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/LoggerPlugin.php")
                    .addInterface("Swift_Events_CommandListener")
                    .addInterface("Swift_Events_EventListener")
                    .addInterface("Swift_Events_ResponseListener")
                    .addInterface("Swift_Events_TransportChangeListener")
                    .addInterface("Swift_Events_TransportExceptionListener")
                    .addInterface("Swift_Plugins_Logger")
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
