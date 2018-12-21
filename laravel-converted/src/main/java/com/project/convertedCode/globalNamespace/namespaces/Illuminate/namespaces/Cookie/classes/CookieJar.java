package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cookie.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeClasses.date.DateInterval;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.functions.head;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeInterface;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Cookie.classes.QueueingFactory;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.Cookie;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Carbon;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;
import static com.runtimeconverter.runtime.ZVal.assignParameterVarArgs;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Cookie/CookieJar.php

*/

public class CookieJar extends RuntimeClassBase implements QueueingFactory {

    public Object path = "/";

    public Object domain = null;

    public Object secure = false;

    public Object sameSite = null;

    public Object queued = ZVal.newArray();

    public CookieJar(RuntimeEnv env, Object... args) {
        super(env);
    }

    public CookieJar(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(
        index = 2,
        name = "minutes",
        defaultValue = "0",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 3,
        name = "path",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "domain",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "secure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "httpOnly",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 7,
        name = "raw",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 8,
        name = "sameSite",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object make(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object minutes = assignParameter(args, 2, true);
        if (null == minutes) {
            minutes = 0;
        }
        Object path = assignParameter(args, 3, true);
        if (null == path) {
            path = ZVal.getNull();
        }
        Object domain = assignParameter(args, 4, true);
        if (null == domain) {
            domain = ZVal.getNull();
        }
        Object secure = assignParameter(args, 5, true);
        if (null == secure) {
            secure = ZVal.getNull();
        }
        Object httpOnly = assignParameter(args, 6, true);
        if (null == httpOnly) {
            httpOnly = true;
        }
        Object raw = assignParameter(args, 7, true);
        if (null == raw) {
            raw = false;
        }
        Object sameSite = assignParameter(args, 8, true);
        if (null == sameSite) {
            sameSite = ZVal.getNull();
        }
        Object runtimeTempArrayResult16 = null;
        Object time = null;
        ZVal.list(
                runtimeTempArrayResult16 =
                        this.getPathAndDomain(env, path, domain, secure, sameSite),
                (path = listGet(runtimeTempArrayResult16, 0, env)),
                (domain = listGet(runtimeTempArrayResult16, 1, env)),
                (secure = listGet(runtimeTempArrayResult16, 2, env)),
                (sameSite = listGet(runtimeTempArrayResult16, 3, env)));
        time =
                ZVal.assign(
                        ZVal.equalityCheck(minutes, 0)
                                ? 0
                                : this.availableAt(env, ZVal.multiply(minutes, 60)));
        return ZVal.assign(
                new Cookie(env, name, value, time, path, domain, secure, httpOnly, raw, sameSite));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(
        index = 2,
        name = "path",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "domain",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "secure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "httpOnly",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "raw",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 7,
        name = "sameSite",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object forever(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object path = assignParameter(args, 2, true);
        if (null == path) {
            path = ZVal.getNull();
        }
        Object domain = assignParameter(args, 3, true);
        if (null == domain) {
            domain = ZVal.getNull();
        }
        Object secure = assignParameter(args, 4, true);
        if (null == secure) {
            secure = ZVal.getNull();
        }
        Object httpOnly = assignParameter(args, 5, true);
        if (null == httpOnly) {
            httpOnly = true;
        }
        Object raw = assignParameter(args, 6, true);
        if (null == raw) {
            raw = false;
        }
        Object sameSite = assignParameter(args, 7, true);
        if (null == sameSite) {
            sameSite = ZVal.getNull();
        }
        return ZVal.assign(
                this.make(
                        env, name, value, 2628000, path, domain, secure, httpOnly, raw, sameSite));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "path",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "domain",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object forget(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, true);
        if (null == path) {
            path = ZVal.getNull();
        }
        Object domain = assignParameter(args, 2, true);
        if (null == domain) {
            domain = ZVal.getNull();
        }
        return ZVal.assign(this.make(env, name, ZVal.getNull(), -2628000, path, domain));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object hasQueued(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(!function_is_null.f.env(env).call(this.queued(env, key)).getBool());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object queued(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        return ZVal.assign(Arr.runtimeStaticObject.get(env, this.queued, key, _pDefault));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters")
    public Object queue(RuntimeEnv env, Object... args) {
        Object parameters = assignParameterVarArgs(args, 0);
        Object cookie = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        head.f.env(env).call(parameters).value(),
                        Cookie.class,
                        "Symfony\\Component\\HttpFoundation\\Cookie"))) {
            cookie = head.f.env(env).call(parameters).value();

        } else {
            cookie =
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    ZVal.newArray(new ZPair(0, this), new ZPair(1, "make")),
                                    parameters)
                            .value();
        }

        new ReferenceClassProperty(this, "queued", env)
                .arrayAccess(env, env.callMethod(cookie, "getName", CookieJar.class))
                .set(cookie);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object unqueue(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        arrayActionR(ArrayAction.UNSET, new ReferenceClassProperty(this, "queued", env), env, name);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "domain")
    @ConvertedParameter(
        index = 2,
        name = "secure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "sameSite",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object getPathAndDomain(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object domain = assignParameter(args, 1, false);
        Object secure = assignParameter(args, 2, true);
        if (null == secure) {
            secure = ZVal.getNull();
        }
        Object sameSite = assignParameter(args, 3, true);
        if (null == sameSite) {
            sameSite = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.isTrue(ternaryExpressionTemp = path)
                                        ? ternaryExpressionTemp
                                        : this.path),
                        new ZPair(
                                1,
                                ZVal.isTrue(ternaryExpressionTemp = domain)
                                        ? ternaryExpressionTemp
                                        : this.domain),
                        new ZPair(
                                2,
                                function_is_bool.f.env(env).call(secure).getBool()
                                        ? secure
                                        : this.secure),
                        new ZPair(
                                3,
                                ZVal.isTrue(ternaryExpressionTemp = sameSite)
                                        ? ternaryExpressionTemp
                                        : this.sameSite)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "domain")
    @ConvertedParameter(
        index = 2,
        name = "secure",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "sameSite",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setDefaultPathAndDomain(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object domain = assignParameter(args, 1, false);
        Object secure = assignParameter(args, 2, true);
        if (null == secure) {
            secure = false;
        }
        Object sameSite = assignParameter(args, 3, true);
        if (null == sameSite) {
            sameSite = ZVal.getNull();
        }
        Object runtimeTempArrayResult17 = null;
        ZVal.list(
                runtimeTempArrayResult17 =
                        ZVal.newArray(
                                new ZPair(0, path),
                                new ZPair(1, domain),
                                new ZPair(2, secure),
                                new ZPair(3, sameSite)),
                (this.path = listGet(runtimeTempArrayResult17, 0, env)),
                (this.domain = listGet(runtimeTempArrayResult17, 1, env)),
                (this.secure = listGet(runtimeTempArrayResult17, 2, env)),
                (this.sameSite = listGet(runtimeTempArrayResult17, 3, env)));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getQueuedCookies(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.queued);
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
                                                        delay, "getTimestamp", CookieJar.class),
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
                        ? env.callMethod(delay, "getTimestamp", CookieJar.class)
                        : env.callMethod(
                                env.callMethod(
                                        Carbon.runtimeStaticObject.now(env),
                                        "addSeconds",
                                        CookieJar.class,
                                        delay),
                                "getTimestamp",
                                CookieJar.class));
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
                            CookieJar.class,
                            delay.getObject()));
        }

        return ZVal.assign(delay.getObject());
    }

    @ConvertedMethod
    protected Object currentTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        Carbon.runtimeStaticObject.now(env), "getTimestamp", CookieJar.class));
    }

    public static final Object CONST_class = "Illuminate\\Cookie\\CookieJar";

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
                    .setName("Illuminate\\Cookie\\CookieJar")
                    .setLookup(
                            CookieJar.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("domain", "path", "queued", "sameSite", "secure")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Cookie/CookieJar.php")
                    .addInterface("Illuminate\\Contracts\\Cookie\\QueueingFactory")
                    .addInterface("Illuminate\\Contracts\\Cookie\\Factory")
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
