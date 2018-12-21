package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.MissingExtensionException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.SocketHandler;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_extension_loaded;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.LineFormatter;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/FleepHookHandler.php

*/

public class FleepHookHandler extends SocketHandler {

    public Object token = null;

    public FleepHookHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FleepHookHandler.class) {
            this.__construct(env, args);
        }
    }

    public FleepHookHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token")
    @ConvertedParameter(index = 1, name = "level")
    @ConvertedParameter(
        index = 2,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object token = assignParameter(args, 0, false);
        Object level = assignParameter(args, 1, true);
        if (null == level) {
            level = Logger.CONST_DEBUG;
        }
        Object bubble = assignParameter(args, 2, true);
        if (null == bubble) {
            bubble = true;
        }
        Object connectionString = null;
        if (!function_extension_loaded.f.env(env).call("openssl").getBool()) {
            throw ZVal.getException(
                    env,
                    new MissingExtensionException(
                            env,
                            "The OpenSSL PHP extension is required to use the FleepHookHandler"));
        }

        this.token = token;
        connectionString = "ssl://" + toStringR(CONST_FLEEP_HOST, env) + ":443";
        super.__construct(env, connectionString, level, bubble);
        return null;
    }

    @ConvertedMethod
    protected Object getDefaultFormatter(RuntimeEnv env, Object... args) {
        return ZVal.assign(new LineFormatter(env, ZVal.getNull(), ZVal.getNull(), true, true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object write(RuntimeEnv env, Object... args) {
        Object record = assignParameter(args, 0, false);
        super.write(env, record);
        env.callMethod(this, "closeSocket", FleepHookHandler.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record")
    protected Object generateDataStream(RuntimeEnv env, Object... args) {
        Object record = assignParameter(args, 0, false);
        Object content = null;
        content = this.buildContent(env, record);
        return ZVal.assign(
                toStringR(this.buildHeader(env, content), env) + toStringR(content, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    private Object buildHeader(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, false);
        Object header = null;
        header =
                "POST "
                        + toStringR(CONST_FLEEP_HOOK_URI, env)
                        + toStringR(this.token, env)
                        + " HTTP/1.1\r\n";
        header = toStringR(header, env) + "Host: " + toStringR(CONST_FLEEP_HOST, env) + "\r\n";
        header = toStringR(header, env) + "Content-Type: application/x-www-form-urlencoded\r\n";
        header =
                toStringR(header, env)
                        + "Content-Length: "
                        + toStringR(function_strlen.f.env(env).call(content).value(), env)
                        + "\r\n";
        header = toStringR(header, env) + "\r\n";
        return ZVal.assign(header);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record")
    private Object buildContent(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object dataArray = null;
        dataArray = ZVal.newArray(new ZPair("message", record.arrayGet(env, "formatted")));
        return ZVal.assign(NamespaceGlobal.http_build_query.env(env).call(dataArray).value());
    }

    public static final Object CONST_FLEEP_HOST = "fleep.io";

    public static final Object CONST_FLEEP_HOOK_URI = "/hook/";

    public static final Object CONST_class = "Monolog\\Handler\\FleepHookHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends SocketHandler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Handler\\FleepHookHandler")
                    .setLookup(
                            FleepHookHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bubble",
                            "connectionString",
                            "connectionTimeout",
                            "errno",
                            "errstr",
                            "formatter",
                            "lastSentBytes",
                            "lastWritingAt",
                            "level",
                            "persistent",
                            "processors",
                            "resource",
                            "timeout",
                            "token",
                            "writingTimeout")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/FleepHookHandler.php")
                    .addInterface("Monolog\\Handler\\HandlerInterface")
                    .addExtendsClass("Monolog\\Handler\\SocketHandler")
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
