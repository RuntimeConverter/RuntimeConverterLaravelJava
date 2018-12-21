package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.GroupHandler;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/WhatFailureGroupHandler.php

*/

public class WhatFailureGroupHandler extends GroupHandler {

    public WhatFailureGroupHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == WhatFailureGroupHandler.class) {
            this.__construct(env, args);
        }
    }

    public WhatFailureGroupHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object handle(RuntimeEnv env, Object... args) {
        Object record = assignParameter(args, 0, false);
        Object handler = null;
        Object e = null;
        Object processor = null;
        if (toObjectR(this).accessProp(this, env).name("processors").getBool()) {
            for (ZPair zpairResult810 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("processors").value(),
                            env,
                            true)) {
                processor = ZVal.assign(zpairResult810.getValue());
                record =
                        function_call_user_func
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(processor, record)
                                .value();
            }
        }

        for (ZPair zpairResult811 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("handlers").value(),
                        env,
                        true)) {
            handler = ZVal.assign(zpairResult811.getValue());
            try {
                env.callMethod(handler, "handle", WhatFailureGroupHandler.class, record);
            } catch (ConvertedException convertedException91) {
                if (convertedException91.instanceOf(PHPException.class, "Exception")) {
                    e = convertedException91.getObject();
                } else if (convertedException91.instanceOf(Throwable.class, "Throwable")) {
                    e = convertedException91.getObject();
                } else {
                    throw convertedException91;
                }
            }
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
        Object handler = null;
        Object e = null;
        for (ZPair zpairResult812 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("handlers").value(),
                        env,
                        true)) {
            handler = ZVal.assign(zpairResult812.getValue());
            try {
                env.callMethod(handler, "handleBatch", WhatFailureGroupHandler.class, records);
            } catch (ConvertedException convertedException92) {
                if (convertedException92.instanceOf(PHPException.class, "Exception")) {
                    e = convertedException92.getObject();
                } else if (convertedException92.instanceOf(Throwable.class, "Throwable")) {
                    e = convertedException92.getObject();
                } else {
                    throw convertedException92;
                }
            }
        }

        return null;
    }

    public static final Object CONST_class = "Monolog\\Handler\\WhatFailureGroupHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends GroupHandler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Handler\\WhatFailureGroupHandler")
                    .setLookup(
                            WhatFailureGroupHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bubble", "formatter", "handlers", "level", "processors")
                    .setFilename(
                            "vendor/monolog/monolog/src/Monolog/Handler/WhatFailureGroupHandler.php")
                    .addInterface("Monolog\\Handler\\HandlerInterface")
                    .addExtendsClass("Monolog\\Handler\\GroupHandler")
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
