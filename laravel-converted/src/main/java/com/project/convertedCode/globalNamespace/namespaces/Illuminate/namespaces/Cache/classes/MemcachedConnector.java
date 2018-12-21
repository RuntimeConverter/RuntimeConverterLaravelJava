package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.memcached.Memcached;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Cache/MemcachedConnector.php

*/

public class MemcachedConnector extends RuntimeClassBase {

    public MemcachedConnector(RuntimeEnv env, Object... args) {
        super(env);
    }

    public MemcachedConnector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "servers", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "connectionId",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "credentials",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object connect(RuntimeEnv env, Object... args) {
        Object servers = assignParameter(args, 0, false);
        Object connectionId = assignParameter(args, 1, true);
        if (null == connectionId) {
            connectionId = ZVal.getNull();
        }
        Object options = assignParameter(args, 2, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object credentials = assignParameter(args, 3, true);
        if (null == credentials) {
            credentials = ZVal.newArray();
        }
        Object memcached = null;
        ReferenceContainer server = new BasicReferenceContainer(null);
        memcached = this.getMemcached(env, connectionId, credentials, options);
        if (!ZVal.isTrue(env.callMethod(memcached, "getServerList", MemcachedConnector.class))) {
            for (ZPair zpairResult205 : ZVal.getIterable(servers, env, true)) {
                server.setObject(ZVal.assign(zpairResult205.getValue()));
                env.callMethod(
                        memcached,
                        "addServer",
                        MemcachedConnector.class,
                        server.arrayGet(env, "host"),
                        server.arrayGet(env, "port"),
                        server.arrayGet(env, "weight"));
            }
        }

        return ZVal.assign(memcached);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connectionId")
    @ConvertedParameter(index = 1, name = "credentials", typeHint = "array")
    @ConvertedParameter(index = 2, name = "options", typeHint = "array")
    protected Object getMemcached(RuntimeEnv env, Object... args) {
        Object connectionId = assignParameter(args, 0, false);
        Object credentials = assignParameter(args, 1, false);
        Object options = assignParameter(args, 2, false);
        Object memcached = null;
        memcached = this.createMemcachedInstance(env, connectionId);
        if (ZVal.strictEqualityCheck(
                function_count.f.env(env).call(credentials).value(), "===", 2)) {
            this.setCredentials(env, memcached, credentials);
        }

        if (function_count.f.env(env).call(options).getBool()) {
            env.callMethod(memcached, "setOptions", MemcachedConnector.class, options);
        }

        return ZVal.assign(memcached);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connectionId")
    protected Object createMemcachedInstance(RuntimeEnv env, Object... args) {
        Object connectionId = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isEmpty(connectionId) ? new Memcached(env) : new Memcached(env, connectionId));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "memcached")
    @ConvertedParameter(index = 1, name = "credentials")
    protected Object setCredentials(RuntimeEnv env, Object... args) {
        Object memcached = assignParameter(args, 0, false);
        Object credentials = assignParameter(args, 1, false);
        Object password = null;
        Object username = null;
        Object runtimeTempArrayResult11 = null;
        ZVal.list(
                runtimeTempArrayResult11 = credentials,
                (username = listGet(runtimeTempArrayResult11, 0, env)),
                (password = listGet(runtimeTempArrayResult11, 1, env)));
        env.callMethod(memcached, "setOption", MemcachedConnector.class, 18, true);
        env.callMethod(memcached, "setSaslAuthData", MemcachedConnector.class, username, password);
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Cache\\MemcachedConnector";

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
                    .setName("Illuminate\\Cache\\MemcachedConnector")
                    .setLookup(
                            MemcachedConnector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Cache/MemcachedConnector.php")
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
