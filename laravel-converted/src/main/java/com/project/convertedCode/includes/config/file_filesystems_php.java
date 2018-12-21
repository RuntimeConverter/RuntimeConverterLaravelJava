package com.project.convertedCode.includes.config;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.project.convertedCode.globalNamespace.functions.storage_path;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.functions.___env;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 config/filesystems.php

*/

public class file_filesystems_php implements RuntimeIncludable {

    public static final file_filesystems_php instance = new file_filesystems_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope206 scope = new Scope206();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope206 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "default",
                                        ___env.f
                                                .env(env)
                                                .call("FILESYSTEM_DRIVER", "local")
                                                .value()),
                                new ZPair(
                                        "cloud",
                                        ___env.f.env(env).call("FILESYSTEM_CLOUD", "s3").value()),
                                new ZPair(
                                        "disks",
                                        ZVal.newArray(
                                                new ZPair(
                                                        "local",
                                                        ZVal.newArray(
                                                                new ZPair("driver", "local"),
                                                                new ZPair(
                                                                        "root",
                                                                        storage_path
                                                                                .f
                                                                                .env(env)
                                                                                .call("app")
                                                                                .value()))),
                                                new ZPair(
                                                        "public",
                                                        ZVal.newArray(
                                                                new ZPair("driver", "local"),
                                                                new ZPair(
                                                                        "root",
                                                                        storage_path
                                                                                .f
                                                                                .env(env)
                                                                                .call("app/public")
                                                                                .value()),
                                                                new ZPair(
                                                                        "url",
                                                                        toStringR(
                                                                                        ___env.f
                                                                                                .env(
                                                                                                        env)
                                                                                                .call(
                                                                                                        "APP_URL")
                                                                                                .value(),
                                                                                        env)
                                                                                + "/storage"),
                                                                new ZPair("visibility", "public"))),
                                                new ZPair(
                                                        "s3",
                                                        ZVal.newArray(
                                                                new ZPair("driver", "s3"),
                                                                new ZPair(
                                                                        "key",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "AWS_ACCESS_KEY_ID")
                                                                                .value()),
                                                                new ZPair(
                                                                        "secret",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "AWS_SECRET_ACCESS_KEY")
                                                                                .value()),
                                                                new ZPair(
                                                                        "region",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "AWS_DEFAULT_REGION")
                                                                                .value()),
                                                                new ZPair(
                                                                        "bucket",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call("AWS_BUCKET")
                                                                                .value()),
                                                                new ZPair(
                                                                        "url",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call("AWS_URL")
                                                                                .value()))))))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants().setDir("/config").setFile("/config/filesystems.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope206 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
