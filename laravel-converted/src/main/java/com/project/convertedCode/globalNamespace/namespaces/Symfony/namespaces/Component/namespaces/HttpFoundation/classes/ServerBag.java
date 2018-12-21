package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_stripos;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.ParameterBag;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/ServerBag.php

*/

public class ServerBag extends ParameterBag {

    public ServerBag(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ServerBag.class) {
            this.__construct(env, args);
        }
    }

    public ServerBag(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getHeaders(RuntimeEnv env, Object... args) {
        ReferenceContainer headers = new BasicReferenceContainer(null);
        Object exploded = null;
        Object runtimeTempArrayResult191 = null;
        ReferenceContainer contentHeaders = new BasicReferenceContainer(null);
        Object authorizationHeader = null;
        Object value = null;
        Object key = null;
        headers.setObject(ZVal.newArray());
        contentHeaders.setObject(
                ZVal.newArray(
                        new ZPair("CONTENT_LENGTH", true),
                        new ZPair("CONTENT_MD5", true),
                        new ZPair("CONTENT_TYPE", true)));
        for (ZPair zpairResult1884 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("parameters").value(),
                        env,
                        false)) {
            key = ZVal.assign(zpairResult1884.getKey());
            value = ZVal.assign(zpairResult1884.getValue());
            if (ZVal.strictEqualityCheck(
                    0, "===", function_strpos.f.env(env).call(key, "HTTP_").value())) {
                headers.arrayAccess(env, function_substr.f.env(env).call(key, 5).value())
                        .set(value);

            } else if (arrayActionR(ArrayAction.ISSET, contentHeaders, env, key)) {
                headers.arrayAccess(env, key).set(value);
            }
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "parameters", env),
                env,
                "PHP_AUTH_USER")) {
            headers.arrayAccess(env, "PHP_AUTH_USER")
                    .set(
                            new ReferenceClassProperty(this, "parameters", env)
                                    .arrayGet(env, "PHP_AUTH_USER"));
            headers.arrayAccess(env, "PHP_AUTH_PW")
                    .set(
                            arrayActionR(
                                            ArrayAction.ISSET,
                                            new ReferenceClassProperty(this, "parameters", env),
                                            env,
                                            "PHP_AUTH_PW")
                                    ? new ReferenceClassProperty(this, "parameters", env)
                                            .arrayGet(env, "PHP_AUTH_PW")
                                    : "");

        } else {
            authorizationHeader = ZVal.getNull();
            if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "parameters", env),
                    env,
                    "HTTP_AUTHORIZATION")) {
                authorizationHeader =
                        ZVal.assign(
                                new ReferenceClassProperty(this, "parameters", env)
                                        .arrayGet(env, "HTTP_AUTHORIZATION"));

            } else if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "parameters", env),
                    env,
                    "REDIRECT_HTTP_AUTHORIZATION")) {
                authorizationHeader =
                        ZVal.assign(
                                new ReferenceClassProperty(this, "parameters", env)
                                        .arrayGet(env, "REDIRECT_HTTP_AUTHORIZATION"));
            }

            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", authorizationHeader)) {
                if (ZVal.strictEqualityCheck(
                        0,
                        "===",
                        function_stripos.f.env(env).call(authorizationHeader, "basic ").value())) {
                    exploded =
                            function_explode
                                    .f
                                    .env(env)
                                    .call(
                                            ":",
                                            NamespaceGlobal.base64_decode
                                                    .env(env)
                                                    .call(
                                                            function_substr
                                                                    .f
                                                                    .env(env)
                                                                    .call(authorizationHeader, 6)
                                                                    .value())
                                                    .value(),
                                            2)
                                    .value();
                    if (ZVal.equalityCheck(2, function_count.f.env(env).call(exploded).value())) {
                        ZVal.list(
                                runtimeTempArrayResult191 = exploded,
                                (headers.arrayAccess(env, "PHP_AUTH_USER")
                                        .set(listGet(runtimeTempArrayResult191, 0, env))),
                                (headers.arrayAccess(env, "PHP_AUTH_PW")
                                        .set(listGet(runtimeTempArrayResult191, 1, env))));
                    }

                } else if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.EMPTY,
                                        new ReferenceClassProperty(this, "parameters", env),
                                        env,
                                        "PHP_AUTH_DIGEST"))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        0,
                                        "===",
                                        function_stripos
                                                .f
                                                .env(env)
                                                .call(authorizationHeader, "digest ")
                                                .value()))) {
                    headers.arrayAccess(env, "PHP_AUTH_DIGEST").set(authorizationHeader);
                    new ReferenceClassProperty(this, "parameters", env)
                            .arrayAccess(env, "PHP_AUTH_DIGEST")
                            .set(authorizationHeader);

                } else if (ZVal.strictEqualityCheck(
                        0,
                        "===",
                        function_stripos.f.env(env).call(authorizationHeader, "bearer ").value())) {
                    headers.arrayAccess(env, "AUTHORIZATION").set(authorizationHeader);
                }
            }
        }

        if (arrayActionR(ArrayAction.ISSET, headers, env, "AUTHORIZATION")) {
            return ZVal.assign(headers.getObject());
        }

        if (arrayActionR(ArrayAction.ISSET, headers, env, "PHP_AUTH_USER")) {
            headers.arrayAccess(env, "AUTHORIZATION")
                    .set(
                            "Basic "
                                    + toStringR(
                                            NamespaceGlobal.base64_encode
                                                    .env(env)
                                                    .call(
                                                            toStringR(
                                                                            headers.arrayGet(
                                                                                    env,
                                                                                    "PHP_AUTH_USER"),
                                                                            env)
                                                                    + ":"
                                                                    + toStringR(
                                                                            headers.arrayGet(
                                                                                    env,
                                                                                    "PHP_AUTH_PW"),
                                                                            env))
                                                    .value(),
                                            env));

        } else if (arrayActionR(ArrayAction.ISSET, headers, env, "PHP_AUTH_DIGEST")) {
            headers.arrayAccess(env, "AUTHORIZATION").set(headers.arrayGet(env, "PHP_AUTH_DIGEST"));
        }

        return ZVal.assign(headers.getObject());
    }

    public static final Object CONST_class = "Symfony\\Component\\HttpFoundation\\ServerBag";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ParameterBag.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpFoundation\\ServerBag")
                    .setLookup(
                            ServerBag.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("parameters")
                    .setFilename("vendor/symfony/http-foundation/ServerBag.php")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
                    .addInterface("Countable")
                    .addExtendsClass("Symfony\\Component\\HttpFoundation\\ParameterBag")
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
