package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes;

import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.ServiceProvider;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/AggregateServiceProvider.php

*/

public class AggregateServiceProvider extends ServiceProvider {

    public Object providers = ZVal.newArray();

    public Object instances = ZVal.newArray();

    public AggregateServiceProvider(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AggregateServiceProvider.class) {
            this.__construct(env, args);
        }
    }

    public AggregateServiceProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object register(RuntimeEnv env, Object... args) {
        Object provider = null;
        this.instances = ZVal.newArray();
        for (ZPair zpairResult541 : ZVal.getIterable(this.providers, env, true)) {
            provider = ZVal.assign(zpairResult541.getValue());
            new ReferenceClassProperty(this, "instances", env)
                    .arrayAppend(env)
                    .set(
                            env.callMethod(
                                    toObjectR(this).accessProp(this, env).name("app").value(),
                                    "register",
                                    AggregateServiceProvider.class,
                                    provider));
        }

        return null;
    }

    @ConvertedMethod
    public Object provides(RuntimeEnv env, Object... args) {
        Object instance = null;
        Object provider = null;
        Object provides = null;
        provides = ZVal.newArray();
        for (ZPair zpairResult542 : ZVal.getIterable(this.providers, env, true)) {
            provider = ZVal.assign(zpairResult542.getValue());
            instance =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("app").value(),
                            "resolveProvider",
                            AggregateServiceProvider.class,
                            provider);
            provides =
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    provides,
                                    env.callMethod(
                                            instance, "provides", AggregateServiceProvider.class))
                            .value();
        }

        return ZVal.assign(provides);
    }

    public static final Object CONST_class = "Illuminate\\Support\\AggregateServiceProvider";

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
                    .setName("Illuminate\\Support\\AggregateServiceProvider")
                    .setLookup(
                            AggregateServiceProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "defer", "instances", "providers")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Support/AggregateServiceProvider.php")
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
