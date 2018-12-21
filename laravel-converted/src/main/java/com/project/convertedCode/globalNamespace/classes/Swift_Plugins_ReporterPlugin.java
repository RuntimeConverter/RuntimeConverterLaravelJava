package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.classes.Swift_Events_SendListener;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_flip;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Swift_Plugins_Reporter;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/ReporterPlugin.php

*/

public class Swift_Plugins_ReporterPlugin extends RuntimeClassBase
        implements Swift_Events_SendListener {

    public Object reporter = null;

    public Swift_Plugins_ReporterPlugin(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Plugins_ReporterPlugin.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Plugins_ReporterPlugin(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reporter", typeHint = "Swift_Plugins_Reporter")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object reporter = assignParameter(args, 0, false);
        this.reporter = reporter;
        return null;
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
        Object failures = null;
        Object address = null;
        Object _null = null;
        Object message = null;
        message = env.callMethod(evt, "getMessage", Swift_Plugins_ReporterPlugin.class);
        failures =
                function_array_flip
                        .f
                        .env(env)
                        .call(
                                env.callMethod(
                                        evt,
                                        "getFailedRecipients",
                                        Swift_Plugins_ReporterPlugin.class))
                        .value();
        for (ZPair zpairResult1575 :
                ZVal.getIterable(
                        rToArrayCast(
                                env.callMethod(
                                        message, "getTo", Swift_Plugins_ReporterPlugin.class)),
                        env,
                        false)) {
            address = ZVal.assign(zpairResult1575.getKey());
            _null = ZVal.assign(zpairResult1575.getValue());
            env.callMethod(
                    this.reporter,
                    "notify",
                    Swift_Plugins_ReporterPlugin.class,
                    message,
                    address,
                    function_array_key_exists.f.env(env).call(address, failures).getBool()
                            ? Swift_Plugins_Reporter.CONST_RESULT_FAIL
                            : Swift_Plugins_Reporter.CONST_RESULT_PASS);
        }

        for (ZPair zpairResult1576 :
                ZVal.getIterable(
                        rToArrayCast(
                                env.callMethod(
                                        message, "getCc", Swift_Plugins_ReporterPlugin.class)),
                        env,
                        false)) {
            address = ZVal.assign(zpairResult1576.getKey());
            _null = ZVal.assign(zpairResult1576.getValue());
            env.callMethod(
                    this.reporter,
                    "notify",
                    Swift_Plugins_ReporterPlugin.class,
                    message,
                    address,
                    function_array_key_exists.f.env(env).call(address, failures).getBool()
                            ? Swift_Plugins_Reporter.CONST_RESULT_FAIL
                            : Swift_Plugins_Reporter.CONST_RESULT_PASS);
        }

        for (ZPair zpairResult1577 :
                ZVal.getIterable(
                        rToArrayCast(
                                env.callMethod(
                                        message, "getBcc", Swift_Plugins_ReporterPlugin.class)),
                        env,
                        false)) {
            address = ZVal.assign(zpairResult1577.getKey());
            _null = ZVal.assign(zpairResult1577.getValue());
            env.callMethod(
                    this.reporter,
                    "notify",
                    Swift_Plugins_ReporterPlugin.class,
                    message,
                    address,
                    function_array_key_exists.f.env(env).call(address, failures).getBool()
                            ? Swift_Plugins_Reporter.CONST_RESULT_FAIL
                            : Swift_Plugins_Reporter.CONST_RESULT_PASS);
        }

        return null;
    }

    public static final Object CONST_class = "Swift_Plugins_ReporterPlugin";

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
                    .setName("Swift_Plugins_ReporterPlugin")
                    .setLookup(
                            Swift_Plugins_ReporterPlugin.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("reporter")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/ReporterPlugin.php")
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
