package com.project.convertedCode.globalNamespace.namespaces.XdgBaseDir.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/dnoegel/php-xdg-base-dir/src/Xdg.php

*/

public class Xdg extends RuntimeClassBase {

    public Xdg(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Xdg(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getHomeDir(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isTrue(
                                ternaryExpressionTemp =
                                        NamespaceGlobal.getenv.env(env).call("HOME").value())
                        ? ternaryExpressionTemp
                        : toStringR(NamespaceGlobal.getenv.env(env).call("HOMEDRIVE").value(), env)
                                + toStringR("/", env)
                                + toStringR(
                                        NamespaceGlobal.getenv.env(env).call("HOMEPATH").value(),
                                        env));
    }

    @ConvertedMethod
    public Object getHomeConfigDir(RuntimeEnv env, Object... args) {
        Object path = null;
        Object ternaryExpressionTemp = null;
        path =
                ZVal.assign(
                        ZVal.isTrue(
                                        ternaryExpressionTemp =
                                                NamespaceGlobal.getenv
                                                        .env(env)
                                                        .call("XDG_CONFIG_HOME")
                                                        .value())
                                ? ternaryExpressionTemp
                                : toStringR(this.getHomeDir(env), env)
                                        + toStringR("/", env)
                                        + ".config");
        return ZVal.assign(path);
    }

    @ConvertedMethod
    public Object getHomeDataDir(RuntimeEnv env, Object... args) {
        Object path = null;
        Object ternaryExpressionTemp = null;
        path =
                ZVal.assign(
                        ZVal.isTrue(
                                        ternaryExpressionTemp =
                                                NamespaceGlobal.getenv
                                                        .env(env)
                                                        .call("XDG_DATA_HOME")
                                                        .value())
                                ? ternaryExpressionTemp
                                : toStringR(this.getHomeDir(env), env)
                                        + toStringR("/", env)
                                        + ".local"
                                        + toStringR("/", env)
                                        + "share");
        return ZVal.assign(path);
    }

    @ConvertedMethod
    public Object getConfigDirs(RuntimeEnv env, Object... args) {
        Object configDirs = null;
        Object paths = null;
        configDirs =
                ZVal.assign(
                        NamespaceGlobal.getenv.env(env).call("XDG_CONFIG_DIRS").getBool()
                                ? function_explode
                                        .f
                                        .env(env)
                                        .call(
                                                ":",
                                                NamespaceGlobal.getenv
                                                        .env(env)
                                                        .call("XDG_CONFIG_DIRS")
                                                        .value())
                                        .value()
                                : ZVal.arrayFromList("/etc/xdg"));
        paths =
                function_array_merge
                        .f
                        .env(env)
                        .call(ZVal.newArray(new ZPair(0, this.getHomeConfigDir(env))), configDirs)
                        .value();
        return ZVal.assign(paths);
    }

    @ConvertedMethod
    public Object getDataDirs(RuntimeEnv env, Object... args) {
        Object paths = null;
        Object dataDirs = null;
        dataDirs =
                ZVal.assign(
                        NamespaceGlobal.getenv.env(env).call("XDG_DATA_DIRS").getBool()
                                ? function_explode
                                        .f
                                        .env(env)
                                        .call(
                                                ":",
                                                NamespaceGlobal.getenv
                                                        .env(env)
                                                        .call("XDG_DATA_DIRS")
                                                        .value())
                                        .value()
                                : ZVal.arrayFromList("/usr/local/share", "/usr/share"));
        paths =
                function_array_merge
                        .f
                        .env(env)
                        .call(ZVal.newArray(new ZPair(0, this.getHomeDataDir(env))), dataDirs)
                        .value();
        return ZVal.assign(paths);
    }

    @ConvertedMethod
    public Object getHomeCacheDir(RuntimeEnv env, Object... args) {
        Object path = null;
        Object ternaryExpressionTemp = null;
        path =
                ZVal.assign(
                        ZVal.isTrue(
                                        ternaryExpressionTemp =
                                                NamespaceGlobal.getenv
                                                        .env(env)
                                                        .call("XDG_CACHE_HOME")
                                                        .value())
                                ? ternaryExpressionTemp
                                : toStringR(this.getHomeDir(env), env)
                                        + toStringR("/", env)
                                        + ".cache");
        return ZVal.assign(path);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "strict",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object getRuntimeDir(RuntimeEnv env, Object... args) {
        Object strict = assignParameter(args, 0, true);
        if (null == strict) {
            strict = true;
        }
        ReferenceContainer st = new BasicReferenceContainer(null);
        Object create = null;
        Object fallback = null;
        Object runtimeDir = null;
        if (ZVal.isTrue(
                runtimeDir = NamespaceGlobal.getenv.env(env).call("XDG_RUNTIME_DIR").value())) {
            return ZVal.assign(runtimeDir);
        }

        if (ZVal.isTrue(strict)) {
            throw ZVal.getException(env, new RuntimeException(env, "XDG_RUNTIME_DIR was not set"));
        }

        fallback =
                toStringR(NamespaceGlobal.sys_get_temp_dir.env(env).call().value(), env)
                        + toStringR("/", env)
                        + toStringR(CONST_RUNTIME_DIR_FALLBACK, env)
                        + toStringR(NamespaceGlobal.getenv.env(env).call("USER").value(), env);
        create = false;
        if (!function_is_dir.f.env(env).call(fallback).getBool()) {
            NamespaceGlobal.mkdir.env(env).call(fallback, 448, true);
        }

        st.setObject(NamespaceGlobal.lstat.env(env).call(fallback).value());
        if (ZVal.isTrue(
                ZVal.toLong(!ZVal.isTrue(st.arrayGet(env, "mode"))) & ZVal.toLong(CONST_S_IFDIR))) {
            NamespaceGlobal.rmdir.env(env).call(fallback);
            create = true;

        } else if (ZVal.toBool(
                        ZVal.notEqualityCheck(
                                st.arrayGet(env, "uid"),
                                NamespaceGlobal.getmyuid.env(env).call().value()))
                || ZVal.toBool(
                        ZVal.toLong(st.arrayGet(env, "mode"))
                                & ZVal.toLong(
                                        ZVal.toLong(CONST_S_IRWXG) | ZVal.toLong(CONST_S_IRWXO)))) {
            NamespaceGlobal.rmdir.env(env).call(fallback);
            create = true;
        }

        if (ZVal.isTrue(create)) {
            NamespaceGlobal.mkdir.env(env).call(fallback, 448, true);
        }

        return ZVal.assign(fallback);
    }

    public static final Object CONST_S_IFDIR = 16384;

    public static final Object CONST_S_IRWXO = 7;

    public static final Object CONST_S_IRWXG = 46;

    public static final Object CONST_RUNTIME_DIR_FALLBACK = "php-xdg-runtime-dir-fallback-";

    public static final Object CONST_class = "XdgBaseDir\\Xdg";

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
                    .setName("XdgBaseDir\\Xdg")
                    .setLookup(
                            Xdg.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/dnoegel/php-xdg-base-dir/src/Xdg.php")
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
