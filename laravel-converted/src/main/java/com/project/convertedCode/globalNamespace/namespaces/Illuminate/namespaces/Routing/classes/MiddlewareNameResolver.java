package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pad;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Routing/MiddlewareNameResolver.php

*/

public class MiddlewareNameResolver extends RuntimeClassBase {

    public MiddlewareNameResolver(RuntimeEnv env, Object... args) {
        super(env);
    }

    public MiddlewareNameResolver(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Illuminate\\Routing\\MiddlewareNameResolver";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        @ConvertedParameter(index = 1, name = "map")
        @ConvertedParameter(index = 2, name = "middlewareGroups")
        public Object resolve(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            ReferenceContainer map = new BasicReferenceContainer(assignParameter(args, 1, false));
            ReferenceContainer middlewareGroups =
                    new BasicReferenceContainer(assignParameter(args, 2, false));
            Object runtimeTempArrayResult73 = null;
            Object ternaryExpressionTemp = null;
            Object parameters = null;
            if (ZVal.isTrue(ZVal.checkInstanceType(name, Closure.class, "Closure"))) {
                return ZVal.assign(name);
            }

            if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, map, env, name))
                    && ZVal.toBool(
                            ZVal.checkInstanceType(
                                    map.arrayGet(env, name), Closure.class, "Closure"))) {
                return ZVal.assign(map.arrayGet(env, name));
            }

            if (arrayActionR(ArrayAction.ISSET, middlewareGroups, env, name)) {
                return ZVal.assign(
                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                        env, this, MiddlewareNameResolver.class)
                                .method("parseMiddlewareGroup")
                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                .call(name, map.getObject(), middlewareGroups.getObject())
                                .value());
            }

            ZVal.list(
                    runtimeTempArrayResult73 =
                            function_array_pad
                                    .f
                                    .env(env)
                                    .call(
                                            function_explode.f.env(env).call(":", name, 2).value(),
                                            2,
                                            ZVal.getNull())
                                    .value(),
                    (name = listGet(runtimeTempArrayResult73, 0, env)),
                    (parameters = listGet(runtimeTempArrayResult73, 1, env)));
            return ZVal.assign(
                    toStringR(
                                    ZVal.isDefined(ternaryExpressionTemp = map.arrayGet(env, name))
                                            ? ternaryExpressionTemp
                                            : name,
                                    env)
                            + toStringR(
                                    !function_is_null.f.env(env).call(parameters).getBool()
                                            ? ":" + toStringR(parameters, env)
                                            : "",
                                    env));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        @ConvertedParameter(index = 1, name = "map")
        @ConvertedParameter(index = 2, name = "middlewareGroups")
        protected Object parseMiddlewareGroup(RuntimeEnv env, Object... args) {
            int runtimeConverterContinueCount;
            Object name = assignParameter(args, 0, false);
            ReferenceContainer map = new BasicReferenceContainer(assignParameter(args, 1, false));
            ReferenceContainer middlewareGroups =
                    new BasicReferenceContainer(assignParameter(args, 2, false));
            Object runtimeTempArrayResult74 = null;
            ReferenceContainer results = new BasicReferenceContainer(null);
            Object parameters = null;
            Object middleware = null;
            results.setObject(ZVal.newArray());
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult517 :
                    ZVal.getIterable(middlewareGroups.arrayGet(env, name), env, true)) {
                middleware = ZVal.assign(zpairResult517.getValue());
                if (arrayActionR(ArrayAction.ISSET, middlewareGroups, env, middleware)) {
                    results.setObject(
                            function_array_merge
                                    .f
                                    .env(env)
                                    .call(
                                            results.getObject(),
                                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                                            env, this, MiddlewareNameResolver.class)
                                                    .method("parseMiddlewareGroup")
                                                    .addReferenceArgs(
                                                            new RuntimeArgsWithReferences())
                                                    .call(
                                                            middleware,
                                                            map.getObject(),
                                                            middlewareGroups.getObject())
                                                    .value())
                                    .value());
                    continue;
                }

                ZVal.list(
                        runtimeTempArrayResult74 =
                                function_array_pad
                                        .f
                                        .env(env)
                                        .call(
                                                function_explode
                                                        .f
                                                        .env(env)
                                                        .call(":", middleware, 2)
                                                        .value(),
                                                2,
                                                ZVal.getNull())
                                        .value(),
                        (middleware = listGet(runtimeTempArrayResult74, 0, env)),
                        (parameters = listGet(runtimeTempArrayResult74, 1, env)));
                if (arrayActionR(ArrayAction.ISSET, map, env, middleware)) {
                    middleware = ZVal.assign(map.arrayGet(env, middleware));
                }

                results.arrayAppend(env)
                        .set(
                                toStringR(middleware, env)
                                        + toStringR(
                                                ZVal.isTrue(parameters)
                                                        ? ":" + toStringR(parameters, env)
                                                        : "",
                                                env));
            }

            return ZVal.assign(results.getObject());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Routing\\MiddlewareNameResolver")
                    .setLookup(
                            MiddlewareNameResolver.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Routing/MiddlewareNameResolver.php")
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
