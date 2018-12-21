package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.runtimeconverter.runtime.nativeFunctions.string.function_stripos;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.http.function_header;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.http.function_setcookie;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeInterfaces.SessionHandlerInterface;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeInterfaces.SessionUpdateTimestampHandlerInterface;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/Session/Storage/Handler/AbstractSessionHandler.php

*/

public abstract class AbstractSessionHandler extends RuntimeClassBase
        implements SessionHandlerInterface, SessionUpdateTimestampHandlerInterface {

    public Object sessionName = null;

    public Object prefetchId = null;

    public Object prefetchData = null;

    public Object newSessionId = null;

    public Object igbinaryEmptyData = null;

    public AbstractSessionHandler(RuntimeEnv env, Object... args) {
        super(env);
    }

    public AbstractSessionHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "savePath")
    @ConvertedParameter(index = 1, name = "sessionName")
    public Object open(RuntimeEnv env, Object... args) {
        Object savePath = assignParameter(args, 0, false);
        Object sessionName = assignParameter(args, 1, false);
        this.sessionName = sessionName;
        if (ZVal.toBool(
                        ZVal.toBool(!NamespaceGlobal.headers_sent.env(env).call().getBool())
                                && ZVal.toBool(
                                        !function_ini_get
                                                .f
                                                .env(env)
                                                .call("session.cache_limiter")
                                                .getBool()))
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                "0",
                                "!==",
                                function_ini_get
                                        .f
                                        .env(env)
                                        .call("session.cache_limiter")
                                        .value()))) {
            function_header
                    .f
                    .env(env)
                    .call(
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Cache-Control: max-age=%d, private, must-revalidate",
                                            ZVal.multiply(
                                                    60,
                                                    ZVal.toLong(
                                                            function_ini_get
                                                                    .f
                                                                    .env(env)
                                                                    .call("session.cache_expire")
                                                                    .value())))
                                    .value());
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    public Object validateId(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        this.prefetchData = this.read(env, sessionId);
        this.prefetchId = sessionId;
        return ZVal.assign(ZVal.strictNotEqualityCheck("", "!==", this.prefetchData));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    public Object read(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        Object prefetchData = null;
        Object data = null;
        Object prefetchId = null;
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.prefetchId)) {
            prefetchId = ZVal.assign(this.prefetchId);
            prefetchData = ZVal.assign(this.prefetchData);
            this.prefetchId = this.prefetchData = ZVal.getNull();
            if (ZVal.toBool(ZVal.strictEqualityCheck(prefetchId, "===", sessionId))
                    || ZVal.toBool(ZVal.strictEqualityCheck("", "===", prefetchData))) {
                this.newSessionId =
                        ZVal.strictEqualityCheck("", "===", prefetchData)
                                ? sessionId
                                : ZVal.getNull();
                return ZVal.assign(prefetchData);
            }
        }

        data = env.callMethod(this, "doRead", AbstractSessionHandler.class, sessionId);
        this.newSessionId = ZVal.strictEqualityCheck("", "===", data) ? sessionId : ZVal.getNull();
        return ZVal.assign(data);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    @ConvertedParameter(index = 1, name = "data")
    public Object write(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.igbinaryEmptyData)) {
            this.igbinaryEmptyData =
                    function_function_exists.f.env(env).call("igbinary_serialize").getBool()
                            ? com.runtimeconverter.runtime.ZVal.functionNotFound(
                                            "igbinary_serialize")
                                    .env(env)
                                    .call(ZVal.newArray())
                                    .value()
                            : "";
        }

        if (ZVal.toBool(ZVal.strictEqualityCheck("", "===", data))
                || ZVal.toBool(ZVal.strictEqualityCheck(this.igbinaryEmptyData, "===", data))) {
            return ZVal.assign(this.destroy(env, sessionId));
        }

        this.newSessionId = ZVal.getNull();
        return ZVal.assign(
                env.callMethod(this, "doWrite", AbstractSessionHandler.class, sessionId, data));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    public Object destroy(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object sessionId = assignParameter(args, 0, false);
        ReferenceContainer otherCookies = new BasicReferenceContainer(null);
        Object sessionCookie = null;
        Object h = null;
        Object sessionCookieWithId = null;
        Object sessionCookieFound = null;
        if (ZVal.toBool(!NamespaceGlobal.headers_sent.env(env).call().getBool())
                && ZVal.toBool(function_ini_get.f.env(env).call("session.use_cookies").value())) {
            if (!ZVal.isTrue(this.sessionName)) {
                throw ZVal.getException(
                        env,
                        new LogicException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Session name cannot be empty, did you forget to call \"parent::open()\" in \"%s\"?.",
                                                function_get_class.f.env(env).call(this).value())
                                        .value()));
            }

            sessionCookie =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    " %s=",
                                    NamespaceGlobal.urlencode
                                            .env(env)
                                            .call(this.sessionName)
                                            .value())
                            .value();
            sessionCookieWithId =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "%s%s;",
                                    sessionCookie,
                                    NamespaceGlobal.urlencode.env(env).call(sessionId).value())
                            .value();
            sessionCookieFound = false;
            otherCookies.setObject(ZVal.newArray());
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1888 :
                    ZVal.getIterable(
                            NamespaceGlobal.headers_list.env(env).call().value(), env, true)) {
                h = ZVal.assign(zpairResult1888.getValue());
                if (ZVal.strictNotEqualityCheck(
                        0, "!==", function_stripos.f.env(env).call(h, "Set-Cookie:").value())) {
                    continue;
                }

                if (ZVal.strictEqualityCheck(
                        11, "===", function_strpos.f.env(env).call(h, sessionCookie, 11).value())) {
                    sessionCookieFound = true;
                    if (ZVal.strictNotEqualityCheck(
                            11,
                            "!==",
                            function_strpos.f.env(env).call(h, sessionCookieWithId, 11).value())) {
                        otherCookies.arrayAppend(env).set(h);
                    }

                } else {
                    otherCookies.arrayAppend(env).set(h);
                }
            }

            if (ZVal.isTrue(sessionCookieFound)) {
                NamespaceGlobal.header_remove.env(env).call("Set-Cookie");
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1889 :
                        ZVal.getIterable(otherCookies.getObject(), env, true)) {
                    h = ZVal.assign(zpairResult1889.getValue());
                    function_header.f.env(env).call(h, false);
                }

            } else {
                function_setcookie
                        .f
                        .env(env)
                        .call(
                                this.sessionName,
                                "",
                                0,
                                function_ini_get.f.env(env).call("session.cookie_path").value(),
                                function_ini_get.f.env(env).call("session.cookie_domain").value(),
                                function_ini_get.f.env(env).call("session.cookie_secure").value(),
                                function_ini_get
                                        .f
                                        .env(env)
                                        .call("session.cookie_httponly")
                                        .value());
            }
        }

        return ZVal.assign(
                ZVal.toBool(ZVal.strictEqualityCheck(this.newSessionId, "===", sessionId))
                        || ZVal.toBool(
                                env.callMethod(
                                        this,
                                        "doDestroy",
                                        AbstractSessionHandler.class,
                                        sessionId)));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Handler\\AbstractSessionHandler";

    @ConvertedMethod()
    public abstract Object close(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object gc(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object updateTimestamp(RuntimeEnv env, Object... args);

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
                    .setName(
                            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Handler\\AbstractSessionHandler")
                    .setLookup(
                            AbstractSessionHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "igbinaryEmptyData",
                            "newSessionId",
                            "prefetchData",
                            "prefetchId",
                            "sessionName")
                    .setFilename(
                            "vendor/symfony/http-foundation/Session/Storage/Handler/AbstractSessionHandler.php")
                    .addInterface("SessionHandlerInterface")
                    .addInterface("SessionUpdateTimestampHandlerInterface")
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
