package com.project.convertedCode.includes.config;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.project.convertedCode.globalNamespace.functions.resource_path;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.functions.___env;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 config/mail.php

*/

public class file_mail_php implements RuntimeIncludable {

    public static final file_mail_php instance = new file_mail_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope209 scope = new Scope209();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope209 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "driver",
                                        ___env.f.env(env).call("MAIL_DRIVER", "smtp").value()),
                                new ZPair(
                                        "host",
                                        ___env.f
                                                .env(env)
                                                .call("MAIL_HOST", "smtp.mailgun.org")
                                                .value()),
                                new ZPair("port", ___env.f.env(env).call("MAIL_PORT", 587).value()),
                                new ZPair(
                                        "from",
                                        ZVal.newArray(
                                                new ZPair(
                                                        "address",
                                                        ___env.f
                                                                .env(env)
                                                                .call(
                                                                        "MAIL_FROM_ADDRESS",
                                                                        "hello@example.com")
                                                                .value()),
                                                new ZPair(
                                                        "name",
                                                        ___env.f
                                                                .env(env)
                                                                .call("MAIL_FROM_NAME", "Example")
                                                                .value()))),
                                new ZPair(
                                        "encryption",
                                        ___env.f.env(env).call("MAIL_ENCRYPTION", "tls").value()),
                                new ZPair(
                                        "username",
                                        ___env.f.env(env).call("MAIL_USERNAME").value()),
                                new ZPair(
                                        "password",
                                        ___env.f.env(env).call("MAIL_PASSWORD").value()),
                                new ZPair("sendmail", "/usr/sbin/sendmail -bs"),
                                new ZPair(
                                        "markdown",
                                        ZVal.newArray(
                                                new ZPair("theme", "default"),
                                                new ZPair(
                                                        "paths",
                                                        ZVal.newArray(
                                                                new ZPair(
                                                                        0,
                                                                        resource_path
                                                                                .f
                                                                                .env(env)
                                                                                .call(
                                                                                        "views/vendor/mail")
                                                                                .value()))))))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants().setDir("/config").setFile("/config/mail.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope209 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
