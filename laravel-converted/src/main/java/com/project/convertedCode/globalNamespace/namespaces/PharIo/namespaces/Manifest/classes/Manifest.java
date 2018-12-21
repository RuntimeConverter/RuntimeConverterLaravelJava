package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
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

 vendor/phar-io/manifest/src/values/Manifest.php

*/

public class Manifest extends RuntimeClassBase {

    public Object name = null;

    public Object version = null;

    public Object type = null;

    public Object copyrightInformation = null;

    public Object requirements = null;

    public Object bundledComponents = null;

    public Manifest(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Manifest.class) {
            this.__construct(env, args);
        }
    }

    public Manifest(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "PharIo\\Manifest\\ApplicationName")
    @ConvertedParameter(index = 1, name = "version", typeHint = "PharIo\\Version\\Version")
    @ConvertedParameter(index = 2, name = "type", typeHint = "PharIo\\Manifest\\Type")
    @ConvertedParameter(
        index = 3,
        name = "copyrightInformation",
        typeHint = "PharIo\\Manifest\\CopyrightInformation"
    )
    @ConvertedParameter(
        index = 4,
        name = "requirements",
        typeHint = "PharIo\\Manifest\\RequirementCollection"
    )
    @ConvertedParameter(
        index = 5,
        name = "bundledComponents",
        typeHint = "PharIo\\Manifest\\BundledComponentCollection"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object version = assignParameter(args, 1, false);
        Object type = assignParameter(args, 2, false);
        Object copyrightInformation = assignParameter(args, 3, false);
        Object requirements = assignParameter(args, 4, false);
        Object bundledComponents = assignParameter(args, 5, false);
        this.name = name;
        this.version = version;
        this.type = type;
        this.copyrightInformation = copyrightInformation;
        this.requirements = requirements;
        this.bundledComponents = bundledComponents;
        return null;
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.name);
    }

    @ConvertedMethod
    public Object getVersion(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.version);
    }

    @ConvertedMethod
    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.type);
    }

    @ConvertedMethod
    public Object getCopyrightInformation(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.copyrightInformation);
    }

    @ConvertedMethod
    public Object getRequirements(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.requirements);
    }

    @ConvertedMethod
    public Object getBundledComponents(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.bundledComponents);
    }

    @ConvertedMethod
    public Object isApplication(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.type, "isApplication", Manifest.class));
    }

    @ConvertedMethod
    public Object isLibrary(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.type, "isLibrary", Manifest.class));
    }

    @ConvertedMethod
    public Object isExtension(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.type, "isExtension", Manifest.class));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "application",
        typeHint = "PharIo\\Manifest\\ApplicationName"
    )
    @ConvertedParameter(
        index = 1,
        name = "version",
        typeHint = "PharIo\\Version\\Version",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object isExtensionFor(RuntimeEnv env, Object... args) {
        Object application = assignParameter(args, 0, false);
        Object version = assignParameter(args, 1, true);
        if (null == version) {
            version = ZVal.getNull();
        }
        Object type = null;
        if (!ZVal.isTrue(this.isExtension(env))) {
            return ZVal.assign(false);
        }

        type = ZVal.assign(this.type);
        if (ZVal.strictNotEqualityCheck(version, "!==", ZVal.getNull())) {
            return ZVal.assign(
                    env.callMethod(type, "isCompatibleWith", Manifest.class, application, version));
        }

        return ZVal.assign(env.callMethod(type, "isExtensionFor", Manifest.class, application));
    }

    public static final Object CONST_class = "PharIo\\Manifest\\Manifest";

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
                    .setName("PharIo\\Manifest\\Manifest")
                    .setLookup(
                            Manifest.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bundledComponents",
                            "copyrightInformation",
                            "name",
                            "requirements",
                            "type",
                            "version")
                    .setFilename("vendor/phar-io/manifest/src/values/Manifest.php")
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
