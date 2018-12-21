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

 config/session.php

*/

public class file_session_php implements RuntimeIncludable {

    public static final file_session_php instance = new file_session_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope212 scope = new Scope212();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope212 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "driver",
                                        ___env.f.env(env).call("SESSION_DRIVER", "file").value()),
                                new ZPair(
                                        "lifetime",
                                        ___env.f.env(env).call("SESSION_LIFETIME", 120).value()),
                                new ZPair("expire_on_close", false),
                                new ZPair("encrypt", false),
                                new ZPair(
                                        "files",
                                        storage_path.f.env(env).call("framework/sessions").value()),
                                new ZPair("connection", ZVal.getNull()),
                                new ZPair("table", "sessions"),
                                new ZPair("store", ZVal.getNull()),
                                new ZPair("lottery", ZVal.arrayFromList(2, 100)),
                                new ZPair(
                                        "cookie",
                                        ___env.f
                                                .env(env)
                                                .call(
                                                        "SESSION_COOKIE",
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
                                                                + "_session")
                                                .value()),
                                new ZPair("path", "/"),
                                new ZPair(
                                        "domain",
                                        ___env.f
                                                .env(env)
                                                .call("SESSION_DOMAIN", ZVal.getNull())
                                                .value()),
                                new ZPair(
                                        "secure",
                                        ___env.f
                                                .env(env)
                                                .call("SESSION_SECURE_COOKIE", false)
                                                .value()),
                                new ZPair("http_only", true),
                                new ZPair("same_site", ZVal.getNull()))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants().setDir("/config").setFile("/config/session.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope212 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
