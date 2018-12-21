package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Passwords.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.UnexpectedValueException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Auth.classes.CanResetPassword;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Auth/Passwords/PasswordBroker.php

*/

public class PasswordBroker extends RuntimeClassBase
        implements com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Contracts
                .namespaces
                .Auth
                .classes
                .PasswordBroker {

    public Object tokens = null;

    public Object users = null;

    public Object passwordValidator = null;

    public PasswordBroker(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PasswordBroker.class) {
            this.__construct(env, args);
        }
    }

    public PasswordBroker(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "tokens",
        typeHint = "Illuminate\\Auth\\Passwords\\TokenRepositoryInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "users",
        typeHint = "Illuminate\\Contracts\\Auth\\UserProvider"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object tokens = assignParameter(args, 0, false);
        Object users = assignParameter(args, 1, false);
        this.users = users;
        this.tokens = tokens;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "credentials", typeHint = "array")
    public Object sendResetLink(RuntimeEnv env, Object... args) {
        Object credentials = assignParameter(args, 0, false);
        Object user = null;
        user = this.getUser(env, credentials);
        if (function_is_null.f.env(env).call(user).getBool()) {
            return ZVal.assign(
                    ClassConstantUtils.getConstantValueLateStatic(env, this, "INVALID_USER"));
        }

        env.callMethod(
                user,
                "sendPasswordResetNotification",
                PasswordBroker.class,
                env.callMethod(this.tokens, "create", PasswordBroker.class, user));
        return ZVal.assign(
                ClassConstantUtils.getConstantValueLateStatic(env, this, "RESET_LINK_SENT"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "credentials", typeHint = "array")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "Closure")
    public Object reset(RuntimeEnv env, Object... args) {
        ReferenceContainer credentials =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        Object callback = assignParameter(args, 1, false);
        ReferenceContainer password = new BasicReferenceContainer(null);
        ReferenceContainer user = new BasicReferenceContainer(null);
        user.setObject(this.validateReset(env, credentials.getObject()));
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        user.getObject(),
                        CanResetPassword.class,
                        "Illuminate\\Contracts\\Auth\\CanResetPassword"))) {
            return ZVal.assign(user.getObject());
        }

        password.setObject(ZVal.assign(credentials.arrayGet(env, "password")));
        env.callFunctionDynamic(
                callback,
                new RuntimeArgsWithReferences().add(0, user).add(1, password),
                user.getObject(),
                password.getObject());
        env.callMethod(this.tokens, "delete", PasswordBroker.class, user.getObject());
        return ZVal.assign(
                ClassConstantUtils.getConstantValueLateStatic(env, this, "PASSWORD_RESET"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "credentials", typeHint = "array")
    protected Object validateReset(RuntimeEnv env, Object... args) {
        ReferenceContainer credentials =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        Object user = null;
        if (function_is_null
                .f
                .env(env)
                .call(user = this.getUser(env, credentials.getObject()))
                .getBool()) {
            return ZVal.assign(
                    ClassConstantUtils.getConstantValueLateStatic(env, this, "INVALID_USER"));
        }

        if (!ZVal.isTrue(this.validateNewPassword(env, credentials.getObject()))) {
            return ZVal.assign(
                    ClassConstantUtils.getConstantValueLateStatic(env, this, "INVALID_PASSWORD"));
        }

        if (!ZVal.isTrue(
                env.callMethod(
                        this.tokens,
                        "exists",
                        PasswordBroker.class,
                        user,
                        credentials.arrayGet(env, "token")))) {
            return ZVal.assign(
                    ClassConstantUtils.getConstantValueLateStatic(env, this, "INVALID_TOKEN"));
        }

        return ZVal.assign(user);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    public Object validator(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        this.passwordValidator = callback;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "credentials", typeHint = "array")
    public Object validateNewPassword(RuntimeEnv env, Object... args) {
        ReferenceContainer credentials =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        Object confirm = null;
        Object password = null;
        Object runtimeTempArrayResult9 = null;
        if (ZVal.isset(this.passwordValidator)) {
            ZVal.list(
                    runtimeTempArrayResult9 =
                            ZVal.newArray(
                                    new ZPair(0, credentials.arrayGet(env, "password")),
                                    new ZPair(
                                            1, credentials.arrayGet(env, "password_confirmation"))),
                    (password = listGet(runtimeTempArrayResult9, 0, env)),
                    (confirm = listGet(runtimeTempArrayResult9, 1, env)));
            return ZVal.assign(
                    ZVal.toBool(
                                    function_call_user_func
                                            .f
                                            .env(env)
                                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                            .call(this.passwordValidator, credentials.getObject())
                                            .value())
                            && ZVal.toBool(ZVal.strictEqualityCheck(password, "===", confirm)));
        }

        return ZVal.assign(this.validatePasswordWithDefaults(env, credentials.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "credentials", typeHint = "array")
    protected Object validatePasswordWithDefaults(RuntimeEnv env, Object... args) {
        ReferenceContainer credentials =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        Object confirm = null;
        Object password = null;
        Object runtimeTempArrayResult10 = null;
        ZVal.list(
                runtimeTempArrayResult10 =
                        ZVal.newArray(
                                new ZPair(0, credentials.arrayGet(env, "password")),
                                new ZPair(1, credentials.arrayGet(env, "password_confirmation"))),
                (password = listGet(runtimeTempArrayResult10, 0, env)),
                (confirm = listGet(runtimeTempArrayResult10, 1, env)));
        return ZVal.assign(
                ZVal.toBool(ZVal.strictEqualityCheck(password, "===", confirm))
                        && ZVal.toBool(
                                ZVal.isGreaterThanOrEqualTo(
                                        NamespaceGlobal.mb_strlen.env(env).call(password).value(),
                                        ">=",
                                        6)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "credentials", typeHint = "array")
    public Object getUser(RuntimeEnv env, Object... args) {
        Object credentials = assignParameter(args, 0, false);
        Object user = null;
        credentials = Arr.runtimeStaticObject.except(env, credentials, ZVal.arrayFromList("token"));
        user =
                env.callMethod(
                        this.users, "retrieveByCredentials", PasswordBroker.class, credentials);
        if (ZVal.toBool(user)
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        user,
                                        CanResetPassword.class,
                                        "Illuminate\\Contracts\\Auth\\CanResetPassword")))) {
            throw ZVal.getException(
                    env,
                    new UnexpectedValueException(
                            env, "User must implement CanResetPassword interface."));
        }

        return ZVal.assign(user);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "user",
        typeHint = "Illuminate\\Contracts\\Auth\\CanResetPassword"
    )
    public Object createToken(RuntimeEnv env, Object... args) {
        Object user = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this.tokens, "create", PasswordBroker.class, user));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "user",
        typeHint = "Illuminate\\Contracts\\Auth\\CanResetPassword"
    )
    public Object deleteToken(RuntimeEnv env, Object... args) {
        Object user = assignParameter(args, 0, false);
        env.callMethod(this.tokens, "delete", PasswordBroker.class, user);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "user",
        typeHint = "Illuminate\\Contracts\\Auth\\CanResetPassword"
    )
    @ConvertedParameter(index = 1, name = "token")
    public Object tokenExists(RuntimeEnv env, Object... args) {
        Object user = assignParameter(args, 0, false);
        Object token = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(this.tokens, "exists", PasswordBroker.class, user, token));
    }

    @ConvertedMethod
    public Object getRepository(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.tokens);
    }

    public static final Object CONST_class = "Illuminate\\Auth\\Passwords\\PasswordBroker";

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
                    .setName("Illuminate\\Auth\\Passwords\\PasswordBroker")
                    .setLookup(
                            PasswordBroker.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("passwordValidator", "tokens", "users")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Auth/Passwords/PasswordBroker.php")
                    .addInterface("Illuminate\\Contracts\\Auth\\PasswordBroker")
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
