package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_error_handler;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.UnexpectedValueException;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractProcessingHandler;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_error_handler;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fwrite;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/StreamHandler.php

*/

public class StreamHandler extends AbstractProcessingHandler {

    public Object stream = null;

    public Object url = null;

    public Object errorMessage = null;

    public Object filePermission = null;

    public Object useLocking = null;

    public Object dirCreated = null;

    public StreamHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == StreamHandler.class) {
            this.__construct(env, args);
        }
    }

    public StreamHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stream")
    @ConvertedParameter(index = 1, name = "level")
    @ConvertedParameter(
        index = 2,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "filePermission",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "useLocking",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object stream = assignParameter(args, 0, false);
        Object level = assignParameter(args, 1, true);
        if (null == level) {
            level = Logger.CONST_DEBUG;
        }
        Object bubble = assignParameter(args, 2, true);
        if (null == bubble) {
            bubble = true;
        }
        Object filePermission = assignParameter(args, 3, true);
        if (null == filePermission) {
            filePermission = ZVal.getNull();
        }
        Object useLocking = assignParameter(args, 4, true);
        if (null == useLocking) {
            useLocking = false;
        }
        super.__construct(env, level, bubble);
        if (function_is_resource.f.env(env).call(stream).getBool()) {
            this.stream = stream;

        } else if (function_is_string.f.env(env).call(stream).getBool()) {
            this.url = stream;

        } else {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "A stream must either be a resource or a string."));
        }

        this.filePermission = filePermission;
        this.useLocking = useLocking;
        return null;
    }

    @ConvertedMethod
    public Object close(RuntimeEnv env, Object... args) {
        if (ZVal.toBool(this.url)
                && ZVal.toBool(function_is_resource.f.env(env).call(this.stream).value())) {
            function_fclose.f.env(env).call(this.stream);
        }

        this.stream = ZVal.getNull();
        return null;
    }

    @ConvertedMethod
    public Object getStream(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.stream);
    }

    @ConvertedMethod
    public Object getUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.url);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object write(RuntimeEnv env, Object... args) {
        Object record = assignParameter(args, 0, false);
        if (!function_is_resource.f.env(env).call(this.stream).getBool()) {
            if (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.url))
                    || ZVal.toBool(ZVal.strictEqualityCheck("", "===", this.url))) {
                throw ZVal.getException(
                        env,
                        new LogicException(
                                env,
                                "Missing stream url, the stream can not be opened. This may be caused by a premature call to close()."));
            }

            this.createDir(env);
            this.errorMessage = ZVal.getNull();
            function_set_error_handler
                    .f
                    .env(env)
                    .call(ZVal.newArray(new ZPair(0, this), new ZPair(1, "customErrorHandler")));
            this.stream = function_fopen.f.env(env).call(this.url, "a").value();
            if (ZVal.strictNotEqualityCheck(this.filePermission, "!==", ZVal.getNull())) {
                NamespaceGlobal.chmod.env(env).call(this.url, this.filePermission).value();
            }

            function_restore_error_handler.f.env(env).call();
            if (!function_is_resource.f.env(env).call(this.stream).getBool()) {
                this.stream = ZVal.getNull();
                throw ZVal.getException(
                        env,
                        new UnexpectedValueException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "The stream or file \"%s\" could not be opened: "
                                                        + toStringR(this.errorMessage, env),
                                                this.url)
                                        .value()));
            }
        }

        if (ZVal.isTrue(this.useLocking)) {
            NamespaceGlobal.flock.env(env).call(this.stream, 2);
        }

        this.streamWrite(env, this.stream, record);
        if (ZVal.isTrue(this.useLocking)) {
            NamespaceGlobal.flock.env(env).call(this.stream, 3);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stream")
    @ConvertedParameter(index = 1, name = "record", typeHint = "array")
    protected Object streamWrite(RuntimeEnv env, Object... args) {
        Object stream = assignParameter(args, 0, false);
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 1, false));
        function_fwrite.f.env(env).call(stream, toStringR(record.arrayGet(env, "formatted"), env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    @ConvertedParameter(index = 1, name = "msg")
    private Object customErrorHandler(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object msg = assignParameter(args, 1, false);
        this.errorMessage =
                function_preg_replace
                        .f
                        .env(env)
                        .call("{^(fopen|mkdir)\\(.*?\\): }", "", msg)
                        .value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stream")
    private Object getDirFromStream(RuntimeEnv env, Object... args) {
        Object stream = assignParameter(args, 0, false);
        Object pos = null;
        pos = function_strpos.f.env(env).call(stream, "://").value();
        if (ZVal.strictEqualityCheck(pos, "===", false)) {
            return ZVal.assign(function_dirname.f.env(env).call(stream).value());
        }

        if (ZVal.strictEqualityCheck(
                "file://", "===", function_substr.f.env(env).call(stream, 0, 7).value())) {
            return ZVal.assign(
                    function_dirname
                            .f
                            .env(env)
                            .call(function_substr.f.env(env).call(stream, 7).value())
                            .value());
        }

        return null;
    }

    @ConvertedMethod
    private Object createDir(RuntimeEnv env, Object... args) {
        Object dir = null;
        Object status = null;
        if (ZVal.isTrue(this.dirCreated)) {
            return null;
        }

        dir = this.getDirFromStream(env, this.url);
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", dir))
                && ZVal.toBool(!function_is_dir.f.env(env).call(dir).getBool())) {
            this.errorMessage = ZVal.getNull();
            function_set_error_handler
                    .f
                    .env(env)
                    .call(ZVal.newArray(new ZPair(0, this), new ZPair(1, "customErrorHandler")));
            status = NamespaceGlobal.mkdir.env(env).call(dir, 511, true).value();
            function_restore_error_handler.f.env(env).call();
            if (ZVal.strictEqualityCheck(false, "===", status)) {
                throw ZVal.getException(
                        env,
                        new UnexpectedValueException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "There is no existing directory at \"%s\" and its not buildable: "
                                                        + toStringR(this.errorMessage, env),
                                                dir)
                                        .value()));
            }
        }

        this.dirCreated = true;
        return null;
    }

    public static final Object CONST_class = "Monolog\\Handler\\StreamHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends AbstractProcessingHandler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Handler\\StreamHandler")
                    .setLookup(
                            StreamHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bubble",
                            "dirCreated",
                            "errorMessage",
                            "filePermission",
                            "formatter",
                            "level",
                            "processors",
                            "stream",
                            "url",
                            "useLocking")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/StreamHandler.php")
                    .addInterface("Monolog\\Handler\\HandlerInterface")
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
