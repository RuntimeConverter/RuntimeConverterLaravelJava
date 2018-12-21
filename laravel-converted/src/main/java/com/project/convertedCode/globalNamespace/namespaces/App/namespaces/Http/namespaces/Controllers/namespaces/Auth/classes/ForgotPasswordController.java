package com.project.convertedCode.globalNamespace.namespaces.App.namespaces.Http.namespaces.Controllers.namespaces.Auth.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.functions.back;
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
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Password;
import com.project.convertedCode.globalNamespace.functions.trans;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 app/Http/Controllers/Auth/ForgotPasswordController.php

*/

public class ForgotPasswordController extends Controller {

    public ForgotPasswordController(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ForgotPasswordController.class) {
            this.__construct(env, args);
        }
    }

    public ForgotPasswordController(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        env.callMethod(this, "middleware", ForgotPasswordController.class, "guest");
        return null;
    }

    @ConvertedMethod
    public Object showLinkRequestForm(RuntimeEnv env, Object... args) {
        return ZVal.assign(view.f.env(env).call("auth.passwords.email").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    public Object sendResetLinkEmail(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object response = null;
        this.validateEmail(env, request);
        response =
                env.callMethod(
                        this.broker(env),
                        "sendResetLink",
                        ForgotPasswordController.class,
                        env.callMethod(request, "only", ForgotPasswordController.class, "email"));
        return ZVal.assign(
                ZVal.equalityCheck(response, Password.CONST_RESET_LINK_SENT)
                        ? this.sendResetLinkResponse(env, response)
                        : this.sendResetLinkFailedResponse(env, request, response));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    protected Object validateEmail(RuntimeEnv env, Object... args) {
        ReferenceContainer request = new BasicReferenceContainer(assignParameter(args, 0, false));
        env.callMethod(
                this,
                new RuntimeArgsWithReferences().add(0, request),
                "validate",
                ForgotPasswordController.class,
                request.getObject(),
                ZVal.newArray(new ZPair("email", "required|email")));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "response")
    protected Object sendResetLinkResponse(RuntimeEnv env, Object... args) {
        Object response = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        back.f.env(env).call().value(),
                        "with",
                        ForgotPasswordController.class,
                        "status",
                        trans.f.env(env).call(response).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    @ConvertedParameter(index = 1, name = "response")
    protected Object sendResetLinkFailedResponse(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object response = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                back.f.env(env).call().value(),
                                "withInput",
                                ForgotPasswordController.class,
                                env.callMethod(
                                        request, "only", ForgotPasswordController.class, "email")),
                        "withErrors",
                        ForgotPasswordController.class,
                        ZVal.newArray(
                                new ZPair("email", trans.f.env(env).call(response).value()))));
    }

    @ConvertedMethod
    public Object broker(RuntimeEnv env, Object... args) {
        return ZVal.assign(Password.runtimeStaticObject.callUnknownStaticMethod(env, "broker"));
    }

    public static final Object CONST_class =
            "App\\Http\\Controllers\\Auth\\ForgotPasswordController";

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
                    .setName("App\\Http\\Controllers\\Auth\\ForgotPasswordController")
                    .setLookup(
                            ForgotPasswordController.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("middleware")
                    .setFilename("app/Http/Controllers/Auth/ForgotPasswordController.php")
                    .addTrait("Illuminate\\Foundation\\Auth\\SendsPasswordResetEmails")
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
