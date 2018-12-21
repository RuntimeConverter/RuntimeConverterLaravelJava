package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.HeaderBag;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.Cookie;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeZone;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.HeaderUtils;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/ResponseHeaderBag.php

*/

public class ResponseHeaderBag extends HeaderBag {

    public Object computedCacheControl = ZVal.newArray();

    public Object cookies = ZVal.newArray();

    public Object headerNames = ZVal.newArray();

    public ResponseHeaderBag(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ResponseHeaderBag.class) {
            this.__construct(env, args);
        }
    }

    public ResponseHeaderBag(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object headers = assignParameter(args, 0, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        super.__construct(env, headers);
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "headers", env),
                env,
                "cache-control")) {
            this.set(env, "Cache-Control", "");
        }

        if (!arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "headers", env), env, "date")) {
            this.initDate(env);
        }

        return null;
    }

    @ConvertedMethod
    public Object allPreserveCase(RuntimeEnv env, Object... args) {
        ReferenceContainer headers = new BasicReferenceContainer(null);
        Object name = null;
        Object value = null;
        headers.setObject(ZVal.newArray());
        for (ZPair zpairResult1878 : ZVal.getIterable(this.all(env), env, false)) {
            name = ZVal.assign(zpairResult1878.getKey());
            value = ZVal.assign(zpairResult1878.getValue());
            headers.arrayAccess(
                            env,
                            arrayActionR(
                                            ArrayAction.ISSET,
                                            new ReferenceClassProperty(this, "headerNames", env),
                                            env,
                                            name)
                                    ? new ReferenceClassProperty(this, "headerNames", env)
                                            .arrayGet(env, name)
                                    : name)
                    .set(value);
        }

        return ZVal.assign(headers.getObject());
    }

    @ConvertedMethod
    public Object allPreserveCaseWithoutCookies(RuntimeEnv env, Object... args) {
        ReferenceContainer headers = new BasicReferenceContainer(null);
        headers.setObject(this.allPreserveCase(env));
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "headerNames", env),
                env,
                "set-cookie")) {
            arrayActionR(
                    ArrayAction.UNSET,
                    headers,
                    env,
                    new ReferenceClassProperty(this, "headerNames", env)
                            .arrayGet(env, "set-cookie"));
        }

        return ZVal.assign(headers.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object replace(RuntimeEnv env, Object... args) {
        Object headers = assignParameter(args, 0, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        this.headerNames = ZVal.newArray();
        super.replace(env, headers);
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "headers", env),
                env,
                "cache-control")) {
            this.set(env, "Cache-Control", "");
        }

        if (!arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "headers", env), env, "date")) {
            this.initDate(env);
        }

        return null;
    }

    @ConvertedMethod
    public Object all(RuntimeEnv env, Object... args) {
        ReferenceContainer headers = new BasicReferenceContainer(null);
        Object cookie = null;
        headers.setObject(super.all(env));
        for (ZPair zpairResult1879 : ZVal.getIterable(this.getCookies(env), env, true)) {
            cookie = ZVal.assign(zpairResult1879.getValue());
            headers.arrayAppend(env, "set-cookie").set(toStringR(cookie, env));
        }

        return ZVal.assign(headers.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "values")
    @ConvertedParameter(
        index = 2,
        name = "replace",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object set(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, false);
        Object replace = assignParameter(args, 2, true);
        if (null == replace) {
            replace = true;
        }
        Object cookie = null;
        Object computed = null;
        Object uniqueKey = null;
        uniqueKey =
                function_str_replace
                        .f
                        .env(env)
                        .call("_", "-", NamespaceGlobal.strtolower.env(env).call(key).value())
                        .value();
        if (ZVal.strictEqualityCheck("set-cookie", "===", uniqueKey)) {
            if (ZVal.isTrue(replace)) {
                this.cookies = ZVal.newArray();
            }

            for (ZPair zpairResult1880 : ZVal.getIterable(rToArrayCast(values), env, true)) {
                cookie = ZVal.assign(zpairResult1880.getValue());
                this.setCookie(env, Cookie.runtimeStaticObject.fromString(env, cookie));
            }

            new ReferenceClassProperty(this, "headerNames", env)
                    .arrayAccess(env, uniqueKey)
                    .set(key);
            return null;
        }

        new ReferenceClassProperty(this, "headerNames", env).arrayAccess(env, uniqueKey).set(key);
        super.set(env, key, values, replace);
        if (function_in_array
                .f
                .env(env)
                .call(
                        uniqueKey,
                        ZVal.arrayFromList("cache-control", "etag", "last-modified", "expires"),
                        true)
                .getBool()) {
            computed = this.computeCacheControlValue(env);
            new ReferenceClassProperty(this, "headers", env)
                    .arrayAccess(env, "cache-control")
                    .set(ZVal.newArray(new ZPair(0, computed)));
            new ReferenceClassProperty(this, "headerNames", env)
                    .arrayAccess(env, "cache-control")
                    .set("Cache-Control");
            this.computedCacheControl =
                    env.callMethod(this, "parseCacheControl", ResponseHeaderBag.class, computed);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object remove(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object uniqueKey = null;
        uniqueKey =
                function_str_replace
                        .f
                        .env(env)
                        .call("_", "-", NamespaceGlobal.strtolower.env(env).call(key).value())
                        .value();
        arrayActionR(
                ArrayAction.UNSET,
                new ReferenceClassProperty(this, "headerNames", env),
                env,
                uniqueKey);
        if (ZVal.strictEqualityCheck("set-cookie", "===", uniqueKey)) {
            this.cookies = ZVal.newArray();
            return null;
        }

        super.remove(env, key);
        if (ZVal.strictEqualityCheck("cache-control", "===", uniqueKey)) {
            this.computedCacheControl = ZVal.newArray();
        }

        if (ZVal.strictEqualityCheck("date", "===", uniqueKey)) {
            this.initDate(env);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object hasCacheControlDirective(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_key_exists.f.env(env).call(key, this.computedCacheControl).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object getCacheControlDirective(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_key_exists.f.env(env).call(key, this.computedCacheControl).getBool()
                        ? new ReferenceClassProperty(this, "computedCacheControl", env)
                                .arrayGet(env, key)
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "cookie",
        typeHint = "Symfony\\Component\\HttpFoundation\\Cookie"
    )
    public Object setCookie(RuntimeEnv env, Object... args) {
        Object cookie = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "cookies", env)
                .arrayAccess(
                        env,
                        env.callMethod(cookie, "getDomain", ResponseHeaderBag.class),
                        env.callMethod(cookie, "getPath", ResponseHeaderBag.class),
                        env.callMethod(cookie, "getName", ResponseHeaderBag.class))
                .set(cookie);
        new ReferenceClassProperty(this, "headerNames", env)
                .arrayAccess(env, "set-cookie")
                .set("Set-Cookie");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "path")
    @ConvertedParameter(
        index = 2,
        name = "domain",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object removeCookie(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, true);
        if (null == path) {
            path = "/";
        }
        Object domain = assignParameter(args, 2, true);
        if (null == domain) {
            domain = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", path)) {
            path = "/";
        }

        arrayActionR(
                ArrayAction.UNSET,
                new ReferenceClassProperty(this, "cookies", env),
                env,
                domain,
                path,
                name);
        if (arrayActionR(
                ArrayAction.EMPTY,
                new ReferenceClassProperty(this, "cookies", env),
                env,
                domain,
                path)) {
            arrayActionR(
                    ArrayAction.UNSET,
                    new ReferenceClassProperty(this, "cookies", env),
                    env,
                    domain,
                    path);
            if (arrayActionR(
                    ArrayAction.EMPTY,
                    new ReferenceClassProperty(this, "cookies", env),
                    env,
                    domain)) {
                arrayActionR(
                        ArrayAction.UNSET,
                        new ReferenceClassProperty(this, "cookies", env),
                        env,
                        domain);
            }
        }

        if (ZVal.isEmpty(this.cookies)) {
            arrayActionR(
                    ArrayAction.UNSET,
                    new ReferenceClassProperty(this, "headerNames", env),
                    env,
                    "set-cookie");
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "format")
    public Object getCookies(RuntimeEnv env, Object... args) {
        Object format = assignParameter(args, 0, true);
        if (null == format) {
            format = CONST_COOKIES_FLAT;
        }
        Object path = null;
        ReferenceContainer flattenedCookies = new BasicReferenceContainer(null);
        Object cookie = null;
        Object cookies = null;
        if (!function_in_array
                .f
                .env(env)
                .call(
                        format,
                        ZVal.newArray(
                                new ZPair(0, CONST_COOKIES_FLAT),
                                new ZPair(1, CONST_COOKIES_ARRAY)))
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Format \"%s\" invalid (%s).",
                                            format,
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call(
                                                            ", ",
                                                            ZVal.newArray(
                                                                    new ZPair(
                                                                            0, CONST_COOKIES_FLAT),
                                                                    new ZPair(
                                                                            1,
                                                                            CONST_COOKIES_ARRAY)))
                                                    .value())
                                    .value()));
        }

        if (ZVal.strictEqualityCheck(CONST_COOKIES_ARRAY, "===", format)) {
            return ZVal.assign(this.cookies);
        }

        flattenedCookies.setObject(ZVal.newArray());
        for (ZPair zpairResult1881 : ZVal.getIterable(this.cookies, env, true)) {
            path = ZVal.assign(zpairResult1881.getValue());
            for (ZPair zpairResult1882 : ZVal.getIterable(path, env, true)) {
                cookies = ZVal.assign(zpairResult1882.getValue());
                for (ZPair zpairResult1883 : ZVal.getIterable(cookies, env, true)) {
                    cookie = ZVal.assign(zpairResult1883.getValue());
                    flattenedCookies.arrayAppend(env).set(cookie);
                }
            }
        }

        return ZVal.assign(flattenedCookies.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "path")
    @ConvertedParameter(
        index = 2,
        name = "domain",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "secure",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "httpOnly",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object clearCookie(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, true);
        if (null == path) {
            path = "/";
        }
        Object domain = assignParameter(args, 2, true);
        if (null == domain) {
            domain = ZVal.getNull();
        }
        Object secure = assignParameter(args, 3, true);
        if (null == secure) {
            secure = false;
        }
        Object httpOnly = assignParameter(args, 4, true);
        if (null == httpOnly) {
            httpOnly = true;
        }
        this.setCookie(
                env, new Cookie(env, name, ZVal.getNull(), 1, path, domain, secure, httpOnly));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "disposition")
    @ConvertedParameter(index = 1, name = "filename")
    @ConvertedParameter(index = 2, name = "filenameFallback")
    public Object makeDisposition(RuntimeEnv env, Object... args) {
        Object disposition = assignParameter(args, 0, false);
        Object filename = assignParameter(args, 1, false);
        Object filenameFallback = assignParameter(args, 2, true);
        if (null == filenameFallback) {
            filenameFallback = "";
        }
        ReferenceContainer params = new BasicReferenceContainer(null);
        if (!function_in_array
                .f
                .env(env)
                .call(
                        disposition,
                        ZVal.newArray(
                                new ZPair(0, CONST_DISPOSITION_ATTACHMENT),
                                new ZPair(1, CONST_DISPOSITION_INLINE)))
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "The disposition must be either \"%s\" or \"%s\".",
                                            CONST_DISPOSITION_ATTACHMENT, CONST_DISPOSITION_INLINE)
                                    .value()));
        }

        if (ZVal.equalityCheck("", filenameFallback)) {
            filenameFallback = ZVal.assign(filename);
        }

        if (!function_preg_match
                .f
                .env(env)
                .call("/^[\\x20-\\x7e]*$/", filenameFallback)
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "The filename fallback must only contain ASCII characters."));
        }

        if (ZVal.strictNotEqualityCheck(
                false, "!==", function_strpos.f.env(env).call(filenameFallback, "%").value())) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "The filename fallback cannot contain the \"%\" character."));
        }

        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.strictNotEqualityCheck(
                                                                false,
                                                                "!==",
                                                                function_strpos
                                                                        .f
                                                                        .env(env)
                                                                        .call(filename, "/")
                                                                        .value()))
                                                || ZVal.toBool(
                                                        ZVal.strictNotEqualityCheck(
                                                                false,
                                                                "!==",
                                                                function_strpos
                                                                        .f
                                                                        .env(env)
                                                                        .call(filename, "\\")
                                                                        .value())))
                                || ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                false,
                                                "!==",
                                                function_strpos
                                                        .f
                                                        .env(env)
                                                        .call(filenameFallback, "/")
                                                        .value())))
                || ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                false,
                                "!==",
                                function_strpos.f.env(env).call(filenameFallback, "\\").value()))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "The filename and the fallback cannot contain the \"/\" and \"\\\" characters."));
        }

        params.setObject(ZVal.newArray(new ZPair("filename", filenameFallback)));
        if (ZVal.strictNotEqualityCheck(filename, "!==", filenameFallback)) {
            params.arrayAccess(env, "filename*")
                    .set(
                            "utf-8''"
                                    + toStringR(
                                            NamespaceGlobal.rawurlencode
                                                    .env(env)
                                                    .call(filename)
                                                    .value(),
                                            env));
        }

        return ZVal.assign(
                toStringR(disposition, env)
                        + "; "
                        + toStringR(
                                HeaderUtils.runtimeStaticObject.toString(
                                        env, params.getObject(), ";"),
                                env));
    }

    @ConvertedMethod
    protected Object computeCacheControlValue(RuntimeEnv env, Object... args) {
        Object header = null;
        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.toBool(
                                                        !toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("cacheControl")
                                                                .getBool())
                                                && ZVal.toBool(
                                                        !ZVal.isTrue(
                                                                env.callMethod(
                                                                        this,
                                                                        "has",
                                                                        ResponseHeaderBag.class,
                                                                        "ETag"))))
                                && ZVal.toBool(
                                        !ZVal.isTrue(
                                                env.callMethod(
                                                        this,
                                                        "has",
                                                        ResponseHeaderBag.class,
                                                        "Last-Modified"))))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(this, "has", ResponseHeaderBag.class, "Expires")))) {
            return "no-cache, private";
        }

        if (!toObjectR(this).accessProp(this, env).name("cacheControl").getBool()) {
            return "private, must-revalidate";
        }

        header = env.callMethod(this, "getCacheControlHeader", ResponseHeaderBag.class);
        if (ZVal.toBool(
                        arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "cacheControl", env),
                                env,
                                "public"))
                || ZVal.toBool(
                        arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "cacheControl", env),
                                env,
                                "private"))) {
            return ZVal.assign(header);
        }

        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "cacheControl", env),
                env,
                "s-maxage")) {
            return ZVal.assign(toStringR(header, env) + ", private");
        }

        return ZVal.assign(header);
    }

    @ConvertedMethod
    private Object initDate(RuntimeEnv env, Object... args) {
        Object now = null;
        now =
                DateTime.runtimeStaticObject.createFromFormat(
                        env, "U", NamespaceGlobal.time.env(env).call().value());
        env.callMethod(now, "setTimezone", ResponseHeaderBag.class, new DateTimeZone(env, "UTC"));
        this.set(
                env,
                "Date",
                toStringR(
                                env.callMethod(
                                        now, "format", ResponseHeaderBag.class, "D, d M Y H:i:s"),
                                env)
                        + " GMT");
        return null;
    }

    public static final Object CONST_COOKIES_FLAT = "flat";

    public static final Object CONST_COOKIES_ARRAY = "array";

    public static final Object CONST_DISPOSITION_ATTACHMENT = "attachment";

    public static final Object CONST_DISPOSITION_INLINE = "inline";

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\ResponseHeaderBag";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends HeaderBag.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpFoundation\\ResponseHeaderBag")
                    .setLookup(
                            ResponseHeaderBag.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "cacheControl",
                            "computedCacheControl",
                            "cookies",
                            "headerNames",
                            "headers")
                    .setFilename("vendor/symfony/http-foundation/ResponseHeaderBag.php")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
                    .addInterface("Countable")
                    .addExtendsClass("Symfony\\Component\\HttpFoundation\\HeaderBag")
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
