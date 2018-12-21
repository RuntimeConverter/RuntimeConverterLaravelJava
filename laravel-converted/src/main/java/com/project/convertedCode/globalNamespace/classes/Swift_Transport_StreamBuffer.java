package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Swift_TransportException;
import com.project.convertedCode.globalNamespace.classes.Swift_IoException;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fread;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.classes.Swift_ByteStream_AbstractFilterableInputStream;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Swift_Transport_IoBuffer;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fwrite;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/StreamBuffer.php

*/

public class Swift_Transport_StreamBuffer extends Swift_ByteStream_AbstractFilterableInputStream
        implements Swift_Transport_IoBuffer {

    public Object stream = null;

    public Object in = null;

    public Object out = null;

    public Object params = ZVal.newArray();

    public Object replacementFactory = null;

    public Object translations = ZVal.newArray();

    public Swift_Transport_StreamBuffer(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Transport_StreamBuffer.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Transport_StreamBuffer(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "replacementFactory",
        typeHint = "Swift_ReplacementFilterFactory"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object replacementFactory = assignParameter(args, 0, false);
        this.replacementFactory = replacementFactory;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "params", typeHint = "array")
    public Object initialize(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer params = new BasicReferenceContainer(assignParameter(args, 0, false));
        this.params = params.getObject();
        SwitchEnumType106 switchVariable106 =
                ZVal.getEnum(
                        params.arrayGet(env, "type"),
                        SwitchEnumType106.DEFAULT_CASE,
                        SwitchEnumType106.DYNAMIC_TYPE_352,
                        CONST_TYPE_PROCESS,
                        SwitchEnumType106.DYNAMIC_TYPE_353,
                        CONST_TYPE_SOCKET);
        switch (switchVariable106) {
            case DYNAMIC_TYPE_352:
                this.establishProcessConnection(env);
                break;
            case DYNAMIC_TYPE_353:
            case DEFAULT_CASE:
                this.establishSocketConnection(env);
                break;
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "param")
    @ConvertedParameter(index = 1, name = "value")
    public Object setParam(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object param = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        if (ZVal.isset(this.stream)) {
            switch (toStringR(param)) {
                case "timeout":
                    if (ZVal.isTrue(this.stream)) {
                        NamespaceGlobal.stream_set_timeout.env(env).call(this.stream, value);
                    }

                    break;
                case "blocking":
                    if (ZVal.isTrue(this.stream)) {
                        NamespaceGlobal.stream_set_blocking.env(env).call(this.stream, 1);
                    }
            }
            ;
        }

        new ReferenceClassProperty(this, "params", env).arrayAccess(env, param).set(value);
        return null;
    }

    @ConvertedMethod
    public Object startTLS(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                NamespaceGlobal.stream_socket_enable_crypto
                        .env(env)
                        .call(
                                this.stream,
                                true,
                                ZVal.toLong(ZVal.toLong(9) | ZVal.toLong(17)) | ZVal.toLong(33))
                        .value());
    }

    @ConvertedMethod
    public Object terminate(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        if (ZVal.isset(this.stream)) {
            SwitchEnumType107 switchVariable107 =
                    ZVal.getEnum(
                            new ReferenceClassProperty(this, "params", env).arrayGet(env, "type"),
                            SwitchEnumType107.DEFAULT_CASE,
                            SwitchEnumType107.DYNAMIC_TYPE_354,
                            CONST_TYPE_PROCESS,
                            SwitchEnumType107.DYNAMIC_TYPE_355,
                            CONST_TYPE_SOCKET);
            switch (switchVariable107) {
                case DYNAMIC_TYPE_354:
                    function_fclose.f.env(env).call(this.in);
                    function_fclose.f.env(env).call(this.out);
                    NamespaceGlobal.proc_close.env(env).call(this.stream);
                    break;
                case DYNAMIC_TYPE_355:
                case DEFAULT_CASE:
                    function_fclose.f.env(env).call(this.stream);
                    break;
            }
            ;
        }

        this.stream = ZVal.getNull();
        this.out = ZVal.getNull();
        this.in = ZVal.getNull();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "replacements", typeHint = "array")
    public Object setWriteTranslations(RuntimeEnv env, Object... args) {
        ReferenceContainer replacements =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        Object search = null;
        Object replace = null;
        for (ZPair zpairResult1618 : ZVal.getIterable(this.translations, env, false)) {
            search = ZVal.assign(zpairResult1618.getKey());
            replace = ZVal.assign(zpairResult1618.getValue());
            if (!arrayActionR(ArrayAction.ISSET, replacements, env, search)) {
                env.callMethod(this, "removeFilter", Swift_Transport_StreamBuffer.class, search);
                arrayActionR(
                        ArrayAction.UNSET,
                        new ReferenceClassProperty(this, "translations", env),
                        env,
                        search);
            }
        }

        for (ZPair zpairResult1619 : ZVal.getIterable(replacements.getObject(), env, false)) {
            search = ZVal.assign(zpairResult1619.getKey());
            replace = ZVal.assign(zpairResult1619.getValue());
            if (!arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "translations", env),
                    env,
                    search)) {
                env.callMethod(
                        this,
                        "addFilter",
                        Swift_Transport_StreamBuffer.class,
                        env.callMethod(
                                this.replacementFactory,
                                "createFilter",
                                Swift_Transport_StreamBuffer.class,
                                search,
                                replace),
                        search);
                new ReferenceClassProperty(this, "translations", env)
                        .arrayAccess(env, search)
                        .set(true);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sequence")
    public Object readLine(RuntimeEnv env, Object... args) {
        Object sequence = assignParameter(args, 0, false);
        ReferenceContainer metas = new BasicReferenceContainer(null);
        Object line = null;
        if (ZVal.toBool(ZVal.isset(this.out))
                && ZVal.toBool(!NamespaceGlobal.feof.env(env).call(this.out).getBool())) {
            line = NamespaceGlobal.fgets.env(env).call(this.out).value();
            if (ZVal.equalityCheck(0, function_strlen.f.env(env).call(line).value())) {
                metas.setObject(
                        NamespaceGlobal.stream_get_meta_data.env(env).call(this.out).value());
                if (ZVal.isTrue(metas.arrayGet(env, "timed_out"))) {
                    throw ZVal.getException(
                            env,
                            new Swift_IoException(
                                    env,
                                    "Connection to "
                                            + toStringR(this.getReadConnectionDescription(env), env)
                                            + " Timed Out"));
                }
            }

            return ZVal.assign(line);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "length")
    public Object read(RuntimeEnv env, Object... args) {
        Object length = assignParameter(args, 0, false);
        Object ret = null;
        ReferenceContainer metas = new BasicReferenceContainer(null);
        if (ZVal.toBool(ZVal.isset(this.out))
                && ZVal.toBool(!NamespaceGlobal.feof.env(env).call(this.out).getBool())) {
            ret = function_fread.f.env(env).call(this.out, length).value();
            if (ZVal.equalityCheck(0, function_strlen.f.env(env).call(ret).value())) {
                metas.setObject(
                        NamespaceGlobal.stream_get_meta_data.env(env).call(this.out).value());
                if (ZVal.isTrue(metas.arrayGet(env, "timed_out"))) {
                    throw ZVal.getException(
                            env,
                            new Swift_IoException(
                                    env,
                                    "Connection to "
                                            + toStringR(this.getReadConnectionDescription(env), env)
                                            + " Timed Out"));
                }
            }

            return ZVal.assign(ret);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "byteOffset")
    public Object setReadPointer(RuntimeEnv env, Object... args) {
        Object byteOffset = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    protected Object flush(RuntimeEnv env, Object... args) {
        if (ZVal.isset(this.in)) {
            NamespaceGlobal.fflush.env(env).call(this.in);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bytes")
    protected Object doCommit(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object bytes = assignParameter(args, 0, false);
        Object bytesWritten = null;
        Object bytesToWrite = null;
        Object totalBytesWritten = null;
        if (ZVal.isset(this.in)) {
            bytesToWrite = function_strlen.f.env(env).call(bytes).value();
            totalBytesWritten = 0;
            runtimeConverterBreakCount = 0;
            while (ZVal.isLessThan(totalBytesWritten, '<', bytesToWrite)) {
                bytesWritten =
                        function_fwrite
                                .f
                                .env(env)
                                .call(
                                        this.in,
                                        function_substr
                                                .f
                                                .env(env)
                                                .call(bytes, totalBytesWritten)
                                                .value())
                                .value();
                if (ZVal.toBool(ZVal.strictEqualityCheck(false, "===", bytesWritten))
                        || ZVal.toBool(ZVal.strictEqualityCheck(0, "===", bytesWritten))) {
                    break;
                }

                totalBytesWritten = ZAssignment.add("+=", totalBytesWritten, bytesWritten);
            }

            if (ZVal.isGreaterThan(totalBytesWritten, '>', 0)) {
                return ZVal.assign(
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("sequence")
                                .set(
                                        ZVal.increment(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("sequence")
                                                        .value())));
            }
        }

        return null;
    }

    @ConvertedMethod
    private Object establishSocketConnection(RuntimeEnv env, Object... args) {
        ReferenceContainer errno = new BasicReferenceContainer(null);
        Object streamContext = null;
        Object host = null;
        ReferenceContainer options = new BasicReferenceContainer(null);
        ReferenceContainer errstr = new BasicReferenceContainer(null);
        Object timeout = null;
        host = ZVal.assign(new ReferenceClassProperty(this, "params", env).arrayGet(env, "host"));
        if (!arrayActionR(
                ArrayAction.EMPTY,
                new ReferenceClassProperty(this, "params", env),
                env,
                "protocol")) {
            host =
                    toStringR(
                                    new ReferenceClassProperty(this, "params", env)
                                            .arrayGet(env, "protocol"),
                                    env)
                            + "://"
                            + toStringR(host, env);
        }

        timeout = 15;
        if (!arrayActionR(
                ArrayAction.EMPTY,
                new ReferenceClassProperty(this, "params", env),
                env,
                "timeout")) {
            timeout =
                    ZVal.assign(
                            new ReferenceClassProperty(this, "params", env)
                                    .arrayGet(env, "timeout"));
        }

        options.setObject(ZVal.newArray());
        if (!arrayActionR(
                ArrayAction.EMPTY,
                new ReferenceClassProperty(this, "params", env),
                env,
                "sourceIp")) {
            options.arrayAccess(env, "socket", "bindto")
                    .set(
                            toStringR(
                                            new ReferenceClassProperty(this, "params", env)
                                                    .arrayGet(env, "sourceIp"),
                                            env)
                                    + ":0");
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "params", env),
                env,
                "stream_context_options")) {
            options.setObject(
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    options.getObject(),
                                    new ReferenceClassProperty(this, "params", env)
                                            .arrayGet(env, "stream_context_options"))
                            .value());
        }

        streamContext =
                NamespaceGlobal.stream_context_create.env(env).call(options.getObject()).value();
        this.stream =
                NamespaceGlobal.stream_socket_client
                        .env(env)
                        .addReferenceArgs(
                                new RuntimeArgsWithReferences().add(1, errno).add(2, errstr))
                        .call(
                                toStringR(host, env)
                                        + ":"
                                        + toStringR(
                                                new ReferenceClassProperty(this, "params", env)
                                                        .arrayGet(env, "port"),
                                                env),
                                errno.getObject(),
                                errstr.getObject(),
                                timeout,
                                4,
                                streamContext)
                        .value();
        if (ZVal.strictEqualityCheck(false, "===", this.stream)) {
            throw ZVal.getException(
                    env,
                    new Swift_TransportException(
                            env,
                            "Connection could not be established with host "
                                    + toStringR(
                                            new ReferenceClassProperty(this, "params", env)
                                                    .arrayGet(env, "host"),
                                            env)
                                    + " ["
                                    + toStringR(errstr.getObject(), env)
                                    + " #"
                                    + toStringR(errno.getObject(), env)
                                    + "]"));
        }

        if (!arrayActionR(
                ArrayAction.EMPTY,
                new ReferenceClassProperty(this, "params", env),
                env,
                "blocking")) {
            NamespaceGlobal.stream_set_blocking.env(env).call(this.stream, 1);

        } else {
            NamespaceGlobal.stream_set_blocking.env(env).call(this.stream, 0);
        }

        NamespaceGlobal.stream_set_timeout.env(env).call(this.stream, timeout);
        this.in = this.stream;
        this.out = this.stream;
        return null;
    }

    @ConvertedMethod
    private Object establishProcessConnection(RuntimeEnv env, Object... args) {
        Object err = null;
        Object descriptorSpec = null;
        Object command = null;
        ReferenceContainer pipes = new BasicReferenceContainer(null);
        command =
                ZVal.assign(
                        new ReferenceClassProperty(this, "params", env).arrayGet(env, "command"));
        descriptorSpec =
                ZVal.newArray(
                        new ZPair(0, ZVal.arrayFromList("pipe", "r")),
                        new ZPair(1, ZVal.arrayFromList("pipe", "w")),
                        new ZPair(2, ZVal.arrayFromList("pipe", "w")));
        pipes.setObject(ZVal.newArray());
        this.stream =
                NamespaceGlobal.proc_open
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(2, pipes))
                        .call(command, descriptorSpec, pipes.getObject())
                        .value();
        NamespaceGlobal.stream_set_blocking.env(env).call(pipes.arrayGet(env, 2), 0);
        if (ZVal.isTrue(
                err =
                        NamespaceGlobal.stream_get_contents
                                .env(env)
                                .call(pipes.arrayGet(env, 2))
                                .value())) {
            throw ZVal.getException(
                    env,
                    new Swift_TransportException(
                            env, "Process could not be started [" + toStringR(err, env) + "]"));
        }

        this.in = pipes.arrayGet(env, 0);
        this.out = pipes.arrayGet(env, 1);
        return null;
    }

    @ConvertedMethod
    private Object getReadConnectionDescription(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object host = null;
        SwitchEnumType108 switchVariable108 =
                ZVal.getEnum(
                        new ReferenceClassProperty(this, "params", env).arrayGet(env, "type"),
                        SwitchEnumType108.DEFAULT_CASE,
                        SwitchEnumType108.DYNAMIC_TYPE_356,
                        CONST_TYPE_PROCESS,
                        SwitchEnumType108.DYNAMIC_TYPE_357,
                        CONST_TYPE_SOCKET);
        switch (switchVariable108) {
            case DYNAMIC_TYPE_356:
                return ZVal.assign(
                        "Process "
                                + toStringR(
                                        new ReferenceClassProperty(this, "params", env)
                                                .arrayGet(env, "command"),
                                        env));
            case DYNAMIC_TYPE_357:
            case DEFAULT_CASE:
                host =
                        ZVal.assign(
                                new ReferenceClassProperty(this, "params", env)
                                        .arrayGet(env, "host"));
                if (!arrayActionR(
                        ArrayAction.EMPTY,
                        new ReferenceClassProperty(this, "params", env),
                        env,
                        "protocol")) {
                    host =
                            toStringR(
                                            new ReferenceClassProperty(this, "params", env)
                                                    .arrayGet(env, "protocol"),
                                            env)
                                    + "://"
                                    + toStringR(host, env);
                }

                host =
                        toStringR(host, env)
                                + ":"
                                + toStringR(
                                        new ReferenceClassProperty(this, "params", env)
                                                .arrayGet(env, "port"),
                                        env);
                return ZVal.assign(host);
        }
        ;
        return null;
    }

    public static final Object CONST_class = "Swift_Transport_StreamBuffer";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends Swift_ByteStream_AbstractFilterableInputStream.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Transport_StreamBuffer")
                    .setLookup(
                            Swift_Transport_StreamBuffer.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "filters",
                            "in",
                            "mirrors",
                            "out",
                            "params",
                            "replacementFactory",
                            "sequence",
                            "stream",
                            "translations",
                            "writeBuffer")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/StreamBuffer.php")
                    .addInterface("Swift_Transport_IoBuffer")
                    .addInterface("Swift_InputByteStream")
                    .addInterface("Swift_OutputByteStream")
                    .addInterface("Swift_Filterable")
                    .addExtendsClass("Swift_ByteStream_AbstractFilterableInputStream")
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

    private enum SwitchEnumType106 {
        DYNAMIC_TYPE_352,
        DYNAMIC_TYPE_353,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType107 {
        DYNAMIC_TYPE_354,
        DYNAMIC_TYPE_355,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType108 {
        DYNAMIC_TYPE_356,
        DYNAMIC_TYPE_357,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
