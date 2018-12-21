package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.HandlerInterface;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractHandler;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/SamplingHandler.php

*/

public class SamplingHandler extends AbstractHandler {

    public Object handler = null;

    public Object factor = null;

    public SamplingHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SamplingHandler.class) {
            this.__construct(env, args);
        }
    }

    public SamplingHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "handler")
    @ConvertedParameter(index = 1, name = "factor")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object handler = assignParameter(args, 0, false);
        Object factor = assignParameter(args, 1, false);
        super.__construct(env);
        this.handler = handler;
        this.factor = factor;
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
        return ZVal.assign(
                env.callMethod(this.handler, "isHandling", SamplingHandler.class, record));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object handle(RuntimeEnv env, Object... args) {
        Object record = assignParameter(args, 0, false);
        Object processor = null;
        if (ZVal.toBool(this.isHandling(env, record))
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                NamespaceGlobal.mt_rand.env(env).call(1, this.factor).value(),
                                "===",
                                1))) {
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            this.handler,
                            HandlerInterface.class,
                            "Monolog\\Handler\\HandlerInterface"))) {
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

            if (toObjectR(this).accessProp(this, env).name("processors").getBool()) {
                for (ZPair zpairResult803 :
                        ZVal.getIterable(
                                toObjectR(this).accessProp(this, env).name("processors").value(),
                                env,
                                true)) {
                    processor = ZVal.assign(zpairResult803.getValue());
                    record =
                            function_call_user_func
                                    .f
                                    .env(env)
                                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                    .call(processor, record)
                                    .value();
                }
            }

            env.callMethod(this.handler, "handle", SamplingHandler.class, record);
        }

        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        false,
                        "===",
                        toObjectR(this).accessProp(this, env).name("bubble").value()));
    }

    public static final Object CONST_class = "Monolog\\Handler\\SamplingHandler";

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
                    .setName("Monolog\\Handler\\SamplingHandler")
                    .setLookup(
                            SamplingHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bubble", "factor", "formatter", "handler", "level", "processors")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/SamplingHandler.php")
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
