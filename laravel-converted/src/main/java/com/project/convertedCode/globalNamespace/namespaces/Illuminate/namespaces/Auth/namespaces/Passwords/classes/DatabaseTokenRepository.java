package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Passwords.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Carbon;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Passwords.classes.TokenRepositoryInterface;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Auth/Passwords/DatabaseTokenRepository.php

*/

public class DatabaseTokenRepository extends RuntimeClassBase implements TokenRepositoryInterface {

    public Object connection = null;

    public Object hasher = null;

    public Object table = null;

    public Object hashKey = null;

    public Object expires = null;

    public DatabaseTokenRepository(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DatabaseTokenRepository.class) {
            this.__construct(env, args);
        }
    }

    public DatabaseTokenRepository(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "connection",
        typeHint = "Illuminate\\Database\\ConnectionInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "hasher",
        typeHint = "Illuminate\\Contracts\\Hashing\\Hasher"
    )
    @ConvertedParameter(index = 2, name = "table")
    @ConvertedParameter(index = 3, name = "hashKey")
    @ConvertedParameter(
        index = 4,
        name = "expires",
        defaultValue = "60",
        defaultValueType = "number"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        Object hasher = assignParameter(args, 1, false);
        Object table = assignParameter(args, 2, false);
        Object hashKey = assignParameter(args, 3, false);
        Object expires = assignParameter(args, 4, true);
        if (null == expires) {
            expires = 60;
        }
        this.table = table;
        this.hasher = hasher;
        this.hashKey = hashKey;
        this.expires = ZVal.multiply(expires, 60);
        this.connection = connection;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "user",
        typeHint = "Illuminate\\Contracts\\Auth\\CanResetPassword"
    )
    public Object create(RuntimeEnv env, Object... args) {
        Object user = assignParameter(args, 0, false);
        Object email = null;
        Object token = null;
        email = env.callMethod(user, "getEmailForPasswordReset", DatabaseTokenRepository.class);
        this.deleteExisting(env, user);
        token = this.createNewToken(env);
        env.callMethod(
                this.getTable(env),
                "insert",
                DatabaseTokenRepository.class,
                this.getPayload(env, email, token));
        return ZVal.assign(token);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "user",
        typeHint = "Illuminate\\Contracts\\Auth\\CanResetPassword"
    )
    protected Object deleteExisting(RuntimeEnv env, Object... args) {
        Object user = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                this.getTable(env),
                                "where",
                                DatabaseTokenRepository.class,
                                "email",
                                env.callMethod(
                                        user,
                                        "getEmailForPasswordReset",
                                        DatabaseTokenRepository.class)),
                        "delete",
                        DatabaseTokenRepository.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "email")
    @ConvertedParameter(index = 1, name = "token")
    protected Object getPayload(RuntimeEnv env, Object... args) {
        Object email = assignParameter(args, 0, false);
        Object token = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("email", email),
                        new ZPair(
                                "token",
                                env.callMethod(
                                        this.hasher, "make", DatabaseTokenRepository.class, token)),
                        new ZPair("created_at", new Carbon(env))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "user",
        typeHint = "Illuminate\\Contracts\\Auth\\CanResetPassword"
    )
    @ConvertedParameter(index = 1, name = "token")
    public Object exists(RuntimeEnv env, Object... args) {
        Object user = assignParameter(args, 0, false);
        Object token = assignParameter(args, 1, false);
        ReferenceContainer record = new BasicReferenceContainer(null);
        record.setObject(
                ZVal.assign(
                        rToArrayCast(
                                env.callMethod(
                                        env.callMethod(
                                                this.getTable(env),
                                                "where",
                                                DatabaseTokenRepository.class,
                                                "email",
                                                env.callMethod(
                                                        user,
                                                        "getEmailForPasswordReset",
                                                        DatabaseTokenRepository.class)),
                                        "first",
                                        DatabaseTokenRepository.class))));
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(record.getObject())
                                        && ZVal.toBool(
                                                !ZVal.isTrue(
                                                        this.tokenExpired(
                                                                env,
                                                                record.arrayGet(
                                                                        env, "created_at")))))
                        && ZVal.toBool(
                                env.callMethod(
                                        this.hasher,
                                        "check",
                                        DatabaseTokenRepository.class,
                                        token,
                                        record.arrayGet(env, "token"))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "createdAt")
    protected Object tokenExpired(RuntimeEnv env, Object... args) {
        Object createdAt = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                Carbon.runtimeStaticObject.parse(env, createdAt),
                                "addSeconds",
                                DatabaseTokenRepository.class,
                                this.expires),
                        "isPast",
                        DatabaseTokenRepository.class));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "user",
        typeHint = "Illuminate\\Contracts\\Auth\\CanResetPassword"
    )
    public Object delete(RuntimeEnv env, Object... args) {
        Object user = assignParameter(args, 0, false);
        this.deleteExisting(env, user);
        return null;
    }

    @ConvertedMethod
    public Object deleteExpired(RuntimeEnv env, Object... args) {
        Object expiredAt = null;
        expiredAt =
                env.callMethod(
                        Carbon.runtimeStaticObject.now(env),
                        "subSeconds",
                        DatabaseTokenRepository.class,
                        this.expires);
        env.callMethod(
                env.callMethod(
                        this.getTable(env),
                        "where",
                        DatabaseTokenRepository.class,
                        "created_at",
                        "<",
                        expiredAt),
                "delete",
                DatabaseTokenRepository.class);
        return null;
    }

    @ConvertedMethod
    public Object createNewToken(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                NamespaceGlobal.hash_hmac
                        .env(env)
                        .call("sha256", Str.runtimeStaticObject.random(env, 40), this.hashKey)
                        .value());
    }

    @ConvertedMethod
    public Object getConnection(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.connection);
    }

    @ConvertedMethod
    protected Object getTable(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this.connection, "table", DatabaseTokenRepository.class, this.table));
    }

    @ConvertedMethod
    public Object getHasher(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.hasher);
    }

    public static final Object CONST_class = "Illuminate\\Auth\\Passwords\\DatabaseTokenRepository";

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
                    .setName("Illuminate\\Auth\\Passwords\\DatabaseTokenRepository")
                    .setLookup(
                            DatabaseTokenRepository.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("connection", "expires", "hashKey", "hasher", "table")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Auth/Passwords/DatabaseTokenRepository.php")
                    .addInterface("Illuminate\\Auth\\Passwords\\TokenRepositoryInterface")
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
