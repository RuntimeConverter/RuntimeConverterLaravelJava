package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Auth.classes.Authenticatable;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Auth/GenericUser.php

*/

public class GenericUser extends RuntimeClassBase implements Authenticatable {

    public Object attributes = null;

    public GenericUser(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == GenericUser.class) {
            this.__construct(env, args);
        }
    }

    public GenericUser(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, false);
        this.attributes = attributes;
        return null;
    }

    @ConvertedMethod
    public Object getAuthIdentifierName(RuntimeEnv env, Object... args) {
        return "id";
    }

    @ConvertedMethod
    public Object getAuthIdentifier(RuntimeEnv env, Object... args) {
        Object name = null;
        name = this.getAuthIdentifierName(env);
        return ZVal.assign(new ReferenceClassProperty(this, "attributes", env).arrayGet(env, name));
    }

    @ConvertedMethod
    public Object getAuthPassword(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "attributes", env).arrayGet(env, "password"));
    }

    @ConvertedMethod
    public Object getRememberToken(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "attributes", env)
                        .arrayGet(env, this.getRememberTokenName(env)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object setRememberToken(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "attributes", env)
                .arrayAccess(env, this.getRememberTokenName(env))
                .set(value);
        return null;
    }

    @ConvertedMethod
    public Object getRememberTokenName(RuntimeEnv env, Object... args) {
        return "remember_token";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object __get(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(new ReferenceClassProperty(this, "attributes", env).arrayGet(env, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object __set(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "attributes", env).arrayAccess(env, key).set(value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object __isset(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "attributes", env),
                        env,
                        key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object __unset(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        arrayActionR(
                ArrayAction.UNSET, new ReferenceClassProperty(this, "attributes", env), env, key);
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Auth\\GenericUser";

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
                    .setName("Illuminate\\Auth\\GenericUser")
                    .setLookup(
                            GenericUser.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Auth/GenericUser.php")
                    .addInterface("Illuminate\\Contracts\\Auth\\Authenticatable")
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
