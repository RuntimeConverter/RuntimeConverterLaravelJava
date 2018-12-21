package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Encryption.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Encryption.classes.Encrypter;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.ServiceProvider;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Encryption/EncryptionServiceProvider.php

*/

public class EncryptionServiceProvider extends ServiceProvider {

    public EncryptionServiceProvider(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == EncryptionServiceProvider.class) {
            this.__construct(env, args);
        }
    }

    public EncryptionServiceProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object register(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Encryption")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Encryption/EncryptionServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                EncryptionServiceProvider.class,
                "encrypter",
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Encryption",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object app = assignParameter(args, 0, false);
                        ReferenceContainer config = new BasicReferenceContainer(null);
                        Object key = null;
                        config.setObject(
                                env.callMethod(
                                        env.callMethod(
                                                app,
                                                "make",
                                                EncryptionServiceProvider.class,
                                                "config"),
                                        "get",
                                        EncryptionServiceProvider.class,
                                        "app"));
                        if (ZVal.isTrue(
                                Str.runtimeStaticObject.startsWith(
                                        env,
                                        key =
                                                EncryptionServiceProvider.this.key(
                                                        env, config.getObject()),
                                        "base64:"))) {
                            key =
                                    NamespaceGlobal.base64_decode
                                            .env(env)
                                            .call(function_substr.f.env(env).call(key, 7).value())
                                            .value();
                        }

                        return ZVal.assign(new Encrypter(env, key, config.arrayGet(env, "cipher")));
                    }
                });
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object key(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Encryption")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Encryption/EncryptionServiceProvider.php");
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                config.arrayGet(env, "key"),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Encryption",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "key")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object key = assignParameter(args, 0, false);
                                        if (ZVal.isEmpty(key)) {
                                            throw ZVal.getException(
                                                    env,
                                                    new RuntimeException(
                                                            env,
                                                            "No application encryption key has been specified."));
                                        }

                                        return null;
                                    }
                                })
                        .value());
    }

    public static final Object CONST_class = "Illuminate\\Encryption\\EncryptionServiceProvider";

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
                    .setName("Illuminate\\Encryption\\EncryptionServiceProvider")
                    .setLookup(
                            EncryptionServiceProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "defer")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Encryption/EncryptionServiceProvider.php")
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
