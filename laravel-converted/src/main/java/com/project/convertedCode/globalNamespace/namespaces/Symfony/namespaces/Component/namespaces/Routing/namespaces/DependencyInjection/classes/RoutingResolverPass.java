package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.DependencyInjection.classes;

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

 vendor/symfony/routing/DependencyInjection/RoutingResolverPass.php

*/

public class RoutingResolverPass extends RuntimeClassBase {

    public Object resolverServiceId = null;

    public Object loaderTag = null;

    public RoutingResolverPass(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RoutingResolverPass.class) {
            this.__construct(env, args);
        }
    }

    public RoutingResolverPass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resolverServiceId", typeHint = "string")
    @ConvertedParameter(index = 1, name = "loaderTag", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object resolverServiceId = assignParameter(args, 0, true);
        if (null == resolverServiceId) {
            resolverServiceId = "routing.resolver";
        }
        Object loaderTag = assignParameter(args, 1, true);
        if (null == loaderTag) {
            loaderTag = "routing.loader";
        }
        this.resolverServiceId = resolverServiceId;
        this.loaderTag = loaderTag;
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
        Object definition = null;
        Object id = null;
        if (ZVal.strictEqualityCheck(
                false,
                "===",
                env.callMethod(
                        container,
                        "hasDefinition",
                        RoutingResolverPass.class,
                        this.resolverServiceId))) {
            return null;
        }

        definition =
                env.callMethod(
                        container,
                        "getDefinition",
                        RoutingResolverPass.class,
                        this.resolverServiceId);
        for (ZPair zpairResult2009 :
                ZVal.getIterable(
                        env.callMethod(
                                this,
                                "findAndSortTaggedServices",
                                RoutingResolverPass.class,
                                this.loaderTag,
                                container),
                        env,
                        true)) {
            id = ZVal.assign(zpairResult2009.getValue());
            env.callMethod(
                    definition,
                    "addMethodCall",
                    RoutingResolverPass.class,
                    "addLoader",
                    ZVal.newArray(
                            new ZPair(
                                    0,
                                    env.createNew(ZVal.resolveClassAlias(env, "Reference"), id))));
        }

        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Routing\\DependencyInjection\\RoutingResolverPass";

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
                            "Symfony\\Component\\Routing\\DependencyInjection\\RoutingResolverPass")
                    .setLookup(
                            RoutingResolverPass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("loaderTag", "resolverServiceId")
                    .setFilename(
                            "vendor/symfony/routing/DependencyInjection/RoutingResolverPass.php")
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
