package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Swift_Events_CommandListener;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.classes.Swift_Events_ResponseListener;
import com.project.convertedCode.globalNamespace.classes.Swift_Events_SendListener;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.classes.Swift_InputByteStream;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/BandwidthMonitorPlugin.php

*/

public class Swift_Plugins_BandwidthMonitorPlugin extends RuntimeClassBase
        implements Swift_Events_SendListener,
                Swift_Events_CommandListener,
                Swift_Events_ResponseListener,
                Swift_InputByteStream {

    public Object out = 0;

    public Object in = 0;

    public Object mirrors = ZVal.newArray();

    public Swift_Plugins_BandwidthMonitorPlugin(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Swift_Plugins_BandwidthMonitorPlugin(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "evt", typeHint = "Swift_Events_SendEvent")
    public Object beforeSendPerformed(RuntimeEnv env, Object... args) {
        Object evt = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "evt", typeHint = "Swift_Events_SendEvent")
    public Object sendPerformed(RuntimeEnv env, Object... args) {
        Object evt = assignParameter(args, 0, false);
        Object message = null;
        message = env.callMethod(evt, "getMessage", Swift_Plugins_BandwidthMonitorPlugin.class);
        env.callMethod(message, "toByteStream", Swift_Plugins_BandwidthMonitorPlugin.class, this);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "evt", typeHint = "Swift_Events_CommandEvent")
    public Object commandSent(RuntimeEnv env, Object... args) {
        Object evt = assignParameter(args, 0, false);
        Object command = null;
        command = env.callMethod(evt, "getCommand", Swift_Plugins_BandwidthMonitorPlugin.class);
        this.out =
                ZAssignment.add("+=", this.out, function_strlen.f.env(env).call(command).value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "evt", typeHint = "Swift_Events_ResponseEvent")
    public Object responseReceived(RuntimeEnv env, Object... args) {
        Object evt = assignParameter(args, 0, false);
        Object response = null;
        response = env.callMethod(evt, "getResponse", Swift_Plugins_BandwidthMonitorPlugin.class);
        this.in = ZAssignment.add("+=", this.in, function_strlen.f.env(env).call(response).value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bytes")
    public Object write(RuntimeEnv env, Object... args) {
        Object bytes = assignParameter(args, 0, false);
        Object stream = null;
        this.out = ZAssignment.add("+=", this.out, function_strlen.f.env(env).call(bytes).value());
        for (ZPair zpairResult1563 : ZVal.getIterable(this.mirrors, env, true)) {
            stream = ZVal.assign(zpairResult1563.getValue());
            env.callMethod(stream, "write", Swift_Plugins_BandwidthMonitorPlugin.class, bytes);
        }

        return null;
    }

    @ConvertedMethod
    public Object commit(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "is", typeHint = "Swift_InputByteStream")
    public Object bind(RuntimeEnv env, Object... args) {
        Object is = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "mirrors", env).arrayAppend(env).set(is);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "is", typeHint = "Swift_InputByteStream")
    public Object unbind(RuntimeEnv env, Object... args) {
        Object is = assignParameter(args, 0, false);
        Object stream = null;
        Object k = null;
        for (ZPair zpairResult1564 : ZVal.getIterable(this.mirrors, env, false)) {
            k = ZVal.assign(zpairResult1564.getKey());
            stream = ZVal.assign(zpairResult1564.getValue());
            if (ZVal.strictEqualityCheck(is, "===", stream)) {
                arrayActionR(
                        ArrayAction.UNSET,
                        new ReferenceClassProperty(this, "mirrors", env),
                        env,
                        k);
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object flushBuffers(RuntimeEnv env, Object... args) {
        Object stream = null;
        for (ZPair zpairResult1565 : ZVal.getIterable(this.mirrors, env, true)) {
            stream = ZVal.assign(zpairResult1565.getValue());
            env.callMethod(stream, "flushBuffers", Swift_Plugins_BandwidthMonitorPlugin.class);
        }

        return null;
    }

    @ConvertedMethod
    public Object getBytesOut(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.out);
    }

    @ConvertedMethod
    public Object getBytesIn(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.in);
    }

    @ConvertedMethod
    public Object reset(RuntimeEnv env, Object... args) {
        this.out = 0;
        this.in = 0;
        return null;
    }

    public static final Object CONST_class = "Swift_Plugins_BandwidthMonitorPlugin";

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
                    .setName("Swift_Plugins_BandwidthMonitorPlugin")
                    .setLookup(
                            Swift_Plugins_BandwidthMonitorPlugin.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("in", "mirrors", "out")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/BandwidthMonitorPlugin.php")
                    .addInterface("Swift_Events_SendListener")
                    .addInterface("Swift_Events_EventListener")
                    .addInterface("Swift_Events_CommandListener")
                    .addInterface("Swift_Events_ResponseListener")
                    .addInterface("Swift_InputByteStream")
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
