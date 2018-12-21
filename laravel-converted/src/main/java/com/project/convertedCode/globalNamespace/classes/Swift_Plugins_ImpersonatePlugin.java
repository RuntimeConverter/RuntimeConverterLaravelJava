package com.project.convertedCode.globalNamespace.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.classes.Swift_Events_SendListener;
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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/ImpersonatePlugin.php

*/

public class Swift_Plugins_ImpersonatePlugin extends RuntimeClassBase
        implements Swift_Events_SendListener {

    public Object sender = null;

    public Swift_Plugins_ImpersonatePlugin(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Plugins_ImpersonatePlugin.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Plugins_ImpersonatePlugin(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sender")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object sender = assignParameter(args, 0, false);
        this.sender = sender;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "evt", typeHint = "Swift_Events_SendEvent")
    public Object beforeSendPerformed(RuntimeEnv env, Object... args) {
        Object evt = assignParameter(args, 0, false);
        Object headers = null;
        Object message = null;
        message = env.callMethod(evt, "getMessage", Swift_Plugins_ImpersonatePlugin.class);
        headers = env.callMethod(message, "getHeaders", Swift_Plugins_ImpersonatePlugin.class);
        env.callMethod(
                headers,
                "addPathHeader",
                Swift_Plugins_ImpersonatePlugin.class,
                "X-Swift-Return-Path",
                env.callMethod(message, "getReturnPath", Swift_Plugins_ImpersonatePlugin.class));
        env.callMethod(
                message, "setReturnPath", Swift_Plugins_ImpersonatePlugin.class, this.sender);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "evt", typeHint = "Swift_Events_SendEvent")
    public Object sendPerformed(RuntimeEnv env, Object... args) {
        Object evt = assignParameter(args, 0, false);
        Object headers = null;
        Object message = null;
        message = env.callMethod(evt, "getMessage", Swift_Plugins_ImpersonatePlugin.class);
        headers = env.callMethod(message, "getHeaders", Swift_Plugins_ImpersonatePlugin.class);
        if (ZVal.isTrue(
                env.callMethod(
                        headers,
                        "has",
                        Swift_Plugins_ImpersonatePlugin.class,
                        "X-Swift-Return-Path"))) {
            env.callMethod(
                    message,
                    "setReturnPath",
                    Swift_Plugins_ImpersonatePlugin.class,
                    env.callMethod(
                            env.callMethod(
                                    headers,
                                    "get",
                                    Swift_Plugins_ImpersonatePlugin.class,
                                    "X-Swift-Return-Path"),
                            "getAddress",
                            Swift_Plugins_ImpersonatePlugin.class));
            env.callMethod(
                    headers,
                    "removeAll",
                    Swift_Plugins_ImpersonatePlugin.class,
                    "X-Swift-Return-Path");
        }

        return null;
    }

    public static final Object CONST_class = "Swift_Plugins_ImpersonatePlugin";

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
                    .setName("Swift_Plugins_ImpersonatePlugin")
                    .setLookup(
                            Swift_Plugins_ImpersonatePlugin.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("sender")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/ImpersonatePlugin.php")
                    .addInterface("Swift_Events_SendListener")
                    .addInterface("Swift_Events_EventListener")
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
