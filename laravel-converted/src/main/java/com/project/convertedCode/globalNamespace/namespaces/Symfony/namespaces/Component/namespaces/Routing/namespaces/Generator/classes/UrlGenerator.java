package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Generator.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_flip;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Exception.classes.InvalidParameterException;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Generator.classes.ConfigurableRequirementsInterface;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Exception.classes.MissingMandatoryParametersException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Exception.classes.RouteNotFoundException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff_key;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_replace;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_udiff_assoc;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_current;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Generator.classes.UrlGeneratorInterface;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/routing/Generator/UrlGenerator.php

*/

public class UrlGenerator extends RuntimeClassBase
        implements UrlGeneratorInterface, ConfigurableRequirementsInterface {

    public Object routes = null;

    public Object context = null;

    public Object strictRequirements = true;

    public Object logger = null;

    public Object defaultLocale = null;

    public Object decodedChars =
            ZVal.newArray(
                    new ZPair("%2F", "/"),
                    new ZPair("%40", "@"),
                    new ZPair("%3A", ":"),
                    new ZPair("%3B", ";"),
                    new ZPair("%2C", ","),
                    new ZPair("%3D", "="),
                    new ZPair("%2B", "+"),
                    new ZPair("%21", "!"),
                    new ZPair("%2A", "*"),
                    new ZPair("%7C", "|"));

    public UrlGenerator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == UrlGenerator.class) {
            this.__construct(env, args);
        }
    }

    public UrlGenerator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "routes",
        typeHint = "Symfony\\Component\\Routing\\RouteCollection"
    )
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "Symfony\\Component\\Routing\\RequestContext"
    )
    @ConvertedParameter(
        index = 2,
        name = "logger",
        typeHint = "Psr\\Log\\LoggerInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "defaultLocale",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object routes = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, false);
        Object logger = assignParameter(args, 2, true);
        if (null == logger) {
            logger = ZVal.getNull();
        }
        Object defaultLocale = assignParameter(args, 3, true);
        if (null == defaultLocale) {
            defaultLocale = ZVal.getNull();
        }
        this.routes = routes;
        this.context = context;
        this.logger = logger;
        this.defaultLocale = defaultLocale;
        return null;
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
        return null;
    }

    @ConvertedMethod
    public Object getContext(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.context);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "enabled")
    public Object setStrictRequirements(RuntimeEnv env, Object... args) {
        Object enabled = assignParameter(args, 0, false);
        this.strictRequirements =
                ZVal.strictEqualityCheck(ZVal.getNull(), "===", enabled)
                        ? ZVal.getNull()
                        : ZVal.toBool(enabled);
        return null;
    }

    @ConvertedMethod
    public Object isStrictRequirements(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.strictRequirements);
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
        ReferenceContainer parameters = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == parameters.getObject()) {
            parameters.setObject(ZVal.newArray());
        }
        Object referenceType = assignParameter(args, 2, true);
        if (null == referenceType) {
            referenceType = CONST_ABSOLUTE_PATH;
        }
        Object route = null;
        Object ternaryExpressionTemp = null;
        Object locale = null;
        Object compiledRoute = null;
        locale =
                ZVal.assign(
                        ZVal.isTrue(
                                        ternaryExpressionTemp =
                                                ZVal.isDefined(
                                                                ternaryExpressionTemp =
                                                                        parameters.arrayGet(
                                                                                env, "_locale"))
                                                        ? ternaryExpressionTemp
                                                        : env.callMethod(
                                                                this.context,
                                                                "getParameter",
                                                                UrlGenerator.class,
                                                                "_locale"))
                                ? ternaryExpressionTemp
                                : this.defaultLocale);
        if (ZVal.toBool(
                        ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", locale))
                                && ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                ZVal.getNull(),
                                                "!==",
                                                route =
                                                        env.callMethod(
                                                                this.routes,
                                                                "get",
                                                                UrlGenerator.class,
                                                                toStringR(name, env)
                                                                        + "."
                                                                        + toStringR(locale, env)))))
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                env.callMethod(
                                        route,
                                        "getDefault",
                                        UrlGenerator.class,
                                        "_canonical_route"),
                                "===",
                                name))) {
            arrayActionR(ArrayAction.UNSET, parameters, env, "_locale");

        } else if (ZVal.strictEqualityCheck(
                ZVal.getNull(),
                "===",
                route = env.callMethod(this.routes, "get", UrlGenerator.class, name))) {
            throw ZVal.getException(
                    env,
                    new RouteNotFoundException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Unable to generate a URL for the named route \"%s\" as such route does not exist.",
                                            name)
                                    .value()));
        }

        compiledRoute = env.callMethod(route, "compile", UrlGenerator.class);
        return ZVal.assign(
                this.doGenerate(
                        env,
                        env.callMethod(compiledRoute, "getVariables", UrlGenerator.class),
                        env.callMethod(route, "getDefaults", UrlGenerator.class),
                        env.callMethod(route, "getRequirements", UrlGenerator.class),
                        env.callMethod(compiledRoute, "getTokens", UrlGenerator.class),
                        parameters.getObject(),
                        name,
                        referenceType,
                        env.callMethod(compiledRoute, "getHostTokens", UrlGenerator.class),
                        env.callMethod(route, "getSchemes", UrlGenerator.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "variables")
    @ConvertedParameter(index = 1, name = "defaults")
    @ConvertedParameter(index = 2, name = "requirements")
    @ConvertedParameter(index = 3, name = "tokens")
    @ConvertedParameter(index = 4, name = "parameters")
    @ConvertedParameter(index = 5, name = "name")
    @ConvertedParameter(index = 6, name = "referenceType")
    @ConvertedParameter(index = 7, name = "hostTokens")
    @ConvertedParameter(
        index = 8,
        name = "requiredSchemes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    protected Object doGenerate(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/routing/Generator")
                        .setFile("/vendor/symfony/routing/Generator/UrlGenerator.php");
        Object variables = assignParameter(args, 0, false);
        ReferenceContainer defaults = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object requirements = assignParameter(args, 2, false);
        Object tokens = assignParameter(args, 3, false);
        Object parameters = assignParameter(args, 4, false);
        Object name = assignParameter(args, 5, false);
        Object referenceType = assignParameter(args, 6, false);
        Object hostTokens = assignParameter(args, 7, false);
        Object requiredSchemes = assignParameter(args, 8, true);
        if (null == requiredSchemes) {
            requiredSchemes = ZVal.newArray();
        }
        ReferenceContainer mergedParams = new BasicReferenceContainer(null);
        Object scheme = null;
        Object query = null;
        Object routeHost = null;
        Object diff = null;
        Object optional = null;
        Object message = null;
        Object url = null;
        ReferenceContainer token = new BasicReferenceContainer(null);
        Object fragment = null;
        Object port = null;
        ReferenceContainer extra = new BasicReferenceContainer(null);
        Object schemeAuthority = null;
        Object host = null;
        variables = function_array_flip.f.env(env).call(variables).value();
        mergedParams.setObject(
                function_array_replace
                        .f
                        .env(env)
                        .call(
                                defaults.getObject(),
                                env.callMethod(this.context, "getParameters", UrlGenerator.class),
                                parameters)
                        .value());
        if (ZVal.isTrue(
                diff =
                        function_array_diff_key
                                .f
                                .env(env)
                                .call(variables, mergedParams.getObject())
                                .value())) {
            throw ZVal.getException(
                    env,
                    new MissingMandatoryParametersException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Some mandatory parameters are missing (\"%s\") to generate a URL for route \"%s\".",
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call(
                                                            "\", \"",
                                                            function_array_keys
                                                                    .f
                                                                    .env(env)
                                                                    .call(diff)
                                                                    .value())
                                                    .value(),
                                            name)
                                    .value()));
        }

        url = "";
        optional = true;
        message =
                "Parameter \"{parameter}\" for route \"{route}\" must match \"{expected}\" (\"{given}\" given) to generate a corresponding URL.";
        for (ZPair zpairResult2011 : ZVal.getIterable(tokens, env, true)) {
            token.setObject(ZVal.assign(zpairResult2011.getValue()));
            if (ZVal.strictEqualityCheck("variable", "===", token.arrayGet(env, 0))) {
                if (ZVal.toBool(
                                ZVal.toBool(!ZVal.isTrue(optional))
                                        || ZVal.toBool(
                                                !function_array_key_exists
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                token.arrayGet(env, 3),
                                                                defaults.getObject())
                                                        .getBool()))
                        || ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.strictNotEqualityCheck(
                                                        ZVal.getNull(),
                                                        "!==",
                                                        mergedParams.arrayGet(
                                                                env, token.arrayGet(env, 3))))
                                        && ZVal.toBool(
                                                ZVal.strictNotEqualityCheck(
                                                        toStringR(
                                                                mergedParams.arrayGet(
                                                                        env,
                                                                        token.arrayGet(env, 3)),
                                                                env),
                                                        "!==",
                                                        toStringR(
                                                                defaults.arrayGet(
                                                                        env,
                                                                        token.arrayGet(env, 3)),
                                                                env))))) {
                    if (ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(
                                            ZVal.getNull(), "!==", this.strictRequirements))
                            && ZVal.toBool(
                                    !function_preg_match
                                            .f
                                            .env(env)
                                            .call(
                                                    "#^"
                                                            + toStringR(token.arrayGet(env, 2), env)
                                                            + "$#"
                                                            + toStringR(
                                                                    arrayActionR(
                                                                                    ArrayAction
                                                                                            .EMPTY,
                                                                                    token,
                                                                                    env,
                                                                                    4)
                                                                            ? ""
                                                                            : "u",
                                                                    env),
                                                    mergedParams.arrayGet(
                                                            env, token.arrayGet(env, 3)))
                                            .getBool())) {
                        if (ZVal.isTrue(this.strictRequirements)) {
                            throw ZVal.getException(
                                    env,
                                    new InvalidParameterException(
                                            env,
                                            NamespaceGlobal.strtr
                                                    .env(env)
                                                    .call(
                                                            message,
                                                            ZVal.newArray(
                                                                    new ZPair(
                                                                            "{parameter}",
                                                                            token.arrayGet(env, 3)),
                                                                    new ZPair("{route}", name),
                                                                    new ZPair(
                                                                            "{expected}",
                                                                            token.arrayGet(env, 2)),
                                                                    new ZPair(
                                                                            "{given}",
                                                                            mergedParams.arrayGet(
                                                                                    env,
                                                                                    token.arrayGet(
                                                                                            env,
                                                                                            3)))))
                                                    .value()));
                        }

                        if (ZVal.isTrue(this.logger)) {
                            env.callMethod(
                                    this.logger,
                                    "error",
                                    UrlGenerator.class,
                                    message,
                                    ZVal.newArray(
                                            new ZPair("parameter", token.arrayGet(env, 3)),
                                            new ZPair("route", name),
                                            new ZPair("expected", token.arrayGet(env, 2)),
                                            new ZPair(
                                                    "given",
                                                    mergedParams.arrayGet(
                                                            env, token.arrayGet(env, 3)))));
                        }

                        return null;
                    }

                    url =
                            toStringR(token.arrayGet(env, 1), env)
                                    + toStringR(
                                            mergedParams.arrayGet(env, token.arrayGet(env, 3)), env)
                                    + toStringR(url, env);
                    optional = false;
                }

            } else {
                url = toStringR(token.arrayGet(env, 1), env) + toStringR(url, env);
                optional = false;
            }
        }

        if (ZVal.strictEqualityCheck("", "===", url)) {
            url = "/";
        }

        url =
                NamespaceGlobal.strtr
                        .env(env)
                        .call(
                                NamespaceGlobal.rawurlencode.env(env).call(url).value(),
                                this.decodedChars)
                        .value();
        url =
                NamespaceGlobal.strtr
                        .env(env)
                        .call(
                                url,
                                ZVal.newArray(
                                        new ZPair("/../", "/%2E%2E/"), new ZPair("/./", "/%2E/")))
                        .value();
        if (ZVal.strictEqualityCheck(
                "/..", "===", function_substr.f.env(env).call(url, -3).value())) {
            url = toStringR(function_substr.f.env(env).call(url, 0, -2).value(), env) + "%2E%2E";

        } else if (ZVal.strictEqualityCheck(
                "/.", "===", function_substr.f.env(env).call(url, -2).value())) {
            url = toStringR(function_substr.f.env(env).call(url, 0, -1).value(), env) + "%2E";
        }

        schemeAuthority = "";
        host = env.callMethod(this.context, "getHost", UrlGenerator.class);
        scheme = env.callMethod(this.context, "getScheme", UrlGenerator.class);
        if (ZVal.isTrue(requiredSchemes)) {
            if (!function_in_array.f.env(env).call(scheme, requiredSchemes, true).getBool()) {
                referenceType = ZVal.assign(CONST_ABSOLUTE_URL);
                scheme = function_current.f.env(env).call(requiredSchemes).value();
            }
        }

        if (ZVal.isTrue(hostTokens)) {
            routeHost = "";
            for (ZPair zpairResult2012 : ZVal.getIterable(hostTokens, env, true)) {
                token.setObject(ZVal.assign(zpairResult2012.getValue()));
                if (ZVal.strictEqualityCheck("variable", "===", token.arrayGet(env, 0))) {
                    if (ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(
                                            ZVal.getNull(), "!==", this.strictRequirements))
                            && ZVal.toBool(
                                    !function_preg_match
                                            .f
                                            .env(env)
                                            .call(
                                                    "#^"
                                                            + toStringR(token.arrayGet(env, 2), env)
                                                            + "$#i"
                                                            + toStringR(
                                                                    arrayActionR(
                                                                                    ArrayAction
                                                                                            .EMPTY,
                                                                                    token,
                                                                                    env,
                                                                                    4)
                                                                            ? ""
                                                                            : "u",
                                                                    env),
                                                    mergedParams.arrayGet(
                                                            env, token.arrayGet(env, 3)))
                                            .getBool())) {
                        if (ZVal.isTrue(this.strictRequirements)) {
                            throw ZVal.getException(
                                    env,
                                    new InvalidParameterException(
                                            env,
                                            NamespaceGlobal.strtr
                                                    .env(env)
                                                    .call(
                                                            message,
                                                            ZVal.newArray(
                                                                    new ZPair(
                                                                            "{parameter}",
                                                                            token.arrayGet(env, 3)),
                                                                    new ZPair("{route}", name),
                                                                    new ZPair(
                                                                            "{expected}",
                                                                            token.arrayGet(env, 2)),
                                                                    new ZPair(
                                                                            "{given}",
                                                                            mergedParams.arrayGet(
                                                                                    env,
                                                                                    token.arrayGet(
                                                                                            env,
                                                                                            3)))))
                                                    .value()));
                        }

                        if (ZVal.isTrue(this.logger)) {
                            env.callMethod(
                                    this.logger,
                                    "error",
                                    UrlGenerator.class,
                                    message,
                                    ZVal.newArray(
                                            new ZPair("parameter", token.arrayGet(env, 3)),
                                            new ZPair("route", name),
                                            new ZPair("expected", token.arrayGet(env, 2)),
                                            new ZPair(
                                                    "given",
                                                    mergedParams.arrayGet(
                                                            env, token.arrayGet(env, 3)))));
                        }

                        return null;
                    }

                    routeHost =
                            toStringR(token.arrayGet(env, 1), env)
                                    + toStringR(
                                            mergedParams.arrayGet(env, token.arrayGet(env, 3)), env)
                                    + toStringR(routeHost, env);

                } else {
                    routeHost = toStringR(token.arrayGet(env, 1), env) + toStringR(routeHost, env);
                }
            }

            if (ZVal.strictNotEqualityCheck(routeHost, "!==", host)) {
                host = ZVal.assign(routeHost);
                if (ZVal.strictNotEqualityCheck(CONST_ABSOLUTE_URL, "!==", referenceType)) {
                    referenceType = ZVal.assign(CONST_NETWORK_PATH);
                }
            }
        }

        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                CONST_ABSOLUTE_URL, "===", referenceType))
                                || ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                CONST_NETWORK_PATH, "===", referenceType)))
                && ZVal.toBool(!ZVal.isEmpty(host))) {
            port = "";
            if (ZVal.toBool(ZVal.strictEqualityCheck("http", "===", scheme))
                    && ZVal.toBool(
                            ZVal.notEqualityCheck(
                                    80,
                                    env.callMethod(
                                            this.context, "getHttpPort", UrlGenerator.class)))) {
                port =
                        ":"
                                + toStringR(
                                        env.callMethod(
                                                this.context, "getHttpPort", UrlGenerator.class),
                                        env);

            } else if (ZVal.toBool(ZVal.strictEqualityCheck("https", "===", scheme))
                    && ZVal.toBool(
                            ZVal.notEqualityCheck(
                                    443,
                                    env.callMethod(
                                            this.context, "getHttpsPort", UrlGenerator.class)))) {
                port =
                        ":"
                                + toStringR(
                                        env.callMethod(
                                                this.context, "getHttpsPort", UrlGenerator.class),
                                        env);
            }

            schemeAuthority =
                    ZVal.assign(
                            ZVal.strictEqualityCheck(CONST_NETWORK_PATH, "===", referenceType)
                                    ? "//"
                                    : toStringR(scheme, env) + "://");
            schemeAuthority =
                    toStringR(schemeAuthority, env) + toStringR(host, env) + toStringR(port, env);
        }

        if (ZVal.strictEqualityCheck(CONST_RELATIVE_PATH, "===", referenceType)) {
            url =
                    runtimeStaticObject.getRelativePath(
                            env,
                            env.callMethod(this.context, "getPathInfo", UrlGenerator.class),
                            url);

        } else {
            url =
                    toStringR(schemeAuthority, env)
                            + toStringR(
                                    env.callMethod(this.context, "getBaseUrl", UrlGenerator.class),
                                    env)
                            + toStringR(url, env);
        }

        extra.setObject(
                function_array_udiff_assoc
                        .f
                        .env(env)
                        .call(
                                function_array_diff_key
                                        .f
                                        .env(env)
                                        .call(parameters, variables)
                                        .value(),
                                defaults.getObject(),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Symfony\\Component\\Routing\\Generator",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "a")
                                    @ConvertedParameter(index = 1, name = "b")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object a = assignParameter(args, 0, false);
                                        Object b = assignParameter(args, 1, false);
                                        return ZVal.assign(ZVal.equalityCheck(a, b) ? 0 : 1);
                                    }
                                })
                        .value());
        fragment = "";
        if (arrayActionR(ArrayAction.ISSET, defaults, env, "_fragment")) {
            fragment = ZVal.assign(defaults.arrayGet(env, "_fragment"));
        }

        if (arrayActionR(ArrayAction.ISSET, extra, env, "_fragment")) {
            fragment = ZVal.assign(extra.arrayGet(env, "_fragment"));
            arrayActionR(ArrayAction.UNSET, extra, env, "_fragment");
        }

        if (ZVal.toBool(extra.getObject())
                && ZVal.toBool(
                        query =
                                NamespaceGlobal.http_build_query
                                        .env(env)
                                        .call(extra.getObject(), "", "&", 2)
                                        .value())) {
            url =
                    toStringR(url, env)
                            + "?"
                            + toStringR(
                                    NamespaceGlobal.strtr
                                            .env(env)
                                            .call(query, ZVal.newArray(new ZPair("%2F", "/")))
                                            .value(),
                                    env);
        }

        if (ZVal.strictNotEqualityCheck("", "!==", fragment)) {
            url =
                    toStringR(url, env)
                            + "#"
                            + toStringR(
                                    NamespaceGlobal.strtr
                                            .env(env)
                                            .call(
                                                    NamespaceGlobal.rawurlencode
                                                            .env(env)
                                                            .call(fragment)
                                                            .value(),
                                                    ZVal.newArray(
                                                            new ZPair("%2F", "/"),
                                                            new ZPair("%3F", "?")))
                                            .value(),
                                    env);
        }

        return ZVal.assign(url);
    }

    public static final Object CONST_class = "Symfony\\Component\\Routing\\Generator\\UrlGenerator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "basePath")
        @ConvertedParameter(index = 1, name = "targetPath")
        public Object getRelativePath(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            ReferenceContainer basePath =
                    new BasicReferenceContainer(assignParameter(args, 0, false));
            ReferenceContainer targetPath =
                    new BasicReferenceContainer(assignParameter(args, 1, false));
            ReferenceContainer path = new BasicReferenceContainer(null);
            Object slashPos = null;
            Object targetFile = null;
            Object colonPos = null;
            ReferenceContainer sourceDirs = new BasicReferenceContainer(null);
            Object i = null;
            Object dir = null;
            ReferenceContainer targetDirs = new BasicReferenceContainer(null);
            if (ZVal.strictEqualityCheck(basePath.getObject(), "===", targetPath.getObject())) {
                return "";
            }

            sourceDirs.setObject(
                    function_explode
                            .f
                            .env(env)
                            .call(
                                    "/",
                                    ZVal.toBool(arrayActionR(ArrayAction.ISSET, basePath, env, 0))
                                                    && ZVal.toBool(
                                                            ZVal.strictEqualityCheck(
                                                                    "/",
                                                                    "===",
                                                                    basePath.arrayGet(env, 0)))
                                            ? function_substr
                                                    .f
                                                    .env(env)
                                                    .call(basePath.getObject(), 1)
                                                    .value()
                                            : basePath.getObject())
                            .value());
            targetDirs.setObject(
                    function_explode
                            .f
                            .env(env)
                            .call(
                                    "/",
                                    ZVal.toBool(arrayActionR(ArrayAction.ISSET, targetPath, env, 0))
                                                    && ZVal.toBool(
                                                            ZVal.strictEqualityCheck(
                                                                    "/",
                                                                    "===",
                                                                    targetPath.arrayGet(env, 0)))
                                            ? function_substr
                                                    .f
                                                    .env(env)
                                                    .call(targetPath.getObject(), 1)
                                                    .value()
                                            : targetPath.getObject())
                            .value());
            function_array_pop.f.env(env).call(sourceDirs.getObject());
            targetFile = function_array_pop.f.env(env).call(targetDirs.getObject()).value();
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult2013 : ZVal.getIterable(sourceDirs.getObject(), env, false)) {
                i = ZVal.assign(zpairResult2013.getKey());
                dir = ZVal.assign(zpairResult2013.getValue());
                if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, targetDirs, env, i))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        dir, "===", targetDirs.arrayGet(env, i)))) {
                    arrayActionR(ArrayAction.UNSET, sourceDirs, env, i);
                    arrayActionR(ArrayAction.UNSET, targetDirs, env, i);

                } else {
                    break;
                }
            }

            targetDirs.arrayAppend(env).set(targetFile);
            path.setObject(
                    toStringR(
                                    function_str_repeat
                                            .f
                                            .env(env)
                                            .call(
                                                    "../",
                                                    function_count
                                                            .f
                                                            .env(env)
                                                            .call(sourceDirs.getObject())
                                                            .value())
                                            .value(),
                                    env)
                            + toStringR(
                                    NamespaceGlobal.implode
                                            .env(env)
                                            .call("/", targetDirs.getObject())
                                            .value(),
                                    env));
            return ZVal.assign(
                    ZVal.toBool(
                                            ZVal.toBool(
                                                            ZVal.strictEqualityCheck(
                                                                    "", "===", path.getObject()))
                                                    || ZVal.toBool(
                                                            ZVal.strictEqualityCheck(
                                                                    "/",
                                                                    "===",
                                                                    path.arrayGet(env, 0))))
                                    || ZVal.toBool(
                                            ZVal.toBool(
                                                            ZVal.strictNotEqualityCheck(
                                                                    false,
                                                                    "!==",
                                                                    colonPos =
                                                                            function_strpos
                                                                                    .f
                                                                                    .env(env)
                                                                                    .call(
                                                                                            path
                                                                                                    .getObject(),
                                                                                            ":")
                                                                                    .value()))
                                                    && ZVal.toBool(
                                                            ZVal.toBool(
                                                                            ZVal.isLessThan(
                                                                                    colonPos,
                                                                                    '<',
                                                                                    slashPos =
                                                                                            function_strpos
                                                                                                    .f
                                                                                                    .env(
                                                                                                            env)
                                                                                                    .call(
                                                                                                            path
                                                                                                                    .getObject(),
                                                                                                            "/")
                                                                                                    .value()))
                                                                    || ZVal.toBool(
                                                                            ZVal
                                                                                    .strictEqualityCheck(
                                                                                            false,
                                                                                            "===",
                                                                                            slashPos))))
                            ? "./" + toStringR(path.getObject(), env)
                            : path.getObject());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Routing\\Generator\\UrlGenerator")
                    .setLookup(
                            UrlGenerator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "context",
                            "decodedChars",
                            "defaultLocale",
                            "logger",
                            "routes",
                            "strictRequirements")
                    .setFilename("vendor/symfony/routing/Generator/UrlGenerator.php")
                    .addInterface("Symfony\\Component\\Routing\\Generator\\UrlGeneratorInterface")
                    .addInterface("Symfony\\Component\\Routing\\RequestContextAwareInterface")
                    .addInterface(
                            "Symfony\\Component\\Routing\\Generator\\ConfigurableRequirementsInterface")
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
