package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Container.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Container/ContextualBindingBuilder.php

*/

public class ContextualBindingBuilder extends RuntimeClassBase
        implements com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Contracts
                .namespaces
                .Container
                .classes
                .ContextualBindingBuilder {

    public Object container = null;

    public Object concrete = null;

    public Object needs = null;

    public ContextualBindingBuilder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ContextualBindingBuilder.class) {
            this.__construct(env, args);
        }
    }

    public ContextualBindingBuilder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Illuminate\\Container\\Container"
    )
    @ConvertedParameter(index = 1, name = "concrete")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        Object concrete = assignParameter(args, 1, false);
        this.concrete = concrete;
        this.container = container;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    public Object needs(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        this.needs = _pAbstract;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "implementation")
    public Object give(RuntimeEnv env, Object... args) {
        Object implementation = assignParameter(args, 0, false);
        env.callMethod(
                this.container,
                "addContextualBinding",
                ContextualBindingBuilder.class,
                this.concrete,
                this.needs,
                implementation);
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Container\\ContextualBindingBuilder";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Container\\ContextualBindingBuilder")
                    .setLookup(
                            ContextualBindingBuilder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("concrete", "container", "needs")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Container/ContextualBindingBuilder.php")
                    .addInterface("Illuminate\\Contracts\\Container\\ContextualBindingBuilder")
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
