package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_error_handler;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.Exception.classes.PartialFileException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.Exception.classes.IniSizeFileException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.Exception.classes.ExtensionFileException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.MimeType.classes.ExtensionGuesser;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_arg;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_error_handler;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.Exception.classes.CannotWriteFileException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.Exception.classes.FileException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.Exception.classes.FormSizeFileException;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_num_args;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.Exception.classes.NoTmpDirFileException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.classes.File;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.Exception.classes.NoFileException;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/File/UploadedFile.php

*/

public class UploadedFile extends File {

    public Object test = false;

    public Object originalName = null;

    public Object mimeType = null;

    public Object error = null;

    public UploadedFile(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == UploadedFile.class) {
            this.__construct(env, args);
        }
    }

    public UploadedFile(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path", typeHint = "string")
    @ConvertedParameter(index = 1, name = "originalName", typeHint = "string")
    @ConvertedParameter(
        index = 2,
        name = "mimeType",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "error",
        typeHint = "int",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "test",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object originalName = assignParameter(args, 1, false);
        Object mimeType = assignParameter(args, 2, true);
        if (null == mimeType) {
            mimeType = ZVal.getNull();
        }
        Object error = assignParameter(args, 3, true);
        if (null == error) {
            error = ZVal.getNull();
        }
        Object test = assignParameter(args, 4, true);
        if (null == test) {
            test = false;
        }
        Object ternaryExpressionTemp = null;
        this.originalName = env.callMethod(this, "getName", UploadedFile.class, originalName);
        this.mimeType =
                ZVal.isTrue(ternaryExpressionTemp = mimeType)
                        ? ternaryExpressionTemp
                        : "application/octet-stream";
        if (ZVal.isTrue(
                ZVal.isLessThan(
                                4,
                                '<',
                                function_func_num_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value())
                        ? !function_is_bool.f.env(env).call(test).getBool()
                        : ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", error))
                                && ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                NamespaceGlobal.filesize
                                                        .env(env)
                                                        .call(path)
                                                        .value(),
                                                "===",
                                                error)))) {
            NamespaceGlobal.trigger_error
                    .env(env)
                    .call(
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Passing a size as 4th argument to the constructor of \"%s\" is deprecated since Symfony 4.1.",
                                            "UploadedFile")
                                    .value(),
                            16384)
                    .value();
            error = ZVal.assign(test);
            test =
                    ZVal.assign(
                            ZVal.isLessThan(
                                            5,
                                            '<',
                                            function_func_num_args
                                                    .f
                                                    .env(env)
                                                    .addReferenceArgs(
                                                            new RuntimeArgsWithInfo(args, this))
                                                    .call()
                                                    .value())
                                    ? function_func_get_arg
                                            .f
                                            .env(env)
                                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                            .call(5)
                                            .value()
                                    : false);
        }

        this.error = ZVal.isTrue(ternaryExpressionTemp = error) ? ternaryExpressionTemp : 0;
        this.test = test;
        super.__construct(env, path, ZVal.strictEqualityCheck(0, "===", this.error));
        return null;
    }

    @ConvertedMethod
    public Object getClientOriginalName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.originalName);
    }

    @ConvertedMethod
    public Object getClientOriginalExtension(RuntimeEnv env, Object... args) {
        return ZVal.assign(NamespaceGlobal.pathinfo.env(env).call(this.originalName, 4).value());
    }

    @ConvertedMethod
    public Object getClientMimeType(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.mimeType);
    }

    @ConvertedMethod
    public Object guessClientExtension(RuntimeEnv env, Object... args) {
        Object guesser = null;
        Object type = null;
        type = this.getClientMimeType(env);
        guesser = ExtensionGuesser.runtimeStaticObject.getInstance(env);
        return ZVal.assign(env.callMethod(guesser, "guess", UploadedFile.class, type));
    }

    @ConvertedMethod
    public Object getClientSize(RuntimeEnv env, Object... args) {
        NamespaceGlobal.trigger_error
                .env(env)
                .call(
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "\"%s\" is deprecated since Symfony 4.1. Use getSize() instead.",
                                        "UploadedFile::getClientSize")
                                .value(),
                        16384)
                .value();
        return ZVal.assign(env.callMethod(this, "getSize", UploadedFile.class));
    }

    @ConvertedMethod
    public Object getError(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.error);
    }

    @ConvertedMethod
    public Object isValid(RuntimeEnv env, Object... args) {
        Object isOk = null;
        isOk = ZVal.strictEqualityCheck(0, "===", this.error);
        return ZVal.assign(
                ZVal.isTrue(this.test)
                        ? isOk
                        : ZVal.toBool(isOk)
                                && ZVal.toBool(
                                        NamespaceGlobal.is_uploaded_file
                                                .env(env)
                                                .call(
                                                        env.callMethod(
                                                                this,
                                                                "getPathname",
                                                                UploadedFile.class))
                                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object move(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/http-foundation/File")
                        .setFile("/vendor/symfony/http-foundation/File/UploadedFile.php");
        Object directory = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object moved = null;
        ReferenceContainer error = new BasicReferenceContainer(null);
        Object target = null;
        if (ZVal.isTrue(this.isValid(env))) {
            if (ZVal.isTrue(this.test)) {
                return ZVal.assign(super.move(env, directory, name));
            }

            target = env.callMethod(this, "getTargetFile", UploadedFile.class, directory, name);
            function_set_error_handler
                    .f
                    .env(env)
                    .call(
                            new Closure(
                                    env,
                                    runtimeConverterFunctionClassConstants,
                                    "Symfony\\Component\\HttpFoundation\\File",
                                    this) {
                                @Override
                                @ConvertedMethod
                                @ConvertedParameter(index = 0, name = "type")
                                @ConvertedParameter(index = 1, name = "msg")
                                public Object run(
                                        RuntimeEnv env,
                                        Object thisvar,
                                        PassByReferenceArgs runtimePassByReferenceArgs,
                                        Object... args) {
                                    Object type = assignParameter(args, 0, false);
                                    Object msg = assignParameter(args, 1, false);
                                    ReferenceContainer error = new BasicReferenceContainer(null);
                                    error = this.contextReferences.getReferenceContainer("error");
                                    error.setObject(ZVal.assign(msg));
                                    return null;
                                }
                            }.useRef("error", error));
            moved =
                    NamespaceGlobal.move_uploaded_file
                            .env(env)
                            .call(env.callMethod(this, "getPathname", UploadedFile.class), target)
                            .value();
            function_restore_error_handler.f.env(env).call();
            if (!ZVal.isTrue(moved)) {
                throw ZVal.getException(
                        env,
                        new FileException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Could not move the file \"%s\" to \"%s\" (%s)",
                                                env.callMethod(
                                                        this, "getPathname", UploadedFile.class),
                                                target,
                                                NamespaceGlobal.strip_tags
                                                        .env(env)
                                                        .call(error.getObject())
                                                        .value())
                                        .value()));
            }

            NamespaceGlobal.chmod
                    .env(env)
                    .call(
                            target,
                            ZVal.toLong(438)
                                    & ZVal.toLong(
                                            ~ZVal.toLong(
                                                    NamespaceGlobal.umask.env(env).call().value())))
                    .value();
            return ZVal.assign(target);
        }

        SwitchEnumType118 switchVariable118 =
                ZVal.getEnum(
                        this.error,
                        SwitchEnumType118.DEFAULT_CASE,
                        SwitchEnumType118.DYNAMIC_TYPE_377,
                        1,
                        SwitchEnumType118.DYNAMIC_TYPE_378,
                        2,
                        SwitchEnumType118.DYNAMIC_TYPE_379,
                        3,
                        SwitchEnumType118.DYNAMIC_TYPE_380,
                        4,
                        SwitchEnumType118.DYNAMIC_TYPE_381,
                        7,
                        SwitchEnumType118.DYNAMIC_TYPE_382,
                        6,
                        SwitchEnumType118.DYNAMIC_TYPE_383,
                        8);
        switch (switchVariable118) {
            case DYNAMIC_TYPE_377:
                throw ZVal.getException(
                        env, new IniSizeFileException(env, this.getErrorMessage(env)));
            case DYNAMIC_TYPE_378:
                throw ZVal.getException(
                        env, new FormSizeFileException(env, this.getErrorMessage(env)));
            case DYNAMIC_TYPE_379:
                throw ZVal.getException(
                        env, new PartialFileException(env, this.getErrorMessage(env)));
            case DYNAMIC_TYPE_380:
                throw ZVal.getException(env, new NoFileException(env, this.getErrorMessage(env)));
            case DYNAMIC_TYPE_381:
                throw ZVal.getException(
                        env, new CannotWriteFileException(env, this.getErrorMessage(env)));
            case DYNAMIC_TYPE_382:
                throw ZVal.getException(
                        env, new NoTmpDirFileException(env, this.getErrorMessage(env)));
            case DYNAMIC_TYPE_383:
                throw ZVal.getException(
                        env, new ExtensionFileException(env, this.getErrorMessage(env)));
        }
        ;
        throw ZVal.getException(env, new FileException(env, this.getErrorMessage(env)));
    }

    @ConvertedMethod
    public Object getErrorMessage(RuntimeEnv env, Object... args) {
        Object maxFilesize = null;
        Object errorCode = null;
        Object message = null;
        ReferenceContainer errors = new BasicReferenceContainer(null);
        errors =
                env.getInlineStatic(
                        27,
                        ZVal.newArray(
                                new ZPair(
                                        1,
                                        "The file \"%s\" exceeds your upload_max_filesize ini directive (limit is %d KiB)."),
                                new ZPair(
                                        2,
                                        "The file \"%s\" exceeds the upload limit defined in your form."),
                                new ZPair(3, "The file \"%s\" was only partially uploaded."),
                                new ZPair(4, "No file was uploaded."),
                                new ZPair(7, "The file \"%s\" could not be written on disk."),
                                new ZPair(
                                        6,
                                        "File could not be uploaded: missing temporary directory."),
                                new ZPair(8, "File upload was stopped by a PHP extension.")));
        errorCode = ZVal.assign(this.error);
        maxFilesize =
                ZVal.assign(
                        ZVal.strictEqualityCheck(1, "===", errorCode)
                                ? ZVal.divide(runtimeStaticObject.getMaxFilesize(env), 1024)
                                : 0);
        message =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, errors, env, errorCode)
                                ? errors.arrayGet(env, errorCode)
                                : "The file \"%s\" was not uploaded due to an unknown error.");
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(message, this.getClientOriginalName(env), maxFilesize)
                        .value());
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\File\\UploadedFile";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends File.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object getMaxFilesize(RuntimeEnv env, Object... args) {
            Object max = null;
            Object iniMax = null;
            iniMax =
                    NamespaceGlobal.strtolower
                            .env(env)
                            .call(function_ini_get.f.env(env).call("upload_max_filesize").value())
                            .value();
            if (ZVal.strictEqualityCheck("", "===", iniMax)) {
                return ZVal.assign(9223372036854775807L);
            }

            max = function_ltrim.f.env(env).call(iniMax, "+").value();
            if (ZVal.strictEqualityCheck(
                    0, "===", function_strpos.f.env(env).call(max, "0x").value())) {
                max = NamespaceGlobal.intval.env(env).call(max, 16).value();

            } else if (ZVal.strictEqualityCheck(
                    0, "===", function_strpos.f.env(env).call(max, "0").value())) {
                max = NamespaceGlobal.intval.env(env).call(max, 8).value();

            } else {
                max = ZVal.assign(ZVal.toLong(max));
            }

            switch (toStringR(function_substr.f.env(env).call(iniMax, -1).value())) {
                case "t":
                    max = ZAssignment.multiply("*=", max, 1024);
                case "g":
                    max = ZAssignment.multiply("*=", max, 1024);
                case "m":
                    max = ZAssignment.multiply("*=", max, 1024);
                case "k":
                    max = ZAssignment.multiply("*=", max, 1024);
            }
            ;
            return ZVal.assign(max);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpFoundation\\File\\UploadedFile")
                    .setLookup(
                            UploadedFile.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("error", "mimeType", "originalName", "test")
                    .setFilename("vendor/symfony/http-foundation/File/UploadedFile.php")
                    .addExtendsClass("Symfony\\Component\\HttpFoundation\\File\\File")
                    .addExtendsClass("SplFileInfo")
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

    private enum SwitchEnumType118 {
        DYNAMIC_TYPE_377,
        DYNAMIC_TYPE_378,
        DYNAMIC_TYPE_379,
        DYNAMIC_TYPE_380,
        DYNAMIC_TYPE_381,
        DYNAMIC_TYPE_382,
        DYNAMIC_TYPE_383,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
