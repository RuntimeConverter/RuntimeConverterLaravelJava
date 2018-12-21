package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.namespaces.Handler.classes;

import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.namespaces.Handler.classes.AbstractSessionHandler;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
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

 vendor/symfony/http-foundation/Session/Storage/Handler/NullSessionHandler.php

*/

public class NullSessionHandler extends AbstractSessionHandler {

    public NullSessionHandler(RuntimeEnv env, Object... args) {
        super(env);
    }

    public NullSessionHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object close(RuntimeEnv env, Object... args) {
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    public Object validateId(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    protected Object doRead(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        return "";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    @ConvertedParameter(index = 1, name = "data")
    public Object updateTimestamp(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    @ConvertedParameter(index = 1, name = "data")
    protected Object doWrite(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    protected Object doDestroy(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "maxlifetime")
    public Object gc(RuntimeEnv env, Object... args) {
        Object maxlifetime = assignParameter(args, 0, false);
        return ZVal.assign(true);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Handler\\NullSessionHandler";

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
                            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Handler\\NullSessionHandler")
                    .setLookup(
                            NullSessionHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "igbinaryEmptyData",
                            "newSessionId",
                            "prefetchData",
                            "prefetchId",
                            "sessionName")
                    .setFilename(
                            "vendor/symfony/http-foundation/Session/Storage/Handler/NullSessionHandler.php")
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
