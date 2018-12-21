package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Support.namespaces.Providers.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.ServiceProvider;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Gate;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Support/Providers/AuthServiceProvider.php

*/

public class AuthServiceProvider extends ServiceProvider {

    public Object policies = ZVal.newArray();

    public AuthServiceProvider(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AuthServiceProvider.class) {
            this.__construct(env, args);
        }
    }

    public AuthServiceProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object registerPolicies(RuntimeEnv env, Object... args) {
        Object value = null;
        Object key = null;
        for (ZPair zpairResult426 : ZVal.getIterable(this.policies, env, false)) {
            key = ZVal.assign(zpairResult426.getKey());
            value = ZVal.assign(zpairResult426.getValue());
            Gate.runtimeStaticObject.callUnknownStaticMethod(
                    env, "policy", new RuntimeArgsWithReferences(), key, value);
        }

        return null;
    }

    @ConvertedMethod
    public Object register(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    public Object policies(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.policies);
    }

    public static final Object CONST_class =
            "Illuminate\\Foundation\\Support\\Providers\\AuthServiceProvider";

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
                    .setName("Illuminate\\Foundation\\Support\\Providers\\AuthServiceProvider")
                    .setLookup(
                            AuthServiceProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "defer", "policies")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Support/Providers/AuthServiceProvider.php")
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
