package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Broadcasting.namespaces.Broadcasters.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Exception.classes.AccessDeniedHttpException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Routing.classes.UrlRoutable;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Container.classes.Container;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionFunction;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Routing.classes.BindingRegistrar;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;
import static com.runtimeconverter.runtime.ZVal.assignParameterVarArgs;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Broadcasting/Broadcasters/Broadcaster.php

*/

public abstract class Broadcaster extends RuntimeClassBase
        implements com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Contracts
                .namespaces
                .Broadcasting
                .classes
                .Broadcaster {

    public Object channels = ZVal.newArray();

    public Object bindingRegistrar = null;

    public Broadcaster(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Broadcaster(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "channel")
    @ConvertedParameter(index = 1, name = "callback")
    public Object channel(RuntimeEnv env, Object... args) {
        Object channel = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "channels", env).arrayAccess(env, channel).set(callback);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "channel")
    protected Object verifyUserCanAccessChannel(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        PassByReferenceArgs rLastRefArgs;
        Object request = assignParameter(args, 0, false);
        Object channel = assignParameter(args, 1, false);
        Object result = null;
        Object handler = null;
        Object pattern = null;
        Object callback = null;
        Object parameters = null;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult200 : ZVal.getIterable(this.channels, env, false)) {
            pattern = ZVal.assign(zpairResult200.getKey());
            callback = ZVal.assign(zpairResult200.getValue());
            if (!ZVal.isTrue(
                    Str.runtimeStaticObject.is(
                            env,
                            function_preg_replace
                                    .f
                                    .env(env)
                                    .call("/\\{(.*?)\\}/", "*", pattern)
                                    .value(),
                            channel))) {
                continue;
            }

            parameters = this.extractAuthParameters(env, pattern, channel, callback);
            handler = this.normalizeChannelHandlerToCallable(env, callback);
            if (ZVal.isTrue(
                    result =
                            env.callFunctionDynamic(
                                            handler,
                                            rLastRefArgs =
                                                    new RuntimeArgsWithReferences()
                                                            .add(
                                                                    0,
                                                                    handleReturnReference(
                                                                            env.callMethod(
                                                                                    request,
                                                                                    "user",
                                                                                    Broadcaster
                                                                                            .class))),
                                            PackedVaradicArgs.unpack(
                                                    rLastRefArgs.get(0),
                                                    new PackedVaradicArgs(parameters)))
                                    .value())) {
                return ZVal.assign(
                        env.callMethod(
                                this,
                                "validAuthenticationResponse",
                                Broadcaster.class,
                                request,
                                result));
            }
        }

        throw ZVal.getException(env, new AccessDeniedHttpException(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pattern")
    @ConvertedParameter(index = 1, name = "channel")
    @ConvertedParameter(index = 2, name = "callback")
    protected Object extractAuthParameters(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Broadcasting/Broadcasters")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Broadcasting/Broadcasters/Broadcaster.php");
        Object pattern = assignParameter(args, 0, false);
        Object channel = assignParameter(args, 1, false);
        Object callback = assignParameter(args, 2, false);
        Object callbackParameters = null;
        callbackParameters = this.extractParameters(env, callback);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                collect.f
                                                        .env(env)
                                                        .call(
                                                                this.extractChannelKeys(
                                                                        env, pattern, channel))
                                                        .value(),
                                                "reject",
                                                Broadcaster.class,
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Illuminate\\Broadcasting\\Broadcasters",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(index = 0, name = "value")
                                                    @ConvertedParameter(index = 1, name = "key")
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object value =
                                                                assignParameter(args, 0, false);
                                                        Object key =
                                                                assignParameter(args, 1, false);
                                                        return ZVal.assign(
                                                                function_is_numeric
                                                                        .f
                                                                        .env(env)
                                                                        .call(key)
                                                                        .value());
                                                    }
                                                }),
                                        "map",
                                        Broadcaster.class,
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Illuminate\\Broadcasting\\Broadcasters",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(index = 0, name = "value")
                                            @ConvertedParameter(index = 1, name = "key")
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                Object _closureThisVar = this.getClosureThisVar();
                                                Object value = assignParameter(args, 0, false);
                                                Object key = assignParameter(args, 1, false);
                                                Object callbackParameters = null;
                                                callbackParameters =
                                                        this.contextReferences.getCapturedValue(
                                                                "callbackParameters");
                                                return ZVal.assign(
                                                        Broadcaster.this.resolveBinding(
                                                                env,
                                                                key,
                                                                value,
                                                                callbackParameters));
                                            }
                                        }.use("callbackParameters", callbackParameters)),
                                "values",
                                Broadcaster.class),
                        "all",
                        Broadcaster.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    protected Object extractParameters(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        if (function_is_callable.f.env(env).call(callback).getBool()) {
            return ZVal.assign(
                    env.callMethod(
                            new ReflectionFunction(env, callback),
                            "getParameters",
                            Broadcaster.class));

        } else if (function_is_string.f.env(env).call(callback).getBool()) {
            return ZVal.assign(this.extractParametersFromClass(env, callback));
        }

        throw ZVal.getException(
                env, new PHPException(env, "Given channel handler is an unknown type."));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    protected Object extractParametersFromClass(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        Object reflection = null;
        reflection = new ReflectionClass(env, callback);
        if (!ZVal.isTrue(env.callMethod(reflection, "hasMethod", Broadcaster.class, "join"))) {
            throw ZVal.getException(
                    env,
                    new PHPException(env, "Class based channel must define a \"join\" method."));
        }

        return ZVal.assign(
                env.callMethod(
                        env.callMethod(reflection, "getMethod", Broadcaster.class, "join"),
                        "getParameters",
                        Broadcaster.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pattern")
    @ConvertedParameter(index = 1, name = "channel")
    protected Object extractChannelKeys(RuntimeEnv env, Object... args) {
        Object pattern = assignParameter(args, 0, false);
        Object channel = assignParameter(args, 1, false);
        ReferenceContainer keys = new BasicReferenceContainer(null);
        function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, keys))
                .call(
                        "/^"
                                + toStringR(
                                        function_preg_replace
                                                .f
                                                .env(env)
                                                .call("/\\{(.*?)\\}/", "(?<$1>[^\\.]+)", pattern)
                                                .value(),
                                        env)
                                + "/",
                        channel,
                        keys.getObject());
        return ZVal.assign(keys.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "callbackParameters")
    protected Object resolveBinding(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object callbackParameters = assignParameter(args, 2, false);
        Object newValue = null;
        newValue = this.resolveExplicitBindingIfPossible(env, key, value);
        return ZVal.assign(
                ZVal.strictEqualityCheck(newValue, "===", value)
                        ? this.resolveImplicitBindingIfPossible(env, key, value, callbackParameters)
                        : newValue);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    protected Object resolveExplicitBindingIfPossible(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object binder = null;
        binder = this.binder(env);
        if (ZVal.toBool(binder)
                && ZVal.toBool(
                        env.callMethod(binder, "getBindingCallback", Broadcaster.class, key))) {
            return ZVal.assign(
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    env.callMethod(
                                            binder, "getBindingCallback", Broadcaster.class, key),
                                    value)
                            .value());
        }

        return ZVal.assign(value);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "callbackParameters")
    protected Object resolveImplicitBindingIfPossible(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object callbackParameters = assignParameter(args, 2, false);
        Object instance = null;
        Object parameter = null;
        Object model = null;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult201 : ZVal.getIterable(callbackParameters, env, true)) {
            parameter = ZVal.assign(zpairResult201.getValue());
            if (!ZVal.isTrue(this.isImplicitlyBindable(env, key, parameter))) {
                continue;
            }

            instance =
                    env.callMethod(
                            env.callMethod(parameter, "getClass", Broadcaster.class),
                            "newInstance",
                            Broadcaster.class);
            if (!ZVal.isTrue(
                    model =
                            env.callMethod(
                                    instance, "resolveRouteBinding", Broadcaster.class, value))) {
                throw ZVal.getException(env, new AccessDeniedHttpException(env));
            }

            return ZVal.assign(model);
        }

        return ZVal.assign(value);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "parameter")
    protected Object isImplicitlyBindable(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object parameter = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        toObjectR(parameter)
                                                                .accessProp(this, env)
                                                                .name("name")
                                                                .value(),
                                                        "===",
                                                        key))
                                        && ZVal.toBool(
                                                env.callMethod(
                                                        parameter, "getClass", Broadcaster.class)))
                        && ZVal.toBool(
                                env.callMethod(
                                        env.callMethod(parameter, "getClass", Broadcaster.class),
                                        "isSubclassOf",
                                        Broadcaster.class,
                                        UrlRoutable.CONST_class)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "channels", typeHint = "array")
    protected Object formatChannels(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Broadcasting/Broadcasters")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Broadcasting/Broadcasters/Broadcaster.php");
        Object channels = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Broadcasting\\Broadcasters",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "channel")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object channel = assignParameter(args, 0, false);
                                        return ZVal.assign(toStringR(channel, env));
                                    }
                                },
                                channels)
                        .value());
    }

    @ConvertedMethod
    protected Object binder(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.bindingRegistrar)) {
            this.bindingRegistrar =
                    ZVal.isTrue(
                                    env.callMethod(
                                            Container.runtimeStaticObject.getInstance(env),
                                            "bound",
                                            Broadcaster.class,
                                            BindingRegistrar.CONST_class))
                            ? env.callMethod(
                                    Container.runtimeStaticObject.getInstance(env),
                                    "make",
                                    Broadcaster.class,
                                    BindingRegistrar.CONST_class)
                            : ZVal.getNull();
        }

        return ZVal.assign(this.bindingRegistrar);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    protected Object normalizeChannelHandlerToCallable(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Broadcasting/Broadcasters")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Broadcasting/Broadcasters/Broadcaster.php");
        Object callback = assignParameter(args, 0, false);
        return ZVal.assign(
                function_is_callable.f.env(env).call(callback).getBool()
                        ? callback
                        : new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Broadcasting\\Broadcasters",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "args")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object ___args = assignParameterVarArgs(args, 0);
                                Object callback = null;
                                callback = this.contextReferences.getCapturedValue("callback");
                                return ZVal.assign(
                                        env.callMethod(
                                                env.callMethod(
                                                        Container.runtimeStaticObject.getInstance(
                                                                env),
                                                        "make",
                                                        Broadcaster.class,
                                                        callback),
                                                "join",
                                                Broadcaster.class,
                                                PackedVaradicArgs.unpack(
                                                        new PackedVaradicArgs(___args))));
                            }
                        }.use("callback", callback));
    }

    public static final Object CONST_class = "Illuminate\\Broadcasting\\Broadcasters\\Broadcaster";

    @ConvertedMethod()
    public abstract Object auth(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object validAuthenticationResponse(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object broadcast(RuntimeEnv env, Object... args);

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
                    .setName("Illuminate\\Broadcasting\\Broadcasters\\Broadcaster")
                    .setLookup(
                            Broadcaster.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bindingRegistrar", "channels")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Broadcasting/Broadcasters/Broadcaster.php")
                    .addInterface("Illuminate\\Contracts\\Broadcasting\\Broadcaster")
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
