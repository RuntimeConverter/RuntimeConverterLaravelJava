package com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.Handler;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/league/flysystem/src/Directory.php

*/

public class Directory extends Handler {

    public Directory(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Directory.class) {
            this.__construct(env, args);
        }
    }

    public Directory(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object delete(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("filesystem").value(),
                        "deleteDir",
                        Directory.class,
                        toObjectR(this).accessProp(this, env).name("path").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "recursive",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object getContents(RuntimeEnv env, Object... args) {
        Object recursive = assignParameter(args, 0, true);
        if (null == recursive) {
            recursive = false;
        }
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("filesystem").value(),
                        "listContents",
                        Directory.class,
                        toObjectR(this).accessProp(this, env).name("path").value(),
                        recursive));
    }

    public static final Object CONST_class = "League\\Flysystem\\Directory";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Handler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("League\\Flysystem\\Directory")
                    .setLookup(
                            Directory.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filesystem", "path")
                    .setFilename("vendor/league/flysystem/src/Directory.php")
                    .addExtendsClass("League\\Flysystem\\Handler")
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
