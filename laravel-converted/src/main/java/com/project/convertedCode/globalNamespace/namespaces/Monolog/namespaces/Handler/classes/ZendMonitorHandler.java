package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.MissingExtensionException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.NormalizerFormatter;
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
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/ZendMonitorHandler.php

*/

public class ZendMonitorHandler extends AbstractProcessingHandler {

    public Object levelMap =
            ZVal.newArray(
                    new ZPair(Logger.CONST_DEBUG, 1),
                    new ZPair(Logger.CONST_INFO, 2),
                    new ZPair(Logger.CONST_NOTICE, 3),
                    new ZPair(Logger.CONST_WARNING, 4),
                    new ZPair(Logger.CONST_ERROR, 5),
                    new ZPair(Logger.CONST_CRITICAL, 6),
                    new ZPair(Logger.CONST_ALERT, 7),
                    new ZPair(Logger.CONST_EMERGENCY, 0));

    public ZendMonitorHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ZendMonitorHandler.class) {
            this.__construct(env, args);
        }
    }

    public ZendMonitorHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    @ConvertedParameter(
        index = 1,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, true);
        if (null == level) {
            level = Logger.CONST_DEBUG;
        }
        Object bubble = assignParameter(args, 1, true);
        if (null == bubble) {
            bubble = true;
        }
        if (!function_function_exists.f.env(env).call("zend_monitor_custom_event").getBool()) {
            throw ZVal.getException(
                    env,
                    new MissingExtensionException(
                            env,
                            "You must have Zend Server installed in order to use this handler"));
        }

        super.__construct(env, level, bubble);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object write(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        this.writeZendMonitorCustomEvent(
                env,
                new ReferenceClassProperty(this, "levelMap", env)
                        .arrayGet(env, record.arrayGet(env, "level")),
                record.arrayGet(env, "message"),
                record.arrayGet(env, "formatted"));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    @ConvertedParameter(index = 1, name = "message")
    @ConvertedParameter(index = 2, name = "formatted")
    protected Object writeZendMonitorCustomEvent(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, false);
        Object formatted = assignParameter(args, 2, false);
        com.runtimeconverter.runtime.ZVal.functionNotFound("zend_monitor_custom_event")
                .env(env)
                .call(level, message, formatted);
        return null;
    }

    @ConvertedMethod
    public Object getDefaultFormatter(RuntimeEnv env, Object... args) {
        return ZVal.assign(new NormalizerFormatter(env));
    }

    @ConvertedMethod
    public Object getLevelMap(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.levelMap);
    }

    public static final Object CONST_class = "Monolog\\Handler\\ZendMonitorHandler";

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
                    .setName("Monolog\\Handler\\ZendMonitorHandler")
                    .setLookup(
                            ZendMonitorHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bubble", "formatter", "level", "levelMap", "processors")
                    .setFilename(
                            "vendor/monolog/monolog/src/Monolog/Handler/ZendMonitorHandler.php")
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
