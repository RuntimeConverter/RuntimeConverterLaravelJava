package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.http.function_header;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractProcessingHandler;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.ChromePHPFormatter;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/ChromePHPHandler.php

*/

public class ChromePHPHandler extends AbstractProcessingHandler {

    public ChromePHPHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ChromePHPHandler.class) {
            this.__construct(env, args);
        }
    }

    public ChromePHPHandler(NoConstructor n) {
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
        super.__construct(env, level, bubble);
        if (!function_function_exists.f.env(env).call("json_encode").getBool()) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            "PHP's json extension is required to use Monolog's ChromePHPHandler"));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "records", typeHint = "array")
    public Object handleBatch(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object records = assignParameter(args, 0, false);
        ReferenceContainer record = new BasicReferenceContainer(null);
        ReferenceContainer messages = new BasicReferenceContainer(null);
        messages.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult770 : ZVal.getIterable(records, env, true)) {
            record.setObject(ZVal.assign(zpairResult770.getValue()));
            if (ZVal.isLessThan(
                    record.arrayGet(env, "level"),
                    '<',
                    toObjectR(this).accessProp(this, env).name("level").value())) {
                continue;
            }

            messages.arrayAppend(env)
                    .set(
                            env.callMethod(
                                    this,
                                    "processRecord",
                                    ChromePHPHandler.class,
                                    record.getObject()));
        }

        if (!ZVal.isEmpty(messages.getObject())) {
            messages.setObject(
                    env.callMethod(
                            env.callMethod(this, "getFormatter", ChromePHPHandler.class),
                            "formatBatch",
                            ChromePHPHandler.class,
                            messages.getObject()));
            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Monolog
                                    .namespaces
                                    .Handler
                                    .classes
                                    .ChromePHPHandler
                                    .RequestStaticProperties
                                    .class,
                            "json")
                    .arrayAccess(env, "rows")
                    .set(
                            function_array_merge
                                    .f
                                    .env(env)
                                    .call(
                                            env.getRequestStaticPropertiesReference(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Monolog
                                                                    .namespaces
                                                                    .Handler
                                                                    .classes
                                                                    .ChromePHPHandler
                                                                    .RequestStaticProperties
                                                                    .class,
                                                            "json")
                                                    .arrayGet(env, "rows"),
                                            messages.getObject())
                                    .value());
            this.send(env);
        }

        return null;
    }

    @ConvertedMethod
    protected Object getDefaultFormatter(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ChromePHPFormatter(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object write(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Monolog
                                .namespaces
                                .Handler
                                .classes
                                .ChromePHPHandler
                                .RequestStaticProperties
                                .class,
                        "json")
                .arrayAppend(env, "rows")
                .set(record.arrayGet(env, "formatted"));
        this.send(env);
        return null;
    }

    @ConvertedMethod
    protected Object send(RuntimeEnv env, Object... args) {
        Object data = null;
        ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
        Object record = null;
        Object json = null;
        if (ZVal.toBool(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Monolog
                                                .namespaces
                                                .Handler
                                                .classes
                                                .ChromePHPHandler
                                                .RequestStaticProperties
                                                .class)
                                .overflowed)
                || ZVal.toBool(
                        !ZVal.isTrue(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Monolog
                                                        .namespaces
                                                        .Handler
                                                        .classes
                                                        .ChromePHPHandler
                                                        .RequestStaticProperties
                                                        .class)
                                        .sendHeaders))) {
            return null;
        }

        if (!ZVal.isTrue(
                env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Monolog
                                        .namespaces
                                        .Handler
                                        .classes
                                        .ChromePHPHandler
                                        .RequestStaticProperties
                                        .class)
                        .initialized)) {
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Monolog
                                            .namespaces
                                            .Handler
                                            .classes
                                            .ChromePHPHandler
                                            .RequestStaticProperties
                                            .class)
                            .initialized =
                    true;
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Monolog
                                            .namespaces
                                            .Handler
                                            .classes
                                            .ChromePHPHandler
                                            .RequestStaticProperties
                                            .class)
                            .sendHeaders =
                    this.headersAccepted(env);
            if (!ZVal.isTrue(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Monolog
                                            .namespaces
                                            .Handler
                                            .classes
                                            .ChromePHPHandler
                                            .RequestStaticProperties
                                            .class)
                            .sendHeaders)) {
                return null;
            }

            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Monolog
                                    .namespaces
                                    .Handler
                                    .classes
                                    .ChromePHPHandler
                                    .RequestStaticProperties
                                    .class,
                            "json")
                    .arrayAccess(env, "request_uri")
                    .set(
                            arrayActionR(ArrayAction.ISSET, _SERVER, env, "REQUEST_URI")
                                    ? _SERVER.arrayGet(env, "REQUEST_URI")
                                    : "");
        }

        json =
                NamespaceGlobal.json_encode
                        .env(env)
                        .call(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Monolog
                                                        .namespaces
                                                        .Handler
                                                        .classes
                                                        .ChromePHPHandler
                                                        .RequestStaticProperties
                                                        .class)
                                        .json)
                        .value();
        data =
                NamespaceGlobal.base64_encode
                        .env(env)
                        .call(NamespaceGlobal.utf8_encode.env(env).call(json).value())
                        .value();
        if (ZVal.isGreaterThan(
                function_strlen.f.env(env).call(data).value(), '>', ZVal.multiply(240, 1024))) {
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Monolog
                                            .namespaces
                                            .Handler
                                            .classes
                                            .ChromePHPHandler
                                            .RequestStaticProperties
                                            .class)
                            .overflowed =
                    true;
            record =
                    ZVal.newArray(
                            new ZPair(
                                    "message", "Incomplete logs, chrome header size limit reached"),
                            new ZPair("context", ZVal.newArray()),
                            new ZPair("level", Logger.CONST_WARNING),
                            new ZPair(
                                    "level_name",
                                    Logger.runtimeStaticObject.getLevelName(
                                            env, Logger.CONST_WARNING)),
                            new ZPair("channel", "monolog"),
                            new ZPair("datetime", new DateTime(env)),
                            new ZPair("extra", ZVal.newArray()));
            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Monolog
                                    .namespaces
                                    .Handler
                                    .classes
                                    .ChromePHPHandler
                                    .RequestStaticProperties
                                    .class,
                            "json")
                    .arrayAccess(
                            env,
                            "rows",
                            ZVal.subtract(
                                    function_count
                                            .f
                                            .env(env)
                                            .call(
                                                    env.getRequestStaticPropertiesReference(
                                                                    com.project
                                                                            .convertedCode
                                                                            .globalNamespace
                                                                            .namespaces
                                                                            .Monolog
                                                                            .namespaces
                                                                            .Handler
                                                                            .classes
                                                                            .ChromePHPHandler
                                                                            .RequestStaticProperties
                                                                            .class,
                                                                    "json")
                                                            .arrayGet(env, "rows"))
                                            .value(),
                                    1))
                    .set(
                            env.callMethod(
                                    env.callMethod(this, "getFormatter", ChromePHPHandler.class),
                                    "format",
                                    ChromePHPHandler.class,
                                    record));
            json =
                    NamespaceGlobal.json_encode
                            .env(env)
                            .call(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Monolog
                                                            .namespaces
                                                            .Handler
                                                            .classes
                                                            .ChromePHPHandler
                                                            .RequestStaticProperties
                                                            .class)
                                            .json)
                            .value();
            data =
                    NamespaceGlobal.base64_encode
                            .env(env)
                            .call(NamespaceGlobal.utf8_encode.env(env).call(json).value())
                            .value();
        }

        if (ZVal.strictNotEqualityCheck(function_trim.f.env(env).call(data).value(), "!==", "")) {
            this.sendHeader(env, CONST_HEADER_NAME, data);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "header")
    @ConvertedParameter(index = 1, name = "content")
    protected Object sendHeader(RuntimeEnv env, Object... args) {
        Object header = assignParameter(args, 0, false);
        Object content = assignParameter(args, 1, false);
        if (ZVal.toBool(!NamespaceGlobal.headers_sent.env(env).call().getBool())
                && ZVal.toBool(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Monolog
                                                .namespaces
                                                .Handler
                                                .classes
                                                .ChromePHPHandler
                                                .RequestStaticProperties
                                                .class)
                                .sendHeaders)) {
            function_header
                    .f
                    .env(env)
                    .call(function_sprintf.f.env(env).call("%s: %s", header, content).value());
        }

        return null;
    }

    @ConvertedMethod
    protected Object headersAccepted(RuntimeEnv env, Object... args) {
        ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
        if (arrayActionR(ArrayAction.EMPTY, _SERVER, env, "HTTP_USER_AGENT")) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                function_preg_match
                        .f
                        .env(env)
                        .call(CONST_USER_AGENT_REGEX, _SERVER.arrayGet(env, "HTTP_USER_AGENT"))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "property")
    public Object __get(RuntimeEnv env, Object... args) {
        Object property = assignParameter(args, 0, false);
        if (ZVal.strictNotEqualityCheck("sendHeaders", "!==", property)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Undefined property " + toStringR(property, env)));
        }

        return ZVal.assign(
                env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Monolog
                                        .namespaces
                                        .Handler
                                        .classes
                                        .ChromePHPHandler
                                        .RequestStaticProperties
                                        .class)
                        .sendHeaders);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "property")
    @ConvertedParameter(index = 1, name = "value")
    public Object __set(RuntimeEnv env, Object... args) {
        Object property = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        if (ZVal.strictNotEqualityCheck("sendHeaders", "!==", property)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Undefined property " + toStringR(property, env)));
        }

        env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Monolog
                                        .namespaces
                                        .Handler
                                        .classes
                                        .ChromePHPHandler
                                        .RequestStaticProperties
                                        .class)
                        .sendHeaders =
                value;
        return null;
    }

    public static final Object CONST_VERSION = "4.0";

    public static final Object CONST_HEADER_NAME = "X-ChromeLogger-Data";

    public static final Object CONST_USER_AGENT_REGEX =
            "{\\b(?:Chrome/\\d+(?:\\.\\d+)*|HeadlessChrome|Firefox/(?:4[3-9]|[5-9]\\d|\\d{3,})(?:\\.\\d)*)\\b}";

    public static final Object CONST_class = "Monolog\\Handler\\ChromePHPHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends AbstractProcessingHandler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object initialized = false;

        public Object overflowed = false;

        public Object json =
                ZVal.newArray(
                        new ZPair("version", CONST_VERSION),
                        new ZPair(
                                "columns", ZVal.arrayFromList("label", "log", "backtrace", "type")),
                        new ZPair("rows", ZVal.newArray()));

        public Object sendHeaders = true;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Handler\\ChromePHPHandler")
                    .setLookup(
                            ChromePHPHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bubble", "formatter", "level", "processors")
                    .setStaticPropertyNames("initialized", "json", "overflowed", "sendHeaders")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/ChromePHPHandler.php")
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
