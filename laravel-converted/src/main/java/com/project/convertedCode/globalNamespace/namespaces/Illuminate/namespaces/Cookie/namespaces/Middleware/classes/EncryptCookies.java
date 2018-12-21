package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cookie.namespaces.Middleware.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.Cookie;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Encryption.classes.DecryptException;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Cookie/Middleware/EncryptCookies.php

*/

public class EncryptCookies extends RuntimeClassBase {

    public Object encrypter = null;

    public Object except = ZVal.newArray();

    public EncryptCookies(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == EncryptCookies.class) {
            this.__construct(env, args);
        }
    }

    public EncryptCookies(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "encrypter",
        typeHint = "Illuminate\\Contracts\\Encryption\\Encrypter"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object encrypter = assignParameter(args, 0, false);
        this.encrypter = encrypter;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object disableFor(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this.except = function_array_merge.f.env(env).call(this.except, rToArrayCast(name)).value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "next", typeHint = "Closure")
    public Object handle(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object request = assignParameter(args, 0, false);
        Object next = assignParameter(args, 1, false);
        return ZVal.assign(
                this.encrypt(
                        env,
                        env.callFunctionDynamic(
                                        next,
                                        rLastRefArgs =
                                                new RuntimeArgsWithReferences()
                                                        .add(
                                                                0,
                                                                handleReturnReference(
                                                                        this.decrypt(
                                                                                env, request))),
                                        rLastRefArgs.get(0))
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    protected Object decrypt(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object request = assignParameter(args, 0, false);
        Object cookie = null;
        Object e = null;
        Object key = null;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult245 :
                ZVal.getIterable(
                        toObjectR(request).accessProp(this, env).name("cookies").value(),
                        env,
                        false)) {
            key = ZVal.assign(zpairResult245.getKey());
            cookie = ZVal.assign(zpairResult245.getValue());
            if (ZVal.isTrue(this.isDisabled(env, key))) {
                continue;
            }

            try {
                env.callMethod(
                        toObjectR(request).accessProp(this, env).name("cookies").value(),
                        "set",
                        EncryptCookies.class,
                        key,
                        this.decryptCookie(env, cookie));
            } catch (ConvertedException convertedException18) {
                if (convertedException18.instanceOf(
                        DecryptException.class,
                        "Illuminate\\Contracts\\Encryption\\DecryptException")) {
                    e = convertedException18.getObject();
                    env.callMethod(
                            toObjectR(request).accessProp(this, env).name("cookies").value(),
                            "set",
                            EncryptCookies.class,
                            key,
                            ZVal.getNull());
                } else {
                    throw convertedException18;
                }
            }
        }

        return ZVal.assign(request);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cookie")
    protected Object decryptCookie(RuntimeEnv env, Object... args) {
        Object cookie = assignParameter(args, 0, false);
        return ZVal.assign(
                function_is_array.f.env(env).call(cookie).getBool()
                        ? this.decryptArray(env, cookie)
                        : env.callMethod(this.encrypter, "decrypt", EncryptCookies.class, cookie));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cookie", typeHint = "array")
    protected Object decryptArray(RuntimeEnv env, Object... args) {
        Object cookie = assignParameter(args, 0, false);
        ReferenceContainer decrypted = new BasicReferenceContainer(null);
        Object value = null;
        Object key = null;
        decrypted.setObject(ZVal.newArray());
        for (ZPair zpairResult246 : ZVal.getIterable(cookie, env, false)) {
            key = ZVal.assign(zpairResult246.getKey());
            value = ZVal.assign(zpairResult246.getValue());
            if (function_is_string.f.env(env).call(value).getBool()) {
                decrypted
                        .arrayAccess(env, key)
                        .set(
                                env.callMethod(
                                        this.encrypter, "decrypt", EncryptCookies.class, value));
            }
        }

        return ZVal.assign(decrypted.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "response",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response"
    )
    protected Object encrypt(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object response = assignParameter(args, 0, false);
        Object cookie = null;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult247 :
                ZVal.getIterable(
                        env.callMethod(
                                toObjectR(response).accessProp(this, env).name("headers").value(),
                                "getCookies",
                                EncryptCookies.class),
                        env,
                        true)) {
            cookie = ZVal.assign(zpairResult247.getValue());
            if (ZVal.isTrue(
                    this.isDisabled(
                            env, env.callMethod(cookie, "getName", EncryptCookies.class)))) {
                continue;
            }

            env.callMethod(
                    toObjectR(response).accessProp(this, env).name("headers").value(),
                    "setCookie",
                    EncryptCookies.class,
                    this.duplicate(
                            env,
                            cookie,
                            env.callMethod(
                                    this.encrypter,
                                    "encrypt",
                                    EncryptCookies.class,
                                    env.callMethod(cookie, "getValue", EncryptCookies.class))));
        }

        return ZVal.assign(response);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "cookie",
        typeHint = "Symfony\\Component\\HttpFoundation\\Cookie"
    )
    @ConvertedParameter(index = 1, name = "value")
    protected Object duplicate(RuntimeEnv env, Object... args) {
        Object cookie = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(
                new Cookie(
                        env,
                        env.callMethod(cookie, "getName", EncryptCookies.class),
                        value,
                        env.callMethod(cookie, "getExpiresTime", EncryptCookies.class),
                        env.callMethod(cookie, "getPath", EncryptCookies.class),
                        env.callMethod(cookie, "getDomain", EncryptCookies.class),
                        env.callMethod(cookie, "isSecure", EncryptCookies.class),
                        env.callMethod(cookie, "isHttpOnly", EncryptCookies.class),
                        env.callMethod(cookie, "isRaw", EncryptCookies.class),
                        env.callMethod(cookie, "getSameSite", EncryptCookies.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object isDisabled(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(function_in_array.f.env(env).call(name, this.except).value());
    }

    public static final Object CONST_class = "Illuminate\\Cookie\\Middleware\\EncryptCookies";

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
                    .setName("Illuminate\\Cookie\\Middleware\\EncryptCookies")
                    .setLookup(
                            EncryptCookies.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("encrypter", "except")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Cookie/Middleware/EncryptCookies.php")
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
