package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Event.classes.GetResponseForControllerResultEvent;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Event.classes.FilterResponseEvent;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Event.classes.GetResponseForExceptionEvent;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.RequestStack;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Controller.classes.ArgumentResolver;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes.HttpKernelInterface;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes.KernelEvents;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Exception.classes.RequestExceptionInterface;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Exception.classes.BadRequestHttpException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Event.classes.FilterControllerArgumentsEvent;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Event.classes.FilterControllerEvent;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_get_level;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Exception.classes.NotFoundHttpException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Event.classes.GetResponseEvent;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Exception.classes.HttpExceptionInterface;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes.TerminableInterface;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.Response;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Event.classes.FinishRequestEvent;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Event.classes.PostResponseEvent;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/HttpKernel.php

*/

public class HttpKernel extends RuntimeClassBase
        implements HttpKernelInterface, TerminableInterface {

    public Object dispatcher = null;

    public Object resolver = null;

    public Object requestStack = null;

    public Object argumentResolver = null;

    public HttpKernel(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == HttpKernel.class) {
            this.__construct(env, args);
        }
    }

    public HttpKernel(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "dispatcher",
        typeHint = "Symfony\\Component\\EventDispatcher\\EventDispatcherInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "resolver",
        typeHint = "Symfony\\Component\\HttpKernel\\Controller\\ControllerResolverInterface"
    )
    @ConvertedParameter(
        index = 2,
        name = "requestStack",
        typeHint = "Symfony\\Component\\HttpFoundation\\RequestStack",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "argumentResolver",
        typeHint = "Symfony\\Component\\HttpKernel\\Controller\\ArgumentResolverInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object dispatcher = assignParameter(args, 0, false);
        Object resolver = assignParameter(args, 1, false);
        Object requestStack = assignParameter(args, 2, true);
        if (null == requestStack) {
            requestStack = ZVal.getNull();
        }
        Object argumentResolver = assignParameter(args, 3, true);
        if (null == argumentResolver) {
            argumentResolver = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.dispatcher = dispatcher;
        this.resolver = resolver;
        this.requestStack =
                ZVal.isTrue(ternaryExpressionTemp = requestStack)
                        ? ternaryExpressionTemp
                        : new RequestStack(env);
        this.argumentResolver = argumentResolver;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.argumentResolver)) {
            this.argumentResolver = new ArgumentResolver(env);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(index = 1, name = "type")
    @ConvertedParameter(
        index = 2,
        name = "catch",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object handle(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = HttpKernelInterface.CONST_MASTER_REQUEST;
        }
        Object _pCatch = assignParameter(args, 2, true);
        if (null == _pCatch) {
            _pCatch = true;
        }
        Object e = null;
        env.callMethod(
                toObjectR(request).accessProp(this, env).name("headers").value(),
                "set",
                HttpKernel.class,
                "X-Php-Ob-Level",
                function_ob_get_level.f.env(env).call().value());
        try {
            return ZVal.assign(this.handleRaw(env, request, type));
        } catch (ConvertedException convertedException292) {
            if (convertedException292.instanceOf(PHPException.class, "Exception")) {
                e = convertedException292.getObject();
                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                e,
                                RequestExceptionInterface.class,
                                "Symfony\\Component\\HttpFoundation\\Exception\\RequestExceptionInterface"))) {
                    e =
                            new BadRequestHttpException(
                                    env, env.callMethod(e, "getMessage", HttpKernel.class), e);
                }

                if (ZVal.strictEqualityCheck(false, "===", _pCatch)) {
                    this.finishRequest(env, request, type);
                    throw ZVal.getException(env, e);
                }

                return ZVal.assign(this.handleException(env, e, request, type));
            } else {
                throw convertedException292;
            }
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(
        index = 1,
        name = "response",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response"
    )
    public Object terminate(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object response = assignParameter(args, 1, false);
        env.callMethod(
                this.dispatcher,
                "dispatch",
                HttpKernel.class,
                KernelEvents.CONST_TERMINATE,
                new PostResponseEvent(env, this, request, response));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception", typeHint = "Exception")
    @ConvertedParameter(
        index = 1,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object terminateWithException(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, false);
        Object request = assignParameter(args, 1, true);
        if (null == request) {
            request = ZVal.getNull();
        }
        Object response = null;
        Object ternaryExpressionTemp = null;
        if (!ZVal.isTrue(
                request =
                        ZVal.assign(
                                ZVal.isTrue(ternaryExpressionTemp = request)
                                        ? ternaryExpressionTemp
                                        : env.callMethod(
                                                this.requestStack,
                                                "getMasterRequest",
                                                HttpKernel.class)))) {
            throw ZVal.getException(env, exception);
        }

        response = this.handleException(env, exception, request, CONST_MASTER_REQUEST);
        env.callMethod(response, "sendHeaders", HttpKernel.class);
        env.callMethod(response, "sendContent", HttpKernel.class);
        this.terminate(env, request, response);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(index = 1, name = "type", typeHint = "int")
    private Object handleRaw(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = CONST_MASTER_REQUEST;
        }
        Object msg = null;
        Object controller = null;
        Object response = null;
        Object arguments = null;
        Object event = null;
        env.callMethod(this.requestStack, "push", HttpKernel.class, request);
        event = new GetResponseEvent(env, this, request, type);
        env.callMethod(
                this.dispatcher, "dispatch", HttpKernel.class, KernelEvents.CONST_REQUEST, event);
        if (ZVal.isTrue(env.callMethod(event, "hasResponse", HttpKernel.class))) {
            return ZVal.assign(
                    this.filterResponse(
                            env,
                            env.callMethod(event, "getResponse", HttpKernel.class),
                            request,
                            type));
        }

        if (ZVal.strictEqualityCheck(
                false,
                "===",
                controller =
                        env.callMethod(
                                this.resolver, "getController", HttpKernel.class, request))) {
            throw ZVal.getException(
                    env,
                    new NotFoundHttpException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Unable to find the controller for path \"%s\". The route is wrongly configured.",
                                            env.callMethod(
                                                    request, "getPathInfo", HttpKernel.class))
                                    .value()));
        }

        event = new FilterControllerEvent(env, this, controller, request, type);
        env.callMethod(
                this.dispatcher,
                "dispatch",
                HttpKernel.class,
                KernelEvents.CONST_CONTROLLER,
                event);
        controller = env.callMethod(event, "getController", HttpKernel.class);
        arguments =
                env.callMethod(
                        this.argumentResolver,
                        "getArguments",
                        HttpKernel.class,
                        request,
                        controller);
        event = new FilterControllerArgumentsEvent(env, this, controller, arguments, request, type);
        env.callMethod(
                this.dispatcher,
                "dispatch",
                HttpKernel.class,
                KernelEvents.CONST_CONTROLLER_ARGUMENTS,
                event);
        controller = env.callMethod(event, "getController", HttpKernel.class);
        arguments = env.callMethod(event, "getArguments", HttpKernel.class);
        response =
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(controller, arguments)
                        .value();
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        response,
                        Response.class,
                        "Symfony\\Component\\HttpFoundation\\Response"))) {
            event = new GetResponseForControllerResultEvent(env, this, request, type, response);
            env.callMethod(
                    this.dispatcher, "dispatch", HttpKernel.class, KernelEvents.CONST_VIEW, event);
            if (ZVal.isTrue(env.callMethod(event, "hasResponse", HttpKernel.class))) {
                response = env.callMethod(event, "getResponse", HttpKernel.class);

            } else {
                msg =
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "The controller must return a response (%s given).",
                                        this.varToString(env, response))
                                .value();
                if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", response)) {
                    msg =
                            toStringR(msg, env)
                                    + " Did you forget to add a return statement somewhere in your controller?";
                }

                throw ZVal.getException(env, new LogicException(env, msg));
            }
        }

        return ZVal.assign(this.filterResponse(env, response, request, type));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "response",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response"
    )
    @ConvertedParameter(
        index = 1,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(index = 2, name = "type", typeHint = "int")
    private Object filterResponse(RuntimeEnv env, Object... args) {
        Object response = assignParameter(args, 0, false);
        Object request = assignParameter(args, 1, false);
        Object type = assignParameter(args, 2, false);
        Object event = null;
        event = new FilterResponseEvent(env, this, request, type, response);
        env.callMethod(
                this.dispatcher, "dispatch", HttpKernel.class, KernelEvents.CONST_RESPONSE, event);
        this.finishRequest(env, request, type);
        return ZVal.assign(env.callMethod(event, "getResponse", HttpKernel.class));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(index = 1, name = "type", typeHint = "int")
    private Object finishRequest(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, false);
        env.callMethod(
                this.dispatcher,
                "dispatch",
                HttpKernel.class,
                KernelEvents.CONST_FINISH_REQUEST,
                new FinishRequestEvent(env, this, request, type));
        env.callMethod(this.requestStack, "pop", HttpKernel.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Exception")
    @ConvertedParameter(
        index = 1,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(index = 2, name = "type", typeHint = "int")
    private Object handleException(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object e = assignParameter(args, 0, false);
        Object request = assignParameter(args, 1, false);
        Object type = assignParameter(args, 2, false);
        Object response = null;
        Object event = null;
        event = new GetResponseForExceptionEvent(env, this, request, type, e);
        env.callMethod(
                this.dispatcher, "dispatch", HttpKernel.class, KernelEvents.CONST_EXCEPTION, event);
        e = env.callMethod(event, "getException", HttpKernel.class);
        if (!ZVal.isTrue(env.callMethod(event, "hasResponse", HttpKernel.class))) {
            this.finishRequest(env, request, type);
            throw ZVal.getException(env, e);
        }

        response = env.callMethod(event, "getResponse", HttpKernel.class);
        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.toBool(
                                                        !ZVal.isTrue(
                                                                env.callMethod(
                                                                        event,
                                                                        "isAllowingCustomResponseCode",
                                                                        HttpKernel.class)))
                                                && ZVal.toBool(
                                                        !ZVal.isTrue(
                                                                env.callMethod(
                                                                        response,
                                                                        "isClientError",
                                                                        HttpKernel.class))))
                                && ZVal.toBool(
                                        !ZVal.isTrue(
                                                env.callMethod(
                                                        response,
                                                        "isServerError",
                                                        HttpKernel.class))))
                && ZVal.toBool(
                        !ZVal.isTrue(env.callMethod(response, "isRedirect", HttpKernel.class)))) {
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            e,
                            HttpExceptionInterface.class,
                            "Symfony\\Component\\HttpKernel\\Exception\\HttpExceptionInterface"))) {
                env.callMethod(
                        response,
                        "setStatusCode",
                        HttpKernel.class,
                        env.callMethod(e, "getStatusCode", HttpKernel.class));
                env.callMethod(
                        toObjectR(response).accessProp(this, env).name("headers").value(),
                        rLastRefArgs =
                                new RuntimeArgsWithReferences()
                                        .add(
                                                0,
                                                handleReturnReference(
                                                        env.callMethod(
                                                                e,
                                                                "getHeaders",
                                                                HttpKernel.class))),
                        "add",
                        HttpKernel.class,
                        rLastRefArgs.get(0));

            } else {
                env.callMethod(response, "setStatusCode", HttpKernel.class, 500);
            }
        }

        try {
            return ZVal.assign(this.filterResponse(env, response, request, type));
        } catch (ConvertedException convertedException293) {
            if (convertedException293.instanceOf(PHPException.class, "Exception")) {
                e = convertedException293.getObject();
                return ZVal.assign(response);
            } else {
                throw convertedException293;
            }
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "var")
    private Object varToString(RuntimeEnv env, Object... args) {
        Object var = assignParameter(args, 0, false);
        ReferenceContainer a = new BasicReferenceContainer(null);
        Object v = null;
        Object k = null;
        if (function_is_object.f.env(env).call(var).getBool()) {
            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call("Object(%s)", function_get_class.f.env(env).call(var).value())
                            .value());
        }

        if (function_is_array.f.env(env).call(var).getBool()) {
            a.setObject(ZVal.newArray());
            for (ZPair zpairResult1967 : ZVal.getIterable(var, env, false)) {
                k = ZVal.assign(zpairResult1967.getKey());
                v = ZVal.assign(zpairResult1967.getValue());
                a.arrayAppend(env)
                        .set(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("%s => %s", k, this.varToString(env, v))
                                        .value());
            }

            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "Array(%s)",
                                    NamespaceGlobal.implode
                                            .env(env)
                                            .call(", ", a.getObject())
                                            .value())
                            .value());
        }

        if (function_is_resource.f.env(env).call(var).getBool()) {
            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "Resource(%s)",
                                    NamespaceGlobal.get_resource_type.env(env).call(var).value())
                            .value());
        }

        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", var)) {
            return "null";
        }

        if (ZVal.strictEqualityCheck(false, "===", var)) {
            return "false";
        }

        if (ZVal.strictEqualityCheck(true, "===", var)) {
            return "true";
        }

        return ZVal.assign(toStringR(var, env));
    }

    public static final Object CONST_class = "Symfony\\Component\\HttpKernel\\HttpKernel";

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
                    .setName("Symfony\\Component\\HttpKernel\\HttpKernel")
                    .setLookup(
                            HttpKernel.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "argumentResolver", "dispatcher", "requestStack", "resolver")
                    .setFilename("vendor/symfony/http-kernel/HttpKernel.php")
                    .addInterface("Symfony\\Component\\HttpKernel\\HttpKernelInterface")
                    .addInterface("Symfony\\Component\\HttpKernel\\TerminableInterface")
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
