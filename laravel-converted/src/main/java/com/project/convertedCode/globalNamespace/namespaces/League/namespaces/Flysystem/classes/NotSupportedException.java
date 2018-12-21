package com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/league/flysystem/src/NotSupportedException.php

*/

public class NotSupportedException extends RuntimeException {

    public NotSupportedException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == NotSupportedException.class) {
            this.__construct(env, args);
        }
    }

    public NotSupportedException(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "League\\Flysystem\\NotSupportedException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends RuntimeException.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "file", typeHint = "SplFileInfo")
        public Object forLink(RuntimeEnv env, Object... args) {
            Object file = assignParameter(args, 0, false);
            Object message = null;
            message = "Links are not supported, encountered link at ";
            return ZVal.assign(
                    env.createNewWithLateStaticBindings(
                            this,
                            toStringR(message, env)
                                    + toStringR(
                                            env.callMethod(
                                                    file,
                                                    "getPathname",
                                                    NotSupportedException.class),
                                            env)));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "systemType")
        public Object forFtpSystemType(RuntimeEnv env, Object... args) {
            Object systemType = assignParameter(args, 0, false);
            Object message = null;
            message =
                    ZVal.assign(
                            "The FTP system type '"
                                    + toStringR(systemType, env)
                                    + "' is currently not supported.");
            return ZVal.assign(env.createNewWithLateStaticBindings(this, message));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("League\\Flysystem\\NotSupportedException")
                    .setLookup(
                            NotSupportedException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/league/flysystem/src/NotSupportedException.php")
                    .addInterface("Throwable")
                    .addExtendsClass("RuntimeException")
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
