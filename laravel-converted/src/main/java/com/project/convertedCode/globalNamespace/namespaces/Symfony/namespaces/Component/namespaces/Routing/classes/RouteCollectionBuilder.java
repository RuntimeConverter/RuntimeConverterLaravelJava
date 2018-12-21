package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes.Route;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes.RouteCollection;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/routing/RouteCollectionBuilder.php

*/

public class RouteCollectionBuilder extends RuntimeClassBase {

    public Object routes = ZVal.newArray();

    public Object loader = null;

    public Object defaults = ZVal.newArray();

    public Object prefix = null;

    public Object host = null;

    public Object condition = null;

    public Object requirements = ZVal.newArray();

    public Object options = ZVal.newArray();

    public Object schemes = null;

    public Object methods = null;

    public Object resources = ZVal.newArray();

    public RouteCollectionBuilder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RouteCollectionBuilder.class) {
            this.__construct(env, args);
        }
    }

    public RouteCollectionBuilder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "loader",
        typeHint = "Symfony\\Component\\Config\\Loader\\LoaderInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object loader = assignParameter(args, 0, true);
        if (null == loader) {
            loader = ZVal.getNull();
        }
        this.loader = loader;
        return null;
    }

    @ConvertedMethod(name = "import")
    @ConvertedParameter(index = 0, name = "resource")
    @ConvertedParameter(index = 1, name = "prefix")
    @ConvertedParameter(
        index = 2,
        name = "type",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object _pImport(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object resource = assignParameter(args, 0, false);
        Object prefix = assignParameter(args, 1, true);
        if (null == prefix) {
            prefix = "/";
        }
        Object type = assignParameter(args, 2, true);
        if (null == type) {
            type = ZVal.getNull();
        }
        Object route = null;
        Object collections = null;
        Object builder = null;
        Object name = null;
        Object collection = null;
        collections = this.load(env, resource, type);
        builder = this.createBuilder(env);
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2088 : ZVal.getIterable(collections, env, true)) {
            collection = ZVal.assign(zpairResult2088.getValue());
            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", collection)) {
                continue;
            }

            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult2089 :
                    ZVal.getIterable(
                            env.callMethod(collection, "all", RouteCollectionBuilder.class),
                            env,
                            false)) {
                name = ZVal.assign(zpairResult2089.getKey());
                route = ZVal.assign(zpairResult2089.getValue());
                env.callMethod(builder, "addRoute", RouteCollectionBuilder.class, route, name);
            }

            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult2090 :
                    ZVal.getIterable(
                            env.callMethod(
                                    collection, "getResources", RouteCollectionBuilder.class),
                            env,
                            true)) {
                resource = ZVal.assign(zpairResult2090.getValue());
                env.callMethod(builder, "addResource", RouteCollectionBuilder.class, resource);
            }
        }

        this.mount(env, prefix, builder);
        return ZVal.assign(builder);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "controller")
    @ConvertedParameter(
        index = 2,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object add(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object controller = assignParameter(args, 1, false);
        Object name = assignParameter(args, 2, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object route = null;
        route = new Route(env, path);
        env.callMethod(
                route, "setDefault", RouteCollectionBuilder.class, "_controller", controller);
        this.addRoute(env, route, name);
        return ZVal.assign(route);
    }

    @ConvertedMethod
    public Object createBuilder(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Symfony
                        .namespaces
                        .Component
                        .namespaces
                        .Routing
                        .classes
                        .RouteCollectionBuilder(env, this.loader));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prefix")
    @ConvertedParameter(index = 1, name = "builder", typeHint = "self")
    public Object mount(RuntimeEnv env, Object... args) {
        Object prefix = assignParameter(args, 0, false);
        Object builder = assignParameter(args, 1, false);
        toObjectR(builder)
                .accessProp(this, env)
                .name("prefix")
                .set(
                        function_trim
                                .f
                                .env(env)
                                .call(function_trim.f.env(env).call(prefix).value(), "/")
                                .value());
        new ReferenceClassProperty(this, "routes", env).arrayAppend(env).set(builder);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "route", typeHint = "Symfony\\Component\\Routing\\Route")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object addRoute(RuntimeEnv env, Object... args) {
        Object route = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", name)) {
            name =
                    "_unnamed_route_"
                            + toStringR(
                                    NamespaceGlobal.spl_object_hash.env(env).call(route).value(),
                                    env);
        }

        new ReferenceClassProperty(this, "routes", env).arrayAccess(env, name).set(route);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pattern")
    public Object setHost(RuntimeEnv env, Object... args) {
        Object pattern = assignParameter(args, 0, false);
        this.host = pattern;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "condition")
    public Object setCondition(RuntimeEnv env, Object... args) {
        Object condition = assignParameter(args, 0, false);
        this.condition = condition;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object setDefault(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "defaults", env).arrayAccess(env, key).set(value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "regex")
    public Object setRequirement(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object regex = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "requirements", env).arrayAccess(env, key).set(regex);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object setOption(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "options", env).arrayAccess(env, key).set(value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "schemes")
    public Object setSchemes(RuntimeEnv env, Object... args) {
        Object schemes = assignParameter(args, 0, false);
        this.schemes = schemes;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methods")
    public Object setMethods(RuntimeEnv env, Object... args) {
        Object methods = assignParameter(args, 0, false);
        this.methods = methods;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "resource",
        typeHint = "Symfony\\Component\\Config\\Resource\\ResourceInterface"
    )
    private Object addResource(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "resources", env).arrayAppend(env).set(resource);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object build(RuntimeEnv env, Object... args) {
        Object val = null;
        Object route = null;
        Object routeCollection = null;
        Object resource = null;
        ReferenceContainer name = new BasicReferenceContainer(null);
        Object key = null;
        Object subCollection = null;
        routeCollection = new RouteCollection(env);
        for (ZPair zpairResult2091 : ZVal.getIterable(this.routes, env, false)) {
            name.setObject(ZVal.assign(zpairResult2091.getKey()));
            route = ZVal.assign(zpairResult2091.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            route, Route.class, "Symfony\\Component\\Routing\\Route"))) {
                env.callMethod(
                        route,
                        "setDefaults",
                        RouteCollectionBuilder.class,
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        this.defaults,
                                        env.callMethod(
                                                route, "getDefaults", RouteCollectionBuilder.class))
                                .value());
                env.callMethod(
                        route,
                        "setOptions",
                        RouteCollectionBuilder.class,
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        this.options,
                                        env.callMethod(
                                                route, "getOptions", RouteCollectionBuilder.class))
                                .value());
                for (ZPair zpairResult2092 : ZVal.getIterable(this.requirements, env, false)) {
                    key = ZVal.assign(zpairResult2092.getKey());
                    val = ZVal.assign(zpairResult2092.getValue());
                    if (!ZVal.isTrue(
                            env.callMethod(
                                    route, "hasRequirement", RouteCollectionBuilder.class, key))) {
                        env.callMethod(
                                route, "setRequirement", RouteCollectionBuilder.class, key, val);
                    }
                }

                if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.prefix)) {
                    env.callMethod(
                            route,
                            "setPath",
                            RouteCollectionBuilder.class,
                            "/"
                                    + toStringR(this.prefix, env)
                                    + toStringR(
                                            env.callMethod(
                                                    route, "getPath", RouteCollectionBuilder.class),
                                            env));
                }

                if (!ZVal.isTrue(env.callMethod(route, "getHost", RouteCollectionBuilder.class))) {
                    env.callMethod(route, "setHost", RouteCollectionBuilder.class, this.host);
                }

                if (!ZVal.isTrue(
                        env.callMethod(route, "getCondition", RouteCollectionBuilder.class))) {
                    env.callMethod(
                            route, "setCondition", RouteCollectionBuilder.class, this.condition);
                }

                if (!ZVal.isTrue(
                        env.callMethod(route, "getSchemes", RouteCollectionBuilder.class))) {
                    env.callMethod(route, "setSchemes", RouteCollectionBuilder.class, this.schemes);
                }

                if (!ZVal.isTrue(
                        env.callMethod(route, "getMethods", RouteCollectionBuilder.class))) {
                    env.callMethod(route, "setMethods", RouteCollectionBuilder.class, this.methods);
                }

                if (ZVal.strictEqualityCheck(
                        "_unnamed_route_",
                        "===",
                        function_substr.f.env(env).call(name.getObject(), 0, 15).value())) {
                    name.setObject(this.generateRouteName(env, route));
                }

                env.callMethod(
                        routeCollection,
                        new RuntimeArgsWithReferences().add(0, name),
                        "add",
                        RouteCollectionBuilder.class,
                        name.getObject(),
                        route);

            } else {
                subCollection = env.callMethod(route, "build", RouteCollectionBuilder.class);
                env.callMethod(
                        subCollection, "addPrefix", RouteCollectionBuilder.class, this.prefix);
                env.callMethod(
                        routeCollection,
                        "addCollection",
                        RouteCollectionBuilder.class,
                        subCollection);
            }
        }

        for (ZPair zpairResult2093 : ZVal.getIterable(this.resources, env, true)) {
            resource = ZVal.assign(zpairResult2093.getValue());
            env.callMethod(routeCollection, "addResource", RouteCollectionBuilder.class, resource);
        }

        return ZVal.assign(routeCollection);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "route", typeHint = "Symfony\\Component\\Routing\\Route")
    private Object generateRouteName(RuntimeEnv env, Object... args) {
        Object route = assignParameter(args, 0, false);
        Object methods = null;
        Object routeName = null;
        methods =
                toStringR(
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                "_",
                                                env.callMethod(
                                                        route,
                                                        "getMethods",
                                                        RouteCollectionBuilder.class))
                                        .value(),
                                env)
                        + "_";
        routeName =
                toStringR(methods, env)
                        + toStringR(
                                env.callMethod(route, "getPath", RouteCollectionBuilder.class),
                                env);
        routeName =
                function_str_replace
                        .f
                        .env(env)
                        .call(ZVal.arrayFromList("/", ":", "|", "-"), "_", routeName)
                        .value();
        routeName =
                function_preg_replace.f.env(env).call("/[^a-z0-9A-Z_.]+/", "", routeName).value();
        routeName = function_preg_replace.f.env(env).call("/_+/", "_", routeName).value();
        return ZVal.assign(routeName);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    @ConvertedParameter(
        index = 1,
        name = "type",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    private Object load(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = ZVal.getNull();
        }
        Object resolver = null;
        Object collections = null;
        Object loader = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.loader)) {
            throw ZVal.getException(
                    env,
                    new BadMethodCallException(
                            env,
                            "Cannot import other routing resources: you must pass a LoaderInterface when constructing RouteCollectionBuilder."));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        this.loader, "supports", RouteCollectionBuilder.class, resource, type))) {
            collections =
                    env.callMethod(
                            this.loader, "load", RouteCollectionBuilder.class, resource, type);
            return ZVal.assign(
                    function_is_array.f.env(env).call(collections).getBool()
                            ? collections
                            : ZVal.newArray(new ZPair(0, collections)));
        }

        if (ZVal.strictEqualityCheck(
                ZVal.getNull(),
                "===",
                resolver =
                        env.callMethod(this.loader, "getResolver", RouteCollectionBuilder.class))) {
            throw ZVal.getException(
                    env,
                    env.createNew(
                            ZVal.resolveClassAlias(env, "FileLoaderLoadException"),
                            resource,
                            ZVal.getNull(),
                            ZVal.getNull(),
                            ZVal.getNull(),
                            type));
        }

        if (ZVal.strictEqualityCheck(
                false,
                "===",
                loader =
                        env.callMethod(
                                resolver,
                                "resolve",
                                RouteCollectionBuilder.class,
                                resource,
                                type))) {
            throw ZVal.getException(
                    env,
                    env.createNew(
                            ZVal.resolveClassAlias(env, "FileLoaderLoadException"),
                            resource,
                            ZVal.getNull(),
                            ZVal.getNull(),
                            ZVal.getNull(),
                            type));
        }

        collections = env.callMethod(loader, "load", RouteCollectionBuilder.class, resource, type);
        return ZVal.assign(
                function_is_array.f.env(env).call(collections).getBool()
                        ? collections
                        : ZVal.newArray(new ZPair(0, collections)));
    }

    public static final Object CONST_class = "Symfony\\Component\\Routing\\RouteCollectionBuilder";

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
                    .setName("Symfony\\Component\\Routing\\RouteCollectionBuilder")
                    .setLookup(
                            RouteCollectionBuilder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "condition",
                            "defaults",
                            "host",
                            "loader",
                            "methods",
                            "options",
                            "prefix",
                            "requirements",
                            "resources",
                            "routes",
                            "schemes")
                    .setFilename("vendor/symfony/routing/RouteCollectionBuilder.php")
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
