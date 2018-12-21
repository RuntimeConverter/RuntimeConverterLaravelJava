package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.namespaces.Handler.classes.AbstractSessionHandler;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import java.lang.Class;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/Session/Storage/Handler/RedisSessionHandler.php

*/

public class RedisSessionHandler extends AbstractSessionHandler {

    public Object redis = null;

    public Object prefix = null;

    public RedisSessionHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RedisSessionHandler.class) {
            this.__construct(env, args);
        }
    }

    public RedisSessionHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "redis")
    @ConvertedParameter(
        index = 1,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object redis = assignParameter(args, 0, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        Object diff = null;
        Object ternaryExpressionTemp = null;
        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.toBool(
                                                        !ZVal.isTrue(
                                                                ZVal.checkInstanceType(
                                                                        redis,
                                                                        (Class) null,
                                                                        "Redis",
                                                                        env)))
                                                && ZVal.toBool(
                                                        !ZVal.isTrue(
                                                                ZVal.checkInstanceType(
                                                                        redis,
                                                                        (Class) null,
                                                                        "RedisArray",
                                                                        env))))
                                && ZVal.toBool(
                                        !ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        redis,
                                                        (Class) null,
                                                        "Predis\\Client",
                                                        env))))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(redis, (Class) null, "RedisProxy", env)))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "%s() expects parameter 1 to be Redis, RedisArray, RedisCluster or Predis\\Client, %s given",
                                            "RedisSessionHandler::__construct",
                                            function_is_object.f.env(env).call(redis).getBool()
                                                    ? function_get_class
                                                            .f
                                                            .env(env)
                                                            .call(redis)
                                                            .value()
                                                    : NamespaceGlobal.gettype
                                                            .env(env)
                                                            .call(redis)
                                                            .value())
                                    .value()));
        }

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
                                        ZVal.arrayFromList("prefix"))
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

        this.redis = redis;
        this.prefix =
                ZVal.isDefined(ternaryExpressionTemp = options.arrayGet(env, "prefix"))
                        ? ternaryExpressionTemp
                        : "sf_s";
        return null;
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
                                                this.redis,
                                                "get",
                                                RedisSessionHandler.class,
                                                toStringR(this.prefix, env)
                                                        + toStringR(sessionId, env)))
                        ? ternaryExpressionTemp
                        : "");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    @ConvertedParameter(index = 1, name = "data")
    protected Object doWrite(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        Object result = null;
        result =
                env.callMethod(
                        this.redis,
                        "setEx",
                        RedisSessionHandler.class,
                        toStringR(this.prefix, env) + toStringR(sessionId, env),
                        ZVal.toLong(
                                function_ini_get.f.env(env).call("session.gc_maxlifetime").value()),
                        data);
        return ZVal.assign(
                ZVal.toBool(result)
                        && ZVal.toBool(
                                !ZVal.isTrue(
                                        ZVal.checkInstanceType(
                                                result, (Class) null, "ErrorInterface", env))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    protected Object doDestroy(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        env.callMethod(
                this.redis,
                "del",
                RedisSessionHandler.class,
                toStringR(this.prefix, env) + toStringR(sessionId, env));
        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object close(RuntimeEnv env, Object... args) {
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "maxlifetime")
    public Object gc(RuntimeEnv env, Object... args) {
        Object maxlifetime = assignParameter(args, 0, false);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    @ConvertedParameter(index = 1, name = "data")
    public Object updateTimestamp(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.toBool(
                        env.callMethod(
                                this.redis,
                                "expire",
                                RedisSessionHandler.class,
                                toStringR(this.prefix, env) + toStringR(sessionId, env),
                                ZVal.toLong(
                                        function_ini_get
                                                .f
                                                .env(env)
                                                .call("session.gc_maxlifetime")
                                                .value()))));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Handler\\RedisSessionHandler";

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
                            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Handler\\RedisSessionHandler")
                    .setLookup(
                            RedisSessionHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "igbinaryEmptyData",
                            "newSessionId",
                            "prefetchData",
                            "prefetchId",
                            "prefix",
                            "redis",
                            "sessionName")
                    .setFilename(
                            "vendor/symfony/http-foundation/Session/Storage/Handler/RedisSessionHandler.php")
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
