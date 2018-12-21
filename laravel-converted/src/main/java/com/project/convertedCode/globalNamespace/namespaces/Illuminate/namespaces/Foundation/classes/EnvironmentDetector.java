package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.functions.head;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/EnvironmentDetector.php

*/

public class EnvironmentDetector extends RuntimeClassBase {

    public EnvironmentDetector(RuntimeEnv env, Object... args) {
        super(env);
    }

    public EnvironmentDetector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    @ConvertedParameter(
        index = 1,
        name = "consoleArgs",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object detect(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        Object consoleArgs = assignParameter(args, 1, true);
        if (null == consoleArgs) {
            consoleArgs = ZVal.getNull();
        }
        if (ZVal.isTrue(consoleArgs)) {
            return ZVal.assign(this.detectConsoleEnvironment(env, callback, consoleArgs));
        }

        return ZVal.assign(this.detectWebEnvironment(env, callback));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    protected Object detectWebEnvironment(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        return ZVal.assign(
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(callback)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    @ConvertedParameter(index = 1, name = "args", typeHint = "array")
    protected Object detectConsoleEnvironment(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        Object ___args = assignParameter(args, 1, false);
        Object value = null;
        if (!function_is_null
                .f
                .env(env)
                .call(value = this.getEnvironmentArgument(env, ___args))
                .getBool()) {
            return ZVal.assign(
                    head.f
                            .env(env)
                            .call(
                                    function_array_slice
                                            .f
                                            .env(env)
                                            .call(
                                                    function_explode
                                                            .f
                                                            .env(env)
                                                            .call("=", value)
                                                            .value(),
                                                    1)
                                            .value())
                            .value());
        }

        return ZVal.assign(this.detectWebEnvironment(env, callback));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args", typeHint = "array")
    protected Object getEnvironmentArgument(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Foundation")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/EnvironmentDetector.php");
        Object ___args = assignParameter(args, 0, false);
        return ZVal.assign(
                Arr.runtimeStaticObject.first(
                        env,
                        ___args,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Foundation",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "value")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object value = assignParameter(args, 0, false);
                                return ZVal.assign(
                                        Str.runtimeStaticObject.startsWith(env, value, "--env"));
                            }
                        }));
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\EnvironmentDetector";

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
                    .setName("Illuminate\\Foundation\\EnvironmentDetector")
                    .setLookup(
                            EnvironmentDetector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/EnvironmentDetector.php")
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
