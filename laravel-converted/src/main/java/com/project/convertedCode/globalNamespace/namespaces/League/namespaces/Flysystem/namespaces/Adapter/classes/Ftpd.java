package com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Adapter.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Adapter.classes.Ftp;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/league/flysystem/src/Adapter/Ftpd.php

*/

public class Ftpd extends Ftp {

    public Ftpd(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Ftpd.class) {
            this.__construct(env, args);
        }
    }

    public Ftpd(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getMetadata(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        ReferenceContainer _object = new BasicReferenceContainer(null);
        if (ZVal.strictEqualityCheck(path, "===", "")) {
            return ZVal.assign(ZVal.newArray(new ZPair("type", "dir"), new ZPair("path", "")));
        }

        if (ZVal.toBool(
                        !ZVal.isTrue(
                                _object.setObject(
                                        NamespaceGlobal.ftp_raw
                                                .env(env)
                                                .call(
                                                        env.callMethod(
                                                                this, "getConnection", Ftpd.class),
                                                        "STAT " + toStringR(path, env))
                                                .value())))
                || ZVal.toBool(
                        ZVal.isLessThan(
                                function_count.f.env(env).call(_object.getObject()).value(),
                                '<',
                                3))) {
            return ZVal.assign(false);
        }

        if (ZVal.strictEqualityCheck(
                function_substr.f.env(env).call(_object.arrayGet(env, 1), 0, 5).value(),
                "===",
                "ftpd:")) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                env.callMethod(this, "normalizeObject", Ftpd.class, _object.arrayGet(env, 1), ""));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory")
    @ConvertedParameter(
        index = 1,
        name = "recursive",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    protected Object listDirectoryContents(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, false);
        Object recursive = assignParameter(args, 1, true);
        if (null == recursive) {
            recursive = true;
        }
        ReferenceContainer listing = new BasicReferenceContainer(null);
        listing.setObject(
                NamespaceGlobal.ftp_rawlist
                        .env(env)
                        .call(
                                env.callMethod(this, "getConnection", Ftpd.class),
                                directory,
                                recursive)
                        .value());
        if (ZVal.toBool(ZVal.strictEqualityCheck(listing.getObject(), "===", false))
                || ZVal.toBool(
                        ZVal.toBool(!ZVal.isEmpty(listing.getObject()))
                                && ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                function_substr
                                                        .f
                                                        .env(env)
                                                        .call(listing.arrayGet(env, 0), 0, 5)
                                                        .value(),
                                                "===",
                                                "ftpd:")))) {
            return ZVal.assign(ZVal.newArray());
        }

        return ZVal.assign(
                env.callMethod(
                        this, "normalizeListing", Ftpd.class, listing.getObject(), directory));
    }

    public static final Object CONST_class = "League\\Flysystem\\Adapter\\Ftpd";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Ftp.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("League\\Flysystem\\Adapter\\Ftpd")
                    .setLookup(
                            Ftpd.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "alternativeRecursion",
                            "configurable",
                            "configurable",
                            "connection",
                            "host",
                            "ignorePassiveAddress",
                            "isPureFtpd",
                            "passive",
                            "pathPrefix",
                            "pathSeparator",
                            "permPrivate",
                            "permPublic",
                            "port",
                            "recurseManually",
                            "root",
                            "safeStorage",
                            "separator",
                            "ssl",
                            "systemType",
                            "timeout",
                            "transferMode",
                            "utf8")
                    .setFilename("vendor/league/flysystem/src/Adapter/Ftpd.php")
                    .addInterface("League\\Flysystem\\AdapterInterface")
                    .addInterface("League\\Flysystem\\ReadInterface")
                    .addExtendsClass("League\\Flysystem\\Adapter\\Ftp")
                    .addExtendsClass("League\\Flysystem\\Adapter\\AbstractFtpAdapter")
                    .addExtendsClass("League\\Flysystem\\Adapter\\AbstractAdapter")
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
