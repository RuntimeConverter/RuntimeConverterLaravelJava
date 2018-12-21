package com.project.convertedCode.includes.config;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.project.convertedCode.globalNamespace.functions.database_path;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.functions.___env;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 config/database.php

*/

public class file_database_php implements RuntimeIncludable {

    public static final file_database_php instance = new file_database_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope205 scope = new Scope205();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope205 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "default",
                                        ___env.f.env(env).call("DB_CONNECTION", "mysql").value()),
                                new ZPair(
                                        "connections",
                                        ZVal.newArray(
                                                new ZPair(
                                                        "sqlite",
                                                        ZVal.newArray(
                                                                new ZPair("driver", "sqlite"),
                                                                new ZPair(
                                                                        "database",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "DB_DATABASE",
                                                                                        database_path
                                                                                                .f
                                                                                                .env(
                                                                                                        env)
                                                                                                .call(
                                                                                                        "database.sqlite")
                                                                                                .value())
                                                                                .value()),
                                                                new ZPair("prefix", ""))),
                                                new ZPair(
                                                        "mysql",
                                                        ZVal.newArray(
                                                                new ZPair("driver", "mysql"),
                                                                new ZPair(
                                                                        "host",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "DB_HOST",
                                                                                        "127.0.0.1")
                                                                                .value()),
                                                                new ZPair(
                                                                        "port",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "DB_PORT",
                                                                                        "3306")
                                                                                .value()),
                                                                new ZPair(
                                                                        "database",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "DB_DATABASE",
                                                                                        "forge")
                                                                                .value()),
                                                                new ZPair(
                                                                        "username",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "DB_USERNAME",
                                                                                        "forge")
                                                                                .value()),
                                                                new ZPair(
                                                                        "password",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "DB_PASSWORD",
                                                                                        "")
                                                                                .value()),
                                                                new ZPair(
                                                                        "unix_socket",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "DB_SOCKET",
                                                                                        "")
                                                                                .value()),
                                                                new ZPair("charset", "utf8mb4"),
                                                                new ZPair(
                                                                        "collation",
                                                                        "utf8mb4_unicode_ci"),
                                                                new ZPair("prefix", ""),
                                                                new ZPair("strict", true),
                                                                new ZPair(
                                                                        "engine", ZVal.getNull()))),
                                                new ZPair(
                                                        "pgsql",
                                                        ZVal.newArray(
                                                                new ZPair("driver", "pgsql"),
                                                                new ZPair(
                                                                        "host",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "DB_HOST",
                                                                                        "127.0.0.1")
                                                                                .value()),
                                                                new ZPair(
                                                                        "port",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "DB_PORT",
                                                                                        "5432")
                                                                                .value()),
                                                                new ZPair(
                                                                        "database",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "DB_DATABASE",
                                                                                        "forge")
                                                                                .value()),
                                                                new ZPair(
                                                                        "username",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "DB_USERNAME",
                                                                                        "forge")
                                                                                .value()),
                                                                new ZPair(
                                                                        "password",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "DB_PASSWORD",
                                                                                        "")
                                                                                .value()),
                                                                new ZPair("charset", "utf8"),
                                                                new ZPair("prefix", ""),
                                                                new ZPair("schema", "public"),
                                                                new ZPair("sslmode", "prefer"))),
                                                new ZPair(
                                                        "sqlsrv",
                                                        ZVal.newArray(
                                                                new ZPair("driver", "sqlsrv"),
                                                                new ZPair(
                                                                        "host",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "DB_HOST",
                                                                                        "localhost")
                                                                                .value()),
                                                                new ZPair(
                                                                        "port",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "DB_PORT",
                                                                                        "1433")
                                                                                .value()),
                                                                new ZPair(
                                                                        "database",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "DB_DATABASE",
                                                                                        "forge")
                                                                                .value()),
                                                                new ZPair(
                                                                        "username",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "DB_USERNAME",
                                                                                        "forge")
                                                                                .value()),
                                                                new ZPair(
                                                                        "password",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "DB_PASSWORD",
                                                                                        "")
                                                                                .value()),
                                                                new ZPair("charset", "utf8"),
                                                                new ZPair("prefix", ""))))),
                                new ZPair("migrations", "migrations"),
                                new ZPair(
                                        "redis",
                                        ZVal.newArray(
                                                new ZPair("client", "predis"),
                                                new ZPair(
                                                        "default",
                                                        ZVal.newArray(
                                                                new ZPair(
                                                                        "host",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "REDIS_HOST",
                                                                                        "127.0.0.1")
                                                                                .value()),
                                                                new ZPair(
                                                                        "password",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "REDIS_PASSWORD",
                                                                                        ZVal
                                                                                                .getNull())
                                                                                .value()),
                                                                new ZPair(
                                                                        "port",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "REDIS_PORT",
                                                                                        6379)
                                                                                .value()),
                                                                new ZPair("database", 0))))))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants().setDir("/config").setFile("/config/database.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope205 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
