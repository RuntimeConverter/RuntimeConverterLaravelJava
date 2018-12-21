package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Cache.classes.Store;
import com.runtimeconverter.runtime.nativeClasses.date.DateInterval;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeInterface;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Carbon;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Cache/FileStore.php

*/

public class FileStore extends RuntimeClassBase implements Store {

    public Object files = null;

    public Object directory = null;

    public FileStore(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FileStore.class) {
            this.__construct(env, args);
        }
    }

    public FileStore(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "files", typeHint = "Illuminate\\Filesystem\\Filesystem")
    @ConvertedParameter(index = 1, name = "directory")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object files = assignParameter(args, 0, false);
        Object directory = assignParameter(args, 1, false);
        this.files = files;
        this.directory = directory;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object get(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        handleReturnReference(this.getPayload(env, key))
                                                .arrayGet(env, "data"))
                        ? ternaryExpressionTemp
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "minutes")
    public Object put(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object minutes = assignParameter(args, 2, false);
        Object path = null;
        this.ensureCacheDirectoryExists(env, path = this.path(env, key));
        env.callMethod(
                this.files,
                "put",
                FileStore.class,
                path,
                toStringR(this.expiration(env, minutes), env)
                        + toStringR(function_serialize.f.env(env).call(value).value(), env),
                true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    protected Object ensureCacheDirectoryExists(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        if (!ZVal.isTrue(
                env.callMethod(
                        this.files,
                        "exists",
                        FileStore.class,
                        function_dirname.f.env(env).call(path).value()))) {
            env.callMethod(
                    this.files,
                    "makeDirectory",
                    FileStore.class,
                    function_dirname.f.env(env).call(path).value(),
                    511,
                    true,
                    true);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object increment(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Cache")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Cache/FileStore.php");
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, true);
        if (null == value) {
            value = 1;
        }
        ReferenceContainer raw = new BasicReferenceContainer(null);
        raw.setObject(this.getPayload(env, key));
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                ZVal.add(ZVal.toLong(raw.arrayGet(env, "data")), value),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Cache",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "newValue")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object newValue = assignParameter(args, 0, false);
                                        ReferenceContainer raw = new BasicReferenceContainer(null);
                                        Object ternaryExpressionTemp = null;
                                        Object key = null;
                                        raw = this.contextReferences.getReferenceContainer("raw");
                                        key = this.contextReferences.getCapturedValue("key");
                                        FileStore.this.put(
                                                env,
                                                key,
                                                newValue,
                                                ZVal.isDefined(
                                                                ternaryExpressionTemp =
                                                                        raw.arrayGet(env, "time"))
                                                        ? ternaryExpressionTemp
                                                        : 0);
                                        return null;
                                    }
                                }.use("raw", raw).use("key", key))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object decrement(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(this.increment(env, key, ZVal.multiply(value, -1)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object forever(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        this.put(env, key, value, 0);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object forget(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object file = null;
        if (ZVal.isTrue(
                env.callMethod(
                        this.files, "exists", FileStore.class, file = this.path(env, key)))) {
            return ZVal.assign(env.callMethod(this.files, "delete", FileStore.class, file));
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object flush(RuntimeEnv env, Object... args) {
        Object directory = null;
        if (!ZVal.isTrue(
                env.callMethod(this.files, "isDirectory", FileStore.class, this.directory))) {
            return ZVal.assign(false);
        }

        for (ZPair zpairResult204 :
                ZVal.getIterable(
                        env.callMethod(this.files, "directories", FileStore.class, this.directory),
                        env,
                        true)) {
            directory = ZVal.assign(zpairResult204.getValue());
            if (!ZVal.isTrue(
                    env.callMethod(this.files, "deleteDirectory", FileStore.class, directory))) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    protected Object getPayload(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope79 scope = new Scope79();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Cache")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Cache/FileStore.php");
            scope.key = assignParameter(args, 0, false);
            scope.path = null;
            scope.data = null;
            scope.e = null;
            scope.contents = null;
            scope.expire = null;
            scope.time = null;
            scope.path = this.path(env, scope.key);
            try {
                scope.expire =
                        function_substr
                                .f
                                .env(env)
                                .call(
                                        scope.contents =
                                                env.callMethod(
                                                        this.files,
                                                        "get",
                                                        FileStore.class,
                                                        scope.path,
                                                        true),
                                        0,
                                        10)
                                .value();
            } catch (ConvertedException convertedException15) {
                if (convertedException15.instanceOf(PHPException.class, "Exception")) {
                    scope.e = convertedException15.getObject();
                    throw new IncludeEventException(ZVal.assign(this.emptyPayload(env)));
                } else {
                    throw convertedException15;
                }
            }

            if (ZVal.isGreaterThanOrEqualTo(this.currentTime(env), ">=", scope.expire)) {
                this.forget(env, scope.key);
                throw new IncludeEventException(ZVal.assign(this.emptyPayload(env)));
            }

            scope.data =
                    function_unserialize
                            .f
                            .env(env)
                            .call(function_substr.f.env(env).call(scope.contents, 10).value())
                            .value();
            scope.time = ZVal.divide(ZVal.subtract(scope.expire, this.currentTime(env)), 60);
            throw new IncludeEventException(
                    ZVal.assign(function_compact.f.env(env).call(stack, "data", "time").value()));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    protected Object emptyPayload(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("data", ZVal.getNull()), new ZPair("time", ZVal.getNull())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    protected Object path(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object parts = null;
        Object hash = null;
        parts =
                function_array_slice
                        .f
                        .env(env)
                        .call(
                                NamespaceGlobal.str_split
                                        .env(env)
                                        .call(
                                                hash =
                                                        NamespaceGlobal.sha1
                                                                .env(env)
                                                                .call(key)
                                                                .value(),
                                                2)
                                        .value(),
                                0,
                                2)
                        .value();
        return ZVal.assign(
                toStringR(this.directory, env)
                        + "/"
                        + toStringR(NamespaceGlobal.implode.env(env).call("/", parts).value(), env)
                        + "/"
                        + toStringR(hash, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "minutes")
    protected Object expiration(RuntimeEnv env, Object... args) {
        Object minutes = assignParameter(args, 0, false);
        Object time = null;
        time = this.availableAt(env, ZVal.toLong(ZVal.multiply(minutes, 60)));
        return ZVal.assign(
                ZVal.toBool(ZVal.strictEqualityCheck(minutes, "===", 0))
                                || ZVal.toBool(ZVal.isGreaterThan(time, '>', 9999999999L))
                        ? 9999999999L
                        : ZVal.toLong(time));
    }

    @ConvertedMethod
    public Object getFilesystem(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.files);
    }

    @ConvertedMethod
    public Object getDirectory(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.directory);
    }

    @ConvertedMethod
    public Object getPrefix(RuntimeEnv env, Object... args) {
        return "";
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
                                                        delay, "getTimestamp", FileStore.class),
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
                        ? env.callMethod(delay, "getTimestamp", FileStore.class)
                        : env.callMethod(
                                env.callMethod(
                                        Carbon.runtimeStaticObject.now(env),
                                        "addSeconds",
                                        FileStore.class,
                                        delay),
                                "getTimestamp",
                                FileStore.class));
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
                            FileStore.class,
                            delay.getObject()));
        }

        return ZVal.assign(delay.getObject());
    }

    @ConvertedMethod
    protected Object currentTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        Carbon.runtimeStaticObject.now(env), "getTimestamp", FileStore.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys", typeHint = "array")
    public Object many(RuntimeEnv env, Object... args) {
        Object keys = assignParameter(args, 0, false);
        ReferenceContainer _pReturn = new BasicReferenceContainer(null);
        Object key = null;
        _pReturn.setObject(ZVal.newArray());
        for (ZPair zpairResult2273 : ZVal.getIterable(keys, env, true)) {
            key = ZVal.assign(zpairResult2273.getValue());
            _pReturn.arrayAccess(env, key).set(this.get(env, key));
        }

        return ZVal.assign(_pReturn.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values", typeHint = "array")
    @ConvertedParameter(index = 1, name = "minutes")
    public Object putMany(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, false);
        Object minutes = assignParameter(args, 1, false);
        Object value = null;
        Object key = null;
        for (ZPair zpairResult2274 : ZVal.getIterable(values, env, false)) {
            key = ZVal.assign(zpairResult2274.getKey());
            value = ZVal.assign(zpairResult2274.getValue());
            this.put(env, key, value, minutes);
        }

        return null;
    }

    public static final Object CONST_class = "Illuminate\\Cache\\FileStore";

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
                    .setName("Illuminate\\Cache\\FileStore")
                    .setLookup(
                            FileStore.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("directory", "files")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Cache/FileStore.php")
                    .addInterface("Illuminate\\Contracts\\Cache\\Store")
                    .addTrait("Illuminate\\Support\\InteractsWithTime")
                    .addTrait("Illuminate\\Cache\\RetrievesMultipleKeys")
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

    private static class Scope79 implements UpdateRuntimeScopeInterface {

        Object path;
        Object data;
        Object e;
        Object contents;
        Object expire;
        Object _thisVarAlias;
        Object time;
        Object key;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("path", this.path);
            stack.setVariable("data", this.data);
            stack.setVariable("e", this.e);
            stack.setVariable("contents", this.contents);
            stack.setVariable("expire", this.expire);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("time", this.time);
            stack.setVariable("key", this.key);
        }

        public void updateScope(RuntimeStack stack) {

            this.path = stack.getVariable("path");
            this.data = stack.getVariable("data");
            this.e = stack.getVariable("e");
            this.contents = stack.getVariable("contents");
            this.expire = stack.getVariable("expire");
            this._thisVarAlias = stack.getVariable("this");
            this.time = stack.getVariable("time");
            this.key = stack.getVariable("key");
        }
    }
}
