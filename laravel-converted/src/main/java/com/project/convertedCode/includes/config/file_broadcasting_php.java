package com.project.convertedCode.includes.config;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.functions.___env;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 config/broadcasting.php

*/

public class file_broadcasting_php implements RuntimeIncludable {

    public static final file_broadcasting_php instance = new file_broadcasting_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope203 scope = new Scope203();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope203 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "default",
                                        ___env.f.env(env).call("BROADCAST_DRIVER", "null").value()),
                                new ZPair(
                                        "connections",
                                        ZVal.newArray(
                                                new ZPair(
                                                        "pusher",
                                                        ZVal.newArray(
                                                                new ZPair("driver", "pusher"),
                                                                new ZPair(
                                                                        "key",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "PUSHER_APP_KEY")
                                                                                .value()),
                                                                new ZPair(
                                                                        "secret",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "PUSHER_APP_SECRET")
                                                                                .value()),
                                                                new ZPair(
                                                                        "app_id",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "PUSHER_APP_ID")
                                                                                .value()),
                                                                new ZPair(
                                                                        "options",
                                                                        ZVal.newArray(
                                                                                new ZPair(
                                                                                        "cluster",
                                                                                        ___env.f
                                                                                                .env(
                                                                                                        env)
                                                                                                .call(
                                                                                                        "PUSHER_APP_CLUSTER")
                                                                                                .value()),
                                                                                new ZPair(
                                                                                        "encrypted",
                                                                                        true))))),
                                                new ZPair(
                                                        "redis",
                                                        ZVal.newArray(
                                                                new ZPair("driver", "redis"),
                                                                new ZPair(
                                                                        "connection", "default"))),
                                                new ZPair(
                                                        "log",
                                                        ZVal.newArray(new ZPair("driver", "log"))),
                                                new ZPair(
                                                        "null",
                                                        ZVal.newArray(
                                                                new ZPair("driver", "null"))))))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants().setDir("/config").setFile("/config/broadcasting.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope203 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
