package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.classes.Swift_Plugins_Pop_Pop3Connection;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Swift_Events_TransportChangeListener;
import com.project.convertedCode.globalNamespace.classes.Swift_Plugins_Pop_Pop3Exception;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fwrite;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/PopBeforeSmtpPlugin.php

*/

public class Swift_Plugins_PopBeforeSmtpPlugin extends RuntimeClassBase
        implements Swift_Events_TransportChangeListener, Swift_Plugins_Pop_Pop3Connection {

    public Object connection = null;

    public Object host = null;

    public Object port = null;

    public Object crypto = null;

    public Object username = null;

    public Object password = null;

    public Object socket = null;

    public Object timeout = 10;

    public Object transport = null;

    public Swift_Plugins_PopBeforeSmtpPlugin(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Plugins_PopBeforeSmtpPlugin.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Plugins_PopBeforeSmtpPlugin(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "host")
    @ConvertedParameter(index = 1, name = "port", defaultValue = "110", defaultValueType = "number")
    @ConvertedParameter(
        index = 2,
        name = "crypto",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object host = assignParameter(args, 0, false);
        Object port = assignParameter(args, 1, true);
        if (null == port) {
            port = 110;
        }
        Object crypto = assignParameter(args, 2, true);
        if (null == crypto) {
            crypto = ZVal.getNull();
        }
        this.host = host;
        this.port = port;
        this.crypto = crypto;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "connection",
        typeHint = "Swift_Plugins_Pop_Pop3Connection"
    )
    public Object setConnection(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        this.connection = connection;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "smtp", typeHint = "Swift_Transport")
    public Object bindSmtp(RuntimeEnv env, Object... args) {
        Object smtp = assignParameter(args, 0, false);
        this.transport = smtp;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "timeout")
    public Object setTimeout(RuntimeEnv env, Object... args) {
        Object timeout = assignParameter(args, 0, false);
        this.timeout = ZVal.toLong(timeout);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "username")
    public Object setUsername(RuntimeEnv env, Object... args) {
        Object username = assignParameter(args, 0, false);
        this.username = username;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "password")
    public Object setPassword(RuntimeEnv env, Object... args) {
        Object password = assignParameter(args, 0, false);
        this.password = password;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object connect(RuntimeEnv env, Object... args) {
        ReferenceContainer errno = new BasicReferenceContainer(null);
        Object greeting = null;
        ReferenceContainer errstr = new BasicReferenceContainer(null);
        Object socket = null;
        if (ZVal.isset(this.connection)) {
            env.callMethod(this.connection, "connect", Swift_Plugins_PopBeforeSmtpPlugin.class);

        } else {
            if (!ZVal.isset(this.socket)) {
                if (!ZVal.isTrue(
                        socket =
                                NamespaceGlobal.fsockopen
                                        .env(env)
                                        .addReferenceArgs(
                                                new RuntimeArgsWithReferences()
                                                        .add(2, errno)
                                                        .add(3, errstr))
                                        .call(
                                                this.getHostString(env),
                                                this.port,
                                                errno.getObject(),
                                                errstr.getObject(),
                                                this.timeout)
                                        .value())) {
                    throw ZVal.getException(
                            env,
                            new Swift_Plugins_Pop_Pop3Exception(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Failed to connect to POP3 host [%s]: %s",
                                                    this.host, errstr.getObject())
                                            .value()));
                }

                this.socket = socket;
                if (ZVal.strictEqualityCheck(
                        false,
                        "===",
                        greeting = NamespaceGlobal.fgets.env(env).call(this.socket).value())) {
                    throw ZVal.getException(
                            env,
                            new Swift_Plugins_Pop_Pop3Exception(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Failed to connect to POP3 host [%s]",
                                                    function_trim.f.env(env).call(greeting).value())
                                            .value()));
                }

                this.assertOk(env, greeting);
                if (ZVal.isTrue(this.username)) {
                    this.command(
                            env,
                            function_sprintf.f.env(env).call("USER %s\r\n", this.username).value());
                    this.command(
                            env,
                            function_sprintf.f.env(env).call("PASS %s\r\n", this.password).value());
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object disconnect(RuntimeEnv env, Object... args) {
        if (ZVal.isset(this.connection)) {
            env.callMethod(this.connection, "disconnect", Swift_Plugins_PopBeforeSmtpPlugin.class);

        } else {
            this.command(env, "QUIT\r\n");
            if (!function_fclose.f.env(env).call(this.socket).getBool()) {
                throw ZVal.getException(
                        env,
                        new Swift_Plugins_Pop_Pop3Exception(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "POP3 host [%s] connection could not be stopped",
                                                this.host)
                                        .value()));
            }

            this.socket = ZVal.getNull();
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "evt", typeHint = "Swift_Events_TransportChangeEvent")
    public Object beforeTransportStarted(RuntimeEnv env, Object... args) {
        Object evt = assignParameter(args, 0, false);
        if (ZVal.isset(this.transport)) {
            if (ZVal.strictNotEqualityCheck(
                    this.transport,
                    "!==",
                    env.callMethod(evt, "getTransport", Swift_Plugins_PopBeforeSmtpPlugin.class))) {
                return null;
            }
        }

        this.connect(env);
        this.disconnect(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "evt", typeHint = "Swift_Events_TransportChangeEvent")
    public Object transportStarted(RuntimeEnv env, Object... args) {
        Object evt = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "evt", typeHint = "Swift_Events_TransportChangeEvent")
    public Object beforeTransportStopped(RuntimeEnv env, Object... args) {
        Object evt = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "evt", typeHint = "Swift_Events_TransportChangeEvent")
    public Object transportStopped(RuntimeEnv env, Object... args) {
        Object evt = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    private Object command(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        Object response = null;
        if (!function_fwrite.f.env(env).call(this.socket, command).getBool()) {
            throw ZVal.getException(
                    env,
                    new Swift_Plugins_Pop_Pop3Exception(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Failed to write command [%s] to POP3 host",
                                            function_trim.f.env(env).call(command).value())
                                    .value()));
        }

        if (ZVal.strictEqualityCheck(
                false,
                "===",
                response = NamespaceGlobal.fgets.env(env).call(this.socket).value())) {
            throw ZVal.getException(
                    env,
                    new Swift_Plugins_Pop_Pop3Exception(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Failed to read from POP3 host after command [%s]",
                                            function_trim.f.env(env).call(command).value())
                                    .value()));
        }

        this.assertOk(env, response);
        return ZVal.assign(response);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "response")
    private Object assertOk(RuntimeEnv env, Object... args) {
        Object response = assignParameter(args, 0, false);
        if (ZVal.notEqualityCheck("+OK", function_substr.f.env(env).call(response, 0, 3).value())) {
            throw ZVal.getException(
                    env,
                    new Swift_Plugins_Pop_Pop3Exception(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "POP3 command failed [%s]",
                                            function_trim.f.env(env).call(response).value())
                                    .value()));
        }

        return null;
    }

    @ConvertedMethod
    private Object getHostString(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object host = null;
        host = ZVal.assign(this.host);
        switch (toStringR(NamespaceGlobal.strtolower.env(env).call(this.crypto).value())) {
            case "ssl":
                host = "ssl://" + toStringR(host, env);
                break;
            case "tls":
                host = "tls://" + toStringR(host, env);
                break;
        }
        ;
        return ZVal.assign(host);
    }

    public static final Object CONST_class = "Swift_Plugins_PopBeforeSmtpPlugin";

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
                    .setName("Swift_Plugins_PopBeforeSmtpPlugin")
                    .setLookup(
                            Swift_Plugins_PopBeforeSmtpPlugin.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "connection",
                            "crypto",
                            "host",
                            "password",
                            "port",
                            "socket",
                            "timeout",
                            "transport",
                            "username")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/PopBeforeSmtpPlugin.php")
                    .addInterface("Swift_Events_TransportChangeListener")
                    .addInterface("Swift_Events_EventListener")
                    .addInterface("Swift_Plugins_Pop_Pop3Connection")
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
