package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Logger.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.OutputInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.Log.classes.LogLevel;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeInterface;
import com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.Log.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.Log.classes.AbstractLogger;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_scalar;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.ConsoleOutputInterface;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Logger/ConsoleLogger.php

*/

public class ConsoleLogger extends AbstractLogger {

    public Object output = null;

    public Object verbosityLevelMap =
            ZVal.newArray(
                    new ZPair(LogLevel.CONST_EMERGENCY, OutputInterface.CONST_VERBOSITY_NORMAL),
                    new ZPair(LogLevel.CONST_ALERT, OutputInterface.CONST_VERBOSITY_NORMAL),
                    new ZPair(LogLevel.CONST_CRITICAL, OutputInterface.CONST_VERBOSITY_NORMAL),
                    new ZPair(LogLevel.CONST_ERROR, OutputInterface.CONST_VERBOSITY_NORMAL),
                    new ZPair(LogLevel.CONST_WARNING, OutputInterface.CONST_VERBOSITY_NORMAL),
                    new ZPair(LogLevel.CONST_NOTICE, OutputInterface.CONST_VERBOSITY_VERBOSE),
                    new ZPair(LogLevel.CONST_INFO, OutputInterface.CONST_VERBOSITY_VERY_VERBOSE),
                    new ZPair(LogLevel.CONST_DEBUG, OutputInterface.CONST_VERBOSITY_DEBUG));

    public Object formatLevelMap =
            ZVal.newArray(
                    new ZPair(LogLevel.CONST_EMERGENCY, CONST_ERROR),
                    new ZPair(LogLevel.CONST_ALERT, CONST_ERROR),
                    new ZPair(LogLevel.CONST_CRITICAL, CONST_ERROR),
                    new ZPair(LogLevel.CONST_ERROR, CONST_ERROR),
                    new ZPair(LogLevel.CONST_WARNING, CONST_INFO),
                    new ZPair(LogLevel.CONST_NOTICE, CONST_INFO),
                    new ZPair(LogLevel.CONST_INFO, CONST_INFO),
                    new ZPair(LogLevel.CONST_DEBUG, CONST_INFO));

    public Object errored = false;

    public ConsoleLogger(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ConsoleLogger.class) {
            this.__construct(env, args);
        }
    }

    public ConsoleLogger(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "verbosityLevelMap",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "formatLevelMap",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        Object verbosityLevelMap = assignParameter(args, 1, true);
        if (null == verbosityLevelMap) {
            verbosityLevelMap = ZVal.newArray();
        }
        Object formatLevelMap = assignParameter(args, 2, true);
        if (null == formatLevelMap) {
            formatLevelMap = ZVal.newArray();
        }
        this.output = output;
        this.verbosityLevelMap = ZVal.add(verbosityLevelMap, this.verbosityLevelMap);
        this.formatLevelMap = ZVal.add(formatLevelMap, this.formatLevelMap);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    @ConvertedParameter(index = 1, name = "message")
    @ConvertedParameter(
        index = 2,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object log(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, false);
        Object context = assignParameter(args, 2, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        Object output = null;
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "verbosityLevelMap", env),
                env,
                level)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("The log level \"%s\" does not exist.", level)
                                    .value()));
        }

        output = ZVal.assign(this.output);
        if (ZVal.strictEqualityCheck(
                CONST_ERROR,
                "===",
                new ReferenceClassProperty(this, "formatLevelMap", env).arrayGet(env, level))) {
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            this.output,
                            ConsoleOutputInterface.class,
                            "Symfony\\Component\\Console\\Output\\ConsoleOutputInterface"))) {
                output = env.callMethod(output, "getErrorOutput", ConsoleLogger.class);
            }

            this.errored = true;
        }

        if (ZVal.isGreaterThanOrEqualTo(
                env.callMethod(output, "getVerbosity", ConsoleLogger.class),
                ">=",
                new ReferenceClassProperty(this, "verbosityLevelMap", env).arrayGet(env, level))) {
            env.callMethod(
                    output,
                    "writeln",
                    ConsoleLogger.class,
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "<%1$s>[%2$s] %3$s</%1$s>",
                                    new ReferenceClassProperty(this, "formatLevelMap", env)
                                            .arrayGet(env, level),
                                    level,
                                    this.interpolate(env, message, context))
                            .value(),
                    new ReferenceClassProperty(this, "verbosityLevelMap", env)
                            .arrayGet(env, level));
        }

        return null;
    }

    @ConvertedMethod
    public Object hasErrored(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.errored);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "string")
    @ConvertedParameter(index = 1, name = "context", typeHint = "array")
    private Object interpolate(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, false);
        Object val = null;
        ReferenceContainer replacements = new BasicReferenceContainer(null);
        Object key = null;
        if (ZVal.strictEqualityCheck(
                false, "===", function_strpos.f.env(env).call(message, "{").value())) {
            return ZVal.assign(message);
        }

        replacements.setObject(ZVal.newArray());
        for (ZPair zpairResult1738 : ZVal.getIterable(context, env, false)) {
            key = ZVal.assign(zpairResult1738.getKey());
            val = ZVal.assign(zpairResult1738.getValue());
            if (ZVal.toBool(
                            ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", val))
                                    || ZVal.toBool(function_is_scalar.f.env(env).call(val).value()))
                    || ZVal.toBool(
                            ZVal.toBool(function_is_object.f.env(env).call(val).value())
                                    && ZVal.toBool(
                                            function_method_exists
                                                    .f
                                                    .env(env)
                                                    .call(val, "__toString")
                                                    .value()))) {
                replacements.arrayAccess(env, "{" + toStringR(key, env) + "}").set(val);

            } else if (ZVal.isTrue(
                    ZVal.checkInstanceType(val, DateTimeInterface.class, "DateTimeInterface"))) {
                replacements
                        .arrayAccess(env, "{" + toStringR(key, env) + "}")
                        .set(env.callMethod(val, "format", ConsoleLogger.class, "Y-m-d\\TH:i:sP"));

            } else if (function_is_object.f.env(env).call(val).getBool()) {
                replacements
                        .arrayAccess(env, "{" + toStringR(key, env) + "}")
                        .set(
                                "[object "
                                        + toStringR(
                                                function_get_class.f.env(env).call(val).value(),
                                                env)
                                        + "]");

            } else {
                replacements
                        .arrayAccess(env, "{" + toStringR(key, env) + "}")
                        .set(
                                "["
                                        + toStringR(
                                                NamespaceGlobal.gettype.env(env).call(val).value(),
                                                env)
                                        + "]");
            }
        }

        return ZVal.assign(
                NamespaceGlobal.strtr.env(env).call(message, replacements.getObject()).value());
    }

    public static final Object CONST_INFO = "info";

    public static final Object CONST_ERROR = "error";

    public static final Object CONST_class = "Symfony\\Component\\Console\\Logger\\ConsoleLogger";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractLogger.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Logger\\ConsoleLogger")
                    .setLookup(
                            ConsoleLogger.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("errored", "formatLevelMap", "output", "verbosityLevelMap")
                    .setFilename("vendor/symfony/console/Logger/ConsoleLogger.php")
                    .addInterface("Psr\\Log\\LoggerInterface")
                    .addExtendsClass("Psr\\Log\\AbstractLogger")
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
