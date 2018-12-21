package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.classes.AuthenticationException;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Auth.classes.Guard;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Auth/RequestGuard.php

*/

public class RequestGuard extends RuntimeClassBase implements Guard {

    public Object callback = null;

    public Object request = null;

    public Object user = null;

    public Object provider = null;

    public RequestGuard(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RequestGuard.class) {
            this.__construct(env, args);
        }
    }

    public RequestGuard(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "callable")
    @ConvertedParameter(index = 1, name = "request", typeHint = "Illuminate\\Http\\Request")
    @ConvertedParameter(
        index = 2,
        name = "provider",
        typeHint = "Illuminate\\Contracts\\Auth\\UserProvider",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        Object request = assignParameter(args, 1, false);
        Object provider = assignParameter(args, 2, true);
        if (null == provider) {
            provider = ZVal.getNull();
        }
        this.request = request;
        this.callback = callback;
        this.provider = provider;
        return null;
    }

    @ConvertedMethod
    public Object user(RuntimeEnv env, Object... args) {
        if (!function_is_null.f.env(env).call(this.user).getBool()) {
            return ZVal.assign(this.user);
        }

        return ZVal.assign(
                this.user =
                        function_call_user_func
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(this.callback, this.request, this.getProvider(env))
                                .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "credentials",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object validate(RuntimeEnv env, Object... args) {
        ReferenceContainer credentials =
                new BasicReferenceContainer(assignParameter(args, 0, true));
        if (null == credentials.getObject()) {
            credentials.setObject(ZVal.newArray());
        }
        return ZVal.assign(
                !function_is_null
                        .f
                        .env(env)
                        .call(
                                env.callMethod(
                                        env.createNewWithLateStaticBindings(
                                                this,
                                                this.callback,
                                                credentials.arrayGet(env, "request"),
                                                this.getProvider(env)),
                                        "user",
                                        RequestGuard.class))
                        .getBool());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    public Object setRequest(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        this.request = request;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object authenticate(RuntimeEnv env, Object... args) {
        Object user = null;
        if (!function_is_null.f.env(env).call(user = this.user(env)).getBool()) {
            return ZVal.assign(user);
        }

        throw ZVal.getException(env, new AuthenticationException(env));
    }

    @ConvertedMethod
    public Object hasUser(RuntimeEnv env, Object... args) {
        return ZVal.assign(!function_is_null.f.env(env).call(this.user).getBool());
    }

    @ConvertedMethod
    public Object check(RuntimeEnv env, Object... args) {
        return ZVal.assign(!function_is_null.f.env(env).call(this.user(env)).getBool());
    }

    @ConvertedMethod
    public Object guest(RuntimeEnv env, Object... args) {
        return ZVal.assign(!ZVal.isTrue(this.check(env)));
    }

    @ConvertedMethod
    public Object id(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.user(env))) {
            return ZVal.assign(
                    env.callMethod(this.user(env), "getAuthIdentifier", RequestGuard.class));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "user",
        typeHint = "Illuminate\\Contracts\\Auth\\Authenticatable"
    )
    public Object setUser(RuntimeEnv env, Object... args) {
        Object user = assignParameter(args, 0, false);
        this.user = user;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getProvider(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.provider);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "provider",
        typeHint = "Illuminate\\Contracts\\Auth\\UserProvider"
    )
    public Object setProvider(RuntimeEnv env, Object... args) {
        Object provider = assignParameter(args, 0, false);
        this.provider = provider;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        ReferenceContainer method = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object parameters = assignParameter(args, 1, false);
        Object macro = null;
        if (!ZVal.isTrue(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, RequestGuard.class)
                        .method("hasMacro")
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(0, method))
                        .call(method.getObject())
                        .value())) {
            throw ZVal.getException(
                    env,
                    new BadMethodCallException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Method %s::%s does not exist.",
                                            ClassConstantUtils.getConstantValueLateStatic(
                                                    env, this, "class"),
                                            method.getObject())
                                    .value()));
        }

        macro =
                ZVal.assign(
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Auth
                                                .classes
                                                .RequestGuard
                                                .RequestStaticProperties
                                                .class,
                                        "macros")
                                .arrayGet(env, method.getObject()));
        if (ZVal.isTrue(ZVal.checkInstanceType(macro, Closure.class, "Closure"))) {
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    env.callMethod(
                                            macro,
                                            "bindTo",
                                            RequestGuard.class,
                                            this,
                                            ClassConstantUtils.getConstantValueLateStatic(
                                                    env, this, "class")),
                                    parameters)
                            .value());
        }

        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(macro, parameters)
                        .value());
    }

    public static final Object CONST_class = "Illuminate\\Auth\\RequestGuard";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        @ConvertedParameter(index = 1, name = "macro")
        public Object macro(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            Object macro = assignParameter(args, 1, false);
            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Auth
                                    .classes
                                    .RequestGuard
                                    .RequestStaticProperties
                                    .class,
                            "macros")
                    .arrayAccess(env, name)
                    .set(macro);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "mixin")
        public Object mixin(RuntimeEnv env, Object... args) {
            Object mixin = assignParameter(args, 0, false);
            Object method = null;
            Object methods = null;
            methods =
                    env.callMethod(
                            new ReflectionClass(env, mixin),
                            "getMethods",
                            RequestGuard.class,
                            ZVal.toLong(256) | ZVal.toLong(512));
            for (ZPair zpairResult2265 : ZVal.getIterable(methods, env, true)) {
                method = ZVal.assign(zpairResult2265.getValue());
                env.callMethod(method, "setAccessible", RequestGuard.class, true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, RequestGuard.class)
                        .method("macro")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                toObjectR(method).accessProp(this, env).name("name").value(),
                                env.callMethod(method, "invoke", RequestGuard.class, mixin))
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        public Object hasMacro(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            return ZVal.assign(
                    arrayActionR(
                            ArrayAction.ISSET,
                            env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Auth
                                            .classes
                                            .RequestGuard
                                            .RequestStaticProperties
                                            .class,
                                    "macros"),
                            env,
                            name));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method")
        @ConvertedParameter(index = 1, name = "parameters")
        public Object __callStatic(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, false);
            Object parameters = assignParameter(args, 1, false);
            if (!ZVal.isTrue(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, RequestGuard.class)
                            .method("hasMacro")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(method)
                            .value())) {
                throw ZVal.getException(
                        env,
                        new BadMethodCallException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Method %s::%s does not exist.",
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "class"),
                                                method)
                                        .value()));
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Illuminate
                                                    .namespaces
                                                    .Auth
                                                    .classes
                                                    .RequestGuard
                                                    .RequestStaticProperties
                                                    .class,
                                            "macros")
                                    .arrayGet(env, method),
                            Closure.class,
                            "Closure"))) {
                return ZVal.assign(
                        function_call_user_func_array
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(
                                        Closure.runtimeStaticObject.bind(
                                                env,
                                                env.getRequestStaticPropertiesReference(
                                                                com.project
                                                                        .convertedCode
                                                                        .globalNamespace
                                                                        .namespaces
                                                                        .Illuminate
                                                                        .namespaces
                                                                        .Auth
                                                                        .classes
                                                                        .RequestGuard
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "macros")
                                                        .arrayGet(env, method),
                                                ZVal.getNull(),
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "class")),
                                        parameters)
                                .value());
            }

            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Illuminate
                                                            .namespaces
                                                            .Auth
                                                            .classes
                                                            .RequestGuard
                                                            .RequestStaticProperties
                                                            .class,
                                                    "macros")
                                            .arrayGet(env, method),
                                    parameters)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object macros = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Auth\\RequestGuard")
                    .setLookup(
                            RequestGuard.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("callback", "provider", "request", "user")
                    .setStaticPropertyNames("macros")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Auth/RequestGuard.php")
                    .addInterface("Illuminate\\Contracts\\Auth\\Guard")
                    .addTrait("Illuminate\\Auth\\GuardHelpers")
                    .addTrait("Illuminate\\Support\\Traits\\Macroable")
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
