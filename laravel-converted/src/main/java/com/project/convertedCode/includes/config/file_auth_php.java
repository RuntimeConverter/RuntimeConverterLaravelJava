package com.project.convertedCode.includes.config;

import com.runtimeconverter.runtime.RuntimeStack;
import com.project.convertedCode.globalNamespace.namespaces.App.classes.User;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 config/auth.php

*/

public class file_auth_php implements RuntimeIncludable {

    public static final file_auth_php instance = new file_auth_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope202 scope = new Scope202();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope202 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "defaults",
                                        ZVal.newArray(
                                                new ZPair("guard", "web"),
                                                new ZPair("passwords", "users"))),
                                new ZPair(
                                        "guards",
                                        ZVal.newArray(
                                                new ZPair(
                                                        "web",
                                                        ZVal.newArray(
                                                                new ZPair("driver", "session"),
                                                                new ZPair("provider", "users"))),
                                                new ZPair(
                                                        "api",
                                                        ZVal.newArray(
                                                                new ZPair("driver", "token"),
                                                                new ZPair("provider", "users"))))),
                                new ZPair(
                                        "providers",
                                        ZVal.newArray(
                                                new ZPair(
                                                        "users",
                                                        ZVal.newArray(
                                                                new ZPair("driver", "eloquent"),
                                                                new ZPair(
                                                                        "model",
                                                                        User.CONST_class))))),
                                new ZPair(
                                        "passwords",
                                        ZVal.newArray(
                                                new ZPair(
                                                        "users",
                                                        ZVal.newArray(
                                                                new ZPair("provider", "users"),
                                                                new ZPair(
                                                                        "table", "password_resets"),
                                                                new ZPair("expire", 60))))))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants().setDir("/config").setFile("/config/auth.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope202 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
