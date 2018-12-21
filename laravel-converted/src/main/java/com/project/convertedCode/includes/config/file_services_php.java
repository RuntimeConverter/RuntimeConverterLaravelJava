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
import com.project.convertedCode.globalNamespace.functions.___env;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 config/services.php

*/

public class file_services_php implements RuntimeIncludable {

    public static final file_services_php instance = new file_services_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope211 scope = new Scope211();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope211 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "mailgun",
                                        ZVal.newArray(
                                                new ZPair(
                                                        "domain",
                                                        ___env.f
                                                                .env(env)
                                                                .call("MAILGUN_DOMAIN")
                                                                .value()),
                                                new ZPair(
                                                        "secret",
                                                        ___env.f
                                                                .env(env)
                                                                .call("MAILGUN_SECRET")
                                                                .value()))),
                                new ZPair(
                                        "ses",
                                        ZVal.newArray(
                                                new ZPair(
                                                        "key",
                                                        ___env.f.env(env).call("SES_KEY").value()),
                                                new ZPair(
                                                        "secret",
                                                        ___env.f
                                                                .env(env)
                                                                .call("SES_SECRET")
                                                                .value()),
                                                new ZPair(
                                                        "region",
                                                        ___env.f
                                                                .env(env)
                                                                .call("SES_REGION", "us-east-1")
                                                                .value()))),
                                new ZPair(
                                        "sparkpost",
                                        ZVal.newArray(
                                                new ZPair(
                                                        "secret",
                                                        ___env.f
                                                                .env(env)
                                                                .call("SPARKPOST_SECRET")
                                                                .value()))),
                                new ZPair(
                                        "stripe",
                                        ZVal.newArray(
                                                new ZPair("model", User.CONST_class),
                                                new ZPair(
                                                        "key",
                                                        ___env.f
                                                                .env(env)
                                                                .call("STRIPE_KEY")
                                                                .value()),
                                                new ZPair(
                                                        "secret",
                                                        ___env.f
                                                                .env(env)
                                                                .call("STRIPE_SECRET")
                                                                .value()))))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants().setDir("/config").setFile("/config/services.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope211 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
