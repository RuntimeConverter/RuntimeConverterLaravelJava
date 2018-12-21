package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.BufferHandler;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fwrite;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/DeduplicationHandler.php

*/

public class DeduplicationHandler extends BufferHandler {

    public Object deduplicationStore = null;

    public Object deduplicationLevel = null;

    public Object time = null;

    public Object gc = false;

    public DeduplicationHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DeduplicationHandler.class) {
            this.__construct(env, args);
        }
    }

    public DeduplicationHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "handler",
        typeHint = "Monolog\\Handler\\HandlerInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "deduplicationStore",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "deduplicationLevel")
    @ConvertedParameter(index = 3, name = "time", defaultValue = "60", defaultValueType = "number")
    @ConvertedParameter(
        index = 4,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object handler = assignParameter(args, 0, false);
        Object deduplicationStore = assignParameter(args, 1, true);
        if (null == deduplicationStore) {
            deduplicationStore = ZVal.getNull();
        }
        Object deduplicationLevel = assignParameter(args, 2, true);
        if (null == deduplicationLevel) {
            deduplicationLevel = Logger.CONST_ERROR;
        }
        Object time = assignParameter(args, 3, true);
        if (null == time) {
            time = 60;
        }
        Object bubble = assignParameter(args, 4, true);
        if (null == bubble) {
            bubble = true;
        }
        super.__construct(env, handler, 0, Logger.CONST_DEBUG, bubble, false);
        this.deduplicationStore =
                ZVal.strictEqualityCheck(deduplicationStore, "===", ZVal.getNull())
                        ? toStringR(NamespaceGlobal.sys_get_temp_dir.env(env).call().value(), env)
                                + "/monolog-dedup-"
                                + toStringR(
                                        function_substr
                                                .f
                                                .env(env)
                                                .call(
                                                        NamespaceGlobal.md5
                                                                .env(env)
                                                                .call(
                                                                        env.addRootFilesystemPrefix(
                                                                                "/vendor/monolog/monolog/src/Monolog/Handler/DeduplicationHandler.php"))
                                                                .value(),
                                                        0,
                                                        20)
                                                .value(),
                                        env)
                                + ".log"
                        : deduplicationStore;
        this.deduplicationLevel =
                Logger.runtimeStaticObject.toMonologLevel(env, deduplicationLevel);
        this.time = time;
        return null;
    }

    @ConvertedMethod
    public Object flush(RuntimeEnv env, Object... args) {
        Object passthru = null;
        ReferenceContainer record = new BasicReferenceContainer(null);
        if (ZVal.strictEqualityCheck(
                toObjectR(this).accessProp(this, env).name("bufferSize").value(), "===", 0)) {
            return null;
        }

        passthru = ZVal.getNull();
        for (ZPair zpairResult771 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("buffer").value(), env, true)) {
            record.setObject(ZVal.assign(zpairResult771.getValue()));
            if (ZVal.isGreaterThanOrEqualTo(
                    record.arrayGet(env, "level"), ">=", this.deduplicationLevel)) {
                passthru =
                        ZVal.toBool(passthru)
                                || ZVal.toBool(
                                        !ZVal.isTrue(this.isDuplicate(env, record.getObject())));
                if (ZVal.isTrue(passthru)) {
                    this.appendRecord(env, record.getObject());
                }
            }
        }

        if (ZVal.toBool(ZVal.strictEqualityCheck(passthru, "===", true))
                || ZVal.toBool(ZVal.strictEqualityCheck(passthru, "===", ZVal.getNull()))) {
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("handler").value(),
                    "handleBatch",
                    DeduplicationHandler.class,
                    toObjectR(this).accessProp(this, env).name("buffer").value());
        }

        env.callMethod(this, "clear", DeduplicationHandler.class);
        if (ZVal.isTrue(this.gc)) {
            this.collectLogs(env);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    private Object isDuplicate(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object yesterday = null;
        Object runtimeTempArrayResult114 = null;
        Object level = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        ReferenceContainer store = new BasicReferenceContainer(null);
        Object message = null;
        Object timestampValidity = null;
        Object expectedMessage = null;
        Object timestamp = null;
        if (!function_file_exists.f.env(env).call(this.deduplicationStore).getBool()) {
            return ZVal.assign(false);
        }

        store.setObject(
                NamespaceGlobal.file
                        .env(env)
                        .call(this.deduplicationStore, ZVal.toLong(2) | ZVal.toLong(4))
                        .value());
        if (!function_is_array.f.env(env).call(store.getObject()).getBool()) {
            return ZVal.assign(false);
        }

        yesterday = ZVal.subtract(NamespaceGlobal.time.env(env).call().value(), 86400);
        timestampValidity =
                ZVal.subtract(
                        env.callMethod(
                                record.arrayGet(env, "datetime"),
                                "getTimestamp",
                                DeduplicationHandler.class),
                        this.time);
        expectedMessage =
                function_preg_replace
                        .f
                        .env(env)
                        .call("{[\\r\\n].*}", "", record.arrayGet(env, "message"))
                        .value();
        for (i.setObject(
                        ZVal.subtract(
                                function_count.f.env(env).call(store.getObject()).value(), 1));
                ZVal.isGreaterThanOrEqualTo(i.getObject(), ">=", 0);
                i.setObject(ZVal.decrement(i.getObject()))) {
            ZVal.list(
                    runtimeTempArrayResult114 =
                            function_explode
                                    .f
                                    .env(env)
                                    .call(":", store.arrayGet(env, i.getObject()), 3)
                                    .value(),
                    (timestamp = listGet(runtimeTempArrayResult114, 0, env)),
                    (level = listGet(runtimeTempArrayResult114, 1, env)),
                    (message = listGet(runtimeTempArrayResult114, 2, env)));
            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    level,
                                                    "===",
                                                    record.arrayGet(env, "level_name")))
                                    && ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    message, "===", expectedMessage)))
                    && ZVal.toBool(ZVal.isGreaterThan(timestamp, '>', timestampValidity))) {
                return ZVal.assign(true);
            }

            if (ZVal.isLessThan(timestamp, '<', yesterday)) {
                this.gc = true;
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    private Object collectLogs(RuntimeEnv env, Object... args) {
        Object log = null;
        Object handle = null;
        ReferenceContainer validLogs = new BasicReferenceContainer(null);
        Object timestampValidity = null;
        if (!function_file_exists.f.env(env).call(this.deduplicationStore).getBool()) {
            return ZVal.assign(false);
        }

        handle = function_fopen.f.env(env).call(this.deduplicationStore, "rw+").value();
        NamespaceGlobal.flock.env(env).call(handle, 2);
        validLogs.setObject(ZVal.newArray());
        timestampValidity = ZVal.subtract(NamespaceGlobal.time.env(env).call().value(), this.time);
        while (!NamespaceGlobal.feof.env(env).call(handle).getBool()) {
            log = NamespaceGlobal.fgets.env(env).call(handle).value();
            if (ZVal.isGreaterThanOrEqualTo(
                    function_substr.f.env(env).call(log, 0, 10).value(), ">=", timestampValidity)) {
                validLogs.arrayAppend(env).set(log);
            }
        }

        NamespaceGlobal.ftruncate.env(env).call(handle, 0);
        NamespaceGlobal.rewind.env(env).call(handle);
        for (ZPair zpairResult772 : ZVal.getIterable(validLogs.getObject(), env, true)) {
            log = ZVal.assign(zpairResult772.getValue());
            function_fwrite.f.env(env).call(handle, log);
        }

        NamespaceGlobal.flock.env(env).call(handle, 3);
        function_fclose.f.env(env).call(handle);
        this.gc = false;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    private Object appendRecord(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        NamespaceGlobal.file_put_contents
                .env(env)
                .call(
                        this.deduplicationStore,
                        toStringR(
                                        env.callMethod(
                                                record.arrayGet(env, "datetime"),
                                                "getTimestamp",
                                                DeduplicationHandler.class),
                                        env)
                                + ":"
                                + toStringR(record.arrayGet(env, "level_name"), env)
                                + ":"
                                + toStringR(
                                        function_preg_replace
                                                .f
                                                .env(env)
                                                .call(
                                                        "{[\\r\\n].*}",
                                                        "",
                                                        record.arrayGet(env, "message"))
                                                .value(),
                                        env)
                                + "\n",
                        8);
        return null;
    }

    public static final Object CONST_class = "Monolog\\Handler\\DeduplicationHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends BufferHandler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Handler\\DeduplicationHandler")
                    .setLookup(
                            DeduplicationHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bubble",
                            "buffer",
                            "bufferLimit",
                            "bufferSize",
                            "deduplicationLevel",
                            "deduplicationStore",
                            "flushOnOverflow",
                            "formatter",
                            "gc",
                            "handler",
                            "initialized",
                            "level",
                            "processors",
                            "time")
                    .setFilename(
                            "vendor/monolog/monolog/src/Monolog/Handler/DeduplicationHandler.php")
                    .addInterface("Monolog\\Handler\\HandlerInterface")
                    .addExtendsClass("Monolog\\Handler\\BufferHandler")
                    .addExtendsClass("Monolog\\Handler\\AbstractHandler")
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
