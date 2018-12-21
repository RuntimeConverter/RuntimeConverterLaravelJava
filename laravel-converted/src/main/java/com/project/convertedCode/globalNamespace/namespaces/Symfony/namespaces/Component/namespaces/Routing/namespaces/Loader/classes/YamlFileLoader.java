package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Loader.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes.Route;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.exceptions.missingDefinitions.ClassNotFoundDuringConversion;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes.RouteCollection;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/routing/Loader/YamlFileLoader.php

*/

public class YamlFileLoader extends RuntimeClassBase {

    public Object yamlParser = null;

    public YamlFileLoader(RuntimeEnv env, Object... args) {
        super(env);
    }

    public YamlFileLoader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    @ConvertedParameter(
        index = 1,
        name = "type",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object load(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = ZVal.getNull();
        }
        Object path = null;
        Object e = null;
        Object name = null;
        Object collection = null;
        ReferenceContainer config = new BasicReferenceContainer(null);
        Object parsedConfig = null;
        path =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("locator").value(),
                        "locate",
                        YamlFileLoader.class,
                        file);
        if (!NamespaceGlobal.stream_is_local.env(env).call(path).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("This is not a local file \"%s\".", path)
                                    .value()));
        }

        if (!function_file_exists.f.env(env).call(path).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("File \"%s\" not found.", path)
                                    .value()));
        }

        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.yamlParser)) {
            this.yamlParser = env.createNew(ZVal.resolveClassAlias(env, "YamlParser"));
        }

        try {
            parsedConfig =
                    env.callMethod(
                            this.yamlParser,
                            "parseFile",
                            YamlFileLoader.class,
                            path,
                            ClassConstantUtils.getConstantValueByClass(
                                    env, ZVal.resolveClassAlias(env, "Yaml"), "PARSE_CONSTANT"));
        } catch (ConvertedException convertedException301) {
            if (ClassNotFoundDuringConversion.missingClassInCatchBlock("ParseException")) {
                e = convertedException301.getObject();
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("The file \"%s\" does not contain valid YAML.", path)
                                        .value(),
                                0,
                                e));
            } else {
                throw convertedException301;
            }
        }

        collection = new RouteCollection(env);
        env.callMethod(
                collection,
                "addResource",
                YamlFileLoader.class,
                env.createNew(ZVal.resolveClassAlias(env, "FileResource"), path));
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", parsedConfig)) {
            return ZVal.assign(collection);
        }

        if (!function_is_array.f.env(env).call(parsedConfig).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("The file \"%s\" must contain a YAML array.", path)
                                    .value()));
        }

        for (ZPair zpairResult2046 : ZVal.getIterable(parsedConfig, env, false)) {
            name = ZVal.assign(zpairResult2046.getKey());
            config.setObject(ZVal.assign(zpairResult2046.getValue()));
            this.validate(env, config.getObject(), name, path);
            if (arrayActionR(ArrayAction.ISSET, config, env, "resource")) {
                this.parseImport(env, collection, config.getObject(), path, file);

            } else {
                this.parseRoute(env, collection, name, config.getObject(), path);
            }
        }

        return ZVal.assign(collection);
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
                                                function_in_array
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                NamespaceGlobal.pathinfo
                                                                        .env(env)
                                                                        .call(resource, 4)
                                                                        .value(),
                                                                ZVal.arrayFromList("yml", "yaml"),
                                                                true)
                                                        .value()))
                        && ZVal.toBool(
                                ZVal.toBool(!ZVal.isTrue(type))
                                        || ZVal.toBool(
                                                ZVal.strictEqualityCheck("yaml", "===", type))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "collection",
        typeHint = "Symfony\\Component\\Routing\\RouteCollection"
    )
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(index = 2, name = "config", typeHint = "array")
    @ConvertedParameter(index = 3, name = "path")
    protected Object parseRoute(RuntimeEnv env, Object... args) {
        Object collection = assignParameter(args, 0, false);
        ReferenceContainer name = new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 2, false));
        Object path = assignParameter(args, 3, false);
        Object requirements = null;
        Object methods = null;
        Object localizedRoute = null;
        Object schemes = null;
        Object locale = null;
        Object condition = null;
        Object route = null;
        ReferenceContainer defaults = new BasicReferenceContainer(null);
        Object options = null;
        Object host = null;
        defaults.setObject(
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, config, env, "defaults")
                                ? config.arrayGet(env, "defaults")
                                : ZVal.newArray()));
        requirements =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, config, env, "requirements")
                                ? config.arrayGet(env, "requirements")
                                : ZVal.newArray());
        options =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, config, env, "options")
                                ? config.arrayGet(env, "options")
                                : ZVal.newArray());
        host =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, config, env, "host")
                                ? config.arrayGet(env, "host")
                                : "");
        schemes =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, config, env, "schemes")
                                ? config.arrayGet(env, "schemes")
                                : ZVal.newArray());
        methods =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, config, env, "methods")
                                ? config.arrayGet(env, "methods")
                                : ZVal.newArray());
        condition =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, config, env, "condition")
                                ? config.arrayGet(env, "condition")
                                : ZVal.getNull());
        if (arrayActionR(ArrayAction.ISSET, config, env, "controller")) {
            defaults.arrayAccess(env, "_controller").set(config.arrayGet(env, "controller"));
        }

        if (function_is_array.f.env(env).call(config.arrayGet(env, "path")).getBool()) {
            route =
                    new Route(
                            env,
                            "",
                            defaults.getObject(),
                            requirements,
                            options,
                            host,
                            schemes,
                            methods,
                            condition);
            for (ZPair zpairResult2047 :
                    ZVal.getIterable(config.arrayGet(env, "path"), env, false)) {
                locale = ZVal.assign(zpairResult2047.getKey());
                path = ZVal.assign(zpairResult2047.getValue());
                localizedRoute = ZVal.assign(((RuntimeClassInterface) route).phpClone(env));
                env.callMethod(
                        localizedRoute, "setDefault", YamlFileLoader.class, "_locale", locale);
                env.callMethod(
                        localizedRoute,
                        "setDefault",
                        YamlFileLoader.class,
                        "_canonical_route",
                        name.getObject());
                env.callMethod(localizedRoute, "setPath", YamlFileLoader.class, path);
                env.callMethod(
                        collection,
                        new RuntimeArgsWithReferences(),
                        "add",
                        YamlFileLoader.class,
                        toStringR(name.getObject(), env) + "." + toStringR(locale, env),
                        localizedRoute);
            }

        } else {
            route =
                    new Route(
                            env,
                            config.arrayGet(env, "path"),
                            defaults.getObject(),
                            requirements,
                            options,
                            host,
                            schemes,
                            methods,
                            condition);
            env.callMethod(
                    collection,
                    new RuntimeArgsWithReferences().add(0, name),
                    "add",
                    YamlFileLoader.class,
                    name.getObject(),
                    route);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "collection",
        typeHint = "Symfony\\Component\\Routing\\RouteCollection"
    )
    @ConvertedParameter(index = 1, name = "config", typeHint = "array")
    @ConvertedParameter(index = 2, name = "path")
    @ConvertedParameter(index = 3, name = "file")
    protected Object parseImport(RuntimeEnv env, Object... args) {
        Object collection = assignParameter(args, 0, false);
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object path = assignParameter(args, 2, false);
        Object file = assignParameter(args, 3, false);
        Object requirements = null;
        ReferenceContainer prefix = new BasicReferenceContainer(null);
        Object methods = null;
        Object localizedRoute = null;
        Object ternaryExpressionTemp = null;
        Object schemes = null;
        Object rootPath = null;
        Object type = null;
        Object locale = null;
        Object trailingSlashOnRoot = null;
        Object condition = null;
        Object localePrefix = null;
        Object route = null;
        ReferenceContainer defaults = new BasicReferenceContainer(null);
        Object imported = null;
        Object options = null;
        Object host = null;
        ReferenceContainer name = new BasicReferenceContainer(null);
        Object subCollection = null;
        type =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, config, env, "type")
                                ? config.arrayGet(env, "type")
                                : ZVal.getNull());
        prefix.setObject(
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, config, env, "prefix")
                                ? config.arrayGet(env, "prefix")
                                : ""));
        defaults.setObject(
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, config, env, "defaults")
                                ? config.arrayGet(env, "defaults")
                                : ZVal.newArray()));
        requirements =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, config, env, "requirements")
                                ? config.arrayGet(env, "requirements")
                                : ZVal.newArray());
        options =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, config, env, "options")
                                ? config.arrayGet(env, "options")
                                : ZVal.newArray());
        host =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, config, env, "host")
                                ? config.arrayGet(env, "host")
                                : ZVal.getNull());
        condition =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, config, env, "condition")
                                ? config.arrayGet(env, "condition")
                                : ZVal.getNull());
        schemes =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, config, env, "schemes")
                                ? config.arrayGet(env, "schemes")
                                : ZVal.getNull());
        methods =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, config, env, "methods")
                                ? config.arrayGet(env, "methods")
                                : ZVal.getNull());
        trailingSlashOnRoot =
                ZVal.assign(
                        ZVal.isDefined(
                                        ternaryExpressionTemp =
                                                config.arrayGet(env, "trailing_slash_on_root"))
                                ? ternaryExpressionTemp
                                : true);
        if (arrayActionR(ArrayAction.ISSET, config, env, "controller")) {
            defaults.arrayAccess(env, "_controller").set(config.arrayGet(env, "controller"));
        }

        env.callMethod(
                this,
                "setCurrentDir",
                YamlFileLoader.class,
                function_dirname.f.env(env).call(path).value());
        imported =
                env.callMethod(
                        this,
                        "import",
                        YamlFileLoader.class,
                        config.arrayGet(env, "resource"),
                        type,
                        false,
                        file);
        if (!function_is_array.f.env(env).call(imported).getBool()) {
            imported = ZVal.newArray(new ZPair(0, imported));
        }

        for (ZPair zpairResult2048 : ZVal.getIterable(imported, env, true)) {
            subCollection = ZVal.assign(zpairResult2048.getValue());
            if (!function_is_array.f.env(env).call(prefix.getObject()).getBool()) {
                env.callMethod(
                        subCollection, "addPrefix", YamlFileLoader.class, prefix.getObject());
                if (!ZVal.isTrue(trailingSlashOnRoot)) {
                    rootPath =
                            env.callMethod(
                                    new Route(
                                            env,
                                            toStringR(
                                                            function_trim
                                                                    .f
                                                                    .env(env)
                                                                    .call(
                                                                            function_trim
                                                                                    .f
                                                                                    .env(env)
                                                                                    .call(
                                                                                            prefix
                                                                                                    .getObject())
                                                                                    .value(),
                                                                            "/")
                                                                    .value(),
                                                            env)
                                                    + "/"),
                                    "getPath",
                                    YamlFileLoader.class);
                    for (ZPair zpairResult2049 :
                            ZVal.getIterable(
                                    env.callMethod(subCollection, "all", YamlFileLoader.class),
                                    env,
                                    true)) {
                        route = ZVal.assign(zpairResult2049.getValue());
                        if (ZVal.strictEqualityCheck(
                                env.callMethod(route, "getPath", YamlFileLoader.class),
                                "===",
                                rootPath)) {
                            env.callMethod(
                                    route,
                                    "setPath",
                                    YamlFileLoader.class,
                                    function_rtrim.f.env(env).call(rootPath, "/").value());
                        }
                    }
                }

            } else {
                for (ZPair zpairResult2050 : ZVal.getIterable(prefix.getObject(), env, false)) {
                    locale = ZVal.assign(zpairResult2050.getKey());
                    localePrefix = ZVal.assign(zpairResult2050.getValue());
                    prefix.arrayAccess(env, locale)
                            .set(
                                    function_trim
                                            .f
                                            .env(env)
                                            .call(
                                                    function_trim
                                                            .f
                                                            .env(env)
                                                            .call(localePrefix)
                                                            .value(),
                                                    "/")
                                            .value());
                }

                for (ZPair zpairResult2051 :
                        ZVal.getIterable(
                                env.callMethod(subCollection, "all", YamlFileLoader.class),
                                env,
                                false)) {
                    name.setObject(ZVal.assign(zpairResult2051.getKey()));
                    route = ZVal.assign(zpairResult2051.getValue());
                    if (ZVal.strictEqualityCheck(
                            ZVal.getNull(),
                            "===",
                            locale =
                                    env.callMethod(
                                            route,
                                            "getDefault",
                                            YamlFileLoader.class,
                                            "_locale"))) {
                        env.callMethod(
                                subCollection, "remove", YamlFileLoader.class, name.getObject());
                        for (ZPair zpairResult2052 :
                                ZVal.getIterable(prefix.getObject(), env, false)) {
                            locale = ZVal.assign(zpairResult2052.getKey());
                            localePrefix = ZVal.assign(zpairResult2052.getValue());
                            localizedRoute =
                                    ZVal.assign(((RuntimeClassInterface) route).phpClone(env));
                            env.callMethod(
                                    localizedRoute,
                                    "setDefault",
                                    YamlFileLoader.class,
                                    "_locale",
                                    locale);
                            env.callMethod(
                                    localizedRoute,
                                    "setDefault",
                                    YamlFileLoader.class,
                                    "_canonical_route",
                                    name.getObject());
                            env.callMethod(
                                    localizedRoute,
                                    "setPath",
                                    YamlFileLoader.class,
                                    toStringR(localePrefix, env)
                                            + toStringR(
                                                    ZVal.toBool(!ZVal.isTrue(trailingSlashOnRoot))
                                                                    && ZVal.toBool(
                                                                            ZVal
                                                                                    .strictEqualityCheck(
                                                                                            "/",
                                                                                            "===",
                                                                                            env
                                                                                                    .callMethod(
                                                                                                            route,
                                                                                                            "getPath",
                                                                                                            YamlFileLoader
                                                                                                                    .class)))
                                                            ? ""
                                                            : env.callMethod(
                                                                    route,
                                                                    "getPath",
                                                                    YamlFileLoader.class),
                                                    env));
                            env.callMethod(
                                    subCollection,
                                    new RuntimeArgsWithReferences(),
                                    "add",
                                    YamlFileLoader.class,
                                    toStringR(name.getObject(), env) + "." + toStringR(locale, env),
                                    localizedRoute);
                        }

                    } else if (!arrayActionR(ArrayAction.ISSET, prefix, env, locale)) {
                        throw ZVal.getException(
                                env,
                                new InvalidArgumentException(
                                        env,
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "Route \"%s\" with locale \"%s\" is missing a corresponding prefix when imported in \"%s\".",
                                                        name.getObject(), locale, file)
                                                .value()));

                    } else {
                        env.callMethod(
                                route,
                                "setPath",
                                YamlFileLoader.class,
                                toStringR(prefix.arrayGet(env, locale), env)
                                        + toStringR(
                                                ZVal.toBool(!ZVal.isTrue(trailingSlashOnRoot))
                                                                && ZVal.toBool(
                                                                        ZVal.strictEqualityCheck(
                                                                                "/",
                                                                                "===",
                                                                                env.callMethod(
                                                                                        route,
                                                                                        "getPath",
                                                                                        YamlFileLoader
                                                                                                .class)))
                                                        ? ""
                                                        : env.callMethod(
                                                                route,
                                                                "getPath",
                                                                YamlFileLoader.class),
                                                env));
                        env.callMethod(
                                subCollection,
                                new RuntimeArgsWithReferences().add(0, name),
                                "add",
                                YamlFileLoader.class,
                                name.getObject(),
                                route);
                    }
                }
            }

            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", host)) {
                env.callMethod(subCollection, "setHost", YamlFileLoader.class, host);
            }

            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", condition)) {
                env.callMethod(subCollection, "setCondition", YamlFileLoader.class, condition);
            }

            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", schemes)) {
                env.callMethod(subCollection, "setSchemes", YamlFileLoader.class, schemes);
            }

            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", methods)) {
                env.callMethod(subCollection, "setMethods", YamlFileLoader.class, methods);
            }

            env.callMethod(
                    subCollection, "addDefaults", YamlFileLoader.class, defaults.getObject());
            env.callMethod(subCollection, "addRequirements", YamlFileLoader.class, requirements);
            env.callMethod(subCollection, "addOptions", YamlFileLoader.class, options);
            if (arrayActionR(ArrayAction.ISSET, config, env, "name_prefix")) {
                env.callMethod(
                        subCollection,
                        "addNamePrefix",
                        YamlFileLoader.class,
                        config.arrayGet(env, "name_prefix"));
            }

            env.callMethod(collection, "addCollection", YamlFileLoader.class, subCollection);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(index = 2, name = "path")
    protected Object validate(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object name = assignParameter(args, 1, false);
        Object path = assignParameter(args, 2, false);
        Object extraKeys = null;
        if (!function_is_array.f.env(env).call(config.getObject()).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "The definition of \"%s\" in \"%s\" must be a YAML array.",
                                            name, path)
                                    .value()));
        }

        if (ZVal.isTrue(
                extraKeys =
                        function_array_diff
                                .f
                                .env(env)
                                .call(
                                        function_array_keys
                                                .f
                                                .env(env)
                                                .call(config.getObject())
                                                .value(),
                                        env.getRequestStaticProperties(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Symfony
                                                                .namespaces
                                                                .Component
                                                                .namespaces
                                                                .Routing
                                                                .namespaces
                                                                .Loader
                                                                .classes
                                                                .YamlFileLoader
                                                                .RequestStaticProperties
                                                                .class)
                                                .availableKeys)
                                .value())) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "The routing file \"%s\" contains unsupported keys for \"%s\": \"%s\". Expected one of: \"%s\".",
                                            path,
                                            name,
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call("\", \"", extraKeys)
                                                    .value(),
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call(
                                                            "\", \"",
                                                            env.getRequestStaticProperties(
                                                                            com.project
                                                                                    .convertedCode
                                                                                    .globalNamespace
                                                                                    .namespaces
                                                                                    .Symfony
                                                                                    .namespaces
                                                                                    .Component
                                                                                    .namespaces
                                                                                    .Routing
                                                                                    .namespaces
                                                                                    .Loader
                                                                                    .classes
                                                                                    .YamlFileLoader
                                                                                    .RequestStaticProperties
                                                                                    .class)
                                                                    .availableKeys)
                                                    .value())
                                    .value()));
        }

        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, config, env, "resource"))
                && ZVal.toBool(arrayActionR(ArrayAction.ISSET, config, env, "path"))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "The routing file \"%s\" must not specify both the \"resource\" key and the \"path\" key for \"%s\". Choose between an import and a route definition.",
                                            path, name)
                                    .value()));
        }

        if (ZVal.toBool(!arrayActionR(ArrayAction.ISSET, config, env, "resource"))
                && ZVal.toBool(arrayActionR(ArrayAction.ISSET, config, env, "type"))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "The \"type\" key for the route definition \"%s\" in \"%s\" is unsupported. It is only available for imports in combination with the \"resource\" key.",
                                            name, path)
                                    .value()));
        }

        if (ZVal.toBool(!arrayActionR(ArrayAction.ISSET, config, env, "resource"))
                && ZVal.toBool(!arrayActionR(ArrayAction.ISSET, config, env, "path"))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "You must define a \"path\" for the route \"%s\" in file \"%s\".",
                                            name, path)
                                    .value()));
        }

        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, config, env, "controller"))
                && ZVal.toBool(
                        arrayActionR(ArrayAction.ISSET, config, env, "defaults", "_controller"))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "The routing file \"%s\" must not specify both the \"controller\" key and the defaults key \"_controller\" for \"%s\".",
                                            path, name)
                                    .value()));
        }

        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\Routing\\Loader\\YamlFileLoader";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object availableKeys =
                ZVal.arrayFromList(
                        "resource",
                        "type",
                        "prefix",
                        "path",
                        "host",
                        "schemes",
                        "methods",
                        "defaults",
                        "requirements",
                        "options",
                        "condition",
                        "controller",
                        "name_prefix",
                        "trailing_slash_on_root");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Routing\\Loader\\YamlFileLoader")
                    .setLookup(
                            YamlFileLoader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("yamlParser")
                    .setStaticPropertyNames("availableKeys")
                    .setFilename("vendor/symfony/routing/Loader/YamlFileLoader.php")
                    .addExtendsClass("Symfony\\Component\\Config\\Loader\\FileLoader")
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
