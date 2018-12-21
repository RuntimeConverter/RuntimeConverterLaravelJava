package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.HandlerInterface;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractHandler;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/GroupHandler.php

*/

public class GroupHandler extends AbstractHandler {

    public Object handlers = null;

    public GroupHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == GroupHandler.class) {
            this.__construct(env, args);
        }
    }

    public GroupHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "handlers", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object handlers = assignParameter(args, 0, false);
        Object bubble = assignParameter(args, 1, true);
        if (null == bubble) {
            bubble = true;
        }
        Object handler = null;
        for (ZPair zpairResult778 : ZVal.getIterable(handlers, env, true)) {
            handler = ZVal.assign(zpairResult778.getValue());
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            handler,
                            HandlerInterface.class,
                            "Monolog\\Handler\\HandlerInterface"))) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                "The first argument of the GroupHandler must be an array of HandlerInterface instances."));
            }
        }

        this.handlers = handlers;
        toObjectR(this).accessProp(this, env).name("bubble").set(bubble);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object isHandling(RuntimeEnv env, Object... args) {
        Object record = assignParameter(args, 0, false);
        Object handler = null;
        for (ZPair zpairResult779 : ZVal.getIterable(this.handlers, env, true)) {
            handler = ZVal.assign(zpairResult779.getValue());
            if (ZVal.isTrue(env.callMethod(handler, "isHandling", GroupHandler.class, record))) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object handle(RuntimeEnv env, Object... args) {
        Object record = assignParameter(args, 0, false);
        Object handler = null;
        Object processor = null;
        if (toObjectR(this).accessProp(this, env).name("processors").getBool()) {
            for (ZPair zpairResult780 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("processors").value(),
                            env,
                            true)) {
                processor = ZVal.assign(zpairResult780.getValue());
                record =
                        function_call_user_func
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(processor, record)
                                .value();
            }
        }

        for (ZPair zpairResult781 : ZVal.getIterable(this.handlers, env, true)) {
            handler = ZVal.assign(zpairResult781.getValue());
            env.callMethod(handler, "handle", GroupHandler.class, record);
        }

        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        false,
                        "===",
                        toObjectR(this).accessProp(this, env).name("bubble").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "records", typeHint = "array")
    public Object handleBatch(RuntimeEnv env, Object... args) {
        Object records = assignParameter(args, 0, false);
        ReferenceContainer processed = new BasicReferenceContainer(null);
        Object handler = null;
        Object record = null;
        Object processor = null;
        if (toObjectR(this).accessProp(this, env).name("processors").getBool()) {
            processed.setObject(ZVal.newArray());
            for (ZPair zpairResult782 : ZVal.getIterable(records, env, true)) {
                record = ZVal.assign(zpairResult782.getValue());
                for (ZPair zpairResult783 :
                        ZVal.getIterable(
                                toObjectR(this).accessProp(this, env).name("processors").value(),
                                env,
                                true)) {
                    processor = ZVal.assign(zpairResult783.getValue());
                    processed
                            .arrayAppend(env)
                            .set(
                                    function_call_user_func
                                            .f
                                            .env(env)
                                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                            .call(processor, record)
                                            .value());
                }
            }

            records = ZVal.assign(processed.getObject());
        }

        for (ZPair zpairResult784 : ZVal.getIterable(this.handlers, env, true)) {
            handler = ZVal.assign(zpairResult784.getValue());
            env.callMethod(handler, "handleBatch", GroupHandler.class, records);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "formatter",
        typeHint = "Monolog\\Formatter\\FormatterInterface"
    )
    public Object setFormatter(RuntimeEnv env, Object... args) {
        Object formatter = assignParameter(args, 0, false);
        Object handler = null;
        for (ZPair zpairResult785 : ZVal.getIterable(this.handlers, env, true)) {
            handler = ZVal.assign(zpairResult785.getValue());
            env.callMethod(handler, "setFormatter", GroupHandler.class, formatter);
        }

        return ZVal.assign(this);
    }

    public static final Object CONST_class = "Monolog\\Handler\\GroupHandler";

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
                    .setName("Monolog\\Handler\\GroupHandler")
                    .setLookup(
                            GroupHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bubble", "formatter", "handlers", "level", "processors")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/GroupHandler.php")
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
