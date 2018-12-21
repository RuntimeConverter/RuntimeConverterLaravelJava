package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match_all;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes.Route;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Routing/RouteCompiler.php

*/

public class RouteCompiler extends RuntimeClassBase {

    public Object route = null;

    public RouteCompiler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RouteCompiler.class) {
            this.__construct(env, args);
        }
    }

    public RouteCompiler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "route")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object route = assignParameter(args, 0, false);
        this.route = route;
        return null;
    }

    @ConvertedMethod
    public Object compile(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        Object optionals = null;
        Object uri = null;
        optionals = this.getOptionalParameters(env);
        uri =
                function_preg_replace
                        .f
                        .env(env)
                        .call(
                                "/\\{(\\w+?)\\?\\}/",
                                "{$1}",
                                env.callMethod(this.route, "uri", RouteCompiler.class))
                        .value();
        return ZVal.assign(
                env.callMethod(
                        new Route(
                                env,
                                uri,
                                optionals,
                                toObjectR(this.route).accessProp(this, env).name("wheres").value(),
                                ZVal.newArray(new ZPair("utf8", true)),
                                ZVal.isTrue(
                                                ternaryExpressionTemp =
                                                        env.callMethod(
                                                                this.route,
                                                                "getDomain",
                                                                RouteCompiler.class))
                                        ? ternaryExpressionTemp
                                        : ""),
                        "compile",
                        RouteCompiler.class));
    }

    @ConvertedMethod
    protected Object getOptionalParameters(RuntimeEnv env, Object... args) {
        ReferenceContainer matches = new BasicReferenceContainer(null);
        function_preg_match_all
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call(
                        "/\\{(\\w+?)\\?\\}/",
                        env.callMethod(this.route, "uri", RouteCompiler.class),
                        matches.getObject());
        return ZVal.assign(
                arrayActionR(ArrayAction.ISSET, matches, env, 1)
                        ? NamespaceGlobal.array_fill_keys
                                .env(env)
                                .call(matches.arrayGet(env, 1), ZVal.getNull())
                                .value()
                        : ZVal.newArray());
    }

    public static final Object CONST_class = "Illuminate\\Routing\\RouteCompiler";

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
                    .setName("Illuminate\\Routing\\RouteCompiler")
                    .setLookup(
                            RouteCompiler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("route")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Routing/RouteCompiler.php")
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
