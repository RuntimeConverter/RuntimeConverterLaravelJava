package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.LogglyFormatter;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.namespaces.Curl.classes.Util;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractProcessingHandler;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_extension_loaded;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/LogglyHandler.php

*/

public class LogglyHandler extends AbstractProcessingHandler {

    public Object token = null;

    public Object tag = ZVal.newArray();

    public LogglyHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == LogglyHandler.class) {
            this.__construct(env, args);
        }
    }

    public LogglyHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token")
    @ConvertedParameter(index = 1, name = "level")
    @ConvertedParameter(
        index = 2,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object token = assignParameter(args, 0, false);
        Object level = assignParameter(args, 1, true);
        if (null == level) {
            level = Logger.CONST_DEBUG;
        }
        Object bubble = assignParameter(args, 2, true);
        if (null == bubble) {
            bubble = true;
        }
        if (!function_extension_loaded.f.env(env).call("curl").getBool()) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env, "The curl extension is needed to use the LogglyHandler"));
        }

        this.token = token;
        super.__construct(env, level, bubble);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tag")
    public Object setTag(RuntimeEnv env, Object... args) {
        Object tag = assignParameter(args, 0, false);
        tag = ZVal.assign(!ZVal.isEmpty(tag) ? tag : ZVal.newArray());
        this.tag =
                function_is_array.f.env(env).call(tag).getBool()
                        ? tag
                        : ZVal.newArray(new ZPair(0, tag));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tag")
    public Object addTag(RuntimeEnv env, Object... args) {
        Object tag = assignParameter(args, 0, false);
        if (!ZVal.isEmpty(tag)) {
            tag =
                    ZVal.assign(
                            function_is_array.f.env(env).call(tag).getBool()
                                    ? tag
                                    : ZVal.newArray(new ZPair(0, tag)));
            this.tag =
                    function_array_unique
                            .f
                            .env(env)
                            .call(function_array_merge.f.env(env).call(this.tag, tag).value())
                            .value();
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object write(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        this.send(env, record.arrayGet(env, "formatted"), CONST_ENDPOINT_SINGLE);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "records", typeHint = "array")
    public Object handleBatch(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/monolog/monolog/src/Monolog/Handler")
                        .setFile("/vendor/monolog/monolog/src/Monolog/Handler/LogglyHandler.php");
        Object records = assignParameter(args, 0, false);
        Object level = null;
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
        if (ZVal.isTrue(records)) {
            this.send(
                    env,
                    env.callMethod(
                            env.callMethod(this, "getFormatter", LogglyHandler.class),
                            "formatBatch",
                            LogglyHandler.class,
                            records),
                    CONST_ENDPOINT_BATCH);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    @ConvertedParameter(index = 1, name = "endpoint")
    protected Object send(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        Object endpoint = assignParameter(args, 1, false);
        ReferenceContainer headers = new BasicReferenceContainer(null);
        Object ch = null;
        Object url = null;
        url =
                function_sprintf
                        .f
                        .env(env)
                        .call("https://%s/%s/%s/", CONST_HOST, endpoint, this.token)
                        .value();
        headers.setObject(ZVal.arrayFromList("Content-Type: application/json"));
        if (!ZVal.isEmpty(this.tag)) {
            headers.arrayAppend(env)
                    .set(
                            "X-LOGGLY-TAG: "
                                    + toStringR(
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call(",", this.tag)
                                                    .value(),
                                            env));
        }

        ch = NamespaceGlobal.curl_init.env(env).call().value();
        NamespaceGlobal.curl_setopt.env(env).call(ch, 10002, url);
        NamespaceGlobal.curl_setopt.env(env).call(ch, 47, true);
        NamespaceGlobal.curl_setopt.env(env).call(ch, 10015, data);
        NamespaceGlobal.curl_setopt.env(env).call(ch, 10023, headers.getObject());
        NamespaceGlobal.curl_setopt.env(env).call(ch, 19913, true);
        Util.runtimeStaticObject.execute(env, ch);
        return null;
    }

    @ConvertedMethod
    protected Object getDefaultFormatter(RuntimeEnv env, Object... args) {
        return ZVal.assign(new LogglyFormatter(env));
    }

    public static final Object CONST_HOST = "logs-01.loggly.com";

    public static final Object CONST_ENDPOINT_SINGLE = "inputs";

    public static final Object CONST_ENDPOINT_BATCH = "bulk";

    public static final Object CONST_class = "Monolog\\Handler\\LogglyHandler";

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
                    .setName("Monolog\\Handler\\LogglyHandler")
                    .setLookup(
                            LogglyHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bubble", "formatter", "level", "processors", "tag", "token")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/LogglyHandler.php")
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
