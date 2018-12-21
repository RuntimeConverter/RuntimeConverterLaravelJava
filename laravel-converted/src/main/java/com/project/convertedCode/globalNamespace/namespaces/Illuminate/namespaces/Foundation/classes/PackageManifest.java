package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.functions.collect;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/PackageManifest.php

*/

public class PackageManifest extends RuntimeClassBase {

    public Object files = null;

    public Object basePath = null;

    public Object vendorPath = null;

    public Object manifestPath = null;

    public Object manifest = null;

    public PackageManifest(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PackageManifest.class) {
            this.__construct(env, args);
        }
    }

    public PackageManifest(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "files", typeHint = "Illuminate\\Filesystem\\Filesystem")
    @ConvertedParameter(index = 1, name = "basePath")
    @ConvertedParameter(index = 2, name = "manifestPath")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object files = assignParameter(args, 0, false);
        Object basePath = assignParameter(args, 1, false);
        Object manifestPath = assignParameter(args, 2, false);
        this.files = files;
        this.basePath = basePath;
        this.manifestPath = manifestPath;
        this.vendorPath = toStringR(basePath, env) + "/vendor";
        return null;
    }

    @ConvertedMethod
    public Object providers(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Foundation")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/PackageManifest.php");
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        collect.f.env(env).call(this.getManifest(env)).value(),
                                        "flatMap",
                                        PackageManifest.class,
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Illuminate\\Foundation",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(index = 0, name = "configuration")
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                ReferenceContainer configuration =
                                                        new BasicReferenceContainer(
                                                                assignParameter(args, 0, false));
                                                Object ternaryExpressionTemp = null;
                                                return ZVal.assign(
                                                        rToArrayCast(
                                                                ZVal.isDefined(
                                                                                ternaryExpressionTemp =
                                                                                        configuration
                                                                                                .arrayGet(
                                                                                                        env,
                                                                                                        "providers"))
                                                                        ? ternaryExpressionTemp
                                                                        : ZVal.newArray()));
                                            }
                                        }),
                                "filter",
                                PackageManifest.class),
                        "all",
                        PackageManifest.class));
    }

    @ConvertedMethod
    public Object aliases(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Foundation")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/PackageManifest.php");
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        collect.f.env(env).call(this.getManifest(env)).value(),
                                        "flatMap",
                                        PackageManifest.class,
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Illuminate\\Foundation",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(index = 0, name = "configuration")
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                ReferenceContainer configuration =
                                                        new BasicReferenceContainer(
                                                                assignParameter(args, 0, false));
                                                Object ternaryExpressionTemp = null;
                                                return ZVal.assign(
                                                        rToArrayCast(
                                                                ZVal.isDefined(
                                                                                ternaryExpressionTemp =
                                                                                        configuration
                                                                                                .arrayGet(
                                                                                                        env,
                                                                                                        "aliases"))
                                                                        ? ternaryExpressionTemp
                                                                        : ZVal.newArray()));
                                            }
                                        }),
                                "filter",
                                PackageManifest.class),
                        "all",
                        PackageManifest.class));
    }

    @ConvertedMethod
    protected Object getManifest(RuntimeEnv env, Object... args) {
        if (!function_is_null.f.env(env).call(this.manifest).getBool()) {
            return ZVal.assign(this.manifest);
        }

        if (!function_file_exists.f.env(env).call(this.manifestPath).getBool()) {
            this.build(env);
        }

        return ZVal.assign(
                this.manifest =
                        function_file_exists.f.env(env).call(this.manifestPath).getBool()
                                ? env.callMethod(
                                        this.files,
                                        "getRequire",
                                        PackageManifest.class,
                                        this.manifestPath)
                                : ZVal.newArray());
    }

    @ConvertedMethod
    public Object build(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Foundation")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/PackageManifest.php");
        Object path = null;
        Object ignoreAll = null;
        ReferenceContainer ignore = new BasicReferenceContainer(null);
        Object packages = null;
        packages = ZVal.newArray();
        if (ZVal.isTrue(
                env.callMethod(
                        this.files,
                        "exists",
                        PackageManifest.class,
                        path = toStringR(this.vendorPath, env) + "/composer/installed.json"))) {
            packages =
                    NamespaceGlobal.json_decode
                            .env(env)
                            .call(
                                    env.callMethod(this.files, "get", PackageManifest.class, path),
                                    true)
                            .value();
        }

        ignoreAll =
                function_in_array
                        .f
                        .env(env)
                        .call("*", ignore.setObject(this.packagesToIgnore(env)))
                        .value();
        this.write(
                env,
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                env.callMethod(
                                                        collect.f.env(env).call(packages).value(),
                                                        "mapWithKeys",
                                                        PackageManifest.class,
                                                        new Closure(
                                                                env,
                                                                runtimeConverterFunctionClassConstants,
                                                                "Illuminate\\Foundation",
                                                                this) {
                                                            @Override
                                                            @ConvertedMethod
                                                            @ConvertedParameter(
                                                                index = 0,
                                                                name = "package"
                                                            )
                                                            public Object run(
                                                                    RuntimeEnv env,
                                                                    Object thisvar,
                                                                    PassByReferenceArgs
                                                                            runtimePassByReferenceArgs,
                                                                    Object... args) {
                                                                Object _closureThisVar =
                                                                        this.getClosureThisVar();
                                                                ReferenceContainer _pPackage =
                                                                        new BasicReferenceContainer(
                                                                                assignParameter(
                                                                                        args, 0,
                                                                                        false));
                                                                Object ternaryExpressionTemp = null;
                                                                return ZVal.assign(
                                                                        ZVal.newArray(
                                                                                new ZPair(
                                                                                        PackageManifest
                                                                                                .this
                                                                                                .format(
                                                                                                        env,
                                                                                                        _pPackage
                                                                                                                .arrayGet(
                                                                                                                        env,
                                                                                                                        "name")),
                                                                                        ZVal
                                                                                                        .isDefined(
                                                                                                                ternaryExpressionTemp =
                                                                                                                        _pPackage
                                                                                                                                .arrayGet(
                                                                                                                                        env,
                                                                                                                                        "extra",
                                                                                                                                        "laravel"))
                                                                                                ? ternaryExpressionTemp
                                                                                                : ZVal
                                                                                                        .newArray())));
                                                            }
                                                        }),
                                                "each",
                                                PackageManifest.class,
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Illuminate\\Foundation",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(
                                                        index = 0,
                                                        name = "configuration"
                                                    )
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        ReferenceContainer configuration =
                                                                new BasicReferenceContainer(
                                                                        assignParameter(
                                                                                args, 0, false));
                                                        ReferenceContainer ignore =
                                                                new BasicReferenceContainer(null);
                                                        Object ternaryExpressionTemp = null;
                                                        ignore =
                                                                this.contextReferences
                                                                        .getReferenceContainer(
                                                                                "ignore");
                                                        ignore.setObject(
                                                                function_array_merge
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                ignore.getObject(),
                                                                                ZVal.isDefined(
                                                                                                ternaryExpressionTemp =
                                                                                                        configuration
                                                                                                                .arrayGet(
                                                                                                                        env,
                                                                                                                        "dont-discover"))
                                                                                        ? ternaryExpressionTemp
                                                                                        : ZVal
                                                                                                .newArray())
                                                                        .value());
                                                        return null;
                                                    }
                                                }.useRef("ignore", ignore)),
                                        "reject",
                                        PackageManifest.class,
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Illuminate\\Foundation",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(index = 0, name = "configuration")
                                            @ConvertedParameter(index = 1, name = "package")
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                Object configuration =
                                                        assignParameter(args, 0, false);
                                                Object _pPackage = assignParameter(args, 1, false);
                                                Object ignoreAll = null;
                                                Object ignore = null;
                                                ignoreAll =
                                                        this.contextReferences.getCapturedValue(
                                                                "ignoreAll");
                                                ignore =
                                                        this.contextReferences.getCapturedValue(
                                                                "ignore");
                                                return ZVal.assign(
                                                        ZVal.toBool(ignoreAll)
                                                                || ZVal.toBool(
                                                                        function_in_array
                                                                                .f
                                                                                .env(env)
                                                                                .call(
                                                                                        _pPackage,
                                                                                        ignore)
                                                                                .value()));
                                            }
                                        }.use("ignoreAll", ignoreAll).use("ignore", ignore)),
                                "filter",
                                PackageManifest.class),
                        "all",
                        PackageManifest.class));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "package")
    protected Object format(RuntimeEnv env, Object... args) {
        Object _pPackage = assignParameter(args, 0, false);
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(toStringR(this.vendorPath, env) + "/", "", _pPackage)
                        .value());
    }

    @ConvertedMethod
    protected Object packagesToIgnore(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        if (!function_file_exists
                .f
                .env(env)
                .call(toStringR(this.basePath, env) + "/composer.json")
                .getBool()) {
            return ZVal.assign(ZVal.newArray());
        }

        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        handleReturnReference(
                                                        NamespaceGlobal.json_decode
                                                                .env(env)
                                                                .call(
                                                                        function_file_get_contents
                                                                                .f
                                                                                .env(env)
                                                                                .call(
                                                                                        toStringR(
                                                                                                        this
                                                                                                                .basePath,
                                                                                                        env)
                                                                                                + "/composer.json")
                                                                                .value(),
                                                                        true)
                                                                .value())
                                                .arrayGet(env, "extra", "laravel", "dont-discover"))
                        ? ternaryExpressionTemp
                        : ZVal.newArray());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "manifest", typeHint = "array")
    protected Object write(RuntimeEnv env, Object... args) {
        Object manifest = assignParameter(args, 0, false);
        if (!NamespaceGlobal.is_writable
                .env(env)
                .call(function_dirname.f.env(env).call(this.manifestPath).value())
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new PHPException(
                            env,
                            "The "
                                    + toStringR(
                                            function_dirname
                                                    .f
                                                    .env(env)
                                                    .call(this.manifestPath)
                                                    .value(),
                                            env)
                                    + " directory must be present and writable."));
        }

        env.callMethod(
                this.files,
                "put",
                PackageManifest.class,
                this.manifestPath,
                "<?php return "
                        + toStringR(
                                NamespaceGlobal.var_export.env(env).call(manifest, true).value(),
                                env)
                        + ";");
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\PackageManifest";

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
                    .setName("Illuminate\\Foundation\\PackageManifest")
                    .setLookup(
                            PackageManifest.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "basePath", "files", "manifest", "manifestPath", "vendorPath")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/PackageManifest.php")
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
