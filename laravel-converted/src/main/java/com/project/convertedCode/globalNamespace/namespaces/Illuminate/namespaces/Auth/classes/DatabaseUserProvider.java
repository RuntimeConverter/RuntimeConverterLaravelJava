package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Auth.classes.UserProvider;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.classes.GenericUser;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Arrayable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Auth/DatabaseUserProvider.php

*/

public class DatabaseUserProvider extends RuntimeClassBase implements UserProvider {

    public Object conn = null;

    public Object hasher = null;

    public Object table = null;

    public DatabaseUserProvider(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DatabaseUserProvider.class) {
            this.__construct(env, args);
        }
    }

    public DatabaseUserProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "conn",
        typeHint = "Illuminate\\Database\\ConnectionInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "hasher",
        typeHint = "Illuminate\\Contracts\\Hashing\\Hasher"
    )
    @ConvertedParameter(index = 2, name = "table")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object conn = assignParameter(args, 0, false);
        Object hasher = assignParameter(args, 1, false);
        Object table = assignParameter(args, 2, false);
        this.conn = conn;
        this.table = table;
        this.hasher = hasher;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "identifier")
    public Object retrieveById(RuntimeEnv env, Object... args) {
        Object identifier = assignParameter(args, 0, false);
        Object user = null;
        user =
                env.callMethod(
                        env.callMethod(this.conn, "table", DatabaseUserProvider.class, this.table),
                        "find",
                        DatabaseUserProvider.class,
                        identifier);
        return ZVal.assign(this.getGenericUser(env, user));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "identifier")
    @ConvertedParameter(index = 1, name = "token")
    public Object retrieveByToken(RuntimeEnv env, Object... args) {
        Object identifier = assignParameter(args, 0, false);
        Object token = assignParameter(args, 1, false);
        Object user = null;
        user =
                this.getGenericUser(
                        env,
                        env.callMethod(
                                env.callMethod(
                                        this.conn, "table", DatabaseUserProvider.class, this.table),
                                "find",
                                DatabaseUserProvider.class,
                                identifier));
        return ZVal.assign(
                ZVal.toBool(
                                        ZVal.toBool(user)
                                                && ZVal.toBool(
                                                        env.callMethod(
                                                                user,
                                                                "getRememberToken",
                                                                DatabaseUserProvider.class)))
                                && ZVal.toBool(
                                        NamespaceGlobal.hash_equals
                                                .env(env)
                                                .call(
                                                        env.callMethod(
                                                                user,
                                                                "getRememberToken",
                                                                DatabaseUserProvider.class),
                                                        token)
                                                .value())
                        ? user
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
        env.callMethod(
                env.callMethod(
                        env.callMethod(this.conn, "table", DatabaseUserProvider.class, this.table),
                        "where",
                        DatabaseUserProvider.class,
                        env.callMethod(user, "getAuthIdentifierName", DatabaseUserProvider.class),
                        env.callMethod(user, "getAuthIdentifier", DatabaseUserProvider.class)),
                "update",
                DatabaseUserProvider.class,
                ZVal.newArray(
                        new ZPair(
                                env.callMethod(
                                        user, "getRememberTokenName", DatabaseUserProvider.class),
                                token)));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "credentials", typeHint = "array")
    public Object retrieveByCredentials(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object credentials = assignParameter(args, 0, false);
        Object query = null;
        Object value = null;
        Object user = null;
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

        query = env.callMethod(this.conn, "table", DatabaseUserProvider.class, this.table);
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult196 : ZVal.getIterable(credentials, env, false)) {
            key = ZVal.assign(zpairResult196.getKey());
            value = ZVal.assign(zpairResult196.getValue());
            if (ZVal.isTrue(Str.runtimeStaticObject.contains(env, key, "password"))) {
                continue;
            }

            if (ZVal.toBool(function_is_array.f.env(env).call(value).value())
                    || ZVal.toBool(
                            ZVal.checkInstanceType(
                                    value,
                                    Arrayable.class,
                                    "Illuminate\\Contracts\\Support\\Arrayable"))) {
                env.callMethod(query, "whereIn", DatabaseUserProvider.class, key, value);

            } else {
                env.callMethod(query, "where", DatabaseUserProvider.class, key, value);
            }
        }

        user = env.callMethod(query, "first", DatabaseUserProvider.class);
        return ZVal.assign(this.getGenericUser(env, user));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "user")
    protected Object getGenericUser(RuntimeEnv env, Object... args) {
        Object user = assignParameter(args, 0, false);
        if (!function_is_null.f.env(env).call(user).getBool()) {
            return ZVal.assign(new GenericUser(env, rToArrayCast(user)));
        }

        return null;
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
        return ZVal.assign(
                env.callMethod(
                        this.hasher,
                        "check",
                        DatabaseUserProvider.class,
                        credentials.arrayGet(env, "password"),
                        env.callMethod(user, "getAuthPassword", DatabaseUserProvider.class)));
    }

    public static final Object CONST_class = "Illuminate\\Auth\\DatabaseUserProvider";

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
                    .setName("Illuminate\\Auth\\DatabaseUserProvider")
                    .setLookup(
                            DatabaseUserProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("conn", "hasher", "table")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Auth/DatabaseUserProvider.php")
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
