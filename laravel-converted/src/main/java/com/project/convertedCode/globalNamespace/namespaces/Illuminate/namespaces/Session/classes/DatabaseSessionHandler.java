package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.classes.ExistenceAwareInterface;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeClasses.date.DateInterval;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeInterface;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Auth.classes.Guard;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeInterfaces.SessionHandlerInterface;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Carbon;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes.QueryException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Session/DatabaseSessionHandler.php

*/

public class DatabaseSessionHandler extends RuntimeClassBase
        implements SessionHandlerInterface, ExistenceAwareInterface {

    public Object connection = null;

    public Object table = null;

    public Object minutes = null;

    public Object container = null;

    public Object exists = null;

    public DatabaseSessionHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DatabaseSessionHandler.class) {
            this.__construct(env, args);
        }
    }

    public DatabaseSessionHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "connection",
        typeHint = "Illuminate\\Database\\ConnectionInterface"
    )
    @ConvertedParameter(index = 1, name = "table")
    @ConvertedParameter(index = 2, name = "minutes")
    @ConvertedParameter(
        index = 3,
        name = "container",
        typeHint = "Illuminate\\Contracts\\Container\\Container",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        Object table = assignParameter(args, 1, false);
        Object minutes = assignParameter(args, 2, false);
        Object container = assignParameter(args, 3, true);
        if (null == container) {
            container = ZVal.getNull();
        }
        this.table = table;
        this.minutes = minutes;
        this.container = container;
        this.connection = connection;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "savePath")
    @ConvertedParameter(index = 1, name = "sessionName")
    public Object open(RuntimeEnv env, Object... args) {
        Object savePath = assignParameter(args, 0, false);
        Object sessionName = assignParameter(args, 1, false);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object close(RuntimeEnv env, Object... args) {
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    public Object read(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        Object session = null;
        session =
                ZVal.assign(
                        toObjectR(
                                env.callMethod(
                                        this.getQuery(env),
                                        "find",
                                        DatabaseSessionHandler.class,
                                        sessionId)));
        if (ZVal.isTrue(this.expired(env, session))) {
            this.exists = true;
            return "";
        }

        if (ZVal.isset(toObjectR(session).accessProp(this, env).name("payload").value())) {
            this.exists = true;
            return ZVal.assign(
                    NamespaceGlobal.base64_decode
                            .env(env)
                            .call(toObjectR(session).accessProp(this, env).name("payload").value())
                            .value());
        }

        return "";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "session")
    protected Object expired(RuntimeEnv env, Object... args) {
        Object session = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.isset(
                                        toObjectR(session)
                                                .accessProp(this, env)
                                                .name("last_activity")
                                                .value()))
                        && ZVal.toBool(
                                ZVal.isLessThan(
                                        toObjectR(session)
                                                .accessProp(this, env)
                                                .name("last_activity")
                                                .value(),
                                        '<',
                                        env.callMethod(
                                                env.callMethod(
                                                        Carbon.runtimeStaticObject.now(env),
                                                        "subMinutes",
                                                        DatabaseSessionHandler.class,
                                                        this.minutes),
                                                "getTimestamp",
                                                DatabaseSessionHandler.class))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    @ConvertedParameter(index = 1, name = "data")
    public Object write(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        Object payload = null;
        payload = this.getDefaultPayload(env, data);
        if (!ZVal.isTrue(this.exists)) {
            this.read(env, sessionId);
        }

        if (ZVal.isTrue(this.exists)) {
            this.performUpdate(env, sessionId, payload);

        } else {
            this.performInsert(env, sessionId, payload);
        }

        return ZVal.assign(this.exists = true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    @ConvertedParameter(index = 1, name = "payload")
    protected Object performInsert(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        ReferenceContainer payload = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object e = null;
        try {
            return ZVal.assign(
                    env.callMethod(
                            this.getQuery(env),
                            "insert",
                            DatabaseSessionHandler.class,
                            Arr.runtimeStaticObject.set(
                                    env,
                                    new RuntimeArgsWithReferences().add(0, payload),
                                    payload.getObject(),
                                    "id",
                                    sessionId)));
        } catch (ConvertedException convertedException62) {
            if (convertedException62.instanceOf(
                    QueryException.class, "Illuminate\\Database\\QueryException")) {
                e = convertedException62.getObject();
                this.performUpdate(env, sessionId, payload.getObject());
            } else {
                throw convertedException62;
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    @ConvertedParameter(index = 1, name = "payload")
    protected Object performUpdate(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        Object payload = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                this.getQuery(env),
                                "where",
                                DatabaseSessionHandler.class,
                                "id",
                                sessionId),
                        "update",
                        DatabaseSessionHandler.class,
                        payload));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    protected Object getDefaultPayload(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Session")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Session/DatabaseSessionHandler.php");
        Object data = assignParameter(args, 0, false);
        Object payload = null;
        payload =
                ZVal.newArray(
                        new ZPair(
                                "payload",
                                NamespaceGlobal.base64_encode.env(env).call(data).value()),
                        new ZPair("last_activity", this.currentTime(env)));
        if (!ZVal.isTrue(this.container)) {
            return ZVal.assign(payload);
        }

        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                payload,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Session",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "payload")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        ReferenceContainer payload =
                                                assignParameterRef(
                                                        runtimePassByReferenceArgs, args, 0, false);
                                        env.callMethod(
                                                env.callMethod(
                                                        _closureThisVar,
                                                        new RuntimeArgsWithReferences()
                                                                .add(0, payload),
                                                        "addUserInformation",
                                                        DatabaseSessionHandler.class,
                                                        payload.getObject()),
                                                new RuntimeArgsWithReferences().add(0, payload),
                                                "addRequestInformation",
                                                DatabaseSessionHandler.class,
                                                payload.getObject());
                                        return null;
                                    }
                                })
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "payload")
    protected Object addUserInformation(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer payload = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        if (ZVal.isTrue(
                env.callMethod(
                        this.container,
                        "bound",
                        DatabaseSessionHandler.class,
                        Guard.CONST_class))) {
            payload.arrayAccess(env, "user_id").set(this.userId(env));
        }

        return ZVal.assign(this);
    }

    public Object addUserInformation(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    protected Object userId(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                this.container,
                                "make",
                                DatabaseSessionHandler.class,
                                Guard.CONST_class),
                        "id",
                        DatabaseSessionHandler.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "payload")
    protected Object addRequestInformation(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer payload = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        if (ZVal.isTrue(
                env.callMethod(this.container, "bound", DatabaseSessionHandler.class, "request"))) {
            payload.setObject(
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    payload.getObject(),
                                    ZVal.newArray(
                                            new ZPair("ip_address", this.ipAddress(env)),
                                            new ZPair("user_agent", this.userAgent(env))))
                            .value());
        }

        return ZVal.assign(this);
    }

    public Object addRequestInformation(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    protected Object ipAddress(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                this.container, "make", DatabaseSessionHandler.class, "request"),
                        "ip",
                        DatabaseSessionHandler.class));
    }

    @ConvertedMethod
    protected Object userAgent(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_substr
                        .f
                        .env(env)
                        .call(
                                toStringR(
                                        env.callMethod(
                                                env.callMethod(
                                                        this.container,
                                                        "make",
                                                        DatabaseSessionHandler.class,
                                                        "request"),
                                                "header",
                                                DatabaseSessionHandler.class,
                                                "User-Agent"),
                                        env),
                                0,
                                500)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    public Object destroy(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        env.callMethod(
                env.callMethod(
                        this.getQuery(env), "where", DatabaseSessionHandler.class, "id", sessionId),
                "delete",
                DatabaseSessionHandler.class);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "lifetime")
    public Object gc(RuntimeEnv env, Object... args) {
        Object lifetime = assignParameter(args, 0, false);
        env.callMethod(
                env.callMethod(
                        this.getQuery(env),
                        "where",
                        DatabaseSessionHandler.class,
                        "last_activity",
                        "<=",
                        ZVal.subtract(this.currentTime(env), lifetime)),
                "delete",
                DatabaseSessionHandler.class);
        return null;
    }

    @ConvertedMethod
    protected Object getQuery(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this.connection, "table", DatabaseSessionHandler.class, this.table));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object setExists(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        this.exists = value;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay")
    protected Object secondsUntil(RuntimeEnv env, Object... args) {
        Object delay = assignParameter(args, 0, false);
        delay = this.parseDateInterval(env, delay);
        return ZVal.assign(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        delay, DateTimeInterface.class, "DateTimeInterface"))
                        ? NamespaceGlobal.max
                                .env(env)
                                .call(
                                        0,
                                        ZVal.subtract(
                                                env.callMethod(
                                                        delay,
                                                        "getTimestamp",
                                                        DatabaseSessionHandler.class),
                                                this.currentTime(env)))
                                .value()
                        : ZVal.toLong(delay));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay", defaultValue = "0", defaultValueType = "number")
    protected Object availableAt(RuntimeEnv env, Object... args) {
        Object delay = assignParameter(args, 0, true);
        if (null == delay) {
            delay = 0;
        }
        delay = this.parseDateInterval(env, delay);
        return ZVal.assign(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        delay, DateTimeInterface.class, "DateTimeInterface"))
                        ? env.callMethod(delay, "getTimestamp", DatabaseSessionHandler.class)
                        : env.callMethod(
                                env.callMethod(
                                        Carbon.runtimeStaticObject.now(env),
                                        "addSeconds",
                                        DatabaseSessionHandler.class,
                                        delay),
                                "getTimestamp",
                                DatabaseSessionHandler.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay")
    protected Object parseDateInterval(RuntimeEnv env, Object... args) {
        ReferenceContainer delay = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (ZVal.isTrue(
                ZVal.checkInstanceType(delay.getObject(), DateInterval.class, "DateInterval"))) {
            delay.setObject(
                    env.callMethod(
                            Carbon.runtimeStaticObject.now(env),
                            new RuntimeArgsWithReferences().add(0, delay),
                            "add",
                            DatabaseSessionHandler.class,
                            delay.getObject()));
        }

        return ZVal.assign(delay.getObject());
    }

    @ConvertedMethod
    protected Object currentTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        Carbon.runtimeStaticObject.now(env),
                        "getTimestamp",
                        DatabaseSessionHandler.class));
    }

    public static final Object CONST_class = "Illuminate\\Session\\DatabaseSessionHandler";

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
                    .setName("Illuminate\\Session\\DatabaseSessionHandler")
                    .setLookup(
                            DatabaseSessionHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("connection", "container", "exists", "minutes", "table")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Session/DatabaseSessionHandler.php")
                    .addInterface("SessionHandlerInterface")
                    .addInterface("Illuminate\\Session\\ExistenceAwareInterface")
                    .addTrait("Illuminate\\Support\\InteractsWithTime")
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
