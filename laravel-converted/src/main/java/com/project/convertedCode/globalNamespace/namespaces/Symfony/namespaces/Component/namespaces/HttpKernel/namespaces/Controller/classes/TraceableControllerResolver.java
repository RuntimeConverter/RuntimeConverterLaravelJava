package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Controller.classes;

import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Controller.classes.ControllerResolverInterface;
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

 vendor/symfony/http-kernel/Controller/TraceableControllerResolver.php

*/

public class TraceableControllerResolver extends RuntimeClassBase
        implements ControllerResolverInterface {

    public Object resolver = null;

    public Object stopwatch = null;

    public TraceableControllerResolver(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TraceableControllerResolver.class) {
            this.__construct(env, args);
        }
    }

    public TraceableControllerResolver(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "resolver",
        typeHint = "Symfony\\Component\\HttpKernel\\Controller\\ControllerResolverInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "stopwatch",
        typeHint = "Symfony\\Component\\Stopwatch\\Stopwatch"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object resolver = assignParameter(args, 0, false);
        Object stopwatch = assignParameter(args, 1, false);
        this.resolver = resolver;
        this.stopwatch = stopwatch;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    public Object getController(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object ret = null;
        Object e = null;
        e =
                env.callMethod(
                        this.stopwatch,
                        "start",
                        TraceableControllerResolver.class,
                        "controller.get_callable");
        ret =
                env.callMethod(
                        this.resolver, "getController", TraceableControllerResolver.class, request);
        env.callMethod(e, "stop", TraceableControllerResolver.class);
        return ZVal.assign(ret);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\Controller\\TraceableControllerResolver";

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
                            "Symfony\\Component\\HttpKernel\\Controller\\TraceableControllerResolver")
                    .setLookup(
                            TraceableControllerResolver.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("resolver", "stopwatch")
                    .setFilename(
                            "vendor/symfony/http-kernel/Controller/TraceableControllerResolver.php")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\Controller\\ControllerResolverInterface")
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
