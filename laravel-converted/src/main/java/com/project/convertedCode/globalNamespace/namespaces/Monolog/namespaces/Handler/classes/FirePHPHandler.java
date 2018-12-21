package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.http.function_header;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.nativeFunctions.array.function_key;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.WildfireFormatter;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractProcessingHandler;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_current;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/FirePHPHandler.php

*/

public class FirePHPHandler extends AbstractProcessingHandler {

    public FirePHPHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FirePHPHandler.class) {
            this.__construct(env, args);
        }
    }

    public FirePHPHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "meta", typeHint = "array")
    @ConvertedParameter(index = 1, name = "message")
    protected Object createHeader(RuntimeEnv env, Object... args) {
        Object meta = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, false);
        Object header = null;
        header =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%s-%s",
                                CONST_HEADER_PREFIX,
                                NamespaceGlobal.join.env(env).call("-", meta).value())
                        .value();
        return ZVal.assign(ZVal.newArray(new ZPair(header, message)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object createRecordHeader(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                this.createHeader(
                        env,
                        ZVal.newArray(
                                new ZPair(0, 1),
                                new ZPair(1, 1),
                                new ZPair(2, 1),
                                new ZPair(
                                        3,
                                        ZVal.postIncrement(
                                                env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Monolog
                                                                .namespaces
                                                                .Handler
                                                                .classes
                                                                .FirePHPHandler
                                                                .RequestStaticProperties
                                                                .class,
                                                        "messageIndex")))),
                        record.arrayGet(env, "formatted")));
    }

    @ConvertedMethod
    protected Object getDefaultFormatter(RuntimeEnv env, Object... args) {
        return ZVal.assign(new WildfireFormatter(env));
    }

    @ConvertedMethod
    protected Object getInitHeaders(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                this.createHeader(
                                        env, ZVal.arrayFromList("Protocol", 1), CONST_PROTOCOL_URI),
                                this.createHeader(
                                        env,
                                        ZVal.arrayFromList(1, "Structure", 1),
                                        CONST_STRUCTURE_URI),
                                this.createHeader(
                                        env, ZVal.arrayFromList(1, "Plugin", 1), CONST_PLUGIN_URI))
                        .value());
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
                                                .FirePHPHandler
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
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object write(RuntimeEnv env, Object... args) {
        Object record = assignParameter(args, 0, false);
        Object header = null;
        Object content = null;
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
                                        .FirePHPHandler
                                        .RequestStaticProperties
                                        .class)
                        .sendHeaders)) {
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
                                        .FirePHPHandler
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
                                            .FirePHPHandler
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
                                            .FirePHPHandler
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
                                            .FirePHPHandler
                                            .RequestStaticProperties
                                            .class)
                            .sendHeaders)) {
                return null;
            }

            for (ZPair zpairResult777 : ZVal.getIterable(this.getInitHeaders(env), env, false)) {
                header = ZVal.assign(zpairResult777.getKey());
                content = ZVal.assign(zpairResult777.getValue());
                this.sendHeader(env, header, content);
            }
        }

        header = this.createRecordHeader(env, record);
        if (ZVal.strictNotEqualityCheck(
                function_trim
                        .f
                        .env(env)
                        .call(function_current.f.env(env).call(header).value())
                        .value(),
                "!==",
                "")) {
            this.sendHeader(
                    env,
                    function_key.f.env(env).call(header).value(),
                    function_current.f.env(env).call(header).value());
        }

        return null;
    }

    @ConvertedMethod
    protected Object headersAccepted(RuntimeEnv env, Object... args) {
        ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
        if (ZVal.toBool(!arrayActionR(ArrayAction.EMPTY, _SERVER, env, "HTTP_USER_AGENT"))
                && ZVal.toBool(
                        function_preg_match
                                .f
                                .env(env)
                                .call(
                                        "{\\bFirePHP/\\d+\\.\\d+\\b}",
                                        _SERVER.arrayGet(env, "HTTP_USER_AGENT"))
                                .value())) {
            return ZVal.assign(true);
        }

        return ZVal.assign(arrayActionR(ArrayAction.ISSET, _SERVER, env, "HTTP_X_FIREPHP_VERSION"));
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
                                        .FirePHPHandler
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
                                        .FirePHPHandler
                                        .RequestStaticProperties
                                        .class)
                        .sendHeaders =
                value;
        return null;
    }

    public static final Object CONST_PROTOCOL_URI =
            "http://meta.wildfirehq.org/Protocol/JsonStream/0.2";

    public static final Object CONST_STRUCTURE_URI =
            "http://meta.firephp.org/Wildfire/Structure/FirePHP/FirebugConsole/0.1";

    public static final Object CONST_PLUGIN_URI =
            "http://meta.firephp.org/Wildfire/Plugin/FirePHP/Library-FirePHPCore/0.3";

    public static final Object CONST_HEADER_PREFIX = "X-Wf";

    public static final Object CONST_class = "Monolog\\Handler\\FirePHPHandler";

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

        public Object messageIndex = 1;

        public Object sendHeaders = true;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Handler\\FirePHPHandler")
                    .setLookup(
                            FirePHPHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bubble", "formatter", "level", "processors")
                    .setStaticPropertyNames("initialized", "messageIndex", "sendHeaders")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/FirePHPHandler.php")
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
