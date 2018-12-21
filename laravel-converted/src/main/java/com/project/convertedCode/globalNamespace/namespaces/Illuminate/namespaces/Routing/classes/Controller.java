package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes.ControllerMiddlewareOptions;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Routing/Controller.php

*/

public abstract class Controller extends RuntimeClassBase {

    public Object middleware = ZVal.newArray();

    public Controller(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Controller(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "middleware")
    @ConvertedParameter(
        index = 1,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object middleware(RuntimeEnv env, Object... args) {
        Object middleware = assignParameter(args, 0, false);
        Object options = assignParameter(args, 1, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object m = null;
        for (ZPair zpairResult515 : ZVal.getIterable(rToArrayCast(middleware), env, true)) {
            m = ZVal.assign(zpairResult515.getValue());
            new ReferenceClassProperty(this, "middleware", env)
                    .arrayAppend(env)
                    .set(ZVal.newArray(new ZPair("middleware", m), new ZPair("options", options)));
        }

        return ZVal.assign(new ControllerMiddlewareOptions(env, options));
    }

    @ConvertedMethod
    public Object getMiddleware(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.middleware);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object callAction(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(ZVal.newArray(new ZPair(0, this), new ZPair(1, method)), parameters)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        throw ZVal.getException(
                env,
                new BadMethodCallException(
                        env,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "Method %s::%s does not exist.",
                                        ClassConstantUtils.getConstantValueLateStatic(
                                                env, this, "class"),
                                        method)
                                .value()));
    }

    public static final Object CONST_class = "Illuminate\\Routing\\Controller";

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
                    .setName("Illuminate\\Routing\\Controller")
                    .setLookup(
                            Controller.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("middleware")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Routing/Controller.php")
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
