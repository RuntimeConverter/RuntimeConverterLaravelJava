package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.namespaces.Proxy.classes;

import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.namespaces.Proxy.classes.AbstractProxy;
import com.runtimeconverter.runtime.nativeClasses.otherProxyClasses.SessionHandler;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeInterfaces.SessionHandlerInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/Session/Storage/Proxy/SessionHandlerProxy.php

*/

public class SessionHandlerProxy extends AbstractProxy implements SessionHandlerInterface {

    public Object handler = null;

    public SessionHandlerProxy(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SessionHandlerProxy.class) {
            this.__construct(env, args);
        }
    }

    public SessionHandlerProxy(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "handler", typeHint = "SessionHandlerInterface")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object handler = assignParameter(args, 0, false);
        this.handler = handler;
        toObjectR(this)
                .accessProp(this, env)
                .name("wrapper")
                .set(ZVal.checkInstanceType(handler, SessionHandler.class, "SessionHandler"));
        toObjectR(this)
                .accessProp(this, env)
                .name("saveHandlerName")
                .set(
                        toObjectR(this).accessProp(this, env).name("wrapper").getBool()
                                ? function_ini_get.f.env(env).call("session.save_handler").value()
                                : "user");
        return null;
    }

    @ConvertedMethod
    public Object getHandler(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.handler);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "savePath")
    @ConvertedParameter(index = 1, name = "sessionName")
    public Object open(RuntimeEnv env, Object... args) {
        Object savePath = assignParameter(args, 0, false);
        Object sessionName = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.toBool(
                        env.callMethod(
                                this.handler,
                                "open",
                                SessionHandlerProxy.class,
                                savePath,
                                sessionName)));
    }

    @ConvertedMethod
    public Object close(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(env.callMethod(this.handler, "close", SessionHandlerProxy.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    public Object read(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(
                        env.callMethod(this.handler, "read", SessionHandlerProxy.class, sessionId),
                        env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    @ConvertedParameter(index = 1, name = "data")
    public Object write(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.toBool(
                        env.callMethod(
                                this.handler,
                                "write",
                                SessionHandlerProxy.class,
                                sessionId,
                                data)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    public Object destroy(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                        env.callMethod(
                                this.handler, "destroy", SessionHandlerProxy.class, sessionId)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "maxlifetime")
    public Object gc(RuntimeEnv env, Object... args) {
        Object maxlifetime = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                        env.callMethod(
                                this.handler, "gc", SessionHandlerProxy.class, maxlifetime)));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Proxy\\SessionHandlerProxy";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractProxy.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Proxy\\SessionHandlerProxy")
                    .setLookup(
                            SessionHandlerProxy.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("handler", "saveHandlerName", "wrapper")
                    .setFilename(
                            "vendor/symfony/http-foundation/Session/Storage/Proxy/SessionHandlerProxy.php")
                    .addInterface("SessionHandlerInterface")
                    .addExtendsClass(
                            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Proxy\\AbstractProxy")
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
