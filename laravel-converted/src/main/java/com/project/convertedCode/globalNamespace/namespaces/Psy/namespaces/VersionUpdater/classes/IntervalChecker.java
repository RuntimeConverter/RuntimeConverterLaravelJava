package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.VersionUpdater.classes;

import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.VersionUpdater.classes.Checker;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeClasses.date.DateInterval;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.date.function_date;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.VersionUpdater.classes.GitHubChecker;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/VersionUpdater/IntervalChecker.php

*/

public class IntervalChecker extends GitHubChecker {

    public Object cacheFile = null;

    public Object interval = null;

    public IntervalChecker(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IntervalChecker.class) {
            this.__construct(env, args);
        }
    }

    public IntervalChecker(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cacheFile")
    @ConvertedParameter(index = 1, name = "interval")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object cacheFile = assignParameter(args, 0, false);
        Object interval = assignParameter(args, 1, false);
        this.cacheFile = cacheFile;
        this.interval = interval;
        return null;
    }

    @ConvertedMethod
    public Object fetchLatestRelease(RuntimeEnv env, Object... args) {
        Object lastCheck = null;
        Object release = null;
        Object cached = null;
        Object now = null;
        cached =
                NamespaceGlobal.json_decode
                        .env(env)
                        .call(
                                function_file_get_contents
                                        .f
                                        .env(env)
                                        .call(this.cacheFile, false)
                                        .value())
                        .value();
        if (ZVal.toBool(
                        ZVal.toBool(cached)
                                && ZVal.toBool(
                                        ZVal.isset(
                                                toObjectR(cached)
                                                        .accessProp(this, env)
                                                        .name("last_check")
                                                        .value())))
                && ZVal.toBool(
                        ZVal.isset(
                                toObjectR(cached).accessProp(this, env).name("release").value()))) {
            now = new DateTime(env);
            lastCheck =
                    new DateTime(
                            env,
                            toObjectR(cached).accessProp(this, env).name("last_check").value());
            if (ZVal.isGreaterThanOrEqualTo(
                    lastCheck,
                    ">=",
                    env.callMethod(now, "sub", IntervalChecker.class, this.getDateInterval(env)))) {
                return ZVal.assign(toObjectR(cached).accessProp(this, env).name("release").value());
            }
        }

        release = super.fetchLatestRelease(env);
        if (ZVal.toBool(release)
                && ZVal.toBool(
                        ZVal.isset(
                                toObjectR(release)
                                        .accessProp(this, env)
                                        .name("tag_name")
                                        .value()))) {
            this.updateCache(env, release);
        }

        return ZVal.assign(release);
    }

    @ConvertedMethod
    private Object getDateInterval(RuntimeEnv env, Object... args) {
        SwitchEnumType92 switchVariable92 =
                ZVal.getEnum(
                        this.interval,
                        SwitchEnumType92.DEFAULT_CASE,
                        SwitchEnumType92.DYNAMIC_TYPE_328,
                        Checker.CONST_DAILY,
                        SwitchEnumType92.DYNAMIC_TYPE_329,
                        Checker.CONST_WEEKLY,
                        SwitchEnumType92.DYNAMIC_TYPE_330,
                        Checker.CONST_MONTHLY);
        switch (switchVariable92) {
            case DYNAMIC_TYPE_328:
                return ZVal.assign(new DateInterval(env, "P1D"));
            case DYNAMIC_TYPE_329:
                return ZVal.assign(new DateInterval(env, "P1W"));
            case DYNAMIC_TYPE_330:
                return ZVal.assign(new DateInterval(env, "P1M"));
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "release")
    private Object updateCache(RuntimeEnv env, Object... args) {
        Object release = assignParameter(args, 0, false);
        Object data = null;
        data =
                ZVal.newArray(
                        new ZPair(
                                "last_check",
                                function_date.f.env(env).call("Y-m-d\\TH:i:sP").value()),
                        new ZPair("release", release));
        NamespaceGlobal.file_put_contents
                .env(env)
                .call(this.cacheFile, NamespaceGlobal.json_encode.env(env).call(data).value());
        return null;
    }

    public static final Object CONST_class = "Psy\\VersionUpdater\\IntervalChecker";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends GitHubChecker.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\VersionUpdater\\IntervalChecker")
                    .setLookup(
                            IntervalChecker.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("cacheFile", "interval", "latest")
                    .setFilename("vendor/psy/psysh/src/VersionUpdater/IntervalChecker.php")
                    .addInterface("Psy\\VersionUpdater\\Checker")
                    .addExtendsClass("Psy\\VersionUpdater\\GitHubChecker")
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

    private enum SwitchEnumType92 {
        DYNAMIC_TYPE_328,
        DYNAMIC_TYPE_329,
        DYNAMIC_TYPE_330,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
