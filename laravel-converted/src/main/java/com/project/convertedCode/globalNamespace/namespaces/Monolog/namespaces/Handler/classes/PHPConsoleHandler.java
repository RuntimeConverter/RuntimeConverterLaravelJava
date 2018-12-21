package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_replace;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractProcessingHandler;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.LineFormatter;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/PHPConsoleHandler.php

*/

public class PHPConsoleHandler extends AbstractProcessingHandler {

    public Object options =
            ZVal.newArray(
                    new ZPair("enabled", true),
                    new ZPair("classesPartialsTraceIgnore", ZVal.arrayFromList("Monolog\\")),
                    new ZPair("debugTagsKeysInContext", ZVal.arrayFromList(0, "tag")),
                    new ZPair("useOwnErrorsHandler", false),
                    new ZPair("useOwnExceptionsHandler", false),
                    new ZPair("sourcesBasePath", ZVal.getNull()),
                    new ZPair("registerHelper", true),
                    new ZPair("serverEncoding", ZVal.getNull()),
                    new ZPair("headersLimit", ZVal.getNull()),
                    new ZPair("password", ZVal.getNull()),
                    new ZPair("enableSslOnlyMode", false),
                    new ZPair("ipMasks", ZVal.newArray()),
                    new ZPair("enableEvalListener", false),
                    new ZPair("dumperDetectCallbacks", false),
                    new ZPair("dumperLevelLimit", 5),
                    new ZPair("dumperItemsCountLimit", 100),
                    new ZPair("dumperItemSizeLimit", 5000),
                    new ZPair("dumperDumpSizeLimit", 500000),
                    new ZPair("detectDumpTraceAndSource", false),
                    new ZPair("dataStorage", ZVal.getNull()));

    public Object connector = null;

    public PHPConsoleHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PHPConsoleHandler.class) {
            this.__construct(env, args);
        }
    }

    public PHPConsoleHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 1,
        name = "connector",
        typeHint = "PhpConsole\\Connector",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "level")
    @ConvertedParameter(
        index = 3,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object connector = assignParameter(args, 1, true);
        if (null == connector) {
            connector = ZVal.getNull();
        }
        Object level = assignParameter(args, 2, true);
        if (null == level) {
            level = Logger.CONST_DEBUG;
        }
        Object bubble = assignParameter(args, 3, true);
        if (null == bubble) {
            bubble = true;
        }
        if (!function_class_exists.f.env(env).call("PhpConsole\\Connector").getBool()) {
            throw ZVal.getException(
                    env,
                    new PHPException(
                            env,
                            "PHP Console library not found. See https://github.com/barbushin/php-console#installation"));
        }

        super.__construct(env, level, bubble);
        this.options = this.initOptions(env, options);
        this.connector = this.initConnector(env, connector);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options", typeHint = "array")
    private Object initOptions(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, false);
        Object wrongOptions = null;
        wrongOptions =
                function_array_diff
                        .f
                        .env(env)
                        .call(
                                function_array_keys.f.env(env).call(options).value(),
                                function_array_keys.f.env(env).call(this.options).value())
                        .value();
        if (ZVal.isTrue(wrongOptions)) {
            throw ZVal.getException(
                    env,
                    new PHPException(
                            env,
                            "Unknown options: "
                                    + toStringR(
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call(", ", wrongOptions)
                                                    .value(),
                                            env)));
        }

        return ZVal.assign(function_array_replace.f.env(env).call(this.options, options).value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "connector",
        typeHint = "PhpConsole\\Connector",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    private Object initConnector(RuntimeEnv env, Object... args) {
        Object connector = assignParameter(args, 0, true);
        if (null == connector) {
            connector = ZVal.getNull();
        }
        Object handler = null;
        Object dumper = null;
        if (!ZVal.isTrue(connector)) {
            if (ZVal.isTrue(
                    new ReferenceClassProperty(this, "options", env)
                            .arrayGet(env, "dataStorage"))) {
                StaticMethodUtils.getStaticBaseClass(ZVal.resolveClassAlias(env, "Connector"), env)
                        .callUnknownStaticMethod(
                                env,
                                "setPostponeStorage",
                                new RuntimeArgsWithReferences(),
                                new ReferenceClassProperty(this, "options", env)
                                        .arrayGet(env, "dataStorage"));
            }

            connector =
                    StaticMethodUtils.getStaticBaseClass(
                                    ZVal.resolveClassAlias(env, "Connector"), env)
                            .callUnknownStaticMethod(env, "getInstance");
        }

        if (ZVal.toBool(
                        new ReferenceClassProperty(this, "options", env)
                                .arrayGet(env, "registerHelper"))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                StaticMethodUtils.getStaticBaseClass(
                                                ZVal.resolveClassAlias(env, "Helper"), env)
                                        .callUnknownStaticMethod(env, "isRegistered")))) {
            StaticMethodUtils.getStaticBaseClass(ZVal.resolveClassAlias(env, "Helper"), env)
                    .callUnknownStaticMethod(env, "register");
        }

        if (ZVal.toBool(new ReferenceClassProperty(this, "options", env).arrayGet(env, "enabled"))
                && ZVal.toBool(
                        env.callMethod(connector, "isActiveClient", PHPConsoleHandler.class))) {
            if (ZVal.toBool(
                            new ReferenceClassProperty(this, "options", env)
                                    .arrayGet(env, "useOwnErrorsHandler"))
                    || ZVal.toBool(
                            new ReferenceClassProperty(this, "options", env)
                                    .arrayGet(env, "useOwnExceptionsHandler"))) {
                handler =
                        StaticMethodUtils.getStaticBaseClass(
                                        ZVal.resolveClassAlias(env, "Handler"), env)
                                .callUnknownStaticMethod(env, "getInstance");
                env.callMethod(
                        handler,
                        "setHandleErrors",
                        PHPConsoleHandler.class,
                        new ReferenceClassProperty(this, "options", env)
                                .arrayGet(env, "useOwnErrorsHandler"));
                env.callMethod(
                        handler,
                        "setHandleExceptions",
                        PHPConsoleHandler.class,
                        new ReferenceClassProperty(this, "options", env)
                                .arrayGet(env, "useOwnExceptionsHandler"));
                env.callMethod(handler, "start", PHPConsoleHandler.class);
            }

            if (ZVal.isTrue(
                    new ReferenceClassProperty(this, "options", env)
                            .arrayGet(env, "sourcesBasePath"))) {
                env.callMethod(
                        connector,
                        "setSourcesBasePath",
                        PHPConsoleHandler.class,
                        new ReferenceClassProperty(this, "options", env)
                                .arrayGet(env, "sourcesBasePath"));
            }

            if (ZVal.isTrue(
                    new ReferenceClassProperty(this, "options", env)
                            .arrayGet(env, "serverEncoding"))) {
                env.callMethod(
                        connector,
                        "setServerEncoding",
                        PHPConsoleHandler.class,
                        new ReferenceClassProperty(this, "options", env)
                                .arrayGet(env, "serverEncoding"));
            }

            if (ZVal.isTrue(
                    new ReferenceClassProperty(this, "options", env).arrayGet(env, "password"))) {
                env.callMethod(
                        connector,
                        "setPassword",
                        PHPConsoleHandler.class,
                        new ReferenceClassProperty(this, "options", env).arrayGet(env, "password"));
            }

            if (ZVal.isTrue(
                    new ReferenceClassProperty(this, "options", env)
                            .arrayGet(env, "enableSslOnlyMode"))) {
                env.callMethod(connector, "enableSslOnlyMode", PHPConsoleHandler.class);
            }

            if (ZVal.isTrue(
                    new ReferenceClassProperty(this, "options", env).arrayGet(env, "ipMasks"))) {
                env.callMethod(
                        connector,
                        "setAllowedIpMasks",
                        PHPConsoleHandler.class,
                        new ReferenceClassProperty(this, "options", env).arrayGet(env, "ipMasks"));
            }

            if (ZVal.isTrue(
                    new ReferenceClassProperty(this, "options", env)
                            .arrayGet(env, "headersLimit"))) {
                env.callMethod(
                        connector,
                        "setHeadersLimit",
                        PHPConsoleHandler.class,
                        new ReferenceClassProperty(this, "options", env)
                                .arrayGet(env, "headersLimit"));
            }

            if (ZVal.isTrue(
                    new ReferenceClassProperty(this, "options", env)
                            .arrayGet(env, "detectDumpTraceAndSource"))) {
                toObjectR(env.callMethod(connector, "getDebugDispatcher", PHPConsoleHandler.class))
                        .accessProp(this, env)
                        .name("detectTraceAndSource")
                        .set(true);
            }

            dumper = env.callMethod(connector, "getDumper", PHPConsoleHandler.class);
            toObjectR(dumper)
                    .accessProp(this, env)
                    .name("levelLimit")
                    .set(
                            new ReferenceClassProperty(this, "options", env)
                                    .arrayGet(env, "dumperLevelLimit"));
            toObjectR(dumper)
                    .accessProp(this, env)
                    .name("itemsCountLimit")
                    .set(
                            new ReferenceClassProperty(this, "options", env)
                                    .arrayGet(env, "dumperItemsCountLimit"));
            toObjectR(dumper)
                    .accessProp(this, env)
                    .name("itemSizeLimit")
                    .set(
                            new ReferenceClassProperty(this, "options", env)
                                    .arrayGet(env, "dumperItemSizeLimit"));
            toObjectR(dumper)
                    .accessProp(this, env)
                    .name("dumpSizeLimit")
                    .set(
                            new ReferenceClassProperty(this, "options", env)
                                    .arrayGet(env, "dumperDumpSizeLimit"));
            toObjectR(dumper)
                    .accessProp(this, env)
                    .name("detectCallbacks")
                    .set(
                            new ReferenceClassProperty(this, "options", env)
                                    .arrayGet(env, "dumperDetectCallbacks"));
            if (ZVal.isTrue(
                    new ReferenceClassProperty(this, "options", env)
                            .arrayGet(env, "enableEvalListener"))) {
                env.callMethod(connector, "startEvalRequestsListener", PHPConsoleHandler.class);
            }
        }

        return ZVal.assign(connector);
    }

    @ConvertedMethod
    public Object getConnector(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.connector);
    }

    @ConvertedMethod
    public Object getOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.options);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object handle(RuntimeEnv env, Object... args) {
        Object record = assignParameter(args, 0, false);
        if (ZVal.toBool(new ReferenceClassProperty(this, "options", env).arrayGet(env, "enabled"))
                && ZVal.toBool(
                        env.callMethod(
                                this.connector, "isActiveClient", PHPConsoleHandler.class))) {
            return ZVal.assign(super.handle(env, record));
        }

        return ZVal.assign(!toObjectR(this).accessProp(this, env).name("bubble").getBool());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object write(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (ZVal.isLessThan(record.arrayGet(env, "level"), '<', Logger.CONST_NOTICE)) {
            this.handleDebugRecord(env, record.getObject());

        } else if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, record, env, "context", "exception"))
                && ZVal.toBool(
                        ZVal.checkInstanceType(
                                record.arrayGet(env, "context", "exception"),
                                PHPException.class,
                                "Exception"))) {
            this.handleExceptionRecord(env, record.getObject());

        } else {
            this.handleErrorRecord(env, record.getObject());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    private Object handleDebugRecord(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object message = null;
        Object tags = null;
        tags =
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(0, record),
                        "getRecordTags",
                        PHPConsoleHandler.class,
                        record.getObject());
        message = ZVal.assign(record.arrayGet(env, "message"));
        if (ZVal.isTrue(record.arrayGet(env, "context"))) {
            message =
                    toStringR(message, env)
                            + " "
                            + toStringR(
                                    NamespaceGlobal.json_encode
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            env.callMethod(
                                                                    this.connector,
                                                                    "getDumper",
                                                                    PHPConsoleHandler.class),
                                                            "dump",
                                                            PHPConsoleHandler.class,
                                                            function_array_filter
                                                                    .f
                                                                    .env(env)
                                                                    .call(
                                                                            record.arrayGet(
                                                                                    env, "context"))
                                                                    .value()))
                                            .value(),
                                    env);
        }

        env.callMethod(
                env.callMethod(this.connector, "getDebugDispatcher", PHPConsoleHandler.class),
                "dispatchDebug",
                PHPConsoleHandler.class,
                message,
                tags,
                new ReferenceClassProperty(this, "options", env)
                        .arrayGet(env, "classesPartialsTraceIgnore"));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    private Object handleExceptionRecord(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        env.callMethod(
                env.callMethod(this.connector, "getErrorsDispatcher", PHPConsoleHandler.class),
                "dispatchException",
                PHPConsoleHandler.class,
                record.arrayGet(env, "context", "exception"));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    private Object handleErrorRecord(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer context = new BasicReferenceContainer(null);
        context.setObject(ZVal.assign(record.arrayGet(env, "context")));
        env.callMethod(
                env.callMethod(this.connector, "getErrorsDispatcher", PHPConsoleHandler.class),
                "dispatchError",
                PHPConsoleHandler.class,
                arrayActionR(ArrayAction.ISSET, context, env, "code")
                        ? context.arrayGet(env, "code")
                        : ZVal.getNull(),
                arrayActionR(ArrayAction.ISSET, context, env, "message")
                        ? context.arrayGet(env, "message")
                        : record.arrayGet(env, "message"),
                arrayActionR(ArrayAction.ISSET, context, env, "file")
                        ? context.arrayGet(env, "file")
                        : ZVal.getNull(),
                arrayActionR(ArrayAction.ISSET, context, env, "line")
                        ? context.arrayGet(env, "line")
                        : ZVal.getNull(),
                new ReferenceClassProperty(this, "options", env)
                        .arrayGet(env, "classesPartialsTraceIgnore"));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    private Object getRecordTags(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer record = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        ReferenceContainer context = new BasicReferenceContainer(null);
        Object ternaryExpressionTemp = null;
        Object key = null;
        Object tags = null;
        tags = ZVal.getNull();
        if (!arrayActionR(ArrayAction.EMPTY, record, env, "context")) {
            context = new ArrayDimensionReference(record.getObject(), "context");
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult797 :
                    ZVal.getIterable(
                            new ReferenceClassProperty(this, "options", env)
                                    .arrayGet(env, "debugTagsKeysInContext"),
                            env,
                            true)) {
                key = ZVal.assign(zpairResult797.getValue());
                if (!arrayActionR(ArrayAction.EMPTY, context, env, key)) {
                    tags = ZVal.assign(context.arrayGet(env, key));
                    if (ZVal.strictEqualityCheck(key, "===", 0)) {
                        function_array_shift.f.env(env).call(context.getObject());

                    } else {
                        arrayActionR(ArrayAction.UNSET, context, env, key);
                    }

                    break;
                }
            }
        }

        return ZVal.assign(
                ZVal.isTrue(ternaryExpressionTemp = tags)
                        ? ternaryExpressionTemp
                        : NamespaceGlobal.strtolower
                                .env(env)
                                .call(record.arrayGet(env, "level_name"))
                                .value());
    }

    public Object getRecordTags(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    protected Object getDefaultFormatter(RuntimeEnv env, Object... args) {
        return ZVal.assign(new LineFormatter(env, "%message%"));
    }

    public static final Object CONST_class = "Monolog\\Handler\\PHPConsoleHandler";

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
                    .setName("Monolog\\Handler\\PHPConsoleHandler")
                    .setLookup(
                            PHPConsoleHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bubble", "connector", "formatter", "level", "options", "processors")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/PHPConsoleHandler.php")
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
