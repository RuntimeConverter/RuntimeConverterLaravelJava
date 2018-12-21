package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Exceptions.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.classes.AuthenticationException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Access.classes.AuthorizationException;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.classes.JsonResponse;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.classes.TokenMismatchException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.ViewErrorBag;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Exceptions.classes.WhoopsHandler;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Exception.classes.NotFoundHttpException;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes.Router;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes.FlattenException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.project.convertedCode.globalNamespace.functions.route;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.Log.classes.LoggerInterface;
import com.project.convertedCode.globalNamespace.functions.collect;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.classes.Application;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Exception.classes.AccessDeniedHttpException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.classes.ValidationException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.ModelNotFoundException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Exceptions.classes.HttpResponseException;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Auth;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Responsable;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Exception.classes.HttpException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.project.convertedCode.globalNamespace.functions.redirect;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.project.convertedCode.globalNamespace.namespaces.Whoops.classes.Run;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.View;
import com.project.convertedCode.globalNamespace.functions.url;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.functions.response;
import com.project.convertedCode.globalNamespace.functions.config;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Exceptions/Handler.php

*/

public class Handler extends RuntimeClassBase
        implements com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Contracts
                .namespaces
                .Debug
                .classes
                .ExceptionHandler {

    public Object container = null;

    public Object dontReport = ZVal.newArray();

    public Object internalDontReport =
            ZVal.newArray(
                    new ZPair(0, AuthenticationException.CONST_class),
                    new ZPair(1, AuthorizationException.CONST_class),
                    new ZPair(2, HttpException.CONST_class),
                    new ZPair(3, HttpResponseException.CONST_class),
                    new ZPair(4, ModelNotFoundException.CONST_class),
                    new ZPair(5, TokenMismatchException.CONST_class),
                    new ZPair(6, ValidationException.CONST_class));

    public Object dontFlash = ZVal.arrayFromList("password", "password_confirmation");

    public Handler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Handler.class) {
            this.__construct(env, args);
        }
    }

    public Handler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Illuminate\\Contracts\\Container\\Container"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        this.container = container;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Exception")
    public Object report(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        Object ex = null;
        Object logger = null;
        if (ZVal.isTrue(this.shouldntReport(env, e))) {
            return null;
        }

        if (function_method_exists.f.env(env).call(e, "report").getBool()) {
            return ZVal.assign(env.callMethod(e, "report", Handler.class));
        }

        try {
            logger =
                    env.callMethod(
                            this.container, "make", Handler.class, LoggerInterface.CONST_class);
        } catch (ConvertedException convertedException40) {
            if (convertedException40.instanceOf(PHPException.class, "Exception")) {
                ex = convertedException40.getObject();
                throw ZVal.getException(env, e);
            } else {
                throw convertedException40;
            }
        }

        env.callMethod(
                logger,
                "error",
                Handler.class,
                env.callMethod(e, "getMessage", Handler.class),
                function_array_merge
                        .f
                        .env(env)
                        .call(this.context(env), ZVal.newArray(new ZPair("exception", e)))
                        .value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Exception")
    public Object shouldReport(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        return ZVal.assign(!ZVal.isTrue(this.shouldntReport(env, e)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Exception")
    protected Object shouldntReport(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Exceptions")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Exceptions/Handler.php");
        Object e = assignParameter(args, 0, false);
        Object dontReport = null;
        dontReport =
                function_array_merge
                        .f
                        .env(env)
                        .call(this.dontReport, this.internalDontReport)
                        .value();
        return ZVal.assign(
                !function_is_null
                        .f
                        .env(env)
                        .call(
                                Arr.runtimeStaticObject.first(
                                        env,
                                        dontReport,
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Illuminate\\Foundation\\Exceptions",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(index = 0, name = "type")
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                Object type = assignParameter(args, 0, false);
                                                Object e = null;
                                                e = this.contextReferences.getCapturedValue("e");
                                                return ZVal.assign(
                                                        ZVal.checkInstanceTypeMatch(e, type));
                                            }
                                        }.use("e", e)))
                        .getBool());
    }

    @ConvertedMethod
    protected Object context(RuntimeEnv env, Object... args) {
        Object e = null;
        try {
            return ZVal.assign(
                    function_array_filter
                            .f
                            .env(env)
                            .call(
                                    ZVal.newArray(
                                            new ZPair(
                                                    "userId",
                                                    Auth.runtimeStaticObject
                                                            .callUnknownStaticMethod(env, "id")),
                                            new ZPair(
                                                    "email",
                                                    ZVal.isTrue(
                                                                    Auth.runtimeStaticObject
                                                                            .callUnknownStaticMethod(
                                                                                    env, "user"))
                                                            ? toObjectR(
                                                                            Auth.runtimeStaticObject
                                                                                    .callUnknownStaticMethod(
                                                                                            env,
                                                                                            "user"))
                                                                    .accessProp(this, env)
                                                                    .name("email")
                                                                    .value()
                                                            : ZVal.getNull())))
                            .value());
        } catch (ConvertedException convertedException41) {
            if (convertedException41.instanceOf(Throwable.class, "Throwable")) {
                e = convertedException41.getObject();
                return ZVal.assign(ZVal.newArray());
            } else {
                throw convertedException41;
            }
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "e", typeHint = "Exception")
    public Object render(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object e = assignParameter(args, 1, false);
        Object response = null;
        if (ZVal.toBool(function_method_exists.f.env(env).call(e, "render").value())
                && ZVal.toBool(response = env.callMethod(e, "render", Handler.class, request))) {
            return ZVal.assign(Router.runtimeStaticObject.toResponse(env, request, response));

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        e, Responsable.class, "Illuminate\\Contracts\\Support\\Responsable"))) {
            return ZVal.assign(env.callMethod(e, "toResponse", Handler.class, request));
        }

        e = this.prepareException(env, e);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        e,
                        HttpResponseException.class,
                        "Illuminate\\Http\\Exceptions\\HttpResponseException"))) {
            return ZVal.assign(env.callMethod(e, "getResponse", Handler.class));

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        e,
                        AuthenticationException.class,
                        "Illuminate\\Auth\\AuthenticationException"))) {
            return ZVal.assign(this.unauthenticated(env, request, e));

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        e,
                        ValidationException.class,
                        "Illuminate\\Validation\\ValidationException"))) {
            return ZVal.assign(this.convertValidationExceptionToResponse(env, e, request));
        }

        return ZVal.assign(
                ZVal.isTrue(env.callMethod(request, "expectsJson", Handler.class))
                        ? this.prepareJsonResponse(env, request, e)
                        : this.prepareResponse(env, request, e));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Exception")
    protected Object prepareException(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        e,
                        ModelNotFoundException.class,
                        "Illuminate\\Database\\Eloquent\\ModelNotFoundException"))) {
            e = new NotFoundHttpException(env, env.callMethod(e, "getMessage", Handler.class), e);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        e,
                        AuthorizationException.class,
                        "Illuminate\\Auth\\Access\\AuthorizationException"))) {
            e =
                    new AccessDeniedHttpException(
                            env, env.callMethod(e, "getMessage", Handler.class), e);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        e,
                        TokenMismatchException.class,
                        "Illuminate\\Session\\TokenMismatchException"))) {
            e = new HttpException(env, 419, env.callMethod(e, "getMessage", Handler.class), e);
        }

        return ZVal.assign(e);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(
        index = 1,
        name = "exception",
        typeHint = "Illuminate\\Auth\\AuthenticationException"
    )
    protected Object unauthenticated(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object exception = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.isTrue(env.callMethod(request, "expectsJson", Handler.class))
                        ? env.callMethod(
                                response.f.env(env).call().value(),
                                "json",
                                Handler.class,
                                ZVal.newArray(
                                        new ZPair(
                                                "message",
                                                env.callMethod(
                                                        exception, "getMessage", Handler.class))),
                                401)
                        : env.callMethod(
                                redirect.f.env(env).call().value(),
                                "guest",
                                Handler.class,
                                route.f.env(env).call("login").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "e",
        typeHint = "Illuminate\\Validation\\ValidationException"
    )
    @ConvertedParameter(index = 1, name = "request")
    protected Object convertValidationExceptionToResponse(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        Object request = assignParameter(args, 1, false);
        if (toObjectR(e).accessProp(this, env).name("response").getBool()) {
            return ZVal.assign(toObjectR(e).accessProp(this, env).name("response").value());
        }

        return ZVal.assign(
                ZVal.isTrue(env.callMethod(request, "expectsJson", Handler.class))
                        ? this.invalidJson(env, request, e)
                        : this.invalid(env, request, e));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(
        index = 1,
        name = "exception",
        typeHint = "Illuminate\\Validation\\ValidationException"
    )
    protected Object invalid(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object exception = assignParameter(args, 1, false);
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                redirect.f
                                        .env(env)
                                        .call(
                                                ZVal.isDefined(
                                                                ternaryExpressionTemp =
                                                                        toObjectR(exception)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("redirectTo")
                                                                                .value())
                                                        ? ternaryExpressionTemp
                                                        : env.callMethod(
                                                                url.f.env(env).call().value(),
                                                                "previous",
                                                                Handler.class))
                                        .value(),
                                "withInput",
                                Handler.class,
                                env.callMethod(request, "except", Handler.class, this.dontFlash)),
                        "withErrors",
                        Handler.class,
                        env.callMethod(exception, "errors", Handler.class),
                        toObjectR(exception).accessProp(this, env).name("errorBag").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(
        index = 1,
        name = "exception",
        typeHint = "Illuminate\\Validation\\ValidationException"
    )
    protected Object invalidJson(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object exception = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        response.f.env(env).call().value(),
                        "json",
                        Handler.class,
                        ZVal.newArray(
                                new ZPair(
                                        "message",
                                        env.callMethod(exception, "getMessage", Handler.class)),
                                new ZPair(
                                        "errors",
                                        env.callMethod(exception, "errors", Handler.class))),
                        toObjectR(exception).accessProp(this, env).name("status").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "e", typeHint = "Exception")
    protected Object prepareResponse(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object e = assignParameter(args, 1, false);
        if (ZVal.toBool(!ZVal.isTrue(this.isHttpException(env, e)))
                && ZVal.toBool(config.f.env(env).call("app.debug").value())) {
            return ZVal.assign(
                    this.toIlluminateResponse(env, this.convertExceptionToResponse(env, e), e));
        }

        if (!ZVal.isTrue(this.isHttpException(env, e))) {
            e = new HttpException(env, 500, env.callMethod(e, "getMessage", Handler.class));
        }

        return ZVal.assign(this.toIlluminateResponse(env, this.renderHttpException(env, e), e));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Exception")
    protected Object convertExceptionToResponse(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        return ZVal.assign(
                com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component
                        .namespaces.HttpFoundation.classes.Response.runtimeStaticObject.create(
                        env,
                        this.renderExceptionContent(env, e),
                        ZVal.isTrue(this.isHttpException(env, e))
                                ? env.callMethod(e, "getStatusCode", Handler.class)
                                : 500,
                        ZVal.isTrue(this.isHttpException(env, e))
                                ? env.callMethod(e, "getHeaders", Handler.class)
                                : ZVal.newArray()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Exception")
    protected Object renderExceptionContent(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        try {
            return ZVal.assign(
                    ZVal.toBool(config.f.env(env).call("app.debug").value())
                                    && ZVal.toBool(
                                            function_class_exists
                                                    .f
                                                    .env(env)
                                                    .call(Run.CONST_class)
                                                    .value())
                            ? this.renderExceptionWithWhoops(env, e)
                            : this.renderExceptionWithSymfony(
                                    env, e, config.f.env(env).call("app.debug").value()));
        } catch (ConvertedException convertedException42) {
            if (convertedException42.instanceOf(PHPException.class, "Exception")) {
                e = convertedException42.getObject();
                return ZVal.assign(
                        this.renderExceptionWithSymfony(
                                env, e, config.f.env(env).call("app.debug").value()));
            } else {
                throw convertedException42;
            }
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Exception")
    protected Object renderExceptionWithWhoops(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Exceptions")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Exceptions/Handler.php");
        Object e = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        tap.f
                                .env(env)
                                .call(
                                        new Run(env),
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Illuminate\\Foundation\\Exceptions",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(index = 0, name = "whoops")
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                Object _closureThisVar = this.getClosureThisVar();
                                                Object whoops = assignParameter(args, 0, false);
                                                env.callMethod(
                                                        whoops,
                                                        "pushHandler",
                                                        Handler.class,
                                                        Handler.this.whoopsHandler(env));
                                                env.callMethod(
                                                        whoops,
                                                        "writeToOutput",
                                                        Handler.class,
                                                        false);
                                                env.callMethod(
                                                        whoops, "allowQuit", Handler.class, false);
                                                return null;
                                            }
                                        })
                                .value(),
                        "handleException",
                        Handler.class,
                        e));
    }

    @ConvertedMethod
    protected Object whoopsHandler(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(new WhoopsHandler(env), "forDebug", Handler.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Exception")
    @ConvertedParameter(index = 1, name = "debug")
    protected Object renderExceptionWithSymfony(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        Object debug = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Symfony
                                .namespaces
                                .Component
                                .namespaces
                                .Debug
                                .classes
                                .ExceptionHandler(env, debug),
                        "getHtml",
                        Handler.class,
                        FlattenException.runtimeStaticObject.create(env, e)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "e",
        typeHint = "Symfony\\Component\\HttpKernel\\Exception\\HttpException"
    )
    protected Object renderHttpException(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        Object view = null;
        this.registerErrorViewPaths(env);
        if (ZVal.isTrue(
                env.callMethod(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .functions
                                .view
                                .f
                                .env(env)
                                .call()
                                .value(),
                        "exists",
                        Handler.class,
                        view =
                                ZVal.assign(
                                        "errors::"
                                                + toStringR(
                                                        env.callMethod(
                                                                e, "getStatusCode", Handler.class),
                                                        env))))) {
            return ZVal.assign(
                    env.callMethod(
                            response.f.env(env).call().value(),
                            "view",
                            Handler.class,
                            view,
                            ZVal.newArray(
                                    new ZPair("errors", new ViewErrorBag(env)),
                                    new ZPair("exception", e)),
                            env.callMethod(e, "getStatusCode", Handler.class),
                            env.callMethod(e, "getHeaders", Handler.class)));
        }

        return ZVal.assign(this.convertExceptionToResponse(env, e));
    }

    @ConvertedMethod
    protected Object registerErrorViewPaths(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Exceptions")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Exceptions/Handler.php");
        Object paths = null;
        paths = collect.f.env(env).call(config.f.env(env).call("view.paths").value()).value();
        View.runtimeStaticObject.callUnknownStaticMethod(
                env,
                "replaceNamespace",
                new RuntimeArgsWithReferences(),
                "errors",
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        paths,
                                        "map",
                                        Handler.class,
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Illuminate\\Foundation\\Exceptions",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(index = 0, name = "path")
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                Object path = assignParameter(args, 0, false);
                                                return ZVal.assign(
                                                        toStringR(path, env) + "/errors");
                                            }
                                        }),
                                "push",
                                Handler.class,
                                toStringR(
                                                env.addRootFilesystemPrefix(
                                                        "/vendor/laravel/framework/src/Illuminate/Foundation/Exceptions"),
                                                env)
                                        + "/views"),
                        "all",
                        Handler.class));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "response")
    @ConvertedParameter(index = 1, name = "e", typeHint = "Exception")
    protected Object toIlluminateResponse(RuntimeEnv env, Object... args) {
        Object response = assignParameter(args, 0, false);
        Object e = assignParameter(args, 1, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        response,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Symfony
                                .namespaces
                                .Component
                                .namespaces
                                .HttpFoundation
                                .classes
                                .RedirectResponse
                                .class,
                        "Symfony\\Component\\HttpFoundation\\RedirectResponse"))) {
            response =
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Illuminate
                            .namespaces
                            .Http
                            .classes
                            .RedirectResponse(
                            env,
                            env.callMethod(response, "getTargetUrl", Handler.class),
                            env.callMethod(response, "getStatusCode", Handler.class),
                            env.callMethod(
                                    toObjectR(response)
                                            .accessProp(this, env)
                                            .name("headers")
                                            .value(),
                                    "all",
                                    Handler.class));

        } else {
            response =
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Illuminate
                            .namespaces
                            .Http
                            .classes
                            .Response(
                            env,
                            env.callMethod(response, "getContent", Handler.class),
                            env.callMethod(response, "getStatusCode", Handler.class),
                            env.callMethod(
                                    toObjectR(response)
                                            .accessProp(this, env)
                                            .name("headers")
                                            .value(),
                                    "all",
                                    Handler.class));
        }

        return ZVal.assign(env.callMethod(response, "withException", Handler.class, e));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "e", typeHint = "Exception")
    protected Object prepareJsonResponse(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object e = assignParameter(args, 1, false);
        return ZVal.assign(
                new JsonResponse(
                        env,
                        this.convertExceptionToArray(env, e),
                        ZVal.isTrue(this.isHttpException(env, e))
                                ? env.callMethod(e, "getStatusCode", Handler.class)
                                : 500,
                        ZVal.isTrue(this.isHttpException(env, e))
                                ? env.callMethod(e, "getHeaders", Handler.class)
                                : ZVal.newArray(),
                        ZVal.toLong(128) | ZVal.toLong(64)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Exception")
    protected Object convertExceptionToArray(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Exceptions")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Exceptions/Handler.php");
        Object e = assignParameter(args, 0, false);
        return ZVal.assign(
                config.f.env(env).call("app.debug").getBool()
                        ? ZVal.newArray(
                                new ZPair(
                                        "message", env.callMethod(e, "getMessage", Handler.class)),
                                new ZPair(
                                        "exception", function_get_class.f.env(env).call(e).value()),
                                new ZPair("file", env.callMethod(e, "getFile", Handler.class)),
                                new ZPair("line", env.callMethod(e, "getLine", Handler.class)),
                                new ZPair(
                                        "trace",
                                        env.callMethod(
                                                env.callMethod(
                                                        collect.f
                                                                .env(env)
                                                                .call(
                                                                        env.callMethod(
                                                                                e,
                                                                                "getTrace",
                                                                                Handler.class))
                                                                .value(),
                                                        "map",
                                                        Handler.class,
                                                        new Closure(
                                                                env,
                                                                runtimeConverterFunctionClassConstants,
                                                                "Illuminate\\Foundation\\Exceptions",
                                                                this) {
                                                            @Override
                                                            @ConvertedMethod
                                                            @ConvertedParameter(
                                                                index = 0,
                                                                name = "trace"
                                                            )
                                                            public Object run(
                                                                    RuntimeEnv env,
                                                                    Object thisvar,
                                                                    PassByReferenceArgs
                                                                            runtimePassByReferenceArgs,
                                                                    Object... args) {
                                                                Object trace =
                                                                        assignParameter(
                                                                                args, 0, false);
                                                                return ZVal.assign(
                                                                        Arr.runtimeStaticObject
                                                                                .except(
                                                                                        env,
                                                                                        trace,
                                                                                        ZVal
                                                                                                .arrayFromList(
                                                                                                        "args")));
                                                            }
                                                        }),
                                                "all",
                                                Handler.class)))
                        : ZVal.newArray(
                                new ZPair(
                                        "message",
                                        ZVal.isTrue(this.isHttpException(env, e))
                                                ? env.callMethod(e, "getMessage", Handler.class)
                                                : "Server Error")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "output")
    @ConvertedParameter(index = 1, name = "e", typeHint = "Exception")
    public Object renderForConsole(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        Object e = assignParameter(args, 1, false);
        env.callMethod(new Application(env), "renderException", Handler.class, e, output);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Exception")
    protected Object isHttpException(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.checkInstanceType(
                        e,
                        HttpException.class,
                        "Symfony\\Component\\HttpKernel\\Exception\\HttpException"));
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Exceptions\\Handler";

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
                    .setName("Illuminate\\Foundation\\Exceptions\\Handler")
                    .setLookup(
                            Handler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "container", "dontFlash", "dontReport", "internalDontReport")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Exceptions/Handler.php")
                    .addInterface("Illuminate\\Contracts\\Debug\\ExceptionHandler")
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
