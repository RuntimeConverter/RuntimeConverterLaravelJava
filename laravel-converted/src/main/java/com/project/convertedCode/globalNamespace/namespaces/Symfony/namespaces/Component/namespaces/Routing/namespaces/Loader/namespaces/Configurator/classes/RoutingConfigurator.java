package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Loader.namespaces.Configurator.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Loader.namespaces.Configurator.classes.CollectionConfigurator;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Loader.namespaces.Configurator.classes.ImportConfigurator;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Loader.namespaces.Configurator.classes.RouteConfigurator;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes.Route;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff_key;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes.RouteCollection;
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

 vendor/symfony/routing/Loader/Configurator/RoutingConfigurator.php

*/

public class RoutingConfigurator extends RuntimeClassBase {

    public Object loader = null;

    public Object path = null;

    public Object file = null;

    public Object collection = null;

    public Object name = "";

    public Object prefixes = null;

    public RoutingConfigurator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RoutingConfigurator.class) {
            this.__construct(env, args);
        }
    }

    public RoutingConfigurator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "collection",
        typeHint = "Symfony\\Component\\Routing\\RouteCollection"
    )
    @ConvertedParameter(
        index = 1,
        name = "loader",
        typeHint = "Symfony\\Component\\Routing\\Loader\\PhpFileLoader"
    )
    @ConvertedParameter(index = 2, name = "path", typeHint = "string")
    @ConvertedParameter(index = 3, name = "file", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object collection = assignParameter(args, 0, false);
        Object loader = assignParameter(args, 1, false);
        Object path = assignParameter(args, 2, false);
        Object file = assignParameter(args, 3, false);
        this.collection = collection;
        this.loader = loader;
        this.path = path;
        this.file = file;
        return null;
    }

    @ConvertedMethod(name = "import")
    @ConvertedParameter(index = 0, name = "resource")
    @ConvertedParameter(
        index = 1,
        name = "type",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "ignoreErrors",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public final Object _pImport(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = ZVal.getNull();
        }
        Object ignoreErrors = assignParameter(args, 2, true);
        if (null == ignoreErrors) {
            ignoreErrors = false;
        }
        Object mergedCollection = null;
        Object imported = null;
        Object subCollection = null;
        env.callMethod(
                this.loader,
                "setCurrentDir",
                RoutingConfigurator.class,
                function_dirname.f.env(env).call(this.path).value());
        imported =
                env.callMethod(
                        this.loader,
                        "import",
                        RoutingConfigurator.class,
                        resource,
                        type,
                        ignoreErrors,
                        this.file);
        if (!function_is_array.f.env(env).call(imported).getBool()) {
            return ZVal.assign(new ImportConfigurator(env, this.collection, imported));
        }

        mergedCollection = new RouteCollection(env);
        for (ZPair zpairResult2029 : ZVal.getIterable(imported, env, true)) {
            subCollection = ZVal.assign(zpairResult2029.getValue());
            env.callMethod(
                    mergedCollection, "addCollection", RoutingConfigurator.class, subCollection);
        }

        return ZVal.assign(new ImportConfigurator(env, this.collection, mergedCollection));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public final Object collection(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, true);
        if (null == name) {
            name = "";
        }
        return ZVal.assign(new CollectionConfigurator(env, this.collection, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    @ConvertedParameter(index = 1, name = "path")
    public final Object add(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, false);
        Object routes = null;
        Object route = null;
        ReferenceContainer paths = new BasicReferenceContainer(null);
        Object localePath = null;
        Object prefix = null;
        Object missing = null;
        Object parentConfigurator = null;
        Object locale = null;
        paths.setObject(ZVal.newArray());
        parentConfigurator =
                ZVal.assign(
                        ZVal.isTrue(
                                        ZVal.checkInstanceType(
                                                this,
                                                CollectionConfigurator.class,
                                                "Symfony\\Component\\Routing\\Loader\\Configurator\\CollectionConfigurator"))
                                ? this
                                : ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        this,
                                                        RouteConfigurator.class,
                                                        "Symfony\\Component\\Routing\\Loader\\Configurator\\RouteConfigurator"))
                                        ? toObjectR(this)
                                                .accessProp(this, env)
                                                .name("parentConfigurator")
                                                .value()
                                        : ZVal.getNull());
        if (function_is_array.f.env(env).call(path).getBool()) {
            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.prefixes)) {
                paths.setObject(ZVal.assign(path));

            } else if (ZVal.isTrue(
                    missing =
                            function_array_diff_key.f.env(env).call(this.prefixes, path).value())) {
                throw ZVal.getException(
                        env,
                        new LogicException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Route \"%s\" is missing routes for locale(s) \"%s\".",
                                                name,
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
                for (ZPair zpairResult2390 : ZVal.getIterable(path, env, false)) {
                    locale = ZVal.assign(zpairResult2390.getKey());
                    localePath = ZVal.assign(zpairResult2390.getValue());
                    if (!arrayActionR(
                            ArrayAction.ISSET,
                            new ReferenceClassProperty(this, "prefixes", env),
                            env,
                            locale)) {
                        throw ZVal.getException(
                                env,
                                new LogicException(
                                        env,
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "Route \"%s\" with locale \"%s\" is missing a corresponding prefix in its parent collection.",
                                                        name, locale)
                                                .value()));
                    }

                    paths.arrayAccess(env, locale)
                            .set(
                                    toStringR(
                                                    new ReferenceClassProperty(
                                                                    this, "prefixes", env)
                                                            .arrayGet(env, locale),
                                                    env)
                                            + toStringR(localePath, env));
                }
            }

        } else if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.prefixes)) {
            for (ZPair zpairResult2391 : ZVal.getIterable(this.prefixes, env, false)) {
                locale = ZVal.assign(zpairResult2391.getKey());
                prefix = ZVal.assign(zpairResult2391.getValue());
                paths.arrayAccess(env, locale).set(toStringR(prefix, env) + toStringR(path, env));
            }

        } else {
            env.callMethod(
                    this.collection,
                    new RuntimeArgsWithReferences(),
                    "add",
                    RoutingConfigurator.class,
                    toStringR(this.name, env) + toStringR(name, env),
                    route = this.createRoute(env, path));
            return ZVal.assign(
                    new RouteConfigurator(
                            env,
                            this.collection,
                            route,
                            this.name,
                            parentConfigurator,
                            this.prefixes));
        }

        routes = new RouteCollection(env);
        for (ZPair zpairResult2392 : ZVal.getIterable(paths.getObject(), env, false)) {
            locale = ZVal.assign(zpairResult2392.getKey());
            path = ZVal.assign(zpairResult2392.getValue());
            env.callMethod(
                    routes,
                    new RuntimeArgsWithReferences(),
                    "add",
                    RoutingConfigurator.class,
                    toStringR(name, env) + "." + toStringR(locale, env),
                    route = this.createRoute(env, path));
            env.callMethod(
                    this.collection,
                    new RuntimeArgsWithReferences(),
                    "add",
                    RoutingConfigurator.class,
                    toStringR(this.name, env) + toStringR(name, env) + "." + toStringR(locale, env),
                    route);
            env.callMethod(route, "setDefault", RoutingConfigurator.class, "_locale", locale);
            env.callMethod(
                    route,
                    "setDefault",
                    RoutingConfigurator.class,
                    "_canonical_route",
                    toStringR(this.name, env) + toStringR(name, env));
        }

        return ZVal.assign(
                new RouteConfigurator(
                        env,
                        this.collection,
                        routes,
                        this.name,
                        parentConfigurator,
                        this.prefixes));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    @ConvertedParameter(index = 1, name = "path")
    public final Object __invoke(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, false);
        return ZVal.assign(this.add(env, name, path));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    private Object createRoute(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(new Route(env, path));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Routing\\Loader\\Configurator\\RoutingConfigurator";

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
                    .setName(
                            "Symfony\\Component\\Routing\\Loader\\Configurator\\RoutingConfigurator")
                    .setLookup(
                            RoutingConfigurator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("collection", "file", "loader", "name", "path", "prefixes")
                    .setFilename(
                            "vendor/symfony/routing/Loader/Configurator/RoutingConfigurator.php")
                    .addTrait("Symfony\\Component\\Routing\\Loader\\Configurator\\Traits\\AddTrait")
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
