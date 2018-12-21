package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.classes.TranslatorInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.classes.Translator;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.classes.TranslatorBagInterface;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/LoggingTranslator.php

*/

public class LoggingTranslator extends RuntimeClassBase
        implements TranslatorInterface, TranslatorBagInterface {

    public Object translator = null;

    public Object logger = null;

    public LoggingTranslator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == LoggingTranslator.class) {
            this.__construct(env, args);
        }
    }

    public LoggingTranslator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "translator",
        typeHint = "Symfony\\Component\\Translation\\TranslatorInterface"
    )
    @ConvertedParameter(index = 1, name = "logger", typeHint = "Psr\\Log\\LoggerInterface")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object translator = assignParameter(args, 0, false);
        Object logger = assignParameter(args, 1, false);
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        translator,
                        TranslatorBagInterface.class,
                        "Symfony\\Component\\Translation\\TranslatorBagInterface"))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "The Translator \"%s\" must implement TranslatorInterface and TranslatorBagInterface.",
                                            function_get_class.f.env(env).call(translator).value())
                                    .value()));
        }

        this.translator = translator;
        this.logger = logger;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "domain",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "locale",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object trans(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        Object domain = assignParameter(args, 2, true);
        if (null == domain) {
            domain = ZVal.getNull();
        }
        Object locale = assignParameter(args, 3, true);
        if (null == locale) {
            locale = ZVal.getNull();
        }
        Object trans = null;
        trans =
                env.callMethod(
                        this.translator,
                        "trans",
                        LoggingTranslator.class,
                        id,
                        parameters,
                        domain,
                        locale);
        this.log(env, id, domain, locale);
        return ZVal.assign(trans);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    @ConvertedParameter(index = 1, name = "number")
    @ConvertedParameter(
        index = 2,
        name = "parameters",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "domain",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "locale",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object transChoice(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        Object number = assignParameter(args, 1, false);
        Object parameters = assignParameter(args, 2, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        Object domain = assignParameter(args, 3, true);
        if (null == domain) {
            domain = ZVal.getNull();
        }
        Object locale = assignParameter(args, 4, true);
        if (null == locale) {
            locale = ZVal.getNull();
        }
        Object trans = null;
        trans =
                env.callMethod(
                        this.translator,
                        "transChoice",
                        LoggingTranslator.class,
                        id,
                        number,
                        parameters,
                        domain,
                        locale);
        this.log(env, id, domain, locale);
        return ZVal.assign(trans);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    public Object setLocale(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        env.callMethod(this.translator, "setLocale", LoggingTranslator.class, locale);
        return null;
    }

    @ConvertedMethod
    public Object getLocale(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.translator, "getLocale", LoggingTranslator.class));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "locale",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getCatalogue(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, true);
        if (null == locale) {
            locale = ZVal.getNull();
        }
        return ZVal.assign(
                env.callMethod(this.translator, "getCatalogue", LoggingTranslator.class, locale));
    }

    @ConvertedMethod
    public Object getFallbackLocales(RuntimeEnv env, Object... args) {
        if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                this.translator,
                                Translator.class,
                                "Symfony\\Component\\Translation\\Translator"))
                || ZVal.toBool(
                        function_method_exists
                                .f
                                .env(env)
                                .call(this.translator, "getFallbackLocales")
                                .value())) {
            return ZVal.assign(
                    env.callMethod(this.translator, "getFallbackLocales", LoggingTranslator.class));
        }

        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "args")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object ___args = assignParameter(args, 1, false);
        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                ZVal.newArray(new ZPair(0, this.translator), new ZPair(1, method)),
                                ___args)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    @ConvertedParameter(index = 1, name = "domain")
    @ConvertedParameter(index = 2, name = "locale")
    private Object log(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        Object domain = assignParameter(args, 1, false);
        Object locale = assignParameter(args, 2, false);
        Object catalogue = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", domain)) {
            domain = "messages";
        }

        id = ZVal.assign(toStringR(id, env));
        catalogue =
                env.callMethod(this.translator, "getCatalogue", LoggingTranslator.class, locale);
        if (ZVal.isTrue(
                env.callMethod(catalogue, "defines", LoggingTranslator.class, id, domain))) {
            return null;
        }

        if (ZVal.isTrue(env.callMethod(catalogue, "has", LoggingTranslator.class, id, domain))) {
            env.callMethod(
                    this.logger,
                    "debug",
                    LoggingTranslator.class,
                    "Translation use fallback catalogue.",
                    ZVal.newArray(
                            new ZPair("id", id),
                            new ZPair("domain", domain),
                            new ZPair(
                                    "locale",
                                    env.callMethod(
                                            catalogue, "getLocale", LoggingTranslator.class))));

        } else {
            env.callMethod(
                    this.logger,
                    "warning",
                    LoggingTranslator.class,
                    "Translation not found.",
                    ZVal.newArray(
                            new ZPair("id", id),
                            new ZPair("domain", domain),
                            new ZPair(
                                    "locale",
                                    env.callMethod(
                                            catalogue, "getLocale", LoggingTranslator.class))));
        }

        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\Translation\\LoggingTranslator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Translation\\LoggingTranslator")
                    .setLookup(
                            LoggingTranslator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("logger", "translator")
                    .setFilename("vendor/symfony/translation/LoggingTranslator.php")
                    .addInterface("Symfony\\Component\\Translation\\TranslatorInterface")
                    .addInterface("Symfony\\Component\\Translation\\TranslatorBagInterface")
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
