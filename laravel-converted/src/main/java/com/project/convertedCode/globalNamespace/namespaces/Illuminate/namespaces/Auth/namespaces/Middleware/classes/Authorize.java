package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Middleware.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.Model;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.assignParameter;
import static com.runtimeconverter.runtime.ZVal.assignParameterVarArgs;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Auth/Middleware/Authorize.php

*/

public class Authorize extends RuntimeClassBase {

    public Object auth = null;

    public Object gate = null;

    public Authorize(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Authorize.class) {
            this.__construct(env, args);
        }
    }

    public Authorize(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "auth", typeHint = "Illuminate\\Contracts\\Auth\\Factory")
    @ConvertedParameter(
        index = 1,
        name = "gate",
        typeHint = "Illuminate\\Contracts\\Auth\\Access\\Gate"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object auth = assignParameter(args, 0, false);
        Object gate = assignParameter(args, 1, false);
        this.auth = auth;
        this.gate = gate;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "next", typeHint = "Closure")
    @ConvertedParameter(index = 2, name = "ability")
    @ConvertedParameter(index = 3, name = "models")
    public Object handle(RuntimeEnv env, Object... args) {
        ReferenceContainer request = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object next = assignParameter(args, 1, false);
        Object ability = assignParameter(args, 2, false);
        Object models = assignParameterVarArgs(args, 3);
        env.callMethod(this.auth, "authenticate", Authorize.class);
        env.callMethod(
                this.gate,
                "authorize",
                Authorize.class,
                ability,
                this.getGateArguments(env, request.getObject(), models));
        return ZVal.assign(
                env.callFunctionDynamic(
                                next,
                                new RuntimeArgsWithReferences().add(0, request),
                                request.getObject())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "models")
    protected Object getGateArguments(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Auth/Middleware")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Auth/Middleware/Authorize.php");
        Object request = assignParameter(args, 0, false);
        Object models = assignParameter(args, 1, false);
        if (function_is_null.f.env(env).call(models).getBool()) {
            return ZVal.assign(ZVal.newArray());
        }

        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                collect.f.env(env).call(models).value(),
                                "map",
                                Authorize.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Auth\\Middleware",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "model")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object model = assignParameter(args, 0, false);
                                        Object request = null;
                                        request =
                                                this.contextReferences.getCapturedValue("request");
                                        return ZVal.assign(
                                                ZVal.isTrue(
                                                                ZVal.checkInstanceType(
                                                                        model,
                                                                        Model.class,
                                                                        "Illuminate\\Database\\Eloquent\\Model"))
                                                        ? model
                                                        : Authorize.this.getModel(
                                                                env, request, model));
                                    }
                                }.use("request", request)),
                        "all",
                        Authorize.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "model")
    protected Object getModel(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object model = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.isTrue(this.isClassName(env, model))
                        ? model
                        : env.callMethod(request, "route", Authorize.class, model));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object isClassName(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        function_strpos.f.env(env).call(value, "\\").value(), "!==", false));
    }

    public static final Object CONST_class = "Illuminate\\Auth\\Middleware\\Authorize";

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
                    .setName("Illuminate\\Auth\\Middleware\\Authorize")
                    .setLookup(
                            Authorize.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("auth", "gate")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Auth/Middleware/Authorize.php")
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
