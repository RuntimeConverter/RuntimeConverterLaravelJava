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
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.FlowdockFormatter;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/FlowdockHandler.php

*/

public class FlowdockHandler extends SocketHandler {

    public Object apiToken = null;

    public FlowdockHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FlowdockHandler.class) {
            this.__construct(env, args);
        }
    }

    public FlowdockHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "apiToken")
    @ConvertedParameter(index = 1, name = "level")
    @ConvertedParameter(
        index = 2,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object apiToken = assignParameter(args, 0, false);
        Object level = assignParameter(args, 1, true);
        if (null == level) {
            level = Logger.CONST_DEBUG;
        }
        Object bubble = assignParameter(args, 2, true);
        if (null == bubble) {
            bubble = true;
        }
        if (!function_extension_loaded.f.env(env).call("openssl").getBool()) {
            throw ZVal.getException(
                    env,
                    new MissingExtensionException(
                            env,
                            "The OpenSSL PHP extension is required to use the FlowdockHandler"));
        }

        super.__construct(env, "ssl://api.flowdock.com:443", level, bubble);
        this.apiToken = apiToken;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "formatter",
        typeHint = "Monolog\\Formatter\\FormatterInterface"
    )
    public Object setFormatter(RuntimeEnv env, Object... args) {
        Object formatter = assignParameter(args, 0, false);
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        formatter,
                        FlowdockFormatter.class,
                        "Monolog\\Formatter\\FlowdockFormatter"))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "The FlowdockHandler requires an instance of Monolog\\Formatter\\FlowdockFormatter to function correctly"));
        }

        return ZVal.assign(super.setFormatter(env, formatter));
    }

    @ConvertedMethod
    protected Object getDefaultFormatter(RuntimeEnv env, Object... args) {
        throw ZVal.getException(
                env,
                new InvalidArgumentException(
                        env,
                        "The FlowdockHandler must be configured (via setFormatter) with an instance of Monolog\\Formatter\\FlowdockFormatter to function correctly"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object write(RuntimeEnv env, Object... args) {
        Object record = assignParameter(args, 0, false);
        super.write(env, record);
        env.callMethod(this, "closeSocket", FlowdockHandler.class);
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
    @ConvertedParameter(index = 0, name = "record")
    private Object buildContent(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                NamespaceGlobal.json_encode
                        .env(env)
                        .call(record.arrayGet(env, "formatted", "flowdock"))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    private Object buildHeader(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, false);
        Object header = null;
        header = "POST /v1/messages/team_inbox/" + toStringR(this.apiToken, env) + " HTTP/1.1\r\n";
        header = toStringR(header, env) + "Host: api.flowdock.com\r\n";
        header = toStringR(header, env) + "Content-Type: application/json\r\n";
        header =
                toStringR(header, env)
                        + "Content-Length: "
                        + toStringR(function_strlen.f.env(env).call(content).value(), env)
                        + "\r\n";
        header = toStringR(header, env) + "\r\n";
        return ZVal.assign(header);
    }

    public static final Object CONST_class = "Monolog\\Handler\\FlowdockHandler";

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
                    .setName("Monolog\\Handler\\FlowdockHandler")
                    .setLookup(
                            FlowdockHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "apiToken",
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
                            "writingTimeout")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/FlowdockHandler.php")
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
