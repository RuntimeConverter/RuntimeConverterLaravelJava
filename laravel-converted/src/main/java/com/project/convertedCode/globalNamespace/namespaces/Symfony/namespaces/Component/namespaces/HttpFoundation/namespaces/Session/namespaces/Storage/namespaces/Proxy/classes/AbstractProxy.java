package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.namespaces.Proxy.classes;

import com.runtimeconverter.runtime.nativeFunctions.http.function_session_status;
import com.runtimeconverter.runtime.nativeFunctions.http.function_session_id;
import com.runtimeconverter.runtime.nativeFunctions.http.function_session_name;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
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
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/Session/Storage/Proxy/AbstractProxy.php

*/

public abstract class AbstractProxy extends RuntimeClassBase {

    public Object wrapper = false;

    public Object saveHandlerName = null;

    public AbstractProxy(RuntimeEnv env, Object... args) {
        super(env);
    }

    public AbstractProxy(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getSaveHandlerName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.saveHandlerName);
    }

    @ConvertedMethod
    public Object isSessionHandlerInterface(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.checkInstanceType(
                        this, SessionHandlerInterface.class, "SessionHandlerInterface"));
    }

    @ConvertedMethod
    public Object isWrapper(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.wrapper);
    }

    @ConvertedMethod
    public Object isActive(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        2, "===", function_session_status.f.env(env).call().value()));
    }

    @ConvertedMethod
    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_session_id.f.env(env).call().value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    public Object setId(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.isActive(env))) {
            throw ZVal.getException(
                    env, new LogicException(env, "Cannot change the ID of an active session"));
        }

        function_session_id.f.env(env).call(id);
        return null;
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_session_name.f.env(env).call().value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.isActive(env))) {
            throw ZVal.getException(
                    env, new LogicException(env, "Cannot change the name of an active session"));
        }

        function_session_name.f.env(env).call(name);
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Proxy\\AbstractProxy";

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
                            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Proxy\\AbstractProxy")
                    .setLookup(
                            AbstractProxy.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("saveHandlerName", "wrapper")
                    .setFilename(
                            "vendor/symfony/http-foundation/Session/Storage/Proxy/AbstractProxy.php")
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
