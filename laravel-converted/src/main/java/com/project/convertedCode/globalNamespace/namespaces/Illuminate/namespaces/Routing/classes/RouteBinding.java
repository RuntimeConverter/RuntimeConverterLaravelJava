package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.ModelNotFoundException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Routing/RouteBinding.php

*/

public class RouteBinding extends RuntimeClassBase {

    public RouteBinding(RuntimeEnv env, Object... args) {
        super(env);
    }

    public RouteBinding(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Illuminate\\Routing\\RouteBinding";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "container")
        @ConvertedParameter(index = 1, name = "binder")
        public Object forCallback(RuntimeEnv env, Object... args) {
            Object container = assignParameter(args, 0, false);
            Object binder = assignParameter(args, 1, false);
            if (function_is_string.f.env(env).call(binder).getBool()) {
                return ZVal.assign(
                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                        env, this, RouteBinding.class)
                                .method("createClassBinding")
                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                .call(container, binder)
                                .value());
            }

            return ZVal.assign(binder);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "container")
        @ConvertedParameter(index = 1, name = "binding")
        protected Object createClassBinding(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Routing/RouteBinding.php");
            Object container = assignParameter(args, 0, false);
            Object binding = assignParameter(args, 1, false);
            return ZVal.assign(
                    new Closure(
                            env,
                            runtimeConverterFunctionClassConstants,
                            "Illuminate\\Routing",
                            this) {
                        @Override
                        @ConvertedMethod
                        @ConvertedParameter(index = 0, name = "value")
                        @ConvertedParameter(index = 1, name = "route")
                        public Object run(
                                RuntimeEnv env,
                                Object thisvar,
                                PassByReferenceArgs runtimePassByReferenceArgs,
                                Object... args) {
                            Object value = assignParameter(args, 0, false);
                            Object route = assignParameter(args, 1, false);
                            Object container = null;
                            Object callable = null;
                            Object method = null;
                            Object binding = null;
                            Object _pClass = null;
                            Object runtimeTempArrayResult77 = null;
                            container = this.contextReferences.getCapturedValue("container");
                            binding = this.contextReferences.getCapturedValue("binding");
                            ZVal.list(
                                    runtimeTempArrayResult77 =
                                            Str.runtimeStaticObject.parseCallback(
                                                    env, binding, "bind"),
                                    (_pClass = listGet(runtimeTempArrayResult77, 0, env)),
                                    (method = listGet(runtimeTempArrayResult77, 1, env)));
                            callable =
                                    ZVal.newArray(
                                            new ZPair(
                                                    0,
                                                    env.callMethod(
                                                            container,
                                                            "make",
                                                            RouteBinding.class,
                                                            _pClass)),
                                            new ZPair(1, method));
                            return ZVal.assign(
                                    function_call_user_func
                                            .f
                                            .env(env)
                                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                            .call(callable, value, route)
                                            .value());
                        }
                    }.use("container", container).use("binding", binding));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "container")
        @ConvertedParameter(index = 1, name = "class")
        @ConvertedParameter(
            index = 2,
            name = "callback",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object forModel(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Routing/RouteBinding.php");
            Object container = assignParameter(args, 0, false);
            Object _pClass = assignParameter(args, 1, false);
            Object callback = assignParameter(args, 2, true);
            if (null == callback) {
                callback = ZVal.getNull();
            }
            return ZVal.assign(
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
                            Object container = null;
                            Object instance = null;
                            Object callback = null;
                            Object model = null;
                            Object _pClass = null;
                            container = this.contextReferences.getCapturedValue("container");
                            callback = this.contextReferences.getCapturedValue("callback");
                            _pClass = this.contextReferences.getCapturedValue("class");
                            if (function_is_null.f.env(env).call(value).getBool()) {
                                return null;
                            }

                            instance =
                                    env.callMethod(container, "make", RouteBinding.class, _pClass);
                            if (ZVal.isTrue(
                                    model =
                                            env.callMethod(
                                                    instance,
                                                    "resolveRouteBinding",
                                                    RouteBinding.class,
                                                    value))) {
                                return ZVal.assign(model);
                            }

                            if (ZVal.isTrue(
                                    ZVal.checkInstanceType(callback, Closure.class, "Closure"))) {
                                return ZVal.assign(
                                        function_call_user_func
                                                .f
                                                .env(env)
                                                .addReferenceArgs(
                                                        new RuntimeArgsWithInfo(args, this))
                                                .call(callback, value)
                                                .value());
                            }

                            throw ZVal.getException(
                                    env,
                                    env.callMethod(
                                            new ModelNotFoundException(env),
                                            "setModel",
                                            RouteBinding.class,
                                            _pClass));
                        }
                    }.use("container", container).use("callback", callback).use("class", _pClass));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Routing\\RouteBinding")
                    .setLookup(
                            RouteBinding.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/laravel/framework/src/Illuminate/Routing/RouteBinding.php")
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
