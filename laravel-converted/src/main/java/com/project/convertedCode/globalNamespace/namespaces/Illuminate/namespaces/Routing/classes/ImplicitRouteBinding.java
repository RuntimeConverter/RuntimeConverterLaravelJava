package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.ModelNotFoundException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Routing.classes.UrlRoutable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Routing/ImplicitRouteBinding.php

*/

public class ImplicitRouteBinding extends RuntimeClassBase {

    public ImplicitRouteBinding(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ImplicitRouteBinding(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Illuminate\\Routing\\ImplicitRouteBinding";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "container")
        @ConvertedParameter(index = 1, name = "route")
        public Object resolveForRoute(RuntimeEnv env, Object... args) {
            int runtimeConverterContinueCount;
            Object container = assignParameter(args, 0, false);
            Object route = assignParameter(args, 1, false);
            Object instance = null;
            Object parameter = null;
            Object model = null;
            Object parameterName = null;
            ReferenceContainer parameters = new BasicReferenceContainer(null);
            Object parameterValue = null;
            parameters.setObject(env.callMethod(route, "parameters", ImplicitRouteBinding.class));
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult516 :
                    ZVal.getIterable(
                            env.callMethod(
                                    route,
                                    "signatureParameters",
                                    ImplicitRouteBinding.class,
                                    UrlRoutable.CONST_class),
                            env,
                            true)) {
                parameter = ZVal.assign(zpairResult516.getValue());
                if (!ZVal.isTrue(
                        parameterName =
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, ImplicitRouteBinding.class)
                                        .method("getParameterName")
                                        .addReferenceArgs(new RuntimeArgsWithReferences())
                                        .call(
                                                toObjectR(parameter)
                                                        .accessProp(this, env)
                                                        .name("name")
                                                        .value(),
                                                parameters.getObject())
                                        .value())) {
                    continue;
                }

                parameterValue = ZVal.assign(parameters.arrayGet(env, parameterName));
                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                parameterValue,
                                UrlRoutable.class,
                                "Illuminate\\Contracts\\Routing\\UrlRoutable"))) {
                    continue;
                }

                instance =
                        env.callMethod(
                                container,
                                "make",
                                ImplicitRouteBinding.class,
                                toObjectR(
                                                env.callMethod(
                                                        parameter,
                                                        "getClass",
                                                        ImplicitRouteBinding.class))
                                        .accessProp(this, env)
                                        .name("name")
                                        .value());
                if (!ZVal.isTrue(
                        model =
                                env.callMethod(
                                        instance,
                                        "resolveRouteBinding",
                                        ImplicitRouteBinding.class,
                                        parameterValue))) {
                    throw ZVal.getException(
                            env,
                            env.callMethod(
                                    new ModelNotFoundException(env),
                                    "setModel",
                                    ImplicitRouteBinding.class,
                                    function_get_class.f.env(env).call(instance).value()));
                }

                env.callMethod(
                        route, "setParameter", ImplicitRouteBinding.class, parameterName, model);
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        @ConvertedParameter(index = 1, name = "parameters")
        protected Object getParameterName(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            Object parameters = assignParameter(args, 1, false);
            Object snakedName = null;
            if (function_array_key_exists.f.env(env).call(name, parameters).getBool()) {
                return ZVal.assign(name);
            }

            if (function_array_key_exists
                    .f
                    .env(env)
                    .call(snakedName = Str.runtimeStaticObject.snake(env, name), parameters)
                    .getBool()) {
                return ZVal.assign(snakedName);
            }

            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Routing\\ImplicitRouteBinding")
                    .setLookup(
                            ImplicitRouteBinding.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Routing/ImplicitRouteBinding.php")
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
