package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Fragment.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Fragment.classes.RoutableFragmentRenderer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Event.classes.GetResponseForExceptionEvent;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes.HttpKernelInterface;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes.KernelEvents;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_get_level;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.Request;
import com.runtimeconverter.runtime.nativeFunctions.array.function_reset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Controller.classes.ControllerReference;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.Response;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Fragment/InlineFragmentRenderer.php

*/

public class InlineFragmentRenderer extends RoutableFragmentRenderer {

    public Object kernel = null;

    public Object dispatcher = null;

    public InlineFragmentRenderer(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == InlineFragmentRenderer.class) {
            this.__construct(env, args);
        }
    }

    public InlineFragmentRenderer(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "kernel",
        typeHint = "Symfony\\Component\\HttpKernel\\HttpKernelInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "dispatcher",
        typeHint = "Symfony\\Component\\EventDispatcher\\EventDispatcherInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object kernel = assignParameter(args, 0, false);
        Object dispatcher = assignParameter(args, 1, true);
        if (null == dispatcher) {
            dispatcher = ZVal.getNull();
        }
        this.kernel = kernel;
        this.dispatcher = dispatcher;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    @ConvertedParameter(
        index = 1,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(
        index = 2,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object render(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        Object request = assignParameter(args, 1, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 2, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        Object reference = null;
        Object subRequest = null;
        Object level = null;
        Object e = null;
        Object alt = null;
        ReferenceContainer attributes = new BasicReferenceContainer(null);
        Object event = null;
        Object key = null;
        reference = ZVal.getNull();
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        uri,
                        ControllerReference.class,
                        "Symfony\\Component\\HttpKernel\\Controller\\ControllerReference"))) {
            reference = ZVal.assign(uri);
            attributes.setObject(
                    ZVal.assign(
                            toObjectR(reference).accessProp(this, env).name("attributes").value()));
            toObjectR(reference).accessProp(this, env).name("attributes").set(ZVal.newArray());
            for (ZPair zpairResult1953 :
                    ZVal.getIterable(ZVal.arrayFromList("_format", "_locale"), env, true)) {
                key = ZVal.assign(zpairResult1953.getValue());
                if (arrayActionR(ArrayAction.ISSET, attributes, env, key)) {
                    new ReferenceClassProperty(reference, "attributes", env)
                            .arrayAccess(env, key)
                            .set(attributes.arrayGet(env, key));
                }
            }

            uri =
                    env.callMethod(
                            this,
                            "generateFragmentUri",
                            InlineFragmentRenderer.class,
                            uri,
                            request,
                            false,
                            false);
            toObjectR(reference)
                    .accessProp(this, env)
                    .name("attributes")
                    .set(
                            function_array_merge
                                    .f
                                    .env(env)
                                    .call(
                                            attributes.getObject(),
                                            toObjectR(reference)
                                                    .accessProp(this, env)
                                                    .name("attributes")
                                                    .value())
                                    .value());
        }

        subRequest = this.createSubRequest(env, uri, request);
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", reference)) {
            env.callMethod(
                    toObjectR(subRequest).accessProp(this, env).name("attributes").value(),
                    new RuntimeArgsWithReferences()
                            .add(0, new ReferenceClassProperty(reference, "attributes", env)),
                    "add",
                    InlineFragmentRenderer.class,
                    toObjectR(reference).accessProp(this, env).name("attributes").value());
        }

        level = function_ob_get_level.f.env(env).call().value();
        try {
            return ZVal.assign(
                    env.callMethod(
                            this.kernel,
                            "handle",
                            InlineFragmentRenderer.class,
                            subRequest,
                            HttpKernelInterface.CONST_SUB_REQUEST,
                            false));
        } catch (ConvertedException convertedException287) {
            if (convertedException287.instanceOf(PHPException.class, "Exception")) {
                e = convertedException287.getObject();
                if (ZVal.toBool(
                                ZVal.toBool(
                                                arrayActionR(
                                                        ArrayAction.ISSET,
                                                        options,
                                                        env,
                                                        "ignore_errors"))
                                        && ZVal.toBool(options.arrayGet(env, "ignore_errors")))
                        && ZVal.toBool(this.dispatcher)) {
                    event =
                            new GetResponseForExceptionEvent(
                                    env,
                                    this.kernel,
                                    request,
                                    HttpKernelInterface.CONST_SUB_REQUEST,
                                    e);
                    env.callMethod(
                            this.dispatcher,
                            "dispatch",
                            InlineFragmentRenderer.class,
                            KernelEvents.CONST_EXCEPTION,
                            event);
                }

                Response.runtimeStaticObject.closeOutputBuffers(env, level, false);
                if (arrayActionR(ArrayAction.ISSET, options, env, "alt")) {
                    alt = ZVal.assign(options.arrayGet(env, "alt"));
                    arrayActionR(ArrayAction.UNSET, options, env, "alt");
                    return ZVal.assign(this.render(env, alt, request, options.getObject()));
                }

                if (ZVal.toBool(!arrayActionR(ArrayAction.ISSET, options, env, "ignore_errors"))
                        || ZVal.toBool(!ZVal.isTrue(options.arrayGet(env, "ignore_errors")))) {
                    throw ZVal.getException(env, e);
                }

                return ZVal.assign(new Response(env));
            } else {
                throw convertedException287;
            }
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    @ConvertedParameter(
        index = 1,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    protected Object createSubRequest(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/http-kernel/Fragment")
                        .setFile("/vendor/symfony/http-kernel/Fragment/InlineFragmentRenderer.php");
        Object uri = assignParameter(args, 0, false);
        ReferenceContainer request = new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer subRequest = new BasicReferenceContainer(null);
        ReferenceContainer server = new BasicReferenceContainer(null);
        Object trustedProxies = null;
        ReferenceContainer setSession = new BasicReferenceContainer(null);
        Object currentXForwardedFor = null;
        Object cookies = null;
        cookies =
                env.callMethod(
                        toObjectR(request.getObject())
                                .accessProp(this, env)
                                .name("cookies")
                                .value(),
                        "all",
                        InlineFragmentRenderer.class);
        server.setObject(
                env.callMethod(
                        toObjectR(request.getObject()).accessProp(this, env).name("server").value(),
                        "all",
                        InlineFragmentRenderer.class));
        if (ZVal.isTrue(
                ZVal.toLong(Request.CONST_HEADER_X_FORWARDED_FOR)
                        & ZVal.toLong(Request.runtimeStaticObject.getTrustedHeaderSet(env)))) {
            currentXForwardedFor =
                    env.callMethod(
                            toObjectR(request.getObject())
                                    .accessProp(this, env)
                                    .name("headers")
                                    .value(),
                            "get",
                            InlineFragmentRenderer.class,
                            "X_FORWARDED_FOR",
                            "");
            server.arrayAccess(env, "HTTP_X_FORWARDED_FOR")
                    .set(
                            toStringR(
                                            ZVal.isTrue(currentXForwardedFor)
                                                    ? toStringR(currentXForwardedFor, env) + ", "
                                                    : "",
                                            env)
                                    + toStringR(
                                            env.callMethod(
                                                    request.getObject(),
                                                    "getClientIp",
                                                    InlineFragmentRenderer.class),
                                            env));
        }

        trustedProxies = Request.runtimeStaticObject.getTrustedProxies(env);
        server.arrayAccess(env, "REMOTE_ADDR")
                .set(
                        ZVal.isTrue(trustedProxies)
                                ? function_reset.f.env(env).call(trustedProxies).value()
                                : "127.0.0.1");
        arrayActionR(ArrayAction.UNSET, server, env, "HTTP_IF_MODIFIED_SINCE");
        arrayActionR(ArrayAction.UNSET, server, env, "HTTP_IF_NONE_MATCH");
        subRequest.setObject(
                Request.runtimeStaticObject.create(
                        env,
                        uri,
                        "get",
                        ZVal.newArray(),
                        cookies,
                        ZVal.newArray(),
                        server.getObject()));
        if (ZVal.isTrue(
                env.callMethod(
                        toObjectR(request.getObject())
                                .accessProp(this, env)
                                .name("headers")
                                .value(),
                        "has",
                        InlineFragmentRenderer.class,
                        "Surrogate-Capability"))) {
            env.callMethod(
                    toObjectR(subRequest.getObject()).accessProp(this, env).name("headers").value(),
                    "set",
                    InlineFragmentRenderer.class,
                    "Surrogate-Capability",
                    env.callMethod(
                            toObjectR(request.getObject())
                                    .accessProp(this, env)
                                    .name("headers")
                                    .value(),
                            "get",
                            InlineFragmentRenderer.class,
                            "Surrogate-Capability"));
        }

        setSession = env.getInlineStatic(28, null);
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", setSession.getObject())) {
            setSession.setObject(
                    Closure.runtimeStaticObject.bind(
                            env,
                            new Closure(
                                    env,
                                    runtimeConverterFunctionClassConstants,
                                    "Symfony\\Component\\HttpKernel\\Fragment",
                                    this) {
                                @Override
                                @ConvertedMethod
                                @ConvertedParameter(index = 0, name = "subRequest")
                                @ConvertedParameter(index = 1, name = "request")
                                public Object run(
                                        RuntimeEnv env,
                                        Object thisvar,
                                        PassByReferenceArgs runtimePassByReferenceArgs,
                                        Object... args) {
                                    Object subRequest = assignParameter(args, 0, false);
                                    Object request = assignParameter(args, 1, false);
                                    toObjectR(subRequest)
                                            .accessProp(this, env)
                                            .name("session")
                                            .set(
                                                    toObjectR(request)
                                                            .accessProp(this, env)
                                                            .name("session")
                                                            .value());
                                    return null;
                                }
                            },
                            ZVal.getNull(),
                            Request.CONST_class));
        }

        env.callFunctionDynamic(
                setSession.getObject(),
                new RuntimeArgsWithReferences().add(0, subRequest).add(1, request),
                subRequest.getObject(),
                request.getObject());
        return ZVal.assign(subRequest.getObject());
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "inline";
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\Fragment\\InlineFragmentRenderer";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends RoutableFragmentRenderer.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\Fragment\\InlineFragmentRenderer")
                    .setLookup(
                            InlineFragmentRenderer.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("dispatcher", "fragmentPath", "kernel")
                    .setFilename("vendor/symfony/http-kernel/Fragment/InlineFragmentRenderer.php")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\Fragment\\FragmentRendererInterface")
                    .addExtendsClass(
                            "Symfony\\Component\\HttpKernel\\Fragment\\RoutableFragmentRenderer")
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
