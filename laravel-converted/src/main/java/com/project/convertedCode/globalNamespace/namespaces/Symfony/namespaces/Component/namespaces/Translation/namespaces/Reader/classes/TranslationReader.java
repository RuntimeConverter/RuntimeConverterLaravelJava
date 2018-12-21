package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Reader.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.classes.Finder;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Reader.classes.TranslationReaderInterface;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Reader/TranslationReader.php

*/

public class TranslationReader extends RuntimeClassBase implements TranslationReaderInterface {

    public Object loaders = ZVal.newArray();

    public TranslationReader(RuntimeEnv env, Object... args) {
        super(env);
    }

    public TranslationReader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "format")
    @ConvertedParameter(
        index = 1,
        name = "loader",
        typeHint = "Symfony\\Component\\Translation\\Loader\\LoaderInterface"
    )
    public Object addLoader(RuntimeEnv env, Object... args) {
        Object format = assignParameter(args, 0, false);
        Object loader = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "loaders", env).arrayAccess(env, format).set(loader);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory")
    @ConvertedParameter(
        index = 1,
        name = "catalogue",
        typeHint = "Symfony\\Component\\Translation\\MessageCatalogue"
    )
    public Object read(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, false);
        Object catalogue = assignParameter(args, 1, false);
        Object extension = null;
        Object file = null;
        Object loader = null;
        Object domain = null;
        Object format = null;
        Object files = null;
        Object finder = null;
        if (!function_is_dir.f.env(env).call(directory).getBool()) {
            return null;
        }

        for (ZPair zpairResult2163 : ZVal.getIterable(this.loaders, env, false)) {
            format = ZVal.assign(zpairResult2163.getKey());
            loader = ZVal.assign(zpairResult2163.getValue());
            finder = new Finder(env);
            extension =
                    toStringR(env.callMethod(catalogue, "getLocale", TranslationReader.class), env)
                            + "."
                            + toStringR(format, env);
            files =
                    env.callMethod(
                            env.callMethod(
                                    env.callMethod(finder, "files", TranslationReader.class),
                                    "name",
                                    TranslationReader.class,
                                    "*." + toStringR(extension, env)),
                            "in",
                            TranslationReader.class,
                            directory);
            for (ZPair zpairResult2164 : ZVal.getIterable(files, env, true)) {
                file = ZVal.assign(zpairResult2164.getValue());
                domain =
                        function_substr
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(
                                                file, "getFilename", TranslationReader.class),
                                        0,
                                        ZVal.subtract(
                                                ZVal.multiply(
                                                        -1,
                                                        function_strlen
                                                                .f
                                                                .env(env)
                                                                .call(extension)
                                                                .value()),
                                                1))
                                .value();
                env.callMethod(
                        catalogue,
                        "addCatalogue",
                        TranslationReader.class,
                        env.callMethod(
                                loader,
                                "load",
                                TranslationReader.class,
                                env.callMethod(file, "getPathname", TranslationReader.class),
                                env.callMethod(catalogue, "getLocale", TranslationReader.class),
                                domain));
            }
        }

        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\Reader\\TranslationReader";

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
                    .setName("Symfony\\Component\\Translation\\Reader\\TranslationReader")
                    .setLookup(
                            TranslationReader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("loaders")
                    .setFilename("vendor/symfony/translation/Reader/TranslationReader.php")
                    .addInterface(
                            "Symfony\\Component\\Translation\\Reader\\TranslationReaderInterface")
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
