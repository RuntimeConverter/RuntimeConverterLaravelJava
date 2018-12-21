package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Passwords.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Auth.classes.PasswordBrokerFactory;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Passwords.classes.PasswordBroker;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Passwords.classes.DatabaseTokenRepository;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Auth/Passwords/PasswordBrokerManager.php

*/

public class PasswordBrokerManager extends RuntimeClassBase implements PasswordBrokerFactory {

    public Object app = null;

    public Object brokers = ZVal.newArray();

    public PasswordBrokerManager(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PasswordBrokerManager.class) {
            this.__construct(env, args);
        }
    }

    public PasswordBrokerManager(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "app")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object app = assignParameter(args, 0, false);
        this.app = app;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object broker(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        name =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = name)
                                ? ternaryExpressionTemp
                                : this.getDefaultDriver(env));
        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "brokers", env),
                                env,
                                name)
                        ? new ReferenceClassProperty(this, "brokers", env).arrayGet(env, name)
                        : new ReferenceClassProperty(this, "brokers", env)
                                .arrayAccess(env, name)
                                .set(this.resolve(env, name)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object resolve(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        ReferenceContainer config = new BasicReferenceContainer(null);
        config.setObject(this.getConfig(env, name));
        if (function_is_null.f.env(env).call(config.getObject()).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Password resetter [" + toStringR(name, env) + "] is not defined."));
        }

        return ZVal.assign(
                new PasswordBroker(
                        env,
                        this.createTokenRepository(env, config.getObject()),
                        env.callMethod(
                                new ReferenceClassProperty(this, "app", env).arrayGet(env, "auth"),
                                "createUserProvider",
                                PasswordBrokerManager.class,
                                ZVal.isDefined(
                                                ternaryExpressionTemp =
                                                        config.arrayGet(env, "provider"))
                                        ? ternaryExpressionTemp
                                        : ZVal.getNull())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object createTokenRepository(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object connection = null;
        Object ternaryExpressionTemp = null;
        Object key = null;
        key =
                ZVal.assign(
                        new ReferenceClassProperty(this, "app", env)
                                .arrayGet(env, "config", "app.key"));
        if (ZVal.isTrue(Str.runtimeStaticObject.startsWith(env, key, "base64:"))) {
            key =
                    NamespaceGlobal.base64_decode
                            .env(env)
                            .call(function_substr.f.env(env).call(key, 7).value())
                            .value();
        }

        connection =
                ZVal.assign(
                        ZVal.isDefined(ternaryExpressionTemp = config.arrayGet(env, "connection"))
                                ? ternaryExpressionTemp
                                : ZVal.getNull());
        return ZVal.assign(
                new DatabaseTokenRepository(
                        env,
                        env.callMethod(
                                new ReferenceClassProperty(this, "app", env).arrayGet(env, "db"),
                                "connection",
                                PasswordBrokerManager.class,
                                connection),
                        new ReferenceClassProperty(this, "app", env).arrayGet(env, "hash"),
                        config.arrayGet(env, "table"),
                        key,
                        config.arrayGet(env, "expire")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object getConfig(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                new ReferenceClassProperty(this, "app", env)
                        .arrayGet(env, "config", "auth.passwords." + toStringR(name, env)));
    }

    @ConvertedMethod
    public Object getDefaultDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "app", env)
                        .arrayGet(env, "config", "auth.defaults.passwords"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setDefaultDriver(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "app", env)
                .arrayAccess(env, "config", "auth.defaults.passwords")
                .set(name);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        this.broker(env),
                        new RuntimeArgsWithReferences(),
                        toStringR(method, env),
                        PasswordBrokerManager.class,
                        PackedVaradicArgs.unpack(new PackedVaradicArgs(parameters))));
    }

    public static final Object CONST_class = "Illuminate\\Auth\\Passwords\\PasswordBrokerManager";

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
                    .setName("Illuminate\\Auth\\Passwords\\PasswordBrokerManager")
                    .setLookup(
                            PasswordBrokerManager.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "brokers")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Auth/Passwords/PasswordBrokerManager.php")
                    .addInterface("Illuminate\\Contracts\\Auth\\PasswordBrokerFactory")
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
