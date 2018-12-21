package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeInterfaces.SessionHandlerInterface;
import com.runtimeconverter.runtime.nativeClasses.date.DateInterval;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Carbon;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeInterface;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Session/CookieSessionHandler.php

*/

public class CookieSessionHandler extends RuntimeClassBase implements SessionHandlerInterface {

    public Object cookie = null;

    public Object request = null;

    public Object minutes = null;

    public CookieSessionHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CookieSessionHandler.class) {
            this.__construct(env, args);
        }
    }

    public CookieSessionHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "cookie",
        typeHint = "Illuminate\\Contracts\\Cookie\\QueueingFactory"
    )
    @ConvertedParameter(index = 1, name = "minutes")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object cookie = assignParameter(args, 0, false);
        Object minutes = assignParameter(args, 1, false);
        this.cookie = cookie;
        this.minutes = minutes;
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
        ReferenceContainer decoded = new BasicReferenceContainer(null);
        Object ternaryExpressionTemp = null;
        Object value = null;
        value =
                ZVal.assign(
                        ZVal.isTrue(
                                        ternaryExpressionTemp =
                                                env.callMethod(
                                                        toObjectR(this.request)
                                                                .accessProp(this, env)
                                                                .name("cookies")
                                                                .value(),
                                                        "get",
                                                        CookieSessionHandler.class,
                                                        sessionId))
                                ? ternaryExpressionTemp
                                : "");
        if (ZVal.toBool(
                        !function_is_null
                                .f
                                .env(env)
                                .call(
                                        decoded.setObject(
                                                NamespaceGlobal.json_decode
                                                        .env(env)
                                                        .call(value, true)
                                                        .value()))
                                .getBool())
                && ZVal.toBool(function_is_array.f.env(env).call(decoded.getObject()).value())) {
            if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, decoded, env, "expires"))
                    && ZVal.toBool(
                            ZVal.isLessThanOrEqualTo(
                                    this.currentTime(env),
                                    "<=",
                                    decoded.arrayGet(env, "expires")))) {
                return ZVal.assign(decoded.arrayGet(env, "data"));
            }
        }

        return "";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    @ConvertedParameter(index = 1, name = "data")
    public Object write(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        env.callMethod(
                this.cookie,
                "queue",
                CookieSessionHandler.class,
                sessionId,
                NamespaceGlobal.json_encode
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair("data", data),
                                        new ZPair(
                                                "expires",
                                                this.availableAt(
                                                        env, ZVal.multiply(this.minutes, 60)))))
                        .value(),
                this.minutes);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    public Object destroy(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        env.callMethod(
                this.cookie,
                "queue",
                CookieSessionHandler.class,
                env.callMethod(this.cookie, "forget", CookieSessionHandler.class, sessionId));
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "lifetime")
    public Object gc(RuntimeEnv env, Object... args) {
        Object lifetime = assignParameter(args, 0, false);
        return ZVal.assign(true);
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
        return null;
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
                                                        CookieSessionHandler.class),
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
                        ? env.callMethod(delay, "getTimestamp", CookieSessionHandler.class)
                        : env.callMethod(
                                env.callMethod(
                                        Carbon.runtimeStaticObject.now(env),
                                        "addSeconds",
                                        CookieSessionHandler.class,
                                        delay),
                                "getTimestamp",
                                CookieSessionHandler.class));
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
                            CookieSessionHandler.class,
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
                        CookieSessionHandler.class));
    }

    public static final Object CONST_class = "Illuminate\\Session\\CookieSessionHandler";

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
                    .setName("Illuminate\\Session\\CookieSessionHandler")
                    .setLookup(
                            CookieSessionHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("cookie", "minutes", "request")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Session/CookieSessionHandler.php")
                    .addInterface("SessionHandlerInterface")
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
