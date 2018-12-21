package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.classes.AuthenticationException;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Auth.classes.Guard;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Auth/TokenGuard.php

*/

public class TokenGuard extends RuntimeClassBase implements Guard {

    public Object request = null;

    public Object inputKey = null;

    public Object storageKey = null;

    public Object user = null;

    public Object provider = null;

    public TokenGuard(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TokenGuard.class) {
            this.__construct(env, args);
        }
    }

    public TokenGuard(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "provider",
        typeHint = "Illuminate\\Contracts\\Auth\\UserProvider"
    )
    @ConvertedParameter(index = 1, name = "request", typeHint = "Illuminate\\Http\\Request")
    @ConvertedParameter(index = 2, name = "inputKey")
    @ConvertedParameter(index = 3, name = "storageKey")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object provider = assignParameter(args, 0, false);
        Object request = assignParameter(args, 1, false);
        Object inputKey = assignParameter(args, 2, true);
        if (null == inputKey) {
            inputKey = "api_token";
        }
        Object storageKey = assignParameter(args, 3, true);
        if (null == storageKey) {
            storageKey = "api_token";
        }
        this.request = request;
        this.provider = provider;
        this.inputKey = inputKey;
        this.storageKey = storageKey;
        return null;
    }

    @ConvertedMethod
    public Object user(RuntimeEnv env, Object... args) {
        Object user = null;
        Object token = null;
        if (!function_is_null.f.env(env).call(this.user).getBool()) {
            return ZVal.assign(this.user);
        }

        user = ZVal.getNull();
        token = this.getTokenForRequest(env);
        if (!ZVal.isEmpty(token)) {
            user =
                    env.callMethod(
                            this.provider,
                            "retrieveByCredentials",
                            TokenGuard.class,
                            ZVal.newArray(new ZPair(this.storageKey, token)));
        }

        return ZVal.assign(this.user = user);
    }

    @ConvertedMethod
    public Object getTokenForRequest(RuntimeEnv env, Object... args) {
        Object token = null;
        token = env.callMethod(this.request, "query", TokenGuard.class, this.inputKey);
        if (ZVal.isEmpty(token)) {
            token = env.callMethod(this.request, "input", TokenGuard.class, this.inputKey);
        }

        if (ZVal.isEmpty(token)) {
            token = env.callMethod(this.request, "bearerToken", TokenGuard.class);
        }

        if (ZVal.isEmpty(token)) {
            token = env.callMethod(this.request, "getPassword", TokenGuard.class);
        }

        return ZVal.assign(token);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "credentials",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object validate(RuntimeEnv env, Object... args) {
        ReferenceContainer credentials =
                new BasicReferenceContainer(assignParameter(args, 0, true));
        if (null == credentials.getObject()) {
            credentials.setObject(ZVal.newArray());
        }
        if (arrayActionR(ArrayAction.EMPTY, credentials, env, this.inputKey)) {
            return ZVal.assign(false);
        }

        credentials.setObject(
                ZVal.newArray(
                        new ZPair(this.storageKey, credentials.arrayGet(env, this.inputKey))));
        if (ZVal.isTrue(
                env.callMethod(
                        this.provider,
                        "retrieveByCredentials",
                        TokenGuard.class,
                        credentials.getObject()))) {
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    public Object setRequest(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        this.request = request;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object authenticate(RuntimeEnv env, Object... args) {
        Object user = null;
        if (!function_is_null.f.env(env).call(user = this.user(env)).getBool()) {
            return ZVal.assign(user);
        }

        throw ZVal.getException(env, new AuthenticationException(env));
    }

    @ConvertedMethod
    public Object hasUser(RuntimeEnv env, Object... args) {
        return ZVal.assign(!function_is_null.f.env(env).call(this.user).getBool());
    }

    @ConvertedMethod
    public Object check(RuntimeEnv env, Object... args) {
        return ZVal.assign(!function_is_null.f.env(env).call(this.user(env)).getBool());
    }

    @ConvertedMethod
    public Object guest(RuntimeEnv env, Object... args) {
        return ZVal.assign(!ZVal.isTrue(this.check(env)));
    }

    @ConvertedMethod
    public Object id(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.user(env))) {
            return ZVal.assign(
                    env.callMethod(this.user(env), "getAuthIdentifier", TokenGuard.class));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "user",
        typeHint = "Illuminate\\Contracts\\Auth\\Authenticatable"
    )
    public Object setUser(RuntimeEnv env, Object... args) {
        Object user = assignParameter(args, 0, false);
        this.user = user;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getProvider(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.provider);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "provider",
        typeHint = "Illuminate\\Contracts\\Auth\\UserProvider"
    )
    public Object setProvider(RuntimeEnv env, Object... args) {
        Object provider = assignParameter(args, 0, false);
        this.provider = provider;
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Auth\\TokenGuard";

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
                    .setName("Illuminate\\Auth\\TokenGuard")
                    .setLookup(
                            TokenGuard.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("inputKey", "provider", "request", "storageKey", "user")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Auth/TokenGuard.php")
                    .addInterface("Illuminate\\Contracts\\Auth\\Guard")
                    .addTrait("Illuminate\\Auth\\GuardHelpers")
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
