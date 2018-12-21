package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_error_handler;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.nativeFunctions.date.function_date;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.StreamHandler;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_usort;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_error_handler;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/RotatingFileHandler.php

*/

public class RotatingFileHandler extends StreamHandler {

    public Object filename = null;

    public Object maxFiles = null;

    public Object mustRotate = null;

    public Object nextRotation = null;

    public Object filenameFormat = null;

    public Object dateFormat = null;

    public RotatingFileHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RotatingFileHandler.class) {
            this.__construct(env, args);
        }
    }

    public RotatingFileHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filename")
    @ConvertedParameter(
        index = 1,
        name = "maxFiles",
        defaultValue = "0",
        defaultValueType = "number"
    )
    @ConvertedParameter(index = 2, name = "level")
    @ConvertedParameter(
        index = 3,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "filePermission",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "useLocking",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object filename = assignParameter(args, 0, false);
        Object maxFiles = assignParameter(args, 1, true);
        if (null == maxFiles) {
            maxFiles = 0;
        }
        Object level = assignParameter(args, 2, true);
        if (null == level) {
            level = Logger.CONST_DEBUG;
        }
        Object bubble = assignParameter(args, 3, true);
        if (null == bubble) {
            bubble = true;
        }
        Object filePermission = assignParameter(args, 4, true);
        if (null == filePermission) {
            filePermission = ZVal.getNull();
        }
        Object useLocking = assignParameter(args, 5, true);
        if (null == useLocking) {
            useLocking = false;
        }
        this.filename = filename;
        this.maxFiles = ZVal.toLong(maxFiles);
        this.nextRotation = new DateTime(env, "tomorrow");
        this.filenameFormat = "{filename}-{date}";
        this.dateFormat = "Y-m-d";
        super.__construct(
                env, this.getTimedFilename(env), level, bubble, filePermission, useLocking);
        return null;
    }

    @ConvertedMethod
    public Object close(RuntimeEnv env, Object... args) {
        super.close(env);
        if (ZVal.strictEqualityCheck(true, "===", this.mustRotate)) {
            this.rotate(env);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filenameFormat")
    @ConvertedParameter(index = 1, name = "dateFormat")
    public Object setFilenameFormat(RuntimeEnv env, Object... args) {
        Object filenameFormat = assignParameter(args, 0, false);
        Object dateFormat = assignParameter(args, 1, false);
        if (!function_preg_match
                .f
                .env(env)
                .call("{^Y(([/_.-]?m)([/_.-]?d)?)?$}", dateFormat)
                .getBool()) {
            NamespaceGlobal.trigger_error
                    .env(env)
                    .call(
                            "Invalid date format - format must be one of "
                                    + "RotatingFileHandler::FILE_PER_DAY (\"Y-m-d\"), RotatingFileHandler::FILE_PER_MONTH (\"Y-m\") "
                                    + "or RotatingFileHandler::FILE_PER_YEAR (\"Y\"), or you can set one of the "
                                    + "date formats using slashes, underscores and/or dots instead of dashes.",
                            16384);
        }

        if (ZVal.strictEqualityCheck(
                NamespaceGlobal.substr_count.env(env).call(filenameFormat, "{date}").value(),
                "===",
                0)) {
            NamespaceGlobal.trigger_error
                    .env(env)
                    .call(
                            "Invalid filename format - format should contain at least `{date}`, because otherwise rotating is impossible.",
                            16384);
        }

        this.filenameFormat = filenameFormat;
        this.dateFormat = dateFormat;
        toObjectR(this).accessProp(this, env).name("url").set(this.getTimedFilename(env));
        this.close(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object write(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.mustRotate)) {
            this.mustRotate =
                    !function_file_exists
                            .f
                            .env(env)
                            .call(toObjectR(this).accessProp(this, env).name("url").value())
                            .getBool();
        }

        if (ZVal.isLessThan(this.nextRotation, '<', record.arrayGet(env, "datetime"))) {
            this.mustRotate = true;
            this.close(env);
        }

        super.write(env, record.getObject());
        return null;
    }

    @ConvertedMethod
    protected Object rotate(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/monolog/monolog/src/Monolog/Handler")
                        .setFile(
                                "/vendor/monolog/monolog/src/Monolog/Handler/RotatingFileHandler.php");
        Object logFiles = null;
        Object file = null;
        toObjectR(this).accessProp(this, env).name("url").set(this.getTimedFilename(env));
        this.nextRotation = new DateTime(env, "tomorrow");
        if (ZVal.strictEqualityCheck(0, "===", this.maxFiles)) {
            return null;
        }

        logFiles = NamespaceGlobal.glob.env(env).call(this.getGlobPattern(env)).value();
        if (ZVal.isGreaterThanOrEqualTo(
                this.maxFiles, ">=", function_count.f.env(env).call(logFiles).value())) {
            return null;
        }

        function_usort
                .f
                .env(env)
                .call(
                        logFiles,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Monolog\\Handler",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "a")
                            @ConvertedParameter(index = 1, name = "b")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object a = assignParameter(args, 0, false);
                                Object b = assignParameter(args, 1, false);
                                return ZVal.assign(
                                        NamespaceGlobal.strcmp.env(env).call(b, a).value());
                            }
                        });
        for (ZPair zpairResult802 :
                ZVal.getIterable(
                        function_array_slice.f.env(env).call(logFiles, this.maxFiles).value(),
                        env,
                        true)) {
            file = ZVal.assign(zpairResult802.getValue());
            if (NamespaceGlobal.is_writable.env(env).call(file).getBool()) {
                function_set_error_handler
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Monolog\\Handler",
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
                                        return null;
                                    }
                                });
                NamespaceGlobal.unlink.env(env).call(file);
                function_restore_error_handler.f.env(env).call();
            }
        }

        this.mustRotate = false;
        return null;
    }

    @ConvertedMethod
    protected Object getTimedFilename(RuntimeEnv env, Object... args) {
        Object timedFilename = null;
        ReferenceContainer fileInfo = new BasicReferenceContainer(null);
        fileInfo.setObject(NamespaceGlobal.pathinfo.env(env).call(this.filename).value());
        timedFilename =
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                ZVal.arrayFromList("{filename}", "{date}"),
                                ZVal.newArray(
                                        new ZPair(0, fileInfo.arrayGet(env, "filename")),
                                        new ZPair(
                                                1,
                                                function_date
                                                        .f
                                                        .env(env)
                                                        .call(this.dateFormat)
                                                        .value())),
                                toStringR(fileInfo.arrayGet(env, "dirname"), env)
                                        + "/"
                                        + toStringR(this.filenameFormat, env))
                        .value();
        if (!arrayActionR(ArrayAction.EMPTY, fileInfo, env, "extension")) {
            timedFilename =
                    toStringR(timedFilename, env)
                            + "."
                            + toStringR(fileInfo.arrayGet(env, "extension"), env);
        }

        return ZVal.assign(timedFilename);
    }

    @ConvertedMethod
    protected Object getGlobPattern(RuntimeEnv env, Object... args) {
        Object glob = null;
        ReferenceContainer fileInfo = new BasicReferenceContainer(null);
        fileInfo.setObject(NamespaceGlobal.pathinfo.env(env).call(this.filename).value());
        glob =
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                ZVal.arrayFromList("{filename}", "{date}"),
                                ZVal.newArray(
                                        new ZPair(0, fileInfo.arrayGet(env, "filename")),
                                        new ZPair(1, "*")),
                                toStringR(fileInfo.arrayGet(env, "dirname"), env)
                                        + "/"
                                        + toStringR(this.filenameFormat, env))
                        .value();
        if (!arrayActionR(ArrayAction.EMPTY, fileInfo, env, "extension")) {
            glob = toStringR(glob, env) + "." + toStringR(fileInfo.arrayGet(env, "extension"), env);
        }

        return ZVal.assign(glob);
    }

    public static final Object CONST_FILE_PER_DAY = "Y-m-d";

    public static final Object CONST_FILE_PER_MONTH = "Y-m";

    public static final Object CONST_FILE_PER_YEAR = "Y";

    public static final Object CONST_class = "Monolog\\Handler\\RotatingFileHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StreamHandler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Handler\\RotatingFileHandler")
                    .setLookup(
                            RotatingFileHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bubble",
                            "dateFormat",
                            "dirCreated",
                            "errorMessage",
                            "filePermission",
                            "filename",
                            "filenameFormat",
                            "formatter",
                            "level",
                            "maxFiles",
                            "mustRotate",
                            "nextRotation",
                            "processors",
                            "stream",
                            "url",
                            "useLocking")
                    .setFilename(
                            "vendor/monolog/monolog/src/Monolog/Handler/RotatingFileHandler.php")
                    .addInterface("Monolog\\Handler\\HandlerInterface")
                    .addExtendsClass("Monolog\\Handler\\StreamHandler")
                    .addExtendsClass("Monolog\\Handler\\AbstractProcessingHandler")
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
