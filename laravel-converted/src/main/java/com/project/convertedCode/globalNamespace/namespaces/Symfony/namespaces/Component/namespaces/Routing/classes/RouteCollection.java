package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes;

import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.IteratorAggregate;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.ArrayIterator;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/routing/RouteCollection.php

*/

public class RouteCollection extends RuntimeClassBase implements IteratorAggregate, Countable {

    public Object routes = ZVal.newArray();

    public Object resources = ZVal.newArray();

    public RouteCollection(RuntimeEnv env, Object... args) {
        super(env);
    }

    public RouteCollection(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __clone(RuntimeEnv env, Object... args) {
        Object route = null;
        Object name = null;
        for (ZPair zpairResult2075 : ZVal.getIterable(this.routes, env, false)) {
            name = ZVal.assign(zpairResult2075.getKey());
            route = ZVal.assign(zpairResult2075.getValue());
            new ReferenceClassProperty(this, "routes", env)
                    .arrayAccess(env, name)
                    .set(((RuntimeClassInterface) route).phpClone(env));
        }

        return null;
    }

    @ConvertedMethod
    public Object getIterator(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ArrayIterator(env, this.routes));
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_count.f.env(env).call(this.routes).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "route", typeHint = "Symfony\\Component\\Routing\\Route")
    public Object add(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object route = assignParameter(args, 1, false);
        arrayActionR(ArrayAction.UNSET, new ReferenceClassProperty(this, "routes", env), env, name);
        new ReferenceClassProperty(this, "routes", env).arrayAccess(env, name).set(route);
        return null;
    }

    @ConvertedMethod
    public Object all(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.routes);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object get(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "routes", env),
                                env,
                                name)
                        ? new ReferenceClassProperty(this, "routes", env).arrayGet(env, name)
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object remove(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object n = null;
        for (ZPair zpairResult2076 : ZVal.getIterable(rToArrayCast(name), env, true)) {
            n = ZVal.assign(zpairResult2076.getValue());
            arrayActionR(
                    ArrayAction.UNSET, new ReferenceClassProperty(this, "routes", env), env, n);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "collection", typeHint = "self")
    public Object addCollection(RuntimeEnv env, Object... args) {
        Object collection = assignParameter(args, 0, false);
        Object route = null;
        Object resource = null;
        Object name = null;
        for (ZPair zpairResult2077 :
                ZVal.getIterable(
                        env.callMethod(collection, "all", RouteCollection.class), env, false)) {
            name = ZVal.assign(zpairResult2077.getKey());
            route = ZVal.assign(zpairResult2077.getValue());
            arrayActionR(
                    ArrayAction.UNSET, new ReferenceClassProperty(this, "routes", env), env, name);
            new ReferenceClassProperty(this, "routes", env).arrayAccess(env, name).set(route);
        }

        for (ZPair zpairResult2078 :
                ZVal.getIterable(
                        env.callMethod(collection, "getResources", RouteCollection.class),
                        env,
                        true)) {
            resource = ZVal.assign(zpairResult2078.getValue());
            this.addResource(env, resource);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prefix")
    @ConvertedParameter(
        index = 1,
        name = "defaults",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "requirements",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object addPrefix(RuntimeEnv env, Object... args) {
        Object prefix = assignParameter(args, 0, false);
        Object defaults = assignParameter(args, 1, true);
        if (null == defaults) {
            defaults = ZVal.newArray();
        }
        Object requirements = assignParameter(args, 2, true);
        if (null == requirements) {
            requirements = ZVal.newArray();
        }
        Object route = null;
        prefix =
                function_trim
                        .f
                        .env(env)
                        .call(function_trim.f.env(env).call(prefix).value(), "/")
                        .value();
        if (ZVal.strictEqualityCheck("", "===", prefix)) {
            return null;
        }

        for (ZPair zpairResult2079 : ZVal.getIterable(this.routes, env, true)) {
            route = ZVal.assign(zpairResult2079.getValue());
            env.callMethod(
                    route,
                    "setPath",
                    RouteCollection.class,
                    "/"
                            + toStringR(prefix, env)
                            + toStringR(
                                    env.callMethod(route, "getPath", RouteCollection.class), env));
            env.callMethod(route, "addDefaults", RouteCollection.class, defaults);
            env.callMethod(route, "addRequirements", RouteCollection.class, requirements);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prefix", typeHint = "string")
    public Object addNamePrefix(RuntimeEnv env, Object... args) {
        Object prefix = assignParameter(args, 0, false);
        Object route = null;
        Object name = null;
        ReferenceContainer prefixedRoutes = new BasicReferenceContainer(null);
        prefixedRoutes.setObject(ZVal.newArray());
        for (ZPair zpairResult2080 : ZVal.getIterable(this.routes, env, false)) {
            name = ZVal.assign(zpairResult2080.getKey());
            route = ZVal.assign(zpairResult2080.getValue());
            prefixedRoutes
                    .arrayAccess(env, toStringR(prefix, env) + toStringR(name, env))
                    .set(route);
            if (ZVal.strictNotEqualityCheck(
                    ZVal.getNull(),
                    "!==",
                    name =
                            env.callMethod(
                                    route,
                                    "getDefault",
                                    RouteCollection.class,
                                    "_canonical_route"))) {
                env.callMethod(
                        route,
                        "setDefault",
                        RouteCollection.class,
                        "_canonical_route",
                        toStringR(prefix, env) + toStringR(name, env));
            }
        }

        this.routes = prefixedRoutes.getObject();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pattern")
    @ConvertedParameter(
        index = 1,
        name = "defaults",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "requirements",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object setHost(RuntimeEnv env, Object... args) {
        Object pattern = assignParameter(args, 0, false);
        Object defaults = assignParameter(args, 1, true);
        if (null == defaults) {
            defaults = ZVal.newArray();
        }
        Object requirements = assignParameter(args, 2, true);
        if (null == requirements) {
            requirements = ZVal.newArray();
        }
        Object route = null;
        for (ZPair zpairResult2081 : ZVal.getIterable(this.routes, env, true)) {
            route = ZVal.assign(zpairResult2081.getValue());
            env.callMethod(route, "setHost", RouteCollection.class, pattern);
            env.callMethod(route, "addDefaults", RouteCollection.class, defaults);
            env.callMethod(route, "addRequirements", RouteCollection.class, requirements);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "condition")
    public Object setCondition(RuntimeEnv env, Object... args) {
        Object condition = assignParameter(args, 0, false);
        Object route = null;
        for (ZPair zpairResult2082 : ZVal.getIterable(this.routes, env, true)) {
            route = ZVal.assign(zpairResult2082.getValue());
            env.callMethod(route, "setCondition", RouteCollection.class, condition);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "defaults", typeHint = "array")
    public Object addDefaults(RuntimeEnv env, Object... args) {
        Object defaults = assignParameter(args, 0, false);
        Object route = null;
        if (ZVal.isTrue(defaults)) {
            for (ZPair zpairResult2083 : ZVal.getIterable(this.routes, env, true)) {
                route = ZVal.assign(zpairResult2083.getValue());
                env.callMethod(route, "addDefaults", RouteCollection.class, defaults);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "requirements", typeHint = "array")
    public Object addRequirements(RuntimeEnv env, Object... args) {
        Object requirements = assignParameter(args, 0, false);
        Object route = null;
        if (ZVal.isTrue(requirements)) {
            for (ZPair zpairResult2084 : ZVal.getIterable(this.routes, env, true)) {
                route = ZVal.assign(zpairResult2084.getValue());
                env.callMethod(route, "addRequirements", RouteCollection.class, requirements);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options", typeHint = "array")
    public Object addOptions(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, false);
        Object route = null;
        if (ZVal.isTrue(options)) {
            for (ZPair zpairResult2085 : ZVal.getIterable(this.routes, env, true)) {
                route = ZVal.assign(zpairResult2085.getValue());
                env.callMethod(route, "addOptions", RouteCollection.class, options);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "schemes")
    public Object setSchemes(RuntimeEnv env, Object... args) {
        Object schemes = assignParameter(args, 0, false);
        Object route = null;
        for (ZPair zpairResult2086 : ZVal.getIterable(this.routes, env, true)) {
            route = ZVal.assign(zpairResult2086.getValue());
            env.callMethod(route, "setSchemes", RouteCollection.class, schemes);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methods")
    public Object setMethods(RuntimeEnv env, Object... args) {
        Object methods = assignParameter(args, 0, false);
        Object route = null;
        for (ZPair zpairResult2087 : ZVal.getIterable(this.routes, env, true)) {
            route = ZVal.assign(zpairResult2087.getValue());
            env.callMethod(route, "setMethods", RouteCollection.class, methods);
        }

        return null;
    }

    @ConvertedMethod
    public Object getResources(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_array_values.f.env(env).call(this.resources).value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "resource",
        typeHint = "Symfony\\Component\\Config\\Resource\\ResourceInterface"
    )
    public Object addResource(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        Object key = null;
        key = ZVal.assign(toStringR(resource, env));
        if (!arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "resources", env), env, key)) {
            new ReferenceClassProperty(this, "resources", env).arrayAccess(env, key).set(resource);
        }

        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\Routing\\RouteCollection";

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
                    .setName("Symfony\\Component\\Routing\\RouteCollection")
                    .setLookup(
                            RouteCollection.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("resources", "routes")
                    .setFilename("vendor/symfony/routing/RouteCollection.php")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
                    .addInterface("Countable")
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
