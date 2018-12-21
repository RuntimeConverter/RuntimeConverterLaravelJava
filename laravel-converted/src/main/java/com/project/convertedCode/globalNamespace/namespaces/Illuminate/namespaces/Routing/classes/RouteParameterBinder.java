package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_flip;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_intersect_key;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Routing/RouteParameterBinder.php

*/

public class RouteParameterBinder extends RuntimeClassBase {

    public Object route = null;

    public RouteParameterBinder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RouteParameterBinder.class) {
            this.__construct(env, args);
        }
    }

    public RouteParameterBinder(NoConstructor n) {
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
    @ConvertedParameter(index = 0, name = "request")
    public Object parameters(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object parameters = null;
        parameters = this.bindPathParameters(env, request);
        if (!function_is_null
                .f
                .env(env)
                .call(
                        env.callMethod(
                                toObjectR(this.route)
                                        .accessProp(this, env)
                                        .name("compiled")
                                        .value(),
                                "getHostRegex",
                                RouteParameterBinder.class))
                .getBool()) {
            parameters = this.bindHostParameters(env, request, parameters);
        }

        return ZVal.assign(this.replaceDefaults(env, parameters));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    protected Object bindPathParameters(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object path = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        path =
                "/"
                        + toStringR(
                                function_ltrim
                                        .f
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        request,
                                                        "decodedPath",
                                                        RouteParameterBinder.class),
                                                "/")
                                        .value(),
                                env);
        function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call(
                        env.callMethod(
                                toObjectR(this.route)
                                        .accessProp(this, env)
                                        .name("compiled")
                                        .value(),
                                "getRegex",
                                RouteParameterBinder.class),
                        path,
                        matches.getObject());
        return ZVal.assign(
                this.matchToKeys(
                        env, function_array_slice.f.env(env).call(matches.getObject(), 1).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "parameters")
    protected Object bindHostParameters(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        ReferenceContainer matches = new BasicReferenceContainer(null);
        function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call(
                        env.callMethod(
                                toObjectR(this.route)
                                        .accessProp(this, env)
                                        .name("compiled")
                                        .value(),
                                "getHostRegex",
                                RouteParameterBinder.class),
                        env.callMethod(request, "getHost", RouteParameterBinder.class),
                        matches.getObject());
        return ZVal.assign(
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                this.matchToKeys(
                                        env,
                                        function_array_slice
                                                .f
                                                .env(env)
                                                .call(matches.getObject(), 1)
                                                .value()),
                                parameters)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "matches", typeHint = "array")
    protected Object matchToKeys(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Routing/RouteParameterBinder.php");
        Object matches = assignParameter(args, 0, false);
        Object parameterNames = null;
        Object parameters = null;
        if (ZVal.isEmpty(
                parameterNames =
                        env.callMethod(this.route, "parameterNames", RouteParameterBinder.class))) {
            return ZVal.assign(ZVal.newArray());
        }

        parameters =
                function_array_intersect_key
                        .f
                        .env(env)
                        .call(matches, function_array_flip.f.env(env).call(parameterNames).value())
                        .value();
        return ZVal.assign(
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                parameters,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Routing",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "value")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object value = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                ZVal.toBool(
                                                                function_is_string
                                                                        .f
                                                                        .env(env)
                                                                        .call(value)
                                                                        .value())
                                                        && ZVal.toBool(
                                                                ZVal.isGreaterThan(
                                                                        function_strlen
                                                                                .f
                                                                                .env(env)
                                                                                .call(value)
                                                                                .value(),
                                                                        '>',
                                                                        0)));
                                    }
                                })
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters", typeHint = "array")
    protected Object replaceDefaults(RuntimeEnv env, Object... args) {
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ternaryExpressionTemp = null;
        Object value = null;
        Object key = null;
        for (ZPair zpairResult528 : ZVal.getIterable(parameters.getObject(), env, false)) {
            key = ZVal.assign(zpairResult528.getKey());
            value = ZVal.assign(zpairResult528.getValue());
            parameters
                    .arrayAccess(env, key)
                    .set(
                            ZVal.isDefined(ternaryExpressionTemp = value)
                                    ? ternaryExpressionTemp
                                    : Arr.runtimeStaticObject.get(
                                            env,
                                            toObjectR(this.route)
                                                    .accessProp(this, env)
                                                    .name("defaults")
                                                    .value(),
                                            key));
        }

        for (ZPair zpairResult529 :
                ZVal.getIterable(
                        toObjectR(this.route).accessProp(this, env).name("defaults").value(),
                        env,
                        false)) {
            key = ZVal.assign(zpairResult529.getKey());
            value = ZVal.assign(zpairResult529.getValue());
            if (!arrayActionR(ArrayAction.ISSET, parameters, env, key)) {
                parameters.arrayAccess(env, key).set(value);
            }
        }

        return ZVal.assign(parameters.getObject());
    }

    public static final Object CONST_class = "Illuminate\\Routing\\RouteParameterBinder";

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
                    .setName("Illuminate\\Routing\\RouteParameterBinder")
                    .setLookup(
                            RouteParameterBinder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("route")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Routing/RouteParameterBinder.php")
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
