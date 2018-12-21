package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.UnexpectedValueException;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.MissingExtensionException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.namespaces.Curl.classes.Util;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractProcessingHandler;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_extension_loaded;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/CubeHandler.php

*/

public class CubeHandler extends AbstractProcessingHandler {

    public Object udpConnection = null;

    public Object httpConnection = null;

    public Object scheme = null;

    public Object host = null;

    public Object port = null;

    public Object acceptedSchemes = ZVal.arrayFromList("http", "udp");

    public CubeHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CubeHandler.class) {
            this.__construct(env, args);
        }
    }

    public CubeHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "url")
    @ConvertedParameter(index = 1, name = "level")
    @ConvertedParameter(
        index = 2,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object url = assignParameter(args, 0, false);
        Object level = assignParameter(args, 1, true);
        if (null == level) {
            level = Logger.CONST_DEBUG;
        }
        Object bubble = assignParameter(args, 2, true);
        if (null == bubble) {
            bubble = true;
        }
        ReferenceContainer urlInfo = new BasicReferenceContainer(null);
        urlInfo.setObject(NamespaceGlobal.parse_url.env(env).call(url).value());
        if (!ZVal.toBool(
                        ZVal.toBool(arrayActionR(ArrayAction.ISSET, urlInfo, env, "scheme"))
                                && ZVal.toBool(
                                        arrayActionR(ArrayAction.ISSET, urlInfo, env, "host")))
                && ZVal.toBool(arrayActionR(ArrayAction.ISSET, urlInfo, env, "port"))) {
            throw ZVal.getException(
                    env,
                    new UnexpectedValueException(
                            env, "URL \"" + toStringR(url, env) + "\" is not valid"));
        }

        if (!function_in_array
                .f
                .env(env)
                .call(urlInfo.arrayGet(env, "scheme"), this.acceptedSchemes)
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new UnexpectedValueException(
                            env,
                            "Invalid protocol ("
                                    + toStringR(urlInfo.arrayGet(env, "scheme"), env)
                                    + ")."
                                    + " Valid options are "
                                    + toStringR(
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call(", ", this.acceptedSchemes)
                                                    .value(),
                                            env)));
        }

        this.scheme = urlInfo.arrayGet(env, "scheme");
        this.host = urlInfo.arrayGet(env, "host");
        this.port = urlInfo.arrayGet(env, "port");
        super.__construct(env, level, bubble);
        return null;
    }

    @ConvertedMethod
    protected Object connectUdp(RuntimeEnv env, Object... args) {
        if (!function_extension_loaded.f.env(env).call("sockets").getBool()) {
            throw ZVal.getException(
                    env,
                    new MissingExtensionException(
                            env,
                            "The sockets extension is required to use udp URLs with the CubeHandler"));
        }

        this.udpConnection = NamespaceGlobal.socket_create.env(env).call(2, 2, 0).value();
        if (!ZVal.isTrue(this.udpConnection)) {
            throw ZVal.getException(env, new LogicException(env, "Unable to create a socket"));
        }

        if (!NamespaceGlobal.socket_connect
                .env(env)
                .call(this.udpConnection, this.host, this.port)
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            "Unable to connect to the socket at "
                                    + toStringR(this.host, env)
                                    + ":"
                                    + toStringR(this.port, env)));
        }

        return null;
    }

    @ConvertedMethod
    protected Object connectHttp(RuntimeEnv env, Object... args) {
        if (!function_extension_loaded.f.env(env).call("curl").getBool()) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            "The curl extension is needed to use http URLs with the CubeHandler"));
        }

        this.httpConnection =
                NamespaceGlobal.curl_init
                        .env(env)
                        .call(
                                "http://"
                                        + toStringR(this.host, env)
                                        + ":"
                                        + toStringR(this.port, env)
                                        + "/1.0/event/put")
                        .value();
        if (!ZVal.isTrue(this.httpConnection)) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            "Unable to connect to "
                                    + toStringR(this.host, env)
                                    + ":"
                                    + toStringR(this.port, env)));
        }

        NamespaceGlobal.curl_setopt.env(env).call(this.httpConnection, 10036, "POST");
        NamespaceGlobal.curl_setopt.env(env).call(this.httpConnection, 19913, true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object write(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object date = null;
        ReferenceContainer data = new BasicReferenceContainer(null);
        date = ZVal.assign(record.arrayGet(env, "datetime"));
        data.setObject(
                ZVal.newArray(
                        new ZPair(
                                "time",
                                env.callMethod(
                                        date, "format", CubeHandler.class, "Y-m-d\\TH:i:s.uO"))));
        arrayActionR(ArrayAction.UNSET, record, env, "datetime");
        if (arrayActionR(ArrayAction.ISSET, record, env, "context", "type")) {
            data.arrayAccess(env, "type").set(record.arrayGet(env, "context", "type"));
            arrayActionR(ArrayAction.UNSET, record, env, "context", "type");

        } else {
            data.arrayAccess(env, "type").set(record.arrayGet(env, "channel"));
        }

        data.arrayAccess(env, "data").set(record.arrayGet(env, "context"));
        data.arrayAccess(env, "data", "level").set(record.arrayGet(env, "level"));
        if (ZVal.strictEqualityCheck(this.scheme, "===", "http")) {
            this.writeHttp(
                    env, NamespaceGlobal.json_encode.env(env).call(data.getObject()).value());

        } else {
            this.writeUdp(env, NamespaceGlobal.json_encode.env(env).call(data.getObject()).value());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    private Object writeUdp(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        if (!ZVal.isTrue(this.udpConnection)) {
            this.connectUdp(env);
        }

        NamespaceGlobal.socket_send
                .env(env)
                .call(this.udpConnection, data, function_strlen.f.env(env).call(data).value(), 0);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    private Object writeHttp(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        if (!ZVal.isTrue(this.httpConnection)) {
            this.connectHttp(env);
        }

        NamespaceGlobal.curl_setopt
                .env(env)
                .call(this.httpConnection, 10015, "[" + toStringR(data, env) + "]");
        NamespaceGlobal.curl_setopt
                .env(env)
                .call(
                        this.httpConnection,
                        10023,
                        ZVal.newArray(
                                new ZPair(0, "Content-Type: application/json"),
                                new ZPair(
                                        1,
                                        "Content-Length: "
                                                + toStringR(
                                                        function_strlen
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        "["
                                                                                + toStringR(
                                                                                        data, env)
                                                                                + "]")
                                                                .value(),
                                                        env))));
        Util.runtimeStaticObject.execute(env, this.httpConnection, 5, false);
        return null;
    }

    public static final Object CONST_class = "Monolog\\Handler\\CubeHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends AbstractProcessingHandler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Handler\\CubeHandler")
                    .setLookup(
                            CubeHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "acceptedSchemes",
                            "bubble",
                            "formatter",
                            "host",
                            "httpConnection",
                            "level",
                            "port",
                            "processors",
                            "scheme",
                            "udpConnection")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/CubeHandler.php")
                    .addInterface("Monolog\\Handler\\HandlerInterface")
                    .addExtendsClass("Monolog\\Handler\\AbstractProcessingHandler")
                    .addExtendsClass("Monolog\\Handler\\AbstractHandler")
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
