package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Matcher.namespaces.Dumper.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_flip;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_error_handler;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Matcher.namespaces.Dumper.classes.MatcherDumper;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Matcher.classes.RedirectableUrlMatcherInterface;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.nativeClasses.errors.ErrorException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_implements;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_replace;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Matcher.namespaces.Dumper.classes.StaticPrefixCollection;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes.RouteCollection;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_error_handler;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/routing/Matcher/Dumper/PhpMatcherDumper.php

*/

public class PhpMatcherDumper extends MatcherDumper {

    public Object expressionLanguage = null;

    public Object signalingException = null;

    public Object expressionLanguageProviders = ZVal.newArray();

    public PhpMatcherDumper(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PhpMatcherDumper.class) {
            this.__construct(env, args);
        }
    }

    public PhpMatcherDumper(NoConstructor n) {
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
    public Object dump(RuntimeEnv env, Object... args) {
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 0, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        ReferenceContainer interfaces = new BasicReferenceContainer(null);
        Object supportsRedirections = null;
        options.setObject(
                function_array_replace
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair("class", "ProjectUrlMatcher"),
                                        new ZPair(
                                                "base_class",
                                                "Symfony\\Component\\Routing\\Matcher\\UrlMatcher")),
                                options.getObject())
                        .value());
        interfaces.setObject(
                function_class_implements
                        .f
                        .env(env)
                        .call(options.arrayGet(env, "base_class"))
                        .value());
        supportsRedirections =
                ZVal.assign(
                        arrayActionR(
                                ArrayAction.ISSET,
                                interfaces,
                                env,
                                RedirectableUrlMatcherInterface.CONST_class));
        return ZVal.assign(
                "<?php\n\nuse Symfony\\Component\\Routing\\Exception\\MethodNotAllowedException;\nuse Symfony\\Component\\Routing\\Exception\\ResourceNotFoundException;\nuse Symfony\\Component\\Routing\\RequestContext;\n\n/**\n * This class has been auto-generated\n * by the Symfony Routing Component.\n */\nclass "
                        + toStringR(options.arrayGet(env, "class"), env)
                        + " extends "
                        + toStringR(options.arrayGet(env, "base_class"), env)
                        + "\n{\n    public function __construct(RequestContext $context)\n    {\n        $this->context = $context;\n    }\n\n"
                        + toStringR(this.generateMatchMethod(env, supportsRedirections), env)
                        + "\n}\n");
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
    @ConvertedParameter(index = 0, name = "supportsRedirections", typeHint = "bool")
    private Object generateMatchMethod(RuntimeEnv env, Object... args) {
        Object supportsRedirections = assignParameter(args, 0, false);
        Object routes = null;
        Object route = null;
        Object code = null;
        Object host = null;
        Object name = null;
        Object ternaryExpressionTemp = null;
        Object fetchHost = null;
        Object matchHost = null;
        matchHost = false;
        routes = new StaticPrefixCollection(env);
        for (ZPair zpairResult2053 :
                ZVal.getIterable(
                        env.callMethod(
                                env.callMethod(this, "getRoutes", PhpMatcherDumper.class),
                                "all",
                                PhpMatcherDumper.class),
                        env,
                        false)) {
            name = ZVal.assign(zpairResult2053.getKey());
            route = ZVal.assign(zpairResult2053.getValue());
            if (ZVal.isTrue(host = env.callMethod(route, "getHost", PhpMatcherDumper.class))) {
                matchHost = true;
                host =
                        "/"
                                + toStringR(
                                        NamespaceGlobal.strtr
                                                .env(env)
                                                .call(
                                                        NamespaceGlobal.strrev
                                                                .env(env)
                                                                .call(host)
                                                                .value(),
                                                        "}.{",
                                                        "(/)")
                                                .value(),
                                        env);
            }

            env.callMethod(
                    routes,
                    "addRoute",
                    PhpMatcherDumper.class,
                    ZVal.isTrue(ternaryExpressionTemp = host) ? ternaryExpressionTemp : "/(.*)",
                    ZVal.newArray(new ZPair(0, name), new ZPair(1, route)));
        }

        routes =
                ZVal.assign(
                        ZVal.isTrue(matchHost)
                                ? env.callMethod(
                                        routes,
                                        "populateCollection",
                                        PhpMatcherDumper.class,
                                        new RouteCollection(env))
                                : env.callMethod(this, "getRoutes", PhpMatcherDumper.class));
        code =
                function_rtrim
                        .f
                        .env(env)
                        .call(this.compileRoutes(env, routes, matchHost), "\n")
                        .value();
        fetchHost =
                ZVal.assign(
                        ZVal.isTrue(matchHost)
                                ? "        $host = strtolower($context->getHost());\n"
                                : "");
        code =
                ZVal.assign(
                        "    {\n        $allow = $allowSchemes = array();\n        $pathinfo = rawurldecode($rawPathinfo);\n        $context = $this->context;\n        $requestMethod = $canonicalMethod = $context->getMethod();\n"
                                + toStringR(fetchHost, env)
                                + "\n        if ('HEAD' === $requestMethod) {\n            $canonicalMethod = 'GET';\n        }\n\n"
                                + toStringR(code, env)
                                + "\n");
        if (ZVal.isTrue(supportsRedirections)) {
            return ZVal.assign(
                    ZVal.getResourceAsString("stringLiterals/stringLiteral3442.txt")
                            + toStringR(code, env)
                            + "\n        return null;\n    }");
        }

        return ZVal.assign(
                "    public function match($rawPathinfo)\n"
                        + toStringR(code, env)
                        + "\n        throw $allow ? new MethodNotAllowedException(array_keys($allow)) : new ResourceNotFoundException();\n    }");
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "routes",
        typeHint = "Symfony\\Component\\Routing\\RouteCollection"
    )
    @ConvertedParameter(index = 1, name = "matchHost", typeHint = "bool")
    private Object compileRoutes(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        Object routes = assignParameter(args, 0, false);
        Object matchHost = assignParameter(args, 1, false);
        Object staticRoutes = null;
        Object code = null;
        Object e = null;
        Object runtimeTempArrayResult205 = null;
        Object dynamicRoutes = null;
        Object chunkLimit = null;
        ZVal.list(
                runtimeTempArrayResult205 = this.groupStaticRoutes(env, routes),
                (staticRoutes = listGet(runtimeTempArrayResult205, 0, env)),
                (dynamicRoutes = listGet(runtimeTempArrayResult205, 1, env)));
        code = this.compileStaticRoutes(env, staticRoutes, matchHost);
        chunkLimit = function_count.f.env(env).call(dynamicRoutes).value();
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        while (ZVal.isTrue(true)) {
            try {
                this.signalingException =
                        new RuntimeException(
                                env,
                                "preg_match(): Compilation failed: regular expression is too large");
                code =
                        toStringR(code, env)
                                + toStringR(
                                        this.compileDynamicRoutes(
                                                env, dynamicRoutes, matchHost, chunkLimit),
                                        env);
                break;
            } catch (ConvertedException convertedException302) {
                if (convertedException302.instanceOf(PHPException.class, "Exception")) {
                    e = convertedException302.getObject();
                    if (ZVal.toBool(ZVal.isLessThan(1, '<', chunkLimit))
                            && ZVal.toBool(
                                    ZVal.strictEqualityCheck(this.signalingException, "===", e))) {
                        chunkLimit = ZVal.add(1, ZVal.toLong(chunkLimit) >> ZVal.toLong(1));
                        continue;
                    }

                    throw ZVal.getException(env, e);
                } else {
                    throw convertedException302;
                }
            }
        }

        code = toStringR(code, env) + "        if ('/' === $pathinfo && !$allow) {\n";
        code =
                toStringR(code, env)
                        + "            throw new Symfony\\Component\\Routing\\Exception\\NoConfigurationException();\n";
        code = toStringR(code, env) + "        }\n";
        return ZVal.assign(code);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "collection",
        typeHint = "Symfony\\Component\\Routing\\RouteCollection"
    )
    private Object groupStaticRoutes(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object collection = assignParameter(args, 0, false);
        ReferenceContainer dynamicRegex = new BasicReferenceContainer(null);
        Object hostRx = null;
        Object rx = null;
        Object compiledRoute = null;
        Object url = null;
        Object dynamicRoutes = null;
        ReferenceContainer staticRoutes = new BasicReferenceContainer(null);
        Object regex = null;
        Object route = null;
        Object runtimeTempArrayResult206 = null;
        Object host = null;
        ReferenceContainer name = new BasicReferenceContainer(null);
        Object hostRegex = null;
        staticRoutes.setObject(ZVal.assign(dynamicRegex.setObject(ZVal.newArray())));
        dynamicRoutes = new RouteCollection(env);
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2054 :
                ZVal.getIterable(
                        env.callMethod(collection, "all", PhpMatcherDumper.class), env, false)) {
            name.setObject(ZVal.assign(zpairResult2054.getKey()));
            route = ZVal.assign(zpairResult2054.getValue());
            compiledRoute = env.callMethod(route, "compile", PhpMatcherDumper.class);
            hostRegex = env.callMethod(compiledRoute, "getHostRegex", PhpMatcherDumper.class);
            regex = env.callMethod(compiledRoute, "getRegex", PhpMatcherDumper.class);
            if (!ZVal.isTrue(
                    env.callMethod(compiledRoute, "getPathVariables", PhpMatcherDumper.class))) {
                host =
                        ZVal.assign(
                                !ZVal.isTrue(
                                                env.callMethod(
                                                        compiledRoute,
                                                        "getHostVariables",
                                                        PhpMatcherDumper.class))
                                        ? env.callMethod(route, "getHost", PhpMatcherDumper.class)
                                        : "");
                url = env.callMethod(route, "getPath", PhpMatcherDumper.class);
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult2055 :
                        ZVal.getIterable(dynamicRegex.getObject(), env, true)) {
                    ZVal.list(
                            runtimeTempArrayResult206 = zpairResult2055.getValue(),
                            (hostRx = listGet(runtimeTempArrayResult206, 0, env)),
                            (rx = listGet(runtimeTempArrayResult206, 1, env)));
                    if (ZVal.toBool(function_preg_match.f.env(env).call(rx, url).value())
                            && ZVal.toBool(
                                    ZVal.toBool(
                                                    ZVal.toBool(!ZVal.isTrue(host))
                                                            || ZVal.toBool(!ZVal.isTrue(hostRx)))
                                            || ZVal.toBool(
                                                    function_preg_match
                                                            .f
                                                            .env(env)
                                                            .call(hostRx, host)
                                                            .value()))) {
                        dynamicRegex
                                .arrayAppend(env)
                                .set(ZVal.newArray(new ZPair(0, hostRegex), new ZPair(1, regex)));
                        env.callMethod(
                                dynamicRoutes,
                                new RuntimeArgsWithReferences().add(0, name),
                                "add",
                                PhpMatcherDumper.class,
                                name.getObject(),
                                route);
                        runtimeConverterContinueCount = 2;
                        runtimeConverterContinueCount--;
                        continue;
                    }
                }

                staticRoutes.arrayAccess(env, url, name.getObject()).set(route);

            } else {
                dynamicRegex
                        .arrayAppend(env)
                        .set(ZVal.newArray(new ZPair(0, hostRegex), new ZPair(1, regex)));
                env.callMethod(
                        dynamicRoutes,
                        new RuntimeArgsWithReferences().add(0, name),
                        "add",
                        PhpMatcherDumper.class,
                        name.getObject(),
                        route);
            }
        }

        return ZVal.assign(
                ZVal.newArray(new ZPair(0, staticRoutes.getObject()), new ZPair(1, dynamicRoutes)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "staticRoutes", typeHint = "array")
    @ConvertedParameter(index = 1, name = "matchHost", typeHint = "bool")
    private Object compileStaticRoutes(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object staticRoutes = assignParameter(args, 0, false);
        Object matchHost = assignParameter(args, 1, false);
        Object routes = null;
        Object _pDefault = null;
        Object code = null;
        Object route = null;
        ReferenceContainer defaults = new BasicReferenceContainer(null);
        Object name = null;
        Object ternaryExpressionTemp = null;
        Object url = null;
        if (!ZVal.isTrue(staticRoutes)) {
            return "";
        }

        code = ZVal.assign(_pDefault = "");
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2056 : ZVal.getIterable(staticRoutes, env, false)) {
            url = ZVal.assign(zpairResult2056.getKey());
            routes = ZVal.assign(zpairResult2056.getValue());
            if (ZVal.strictEqualityCheck(
                    1, "===", function_count.f.env(env).call(routes).value())) {
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult2057 : ZVal.getIterable(routes, env, false)) {
                    name = ZVal.assign(zpairResult2057.getKey());
                    route = ZVal.assign(zpairResult2057.getValue());
                }

                if (!ZVal.isTrue(env.callMethod(route, "getCondition", PhpMatcherDumper.class))) {
                    defaults.setObject(
                            env.callMethod(route, "getDefaults", PhpMatcherDumper.class));
                    if (arrayActionR(ArrayAction.ISSET, defaults, env, "_canonical_route")) {
                        name = ZVal.assign(defaults.arrayGet(env, "_canonical_route"));
                        arrayActionR(ArrayAction.UNSET, defaults, env, "_canonical_route");
                    }

                    _pDefault =
                            toStringR(_pDefault, env)
                                    + toStringR(
                                            function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            "%s => array(%s, %s, %s, %s),\n",
                                                            runtimeStaticObject.export(env, url),
                                                            runtimeStaticObject.export(
                                                                    env,
                                                                    ZVal.add(
                                                                            ZVal.newArray(
                                                                                    new ZPair(
                                                                                            "_route",
                                                                                            name)),
                                                                            defaults.getObject())),
                                                            runtimeStaticObject.export(
                                                                    env,
                                                                    ZVal.isTrue(
                                                                                    ternaryExpressionTemp =
                                                                                            !ZVal
                                                                                                            .isTrue(
                                                                                                                    env
                                                                                                                            .callMethod(
                                                                                                                                    env
                                                                                                                                            .callMethod(
                                                                                                                                                    route,
                                                                                                                                                    "compile",
                                                                                                                                                    PhpMatcherDumper
                                                                                                                                                            .class),
                                                                                                                                    "getHostVariables",
                                                                                                                                    PhpMatcherDumper
                                                                                                                                            .class))
                                                                                                    ? env
                                                                                                            .callMethod(
                                                                                                                    route,
                                                                                                                    "getHost",
                                                                                                                    PhpMatcherDumper
                                                                                                                            .class)
                                                                                                    : env
                                                                                                            .callMethod(
                                                                                                                    env
                                                                                                                            .callMethod(
                                                                                                                                    route,
                                                                                                                                    "compile",
                                                                                                                                    PhpMatcherDumper
                                                                                                                                            .class),
                                                                                                                    "getHostRegex",
                                                                                                                    PhpMatcherDumper
                                                                                                                            .class))
                                                                            ? ternaryExpressionTemp
                                                                            : ZVal.getNull()),
                                                            runtimeStaticObject.export(
                                                                    env,
                                                                    ZVal.isTrue(
                                                                                    ternaryExpressionTemp =
                                                                                            function_array_flip
                                                                                                    .f
                                                                                                    .env(
                                                                                                            env)
                                                                                                    .call(
                                                                                                            env
                                                                                                                    .callMethod(
                                                                                                                            route,
                                                                                                                            "getMethods",
                                                                                                                            PhpMatcherDumper
                                                                                                                                    .class))
                                                                                                    .value())
                                                                            ? ternaryExpressionTemp
                                                                            : ZVal.getNull()),
                                                            runtimeStaticObject.export(
                                                                    env,
                                                                    ZVal.isTrue(
                                                                                    ternaryExpressionTemp =
                                                                                            function_array_flip
                                                                                                    .f
                                                                                                    .env(
                                                                                                            env)
                                                                                                    .call(
                                                                                                            env
                                                                                                                    .callMethod(
                                                                                                                            route,
                                                                                                                            "getSchemes",
                                                                                                                            PhpMatcherDumper
                                                                                                                                    .class))
                                                                                                    .value())
                                                                            ? ternaryExpressionTemp
                                                                            : ZVal.getNull()))
                                                    .value(),
                                            env);
                    continue;
                }
            }

            code =
                    toStringR(code, env)
                            + toStringR(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "        case %s:\n",
                                                    runtimeStaticObject.export(env, url))
                                            .value(),
                                    env);
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult2058 : ZVal.getIterable(routes, env, false)) {
                name = ZVal.assign(zpairResult2058.getKey());
                route = ZVal.assign(zpairResult2058.getValue());
                code =
                        toStringR(code, env)
                                + toStringR(this.compileRoute(env, route, name, true), env);
            }

            code = toStringR(code, env) + "            break;\n";
        }

        if (ZVal.isTrue(_pDefault)) {
            code =
                    toStringR(code, env)
                            + toStringR(
                                    "        default:\n            $routes = array(\n"
                                            + toStringR(this.indent(env, _pDefault, 4), env)
                                            + "            );\n\n            if (!isset($routes[$pathinfo])) {\n                break;\n            }\n            list($ret, $requiredHost, $requiredMethods, $requiredSchemes) = $routes[$pathinfo];\n"
                                            + toStringR(
                                                    this.compileSwitchDefault(
                                                            env, false, matchHost),
                                                    env)
                                            + "",
                                    env);
        }

        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "        switch ($pathinfo) {\n%s        }\n\n",
                                this.indent(env, code))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "collection",
        typeHint = "Symfony\\Component\\Routing\\RouteCollection"
    )
    @ConvertedParameter(index = 1, name = "matchHost", typeHint = "bool")
    @ConvertedParameter(index = 2, name = "chunkLimit", typeHint = "int")
    private Object compileDynamicRoutes(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/routing/Matcher/Dumper")
                        .setFile("/vendor/symfony/routing/Matcher/Dumper/PhpMatcherDumper.php");
        Object collection = assignParameter(args, 0, false);
        Object matchHost = assignParameter(args, 1, false);
        Object chunkLimit = assignParameter(args, 2, false);
        Object code = null;
        ReferenceContainer chunkSize = new BasicReferenceContainer(null);
        ReferenceContainer rx = new BasicReferenceContainer(null);
        Object prev = null;
        Object tree = null;
        Object runtimeTempArrayResult208 = null;
        Object matchedPathinfo = null;
        Object modifiers = null;
        Object routes = null;
        Object regex = null;
        Object route = null;
        Object runtimeTempArrayResult207 = null;
        ReferenceContainer perModifiers = new BasicReferenceContainer(null);
        ReferenceContainer name = new BasicReferenceContainer(null);
        ReferenceContainer perHost = new BasicReferenceContainer(null);
        Object state = null;
        Object hostRegex = null;
        if (!ZVal.isTrue(env.callMethod(collection, "all", PhpMatcherDumper.class))) {
            return "";
        }

        code = "";
        state =
                ZVal.assign(
                        toObjectR(
                                ZVal.newArray(
                                        new ZPair("regex", ""),
                                        new ZPair("switch", ""),
                                        new ZPair("default", ""),
                                        new ZPair("mark", 0),
                                        new ZPair("markTail", 0),
                                        new ZPair("hostVars", ZVal.newArray()),
                                        new ZPair("vars", ZVal.newArray()))));
        toObjectR(state)
                .accessProp(this, env)
                .name("getVars")
                .set(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Symfony\\Component\\Routing\\Matcher\\Dumper",
                                null) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "m")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                ReferenceContainer m =
                                        new BasicReferenceContainer(
                                                assignParameter(args, 0, false));
                                Object state = null;
                                state = this.contextReferences.getCapturedValue("state");
                                if (ZVal.strictEqualityCheck("_route", "===", m.arrayGet(env, 1))) {
                                    return "?:";
                                }

                                new ReferenceClassProperty(state, "vars", env)
                                        .arrayAppend(env)
                                        .set(m.arrayGet(env, 1));
                                return "";
                            }
                        }.use("state", state));
        chunkSize.setObject(0);
        prev = ZVal.getNull();
        perModifiers.setObject(ZVal.newArray());
        for (ZPair zpairResult2059 :
                ZVal.getIterable(
                        env.callMethod(collection, "all", PhpMatcherDumper.class), env, false)) {
            name.setObject(ZVal.assign(zpairResult2059.getKey()));
            route = ZVal.assign(zpairResult2059.getValue());
            function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, rx))
                    .call(
                            "#[a-zA-Z]*$#",
                            env.callMethod(
                                    env.callMethod(route, "compile", PhpMatcherDumper.class),
                                    "getRegex",
                                    PhpMatcherDumper.class),
                            rx.getObject());
            if (ZVal.toBool(ZVal.isLessThan(chunkLimit, '<', ZVal.preIncrement(chunkSize)))
                    || ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.strictNotEqualityCheck(
                                                    prev, "!==", rx.arrayGet(env, 0)))
                                    && ZVal.toBool(
                                            env.callMethod(
                                                    env.callMethod(
                                                            route,
                                                            "compile",
                                                            PhpMatcherDumper.class),
                                                    "getPathVariables",
                                                    PhpMatcherDumper.class)))) {
                chunkSize.setObject(1);
                routes = new RouteCollection(env);
                perModifiers
                        .arrayAppend(env)
                        .set(
                                ZVal.newArray(
                                        new ZPair(0, rx.arrayGet(env, 0)), new ZPair(1, routes)));
                prev = ZVal.assign(rx.arrayGet(env, 0));
            }

            env.callMethod(
                    routes,
                    new RuntimeArgsWithReferences().add(0, name),
                    "add",
                    PhpMatcherDumper.class,
                    name.getObject(),
                    route);
        }

        for (ZPair zpairResult2060 : ZVal.getIterable(perModifiers.getObject(), env, true)) {
            ZVal.list(
                    runtimeTempArrayResult208 = zpairResult2060.getValue(),
                    (modifiers = listGet(runtimeTempArrayResult208, 0, env)),
                    (routes = listGet(runtimeTempArrayResult208, 1, env)));
            prev = false;
            perHost.setObject(ZVal.newArray());
            for (ZPair zpairResult2061 :
                    ZVal.getIterable(
                            env.callMethod(routes, "all", PhpMatcherDumper.class), env, false)) {
                name.setObject(ZVal.assign(zpairResult2061.getKey()));
                route = ZVal.assign(zpairResult2061.getValue());
                regex =
                        env.callMethod(
                                env.callMethod(route, "compile", PhpMatcherDumper.class),
                                "getHostRegex",
                                PhpMatcherDumper.class);
                if (ZVal.strictNotEqualityCheck(prev, "!==", regex)) {
                    routes = new RouteCollection(env);
                    perHost.arrayAppend(env)
                            .set(ZVal.newArray(new ZPair(0, regex), new ZPair(1, routes)));
                    prev = ZVal.assign(regex);
                }

                env.callMethod(
                        routes,
                        new RuntimeArgsWithReferences().add(0, name),
                        "add",
                        PhpMatcherDumper.class,
                        name.getObject(),
                        route);
            }

            prev = false;
            rx.setObject("{^(?");
            code =
                    toStringR(code, env)
                            + toStringR(
                                    "\n            "
                                            + toStringR(
                                                    toObjectR(state)
                                                            .accessProp(this, env)
                                                            .name("mark")
                                                            .value(),
                                                    env)
                                            + " => ",
                                    env)
                            + toStringR(runtimeStaticObject.export(env, rx.getObject()), env);
            toObjectR(state)
                    .accessProp(this, env)
                    .name("mark")
                    .set(
                            ZAssignment.add(
                                    "+=",
                                    toObjectR(state).accessProp(this, env).name("mark").value(),
                                    function_strlen.f.env(env).call(rx.getObject()).value()));
            toObjectR(state).accessProp(this, env).name("regex").set(rx.getObject());
            for (ZPair zpairResult2062 : ZVal.getIterable(perHost.getObject(), env, true)) {
                ZVal.list(
                        runtimeTempArrayResult207 = zpairResult2062.getValue(),
                        (hostRegex = listGet(runtimeTempArrayResult207, 0, env)),
                        (routes = listGet(runtimeTempArrayResult207, 1, env)));
                if (ZVal.isTrue(matchHost)) {
                    if (ZVal.isTrue(hostRegex)) {
                        function_preg_match
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, rx))
                                .call("#^.\\^(.*)\\$.[a-zA-Z]*$#", hostRegex, rx.getObject());
                        toObjectR(state).accessProp(this, env).name("vars").set(ZVal.newArray());
                        hostRegex =
                                "(?i:"
                                        + toStringR(
                                                NamespaceGlobal.preg_replace_callback
                                                        .env(env)
                                                        .call(
                                                                "#\\?P<([^>]++)>#",
                                                                toObjectR(state)
                                                                        .accessProp(this, env)
                                                                        .name("getVars")
                                                                        .value(),
                                                                rx.arrayGet(env, 1))
                                                        .value(),
                                                env)
                                        + ")\\.";
                        toObjectR(state)
                                .accessProp(this, env)
                                .name("hostVars")
                                .set(toObjectR(state).accessProp(this, env).name("vars").value());

                    } else {
                        hostRegex = "(?:(?:[^.]*+\\.)++)";
                        toObjectR(state)
                                .accessProp(this, env)
                                .name("hostVars")
                                .set(ZVal.newArray());
                    }

                    toObjectR(state)
                            .accessProp(this, env)
                            .name("mark")
                            .set(
                                    ZAssignment.add(
                                            "+=",
                                            toObjectR(state)
                                                    .accessProp(this, env)
                                                    .name("mark")
                                                    .value(),
                                            function_strlen
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            rx.setObject(
                                                                    toStringR(
                                                                                    ZVal.isTrue(
                                                                                                    prev)
                                                                                            ? ")"
                                                                                            : "",
                                                                                    env)
                                                                            + toStringR(
                                                                                    "|"
                                                                                            + toStringR(
                                                                                                    hostRegex,
                                                                                                    env)
                                                                                            + "(?",
                                                                                    env)))
                                                    .value()));
                    code =
                            toStringR(code, env)
                                    + "\n                ."
                                    + toStringR(
                                            runtimeStaticObject.export(env, rx.getObject()), env);
                    toObjectR(state)
                            .accessProp(this, env)
                            .name("regex")
                            .set(
                                    toStringR(
                                                    toObjectR(state)
                                                            .accessProp(this, env)
                                                            .name("regex")
                                                            .value(),
                                                    env)
                                            + toStringR(rx.getObject(), env));
                    prev = true;
                }

                tree = new StaticPrefixCollection(env);
                for (ZPair zpairResult2063 :
                        ZVal.getIterable(
                                env.callMethod(routes, "all", PhpMatcherDumper.class),
                                env,
                                false)) {
                    name.setObject(ZVal.assign(zpairResult2063.getKey()));
                    route = ZVal.assign(zpairResult2063.getValue());
                    function_preg_match
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithReferences().add(2, rx))
                            .call(
                                    "#^.\\^(.*)\\$.[a-zA-Z]*$#",
                                    env.callMethod(
                                            env.callMethod(
                                                    route, "compile", PhpMatcherDumper.class),
                                            "getRegex",
                                            PhpMatcherDumper.class),
                                    rx.getObject());
                    toObjectR(state).accessProp(this, env).name("vars").set(ZVal.newArray());
                    regex =
                            NamespaceGlobal.preg_replace_callback
                                    .env(env)
                                    .call(
                                            "#\\?P<([^>]++)>#",
                                            toObjectR(state)
                                                    .accessProp(this, env)
                                                    .name("getVars")
                                                    .value(),
                                            rx.arrayGet(env, 1))
                                    .value();
                    env.callMethod(
                            tree,
                            "addRoute",
                            PhpMatcherDumper.class,
                            regex,
                            ZVal.newArray(
                                    new ZPair(0, name.getObject()),
                                    new ZPair(1, regex),
                                    new ZPair(
                                            2,
                                            toObjectR(state)
                                                    .accessProp(this, env)
                                                    .name("vars")
                                                    .value()),
                                    new ZPair(3, route)));
                }

                code =
                        toStringR(code, env)
                                + toStringR(
                                        this.compileStaticPrefixCollection(env, tree, state), env);
            }

            if (ZVal.isTrue(matchHost)) {
                code = toStringR(code, env) + "\n                .')'";
                toObjectR(state)
                        .accessProp(this, env)
                        .name("regex")
                        .set(
                                toStringR(
                                                toObjectR(state)
                                                        .accessProp(this, env)
                                                        .name("regex")
                                                        .value(),
                                                env)
                                        + ")");
            }

            rx.setObject(ZVal.assign(")$}" + toStringR(modifiers, env)));
            code =
                    toStringR(code, env)
                            + toStringR(
                                    "\n                .'" + toStringR(rx.getObject(), env) + "',",
                                    env);
            toObjectR(state)
                    .accessProp(this, env)
                    .name("regex")
                    .set(
                            toStringR(
                                            toObjectR(state)
                                                    .accessProp(this, env)
                                                    .name("regex")
                                                    .value(),
                                            env)
                                    + toStringR(rx.getObject(), env));
            toObjectR(state).accessProp(this, env).name("markTail").set(0);
            function_set_error_handler
                    .f
                    .env(env)
                    .call(
                            new Closure(
                                    env,
                                    runtimeConverterFunctionClassConstants,
                                    "Symfony\\Component\\Routing\\Matcher\\Dumper",
                                    this) {
                                @Override
                                @ConvertedMethod
                                @ConvertedParameter(index = 0, name = "type")
                                @ConvertedParameter(index = 1, name = "message")
                                public Object run(
                                        RuntimeEnv env,
                                        Object thisvar,
                                        PassByReferenceArgs runtimePassByReferenceArgs,
                                        Object... args) {
                                    Object _closureThisVar = this.getClosureThisVar();
                                    Object type = assignParameter(args, 0, false);
                                    Object message = assignParameter(args, 1, false);
                                    throw ZVal.getException(
                                            env,
                                            ZVal.strictEqualityCheck(
                                                            0,
                                                            "===",
                                                            function_strpos
                                                                    .f
                                                                    .env(env)
                                                                    .call(
                                                                            message,
                                                                            env.callMethod(
                                                                                    PhpMatcherDumper
                                                                                            .this
                                                                                            .signalingException,
                                                                                    "getMessage",
                                                                                    PhpMatcherDumper
                                                                                            .class))
                                                                    .value())
                                                    ? PhpMatcherDumper.this.signalingException
                                                    : new ErrorException(env, message));
                                }
                            });
            try {
                function_preg_match
                        .f
                        .env(env)
                        .call(toObjectR(state).accessProp(this, env).name("regex").value(), "");
            } catch (ConvertedException convertedException303) {

                throw convertedException303;
            } finally {
                function_restore_error_handler.f.env(env).call();
            }
        }

        if (toObjectR(state).accessProp(this, env).name("default").getBool()) {
            toObjectR(state)
                    .accessProp(this, env)
                    .name("switch")
                    .set(
                            toStringR(
                                            toObjectR(state)
                                                    .accessProp(this, env)
                                                    .name("switch")
                                                    .value(),
                                            env)
                                    + toStringR(
                                            "        default:\n            $routes = array(\n"
                                                    + toStringR(
                                                            this.indent(
                                                                    env,
                                                                    toObjectR(state)
                                                                            .accessProp(this, env)
                                                                            .name("default")
                                                                            .value(),
                                                                    4),
                                                            env)
                                                    + "            );\n\n            list($ret, $vars, $requiredMethods, $requiredSchemes) = $routes[$m];\n"
                                                    + toStringR(
                                                            this.compileSwitchDefault(
                                                                    env, true, matchHost),
                                                            env)
                                                    + "",
                                            env));
        }

        matchedPathinfo = ZVal.assign(ZVal.isTrue(matchHost) ? "$host.'.'.$pathinfo" : "$pathinfo");
        toObjectR(state).accessProp(this, env).name("getVars").set(null);
        return ZVal.assign(
                "        $matchedPathinfo = "
                        + toStringR(matchedPathinfo, env)
                        + ";\n        $regexList = array("
                        + toStringR(code, env)
                        + "\n        );\n\n        foreach ($regexList as $offset => $regex) {\n            while (preg_match($regex, $matchedPathinfo, $matches)) {\n                switch ($m = (int) $matches['MARK']) {\n"
                        + toStringR(
                                this.indent(
                                        env,
                                        toObjectR(state)
                                                .accessProp(this, env)
                                                .name("switch")
                                                .value(),
                                        3),
                                env)
                        + "                }\n\n                if ("
                        + toStringR(
                                toObjectR(state).accessProp(this, env).name("mark").value(), env)
                        + " === $m) {\n                    break;\n                }\n                $regex = substr_replace($regex, 'F', $m - $offset, 1 + strlen($m));\n                $offset += strlen($m);\n            }\n        }\n");
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "tree",
        typeHint = "Symfony\\Component\\Routing\\Matcher\\Dumper\\StaticPrefixCollection"
    )
    @ConvertedParameter(index = 1, name = "state", typeHint = "stdClass")
    @ConvertedParameter(
        index = 2,
        name = "prefixLen",
        typeHint = "int",
        defaultValue = "0",
        defaultValueType = "number"
    )
    private Object compileStaticPrefixCollection(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object tree = assignParameter(args, 0, false);
        Object state = assignParameter(args, 1, false);
        Object prefixLen = assignParameter(args, 2, true);
        if (null == prefixLen) {
            prefixLen = 0;
        }
        ReferenceContainer next = new BasicReferenceContainer(null);
        Object code = null;
        Object prefix = null;
        Object rx = null;
        Object i = null;
        Object runtimeTempArrayResult209 = null;
        Object ternaryExpressionTemp = null;
        Object j = null;
        Object m = null;
        Object prevRegex = null;
        Object compiledRoute = null;
        ReferenceContainer routes = new BasicReferenceContainer(null);
        Object regex = null;
        Object route = null;
        ReferenceContainer defaults = new BasicReferenceContainer(null);
        Object name = null;
        Object vars = null;
        Object combine = null;
        code = "";
        prevRegex = ZVal.getNull();
        routes.setObject(env.callMethod(tree, "getRoutes", PhpMatcherDumper.class));
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2064 : ZVal.getIterable(routes.getObject(), env, false)) {
            i = ZVal.assign(zpairResult2064.getKey());
            route = ZVal.assign(zpairResult2064.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            route,
                            StaticPrefixCollection.class,
                            "Symfony\\Component\\Routing\\Matcher\\Dumper\\StaticPrefixCollection"))) {
                prevRegex = ZVal.getNull();
                prefix =
                        function_substr
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(route, "getPrefix", PhpMatcherDumper.class),
                                        prefixLen)
                                .value();
                toObjectR(state)
                        .accessProp(this, env)
                        .name("mark")
                        .set(
                                ZAssignment.add(
                                        "+=",
                                        toObjectR(state).accessProp(this, env).name("mark").value(),
                                        function_strlen
                                                .f
                                                .env(env)
                                                .call(
                                                        rx =
                                                                ZVal.assign(
                                                                        "|"
                                                                                + toStringR(
                                                                                        prefix, env)
                                                                                + "(?"))
                                                .value()));
                code =
                        toStringR(code, env)
                                + "\n                    ."
                                + toStringR(runtimeStaticObject.export(env, rx), env);
                toObjectR(state)
                        .accessProp(this, env)
                        .name("regex")
                        .set(
                                toStringR(
                                                toObjectR(state)
                                                        .accessProp(this, env)
                                                        .name("regex")
                                                        .value(),
                                                env)
                                        + toStringR(rx, env));
                code =
                        toStringR(code, env)
                                + toStringR(
                                        this.indent(
                                                env,
                                                this.compileStaticPrefixCollection(
                                                        env,
                                                        route,
                                                        state,
                                                        ZVal.add(
                                                                prefixLen,
                                                                function_strlen
                                                                        .f
                                                                        .env(env)
                                                                        .call(prefix)
                                                                        .value()))),
                                        env);
                code = toStringR(code, env) + "\n                    .')'";
                toObjectR(state)
                        .accessProp(this, env)
                        .name("regex")
                        .set(
                                toStringR(
                                                toObjectR(state)
                                                        .accessProp(this, env)
                                                        .name("regex")
                                                        .value(),
                                                env)
                                        + ")");
                toObjectR(state)
                        .accessProp(this, env)
                        .name("markTail")
                        .set(
                                ZVal.increment(
                                        toObjectR(state)
                                                .accessProp(this, env)
                                                .name("markTail")
                                                .value()));
                continue;
            }

            ZVal.list(
                    runtimeTempArrayResult209 = route,
                    (name = listGet(runtimeTempArrayResult209, 0, env)),
                    (regex = listGet(runtimeTempArrayResult209, 1, env)),
                    (vars = listGet(runtimeTempArrayResult209, 2, env)),
                    (route = listGet(runtimeTempArrayResult209, 3, env)));
            compiledRoute = env.callMethod(route, "compile", PhpMatcherDumper.class);
            if (ZVal.strictEqualityCheck(
                    env.callMethod(compiledRoute, "getRegex", PhpMatcherDumper.class),
                    "===",
                    prevRegex)) {
                toObjectR(state)
                        .accessProp(this, env)
                        .name("switch")
                        .set(
                                NamespaceGlobal.substr_replace
                                        .env(env)
                                        .call(
                                                toObjectR(state)
                                                        .accessProp(this, env)
                                                        .name("switch")
                                                        .value(),
                                                toStringR(
                                                                this.compileRoute(
                                                                        env, route, name, false),
                                                                env)
                                                        + "\n",
                                                -19,
                                                0)
                                        .value());
                continue;
            }

            toObjectR(state)
                    .accessProp(this, env)
                    .name("mark")
                    .set(
                            ZAssignment.add(
                                    "+=",
                                    toObjectR(state).accessProp(this, env).name("mark").value(),
                                    ZVal.subtract(
                                            ZVal.add(
                                                    ZVal.add(
                                                            3,
                                                            toObjectR(state)
                                                                    .accessProp(this, env)
                                                                    .name("markTail")
                                                                    .value()),
                                                    function_strlen.f.env(env).call(regex).value()),
                                            prefixLen)));
            toObjectR(state)
                    .accessProp(this, env)
                    .name("markTail")
                    .set(
                            ZVal.add(
                                    2,
                                    function_strlen
                                            .f
                                            .env(env)
                                            .call(
                                                    toObjectR(state)
                                                            .accessProp(this, env)
                                                            .name("mark")
                                                            .value())
                                            .value()));
            rx =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "|%s(*:%s)",
                                    function_substr.f.env(env).call(regex, prefixLen).value(),
                                    toObjectR(state).accessProp(this, env).name("mark").value())
                            .value();
            code =
                    toStringR(code, env)
                            + "\n                    ."
                            + toStringR(runtimeStaticObject.export(env, rx), env);
            toObjectR(state)
                    .accessProp(this, env)
                    .name("regex")
                    .set(
                            toStringR(
                                            toObjectR(state)
                                                    .accessProp(this, env)
                                                    .name("regex")
                                                    .value(),
                                            env)
                                    + toStringR(rx, env));
            vars =
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    toObjectR(state).accessProp(this, env).name("hostVars").value(),
                                    vars)
                            .value();
            if (ZVal.toBool(
                            !ZVal.isTrue(
                                    env.callMethod(route, "getCondition", PhpMatcherDumper.class)))
                    && ZVal.toBool(
                            ZVal.toBool(
                                            !function_is_array
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            next.setObject(
                                                                    ZVal.assign(
                                                                            ZVal.isDefined(
                                                                                            ternaryExpressionTemp =
                                                                                                    routes
                                                                                                            .arrayGet(
                                                                                                                    env,
                                                                                                                    ZVal
                                                                                                                            .add(
                                                                                                                                    1,
                                                                                                                                    i)))
                                                                                    ? ternaryExpressionTemp
                                                                                    : ZVal
                                                                                            .getNull())))
                                                    .getBool())
                                    || ZVal.toBool(
                                            ZVal.strictNotEqualityCheck(
                                                    regex, "!==", next.arrayGet(env, 1))))) {
                prevRegex = ZVal.getNull();
                defaults.setObject(env.callMethod(route, "getDefaults", PhpMatcherDumper.class));
                if (arrayActionR(ArrayAction.ISSET, defaults, env, "_canonical_route")) {
                    name = ZVal.assign(defaults.arrayGet(env, "_canonical_route"));
                    arrayActionR(ArrayAction.UNSET, defaults, env, "_canonical_route");
                }

                toObjectR(state)
                        .accessProp(this, env)
                        .name("default")
                        .set(
                                toStringR(
                                                toObjectR(state)
                                                        .accessProp(this, env)
                                                        .name("default")
                                                        .value(),
                                                env)
                                        + toStringR(
                                                function_sprintf
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "%s => array(%s, %s, %s, %s),\n",
                                                                toObjectR(state)
                                                                        .accessProp(this, env)
                                                                        .name("mark")
                                                                        .value(),
                                                                runtimeStaticObject.export(
                                                                        env,
                                                                        ZVal.add(
                                                                                ZVal.newArray(
                                                                                        new ZPair(
                                                                                                "_route",
                                                                                                name)),
                                                                                defaults
                                                                                        .getObject())),
                                                                runtimeStaticObject.export(
                                                                        env, vars),
                                                                runtimeStaticObject.export(
                                                                        env,
                                                                        ZVal.isTrue(
                                                                                        ternaryExpressionTemp =
                                                                                                function_array_flip
                                                                                                        .f
                                                                                                        .env(
                                                                                                                env)
                                                                                                        .call(
                                                                                                                env
                                                                                                                        .callMethod(
                                                                                                                                route,
                                                                                                                                "getMethods",
                                                                                                                                PhpMatcherDumper
                                                                                                                                        .class))
                                                                                                        .value())
                                                                                ? ternaryExpressionTemp
                                                                                : ZVal.getNull()),
                                                                runtimeStaticObject.export(
                                                                        env,
                                                                        ZVal.isTrue(
                                                                                        ternaryExpressionTemp =
                                                                                                function_array_flip
                                                                                                        .f
                                                                                                        .env(
                                                                                                                env)
                                                                                                        .call(
                                                                                                                env
                                                                                                                        .callMethod(
                                                                                                                                route,
                                                                                                                                "getSchemes",
                                                                                                                                PhpMatcherDumper
                                                                                                                                        .class))
                                                                                                        .value())
                                                                                ? ternaryExpressionTemp
                                                                                : ZVal.getNull()))
                                                        .value(),
                                                env));

            } else {
                prevRegex = env.callMethod(compiledRoute, "getRegex", PhpMatcherDumper.class);
                combine = "            $matches = array(";
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult2065 : ZVal.getIterable(vars, env, false)) {
                    j = ZVal.assign(zpairResult2065.getKey());
                    m = ZVal.assign(zpairResult2065.getValue());
                    combine =
                            toStringR(combine, env)
                                    + toStringR(
                                            function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            "%s => $matches[%d] ?? null, ",
                                                            runtimeStaticObject.export(env, m),
                                                            ZVal.add(1, j))
                                                    .value(),
                                            env);
                }

                combine =
                        ZVal.assign(
                                ZVal.isTrue(vars)
                                        ? NamespaceGlobal.substr_replace
                                                .env(env)
                                                .call(combine, ");\n\n", -2)
                                                .value()
                                        : "");
                toObjectR(state)
                        .accessProp(this, env)
                        .name("switch")
                        .set(
                                toStringR(
                                                toObjectR(state)
                                                        .accessProp(this, env)
                                                        .name("switch")
                                                        .value(),
                                                env)
                                        + toStringR(
                                                "        case "
                                                        + toStringR(
                                                                toObjectR(state)
                                                                        .accessProp(this, env)
                                                                        .name("mark")
                                                                        .value(),
                                                                env)
                                                        + ":\n"
                                                        + toStringR(combine, env)
                                                        + toStringR(
                                                                this.compileRoute(
                                                                        env, route, name, false),
                                                                env)
                                                        + "\n            break;\n",
                                                env));
            }
        }

        return ZVal.assign(code);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "hasVars", typeHint = "bool")
    @ConvertedParameter(index = 1, name = "matchHost", typeHint = "bool")
    private Object compileSwitchDefault(RuntimeEnv env, Object... args) {
        Object hasVars = assignParameter(args, 0, false);
        Object matchHost = assignParameter(args, 1, false);
        Object code = null;
        if (ZVal.isTrue(hasVars)) {
            code =
                    "\n            foreach ($vars as $i => $v) {\n                if (isset($matches[1 + $i])) {\n                    $ret[$v] = $matches[1 + $i];\n                }\n            }\n";

        } else if (ZVal.isTrue(matchHost)) {
            code =
                    "\n            if ($requiredHost) {\n                if ('#' !== $requiredHost[0] ? $requiredHost !== $host : !preg_match($requiredHost, $host, $hostMatches)) {\n                    break;\n                }\n                if ('#' === $requiredHost[0] && $hostMatches) {\n                    $hostMatches['_route'] = $ret['_route'];\n                    $ret = $this->mergeDefaults($hostMatches, $ret);\n                }\n            }\n";

        } else {
            code = "";
        }

        code =
                toStringR(code, env)
                        + "\n            $hasRequiredScheme = !$requiredSchemes || isset($requiredSchemes[$context->getScheme()]);\n            if ($requiredMethods && !isset($requiredMethods[$canonicalMethod]) && !isset($requiredMethods[$requestMethod])) {\n                if ($hasRequiredScheme) {\n                    $allow += $requiredMethods;\n                }\n                break;\n            }\n            if (!$hasRequiredScheme) {\n                $allowSchemes += $requiredSchemes;\n                break;\n            }\n\n            return $ret;\n";
        return ZVal.assign(code);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "route", typeHint = "Symfony\\Component\\Routing\\Route")
    @ConvertedParameter(index = 1, name = "name", typeHint = "string")
    @ConvertedParameter(index = 2, name = "checkHost", typeHint = "bool")
    private Object compileRoute(RuntimeEnv env, Object... args) {
        Object route = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        Object checkHost = assignParameter(args, 2, false);
        Object gotoname = null;
        Object code = null;
        Object expression = null;
        ReferenceContainer methods = new BasicReferenceContainer(null);
        Object methodVariable = null;
        Object retOffset = null;
        Object schemes = null;
        Object matches = null;
        Object compiledRoute = null;
        ReferenceContainer defaults = new BasicReferenceContainer(null);
        Object hostMatches = null;
        ReferenceContainer vars = new BasicReferenceContainer(null);
        ReferenceContainer conditions = new BasicReferenceContainer(null);
        code = "";
        compiledRoute = env.callMethod(route, "compile", PhpMatcherDumper.class);
        conditions.setObject(ZVal.newArray());
        matches =
                ZVal.assign(
                        ZVal.toBool(
                                env.callMethod(
                                        compiledRoute,
                                        "getPathVariables",
                                        PhpMatcherDumper.class)));
        hostMatches =
                ZVal.assign(
                        ZVal.toBool(
                                env.callMethod(
                                        compiledRoute,
                                        "getHostVariables",
                                        PhpMatcherDumper.class)));
        methods.setObject(
                function_array_flip
                        .f
                        .env(env)
                        .call(env.callMethod(route, "getMethods", PhpMatcherDumper.class))
                        .value());
        if (ZVal.isTrue(env.callMethod(route, "getCondition", PhpMatcherDumper.class))) {
            expression =
                    env.callMethod(
                            this.getExpressionLanguage(env),
                            "compile",
                            PhpMatcherDumper.class,
                            env.callMethod(route, "getCondition", PhpMatcherDumper.class),
                            ZVal.arrayFromList("context", "request"));
            if (ZVal.strictNotEqualityCheck(
                    false,
                    "!==",
                    function_strpos.f.env(env).call(expression, "$request").value())) {
                conditions
                        .arrayAppend(env)
                        .set(
                                "($request = $request ?? $this->request ?: $this->createRequest($pathinfo))");
            }

            conditions.arrayAppend(env).set(expression);
        }

        if (ZVal.toBool(!ZVal.isTrue(checkHost))
                || ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        compiledRoute, "getHostRegex", PhpMatcherDumper.class)))) {

        } else if (ZVal.isTrue(hostMatches)) {
            conditions
                    .arrayAppend(env)
                    .set(
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "preg_match(%s, $host, $hostMatches)",
                                            runtimeStaticObject.export(
                                                    env,
                                                    env.callMethod(
                                                            compiledRoute,
                                                            "getHostRegex",
                                                            PhpMatcherDumper.class)))
                                    .value());

        } else {
            conditions
                    .arrayAppend(env)
                    .set(
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "%s === $host",
                                            runtimeStaticObject.export(
                                                    env,
                                                    env.callMethod(
                                                            route,
                                                            "getHost",
                                                            PhpMatcherDumper.class)))
                                    .value());
        }

        conditions.setObject(
                NamespaceGlobal.implode.env(env).call(" && ", conditions.getObject()).value());
        if (ZVal.isTrue(conditions.getObject())) {
            code =
                    toStringR(code, env)
                            + toStringR(
                                    "        // "
                                            + toStringR(name, env)
                                            + "\n        if ("
                                            + toStringR(conditions.getObject(), env)
                                            + ") {\n",
                                    env);

        } else {
            code =
                    toStringR(code, env)
                            + toStringR("            // " + toStringR(name, env) + "\n", env);
        }

        gotoname =
                "not_"
                        + toStringR(
                                function_preg_replace
                                        .f
                                        .env(env)
                                        .call("/[^A-Za-z0-9_]/", "", name)
                                        .value(),
                                env);
        retOffset = ZVal.add(12, function_strlen.f.env(env).call(code).value());
        defaults.setObject(env.callMethod(route, "getDefaults", PhpMatcherDumper.class));
        if (arrayActionR(ArrayAction.ISSET, defaults, env, "_canonical_route")) {
            name = ZVal.assign(defaults.arrayGet(env, "_canonical_route"));
            arrayActionR(ArrayAction.UNSET, defaults, env, "_canonical_route");
        }

        if (ZVal.toBool(matches) || ZVal.toBool(hostMatches)) {
            vars.setObject(
                    ZVal.newArray(
                            new ZPair(0, "array('_route' => '" + toStringR(name, env) + "')")));
            if (ZVal.toBool(matches)
                    || ZVal.toBool(
                            ZVal.toBool(hostMatches) && ZVal.toBool(!ZVal.isTrue(checkHost)))) {
                vars.arrayAppend(env).set("$matches");
            }

            if (ZVal.toBool(hostMatches) && ZVal.toBool(checkHost)) {
                vars.arrayAppend(env).set("$hostMatches");
            }

            code =
                    toStringR(code, env)
                            + toStringR(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "            $ret = $this->mergeDefaults(%s, %s);\n",
                                                    NamespaceGlobal.implode
                                                            .env(env)
                                                            .call(" + ", vars.getObject())
                                                            .value(),
                                                    runtimeStaticObject.export(
                                                            env, defaults.getObject()))
                                            .value(),
                                    env);

        } else if (ZVal.isTrue(defaults.getObject())) {
            code =
                    toStringR(code, env)
                            + toStringR(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "            $ret = %s;\n",
                                                    runtimeStaticObject.export(
                                                            env,
                                                            ZVal.add(
                                                                    ZVal.newArray(
                                                                            new ZPair(
                                                                                    "_route",
                                                                                    name)),
                                                                    defaults.getObject())))
                                            .value(),
                                    env);

        } else {
            code =
                    toStringR(code, env)
                            + toStringR(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "            $ret = array('_route' => '%s');\n",
                                                    name)
                                            .value(),
                                    env);
        }

        if (ZVal.isTrue(methods.getObject())) {
            methodVariable =
                    ZVal.assign(
                            arrayActionR(ArrayAction.ISSET, methods, env, "GET")
                                    ? "$canonicalMethod"
                                    : "$requestMethod");
            methods.setObject(runtimeStaticObject.export(env, methods.getObject()));
        }

        if (ZVal.isTrue(schemes = env.callMethod(route, "getSchemes", PhpMatcherDumper.class))) {
            schemes =
                    runtimeStaticObject.export(
                            env, function_array_flip.f.env(env).call(schemes).value());
            if (ZVal.isTrue(methods.getObject())) {
                code =
                        toStringR(code, env)
                                + toStringR(
                                        "            $requiredSchemes = "
                                                + toStringR(schemes, env)
                                                + ";\n            $hasRequiredScheme = isset($requiredSchemes[$context->getScheme()]);\n            if (!isset(($a = "
                                                + toStringR(methods.getObject(), env)
                                                + ")["
                                                + toStringR(methodVariable, env)
                                                + "])) {\n                if ($hasRequiredScheme) {\n                    $allow += $a;\n                }\n                goto "
                                                + toStringR(gotoname, env)
                                                + ";\n            }\n            if (!$hasRequiredScheme) {\n                $allowSchemes += $requiredSchemes;\n                goto "
                                                + toStringR(gotoname, env)
                                                + ";\n            }\n\n",
                                        env);

            } else {
                code =
                        toStringR(code, env)
                                + toStringR(
                                        "            $requiredSchemes = "
                                                + toStringR(schemes, env)
                                                + ";\n            if (!isset($requiredSchemes[$context->getScheme()])) {\n                $allowSchemes += $requiredSchemes;\n                goto "
                                                + toStringR(gotoname, env)
                                                + ";\n            }\n\n",
                                        env);
            }

        } else if (ZVal.isTrue(methods.getObject())) {
            code =
                    toStringR(code, env)
                            + toStringR(
                                    "            if (!isset(($a = "
                                            + toStringR(methods.getObject(), env)
                                            + ")["
                                            + toStringR(methodVariable, env)
                                            + "])) {\n                $allow += $a;\n                goto "
                                            + toStringR(gotoname, env)
                                            + ";\n            }\n\n",
                                    env);
        }

        if (ZVal.toBool(schemes) || ZVal.toBool(methods.getObject())) {
            code = toStringR(code, env) + "            return $ret;\n";

        } else {
            code =
                    NamespaceGlobal.substr_replace
                            .env(env)
                            .call(code, "return", retOffset, 6)
                            .value();
        }

        if (ZVal.isTrue(conditions.getObject())) {
            code = toStringR(code, env) + "        }\n";

        } else if (ZVal.toBool(schemes) || ZVal.toBool(methods.getObject())) {
            code = toStringR(code, env) + "    ";
        }

        if (ZVal.toBool(schemes) || ZVal.toBool(methods.getObject())) {
            code =
                    toStringR(code, env)
                            + toStringR("        " + toStringR(gotoname, env) + ":\n", env);
        }

        return ZVal.assign(ZVal.isTrue(conditions.getObject()) ? this.indent(env, code) : code);
    }

    @ConvertedMethod
    private Object getExpressionLanguage(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.expressionLanguage)) {
            if (!function_class_exists
                    .f
                    .env(env)
                    .call("Symfony\\Component\\ExpressionLanguage\\ExpressionLanguage")
                    .getBool()) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                "Unable to use expressions as the Symfony ExpressionLanguage component is not installed."));
            }

            this.expressionLanguage =
                    env.createNew(
                            ZVal.resolveClassAlias(env, "ExpressionLanguage"),
                            ZVal.getNull(),
                            this.expressionLanguageProviders);
        }

        return ZVal.assign(this.expressionLanguage);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    @ConvertedParameter(index = 1, name = "level", defaultValue = "1", defaultValueType = "number")
    private Object indent(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object level = assignParameter(args, 1, true);
        if (null == level) {
            level = 1;
        }
        return ZVal.assign(
                function_preg_replace
                        .f
                        .env(env)
                        .call(
                                "/^./m",
                                toStringR(
                                                function_str_repeat
                                                        .f
                                                        .env(env)
                                                        .call("    ", level)
                                                        .value(),
                                                env)
                                        + "$0",
                                code)
                        .value());
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Routing\\Matcher\\Dumper\\PhpMatcherDumper";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends MatcherDumper.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object export(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object v = null;
            ReferenceContainer i = new BasicReferenceContainer(null);
            Object k = null;
            Object export = null;
            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", value)) {
                return "null";
            }

            if (!function_is_array.f.env(env).call(value).getBool()) {
                return ZVal.assign(
                        function_str_replace
                                .f
                                .env(env)
                                .call(
                                        "\n",
                                        "'.\"\\n\".'",
                                        NamespaceGlobal.var_export
                                                .env(env)
                                                .call(value, true)
                                                .value())
                                .value());
            }

            if (!ZVal.isTrue(value)) {
                return "array()";
            }

            i.setObject(0);
            export = "array(";
            for (ZPair zpairResult2066 : ZVal.getIterable(value, env, false)) {
                k = ZVal.assign(zpairResult2066.getKey());
                v = ZVal.assign(zpairResult2066.getValue());
                if (ZVal.strictEqualityCheck(i.getObject(), "===", k)) {
                    i.setObject(ZVal.increment(i.getObject()));

                } else {
                    export =
                            toStringR(export, env)
                                    + toStringR(runtimeStaticObject.export(env, k), env)
                                    + " => ";
                    if (ZVal.toBool(function_is_int.f.env(env).call(k).value())
                            && ZVal.toBool(ZVal.isLessThan(i.getObject(), '<', k))) {
                        i.setObject(ZVal.add(1, k));
                    }
                }

                export =
                        toStringR(export, env)
                                + toStringR(runtimeStaticObject.export(env, v), env)
                                + ", ";
            }

            return ZVal.assign(
                    NamespaceGlobal.substr_replace.env(env).call(export, ")", -2).value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Routing\\Matcher\\Dumper\\PhpMatcherDumper")
                    .setLookup(
                            PhpMatcherDumper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "expressionLanguage",
                            "expressionLanguageProviders",
                            "routes",
                            "signalingException")
                    .setFilename("vendor/symfony/routing/Matcher/Dumper/PhpMatcherDumper.php")
                    .addInterface(
                            "Symfony\\Component\\Routing\\Matcher\\Dumper\\MatcherDumperInterface")
                    .addExtendsClass("Symfony\\Component\\Routing\\Matcher\\Dumper\\MatcherDumper")
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
