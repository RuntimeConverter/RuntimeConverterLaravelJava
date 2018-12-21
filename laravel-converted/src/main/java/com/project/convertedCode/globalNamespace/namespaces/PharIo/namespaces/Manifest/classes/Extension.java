package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.Type;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/manifest/src/values/Extension.php

*/

public class Extension extends Type {

    public Object application = null;

    public Object versionConstraint = null;

    public Extension(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Extension.class) {
            this.__construct(env, args);
        }
    }

    public Extension(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "application",
        typeHint = "PharIo\\Manifest\\ApplicationName"
    )
    @ConvertedParameter(
        index = 1,
        name = "versionConstraint",
        typeHint = "PharIo\\Version\\VersionConstraint"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object application = assignParameter(args, 0, false);
        Object versionConstraint = assignParameter(args, 1, false);
        this.application = application;
        this.versionConstraint = versionConstraint;
        return null;
    }

    @ConvertedMethod
    public Object getApplicationName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.application);
    }

    @ConvertedMethod
    public Object getVersionConstraint(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.versionConstraint);
    }

    @ConvertedMethod
    public Object isExtension(RuntimeEnv env, Object... args) {
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "PharIo\\Manifest\\ApplicationName")
    public Object isExtensionFor(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this.application, "isEqual", Extension.class, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "PharIo\\Manifest\\ApplicationName")
    @ConvertedParameter(index = 1, name = "version", typeHint = "PharIo\\Version\\Version")
    public Object isCompatibleWith(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object version = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.toBool(this.isExtensionFor(env, name))
                        && ZVal.toBool(
                                env.callMethod(
                                        this.versionConstraint,
                                        "complies",
                                        Extension.class,
                                        version)));
    }

    public static final Object CONST_class = "PharIo\\Manifest\\Extension";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Type.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Manifest\\Extension")
                    .setLookup(
                            Extension.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("application", "versionConstraint")
                    .setFilename("vendor/phar-io/manifest/src/values/Extension.php")
                    .addExtendsClass("PharIo\\Manifest\\Type")
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
