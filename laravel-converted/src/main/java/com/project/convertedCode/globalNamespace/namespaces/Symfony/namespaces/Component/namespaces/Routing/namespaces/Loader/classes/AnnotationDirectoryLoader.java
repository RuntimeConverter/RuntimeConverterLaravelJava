package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Loader.classes;

import com.runtimeconverter.runtime.nativeClasses.spl.iterators.RecursiveCallbackFilterIterator;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.RecursiveDirectoryIterator;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.FilesystemIterator;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Loader.classes.AnnotationFileLoader;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_usort;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.RecursiveIteratorIterator;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes.RouteCollection;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/routing/Loader/AnnotationDirectoryLoader.php

*/

public class AnnotationDirectoryLoader extends AnnotationFileLoader {

    public AnnotationDirectoryLoader(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AnnotationDirectoryLoader.class) {
            this.__construct(env, args);
        }
    }

    public AnnotationDirectoryLoader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(
        index = 1,
        name = "type",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object load(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/routing/Loader")
                        .setFile("/vendor/symfony/routing/Loader/AnnotationDirectoryLoader.php");
        int runtimeConverterContinueCount;
        Object path = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = ZVal.getNull();
        }
        Object file = null;
        Object files = null;
        Object collection = null;
        Object dir = null;
        Object refl = null;
        Object _pClass = null;
        if (!function_is_dir
                .f
                .env(env)
                .call(
                        dir =
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("locator")
                                                .value(),
                                        "locate",
                                        AnnotationDirectoryLoader.class,
                                        path))
                .getBool()) {
            return ZVal.assign(
                    ZVal.isTrue(super.supports(env, path, type))
                            ? super.load(env, path, type)
                            : new RouteCollection(env));
        }

        collection = new RouteCollection(env);
        env.callMethod(
                collection,
                "addResource",
                AnnotationDirectoryLoader.class,
                env.createNew(ZVal.resolveClassAlias(env, "DirectoryResource"), dir, "/\\.php$/"));
        files =
                NamespaceGlobal.iterator_to_array
                        .env(env)
                        .call(
                                new RecursiveIteratorIterator(
                                        env,
                                        new RecursiveCallbackFilterIterator(
                                                env,
                                                new RecursiveDirectoryIterator(
                                                        env,
                                                        dir,
                                                        ZVal.toLong(4096) | ZVal.toLong(512)),
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Symfony\\Component\\Routing\\Loader",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(
                                                        index = 0,
                                                        name = "current",
                                                        typeHint = "SplFileInfo"
                                                    )
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object current =
                                                                assignParameter(args, 0, false);
                                                        return ZVal.assign(
                                                                ZVal.strictNotEqualityCheck(
                                                                        ".",
                                                                        "!==",
                                                                        function_substr
                                                                                .f
                                                                                .env(env)
                                                                                .call(
                                                                                        env
                                                                                                .callMethod(
                                                                                                        current,
                                                                                                        "getBasename",
                                                                                                        AnnotationDirectoryLoader
                                                                                                                .class),
                                                                                        0,
                                                                                        1)
                                                                                .value()));
                                                    }
                                                }),
                                        0))
                        .value();
        function_usort
                .f
                .env(env)
                .call(
                        files,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Symfony\\Component\\Routing\\Loader",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "a", typeHint = "SplFileInfo")
                            @ConvertedParameter(index = 1, name = "b", typeHint = "SplFileInfo")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object a = assignParameter(args, 0, false);
                                Object b = assignParameter(args, 1, false);
                                return ZVal.assign(
                                        ZVal.isGreaterThan(
                                                        toStringR(a, env), '>', toStringR(b, env))
                                                ? 1
                                                : -1);
                            }
                        });
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2023 : ZVal.getIterable(files, env, true)) {
            file = ZVal.assign(zpairResult2023.getValue());
            if (ZVal.toBool(
                            !ZVal.isTrue(
                                    env.callMethod(
                                            file, "isFile", AnnotationDirectoryLoader.class)))
                    || ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    ".php",
                                    "!==",
                                    function_substr
                                            .f
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            file,
                                                            "getFilename",
                                                            AnnotationDirectoryLoader.class),
                                                    -4)
                                            .value()))) {
                continue;
            }

            if (ZVal.isTrue(
                    _pClass =
                            env.callMethod(
                                    this, "findClass", AnnotationDirectoryLoader.class, file))) {
                refl = new ReflectionClass(env, _pClass);
                if (ZVal.isTrue(
                        env.callMethod(refl, "isAbstract", AnnotationDirectoryLoader.class))) {
                    continue;
                }

                env.callMethod(
                        collection,
                        "addCollection",
                        AnnotationDirectoryLoader.class,
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("loader").value(),
                                "load",
                                AnnotationDirectoryLoader.class,
                                _pClass,
                                type));
            }
        }

        return ZVal.assign(collection);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    @ConvertedParameter(
        index = 1,
        name = "type",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object supports(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = ZVal.getNull();
        }
        Object e = null;
        if (ZVal.strictEqualityCheck("annotation", "===", type)) {
            return ZVal.assign(true);
        }

        if (ZVal.toBool(type)
                || ZVal.toBool(!function_is_string.f.env(env).call(resource).getBool())) {
            return ZVal.assign(false);
        }

        try {
            return ZVal.assign(
                    function_is_dir
                            .f
                            .env(env)
                            .call(
                                    env.callMethod(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("locator")
                                                    .value(),
                                            "locate",
                                            AnnotationDirectoryLoader.class,
                                            resource))
                            .value());
        } catch (ConvertedException convertedException300) {
            if (convertedException300.instanceOf(PHPException.class, "Exception")) {
                e = convertedException300.getObject();
                return ZVal.assign(false);
            } else {
                throw convertedException300;
            }
        }
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Routing\\Loader\\AnnotationDirectoryLoader";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AnnotationFileLoader.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Routing\\Loader\\AnnotationDirectoryLoader")
                    .setLookup(
                            AnnotationDirectoryLoader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("loader")
                    .setFilename("vendor/symfony/routing/Loader/AnnotationDirectoryLoader.php")
                    .addExtendsClass("Symfony\\Component\\Routing\\Loader\\AnnotationFileLoader")
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
