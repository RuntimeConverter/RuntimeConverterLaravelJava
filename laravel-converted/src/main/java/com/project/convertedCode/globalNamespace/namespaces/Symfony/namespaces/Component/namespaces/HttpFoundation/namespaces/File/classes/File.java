package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.Exception.classes.FileNotFoundException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_error_handler;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.MimeType.classes.MimeTypeGuesser;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_file;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.spl.files.SplFileInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.MimeType.classes.ExtensionGuesser;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_error_handler;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.Exception.classes.FileException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/File/File.php

*/

public class File extends SplFileInfo {

    public File(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == File.class) {
            this.__construct(env, args);
        }
    }

    public File(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "checkPath",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object checkPath = assignParameter(args, 1, true);
        if (null == checkPath) {
            checkPath = true;
        }
        if (ZVal.toBool(checkPath)
                && ZVal.toBool(!function_is_file.f.env(env).call(path).getBool())) {
            throw ZVal.getException(env, new FileNotFoundException(env, path));
        }

        super.__construct(env, path);
        return null;
    }

    @ConvertedMethod
    public Object guessExtension(RuntimeEnv env, Object... args) {
        Object guesser = null;
        Object type = null;
        type = this.getMimeType(env);
        guesser = ExtensionGuesser.runtimeStaticObject.getInstance(env);
        return ZVal.assign(env.callMethod(guesser, "guess", File.class, type));
    }

    @ConvertedMethod
    public Object getMimeType(RuntimeEnv env, Object... args) {
        Object guesser = null;
        guesser = MimeTypeGuesser.runtimeStaticObject.getInstance(env);
        return ZVal.assign(
                env.callMethod(
                        guesser,
                        "guess",
                        File.class,
                        env.callMethod(this, "getPathname", File.class)));
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
                        .setFile("/vendor/symfony/http-foundation/File/File.php");
        Object directory = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        ReferenceContainer error = new BasicReferenceContainer(null);
        Object renamed = null;
        Object target = null;
        target = this.getTargetFile(env, directory, name);
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
        renamed =
                NamespaceGlobal.rename
                        .env(env)
                        .call(env.callMethod(this, "getPathname", File.class), target)
                        .value();
        function_restore_error_handler.f.env(env).call();
        if (!ZVal.isTrue(renamed)) {
            throw ZVal.getException(
                    env,
                    new FileException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Could not move the file \"%s\" to \"%s\" (%s)",
                                            env.callMethod(this, "getPathname", File.class),
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

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object getTargetFile(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object target = null;
        if (!function_is_dir.f.env(env).call(directory).getBool()) {
            if (ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    false,
                                    "===",
                                    NamespaceGlobal.mkdir
                                            .env(env)
                                            .call(directory, 511, true)
                                            .value()))
                    && ZVal.toBool(!function_is_dir.f.env(env).call(directory).getBool())) {
                throw ZVal.getException(
                        env,
                        new FileException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("Unable to create the \"%s\" directory", directory)
                                        .value()));
            }

        } else if (!NamespaceGlobal.is_writable.env(env).call(directory).getBool()) {
            throw ZVal.getException(
                    env,
                    new FileException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Unable to write in the \"%s\" directory", directory)
                                    .value()));
        }

        target =
                toStringR(function_rtrim.f.env(env).call(directory, "/\\").value(), env)
                        + toStringR("/", env)
                        + toStringR(
                                ZVal.strictEqualityCheck(ZVal.getNull(), "===", name)
                                        ? env.callMethod(this, "getBasename", File.class)
                                        : this.getName(env, name),
                                env);
        return ZVal.assign(
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Symfony
                        .namespaces
                        .Component
                        .namespaces
                        .HttpFoundation
                        .namespaces
                        .File
                        .classes
                        .File(env, target, false));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object getName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object originalName = null;
        Object pos = null;
        originalName = function_str_replace.f.env(env).call("\\", "/", name).value();
        pos = NamespaceGlobal.strrpos.env(env).call(originalName, "/").value();
        originalName =
                ZVal.assign(
                        ZVal.strictEqualityCheck(false, "===", pos)
                                ? originalName
                                : function_substr
                                        .f
                                        .env(env)
                                        .call(originalName, ZVal.add(pos, 1))
                                        .value());
        return ZVal.assign(originalName);
    }

    public static final Object CONST_class = "Symfony\\Component\\HttpFoundation\\File\\File";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends SplFileInfo.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpFoundation\\File\\File")
                    .setLookup(
                            File.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/http-foundation/File/File.php")
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
}
