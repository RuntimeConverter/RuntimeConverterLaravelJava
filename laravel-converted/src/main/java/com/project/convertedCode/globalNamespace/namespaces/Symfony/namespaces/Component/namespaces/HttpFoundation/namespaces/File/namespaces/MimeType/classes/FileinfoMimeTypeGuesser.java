package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.MimeType.classes;

import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.Exception.classes.AccessDeniedException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.Exception.classes.FileNotFoundException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.MimeType.classes.MimeTypeGuesserInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_file;
import com.runtimeconverter.runtime.nativeClasses.otherProxyClasses.finfo;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/File/MimeType/FileinfoMimeTypeGuesser.php

*/

public class FileinfoMimeTypeGuesser extends RuntimeClassBase implements MimeTypeGuesserInterface {

    public Object magicFile = null;

    public FileinfoMimeTypeGuesser(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FileinfoMimeTypeGuesser.class) {
            this.__construct(env, args);
        }
    }

    public FileinfoMimeTypeGuesser(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "magicFile",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object magicFile = assignParameter(args, 0, true);
        if (null == magicFile) {
            magicFile = ZVal.getNull();
        }
        this.magicFile = magicFile;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object guess(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object finfo = null;
        if (!function_is_file.f.env(env).call(path).getBool()) {
            throw ZVal.getException(env, new FileNotFoundException(env, path));
        }

        if (!NamespaceGlobal.is_readable.env(env).call(path).getBool()) {
            throw ZVal.getException(env, new AccessDeniedException(env, path));
        }

        if (!ZVal.isTrue(runtimeStaticObject.isSupported(env))) {
            return null;
        }

        if (!ZVal.isTrue(finfo = new finfo(env, 16, this.magicFile))) {
            return null;
        }

        return ZVal.assign(env.callMethod(finfo, "file", FileinfoMimeTypeGuesser.class, path));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\File\\MimeType\\FileinfoMimeTypeGuesser";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object isSupported(RuntimeEnv env, Object... args) {
            return ZVal.assign(function_function_exists.f.env(env).call("finfo_open").value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\HttpFoundation\\File\\MimeType\\FileinfoMimeTypeGuesser")
                    .setLookup(
                            FileinfoMimeTypeGuesser.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("magicFile")
                    .setFilename(
                            "vendor/symfony/http-foundation/File/MimeType/FileinfoMimeTypeGuesser.php")
                    .addInterface(
                            "Symfony\\Component\\HttpFoundation\\File\\MimeType\\MimeTypeGuesserInterface")
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
