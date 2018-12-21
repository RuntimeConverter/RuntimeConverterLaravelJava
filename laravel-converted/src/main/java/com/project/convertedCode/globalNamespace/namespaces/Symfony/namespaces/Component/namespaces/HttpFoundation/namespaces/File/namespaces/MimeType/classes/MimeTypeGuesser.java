package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.MimeType.classes;

import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.Exception.classes.AccessDeniedException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.MimeType.classes.FileinfoMimeTypeGuesser;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.MimeType.classes.FileBinaryMimeTypeGuesser;
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
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_file;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/File/MimeType/MimeTypeGuesser.php

*/

public class MimeTypeGuesser extends RuntimeClassBase implements MimeTypeGuesserInterface {

    public Object guessers = ZVal.newArray();

    public MimeTypeGuesser(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MimeTypeGuesser.class) {
            this.__construct(env, args);
        }
    }

    public MimeTypeGuesser(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    private Object __construct(RuntimeEnv env, Object... args) {
        this.register(env, new FileBinaryMimeTypeGuesser(env));
        this.register(env, new FileinfoMimeTypeGuesser(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "guesser",
        typeHint = "Symfony\\Component\\HttpFoundation\\File\\MimeType\\MimeTypeGuesserInterface"
    )
    public Object register(RuntimeEnv env, Object... args) {
        Object guesser = assignParameter(args, 0, false);
        function_array_unshift.f.env(env).call(this.guessers, guesser);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object guess(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object guesser = null;
        Object mimeType = null;
        if (!function_is_file.f.env(env).call(path).getBool()) {
            throw ZVal.getException(env, new FileNotFoundException(env, path));
        }

        if (!NamespaceGlobal.is_readable.env(env).call(path).getBool()) {
            throw ZVal.getException(env, new AccessDeniedException(env, path));
        }

        for (ZPair zpairResult1846 : ZVal.getIterable(this.guessers, env, true)) {
            guesser = ZVal.assign(zpairResult1846.getValue());
            if (ZVal.strictNotEqualityCheck(
                    ZVal.getNull(),
                    "!==",
                    mimeType = env.callMethod(guesser, "guess", MimeTypeGuesser.class, path))) {
                return ZVal.assign(mimeType);
            }
        }

        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                2,
                                                "===",
                                                function_count
                                                        .f
                                                        .env(env)
                                                        .call(this.guessers)
                                                        .value()))
                                && ZVal.toBool(
                                        !ZVal.isTrue(
                                                FileBinaryMimeTypeGuesser.runtimeStaticObject
                                                        .isSupported(env))))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                FileinfoMimeTypeGuesser.runtimeStaticObject.isSupported(env)))) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            "Unable to guess the mime type as no guessers are available (Did you enable the php_fileinfo extension?)"));
        }

        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\File\\MimeType\\MimeTypeGuesser";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object getInstance(RuntimeEnv env, Object... args) {
            if (ZVal.strictEqualityCheck(
                    ZVal.getNull(),
                    "===",
                    env.getRequestStaticProperties(
                                    com.project
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
                                            .namespaces
                                            .MimeType
                                            .classes
                                            .MimeTypeGuesser
                                            .RequestStaticProperties
                                            .class)
                            .instance)) {
                env.getRequestStaticProperties(
                                        com.project
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
                                                .namespaces
                                                .MimeType
                                                .classes
                                                .MimeTypeGuesser
                                                .RequestStaticProperties
                                                .class)
                                .instance =
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
                                .namespaces
                                .MimeType
                                .classes
                                .MimeTypeGuesser(env);
            }

            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
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
                                            .namespaces
                                            .MimeType
                                            .classes
                                            .MimeTypeGuesser
                                            .RequestStaticProperties
                                            .class)
                            .instance);
        }

        @ConvertedMethod
        public Object reset(RuntimeEnv env, Object... args) {
            env.getRequestStaticProperties(
                                    com.project
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
                                            .namespaces
                                            .MimeType
                                            .classes
                                            .MimeTypeGuesser
                                            .RequestStaticProperties
                                            .class)
                            .instance =
                    ZVal.getNull();
            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object instance = ZVal.getNull();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpFoundation\\File\\MimeType\\MimeTypeGuesser")
                    .setLookup(
                            MimeTypeGuesser.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("guessers")
                    .setStaticPropertyNames("instance")
                    .setFilename("vendor/symfony/http-foundation/File/MimeType/MimeTypeGuesser.php")
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
