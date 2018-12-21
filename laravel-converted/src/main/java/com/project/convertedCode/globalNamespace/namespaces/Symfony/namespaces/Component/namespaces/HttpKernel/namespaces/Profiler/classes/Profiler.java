package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Profiler.classes;

import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Exception.classes.ConflictingHeadersException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DataCollector.classes.LateDataCollectorInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Profiler.classes.Profile;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Profiler/Profiler.php

*/

public class Profiler extends RuntimeClassBase {

    public Object storage = null;

    public Object collectors = ZVal.newArray();

    public Object logger = null;

    public Object initiallyEnabled = true;

    public Object enabled = true;

    public Profiler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Profiler.class) {
            this.__construct(env, args);
        }
    }

    public Profiler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "storage",
        typeHint = "Symfony\\Component\\HttpKernel\\Profiler\\ProfilerStorageInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "logger",
        typeHint = "Psr\\Log\\LoggerInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "enable",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object storage = assignParameter(args, 0, false);
        Object logger = assignParameter(args, 1, true);
        if (null == logger) {
            logger = ZVal.getNull();
        }
        Object enable = assignParameter(args, 2, true);
        if (null == enable) {
            enable = true;
        }
        this.storage = storage;
        this.logger = logger;
        this.initiallyEnabled = this.enabled = enable;
        return null;
    }

    @ConvertedMethod
    public Object disable(RuntimeEnv env, Object... args) {
        this.enabled = false;
        return null;
    }

    @ConvertedMethod
    public Object enable(RuntimeEnv env, Object... args) {
        this.enabled = true;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "response",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response"
    )
    public Object loadProfileFromResponse(RuntimeEnv env, Object... args) {
        Object response = assignParameter(args, 0, false);
        Object token = null;
        if (!ZVal.isTrue(
                token =
                        env.callMethod(
                                toObjectR(response).accessProp(this, env).name("headers").value(),
                                "get",
                                Profiler.class,
                                "X-Debug-Token"))) {
            return ZVal.assign(false);
        }

        return ZVal.assign(this.loadProfile(env, token));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token")
    public Object loadProfile(RuntimeEnv env, Object... args) {
        Object token = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this.storage, "read", Profiler.class, token));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "profile",
        typeHint = "Symfony\\Component\\HttpKernel\\Profiler\\Profile"
    )
    public Object saveProfile(RuntimeEnv env, Object... args) {
        Object profile = assignParameter(args, 0, false);
        Object ret = null;
        Object collector = null;
        for (ZPair zpairResult1984 :
                ZVal.getIterable(
                        env.callMethod(profile, "getCollectors", Profiler.class), env, true)) {
            collector = ZVal.assign(zpairResult1984.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            collector,
                            LateDataCollectorInterface.class,
                            "Symfony\\Component\\HttpKernel\\DataCollector\\LateDataCollectorInterface"))) {
                env.callMethod(collector, "lateCollect", Profiler.class);
            }
        }

        if (ZVal.toBool(
                        !ZVal.isTrue(
                                ret =
                                        env.callMethod(
                                                this.storage, "write", Profiler.class, profile)))
                && ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.logger))) {
            env.callMethod(
                    this.logger,
                    "warning",
                    Profiler.class,
                    "Unable to store the profiler information.",
                    ZVal.newArray(
                            new ZPair(
                                    "configured_storage",
                                    function_get_class.f.env(env).call(this.storage).value())));
        }

        return ZVal.assign(ret);
    }

    @ConvertedMethod
    public Object purge(RuntimeEnv env, Object... args) {
        env.callMethod(this.storage, "purge", Profiler.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ip")
    @ConvertedParameter(index = 1, name = "url")
    @ConvertedParameter(index = 2, name = "limit")
    @ConvertedParameter(index = 3, name = "method")
    @ConvertedParameter(index = 4, name = "start")
    @ConvertedParameter(index = 5, name = "end")
    @ConvertedParameter(
        index = 6,
        name = "statusCode",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object find(RuntimeEnv env, Object... args) {
        Object ip = assignParameter(args, 0, false);
        Object url = assignParameter(args, 1, false);
        Object limit = assignParameter(args, 2, false);
        Object method = assignParameter(args, 3, false);
        Object start = assignParameter(args, 4, false);
        Object end = assignParameter(args, 5, false);
        Object statusCode = assignParameter(args, 6, true);
        if (null == statusCode) {
            statusCode = ZVal.getNull();
        }
        return ZVal.assign(
                env.callMethod(
                        this.storage,
                        "find",
                        Profiler.class,
                        ip,
                        url,
                        limit,
                        method,
                        this.getTimestamp(env, start),
                        this.getTimestamp(env, end),
                        statusCode));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(
        index = 1,
        name = "response",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response"
    )
    @ConvertedParameter(
        index = 2,
        name = "exception",
        typeHint = "Exception",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object collect(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object response = assignParameter(args, 1, false);
        Object exception = assignParameter(args, 2, true);
        if (null == exception) {
            exception = ZVal.getNull();
        }
        Object e = null;
        Object profile = null;
        Object prevToken = null;
        Object collector = null;
        if (ZVal.strictEqualityCheck(false, "===", this.enabled)) {
            return null;
        }

        profile =
                new Profile(
                        env,
                        function_substr
                                .f
                                .env(env)
                                .call(
                                        NamespaceGlobal.hash
                                                .env(env)
                                                .call(
                                                        "sha256",
                                                        NamespaceGlobal.uniqid
                                                                .env(env)
                                                                .call(
                                                                        NamespaceGlobal.mt_rand
                                                                                .env(env)
                                                                                .call()
                                                                                .value(),
                                                                        true)
                                                                .value())
                                                .value(),
                                        0,
                                        6)
                                .value());
        env.callMethod(
                profile, "setTime", Profiler.class, NamespaceGlobal.time.env(env).call().value());
        env.callMethod(
                profile,
                "setUrl",
                Profiler.class,
                env.callMethod(request, "getUri", Profiler.class));
        env.callMethod(
                profile,
                "setMethod",
                Profiler.class,
                env.callMethod(request, "getMethod", Profiler.class));
        env.callMethod(
                profile,
                "setStatusCode",
                Profiler.class,
                env.callMethod(response, "getStatusCode", Profiler.class));
        try {
            env.callMethod(
                    profile,
                    "setIp",
                    Profiler.class,
                    env.callMethod(request, "getClientIp", Profiler.class));
        } catch (ConvertedException convertedException298) {
            if (convertedException298.instanceOf(
                    ConflictingHeadersException.class,
                    "Symfony\\Component\\HttpFoundation\\Exception\\ConflictingHeadersException")) {
                e = convertedException298.getObject();
                env.callMethod(profile, "setIp", Profiler.class, "Unknown");
            } else {
                throw convertedException298;
            }
        }

        if (ZVal.isTrue(
                prevToken =
                        env.callMethod(
                                toObjectR(response).accessProp(this, env).name("headers").value(),
                                "get",
                                Profiler.class,
                                "X-Debug-Token"))) {
            env.callMethod(
                    toObjectR(response).accessProp(this, env).name("headers").value(),
                    "set",
                    Profiler.class,
                    "X-Previous-Debug-Token",
                    prevToken);
        }

        env.callMethod(
                toObjectR(response).accessProp(this, env).name("headers").value(),
                "set",
                Profiler.class,
                "X-Debug-Token",
                env.callMethod(profile, "getToken", Profiler.class));
        for (ZPair zpairResult1985 : ZVal.getIterable(this.collectors, env, true)) {
            collector = ZVal.assign(zpairResult1985.getValue());
            env.callMethod(collector, "collect", Profiler.class, request, response, exception);
            env.callMethod(
                    profile,
                    "addCollector",
                    Profiler.class,
                    ((RuntimeClassInterface) collector).phpClone(env));
        }

        return ZVal.assign(profile);
    }

    @ConvertedMethod
    public Object reset(RuntimeEnv env, Object... args) {
        Object collector = null;
        for (ZPair zpairResult1986 : ZVal.getIterable(this.collectors, env, true)) {
            collector = ZVal.assign(zpairResult1986.getValue());
            env.callMethod(collector, "reset", Profiler.class);
        }

        this.enabled = this.initiallyEnabled;
        return null;
    }

    @ConvertedMethod
    public Object all(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.collectors);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "collectors",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object set(RuntimeEnv env, Object... args) {
        Object collectors = assignParameter(args, 0, true);
        if (null == collectors) {
            collectors = ZVal.newArray();
        }
        Object collector = null;
        this.collectors = ZVal.newArray();
        for (ZPair zpairResult1987 : ZVal.getIterable(collectors, env, true)) {
            collector = ZVal.assign(zpairResult1987.getValue());
            this.add(env, collector);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "collector",
        typeHint = "Symfony\\Component\\HttpKernel\\DataCollector\\DataCollectorInterface"
    )
    public Object add(RuntimeEnv env, Object... args) {
        Object collector = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "collectors", env)
                .arrayAccess(env, env.callMethod(collector, "getName", Profiler.class))
                .set(collector);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object has(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "collectors", env),
                        env,
                        name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object get(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "collectors", env),
                env,
                name)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Collector \"%s\" does not exist.", name)
                                    .value()));
        }

        return ZVal.assign(new ReferenceClassProperty(this, "collectors", env).arrayGet(env, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    private Object getTimestamp(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object e = null;
        if (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", value))
                || ZVal.toBool(ZVal.equalityCheck("", value))) {
            return null;
        }

        try {
            value =
                    new DateTime(
                            env,
                            function_is_numeric.f.env(env).call(value).getBool()
                                    ? "@" + toStringR(value, env)
                                    : value);
        } catch (ConvertedException convertedException299) {
            if (convertedException299.instanceOf(PHPException.class, "Exception")) {
                e = convertedException299.getObject();
                return null;
            } else {
                throw convertedException299;
            }
        }

        return ZVal.assign(env.callMethod(value, "getTimestamp", Profiler.class));
    }

    public static final Object CONST_class = "Symfony\\Component\\HttpKernel\\Profiler\\Profiler";

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
                    .setName("Symfony\\Component\\HttpKernel\\Profiler\\Profiler")
                    .setLookup(
                            Profiler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "collectors", "enabled", "initiallyEnabled", "logger", "storage")
                    .setFilename("vendor/symfony/http-kernel/Profiler/Profiler.php")
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
