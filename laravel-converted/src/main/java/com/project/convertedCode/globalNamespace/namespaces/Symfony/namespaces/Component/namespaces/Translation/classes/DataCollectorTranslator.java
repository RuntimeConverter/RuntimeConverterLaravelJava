package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.classes.TranslatorInterface;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
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

 vendor/symfony/translation/DataCollectorTranslator.php

*/

public class DataCollectorTranslator extends RuntimeClassBase
        implements TranslatorInterface, TranslatorBagInterface {

    public Object translator = null;

    public Object messages = ZVal.newArray();

    public DataCollectorTranslator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DataCollectorTranslator.class) {
            this.__construct(env, args);
        }
    }

    public DataCollectorTranslator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "translator",
        typeHint = "Symfony\\Component\\Translation\\TranslatorInterface"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object translator = assignParameter(args, 0, false);
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
                        DataCollectorTranslator.class,
                        id,
                        parameters,
                        domain,
                        locale);
        this.collectMessage(env, locale, domain, id, trans, parameters);
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
                        DataCollectorTranslator.class,
                        id,
                        number,
                        parameters,
                        domain,
                        locale);
        this.collectMessage(env, locale, domain, id, trans, parameters, number);
        return ZVal.assign(trans);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    public Object setLocale(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        env.callMethod(this.translator, "setLocale", DataCollectorTranslator.class, locale);
        return null;
    }

    @ConvertedMethod
    public Object getLocale(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this.translator, "getLocale", DataCollectorTranslator.class));
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
                env.callMethod(
                        this.translator, "getCatalogue", DataCollectorTranslator.class, locale));
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
                    env.callMethod(
                            this.translator, "getFallbackLocales", DataCollectorTranslator.class));
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
    public Object getCollectedMessages(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.messages);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    @ConvertedParameter(index = 1, name = "domain")
    @ConvertedParameter(index = 2, name = "id")
    @ConvertedParameter(index = 3, name = "translation")
    @ConvertedParameter(
        index = 4,
        name = "parameters",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 5,
        name = "number",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    private Object collectMessage(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object locale = assignParameter(args, 0, false);
        Object domain = assignParameter(args, 1, false);
        Object id = assignParameter(args, 2, false);
        Object translation = assignParameter(args, 3, false);
        Object parameters = assignParameter(args, 4, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        Object number = assignParameter(args, 5, true);
        if (null == number) {
            number = ZVal.getNull();
        }
        Object state = null;
        Object fallbackCatalogue = null;
        Object catalogue = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", domain)) {
            domain = "messages";
        }

        id = ZVal.assign(toStringR(id, env));
        catalogue =
                env.callMethod(
                        this.translator, "getCatalogue", DataCollectorTranslator.class, locale);
        locale = env.callMethod(catalogue, "getLocale", DataCollectorTranslator.class);
        if (ZVal.isTrue(
                env.callMethod(catalogue, "defines", DataCollectorTranslator.class, id, domain))) {
            state = ZVal.assign(CONST_MESSAGE_DEFINED);

        } else if (ZVal.isTrue(
                env.callMethod(catalogue, "has", DataCollectorTranslator.class, id, domain))) {
            state = ZVal.assign(CONST_MESSAGE_EQUALS_FALLBACK);
            fallbackCatalogue =
                    env.callMethod(
                            catalogue, "getFallbackCatalogue", DataCollectorTranslator.class);
            runtimeConverterBreakCount = 0;
            while (ZVal.isTrue(fallbackCatalogue)) {
                if (ZVal.isTrue(
                        env.callMethod(
                                fallbackCatalogue,
                                "defines",
                                DataCollectorTranslator.class,
                                id,
                                domain))) {
                    locale =
                            env.callMethod(
                                    fallbackCatalogue, "getLocale", DataCollectorTranslator.class);
                    break;
                }

                fallbackCatalogue =
                        env.callMethod(
                                fallbackCatalogue,
                                "getFallbackCatalogue",
                                DataCollectorTranslator.class);
            }

        } else {
            state = ZVal.assign(CONST_MESSAGE_MISSING);
        }

        new ReferenceClassProperty(this, "messages", env)
                .arrayAppend(env)
                .set(
                        ZVal.newArray(
                                new ZPair("locale", locale),
                                new ZPair("domain", domain),
                                new ZPair("id", id),
                                new ZPair("translation", translation),
                                new ZPair("parameters", parameters),
                                new ZPair("transChoiceNumber", number),
                                new ZPair("state", state)));
        return null;
    }

    public static final Object CONST_MESSAGE_DEFINED = 0;

    public static final Object CONST_MESSAGE_MISSING = 1;

    public static final Object CONST_MESSAGE_EQUALS_FALLBACK = 2;

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\DataCollectorTranslator";

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
                    .setName("Symfony\\Component\\Translation\\DataCollectorTranslator")
                    .setLookup(
                            DataCollectorTranslator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("messages", "translator")
                    .setFilename("vendor/symfony/translation/DataCollectorTranslator.php")
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
