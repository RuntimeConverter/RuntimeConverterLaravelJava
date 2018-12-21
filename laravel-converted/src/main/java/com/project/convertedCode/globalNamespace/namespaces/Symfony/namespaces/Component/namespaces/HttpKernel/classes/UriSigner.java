package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_ksort;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_parse_str;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/UriSigner.php

*/

public class UriSigner extends RuntimeClassBase {

    public Object secret = null;

    public Object parameter = null;

    public UriSigner(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == UriSigner.class) {
            this.__construct(env, args);
        }
    }

    public UriSigner(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "secret", typeHint = "string")
    @ConvertedParameter(index = 1, name = "parameter", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object secret = assignParameter(args, 0, false);
        Object parameter = assignParameter(args, 1, true);
        if (null == parameter) {
            parameter = "_hash";
        }
        this.secret = secret;
        this.parameter = parameter;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    public Object sign(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        ReferenceContainer params = new BasicReferenceContainer(null);
        ReferenceContainer url = new BasicReferenceContainer(null);
        url.setObject(NamespaceGlobal.parse_url.env(env).call(uri).value());
        if (arrayActionR(ArrayAction.ISSET, url, env, "query")) {
            function_parse_str
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(1, params))
                    .call(url.arrayGet(env, "query"), params.getObject());

        } else {
            params.setObject(ZVal.newArray());
        }

        uri = this.buildUrl(env, url.getObject(), params.getObject());
        return ZVal.assign(
                toStringR(uri, env)
                        + toStringR(
                                ZVal.strictEqualityCheck(
                                                false,
                                                "===",
                                                function_strpos.f.env(env).call(uri, "?").value())
                                        ? "?"
                                        : "&",
                                env)
                        + toStringR(this.parameter, env)
                        + "="
                        + toStringR(this.computeHash(env, uri), env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    public Object check(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        ReferenceContainer params = new BasicReferenceContainer(null);
        ReferenceContainer url = new BasicReferenceContainer(null);
        Object hash = null;
        url.setObject(NamespaceGlobal.parse_url.env(env).call(uri).value());
        if (arrayActionR(ArrayAction.ISSET, url, env, "query")) {
            function_parse_str
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(1, params))
                    .call(url.arrayGet(env, "query"), params.getObject());

        } else {
            params.setObject(ZVal.newArray());
        }

        if (arrayActionR(ArrayAction.EMPTY, params, env, this.parameter)) {
            return ZVal.assign(false);
        }

        hash =
                NamespaceGlobal.urlencode
                        .env(env)
                        .call(params.arrayGet(env, this.parameter))
                        .value();
        arrayActionR(ArrayAction.UNSET, params, env, this.parameter);
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        this.computeHash(
                                env, this.buildUrl(env, url.getObject(), params.getObject())),
                        "===",
                        hash));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    private Object computeHash(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        return ZVal.assign(
                NamespaceGlobal.urlencode
                        .env(env)
                        .call(
                                NamespaceGlobal.base64_encode
                                        .env(env)
                                        .call(
                                                NamespaceGlobal.hash_hmac
                                                        .env(env)
                                                        .call("sha256", uri, this.secret, true)
                                                        .value())
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "url", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "params",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    private Object buildUrl(RuntimeEnv env, Object... args) {
        ReferenceContainer url = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object params = assignParameter(args, 1, true);
        if (null == params) {
            params = ZVal.newArray();
        }
        Object path = null;
        Object fragment = null;
        Object scheme = null;
        Object port = null;
        Object pass = null;
        Object query = null;
        Object host = null;
        Object user = null;
        function_ksort.f.env(env).call(params, 2);
        url.arrayAccess(env, "query")
                .set(NamespaceGlobal.http_build_query.env(env).call(params, "", "&").value());
        scheme =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, url, env, "scheme")
                                ? toStringR(url.arrayGet(env, "scheme"), env) + "://"
                                : "");
        host =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, url, env, "host")
                                ? url.arrayGet(env, "host")
                                : "");
        port =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, url, env, "port")
                                ? ":" + toStringR(url.arrayGet(env, "port"), env)
                                : "");
        user =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, url, env, "user")
                                ? url.arrayGet(env, "user")
                                : "");
        pass =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, url, env, "pass")
                                ? ":" + toStringR(url.arrayGet(env, "pass"), env)
                                : "");
        pass =
                ZVal.assign(
                        ZVal.toBool(user) || ZVal.toBool(pass) ? toStringR(pass, env) + "@" : "");
        path =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, url, env, "path")
                                ? url.arrayGet(env, "path")
                                : "");
        query =
                ZVal.assign(
                        ZVal.toBool(arrayActionR(ArrayAction.ISSET, url, env, "query"))
                                        && ZVal.toBool(url.arrayGet(env, "query"))
                                ? "?" + toStringR(url.arrayGet(env, "query"), env)
                                : "");
        fragment =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, url, env, "fragment")
                                ? "#" + toStringR(url.arrayGet(env, "fragment"), env)
                                : "");
        return ZVal.assign(
                toStringR(scheme, env)
                        + toStringR(user, env)
                        + toStringR(pass, env)
                        + toStringR(host, env)
                        + toStringR(port, env)
                        + toStringR(path, env)
                        + toStringR(query, env)
                        + toStringR(fragment, env));
    }

    public static final Object CONST_class = "Symfony\\Component\\HttpKernel\\UriSigner";

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
                    .setName("Symfony\\Component\\HttpKernel\\UriSigner")
                    .setLookup(
                            UriSigner.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("parameter", "secret")
                    .setFilename("vendor/symfony/http-kernel/UriSigner.php")
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
