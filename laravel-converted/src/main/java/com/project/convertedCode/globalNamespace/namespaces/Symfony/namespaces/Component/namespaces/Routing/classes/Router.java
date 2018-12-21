package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Generator.classes.ConfigurableRequirementsInterface;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes.RequestContext;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes.RouterInterface;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Matcher.classes.RequestMatcherInterface;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/routing/Router.php

*/

public class Router extends RuntimeClassBase implements RouterInterface, RequestMatcherInterface {

    public Object matcher = null;

    public Object generator = null;

    public Object context = null;

    public Object loader = null;

    public Object collection = null;

    public Object resource = null;

    public Object options = ZVal.newArray();

    public Object logger = null;

    public Object configCacheFactory = null;

    public Object expressionLanguageProviders = ZVal.newArray();

    public Router(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Router.class) {
            this.__construct(env, args);
        }
    }

    public Router(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "loader",
        typeHint = "Symfony\\Component\\Config\\Loader\\LoaderInterface"
    )
    @ConvertedParameter(index = 1, name = "resource")
    @ConvertedParameter(
        index = 2,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "context",
        typeHint = "Symfony\\Component\\Routing\\RequestContext",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "logger",
        typeHint = "Psr\\Log\\LoggerInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object loader = assignParameter(args, 0, false);
        Object resource = assignParameter(args, 1, false);
        Object options = assignParameter(args, 2, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object context = assignParameter(args, 3, true);
        if (null == context) {
            context = ZVal.getNull();
        }
        Object logger = assignParameter(args, 4, true);
        if (null == logger) {
            logger = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.loader = loader;
        this.resource = resource;
        this.logger = logger;
        this.context =
                ZVal.isTrue(ternaryExpressionTemp = context)
                        ? ternaryExpressionTemp
                        : new RequestContext(env);
        this.setOptions(env, options);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options", typeHint = "array")
    public Object setOptions(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, false);
        ReferenceContainer invalid = new BasicReferenceContainer(null);
        Object value = null;
        Object key = null;
        this.options =
                ZVal.newArray(
                        new ZPair("cache_dir", ZVal.getNull()),
                        new ZPair("debug", false),
                        new ZPair(
                                "generator_class",
                                "Symfony\\Component\\Routing\\Generator\\UrlGenerator"),
                        new ZPair(
                                "generator_base_class",
                                "Symfony\\Component\\Routing\\Generator\\UrlGenerator"),
                        new ZPair(
                                "generator_dumper_class",
                                "Symfony\\Component\\Routing\\Generator\\Dumper\\PhpGeneratorDumper"),
                        new ZPair("generator_cache_class", "ProjectUrlGenerator"),
                        new ZPair(
                                "matcher_class",
                                "Symfony\\Component\\Routing\\Matcher\\UrlMatcher"),
                        new ZPair(
                                "matcher_base_class",
                                "Symfony\\Component\\Routing\\Matcher\\UrlMatcher"),
                        new ZPair(
                                "matcher_dumper_class",
                                "Symfony\\Component\\Routing\\Matcher\\Dumper\\PhpMatcherDumper"),
                        new ZPair("matcher_cache_class", "ProjectUrlMatcher"),
                        new ZPair("resource_type", ZVal.getNull()),
                        new ZPair("strict_requirements", true));
        invalid.setObject(ZVal.newArray());
        for (ZPair zpairResult2096 : ZVal.getIterable(options, env, false)) {
            key = ZVal.assign(zpairResult2096.getKey());
            value = ZVal.assign(zpairResult2096.getValue());
            if (function_array_key_exists.f.env(env).call(key, this.options).getBool()) {
                new ReferenceClassProperty(this, "options", env).arrayAccess(env, key).set(value);

            } else {
                invalid.arrayAppend(env).set(key);
            }
        }

        if (ZVal.isTrue(invalid.getObject())) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "The Router does not support the following options: \"%s\".",
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call("\", \"", invalid.getObject())
                                                    .value())
                                    .value()));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object setOption(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        if (!function_array_key_exists.f.env(env).call(key, this.options).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("The Router does not support the \"%s\" option.", key)
                                    .value()));
        }

        new ReferenceClassProperty(this, "options", env).arrayAccess(env, key).set(value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object getOption(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        if (!function_array_key_exists.f.env(env).call(key, this.options).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("The Router does not support the \"%s\" option.", key)
                                    .value()));
        }

        return ZVal.assign(new ReferenceClassProperty(this, "options", env).arrayGet(env, key));
    }

    @ConvertedMethod
    public Object getRouteCollection(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.collection)) {
            this.collection =
                    env.callMethod(
                            this.loader,
                            "load",
                            Router.class,
                            this.resource,
                            new ReferenceClassProperty(this, "options", env)
                                    .arrayGet(env, "resource_type"));
        }

        return ZVal.assign(this.collection);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "context",
        typeHint = "Symfony\\Component\\Routing\\RequestContext"
    )
    public Object setContext(RuntimeEnv env, Object... args) {
        Object context = assignParameter(args, 0, false);
        this.context = context;
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.matcher)) {
            env.callMethod(this.getMatcher(env), "setContext", Router.class, context);
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.generator)) {
            env.callMethod(this.getGenerator(env), "setContext", Router.class, context);
        }

        return null;
    }

    @ConvertedMethod
    public Object getContext(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.context);
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
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 2, name = "referenceType")
    public Object generate(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        Object referenceType = assignParameter(args, 2, true);
        if (null == referenceType) {
            referenceType = CONST_ABSOLUTE_PATH;
        }
        return ZVal.assign(
                env.callMethod(
                        this.getGenerator(env),
                        "generate",
                        Router.class,
                        name,
                        parameters,
                        referenceType));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pathinfo")
    public Object match(RuntimeEnv env, Object... args) {
        ReferenceContainer pathinfo = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                env.callMethod(
                        this.getMatcher(env),
                        new RuntimeArgsWithReferences().add(0, pathinfo),
                        "match",
                        Router.class,
                        pathinfo.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    public Object matchRequest(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object request = assignParameter(args, 0, false);
        Object matcher = null;
        matcher = this.getMatcher(env);
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        matcher,
                        RequestMatcherInterface.class,
                        "Symfony\\Component\\Routing\\Matcher\\RequestMatcherInterface"))) {
            return ZVal.assign(
                    env.callMethod(
                            matcher,
                            rLastRefArgs =
                                    new RuntimeArgsWithReferences()
                                            .add(
                                                    0,
                                                    handleReturnReference(
                                                            env.callMethod(
                                                                    request,
                                                                    "getPathInfo",
                                                                    Router.class))),
                            "match",
                            Router.class,
                            rLastRefArgs.get(0)));
        }

        return ZVal.assign(env.callMethod(matcher, "matchRequest", Router.class, request));
    }

    @ConvertedMethod
    public Object getMatcher(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope71 scope = new Scope71();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/symfony/routing")
                            .setFile("/vendor/symfony/routing/Router.php");
            scope.cache = null;
            scope.provider = null;
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.matcher)) {
                throw new IncludeEventException(ZVal.assign(this.matcher));
            }

            if (ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    ZVal.getNull(),
                                    "===",
                                    new ReferenceClassProperty(scope._thisVarAlias, "options", env)
                                            .arrayGet(env, "cache_dir")))
                    || ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    ZVal.getNull(),
                                    "===",
                                    new ReferenceClassProperty(scope._thisVarAlias, "options", env)
                                            .arrayGet(env, "matcher_cache_class")))) {
                this.matcher =
                        env.createNew(
                                new ReferenceClassProperty(scope._thisVarAlias, "options", env)
                                        .arrayGet(env, "matcher_class"),
                                this.getRouteCollection(env),
                                this.context);
                if (function_method_exists
                        .f
                        .env(env)
                        .call(this.matcher, "addExpressionLanguageProvider")
                        .getBool()) {
                    for (ZPair zpairResult2097 :
                            ZVal.getIterable(this.expressionLanguageProviders, env, true)) {
                        scope.provider = ZVal.assign(zpairResult2097.getValue());
                        env.callMethod(
                                this.matcher,
                                "addExpressionLanguageProvider",
                                Router.class,
                                scope.provider);
                    }
                }

                throw new IncludeEventException(ZVal.assign(this.matcher));
            }

            scope.cache =
                    env.callMethod(
                            this.getConfigCacheFactory(env),
                            "cache",
                            Router.class,
                            toStringR(
                                            new ReferenceClassProperty(
                                                            scope._thisVarAlias, "options", env)
                                                    .arrayGet(env, "cache_dir"),
                                            env)
                                    + "/"
                                    + toStringR(
                                            new ReferenceClassProperty(
                                                            scope._thisVarAlias, "options", env)
                                                    .arrayGet(env, "matcher_cache_class"),
                                            env)
                                    + ".php",
                            new Closure(
                                    env,
                                    runtimeConverterFunctionClassConstants,
                                    "Symfony\\Component\\Routing",
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
                                    Object provider = null;
                                    Object options = null;
                                    Object dumper = null;
                                    dumper = Router.this.getMatcherDumperInstance(env);
                                    if (function_method_exists
                                            .f
                                            .env(env)
                                            .call(dumper, "addExpressionLanguageProvider")
                                            .getBool()) {
                                        for (ZPair zpairResult2098 :
                                                ZVal.getIterable(
                                                        Router.this.expressionLanguageProviders,
                                                        env,
                                                        true)) {
                                            provider = ZVal.assign(zpairResult2098.getValue());
                                            env.callMethod(
                                                    dumper,
                                                    "addExpressionLanguageProvider",
                                                    Router.class,
                                                    provider);
                                        }
                                    }

                                    options =
                                            ZVal.newArray(
                                                    new ZPair(
                                                            "class",
                                                            new ReferenceClassProperty(
                                                                            _closureThisVar,
                                                                            "options",
                                                                            env)
                                                                    .arrayGet(
                                                                            env,
                                                                            "matcher_cache_class")),
                                                    new ZPair(
                                                            "base_class",
                                                            new ReferenceClassProperty(
                                                                            _closureThisVar,
                                                                            "options",
                                                                            env)
                                                                    .arrayGet(
                                                                            env,
                                                                            "matcher_base_class")));
                                    env.callMethod(
                                            cache,
                                            "write",
                                            Router.class,
                                            env.callMethod(dumper, "dump", Router.class, options),
                                            env.callMethod(
                                                    Router.this.getRouteCollection(env),
                                                    "getResources",
                                                    Router.class));
                                    return null;
                                }
                            });
            if (!function_class_exists
                    .f
                    .env(env)
                    .call(
                            new ReferenceClassProperty(scope._thisVarAlias, "options", env)
                                    .arrayGet(env, "matcher_cache_class"),
                            false)
                    .getBool()) {
                env.include(
                        toStringR(env.callMethod(scope.cache, "getPath", Router.class), env),
                        stack,
                        runtimeConverterFunctionClassConstants,
                        true,
                        true);
            }

            throw new IncludeEventException(
                    ZVal.assign(
                            this.matcher =
                                    env.createNew(
                                            new ReferenceClassProperty(
                                                            scope._thisVarAlias, "options", env)
                                                    .arrayGet(env, "matcher_cache_class"),
                                            this.context)));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    public Object getGenerator(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope72 scope = new Scope72();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/symfony/routing")
                            .setFile("/vendor/symfony/routing/Router.php");
            scope.cache = null;
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.generator)) {
                throw new IncludeEventException(ZVal.assign(this.generator));
            }

            if (ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    ZVal.getNull(),
                                    "===",
                                    new ReferenceClassProperty(scope._thisVarAlias, "options", env)
                                            .arrayGet(env, "cache_dir")))
                    || ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    ZVal.getNull(),
                                    "===",
                                    new ReferenceClassProperty(scope._thisVarAlias, "options", env)
                                            .arrayGet(env, "generator_cache_class")))) {
                this.generator =
                        env.createNew(
                                new ReferenceClassProperty(scope._thisVarAlias, "options", env)
                                        .arrayGet(env, "generator_class"),
                                this.getRouteCollection(env),
                                this.context,
                                this.logger);

            } else {
                scope.cache =
                        env.callMethod(
                                this.getConfigCacheFactory(env),
                                "cache",
                                Router.class,
                                toStringR(
                                                new ReferenceClassProperty(
                                                                scope._thisVarAlias, "options", env)
                                                        .arrayGet(env, "cache_dir"),
                                                env)
                                        + "/"
                                        + toStringR(
                                                new ReferenceClassProperty(
                                                                scope._thisVarAlias, "options", env)
                                                        .arrayGet(env, "generator_cache_class"),
                                                env)
                                        + ".php",
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Symfony\\Component\\Routing",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(
                                        index = 0,
                                        name = "cache",
                                        typeHint =
                                                "Symfony\\Component\\Config\\ConfigCacheInterface"
                                    )
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object cache = assignParameter(args, 0, false);
                                        Object options = null;
                                        Object dumper = null;
                                        dumper = Router.this.getGeneratorDumperInstance(env);
                                        options =
                                                ZVal.newArray(
                                                        new ZPair(
                                                                "class",
                                                                new ReferenceClassProperty(
                                                                                _closureThisVar,
                                                                                "options",
                                                                                env)
                                                                        .arrayGet(
                                                                                env,
                                                                                "generator_cache_class")),
                                                        new ZPair(
                                                                "base_class",
                                                                new ReferenceClassProperty(
                                                                                _closureThisVar,
                                                                                "options",
                                                                                env)
                                                                        .arrayGet(
                                                                                env,
                                                                                "generator_base_class")));
                                        env.callMethod(
                                                cache,
                                                "write",
                                                Router.class,
                                                env.callMethod(
                                                        dumper, "dump", Router.class, options),
                                                env.callMethod(
                                                        Router.this.getRouteCollection(env),
                                                        "getResources",
                                                        Router.class));
                                        return null;
                                    }
                                });
                if (!function_class_exists
                        .f
                        .env(env)
                        .call(
                                new ReferenceClassProperty(scope._thisVarAlias, "options", env)
                                        .arrayGet(env, "generator_cache_class"),
                                false)
                        .getBool()) {
                    env.include(
                            toStringR(env.callMethod(scope.cache, "getPath", Router.class), env),
                            stack,
                            runtimeConverterFunctionClassConstants,
                            true,
                            true);
                }

                this.generator =
                        env.createNew(
                                new ReferenceClassProperty(scope._thisVarAlias, "options", env)
                                        .arrayGet(env, "generator_cache_class"),
                                this.context,
                                this.logger);
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            this.generator,
                            ConfigurableRequirementsInterface.class,
                            "Symfony\\Component\\Routing\\Generator\\ConfigurableRequirementsInterface"))) {
                env.callMethod(
                        this.generator,
                        "setStrictRequirements",
                        Router.class,
                        new ReferenceClassProperty(scope._thisVarAlias, "options", env)
                                .arrayGet(env, "strict_requirements"));
            }

            throw new IncludeEventException(ZVal.assign(this.generator));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "provider",
        typeHint = "Symfony\\Component\\ExpressionLanguage\\ExpressionFunctionProviderInterface"
    )
    public Object addExpressionLanguageProvider(RuntimeEnv env, Object... args) {
        Object provider = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "expressionLanguageProviders", env)
                .arrayAppend(env)
                .set(provider);
        return null;
    }

    @ConvertedMethod
    protected Object getGeneratorDumperInstance(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.createNew(
                        new ReferenceClassProperty(this, "options", env)
                                .arrayGet(env, "generator_dumper_class"),
                        this.getRouteCollection(env)));
    }

    @ConvertedMethod
    protected Object getMatcherDumperInstance(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.createNew(
                        new ReferenceClassProperty(this, "options", env)
                                .arrayGet(env, "matcher_dumper_class"),
                        this.getRouteCollection(env)));
    }

    @ConvertedMethod
    private Object getConfigCacheFactory(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.configCacheFactory)) {
            this.configCacheFactory =
                    env.createNew(
                            ZVal.resolveClassAlias(env, "ConfigCacheFactory"),
                            new ReferenceClassProperty(this, "options", env)
                                    .arrayGet(env, "debug"));
        }

        return ZVal.assign(this.configCacheFactory);
    }

    public static final Object CONST_class = "Symfony\\Component\\Routing\\Router";

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
                    .setName("Symfony\\Component\\Routing\\Router")
                    .setLookup(
                            Router.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "collection",
                            "configCacheFactory",
                            "context",
                            "expressionLanguageProviders",
                            "generator",
                            "loader",
                            "logger",
                            "matcher",
                            "options",
                            "resource")
                    .setFilename("vendor/symfony/routing/Router.php")
                    .addInterface("Symfony\\Component\\Routing\\RouterInterface")
                    .addInterface("Symfony\\Component\\Routing\\Matcher\\UrlMatcherInterface")
                    .addInterface("Symfony\\Component\\Routing\\RequestContextAwareInterface")
                    .addInterface("Symfony\\Component\\Routing\\Generator\\UrlGeneratorInterface")
                    .addInterface("Symfony\\Component\\Routing\\Matcher\\RequestMatcherInterface")
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

    private static class Scope71 implements UpdateRuntimeScopeInterface {

        Object cache;
        Object provider;
        Object _thisVarAlias;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("cache", this.cache);
            stack.setVariable("provider", this.provider);
            stack.setVariable("this", this._thisVarAlias);
        }

        public void updateScope(RuntimeStack stack) {

            this.cache = stack.getVariable("cache");
            this.provider = stack.getVariable("provider");
            this._thisVarAlias = stack.getVariable("this");
        }
    }

    private static class Scope72 implements UpdateRuntimeScopeInterface {

        Object cache;
        Object _thisVarAlias;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("cache", this.cache);
            stack.setVariable("this", this._thisVarAlias);
        }

        public void updateScope(RuntimeStack stack) {

            this.cache = stack.getVariable("cache");
            this._thisVarAlias = stack.getVariable("this");
        }
    }
}
