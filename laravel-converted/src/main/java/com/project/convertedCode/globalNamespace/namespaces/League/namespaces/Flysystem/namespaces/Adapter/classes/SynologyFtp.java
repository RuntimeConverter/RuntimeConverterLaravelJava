package com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Adapter.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Adapter.classes.Ftpd;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/league/flysystem/src/Adapter/SynologyFtp.php

*/

public class SynologyFtp extends Ftpd {

    public SynologyFtp(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SynologyFtp.class) {
            this.__construct(env, args);
        }
    }

    public SynologyFtp(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "League\\Flysystem\\Adapter\\SynologyFtp";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Ftpd.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("League\\Flysystem\\Adapter\\SynologyFtp")
                    .setLookup(
                            SynologyFtp.class,
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
                    .setFilename("vendor/league/flysystem/src/Adapter/SynologyFtp.php")
                    .addInterface("League\\Flysystem\\AdapterInterface")
                    .addInterface("League\\Flysystem\\ReadInterface")
                    .addExtendsClass("League\\Flysystem\\Adapter\\Ftpd")
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
