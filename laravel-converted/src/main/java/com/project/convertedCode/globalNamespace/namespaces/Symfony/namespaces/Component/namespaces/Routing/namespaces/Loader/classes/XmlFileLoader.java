package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Loader.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMElement;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes.Route;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes.RouteCollection;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/routing/Loader/XmlFileLoader.php

*/

public class XmlFileLoader extends RuntimeClassBase {

    public XmlFileLoader(RuntimeEnv env, Object... args) {
        super(env);
    }

    public XmlFileLoader(NoConstructor n) {
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
        int runtimeConverterContinueCount;
        Object file = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = ZVal.getNull();
        }
        Object path = null;
        Object node = null;
        Object xml = null;
        Object collection = null;
        path =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("locator").value(),
                        "locate",
                        XmlFileLoader.class,
                        file);
        xml = this.loadFile(env, path);
        collection = new RouteCollection(env);
        env.callMethod(
                collection,
                "addResource",
                XmlFileLoader.class,
                env.createNew(ZVal.resolveClassAlias(env, "FileResource"), path));
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2035 :
                ZVal.getIterable(
                        toObjectR(xml)
                                .accessProp(this, env)
                                .name("documentElement")
                                .getObject()
                                .accessProp(this, env)
                                .name("childNodes")
                                .value(),
                        env,
                        true)) {
            node = ZVal.assign(zpairResult2035.getValue());
            if (!ZVal.isTrue(ZVal.checkInstanceType(node, DOMElement.class, "DOMElement"))) {
                continue;
            }

            this.parseNode(env, collection, node, path, file);
        }

        return ZVal.assign(collection);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "collection",
        typeHint = "Symfony\\Component\\Routing\\RouteCollection"
    )
    @ConvertedParameter(index = 1, name = "node", typeHint = "DOMElement")
    @ConvertedParameter(index = 2, name = "path")
    @ConvertedParameter(index = 3, name = "file")
    protected Object parseNode(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object collection = assignParameter(args, 0, false);
        Object node = assignParameter(args, 1, false);
        Object path = assignParameter(args, 2, false);
        Object file = assignParameter(args, 3, false);
        if (ZVal.strictNotEqualityCheck(
                CONST_NAMESPACE_URI,
                "!==",
                toObjectR(node).accessProp(this, env).name("namespaceURI").value())) {
            return null;
        }

        SwitchEnumType134 switchVariable134 =
                ZVal.getEnum(
                        toObjectR(node).accessProp(this, env).name("localName").value(),
                        SwitchEnumType134.DEFAULT_CASE,
                        SwitchEnumType134.STRING_route,
                        "route",
                        SwitchEnumType134.STRING_import,
                        "import");
        switch (switchVariable134) {
            case STRING_route:
                this.parseRoute(env, collection, node, path);
                break;
            case STRING_import:
                this.parseImport(env, collection, node, path, file);
                break;
            case DEFAULT_CASE:
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Unknown tag \"%s\" used in file \"%s\". Expected \"route\" or \"import\".",
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("localName")
                                                        .value(),
                                                path)
                                        .value()));
        }
        ;
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
                                                ZVal.strictEqualityCheck(
                                                        "xml",
                                                        "===",
                                                        NamespaceGlobal.pathinfo
                                                                .env(env)
                                                                .call(resource, 4)
                                                                .value())))
                        && ZVal.toBool(
                                ZVal.toBool(!ZVal.isTrue(type))
                                        || ZVal.toBool(
                                                ZVal.strictEqualityCheck("xml", "===", type))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "collection",
        typeHint = "Symfony\\Component\\Routing\\RouteCollection"
    )
    @ConvertedParameter(index = 1, name = "node", typeHint = "DOMElement")
    @ConvertedParameter(index = 2, name = "path")
    protected Object parseRoute(RuntimeEnv env, Object... args) {
        Object collection = assignParameter(args, 0, false);
        Object node = assignParameter(args, 1, false);
        Object path = assignParameter(args, 2, false);
        Object requirements = null;
        Object methods = null;
        Object schemes = null;
        Object locale = null;
        Object runtimeTempArrayResult203 = null;
        Object p = null;
        Object condition = null;
        Object route = null;
        ReferenceContainer defaults = new BasicReferenceContainer(null);
        Object paths = null;
        Object options = null;
        ReferenceContainer id = new BasicReferenceContainer(null);
        if (ZVal.strictEqualityCheck(
                "",
                "===",
                id.setObject(env.callMethod(node, "getAttribute", XmlFileLoader.class, "id")))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "The <route> element in file \"%s\" must have an \"id\" attribute.",
                                            path)
                                    .value()));
        }

        schemes =
                NamespaceGlobal.preg_split
                        .env(env)
                        .call(
                                "/[\\s,\\|]++/",
                                env.callMethod(
                                        node, "getAttribute", XmlFileLoader.class, "schemes"),
                                -1,
                                1)
                        .value();
        methods =
                NamespaceGlobal.preg_split
                        .env(env)
                        .call(
                                "/[\\s,\\|]++/",
                                env.callMethod(
                                        node, "getAttribute", XmlFileLoader.class, "methods"),
                                -1,
                                1)
                        .value();
        ZVal.list(
                runtimeTempArrayResult203 = this.parseConfigs(env, node, path),
                (defaults.setObject(listGet(runtimeTempArrayResult203, 0, env))),
                (requirements = listGet(runtimeTempArrayResult203, 1, env)),
                (options = listGet(runtimeTempArrayResult203, 2, env)),
                (condition = listGet(runtimeTempArrayResult203, 3, env)),
                (paths = listGet(runtimeTempArrayResult203, 4, env)));
        if (ZVal.toBool(!ZVal.isTrue(paths))
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                "",
                                "===",
                                env.callMethod(
                                        node, "getAttribute", XmlFileLoader.class, "path")))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "The <route> element in file \"%s\" must have a \"path\" attribute or <path> child nodes.",
                                            path)
                                    .value()));
        }

        if (ZVal.toBool(paths)
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                "",
                                "!==",
                                env.callMethod(
                                        node, "getAttribute", XmlFileLoader.class, "path")))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "The <route> element in file \"%s\" must not have both a \"path\" attribute and <path> child nodes.",
                                            path)
                                    .value()));
        }

        if (!ZVal.isTrue(paths)) {
            route =
                    new Route(
                            env,
                            env.callMethod(node, "getAttribute", XmlFileLoader.class, "path"),
                            defaults.getObject(),
                            requirements,
                            options,
                            env.callMethod(node, "getAttribute", XmlFileLoader.class, "host"),
                            schemes,
                            methods,
                            condition);
            env.callMethod(
                    collection,
                    new RuntimeArgsWithReferences().add(0, id),
                    "add",
                    XmlFileLoader.class,
                    id.getObject(),
                    route);

        } else {
            for (ZPair zpairResult2036 : ZVal.getIterable(paths, env, false)) {
                locale = ZVal.assign(zpairResult2036.getKey());
                p = ZVal.assign(zpairResult2036.getValue());
                defaults.arrayAccess(env, "_locale").set(locale);
                defaults.arrayAccess(env, "_canonical_route").set(id.getObject());
                route =
                        new Route(
                                env,
                                p,
                                defaults.getObject(),
                                requirements,
                                options,
                                env.callMethod(node, "getAttribute", XmlFileLoader.class, "host"),
                                schemes,
                                methods,
                                condition);
                env.callMethod(
                        collection,
                        new RuntimeArgsWithReferences(),
                        "add",
                        XmlFileLoader.class,
                        toStringR(id.getObject(), env) + "." + toStringR(locale, env),
                        route);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "collection",
        typeHint = "Symfony\\Component\\Routing\\RouteCollection"
    )
    @ConvertedParameter(index = 1, name = "node", typeHint = "DOMElement")
    @ConvertedParameter(index = 2, name = "path")
    @ConvertedParameter(index = 3, name = "file")
    protected Object parseImport(RuntimeEnv env, Object... args) {
        Object collection = assignParameter(args, 0, false);
        Object node = assignParameter(args, 1, false);
        Object path = assignParameter(args, 2, false);
        Object file = assignParameter(args, 3, false);
        Object prefix = null;
        Object methods = null;
        Object localizedRoute = null;
        Object type = null;
        Object locale = null;
        Object namePrefix = null;
        Object runtimeTempArrayResult204 = null;
        Object imported = null;
        Object host = null;
        Object options = null;
        Object subCollection = null;
        Object requirements = null;
        Object resource = null;
        Object schemes = null;
        Object rootPath = null;
        Object trailingSlashOnRoot = null;
        Object condition = null;
        ReferenceContainer prefixes = new BasicReferenceContainer(null);
        Object localePrefix = null;
        Object route = null;
        Object defaults = null;
        ReferenceContainer name = new BasicReferenceContainer(null);
        if (ZVal.strictEqualityCheck(
                "",
                "===",
                resource = env.callMethod(node, "getAttribute", XmlFileLoader.class, "resource"))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "The <import> element in file \"%s\" must have a \"resource\" attribute.",
                                            path)
                                    .value()));
        }

        type = env.callMethod(node, "getAttribute", XmlFileLoader.class, "type");
        prefix = env.callMethod(node, "getAttribute", XmlFileLoader.class, "prefix");
        host =
                ZVal.assign(
                        ZVal.isTrue(
                                        env.callMethod(
                                                node, "hasAttribute", XmlFileLoader.class, "host"))
                                ? env.callMethod(node, "getAttribute", XmlFileLoader.class, "host")
                                : ZVal.getNull());
        schemes =
                ZVal.assign(
                        ZVal.isTrue(
                                        env.callMethod(
                                                node,
                                                "hasAttribute",
                                                XmlFileLoader.class,
                                                "schemes"))
                                ? NamespaceGlobal.preg_split
                                        .env(env)
                                        .call(
                                                "/[\\s,\\|]++/",
                                                env.callMethod(
                                                        node,
                                                        "getAttribute",
                                                        XmlFileLoader.class,
                                                        "schemes"),
                                                -1,
                                                1)
                                        .value()
                                : ZVal.getNull());
        methods =
                ZVal.assign(
                        ZVal.isTrue(
                                        env.callMethod(
                                                node,
                                                "hasAttribute",
                                                XmlFileLoader.class,
                                                "methods"))
                                ? NamespaceGlobal.preg_split
                                        .env(env)
                                        .call(
                                                "/[\\s,\\|]++/",
                                                env.callMethod(
                                                        node,
                                                        "getAttribute",
                                                        XmlFileLoader.class,
                                                        "methods"),
                                                -1,
                                                1)
                                        .value()
                                : ZVal.getNull());
        trailingSlashOnRoot =
                ZVal.assign(
                        ZVal.isTrue(
                                        env.callMethod(
                                                node,
                                                "hasAttribute",
                                                XmlFileLoader.class,
                                                "trailing-slash-on-root"))
                                ? StaticMethodUtils.getStaticBaseClass(
                                                ZVal.resolveClassAlias(env, "XmlUtils"), env)
                                        .callUnknownStaticMethod(
                                                env,
                                                "phpize",
                                                new RuntimeArgsWithReferences(),
                                                env.callMethod(
                                                        node,
                                                        "getAttribute",
                                                        XmlFileLoader.class,
                                                        "trailing-slash-on-root"))
                                : true);
        ZVal.list(
                runtimeTempArrayResult204 = this.parseConfigs(env, node, path),
                (defaults = listGet(runtimeTempArrayResult204, 0, env)),
                (requirements = listGet(runtimeTempArrayResult204, 1, env)),
                (options = listGet(runtimeTempArrayResult204, 2, env)),
                (condition = listGet(runtimeTempArrayResult204, 3, env)),
                (prefixes.setObject(listGet(runtimeTempArrayResult204, 5, env))));
        if (ZVal.toBool(ZVal.strictNotEqualityCheck("", "!==", prefix))
                && ZVal.toBool(prefixes.getObject())) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "The <route> element in file \"%s\" must not have both a \"prefix\" attribute and <prefix> child nodes.",
                                            path)
                                    .value()));
        }

        env.callMethod(
                this,
                "setCurrentDir",
                XmlFileLoader.class,
                function_dirname.f.env(env).call(path).value());
        imported =
                env.callMethod(
                        this,
                        "import",
                        XmlFileLoader.class,
                        resource,
                        ZVal.strictNotEqualityCheck("", "!==", type) ? type : ZVal.getNull(),
                        false,
                        file);
        if (!function_is_array.f.env(env).call(imported).getBool()) {
            imported = ZVal.newArray(new ZPair(0, imported));
        }

        for (ZPair zpairResult2037 : ZVal.getIterable(imported, env, true)) {
            subCollection = ZVal.assign(zpairResult2037.getValue());
            if (ZVal.toBool(ZVal.strictNotEqualityCheck("", "!==", prefix))
                    || ZVal.toBool(!ZVal.isTrue(prefixes.getObject()))) {
                env.callMethod(subCollection, "addPrefix", XmlFileLoader.class, prefix);
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
                                                                                    .call(prefix)
                                                                                    .value(),
                                                                            "/")
                                                                    .value(),
                                                            env)
                                                    + "/"),
                                    "getPath",
                                    XmlFileLoader.class);
                    for (ZPair zpairResult2038 :
                            ZVal.getIterable(
                                    env.callMethod(subCollection, "all", XmlFileLoader.class),
                                    env,
                                    true)) {
                        route = ZVal.assign(zpairResult2038.getValue());
                        if (ZVal.strictEqualityCheck(
                                env.callMethod(route, "getPath", XmlFileLoader.class),
                                "===",
                                rootPath)) {
                            env.callMethod(
                                    route,
                                    "setPath",
                                    XmlFileLoader.class,
                                    function_rtrim.f.env(env).call(rootPath, "/").value());
                        }
                    }
                }

            } else {
                for (ZPair zpairResult2039 : ZVal.getIterable(prefixes.getObject(), env, false)) {
                    locale = ZVal.assign(zpairResult2039.getKey());
                    localePrefix = ZVal.assign(zpairResult2039.getValue());
                    prefixes.arrayAccess(env, locale)
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

                for (ZPair zpairResult2040 :
                        ZVal.getIterable(
                                env.callMethod(subCollection, "all", XmlFileLoader.class),
                                env,
                                false)) {
                    name.setObject(ZVal.assign(zpairResult2040.getKey()));
                    route = ZVal.assign(zpairResult2040.getValue());
                    if (ZVal.strictEqualityCheck(
                            ZVal.getNull(),
                            "===",
                            locale =
                                    env.callMethod(
                                            route, "getDefault", XmlFileLoader.class, "_locale"))) {
                        env.callMethod(
                                subCollection, "remove", XmlFileLoader.class, name.getObject());
                        for (ZPair zpairResult2041 :
                                ZVal.getIterable(prefixes.getObject(), env, false)) {
                            locale = ZVal.assign(zpairResult2041.getKey());
                            localePrefix = ZVal.assign(zpairResult2041.getValue());
                            localizedRoute =
                                    ZVal.assign(((RuntimeClassInterface) route).phpClone(env));
                            env.callMethod(
                                    localizedRoute,
                                    "setPath",
                                    XmlFileLoader.class,
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
                                                                                                            XmlFileLoader
                                                                                                                    .class)))
                                                            ? ""
                                                            : env.callMethod(
                                                                    route,
                                                                    "getPath",
                                                                    XmlFileLoader.class),
                                                    env));
                            env.callMethod(
                                    localizedRoute,
                                    "setDefault",
                                    XmlFileLoader.class,
                                    "_locale",
                                    locale);
                            env.callMethod(
                                    localizedRoute,
                                    "setDefault",
                                    XmlFileLoader.class,
                                    "_canonical_route",
                                    name.getObject());
                            env.callMethod(
                                    subCollection,
                                    new RuntimeArgsWithReferences(),
                                    "add",
                                    XmlFileLoader.class,
                                    toStringR(name.getObject(), env) + "." + toStringR(locale, env),
                                    localizedRoute);
                        }

                    } else if (!arrayActionR(ArrayAction.ISSET, prefixes, env, locale)) {
                        throw ZVal.getException(
                                env,
                                new InvalidArgumentException(
                                        env,
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "Route \"%s\" with locale \"%s\" is missing a corresponding prefix when imported in \"%s\".",
                                                        name.getObject(), locale, path)
                                                .value()));

                    } else {
                        env.callMethod(
                                route,
                                "setPath",
                                XmlFileLoader.class,
                                toStringR(prefixes.arrayGet(env, locale), env)
                                        + toStringR(
                                                ZVal.toBool(!ZVal.isTrue(trailingSlashOnRoot))
                                                                && ZVal.toBool(
                                                                        ZVal.strictEqualityCheck(
                                                                                "/",
                                                                                "===",
                                                                                env.callMethod(
                                                                                        route,
                                                                                        "getPath",
                                                                                        XmlFileLoader
                                                                                                .class)))
                                                        ? ""
                                                        : env.callMethod(
                                                                route,
                                                                "getPath",
                                                                XmlFileLoader.class),
                                                env));
                        env.callMethod(
                                subCollection,
                                new RuntimeArgsWithReferences().add(0, name),
                                "add",
                                XmlFileLoader.class,
                                name.getObject(),
                                route);
                    }
                }
            }

            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", host)) {
                env.callMethod(subCollection, "setHost", XmlFileLoader.class, host);
            }

            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", condition)) {
                env.callMethod(subCollection, "setCondition", XmlFileLoader.class, condition);
            }

            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", schemes)) {
                env.callMethod(subCollection, "setSchemes", XmlFileLoader.class, schemes);
            }

            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", methods)) {
                env.callMethod(subCollection, "setMethods", XmlFileLoader.class, methods);
            }

            env.callMethod(subCollection, "addDefaults", XmlFileLoader.class, defaults);
            env.callMethod(subCollection, "addRequirements", XmlFileLoader.class, requirements);
            env.callMethod(subCollection, "addOptions", XmlFileLoader.class, options);
            if (ZVal.isTrue(
                    namePrefix =
                            env.callMethod(
                                    node, "getAttribute", XmlFileLoader.class, "name-prefix"))) {
                env.callMethod(subCollection, "addNamePrefix", XmlFileLoader.class, namePrefix);
            }

            env.callMethod(collection, "addCollection", XmlFileLoader.class, subCollection);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    protected Object loadFile(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        return ZVal.assign(
                StaticMethodUtils.getStaticBaseClass(ZVal.resolveClassAlias(env, "XmlUtils"), env)
                        .callUnknownStaticMethod(
                                env,
                                "loadFile",
                                new RuntimeArgsWithReferences(),
                                file,
                                toStringR(
                                                env.addRootFilesystemPrefix(
                                                        "/vendor/symfony/routing/Loader"),
                                                env)
                                        + toStringR(
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "SCHEME_PATH"),
                                                env)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "DOMElement")
    @ConvertedParameter(index = 1, name = "path")
    private Object parseConfigs(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        Object node = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, false);
        ReferenceContainer requirements = new BasicReferenceContainer(null);
        Object condition = null;
        ReferenceContainer prefixes = new BasicReferenceContainer(null);
        Object controller = null;
        ReferenceContainer defaults = new BasicReferenceContainer(null);
        ReferenceContainer paths = new BasicReferenceContainer(null);
        ReferenceContainer options = new BasicReferenceContainer(null);
        Object name = null;
        Object n = null;
        defaults.setObject(ZVal.newArray());
        requirements.setObject(ZVal.newArray());
        options.setObject(ZVal.newArray());
        condition = ZVal.getNull();
        prefixes.setObject(ZVal.newArray());
        paths.setObject(ZVal.newArray());
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2042 :
                ZVal.getIterable(
                        env.callMethod(
                                node,
                                "getElementsByTagNameNS",
                                XmlFileLoader.class,
                                CONST_NAMESPACE_URI,
                                "*"),
                        env,
                        true)) {
            n = ZVal.assign(zpairResult2042.getValue());
            if (ZVal.strictNotEqualityCheck(
                    node, "!==", toObjectR(n).accessProp(this, env).name("parentNode").value())) {
                continue;
            }

            SwitchEnumType135 switchVariable135 =
                    ZVal.getEnum(
                            toObjectR(n).accessProp(this, env).name("localName").value(),
                            SwitchEnumType135.DEFAULT_CASE,
                            SwitchEnumType135.STRING_path,
                            "path",
                            SwitchEnumType135.STRING_prefix,
                            "prefix",
                            SwitchEnumType135.STRING_default,
                            "default",
                            SwitchEnumType135.STRING_requirement,
                            "requirement",
                            SwitchEnumType135.STRING_option,
                            "option",
                            SwitchEnumType135.STRING_condition,
                            "condition");
            switch (switchVariable135) {
                case STRING_path:
                    paths.arrayAccess(
                                    env,
                                    env.callMethod(
                                            n, "getAttribute", XmlFileLoader.class, "locale"))
                            .set(
                                    function_trim
                                            .f
                                            .env(env)
                                            .call(
                                                    toObjectR(n)
                                                            .accessProp(this, env)
                                                            .name("textContent")
                                                            .value())
                                            .value());
                    break;
                case STRING_prefix:
                    prefixes.arrayAccess(
                                    env,
                                    env.callMethod(
                                            n, "getAttribute", XmlFileLoader.class, "locale"))
                            .set(
                                    function_trim
                                            .f
                                            .env(env)
                                            .call(
                                                    toObjectR(n)
                                                            .accessProp(this, env)
                                                            .name("textContent")
                                                            .value())
                                            .value());
                    break;
                case STRING_default:
                    if (ZVal.isTrue(this.isElementValueNull(env, n))) {
                        defaults.arrayAccess(
                                        env,
                                        env.callMethod(
                                                n, "getAttribute", XmlFileLoader.class, "key"))
                                .set(ZVal.getNull());

                    } else {
                        defaults.arrayAccess(
                                        env,
                                        env.callMethod(
                                                n, "getAttribute", XmlFileLoader.class, "key"))
                                .set(this.parseDefaultsConfig(env, n, path));
                    }

                    break;
                case STRING_requirement:
                    requirements
                            .arrayAccess(
                                    env,
                                    env.callMethod(n, "getAttribute", XmlFileLoader.class, "key"))
                            .set(
                                    function_trim
                                            .f
                                            .env(env)
                                            .call(
                                                    toObjectR(n)
                                                            .accessProp(this, env)
                                                            .name("textContent")
                                                            .value())
                                            .value());
                    break;
                case STRING_option:
                    options.arrayAccess(
                                    env,
                                    env.callMethod(n, "getAttribute", XmlFileLoader.class, "key"))
                            .set(
                                    function_trim
                                            .f
                                            .env(env)
                                            .call(
                                                    toObjectR(n)
                                                            .accessProp(this, env)
                                                            .name("textContent")
                                                            .value())
                                            .value());
                    break;
                case STRING_condition:
                    condition =
                            function_trim
                                    .f
                                    .env(env)
                                    .call(
                                            toObjectR(n)
                                                    .accessProp(this, env)
                                                    .name("textContent")
                                                    .value())
                                    .value();
                    break;
                case DEFAULT_CASE:
                    throw ZVal.getException(
                            env,
                            new InvalidArgumentException(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Unknown tag \"%s\" used in file \"%s\". Expected \"default\", \"requirement\", \"option\" or \"condition\".",
                                                    toObjectR(n)
                                                            .accessProp(this, env)
                                                            .name("localName")
                                                            .value(),
                                                    path)
                                            .value()));
            }
            ;
        }

        if (ZVal.isTrue(
                controller =
                        env.callMethod(node, "getAttribute", XmlFileLoader.class, "controller"))) {
            if (arrayActionR(ArrayAction.ISSET, defaults, env, "_controller")) {
                name =
                        ZVal.assign(
                                ZVal.isTrue(
                                                env.callMethod(
                                                        node,
                                                        "hasAttribute",
                                                        XmlFileLoader.class,
                                                        "id"))
                                        ? function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "\"%s\"",
                                                        env.callMethod(
                                                                node,
                                                                "getAttribute",
                                                                XmlFileLoader.class,
                                                                "id"))
                                                .value()
                                        : function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "the \"%s\" tag",
                                                        toObjectR(node)
                                                                .accessProp(this, env)
                                                                .name("tagName")
                                                                .value())
                                                .value());
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "The routing file \"%s\" must not specify both the \"controller\" attribute and the defaults key \"_controller\" for %s.",
                                                path, name)
                                        .value()));
            }

            defaults.arrayAccess(env, "_controller").set(controller);
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(0, defaults.getObject()),
                        new ZPair(1, requirements.getObject()),
                        new ZPair(2, options.getObject()),
                        new ZPair(3, condition),
                        new ZPair(4, paths.getObject()),
                        new ZPair(5, prefixes.getObject())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "element", typeHint = "DOMElement")
    @ConvertedParameter(index = 1, name = "path")
    private Object parseDefaultsConfig(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object element = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, false);
        Object child = null;
        if (ZVal.isTrue(this.isElementValueNull(env, element))) {
            return null;
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2043 :
                ZVal.getIterable(
                        toObjectR(element).accessProp(this, env).name("childNodes").value(),
                        env,
                        true)) {
            child = ZVal.assign(zpairResult2043.getValue());
            if (!ZVal.isTrue(ZVal.checkInstanceType(child, DOMElement.class, "DOMElement"))) {
                continue;
            }

            if (ZVal.strictNotEqualityCheck(
                    CONST_NAMESPACE_URI,
                    "!==",
                    toObjectR(child).accessProp(this, env).name("namespaceURI").value())) {
                continue;
            }

            return ZVal.assign(this.parseDefaultNode(env, child, path));
        }

        return ZVal.assign(
                function_trim
                        .f
                        .env(env)
                        .call(toObjectR(element).accessProp(this, env).name("textContent").value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "DOMElement")
    @ConvertedParameter(index = 1, name = "path")
    private Object parseDefaultNode(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object node = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, false);
        ReferenceContainer list = new BasicReferenceContainer(null);
        ReferenceContainer map = new BasicReferenceContainer(null);
        Object element = null;
        if (ZVal.isTrue(this.isElementValueNull(env, node))) {
            return null;
        }

        SwitchEnumType136 switchVariable136 =
                ZVal.getEnum(
                        toObjectR(node).accessProp(this, env).name("localName").value(),
                        SwitchEnumType136.DEFAULT_CASE,
                        SwitchEnumType136.STRING_bool,
                        "bool",
                        SwitchEnumType136.STRING_int,
                        "int",
                        SwitchEnumType136.STRING_float,
                        "float",
                        SwitchEnumType136.STRING_string,
                        "string",
                        SwitchEnumType136.STRING_list,
                        "list",
                        SwitchEnumType136.STRING_map,
                        "map");
        switch (switchVariable136) {
            case STRING_bool:
                return ZVal.assign(
                        ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                "true",
                                                "===",
                                                function_trim
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                toObjectR(node)
                                                                        .accessProp(this, env)
                                                                        .name("nodeValue")
                                                                        .value())
                                                        .value()))
                                || ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                "1",
                                                "===",
                                                function_trim
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                toObjectR(node)
                                                                        .accessProp(this, env)
                                                                        .name("nodeValue")
                                                                        .value())
                                                        .value())));
            case STRING_int:
                return ZVal.assign(
                        ZVal.toLong(
                                function_trim
                                        .f
                                        .env(env)
                                        .call(
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("nodeValue")
                                                        .value())
                                        .value()));
            case STRING_float:
                return ZVal.assign(
                        ZVal.toDouble(
                                function_trim
                                        .f
                                        .env(env)
                                        .call(
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("nodeValue")
                                                        .value())
                                        .value()));
            case STRING_string:
                return ZVal.assign(
                        function_trim
                                .f
                                .env(env)
                                .call(
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("nodeValue")
                                                .value())
                                .value());
            case STRING_list:
                list.setObject(ZVal.newArray());
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult2044 :
                        ZVal.getIterable(
                                toObjectR(node).accessProp(this, env).name("childNodes").value(),
                                env,
                                true)) {
                    element = ZVal.assign(zpairResult2044.getValue());
                    if (!ZVal.isTrue(
                            ZVal.checkInstanceType(element, DOMElement.class, "DOMElement"))) {
                        continue;
                    }

                    if (ZVal.strictNotEqualityCheck(
                            CONST_NAMESPACE_URI,
                            "!==",
                            toObjectR(element)
                                    .accessProp(this, env)
                                    .name("namespaceURI")
                                    .value())) {
                        continue;
                    }

                    list.arrayAppend(env).set(this.parseDefaultNode(env, element, path));
                }

                return ZVal.assign(list.getObject());
            case STRING_map:
                map.setObject(ZVal.newArray());
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult2045 :
                        ZVal.getIterable(
                                toObjectR(node).accessProp(this, env).name("childNodes").value(),
                                env,
                                true)) {
                    element = ZVal.assign(zpairResult2045.getValue());
                    if (!ZVal.isTrue(
                            ZVal.checkInstanceType(element, DOMElement.class, "DOMElement"))) {
                        continue;
                    }

                    if (ZVal.strictNotEqualityCheck(
                            CONST_NAMESPACE_URI,
                            "!==",
                            toObjectR(element)
                                    .accessProp(this, env)
                                    .name("namespaceURI")
                                    .value())) {
                        continue;
                    }

                    map.arrayAccess(
                                    env,
                                    env.callMethod(
                                            element, "getAttribute", XmlFileLoader.class, "key"))
                            .set(this.parseDefaultNode(env, element, path));
                }

                return ZVal.assign(map.getObject());
            case DEFAULT_CASE:
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Unknown tag \"%s\" used in file \"%s\". Expected \"bool\", \"int\", \"float\", \"string\", \"list\", or \"map\".",
                                                toObjectR(node)
                                                        .accessProp(this, env)
                                                        .name("localName")
                                                        .value(),
                                                path)
                                        .value()));
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "element", typeHint = "DOMElement")
    private Object isElementValueNull(RuntimeEnv env, Object... args) {
        Object element = assignParameter(args, 0, false);
        Object namespaceUri = null;
        namespaceUri = "http://www.w3.org/2001/XMLSchema-instance";
        if (!ZVal.isTrue(
                env.callMethod(
                        element, "hasAttributeNS", XmlFileLoader.class, namespaceUri, "nil"))) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        "true",
                                        "===",
                                        env.callMethod(
                                                element,
                                                "getAttributeNS",
                                                XmlFileLoader.class,
                                                namespaceUri,
                                                "nil")))
                        || ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        "1",
                                        "===",
                                        env.callMethod(
                                                element,
                                                "getAttributeNS",
                                                XmlFileLoader.class,
                                                namespaceUri,
                                                "nil"))));
    }

    public static final Object CONST_NAMESPACE_URI = "http://symfony.com/schema/routing";

    public static final Object CONST_SCHEME_PATH = "/schema/routing/routing-1.0.xsd";

    public static final Object CONST_class = "Symfony\\Component\\Routing\\Loader\\XmlFileLoader";

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
                    .setName("Symfony\\Component\\Routing\\Loader\\XmlFileLoader")
                    .setLookup(
                            XmlFileLoader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/routing/Loader/XmlFileLoader.php")
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

    private enum SwitchEnumType134 {
        STRING_route,
        STRING_import,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType135 {
        STRING_path,
        STRING_prefix,
        STRING_default,
        STRING_requirement,
        STRING_option,
        STRING_condition,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType136 {
        STRING_bool,
        STRING_int,
        STRING_float,
        STRING_string,
        STRING_list,
        STRING_map,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
