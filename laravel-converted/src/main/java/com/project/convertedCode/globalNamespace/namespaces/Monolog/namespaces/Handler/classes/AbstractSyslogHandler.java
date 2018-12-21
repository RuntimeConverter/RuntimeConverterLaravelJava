package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.UnexpectedValueException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractProcessingHandler;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.LineFormatter;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/AbstractSyslogHandler.php

*/

public abstract class AbstractSyslogHandler extends AbstractProcessingHandler {

    public Object facility = null;

    public Object logLevels =
            ZVal.newArray(
                    new ZPair(Logger.CONST_DEBUG, 7),
                    new ZPair(Logger.CONST_INFO, 6),
                    new ZPair(Logger.CONST_NOTICE, 5),
                    new ZPair(Logger.CONST_WARNING, 4),
                    new ZPair(Logger.CONST_ERROR, 3),
                    new ZPair(Logger.CONST_CRITICAL, 2),
                    new ZPair(Logger.CONST_ALERT, 1),
                    new ZPair(Logger.CONST_EMERGENCY, 0));

    public Object facilities =
            ZVal.newArray(
                    new ZPair("auth", 32),
                    new ZPair("authpriv", 80),
                    new ZPair("cron", 72),
                    new ZPair("daemon", 24),
                    new ZPair("kern", 0),
                    new ZPair("lpr", 48),
                    new ZPair("mail", 16),
                    new ZPair("news", 56),
                    new ZPair("syslog", 40),
                    new ZPair("user", 8),
                    new ZPair("uucp", 64));

    public AbstractSyslogHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AbstractSyslogHandler.class) {
            this.__construct(env, args);
        }
    }

    public AbstractSyslogHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "facility")
    @ConvertedParameter(index = 1, name = "level")
    @ConvertedParameter(
        index = 2,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object facility = assignParameter(args, 0, true);
        if (null == facility) {
            facility = 8;
        }
        Object level = assignParameter(args, 1, true);
        if (null == level) {
            level = Logger.CONST_DEBUG;
        }
        Object bubble = assignParameter(args, 2, true);
        if (null == bubble) {
            bubble = true;
        }
        super.__construct(env, level, bubble);
        if (!function_defined.f.env(env).call("PHP_WINDOWS_VERSION_BUILD").getBool()) {
            new ReferenceClassProperty(this, "facilities", env).arrayAccess(env, "local0").set(128);
            new ReferenceClassProperty(this, "facilities", env).arrayAccess(env, "local1").set(136);
            new ReferenceClassProperty(this, "facilities", env).arrayAccess(env, "local2").set(144);
            new ReferenceClassProperty(this, "facilities", env).arrayAccess(env, "local3").set(152);
            new ReferenceClassProperty(this, "facilities", env).arrayAccess(env, "local4").set(160);
            new ReferenceClassProperty(this, "facilities", env).arrayAccess(env, "local5").set(168);
            new ReferenceClassProperty(this, "facilities", env).arrayAccess(env, "local6").set(176);
            new ReferenceClassProperty(this, "facilities", env).arrayAccess(env, "local7").set(184);

        } else {
            new ReferenceClassProperty(this, "facilities", env).arrayAccess(env, "local0").set(128);
            new ReferenceClassProperty(this, "facilities", env).arrayAccess(env, "local1").set(136);
            new ReferenceClassProperty(this, "facilities", env).arrayAccess(env, "local2").set(144);
            new ReferenceClassProperty(this, "facilities", env).arrayAccess(env, "local3").set(152);
            new ReferenceClassProperty(this, "facilities", env).arrayAccess(env, "local4").set(160);
            new ReferenceClassProperty(this, "facilities", env).arrayAccess(env, "local5").set(168);
            new ReferenceClassProperty(this, "facilities", env).arrayAccess(env, "local6").set(176);
            new ReferenceClassProperty(this, "facilities", env).arrayAccess(env, "local7").set(184);
        }

        if (function_array_key_exists
                .f
                .env(env)
                .call(NamespaceGlobal.strtolower.env(env).call(facility).value(), this.facilities)
                .getBool()) {
            facility =
                    ZVal.assign(
                            new ReferenceClassProperty(this, "facilities", env)
                                    .arrayGet(
                                            env,
                                            NamespaceGlobal.strtolower
                                                    .env(env)
                                                    .call(facility)
                                                    .value()));

        } else if (!function_in_array
                .f
                .env(env)
                .call(
                        facility,
                        function_array_values.f.env(env).call(this.facilities).value(),
                        true)
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new UnexpectedValueException(
                            env,
                            "Unknown facility value \"" + toStringR(facility, env) + "\" given"));
        }

        this.facility = facility;
        return null;
    }

    @ConvertedMethod
    protected Object getDefaultFormatter(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new LineFormatter(env, "%channel%.%level_name%: %message% %context% %extra%"));
    }

    public static final Object CONST_class = "Monolog\\Handler\\AbstractSyslogHandler";

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
                    .setName("Monolog\\Handler\\AbstractSyslogHandler")
                    .setLookup(
                            AbstractSyslogHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bubble",
                            "facilities",
                            "facility",
                            "formatter",
                            "level",
                            "logLevels",
                            "processors")
                    .setFilename(
                            "vendor/monolog/monolog/src/Monolog/Handler/AbstractSyslogHandler.php")
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
