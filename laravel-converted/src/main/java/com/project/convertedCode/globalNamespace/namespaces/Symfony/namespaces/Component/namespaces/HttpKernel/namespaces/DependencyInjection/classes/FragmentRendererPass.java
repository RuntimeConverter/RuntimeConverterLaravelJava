package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DependencyInjection.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Fragment.classes.FragmentRendererInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/DependencyInjection/FragmentRendererPass.php

*/

public class FragmentRendererPass extends RuntimeClassBase {

    public Object handlerService = null;

    public Object rendererTag = null;

    public FragmentRendererPass(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FragmentRendererPass.class) {
            this.__construct(env, args);
        }
    }

    public FragmentRendererPass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "handlerService", typeHint = "string")
    @ConvertedParameter(index = 1, name = "rendererTag", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object handlerService = assignParameter(args, 0, true);
        if (null == handlerService) {
            handlerService = "fragment.handler";
        }
        Object rendererTag = assignParameter(args, 1, true);
        if (null == rendererTag) {
            rendererTag = "kernel.fragment_renderer";
        }
        this.handlerService = handlerService;
        this.rendererTag = rendererTag;
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
        Object r = null;
        Object def = null;
        ReferenceContainer renderers = new BasicReferenceContainer(null);
        Object definition = null;
        Object id = null;
        ReferenceContainer tag = new BasicReferenceContainer(null);
        Object _pClass = null;
        Object tags = null;
        if (!ZVal.isTrue(
                env.callMethod(
                        container,
                        "hasDefinition",
                        FragmentRendererPass.class,
                        this.handlerService))) {
            return null;
        }

        definition =
                env.callMethod(
                        container,
                        "getDefinition",
                        FragmentRendererPass.class,
                        this.handlerService);
        renderers.setObject(ZVal.newArray());
        for (ZPair zpairResult1932 :
                ZVal.getIterable(
                        env.callMethod(
                                container,
                                "findTaggedServiceIds",
                                FragmentRendererPass.class,
                                this.rendererTag,
                                true),
                        env,
                        false)) {
            id = ZVal.assign(zpairResult1932.getKey());
            tags = ZVal.assign(zpairResult1932.getValue());
            def = env.callMethod(container, "getDefinition", FragmentRendererPass.class, id);
            _pClass =
                    env.callMethod(
                            env.callMethod(
                                    container, "getParameterBag", FragmentRendererPass.class),
                            "resolveValue",
                            FragmentRendererPass.class,
                            env.callMethod(def, "getClass", FragmentRendererPass.class));
            if (!ZVal.isTrue(
                    r =
                            env.callMethod(
                                    container,
                                    "getReflectionClass",
                                    FragmentRendererPass.class,
                                    _pClass))) {
                throw ZVal.getException(
                        env,
                        env.createNew(
                                ZVal.resolveClassAlias(env, "InvalidArgumentException"),
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Class \"%s\" used for service \"%s\" cannot be found.",
                                                _pClass, id)
                                        .value()));
            }

            if (!ZVal.isTrue(
                    env.callMethod(
                            r,
                            "isSubclassOf",
                            FragmentRendererPass.class,
                            FragmentRendererInterface.CONST_class))) {
                throw ZVal.getException(
                        env,
                        env.createNew(
                                ZVal.resolveClassAlias(env, "InvalidArgumentException"),
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Service \"%s\" must implement interface \"%s\".",
                                                id, FragmentRendererInterface.CONST_class)
                                        .value()));
            }

            for (ZPair zpairResult1933 : ZVal.getIterable(tags, env, true)) {
                tag.setObject(ZVal.assign(zpairResult1933.getValue()));
                renderers
                        .arrayAccess(env, tag.arrayGet(env, "alias"))
                        .set(env.createNew(ZVal.resolveClassAlias(env, "Reference"), id));
            }
        }

        env.callMethod(
                definition,
                "replaceArgument",
                FragmentRendererPass.class,
                0,
                StaticMethodUtils.getStaticBaseClass(
                                ZVal.resolveClassAlias(env, "ServiceLocatorTagPass"), env)
                        .callUnknownStaticMethod(
                                env,
                                "register",
                                new RuntimeArgsWithReferences(),
                                container,
                                renderers.getObject()));
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\DependencyInjection\\FragmentRendererPass";

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
                            "Symfony\\Component\\HttpKernel\\DependencyInjection\\FragmentRendererPass")
                    .setLookup(
                            FragmentRendererPass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("handlerService", "rendererTag")
                    .setFilename(
                            "vendor/symfony/http-kernel/DependencyInjection/FragmentRendererPass.php")
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
