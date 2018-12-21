package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeInterface;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.HeaderUtils;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/Cookie.php

*/

public class Cookie extends RuntimeClassBase {

    public Object name = null;

    public Object value = null;

    public Object domain = null;

    public Object expire = null;

    public Object path = null;

    public Object secure = null;

    public Object httpOnly = null;

    public Object raw = null;

    public Object sameSite = null;

    public Cookie(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Cookie.class) {
            this.__construct(env, args);
        }
    }

    public Cookie(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "value",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "expire", defaultValue = "0", defaultValueType = "number")
    @ConvertedParameter(index = 3, name = "path")
    @ConvertedParameter(
        index = 4,
        name = "domain",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "secure",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "httpOnly",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 7,
        name = "raw",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 8,
        name = "sameSite",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        Object expire = assignParameter(args, 2, true);
        if (null == expire) {
            expire = 0;
        }
        Object path = assignParameter(args, 3, true);
        if (null == path) {
            path = "/";
        }
        Object domain = assignParameter(args, 4, true);
        if (null == domain) {
            domain = ZVal.getNull();
        }
        Object secure = assignParameter(args, 5, true);
        if (null == secure) {
            secure = false;
        }
        Object httpOnly = assignParameter(args, 6, true);
        if (null == httpOnly) {
            httpOnly = true;
        }
        Object raw = assignParameter(args, 7, true);
        if (null == raw) {
            raw = false;
        }
        Object sameSite = assignParameter(args, 8, true);
        if (null == sameSite) {
            sameSite = ZVal.getNull();
        }
        if (function_preg_match.f.env(env).call("/[=,; \t\r\n\u000B\f]/", name).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "The cookie name \"%s\" contains invalid characters.",
                                            name)
                                    .value()));
        }

        if (ZVal.isEmpty(name)) {
            throw ZVal.getException(
                    env, new InvalidArgumentException(env, "The cookie name cannot be empty."));
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(expire, DateTimeInterface.class, "DateTimeInterface"))) {
            expire = env.callMethod(expire, "format", Cookie.class, "U");

        } else if (!function_is_numeric.f.env(env).call(expire).getBool()) {
            expire = NamespaceGlobal.strtotime.env(env).call(expire).value();
            if (ZVal.strictEqualityCheck(false, "===", expire)) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env, "The cookie expiration time is not valid."));
            }
        }

        this.name = name;
        this.value = value;
        this.domain = domain;
        this.expire = ZVal.isLessThan(0, '<', expire) ? ZVal.toLong(expire) : 0;
        this.path = ZVal.isEmpty(path) ? "/" : path;
        this.secure = secure;
        this.httpOnly = httpOnly;
        this.raw = raw;
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", sameSite)) {
            sameSite = NamespaceGlobal.strtolower.env(env).call(sameSite).value();
        }

        if (!function_in_array
                .f
                .env(env)
                .call(
                        sameSite,
                        ZVal.newArray(
                                new ZPair(0, CONST_SAMESITE_LAX),
                                new ZPair(1, CONST_SAMESITE_STRICT),
                                new ZPair(2, ZVal.getNull())),
                        true)
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "The \"sameSite\" parameter value is not valid."));
        }

        this.sameSite = sameSite;
        return null;
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        Object str = null;
        str =
                toStringR(
                                ZVal.isTrue(this.isRaw(env))
                                        ? this.getName(env)
                                        : NamespaceGlobal.urlencode
                                                .env(env)
                                                .call(this.getName(env))
                                                .value(),
                                env)
                        + "=";
        if (ZVal.strictEqualityCheck("", "===", toStringR(this.getValue(env), env))) {
            str =
                    toStringR(str, env)
                            + "deleted; expires="
                            + toStringR(
                                    NamespaceGlobal.gmdate
                                            .env(env)
                                            .call(
                                                    "D, d-M-Y H:i:s T",
                                                    ZVal.subtract(
                                                            NamespaceGlobal.time
                                                                    .env(env)
                                                                    .call()
                                                                    .value(),
                                                            31536001))
                                            .value(),
                                    env)
                            + "; Max-Age=0";

        } else {
            str =
                    toStringR(str, env)
                            + toStringR(
                                    ZVal.isTrue(this.isRaw(env))
                                            ? this.getValue(env)
                                            : NamespaceGlobal.rawurlencode
                                                    .env(env)
                                                    .call(this.getValue(env))
                                                    .value(),
                                    env);
            if (ZVal.strictNotEqualityCheck(0, "!==", this.getExpiresTime(env))) {
                str =
                        toStringR(str, env)
                                + "; expires="
                                + toStringR(
                                        NamespaceGlobal.gmdate
                                                .env(env)
                                                .call("D, d-M-Y H:i:s T", this.getExpiresTime(env))
                                                .value(),
                                        env)
                                + "; Max-Age="
                                + toStringR(this.getMaxAge(env), env);
            }
        }

        if (ZVal.isTrue(this.getPath(env))) {
            str = toStringR(str, env) + "; path=" + toStringR(this.getPath(env), env);
        }

        if (ZVal.isTrue(this.getDomain(env))) {
            str = toStringR(str, env) + "; domain=" + toStringR(this.getDomain(env), env);
        }

        if (ZVal.strictEqualityCheck(true, "===", this.isSecure(env))) {
            str = toStringR(str, env) + "; secure";
        }

        if (ZVal.strictEqualityCheck(true, "===", this.isHttpOnly(env))) {
            str = toStringR(str, env) + "; httponly";
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.getSameSite(env))) {
            str = toStringR(str, env) + "; samesite=" + toStringR(this.getSameSite(env), env);
        }

        return ZVal.assign(str);
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.name);
    }

    @ConvertedMethod
    public Object getValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.value);
    }

    @ConvertedMethod
    public Object getDomain(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.domain);
    }

    @ConvertedMethod
    public Object getExpiresTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.expire);
    }

    @ConvertedMethod
    public Object getMaxAge(RuntimeEnv env, Object... args) {
        Object maxAge = null;
        maxAge = ZVal.subtract(this.expire, NamespaceGlobal.time.env(env).call().value());
        return ZVal.assign(ZVal.isGreaterThanOrEqualTo(0, ">=", maxAge) ? 0 : maxAge);
    }

    @ConvertedMethod
    public Object getPath(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.path);
    }

    @ConvertedMethod
    public Object isSecure(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.secure);
    }

    @ConvertedMethod
    public Object isHttpOnly(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.httpOnly);
    }

    @ConvertedMethod
    public Object isCleared(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isLessThan(this.expire, '<', NamespaceGlobal.time.env(env).call().value()));
    }

    @ConvertedMethod
    public Object isRaw(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.raw);
    }

    @ConvertedMethod
    public Object getSameSite(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.sameSite);
    }

    public static final Object CONST_SAMESITE_LAX = "lax";

    public static final Object CONST_SAMESITE_STRICT = "strict";

    public static final Object CONST_class = "Symfony\\Component\\HttpFoundation\\Cookie";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "cookie")
        @ConvertedParameter(
            index = 1,
            name = "decode",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object fromString(RuntimeEnv env, Object... args) {
            Object cookie = assignParameter(args, 0, false);
            Object decode = assignParameter(args, 1, true);
            if (null == decode) {
                decode = false;
            }
            ReferenceContainer data = new BasicReferenceContainer(null);
            ReferenceContainer part = new BasicReferenceContainer(null);
            Object parts = null;
            Object name = null;
            Object value = null;
            data.setObject(
                    ZVal.newArray(
                            new ZPair("expires", 0),
                            new ZPair("path", "/"),
                            new ZPair("domain", ZVal.getNull()),
                            new ZPair("secure", false),
                            new ZPair("httponly", false),
                            new ZPair("raw", !ZVal.isTrue(decode)),
                            new ZPair("samesite", ZVal.getNull())));
            parts = HeaderUtils.runtimeStaticObject.split(env, cookie, ";=");
            part.setObject(function_array_shift.f.env(env).call(parts).value());
            name =
                    ZVal.assign(
                            ZVal.isTrue(decode)
                                    ? NamespaceGlobal.urldecode
                                            .env(env)
                                            .call(part.arrayGet(env, 0))
                                            .value()
                                    : part.arrayGet(env, 0));
            value =
                    ZVal.assign(
                            arrayActionR(ArrayAction.ISSET, part, env, 1)
                                    ? ZVal.isTrue(decode)
                                            ? NamespaceGlobal.urldecode
                                                    .env(env)
                                                    .call(part.arrayGet(env, 1))
                                                    .value()
                                            : part.arrayGet(env, 1)
                                    : ZVal.getNull());
            data.setObject(
                    ZVal.add(
                            HeaderUtils.runtimeStaticObject.combine(env, parts), data.getObject()));
            if (arrayActionR(ArrayAction.ISSET, data, env, "max-age")) {
                data.arrayAccess(env, "expires")
                        .set(
                                ZVal.add(
                                        NamespaceGlobal.time.env(env).call().value(),
                                        ZVal.toLong(data.arrayGet(env, "max-age"))));
            }

            return ZVal.assign(
                    env.createNewWithLateStaticBindings(
                            this,
                            name,
                            value,
                            data.arrayGet(env, "expires"),
                            data.arrayGet(env, "path"),
                            data.arrayGet(env, "domain"),
                            data.arrayGet(env, "secure"),
                            data.arrayGet(env, "httponly"),
                            data.arrayGet(env, "raw"),
                            data.arrayGet(env, "samesite")));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpFoundation\\Cookie")
                    .setLookup(
                            Cookie.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "domain",
                            "expire",
                            "httpOnly",
                            "name",
                            "path",
                            "raw",
                            "sameSite",
                            "secure",
                            "value")
                    .setFilename("vendor/symfony/http-foundation/Cookie.php")
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
