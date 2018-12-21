package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.EventListener.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.file.function_realpath;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes.KernelEvents;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.classes.EventSubscriberInterface;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Exception.classes.MethodNotAllowedHttpException;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_get_clean;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_start;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Exception.classes.BadRequestHttpException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Exception.classes.ResourceNotFoundException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes.Kernel;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes.RequestContextAwareInterface;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.UnexpectedValueException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Exception.classes.NotFoundHttpException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Exception.classes.MethodNotAllowedException;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.Response;
import com.runtimeconverter.runtime.RuntimeStack;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Matcher.classes.UrlMatcherInterface;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Matcher.classes.RequestMatcherInterface;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Exception.classes.NoConfigurationException;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/EventListener/RouterListener.php

*/

public class RouterListener extends RuntimeClassBase implements EventSubscriberInterface {

    public Object matcher = null;

    public Object context = null;

    public Object logger = null;

    public Object requestStack = null;

    public Object projectDir = null;

    public Object debug = null;

    public RouterListener(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RouterListener.class) {
            this.__construct(env, args);
        }
    }

    public RouterListener(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "matcher")
    @ConvertedParameter(
        index = 1,
        name = "requestStack",
        typeHint = "Symfony\\Component\\HttpFoundation\\RequestStack"
    )
    @ConvertedParameter(
        index = 2,
        name = "context",
        typeHint = "Symfony\\Component\\Routing\\RequestContext",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "logger",
        typeHint = "Psr\\Log\\LoggerInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "projectDir",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "debug",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object matcher = assignParameter(args, 0, false);
        Object requestStack = assignParameter(args, 1, false);
        Object context = assignParameter(args, 2, true);
        if (null == context) {
            context = ZVal.getNull();
        }
        Object logger = assignParameter(args, 3, true);
        if (null == logger) {
            logger = ZVal.getNull();
        }
        Object projectDir = assignParameter(args, 4, true);
        if (null == projectDir) {
            projectDir = ZVal.getNull();
        }
        Object debug = assignParameter(args, 5, true);
        if (null == debug) {
            debug = true;
        }
        Object ternaryExpressionTemp = null;
        if (ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        matcher,
                                        UrlMatcherInterface.class,
                                        "Symfony\\Component\\Routing\\Matcher\\UrlMatcherInterface")))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        matcher,
                                        RequestMatcherInterface.class,
                                        "Symfony\\Component\\Routing\\Matcher\\RequestMatcherInterface")))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Matcher must either implement UrlMatcherInterface or RequestMatcherInterface."));
        }

        if (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", context))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        matcher,
                                        RequestContextAwareInterface.class,
                                        "Symfony\\Component\\Routing\\RequestContextAwareInterface")))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "You must either pass a RequestContext or the matcher must implement RequestContextAwareInterface."));
        }

        this.matcher = matcher;
        this.context =
                ZVal.isTrue(ternaryExpressionTemp = context)
                        ? ternaryExpressionTemp
                        : env.callMethod(matcher, "getContext", RouterListener.class);
        this.requestStack = requestStack;
        this.logger = logger;
        this.projectDir = projectDir;
        this.debug = debug;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    private Object setCurrentRequest(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, true);
        if (null == request) {
            request = ZVal.getNull();
        }
        Object e = null;
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", request)) {
            try {
                env.callMethod(this.context, "fromRequest", RouterListener.class, request);
            } catch (ConvertedException convertedException282) {
                if (convertedException282.instanceOf(
                        UnexpectedValueException.class, "UnexpectedValueException")) {
                    e = convertedException282.getObject();
                    throw ZVal.getException(
                            env,
                            new BadRequestHttpException(
                                    env,
                                    env.callMethod(e, "getMessage", RouterListener.class),
                                    e,
                                    env.callMethod(e, "getCode", RouterListener.class)));
                } else {
                    throw convertedException282;
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Symfony\\Component\\HttpKernel\\Event\\FinishRequestEvent"
    )
    public Object onKernelFinishRequest(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        this.setCurrentRequest(
                env, env.callMethod(this.requestStack, "getParentRequest", RouterListener.class));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Symfony\\Component\\HttpKernel\\Event\\GetResponseEvent"
    )
    public Object onKernelRequest(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object event = assignParameter(args, 0, false);
        Object request = null;
        Object referer = null;
        Object e = null;
        Object message = null;
        ReferenceContainer parameters = new BasicReferenceContainer(null);
        request = env.callMethod(event, "getRequest", RouterListener.class);
        this.setCurrentRequest(env, request);
        if (ZVal.isTrue(
                env.callMethod(
                        toObjectR(request).accessProp(this, env).name("attributes").value(),
                        "has",
                        RouterListener.class,
                        "_controller"))) {
            return null;
        }

        try {
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            this.matcher,
                            RequestMatcherInterface.class,
                            "Symfony\\Component\\Routing\\Matcher\\RequestMatcherInterface"))) {
                parameters.setObject(
                        env.callMethod(
                                this.matcher, "matchRequest", RouterListener.class, request));

            } else {
                parameters.setObject(
                        env.callMethod(
                                this.matcher,
                                rLastRefArgs =
                                        new RuntimeArgsWithReferences()
                                                .add(
                                                        0,
                                                        handleReturnReference(
                                                                env.callMethod(
                                                                        request,
                                                                        "getPathInfo",
                                                                        RouterListener.class))),
                                "match",
                                RouterListener.class,
                                rLastRefArgs.get(0)));
            }

            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.logger)) {
                env.callMethod(
                        this.logger,
                        "info",
                        RouterListener.class,
                        "Matched route \"{route}\".",
                        ZVal.newArray(
                                new ZPair(
                                        "route",
                                        arrayActionR(ArrayAction.ISSET, parameters, env, "_route")
                                                ? parameters.arrayGet(env, "_route")
                                                : "n/a"),
                                new ZPair("route_parameters", parameters.getObject()),
                                new ZPair(
                                        "request_uri",
                                        env.callMethod(request, "getUri", RouterListener.class)),
                                new ZPair(
                                        "method",
                                        env.callMethod(
                                                request, "getMethod", RouterListener.class))));
            }

            env.callMethod(
                    toObjectR(request).accessProp(this, env).name("attributes").value(),
                    new RuntimeArgsWithReferences().add(0, parameters),
                    "add",
                    RouterListener.class,
                    parameters.getObject());
            arrayActionR(ArrayAction.UNSET, parameters, env, "_route");
            arrayActionR(ArrayAction.UNSET, parameters, env, "_controller");
            env.callMethod(
                    toObjectR(request).accessProp(this, env).name("attributes").value(),
                    "set",
                    RouterListener.class,
                    "_route_params",
                    parameters.getObject());
        } catch (ConvertedException convertedException283) {
            if (convertedException283.instanceOf(
                    ResourceNotFoundException.class,
                    "Symfony\\Component\\Routing\\Exception\\ResourceNotFoundException")) {
                e = convertedException283.getObject();
                message =
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "No route found for \"%s %s\"",
                                        env.callMethod(request, "getMethod", RouterListener.class),
                                        env.callMethod(
                                                request, "getPathInfo", RouterListener.class))
                                .value();
                if (ZVal.isTrue(
                        referer =
                                env.callMethod(
                                        toObjectR(request)
                                                .accessProp(this, env)
                                                .name("headers")
                                                .value(),
                                        "get",
                                        RouterListener.class,
                                        "referer"))) {
                    message =
                            toStringR(message, env)
                                    + toStringR(
                                            function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call(" (from \"%s\")", referer)
                                                    .value(),
                                            env);
                }

                throw ZVal.getException(env, new NotFoundHttpException(env, message, e));
            } else if (convertedException283.instanceOf(
                    MethodNotAllowedException.class,
                    "Symfony\\Component\\Routing\\Exception\\MethodNotAllowedException")) {
                e = convertedException283.getObject();
                message =
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "No route found for \"%s %s\": Method Not Allowed (Allow: %s)",
                                        env.callMethod(request, "getMethod", RouterListener.class),
                                        env.callMethod(
                                                request, "getPathInfo", RouterListener.class),
                                        NamespaceGlobal.implode
                                                .env(env)
                                                .call(
                                                        ", ",
                                                        env.callMethod(
                                                                e,
                                                                "getAllowedMethods",
                                                                RouterListener.class))
                                                .value())
                                .value();
                throw ZVal.getException(
                        env,
                        new MethodNotAllowedHttpException(
                                env,
                                env.callMethod(e, "getAllowedMethods", RouterListener.class),
                                message,
                                e));
            } else {
                throw convertedException283;
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Symfony\\Component\\HttpKernel\\Event\\GetResponseForExceptionEvent"
    )
    public Object onKernelException(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object e = null;
        if (ZVal.toBool(!ZVal.isTrue(this.debug))
                || ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        e =
                                                env.callMethod(
                                                        event,
                                                        "getException",
                                                        RouterListener.class),
                                        NotFoundHttpException.class,
                                        "Symfony\\Component\\HttpKernel\\Exception\\NotFoundHttpException")))) {
            return null;
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        env.callMethod(e, "getPrevious", RouterListener.class),
                        NoConfigurationException.class,
                        "Symfony\\Component\\Routing\\Exception\\NoConfigurationException"))) {
            env.callMethod(
                    event, "setResponse", RouterListener.class, this.createWelcomeResponse(env));
        }

        return null;
    }

    @ConvertedMethod
    private Object createWelcomeResponse(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope64 scope = new Scope64();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/symfony/http-kernel/EventListener")
                            .setFile(
                                    "/vendor/symfony/http-kernel/EventListener/RouterListener.php");
            scope.baseDir = null;
            scope.version = null;
            scope.docVersion = null;
            scope.version = ZVal.assign(Kernel.CONST_VERSION);
            scope.baseDir =
                    toStringR(function_realpath.f.env(env).call(this.projectDir).value(), env)
                            + toStringR("/", env);
            scope.docVersion = function_substr.f.env(env).call(Kernel.CONST_VERSION, 0, 3).value();
            function_ob_start.f.env(env).call();
            env.include(
                    toStringR(
                                    env.addRootFilesystemPrefix(
                                            "/vendor/symfony/http-kernel/EventListener"),
                                    env)
                            + "/../Resources/welcome.html.php",
                    stack,
                    runtimeConverterFunctionClassConstants,
                    false,
                    false);
            throw new IncludeEventException(
                    ZVal.assign(
                            new Response(
                                    env,
                                    function_ob_get_clean.f.env(env).call().value(),
                                    Response.CONST_HTTP_NOT_FOUND)));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\EventListener\\RouterListener";

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
                                                    0, ZVal.arrayFromList("onKernelRequest", 32)))),
                            new ZPair(
                                    KernelEvents.CONST_FINISH_REQUEST,
                                    ZVal.newArray(
                                            new ZPair(
                                                    0,
                                                    ZVal.arrayFromList(
                                                            "onKernelFinishRequest", 0)))),
                            new ZPair(
                                    KernelEvents.CONST_EXCEPTION,
                                    ZVal.arrayFromList("onKernelException", -64))));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\EventListener\\RouterListener")
                    .setLookup(
                            RouterListener.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "context", "debug", "logger", "matcher", "projectDir", "requestStack")
                    .setFilename("vendor/symfony/http-kernel/EventListener/RouterListener.php")
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

    private static class Scope64 implements UpdateRuntimeScopeInterface {

        Object baseDir;
        Object _thisVarAlias;
        Object version;
        Object docVersion;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("baseDir", this.baseDir);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("version", this.version);
            stack.setVariable("docVersion", this.docVersion);
        }

        public void updateScope(RuntimeStack stack) {

            this.baseDir = stack.getVariable("baseDir");
            this._thisVarAlias = stack.getVariable("this");
            this.version = stack.getVariable("version");
            this.docVersion = stack.getVariable("docVersion");
        }
    }
}
