package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.Request;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/ApacheRequest.php

*/

public class ApacheRequest extends Request {

    public ApacheRequest(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ApacheRequest.class) {
            this.__construct(env, args);
        }
    }

    public ApacheRequest(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    protected Object prepareRequestUri(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("server").value(),
                        "get",
                        ApacheRequest.class,
                        "REQUEST_URI"));
    }

    @ConvertedMethod
    protected Object prepareBaseUrl(RuntimeEnv env, Object... args) {
        Object baseUrl = null;
        baseUrl =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("server").value(),
                        "get",
                        ApacheRequest.class,
                        "SCRIPT_NAME");
        if (ZVal.strictEqualityCheck(
                false,
                "===",
                function_strpos
                        .f
                        .env(env)
                        .call(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("server")
                                                .value(),
                                        "get",
                                        ApacheRequest.class,
                                        "REQUEST_URI"),
                                baseUrl)
                        .value())) {
            return ZVal.assign(
                    function_rtrim
                            .f
                            .env(env)
                            .call(function_dirname.f.env(env).call(baseUrl).value(), "/\\")
                            .value());
        }

        return ZVal.assign(baseUrl);
    }

    public static final Object CONST_class = "Symfony\\Component\\HttpFoundation\\ApacheRequest";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Request.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpFoundation\\ApacheRequest")
                    .setLookup(
                            ApacheRequest.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "acceptableContentTypes",
                            "attributes",
                            "basePath",
                            "baseUrl",
                            "charsets",
                            "content",
                            "cookies",
                            "defaultLocale",
                            "encodings",
                            "files",
                            "format",
                            "headers",
                            "isForwardedValid",
                            "isHostValid",
                            "languages",
                            "locale",
                            "method",
                            "pathInfo",
                            "query",
                            "request",
                            "requestUri",
                            "server",
                            "session")
                    .setFilename("vendor/symfony/http-foundation/ApacheRequest.php")
                    .addExtendsClass("Symfony\\Component\\HttpFoundation\\Request")
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
