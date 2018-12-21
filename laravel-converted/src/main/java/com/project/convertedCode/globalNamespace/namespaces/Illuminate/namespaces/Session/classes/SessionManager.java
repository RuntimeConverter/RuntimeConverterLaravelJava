package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.classes.CacheBasedSessionHandler;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.classes.Store;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Manager;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.classes.CookieSessionHandler;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.classes.EncryptedStore;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.classes.FileSessionHandler;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.classes.DatabaseSessionHandler;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.classes.NullSessionHandler;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Session/SessionManager.php

*/

public class SessionManager extends Manager {

    public SessionManager(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SessionManager.class) {
            this.__construct(env, args);
        }
    }

    public SessionManager(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "driver")
    protected Object callCustomCreator(RuntimeEnv env, Object... args) {
        Object driver = assignParameter(args, 0, false);
        return ZVal.assign(this.buildSession(env, super.callCustomCreator(env, driver)));
    }

    @ConvertedMethod
    protected Object createArrayDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.buildSession(env, new NullSessionHandler(env)));
    }

    @ConvertedMethod
    protected Object createCookieDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                this.buildSession(
                        env,
                        new CookieSessionHandler(
                                env,
                                new ReferenceClassProperty(this, "app", env)
                                        .arrayGet(env, "cookie"),
                                new ReferenceClassProperty(this, "app", env)
                                        .arrayGet(env, "config", "session.lifetime"))));
    }

    @ConvertedMethod
    protected Object createFileDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.createNativeDriver(env));
    }

    @ConvertedMethod
    protected Object createNativeDriver(RuntimeEnv env, Object... args) {
        Object lifetime = null;
        lifetime =
                ZVal.assign(
                        new ReferenceClassProperty(this, "app", env)
                                .arrayGet(env, "config", "session.lifetime"));
        return ZVal.assign(
                this.buildSession(
                        env,
                        new FileSessionHandler(
                                env,
                                new ReferenceClassProperty(this, "app", env).arrayGet(env, "files"),
                                new ReferenceClassProperty(this, "app", env)
                                        .arrayGet(env, "config", "session.files"),
                                lifetime)));
    }

    @ConvertedMethod
    protected Object createDatabaseDriver(RuntimeEnv env, Object... args) {
        Object lifetime = null;
        Object table = null;
        table =
                ZVal.assign(
                        new ReferenceClassProperty(this, "app", env)
                                .arrayGet(env, "config", "session.table"));
        lifetime =
                ZVal.assign(
                        new ReferenceClassProperty(this, "app", env)
                                .arrayGet(env, "config", "session.lifetime"));
        return ZVal.assign(
                this.buildSession(
                        env,
                        new DatabaseSessionHandler(
                                env,
                                this.getDatabaseConnection(env),
                                table,
                                lifetime,
                                toObjectR(this).accessProp(this, env).name("app").value())));
    }

    @ConvertedMethod
    protected Object getDatabaseConnection(RuntimeEnv env, Object... args) {
        Object connection = null;
        connection =
                ZVal.assign(
                        new ReferenceClassProperty(this, "app", env)
                                .arrayGet(env, "config", "session.connection"));
        return ZVal.assign(
                env.callMethod(
                        new ReferenceClassProperty(this, "app", env).arrayGet(env, "db"),
                        "connection",
                        SessionManager.class,
                        connection));
    }

    @ConvertedMethod
    protected Object createApcDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.createCacheBased(env, "apc"));
    }

    @ConvertedMethod
    protected Object createMemcachedDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.createCacheBased(env, "memcached"));
    }

    @ConvertedMethod
    protected Object createRedisDriver(RuntimeEnv env, Object... args) {
        Object handler = null;
        handler = this.createCacheHandler(env, "redis");
        env.callMethod(
                env.callMethod(
                        env.callMethod(handler, "getCache", SessionManager.class),
                        "getStore",
                        SessionManager.class),
                "setConnection",
                SessionManager.class,
                new ReferenceClassProperty(this, "app", env)
                        .arrayGet(env, "config", "session.connection"));
        return ZVal.assign(this.buildSession(env, handler));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "driver")
    protected Object createCacheBased(RuntimeEnv env, Object... args) {
        Object driver = assignParameter(args, 0, false);
        return ZVal.assign(this.buildSession(env, this.createCacheHandler(env, driver)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "driver")
    protected Object createCacheHandler(RuntimeEnv env, Object... args) {
        Object driver = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        Object store = null;
        store =
                ZVal.assign(
                        ZVal.isTrue(
                                        ternaryExpressionTemp =
                                                env.callMethod(
                                                        new ReferenceClassProperty(this, "app", env)
                                                                .arrayGet(env, "config"),
                                                        "get",
                                                        SessionManager.class,
                                                        "session.store"))
                                ? ternaryExpressionTemp
                                : driver);
        return ZVal.assign(
                new CacheBasedSessionHandler(
                        env,
                        ((RuntimeClassInterface)
                                        env.callMethod(
                                                new ReferenceClassProperty(this, "app", env)
                                                        .arrayGet(env, "cache"),
                                                "store",
                                                SessionManager.class,
                                                store))
                                .phpClone(env),
                        new ReferenceClassProperty(this, "app", env)
                                .arrayGet(env, "config", "session.lifetime")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "handler")
    protected Object buildSession(RuntimeEnv env, Object... args) {
        Object handler = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                new ReferenceClassProperty(this, "app", env)
                        .arrayGet(env, "config", "session.encrypt"))) {
            return ZVal.assign(this.buildEncryptedSession(env, handler));
        }

        return ZVal.assign(
                new Store(
                        env,
                        new ReferenceClassProperty(this, "app", env)
                                .arrayGet(env, "config", "session.cookie"),
                        handler));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "handler")
    protected Object buildEncryptedSession(RuntimeEnv env, Object... args) {
        Object handler = assignParameter(args, 0, false);
        return ZVal.assign(
                new EncryptedStore(
                        env,
                        new ReferenceClassProperty(this, "app", env)
                                .arrayGet(env, "config", "session.cookie"),
                        handler,
                        new ReferenceClassProperty(this, "app", env).arrayGet(env, "encrypter")));
    }

    @ConvertedMethod
    public Object getSessionConfig(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "app", env).arrayGet(env, "config", "session"));
    }

    @ConvertedMethod
    public Object getDefaultDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "app", env)
                        .arrayGet(env, "config", "session.driver"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setDefaultDriver(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "app", env)
                .arrayAccess(env, "config", "session.driver")
                .set(name);
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Session\\SessionManager";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Manager.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Session\\SessionManager")
                    .setLookup(
                            SessionManager.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "customCreators", "drivers")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Session/SessionManager.php")
                    .addExtendsClass("Illuminate\\Support\\Manager")
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
