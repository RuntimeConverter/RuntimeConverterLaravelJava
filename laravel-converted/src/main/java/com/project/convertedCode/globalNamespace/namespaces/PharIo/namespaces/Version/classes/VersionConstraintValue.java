package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.VersionNumber;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/version/src/VersionConstraintValue.php

*/

public class VersionConstraintValue extends RuntimeClassBase {

    public Object major = null;

    public Object minor = null;

    public Object patch = null;

    public Object label = "";

    public Object buildMetaData = "";

    public Object versionString = "";

    public VersionConstraintValue(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == VersionConstraintValue.class) {
            this.__construct(env, args);
        }
    }

    public VersionConstraintValue(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "versionString")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object versionString = assignParameter(args, 0, false);
        this.versionString = versionString;
        this.parseVersion(env, versionString);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "versionString")
    private Object parseVersion(RuntimeEnv env, Object... args) {
        ReferenceContainer versionString =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        Object minorValue = null;
        ReferenceContainer versionSegments = new BasicReferenceContainer(null);
        Object patchValue = null;
        env.callMethod(
                this,
                new RuntimeArgsWithReferences().add(0, versionString),
                "extractBuildMetaData",
                VersionConstraintValue.class,
                versionString.getObject());
        env.callMethod(
                this,
                new RuntimeArgsWithReferences().add(0, versionString),
                "extractLabel",
                VersionConstraintValue.class,
                versionString.getObject());
        versionSegments.setObject(
                function_explode.f.env(env).call(".", versionString.getObject()).value());
        this.major = new VersionNumber(env, versionSegments.arrayGet(env, 0));
        minorValue =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, versionSegments, env, 1)
                                ? versionSegments.arrayGet(env, 1)
                                : ZVal.getNull());
        patchValue =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, versionSegments, env, 2)
                                ? versionSegments.arrayGet(env, 2)
                                : ZVal.getNull());
        this.minor = new VersionNumber(env, minorValue);
        this.patch = new VersionNumber(env, patchValue);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "versionString")
    private Object extractBuildMetaData(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer versionString =
                assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        ReferenceContainer matches = new BasicReferenceContainer(null);
        if (ZVal.equalityCheck(
                function_preg_match
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                        .call("/\\+(.*)/", versionString.getObject(), matches.getObject())
                        .value(),
                1)) {
            this.buildMetaData = matches.arrayGet(env, 1);
            versionString.setObject(
                    function_str_replace
                            .f
                            .env(env)
                            .call(matches.arrayGet(env, 0), "", versionString.getObject())
                            .value());
        }

        return null;
    }

    public Object extractBuildMetaData(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "versionString")
    private Object extractLabel(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer versionString =
                assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        ReferenceContainer matches = new BasicReferenceContainer(null);
        if (ZVal.equalityCheck(
                function_preg_match
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                        .call("/\\-(.*)/", versionString.getObject(), matches.getObject())
                        .value(),
                1)) {
            this.label = matches.arrayGet(env, 1);
            versionString.setObject(
                    function_str_replace
                            .f
                            .env(env)
                            .call(matches.arrayGet(env, 0), "", versionString.getObject())
                            .value());
        }

        return null;
    }

    public Object extractLabel(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    public Object getLabel(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.label);
    }

    @ConvertedMethod
    public Object getBuildMetaData(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.buildMetaData);
    }

    @ConvertedMethod
    public Object getVersionString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.versionString);
    }

    @ConvertedMethod
    public Object getMajor(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.major);
    }

    @ConvertedMethod
    public Object getMinor(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.minor);
    }

    @ConvertedMethod
    public Object getPatch(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.patch);
    }

    public static final Object CONST_class = "PharIo\\Version\\VersionConstraintValue";

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
                    .setName("PharIo\\Version\\VersionConstraintValue")
                    .setLookup(
                            VersionConstraintValue.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "buildMetaData", "label", "major", "minor", "patch", "versionString")
                    .setFilename("vendor/phar-io/version/src/VersionConstraintValue.php")
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
