package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.namespaces.Middleware.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.classes.AuthenticationException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Session/Middleware/AuthenticateSession.php

*/

public class AuthenticateSession extends RuntimeClassBase {

    public Object auth = null;

    public AuthenticateSession(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AuthenticateSession.class) {
            this.__construct(env, args);
        }
    }

    public AuthenticateSession(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "auth", typeHint = "Illuminate\\Contracts\\Auth\\Factory")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object auth = assignParameter(args, 0, false);
        this.auth = auth;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "next", typeHint = "Closure")
    public Object handle(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Session/Middleware")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Session/Middleware/AuthenticateSession.php");
        ReferenceContainer request = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object next = assignParameter(args, 1, false);
        Object passwordHash = null;
        if (ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        request.getObject(), "user", AuthenticateSession.class)))
                || ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        request.getObject(),
                                        "session",
                                        AuthenticateSession.class)))) {
            return ZVal.assign(
                    env.callFunctionDynamic(
                                    next,
                                    new RuntimeArgsWithReferences().add(0, request),
                                    request.getObject())
                            .value());
        }

        if (ZVal.isTrue(env.callMethod(this.auth, "viaRemember", AuthenticateSession.class))) {
            passwordHash =
                    ZVal.assign(
                            handleReturnReference(
                                            function_explode
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            "|",
                                                            env.callMethod(
                                                                    toObjectR(request.getObject())
                                                                            .accessProp(this, env)
                                                                            .name("cookies")
                                                                            .value(),
                                                                    "get",
                                                                    AuthenticateSession.class,
                                                                    env.callMethod(
                                                                            this.auth,
                                                                            "getRecallerName",
                                                                            AuthenticateSession
                                                                                    .class)))
                                                    .value())
                                    .arrayGet(env, 2));
            if (ZVal.notEqualityCheck(
                    passwordHash,
                    env.callMethod(
                            env.callMethod(request.getObject(), "user", AuthenticateSession.class),
                            "getAuthPassword",
                            AuthenticateSession.class))) {
                this.logout(env, request.getObject());
            }
        }

        if (!ZVal.isTrue(
                env.callMethod(
                        env.callMethod(request.getObject(), "session", AuthenticateSession.class),
                        "has",
                        AuthenticateSession.class,
                        "password_hash"))) {
            this.storePasswordHashInSession(env, request.getObject());
        }

        if (ZVal.strictNotEqualityCheck(
                env.callMethod(
                        env.callMethod(request.getObject(), "session", AuthenticateSession.class),
                        "get",
                        AuthenticateSession.class,
                        "password_hash"),
                "!==",
                env.callMethod(
                        env.callMethod(request.getObject(), "user", AuthenticateSession.class),
                        "getAuthPassword",
                        AuthenticateSession.class))) {
            this.logout(env, request.getObject());
        }

        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                env.callFunctionDynamic(
                                                next,
                                                new RuntimeArgsWithReferences().add(0, request),
                                                request.getObject())
                                        .value(),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Session\\Middleware",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object request = null;
                                        request =
                                                this.contextReferences.getCapturedValue("request");
                                        AuthenticateSession.this.storePasswordHashInSession(
                                                env, request);
                                        return null;
                                    }
                                }.use("request", request))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    protected Object storePasswordHashInSession(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        if (!ZVal.isTrue(env.callMethod(request, "user", AuthenticateSession.class))) {
            return null;
        }

        env.callMethod(
                env.callMethod(request, "session", AuthenticateSession.class),
                "put",
                AuthenticateSession.class,
                ZVal.newArray(
                        new ZPair(
                                "password_hash",
                                env.callMethod(
                                        env.callMethod(request, "user", AuthenticateSession.class),
                                        "getAuthPassword",
                                        AuthenticateSession.class))));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    protected Object logout(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        env.callMethod(this.auth, "logout", AuthenticateSession.class);
        env.callMethod(
                env.callMethod(request, "session", AuthenticateSession.class),
                "flush",
                AuthenticateSession.class);
        throw ZVal.getException(env, new AuthenticationException(env));
    }

    public static final Object CONST_class = "Illuminate\\Session\\Middleware\\AuthenticateSession";

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
                    .setName("Illuminate\\Session\\Middleware\\AuthenticateSession")
                    .setLookup(
                            AuthenticateSession.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("auth")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Session/Middleware/AuthenticateSession.php")
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
