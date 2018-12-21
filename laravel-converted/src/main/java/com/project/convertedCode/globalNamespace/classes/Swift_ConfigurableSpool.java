package com.project.convertedCode.globalNamespace.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Swift_Spool;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/ConfigurableSpool.php

*/

public abstract class Swift_ConfigurableSpool extends RuntimeClassBase implements Swift_Spool {

    public Object message_limit = null;

    public Object time_limit = null;

    public Swift_ConfigurableSpool(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Swift_ConfigurableSpool(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "limit")
    public Object setMessageLimit(RuntimeEnv env, Object... args) {
        Object limit = assignParameter(args, 0, false);
        this.message_limit = ZVal.toLong(limit);
        return null;
    }

    @ConvertedMethod
    public Object getMessageLimit(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.message_limit);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "limit")
    public Object setTimeLimit(RuntimeEnv env, Object... args) {
        Object limit = assignParameter(args, 0, false);
        this.time_limit = ZVal.toLong(limit);
        return null;
    }

    @ConvertedMethod
    public Object getTimeLimit(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.time_limit);
    }

    public static final Object CONST_class = "Swift_ConfigurableSpool";

    @ConvertedMethod()
    public abstract Object start(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object stop(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object isStarted(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object queueMessage(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object flushQueue(
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
                    .setName("Swift_ConfigurableSpool")
                    .setLookup(
                            Swift_ConfigurableSpool.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("message_limit", "time_limit")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/ConfigurableSpool.php")
                    .addInterface("Swift_Spool")
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
