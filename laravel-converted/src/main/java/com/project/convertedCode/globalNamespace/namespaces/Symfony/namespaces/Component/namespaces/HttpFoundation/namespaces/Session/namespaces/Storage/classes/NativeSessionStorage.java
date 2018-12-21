package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_error_handler;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeClasses.errors.ErrorException;
import com.runtimeconverter.runtime.nativeFunctions.http.function_session_status;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.namespaces.Proxy.classes.SessionHandlerProxy;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.classes.MetadataBag;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_set;
import com.runtimeconverter.runtime.nativeFunctions.http.function_session_write_close;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_error_handler;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeClasses.otherProxyClasses.SessionHandler;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.classes.SessionStorageInterface;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.namespaces.Handler.classes.StrictSessionHandler;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_flip;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.http.function_session_regenerate_id;
import com.runtimeconverter.runtime.nativeFunctions.http.function_session_set_save_handler;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.namespaces.Proxy.classes.AbstractProxy;
import com.runtimeconverter.runtime.nativeInterfaces.SessionHandlerInterface;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.http.function_session_register_shutdown;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.http.function_session_start;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/Session/Storage/NativeSessionStorage.php

*/

public class NativeSessionStorage extends RuntimeClassBase implements SessionStorageInterface {

    public Object bags = ZVal.newArray();

    public Object started = false;

    public Object closed = false;

    public Object saveHandler = null;

    public Object metadataBag = null;

    public NativeSessionStorage(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == NativeSessionStorage.class) {
            this.__construct(env, args);
        }
    }

    public NativeSessionStorage(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 1,
        name = "handler",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "metaBag",
        typeHint = "Symfony\\Component\\HttpFoundation\\Session\\Storage\\MetadataBag",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object handler = assignParameter(args, 1, true);
        if (null == handler) {
            handler = ZVal.getNull();
        }
        Object metaBag = assignParameter(args, 2, true);
        if (null == metaBag) {
            metaBag = ZVal.getNull();
        }
        options =
                ZAssignment.add(
                        "+=",
                        options,
                        ZVal.newArray(
                                new ZPair("cache_limiter", ""),
                                new ZPair("cache_expire", 0),
                                new ZPair("use_cookies", 1),
                                new ZPair("lazy_write", 1),
                                new ZPair("use_strict_mode", 1)));
        function_session_register_shutdown.f.env(env).call();
        this.setMetadataBag(env, metaBag);
        this.setOptions(env, options);
        this.setSaveHandler(env, handler);
        return null;
    }

    @ConvertedMethod
    public Object getSaveHandler(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.saveHandler);
    }

    @ConvertedMethod
    public Object start(RuntimeEnv env, Object... args) {
        ReferenceContainer file = new BasicReferenceContainer(null);
        ReferenceContainer line = new BasicReferenceContainer(null);
        if (ZVal.isTrue(this.started)) {
            return ZVal.assign(true);
        }

        if (ZVal.strictEqualityCheck(2, "===", function_session_status.f.env(env).call().value())) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env, "Failed to start the session: already started by PHP."));
        }

        if (ZVal.toBool(function_ini_get.f.env(env).call("session.use_cookies").value())
                && ZVal.toBool(
                        NamespaceGlobal.headers_sent
                                .env(env)
                                .addReferenceArgs(
                                        new RuntimeArgsWithReferences().add(0, file).add(1, line))
                                .call(file.getObject(), line.getObject())
                                .value())) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Failed to start the session because headers have already been sent by \"%s\" at line %d.",
                                            file.getObject(), line.getObject())
                                    .value()));
        }

        if (!function_session_start.f.env(env).call().getBool()) {
            throw ZVal.getException(env, new RuntimeException(env, "Failed to start the session"));
        }

        env.callMethod(this, "loadSession", NativeSessionStorage.class);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.saveHandler, "getId", NativeSessionStorage.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    public Object setId(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        env.callMethod(this.saveHandler, "setId", NativeSessionStorage.class, id);
        return null;
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.saveHandler, "getName", NativeSessionStorage.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        env.callMethod(this.saveHandler, "setName", NativeSessionStorage.class, name);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "destroy",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "lifetime",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object regenerate(RuntimeEnv env, Object... args) {
        Object destroy = assignParameter(args, 0, true);
        if (null == destroy) {
            destroy = false;
        }
        Object lifetime = assignParameter(args, 1, true);
        if (null == lifetime) {
            lifetime = ZVal.getNull();
        }
        Object isRegenerated = null;
        if (ZVal.strictNotEqualityCheck(
                2, "!==", function_session_status.f.env(env).call().value())) {
            return ZVal.assign(false);
        }

        if (NamespaceGlobal.headers_sent.env(env).call().getBool()) {
            return ZVal.assign(false);
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", lifetime)) {
            function_ini_set.f.env(env).call("session.cookie_lifetime", lifetime);
        }

        if (ZVal.isTrue(destroy)) {
            env.callMethod(this.metadataBag, "stampNew", NativeSessionStorage.class);
        }

        isRegenerated = function_session_regenerate_id.f.env(env).call(destroy).value();
        env.callMethod(this, "loadSession", NativeSessionStorage.class);
        return ZVal.assign(isRegenerated);
    }

    @ConvertedMethod
    public Object save(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/http-foundation/Session/Storage")
                        .setFile(
                                "/vendor/symfony/http-foundation/Session/Storage/NativeSessionStorage.php");
        Object handler = null;
        Object e = null;
        Object session = null;
        Object bag = null;
        ReferenceContainer _SESSION = new GlobalVariableReference(env, "_SESSION");
        Object key = null;
        session = ZVal.assign(_SESSION.getObject());
        for (ZPair zpairResult1893 : ZVal.getIterable(this.bags, env, true)) {
            bag = ZVal.assign(zpairResult1893.getValue());
            if (arrayActionR(
                    ArrayAction.EMPTY,
                    _SESSION,
                    env,
                    key = env.callMethod(bag, "getStorageKey", NativeSessionStorage.class))) {
                arrayActionR(ArrayAction.UNSET, _SESSION, env, key);
            }
        }

        if (ZVal.strictEqualityCheck(
                ZVal.newArray(
                        new ZPair(
                                0,
                                key =
                                        env.callMethod(
                                                this.metadataBag,
                                                "getStorageKey",
                                                NativeSessionStorage.class))),
                "===",
                function_array_keys.f.env(env).call(_SESSION.getObject()).value())) {
            arrayActionR(ArrayAction.UNSET, _SESSION, env, key);
        }

        function_set_error_handler
                .f
                .env(env)
                .call(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Symfony\\Component\\HttpFoundation\\Session\\Storage",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "errno")
                            @ConvertedParameter(index = 1, name = "errstr")
                            @ConvertedParameter(index = 2, name = "errfile")
                            @ConvertedParameter(index = 3, name = "errline")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object errno = assignParameter(args, 0, false);
                                Object errstr = assignParameter(args, 1, false);
                                Object errfile = assignParameter(args, 2, false);
                                Object errline = assignParameter(args, 3, false);
                                throw ZVal.getException(
                                        env,
                                        new ErrorException(
                                                env, errstr, errno, 2, errfile, errline));
                            }
                        },
                        2);
        try {
            e = ZVal.getNull();
            function_session_write_close.f.env(env).call();
        } catch (ConvertedException convertedException269) {
            if (convertedException269.instanceOf(ErrorException.class, "ErrorException")) {
                e = convertedException269.getObject();
            } else {
                throw convertedException269;
            }
        } finally {
            function_restore_error_handler.f.env(env).call();
            _SESSION.setObject(ZVal.assign(session));
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", e)) {
            handler = this.getSaveHandler(env);
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            handler,
                            SessionHandlerProxy.class,
                            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Proxy\\SessionHandlerProxy"))) {
                handler = env.callMethod(handler, "getHandler", NativeSessionStorage.class);
            }

            NamespaceGlobal.trigger_error
                    .env(env)
                    .call(
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "session_write_close(): Failed to write session data with %s handler",
                                            function_get_class.f.env(env).call(handler).value())
                                    .value(),
                            512);
        }

        this.closed = true;
        this.started = false;
        return null;
    }

    @ConvertedMethod
    public Object clear(RuntimeEnv env, Object... args) {
        Object bag = null;
        ReferenceContainer _SESSION = new GlobalVariableReference(env, "_SESSION");
        for (ZPair zpairResult1894 : ZVal.getIterable(this.bags, env, true)) {
            bag = ZVal.assign(zpairResult1894.getValue());
            env.callMethod(bag, "clear", NativeSessionStorage.class);
        }

        _SESSION.setObject(ZVal.newArray());
        env.callMethod(this, "loadSession", NativeSessionStorage.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "bag",
        typeHint = "Symfony\\Component\\HttpFoundation\\Session\\SessionBagInterface"
    )
    public Object registerBag(RuntimeEnv env, Object... args) {
        Object bag = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.started)) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env, "Cannot register a bag when the session is already started."));
        }

        new ReferenceClassProperty(this, "bags", env)
                .arrayAccess(env, env.callMethod(bag, "getName", NativeSessionStorage.class))
                .set(bag);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getBag(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (!arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "bags", env), env, name)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("The SessionBagInterface %s is not registered.", name)
                                    .value()));
        }

        if (ZVal.toBool(!ZVal.isTrue(this.started))
                && ZVal.toBool(
                        env.callMethod(this.saveHandler, "isActive", NativeSessionStorage.class))) {
            env.callMethod(this, "loadSession", NativeSessionStorage.class);

        } else if (!ZVal.isTrue(this.started)) {
            this.start(env);
        }

        return ZVal.assign(new ReferenceClassProperty(this, "bags", env).arrayGet(env, name));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "metaBag",
        typeHint = "Symfony\\Component\\HttpFoundation\\Session\\Storage\\MetadataBag",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setMetadataBag(RuntimeEnv env, Object... args) {
        Object metaBag = assignParameter(args, 0, true);
        if (null == metaBag) {
            metaBag = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", metaBag)) {
            metaBag = new MetadataBag(env);
        }

        this.metadataBag = metaBag;
        return null;
    }

    @ConvertedMethod
    public Object getMetadataBag(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.metadataBag);
    }

    @ConvertedMethod
    public Object isStarted(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.started);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options", typeHint = "array")
    public Object setOptions(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, false);
        ReferenceContainer validOptions = new BasicReferenceContainer(null);
        Object value = null;
        Object key = null;
        if (ZVal.toBool(NamespaceGlobal.headers_sent.env(env).call().value())
                || ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                2, "===", function_session_status.f.env(env).call().value()))) {
            return null;
        }

        validOptions.setObject(
                function_array_flip
                        .f
                        .env(env)
                        .call(
                                ZVal.arrayFromLambdaExpression(
                                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                                        () -> {
                                            return ZVal.arrayFromList(
                                                    "cache_expire",
                                                    "cache_limiter",
                                                    "cookie_domain",
                                                    "cookie_httponly",
                                                    "cookie_lifetime",
                                                    "cookie_path",
                                                    "cookie_secure",
                                                    "gc_divisor",
                                                    "gc_maxlifetime",
                                                    "gc_probability",
                                                    "lazy_write",
                                                    "name",
                                                    "referer_check",
                                                    "serialize_handler",
                                                    "use_strict_mode",
                                                    "use_cookies",
                                                    "use_only_cookies",
                                                    "use_trans_sid",
                                                    "upload_progress.enabled",
                                                    "upload_progress.cleanup",
                                                    "upload_progress.prefix",
                                                    "upload_progress.name",
                                                    "upload_progress.freq",
                                                    "upload_progress.min_freq",
                                                    "url_rewriter.tags",
                                                    "sid_length",
                                                    "sid_bits_per_character",
                                                    "trans_sid_hosts",
                                                    "trans_sid_tags");
                                        }))
                        .value());
        for (ZPair zpairResult1895 : ZVal.getIterable(options, env, false)) {
            key = ZVal.assign(zpairResult1895.getKey());
            value = ZVal.assign(zpairResult1895.getValue());
            if (arrayActionR(ArrayAction.ISSET, validOptions, env, key)) {
                function_ini_set
                        .f
                        .env(env)
                        .call(
                                ZVal.strictNotEqualityCheck("url_rewriter.tags", "!==", key)
                                        ? "session." + toStringR(key, env)
                                        : key,
                                value);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "saveHandler",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setSaveHandler(RuntimeEnv env, Object... args) {
        Object saveHandler = assignParameter(args, 0, true);
        if (null == saveHandler) {
            saveHandler = ZVal.getNull();
        }
        if (ZVal.toBool(
                        ZVal.toBool(
                                        !ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        saveHandler,
                                                        AbstractProxy.class,
                                                        "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Proxy\\AbstractProxy")))
                                && ZVal.toBool(
                                        !ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        saveHandler,
                                                        SessionHandlerInterface.class,
                                                        "SessionHandlerInterface"))))
                && ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", saveHandler))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Must be instance of AbstractProxy; implement \\SessionHandlerInterface; or be null."));
        }

        if (ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        saveHandler,
                                        AbstractProxy.class,
                                        "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Proxy\\AbstractProxy")))
                && ZVal.toBool(
                        ZVal.checkInstanceType(
                                saveHandler,
                                SessionHandlerInterface.class,
                                "SessionHandlerInterface"))) {
            saveHandler = new SessionHandlerProxy(env, saveHandler);

        } else if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        saveHandler,
                        AbstractProxy.class,
                        "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Proxy\\AbstractProxy"))) {
            saveHandler =
                    new SessionHandlerProxy(
                            env, new StrictSessionHandler(env, new SessionHandler(env)));
        }

        this.saveHandler = saveHandler;
        if (ZVal.toBool(NamespaceGlobal.headers_sent.env(env).call().value())
                || ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                2, "===", function_session_status.f.env(env).call().value()))) {
            return null;
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        this.saveHandler,
                        SessionHandlerProxy.class,
                        "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Proxy\\SessionHandlerProxy"))) {
            function_session_set_save_handler
                    .f
                    .env(env)
                    .call(
                            env.callMethod(
                                    this.saveHandler, "getHandler", NativeSessionStorage.class),
                            false);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        this.saveHandler,
                        SessionHandlerInterface.class,
                        "SessionHandlerInterface"))) {
            function_session_set_save_handler.f.env(env).call(this.saveHandler, false);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "session",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object loadSession(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer session = assignParameterRef(runtimePassByReferenceArgs, args, 0, true);
        if (null == session.getObject()) {
            session.setObject(ZVal.getNull());
        }
        Object bags = null;
        Object bag = null;
        ReferenceContainer _SESSION = new GlobalVariableReference(env, "_SESSION");
        Object key = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", session.getObject())) {
            session = _SESSION;
        }

        bags =
                function_array_merge
                        .f
                        .env(env)
                        .call(this.bags, ZVal.newArray(new ZPair(0, this.metadataBag)))
                        .value();
        for (ZPair zpairResult1896 : ZVal.getIterable(bags, env, true)) {
            bag = ZVal.assign(zpairResult1896.getValue());
            key = env.callMethod(bag, "getStorageKey", NativeSessionStorage.class);
            session.arrayAccess(env, key)
                    .set(
                            arrayActionR(ArrayAction.ISSET, session, env, key)
                                    ? session.arrayGet(env, key)
                                    : ZVal.newArray());
            env.callMethod(
                    bag,
                    new RuntimeArgsWithReferences()
                            .add(0, new ArrayDimensionReference(session.getObject(), key)),
                    "initialize",
                    NativeSessionStorage.class,
                    session.arrayGet(env, key));
        }

        this.started = true;
        this.closed = false;
        return null;
    }

    public Object loadSession(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\NativeSessionStorage";

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
                    .setName(
                            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\NativeSessionStorage")
                    .setLookup(
                            NativeSessionStorage.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bags", "closed", "metadataBag", "saveHandler", "started")
                    .setFilename(
                            "vendor/symfony/http-foundation/Session/Storage/NativeSessionStorage.php")
                    .addInterface(
                            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\SessionStorageInterface")
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
