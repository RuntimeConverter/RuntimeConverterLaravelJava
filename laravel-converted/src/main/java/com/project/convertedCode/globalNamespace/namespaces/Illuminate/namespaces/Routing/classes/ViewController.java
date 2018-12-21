package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes.Controller;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.assignParameter;
import static com.runtimeconverter.runtime.ZVal.assignParameterVarArgs;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Routing/ViewController.php

*/

public class ViewController extends Controller {

    public Object view = null;

    public ViewController(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ViewController.class) {
            this.__construct(env, args);
        }
    }

    public ViewController(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "view", typeHint = "Illuminate\\Contracts\\View\\Factory")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object view = assignParameter(args, 0, false);
        this.view = view;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args")
    public Object __invoke(RuntimeEnv env, Object... args) {
        Object ___args = assignParameterVarArgs(args, 0);
        Object view = null;
        Object data = null;
        Object runtimeTempArrayResult81 = null;
        ZVal.list(
                runtimeTempArrayResult81 =
                        function_array_slice.f.env(env).call(___args, -2).value(),
                (view = listGet(runtimeTempArrayResult81, 0, env)),
                (data = listGet(runtimeTempArrayResult81, 1, env)));
        return ZVal.assign(env.callMethod(this.view, "make", ViewController.class, view, data));
    }

    public static final Object CONST_class = "Illuminate\\Routing\\ViewController";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Controller.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Routing\\ViewController")
                    .setLookup(
                            ViewController.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("middleware", "view")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Routing/ViewController.php")
                    .addExtendsClass("Illuminate\\Routing\\Controller")
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
