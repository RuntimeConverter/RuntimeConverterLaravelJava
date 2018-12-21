package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractHandler;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_register_shutdown_function;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/BufferHandler.php

*/

public class BufferHandler extends AbstractHandler {

    public Object handler = null;

    public Object bufferSize = 0;

    public Object bufferLimit = null;

    public Object flushOnOverflow = null;

    public Object buffer = ZVal.newArray();

    public Object initialized = false;

    public BufferHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == BufferHandler.class) {
            this.__construct(env, args);
        }
    }

    public BufferHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "handler",
        typeHint = "Monolog\\Handler\\HandlerInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "bufferLimit",
        defaultValue = "0",
        defaultValueType = "number"
    )
    @ConvertedParameter(index = 2, name = "level")
    @ConvertedParameter(
        index = 3,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "flushOnOverflow",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object handler = assignParameter(args, 0, false);
        Object bufferLimit = assignParameter(args, 1, true);
        if (null == bufferLimit) {
            bufferLimit = 0;
        }
        Object level = assignParameter(args, 2, true);
        if (null == level) {
            level = Logger.CONST_DEBUG;
        }
        Object bubble = assignParameter(args, 3, true);
        if (null == bubble) {
            bubble = true;
        }
        Object flushOnOverflow = assignParameter(args, 4, true);
        if (null == flushOnOverflow) {
            flushOnOverflow = false;
        }
        super.__construct(env, level, bubble);
        this.handler = handler;
        this.bufferLimit = ZVal.toLong(bufferLimit);
        this.flushOnOverflow = flushOnOverflow;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object handle(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object processor = null;
        if (ZVal.isLessThan(
                record.arrayGet(env, "level"),
                '<',
                toObjectR(this).accessProp(this, env).name("level").value())) {
            return ZVal.assign(false);
        }

        if (!ZVal.isTrue(this.initialized)) {
            function_register_shutdown_function
                    .f
                    .env(env)
                    .call(ZVal.newArray(new ZPair(0, this), new ZPair(1, "close")));
            this.initialized = true;
        }

        if (ZVal.toBool(ZVal.isGreaterThan(this.bufferLimit, '>', 0))
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(this.bufferSize, "===", this.bufferLimit))) {
            if (ZVal.isTrue(this.flushOnOverflow)) {
                this.flush(env);

            } else {
                function_array_shift.f.env(env).call(this.buffer);
                this.bufferSize = ZVal.decrement(this.bufferSize);
            }
        }

        if (toObjectR(this).accessProp(this, env).name("processors").getBool()) {
            for (ZPair zpairResult769 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("processors").value(),
                            env,
                            true)) {
                processor = ZVal.assign(zpairResult769.getValue());
                record.setObject(
                        function_call_user_func
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(processor, record.getObject())
                                .value());
            }
        }

        new ReferenceClassProperty(this, "buffer", env).arrayAppend(env).set(record.getObject());
        this.bufferSize = ZVal.increment(this.bufferSize);
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        false,
                        "===",
                        toObjectR(this).accessProp(this, env).name("bubble").value()));
    }

    @ConvertedMethod
    public Object flush(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(this.bufferSize, "===", 0)) {
            return null;
        }

        env.callMethod(this.handler, "handleBatch", BufferHandler.class, this.buffer);
        this.clear(env);
        return null;
    }

    @ConvertedMethod
    public Object __destruct(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    public Object close(RuntimeEnv env, Object... args) {
        this.flush(env);
        return null;
    }

    @ConvertedMethod
    public Object clear(RuntimeEnv env, Object... args) {
        this.bufferSize = 0;
        this.buffer = ZVal.newArray();
        return null;
    }

    public static final Object CONST_class = "Monolog\\Handler\\BufferHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractHandler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Handler\\BufferHandler")
                    .setLookup(
                            BufferHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bubble",
                            "buffer",
                            "bufferLimit",
                            "bufferSize",
                            "flushOnOverflow",
                            "formatter",
                            "handler",
                            "initialized",
                            "level",
                            "processors")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/BufferHandler.php")
                    .addInterface("Monolog\\Handler\\HandlerInterface")
                    .addExtendsClass("Monolog\\Handler\\AbstractHandler")
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
