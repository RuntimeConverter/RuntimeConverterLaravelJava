package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.EventListener.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Exception.classes.AccessDeniedHttpException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_parse_str;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_replace;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes.KernelEvents;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.classes.EventSubscriberInterface;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/EventListener/FragmentListener.php

*/

public class FragmentListener extends RuntimeClassBase implements EventSubscriberInterface {

    public Object signer = null;

    public Object fragmentPath = null;

    public FragmentListener(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FragmentListener.class) {
            this.__construct(env, args);
        }
    }

    public FragmentListener(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "signer",
        typeHint = "Symfony\\Component\\HttpKernel\\UriSigner"
    )
    @ConvertedParameter(index = 1, name = "fragmentPath", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object signer = assignParameter(args, 0, false);
        Object fragmentPath = assignParameter(args, 1, true);
        if (null == fragmentPath) {
            fragmentPath = "/_fragment";
        }
        this.signer = signer;
        this.fragmentPath = fragmentPath;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Symfony\\Component\\HttpKernel\\Event\\GetResponseEvent"
    )
    public Object onKernelRequest(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object request = null;
        ReferenceContainer attributes = new BasicReferenceContainer(null);
        request = env.callMethod(event, "getRequest", FragmentListener.class);
        if (ZVal.strictNotEqualityCheck(
                this.fragmentPath,
                "!==",
                NamespaceGlobal.rawurldecode
                        .env(env)
                        .call(env.callMethod(request, "getPathInfo", FragmentListener.class))
                        .value())) {
            return null;
        }

        if (ZVal.isTrue(
                env.callMethod(
                        toObjectR(request).accessProp(this, env).name("attributes").value(),
                        "has",
                        FragmentListener.class,
                        "_controller"))) {
            env.callMethod(
                    toObjectR(request).accessProp(this, env).name("query").value(),
                    "remove",
                    FragmentListener.class,
                    "_path");
            return null;
        }

        if (ZVal.isTrue(env.callMethod(event, "isMasterRequest", FragmentListener.class))) {
            this.validateRequest(env, request);
        }

        function_parse_str
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(1, attributes))
                .call(
                        env.callMethod(
                                toObjectR(request).accessProp(this, env).name("query").value(),
                                "get",
                                FragmentListener.class,
                                "_path",
                                ""),
                        attributes.getObject());
        env.callMethod(
                toObjectR(request).accessProp(this, env).name("attributes").value(),
                new RuntimeArgsWithReferences().add(0, attributes),
                "add",
                FragmentListener.class,
                attributes.getObject());
        env.callMethod(
                toObjectR(request).accessProp(this, env).name("attributes").value(),
                "set",
                FragmentListener.class,
                "_route_params",
                function_array_replace
                        .f
                        .env(env)
                        .call(
                                env.callMethod(
                                        toObjectR(request)
                                                .accessProp(this, env)
                                                .name("attributes")
                                                .value(),
                                        "get",
                                        FragmentListener.class,
                                        "_route_params",
                                        ZVal.newArray()),
                                attributes.getObject())
                        .value());
        env.callMethod(
                toObjectR(request).accessProp(this, env).name("query").value(),
                "remove",
                FragmentListener.class,
                "_path");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    protected Object validateRequest(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object qs = null;
        if (!ZVal.isTrue(env.callMethod(request, "isMethodSafe", FragmentListener.class, false))) {
            throw ZVal.getException(env, new AccessDeniedHttpException(env));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        this.signer,
                        "check",
                        FragmentListener.class,
                        toStringR(
                                        env.callMethod(
                                                request,
                                                "getSchemeAndHttpHost",
                                                FragmentListener.class),
                                        env)
                                + toStringR(
                                        env.callMethod(
                                                request, "getBaseUrl", FragmentListener.class),
                                        env)
                                + toStringR(
                                        env.callMethod(
                                                request, "getPathInfo", FragmentListener.class),
                                        env)
                                + toStringR(
                                        ZVal.strictNotEqualityCheck(
                                                        ZVal.getNull(),
                                                        "!==",
                                                        qs =
                                                                env.callMethod(
                                                                        toObjectR(request)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("server")
                                                                                .value(),
                                                                        "get",
                                                                        FragmentListener.class,
                                                                        "QUERY_STRING"))
                                                ? "?" + toStringR(qs, env)
                                                : "",
                                        env)))) {
            return null;
        }

        throw ZVal.getException(env, new AccessDeniedHttpException(env));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\EventListener\\FragmentListener";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object getSubscribedEvents(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    KernelEvents.CONST_REQUEST,
                                    ZVal.newArray(
                                            new ZPair(
                                                    0,
                                                    ZVal.arrayFromList("onKernelRequest", 48))))));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\EventListener\\FragmentListener")
                    .setLookup(
                            FragmentListener.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("fragmentPath", "signer")
                    .setFilename("vendor/symfony/http-kernel/EventListener/FragmentListener.php")
                    .addInterface("Symfony\\Component\\EventDispatcher\\EventSubscriberInterface")
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
