package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_splice;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Routing/ControllerDispatcher.php

*/

public class ControllerDispatcher extends RuntimeClassBase
        implements com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Routing
                .namespaces
                .Contracts
                .classes
                .ControllerDispatcher {

    public Object container = null;

    public ControllerDispatcher(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ControllerDispatcher.class) {
            this.__construct(env, args);
        }
    }

    public ControllerDispatcher(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Illuminate\\Container\\Container"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        this.container = container;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "route", typeHint = "Illuminate\\Routing\\Route")
    @ConvertedParameter(index = 1, name = "controller")
    @ConvertedParameter(index = 2, name = "method")
    public Object dispatch(RuntimeEnv env, Object... args) {
        Object route = assignParameter(args, 0, false);
        Object controller = assignParameter(args, 1, false);
        Object method = assignParameter(args, 2, false);
        Object parameters = null;
        parameters =
                this.resolveClassMethodDependencies(
                        env,
                        env.callMethod(route, "parametersWithoutNulls", ControllerDispatcher.class),
                        controller,
                        method);
        if (function_method_exists.f.env(env).call(controller, "callAction").getBool()) {
            return ZVal.assign(
                    env.callMethod(
                            controller,
                            "callAction",
                            ControllerDispatcher.class,
                            method,
                            parameters));
        }

        return ZVal.assign(
                env.callMethod(
                        controller,
                        new RuntimeArgsWithReferences(),
                        toStringR(method, env),
                        ControllerDispatcher.class,
                        PackedVaradicArgs.unpack(
                                new PackedVaradicArgs(
                                        function_array_values
                                                .f
                                                .env(env)
                                                .call(parameters)
                                                .value()))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "controller")
    @ConvertedParameter(index = 1, name = "method")
    public Object getMiddleware(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Routing/ControllerDispatcher.php");
        Object controller = assignParameter(args, 0, false);
        Object method = assignParameter(args, 1, false);
        if (!function_method_exists.f.env(env).call(controller, "getMiddleware").getBool()) {
            return ZVal.assign(ZVal.newArray());
        }

        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        collect.f
                                                .env(env)
                                                .call(
                                                        env.callMethod(
                                                                controller,
                                                                "getMiddleware",
                                                                ControllerDispatcher.class))
                                                .value(),
                                        "reject",
                                        ControllerDispatcher.class,
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Illuminate\\Routing",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(index = 0, name = "data")
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                ReferenceContainer data =
                                                        new BasicReferenceContainer(
                                                                assignParameter(args, 0, false));
                                                ReferenceContainer method =
                                                        new BasicReferenceContainer(null);
                                                method =
                                                        this.contextReferences
                                                                .getReferenceContainer("method");
                                                return ZVal.assign(
                                                        StaticMethodUtils
                                                                .accessUnknownLateStaticMethod(
                                                                        env,
                                                                        ControllerDispatcher.this,
                                                                        ControllerDispatcher.class)
                                                                .method("methodExcludedByOptions")
                                                                .addReferenceArgs(
                                                                        new RuntimeArgsWithReferences()
                                                                                .add(0, method)
                                                                                .add(
                                                                                        1,
                                                                                        new ArrayDimensionReference(
                                                                                                data
                                                                                                        .getObject(),
                                                                                                "options")))
                                                                .call(
                                                                        method.getObject(),
                                                                        data.arrayGet(
                                                                                env, "options"))
                                                                .value());
                                            }
                                        }.use("method", method)),
                                "pluck",
                                ControllerDispatcher.class,
                                "middleware"),
                        "all",
                        ControllerDispatcher.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters", typeHint = "array")
    @ConvertedParameter(index = 1, name = "instance")
    @ConvertedParameter(index = 2, name = "method")
    protected Object resolveClassMethodDependencies(RuntimeEnv env, Object... args) {
        Object parameters = assignParameter(args, 0, false);
        Object instance = assignParameter(args, 1, false);
        Object method = assignParameter(args, 2, false);
        if (!function_method_exists.f.env(env).call(instance, method).getBool()) {
            return ZVal.assign(parameters);
        }

        return ZVal.assign(
                this.resolveMethodDependencies(
                        env, parameters, new ReflectionMethod(env, instance, method)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters", typeHint = "array")
    @ConvertedParameter(index = 1, name = "reflector", typeHint = "ReflectionFunctionAbstract")
    public Object resolveMethodDependencies(RuntimeEnv env, Object... args) {
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        Object reflector = assignParameter(args, 1, false);
        Object instance = null;
        ReferenceContainer instanceCount = new BasicReferenceContainer(null);
        ReferenceContainer values = new BasicReferenceContainer(null);
        Object parameter = null;
        Object key = null;
        instanceCount.setObject(0);
        values.setObject(function_array_values.f.env(env).call(parameters.getObject()).value());
        for (ZPair zpairResult2352 :
                ZVal.getIterable(
                        env.callMethod(reflector, "getParameters", ControllerDispatcher.class),
                        env,
                        false)) {
            key = ZVal.assign(zpairResult2352.getKey());
            parameter = ZVal.assign(zpairResult2352.getValue());
            instance = this.transformDependency(env, parameter, parameters.getObject());
            if (!function_is_null.f.env(env).call(instance).getBool()) {
                instanceCount.setObject(ZVal.increment(instanceCount.getObject()));
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(0, parameters),
                        "spliceIntoParameters",
                        ControllerDispatcher.class,
                        parameters.getObject(),
                        key,
                        instance);

            } else if (ZVal.toBool(
                            !arrayActionR(
                                    ArrayAction.ISSET,
                                    values,
                                    env,
                                    ZVal.subtract(key, instanceCount.getObject())))
                    && ZVal.toBool(
                            env.callMethod(
                                    parameter,
                                    "isDefaultValueAvailable",
                                    ControllerDispatcher.class))) {
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(0, parameters),
                        "spliceIntoParameters",
                        ControllerDispatcher.class,
                        parameters.getObject(),
                        key,
                        env.callMethod(parameter, "getDefaultValue", ControllerDispatcher.class));
            }
        }

        return ZVal.assign(parameters.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameter", typeHint = "ReflectionParameter")
    @ConvertedParameter(index = 1, name = "parameters")
    protected Object transformDependency(RuntimeEnv env, Object... args) {
        Object parameter = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        Object _pClass = null;
        _pClass = env.callMethod(parameter, "getClass", ControllerDispatcher.class);
        if (ZVal.toBool(_pClass)
                && ZVal.toBool(
                        !ZVal.isTrue(
                                this.alreadyInParameters(
                                        env,
                                        toObjectR(_pClass)
                                                .accessProp(this, env)
                                                .name("name")
                                                .value(),
                                        parameters)))) {
            return ZVal.assign(
                    ZVal.isTrue(
                                    env.callMethod(
                                            parameter,
                                            "isDefaultValueAvailable",
                                            ControllerDispatcher.class))
                            ? env.callMethod(
                                    parameter, "getDefaultValue", ControllerDispatcher.class)
                            : env.callMethod(
                                    this.container,
                                    "make",
                                    ControllerDispatcher.class,
                                    toObjectR(_pClass).accessProp(this, env).name("name").value()));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "parameters", typeHint = "array")
    protected Object alreadyInParameters(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Routing/RouteDependencyResolverTrait.php");
        Object _pClass = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        return ZVal.assign(
                !function_is_null
                        .f
                        .env(env)
                        .call(
                                Arr.runtimeStaticObject.first(
                                        env,
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
                                                Object _pClass = null;
                                                _pClass =
                                                        this.contextReferences.getCapturedValue(
                                                                "class");
                                                return ZVal.assign(
                                                        ZVal.checkInstanceTypeMatch(
                                                                value, _pClass));
                                            }
                                        }.use("class", _pClass)))
                        .getBool());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters", typeHint = "array")
    @ConvertedParameter(index = 1, name = "offset")
    @ConvertedParameter(index = 2, name = "value")
    protected Object spliceIntoParameters(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer parameters =
                assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        Object offset = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, false);
        function_array_splice
                .f
                .env(env)
                .call(parameters.getObject(), offset, 0, ZVal.newArray(new ZPair(0, value)));
        return null;
    }

    public Object spliceIntoParameters(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    public static final Object CONST_class = "Illuminate\\Routing\\ControllerDispatcher";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method")
        @ConvertedParameter(index = 1, name = "options", typeHint = "array")
        protected Object methodExcludedByOptions(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, false);
            ReferenceContainer options =
                    new BasicReferenceContainer(assignParameter(args, 1, false));
            return ZVal.assign(
                    ZVal.toBool(
                                    ZVal.toBool(
                                                    arrayActionR(
                                                            ArrayAction.ISSET,
                                                            options,
                                                            env,
                                                            "only"))
                                            && ZVal.toBool(
                                                    !function_in_array
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    method,
                                                                    rToArrayCast(
                                                                            options.arrayGet(
                                                                                    env, "only")))
                                                            .getBool()))
                            || ZVal.toBool(
                                    ZVal.toBool(
                                                    !arrayActionR(
                                                            ArrayAction.EMPTY,
                                                            options,
                                                            env,
                                                            "except"))
                                            && ZVal.toBool(
                                                    function_in_array
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    method,
                                                                    rToArrayCast(
                                                                            options.arrayGet(
                                                                                    env, "except")))
                                                            .value())));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Routing\\ControllerDispatcher")
                    .setLookup(
                            ControllerDispatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("container")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Routing/ControllerDispatcher.php")
                    .addInterface("Illuminate\\Routing\\Contracts\\ControllerDispatcher")
                    .addTrait("Illuminate\\Routing\\RouteDependencyResolverTrait")
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
