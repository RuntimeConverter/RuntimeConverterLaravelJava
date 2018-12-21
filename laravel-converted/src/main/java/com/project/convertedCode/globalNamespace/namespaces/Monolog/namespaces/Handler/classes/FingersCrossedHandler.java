package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.namespaces.FingersCrossed.classes.ActivationStrategyInterface;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.HandlerInterface;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractHandler;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.namespaces.FingersCrossed.classes.ErrorLevelActivationStrategy;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/FingersCrossedHandler.php

*/

public class FingersCrossedHandler extends AbstractHandler {

    public Object handler = null;

    public Object activationStrategy = null;

    public Object buffering = true;

    public Object bufferSize = null;

    public Object buffer = ZVal.newArray();

    public Object stopBuffering = null;

    public Object passthruLevel = null;

    public FingersCrossedHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FingersCrossedHandler.class) {
            this.__construct(env, args);
        }
    }

    public FingersCrossedHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "handler")
    @ConvertedParameter(
        index = 1,
        name = "activationStrategy",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "bufferSize",
        defaultValue = "0",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 3,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "stopBuffering",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "passthruLevel",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object handler = assignParameter(args, 0, false);
        Object activationStrategy = assignParameter(args, 1, true);
        if (null == activationStrategy) {
            activationStrategy = ZVal.getNull();
        }
        Object bufferSize = assignParameter(args, 2, true);
        if (null == bufferSize) {
            bufferSize = 0;
        }
        Object bubble = assignParameter(args, 3, true);
        if (null == bubble) {
            bubble = true;
        }
        Object stopBuffering = assignParameter(args, 4, true);
        if (null == stopBuffering) {
            stopBuffering = true;
        }
        Object passthruLevel = assignParameter(args, 5, true);
        if (null == passthruLevel) {
            passthruLevel = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", activationStrategy)) {
            activationStrategy = new ErrorLevelActivationStrategy(env, Logger.CONST_WARNING);
        }

        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        activationStrategy,
                        ActivationStrategyInterface.class,
                        "Monolog\\Handler\\FingersCrossed\\ActivationStrategyInterface"))) {
            activationStrategy = new ErrorLevelActivationStrategy(env, activationStrategy);
        }

        this.handler = handler;
        this.activationStrategy = activationStrategy;
        this.bufferSize = bufferSize;
        toObjectR(this).accessProp(this, env).name("bubble").set(bubble);
        this.stopBuffering = stopBuffering;
        if (ZVal.strictNotEqualityCheck(passthruLevel, "!==", ZVal.getNull())) {
            this.passthruLevel = Logger.runtimeStaticObject.toMonologLevel(env, passthruLevel);
        }

        if (ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        this.handler,
                                        HandlerInterface.class,
                                        "Monolog\\Handler\\HandlerInterface")))
                && ZVal.toBool(!function_is_callable.f.env(env).call(this.handler).getBool())) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            "The given handler ("
                                    + toStringR(
                                            NamespaceGlobal.json_encode
                                                    .env(env)
                                                    .call(this.handler)
                                                    .value(),
                                            env)
                                    + ") is not a callable nor a Monolog\\Handler\\HandlerInterface object"));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object isHandling(RuntimeEnv env, Object... args) {
        Object record = assignParameter(args, 0, false);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object activate(RuntimeEnv env, Object... args) {
        Object record = null;
        Object ternaryExpressionTemp = null;
        if (ZVal.isTrue(this.stopBuffering)) {
            this.buffering = false;
        }

        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        this.handler,
                        HandlerInterface.class,
                        "Monolog\\Handler\\HandlerInterface"))) {
            record =
                    ZVal.assign(
                            ZVal.isTrue(
                                            ternaryExpressionTemp =
                                                    function_end
                                                            .f
                                                            .env(env)
                                                            .call(this.buffer)
                                                            .value())
                                    ? ternaryExpressionTemp
                                    : ZVal.getNull());
            this.handler =
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(this.handler, record, this)
                            .value();
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            this.handler,
                            HandlerInterface.class,
                            "Monolog\\Handler\\HandlerInterface"))) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env, "The factory callable should return a HandlerInterface"));
            }
        }

        env.callMethod(this.handler, "handleBatch", FingersCrossedHandler.class, this.buffer);
        this.buffer = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object handle(RuntimeEnv env, Object... args) {
        Object record = assignParameter(args, 0, false);
        Object processor = null;
        if (toObjectR(this).accessProp(this, env).name("processors").getBool()) {
            for (ZPair zpairResult776 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("processors").value(),
                            env,
                            true)) {
                processor = ZVal.assign(zpairResult776.getValue());
                record =
                        function_call_user_func
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(processor, record)
                                .value();
            }
        }

        if (ZVal.isTrue(this.buffering)) {
            new ReferenceClassProperty(this, "buffer", env).arrayAppend(env).set(record);
            if (ZVal.toBool(ZVal.isGreaterThan(this.bufferSize, '>', 0))
                    && ZVal.toBool(
                            ZVal.isGreaterThan(
                                    function_count.f.env(env).call(this.buffer).value(),
                                    '>',
                                    this.bufferSize))) {
                function_array_shift.f.env(env).call(this.buffer);
            }

            if (ZVal.isTrue(
                    env.callMethod(
                            this.activationStrategy,
                            "isHandlerActivated",
                            FingersCrossedHandler.class,
                            record))) {
                this.activate(env);
            }

        } else {
            env.callMethod(this.handler, "handle", FingersCrossedHandler.class, record);
        }

        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        false,
                        "===",
                        toObjectR(this).accessProp(this, env).name("bubble").value()));
    }

    @ConvertedMethod
    public Object close(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/monolog/monolog/src/Monolog/Handler")
                        .setFile(
                                "/vendor/monolog/monolog/src/Monolog/Handler/FingersCrossedHandler.php");
        Object level = null;
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.passthruLevel)) {
            level = ZVal.assign(this.passthruLevel);
            this.buffer =
                    function_array_filter
                            .f
                            .env(env)
                            .call(
                                    this.buffer,
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Monolog\\Handler",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(index = 0, name = "record")
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            ReferenceContainer record =
                                                    new BasicReferenceContainer(
                                                            assignParameter(args, 0, false));
                                            Object level = null;
                                            level =
                                                    this.contextReferences.getCapturedValue(
                                                            "level");
                                            return ZVal.assign(
                                                    ZVal.isGreaterThanOrEqualTo(
                                                            record.arrayGet(env, "level"),
                                                            ">=",
                                                            level));
                                        }
                                    }.use("level", level))
                            .value();
            if (ZVal.isGreaterThan(function_count.f.env(env).call(this.buffer).value(), '>', 0)) {
                env.callMethod(
                        this.handler, "handleBatch", FingersCrossedHandler.class, this.buffer);
                this.buffer = ZVal.newArray();
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object reset(RuntimeEnv env, Object... args) {
        this.buffering = true;
        return null;
    }

    @ConvertedMethod
    public Object clear(RuntimeEnv env, Object... args) {
        this.buffer = ZVal.newArray();
        this.reset(env);
        return null;
    }

    public static final Object CONST_class = "Monolog\\Handler\\FingersCrossedHandler";

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
                    .setName("Monolog\\Handler\\FingersCrossedHandler")
                    .setLookup(
                            FingersCrossedHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "activationStrategy",
                            "bubble",
                            "buffer",
                            "bufferSize",
                            "buffering",
                            "formatter",
                            "handler",
                            "level",
                            "passthruLevel",
                            "processors",
                            "stopBuffering")
                    .setFilename(
                            "vendor/monolog/monolog/src/Monolog/Handler/FingersCrossedHandler.php")
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
