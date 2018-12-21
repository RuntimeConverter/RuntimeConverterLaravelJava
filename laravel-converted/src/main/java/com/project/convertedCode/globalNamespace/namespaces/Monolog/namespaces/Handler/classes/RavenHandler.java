package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reduce;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.exceptions.missingDefinitions.ClassNotFoundDuringConversion;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractProcessingHandler;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.LineFormatter;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/RavenHandler.php

*/

public class RavenHandler extends AbstractProcessingHandler {

    public Object logLevels =
            ZVal.newArray(
                    new ZPair(
                            Logger.CONST_DEBUG,
                            ClassNotFoundDuringConversion.throwException("Raven_Client")),
                    new ZPair(
                            Logger.CONST_INFO,
                            ClassNotFoundDuringConversion.throwException("Raven_Client")),
                    new ZPair(
                            Logger.CONST_NOTICE,
                            ClassNotFoundDuringConversion.throwException("Raven_Client")),
                    new ZPair(
                            Logger.CONST_WARNING,
                            ClassNotFoundDuringConversion.throwException("Raven_Client")),
                    new ZPair(
                            Logger.CONST_ERROR,
                            ClassNotFoundDuringConversion.throwException("Raven_Client")),
                    new ZPair(
                            Logger.CONST_CRITICAL,
                            ClassNotFoundDuringConversion.throwException("Raven_Client")),
                    new ZPair(
                            Logger.CONST_ALERT,
                            ClassNotFoundDuringConversion.throwException("Raven_Client")),
                    new ZPair(
                            Logger.CONST_EMERGENCY,
                            ClassNotFoundDuringConversion.throwException("Raven_Client")));

    public Object release = null;

    public Object ravenClient = null;

    public Object batchFormatter = null;

    public RavenHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RavenHandler.class) {
            this.__construct(env, args);
        }
    }

    public RavenHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ravenClient", typeHint = "Raven_Client")
    @ConvertedParameter(index = 1, name = "level")
    @ConvertedParameter(
        index = 2,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object ravenClient = assignParameter(args, 0, false);
        Object level = assignParameter(args, 1, true);
        if (null == level) {
            level = Logger.CONST_DEBUG;
        }
        Object bubble = assignParameter(args, 2, true);
        if (null == bubble) {
            bubble = true;
        }
        super.__construct(env, level, bubble);
        this.ravenClient = ravenClient;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "records", typeHint = "array")
    public Object handleBatch(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/monolog/monolog/src/Monolog/Handler")
                        .setFile("/vendor/monolog/monolog/src/Monolog/Handler/RavenHandler.php");
        Object records = assignParameter(args, 0, false);
        Object r = null;
        Object level = null;
        ReferenceContainer record = new BasicReferenceContainer(null);
        ReferenceContainer logs = new BasicReferenceContainer(null);
        level = ZVal.assign(toObjectR(this).accessProp(this, env).name("level").value());
        records =
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                records,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Monolog\\Handler",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "record")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        ReferenceContainer record =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 0, false));
                                        Object level = null;
                                        level = this.contextReferences.getCapturedValue("level");
                                        return ZVal.assign(
                                                ZVal.isGreaterThanOrEqualTo(
                                                        record.arrayGet(env, "level"),
                                                        ">=",
                                                        level));
                                    }
                                }.use("level", level))
                        .value();
        if (!ZVal.isTrue(records)) {
            return null;
        }

        record.setObject(
                function_array_reduce
                        .f
                        .env(env)
                        .call(
                                records,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Monolog\\Handler",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "highest")
                                    @ConvertedParameter(index = 1, name = "record")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        ReferenceContainer highest =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 0, false));
                                        ReferenceContainer record =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 1, false));
                                        if (ZVal.isGreaterThan(
                                                record.arrayGet(env, "level"),
                                                '>',
                                                highest.arrayGet(env, "level"))) {
                                            return ZVal.assign(record.getObject());
                                        }

                                        return ZVal.assign(highest.getObject());
                                    }
                                })
                        .value());
        logs.setObject(ZVal.newArray());
        for (ZPair zpairResult799 : ZVal.getIterable(records, env, true)) {
            r = ZVal.assign(zpairResult799.getValue());
            logs.arrayAppend(env).set(env.callMethod(this, "processRecord", RavenHandler.class, r));
        }

        if (ZVal.isTrue(logs.getObject())) {
            record.arrayAccess(env, "context", "logs")
                    .set(
                            toStringR(
                                    env.callMethod(
                                            this.getBatchFormatter(env),
                                            "formatBatch",
                                            RavenHandler.class,
                                            logs.getObject()),
                                    env));
        }

        env.callMethod(this, "handle", RavenHandler.class, record.getObject());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "formatter",
        typeHint = "Monolog\\Formatter\\FormatterInterface"
    )
    public Object setBatchFormatter(RuntimeEnv env, Object... args) {
        Object formatter = assignParameter(args, 0, false);
        this.batchFormatter = formatter;
        return null;
    }

    @ConvertedMethod
    public Object getBatchFormatter(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.batchFormatter)) {
            this.batchFormatter = this.getDefaultBatchFormatter(env);
        }

        return ZVal.assign(this.batchFormatter);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object write(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object previousUserContext = null;
        ReferenceContainer options = new BasicReferenceContainer(null);
        Object source = null;
        Object key = null;
        previousUserContext = false;
        options.setObject(ZVal.newArray());
        options.arrayAccess(env, "level")
                .set(
                        new ReferenceClassProperty(this, "logLevels", env)
                                .arrayGet(env, record.arrayGet(env, "level")));
        options.arrayAccess(env, "tags").set(ZVal.newArray());
        if (!arrayActionR(ArrayAction.EMPTY, record, env, "extra", "tags")) {
            options.arrayAccess(env, "tags")
                    .set(
                            function_array_merge
                                    .f
                                    .env(env)
                                    .call(
                                            options.arrayGet(env, "tags"),
                                            record.arrayGet(env, "extra", "tags"))
                                    .value());
            arrayActionR(ArrayAction.UNSET, record, env, "extra", "tags");
        }

        if (!arrayActionR(ArrayAction.EMPTY, record, env, "context", "tags")) {
            options.arrayAccess(env, "tags")
                    .set(
                            function_array_merge
                                    .f
                                    .env(env)
                                    .call(
                                            options.arrayGet(env, "tags"),
                                            record.arrayGet(env, "context", "tags"))
                                    .value());
            arrayActionR(ArrayAction.UNSET, record, env, "context", "tags");
        }

        if (!arrayActionR(ArrayAction.EMPTY, record, env, "context", "fingerprint")) {
            options.arrayAccess(env, "fingerprint")
                    .set(record.arrayGet(env, "context", "fingerprint"));
            arrayActionR(ArrayAction.UNSET, record, env, "context", "fingerprint");
        }

        if (!arrayActionR(ArrayAction.EMPTY, record, env, "context", "logger")) {
            options.arrayAccess(env, "logger").set(record.arrayGet(env, "context", "logger"));
            arrayActionR(ArrayAction.UNSET, record, env, "context", "logger");

        } else {
            options.arrayAccess(env, "logger").set(record.arrayGet(env, "channel"));
        }

        for (ZPair zpairResult800 : ZVal.getIterable(this.getExtraParameters(env), env, true)) {
            key = ZVal.assign(zpairResult800.getValue());
            for (ZPair zpairResult801 :
                    ZVal.getIterable(ZVal.arrayFromList("extra", "context"), env, true)) {
                source = ZVal.assign(zpairResult801.getValue());
                if (!arrayActionR(ArrayAction.EMPTY, record, env, source, key)) {
                    options.arrayAccess(env, key).set(record.arrayGet(env, source, key));
                    arrayActionR(ArrayAction.UNSET, record, env, source, key);
                }
            }
        }

        if (!arrayActionR(ArrayAction.EMPTY, record, env, "context")) {
            options.arrayAccess(env, "extra", "context").set(record.arrayGet(env, "context"));
            if (!arrayActionR(ArrayAction.EMPTY, record, env, "context", "user")) {
                previousUserContext =
                        ZVal.assign(
                                toObjectR(this.ravenClient)
                                        .accessProp(this, env)
                                        .name("context")
                                        .getObject()
                                        .accessProp(this, env)
                                        .name("user")
                                        .value());
                env.callMethod(
                        this.ravenClient,
                        "user_context",
                        RavenHandler.class,
                        record.arrayGet(env, "context", "user"));
                arrayActionR(ArrayAction.UNSET, options, env, "extra", "context", "user");
            }
        }

        if (!arrayActionR(ArrayAction.EMPTY, record, env, "extra")) {
            options.arrayAccess(env, "extra", "extra").set(record.arrayGet(env, "extra"));
        }

        if (ZVal.toBool(!ZVal.isEmpty(this.release))
                && ZVal.toBool(!arrayActionR(ArrayAction.ISSET, options, env, "release"))) {
            options.arrayAccess(env, "release").set(this.release);
        }

        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, record, env, "context", "exception"))
                && ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.checkInstanceType(
                                                record.arrayGet(env, "context", "exception"),
                                                PHPException.class,
                                                "Exception"))
                                || ZVal.toBool(
                                        ZVal.toBool(ZVal.isGreaterThanOrEqualTo(70211, ">=", 70000))
                                                && ZVal.toBool(
                                                        ZVal.checkInstanceType(
                                                                record.arrayGet(
                                                                        env,
                                                                        "context",
                                                                        "exception"),
                                                                Throwable.class,
                                                                "Throwable"))))) {
            options.arrayAccess(env, "extra", "message").set(record.arrayGet(env, "formatted"));
            env.callMethod(
                    this.ravenClient,
                    "captureException",
                    RavenHandler.class,
                    record.arrayGet(env, "context", "exception"),
                    options.getObject());

        } else {
            env.callMethod(
                    this.ravenClient,
                    "captureMessage",
                    RavenHandler.class,
                    record.arrayGet(env, "formatted"),
                    ZVal.newArray(),
                    options.getObject());
        }

        if (ZVal.strictNotEqualityCheck(previousUserContext, "!==", false)) {
            env.callMethod(
                    this.ravenClient, "user_context", RavenHandler.class, previousUserContext);
        }

        return null;
    }

    @ConvertedMethod
    protected Object getDefaultFormatter(RuntimeEnv env, Object... args) {
        return ZVal.assign(new LineFormatter(env, "[%channel%] %message%"));
    }

    @ConvertedMethod
    protected Object getDefaultBatchFormatter(RuntimeEnv env, Object... args) {
        return ZVal.assign(new LineFormatter(env));
    }

    @ConvertedMethod
    protected Object getExtraParameters(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.arrayFromList("checksum", "release", "event_id"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object setRelease(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        this.release = value;
        return ZVal.assign(this);
    }

    public static final Object CONST_class = "Monolog\\Handler\\RavenHandler";

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
                    .setName("Monolog\\Handler\\RavenHandler")
                    .setLookup(
                            RavenHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "batchFormatter",
                            "bubble",
                            "formatter",
                            "level",
                            "logLevels",
                            "processors",
                            "ravenClient",
                            "release")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/RavenHandler.php")
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
