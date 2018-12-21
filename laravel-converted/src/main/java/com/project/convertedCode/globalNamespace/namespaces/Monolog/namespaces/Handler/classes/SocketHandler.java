package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.UnexpectedValueException;
import com.runtimeconverter.runtime.nativeFunctions.math.function_round;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.nativeFunctions.filter.function_filter_var;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractProcessingHandler;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fwrite;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.math.function_floor;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/SocketHandler.php

*/

public class SocketHandler extends AbstractProcessingHandler {

    public Object connectionString = null;

    public Object connectionTimeout = null;

    public Object resource = null;

    public Object timeout = 0;

    public Object writingTimeout = 10;

    public Object lastSentBytes = ZVal.getNull();

    public Object persistent = false;

    public Object errno = null;

    public Object errstr = null;

    public Object lastWritingAt = null;

    public SocketHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SocketHandler.class) {
            this.__construct(env, args);
        }
    }

    public SocketHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connectionString")
    @ConvertedParameter(index = 1, name = "level")
    @ConvertedParameter(
        index = 2,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object connectionString = assignParameter(args, 0, false);
        Object level = assignParameter(args, 1, true);
        if (null == level) {
            level = Logger.CONST_DEBUG;
        }
        Object bubble = assignParameter(args, 2, true);
        if (null == bubble) {
            bubble = true;
        }
        super.__construct(env, level, bubble);
        this.connectionString = connectionString;
        this.connectionTimeout =
                ZVal.toDouble(function_ini_get.f.env(env).call("default_socket_timeout").value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object write(RuntimeEnv env, Object... args) {
        Object record = assignParameter(args, 0, false);
        Object data = null;
        this.connectIfNotConnected(env);
        data = this.generateDataStream(env, record);
        this.writeToSocket(env, data);
        return null;
    }

    @ConvertedMethod
    public Object close(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.isPersistent(env))) {
            this.closeSocket(env);
        }

        return null;
    }

    @ConvertedMethod
    public Object closeSocket(RuntimeEnv env, Object... args) {
        if (function_is_resource.f.env(env).call(this.resource).getBool()) {
            function_fclose.f.env(env).call(this.resource);
            this.resource = ZVal.getNull();
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "persistent")
    public Object setPersistent(RuntimeEnv env, Object... args) {
        Object persistent = assignParameter(args, 0, false);
        this.persistent = ZVal.toBool(persistent);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "seconds")
    public Object setConnectionTimeout(RuntimeEnv env, Object... args) {
        Object seconds = assignParameter(args, 0, false);
        this.validateTimeout(env, seconds);
        this.connectionTimeout = ZVal.toDouble(seconds);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "seconds")
    public Object setTimeout(RuntimeEnv env, Object... args) {
        Object seconds = assignParameter(args, 0, false);
        this.validateTimeout(env, seconds);
        this.timeout = ZVal.toDouble(seconds);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "seconds")
    public Object setWritingTimeout(RuntimeEnv env, Object... args) {
        Object seconds = assignParameter(args, 0, false);
        this.validateTimeout(env, seconds);
        this.writingTimeout = ZVal.toDouble(seconds);
        return null;
    }

    @ConvertedMethod
    public Object getConnectionString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.connectionString);
    }

    @ConvertedMethod
    public Object isPersistent(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.persistent);
    }

    @ConvertedMethod
    public Object getConnectionTimeout(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.connectionTimeout);
    }

    @ConvertedMethod
    public Object getTimeout(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.timeout);
    }

    @ConvertedMethod
    public Object getWritingTimeout(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.writingTimeout);
    }

    @ConvertedMethod
    public Object isConnected(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(function_is_resource.f.env(env).call(this.resource).value())
                        && ZVal.toBool(
                                !NamespaceGlobal.feof.env(env).call(this.resource).getBool()));
    }

    @ConvertedMethod
    protected Object pfsockopen(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                NamespaceGlobal.pfsockopen
                        .env(env)
                        .addReferenceArgs(
                                new RuntimeArgsWithReferences()
                                        .add(2, new ReferenceClassProperty(this, "errno", env))
                                        .add(3, new ReferenceClassProperty(this, "errstr", env)))
                        .call(
                                this.connectionString,
                                -1,
                                this.errno,
                                this.errstr,
                                this.connectionTimeout)
                        .value());
    }

    @ConvertedMethod
    protected Object fsockopen(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                NamespaceGlobal.fsockopen
                        .env(env)
                        .addReferenceArgs(
                                new RuntimeArgsWithReferences()
                                        .add(2, new ReferenceClassProperty(this, "errno", env))
                                        .add(3, new ReferenceClassProperty(this, "errstr", env)))
                        .call(
                                this.connectionString,
                                -1,
                                this.errno,
                                this.errstr,
                                this.connectionTimeout)
                        .value());
    }

    @ConvertedMethod
    protected Object streamSetTimeout(RuntimeEnv env, Object... args) {
        Object seconds = null;
        Object microseconds = null;
        seconds = function_floor.f.env(env).call(this.timeout).value();
        microseconds =
                function_round
                        .f
                        .env(env)
                        .call(ZVal.multiply(ZVal.subtract(this.timeout, seconds), 1000000.0))
                        .value();
        return ZVal.assign(
                NamespaceGlobal.stream_set_timeout
                        .env(env)
                        .call(this.resource, seconds, microseconds)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    protected Object fwrite(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        return ZVal.assign(function_fwrite.f.env(env).call(this.resource, data).value());
    }

    @ConvertedMethod
    protected Object streamGetMetadata(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                NamespaceGlobal.stream_get_meta_data.env(env).call(this.resource).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    private Object validateTimeout(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object ok = null;
        ok = function_filter_var.f.env(env).call(value, 259).value();
        if (ZVal.toBool(ZVal.strictEqualityCheck(ok, "===", false))
                || ZVal.toBool(ZVal.isLessThan(value, '<', 0))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Timeout must be 0 or a positive float (got "
                                    + toStringR(value, env)
                                    + ")"));
        }

        return null;
    }

    @ConvertedMethod
    private Object connectIfNotConnected(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.isConnected(env))) {
            return null;
        }

        this.connect(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record")
    protected Object generateDataStream(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(toStringR(record.arrayGet(env, "formatted"), env));
    }

    @ConvertedMethod
    protected Object getResource(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.resource);
    }

    @ConvertedMethod
    private Object connect(RuntimeEnv env, Object... args) {
        this.createSocketResource(env);
        this.setSocketTimeout(env);
        return null;
    }

    @ConvertedMethod
    private Object createSocketResource(RuntimeEnv env, Object... args) {
        Object resource = null;
        if (ZVal.isTrue(this.isPersistent(env))) {
            resource = this.pfsockopen(env);

        } else {
            resource = this.fsockopen(env);
        }

        if (!ZVal.isTrue(resource)) {
            throw ZVal.getException(
                    env,
                    new UnexpectedValueException(
                            env,
                            "Failed connecting to "
                                    + toStringR(this.connectionString, env)
                                    + " ("
                                    + toStringR(this.errno, env)
                                    + ": "
                                    + toStringR(this.errstr, env)
                                    + ")"));
        }

        this.resource = resource;
        return null;
    }

    @ConvertedMethod
    private Object setSocketTimeout(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.streamSetTimeout(env))) {
            throw ZVal.getException(
                    env,
                    new UnexpectedValueException(
                            env, "Failed setting timeout with stream_set_timeout()"));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    private Object writeToSocket(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        Object length = null;
        Object chunk = null;
        ReferenceContainer socketInfo = new BasicReferenceContainer(null);
        Object sent = null;
        length = function_strlen.f.env(env).call(data).value();
        sent = 0;
        this.lastSentBytes = sent;
        while (ZVal.toBool(this.isConnected(env))
                && ZVal.toBool(ZVal.isLessThan(sent, '<', length))) {
            if (ZVal.equalityCheck(0, sent)) {
                chunk = this.fwrite(env, data);

            } else {
                chunk = this.fwrite(env, function_substr.f.env(env).call(data, sent).value());
            }

            if (ZVal.strictEqualityCheck(chunk, "===", false)) {
                throw ZVal.getException(
                        env, new RuntimeException(env, "Could not write to socket"));
            }

            sent = ZAssignment.add("+=", sent, chunk);
            socketInfo.setObject(this.streamGetMetadata(env));
            if (ZVal.isTrue(socketInfo.arrayGet(env, "timed_out"))) {
                throw ZVal.getException(env, new RuntimeException(env, "Write timed-out"));
            }

            if (ZVal.isTrue(this.writingIsTimedOut(env, sent))) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                "Write timed-out, no data sent for `"
                                        + toStringR(this.writingTimeout, env)
                                        + "` seconds, probably we got disconnected (sent "
                                        + toStringR(sent, env)
                                        + " of "
                                        + toStringR(length, env)
                                        + ")"));
            }
        }

        if (ZVal.toBool(!ZVal.isTrue(this.isConnected(env)))
                && ZVal.toBool(ZVal.isLessThan(sent, '<', length))) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            "End-of-file reached, probably we got disconnected (sent "
                                    + toStringR(sent, env)
                                    + " of "
                                    + toStringR(length, env)
                                    + ")"));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sent")
    private Object writingIsTimedOut(RuntimeEnv env, Object... args) {
        Object sent = assignParameter(args, 0, false);
        Object writingTimeout = null;
        writingTimeout =
                ZVal.assign(
                        ZVal.toLong(function_floor.f.env(env).call(this.writingTimeout).value()));
        if (ZVal.strictEqualityCheck(0, "===", writingTimeout)) {
            return ZVal.assign(false);
        }

        if (ZVal.strictNotEqualityCheck(sent, "!==", this.lastSentBytes)) {
            this.lastWritingAt = NamespaceGlobal.time.env(env).call().value();
            this.lastSentBytes = sent;
            return ZVal.assign(false);

        } else {
            NamespaceGlobal.usleep.env(env).call(100);
        }

        if (ZVal.isGreaterThanOrEqualTo(
                ZVal.subtract(NamespaceGlobal.time.env(env).call().value(), this.lastWritingAt),
                ">=",
                writingTimeout)) {
            this.closeSocket(env);
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
    }

    public static final Object CONST_class = "Monolog\\Handler\\SocketHandler";

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
                    .setName("Monolog\\Handler\\SocketHandler")
                    .setLookup(
                            SocketHandler.class,
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
                            "writingTimeout")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/SocketHandler.php")
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
