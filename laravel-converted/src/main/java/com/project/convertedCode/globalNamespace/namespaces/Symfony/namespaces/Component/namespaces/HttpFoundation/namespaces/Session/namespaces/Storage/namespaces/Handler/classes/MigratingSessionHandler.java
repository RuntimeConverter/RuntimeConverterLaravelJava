package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.namespaces.Handler.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.namespaces.Handler.classes.StrictSessionHandler;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeInterfaces.SessionHandlerInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeInterfaces.SessionUpdateTimestampHandlerInterface;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/Session/Storage/Handler/MigratingSessionHandler.php

*/

public class MigratingSessionHandler extends RuntimeClassBase
        implements SessionHandlerInterface, SessionUpdateTimestampHandlerInterface {

    public Object currentHandler = null;

    public Object writeOnlyHandler = null;

    public MigratingSessionHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MigratingSessionHandler.class) {
            this.__construct(env, args);
        }
    }

    public MigratingSessionHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "currentHandler", typeHint = "SessionHandlerInterface")
    @ConvertedParameter(index = 1, name = "writeOnlyHandler", typeHint = "SessionHandlerInterface")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object currentHandler = assignParameter(args, 0, false);
        Object writeOnlyHandler = assignParameter(args, 1, false);
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        currentHandler,
                        SessionUpdateTimestampHandlerInterface.class,
                        "SessionUpdateTimestampHandlerInterface"))) {
            currentHandler = new StrictSessionHandler(env, currentHandler);
        }

        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        writeOnlyHandler,
                        SessionUpdateTimestampHandlerInterface.class,
                        "SessionUpdateTimestampHandlerInterface"))) {
            writeOnlyHandler = new StrictSessionHandler(env, writeOnlyHandler);
        }

        this.currentHandler = currentHandler;
        this.writeOnlyHandler = writeOnlyHandler;
        return null;
    }

    @ConvertedMethod
    public Object close(RuntimeEnv env, Object... args) {
        Object result = null;
        result = env.callMethod(this.currentHandler, "close", MigratingSessionHandler.class);
        env.callMethod(this.writeOnlyHandler, "close", MigratingSessionHandler.class);
        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    public Object destroy(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        Object result = null;
        result =
                env.callMethod(
                        this.currentHandler, "destroy", MigratingSessionHandler.class, sessionId);
        env.callMethod(this.writeOnlyHandler, "destroy", MigratingSessionHandler.class, sessionId);
        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "maxlifetime")
    public Object gc(RuntimeEnv env, Object... args) {
        Object maxlifetime = assignParameter(args, 0, false);
        Object result = null;
        result =
                env.callMethod(
                        this.currentHandler, "gc", MigratingSessionHandler.class, maxlifetime);
        env.callMethod(this.writeOnlyHandler, "gc", MigratingSessionHandler.class, maxlifetime);
        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "savePath")
    @ConvertedParameter(index = 1, name = "sessionName")
    public Object open(RuntimeEnv env, Object... args) {
        Object savePath = assignParameter(args, 0, false);
        Object sessionName = assignParameter(args, 1, false);
        Object result = null;
        result =
                env.callMethod(
                        this.currentHandler,
                        "open",
                        MigratingSessionHandler.class,
                        savePath,
                        sessionName);
        env.callMethod(
                this.writeOnlyHandler,
                "open",
                MigratingSessionHandler.class,
                savePath,
                sessionName);
        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    public Object read(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this.currentHandler, "read", MigratingSessionHandler.class, sessionId));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    @ConvertedParameter(index = 1, name = "sessionData")
    public Object write(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        Object sessionData = assignParameter(args, 1, false);
        Object result = null;
        result =
                env.callMethod(
                        this.currentHandler,
                        "write",
                        MigratingSessionHandler.class,
                        sessionId,
                        sessionData);
        env.callMethod(
                this.writeOnlyHandler,
                "write",
                MigratingSessionHandler.class,
                sessionId,
                sessionData);
        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    public Object validateId(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this.currentHandler,
                        "validateId",
                        MigratingSessionHandler.class,
                        sessionId));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    @ConvertedParameter(index = 1, name = "sessionData")
    public Object updateTimestamp(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        Object sessionData = assignParameter(args, 1, false);
        Object result = null;
        result =
                env.callMethod(
                        this.currentHandler,
                        "updateTimestamp",
                        MigratingSessionHandler.class,
                        sessionId,
                        sessionData);
        env.callMethod(
                this.writeOnlyHandler,
                "updateTimestamp",
                MigratingSessionHandler.class,
                sessionId,
                sessionData);
        return ZVal.assign(result);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Handler\\MigratingSessionHandler";

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
                    .setName(
                            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Handler\\MigratingSessionHandler")
                    .setLookup(
                            MigratingSessionHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("currentHandler", "writeOnlyHandler")
                    .setFilename(
                            "vendor/symfony/http-foundation/Session/Storage/Handler/MigratingSessionHandler.php")
                    .addInterface("SessionHandlerInterface")
                    .addInterface("SessionUpdateTimestampHandlerInterface")
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
