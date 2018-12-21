package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Providers.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.functions.validator;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.classes.Request;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Providers.classes.FormRequestServiceProvider;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.AggregateServiceProvider;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.URL;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;
import static com.runtimeconverter.runtime.ZVal.assignParameterVarArgs;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Providers/FoundationServiceProvider.php

*/

public class FoundationServiceProvider extends AggregateServiceProvider {

    public FoundationServiceProvider(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.providers = ZVal.newArray(new ZPair(0, FormRequestServiceProvider.CONST_class));
        if (this.getClass() == FoundationServiceProvider.class) {
            this.__construct(env, args);
        }
    }

    public FoundationServiceProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object register(RuntimeEnv env, Object... args) {
        super.register(env);
        this.registerRequestValidation(env);
        this.registerRequestSignatureValidation(env);
        return null;
    }

    @ConvertedMethod
    public Object registerRequestValidation(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Providers")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Providers/FoundationServiceProvider.php");
        Request.runtimeStaticObject.macro(
                env,
                "validate",
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Foundation\\Providers",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "rules", typeHint = "array")
                    @ConvertedParameter(index = 1, name = "params")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        PassByReferenceArgs rLastRefArgs;
                        Object rules = assignParameter(args, 0, false);
                        Object params = assignParameterVarArgs(args, 1);
                        return ZVal.assign(
                                env.callMethod(
                                        validator.f.env(env).call().value(),
                                        rLastRefArgs =
                                                new RuntimeArgsWithReferences()
                                                        .add(
                                                                0,
                                                                handleReturnReference(
                                                                        env.callMethod(
                                                                                _closureThisVar,
                                                                                "all",
                                                                                FoundationServiceProvider
                                                                                        .class))),
                                        "validate",
                                        FoundationServiceProvider.class,
                                        PackedVaradicArgs.unpack(
                                                rLastRefArgs.get(0),
                                                rules,
                                                new PackedVaradicArgs(params))));
                    }
                });
        return null;
    }

    @ConvertedMethod
    public Object registerRequestSignatureValidation(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Providers")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Providers/FoundationServiceProvider.php");
        Request.runtimeStaticObject.macro(
                env,
                "hasValidSignature",
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Foundation\\Providers",
                        this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        return ZVal.assign(
                                URL.runtimeStaticObject.callUnknownStaticMethod(
                                        env,
                                        "hasValidSignature",
                                        new RuntimeArgsWithReferences(),
                                        _closureThisVar));
                    }
                });
        return null;
    }

    public static final Object CONST_class =
            "Illuminate\\Foundation\\Providers\\FoundationServiceProvider";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends AggregateServiceProvider.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Foundation\\Providers\\FoundationServiceProvider")
                    .setLookup(
                            FoundationServiceProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "defer", "instances", "providers", "providers")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Providers/FoundationServiceProvider.php")
                    .addExtendsClass("Illuminate\\Support\\AggregateServiceProvider")
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
