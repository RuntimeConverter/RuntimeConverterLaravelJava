package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.string.function_stripos;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.http.function_header;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.UnexpectedValueException;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeImmutable;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_end_clean;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_end_flush;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeZone;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_get_status;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.ResponseHeaderBag;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/Response.php

*/

public class Response extends RuntimeClassBase {

    public Object headers = null;

    public Object content = null;

    public Object version = null;

    public Object statusCode = null;

    public Object statusText = null;

    public Object charset = null;

    public Response(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Response.class) {
            this.__construct(env, args);
        }
    }

    public Response(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    @ConvertedParameter(
        index = 1,
        name = "status",
        typeHint = "int",
        defaultValue = "200",
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
        Object content = assignParameter(args, 0, true);
        if (null == content) {
            content = "";
        }
        Object status = assignParameter(args, 1, true);
        if (null == status) {
            status = 200;
        }
        Object headers = assignParameter(args, 2, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        this.headers = new ResponseHeaderBag(env, headers);
        this.setContent(env, content);
        this.setStatusCode(env, status);
        this.setProtocolVersion(env, "1.0");
        return null;
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "HTTP/%s %s %s",
                                                this.version, this.statusCode, this.statusText)
                                        .value(),
                                env)
                        + "\r\n"
                        + toStringR(this.headers, env)
                        + "\r\n"
                        + toStringR(this.getContent(env), env));
    }

    @ConvertedMethod
    public Object __clone(RuntimeEnv env, Object... args) {
        this.headers = ((RuntimeClassInterface) this.headers).phpClone(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    public Object prepare(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object headers = null;
        Object charset = null;
        Object format = null;
        Object length = null;
        Object ternaryExpressionTemp = null;
        Object mimeType = null;
        headers = ZVal.assign(this.headers);
        if (ZVal.toBool(this.isInformational(env)) || ZVal.toBool(this.isEmpty(env))) {
            this.setContent(env, ZVal.getNull());
            env.callMethod(headers, "remove", Response.class, "Content-Type");
            env.callMethod(headers, "remove", Response.class, "Content-Length");

        } else {
            if (!ZVal.isTrue(env.callMethod(headers, "has", Response.class, "Content-Type"))) {
                format = env.callMethod(request, "getRequestFormat", Response.class);
                if (ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", format))
                        && ZVal.toBool(
                                mimeType =
                                        env.callMethod(
                                                request, "getMimeType", Response.class, format))) {
                    env.callMethod(headers, "set", Response.class, "Content-Type", mimeType);
                }
            }

            charset =
                    ZVal.assign(
                            ZVal.isTrue(ternaryExpressionTemp = this.charset)
                                    ? ternaryExpressionTemp
                                    : "UTF-8");
            if (!ZVal.isTrue(env.callMethod(headers, "has", Response.class, "Content-Type"))) {
                env.callMethod(
                        headers,
                        "set",
                        Response.class,
                        "Content-Type",
                        "text/html; charset=" + toStringR(charset, env));

            } else if (ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    0,
                                    "===",
                                    function_stripos
                                            .f
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            headers,
                                                            "get",
                                                            Response.class,
                                                            "Content-Type"),
                                                    "text/")
                                            .value()))
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    false,
                                    "===",
                                    function_stripos
                                            .f
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            headers,
                                                            "get",
                                                            Response.class,
                                                            "Content-Type"),
                                                    "charset")
                                            .value()))) {
                env.callMethod(
                        headers,
                        "set",
                        Response.class,
                        "Content-Type",
                        toStringR(
                                        env.callMethod(
                                                headers, "get", Response.class, "Content-Type"),
                                        env)
                                + "; charset="
                                + toStringR(charset, env));
            }

            if (ZVal.isTrue(env.callMethod(headers, "has", Response.class, "Transfer-Encoding"))) {
                env.callMethod(headers, "remove", Response.class, "Content-Length");
            }

            if (ZVal.isTrue(env.callMethod(request, "isMethod", Response.class, "HEAD"))) {
                length = env.callMethod(headers, "get", Response.class, "Content-Length");
                this.setContent(env, ZVal.getNull());
                if (ZVal.isTrue(length)) {
                    env.callMethod(headers, "set", Response.class, "Content-Length", length);
                }
            }
        }

        if (ZVal.notEqualityCheck(
                "HTTP/1.0",
                env.callMethod(
                        toObjectR(request).accessProp(this, env).name("server").value(),
                        "get",
                        Response.class,
                        "SERVER_PROTOCOL"))) {
            this.setProtocolVersion(env, "1.1");
        }

        if (ZVal.toBool(ZVal.equalityCheck("1.0", this.getProtocolVersion(env)))
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                false,
                                "!==",
                                function_strpos
                                        .f
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        this.headers,
                                                        "get",
                                                        Response.class,
                                                        "Cache-Control"),
                                                "no-cache")
                                        .value()))) {
            env.callMethod(this.headers, "set", Response.class, "pragma", "no-cache");
            env.callMethod(this.headers, "set", Response.class, "expires", -1);
        }

        this.ensureIEOverSSLCompatibility(env, request);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object sendHeaders(RuntimeEnv env, Object... args) {
        Object values = null;
        Object name = null;
        Object value = null;
        if (NamespaceGlobal.headers_sent.env(env).call().getBool()) {
            return ZVal.assign(this);
        }

        for (ZPair zpairResult1874 :
                ZVal.getIterable(
                        env.callMethod(this.headers, "allPreserveCase", Response.class),
                        env,
                        false)) {
            name = ZVal.assign(zpairResult1874.getKey());
            values = ZVal.assign(zpairResult1874.getValue());
            for (ZPair zpairResult1875 : ZVal.getIterable(values, env, true)) {
                value = ZVal.assign(zpairResult1875.getValue());
                function_header
                        .f
                        .env(env)
                        .call(
                                toStringR(name, env) + ": " + toStringR(value, env),
                                false,
                                this.statusCode);
            }
        }

        function_header
                .f
                .env(env)
                .call(
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "HTTP/%s %s %s",
                                        this.version, this.statusCode, this.statusText)
                                .value(),
                        true,
                        this.statusCode);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object sendContent(RuntimeEnv env, Object... args) {
        env.echo(this.content);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object send(RuntimeEnv env, Object... args) {
        this.sendHeaders(env);
        this.sendContent(env);
        if (function_function_exists.f.env(env).call("fastcgi_finish_request").getBool()) {
            com.runtimeconverter.runtime.ZVal.functionNotFound("fastcgi_finish_request")
                    .env(env)
                    .call();

        } else if (!function_in_array
                .f
                .env(env)
                .call("cli", ZVal.arrayFromList("cli", "phpdbg"), true)
                .getBool()) {
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Response.class)
                    .method("closeOutputBuffers")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(0, true)
                    .value();
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    public Object setContent(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, false);
        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.strictNotEqualityCheck(
                                                                ZVal.getNull(), "!==", content))
                                                && ZVal.toBool(
                                                        !function_is_string
                                                                .f
                                                                .env(env)
                                                                .call(content)
                                                                .getBool()))
                                && ZVal.toBool(
                                        !function_is_numeric.f.env(env).call(content).getBool()))
                && ZVal.toBool(
                        !function_is_callable
                                .f
                                .env(env)
                                .call(
                                        ZVal.newArray(
                                                new ZPair(0, content), new ZPair(1, "__toString")))
                                .getBool())) {
            throw ZVal.getException(
                    env,
                    new UnexpectedValueException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "The Response content must be a string or object implementing __toString(), \"%s\" given.",
                                            NamespaceGlobal.gettype.env(env).call(content).value())
                                    .value()));
        }

        this.content = toStringR(content, env);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getContent(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.content);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "version", typeHint = "string")
    public Object setProtocolVersion(RuntimeEnv env, Object... args) {
        Object version = assignParameter(args, 0, false);
        this.version = version;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getProtocolVersion(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.version);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code", typeHint = "int")
    @ConvertedParameter(
        index = 1,
        name = "text",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setStatusCode(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object text = assignParameter(args, 1, true);
        if (null == text) {
            text = ZVal.getNull();
        }
        this.statusCode = code;
        if (ZVal.isTrue(this.isInvalid(env))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("The HTTP status code \"%s\" is not valid.", code)
                                    .value()));
        }

        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", text)) {
            this.statusText =
                    arrayActionR(
                                    ArrayAction.ISSET,
                                    env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Component
                                                    .namespaces
                                                    .HttpFoundation
                                                    .classes
                                                    .Response
                                                    .RequestStaticProperties
                                                    .class,
                                            "statusTexts"),
                                    env,
                                    code)
                            ? env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Component
                                                    .namespaces
                                                    .HttpFoundation
                                                    .classes
                                                    .Response
                                                    .RequestStaticProperties
                                                    .class,
                                            "statusTexts")
                                    .arrayGet(env, code)
                            : "unknown status";
            return ZVal.assign(this);
        }

        if (ZVal.strictEqualityCheck(false, "===", text)) {
            this.statusText = "";
            return ZVal.assign(this);
        }

        this.statusText = text;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getStatusCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.statusCode);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "charset", typeHint = "string")
    public Object setCharset(RuntimeEnv env, Object... args) {
        Object charset = assignParameter(args, 0, false);
        this.charset = charset;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getCharset(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.charset);
    }

    @ConvertedMethod
    public Object isCacheable(RuntimeEnv env, Object... args) {
        if (!function_in_array
                .f
                .env(env)
                .call(this.statusCode, ZVal.arrayFromList(200, 203, 300, 301, 302, 404, 410))
                .getBool()) {
            return ZVal.assign(false);
        }

        if (ZVal.toBool(
                        env.callMethod(
                                this.headers,
                                "hasCacheControlDirective",
                                Response.class,
                                "no-store"))
                || ZVal.toBool(
                        env.callMethod(
                                this.headers,
                                "getCacheControlDirective",
                                Response.class,
                                "private"))) {
            return ZVal.assign(false);
        }

        return ZVal.assign(ZVal.toBool(this.isValidateable(env)) || ZVal.toBool(this.isFresh(env)));
    }

    @ConvertedMethod
    public Object isFresh(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.isGreaterThan(this.getTtl(env), '>', 0));
    }

    @ConvertedMethod
    public Object isValidateable(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(env.callMethod(this.headers, "has", Response.class, "Last-Modified"))
                        || ZVal.toBool(
                                env.callMethod(this.headers, "has", Response.class, "ETag")));
    }

    @ConvertedMethod
    public Object setPrivate(RuntimeEnv env, Object... args) {
        env.callMethod(this.headers, "removeCacheControlDirective", Response.class, "public");
        env.callMethod(this.headers, "addCacheControlDirective", Response.class, "private");
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object setPublic(RuntimeEnv env, Object... args) {
        env.callMethod(this.headers, "addCacheControlDirective", Response.class, "public");
        env.callMethod(this.headers, "removeCacheControlDirective", Response.class, "private");
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "immutable",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object setImmutable(RuntimeEnv env, Object... args) {
        Object immutable = assignParameter(args, 0, true);
        if (null == immutable) {
            immutable = true;
        }
        if (ZVal.isTrue(immutable)) {
            env.callMethod(this.headers, "addCacheControlDirective", Response.class, "immutable");

        } else {
            env.callMethod(
                    this.headers, "removeCacheControlDirective", Response.class, "immutable");
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object isImmutable(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this.headers, "hasCacheControlDirective", Response.class, "immutable"));
    }

    @ConvertedMethod
    public Object mustRevalidate(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(
                                env.callMethod(
                                        this.headers,
                                        "hasCacheControlDirective",
                                        Response.class,
                                        "must-revalidate"))
                        || ZVal.toBool(
                                env.callMethod(
                                        this.headers,
                                        "hasCacheControlDirective",
                                        Response.class,
                                        "proxy-revalidate")));
    }

    @ConvertedMethod
    public Object getDate(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.headers, "getDate", Response.class, "Date"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "date", typeHint = "DateTimeInterface")
    public Object setDate(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, false);
        if (ZVal.isTrue(ZVal.checkInstanceType(date, DateTime.class, "DateTime"))) {
            date = DateTimeImmutable.runtimeStaticObject.createFromMutable(env, date);
        }

        date = env.callMethod(date, "setTimezone", Response.class, new DateTimeZone(env, "UTC"));
        env.callMethod(
                this.headers,
                "set",
                Response.class,
                "Date",
                toStringR(env.callMethod(date, "format", Response.class, "D, d M Y H:i:s"), env)
                        + " GMT");
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getAge(RuntimeEnv env, Object... args) {
        Object age = null;
        if (ZVal.strictNotEqualityCheck(
                ZVal.getNull(),
                "!==",
                age = env.callMethod(this.headers, "get", Response.class, "Age"))) {
            return ZVal.assign(ZVal.toLong(age));
        }

        return ZVal.assign(
                NamespaceGlobal.max
                        .env(env)
                        .call(
                                ZVal.subtract(
                                        NamespaceGlobal.time.env(env).call().value(),
                                        env.callMethod(
                                                this.getDate(env), "format", Response.class, "U")),
                                0)
                        .value());
    }

    @ConvertedMethod
    public Object expire(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.isFresh(env))) {
            env.callMethod(this.headers, "set", Response.class, "Age", this.getMaxAge(env));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getExpires(RuntimeEnv env, Object... args) {
        Object e = null;
        try {
            return ZVal.assign(env.callMethod(this.headers, "getDate", Response.class, "Expires"));
        } catch (ConvertedException convertedException259) {
            if (convertedException259.instanceOf(RuntimeException.class, "RuntimeException")) {
                e = convertedException259.getObject();
                return ZVal.assign(
                        DateTime.runtimeStaticObject.createFromFormat(
                                env,
                                "U",
                                ZVal.subtract(
                                        NamespaceGlobal.time.env(env).call().value(), 172800)));
            } else {
                throw convertedException259;
            }
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "date",
        typeHint = "DateTimeInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setExpires(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, true);
        if (null == date) {
            date = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", date)) {
            env.callMethod(this.headers, "remove", Response.class, "Expires");
            return ZVal.assign(this);
        }

        if (ZVal.isTrue(ZVal.checkInstanceType(date, DateTime.class, "DateTime"))) {
            date = DateTimeImmutable.runtimeStaticObject.createFromMutable(env, date);
        }

        date = env.callMethod(date, "setTimezone", Response.class, new DateTimeZone(env, "UTC"));
        env.callMethod(
                this.headers,
                "set",
                Response.class,
                "Expires",
                toStringR(env.callMethod(date, "format", Response.class, "D, d M Y H:i:s"), env)
                        + " GMT");
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getMaxAge(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(
                env.callMethod(
                        this.headers, "hasCacheControlDirective", Response.class, "s-maxage"))) {
            return ZVal.assign(
                    ZVal.toLong(
                            env.callMethod(
                                    this.headers,
                                    "getCacheControlDirective",
                                    Response.class,
                                    "s-maxage")));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        this.headers, "hasCacheControlDirective", Response.class, "max-age"))) {
            return ZVal.assign(
                    ZVal.toLong(
                            env.callMethod(
                                    this.headers,
                                    "getCacheControlDirective",
                                    Response.class,
                                    "max-age")));
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.getExpires(env))) {
            return ZVal.assign(
                    ZVal.toLong(
                            ZVal.subtract(
                                    env.callMethod(
                                            this.getExpires(env), "format", Response.class, "U"),
                                    env.callMethod(
                                            this.getDate(env), "format", Response.class, "U"))));
        }

        return ZVal.assign(ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", typeHint = "int")
    public Object setMaxAge(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        env.callMethod(this.headers, "addCacheControlDirective", Response.class, "max-age", value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", typeHint = "int")
    public Object setSharedMaxAge(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        this.setPublic(env);
        env.callMethod(this.headers, "addCacheControlDirective", Response.class, "s-maxage", value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getTtl(RuntimeEnv env, Object... args) {
        Object maxAge = null;
        maxAge = this.getMaxAge(env);
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", maxAge)
                        ? ZVal.subtract(maxAge, this.getAge(env))
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "seconds", typeHint = "int")
    public Object setTtl(RuntimeEnv env, Object... args) {
        Object seconds = assignParameter(args, 0, false);
        this.setSharedMaxAge(env, ZVal.add(this.getAge(env), seconds));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "seconds", typeHint = "int")
    public Object setClientTtl(RuntimeEnv env, Object... args) {
        Object seconds = assignParameter(args, 0, false);
        this.setMaxAge(env, ZVal.add(this.getAge(env), seconds));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getLastModified(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this.headers, "getDate", Response.class, "Last-Modified"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "date",
        typeHint = "DateTimeInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setLastModified(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, true);
        if (null == date) {
            date = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", date)) {
            env.callMethod(this.headers, "remove", Response.class, "Last-Modified");
            return ZVal.assign(this);
        }

        if (ZVal.isTrue(ZVal.checkInstanceType(date, DateTime.class, "DateTime"))) {
            date = DateTimeImmutable.runtimeStaticObject.createFromMutable(env, date);
        }

        date = env.callMethod(date, "setTimezone", Response.class, new DateTimeZone(env, "UTC"));
        env.callMethod(
                this.headers,
                "set",
                Response.class,
                "Last-Modified",
                toStringR(env.callMethod(date, "format", Response.class, "D, d M Y H:i:s"), env)
                        + " GMT");
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getEtag(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.headers, "get", Response.class, "ETag"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "etag",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "weak",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object setEtag(RuntimeEnv env, Object... args) {
        Object etag = assignParameter(args, 0, true);
        if (null == etag) {
            etag = ZVal.getNull();
        }
        Object weak = assignParameter(args, 1, true);
        if (null == weak) {
            weak = false;
        }
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", etag)) {
            env.callMethod(this.headers, "remove", Response.class, "Etag");

        } else {
            if (ZVal.strictNotEqualityCheck(
                    0, "!==", function_strpos.f.env(env).call(etag, "\"").value())) {
                etag = "\"" + toStringR(etag, env) + "\"";
            }

            env.callMethod(
                    this.headers,
                    "set",
                    Response.class,
                    "ETag",
                    toStringR(ZVal.strictEqualityCheck(true, "===", weak) ? "W/" : "", env)
                            + toStringR(etag, env));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options", typeHint = "array")
    public Object setCache(RuntimeEnv env, Object... args) {
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object diff = null;
        if (ZVal.isTrue(
                diff =
                        function_array_diff
                                .f
                                .env(env)
                                .call(
                                        function_array_keys
                                                .f
                                                .env(env)
                                                .call(options.getObject())
                                                .value(),
                                        ZVal.arrayFromList(
                                                "etag",
                                                "last_modified",
                                                "max_age",
                                                "s_maxage",
                                                "private",
                                                "public",
                                                "immutable"))
                                .value())) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Response does not support the following options: \"%s\".",
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call(
                                                            "\", \"",
                                                            function_array_values
                                                                    .f
                                                                    .env(env)
                                                                    .call(diff)
                                                                    .value())
                                                    .value())
                                    .value()));
        }

        if (arrayActionR(ArrayAction.ISSET, options, env, "etag")) {
            this.setEtag(env, options.arrayGet(env, "etag"));
        }

        if (arrayActionR(ArrayAction.ISSET, options, env, "last_modified")) {
            this.setLastModified(env, options.arrayGet(env, "last_modified"));
        }

        if (arrayActionR(ArrayAction.ISSET, options, env, "max_age")) {
            this.setMaxAge(env, options.arrayGet(env, "max_age"));
        }

        if (arrayActionR(ArrayAction.ISSET, options, env, "s_maxage")) {
            this.setSharedMaxAge(env, options.arrayGet(env, "s_maxage"));
        }

        if (arrayActionR(ArrayAction.ISSET, options, env, "public")) {
            if (ZVal.isTrue(options.arrayGet(env, "public"))) {
                this.setPublic(env);

            } else {
                this.setPrivate(env);
            }
        }

        if (arrayActionR(ArrayAction.ISSET, options, env, "private")) {
            if (ZVal.isTrue(options.arrayGet(env, "private"))) {
                this.setPrivate(env);

            } else {
                this.setPublic(env);
            }
        }

        if (arrayActionR(ArrayAction.ISSET, options, env, "immutable")) {
            this.setImmutable(env, ZVal.toBool(options.arrayGet(env, "immutable")));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object setNotModified(RuntimeEnv env, Object... args) {
        Object header = null;
        this.setStatusCode(env, 304);
        this.setContent(env, ZVal.getNull());
        for (ZPair zpairResult1876 :
                ZVal.getIterable(
                        ZVal.arrayFromList(
                                "Allow",
                                "Content-Encoding",
                                "Content-Language",
                                "Content-Length",
                                "Content-MD5",
                                "Content-Type",
                                "Last-Modified"),
                        env,
                        true)) {
            header = ZVal.assign(zpairResult1876.getValue());
            env.callMethod(this.headers, "remove", Response.class, header);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object hasVary(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        ZVal.getNull(),
                        "!==",
                        env.callMethod(this.headers, "get", Response.class, "Vary")));
    }

    @ConvertedMethod
    public Object getVary(RuntimeEnv env, Object... args) {
        Object ret = null;
        Object item = null;
        Object vary = null;
        if (!ZVal.isTrue(
                vary =
                        env.callMethod(
                                this.headers,
                                "get",
                                Response.class,
                                "Vary",
                                ZVal.getNull(),
                                false))) {
            return ZVal.assign(ZVal.newArray());
        }

        ret = ZVal.newArray();
        for (ZPair zpairResult1877 : ZVal.getIterable(vary, env, true)) {
            item = ZVal.assign(zpairResult1877.getValue());
            ret =
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    ret,
                                    NamespaceGlobal.preg_split
                                            .env(env)
                                            .call("/[\\s,]+/", item)
                                            .value())
                            .value();
        }

        return ZVal.assign(ret);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "headers")
    @ConvertedParameter(
        index = 1,
        name = "replace",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object setVary(RuntimeEnv env, Object... args) {
        Object headers = assignParameter(args, 0, false);
        Object replace = assignParameter(args, 1, true);
        if (null == replace) {
            replace = true;
        }
        env.callMethod(this.headers, "set", Response.class, "Vary", headers, replace);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    public Object isNotModified(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object modifiedSince = null;
        Object notModified = null;
        Object lastModified = null;
        Object etags = null;
        if (!ZVal.isTrue(env.callMethod(request, "isMethodCacheable", Response.class))) {
            return ZVal.assign(false);
        }

        notModified = false;
        lastModified = env.callMethod(this.headers, "get", Response.class, "Last-Modified");
        modifiedSince =
                env.callMethod(
                        toObjectR(request).accessProp(this, env).name("headers").value(),
                        "get",
                        Response.class,
                        "If-Modified-Since");
        if (ZVal.isTrue(etags = env.callMethod(request, "getETags", Response.class))) {
            notModified =
                    ZVal.toBool(function_in_array.f.env(env).call(this.getEtag(env), etags).value())
                            || ZVal.toBool(function_in_array.f.env(env).call("*", etags).value());
        }

        if (ZVal.toBool(modifiedSince) && ZVal.toBool(lastModified)) {
            notModified =
                    ZVal.toBool(
                                    ZVal.isGreaterThanOrEqualTo(
                                            NamespaceGlobal.strtotime
                                                    .env(env)
                                                    .call(modifiedSince)
                                                    .value(),
                                            ">=",
                                            NamespaceGlobal.strtotime
                                                    .env(env)
                                                    .call(lastModified)
                                                    .value()))
                            && ZVal.toBool(
                                    ZVal.toBool(!ZVal.isTrue(etags)) || ZVal.toBool(notModified));
        }

        if (ZVal.isTrue(notModified)) {
            this.setNotModified(env);
        }

        return ZVal.assign(notModified);
    }

    @ConvertedMethod
    public Object isInvalid(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(ZVal.isLessThan(this.statusCode, '<', 100))
                        || ZVal.toBool(ZVal.isGreaterThanOrEqualTo(this.statusCode, ">=", 600)));
    }

    @ConvertedMethod
    public Object isInformational(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(ZVal.isGreaterThanOrEqualTo(this.statusCode, ">=", 100))
                        && ZVal.toBool(ZVal.isLessThan(this.statusCode, '<', 200)));
    }

    @ConvertedMethod
    public Object isSuccessful(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(ZVal.isGreaterThanOrEqualTo(this.statusCode, ">=", 200))
                        && ZVal.toBool(ZVal.isLessThan(this.statusCode, '<', 300)));
    }

    @ConvertedMethod
    public Object isRedirection(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(ZVal.isGreaterThanOrEqualTo(this.statusCode, ">=", 300))
                        && ZVal.toBool(ZVal.isLessThan(this.statusCode, '<', 400)));
    }

    @ConvertedMethod
    public Object isClientError(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(ZVal.isGreaterThanOrEqualTo(this.statusCode, ">=", 400))
                        && ZVal.toBool(ZVal.isLessThan(this.statusCode, '<', 500)));
    }

    @ConvertedMethod
    public Object isServerError(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(ZVal.isGreaterThanOrEqualTo(this.statusCode, ">=", 500))
                        && ZVal.toBool(ZVal.isLessThan(this.statusCode, '<', 600)));
    }

    @ConvertedMethod
    public Object isOk(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.strictEqualityCheck(200, "===", this.statusCode));
    }

    @ConvertedMethod
    public Object isForbidden(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.strictEqualityCheck(403, "===", this.statusCode));
    }

    @ConvertedMethod
    public Object isNotFound(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.strictEqualityCheck(404, "===", this.statusCode));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "location",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object isRedirect(RuntimeEnv env, Object... args) {
        Object location = assignParameter(args, 0, true);
        if (null == location) {
            location = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.toBool(
                                function_in_array
                                        .f
                                        .env(env)
                                        .call(
                                                this.statusCode,
                                                ZVal.arrayFromList(201, 301, 302, 303, 307, 308))
                                        .value())
                        && ZVal.toBool(
                                ZVal.isTrue(
                                                ternaryExpressionTemp =
                                                        ZVal.strictEqualityCheck(
                                                                ZVal.getNull(), "===", location))
                                        ? ternaryExpressionTemp
                                        : ZVal.equalityCheck(
                                                location,
                                                env.callMethod(
                                                        this.headers,
                                                        "get",
                                                        Response.class,
                                                        "Location"))));
    }

    @ConvertedMethod
    public Object isEmpty(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_in_array
                        .f
                        .env(env)
                        .call(this.statusCode, ZVal.arrayFromList(204, 304))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    protected Object ensureIEOverSSLCompatibility(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        ReferenceContainer match = new BasicReferenceContainer(null);
        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                false,
                                                "!==",
                                                function_stripos
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                env.callMethod(
                                                                        this.headers,
                                                                        "get",
                                                                        Response.class,
                                                                        "Content-Disposition"),
                                                                "attachment")
                                                        .value()))
                                && ZVal.toBool(
                                        ZVal.equalityCheck(
                                                1,
                                                function_preg_match
                                                        .f
                                                        .env(env)
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences()
                                                                        .add(2, match))
                                                        .call(
                                                                "/MSIE (.*?);/i",
                                                                env.callMethod(
                                                                        toObjectR(request)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("server")
                                                                                .value(),
                                                                        "get",
                                                                        Response.class,
                                                                        "HTTP_USER_AGENT"),
                                                                match.getObject())
                                                        .value())))
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                true,
                                "===",
                                env.callMethod(request, "isSecure", Response.class)))) {
            if (ZVal.isLessThan(
                    ZVal.toLong(
                            function_preg_replace
                                    .f
                                    .env(env)
                                    .call("/(MSIE )(.*?);/", "$2", match.arrayGet(env, 0))
                                    .value()),
                    '<',
                    9)) {
                env.callMethod(this.headers, "remove", Response.class, "Cache-Control");
            }
        }

        return null;
    }

    public static final Object CONST_HTTP_CONTINUE = 100;

    public static final Object CONST_HTTP_SWITCHING_PROTOCOLS = 101;

    public static final Object CONST_HTTP_PROCESSING = 102;

    public static final Object CONST_HTTP_EARLY_HINTS = 103;

    public static final Object CONST_HTTP_OK = 200;

    public static final Object CONST_HTTP_CREATED = 201;

    public static final Object CONST_HTTP_ACCEPTED = 202;

    public static final Object CONST_HTTP_NON_AUTHORITATIVE_INFORMATION = 203;

    public static final Object CONST_HTTP_NO_CONTENT = 204;

    public static final Object CONST_HTTP_RESET_CONTENT = 205;

    public static final Object CONST_HTTP_PARTIAL_CONTENT = 206;

    public static final Object CONST_HTTP_MULTI_STATUS = 207;

    public static final Object CONST_HTTP_ALREADY_REPORTED = 208;

    public static final Object CONST_HTTP_IM_USED = 226;

    public static final Object CONST_HTTP_MULTIPLE_CHOICES = 300;

    public static final Object CONST_HTTP_MOVED_PERMANENTLY = 301;

    public static final Object CONST_HTTP_FOUND = 302;

    public static final Object CONST_HTTP_SEE_OTHER = 303;

    public static final Object CONST_HTTP_NOT_MODIFIED = 304;

    public static final Object CONST_HTTP_USE_PROXY = 305;

    public static final Object CONST_HTTP_RESERVED = 306;

    public static final Object CONST_HTTP_TEMPORARY_REDIRECT = 307;

    public static final Object CONST_HTTP_PERMANENTLY_REDIRECT = 308;

    public static final Object CONST_HTTP_BAD_REQUEST = 400;

    public static final Object CONST_HTTP_UNAUTHORIZED = 401;

    public static final Object CONST_HTTP_PAYMENT_REQUIRED = 402;

    public static final Object CONST_HTTP_FORBIDDEN = 403;

    public static final Object CONST_HTTP_NOT_FOUND = 404;

    public static final Object CONST_HTTP_METHOD_NOT_ALLOWED = 405;

    public static final Object CONST_HTTP_NOT_ACCEPTABLE = 406;

    public static final Object CONST_HTTP_PROXY_AUTHENTICATION_REQUIRED = 407;

    public static final Object CONST_HTTP_REQUEST_TIMEOUT = 408;

    public static final Object CONST_HTTP_CONFLICT = 409;

    public static final Object CONST_HTTP_GONE = 410;

    public static final Object CONST_HTTP_LENGTH_REQUIRED = 411;

    public static final Object CONST_HTTP_PRECONDITION_FAILED = 412;

    public static final Object CONST_HTTP_REQUEST_ENTITY_TOO_LARGE = 413;

    public static final Object CONST_HTTP_REQUEST_URI_TOO_LONG = 414;

    public static final Object CONST_HTTP_UNSUPPORTED_MEDIA_TYPE = 415;

    public static final Object CONST_HTTP_REQUESTED_RANGE_NOT_SATISFIABLE = 416;

    public static final Object CONST_HTTP_EXPECTATION_FAILED = 417;

    public static final Object CONST_HTTP_I_AM_A_TEAPOT = 418;

    public static final Object CONST_HTTP_MISDIRECTED_REQUEST = 421;

    public static final Object CONST_HTTP_UNPROCESSABLE_ENTITY = 422;

    public static final Object CONST_HTTP_LOCKED = 423;

    public static final Object CONST_HTTP_FAILED_DEPENDENCY = 424;

    public static final Object
            CONST_HTTP_RESERVED_FOR_WEBDAV_ADVANCED_COLLECTIONS_EXPIRED_PROPOSAL = 425;

    public static final Object CONST_HTTP_UPGRADE_REQUIRED = 426;

    public static final Object CONST_HTTP_PRECONDITION_REQUIRED = 428;

    public static final Object CONST_HTTP_TOO_MANY_REQUESTS = 429;

    public static final Object CONST_HTTP_REQUEST_HEADER_FIELDS_TOO_LARGE = 431;

    public static final Object CONST_HTTP_UNAVAILABLE_FOR_LEGAL_REASONS = 451;

    public static final Object CONST_HTTP_INTERNAL_SERVER_ERROR = 500;

    public static final Object CONST_HTTP_NOT_IMPLEMENTED = 501;

    public static final Object CONST_HTTP_BAD_GATEWAY = 502;

    public static final Object CONST_HTTP_SERVICE_UNAVAILABLE = 503;

    public static final Object CONST_HTTP_GATEWAY_TIMEOUT = 504;

    public static final Object CONST_HTTP_VERSION_NOT_SUPPORTED = 505;

    public static final Object CONST_HTTP_VARIANT_ALSO_NEGOTIATES_EXPERIMENTAL = 506;

    public static final Object CONST_HTTP_INSUFFICIENT_STORAGE = 507;

    public static final Object CONST_HTTP_LOOP_DETECTED = 508;

    public static final Object CONST_HTTP_NOT_EXTENDED = 510;

    public static final Object CONST_HTTP_NETWORK_AUTHENTICATION_REQUIRED = 511;

    public static final Object CONST_class = "Symfony\\Component\\HttpFoundation\\Response";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "content")
        @ConvertedParameter(
            index = 1,
            name = "status",
            defaultValue = "200",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 2,
            name = "headers",
            defaultValue = "",
            defaultValueType = "array"
        )
        public Object create(RuntimeEnv env, Object... args) {
            Object content = assignParameter(args, 0, true);
            if (null == content) {
                content = "";
            }
            Object status = assignParameter(args, 1, true);
            if (null == status) {
                status = 200;
            }
            Object headers = assignParameter(args, 2, true);
            if (null == headers) {
                headers = ZVal.newArray();
            }
            return ZVal.assign(env.createNewWithLateStaticBindings(this, content, status, headers));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "targetLevel", typeHint = "int")
        @ConvertedParameter(index = 1, name = "flush", typeHint = "bool")
        public Object closeOutputBuffers(RuntimeEnv env, Object... args) {
            Object targetLevel = assignParameter(args, 0, false);
            Object flush = assignParameter(args, 1, false);
            ReferenceContainer s = new BasicReferenceContainer(null);
            ReferenceContainer level = new BasicReferenceContainer(null);
            Object flags = null;
            ReferenceContainer status = new BasicReferenceContainer(null);
            status.setObject(function_ob_get_status.f.env(env).call(true).value());
            level.setObject(function_count.f.env(env).call(status.getObject()).value());
            flags = ZVal.toLong(64) | ZVal.toLong(ZVal.isTrue(flush) ? 32 : 16);
            while (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.isGreaterThan(
                                                    ZVal.postDecrement(level), '>', targetLevel))
                                    && ZVal.toBool(
                                            s.setObject(
                                                    ZVal.assign(
                                                            status.arrayGet(
                                                                    env, level.getObject())))))
                    && ZVal.toBool(
                            !arrayActionR(ArrayAction.ISSET, s, env, "del")
                                    ? ZVal.toBool(!arrayActionR(ArrayAction.ISSET, s, env, "flags"))
                                            || ZVal.toBool(
                                                    ZVal.strictEqualityCheck(
                                                            ZVal.toLong(s.arrayGet(env, "flags"))
                                                                    & ZVal.toLong(flags),
                                                            "===",
                                                            flags))
                                    : s.arrayGet(env, "del"))) {
                if (ZVal.isTrue(flush)) {
                    function_ob_end_flush.f.env(env).call();

                } else {
                    function_ob_end_clean.f.env(env).call();
                }
            }

            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object statusTexts =
                ZVal.newArray(
                        new ZPair(100, "Continue"),
                        new ZPair(101, "Switching Protocols"),
                        new ZPair(102, "Processing"),
                        new ZPair(103, "Early Hints"),
                        new ZPair(200, "OK"),
                        new ZPair(201, "Created"),
                        new ZPair(202, "Accepted"),
                        new ZPair(203, "Non-Authoritative Information"),
                        new ZPair(204, "No Content"),
                        new ZPair(205, "Reset Content"),
                        new ZPair(206, "Partial Content"),
                        new ZPair(207, "Multi-Status"),
                        new ZPair(208, "Already Reported"),
                        new ZPair(226, "IM Used"),
                        new ZPair(300, "Multiple Choices"),
                        new ZPair(301, "Moved Permanently"),
                        new ZPair(302, "Found"),
                        new ZPair(303, "See Other"),
                        new ZPair(304, "Not Modified"),
                        new ZPair(305, "Use Proxy"),
                        new ZPair(307, "Temporary Redirect"),
                        new ZPair(308, "Permanent Redirect"),
                        new ZPair(400, "Bad Request"),
                        new ZPair(401, "Unauthorized"),
                        new ZPair(402, "Payment Required"),
                        new ZPair(403, "Forbidden"),
                        new ZPair(404, "Not Found"),
                        new ZPair(405, "Method Not Allowed"),
                        new ZPair(406, "Not Acceptable"),
                        new ZPair(407, "Proxy Authentication Required"),
                        new ZPair(408, "Request Timeout"),
                        new ZPair(409, "Conflict"),
                        new ZPair(410, "Gone"),
                        new ZPair(411, "Length Required"),
                        new ZPair(412, "Precondition Failed"),
                        new ZPair(413, "Payload Too Large"),
                        new ZPair(414, "URI Too Long"),
                        new ZPair(415, "Unsupported Media Type"),
                        new ZPair(416, "Range Not Satisfiable"),
                        new ZPair(417, "Expectation Failed"),
                        new ZPair(418, "I'm a teapot"),
                        new ZPair(421, "Misdirected Request"),
                        new ZPair(422, "Unprocessable Entity"),
                        new ZPair(423, "Locked"),
                        new ZPair(424, "Failed Dependency"),
                        new ZPair(425, "Reserved for WebDAV advanced collections expired proposal"),
                        new ZPair(426, "Upgrade Required"),
                        new ZPair(428, "Precondition Required"),
                        new ZPair(429, "Too Many Requests"),
                        new ZPair(431, "Request Header Fields Too Large"),
                        new ZPair(451, "Unavailable For Legal Reasons"),
                        new ZPair(500, "Internal Server Error"),
                        new ZPair(501, "Not Implemented"),
                        new ZPair(502, "Bad Gateway"),
                        new ZPair(503, "Service Unavailable"),
                        new ZPair(504, "Gateway Timeout"),
                        new ZPair(505, "HTTP Version Not Supported"),
                        new ZPair(506, "Variant Also Negotiates"),
                        new ZPair(507, "Insufficient Storage"),
                        new ZPair(508, "Loop Detected"),
                        new ZPair(510, "Not Extended"),
                        new ZPair(511, "Network Authentication Required"));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpFoundation\\Response")
                    .setLookup(
                            Response.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "charset", "content", "headers", "statusCode", "statusText", "version")
                    .setStaticPropertyNames("statusTexts")
                    .setFilename("vendor/symfony/http-foundation/Response.php")
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
