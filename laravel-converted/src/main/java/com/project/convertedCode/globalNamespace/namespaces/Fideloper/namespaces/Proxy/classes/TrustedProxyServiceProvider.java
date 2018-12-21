package com.project.convertedCode.globalNamespace.namespaces.Fideloper.namespaces.Proxy.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.functions.config_path;
import com.runtimeconverter.runtime.nativeFunctions.file.function_realpath;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.ServiceProvider;
import java.lang.Class;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.classes.Application;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fideloper/proxy/src/TrustedProxyServiceProvider.php

*/

public class TrustedProxyServiceProvider extends ServiceProvider {

    public TrustedProxyServiceProvider(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TrustedProxyServiceProvider.class) {
            this.__construct(env, args);
        }
    }

    public TrustedProxyServiceProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object boot(RuntimeEnv env, Object... args) {
        Object raw = null;
        Object ternaryExpressionTemp = null;
        Object source = null;
        source =
                ZVal.assign(
                        ZVal.isTrue(
                                        ternaryExpressionTemp =
                                                function_realpath
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                raw =
                                                                        toStringR(
                                                                                        env
                                                                                                .addRootFilesystemPrefix(
                                                                                                        "/vendor/fideloper/proxy/src"),
                                                                                        env)
                                                                                + "/../config/trustedproxy.php")
                                                        .value())
                                ? ternaryExpressionTemp
                                : raw);
        if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                toObjectR(this).accessProp(this, env).name("app").value(),
                                Application.class,
                                "Illuminate\\Foundation\\Application"))
                && ZVal.toBool(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("app").value(),
                                "runningInConsole",
                                TrustedProxyServiceProvider.class))) {
            env.callMethod(
                    this,
                    "publishes",
                    TrustedProxyServiceProvider.class,
                    ZVal.newArray(
                            new ZPair(
                                    source,
                                    config_path.f.env(env).call("trustedproxy.php").value())));

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        toObjectR(this).accessProp(this, env).name("app").value(),
                        (Class) null,
                        "LumenApplication",
                        env))) {
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("app").value(),
                    "configure",
                    TrustedProxyServiceProvider.class,
                    "trustedproxy");
        }

        if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                toObjectR(this).accessProp(this, env).name("app").value(),
                                Application.class,
                                "Illuminate\\Foundation\\Application"))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        toObjectR(this).accessProp(this, env).name("app").value(),
                                        "configurationIsCached",
                                        TrustedProxyServiceProvider.class)))) {
            env.callMethod(
                    this,
                    "mergeConfigFrom",
                    TrustedProxyServiceProvider.class,
                    source,
                    "trustedproxy");
        }

        return null;
    }

    @ConvertedMethod
    public Object register(RuntimeEnv env, Object... args) {
        return null;
    }

    public static final Object CONST_class = "Fideloper\\Proxy\\TrustedProxyServiceProvider";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ServiceProvider.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Fideloper\\Proxy\\TrustedProxyServiceProvider")
                    .setLookup(
                            TrustedProxyServiceProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "defer")
                    .setFilename("vendor/fideloper/proxy/src/TrustedProxyServiceProvider.php")
                    .addExtendsClass("Illuminate\\Support\\ServiceProvider")
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
