package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.HttpCache.classes;

import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.HttpCache.classes.ResponseCacheStrategyInterface;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/HttpCache/ResponseCacheStrategy.php

*/

public class ResponseCacheStrategy extends RuntimeClassBase
        implements ResponseCacheStrategyInterface {

    public Object cacheable = true;

    public Object embeddedResponses = 0;

    public Object ttls = ZVal.newArray();

    public Object maxAges = ZVal.newArray();

    public Object isNotCacheableResponseEmbedded = false;

    public ResponseCacheStrategy(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ResponseCacheStrategy(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "response",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response"
    )
    public Object add(RuntimeEnv env, Object... args) {
        Object response = assignParameter(args, 0, false);
        Object maxAge = null;
        if (ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(response, "isFresh", ResponseCacheStrategy.class)))
                || ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        response, "isCacheable", ResponseCacheStrategy.class)))) {
            this.cacheable = false;

        } else {
            maxAge = env.callMethod(response, "getMaxAge", ResponseCacheStrategy.class);
            new ReferenceClassProperty(this, "ttls", env)
                    .arrayAppend(env)
                    .set(env.callMethod(response, "getTtl", ResponseCacheStrategy.class));
            new ReferenceClassProperty(this, "maxAges", env).arrayAppend(env).set(maxAge);
            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", maxAge)) {
                this.isNotCacheableResponseEmbedded = true;
            }
        }

        this.embeddedResponses = ZVal.increment(this.embeddedResponses);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "response",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response"
    )
    public Object update(RuntimeEnv env, Object... args) {
        Object response = assignParameter(args, 0, false);
        Object maxAge = null;
        if (ZVal.strictEqualityCheck(0, "===", this.embeddedResponses)) {
            return null;
        }

        if (ZVal.isTrue(env.callMethod(response, "isValidateable", ResponseCacheStrategy.class))) {
            env.callMethod(response, "setEtag", ResponseCacheStrategy.class, ZVal.getNull());
            env.callMethod(
                    response, "setLastModified", ResponseCacheStrategy.class, ZVal.getNull());
        }

        if (ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(response, "isFresh", ResponseCacheStrategy.class)))
                || ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        response, "isCacheable", ResponseCacheStrategy.class)))) {
            this.cacheable = false;
        }

        if (!ZVal.isTrue(this.cacheable)) {
            env.callMethod(
                    toObjectR(response).accessProp(this, env).name("headers").value(),
                    "set",
                    ResponseCacheStrategy.class,
                    "Cache-Control",
                    "no-cache, must-revalidate");
            return null;
        }

        new ReferenceClassProperty(this, "ttls", env)
                .arrayAppend(env)
                .set(env.callMethod(response, "getTtl", ResponseCacheStrategy.class));
        new ReferenceClassProperty(this, "maxAges", env)
                .arrayAppend(env)
                .set(env.callMethod(response, "getMaxAge", ResponseCacheStrategy.class));
        if (ZVal.isTrue(this.isNotCacheableResponseEmbedded)) {
            env.callMethod(
                    toObjectR(response).accessProp(this, env).name("headers").value(),
                    "removeCacheControlDirective",
                    ResponseCacheStrategy.class,
                    "s-maxage");

        } else if (ZVal.strictNotEqualityCheck(
                ZVal.getNull(),
                "!==",
                maxAge = NamespaceGlobal.min.env(env).call(this.maxAges).value())) {
            env.callMethod(response, "setSharedMaxAge", ResponseCacheStrategy.class, maxAge);
            env.callMethod(
                    toObjectR(response).accessProp(this, env).name("headers").value(),
                    "set",
                    ResponseCacheStrategy.class,
                    "Age",
                    ZVal.subtract(maxAge, NamespaceGlobal.min.env(env).call(this.ttls).value()));
        }

        env.callMethod(response, "setMaxAge", ResponseCacheStrategy.class, 0);
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\HttpCache\\ResponseCacheStrategy";

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
                    .setName("Symfony\\Component\\HttpKernel\\HttpCache\\ResponseCacheStrategy")
                    .setLookup(
                            ResponseCacheStrategy.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "cacheable",
                            "embeddedResponses",
                            "isNotCacheableResponseEmbedded",
                            "maxAges",
                            "ttls")
                    .setFilename("vendor/symfony/http-kernel/HttpCache/ResponseCacheStrategy.php")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\HttpCache\\ResponseCacheStrategyInterface")
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
