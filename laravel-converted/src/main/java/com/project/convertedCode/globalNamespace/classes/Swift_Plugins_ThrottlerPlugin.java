package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Swift_Plugins_Timer;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.classes.Swift_Plugins_BandwidthMonitorPlugin;
import com.project.convertedCode.globalNamespace.classes.Swift_Plugins_Sleeper;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/ThrottlerPlugin.php

*/

public class Swift_Plugins_ThrottlerPlugin extends Swift_Plugins_BandwidthMonitorPlugin
        implements Swift_Plugins_Sleeper, Swift_Plugins_Timer {

    public Object sleeper = null;

    public Object timer = null;

    public Object start = null;

    public Object rate = null;

    public Object mode = null;

    public Object messages = 0;

    public Swift_Plugins_ThrottlerPlugin(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Plugins_ThrottlerPlugin.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Plugins_ThrottlerPlugin(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rate")
    @ConvertedParameter(index = 1, name = "mode")
    @ConvertedParameter(
        index = 2,
        name = "sleeper",
        typeHint = "Swift_Plugins_Sleeper",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "timer",
        typeHint = "Swift_Plugins_Timer",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object rate = assignParameter(args, 0, false);
        Object mode = assignParameter(args, 1, true);
        if (null == mode) {
            mode = CONST_BYTES_PER_MINUTE;
        }
        Object sleeper = assignParameter(args, 2, true);
        if (null == sleeper) {
            sleeper = ZVal.getNull();
        }
        Object timer = assignParameter(args, 3, true);
        if (null == timer) {
            timer = ZVal.getNull();
        }
        this.rate = rate;
        this.mode = mode;
        this.sleeper = sleeper;
        this.timer = timer;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "evt", typeHint = "Swift_Events_SendEvent")
    public Object beforeSendPerformed(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object evt = assignParameter(args, 0, false);
        Object duration = null;
        Object sleep = null;
        Object time = null;
        time = this.getTimestamp(env);
        if (!ZVal.isset(this.start)) {
            this.start = time;
        }

        duration = ZVal.subtract(time, this.start);
        SwitchEnumType101 switchVariable101 =
                ZVal.getEnum(
                        this.mode,
                        SwitchEnumType101.DEFAULT_CASE,
                        SwitchEnumType101.DYNAMIC_TYPE_347,
                        CONST_BYTES_PER_MINUTE,
                        SwitchEnumType101.DYNAMIC_TYPE_348,
                        CONST_MESSAGES_PER_SECOND,
                        SwitchEnumType101.DYNAMIC_TYPE_349,
                        CONST_MESSAGES_PER_MINUTE);
        switch (switchVariable101) {
            case DYNAMIC_TYPE_347:
                sleep = this.throttleBytesPerMinute(env, duration);
                break;
            case DYNAMIC_TYPE_348:
                sleep = this.throttleMessagesPerSecond(env, duration);
                break;
            case DYNAMIC_TYPE_349:
                sleep = this.throttleMessagesPerMinute(env, duration);
                break;
            case DEFAULT_CASE:
                sleep = 0;
                break;
        }
        ;
        if (ZVal.isGreaterThan(sleep, '>', 0)) {
            this.sleep(env, sleep);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "evt", typeHint = "Swift_Events_SendEvent")
    public Object sendPerformed(RuntimeEnv env, Object... args) {
        Object evt = assignParameter(args, 0, false);
        super.sendPerformed(env, evt);
        this.messages = ZVal.increment(this.messages);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "seconds")
    public Object sleep(RuntimeEnv env, Object... args) {
        Object seconds = assignParameter(args, 0, false);
        if (ZVal.isset(this.sleeper)) {
            env.callMethod(this.sleeper, "sleep", Swift_Plugins_ThrottlerPlugin.class, seconds);

        } else {
            NamespaceGlobal.sleep.env(env).call(seconds);
        }

        return null;
    }

    @ConvertedMethod
    public Object getTimestamp(RuntimeEnv env, Object... args) {
        if (ZVal.isset(this.timer)) {
            return ZVal.assign(
                    env.callMethod(
                            this.timer, "getTimestamp", Swift_Plugins_ThrottlerPlugin.class));
        }

        return ZVal.assign(NamespaceGlobal.time.env(env).call().value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "timePassed")
    private Object throttleBytesPerMinute(RuntimeEnv env, Object... args) {
        Object timePassed = assignParameter(args, 0, false);
        Object expectedDuration = null;
        expectedDuration =
                ZVal.divide(
                        env.callMethod(this, "getBytesOut", Swift_Plugins_ThrottlerPlugin.class),
                        ZVal.divide(this.rate, 60));
        return ZVal.assign(
                ZVal.toLong(
                        NamespaceGlobal.ceil
                                .env(env)
                                .call(ZVal.subtract(expectedDuration, timePassed))
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "timePassed")
    private Object throttleMessagesPerSecond(RuntimeEnv env, Object... args) {
        Object timePassed = assignParameter(args, 0, false);
        Object expectedDuration = null;
        expectedDuration = ZVal.divide(this.messages, this.rate);
        return ZVal.assign(
                ZVal.toLong(
                        NamespaceGlobal.ceil
                                .env(env)
                                .call(ZVal.subtract(expectedDuration, timePassed))
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "timePassed")
    private Object throttleMessagesPerMinute(RuntimeEnv env, Object... args) {
        Object timePassed = assignParameter(args, 0, false);
        Object expectedDuration = null;
        expectedDuration = ZVal.divide(this.messages, ZVal.divide(this.rate, 60));
        return ZVal.assign(
                ZVal.toLong(
                        NamespaceGlobal.ceil
                                .env(env)
                                .call(ZVal.subtract(expectedDuration, timePassed))
                                .value()));
    }

    public static final Object CONST_BYTES_PER_MINUTE = 1;

    public static final Object CONST_MESSAGES_PER_SECOND = 17;

    public static final Object CONST_MESSAGES_PER_MINUTE = 16;

    public static final Object CONST_class = "Swift_Plugins_ThrottlerPlugin";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends Swift_Plugins_BandwidthMonitorPlugin.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Plugins_ThrottlerPlugin")
                    .setLookup(
                            Swift_Plugins_ThrottlerPlugin.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "in",
                            "messages",
                            "mirrors",
                            "mode",
                            "out",
                            "rate",
                            "sleeper",
                            "start",
                            "timer")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/ThrottlerPlugin.php")
                    .addInterface("Swift_Plugins_Sleeper")
                    .addInterface("Swift_Plugins_Timer")
                    .addInterface("Swift_Events_SendListener")
                    .addInterface("Swift_Events_EventListener")
                    .addInterface("Swift_Events_CommandListener")
                    .addInterface("Swift_Events_ResponseListener")
                    .addInterface("Swift_InputByteStream")
                    .addExtendsClass("Swift_Plugins_BandwidthMonitorPlugin")
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

    private enum SwitchEnumType101 {
        DYNAMIC_TYPE_347,
        DYNAMIC_TYPE_348,
        DYNAMIC_TYPE_349,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
