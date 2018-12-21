package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Http.namespaces.Middleware.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.Cookie;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeClasses.date.DateInterval;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Carbon;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.classes.TokenMismatchException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeInterface;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Http/Middleware/VerifyCsrfToken.php

*/

public class VerifyCsrfToken extends RuntimeClassBase {

    public Object app = null;

    public Object encrypter = null;

    public Object except = ZVal.newArray();

    public VerifyCsrfToken(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == VerifyCsrfToken.class) {
            this.__construct(env, args);
        }
    }

    public VerifyCsrfToken(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "app", typeHint = "Illuminate\\Foundation\\Application")
    @ConvertedParameter(
        index = 1,
        name = "encrypter",
        typeHint = "Illuminate\\Contracts\\Encryption\\Encrypter"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object app = assignParameter(args, 0, false);
        Object encrypter = assignParameter(args, 1, false);
        this.app = app;
        this.encrypter = encrypter;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "next", typeHint = "Closure")
    public Object handle(RuntimeEnv env, Object... args) {
        ReferenceContainer request = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object next = assignParameter(args, 1, false);
        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.toBool(this.isReading(env, request.getObject()))
                                                || ZVal.toBool(this.runningUnitTests(env)))
                                || ZVal.toBool(this.inExceptArray(env, request.getObject())))
                || ZVal.toBool(this.tokensMatch(env, request.getObject()))) {
            return ZVal.assign(
                    this.addCookieToResponse(
                            env,
                            request.getObject(),
                            env.callFunctionDynamic(
                                            next,
                                            new RuntimeArgsWithReferences().add(0, request),
                                            request.getObject())
                                    .value()));
        }

        throw ZVal.getException(env, new TokenMismatchException(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    protected Object isReading(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        return ZVal.assign(
                function_in_array
                        .f
                        .env(env)
                        .call(
                                env.callMethod(request, "method", VerifyCsrfToken.class),
                                ZVal.arrayFromList("HEAD", "GET", "OPTIONS"))
                        .value());
    }

    @ConvertedMethod
    protected Object runningUnitTests(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(env.callMethod(this.app, "runningInConsole", VerifyCsrfToken.class))
                        && ZVal.toBool(
                                env.callMethod(
                                        this.app, "runningUnitTests", VerifyCsrfToken.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    protected Object inExceptArray(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object except = null;
        for (ZPair zpairResult420 : ZVal.getIterable(this.except, env, true)) {
            except = ZVal.assign(zpairResult420.getValue());
            if (ZVal.strictNotEqualityCheck(except, "!==", "/")) {
                except = function_trim.f.env(env).call(except, "/").value();
            }

            if (ZVal.toBool(env.callMethod(request, "fullUrlIs", VerifyCsrfToken.class, except))
                    || ZVal.toBool(env.callMethod(request, "is", VerifyCsrfToken.class, except))) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    protected Object tokensMatch(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object token = null;
        token = this.getTokenFromRequest(env, request);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(
                                                function_is_string
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                env.callMethod(
                                                                        env.callMethod(
                                                                                request,
                                                                                "session",
                                                                                VerifyCsrfToken
                                                                                        .class),
                                                                        "token",
                                                                        VerifyCsrfToken.class))
                                                        .value())
                                        && ZVal.toBool(
                                                function_is_string.f.env(env).call(token).value()))
                        && ZVal.toBool(
                                NamespaceGlobal.hash_equals
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        env.callMethod(
                                                                request,
                                                                "session",
                                                                VerifyCsrfToken.class),
                                                        "token",
                                                        VerifyCsrfToken.class),
                                                token)
                                        .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    protected Object getTokenFromRequest(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object header = null;
        Object ternaryExpressionTemp = null;
        Object token = null;
        token =
                ZVal.assign(
                        ZVal.isTrue(
                                        ternaryExpressionTemp =
                                                env.callMethod(
                                                        request,
                                                        "input",
                                                        VerifyCsrfToken.class,
                                                        "_token"))
                                ? ternaryExpressionTemp
                                : env.callMethod(
                                        request, "header", VerifyCsrfToken.class, "X-CSRF-TOKEN"));
        if (ZVal.toBool(!ZVal.isTrue(token))
                && ZVal.toBool(
                        header =
                                env.callMethod(
                                        request,
                                        "header",
                                        VerifyCsrfToken.class,
                                        "X-XSRF-TOKEN"))) {
            token = env.callMethod(this.encrypter, "decrypt", VerifyCsrfToken.class, header);
        }

        return ZVal.assign(token);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "response")
    protected Object addCookieToResponse(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object response = assignParameter(args, 1, false);
        Object ternaryExpressionTemp = null;
        ReferenceContainer config = new BasicReferenceContainer(null);
        config.setObject(
                com.project
                        .convertedCode
                        .globalNamespace
                        .functions
                        .config
                        .f
                        .env(env)
                        .call("session")
                        .value());
        env.callMethod(
                toObjectR(response).accessProp(this, env).name("headers").value(),
                "setCookie",
                VerifyCsrfToken.class,
                new Cookie(
                        env,
                        "XSRF-TOKEN",
                        env.callMethod(
                                env.callMethod(request, "session", VerifyCsrfToken.class),
                                "token",
                                VerifyCsrfToken.class),
                        this.availableAt(env, ZVal.multiply(60, config.arrayGet(env, "lifetime"))),
                        config.arrayGet(env, "path"),
                        config.arrayGet(env, "domain"),
                        config.arrayGet(env, "secure"),
                        false,
                        false,
                        ZVal.isDefined(ternaryExpressionTemp = config.arrayGet(env, "same_site"))
                                ? ternaryExpressionTemp
                                : ZVal.getNull()));
        return ZVal.assign(response);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay")
    protected Object secondsUntil(RuntimeEnv env, Object... args) {
        Object delay = assignParameter(args, 0, false);
        delay = this.parseDateInterval(env, delay);
        return ZVal.assign(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        delay, DateTimeInterface.class, "DateTimeInterface"))
                        ? NamespaceGlobal.max
                                .env(env)
                                .call(
                                        0,
                                        ZVal.subtract(
                                                env.callMethod(
                                                        delay,
                                                        "getTimestamp",
                                                        VerifyCsrfToken.class),
                                                this.currentTime(env)))
                                .value()
                        : ZVal.toLong(delay));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay", defaultValue = "0", defaultValueType = "number")
    protected Object availableAt(RuntimeEnv env, Object... args) {
        Object delay = assignParameter(args, 0, true);
        if (null == delay) {
            delay = 0;
        }
        delay = this.parseDateInterval(env, delay);
        return ZVal.assign(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        delay, DateTimeInterface.class, "DateTimeInterface"))
                        ? env.callMethod(delay, "getTimestamp", VerifyCsrfToken.class)
                        : env.callMethod(
                                env.callMethod(
                                        Carbon.runtimeStaticObject.now(env),
                                        "addSeconds",
                                        VerifyCsrfToken.class,
                                        delay),
                                "getTimestamp",
                                VerifyCsrfToken.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay")
    protected Object parseDateInterval(RuntimeEnv env, Object... args) {
        ReferenceContainer delay = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (ZVal.isTrue(
                ZVal.checkInstanceType(delay.getObject(), DateInterval.class, "DateInterval"))) {
            delay.setObject(
                    env.callMethod(
                            Carbon.runtimeStaticObject.now(env),
                            new RuntimeArgsWithReferences().add(0, delay),
                            "add",
                            VerifyCsrfToken.class,
                            delay.getObject()));
        }

        return ZVal.assign(delay.getObject());
    }

    @ConvertedMethod
    protected Object currentTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        Carbon.runtimeStaticObject.now(env),
                        "getTimestamp",
                        VerifyCsrfToken.class));
    }

    public static final Object CONST_class =
            "Illuminate\\Foundation\\Http\\Middleware\\VerifyCsrfToken";

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
                    .setName("Illuminate\\Foundation\\Http\\Middleware\\VerifyCsrfToken")
                    .setLookup(
                            VerifyCsrfToken.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "encrypter", "except")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Http/Middleware/VerifyCsrfToken.php")
                    .addTrait("Illuminate\\Support\\InteractsWithTime")
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
