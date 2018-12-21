package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
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

 vendor/laravel/framework/src/Illuminate/Queue/NullQueue.php

*/

public class NullQueue
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Queue
                .classes
                .Queue
        implements com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Contracts
                .namespaces
                .Queue
                .classes
                .Queue {

    public NullQueue(RuntimeEnv env, Object... args) {
        super(env);
    }

    public NullQueue(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object size(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, true);
        if (null == queue) {
            queue = ZVal.getNull();
        }
        return 0;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    @ConvertedParameter(index = 1, name = "data")
    @ConvertedParameter(
        index = 2,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object push(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = "";
        }
        Object queue = assignParameter(args, 2, true);
        if (null == queue) {
            queue = ZVal.getNull();
        }
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "payload")
    @ConvertedParameter(
        index = 1,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object pushRaw(RuntimeEnv env, Object... args) {
        Object payload = assignParameter(args, 0, false);
        Object queue = assignParameter(args, 1, true);
        if (null == queue) {
            queue = ZVal.getNull();
        }
        Object options = assignParameter(args, 2, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay")
    @ConvertedParameter(index = 1, name = "job")
    @ConvertedParameter(index = 2, name = "data")
    @ConvertedParameter(
        index = 3,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object later(RuntimeEnv env, Object... args) {
        Object delay = assignParameter(args, 0, false);
        Object job = assignParameter(args, 1, false);
        Object data = assignParameter(args, 2, true);
        if (null == data) {
            data = "";
        }
        Object queue = assignParameter(args, 3, true);
        if (null == queue) {
            queue = ZVal.getNull();
        }
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object pop(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, true);
        if (null == queue) {
            queue = ZVal.getNull();
        }
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Queue\\NullQueue";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Illuminate
                    .namespaces
                    .Queue
                    .classes
                    .Queue
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Queue\\NullQueue")
                    .setLookup(
                            NullQueue.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("connectionName", "container")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Queue/NullQueue.php")
                    .addInterface("Illuminate\\Contracts\\Queue\\Queue")
                    .addExtendsClass("Illuminate\\Queue\\Queue")
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
