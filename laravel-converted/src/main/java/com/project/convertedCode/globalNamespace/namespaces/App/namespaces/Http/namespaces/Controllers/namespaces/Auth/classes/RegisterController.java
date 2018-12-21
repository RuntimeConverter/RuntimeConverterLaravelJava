package com.project.convertedCode.globalNamespace.namespaces.App.namespaces.Http.namespaces.Controllers.namespaces.Auth.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.functions.redirect;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_property_exists;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.App.classes.User;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.App.namespaces.Http.namespaces.Controllers.classes.Controller;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Hash;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.functions.view;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Auth;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.event;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Validator;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Events.classes.Registered;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 app/Http/Controllers/Auth/RegisterController.php

*/

public class RegisterController extends Controller {

    public Object redirectTo = "/home";

    public RegisterController(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RegisterController.class) {
            this.__construct(env, args);
        }
    }

    public RegisterController(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        env.callMethod(this, "middleware", RegisterController.class, "guest");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    protected Object validator(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        return ZVal.assign(
                Validator.runtimeStaticObject.callUnknownStaticMethod(
                        env,
                        "make",
                        new RuntimeArgsWithReferences(),
                        data,
                        ZVal.newArray(
                                new ZPair("name", "required|string|max:255"),
                                new ZPair("email", "required|string|email|max:255|unique:users"),
                                new ZPair("password", "required|string|min:6|confirmed"))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    protected Object create(RuntimeEnv env, Object... args) {
        ReferenceContainer data = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                User.runtimeStaticObject.callUnknownStaticMethod(
                        env,
                        "create",
                        new RuntimeArgsWithReferences(),
                        ZVal.newArray(
                                new ZPair("name", data.arrayGet(env, "name")),
                                new ZPair("email", data.arrayGet(env, "email")),
                                new ZPair(
                                        "password",
                                        Hash.runtimeStaticObject.callUnknownStaticMethod(
                                                env,
                                                "make",
                                                new RuntimeArgsWithReferences(),
                                                data.arrayGet(env, "password"))))));
    }

    @ConvertedMethod
    public Object showRegistrationForm(RuntimeEnv env, Object... args) {
        return ZVal.assign(view.f.env(env).call("auth.register").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    public Object register(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        Object user = null;
        env.callMethod(
                this.validator(env, env.callMethod(request, "all", RegisterController.class)),
                "validate",
                RegisterController.class);
        event.f
                .env(env)
                .call(
                        new Registered(
                                env,
                                user =
                                        this.create(
                                                env,
                                                env.callMethod(
                                                        request,
                                                        "all",
                                                        RegisterController.class))));
        env.callMethod(this.guard(env), "login", RegisterController.class, user);
        return ZVal.assign(
                ZVal.isTrue(ternaryExpressionTemp = this.registered(env, request, user))
                        ? ternaryExpressionTemp
                        : redirect.f.env(env).call(this.redirectPath(env)).value());
    }

    @ConvertedMethod
    protected Object guard(RuntimeEnv env, Object... args) {
        return ZVal.assign(Auth.runtimeStaticObject.callUnknownStaticMethod(env, "guard"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    @ConvertedParameter(index = 1, name = "user")
    protected Object registered(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object user = assignParameter(args, 1, false);
        return null;
    }

    @ConvertedMethod
    public Object redirectPath(RuntimeEnv env, Object... args) {
        if (function_method_exists.f.env(env).call(this, "redirectTo").getBool()) {
            return ZVal.assign(env.callMethod(this, "redirectTo", RegisterController.class));
        }

        return ZVal.assign(
                function_property_exists.f.env(env).call(this, "redirectTo").getBool()
                        ? this.redirectTo
                        : "/home");
    }

    public static final Object CONST_class = "App\\Http\\Controllers\\Auth\\RegisterController";

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
                    .setName("App\\Http\\Controllers\\Auth\\RegisterController")
                    .setLookup(
                            RegisterController.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("middleware", "redirectTo")
                    .setFilename("app/Http/Controllers/Auth/RegisterController.php")
                    .addTrait("Illuminate\\Foundation\\Auth\\RegistersUsers")
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
