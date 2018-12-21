package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractSyslogHandler;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/SyslogHandler.php

*/

public class SyslogHandler extends AbstractSyslogHandler {

    public Object ident = null;

    public Object logopts = null;

    public SyslogHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SyslogHandler.class) {
            this.__construct(env, args);
        }
    }

    public SyslogHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ident")
    @ConvertedParameter(index = 1, name = "facility")
    @ConvertedParameter(index = 2, name = "level")
    @ConvertedParameter(
        index = 3,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 4, name = "logopts")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object ident = assignParameter(args, 0, false);
        Object facility = assignParameter(args, 1, true);
        if (null == facility) {
            facility = 8;
        }
        Object level = assignParameter(args, 2, true);
        if (null == level) {
            level = Logger.CONST_DEBUG;
        }
        Object bubble = assignParameter(args, 3, true);
        if (null == bubble) {
            bubble = true;
        }
        Object logopts = assignParameter(args, 4, true);
        if (null == logopts) {
            logopts = 1;
        }
        super.__construct(env, facility, level, bubble);
        this.ident = ident;
        this.logopts = logopts;
        return null;
    }

    @ConvertedMethod
    public Object close(RuntimeEnv env, Object... args) {
        NamespaceGlobal.closelog.env(env).call();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object write(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (!NamespaceGlobal.openlog
                .env(env)
                .call(
                        this.ident,
                        this.logopts,
                        toObjectR(this).accessProp(this, env).name("facility").value())
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            "Can't open syslog for ident \""
                                    + toStringR(this.ident, env)
                                    + "\" and facility \""
                                    + toStringR(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("facility")
                                                    .value(),
                                            env)
                                    + "\""));
        }

        NamespaceGlobal.syslog
                .env(env)
                .call(
                        new ReferenceClassProperty(this, "logLevels", env)
                                .arrayGet(env, record.arrayGet(env, "level")),
                        toStringR(record.arrayGet(env, "formatted"), env));
        return null;
    }

    public static final Object CONST_class = "Monolog\\Handler\\SyslogHandler";

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
                    .setName("Monolog\\Handler\\SyslogHandler")
                    .setLookup(
                            SyslogHandler.class,
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
                            "logopts",
                            "processors")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/SyslogHandler.php")
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
