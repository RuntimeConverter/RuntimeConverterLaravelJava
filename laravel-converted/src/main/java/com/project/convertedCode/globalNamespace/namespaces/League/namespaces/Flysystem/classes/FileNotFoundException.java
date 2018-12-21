package com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.Exception;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/league/flysystem/src/FileNotFoundException.php

*/

public class FileNotFoundException extends Exception {

    public Object path = null;

    public FileNotFoundException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FileNotFoundException.class) {
            this.__construct(env, args);
        }
    }

    public FileNotFoundException(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "code", defaultValue = "0", defaultValueType = "number")
    @ConvertedParameter(
        index = 2,
        name = "previous",
        typeHint = "Exception",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object code = assignParameter(args, 1, true);
        if (null == code) {
            code = 0;
        }
        Object previous = assignParameter(args, 2, true);
        if (null == previous) {
            previous = ZVal.getNull();
        }
        this.path = path;
        super.__construct(
                env,
                "File not found at path: " + toStringR(this.getPath(env), env),
                code,
                previous);
        return null;
    }

    @ConvertedMethod
    public Object getPath(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.path);
    }

    public static final Object CONST_class = "League\\Flysystem\\FileNotFoundException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Exception.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("League\\Flysystem\\FileNotFoundException")
                    .setLookup(
                            FileNotFoundException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("path")
                    .setFilename("vendor/league/flysystem/src/FileNotFoundException.php")
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
