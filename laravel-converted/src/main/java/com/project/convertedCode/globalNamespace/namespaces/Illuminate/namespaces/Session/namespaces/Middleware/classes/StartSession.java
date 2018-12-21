package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.namespaces.Middleware.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.Cookie;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Carbon;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.classes.CookieSessionHandler;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Session/Middleware/StartSession.php

*/

public class StartSession extends RuntimeClassBase {

    public Object manager = null;

    public Object sessionHandled = false;

    public StartSession(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == StartSession.class) {
            this.__construct(env, args);
        }
    }

    public StartSession(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "manager",
        typeHint = "Illuminate\\Session\\SessionManager"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object manager = assignParameter(args, 0, false);
        this.manager = manager;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "next", typeHint = "Closure")
    public Object handle(RuntimeEnv env, Object... args) {
        ReferenceContainer request = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object next = assignParameter(args, 1, false);
        Object session = null;
        Object response = null;
        this.sessionHandled = true;
        if (ZVal.isTrue(this.sessionConfigured(env))) {
            env.callMethod(
                    request.getObject(),
                    "setLaravelSession",
                    StartSession.class,
                    session = this.startSession(env, request.getObject()));
            this.collectGarbage(env, session);
        }

        response =
                env.callFunctionDynamic(
                                next,
                                new RuntimeArgsWithReferences().add(0, request),
                                request.getObject())
                        .value();
        if (ZVal.isTrue(this.sessionConfigured(env))) {
            this.storeCurrentUrl(env, request.getObject(), session);
            this.addCookieToResponse(env, response, session);
        }

        return ZVal.assign(response);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "response")
    public Object terminate(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object response = assignParameter(args, 1, false);
        if (ZVal.toBool(
                        ZVal.toBool(this.sessionHandled)
                                && ZVal.toBool(this.sessionConfigured(env)))
                && ZVal.toBool(!ZVal.isTrue(this.usingCookieSessions(env)))) {
            env.callMethod(
                    env.callMethod(this.manager, "driver", StartSession.class),
                    "save",
                    StartSession.class);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    protected Object startSession(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Session/Middleware")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Session/Middleware/StartSession.php");
        Object request = assignParameter(args, 0, false);
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                this.getSession(env, request),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Session\\Middleware",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "session")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object session = assignParameter(args, 0, false);
                                        Object request = null;
                                        request =
                                                this.contextReferences.getCapturedValue("request");
                                        env.callMethod(
                                                session,
                                                "setRequestOnHandler",
                                                StartSession.class,
                                                request);
                                        env.callMethod(session, "start", StartSession.class);
                                        return null;
                                    }
                                }.use("request", request))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    public Object getSession(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Session/Middleware")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Session/Middleware/StartSession.php");
        Object request = assignParameter(args, 0, false);
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                env.callMethod(this.manager, "driver", StartSession.class),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Session\\Middleware",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "session")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object session = assignParameter(args, 0, false);
                                        Object request = null;
                                        request =
                                                this.contextReferences.getCapturedValue("request");
                                        env.callMethod(
                                                session,
                                                "setId",
                                                StartSession.class,
                                                env.callMethod(
                                                        toObjectR(request)
                                                                .accessProp(this, env)
                                                                .name("cookies")
                                                                .value(),
                                                        "get",
                                                        StartSession.class,
                                                        env.callMethod(
                                                                session,
                                                                "getName",
                                                                StartSession.class)));
                                        return null;
                                    }
                                }.use("request", request))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "session",
        typeHint = "Illuminate\\Contracts\\Session\\Session"
    )
    protected Object collectGarbage(RuntimeEnv env, Object... args) {
        Object session = assignParameter(args, 0, false);
        Object config = null;
        config = env.callMethod(this.manager, "getSessionConfig", StartSession.class);
        if (ZVal.isTrue(this.configHitsLottery(env, config))) {
            env.callMethod(
                    env.callMethod(session, "getHandler", StartSession.class),
                    "gc",
                    StartSession.class,
                    this.getSessionLifetimeInSeconds(env));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object configHitsLottery(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                ZVal.isLessThanOrEqualTo(
                        NamespaceGlobal.random_int
                                .env(env)
                                .call(1, config.arrayGet(env, "lottery", 1))
                                .value(),
                        "<=",
                        config.arrayGet(env, "lottery", 0)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    @ConvertedParameter(index = 1, name = "session")
    protected Object storeCurrentUrl(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object session = assignParameter(args, 1, false);
        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                env.callMethod(
                                                        request, "method", StartSession.class),
                                                "===",
                                                "GET"))
                                && ZVal.toBool(
                                        env.callMethod(request, "route", StartSession.class)))
                && ZVal.toBool(!ZVal.isTrue(env.callMethod(request, "ajax", StartSession.class)))) {
            env.callMethod(
                    session,
                    "setPreviousUrl",
                    StartSession.class,
                    env.callMethod(request, "fullUrl", StartSession.class));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "response",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response"
    )
    @ConvertedParameter(
        index = 1,
        name = "session",
        typeHint = "Illuminate\\Contracts\\Session\\Session"
    )
    protected Object addCookieToResponse(RuntimeEnv env, Object... args) {
        Object response = assignParameter(args, 0, false);
        Object session = assignParameter(args, 1, false);
        Object ternaryExpressionTemp = null;
        ReferenceContainer config = new BasicReferenceContainer(null);
        if (ZVal.isTrue(this.usingCookieSessions(env))) {
            env.callMethod(
                    env.callMethod(this.manager, "driver", StartSession.class),
                    "save",
                    StartSession.class);
        }

        if (ZVal.isTrue(
                this.sessionIsPersistent(
                        env,
                        config.setObject(
                                env.callMethod(
                                        this.manager, "getSessionConfig", StartSession.class))))) {
            env.callMethod(
                    toObjectR(response).accessProp(this, env).name("headers").value(),
                    "setCookie",
                    StartSession.class,
                    new Cookie(
                            env,
                            env.callMethod(session, "getName", StartSession.class),
                            env.callMethod(session, "getId", StartSession.class),
                            this.getCookieExpirationDate(env),
                            config.arrayGet(env, "path"),
                            config.arrayGet(env, "domain"),
                            ZVal.isDefined(ternaryExpressionTemp = config.arrayGet(env, "secure"))
                                    ? ternaryExpressionTemp
                                    : false,
                            ZVal.isDefined(
                                            ternaryExpressionTemp =
                                                    config.arrayGet(env, "http_only"))
                                    ? ternaryExpressionTemp
                                    : true,
                            false,
                            ZVal.isDefined(
                                            ternaryExpressionTemp =
                                                    config.arrayGet(env, "same_site"))
                                    ? ternaryExpressionTemp
                                    : ZVal.getNull()));
        }

        return null;
    }

    @ConvertedMethod
    protected Object getSessionLifetimeInSeconds(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.multiply(
                        ZVal.isDefined(
                                        ternaryExpressionTemp =
                                                handleReturnReference(
                                                                env.callMethod(
                                                                        this.manager,
                                                                        "getSessionConfig",
                                                                        StartSession.class))
                                                        .arrayGet(env, "lifetime"))
                                ? ternaryExpressionTemp
                                : ZVal.getNull(),
                        60));
    }

    @ConvertedMethod
    protected Object getCookieExpirationDate(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(null);
        config.setObject(env.callMethod(this.manager, "getSessionConfig", StartSession.class));
        return ZVal.assign(
                ZVal.isTrue(config.arrayGet(env, "expire_on_close"))
                        ? 0
                        : env.callMethod(
                                Carbon.runtimeStaticObject.now(env),
                                "addMinutes",
                                StartSession.class,
                                config.arrayGet(env, "lifetime")));
    }

    @ConvertedMethod
    protected Object sessionConfigured(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                !function_is_null
                        .f
                        .env(env)
                        .call(
                                ZVal.isDefined(
                                                ternaryExpressionTemp =
                                                        handleReturnReference(
                                                                        env.callMethod(
                                                                                this.manager,
                                                                                "getSessionConfig",
                                                                                StartSession.class))
                                                                .arrayGet(env, "driver"))
                                        ? ternaryExpressionTemp
                                        : ZVal.getNull())
                        .getBool());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "config",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object sessionIsPersistent(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, true));
        if (null == config.getObject()) {
            config.setObject(ZVal.getNull());
        }
        Object ternaryExpressionTemp = null;
        config.setObject(
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = config.getObject())
                                ? ternaryExpressionTemp
                                : env.callMethod(
                                        this.manager, "getSessionConfig", StartSession.class)));
        return ZVal.assign(
                !function_in_array
                        .f
                        .env(env)
                        .call(
                                config.arrayGet(env, "driver"),
                                ZVal.newArray(new ZPair(0, ZVal.getNull()), new ZPair(1, "array")))
                        .getBool());
    }

    @ConvertedMethod
    protected Object usingCookieSessions(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.sessionConfigured(env))) {
            return ZVal.assign(
                    ZVal.checkInstanceType(
                            env.callMethod(
                                    env.callMethod(this.manager, "driver", StartSession.class),
                                    "getHandler",
                                    StartSession.class),
                            CookieSessionHandler.class,
                            "Illuminate\\Session\\CookieSessionHandler"));
        }

        return ZVal.assign(false);
    }

    public static final Object CONST_class = "Illuminate\\Session\\Middleware\\StartSession";

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
                    .setName("Illuminate\\Session\\Middleware\\StartSession")
                    .setLookup(
                            StartSession.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("manager", "sessionHandled")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Session/Middleware/StartSession.php")
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
