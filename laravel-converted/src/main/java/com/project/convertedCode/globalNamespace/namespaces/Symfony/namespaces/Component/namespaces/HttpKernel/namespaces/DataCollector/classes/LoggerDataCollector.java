package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DataCollector.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.array.function_ksort;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DataCollector.classes.LateDataCollectorInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes.SilencedErrorContext;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.errors.ErrorException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Log.classes.DebugLoggerInterface;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DataCollector.classes.DataCollector;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/DataCollector/LoggerDataCollector.php

*/

public class LoggerDataCollector extends DataCollector implements LateDataCollectorInterface {

    public Object logger = null;

    public Object containerPathPrefix = null;

    public Object currentRequest = null;

    public Object requestStack = null;

    public LoggerDataCollector(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == LoggerDataCollector.class) {
            this.__construct(env, args);
        }
    }

    public LoggerDataCollector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "logger",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "containerPathPrefix",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "requestStack",
        typeHint = "Symfony\\Component\\HttpFoundation\\RequestStack",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object logger = assignParameter(args, 0, true);
        if (null == logger) {
            logger = ZVal.getNull();
        }
        Object containerPathPrefix = assignParameter(args, 1, true);
        if (null == containerPathPrefix) {
            containerPathPrefix = ZVal.getNull();
        }
        Object requestStack = assignParameter(args, 2, true);
        if (null == requestStack) {
            requestStack = ZVal.getNull();
        }
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", logger))
                && ZVal.toBool(
                        ZVal.checkInstanceType(
                                logger,
                                DebugLoggerInterface.class,
                                "Symfony\\Component\\HttpKernel\\Log\\DebugLoggerInterface"))) {
            this.logger = logger;
        }

        this.containerPathPrefix = containerPathPrefix;
        this.requestStack = requestStack;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(
        index = 1,
        name = "response",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response"
    )
    @ConvertedParameter(
        index = 2,
        name = "exception",
        typeHint = "Exception",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object collect(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object response = assignParameter(args, 1, false);
        Object exception = assignParameter(args, 2, true);
        if (null == exception) {
            exception = ZVal.getNull();
        }
        this.currentRequest =
                ZVal.toBool(this.requestStack)
                                && ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                env.callMethod(
                                                        this.requestStack,
                                                        "getMasterRequest",
                                                        LoggerDataCollector.class),
                                                "!==",
                                                request))
                        ? request
                        : ZVal.getNull();
        return null;
    }

    @ConvertedMethod
    public Object reset(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        this.logger,
                        DebugLoggerInterface.class,
                        "Symfony\\Component\\HttpKernel\\Log\\DebugLoggerInterface"))) {
            env.callMethod(this.logger, "clear", LoggerDataCollector.class);
        }

        toObjectR(this).accessProp(this, env).name("data").set(ZVal.newArray());
        return null;
    }

    @ConvertedMethod
    public Object lateCollect(RuntimeEnv env, Object... args) {
        Object containerDeprecationLogs = null;
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.logger)) {
            containerDeprecationLogs = this.getContainerDeprecationLogs(env);
            toObjectR(this)
                    .accessProp(this, env)
                    .name("data")
                    .set(this.computeErrorsCount(env, containerDeprecationLogs));
            new ReferenceClassProperty(this, "data", env)
                    .arrayAccess(env, "compiler_logs")
                    .set(this.getContainerCompilerLogs(env));
            new ReferenceClassProperty(this, "data", env)
                    .arrayAccess(env, "logs")
                    .set(
                            this.sanitizeLogs(
                                    env,
                                    function_array_merge
                                            .f
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            this.logger,
                                                            "getLogs",
                                                            LoggerDataCollector.class,
                                                            this.currentRequest),
                                                    containerDeprecationLogs)
                                            .value()));
            toObjectR(this)
                    .accessProp(this, env)
                    .name("data")
                    .set(
                            env.callMethod(
                                    this,
                                    "cloneVar",
                                    LoggerDataCollector.class,
                                    toObjectR(this).accessProp(this, env).name("data").value()));
        }

        this.currentRequest = ZVal.getNull();
        return null;
    }

    @ConvertedMethod
    public Object getLogs(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "data", env),
                                env,
                                "logs")
                        ? new ReferenceClassProperty(this, "data", env).arrayGet(env, "logs")
                        : ZVal.newArray());
    }

    @ConvertedMethod
    public Object getPriorities(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "data", env),
                                env,
                                "priorities")
                        ? new ReferenceClassProperty(this, "data", env).arrayGet(env, "priorities")
                        : ZVal.newArray());
    }

    @ConvertedMethod
    public Object countErrors(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "data", env),
                                env,
                                "error_count")
                        ? new ReferenceClassProperty(this, "data", env).arrayGet(env, "error_count")
                        : 0);
    }

    @ConvertedMethod
    public Object countDeprecations(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "data", env),
                                env,
                                "deprecation_count")
                        ? new ReferenceClassProperty(this, "data", env)
                                .arrayGet(env, "deprecation_count")
                        : 0);
    }

    @ConvertedMethod
    public Object countWarnings(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "data", env),
                                env,
                                "warning_count")
                        ? new ReferenceClassProperty(this, "data", env)
                                .arrayGet(env, "warning_count")
                        : 0);
    }

    @ConvertedMethod
    public Object countScreams(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "data", env),
                                env,
                                "scream_count")
                        ? new ReferenceClassProperty(this, "data", env)
                                .arrayGet(env, "scream_count")
                        : 0);
    }

    @ConvertedMethod
    public Object getCompilerLogs(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "data", env),
                                env,
                                "compiler_logs")
                        ? new ReferenceClassProperty(this, "data", env)
                                .arrayGet(env, "compiler_logs")
                        : ZVal.newArray());
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "logger";
    }

    @ConvertedMethod
    private Object getContainerDeprecationLogs(RuntimeEnv env, Object... args) {
        Object file = null;
        Object bootTime = null;
        ReferenceContainer log = new BasicReferenceContainer(null);
        ReferenceContainer logs = new BasicReferenceContainer(null);
        if (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.containerPathPrefix))
                || ZVal.toBool(
                        !function_file_exists
                                .f
                                .env(env)
                                .call(
                                        file =
                                                toStringR(this.containerPathPrefix, env)
                                                        + "Deprecations.log")
                                .getBool())) {
            return ZVal.assign(ZVal.newArray());
        }

        bootTime = NamespaceGlobal.filemtime.env(env).call(file).value();
        logs.setObject(ZVal.newArray());
        for (ZPair zpairResult1915 :
                ZVal.getIterable(
                        function_unserialize
                                .f
                                .env(env)
                                .call(function_file_get_contents.f.env(env).call(file).value())
                                .value(),
                        env,
                        true)) {
            log.setObject(ZVal.assign(zpairResult1915.getValue()));
            log.arrayAccess(env, "context")
                    .set(
                            ZVal.newArray(
                                    new ZPair(
                                            "exception",
                                            new SilencedErrorContext(
                                                    env,
                                                    log.arrayGet(env, "type"),
                                                    log.arrayGet(env, "file"),
                                                    log.arrayGet(env, "line"),
                                                    log.arrayGet(env, "trace"),
                                                    log.arrayGet(env, "count")))));
            log.arrayAccess(env, "timestamp").set(bootTime);
            log.arrayAccess(env, "priority").set(100);
            log.arrayAccess(env, "priorityName").set("DEBUG");
            log.arrayAccess(env, "channel").set("-");
            log.arrayAccess(env, "scream").set(false);
            arrayActionR(ArrayAction.UNSET, log, env, "type");
            arrayActionR(ArrayAction.UNSET, log, env, "file");
            arrayActionR(ArrayAction.UNSET, log, env, "line");
            arrayActionR(ArrayAction.UNSET, log, env, "trace");
            arrayActionR(ArrayAction.UNSET, log, env, "trace");
            arrayActionR(ArrayAction.UNSET, log, env, "count");
            logs.arrayAppend(env).set(log.getObject());
        }

        return ZVal.assign(logs.getObject());
    }

    @ConvertedMethod
    private Object getContainerCompilerLogs(RuntimeEnv env, Object... args) {
        Object file = null;
        ReferenceContainer log = new BasicReferenceContainer(null);
        ReferenceContainer logs = new BasicReferenceContainer(null);
        if (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.containerPathPrefix))
                || ZVal.toBool(
                        !function_file_exists
                                .f
                                .env(env)
                                .call(
                                        file =
                                                toStringR(this.containerPathPrefix, env)
                                                        + "Compiler.log")
                                .getBool())) {
            return ZVal.assign(ZVal.newArray());
        }

        logs.setObject(ZVal.newArray());
        for (ZPair zpairResult1916 :
                ZVal.getIterable(NamespaceGlobal.file.env(env).call(file, 2).value(), env, true)) {
            log.setObject(ZVal.assign(zpairResult1916.getValue()));
            log.setObject(function_explode.f.env(env).call(": ", log.getObject(), 2).value());
            if (ZVal.toBool(!arrayActionR(ArrayAction.ISSET, log, env, 1))
                    || ZVal.toBool(
                            !function_preg_match
                                    .f
                                    .env(env)
                                    .call(
                                            "/^[a-zA-Z_\\x7f-\\xff][a-zA-Z0-9_\\x7f-\\xff]*+(?:\\\\[a-zA-Z_\\x7f-\\xff][a-zA-Z0-9_\\x7f-\\xff]*+)++$/",
                                            log.arrayGet(env, 0))
                                    .getBool())) {
                log.setObject(
                        ZVal.newArray(
                                new ZPair(0, "Unknown Compiler Pass"),
                                new ZPair(
                                        1,
                                        NamespaceGlobal.implode
                                                .env(env)
                                                .call(": ", log.getObject())
                                                .value())));
            }

            logs.arrayAppend(env, log.arrayGet(env, 0))
                    .set(ZVal.newArray(new ZPair("message", log.arrayGet(env, 1))));
        }

        return ZVal.assign(logs.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "logs")
    private Object sanitizeLogs(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object logs = assignParameter(args, 0, false);
        Object exception = null;
        ReferenceContainer log = new BasicReferenceContainer(null);
        Object h = null;
        Object errorId = null;
        Object message = null;
        ReferenceContainer silencedLogs = new BasicReferenceContainer(null);
        ReferenceContainer sanitizedLogs = new BasicReferenceContainer(null);
        sanitizedLogs.setObject(ZVal.newArray());
        silencedLogs.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1917 : ZVal.getIterable(logs, env, true)) {
            log.setObject(ZVal.assign(zpairResult1917.getValue()));
            if (!ZVal.isTrue(this.isSilencedOrDeprecationErrorLog(env, log.getObject()))) {
                sanitizedLogs.arrayAppend(env).set(log.getObject());
                continue;
            }

            message = ZVal.assign(log.arrayGet(env, "message"));
            exception = ZVal.assign(log.arrayGet(env, "context", "exception"));
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            exception,
                            SilencedErrorContext.class,
                            "Symfony\\Component\\Debug\\Exception\\SilencedErrorContext"))) {
                if (arrayActionR(
                        ArrayAction.ISSET,
                        silencedLogs,
                        env,
                        h = NamespaceGlobal.spl_object_hash.env(env).call(exception).value())) {
                    continue;
                }

                silencedLogs.arrayAccess(env, h).set(true);
                if (!arrayActionR(ArrayAction.ISSET, sanitizedLogs, env, message)) {
                    sanitizedLogs
                            .arrayAccess(env, message)
                            .set(
                                    ZVal.add(
                                            log.getObject(),
                                            ZVal.newArray(
                                                    new ZPair("errorCount", 0),
                                                    new ZPair("scream", true))));
                }

                sanitizedLogs
                        .arrayAccess(env, message, "errorCount")
                        .set(
                                ZAssignment.add(
                                        "+=",
                                        sanitizedLogs.arrayGet(env, message, "errorCount"),
                                        toObjectR(exception)
                                                .accessProp(this, env)
                                                .name("count")
                                                .value()));
                continue;
            }

            errorId =
                    NamespaceGlobal.md5
                            .env(env)
                            .call(
                                    toStringR(
                                                    env.callMethod(
                                                            exception,
                                                            "getSeverity",
                                                            LoggerDataCollector.class),
                                                    env)
                                            + "/"
                                            + toStringR(
                                                    env.callMethod(
                                                            exception,
                                                            "getLine",
                                                            LoggerDataCollector.class),
                                                    env)
                                            + "/"
                                            + toStringR(
                                                    env.callMethod(
                                                            exception,
                                                            "getFile",
                                                            LoggerDataCollector.class),
                                                    env)
                                            + "\u0000"
                                            + toStringR(message, env),
                                    true)
                            .value();
            if (arrayActionR(ArrayAction.ISSET, sanitizedLogs, env, errorId)) {
                sanitizedLogs
                        .arrayAccess(env, errorId, "errorCount")
                        .set(ZVal.increment(sanitizedLogs.arrayGet(env, errorId, "errorCount")));

            } else {
                log.setObject(
                        ZAssignment.add(
                                "+=",
                                log.getObject(),
                                ZVal.newArray(
                                        new ZPair("errorCount", 1), new ZPair("scream", false))));
                sanitizedLogs.arrayAccess(env, errorId).set(log.getObject());
            }
        }

        return ZVal.assign(
                function_array_values.f.env(env).call(sanitizedLogs.getObject()).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "log", typeHint = "array")
    private Object isSilencedOrDeprecationErrorLog(RuntimeEnv env, Object... args) {
        ReferenceContainer log = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object exception = null;
        if (!arrayActionR(ArrayAction.ISSET, log, env, "context", "exception")) {
            return ZVal.assign(false);
        }

        exception = ZVal.assign(log.arrayGet(env, "context", "exception"));
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        exception,
                        SilencedErrorContext.class,
                        "Symfony\\Component\\Debug\\Exception\\SilencedErrorContext"))) {
            return ZVal.assign(true);
        }

        if (ZVal.toBool(ZVal.checkInstanceType(exception, ErrorException.class, "ErrorException"))
                && ZVal.toBool(
                        function_in_array
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(
                                                exception,
                                                "getSeverity",
                                                LoggerDataCollector.class),
                                        ZVal.newArray(new ZPair(0, 8192), new ZPair(1, 16384)),
                                        true)
                                .value())) {
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "containerDeprecationLogs", typeHint = "array")
    private Object computeErrorsCount(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object containerDeprecationLogs = assignParameter(args, 0, false);
        Object exception = null;
        ReferenceContainer log = new BasicReferenceContainer(null);
        ReferenceContainer deprecationLog = new BasicReferenceContainer(null);
        ReferenceContainer count = new BasicReferenceContainer(null);
        Object h = null;
        ReferenceContainer silencedLogs = new BasicReferenceContainer(null);
        silencedLogs.setObject(ZVal.newArray());
        count.setObject(
                ZVal.newArray(
                        new ZPair(
                                "error_count",
                                env.callMethod(
                                        this.logger,
                                        "countErrors",
                                        LoggerDataCollector.class,
                                        this.currentRequest)),
                        new ZPair("deprecation_count", 0),
                        new ZPair("warning_count", 0),
                        new ZPair("scream_count", 0),
                        new ZPair("priorities", ZVal.newArray())));
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1918 :
                ZVal.getIterable(
                        env.callMethod(
                                this.logger,
                                "getLogs",
                                LoggerDataCollector.class,
                                this.currentRequest),
                        env,
                        true)) {
            log.setObject(ZVal.assign(zpairResult1918.getValue()));
            if (arrayActionR(
                    ArrayAction.ISSET, count, env, "priorities", log.arrayGet(env, "priority"))) {
                count.arrayAccess(env, "priorities", log.arrayGet(env, "priority"), "count")
                        .set(
                                ZVal.increment(
                                        count.arrayGet(
                                                env,
                                                "priorities",
                                                log.arrayGet(env, "priority"),
                                                "count")));

            } else {
                count.arrayAccess(env, "priorities", log.arrayGet(env, "priority"))
                        .set(
                                ZVal.newArray(
                                        new ZPair("count", 1),
                                        new ZPair("name", log.arrayGet(env, "priorityName"))));
            }

            if (ZVal.strictEqualityCheck("WARNING", "===", log.arrayGet(env, "priorityName"))) {
                count.arrayAccess(env, "warning_count")
                        .set(ZVal.increment(count.arrayGet(env, "warning_count")));
            }

            if (ZVal.isTrue(this.isSilencedOrDeprecationErrorLog(env, log.getObject()))) {
                exception = ZVal.assign(log.arrayGet(env, "context", "exception"));
                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                exception,
                                SilencedErrorContext.class,
                                "Symfony\\Component\\Debug\\Exception\\SilencedErrorContext"))) {
                    if (arrayActionR(
                            ArrayAction.ISSET,
                            silencedLogs,
                            env,
                            h = NamespaceGlobal.spl_object_hash.env(env).call(exception).value())) {
                        continue;
                    }

                    silencedLogs.arrayAccess(env, h).set(true);
                    count.arrayAccess(env, "scream_count")
                            .set(
                                    ZAssignment.add(
                                            "+=",
                                            count.arrayGet(env, "scream_count"),
                                            toObjectR(exception)
                                                    .accessProp(this, env)
                                                    .name("count")
                                                    .value()));

                } else {
                    count.arrayAccess(env, "deprecation_count")
                            .set(ZVal.increment(count.arrayGet(env, "deprecation_count")));
                }
            }
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1919 : ZVal.getIterable(containerDeprecationLogs, env, true)) {
            deprecationLog.setObject(ZVal.assign(zpairResult1919.getValue()));
            count.arrayAccess(env, "deprecation_count")
                    .set(
                            ZAssignment.add(
                                    "+=",
                                    count.arrayGet(env, "deprecation_count"),
                                    toObjectR(deprecationLog.arrayGet(env, "context", "exception"))
                                            .accessProp(this, env)
                                            .name("count")
                                            .value()));
        }

        function_ksort.f.env(env).call(count.arrayGet(env, "priorities"));
        return ZVal.assign(count.getObject());
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\DataCollector\\LoggerDataCollector";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends DataCollector.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\DataCollector\\LoggerDataCollector")
                    .setLookup(
                            LoggerDataCollector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "cloner",
                            "containerPathPrefix",
                            "currentRequest",
                            "data",
                            "logger",
                            "requestStack")
                    .setFilename("vendor/symfony/http-kernel/DataCollector/LoggerDataCollector.php")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\DataCollector\\LateDataCollectorInterface")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\DataCollector\\DataCollectorInterface")
                    .addInterface("Serializable")
                    .addExtendsClass("Symfony\\Component\\HttpKernel\\DataCollector\\DataCollector")
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
