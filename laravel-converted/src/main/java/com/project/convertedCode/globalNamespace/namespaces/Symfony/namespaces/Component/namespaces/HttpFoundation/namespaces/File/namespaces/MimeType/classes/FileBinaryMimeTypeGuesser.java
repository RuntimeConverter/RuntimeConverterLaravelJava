package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.MimeType.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.Exception.classes.AccessDeniedException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.Exception.classes.FileNotFoundException;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_get_clean;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_start;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_file;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_end_clean;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.MimeType.classes.MimeTypeGuesserInterface;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/File/MimeType/FileBinaryMimeTypeGuesser.php

*/

public class FileBinaryMimeTypeGuesser extends RuntimeClassBase
        implements MimeTypeGuesserInterface {

    public Object cmd = null;

    public FileBinaryMimeTypeGuesser(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FileBinaryMimeTypeGuesser.class) {
            this.__construct(env, args);
        }
    }

    public FileBinaryMimeTypeGuesser(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cmd", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object cmd = assignParameter(args, 0, true);
        if (null == cmd) {
            cmd = "file -b --mime %s 2>/dev/null";
        }
        this.cmd = cmd;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object guess(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        ReferenceContainer match = new BasicReferenceContainer(null);
        Object type = null;
        ReferenceContainer _pReturn = new BasicReferenceContainer(null);
        if (!function_is_file.f.env(env).call(path).getBool()) {
            throw ZVal.getException(env, new FileNotFoundException(env, path));
        }

        if (!NamespaceGlobal.is_readable.env(env).call(path).getBool()) {
            throw ZVal.getException(env, new AccessDeniedException(env, path));
        }

        if (!ZVal.isTrue(runtimeStaticObject.isSupported(env))) {
            return null;
        }

        function_ob_start.f.env(env).call();
        NamespaceGlobal.passthru
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(1, _pReturn))
                .call(
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        this.cmd,
                                        NamespaceGlobal.escapeshellarg.env(env).call(path).value())
                                .value(),
                        _pReturn.getObject());
        if (ZVal.isGreaterThan(_pReturn.getObject(), '>', 0)) {
            function_ob_end_clean.f.env(env).call();
            return null;
        }

        type =
                function_trim
                        .f
                        .env(env)
                        .call(function_ob_get_clean.f.env(env).call().value())
                        .value();
        if (!function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, match))
                .call("#^([a-z0-9\\-]+/[a-z0-9\\-\\.]+)#i", type, match.getObject())
                .getBool()) {
            return null;
        }

        return ZVal.assign(match.arrayGet(env, 1));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\File\\MimeType\\FileBinaryMimeTypeGuesser";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object isSupported(RuntimeEnv env, Object... args) {
            ReferenceContainer exitStatus = new BasicReferenceContainer(null);
            ReferenceContainer supported = new BasicReferenceContainer(null);
            Object binPath = null;
            supported = env.getInlineStatic(26, ZVal.getNull());
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", supported.getObject())) {
                return ZVal.assign(supported.getObject());
            }

            if (ZVal.toBool(
                            ZVal.toBool(ZVal.strictEqualityCheck("\\", "===", "/"))
                                    || ZVal.toBool(
                                            !function_function_exists
                                                    .f
                                                    .env(env)
                                                    .call("passthru")
                                                    .getBool()))
                    || ZVal.toBool(
                            !function_function_exists
                                    .f
                                    .env(env)
                                    .call("escapeshellarg")
                                    .getBool())) {
                return ZVal.assign(supported.setObject(false));
            }

            function_ob_start.f.env(env).call();
            NamespaceGlobal.passthru
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(1, exitStatus))
                    .call("command -v file", exitStatus.getObject());
            binPath =
                    function_trim
                            .f
                            .env(env)
                            .call(function_ob_get_clean.f.env(env).call().value())
                            .value();
            return ZVal.assign(
                    supported.setObject(
                            ZVal.toBool(ZVal.strictEqualityCheck(0, "===", exitStatus.getObject()))
                                    && ZVal.toBool(
                                            ZVal.strictNotEqualityCheck("", "!==", binPath))));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\HttpFoundation\\File\\MimeType\\FileBinaryMimeTypeGuesser")
                    .setLookup(
                            FileBinaryMimeTypeGuesser.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("cmd")
                    .setFilename(
                            "vendor/symfony/http-foundation/File/MimeType/FileBinaryMimeTypeGuesser.php")
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
