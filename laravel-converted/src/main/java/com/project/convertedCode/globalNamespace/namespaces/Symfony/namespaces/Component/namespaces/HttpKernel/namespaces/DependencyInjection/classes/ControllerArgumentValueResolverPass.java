package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DependencyInjection.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Controller.namespaces.ArgumentResolver.classes.TraceableValueResolver;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/DependencyInjection/ControllerArgumentValueResolverPass.php

*/

public class ControllerArgumentValueResolverPass extends RuntimeClassBase {

    public Object argumentResolverService = null;

    public Object argumentValueResolverTag = null;

    public Object traceableResolverStopwatch = null;

    public ControllerArgumentValueResolverPass(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ControllerArgumentValueResolverPass.class) {
            this.__construct(env, args);
        }
    }

    public ControllerArgumentValueResolverPass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "argumentResolverService", typeHint = "string")
    @ConvertedParameter(index = 1, name = "argumentValueResolverTag", typeHint = "string")
    @ConvertedParameter(index = 2, name = "traceableResolverStopwatch", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object argumentResolverService = assignParameter(args, 0, true);
        if (null == argumentResolverService) {
            argumentResolverService = "argument_resolver";
        }
        Object argumentValueResolverTag = assignParameter(args, 1, true);
        if (null == argumentValueResolverTag) {
            argumentValueResolverTag = "controller.argument_value_resolver";
        }
        Object traceableResolverStopwatch = assignParameter(args, 2, true);
        if (null == traceableResolverStopwatch) {
            traceableResolverStopwatch = "debug.stopwatch";
        }
        this.argumentResolverService = argumentResolverService;
        this.argumentValueResolverTag = argumentValueResolverTag;
        this.traceableResolverStopwatch = traceableResolverStopwatch;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Symfony\\Component\\DependencyInjection\\ContainerBuilder"
    )
    public Object process(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        Object resolvers = null;
        Object resolverReference = null;
        Object id = null;
        if (!ZVal.isTrue(
                env.callMethod(
                        container,
                        "hasDefinition",
                        ControllerArgumentValueResolverPass.class,
                        this.argumentResolverService))) {
            return null;
        }

        resolvers =
                env.callMethod(
                        this,
                        "findAndSortTaggedServices",
                        ControllerArgumentValueResolverPass.class,
                        this.argumentValueResolverTag,
                        container);
        if (ZVal.toBool(
                        ZVal.toBool(
                                        env.callMethod(
                                                container,
                                                "getParameter",
                                                ControllerArgumentValueResolverPass.class,
                                                "kernel.debug"))
                                && ZVal.toBool(
                                        function_class_exists
                                                .f
                                                .env(env)
                                                .call("Symfony\\Component\\Stopwatch\\Stopwatch")
                                                .value()))
                && ZVal.toBool(
                        env.callMethod(
                                container,
                                "has",
                                ControllerArgumentValueResolverPass.class,
                                this.traceableResolverStopwatch))) {
            for (ZPair zpairResult1931 : ZVal.getIterable(resolvers, env, true)) {
                resolverReference = ZVal.assign(zpairResult1931.getValue());
                id = ZVal.assign(toStringR(resolverReference, env));
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        container,
                                        "register",
                                        ControllerArgumentValueResolverPass.class,
                                        "debug." + toStringR(id, env),
                                        TraceableValueResolver.CONST_class),
                                "setDecoratedService",
                                ControllerArgumentValueResolverPass.class,
                                id),
                        "setArguments",
                        ControllerArgumentValueResolverPass.class,
                        ZVal.newArray(
                                new ZPair(
                                        0,
                                        env.createNew(
                                                ZVal.resolveClassAlias(env, "Reference"),
                                                "debug." + toStringR(id, env) + ".inner")),
                                new ZPair(
                                        1,
                                        env.createNew(
                                                ZVal.resolveClassAlias(env, "Reference"),
                                                this.traceableResolverStopwatch))));
            }
        }

        env.callMethod(
                env.callMethod(
                        container,
                        "getDefinition",
                        ControllerArgumentValueResolverPass.class,
                        this.argumentResolverService),
                "replaceArgument",
                ControllerArgumentValueResolverPass.class,
                1,
                env.createNew(ZVal.resolveClassAlias(env, "IteratorArgument"), resolvers));
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\DependencyInjection\\ControllerArgumentValueResolverPass";

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
                            "Symfony\\Component\\HttpKernel\\DependencyInjection\\ControllerArgumentValueResolverPass")
                    .setLookup(
                            ControllerArgumentValueResolverPass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "argumentResolverService",
                            "argumentValueResolverTag",
                            "traceableResolverStopwatch")
                    .setFilename(
                            "vendor/symfony/http-kernel/DependencyInjection/ControllerArgumentValueResolverPass.php")
                    .addInterface("CompilerPassInterface")
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
