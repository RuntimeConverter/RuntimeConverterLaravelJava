package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Server.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_error_handler;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_error_handler;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.date.function_microtime;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Server/Connection.php

*/

public class Connection extends RuntimeClassBase {

    public Object host = null;

    public Object contextProviders = null;

    public Object socket = null;

    public Connection(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Connection.class) {
            this.__construct(env, args);
        }
    }

    public Connection(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "host", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "contextProviders",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object host = assignParameter(args, 0, false);
        Object contextProviders = assignParameter(args, 1, true);
        if (null == contextProviders) {
            contextProviders = ZVal.newArray();
        }
        if (ZVal.strictEqualityCheck(
                false, "===", function_strpos.f.env(env).call(host, "://").value())) {
            host = "tcp://" + toStringR(host, env);
        }

        this.host = host;
        this.contextProviders = contextProviders;
        return null;
    }

    @ConvertedMethod
    public Object getContextProviders(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.contextProviders);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "data",
        typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Data"
    )
    public Object write(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        Object socketIsFresh = null;
        Object encodedPayload = null;
        Object provider = null;
        ReferenceContainer context = new BasicReferenceContainer(null);
        Object name = null;
        Object ternaryExpressionTemp = null;
        socketIsFresh = !ZVal.isTrue(this.socket);
        if (!ZVal.isTrue(
                this.socket =
                        ZVal.isTrue(ternaryExpressionTemp = this.socket)
                                ? ternaryExpressionTemp
                                : this.createSocket(env))) {
            return ZVal.assign(false);
        }

        context.setObject(
                ZVal.newArray(
                        new ZPair("timestamp", function_microtime.f.env(env).call(true).value())));
        for (ZPair zpairResult2230 : ZVal.getIterable(this.contextProviders, env, false)) {
            name = ZVal.assign(zpairResult2230.getKey());
            provider = ZVal.assign(zpairResult2230.getValue());
            context.arrayAccess(env, name)
                    .set(env.callMethod(provider, "getContext", Connection.class));
        }

        context.setObject(function_array_filter.f.env(env).call(context.getObject()).value());
        encodedPayload =
                toStringR(
                                NamespaceGlobal.base64_encode
                                        .env(env)
                                        .call(
                                                function_serialize
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                ZVal.newArray(
                                                                        new ZPair(0, data),
                                                                        new ZPair(
                                                                                1,
                                                                                context
                                                                                        .getObject())))
                                                        .value())
                                        .value(),
                                env)
                        + "\n";
        function_set_error_handler
                .f
                .env(env)
                .call(ZVal.newArray(new ZPair(0, CONST_class), new ZPair(1, "nullErrorHandler")));
        try {
            if (ZVal.strictNotEqualityCheck(
                    -1,
                    "!==",
                    NamespaceGlobal.stream_socket_sendto
                            .env(env)
                            .call(this.socket, encodedPayload)
                            .value())) {
                return ZVal.assign(true);
            }

            if (!ZVal.isTrue(socketIsFresh)) {
                NamespaceGlobal.stream_socket_shutdown.env(env).call(this.socket, 2);
                function_fclose.f.env(env).call(this.socket);
                this.socket = this.createSocket(env);
            }

            if (ZVal.strictNotEqualityCheck(
                    -1,
                    "!==",
                    NamespaceGlobal.stream_socket_sendto
                            .env(env)
                            .call(this.socket, encodedPayload)
                            .value())) {
                return ZVal.assign(true);
            }

        } catch (ConvertedException convertedException327) {

            throw convertedException327;
        } finally {
            function_restore_error_handler.f.env(env).call();
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    private Object createSocket(RuntimeEnv env, Object... args) {
        ReferenceContainer errno = new BasicReferenceContainer(null);
        ReferenceContainer errstr = new BasicReferenceContainer(null);
        Object socket = null;
        function_set_error_handler
                .f
                .env(env)
                .call(ZVal.newArray(new ZPair(0, CONST_class), new ZPair(1, "nullErrorHandler")));
        try {
            return ZVal.assign(
                    NamespaceGlobal.stream_socket_client
                            .env(env)
                            .addReferenceArgs(
                                    new RuntimeArgsWithReferences().add(1, errno).add(2, errstr))
                            .call(
                                    this.host,
                                    errno.getObject(),
                                    errstr.getObject(),
                                    3,
                                    ZVal.toLong(4) | ZVal.toLong(2))
                            .value());
        } catch (ConvertedException convertedException328) {

            throw convertedException328;
        } finally {
            function_restore_error_handler.f.env(env).call();
        }
    }

    public static final Object CONST_class = "Symfony\\Component\\VarDumper\\Server\\Connection";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "t")
        @ConvertedParameter(index = 1, name = "m")
        private Object nullErrorHandler(RuntimeEnv env, Object... args) {
            Object t = assignParameter(args, 0, false);
            Object m = assignParameter(args, 1, false);
            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Server\\Connection")
                    .setLookup(
                            Connection.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("contextProviders", "host", "socket")
                    .setFilename("vendor/symfony/var-dumper/Server/Connection.php")
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
