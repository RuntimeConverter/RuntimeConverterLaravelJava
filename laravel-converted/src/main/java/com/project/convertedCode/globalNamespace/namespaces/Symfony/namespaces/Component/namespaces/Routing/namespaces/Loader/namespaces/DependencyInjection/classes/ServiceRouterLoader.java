package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Loader.namespaces.DependencyInjection.classes;

import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Loader.classes.ObjectRouteLoader;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
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

 vendor/symfony/routing/Loader/DependencyInjection/ServiceRouterLoader.php

*/

public class ServiceRouterLoader extends ObjectRouteLoader {

    public Object container = null;

    public ServiceRouterLoader(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ServiceRouterLoader.class) {
            this.__construct(env, args);
        }
    }

    public ServiceRouterLoader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Psr\\Container\\ContainerInterface"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        this.container = container;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    protected Object getServiceObject(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this.container, "get", ServiceRouterLoader.class, id));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Routing\\Loader\\DependencyInjection\\ServiceRouterLoader";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ObjectRouteLoader.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\Routing\\Loader\\DependencyInjection\\ServiceRouterLoader")
                    .setLookup(
                            ServiceRouterLoader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("container")
                    .setFilename(
                            "vendor/symfony/routing/Loader/DependencyInjection/ServiceRouterLoader.php")
                    .addExtendsClass("Symfony\\Component\\Routing\\Loader\\ObjectRouteLoader")
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
