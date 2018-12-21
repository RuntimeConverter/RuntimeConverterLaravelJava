package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.NormalizerFormatter;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_scalar;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Formatter/GelfMessageFormatter.php

*/

public class GelfMessageFormatter extends NormalizerFormatter {

    public Object systemName = null;

    public Object extraPrefix = null;

    public Object contextPrefix = null;

    public Object maxLength = null;

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

    public GelfMessageFormatter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == GelfMessageFormatter.class) {
            this.__construct(env, args);
        }
    }

    public GelfMessageFormatter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "systemName",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "extraPrefix",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "contextPrefix")
    @ConvertedParameter(
        index = 3,
        name = "maxLength",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object systemName = assignParameter(args, 0, true);
        if (null == systemName) {
            systemName = ZVal.getNull();
        }
        Object extraPrefix = assignParameter(args, 1, true);
        if (null == extraPrefix) {
            extraPrefix = ZVal.getNull();
        }
        Object contextPrefix = assignParameter(args, 2, true);
        if (null == contextPrefix) {
            contextPrefix = "ctxt_";
        }
        Object maxLength = assignParameter(args, 3, true);
        if (null == maxLength) {
            maxLength = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        super.__construct(env, "U.u");
        this.systemName =
                ZVal.isTrue(ternaryExpressionTemp = systemName)
                        ? ternaryExpressionTemp
                        : NamespaceGlobal.gethostname.env(env).call().value();
        this.extraPrefix = extraPrefix;
        this.contextPrefix = contextPrefix;
        this.maxLength =
                function_is_null.f.env(env).call(maxLength).getBool()
                        ? CONST_DEFAULT_MAX_LENGTH
                        : maxLength;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object format(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object val = null;
        Object len = null;
        Object message = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        Object key = null;
        record.setObject(super.format(env, record.getObject()));
        if (!ZVal.toBool(
                        ZVal.toBool(arrayActionR(ArrayAction.ISSET, record, env, "datetime"))
                                && ZVal.toBool(
                                        arrayActionR(ArrayAction.ISSET, record, env, "message")))
                && ZVal.toBool(arrayActionR(ArrayAction.ISSET, record, env, "level"))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "The record should at least contain datetime, message and level keys, "
                                    + toStringR(
                                            NamespaceGlobal.var_export
                                                    .env(env)
                                                    .call(record.getObject(), true)
                                                    .value(),
                                            env)
                                    + " given"));
        }

        message = env.createNew(ZVal.resolveClassAlias(env, "Message"));
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        message,
                                        "setTimestamp",
                                        GelfMessageFormatter.class,
                                        record.arrayGet(env, "datetime")),
                                "setShortMessage",
                                GelfMessageFormatter.class,
                                toStringR(record.arrayGet(env, "message"), env)),
                        "setHost",
                        GelfMessageFormatter.class,
                        this.systemName),
                "setLevel",
                GelfMessageFormatter.class,
                new ReferenceClassProperty(this, "logLevels", env)
                        .arrayGet(env, record.arrayGet(env, "level")));
        len =
                ZVal.add(
                        ZVal.add(
                                200,
                                function_strlen
                                        .f
                                        .env(env)
                                        .call(toStringR(record.arrayGet(env, "message"), env))
                                        .value()),
                        function_strlen.f.env(env).call(this.systemName).value());
        if (ZVal.isGreaterThan(len, '>', this.maxLength)) {
            env.callMethod(
                    message,
                    "setShortMessage",
                    GelfMessageFormatter.class,
                    function_substr
                            .f
                            .env(env)
                            .call(record.arrayGet(env, "message"), 0, this.maxLength)
                            .value());
        }

        if (arrayActionR(ArrayAction.ISSET, record, env, "channel")) {
            env.callMethod(
                    message,
                    "setFacility",
                    GelfMessageFormatter.class,
                    record.arrayGet(env, "channel"));
        }

        if (arrayActionR(ArrayAction.ISSET, record, env, "extra", "line")) {
            env.callMethod(
                    message,
                    "setLine",
                    GelfMessageFormatter.class,
                    record.arrayGet(env, "extra", "line"));
            arrayActionR(ArrayAction.UNSET, record, env, "extra", "line");
        }

        if (arrayActionR(ArrayAction.ISSET, record, env, "extra", "file")) {
            env.callMethod(
                    message,
                    "setFile",
                    GelfMessageFormatter.class,
                    record.arrayGet(env, "extra", "file"));
            arrayActionR(ArrayAction.UNSET, record, env, "extra", "file");
        }

        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult741 : ZVal.getIterable(record.arrayGet(env, "extra"), env, false)) {
            key = ZVal.assign(zpairResult741.getKey());
            val = ZVal.assign(zpairResult741.getValue());
            val =
                    ZVal.assign(
                            ZVal.toBool(function_is_scalar.f.env(env).call(val).value())
                                            || ZVal.toBool(
                                                    ZVal.strictEqualityCheck(
                                                            ZVal.getNull(), "===", val))
                                    ? val
                                    : env.callMethod(
                                            this, "toJson", GelfMessageFormatter.class, val));
            len =
                    function_strlen
                            .f
                            .env(env)
                            .call(
                                    toStringR(this.extraPrefix, env)
                                            + toStringR(key, env)
                                            + toStringR(val, env))
                            .value();
            if (ZVal.isGreaterThan(len, '>', this.maxLength)) {
                env.callMethod(
                        message,
                        "setAdditional",
                        GelfMessageFormatter.class,
                        toStringR(this.extraPrefix, env) + toStringR(key, env),
                        function_substr.f.env(env).call(val, 0, this.maxLength).value());
                break;
            }

            env.callMethod(
                    message,
                    "setAdditional",
                    GelfMessageFormatter.class,
                    toStringR(this.extraPrefix, env) + toStringR(key, env),
                    val);
        }

        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult742 : ZVal.getIterable(record.arrayGet(env, "context"), env, false)) {
            key = ZVal.assign(zpairResult742.getKey());
            val = ZVal.assign(zpairResult742.getValue());
            val =
                    ZVal.assign(
                            ZVal.toBool(function_is_scalar.f.env(env).call(val).value())
                                            || ZVal.toBool(
                                                    ZVal.strictEqualityCheck(
                                                            ZVal.getNull(), "===", val))
                                    ? val
                                    : env.callMethod(
                                            this, "toJson", GelfMessageFormatter.class, val));
            len =
                    function_strlen
                            .f
                            .env(env)
                            .call(
                                    toStringR(this.contextPrefix, env)
                                            + toStringR(key, env)
                                            + toStringR(val, env))
                            .value();
            if (ZVal.isGreaterThan(len, '>', this.maxLength)) {
                env.callMethod(
                        message,
                        "setAdditional",
                        GelfMessageFormatter.class,
                        toStringR(this.contextPrefix, env) + toStringR(key, env),
                        function_substr.f.env(env).call(val, 0, this.maxLength).value());
                break;
            }

            env.callMethod(
                    message,
                    "setAdditional",
                    GelfMessageFormatter.class,
                    toStringR(this.contextPrefix, env) + toStringR(key, env),
                    val);
        }

        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                ZVal.getNull(),
                                "===",
                                env.callMethod(message, "getFile", GelfMessageFormatter.class)))
                && ZVal.toBool(
                        arrayActionR(
                                ArrayAction.ISSET, record, env, "context", "exception", "file"))) {
            if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call(
                            "/^(.+):([0-9]+)$/",
                            record.arrayGet(env, "context", "exception", "file"),
                            matches.getObject())
                    .getBool()) {
                env.callMethod(
                        message, "setFile", GelfMessageFormatter.class, matches.arrayGet(env, 1));
                env.callMethod(
                        message, "setLine", GelfMessageFormatter.class, matches.arrayGet(env, 2));
            }
        }

        return ZVal.assign(message);
    }

    public static final Object CONST_DEFAULT_MAX_LENGTH = 32766;

    public static final Object CONST_class = "Monolog\\Formatter\\GelfMessageFormatter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends NormalizerFormatter.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Formatter\\GelfMessageFormatter")
                    .setLookup(
                            GelfMessageFormatter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "contextPrefix",
                            "dateFormat",
                            "extraPrefix",
                            "logLevels",
                            "maxLength",
                            "systemName")
                    .setFilename(
                            "vendor/monolog/monolog/src/Monolog/Formatter/GelfMessageFormatter.php")
                    .addInterface("Monolog\\Formatter\\FormatterInterface")
                    .addExtendsClass("Monolog\\Formatter\\NormalizerFormatter")
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
