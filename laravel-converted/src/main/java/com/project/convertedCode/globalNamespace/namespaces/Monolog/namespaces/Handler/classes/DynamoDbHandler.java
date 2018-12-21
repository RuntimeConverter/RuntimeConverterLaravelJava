package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractProcessingHandler;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.ScalarFormatter;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/DynamoDbHandler.php

*/

public class DynamoDbHandler extends AbstractProcessingHandler {

    public Object client = null;

    public Object table = null;

    public Object version = null;

    public Object marshaler = null;

    public DynamoDbHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DynamoDbHandler.class) {
            this.__construct(env, args);
        }
    }

    public DynamoDbHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "client", typeHint = "Aws\\DynamoDb\\DynamoDbClient")
    @ConvertedParameter(index = 1, name = "table")
    @ConvertedParameter(index = 2, name = "level")
    @ConvertedParameter(
        index = 3,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object client = assignParameter(args, 0, false);
        Object table = assignParameter(args, 1, false);
        Object level = assignParameter(args, 2, true);
        if (null == level) {
            level = Logger.CONST_DEBUG;
        }
        Object bubble = assignParameter(args, 3, true);
        if (null == bubble) {
            bubble = true;
        }
        if (ZVal.toBool(function_defined.f.env(env).call("Aws\\Sdk::VERSION").value())
                && ZVal.toBool(
                        NamespaceGlobal.version_compare
                                .env(env)
                                .call(
                                        ClassConstantUtils.getConstantValueByClass(
                                                env, ZVal.resolveClassAlias(env, "Sdk"), "VERSION"),
                                        "3.0",
                                        ">=")
                                .value())) {
            this.version = 3;
            this.marshaler = env.createNew(ZVal.resolveClassAlias(env, "Marshaler"));

        } else {
            this.version = 2;
        }

        this.client = client;
        this.table = table;
        super.__construct(env, level, bubble);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object write(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object filtered = null;
        Object formatted = null;
        filtered = this.filterEmptyFields(env, record.arrayGet(env, "formatted"));
        if (ZVal.strictEqualityCheck(this.version, "===", 3)) {
            formatted =
                    env.callMethod(this.marshaler, "marshalItem", DynamoDbHandler.class, filtered);

        } else {
            formatted =
                    env.callMethod(
                            this.client, "formatAttributes", DynamoDbHandler.class, filtered);
        }

        env.callMethod(
                this.client,
                "putItem",
                DynamoDbHandler.class,
                ZVal.newArray(new ZPair("TableName", this.table), new ZPair("Item", formatted)));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object filterEmptyFields(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/monolog/monolog/src/Monolog/Handler")
                        .setFile("/vendor/monolog/monolog/src/Monolog/Handler/DynamoDbHandler.php");
        Object record = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                record,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Monolog\\Handler",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "value")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object value = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                ZVal.toBool(
                                                                ZVal.toBool(!ZVal.isEmpty(value))
                                                                        || ZVal.toBool(
                                                                                ZVal
                                                                                        .strictEqualityCheck(
                                                                                                false,
                                                                                                "===",
                                                                                                value)))
                                                        || ZVal.toBool(
                                                                ZVal.strictEqualityCheck(
                                                                        0, "===", value)));
                                    }
                                })
                        .value());
    }

    @ConvertedMethod
    protected Object getDefaultFormatter(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ScalarFormatter(env, CONST_DATE_FORMAT));
    }

    public static final Object CONST_DATE_FORMAT = "Y-m-d\\TH:i:s.uO";

    public static final Object CONST_class = "Monolog\\Handler\\DynamoDbHandler";

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
                    .setName("Monolog\\Handler\\DynamoDbHandler")
                    .setLookup(
                            DynamoDbHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bubble",
                            "client",
                            "formatter",
                            "level",
                            "marshaler",
                            "processors",
                            "table",
                            "version")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/DynamoDbHandler.php")
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
