package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Loader.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.InvalidResourceException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Loader.classes.ArrayLoader;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.NotFoundResourceException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Loader/FileLoader.php

*/

public abstract class FileLoader extends ArrayLoader {

    public FileLoader(RuntimeEnv env, Object... args) {
        super(env);
    }

    public FileLoader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    @ConvertedParameter(index = 1, name = "locale")
    @ConvertedParameter(index = 2, name = "domain")
    public Object load(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        Object locale = assignParameter(args, 1, false);
        Object domain = assignParameter(args, 2, true);
        if (null == domain) {
            domain = "messages";
        }
        Object messages = null;
        Object catalogue = null;
        if (!NamespaceGlobal.stream_is_local.env(env).call(resource).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidResourceException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("This is not a local file \"%s\".", resource)
                                    .value()));
        }

        if (!function_file_exists.f.env(env).call(resource).getBool()) {
            throw ZVal.getException(
                    env,
                    new NotFoundResourceException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("File \"%s\" not found.", resource)
                                    .value()));
        }

        messages = env.callMethod(this, "loadResource", FileLoader.class, resource);
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", messages)) {
            messages = ZVal.newArray();
        }

        if (!function_is_array.f.env(env).call(messages).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidResourceException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Unable to load file \"%s\".", resource)
                                    .value()));
        }

        catalogue = super.load(env, messages, locale, domain);
        if (function_class_exists
                .f
                .env(env)
                .call("Symfony\\Component\\Config\\Resource\\FileResource")
                .getBool()) {
            env.callMethod(
                    catalogue,
                    "addResource",
                    FileLoader.class,
                    env.createNew(ZVal.resolveClassAlias(env, "FileResource"), resource));
        }

        return ZVal.assign(catalogue);
    }

    public static final Object CONST_class = "Symfony\\Component\\Translation\\Loader\\FileLoader";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ArrayLoader.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Translation\\Loader\\FileLoader")
                    .setLookup(
                            FileLoader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/translation/Loader/FileLoader.php")
                    .addInterface("Symfony\\Component\\Translation\\Loader\\LoaderInterface")
                    .addExtendsClass("Symfony\\Component\\Translation\\Loader\\ArrayLoader")
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
