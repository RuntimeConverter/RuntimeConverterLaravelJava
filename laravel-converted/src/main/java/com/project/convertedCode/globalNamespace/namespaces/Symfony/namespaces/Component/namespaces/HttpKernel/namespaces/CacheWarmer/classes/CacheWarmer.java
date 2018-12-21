package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.CacheWarmer.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.CacheWarmer.classes.CacheWarmerInterface;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/CacheWarmer/CacheWarmer.php

*/

public abstract class CacheWarmer extends RuntimeClassBase implements CacheWarmerInterface {

    public CacheWarmer(RuntimeEnv env, Object... args) {
        super(env);
    }

    public CacheWarmer(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    @ConvertedParameter(index = 1, name = "content")
    protected Object writeCacheFile(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        Object content = assignParameter(args, 1, false);
        Object tmpFile = null;
        tmpFile =
                NamespaceGlobal.tempnam
                        .env(env)
                        .call(
                                function_dirname.f.env(env).call(file).value(),
                                NamespaceGlobal.basename.env(env).call(file).value())
                        .value();
        if (ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                false,
                                "!==",
                                NamespaceGlobal.file_put_contents
                                        .env(env)
                                        .call(tmpFile, content)
                                        .value()))
                && ZVal.toBool(NamespaceGlobal.rename.env(env).call(tmpFile, file).value())) {
            NamespaceGlobal.chmod
                    .env(env)
                    .call(
                            file,
                            ZVal.toLong(438)
                                    & ZVal.toLong(
                                            ~ZVal.toLong(
                                                    NamespaceGlobal.umask.env(env).call().value())))
                    .value();
            return null;
        }

        throw ZVal.getException(
                env,
                new RuntimeException(
                        env,
                        function_sprintf
                                .f
                                .env(env)
                                .call("Failed to write cache file \"%s\".", file)
                                .value()));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\CacheWarmer\\CacheWarmer";

    @ConvertedMethod()
    public abstract Object isOptional(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object warmUp(RuntimeEnv env, Object... args);

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
                    .setName("Symfony\\Component\\HttpKernel\\CacheWarmer\\CacheWarmer")
                    .setLookup(
                            CacheWarmer.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/http-kernel/CacheWarmer/CacheWarmer.php")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\CacheWarmer\\CacheWarmerInterface")
                    .addInterface("Symfony\\Component\\HttpKernel\\CacheWarmer\\WarmableInterface")
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
