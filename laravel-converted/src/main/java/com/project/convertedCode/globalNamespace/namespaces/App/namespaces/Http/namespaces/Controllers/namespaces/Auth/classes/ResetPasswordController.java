package com.project.convertedCode.globalNamespace.namespaces.App.namespaces.Http.namespaces.Controllers.namespaces.Auth.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Hash;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.functions.view;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Auth;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Events.classes.PasswordReset;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.event;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Password;
import com.project.convertedCode.globalNamespace.functions.redirect;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_property_exists;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.App.namespaces.Http.namespaces.Controllers.classes.Controller;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.functions.trans;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 app/Http/Controllers/Auth/ResetPasswordController.php

*/

public class ResetPasswordController extends Controller {

    public Object redirectTo = "/home";

    public ResetPasswordController(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ResetPasswordController.class) {
            this.__construct(env, args);
        }
    }

    public ResetPasswordController(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        env.callMethod(this, "middleware", ResetPasswordController.class, "guest");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    @ConvertedParameter(
        index = 1,
        name = "token",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object showResetForm(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object token = assignParameter(args, 1, true);
        if (null == token) {
            token = ZVal.getNull();
        }
        return ZVal.assign(
                env.callMethod(
                        view.f.env(env).call("auth.passwords.reset").value(),
                        "with",
                        ResetPasswordController.class,
                        ZVal.newArray(
                                new ZPair("token", token),
                                new ZPair(
                                        "email",
                                        toObjectR(request)
                                                .accessProp(this, env)
                                                .name("email")
                                                .value()))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    public Object reset(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Auth")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Auth/ResetsPasswords.php");
        ReferenceContainer request = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object response = null;
        env.callMethod(
                this,
                new RuntimeArgsWithReferences().add(0, request),
                "validate",
                ResetPasswordController.class,
                request.getObject(),
                this.rules(env),
                this.validationErrorMessages(env));
        response =
                env.callMethod(
                        this.broker(env),
                        "reset",
                        ResetPasswordController.class,
                        this.credentials(env, request.getObject()),
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Foundation\\Auth",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "user")
                            @ConvertedParameter(index = 1, name = "password")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Object user = assignParameter(args, 0, false);
                                Object password = assignParameter(args, 1, false);
                                ResetPasswordController.this.resetPassword(env, user, password);
                                return null;
                            }
                        });
        return ZVal.assign(
                ZVal.equalityCheck(response, Password.CONST_PASSWORD_RESET)
                        ? this.sendResetResponse(env, response)
                        : this.sendResetFailedResponse(env, request.getObject(), response));
    }

    @ConvertedMethod
    protected Object rules(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("token", "required"),
                        new ZPair("email", "required|email"),
                        new ZPair("password", "required|confirmed|min:6")));
    }

    @ConvertedMethod
    protected Object validationErrorMessages(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    protected Object credentials(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        request,
                        "only",
                        ResetPasswordController.class,
                        "email",
                        "password",
                        "password_confirmation",
                        "token"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "user")
    @ConvertedParameter(index = 1, name = "password")
    protected Object resetPassword(RuntimeEnv env, Object... args) {
        Object user = assignParameter(args, 0, false);
        Object password = assignParameter(args, 1, false);
        toObjectR(user)
                .accessProp(this, env)
                .name("password")
                .set(
                        Hash.runtimeStaticObject.callUnknownStaticMethod(
                                env, "make", new RuntimeArgsWithReferences(), password));
        env.callMethod(
                user,
                "setRememberToken",
                ResetPasswordController.class,
                Str.runtimeStaticObject.random(env, 60));
        env.callMethod(user, "save", ResetPasswordController.class);
        event.f.env(env).call(new PasswordReset(env, user));
        env.callMethod(this.guard(env), "login", ResetPasswordController.class, user);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "response")
    protected Object sendResetResponse(RuntimeEnv env, Object... args) {
        Object response = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        redirect.f.env(env).call(this.redirectPath(env)).value(),
                        "with",
                        ResetPasswordController.class,
                        "status",
                        trans.f.env(env).call(response).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    @ConvertedParameter(index = 1, name = "response")
    protected Object sendResetFailedResponse(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object response = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        redirect.f.env(env).call().value(),
                                        "back",
                                        ResetPasswordController.class),
                                "withInput",
                                ResetPasswordController.class,
                                env.callMethod(
                                        request, "only", ResetPasswordController.class, "email")),
                        "withErrors",
                        ResetPasswordController.class,
                        ZVal.newArray(
                                new ZPair("email", trans.f.env(env).call(response).value()))));
    }

    @ConvertedMethod
    public Object broker(RuntimeEnv env, Object... args) {
        return ZVal.assign(Password.runtimeStaticObject.callUnknownStaticMethod(env, "broker"));
    }

    @ConvertedMethod
    protected Object guard(RuntimeEnv env, Object... args) {
        return ZVal.assign(Auth.runtimeStaticObject.callUnknownStaticMethod(env, "guard"));
    }

    @ConvertedMethod
    public Object redirectPath(RuntimeEnv env, Object... args) {
        if (function_method_exists.f.env(env).call(this, "redirectTo").getBool()) {
            return ZVal.assign(env.callMethod(this, "redirectTo", ResetPasswordController.class));
        }

        return ZVal.assign(
                function_property_exists.f.env(env).call(this, "redirectTo").getBool()
                        ? this.redirectTo
                        : "/home");
    }

    public static final Object CONST_class =
            "App\\Http\\Controllers\\Auth\\ResetPasswordController";

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
                    .setName("App\\Http\\Controllers\\Auth\\ResetPasswordController")
                    .setLookup(
                            ResetPasswordController.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("middleware", "redirectTo")
                    .setFilename("app/Http/Controllers/Auth/ResetPasswordController.php")
                    .addTrait("Illuminate\\Foundation\\Auth\\ResetsPasswords")
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
