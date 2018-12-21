package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_scalar;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.MissingExtensionException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.NormalizerFormatter;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractProcessingHandler;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_extension_loaded;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/NewRelicHandler.php

*/

public class NewRelicHandler extends AbstractProcessingHandler {

    public Object appName = null;

    public Object transactionName = null;

    public Object explodeArrays = null;

    public NewRelicHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == NewRelicHandler.class) {
            this.__construct(env, args);
        }
    }

    public NewRelicHandler(NoConstructor n) {
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
    @ConvertedParameter(
        index = 2,
        name = "appName",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "explodeArrays",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "transactionName",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, true);
        if (null == level) {
            level = Logger.CONST_ERROR;
        }
        Object bubble = assignParameter(args, 1, true);
        if (null == bubble) {
            bubble = true;
        }
        Object appName = assignParameter(args, 2, true);
        if (null == appName) {
            appName = ZVal.getNull();
        }
        Object explodeArrays = assignParameter(args, 3, true);
        if (null == explodeArrays) {
            explodeArrays = false;
        }
        Object transactionName = assignParameter(args, 4, true);
        if (null == transactionName) {
            transactionName = ZVal.getNull();
        }
        super.__construct(env, level, bubble);
        this.appName = appName;
        this.explodeArrays = explodeArrays;
        this.transactionName = transactionName;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object write(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object paramKey = null;
        Object appName = null;
        Object parameter = null;
        Object transactionName = null;
        Object key = null;
        Object paramValue = null;
        if (!ZVal.isTrue(this.isNewRelicEnabled(env))) {
            throw ZVal.getException(
                    env,
                    new MissingExtensionException(
                            env,
                            "The newrelic PHP extension is required to use the NewRelicHandler"));
        }

        if (ZVal.isTrue(appName = this.getAppName(env, record.arrayGet(env, "context")))) {
            this.setNewRelicAppName(env, appName);
        }

        if (ZVal.isTrue(
                transactionName = this.getTransactionName(env, record.arrayGet(env, "context")))) {
            this.setNewRelicTransactionName(env, transactionName);
            arrayActionR(
                    ArrayAction.UNSET, record, env, "formatted", "context", "transaction_name");
        }

        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, record, env, "context", "exception"))
                && ZVal.toBool(
                        ZVal.checkInstanceType(
                                record.arrayGet(env, "context", "exception"),
                                PHPException.class,
                                "Exception"))) {
            com.runtimeconverter.runtime.ZVal.functionNotFound("newrelic_notice_error")
                    .env(env)
                    .call(
                            record.arrayGet(env, "message"),
                            record.arrayGet(env, "context", "exception"));
            arrayActionR(ArrayAction.UNSET, record, env, "formatted", "context", "exception");

        } else {
            com.runtimeconverter.runtime.ZVal.functionNotFound("newrelic_notice_error")
                    .env(env)
                    .call(record.arrayGet(env, "message"));
        }

        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, record, env, "formatted", "context"))
                && ZVal.toBool(
                        function_is_array
                                .f
                                .env(env)
                                .call(record.arrayGet(env, "formatted", "context"))
                                .value())) {
            for (ZPair zpairResult793 :
                    ZVal.getIterable(record.arrayGet(env, "formatted", "context"), env, false)) {
                key = ZVal.assign(zpairResult793.getKey());
                parameter = ZVal.assign(zpairResult793.getValue());
                if (ZVal.toBool(function_is_array.f.env(env).call(parameter).value())
                        && ZVal.toBool(this.explodeArrays)) {
                    for (ZPair zpairResult794 : ZVal.getIterable(parameter, env, false)) {
                        paramKey = ZVal.assign(zpairResult794.getKey());
                        paramValue = ZVal.assign(zpairResult794.getValue());
                        this.setNewRelicParameter(
                                env,
                                "context_" + toStringR(key, env) + "_" + toStringR(paramKey, env),
                                paramValue);
                    }

                } else {
                    this.setNewRelicParameter(env, "context_" + toStringR(key, env), parameter);
                }
            }
        }

        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, record, env, "formatted", "extra"))
                && ZVal.toBool(
                        function_is_array
                                .f
                                .env(env)
                                .call(record.arrayGet(env, "formatted", "extra"))
                                .value())) {
            for (ZPair zpairResult795 :
                    ZVal.getIterable(record.arrayGet(env, "formatted", "extra"), env, false)) {
                key = ZVal.assign(zpairResult795.getKey());
                parameter = ZVal.assign(zpairResult795.getValue());
                if (ZVal.toBool(function_is_array.f.env(env).call(parameter).value())
                        && ZVal.toBool(this.explodeArrays)) {
                    for (ZPair zpairResult796 : ZVal.getIterable(parameter, env, false)) {
                        paramKey = ZVal.assign(zpairResult796.getKey());
                        paramValue = ZVal.assign(zpairResult796.getValue());
                        this.setNewRelicParameter(
                                env,
                                "extra_" + toStringR(key, env) + "_" + toStringR(paramKey, env),
                                paramValue);
                    }

                } else {
                    this.setNewRelicParameter(env, "extra_" + toStringR(key, env), parameter);
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    protected Object isNewRelicEnabled(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_extension_loaded.f.env(env).call("newrelic").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "context", typeHint = "array")
    protected Object getAppName(RuntimeEnv env, Object... args) {
        ReferenceContainer context = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (arrayActionR(ArrayAction.ISSET, context, env, "appname")) {
            return ZVal.assign(context.arrayGet(env, "appname"));
        }

        return ZVal.assign(this.appName);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "context", typeHint = "array")
    protected Object getTransactionName(RuntimeEnv env, Object... args) {
        ReferenceContainer context = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (arrayActionR(ArrayAction.ISSET, context, env, "transaction_name")) {
            return ZVal.assign(context.arrayGet(env, "transaction_name"));
        }

        return ZVal.assign(this.transactionName);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "appName")
    protected Object setNewRelicAppName(RuntimeEnv env, Object... args) {
        Object appName = assignParameter(args, 0, false);
        com.runtimeconverter.runtime.ZVal.functionNotFound("newrelic_set_appname")
                .env(env)
                .call(appName);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "transactionName")
    protected Object setNewRelicTransactionName(RuntimeEnv env, Object... args) {
        Object transactionName = assignParameter(args, 0, false);
        com.runtimeconverter.runtime.ZVal.functionNotFound("newrelic_name_transaction")
                .env(env)
                .call(transactionName);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    protected Object setNewRelicParameter(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        if (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", value))
                || ZVal.toBool(function_is_scalar.f.env(env).call(value).value())) {
            com.runtimeconverter.runtime.ZVal.functionNotFound("newrelic_add_custom_parameter")
                    .env(env)
                    .call(key, value);

        } else {
            com.runtimeconverter.runtime.ZVal.functionNotFound("newrelic_add_custom_parameter")
                    .env(env)
                    .call(key, NamespaceGlobal.json_encode.env(env).call(value).value());
        }

        return null;
    }

    @ConvertedMethod
    protected Object getDefaultFormatter(RuntimeEnv env, Object... args) {
        return ZVal.assign(new NormalizerFormatter(env));
    }

    public static final Object CONST_class = "Monolog\\Handler\\NewRelicHandler";

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
                    .setName("Monolog\\Handler\\NewRelicHandler")
                    .setLookup(
                            NewRelicHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "appName",
                            "bubble",
                            "explodeArrays",
                            "formatter",
                            "level",
                            "processors",
                            "transactionName")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/NewRelicHandler.php")
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
