package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Controller.namespaces.ArgumentResolver.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Controller.classes.ArgumentValueResolverInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.arrays.RuntimeIterable;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Controller/ArgumentResolver/TraceableValueResolver.php

*/

public final class TraceableValueResolver extends RuntimeClassBase
        implements ArgumentValueResolverInterface {

    public Object inner = null;

    public Object stopwatch = null;

    public TraceableValueResolver(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TraceableValueResolver.class) {
            this.__construct(env, args);
        }
    }

    public TraceableValueResolver(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "inner",
        typeHint = "Symfony\\Component\\HttpKernel\\Controller\\ArgumentValueResolverInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "stopwatch",
        typeHint = "Symfony\\Component\\Stopwatch\\Stopwatch"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object inner = assignParameter(args, 0, false);
        Object stopwatch = assignParameter(args, 1, false);
        this.inner = inner;
        this.stopwatch = stopwatch;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(
        index = 1,
        name = "argument",
        typeHint = "Symfony\\Component\\HttpKernel\\ControllerMetadata\\ArgumentMetadata"
    )
    public Object supports(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object argument = assignParameter(args, 1, false);
        Object method = null;
        Object _pReturn = null;
        method =
                toStringR(function_get_class.f.env(env).call(this.inner).value(), env)
                        + "::"
                        + toStringR("supports", env);
        env.callMethod(this.stopwatch, "start", TraceableValueResolver.class, method);
        _pReturn =
                env.callMethod(
                        this.inner, "supports", TraceableValueResolver.class, request, argument);
        env.callMethod(this.stopwatch, "stop", TraceableValueResolver.class, method);
        return ZVal.assign(_pReturn);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(
        index = 1,
        name = "argument",
        typeHint = "Symfony\\Component\\HttpKernel\\ControllerMetadata\\ArgumentMetadata"
    )
    public Object resolve(RuntimeEnv env, Object... args) {
        RuntimeIterable runtimeConverterYieldVariable = new RuntimeIterable(env);
        Object request = assignParameter(args, 0, false);
        Object argument = assignParameter(args, 1, false);
        Object method = null;
        method =
                toStringR(function_get_class.f.env(env).call(this.inner).value(), env)
                        + "::"
                        + toStringR("resolve", env);
        env.callMethod(this.stopwatch, "start", TraceableValueResolver.class, method);
        runtimeConverterYieldVariable.yieldFrom(
                env.callMethod(
                        this.inner, "resolve", TraceableValueResolver.class, request, argument));
        env.callMethod(this.stopwatch, "stop", TraceableValueResolver.class, method);
        return runtimeConverterYieldVariable;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\Controller\\ArgumentResolver\\TraceableValueResolver";

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
                    .setName(
                            "Symfony\\Component\\HttpKernel\\Controller\\ArgumentResolver\\TraceableValueResolver")
                    .setLookup(
                            TraceableValueResolver.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("inner", "stopwatch")
                    .setFilename(
                            "vendor/symfony/http-kernel/Controller/ArgumentResolver/TraceableValueResolver.php")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\Controller\\ArgumentValueResolverInterface")
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
