package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.classes.Swift_Events_SendListener;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.classes.Swift_Plugins_Sleeper;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/AntiFloodPlugin.php

*/

public class Swift_Plugins_AntiFloodPlugin extends RuntimeClassBase
        implements Swift_Events_SendListener, Swift_Plugins_Sleeper {

    public Object threshold = null;

    public Object sleep = null;

    public Object counter = 0;

    public Object sleeper = null;

    public Swift_Plugins_AntiFloodPlugin(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Plugins_AntiFloodPlugin.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Plugins_AntiFloodPlugin(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "threshold",
        defaultValue = "99",
        defaultValueType = "number"
    )
    @ConvertedParameter(index = 1, name = "sleep", defaultValue = "0", defaultValueType = "number")
    @ConvertedParameter(
        index = 2,
        name = "sleeper",
        typeHint = "Swift_Plugins_Sleeper",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object threshold = assignParameter(args, 0, true);
        if (null == threshold) {
            threshold = 99;
        }
        Object sleep = assignParameter(args, 1, true);
        if (null == sleep) {
            sleep = 0;
        }
        Object sleeper = assignParameter(args, 2, true);
        if (null == sleeper) {
            sleeper = ZVal.getNull();
        }
        this.setThreshold(env, threshold);
        this.setSleepTime(env, sleep);
        this.sleeper = sleeper;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "threshold")
    public Object setThreshold(RuntimeEnv env, Object... args) {
        Object threshold = assignParameter(args, 0, false);
        this.threshold = threshold;
        return null;
    }

    @ConvertedMethod
    public Object getThreshold(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.threshold);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sleep")
    public Object setSleepTime(RuntimeEnv env, Object... args) {
        Object sleep = assignParameter(args, 0, false);
        this.sleep = sleep;
        return null;
    }

    @ConvertedMethod
    public Object getSleepTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.sleep);
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
        Object transport = null;
        this.counter = ZVal.increment(this.counter);
        if (ZVal.isGreaterThanOrEqualTo(this.counter, ">=", this.threshold)) {
            transport = env.callMethod(evt, "getTransport", Swift_Plugins_AntiFloodPlugin.class);
            env.callMethod(transport, "stop", Swift_Plugins_AntiFloodPlugin.class);
            if (ZVal.isTrue(this.sleep)) {
                this.sleep(env, this.sleep);
            }

            env.callMethod(transport, "start", Swift_Plugins_AntiFloodPlugin.class);
            this.counter = 0;
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "seconds")
    public Object sleep(RuntimeEnv env, Object... args) {
        Object seconds = assignParameter(args, 0, false);
        if (ZVal.isset(this.sleeper)) {
            env.callMethod(this.sleeper, "sleep", Swift_Plugins_AntiFloodPlugin.class, seconds);

        } else {
            NamespaceGlobal.sleep.env(env).call(seconds);
        }

        return null;
    }

    public static final Object CONST_class = "Swift_Plugins_AntiFloodPlugin";

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
                    .setName("Swift_Plugins_AntiFloodPlugin")
                    .setLookup(
                            Swift_Plugins_AntiFloodPlugin.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("counter", "sleep", "sleeper", "threshold")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/AntiFloodPlugin.php")
                    .addInterface("Swift_Events_SendListener")
                    .addInterface("Swift_Events_EventListener")
                    .addInterface("Swift_Plugins_Sleeper")
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
