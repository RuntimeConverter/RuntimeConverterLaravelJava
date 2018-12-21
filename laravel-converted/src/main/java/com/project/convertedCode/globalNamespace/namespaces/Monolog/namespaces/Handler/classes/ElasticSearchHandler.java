package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.exceptions.missingDefinitions.ClassNotFoundDuringConversion;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractProcessingHandler;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.ElasticaFormatter;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/ElasticSearchHandler.php

*/

public class ElasticSearchHandler extends AbstractProcessingHandler {

    public Object client = null;

    public Object options = ZVal.newArray();

    public ElasticSearchHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ElasticSearchHandler.class) {
            this.__construct(env, args);
        }
    }

    public ElasticSearchHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "client", typeHint = "Elastica\\Client")
    @ConvertedParameter(
        index = 1,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 2, name = "level")
    @ConvertedParameter(
        index = 3,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object client = assignParameter(args, 0, false);
        Object options = assignParameter(args, 1, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object level = assignParameter(args, 2, true);
        if (null == level) {
            level = Logger.CONST_DEBUG;
        }
        Object bubble = assignParameter(args, 3, true);
        if (null == bubble) {
            bubble = true;
        }
        super.__construct(env, level, bubble);
        this.client = client;
        this.options =
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair("index", "monolog"),
                                        new ZPair("type", "record"),
                                        new ZPair("ignore_error", false)),
                                options)
                        .value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object write(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        this.bulkSend(env, ZVal.newArray(new ZPair(0, record.arrayGet(env, "formatted"))));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "formatter",
        typeHint = "Monolog\\Formatter\\FormatterInterface"
    )
    public Object setFormatter(RuntimeEnv env, Object... args) {
        Object formatter = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        formatter,
                        ElasticaFormatter.class,
                        "Monolog\\Formatter\\ElasticaFormatter"))) {
            return ZVal.assign(super.setFormatter(env, formatter));
        }

        throw ZVal.getException(
                env,
                new InvalidArgumentException(
                        env, "ElasticSearchHandler is only compatible with ElasticaFormatter"));
    }

    @ConvertedMethod
    public Object getOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.options);
    }

    @ConvertedMethod
    protected Object getDefaultFormatter(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ElasticaFormatter(
                        env,
                        new ReferenceClassProperty(this, "options", env).arrayGet(env, "index"),
                        new ReferenceClassProperty(this, "options", env).arrayGet(env, "type")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "records", typeHint = "array")
    public Object handleBatch(RuntimeEnv env, Object... args) {
        Object records = assignParameter(args, 0, false);
        Object documents = null;
        documents =
                env.callMethod(
                        env.callMethod(this, "getFormatter", ElasticSearchHandler.class),
                        "formatBatch",
                        ElasticSearchHandler.class,
                        records);
        this.bulkSend(env, documents);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "documents", typeHint = "array")
    protected Object bulkSend(RuntimeEnv env, Object... args) {
        Object documents = assignParameter(args, 0, false);
        Object e = null;
        try {
            env.callMethod(this.client, "addDocuments", ElasticSearchHandler.class, documents);
        } catch (ConvertedException convertedException90) {
            if (ClassNotFoundDuringConversion.missingClassInCatchBlock("ExceptionInterface")) {
                e = convertedException90.getObject();
                if (!ZVal.isTrue(
                        new ReferenceClassProperty(this, "options", env)
                                .arrayGet(env, "ignore_error"))) {
                    throw ZVal.getException(
                            env,
                            new RuntimeException(
                                    env, "Error sending messages to Elasticsearch", 0, e));
                }

            } else {
                throw convertedException90;
            }
        }

        return null;
    }

    public static final Object CONST_class = "Monolog\\Handler\\ElasticSearchHandler";

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
                    .setName("Monolog\\Handler\\ElasticSearchHandler")
                    .setLookup(
                            ElasticSearchHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bubble", "client", "formatter", "level", "options", "processors")
                    .setFilename(
                            "vendor/monolog/monolog/src/Monolog/Handler/ElasticSearchHandler.php")
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
