package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Auth.classes;

import com.project.convertedCode.globalNamespace.functions.app;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Notifications.classes.ResetPassword;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Auth.classes.Authenticatable;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Auth.namespaces.Access.classes.Gate;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.Model;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Auth.namespaces.Access.classes.Authorizable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Auth.classes.CanResetPassword;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Auth/User.php

*/

public class User extends Model implements Authenticatable, Authorizable, CanResetPassword {

    public Object rememberTokenName = "remember_token";

    public User(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == User.class) {
            this.__construct(env, args);
        }
    }

    public User(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getAuthIdentifierName(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "getKeyName", User.class));
    }

    @ConvertedMethod
    public Object getAuthIdentifier(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toObjectR(this)
                        .accessProp(this, env)
                        .name(this.getAuthIdentifierName(env))
                        .value());
    }

    @ConvertedMethod
    public Object getAuthPassword(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("password").value());
    }

    @ConvertedMethod
    public Object getRememberToken(RuntimeEnv env, Object... args) {
        if (!ZVal.isEmpty(this.getRememberTokenName(env))) {
            return ZVal.assign(
                    toStringR(
                            toObjectR(this)
                                    .accessProp(this, env)
                                    .name(this.getRememberTokenName(env))
                                    .value(),
                            env));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object setRememberToken(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        if (!ZVal.isEmpty(this.getRememberTokenName(env))) {
            toObjectR(this).accessProp(this, env).name(this.getRememberTokenName(env)).set(value);
        }

        return null;
    }

    @ConvertedMethod
    public Object getRememberTokenName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.rememberTokenName);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ability")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object can(RuntimeEnv env, Object... args) {
        Object ability = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, true);
        if (null == arguments) {
            arguments = ZVal.newArray();
        }
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                app.f.env(env).call(Gate.CONST_class).value(),
                                "forUser",
                                User.class,
                                this),
                        "check",
                        User.class,
                        ability,
                        arguments));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ability")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object cant(RuntimeEnv env, Object... args) {
        Object ability = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, true);
        if (null == arguments) {
            arguments = ZVal.newArray();
        }
        return ZVal.assign(!ZVal.isTrue(this.can(env, ability, arguments)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ability")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object cannot(RuntimeEnv env, Object... args) {
        Object ability = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, true);
        if (null == arguments) {
            arguments = ZVal.newArray();
        }
        return ZVal.assign(this.cant(env, ability, arguments));
    }

    @ConvertedMethod
    public Object getEmailForPasswordReset(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("email").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token")
    public Object sendPasswordResetNotification(RuntimeEnv env, Object... args) {
        Object token = assignParameter(args, 0, false);
        env.callMethod(this, "notify", User.class, new ResetPassword(env, token));
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Auth\\User";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Model.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Foundation\\Auth\\User")
                    .setLookup(
                            User.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "appends",
                            "attributes",
                            "casts",
                            "changes",
                            "connection",
                            "dateFormat",
                            "dates",
                            "dispatchesEvents",
                            "exists",
                            "fillable",
                            "guarded",
                            "hidden",
                            "incrementing",
                            "keyType",
                            "observables",
                            "original",
                            "perPage",
                            "primaryKey",
                            "relations",
                            "rememberTokenName",
                            "table",
                            "timestamps",
                            "touches",
                            "visible",
                            "wasRecentlyCreated",
                            "with",
                            "withCount")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Foundation/Auth/User.php")
                    .addInterface("Illuminate\\Contracts\\Auth\\Authenticatable")
                    .addInterface("Illuminate\\Contracts\\Auth\\Access\\Authorizable")
                    .addInterface("Illuminate\\Contracts\\Auth\\CanResetPassword")
                    .addInterface("ArrayAccess")
                    .addInterface("Illuminate\\Contracts\\Support\\Arrayable")
                    .addInterface("Illuminate\\Contracts\\Support\\Jsonable")
                    .addInterface("JsonSerializable")
                    .addInterface("Illuminate\\Contracts\\Queue\\QueueableEntity")
                    .addInterface("Illuminate\\Contracts\\Routing\\UrlRoutable")
                    .addTrait("Illuminate\\Auth\\Authenticatable")
                    .addTrait("Illuminate\\Foundation\\Auth\\Access\\Authorizable")
                    .addTrait("Illuminate\\Auth\\Passwords\\CanResetPassword")
                    .addExtendsClass("Illuminate\\Database\\Eloquent\\Model")
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
