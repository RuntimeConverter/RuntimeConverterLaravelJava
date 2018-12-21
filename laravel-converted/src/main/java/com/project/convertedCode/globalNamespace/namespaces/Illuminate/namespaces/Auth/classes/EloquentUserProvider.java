package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Auth.classes.UserProvider;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Arrayable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Auth/EloquentUserProvider.php

*/

public class EloquentUserProvider extends RuntimeClassBase implements UserProvider {

    public Object hasher = null;

    public Object model = null;

    public EloquentUserProvider(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == EloquentUserProvider.class) {
            this.__construct(env, args);
        }
    }

    public EloquentUserProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "hasher",
        typeHint = "Illuminate\\Contracts\\Hashing\\Hasher"
    )
    @ConvertedParameter(index = 1, name = "model")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object hasher = assignParameter(args, 0, false);
        Object model = assignParameter(args, 1, false);
        this.model = model;
        this.hasher = hasher;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "identifier")
    public Object retrieveById(RuntimeEnv env, Object... args) {
        Object identifier = assignParameter(args, 0, false);
        Object model = null;
        model = this.createModel(env);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(model, "newQuery", EloquentUserProvider.class),
                                "where",
                                EloquentUserProvider.class,
                                env.callMethod(
                                        model, "getAuthIdentifierName", EloquentUserProvider.class),
                                identifier),
                        "first",
                        EloquentUserProvider.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "identifier")
    @ConvertedParameter(index = 1, name = "token")
    public Object retrieveByToken(RuntimeEnv env, Object... args) {
        Object identifier = assignParameter(args, 0, false);
        Object token = assignParameter(args, 1, false);
        Object model = null;
        Object rememberToken = null;
        model = this.createModel(env);
        model =
                env.callMethod(
                        env.callMethod(
                                model,
                                "where",
                                EloquentUserProvider.class,
                                env.callMethod(
                                        model, "getAuthIdentifierName", EloquentUserProvider.class),
                                identifier),
                        "first",
                        EloquentUserProvider.class);
        if (!ZVal.isTrue(model)) {
            return ZVal.assign(ZVal.getNull());
        }

        rememberToken = env.callMethod(model, "getRememberToken", EloquentUserProvider.class);
        return ZVal.assign(
                ZVal.toBool(rememberToken)
                                && ZVal.toBool(
                                        NamespaceGlobal.hash_equals
                                                .env(env)
                                                .call(rememberToken, token)
                                                .value())
                        ? model
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "user",
        typeHint = "Illuminate\\Contracts\\Auth\\Authenticatable"
    )
    @ConvertedParameter(index = 1, name = "token")
    public Object updateRememberToken(RuntimeEnv env, Object... args) {
        Object user = assignParameter(args, 0, false);
        Object token = assignParameter(args, 1, false);
        Object timestamps = null;
        env.callMethod(user, "setRememberToken", EloquentUserProvider.class, token);
        timestamps = ZVal.assign(toObjectR(user).accessProp(this, env).name("timestamps").value());
        toObjectR(user).accessProp(this, env).name("timestamps").set(false);
        env.callMethod(user, "save", EloquentUserProvider.class);
        toObjectR(user).accessProp(this, env).name("timestamps").set(timestamps);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "credentials", typeHint = "array")
    public Object retrieveByCredentials(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object credentials = assignParameter(args, 0, false);
        Object query = null;
        Object value = null;
        Object key = null;
        if (ZVal.toBool(ZVal.isEmpty(credentials))
                || ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                function_count.f.env(env).call(credentials).value(),
                                                "===",
                                                1))
                                && ZVal.toBool(
                                        function_array_key_exists
                                                .f
                                                .env(env)
                                                .call("password", credentials)
                                                .value()))) {
            return null;
        }

        query = env.callMethod(this.createModel(env), "newQuery", EloquentUserProvider.class);
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult197 : ZVal.getIterable(credentials, env, false)) {
            key = ZVal.assign(zpairResult197.getKey());
            value = ZVal.assign(zpairResult197.getValue());
            if (ZVal.isTrue(Str.runtimeStaticObject.contains(env, key, "password"))) {
                continue;
            }

            if (ZVal.toBool(function_is_array.f.env(env).call(value).value())
                    || ZVal.toBool(
                            ZVal.checkInstanceType(
                                    value,
                                    Arrayable.class,
                                    "Illuminate\\Contracts\\Support\\Arrayable"))) {
                env.callMethod(query, "whereIn", EloquentUserProvider.class, key, value);

            } else {
                env.callMethod(query, "where", EloquentUserProvider.class, key, value);
            }
        }

        return ZVal.assign(env.callMethod(query, "first", EloquentUserProvider.class));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "user",
        typeHint = "Illuminate\\Contracts\\Auth\\Authenticatable"
    )
    @ConvertedParameter(index = 1, name = "credentials", typeHint = "array")
    public Object validateCredentials(RuntimeEnv env, Object... args) {
        Object user = assignParameter(args, 0, false);
        ReferenceContainer credentials =
                new BasicReferenceContainer(assignParameter(args, 1, false));
        Object plain = null;
        plain = ZVal.assign(credentials.arrayGet(env, "password"));
        return ZVal.assign(
                env.callMethod(
                        this.hasher,
                        "check",
                        EloquentUserProvider.class,
                        plain,
                        env.callMethod(user, "getAuthPassword", EloquentUserProvider.class)));
    }

    @ConvertedMethod
    public Object createModel(RuntimeEnv env, Object... args) {
        Object _pClass = null;
        _pClass = "\\" + toStringR(function_ltrim.f.env(env).call(this.model, "\\").value(), env);
        return ZVal.assign(env.createNew(_pClass));
    }

    @ConvertedMethod
    public Object getHasher(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.hasher);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "hasher",
        typeHint = "Illuminate\\Contracts\\Hashing\\Hasher"
    )
    public Object setHasher(RuntimeEnv env, Object... args) {
        Object hasher = assignParameter(args, 0, false);
        this.hasher = hasher;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getModel(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.model);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "model")
    public Object setModel(RuntimeEnv env, Object... args) {
        Object model = assignParameter(args, 0, false);
        this.model = model;
        return ZVal.assign(this);
    }

    public static final Object CONST_class = "Illuminate\\Auth\\EloquentUserProvider";

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
                    .setName("Illuminate\\Auth\\EloquentUserProvider")
                    .setLookup(
                            EloquentUserProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("hasher", "model")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Auth/EloquentUserProvider.php")
                    .addInterface("Illuminate\\Contracts\\Auth\\UserProvider")
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
