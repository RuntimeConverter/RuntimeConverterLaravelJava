package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
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
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Routing/ControllerMiddlewareOptions.php

*/

public class ControllerMiddlewareOptions extends RuntimeClassBase {

    public Object options = null;

    public ControllerMiddlewareOptions(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ControllerMiddlewareOptions.class) {
            this.__construct(env, args);
        }
    }

    public ControllerMiddlewareOptions(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options", typeHint = "array")
    public Object __construct(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer options = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        this.options = options.getObject();
        return null;
    }

    public Object __construct(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
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

    public static final Object CONST_class = "Illuminate\\Routing\\ControllerMiddlewareOptions";

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
                    .setName("Illuminate\\Routing\\ControllerMiddlewareOptions")
                    .setLookup(
                            ControllerMiddlewareOptions.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("options")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Routing/ControllerMiddlewareOptions.php")
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
