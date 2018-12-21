package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.namespaces.SyslogUdp.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/SyslogUdp/UdpSocket.php

*/

public class UdpSocket extends RuntimeClassBase {

    public Object ip = null;

    public Object port = null;

    public Object socket = null;

    public UdpSocket(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == UdpSocket.class) {
            this.__construct(env, args);
        }
    }

    public UdpSocket(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ip")
    @ConvertedParameter(index = 1, name = "port", defaultValue = "514", defaultValueType = "number")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object ip = assignParameter(args, 0, false);
        Object port = assignParameter(args, 1, true);
        if (null == port) {
            port = 514;
        }
        this.ip = ip;
        this.port = port;
        this.socket = NamespaceGlobal.socket_create.env(env).call(2, 2, 17).value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "line")
    @ConvertedParameter(index = 1, name = "header")
    public Object write(RuntimeEnv env, Object... args) {
        Object line = assignParameter(args, 0, false);
        Object header = assignParameter(args, 1, true);
        if (null == header) {
            header = "";
        }
        this.send(env, this.assembleMessage(env, line, header));
        return null;
    }

    @ConvertedMethod
    public Object close(RuntimeEnv env, Object... args) {
        if (function_is_resource.f.env(env).call(this.socket).getBool()) {
            NamespaceGlobal.socket_close.env(env).call(this.socket);
            this.socket = ZVal.getNull();
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "chunk")
    protected Object send(RuntimeEnv env, Object... args) {
        Object chunk = assignParameter(args, 0, false);
        Object flags = null;
        if (!function_is_resource.f.env(env).call(this.socket).getBool()) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            "The UdpSocket to "
                                    + toStringR(this.ip, env)
                                    + ":"
                                    + toStringR(this.port, env)
                                    + " has been closed and can not be written to anymore"));
        }

        NamespaceGlobal.socket_sendto
                .env(env)
                .call(
                        this.socket,
                        chunk,
                        function_strlen.f.env(env).call(chunk).value(),
                        flags = 0,
                        this.ip,
                        this.port);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "line")
    @ConvertedParameter(index = 1, name = "header")
    protected Object assembleMessage(RuntimeEnv env, Object... args) {
        Object line = assignParameter(args, 0, false);
        Object header = assignParameter(args, 1, false);
        Object chunkSize = null;
        chunkSize =
                ZVal.subtract(
                        CONST_DATAGRAM_MAX_LENGTH, function_strlen.f.env(env).call(header).value());
        return ZVal.assign(
                toStringR(header, env)
                        + toStringR(
                                function_substr.f.env(env).call(line, 0, chunkSize).value(), env));
    }

    public static final Object CONST_DATAGRAM_MAX_LENGTH = 65023;

    public static final Object CONST_class = "Monolog\\Handler\\SyslogUdp\\UdpSocket";

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
                    .setName("Monolog\\Handler\\SyslogUdp\\UdpSocket")
                    .setLookup(
                            UdpSocket.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("ip", "port", "socket")
                    .setFilename(
                            "vendor/monolog/monolog/src/Monolog/Handler/SyslogUdp/UdpSocket.php")
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
