package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.Response;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/RedirectResponse.php

*/

public class RedirectResponse extends Response {

    public Object targetUrl = null;

    public RedirectResponse(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RedirectResponse.class) {
            this.__construct(env, args);
        }
    }

    public RedirectResponse(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "url")
    @ConvertedParameter(
        index = 1,
        name = "status",
        typeHint = "int",
        defaultValue = "302",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 2,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object url = assignParameter(args, 0, false);
        Object status = assignParameter(args, 1, true);
        if (null == status) {
            status = 302;
        }
        Object headers = assignParameter(args, 2, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        super.__construct(env, "", status, headers);
        this.setTargetUrl(env, url);
        if (!ZVal.isTrue(env.callMethod(this, "isRedirect", RedirectResponse.class))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "The HTTP status code is not a redirect (\"%s\" given).",
                                            status)
                                    .value()));
        }

        if (ZVal.toBool(ZVal.equalityCheck(301, status))
                && ZVal.toBool(
                        !function_array_key_exists
                                .f
                                .env(env)
                                .call("cache-control", headers)
                                .getBool())) {
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("headers").value(),
                    "remove",
                    RedirectResponse.class,
                    "cache-control");
        }

        return null;
    }

    @ConvertedMethod
    public Object getTargetUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.targetUrl);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "url")
    public Object setTargetUrl(RuntimeEnv env, Object... args) {
        Object url = assignParameter(args, 0, false);
        if (ZVal.isEmpty(url)) {
            throw ZVal.getException(
                    env, new InvalidArgumentException(env, "Cannot redirect to an empty URL."));
        }

        this.targetUrl = url;
        env.callMethod(
                this,
                "setContent",
                RedirectResponse.class,
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "<!DOCTYPE html>\n<html>\n    <head>\n        <meta charset=\"UTF-8\" />\n        <meta http-equiv=\"refresh\" content=\"0;url=%1$s\" />\n\n        <title>Redirecting to %1$s</title>\n    </head>\n    <body>\n        Redirecting to <a href=\"%1$s\">%1$s</a>.\n    </body>\n</html>",
                                NamespaceGlobal.htmlspecialchars
                                        .env(env)
                                        .call(url, 3, "UTF-8")
                                        .value())
                        .value());
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("headers").value(),
                "set",
                RedirectResponse.class,
                "Location",
                url);
        return ZVal.assign(this);
    }

    public static final Object CONST_class = "Symfony\\Component\\HttpFoundation\\RedirectResponse";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Response.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "url")
        @ConvertedParameter(
            index = 1,
            name = "status",
            defaultValue = "302",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 2,
            name = "headers",
            defaultValue = "",
            defaultValueType = "array"
        )
        public Object create(RuntimeEnv env, Object... args) {
            Object url = assignParameter(args, 0, true);
            if (null == url) {
                url = "";
            }
            Object status = assignParameter(args, 1, true);
            if (null == status) {
                status = 302;
            }
            Object headers = assignParameter(args, 2, true);
            if (null == headers) {
                headers = ZVal.newArray();
            }
            return ZVal.assign(env.createNewWithLateStaticBindings(this, url, status, headers));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpFoundation\\RedirectResponse")
                    .setLookup(
                            RedirectResponse.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "charset",
                            "content",
                            "headers",
                            "statusCode",
                            "statusText",
                            "targetUrl",
                            "version")
                    .setFilename("vendor/symfony/http-foundation/RedirectResponse.php")
                    .addExtendsClass("Symfony\\Component\\HttpFoundation\\Response")
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
