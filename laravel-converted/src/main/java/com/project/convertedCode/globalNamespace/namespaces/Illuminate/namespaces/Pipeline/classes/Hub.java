package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Pipeline.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Pipeline.classes.Pipeline;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Pipeline/Hub.php

*/

public class Hub extends RuntimeClassBase
        implements com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Contracts
                .namespaces
                .Pipeline
                .classes
                .Hub {

    public Object container = null;

    public Object pipelines = ZVal.newArray();

    public Hub(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Hub.class) {
            this.__construct(env, args);
        }
    }

    public Hub(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Illuminate\\Contracts\\Container\\Container",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, true);
        if (null == container) {
            container = ZVal.getNull();
        }
        this.container = container;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    public Object defaults(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        return ZVal.assign(this.pipeline(env, "default", callback));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "Closure")
    public Object pipeline(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "pipelines", env).arrayAccess(env, name).set(callback);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "object")
    @ConvertedParameter(
        index = 1,
        name = "pipeline",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object pipe(RuntimeEnv env, Object... args) {
        Object _object = assignParameter(args, 0, false);
        Object pipeline = assignParameter(args, 1, true);
        if (null == pipeline) {
            pipeline = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        pipeline =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = pipeline)
                                ? ternaryExpressionTemp
                                : "default");
        return ZVal.assign(
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                new ReferenceClassProperty(this, "pipelines", env)
                                        .arrayGet(env, pipeline),
                                new Pipeline(env, this.container),
                                _object)
                        .value());
    }

    public static final Object CONST_class = "Illuminate\\Pipeline\\Hub";

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
                    .setName("Illuminate\\Pipeline\\Hub")
                    .setLookup(
                            Hub.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("container", "pipelines")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Pipeline/Hub.php")
                    .addInterface("Illuminate\\Contracts\\Pipeline\\Hub")
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
