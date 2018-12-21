package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.namespaces.Transport.classes;

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
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_push;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Mail/Transport/Transport.php

*/

public abstract class Transport extends RuntimeClassBase implements Swift_Transport {

    public Object plugins = ZVal.newArray();

    public Transport(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Transport(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object isStarted(RuntimeEnv env, Object... args) {
        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object start(RuntimeEnv env, Object... args) {
        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object stop(RuntimeEnv env, Object... args) {
        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object ping(RuntimeEnv env, Object... args) {
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "plugin", typeHint = "Swift_Events_EventListener")
    public Object registerPlugin(RuntimeEnv env, Object... args) {
        Object plugin = assignParameter(args, 0, false);
        function_array_push.f.env(env).call(this.plugins, plugin);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "Swift_Mime_SimpleMessage")
    protected Object beforeSendPerformed(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object plugin = null;
        Object event = null;
        event = new Swift_Events_SendEvent(env, this, message);
        for (ZPair zpairResult493 : ZVal.getIterable(this.plugins, env, true)) {
            plugin = ZVal.assign(zpairResult493.getValue());
            if (function_method_exists.f.env(env).call(plugin, "beforeSendPerformed").getBool()) {
                env.callMethod(plugin, "beforeSendPerformed", Transport.class, event);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "Swift_Mime_SimpleMessage")
    protected Object sendPerformed(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object plugin = null;
        Object event = null;
        event = new Swift_Events_SendEvent(env, this, message);
        for (ZPair zpairResult494 : ZVal.getIterable(this.plugins, env, true)) {
            plugin = ZVal.assign(zpairResult494.getValue());
            if (function_method_exists.f.env(env).call(plugin, "sendPerformed").getBool()) {
                env.callMethod(plugin, "sendPerformed", Transport.class, event);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "Swift_Mime_SimpleMessage")
    protected Object numberOfRecipients(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        return ZVal.assign(
                function_count
                        .f
                        .env(env)
                        .call(
                                function_array_merge
                                        .f
                                        .env(env)
                                        .call(
                                                rToArrayCast(
                                                        env.callMethod(
                                                                message, "getTo", Transport.class)),
                                                rToArrayCast(
                                                        env.callMethod(
                                                                message, "getCc", Transport.class)),
                                                rToArrayCast(
                                                        env.callMethod(
                                                                message,
                                                                "getBcc",
                                                                Transport.class)))
                                        .value())
                        .value());
    }

    public static final Object CONST_class = "Illuminate\\Mail\\Transport\\Transport";

    @ConvertedMethod()
    public abstract Object send(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args);

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
                    .setName("Illuminate\\Mail\\Transport\\Transport")
                    .setLookup(
                            Transport.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("plugins")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Mail/Transport/Transport.php")
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
