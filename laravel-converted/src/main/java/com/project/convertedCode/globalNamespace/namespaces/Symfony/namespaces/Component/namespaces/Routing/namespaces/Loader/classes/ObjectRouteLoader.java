package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Loader.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_file;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes.RouteCollection;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/routing/Loader/ObjectRouteLoader.php

*/

public abstract class ObjectRouteLoader extends RuntimeClassBase {

    public ObjectRouteLoader(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ObjectRouteLoader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    @ConvertedParameter(
        index = 1,
        name = "type",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object load(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = ZVal.getNull();
        }
        Object method = null;
        Object routeCollection = null;
        ReferenceContainer parts = new BasicReferenceContainer(null);
        Object serviceString = null;
        Object loaderObject = null;
        if (ZVal.strictEqualityCheck(
                1, "===", NamespaceGlobal.substr_count.env(env).call(resource, ":").value())) {
            resource = function_str_replace.f.env(env).call(":", "::", resource).value();
            NamespaceGlobal.trigger_error
                    .env(env)
                    .call(
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Referencing service route loaders with a single colon is deprecated since Symfony 4.1. Use %s instead.",
                                            resource)
                                    .value(),
                            16384)
                    .value();
        }

        parts.setObject(function_explode.f.env(env).call("::", resource).value());
        if (ZVal.notEqualityCheck(2, function_count.f.env(env).call(parts.getObject()).value())) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Invalid resource \"%s\" passed to the \"service\" route loader: use the format \"service::method\"",
                                            resource)
                                    .value()));
        }

        serviceString = ZVal.assign(parts.arrayGet(env, 0));
        method = ZVal.assign(parts.arrayGet(env, 1));
        loaderObject =
                env.callMethod(this, "getServiceObject", ObjectRouteLoader.class, serviceString);
        if (!function_is_object.f.env(env).call(loaderObject).getBool()) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "%s:getServiceObject() must return an object: %s returned",
                                            function_get_class.f.env(env).call(this).value(),
                                            NamespaceGlobal.gettype
                                                    .env(env)
                                                    .call(loaderObject)
                                                    .value())
                                    .value()));
        }

        if (!function_is_callable
                .f
                .env(env)
                .call(ZVal.newArray(new ZPair(0, loaderObject), new ZPair(1, method)))
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new BadMethodCallException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Method \"%s\" not found on \"%s\" when importing routing resource \"%s\"",
                                            method,
                                            function_get_class
                                                    .f
                                                    .env(env)
                                                    .call(loaderObject)
                                                    .value(),
                                            resource)
                                    .value()));
        }

        routeCollection =
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(ZVal.newArray(new ZPair(0, loaderObject), new ZPair(1, method)), this)
                        .value();
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        routeCollection,
                        RouteCollection.class,
                        "Symfony\\Component\\Routing\\RouteCollection"))) {
            type =
                    ZVal.assign(
                            function_is_object.f.env(env).call(routeCollection).getBool()
                                    ? function_get_class.f.env(env).call(routeCollection).value()
                                    : NamespaceGlobal.gettype
                                            .env(env)
                                            .call(routeCollection)
                                            .value());
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "The %s::%s method must return a RouteCollection: %s returned",
                                            function_get_class
                                                    .f
                                                    .env(env)
                                                    .call(loaderObject)
                                                    .value(),
                                            method,
                                            type)
                                    .value()));
        }

        this.addClassResource(env, new ReflectionClass(env, loaderObject), routeCollection);
        return ZVal.assign(routeCollection);
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
        return ZVal.assign(ZVal.strictEqualityCheck("service", "===", type));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class", typeHint = "ReflectionClass")
    @ConvertedParameter(
        index = 1,
        name = "collection",
        typeHint = "Symfony\\Component\\Routing\\RouteCollection"
    )
    private Object addClassResource(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object collection = assignParameter(args, 1, false);
        do {
            if (function_is_file
                    .f
                    .env(env)
                    .call(env.callMethod(_pClass, "getFileName", ObjectRouteLoader.class))
                    .getBool()) {
                env.callMethod(
                        collection,
                        "addResource",
                        ObjectRouteLoader.class,
                        env.createNew(
                                ZVal.resolveClassAlias(env, "FileResource"),
                                env.callMethod(_pClass, "getFileName", ObjectRouteLoader.class)));
            }

        } while (ZVal.isTrue(
                _pClass = env.callMethod(_pClass, "getParentClass", ObjectRouteLoader.class)));

        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Routing\\Loader\\ObjectRouteLoader";

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
                    .setName("Symfony\\Component\\Routing\\Loader\\ObjectRouteLoader")
                    .setLookup(
                            ObjectRouteLoader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/routing/Loader/ObjectRouteLoader.php")
                    .addExtendsClass("Symfony\\Component\\Config\\Loader\\Loader")
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
