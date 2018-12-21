package com.project.convertedCode.includes.config;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.project.convertedCode.globalNamespace.functions.storage_path;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.StreamHandler;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.functions.___env;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 config/logging.php

*/

public class file_logging_php implements RuntimeIncludable {

    public static final file_logging_php instance = new file_logging_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope208 scope = new Scope208();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope208 scope)
            throws IncludeEventException {
        // Namespace import was here
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "default",
                                        ___env.f.env(env).call("LOG_CHANNEL", "errorlog").value()),
                                new ZPair(
                                        "channels",
                                        ZVal.newArray(
                                                new ZPair(
                                                        "stack",
                                                        ZVal.newArray(
                                                                new ZPair("driver", "stack"),
                                                                new ZPair(
                                                                        "channels",
                                                                        ZVal.arrayFromList(
                                                                                "single")))),
                                                new ZPair(
                                                        "single",
                                                        ZVal.newArray(
                                                                new ZPair("driver", "single"),
                                                                new ZPair(
                                                                        "path",
                                                                        storage_path
                                                                                .f
                                                                                .env(env)
                                                                                .call(
                                                                                        "logs/laravel.log")
                                                                                .value()),
                                                                new ZPair("level", "debug"))),
                                                new ZPair(
                                                        "daily",
                                                        ZVal.newArray(
                                                                new ZPair("driver", "daily"),
                                                                new ZPair(
                                                                        "path",
                                                                        storage_path
                                                                                .f
                                                                                .env(env)
                                                                                .call(
                                                                                        "logs/laravel.log")
                                                                                .value()),
                                                                new ZPair("level", "debug"),
                                                                new ZPair("days", 7))),
                                                new ZPair(
                                                        "slack",
                                                        ZVal.newArray(
                                                                new ZPair("driver", "slack"),
                                                                new ZPair(
                                                                        "url",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "LOG_SLACK_WEBHOOK_URL")
                                                                                .value()),
                                                                new ZPair(
                                                                        "username", "Laravel Log"),
                                                                new ZPair("emoji", ":boom:"),
                                                                new ZPair("level", "critical"))),
                                                new ZPair(
                                                        "stderr",
                                                        ZVal.newArray(
                                                                new ZPair("driver", "monolog"),
                                                                new ZPair(
                                                                        "handler",
                                                                        StreamHandler.CONST_class),
                                                                new ZPair(
                                                                        "with",
                                                                        ZVal.newArray(
                                                                                new ZPair(
                                                                                        "stream",
                                                                                        "php://stderr"))))),
                                                new ZPair(
                                                        "syslog",
                                                        ZVal.newArray(
                                                                new ZPair("driver", "syslog"),
                                                                new ZPair("level", "debug"))),
                                                new ZPair(
                                                        "errorlog",
                                                        ZVal.newArray(
                                                                new ZPair("driver", "errorlog"),
                                                                new ZPair("level", "debug"))))))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants().setDir("/config").setFile("/config/logging.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope208 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
