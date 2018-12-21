package com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.Log.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psr/log/Psr/Log/LogLevel.php

*/

public class LogLevel extends RuntimeClassBase {

    public LogLevel(RuntimeEnv env, Object... args) {
        super(env);
    }

    public LogLevel(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_EMERGENCY = "emergency";

    public static final Object CONST_ALERT = "alert";

    public static final Object CONST_CRITICAL = "critical";

    public static final Object CONST_ERROR = "error";

    public static final Object CONST_WARNING = "warning";

    public static final Object CONST_NOTICE = "notice";

    public static final Object CONST_INFO = "info";

    public static final Object CONST_DEBUG = "debug";

    public static final Object CONST_class = "Psr\\Log\\LogLevel";

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
                    .setName("Psr\\Log\\LogLevel")
                    .setLookup(
                            LogLevel.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/psr/log/Psr/Log/LogLevel.php")
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
