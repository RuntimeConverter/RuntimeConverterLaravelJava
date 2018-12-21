package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Loader.namespaces.Configurator.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes.Route;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/routing/Loader/Configurator/ImportConfigurator.php

*/

public class ImportConfigurator extends RuntimeClassBase {

    public Object parent = null;

    public Object route = null;

    public ImportConfigurator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ImportConfigurator.class) {
            this.__construct(env, args);
        }
    }

    public ImportConfigurator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "parent",
        typeHint = "Symfony\\Component\\Routing\\RouteCollection"
    )
    @ConvertedParameter(
        index = 1,
        name = "route",
        typeHint = "Symfony\\Component\\Routing\\RouteCollection"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object parent = assignParameter(args, 0, false);
        Object route = assignParameter(args, 1, false);
        this.parent = parent;
        this.route = route;
        return null;
    }

    @ConvertedMethod
    public Object __destruct(RuntimeEnv env, Object... args) {
        env.callMethod(this.parent, "addCollection", ImportConfigurator.class, this.route);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prefix")
    @ConvertedParameter(
        index = 1,
        name = "trailingSlashOnRoot",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public final Object prefix(RuntimeEnv env, Object... args) {
        ReferenceContainer prefix = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object trailingSlashOnRoot = assignParameter(args, 1, true);
        if (null == trailingSlashOnRoot) {
            trailingSlashOnRoot = true;
        }
        Object localePrefix = null;
        Object route = null;
        Object localizedRoute = null;
        ReferenceContainer name = new BasicReferenceContainer(null);
        Object rootPath = null;
        Object locale = null;
        if (!function_is_array.f.env(env).call(prefix.getObject()).getBool()) {
            env.callMethod(this.route, "addPrefix", ImportConfigurator.class, prefix.getObject());
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
                                ImportConfigurator.class);
                for (ZPair zpairResult2025 :
                        ZVal.getIterable(
                                env.callMethod(this.route, "all", ImportConfigurator.class),
                                env,
                                true)) {
                    route = ZVal.assign(zpairResult2025.getValue());
                    if (ZVal.strictEqualityCheck(
                            env.callMethod(route, "getPath", ImportConfigurator.class),
                            "===",
                            rootPath)) {
                        env.callMethod(
                                route,
                                "setPath",
                                ImportConfigurator.class,
                                function_rtrim.f.env(env).call(rootPath, "/").value());
                    }
                }
            }

        } else {
            for (ZPair zpairResult2026 : ZVal.getIterable(prefix.getObject(), env, false)) {
                locale = ZVal.assign(zpairResult2026.getKey());
                localePrefix = ZVal.assign(zpairResult2026.getValue());
                prefix.arrayAccess(env, locale)
                        .set(
                                function_trim
                                        .f
                                        .env(env)
                                        .call(
                                                function_trim.f.env(env).call(localePrefix).value(),
                                                "/")
                                        .value());
            }

            for (ZPair zpairResult2027 :
                    ZVal.getIterable(
                            env.callMethod(this.route, "all", ImportConfigurator.class),
                            env,
                            false)) {
                name.setObject(ZVal.assign(zpairResult2027.getKey()));
                route = ZVal.assign(zpairResult2027.getValue());
                if (ZVal.strictEqualityCheck(
                        ZVal.getNull(),
                        "===",
                        locale =
                                env.callMethod(
                                        route,
                                        "getDefault",
                                        ImportConfigurator.class,
                                        "_locale"))) {
                    env.callMethod(
                            this.route, "remove", ImportConfigurator.class, name.getObject());
                    for (ZPair zpairResult2028 : ZVal.getIterable(prefix.getObject(), env, false)) {
                        locale = ZVal.assign(zpairResult2028.getKey());
                        localePrefix = ZVal.assign(zpairResult2028.getValue());
                        localizedRoute = ZVal.assign(((RuntimeClassInterface) route).phpClone(env));
                        env.callMethod(
                                localizedRoute,
                                "setDefault",
                                ImportConfigurator.class,
                                "_locale",
                                locale);
                        env.callMethod(
                                localizedRoute,
                                "setDefault",
                                ImportConfigurator.class,
                                "_canonical_route",
                                name.getObject());
                        env.callMethod(
                                localizedRoute,
                                "setPath",
                                ImportConfigurator.class,
                                toStringR(localePrefix, env)
                                        + toStringR(
                                                ZVal.toBool(!ZVal.isTrue(trailingSlashOnRoot))
                                                                && ZVal.toBool(
                                                                        ZVal.strictEqualityCheck(
                                                                                "/",
                                                                                "===",
                                                                                env.callMethod(
                                                                                        route,
                                                                                        "getPath",
                                                                                        ImportConfigurator
                                                                                                .class)))
                                                        ? ""
                                                        : env.callMethod(
                                                                route,
                                                                "getPath",
                                                                ImportConfigurator.class),
                                                env));
                        env.callMethod(
                                this.route,
                                new RuntimeArgsWithReferences(),
                                "add",
                                ImportConfigurator.class,
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
                                                    "Route \"%s\" with locale \"%s\" is missing a corresponding prefix in its parent collection.",
                                                    name.getObject(), locale)
                                            .value()));

                } else {
                    env.callMethod(
                            route,
                            "setPath",
                            ImportConfigurator.class,
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
                                                                                    ImportConfigurator
                                                                                            .class)))
                                                    ? ""
                                                    : env.callMethod(
                                                            route,
                                                            "getPath",
                                                            ImportConfigurator.class),
                                            env));
                    env.callMethod(
                            this.route,
                            new RuntimeArgsWithReferences().add(0, name),
                            "add",
                            ImportConfigurator.class,
                            name.getObject(),
                            route);
                }
            }
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "namePrefix", typeHint = "string")
    public final Object namePrefix(RuntimeEnv env, Object... args) {
        Object namePrefix = assignParameter(args, 0, false);
        env.callMethod(this.route, "addNamePrefix", ImportConfigurator.class, namePrefix);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "defaults", typeHint = "array")
    public final Object defaults(RuntimeEnv env, Object... args) {
        Object defaults = assignParameter(args, 0, false);
        env.callMethod(this.route, "addDefaults", ImportConfigurator.class, defaults);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "requirements", typeHint = "array")
    public final Object requirements(RuntimeEnv env, Object... args) {
        Object requirements = assignParameter(args, 0, false);
        env.callMethod(this.route, "addRequirements", ImportConfigurator.class, requirements);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options", typeHint = "array")
    public final Object options(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, false);
        env.callMethod(this.route, "addOptions", ImportConfigurator.class, options);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "condition", typeHint = "string")
    public final Object condition(RuntimeEnv env, Object... args) {
        Object condition = assignParameter(args, 0, false);
        env.callMethod(this.route, "setCondition", ImportConfigurator.class, condition);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pattern", typeHint = "string")
    public final Object host(RuntimeEnv env, Object... args) {
        Object pattern = assignParameter(args, 0, false);
        env.callMethod(this.route, "setHost", ImportConfigurator.class, pattern);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "schemes", typeHint = "array")
    public final Object schemes(RuntimeEnv env, Object... args) {
        Object schemes = assignParameter(args, 0, false);
        env.callMethod(this.route, "setSchemes", ImportConfigurator.class, schemes);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methods", typeHint = "array")
    public final Object methods(RuntimeEnv env, Object... args) {
        Object methods = assignParameter(args, 0, false);
        env.callMethod(this.route, "setMethods", ImportConfigurator.class, methods);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "controller")
    public final Object controller(RuntimeEnv env, Object... args) {
        Object controller = assignParameter(args, 0, false);
        env.callMethod(
                this.route,
                "addDefaults",
                ImportConfigurator.class,
                ZVal.newArray(new ZPair("_controller", controller)));
        return ZVal.assign(this);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Routing\\Loader\\Configurator\\ImportConfigurator";

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
                            "Symfony\\Component\\Routing\\Loader\\Configurator\\ImportConfigurator")
                    .setLookup(
                            ImportConfigurator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("parent", "route")
                    .setFilename(
                            "vendor/symfony/routing/Loader/Configurator/ImportConfigurator.php")
                    .addTrait(
                            "Symfony\\Component\\Routing\\Loader\\Configurator\\Traits\\RouteTrait")
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
