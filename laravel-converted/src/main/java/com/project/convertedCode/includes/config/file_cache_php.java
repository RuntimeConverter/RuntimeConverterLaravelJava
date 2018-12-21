package com.project.convertedCode.includes.config;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.project.convertedCode.globalNamespace.functions.storage_path;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.functions.str_slug;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.functions.___env;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 config/cache.php

*/

public class file_cache_php implements RuntimeIncludable {

    public static final file_cache_php instance = new file_cache_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope204 scope = new Scope204();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope204 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "default",
                                        ___env.f.env(env).call("CACHE_DRIVER", "file").value()),
                                new ZPair(
                                        "stores",
                                        ZVal.newArray(
                                                new ZPair(
                                                        "apc",
                                                        ZVal.newArray(new ZPair("driver", "apc"))),
                                                new ZPair(
                                                        "array",
                                                        ZVal.newArray(
                                                                new ZPair("driver", "array"))),
                                                new ZPair(
                                                        "database",
                                                        ZVal.newArray(
                                                                new ZPair("driver", "database"),
                                                                new ZPair("table", "cache"),
                                                                new ZPair(
                                                                        "connection",
                                                                        ZVal.getNull()))),
                                                new ZPair(
                                                        "file",
                                                        ZVal.newArray(
                                                                new ZPair("driver", "file"),
                                                                new ZPair(
                                                                        "path",
                                                                        storage_path
                                                                                .f
                                                                                .env(env)
                                                                                .call(
                                                                                        "framework/cache/data")
                                                                                .value()))),
                                                new ZPair(
                                                        "memcached",
                                                        ZVal.newArray(
                                                                new ZPair("driver", "memcached"),
                                                                new ZPair(
                                                                        "persistent_id",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "MEMCACHED_PERSISTENT_ID")
                                                                                .value()),
                                                                new ZPair(
                                                                        "sasl",
                                                                        ZVal.newArray(
                                                                                new ZPair(
                                                                                        0,
                                                                                        ___env.f
                                                                                                .env(
                                                                                                        env)
                                                                                                .call(
                                                                                                        "MEMCACHED_USERNAME")
                                                                                                .value()),
                                                                                new ZPair(
                                                                                        1,
                                                                                        ___env.f
                                                                                                .env(
                                                                                                        env)
                                                                                                .call(
                                                                                                        "MEMCACHED_PASSWORD")
                                                                                                .value()))),
                                                                new ZPair(
                                                                        "options", ZVal.newArray()),
                                                                new ZPair(
                                                                        "servers",
                                                                        ZVal.newArray(
                                                                                new ZPair(
                                                                                        0,
                                                                                        ZVal
                                                                                                .newArray(
                                                                                                        new ZPair(
                                                                                                                "host",
                                                                                                                ___env.f
                                                                                                                        .env(
                                                                                                                                env)
                                                                                                                        .call(
                                                                                                                                "MEMCACHED_HOST",
                                                                                                                                "127.0.0.1")
                                                                                                                        .value()),
                                                                                                        new ZPair(
                                                                                                                "port",
                                                                                                                ___env.f
                                                                                                                        .env(
                                                                                                                                env)
                                                                                                                        .call(
                                                                                                                                "MEMCACHED_PORT",
                                                                                                                                11211)
                                                                                                                        .value()),
                                                                                                        new ZPair(
                                                                                                                "weight",
                                                                                                                100))))))),
                                                new ZPair(
                                                        "redis",
                                                        ZVal.newArray(
                                                                new ZPair("driver", "redis"),
                                                                new ZPair(
                                                                        "connection",
                                                                        "default"))))),
                                new ZPair(
                                        "prefix",
                                        ___env.f
                                                .env(env)
                                                .call(
                                                        "CACHE_PREFIX",
                                                        toStringR(
                                                                        str_slug.f
                                                                                .env(env)
                                                                                .call(
                                                                                        ___env.f
                                                                                                .env(
                                                                                                        env)
                                                                                                .call(
                                                                                                        "APP_NAME",
                                                                                                        "laravel")
                                                                                                .value(),
                                                                                        "_")
                                                                                .value(),
                                                                        env)
                                                                + "_cache")
                                                .value()))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants().setDir("/config").setFile("/config/cache.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope204 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
