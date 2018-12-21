package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Auth.classes.SupportsBasicAuth;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Events.classes.Authenticated;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.classes.AuthenticationException;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Hash;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Events.classes.Logout;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Auth.classes.StatefulGuard;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Events.classes.Failed;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.Request;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Events.classes.Login;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.classes.Recaller;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Events.classes.Attempting;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Exception.classes.UnauthorizedHttpException;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Auth/SessionGuard.php

*/

public class SessionGuard extends RuntimeClassBase implements StatefulGuard, SupportsBasicAuth {

    public Object name = null;

    public Object lastAttempted = null;

    public Object viaRemember = false;

    public Object session = null;

    public Object cookie = null;

    public Object request = null;

    public Object events = null;

    public Object loggedOut = false;

    public Object recallAttempted = false;

    public Object user = null;

    public Object provider = null;

    public SessionGuard(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SessionGuard.class) {
            this.__construct(env, args);
        }
    }

    public SessionGuard(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "provider",
        typeHint = "Illuminate\\Contracts\\Auth\\UserProvider"
    )
    @ConvertedParameter(
        index = 2,
        name = "session",
        typeHint = "Illuminate\\Contracts\\Session\\Session"
    )
    @ConvertedParameter(
        index = 3,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object provider = assignParameter(args, 1, false);
        Object session = assignParameter(args, 2, false);
        Object request = assignParameter(args, 3, true);
        if (null == request) {
            request = ZVal.getNull();
        }
        this.name = name;
        this.session = session;
        this.request = request;
        this.provider = provider;
        return null;
    }

    @ConvertedMethod
    public Object user(RuntimeEnv env, Object... args) {
        Object recaller = null;
        Object id = null;
        if (ZVal.isTrue(this.loggedOut)) {
            return null;
        }

        if (!function_is_null.f.env(env).call(this.user).getBool()) {
            return ZVal.assign(this.user);
        }

        id = env.callMethod(this.session, "get", SessionGuard.class, this.getName(env));
        if (!function_is_null.f.env(env).call(id).getBool()) {
            if (ZVal.isTrue(
                    this.user =
                            env.callMethod(
                                    this.provider, "retrieveById", SessionGuard.class, id))) {
                this.fireAuthenticatedEvent(env, this.user);
            }
        }

        recaller = this.recaller(env);
        if (ZVal.toBool(function_is_null.f.env(env).call(this.user).value())
                && ZVal.toBool(!function_is_null.f.env(env).call(recaller).getBool())) {
            this.user = this.userFromRecaller(env, recaller);
            if (ZVal.isTrue(this.user)) {
                this.updateSession(
                        env, env.callMethod(this.user, "getAuthIdentifier", SessionGuard.class));
                this.fireLoginEvent(env, this.user, true);
            }
        }

        return ZVal.assign(this.user);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "recaller")
    protected Object userFromRecaller(RuntimeEnv env, Object... args) {
        Object recaller = assignParameter(args, 0, false);
        Object user = null;
        if (ZVal.toBool(!ZVal.isTrue(env.callMethod(recaller, "valid", SessionGuard.class)))
                || ZVal.toBool(this.recallAttempted)) {
            return null;
        }

        this.recallAttempted = true;
        this.viaRemember =
                !function_is_null
                        .f
                        .env(env)
                        .call(
                                user =
                                        env.callMethod(
                                                this.provider,
                                                "retrieveByToken",
                                                SessionGuard.class,
                                                env.callMethod(recaller, "id", SessionGuard.class),
                                                env.callMethod(
                                                        recaller, "token", SessionGuard.class)))
                        .getBool();
        return ZVal.assign(user);
    }

    @ConvertedMethod
    protected Object recaller(RuntimeEnv env, Object... args) {
        Object recaller = null;
        if (function_is_null.f.env(env).call(this.request).getBool()) {
            return null;
        }

        if (ZVal.isTrue(
                recaller =
                        env.callMethod(
                                toObjectR(this.request)
                                        .accessProp(this, env)
                                        .name("cookies")
                                        .value(),
                                "get",
                                SessionGuard.class,
                                this.getRecallerName(env)))) {
            return ZVal.assign(new Recaller(env, recaller));
        }

        return null;
    }

    @ConvertedMethod
    public Object id(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.loggedOut)) {
            return null;
        }

        return ZVal.assign(
                ZVal.isTrue(this.user(env))
                        ? env.callMethod(this.user(env), "getAuthIdentifier", SessionGuard.class)
                        : env.callMethod(
                                this.session, "get", SessionGuard.class, this.getName(env)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "credentials",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object once(RuntimeEnv env, Object... args) {
        Object credentials = assignParameter(args, 0, true);
        if (null == credentials) {
            credentials = ZVal.newArray();
        }
        this.fireAttemptEvent(env, credentials);
        if (ZVal.isTrue(this.validate(env, credentials))) {
            this.setUser(env, this.lastAttempted);
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    public Object onceUsingId(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        Object user = null;
        if (!function_is_null
                .f
                .env(env)
                .call(user = env.callMethod(this.provider, "retrieveById", SessionGuard.class, id))
                .getBool()) {
            this.setUser(env, user);
            return ZVal.assign(user);
        }

        return ZVal.assign(false);
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
        Object credentials = assignParameter(args, 0, true);
        if (null == credentials) {
            credentials = ZVal.newArray();
        }
        Object user = null;
        this.lastAttempted =
                user =
                        env.callMethod(
                                this.provider,
                                "retrieveByCredentials",
                                SessionGuard.class,
                                credentials);
        return ZVal.assign(this.hasValidCredentials(env, user, credentials));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "field")
    @ConvertedParameter(
        index = 1,
        name = "extraConditions",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object basic(RuntimeEnv env, Object... args) {
        Object field = assignParameter(args, 0, true);
        if (null == field) {
            field = "email";
        }
        Object extraConditions = assignParameter(args, 1, true);
        if (null == extraConditions) {
            extraConditions = ZVal.newArray();
        }
        if (ZVal.isTrue(this.check(env))) {
            return null;
        }

        if (ZVal.isTrue(this.attemptBasic(env, this.getRequest(env), field, extraConditions))) {
            return null;
        }

        return ZVal.assign(this.failedBasicResponse(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "field")
    @ConvertedParameter(
        index = 1,
        name = "extraConditions",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object onceBasic(RuntimeEnv env, Object... args) {
        Object field = assignParameter(args, 0, true);
        if (null == field) {
            field = "email";
        }
        Object extraConditions = assignParameter(args, 1, true);
        if (null == extraConditions) {
            extraConditions = ZVal.newArray();
        }
        Object credentials = null;
        credentials = this.basicCredentials(env, this.getRequest(env), field);
        if (!ZVal.isTrue(
                this.once(
                        env,
                        function_array_merge
                                .f
                                .env(env)
                                .call(credentials, extraConditions)
                                .value()))) {
            return ZVal.assign(this.failedBasicResponse(env));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(index = 1, name = "field")
    @ConvertedParameter(
        index = 2,
        name = "extraConditions",
        defaultValue = "",
        defaultValueType = "array"
    )
    protected Object attemptBasic(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object field = assignParameter(args, 1, false);
        Object extraConditions = assignParameter(args, 2, true);
        if (null == extraConditions) {
            extraConditions = ZVal.newArray();
        }
        if (!ZVal.isTrue(env.callMethod(request, "getUser", SessionGuard.class))) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                this.attempt(
                        env,
                        function_array_merge
                                .f
                                .env(env)
                                .call(this.basicCredentials(env, request, field), extraConditions)
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(index = 1, name = "field")
    protected Object basicCredentials(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object field = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(field, env.callMethod(request, "getUser", SessionGuard.class)),
                        new ZPair(
                                "password",
                                env.callMethod(request, "getPassword", SessionGuard.class))));
    }

    @ConvertedMethod
    protected Object failedBasicResponse(RuntimeEnv env, Object... args) {
        throw ZVal.getException(
                env, new UnauthorizedHttpException(env, "Basic", "Invalid credentials."));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "credentials",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 1,
        name = "remember",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object attempt(RuntimeEnv env, Object... args) {
        Object credentials = assignParameter(args, 0, true);
        if (null == credentials) {
            credentials = ZVal.newArray();
        }
        Object remember = assignParameter(args, 1, true);
        if (null == remember) {
            remember = false;
        }
        Object user = null;
        this.fireAttemptEvent(env, credentials, remember);
        this.lastAttempted =
                user =
                        env.callMethod(
                                this.provider,
                                "retrieveByCredentials",
                                SessionGuard.class,
                                credentials);
        if (ZVal.isTrue(this.hasValidCredentials(env, user, credentials))) {
            this.login(env, user, remember);
            return ZVal.assign(true);
        }

        this.fireFailedEvent(env, user, credentials);
        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "user")
    @ConvertedParameter(index = 1, name = "credentials")
    protected Object hasValidCredentials(RuntimeEnv env, Object... args) {
        Object user = assignParameter(args, 0, false);
        Object credentials = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.toBool(!function_is_null.f.env(env).call(user).getBool())
                        && ZVal.toBool(
                                env.callMethod(
                                        this.provider,
                                        "validateCredentials",
                                        SessionGuard.class,
                                        user,
                                        credentials)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    @ConvertedParameter(
        index = 1,
        name = "remember",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object loginUsingId(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        Object remember = assignParameter(args, 1, true);
        if (null == remember) {
            remember = false;
        }
        Object user = null;
        if (!function_is_null
                .f
                .env(env)
                .call(user = env.callMethod(this.provider, "retrieveById", SessionGuard.class, id))
                .getBool()) {
            this.login(env, user, remember);
            return ZVal.assign(user);
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "user",
        typeHint = "Illuminate\\Contracts\\Auth\\Authenticatable"
    )
    @ConvertedParameter(
        index = 1,
        name = "remember",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object login(RuntimeEnv env, Object... args) {
        Object user = assignParameter(args, 0, false);
        Object remember = assignParameter(args, 1, true);
        if (null == remember) {
            remember = false;
        }
        this.updateSession(env, env.callMethod(user, "getAuthIdentifier", SessionGuard.class));
        if (ZVal.isTrue(remember)) {
            this.ensureRememberTokenIsSet(env, user);
            this.queueRecallerCookie(env, user);
        }

        this.fireLoginEvent(env, user, remember);
        this.setUser(env, user);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    protected Object updateSession(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        env.callMethod(this.session, "put", SessionGuard.class, this.getName(env), id);
        env.callMethod(this.session, "migrate", SessionGuard.class, true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "user",
        typeHint = "Illuminate\\Contracts\\Auth\\Authenticatable"
    )
    protected Object ensureRememberTokenIsSet(RuntimeEnv env, Object... args) {
        Object user = assignParameter(args, 0, false);
        if (ZVal.isEmpty(env.callMethod(user, "getRememberToken", SessionGuard.class))) {
            this.cycleRememberToken(env, user);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "user",
        typeHint = "Illuminate\\Contracts\\Auth\\Authenticatable"
    )
    protected Object queueRecallerCookie(RuntimeEnv env, Object... args) {
        Object user = assignParameter(args, 0, false);
        env.callMethod(
                this.getCookieJar(env),
                "queue",
                SessionGuard.class,
                this.createRecaller(
                        env,
                        toStringR(
                                        env.callMethod(
                                                user, "getAuthIdentifier", SessionGuard.class),
                                        env)
                                + "|"
                                + toStringR(
                                        env.callMethod(
                                                user, "getRememberToken", SessionGuard.class),
                                        env)
                                + "|"
                                + toStringR(
                                        env.callMethod(user, "getAuthPassword", SessionGuard.class),
                                        env)));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object createRecaller(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this.getCookieJar(env),
                        "forever",
                        SessionGuard.class,
                        this.getRecallerName(env),
                        value));
    }

    @ConvertedMethod
    public Object logout(RuntimeEnv env, Object... args) {
        Object user = null;
        user = this.user(env);
        this.clearUserDataFromStorage(env);
        if (!function_is_null.f.env(env).call(this.user).getBool()) {
            this.cycleRememberToken(env, user);
        }

        if (ZVal.isset(this.events)) {
            env.callMethod(this.events, "dispatch", SessionGuard.class, new Logout(env, user));
        }

        this.user = ZVal.getNull();
        this.loggedOut = true;
        return null;
    }

    @ConvertedMethod
    protected Object clearUserDataFromStorage(RuntimeEnv env, Object... args) {
        env.callMethod(this.session, "remove", SessionGuard.class, this.getName(env));
        if (!function_is_null.f.env(env).call(this.recaller(env)).getBool()) {
            env.callMethod(
                    this.getCookieJar(env),
                    "queue",
                    SessionGuard.class,
                    env.callMethod(
                            this.getCookieJar(env),
                            "forget",
                            SessionGuard.class,
                            this.getRecallerName(env)));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "user",
        typeHint = "Illuminate\\Contracts\\Auth\\Authenticatable"
    )
    protected Object cycleRememberToken(RuntimeEnv env, Object... args) {
        Object user = assignParameter(args, 0, false);
        Object token = null;
        env.callMethod(
                user,
                "setRememberToken",
                SessionGuard.class,
                token = Str.runtimeStaticObject.random(env, 60));
        env.callMethod(this.provider, "updateRememberToken", SessionGuard.class, user, token);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "password")
    @ConvertedParameter(index = 1, name = "attribute")
    public Object logoutOtherDevices(RuntimeEnv env, Object... args) {
        Object password = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, true);
        if (null == attribute) {
            attribute = "password";
        }
        if (!ZVal.isTrue(this.user(env))) {
            return null;
        }

        return ZVal.assign(
                env.callMethod(
                        tap.f
                                .env(env)
                                .call(
                                        env.callMethod(
                                                this.user(env),
                                                "forceFill",
                                                SessionGuard.class,
                                                ZVal.newArray(
                                                        new ZPair(
                                                                attribute,
                                                                Hash.runtimeStaticObject
                                                                        .callUnknownStaticMethod(
                                                                                env,
                                                                                "make",
                                                                                new RuntimeArgsWithReferences(),
                                                                                password)))))
                                .value(),
                        "save",
                        SessionGuard.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    public Object attempting(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        if (ZVal.isset(this.events)) {
            env.callMethod(
                    this.events, "listen", SessionGuard.class, Attempting.CONST_class, callback);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "credentials", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "remember",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object fireAttemptEvent(RuntimeEnv env, Object... args) {
        Object credentials = assignParameter(args, 0, false);
        Object remember = assignParameter(args, 1, true);
        if (null == remember) {
            remember = false;
        }
        if (ZVal.isset(this.events)) {
            env.callMethod(
                    this.events,
                    "dispatch",
                    SessionGuard.class,
                    new Attempting(env, credentials, remember));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "user")
    @ConvertedParameter(
        index = 1,
        name = "remember",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object fireLoginEvent(RuntimeEnv env, Object... args) {
        Object user = assignParameter(args, 0, false);
        Object remember = assignParameter(args, 1, true);
        if (null == remember) {
            remember = false;
        }
        if (ZVal.isset(this.events)) {
            env.callMethod(
                    this.events, "dispatch", SessionGuard.class, new Login(env, user, remember));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "user")
    protected Object fireAuthenticatedEvent(RuntimeEnv env, Object... args) {
        Object user = assignParameter(args, 0, false);
        if (ZVal.isset(this.events)) {
            env.callMethod(
                    this.events, "dispatch", SessionGuard.class, new Authenticated(env, user));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "user")
    @ConvertedParameter(index = 1, name = "credentials", typeHint = "array")
    protected Object fireFailedEvent(RuntimeEnv env, Object... args) {
        Object user = assignParameter(args, 0, false);
        Object credentials = assignParameter(args, 1, false);
        if (ZVal.isset(this.events)) {
            env.callMethod(
                    this.events,
                    "dispatch",
                    SessionGuard.class,
                    new Failed(env, user, credentials));
        }

        return null;
    }

    @ConvertedMethod
    public Object getLastAttempted(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.lastAttempted);
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                "login_"
                        + toStringR(this.name, env)
                        + "_"
                        + toStringR(
                                NamespaceGlobal.sha1
                                        .env(env)
                                        .call(
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "class"))
                                        .value(),
                                env));
    }

    @ConvertedMethod
    public Object getRecallerName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                "remember_"
                        + toStringR(this.name, env)
                        + "_"
                        + toStringR(
                                NamespaceGlobal.sha1
                                        .env(env)
                                        .call(
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "class"))
                                        .value(),
                                env));
    }

    @ConvertedMethod
    public Object viaRemember(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.viaRemember);
    }

    @ConvertedMethod
    public Object getCookieJar(RuntimeEnv env, Object... args) {
        if (!ZVal.isset(this.cookie)) {
            throw ZVal.getException(env, new RuntimeException(env, "Cookie jar has not been set."));
        }

        return ZVal.assign(this.cookie);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "cookie",
        typeHint = "Illuminate\\Contracts\\Cookie\\QueueingFactory"
    )
    public Object setCookieJar(RuntimeEnv env, Object... args) {
        Object cookie = assignParameter(args, 0, false);
        this.cookie = cookie;
        return null;
    }

    @ConvertedMethod
    public Object getDispatcher(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.events);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "events",
        typeHint = "Illuminate\\Contracts\\Events\\Dispatcher"
    )
    public Object setDispatcher(RuntimeEnv env, Object... args) {
        Object events = assignParameter(args, 0, false);
        this.events = events;
        return null;
    }

    @ConvertedMethod
    public Object getSession(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.session);
    }

    @ConvertedMethod
    public Object getUser(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.user);
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
        this.loggedOut = false;
        this.fireAuthenticatedEvent(env, user);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getRequest(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isTrue(ternaryExpressionTemp = this.request)
                        ? ternaryExpressionTemp
                        : Request.runtimeStaticObject.createFromGlobals(env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
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
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, SessionGuard.class)
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
                                                .SessionGuard
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
                                            SessionGuard.class,
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

    public static final Object CONST_class = "Illuminate\\Auth\\SessionGuard";

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
                                    .SessionGuard
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
                            SessionGuard.class,
                            ZVal.toLong(256) | ZVal.toLong(512));
            for (ZPair zpairResult2266 : ZVal.getIterable(methods, env, true)) {
                method = ZVal.assign(zpairResult2266.getValue());
                env.callMethod(method, "setAccessible", SessionGuard.class, true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, SessionGuard.class)
                        .method("macro")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                toObjectR(method).accessProp(this, env).name("name").value(),
                                env.callMethod(method, "invoke", SessionGuard.class, mixin))
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
                                            .SessionGuard
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
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, SessionGuard.class)
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
                                                    .SessionGuard
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
                                                                        .SessionGuard
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
                                                            .SessionGuard
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
                    .setName("Illuminate\\Auth\\SessionGuard")
                    .setLookup(
                            SessionGuard.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "cookie",
                            "events",
                            "lastAttempted",
                            "loggedOut",
                            "name",
                            "provider",
                            "recallAttempted",
                            "request",
                            "session",
                            "user",
                            "viaRemember")
                    .setStaticPropertyNames("macros")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Auth/SessionGuard.php")
                    .addInterface("Illuminate\\Contracts\\Auth\\StatefulGuard")
                    .addInterface("Illuminate\\Contracts\\Auth\\Guard")
                    .addInterface("Illuminate\\Contracts\\Auth\\SupportsBasicAuth")
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
