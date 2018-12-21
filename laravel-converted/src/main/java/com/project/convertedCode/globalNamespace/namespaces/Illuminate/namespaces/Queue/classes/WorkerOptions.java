package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
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

 vendor/laravel/framework/src/Illuminate/Queue/WorkerOptions.php

*/

public class WorkerOptions extends RuntimeClassBase {

    public Object delay = null;

    public Object memory = null;

    public Object timeout = null;

    public Object sleep = null;

    public Object maxTries = null;

    public Object force = null;

    public WorkerOptions(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == WorkerOptions.class) {
            this.__construct(env, args);
        }
    }

    public WorkerOptions(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay", defaultValue = "0", defaultValueType = "number")
    @ConvertedParameter(
        index = 1,
        name = "memory",
        defaultValue = "128",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 2,
        name = "timeout",
        defaultValue = "60",
        defaultValueType = "number"
    )
    @ConvertedParameter(index = 3, name = "sleep", defaultValue = "3", defaultValueType = "number")
    @ConvertedParameter(
        index = 4,
        name = "maxTries",
        defaultValue = "0",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 5,
        name = "force",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object delay = assignParameter(args, 0, true);
        if (null == delay) {
            delay = 0;
        }
        Object memory = assignParameter(args, 1, true);
        if (null == memory) {
            memory = 128;
        }
        Object timeout = assignParameter(args, 2, true);
        if (null == timeout) {
            timeout = 60;
        }
        Object sleep = assignParameter(args, 3, true);
        if (null == sleep) {
            sleep = 3;
        }
        Object maxTries = assignParameter(args, 4, true);
        if (null == maxTries) {
            maxTries = 0;
        }
        Object force = assignParameter(args, 5, true);
        if (null == force) {
            force = false;
        }
        this.delay = delay;
        this.sleep = sleep;
        this.force = force;
        this.memory = memory;
        this.timeout = timeout;
        this.maxTries = maxTries;
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Queue\\WorkerOptions";

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
                    .setName("Illuminate\\Queue\\WorkerOptions")
                    .setLookup(
                            WorkerOptions.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("delay", "force", "maxTries", "memory", "sleep", "timeout")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Queue/WorkerOptions.php")
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
