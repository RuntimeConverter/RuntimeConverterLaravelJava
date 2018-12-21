package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Loader.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes.Route;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff_key;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_replace;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes.RouteCollection;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/routing/Loader/AnnotationClassLoader.php

*/

public abstract class AnnotationClassLoader extends RuntimeClassBase {

    public Object reader = null;

    public Object routeAnnotationClass = "Symfony\\Component\\Routing\\Annotation\\Route";

    public Object defaultRouteIndex = 0;

    public AnnotationClassLoader(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AnnotationClassLoader.class) {
            this.__construct(env, args);
        }
    }

    public AnnotationClassLoader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "reader",
        typeHint = "Doctrine\\Common\\Annotations\\Reader"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object reader = assignParameter(args, 0, false);
        this.reader = reader;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    public Object setRouteAnnotationClass(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        this.routeAnnotationClass = _pClass;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(
        index = 1,
        name = "type",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object load(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = ZVal.getNull();
        }
        Object method = null;
        ReferenceContainer globals = new BasicReferenceContainer(null);
        Object collection = null;
        Object annot = null;
        if (!function_class_exists.f.env(env).call(_pClass).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Class \"%s\" does not exist.", _pClass)
                                    .value()));
        }

        _pClass = new ReflectionClass(env, _pClass);
        if (ZVal.isTrue(env.callMethod(_pClass, "isAbstract", AnnotationClassLoader.class))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Annotations from class \"%s\" cannot be read as it is abstract.",
                                            env.callMethod(
                                                    _pClass,
                                                    "getName",
                                                    AnnotationClassLoader.class))
                                    .value()));
        }

        globals.setObject(this.getGlobals(env, _pClass));
        collection = new RouteCollection(env);
        env.callMethod(
                collection,
                "addResource",
                AnnotationClassLoader.class,
                env.createNew(
                        ZVal.resolveClassAlias(env, "FileResource"),
                        env.callMethod(_pClass, "getFileName", AnnotationClassLoader.class)));
        for (ZPair zpairResult2014 :
                ZVal.getIterable(
                        env.callMethod(_pClass, "getMethods", AnnotationClassLoader.class),
                        env,
                        true)) {
            method = ZVal.assign(zpairResult2014.getValue());
            this.defaultRouteIndex = 0;
            for (ZPair zpairResult2015 :
                    ZVal.getIterable(
                            env.callMethod(
                                    this.reader,
                                    "getMethodAnnotations",
                                    AnnotationClassLoader.class,
                                    method),
                            env,
                            true)) {
                annot = ZVal.assign(zpairResult2015.getValue());
                if (ZVal.isTrue(ZVal.checkInstanceTypeMatch(annot, this.routeAnnotationClass))) {
                    this.addRoute(env, collection, annot, globals.getObject(), _pClass, method);
                }
            }
        }

        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                0,
                                "===",
                                env.callMethod(collection, "count", AnnotationClassLoader.class)))
                && ZVal.toBool(
                        env.callMethod(
                                _pClass, "hasMethod", AnnotationClassLoader.class, "__invoke"))) {
            for (ZPair zpairResult2016 :
                    ZVal.getIterable(
                            env.callMethod(
                                    this.reader,
                                    "getClassAnnotations",
                                    AnnotationClassLoader.class,
                                    _pClass),
                            env,
                            true)) {
                annot = ZVal.assign(zpairResult2016.getValue());
                if (ZVal.isTrue(ZVal.checkInstanceTypeMatch(annot, this.routeAnnotationClass))) {
                    globals.arrayAccess(env, "path").set("");
                    globals.arrayAccess(env, "name").set("");
                    globals.arrayAccess(env, "localized_paths").set(ZVal.newArray());
                    this.addRoute(
                            env,
                            collection,
                            annot,
                            globals.getObject(),
                            _pClass,
                            env.callMethod(
                                    _pClass, "getMethod", AnnotationClassLoader.class, "__invoke"));
                }
            }
        }

        return ZVal.assign(collection);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "collection",
        typeHint = "Symfony\\Component\\Routing\\RouteCollection"
    )
    @ConvertedParameter(index = 1, name = "annot")
    @ConvertedParameter(index = 2, name = "globals")
    @ConvertedParameter(index = 3, name = "class", typeHint = "ReflectionClass")
    @ConvertedParameter(index = 4, name = "method", typeHint = "ReflectionMethod")
    protected Object addRoute(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        Object collection = assignParameter(args, 0, false);
        Object annot = assignParameter(args, 1, false);
        ReferenceContainer globals = new BasicReferenceContainer(assignParameter(args, 2, false));
        Object _pClass = assignParameter(args, 3, false);
        Object method = assignParameter(args, 4, false);
        Object requirements = null;
        Object methods = null;
        ReferenceContainer prefix = new BasicReferenceContainer(null);
        Object localePath = null;
        Object ternaryExpressionTemp = null;
        Object schemes = null;
        Object locale = null;
        Object path = null;
        Object condition = null;
        Object localePrefix = null;
        Object route = null;
        ReferenceContainer defaults = new BasicReferenceContainer(null);
        Object param = null;
        ReferenceContainer paths = new BasicReferenceContainer(null);
        ReferenceContainer name = new BasicReferenceContainer(null);
        Object options = null;
        Object host = null;
        Object missing = null;
        name.setObject(env.callMethod(annot, "getName", AnnotationClassLoader.class));
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", name.getObject())) {
            name.setObject(this.getDefaultRouteName(env, _pClass, method));
        }

        name.setObject(
                toStringR(globals.arrayGet(env, "name"), env) + toStringR(name.getObject(), env));
        defaults.setObject(
                function_array_replace
                        .f
                        .env(env)
                        .call(
                                globals.arrayGet(env, "defaults"),
                                env.callMethod(annot, "getDefaults", AnnotationClassLoader.class))
                        .value());
        requirements =
                function_array_replace
                        .f
                        .env(env)
                        .call(
                                globals.arrayGet(env, "requirements"),
                                env.callMethod(
                                        annot, "getRequirements", AnnotationClassLoader.class))
                        .value();
        options =
                function_array_replace
                        .f
                        .env(env)
                        .call(
                                globals.arrayGet(env, "options"),
                                env.callMethod(annot, "getOptions", AnnotationClassLoader.class))
                        .value();
        schemes =
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                globals.arrayGet(env, "schemes"),
                                env.callMethod(annot, "getSchemes", AnnotationClassLoader.class))
                        .value();
        methods =
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                globals.arrayGet(env, "methods"),
                                env.callMethod(annot, "getMethods", AnnotationClassLoader.class))
                        .value();
        host = env.callMethod(annot, "getHost", AnnotationClassLoader.class);
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", host)) {
            host = ZVal.assign(globals.arrayGet(env, "host"));
        }

        condition = env.callMethod(annot, "getCondition", AnnotationClassLoader.class);
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", condition)) {
            condition = ZVal.assign(globals.arrayGet(env, "condition"));
        }

        path =
                ZVal.assign(
                        ZVal.isTrue(
                                        ternaryExpressionTemp =
                                                env.callMethod(
                                                        annot,
                                                        "getLocalizedPaths",
                                                        AnnotationClassLoader.class))
                                ? ternaryExpressionTemp
                                : env.callMethod(annot, "getPath", AnnotationClassLoader.class));
        prefix.setObject(
                ZVal.assign(
                        ZVal.isTrue(
                                        ternaryExpressionTemp =
                                                globals.arrayGet(env, "localized_paths"))
                                ? ternaryExpressionTemp
                                : globals.arrayGet(env, "path")));
        paths.setObject(ZVal.newArray());
        if (function_is_array.f.env(env).call(path).getBool()) {
            if (!function_is_array.f.env(env).call(prefix.getObject()).getBool()) {
                runtimeConverterBreakCount = 0;
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult2017 : ZVal.getIterable(path, env, false)) {
                    locale = ZVal.assign(zpairResult2017.getKey());
                    localePath = ZVal.assign(zpairResult2017.getValue());
                    paths.arrayAccess(env, locale)
                            .set(toStringR(prefix.getObject(), env) + toStringR(localePath, env));
                }

            } else if (ZVal.isTrue(
                    missing =
                            function_array_diff_key
                                    .f
                                    .env(env)
                                    .call(prefix.getObject(), path)
                                    .value())) {
                throw ZVal.getException(
                        env,
                        new LogicException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Route to \"%s\" is missing paths for locale(s) \"%s\".",
                                                toStringR(
                                                                toObjectR(_pClass)
                                                                        .accessProp(this, env)
                                                                        .name("name")
                                                                        .value(),
                                                                env)
                                                        + "::"
                                                        + toStringR(
                                                                toObjectR(method)
                                                                        .accessProp(this, env)
                                                                        .name("name")
                                                                        .value(),
                                                                env),
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(
                                                                "\", \"",
                                                                function_array_keys
                                                                        .f
                                                                        .env(env)
                                                                        .call(missing)
                                                                        .value())
                                                        .value())
                                        .value()));

            } else {
                runtimeConverterBreakCount = 0;
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult2018 : ZVal.getIterable(path, env, false)) {
                    locale = ZVal.assign(zpairResult2018.getKey());
                    localePath = ZVal.assign(zpairResult2018.getValue());
                    if (!arrayActionR(ArrayAction.ISSET, prefix, env, locale)) {
                        throw ZVal.getException(
                                env,
                                new LogicException(
                                        env,
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "Route to \"%s\" with locale \"%s\" is missing a corresponding prefix in class \"%s\".",
                                                        toObjectR(method)
                                                                .accessProp(this, env)
                                                                .name("name")
                                                                .value(),
                                                        locale,
                                                        toObjectR(_pClass)
                                                                .accessProp(this, env)
                                                                .name("name")
                                                                .value())
                                                .value()));
                    }

                    paths.arrayAccess(env, locale)
                            .set(
                                    toStringR(prefix.arrayGet(env, locale), env)
                                            + toStringR(localePath, env));
                }
            }

        } else if (function_is_array.f.env(env).call(prefix.getObject()).getBool()) {
            runtimeConverterBreakCount = 0;
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult2019 : ZVal.getIterable(prefix.getObject(), env, false)) {
                locale = ZVal.assign(zpairResult2019.getKey());
                localePrefix = ZVal.assign(zpairResult2019.getValue());
                paths.arrayAccess(env, locale)
                        .set(toStringR(localePrefix, env) + toStringR(path, env));
            }

        } else {
            paths.arrayAppend(env).set(toStringR(prefix.getObject(), env) + toStringR(path, env));
        }

        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2020 :
                ZVal.getIterable(
                        env.callMethod(method, "getParameters", AnnotationClassLoader.class),
                        env,
                        true)) {
            param = ZVal.assign(zpairResult2020.getValue());
            if (ZVal.toBool(
                            arrayActionR(
                                    ArrayAction.ISSET,
                                    defaults,
                                    env,
                                    toObjectR(param).accessProp(this, env).name("name").value()))
                    || ZVal.toBool(
                            !ZVal.isTrue(
                                    env.callMethod(
                                            param,
                                            "isDefaultValueAvailable",
                                            AnnotationClassLoader.class)))) {
                continue;
            }

            runtimeConverterBreakCount = 0;
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult2021 : ZVal.getIterable(paths.getObject(), env, false)) {
                locale = ZVal.assign(zpairResult2021.getKey());
                path = ZVal.assign(zpairResult2021.getValue());
                if (ZVal.strictNotEqualityCheck(
                        false,
                        "!==",
                        function_strpos
                                .f
                                .env(env)
                                .call(
                                        path,
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "{%s}",
                                                        toObjectR(param)
                                                                .accessProp(this, env)
                                                                .name("name")
                                                                .value())
                                                .value())
                                .value())) {
                    defaults.arrayAccess(
                                    env,
                                    toObjectR(param).accessProp(this, env).name("name").value())
                            .set(
                                    env.callMethod(
                                            param, "getDefaultValue", AnnotationClassLoader.class));
                    break;
                }
            }
        }

        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2022 : ZVal.getIterable(paths.getObject(), env, false)) {
            locale = ZVal.assign(zpairResult2022.getKey());
            path = ZVal.assign(zpairResult2022.getValue());
            route =
                    this.createRoute(
                            env,
                            path,
                            defaults.getObject(),
                            requirements,
                            options,
                            host,
                            schemes,
                            methods,
                            condition);
            env.callMethod(
                    this,
                    "configureRoute",
                    AnnotationClassLoader.class,
                    route,
                    _pClass,
                    method,
                    annot);
            if (ZVal.strictNotEqualityCheck(0, "!==", locale)) {
                env.callMethod(route, "setDefault", AnnotationClassLoader.class, "_locale", locale);
                env.callMethod(
                        route,
                        "setDefault",
                        AnnotationClassLoader.class,
                        "_canonical_route",
                        name.getObject());
                env.callMethod(
                        collection,
                        new RuntimeArgsWithReferences(),
                        "add",
                        AnnotationClassLoader.class,
                        toStringR(name.getObject(), env) + "." + toStringR(locale, env),
                        route);

            } else {
                env.callMethod(
                        collection,
                        new RuntimeArgsWithReferences().add(0, name),
                        "add",
                        AnnotationClassLoader.class,
                        name.getObject(),
                        route);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    @ConvertedParameter(
        index = 1,
        name = "type",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object supports(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = ZVal.getNull();
        }
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(function_is_string.f.env(env).call(resource).value())
                                        && ZVal.toBool(
                                                function_preg_match
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "/^(?:\\\\?[a-zA-Z_\\x7f-\\xff][a-zA-Z0-9_\\x7f-\\xff]*)+$/",
                                                                resource)
                                                        .value()))
                        && ZVal.toBool(
                                ZVal.toBool(!ZVal.isTrue(type))
                                        || ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        "annotation", "===", type))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "resolver",
        typeHint = "Symfony\\Component\\Config\\Loader\\LoaderResolverInterface"
    )
    public Object setResolver(RuntimeEnv env, Object... args) {
        Object resolver = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    public Object getResolver(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class", typeHint = "ReflectionClass")
    @ConvertedParameter(index = 1, name = "method", typeHint = "ReflectionMethod")
    protected Object getDefaultRouteName(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object method = assignParameter(args, 1, false);
        Object name = null;
        name =
                NamespaceGlobal.strtolower
                        .env(env)
                        .call(
                                toStringR(
                                                function_str_replace
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "\\",
                                                                "_",
                                                                toObjectR(_pClass)
                                                                        .accessProp(this, env)
                                                                        .name("name")
                                                                        .value())
                                                        .value(),
                                                env)
                                        + "_"
                                        + toStringR(
                                                toObjectR(method)
                                                        .accessProp(this, env)
                                                        .name("name")
                                                        .value(),
                                                env))
                        .value();
        if (ZVal.isGreaterThan(this.defaultRouteIndex, '>', 0)) {
            name = toStringR(name, env) + "_" + toStringR(this.defaultRouteIndex, env);
        }

        this.defaultRouteIndex = ZVal.increment(this.defaultRouteIndex);
        return ZVal.assign(name);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class", typeHint = "ReflectionClass")
    protected Object getGlobals(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        ReferenceContainer globals = new BasicReferenceContainer(null);
        Object annot = null;
        globals.setObject(
                ZVal.newArray(
                        new ZPair("path", ZVal.getNull()),
                        new ZPair("localized_paths", ZVal.newArray()),
                        new ZPair("requirements", ZVal.newArray()),
                        new ZPair("options", ZVal.newArray()),
                        new ZPair("defaults", ZVal.newArray()),
                        new ZPair("schemes", ZVal.newArray()),
                        new ZPair("methods", ZVal.newArray()),
                        new ZPair("host", ""),
                        new ZPair("condition", ""),
                        new ZPair("name", "")));
        if (ZVal.isTrue(
                annot =
                        env.callMethod(
                                this.reader,
                                "getClassAnnotation",
                                AnnotationClassLoader.class,
                                _pClass,
                                this.routeAnnotationClass))) {
            if (ZVal.strictNotEqualityCheck(
                    ZVal.getNull(),
                    "!==",
                    env.callMethod(annot, "getName", AnnotationClassLoader.class))) {
                globals.arrayAccess(env, "name")
                        .set(env.callMethod(annot, "getName", AnnotationClassLoader.class));
            }

            if (ZVal.strictNotEqualityCheck(
                    ZVal.getNull(),
                    "!==",
                    env.callMethod(annot, "getPath", AnnotationClassLoader.class))) {
                globals.arrayAccess(env, "path")
                        .set(env.callMethod(annot, "getPath", AnnotationClassLoader.class));
            }

            globals.arrayAccess(env, "localized_paths")
                    .set(env.callMethod(annot, "getLocalizedPaths", AnnotationClassLoader.class));
            if (ZVal.strictNotEqualityCheck(
                    ZVal.getNull(),
                    "!==",
                    env.callMethod(annot, "getRequirements", AnnotationClassLoader.class))) {
                globals.arrayAccess(env, "requirements")
                        .set(env.callMethod(annot, "getRequirements", AnnotationClassLoader.class));
            }

            if (ZVal.strictNotEqualityCheck(
                    ZVal.getNull(),
                    "!==",
                    env.callMethod(annot, "getOptions", AnnotationClassLoader.class))) {
                globals.arrayAccess(env, "options")
                        .set(env.callMethod(annot, "getOptions", AnnotationClassLoader.class));
            }

            if (ZVal.strictNotEqualityCheck(
                    ZVal.getNull(),
                    "!==",
                    env.callMethod(annot, "getDefaults", AnnotationClassLoader.class))) {
                globals.arrayAccess(env, "defaults")
                        .set(env.callMethod(annot, "getDefaults", AnnotationClassLoader.class));
            }

            if (ZVal.strictNotEqualityCheck(
                    ZVal.getNull(),
                    "!==",
                    env.callMethod(annot, "getSchemes", AnnotationClassLoader.class))) {
                globals.arrayAccess(env, "schemes")
                        .set(env.callMethod(annot, "getSchemes", AnnotationClassLoader.class));
            }

            if (ZVal.strictNotEqualityCheck(
                    ZVal.getNull(),
                    "!==",
                    env.callMethod(annot, "getMethods", AnnotationClassLoader.class))) {
                globals.arrayAccess(env, "methods")
                        .set(env.callMethod(annot, "getMethods", AnnotationClassLoader.class));
            }

            if (ZVal.strictNotEqualityCheck(
                    ZVal.getNull(),
                    "!==",
                    env.callMethod(annot, "getHost", AnnotationClassLoader.class))) {
                globals.arrayAccess(env, "host")
                        .set(env.callMethod(annot, "getHost", AnnotationClassLoader.class));
            }

            if (ZVal.strictNotEqualityCheck(
                    ZVal.getNull(),
                    "!==",
                    env.callMethod(annot, "getCondition", AnnotationClassLoader.class))) {
                globals.arrayAccess(env, "condition")
                        .set(env.callMethod(annot, "getCondition", AnnotationClassLoader.class));
            }
        }

        return ZVal.assign(globals.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "defaults")
    @ConvertedParameter(index = 2, name = "requirements")
    @ConvertedParameter(index = 3, name = "options")
    @ConvertedParameter(index = 4, name = "host")
    @ConvertedParameter(index = 5, name = "schemes")
    @ConvertedParameter(index = 6, name = "methods")
    @ConvertedParameter(index = 7, name = "condition")
    protected Object createRoute(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object defaults = assignParameter(args, 1, false);
        Object requirements = assignParameter(args, 2, false);
        Object options = assignParameter(args, 3, false);
        Object host = assignParameter(args, 4, false);
        Object schemes = assignParameter(args, 5, false);
        Object methods = assignParameter(args, 6, false);
        Object condition = assignParameter(args, 7, false);
        return ZVal.assign(
                new Route(
                        env,
                        path,
                        defaults,
                        requirements,
                        options,
                        host,
                        schemes,
                        methods,
                        condition));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Routing\\Loader\\AnnotationClassLoader";

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
                    .setName("Symfony\\Component\\Routing\\Loader\\AnnotationClassLoader")
                    .setLookup(
                            AnnotationClassLoader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("defaultRouteIndex", "reader", "routeAnnotationClass")
                    .setFilename("vendor/symfony/routing/Loader/AnnotationClassLoader.php")
                    .addInterface("LoaderInterface")
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
