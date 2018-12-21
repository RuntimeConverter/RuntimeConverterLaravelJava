package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DependencyInjection.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Fragment.classes.FragmentHandler;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/DependencyInjection/LazyLoadingFragmentHandler.php

*/

public class LazyLoadingFragmentHandler extends FragmentHandler {

    public Object container = null;

    public Object initialized = ZVal.newArray();

    public LazyLoadingFragmentHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == LazyLoadingFragmentHandler.class) {
            this.__construct(env, args);
        }
    }

    public LazyLoadingFragmentHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Psr\\Container\\ContainerInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "requestStack",
        typeHint = "Symfony\\Component\\HttpFoundation\\RequestStack"
    )
    @ConvertedParameter(
        index = 2,
        name = "debug",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        Object requestStack = assignParameter(args, 1, false);
        Object debug = assignParameter(args, 2, true);
        if (null == debug) {
            debug = false;
        }
        this.container = container;
        super.__construct(env, requestStack, ZVal.newArray(), debug);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    @ConvertedParameter(index = 1, name = "renderer")
    @ConvertedParameter(
        index = 2,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object render(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        Object renderer = assignParameter(args, 1, true);
        if (null == renderer) {
            renderer = "inline";
        }
        Object options = assignParameter(args, 2, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        if (ZVal.toBool(
                        !arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "initialized", env),
                                env,
                                renderer))
                && ZVal.toBool(
                        env.callMethod(
                                this.container,
                                "has",
                                LazyLoadingFragmentHandler.class,
                                renderer))) {
            env.callMethod(
                    this,
                    "addRenderer",
                    LazyLoadingFragmentHandler.class,
                    env.callMethod(
                            this.container, "get", LazyLoadingFragmentHandler.class, renderer));
            new ReferenceClassProperty(this, "initialized", env)
                    .arrayAccess(env, renderer)
                    .set(true);
        }

        return ZVal.assign(super.render(env, uri, renderer, options));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\DependencyInjection\\LazyLoadingFragmentHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends FragmentHandler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\HttpKernel\\DependencyInjection\\LazyLoadingFragmentHandler")
                    .setLookup(
                            LazyLoadingFragmentHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "container", "debug", "initialized", "renderers", "requestStack")
                    .setFilename(
                            "vendor/symfony/http-kernel/DependencyInjection/LazyLoadingFragmentHandler.php")
                    .addExtendsClass("Symfony\\Component\\HttpKernel\\Fragment\\FragmentHandler")
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
