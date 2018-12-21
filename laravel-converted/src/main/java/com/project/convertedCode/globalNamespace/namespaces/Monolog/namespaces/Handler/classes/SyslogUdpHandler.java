package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.namespaces.SyslogUdp.classes.UdpSocket;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractSyslogHandler;
import com.runtimeconverter.runtime.nativeFunctions.date.function_date;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/SyslogUdpHandler.php

*/

public class SyslogUdpHandler extends AbstractSyslogHandler {

    public Object socket = null;

    public Object ident = null;

    public SyslogUdpHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SyslogUdpHandler.class) {
            this.__construct(env, args);
        }
    }

    public SyslogUdpHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "host")
    @ConvertedParameter(index = 1, name = "port", defaultValue = "514", defaultValueType = "number")
    @ConvertedParameter(index = 2, name = "facility")
    @ConvertedParameter(index = 3, name = "level")
    @ConvertedParameter(
        index = 4,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 5, name = "ident")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object host = assignParameter(args, 0, false);
        Object port = assignParameter(args, 1, true);
        if (null == port) {
            port = 514;
        }
        Object facility = assignParameter(args, 2, true);
        if (null == facility) {
            facility = 8;
        }
        Object level = assignParameter(args, 3, true);
        if (null == level) {
            level = Logger.CONST_DEBUG;
        }
        Object bubble = assignParameter(args, 4, true);
        if (null == bubble) {
            bubble = true;
        }
        Object ident = assignParameter(args, 5, true);
        if (null == ident) {
            ident = "php";
        }
        Object ternaryExpressionTemp = null;
        super.__construct(env, facility, level, bubble);
        this.ident = ident;
        this.socket =
                new UdpSocket(
                        env,
                        host,
                        ZVal.isTrue(ternaryExpressionTemp = port) ? ternaryExpressionTemp : 514);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object write(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object line = null;
        Object header = null;
        Object lines = null;
        lines = this.splitMessageIntoLines(env, record.arrayGet(env, "formatted"));
        header =
                this.makeCommonSyslogHeader(
                        env,
                        new ReferenceClassProperty(this, "logLevels", env)
                                .arrayGet(env, record.arrayGet(env, "level")));
        for (ZPair zpairResult808 : ZVal.getIterable(lines, env, true)) {
            line = ZVal.assign(zpairResult808.getValue());
            env.callMethod(this.socket, "write", SyslogUdpHandler.class, line, header);
        }

        return null;
    }

    @ConvertedMethod
    public Object close(RuntimeEnv env, Object... args) {
        env.callMethod(this.socket, "close", SyslogUdpHandler.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    private Object splitMessageIntoLines(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        if (function_is_array.f.env(env).call(message).getBool()) {
            message = NamespaceGlobal.implode.env(env).call("\n", message).value();
        }

        return ZVal.assign(
                NamespaceGlobal.preg_split.env(env).call("/$\\R?^/m", message, -1, 1).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "severity")
    protected Object makeCommonSyslogHeader(RuntimeEnv env, Object... args) {
        Object severity = assignParameter(args, 0, false);
        Object hostname = null;
        Object pid = null;
        Object priority = null;
        priority =
                ZVal.add(severity, toObjectR(this).accessProp(this, env).name("facility").value());
        if (!ZVal.isTrue(pid = NamespaceGlobal.getmypid.env(env).call().value())) {
            pid = "-";
        }

        if (!ZVal.isTrue(hostname = NamespaceGlobal.gethostname.env(env).call().value())) {
            hostname = "-";
        }

        return ZVal.assign(
                toStringR("<" + toStringR(priority, env) + ">1 ", env)
                        + toStringR(this.getDateTime(env), env)
                        + " "
                        + toStringR(hostname, env)
                        + " "
                        + toStringR(this.ident, env)
                        + " "
                        + toStringR(pid, env)
                        + " - - ");
    }

    @ConvertedMethod
    protected Object getDateTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_date.f.env(env).call("Y-m-d\\TH:i:sP").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "socket")
    public Object setSocket(RuntimeEnv env, Object... args) {
        Object socket = assignParameter(args, 0, false);
        this.socket = socket;
        return null;
    }

    public static final Object CONST_class = "Monolog\\Handler\\SyslogUdpHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends AbstractSyslogHandler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Handler\\SyslogUdpHandler")
                    .setLookup(
                            SyslogUdpHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bubble",
                            "facilities",
                            "facility",
                            "formatter",
                            "ident",
                            "level",
                            "logLevels",
                            "processors",
                            "socket")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/SyslogUdpHandler.php")
                    .addInterface("Monolog\\Handler\\HandlerInterface")
                    .addExtendsClass("Monolog\\Handler\\AbstractSyslogHandler")
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
