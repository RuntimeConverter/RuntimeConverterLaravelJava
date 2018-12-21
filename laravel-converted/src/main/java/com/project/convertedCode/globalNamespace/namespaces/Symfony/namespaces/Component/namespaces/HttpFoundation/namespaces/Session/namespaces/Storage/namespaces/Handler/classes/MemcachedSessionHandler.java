package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.namespaces.Handler.classes.AbstractSessionHandler;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.memcached.Memcached;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/Session/Storage/Handler/MemcachedSessionHandler.php

*/

public class MemcachedSessionHandler extends AbstractSessionHandler {

    public Object memcached = null;

    public Object ttl = null;

    public Object prefix = null;

    public MemcachedSessionHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MemcachedSessionHandler.class) {
            this.__construct(env, args);
        }
    }

    public MemcachedSessionHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "memcached", typeHint = "Memcached")
    @ConvertedParameter(
        index = 1,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object memcached = assignParameter(args, 0, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        Object diff = null;
        this.memcached = memcached;
        if (ZVal.isTrue(
                diff =
                        function_array_diff
                                .f
                                .env(env)
                                .call(
                                        function_array_keys
                                                .f
                                                .env(env)
                                                .call(options.getObject())
                                                .value(),
                                        ZVal.arrayFromList("prefix", "expiretime"))
                                .value())) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "The following options are not supported \"%s\"",
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call(", ", diff)
                                                    .value())
                                    .value()));
        }

        this.ttl =
                arrayActionR(ArrayAction.ISSET, options, env, "expiretime")
                        ? ZVal.toLong(options.arrayGet(env, "expiretime"))
                        : 86400;
        this.prefix =
                arrayActionR(ArrayAction.ISSET, options, env, "prefix")
                        ? options.arrayGet(env, "prefix")
                        : "sf2s";
        return null;
    }

    @ConvertedMethod
    public Object close(RuntimeEnv env, Object... args) {
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    protected Object doRead(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isTrue(
                                ternaryExpressionTemp =
                                        env.callMethod(
                                                this.memcached,
                                                "get",
                                                MemcachedSessionHandler.class,
                                                toStringR(this.prefix, env)
                                                        + toStringR(sessionId, env)))
                        ? ternaryExpressionTemp
                        : "");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    @ConvertedParameter(index = 1, name = "data")
    public Object updateTimestamp(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        env.callMethod(
                this.memcached,
                "touch",
                MemcachedSessionHandler.class,
                toStringR(this.prefix, env) + toStringR(sessionId, env),
                ZVal.add(NamespaceGlobal.time.env(env).call().value(), this.ttl));
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    @ConvertedParameter(index = 1, name = "data")
    protected Object doWrite(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        this.memcached,
                        "set",
                        MemcachedSessionHandler.class,
                        toStringR(this.prefix, env) + toStringR(sessionId, env),
                        data,
                        ZVal.add(NamespaceGlobal.time.env(env).call().value(), this.ttl)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    protected Object doDestroy(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        Object result = null;
        result =
                env.callMethod(
                        this.memcached,
                        "delete",
                        MemcachedSessionHandler.class,
                        toStringR(this.prefix, env) + toStringR(sessionId, env));
        return ZVal.assign(
                ZVal.toBool(result)
                        || ZVal.toBool(
                                ZVal.equalityCheck(
                                        16,
                                        env.callMethod(
                                                this.memcached,
                                                "getResultCode",
                                                MemcachedSessionHandler.class))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "maxlifetime")
    public Object gc(RuntimeEnv env, Object... args) {
        Object maxlifetime = assignParameter(args, 0, false);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    protected Object getMemcached(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.memcached);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Handler\\MemcachedSessionHandler";

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
                            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Handler\\MemcachedSessionHandler")
                    .setLookup(
                            MemcachedSessionHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "igbinaryEmptyData",
                            "memcached",
                            "newSessionId",
                            "prefetchData",
                            "prefetchId",
                            "prefix",
                            "sessionName",
                            "ttl")
                    .setFilename(
                            "vendor/symfony/http-foundation/Session/Storage/Handler/MemcachedSessionHandler.php")
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
