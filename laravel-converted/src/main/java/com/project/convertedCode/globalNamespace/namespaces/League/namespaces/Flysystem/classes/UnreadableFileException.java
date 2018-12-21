package com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.Exception;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/league/flysystem/src/UnreadableFileException.php

*/

public class UnreadableFileException extends Exception {

    public UnreadableFileException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == UnreadableFileException.class) {
            this.__construct(env, args);
        }
    }

    public UnreadableFileException(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "League\\Flysystem\\UnreadableFileException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Exception.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "fileInfo", typeHint = "SplFileInfo")
        public Object forFileInfo(RuntimeEnv env, Object... args) {
            Object fileInfo = assignParameter(args, 0, false);
            return ZVal.assign(
                    env.createNewWithLateStaticBindings(
                            this,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Unreadable file encountered: %s",
                                            env.callMethod(
                                                    fileInfo,
                                                    "getRealPath",
                                                    UnreadableFileException.class))
                                    .value()));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("League\\Flysystem\\UnreadableFileException")
                    .setLookup(
                            UnreadableFileException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/league/flysystem/src/UnreadableFileException.php")
                    .addInterface("Throwable")
                    .addExtendsClass("League\\Flysystem\\Exception")
                    .addExtendsClass("Exception")
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
