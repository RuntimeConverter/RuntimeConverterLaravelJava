package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.HandlerInterface;
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

 vendor/monolog/monolog/src/Monolog/Handler/HandlerWrapper.php

*/

public class HandlerWrapper extends RuntimeClassBase implements HandlerInterface {

    public Object handler = null;

    public HandlerWrapper(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == HandlerWrapper.class) {
            this.__construct(env, args);
        }
    }

    public HandlerWrapper(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "handler",
        typeHint = "Monolog\\Handler\\HandlerInterface"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object handler = assignParameter(args, 0, false);
        this.handler = handler;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object isHandling(RuntimeEnv env, Object... args) {
        Object record = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(this.handler, "isHandling", HandlerWrapper.class, record));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object handle(RuntimeEnv env, Object... args) {
        Object record = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this.handler, "handle", HandlerWrapper.class, record));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "records", typeHint = "array")
    public Object handleBatch(RuntimeEnv env, Object... args) {
        Object records = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(this.handler, "handleBatch", HandlerWrapper.class, records));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    public Object pushProcessor(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        env.callMethod(this.handler, "pushProcessor", HandlerWrapper.class, callback);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object popProcessor(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.handler, "popProcessor", HandlerWrapper.class));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "formatter",
        typeHint = "Monolog\\Formatter\\FormatterInterface"
    )
    public Object setFormatter(RuntimeEnv env, Object... args) {
        Object formatter = assignParameter(args, 0, false);
        env.callMethod(this.handler, "setFormatter", HandlerWrapper.class, formatter);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getFormatter(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.handler, "getFormatter", HandlerWrapper.class));
    }

    public static final Object CONST_class = "Monolog\\Handler\\HandlerWrapper";

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
                    .setName("Monolog\\Handler\\HandlerWrapper")
                    .setLookup(
                            HandlerWrapper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("handler")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/HandlerWrapper.php")
                    .addInterface("Monolog\\Handler\\HandlerInterface")
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
