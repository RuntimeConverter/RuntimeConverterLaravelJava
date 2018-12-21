package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.namespaces.Handler.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.namespaces.Handler.classes.AbstractSessionHandler;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeInterfaces.SessionUpdateTimestampHandlerInterface;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/Session/Storage/Handler/StrictSessionHandler.php

*/

public class StrictSessionHandler extends AbstractSessionHandler {

    public Object handler = null;

    public Object doDestroy = null;

    public StrictSessionHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == StrictSessionHandler.class) {
            this.__construct(env, args);
        }
    }

    public StrictSessionHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "handler", typeHint = "SessionHandlerInterface")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object handler = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        handler,
                        SessionUpdateTimestampHandlerInterface.class,
                        "SessionUpdateTimestampHandlerInterface"))) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "\"%s\" is already an instance of \"SessionUpdateTimestampHandlerInterface\", you cannot wrap it with \"%s\".",
                                            function_get_class.f.env(env).call(handler).value(),
                                            CONST_class)
                                    .value()));
        }

        this.handler = handler;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "savePath")
    @ConvertedParameter(index = 1, name = "sessionName")
    public Object open(RuntimeEnv env, Object... args) {
        Object savePath = assignParameter(args, 0, false);
        Object sessionName = assignParameter(args, 1, false);
        super.open(env, savePath, sessionName);
        return ZVal.assign(
                env.callMethod(
                        this.handler, "open", StrictSessionHandler.class, savePath, sessionName));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    protected Object doRead(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(this.handler, "read", StrictSessionHandler.class, sessionId));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    @ConvertedParameter(index = 1, name = "data")
    public Object updateTimestamp(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(this, "write", StrictSessionHandler.class, sessionId, data));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    @ConvertedParameter(index = 1, name = "data")
    protected Object doWrite(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(this.handler, "write", StrictSessionHandler.class, sessionId, data));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    public Object destroy(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        Object destroyed = null;
        this.doDestroy = true;
        destroyed = super.destroy(env, sessionId);
        return ZVal.assign(
                ZVal.isTrue(this.doDestroy) ? this.doDestroy(env, sessionId) : destroyed);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    protected Object doDestroy(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        this.doDestroy = false;
        return ZVal.assign(
                env.callMethod(this.handler, "destroy", StrictSessionHandler.class, sessionId));
    }

    @ConvertedMethod
    public Object close(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.handler, "close", StrictSessionHandler.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "maxlifetime")
    public Object gc(RuntimeEnv env, Object... args) {
        Object maxlifetime = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(this.handler, "gc", StrictSessionHandler.class, maxlifetime));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Handler\\StrictSessionHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends AbstractSessionHandler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Handler\\StrictSessionHandler")
                    .setLookup(
                            StrictSessionHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "doDestroy",
                            "handler",
                            "igbinaryEmptyData",
                            "newSessionId",
                            "prefetchData",
                            "prefetchId",
                            "sessionName")
                    .setFilename(
                            "vendor/symfony/http-foundation/Session/Storage/Handler/StrictSessionHandler.php")
                    .addInterface("SessionHandlerInterface")
                    .addInterface("SessionUpdateTimestampHandlerInterface")
                    .addExtendsClass(
                            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Handler\\AbstractSessionHandler")
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
