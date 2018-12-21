package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Formatter.classes.ChoiceMessageFormatterInterface;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Formatter.classes.MessageFormatter;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.RuntimeException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.NotFoundResourceException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.LogicException;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.classes.TranslatorInterface;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.classes.MessageCatalogue;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.classes.TranslatorBagInterface;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Translator.php

*/

public class Translator extends RuntimeClassBase
        implements TranslatorInterface, TranslatorBagInterface {

    public Object catalogues = ZVal.newArray();

    public Object locale = null;

    public Object fallbackLocales = ZVal.newArray();

    public Object loaders = ZVal.newArray();

    public Object resources = ZVal.newArray();

    public Object formatter = null;

    public Object cacheDir = null;

    public Object debug = null;

    public Object configCacheFactory = null;

    public Translator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Translator.class) {
            this.__construct(env, args);
        }
    }

    public Translator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    @ConvertedParameter(
        index = 1,
        name = "formatter",
        typeHint = "Symfony\\Component\\Translation\\Formatter\\MessageFormatterInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "cacheDir",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "debug",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        Object formatter = assignParameter(args, 1, true);
        if (null == formatter) {
            formatter = ZVal.getNull();
        }
        Object cacheDir = assignParameter(args, 2, true);
        if (null == cacheDir) {
            cacheDir = ZVal.getNull();
        }
        Object debug = assignParameter(args, 3, true);
        if (null == debug) {
            debug = false;
        }
        this.setLocale(env, locale);
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", formatter)) {
            formatter = new MessageFormatter(env);
        }

        this.formatter = formatter;
        this.cacheDir = cacheDir;
        this.debug = debug;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "configCacheFactory",
        typeHint = "Symfony\\Component\\Config\\ConfigCacheFactoryInterface"
    )
    public Object setConfigCacheFactory(RuntimeEnv env, Object... args) {
        Object configCacheFactory = assignParameter(args, 0, false);
        this.configCacheFactory = configCacheFactory;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "format")
    @ConvertedParameter(
        index = 1,
        name = "loader",
        typeHint = "Symfony\\Component\\Translation\\Loader\\LoaderInterface"
    )
    public Object addLoader(RuntimeEnv env, Object... args) {
        Object format = assignParameter(args, 0, false);
        Object loader = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "loaders", env).arrayAccess(env, format).set(loader);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "format")
    @ConvertedParameter(index = 1, name = "resource")
    @ConvertedParameter(index = 2, name = "locale")
    @ConvertedParameter(
        index = 3,
        name = "domain",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object addResource(RuntimeEnv env, Object... args) {
        Object format = assignParameter(args, 0, false);
        Object resource = assignParameter(args, 1, false);
        Object locale = assignParameter(args, 2, false);
        Object domain = assignParameter(args, 3, true);
        if (null == domain) {
            domain = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", domain)) {
            domain = "messages";
        }

        this.assertValidLocale(env, locale);
        new ReferenceClassProperty(this, "resources", env)
                .arrayAppend(env, locale)
                .set(
                        ZVal.newArray(
                                new ZPair(0, format),
                                new ZPair(1, resource),
                                new ZPair(2, domain)));
        if (function_in_array.f.env(env).call(locale, this.fallbackLocales).getBool()) {
            this.catalogues = ZVal.newArray();

        } else {
            arrayActionR(
                    ArrayAction.UNSET,
                    new ReferenceClassProperty(this, "catalogues", env),
                    env,
                    locale);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    public Object setLocale(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        this.assertValidLocale(env, locale);
        this.locale = locale;
        return null;
    }

    @ConvertedMethod
    public Object getLocale(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.locale);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locales", typeHint = "array")
    public Object setFallbackLocales(RuntimeEnv env, Object... args) {
        Object locales = assignParameter(args, 0, false);
        Object locale = null;
        this.catalogues = ZVal.newArray();
        for (ZPair zpairResult2165 : ZVal.getIterable(locales, env, true)) {
            locale = ZVal.assign(zpairResult2165.getValue());
            this.assertValidLocale(env, locale);
        }

        this.fallbackLocales = locales;
        return null;
    }

    @ConvertedMethod
    public Object getFallbackLocales(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.fallbackLocales);
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
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", domain)) {
            domain = "messages";
        }

        return ZVal.assign(
                env.callMethod(
                        this.formatter,
                        "format",
                        Translator.class,
                        env.callMethod(
                                this.getCatalogue(env, locale),
                                "get",
                                Translator.class,
                                toStringR(id, env),
                                domain),
                        locale,
                        parameters));
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
        int runtimeConverterBreakCount;
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
        Object cat = null;
        Object catalogue = null;
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        this.formatter,
                        ChoiceMessageFormatterInterface.class,
                        "Symfony\\Component\\Translation\\Formatter\\ChoiceMessageFormatterInterface"))) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "The formatter \"%s\" does not support plural translations.",
                                            function_get_class
                                                    .f
                                                    .env(env)
                                                    .call(this.formatter)
                                                    .value())
                                    .value()));
        }

        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", domain)) {
            domain = "messages";
        }

        id = ZVal.assign(toStringR(id, env));
        catalogue = this.getCatalogue(env, locale);
        locale = env.callMethod(catalogue, "getLocale", Translator.class);
        runtimeConverterBreakCount = 0;
        while (!ZVal.isTrue(env.callMethod(catalogue, "defines", Translator.class, id, domain))) {
            if (ZVal.isTrue(
                    cat = env.callMethod(catalogue, "getFallbackCatalogue", Translator.class))) {
                catalogue = ZVal.assign(cat);
                locale = env.callMethod(catalogue, "getLocale", Translator.class);

            } else {
                break;
            }
        }

        return ZVal.assign(
                env.callMethod(
                        this.formatter,
                        "choiceFormat",
                        Translator.class,
                        env.callMethod(catalogue, "get", Translator.class, id, domain),
                        number,
                        locale,
                        parameters));
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
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", locale)) {
            locale = this.getLocale(env);

        } else {
            this.assertValidLocale(env, locale);
        }

        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "catalogues", env),
                env,
                locale)) {
            this.loadCatalogue(env, locale);
        }

        return ZVal.assign(
                new ReferenceClassProperty(this, "catalogues", env).arrayGet(env, locale));
    }

    @ConvertedMethod
    protected Object getLoaders(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.loaders);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    protected Object loadCatalogue(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.cacheDir)) {
            this.initializeCatalogue(env, locale);

        } else {
            this.initializeCacheCatalogue(env, locale);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    protected Object initializeCatalogue(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        Object e = null;
        this.assertValidLocale(env, locale);
        try {
            this.doLoadCatalogue(env, locale);
        } catch (ConvertedException convertedException314) {
            if (convertedException314.instanceOf(
                    NotFoundResourceException.class,
                    "Symfony\\Component\\Translation\\Exception\\NotFoundResourceException")) {
                e = convertedException314.getObject();
                if (!ZVal.isTrue(this.computeFallbackLocales(env, locale))) {
                    throw ZVal.getException(env, e);
                }

            } else {
                throw convertedException314;
            }
        }

        this.loadFallbackCatalogues(env, locale);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale", typeHint = "string")
    private Object initializeCacheCatalogue(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope74 scope = new Scope74();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/symfony/translation")
                            .setFile("/vendor/symfony/translation/Translator.php");
            scope.locale = assignParameter(args, 0, false);
            scope.cache = null;
            if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(scope._thisVarAlias, "catalogues", env),
                    env,
                    scope.locale)) {
                throw new IncludeEventException(null);
            }

            this.assertValidLocale(env, scope.locale);
            scope.cache =
                    env.callMethod(
                            this.getConfigCacheFactory(env),
                            "cache",
                            Translator.class,
                            this.getCatalogueCachePath(env, scope.locale),
                            new Closure(
                                    env,
                                    runtimeConverterFunctionClassConstants,
                                    "Symfony\\Component\\Translation",
                                    this) {
                                @Override
                                @ConvertedMethod
                                @ConvertedParameter(
                                    index = 0,
                                    name = "cache",
                                    typeHint = "Symfony\\Component\\Config\\ConfigCacheInterface"
                                )
                                public Object run(
                                        RuntimeEnv env,
                                        Object thisvar,
                                        PassByReferenceArgs runtimePassByReferenceArgs,
                                        Object... args) {
                                    Object _closureThisVar = this.getClosureThisVar();
                                    Object cache = assignParameter(args, 0, false);
                                    Object locale = null;
                                    locale = this.contextReferences.getCapturedValue("locale");
                                    Translator.this.dumpCatalogue(env, locale, cache);
                                    return null;
                                }
                            }.use("locale", scope.locale));
            if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(scope._thisVarAlias, "catalogues", env),
                    env,
                    scope.locale)) {
                throw new IncludeEventException(null);
            }

            new ReferenceClassProperty(scope._thisVarAlias, "catalogues", env)
                    .arrayAccess(env, scope.locale)
                    .set(
                            env.include(
                                    toStringR(
                                            env.callMethod(
                                                    scope.cache, "getPath", Translator.class),
                                            env),
                                    stack,
                                    runtimeConverterFunctionClassConstants,
                                    false,
                                    false));
            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    @ConvertedParameter(
        index = 1,
        name = "cache",
        typeHint = "Symfony\\Component\\Config\\ConfigCacheInterface"
    )
    private Object dumpCatalogue(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        Object cache = assignParameter(args, 1, false);
        Object fallbackContent = null;
        Object content = null;
        this.initializeCatalogue(env, locale);
        fallbackContent =
                this.getFallbackContent(
                        env,
                        new ReferenceClassProperty(this, "catalogues", env).arrayGet(env, locale));
        content =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "<?php\n\nuse Symfony\\Component\\Translation\\MessageCatalogue;\n\n$catalogue = new MessageCatalogue('%s', %s);\n\n%s\nreturn $catalogue;\n",
                                locale,
                                NamespaceGlobal.var_export
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        new ReferenceClassProperty(
                                                                        this, "catalogues", env)
                                                                .arrayGet(env, locale),
                                                        "all",
                                                        Translator.class),
                                                true)
                                        .value(),
                                fallbackContent)
                        .value();
        env.callMethod(
                cache,
                "write",
                Translator.class,
                content,
                env.callMethod(
                        new ReferenceClassProperty(this, "catalogues", env).arrayGet(env, locale),
                        "getResources",
                        Translator.class));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "catalogue",
        typeHint = "Symfony\\Component\\Translation\\MessageCatalogue"
    )
    private Object getFallbackContent(RuntimeEnv env, Object... args) {
        Object catalogue = assignParameter(args, 0, false);
        Object current = null;
        Object fallbackContent = null;
        Object currentSuffix = null;
        Object replacementPattern = null;
        Object fallbackCatalogue = null;
        Object fallback = null;
        Object fallbackSuffix = null;
        fallbackContent = "";
        current = "";
        replacementPattern = "/[^a-z0-9_]/i";
        fallbackCatalogue = env.callMethod(catalogue, "getFallbackCatalogue", Translator.class);
        while (ZVal.isTrue(fallbackCatalogue)) {
            fallback = env.callMethod(fallbackCatalogue, "getLocale", Translator.class);
            fallbackSuffix =
                    NamespaceGlobal.ucfirst
                            .env(env)
                            .call(
                                    function_preg_replace
                                            .f
                                            .env(env)
                                            .call(replacementPattern, "_", fallback)
                                            .value())
                            .value();
            currentSuffix =
                    NamespaceGlobal.ucfirst
                            .env(env)
                            .call(
                                    function_preg_replace
                                            .f
                                            .env(env)
                                            .call(replacementPattern, "_", current)
                                            .value())
                            .value();
            fallbackContent =
                    toStringR(fallbackContent, env)
                            + toStringR(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "$catalogue%s = new MessageCatalogue('%s', %s);\n$catalogue%s->addFallbackCatalogue($catalogue%s);\n",
                                                    fallbackSuffix,
                                                    fallback,
                                                    NamespaceGlobal.var_export
                                                            .env(env)
                                                            .call(
                                                                    env.callMethod(
                                                                            fallbackCatalogue,
                                                                            "all",
                                                                            Translator.class),
                                                                    true)
                                                            .value(),
                                                    currentSuffix,
                                                    fallbackSuffix)
                                            .value(),
                                    env);
            current = env.callMethod(fallbackCatalogue, "getLocale", Translator.class);
            fallbackCatalogue =
                    env.callMethod(fallbackCatalogue, "getFallbackCatalogue", Translator.class);
        }

        return ZVal.assign(fallbackContent);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    private Object getCatalogueCachePath(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(this.cacheDir, env)
                        + "/catalogue."
                        + toStringR(locale, env)
                        + "."
                        + toStringR(
                                NamespaceGlobal.strtr
                                        .env(env)
                                        .call(
                                                function_substr
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                NamespaceGlobal.base64_encode
                                                                        .env(env)
                                                                        .call(
                                                                                NamespaceGlobal.hash
                                                                                        .env(env)
                                                                                        .call(
                                                                                                "sha256",
                                                                                                function_serialize
                                                                                                        .f
                                                                                                        .env(
                                                                                                                env)
                                                                                                        .call(
                                                                                                                this
                                                                                                                        .fallbackLocales)
                                                                                                        .value(),
                                                                                                true)
                                                                                        .value())
                                                                        .value(),
                                                                0,
                                                                7)
                                                        .value(),
                                                "/",
                                                "_")
                                        .value(),
                                env)
                        + ".php");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    private Object doLoadCatalogue(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        ReferenceContainer resource = new BasicReferenceContainer(null);
        new ReferenceClassProperty(this, "catalogues", env)
                .arrayAccess(env, locale)
                .set(new MessageCatalogue(env, locale));
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "resources", env),
                env,
                locale)) {
            for (ZPair zpairResult2166 :
                    ZVal.getIterable(
                            new ReferenceClassProperty(this, "resources", env)
                                    .arrayGet(env, locale),
                            env,
                            true)) {
                resource.setObject(ZVal.assign(zpairResult2166.getValue()));
                if (!arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "loaders", env),
                        env,
                        resource.arrayGet(env, 0))) {
                    throw ZVal.getException(
                            env,
                            new RuntimeException(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "The \"%s\" translation loader is not registered.",
                                                    resource.arrayGet(env, 0))
                                            .value()));
                }

                env.callMethod(
                        new ReferenceClassProperty(this, "catalogues", env).arrayGet(env, locale),
                        "addCatalogue",
                        Translator.class,
                        env.callMethod(
                                new ReferenceClassProperty(this, "loaders", env)
                                        .arrayGet(env, resource.arrayGet(env, 0)),
                                "load",
                                Translator.class,
                                resource.arrayGet(env, 1),
                                locale,
                                resource.arrayGet(env, 2)));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    private Object loadFallbackCatalogues(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        Object current = null;
        Object resource = null;
        Object fallback = null;
        Object fallbackCatalogue = null;
        current =
                ZVal.assign(
                        new ReferenceClassProperty(this, "catalogues", env).arrayGet(env, locale));
        for (ZPair zpairResult2167 :
                ZVal.getIterable(this.computeFallbackLocales(env, locale), env, true)) {
            fallback = ZVal.assign(zpairResult2167.getValue());
            if (!arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "catalogues", env),
                    env,
                    fallback)) {
                this.initializeCatalogue(env, fallback);
            }

            fallbackCatalogue =
                    new MessageCatalogue(
                            env,
                            fallback,
                            env.callMethod(
                                    new ReferenceClassProperty(this, "catalogues", env)
                                            .arrayGet(env, fallback),
                                    "all",
                                    Translator.class));
            for (ZPair zpairResult2168 :
                    ZVal.getIterable(
                            env.callMethod(
                                    new ReferenceClassProperty(this, "catalogues", env)
                                            .arrayGet(env, fallback),
                                    "getResources",
                                    Translator.class),
                            env,
                            true)) {
                resource = ZVal.assign(zpairResult2168.getValue());
                env.callMethod(fallbackCatalogue, "addResource", Translator.class, resource);
            }

            env.callMethod(current, "addFallbackCatalogue", Translator.class, fallbackCatalogue);
            current = ZVal.assign(fallbackCatalogue);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    protected Object computeFallbackLocales(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object locale = assignParameter(args, 0, false);
        ReferenceContainer locales = new BasicReferenceContainer(null);
        Object fallback = null;
        locales.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2169 : ZVal.getIterable(this.fallbackLocales, env, true)) {
            fallback = ZVal.assign(zpairResult2169.getValue());
            if (ZVal.strictEqualityCheck(fallback, "===", locale)) {
                continue;
            }

            locales.arrayAppend(env).set(fallback);
        }

        if (ZVal.strictNotEqualityCheck(
                false, "!==", NamespaceGlobal.strrchr.env(env).call(locale, "_").value())) {
            function_array_unshift
                    .f
                    .env(env)
                    .call(
                            locales.getObject(),
                            function_substr
                                    .f
                                    .env(env)
                                    .call(
                                            locale,
                                            0,
                                            ZVal.minusSign(
                                                    function_strlen
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    NamespaceGlobal.strrchr
                                                                            .env(env)
                                                                            .call(locale, "_")
                                                                            .value())
                                                            .value()))
                                    .value());
        }

        return ZVal.assign(function_array_unique.f.env(env).call(locales.getObject()).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    protected Object assertValidLocale(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        if (ZVal.strictNotEqualityCheck(
                1,
                "!==",
                function_preg_match.f.env(env).call("/^[a-z0-9@_\\.\\-]*$/i", locale).value())) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Invalid \"%s\" locale.", locale)
                                    .value()));
        }

        return null;
    }

    @ConvertedMethod
    private Object getConfigCacheFactory(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.configCacheFactory)) {
            this.configCacheFactory =
                    env.createNew(ZVal.resolveClassAlias(env, "ConfigCacheFactory"), this.debug);
        }

        return ZVal.assign(this.configCacheFactory);
    }

    public static final Object CONST_class = "Symfony\\Component\\Translation\\Translator";

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
                    .setName("Symfony\\Component\\Translation\\Translator")
                    .setLookup(
                            Translator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "cacheDir",
                            "catalogues",
                            "configCacheFactory",
                            "debug",
                            "fallbackLocales",
                            "formatter",
                            "loaders",
                            "locale",
                            "resources")
                    .setFilename("vendor/symfony/translation/Translator.php")
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

    private static class Scope74 implements UpdateRuntimeScopeInterface {

        Object cache;
        Object _thisVarAlias;
        Object locale;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("cache", this.cache);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("locale", this.locale);
        }

        public void updateScope(RuntimeStack stack) {

            this.cache = stack.getVariable("cache");
            this._thisVarAlias = stack.getVariable("this");
            this.locale = stack.getVariable("locale");
        }
    }
}
