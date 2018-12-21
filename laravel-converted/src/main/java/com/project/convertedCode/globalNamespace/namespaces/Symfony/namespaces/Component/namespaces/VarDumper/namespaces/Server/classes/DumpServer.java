package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Server.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.arrays.RuntimeIterable;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes.Stub;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes.Data;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Server/DumpServer.php

*/

public class DumpServer extends RuntimeClassBase {

    public Object host = null;

    public Object socket = null;

    public Object logger = null;

    public DumpServer(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DumpServer.class) {
            this.__construct(env, args);
        }
    }

    public DumpServer(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "host", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "logger",
        typeHint = "Psr\\Log\\LoggerInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object host = assignParameter(args, 0, false);
        Object logger = assignParameter(args, 1, true);
        if (null == logger) {
            logger = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(
                false, "===", function_strpos.f.env(env).call(host, "://").value())) {
            host = "tcp://" + toStringR(host, env);
        }

        this.host = host;
        this.logger = logger;
        return null;
    }

    @ConvertedMethod
    public Object start(RuntimeEnv env, Object... args) {
        ReferenceContainer errno = new BasicReferenceContainer(null);
        ReferenceContainer errstr = new BasicReferenceContainer(null);
        if (!ZVal.isTrue(
                this.socket =
                        NamespaceGlobal.stream_socket_server
                                .env(env)
                                .addReferenceArgs(
                                        new RuntimeArgsWithReferences()
                                                .add(1, errno)
                                                .add(2, errstr))
                                .call(this.host, errno.getObject(), errstr.getObject())
                                .value())) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Server start failed on \"%s\": %s %s.",
                                            this.host, errstr.getObject(), errno.getObject())
                                    .value()));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "callable")
    public Object listen(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object callback = assignParameter(args, 0, false);
        ReferenceContainer clientId = new BasicReferenceContainer(null);
        ReferenceContainer data = new BasicReferenceContainer(null);
        Object runtimeTempArrayResult218 = null;
        ReferenceContainer payload = new BasicReferenceContainer(null);
        ReferenceContainer context = new BasicReferenceContainer(null);
        Object message = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.socket)) {
            this.start(env);
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2231 : ZVal.getIterable(this.getMessages(env), env, false)) {
            clientId.setObject(ZVal.assign(zpairResult2231.getKey()));
            message = ZVal.assign(zpairResult2231.getValue());
            payload.setObject(
                    function_unserialize
                            .f
                            .env(env)
                            .call(
                                    NamespaceGlobal.base64_decode.env(env).call(message).value(),
                                    ZVal.newArray(
                                            new ZPair(
                                                    "allowed_classes",
                                                    ZVal.newArray(
                                                            new ZPair(0, Data.CONST_class),
                                                            new ZPair(1, Stub.CONST_class)))))
                            .value());
            if (ZVal.strictEqualityCheck(false, "===", payload.getObject())) {
                if (ZVal.isTrue(this.logger)) {
                    env.callMethod(
                            this.logger,
                            "warning",
                            DumpServer.class,
                            "Unable to decode a message from {clientId} client.",
                            ZVal.newArray(new ZPair("clientId", clientId.getObject())));
                }

                continue;
            }

            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.toBool(
                                                            !function_is_array
                                                                    .f
                                                                    .env(env)
                                                                    .call(payload.getObject())
                                                                    .getBool())
                                                    || ZVal.toBool(
                                                            ZVal.isLessThan(
                                                                    function_count
                                                                            .f
                                                                            .env(env)
                                                                            .call(
                                                                                    payload
                                                                                            .getObject())
                                                                            .value(),
                                                                    '<',
                                                                    2)))
                                    || ZVal.toBool(
                                            !ZVal.isTrue(
                                                    ZVal.checkInstanceType(
                                                            payload.arrayGet(env, 0),
                                                            Data.class,
                                                            "Symfony\\Component\\VarDumper\\Cloner\\Data"))))
                    || ZVal.toBool(
                            !function_is_array
                                    .f
                                    .env(env)
                                    .call(payload.arrayGet(env, 1))
                                    .getBool())) {
                if (ZVal.isTrue(this.logger)) {
                    env.callMethod(
                            this.logger,
                            "warning",
                            DumpServer.class,
                            "Invalid payload from {clientId} client. Expected an array of two elements (Data $data, array $context)",
                            ZVal.newArray(new ZPair("clientId", clientId.getObject())));
                }

                continue;
            }

            ZVal.list(
                    runtimeTempArrayResult218 = payload.getObject(),
                    (data.setObject(listGet(runtimeTempArrayResult218, 0, env))),
                    (context.setObject(listGet(runtimeTempArrayResult218, 1, env))));
            env.callFunctionDynamic(
                    callback,
                    new RuntimeArgsWithReferences().add(0, data).add(1, context).add(2, clientId),
                    data.getObject(),
                    context.getObject(),
                    clientId.getObject());
        }

        return null;
    }

    @ConvertedMethod
    public Object getHost(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.host);
    }

    @ConvertedMethod
    private Object getMessages(RuntimeEnv env, Object... args) {
        RuntimeIterable runtimeConverterYieldVariable = new RuntimeIterable(env);
        ReferenceContainer read = new BasicReferenceContainer(null);
        Object stream = null;
        ReferenceContainer sockets = new BasicReferenceContainer(null);
        ReferenceContainer write = new BasicReferenceContainer(null);
        sockets.setObject(ZVal.newArray(new ZPair(ZVal.toLong(this.socket), this.socket)));
        write.setObject(ZVal.newArray());
        while (ZVal.isTrue(true)) {
            read.setObject(ZVal.assign(sockets.getObject()));
            NamespaceGlobal.stream_select
                    .env(env)
                    .addReferenceArgs(
                            new RuntimeArgsWithReferences()
                                    .add(0, read)
                                    .add(1, write)
                                    .add(2, write))
                    .call(read.getObject(), write.getObject(), write.getObject(), ZVal.getNull());
            for (ZPair zpairResult2232 : ZVal.getIterable(read.getObject(), env, true)) {
                stream = ZVal.assign(zpairResult2232.getValue());
                if (ZVal.strictEqualityCheck(this.socket, "===", stream)) {
                    stream =
                            NamespaceGlobal.stream_socket_accept.env(env).call(this.socket).value();
                    sockets.arrayAccess(env, ZVal.toLong(stream)).set(stream);

                } else if (NamespaceGlobal.feof.env(env).call(stream).getBool()) {
                    arrayActionR(ArrayAction.UNSET, sockets, env, ZVal.toLong(stream));
                    function_fclose.f.env(env).call(stream);

                } else {
                    runtimeConverterYieldVariable.add(
                            ZVal.toLong(stream),
                            NamespaceGlobal.fgets.env(env).call(stream).value());
                }
            }
        }

        return runtimeConverterYieldVariable;
    }

    public static final Object CONST_class = "Symfony\\Component\\VarDumper\\Server\\DumpServer";

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
                    .setName("Symfony\\Component\\VarDumper\\Server\\DumpServer")
                    .setLookup(
                            DumpServer.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("host", "logger", "socket")
                    .setFilename("vendor/symfony/var-dumper/Server/DumpServer.php")
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
