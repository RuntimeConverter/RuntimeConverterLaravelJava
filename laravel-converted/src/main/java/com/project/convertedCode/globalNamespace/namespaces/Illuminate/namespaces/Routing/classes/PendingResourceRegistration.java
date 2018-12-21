package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes;

import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Routing/PendingResourceRegistration.php

*/

public class PendingResourceRegistration extends RuntimeClassBase {

    public Object registrar = null;

    public Object name = null;

    public Object controller = null;

    public Object options = ZVal.newArray();

    public Object registered = false;

    public PendingResourceRegistration(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PendingResourceRegistration.class) {
            this.__construct(env, args);
        }
    }

    public PendingResourceRegistration(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "registrar",
        typeHint = "Illuminate\\Routing\\ResourceRegistrar"
    )
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(index = 2, name = "controller")
    @ConvertedParameter(index = 3, name = "options", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object registrar = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        Object controller = assignParameter(args, 2, false);
        Object options = assignParameter(args, 3, false);
        this.name = name;
        this.options = options;
        this.registrar = registrar;
        this.controller = controller;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methods")
    public Object only(RuntimeEnv env, Object... args) {
        Object methods = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "options", env)
                .arrayAccess(env, "only")
                .set(
                        function_is_array.f.env(env).call(methods).getBool()
                                ? methods
                                : function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value());
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methods")
    public Object except(RuntimeEnv env, Object... args) {
        Object methods = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "options", env)
                .arrayAccess(env, "except")
                .set(
                        function_is_array.f.env(env).call(methods).getBool()
                                ? methods
                                : function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value());
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "names")
    public Object names(RuntimeEnv env, Object... args) {
        Object names = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "options", env).arrayAccess(env, "names").set(names);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "name")
    public Object name(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "options", env)
                .arrayAccess(env, "names", method)
                .set(name);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters")
    public Object parameters(RuntimeEnv env, Object... args) {
        Object parameters = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "options", env)
                .arrayAccess(env, "parameters")
                .set(parameters);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "previous")
    @ConvertedParameter(index = 1, name = "new")
    public Object parameter(RuntimeEnv env, Object... args) {
        Object previous = assignParameter(args, 0, false);
        Object _pNew = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "options", env)
                .arrayAccess(env, "parameters", previous)
                .set(_pNew);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "middleware")
    public Object middleware(RuntimeEnv env, Object... args) {
        Object middleware = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "options", env)
                .arrayAccess(env, "middleware")
                .set(middleware);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object register(RuntimeEnv env, Object... args) {
        this.registered = true;
        return ZVal.assign(
                env.callMethod(
                        this.registrar,
                        "register",
                        PendingResourceRegistration.class,
                        this.name,
                        this.controller,
                        this.options));
    }

    @ConvertedMethod
    public Object __destruct(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.registered)) {
            this.register(env);
        }

        return null;
    }

    public static final Object CONST_class = "Illuminate\\Routing\\PendingResourceRegistration";

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
                    .setName("Illuminate\\Routing\\PendingResourceRegistration")
                    .setLookup(
                            PendingResourceRegistration.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("controller", "name", "options", "registered", "registrar")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Routing/PendingResourceRegistration.php")
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
