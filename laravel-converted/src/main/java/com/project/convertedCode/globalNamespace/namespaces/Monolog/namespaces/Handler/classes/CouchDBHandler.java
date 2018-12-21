package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractProcessingHandler;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.JsonFormatter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/CouchDBHandler.php

*/

public class CouchDBHandler extends AbstractProcessingHandler {

    public Object options = null;

    public CouchDBHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CouchDBHandler.class) {
            this.__construct(env, args);
        }
    }

    public CouchDBHandler(NoConstructor n) {
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
    @ConvertedParameter(index = 1, name = "level")
    @ConvertedParameter(
        index = 2,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object level = assignParameter(args, 1, true);
        if (null == level) {
            level = Logger.CONST_DEBUG;
        }
        Object bubble = assignParameter(args, 2, true);
        if (null == bubble) {
            bubble = true;
        }
        this.options =
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair("host", "localhost"),
                                        new ZPair("port", 5984),
                                        new ZPair("dbname", "logger"),
                                        new ZPair("username", ZVal.getNull()),
                                        new ZPair("password", ZVal.getNull())),
                                options)
                        .value();
        super.__construct(env, level, bubble);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object write(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object basicAuth = null;
        Object context = null;
        Object url = null;
        basicAuth = ZVal.getNull();
        if (ZVal.isTrue(
                new ReferenceClassProperty(this, "options", env).arrayGet(env, "username"))) {
            basicAuth =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "%s:%s@",
                                    new ReferenceClassProperty(this, "options", env)
                                            .arrayGet(env, "username"),
                                    new ReferenceClassProperty(this, "options", env)
                                            .arrayGet(env, "password"))
                            .value();
        }

        url =
                "http://"
                        + toStringR(basicAuth, env)
                        + toStringR(
                                new ReferenceClassProperty(this, "options", env)
                                        .arrayGet(env, "host"),
                                env)
                        + ":"
                        + toStringR(
                                new ReferenceClassProperty(this, "options", env)
                                        .arrayGet(env, "port"),
                                env)
                        + "/"
                        + toStringR(
                                new ReferenceClassProperty(this, "options", env)
                                        .arrayGet(env, "dbname"),
                                env);
        context =
                NamespaceGlobal.stream_context_create
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair(
                                                "http",
                                                ZVal.newArray(
                                                        new ZPair("method", "POST"),
                                                        new ZPair(
                                                                "content",
                                                                record.arrayGet(env, "formatted")),
                                                        new ZPair("ignore_errors", true),
                                                        new ZPair("max_redirects", 0),
                                                        new ZPair(
                                                                "header",
                                                                "Content-type: application/json")))))
                        .value();
        if (ZVal.strictEqualityCheck(
                false,
                "===",
                function_file_get_contents.f.env(env).call(url, ZVal.getNull(), context).value())) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Could not connect to %s", url)
                                    .value()));
        }

        return null;
    }

    @ConvertedMethod
    protected Object getDefaultFormatter(RuntimeEnv env, Object... args) {
        return ZVal.assign(new JsonFormatter(env, JsonFormatter.CONST_BATCH_MODE_JSON, false));
    }

    public static final Object CONST_class = "Monolog\\Handler\\CouchDBHandler";

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
                    .setName("Monolog\\Handler\\CouchDBHandler")
                    .setLookup(
                            CouchDBHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bubble", "formatter", "level", "options", "processors")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/CouchDBHandler.php")
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
