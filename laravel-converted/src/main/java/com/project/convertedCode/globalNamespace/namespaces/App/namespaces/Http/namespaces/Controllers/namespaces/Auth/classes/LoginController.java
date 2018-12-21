package com.project.convertedCode.globalNamespace.namespaces.App.namespaces.Http.namespaces.Controllers.namespaces.Auth.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.functions.redirect;
import com.project.convertedCode.globalNamespace.functions.app;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_property_exists;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.classes.ValidationException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.App.namespaces.Http.namespaces.Controllers.classes.Controller;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.functions.view;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Auth;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.event;
import com.project.convertedCode.globalNamespace.functions.trans;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 app/Http/Controllers/Auth/LoginController.php

*/

public class LoginController extends Controller {

    public Object redirectTo = "/home";

    public LoginController(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == LoginController.class) {
            this.__construct(env, args);
        }
    }

    public LoginController(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        env.callMethod(
                env.callMethod(this, "middleware", LoginController.class, "guest"),
                "except",
                LoginController.class,
                "logout");
        return null;
    }

    @ConvertedMethod
    public Object showLoginForm(RuntimeEnv env, Object... args) {
        return ZVal.assign(view.f.env(env).call("auth.login").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    public Object login(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        this.validateLogin(env, request);
        if (ZVal.isTrue(this.hasTooManyLoginAttempts(env, request))) {
            this.fireLockoutEvent(env, request);
            return ZVal.assign(this.sendLockoutResponse(env, request));
        }

        if (ZVal.isTrue(this.attemptLogin(env, request))) {
            return ZVal.assign(this.sendLoginResponse(env, request));
        }

        this.incrementLoginAttempts(env, request);
        return ZVal.assign(this.sendFailedLoginResponse(env, request));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    protected Object validateLogin(RuntimeEnv env, Object... args) {
        ReferenceContainer request = new BasicReferenceContainer(assignParameter(args, 0, false));
        env.callMethod(
                this,
                new RuntimeArgsWithReferences().add(0, request),
                "validate",
                LoginController.class,
                request.getObject(),
                ZVal.newArray(
                        new ZPair(this.username(env), "required|string"),
                        new ZPair("password", "required|string")));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    protected Object attemptLogin(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this.guard(env),
                        "attempt",
                        LoginController.class,
                        this.credentials(env, request),
                        env.callMethod(request, "filled", LoginController.class, "remember")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    protected Object credentials(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        request, "only", LoginController.class, this.username(env), "password"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    protected Object sendLoginResponse(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        env.callMethod(
                env.callMethod(request, "session", LoginController.class),
                "regenerate",
                LoginController.class);
        this.clearLoginAttempts(env, request);
        return ZVal.assign(
                ZVal.isTrue(
                                ternaryExpressionTemp =
                                        this.authenticated(
                                                env,
                                                request,
                                                env.callMethod(
                                                        this.guard(env),
                                                        "user",
                                                        LoginController.class)))
                        ? ternaryExpressionTemp
                        : env.callMethod(
                                redirect.f.env(env).call().value(),
                                "intended",
                                LoginController.class,
                                this.redirectPath(env)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    @ConvertedParameter(index = 1, name = "user")
    protected Object authenticated(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object user = assignParameter(args, 1, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    protected Object sendFailedLoginResponse(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        throw ZVal.getException(
                env,
                ValidationException.runtimeStaticObject.withMessages(
                        env,
                        ZVal.newArray(
                                new ZPair(
                                        this.username(env),
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        trans.f
                                                                .env(env)
                                                                .call("auth.failed")
                                                                .value()))))));
    }

    @ConvertedMethod
    public Object username(RuntimeEnv env, Object... args) {
        return "email";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    public Object logout(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        env.callMethod(this.guard(env), "logout", LoginController.class);
        env.callMethod(
                env.callMethod(request, "session", LoginController.class),
                "invalidate",
                LoginController.class);
        return ZVal.assign(
                ZVal.isTrue(ternaryExpressionTemp = this.loggedOut(env, request))
                        ? ternaryExpressionTemp
                        : redirect.f.env(env).call("/").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    protected Object loggedOut(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    protected Object guard(RuntimeEnv env, Object... args) {
        return ZVal.assign(Auth.runtimeStaticObject.callUnknownStaticMethod(env, "guard"));
    }

    @ConvertedMethod
    public Object redirectPath(RuntimeEnv env, Object... args) {
        if (function_method_exists.f.env(env).call(this, "redirectTo").getBool()) {
            return ZVal.assign(env.callMethod(this, "redirectTo", LoginController.class));
        }

        return ZVal.assign(
                function_property_exists.f.env(env).call(this, "redirectTo").getBool()
                        ? this.redirectTo
                        : "/home");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    protected Object hasTooManyLoginAttempts(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this.limiter(env),
                        "tooManyAttempts",
                        LoginController.class,
                        this.throttleKey(env, request),
                        this.maxAttempts(env)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    protected Object incrementLoginAttempts(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        env.callMethod(
                this.limiter(env),
                "hit",
                LoginController.class,
                this.throttleKey(env, request),
                this.decayMinutes(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    protected Object sendLockoutResponse(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object seconds = null;
        seconds =
                env.callMethod(
                        this.limiter(env),
                        "availableIn",
                        LoginController.class,
                        this.throttleKey(env, request));
        throw ZVal.getException(
                env,
                env.callMethod(
                        ValidationException.runtimeStaticObject.withMessages(
                                env,
                                ZVal.newArray(
                                        new ZPair(
                                                this.username(env),
                                                ZVal.newArray(
                                                        new ZPair(
                                                                0,
                                                                StaticMethodUtils
                                                                        .getStaticBaseClass(
                                                                                ZVal
                                                                                        .resolveClassAlias(
                                                                                                env,
                                                                                                "Lang"),
                                                                                env)
                                                                        .callUnknownStaticMethod(
                                                                                env,
                                                                                "get",
                                                                                new RuntimeArgsWithReferences(),
                                                                                "auth.throttle",
                                                                                ZVal.newArray(
                                                                                        new ZPair(
                                                                                                "seconds",
                                                                                                seconds)))))))),
                        "status",
                        LoginController.class,
                        429));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    protected Object clearLoginAttempts(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        env.callMethod(
                this.limiter(env), "clear", LoginController.class, this.throttleKey(env, request));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    protected Object fireLockoutEvent(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        event.f.env(env).call(env.createNew(ZVal.resolveClassAlias(env, "Lockout"), request));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    protected Object throttleKey(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(
                                StaticMethodUtils.getStaticBaseClass(
                                                ZVal.resolveClassAlias(env, "Str"), env)
                                        .callUnknownStaticMethod(
                                                env,
                                                "lower",
                                                new RuntimeArgsWithReferences(),
                                                env.callMethod(
                                                        request,
                                                        "input",
                                                        LoginController.class,
                                                        this.username(env))),
                                env)
                        + "|"
                        + toStringR(env.callMethod(request, "ip", LoginController.class), env));
    }

    @ConvertedMethod
    protected Object limiter(RuntimeEnv env, Object... args) {
        return ZVal.assign(app.f.env(env).call("RateLimiter").value());
    }

    @ConvertedMethod
    public Object maxAttempts(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_property_exists.f.env(env).call(this, "maxAttempts").getBool()
                        ? toObjectR(this).accessProp(this, env).name("maxAttempts").value()
                        : 5);
    }

    @ConvertedMethod
    public Object decayMinutes(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_property_exists.f.env(env).call(this, "decayMinutes").getBool()
                        ? toObjectR(this).accessProp(this, env).name("decayMinutes").value()
                        : 1);
    }

    public static final Object CONST_class = "App\\Http\\Controllers\\Auth\\LoginController";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Controller.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("App\\Http\\Controllers\\Auth\\LoginController")
                    .setLookup(
                            LoginController.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("middleware", "redirectTo")
                    .setFilename("app/Http/Controllers/Auth/LoginController.php")
                    .addTrait("Illuminate\\Foundation\\Auth\\AuthenticatesUsers")
                    .addExtendsClass("App\\Http\\Controllers\\Controller")
                    .addExtendsClass("Illuminate\\Routing\\Controller")
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
