package com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Handler.classes.Handler;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/filp/whoops/src/Whoops/Handler/CallbackHandler.php

*/

public class CallbackHandler extends Handler {

    public Object callable = null;

    public CallbackHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CallbackHandler.class) {
            this.__construct(env, args);
        }
    }

    public CallbackHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callable")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object callable = assignParameter(args, 0, false);
        if (!function_is_callable.f.env(env).call(callable).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Argument to "
                                    + toStringR("CallbackHandler::__construct", env)
                                    + " must be valid callable"));
        }

        this.callable = callable;
        return null;
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        ReferenceContainer exception = new BasicReferenceContainer(null);
        Object callable = null;
        ReferenceContainer run = new BasicReferenceContainer(null);
        ReferenceContainer inspector = new BasicReferenceContainer(null);
        exception.setObject(env.callMethod(this, "getException", CallbackHandler.class));
        inspector.setObject(env.callMethod(this, "getInspector", CallbackHandler.class));
        run.setObject(env.callMethod(this, "getRun", CallbackHandler.class));
        callable = ZVal.assign(this.callable);
        return ZVal.assign(
                env.callFunctionDynamic(
                                callable,
                                new RuntimeArgsWithReferences()
                                        .add(0, exception)
                                        .add(1, inspector)
                                        .add(2, run),
                                exception.getObject(),
                                inspector.getObject(),
                                run.getObject())
                        .value());
    }

    public static final Object CONST_class = "Whoops\\Handler\\CallbackHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Handler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Whoops\\Handler\\CallbackHandler")
                    .setLookup(
                            CallbackHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("callable", "exception", "inspector", "run")
                    .setFilename("vendor/filp/whoops/src/Whoops/Handler/CallbackHandler.php")
                    .addInterface("Whoops\\Handler\\HandlerInterface")
                    .addExtendsClass("Whoops\\Handler\\Handler")
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
