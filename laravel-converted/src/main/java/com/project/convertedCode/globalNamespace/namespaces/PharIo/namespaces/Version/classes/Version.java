package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.InvalidVersionException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.PreReleaseSuffix;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.VersionNumber;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/version/src/Version.php

*/

public class Version extends RuntimeClassBase {

    public Object major = null;

    public Object minor = null;

    public Object patch = null;

    public Object preReleaseSuffix = null;

    public Object versionString = "";

    public Version(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Version.class) {
            this.__construct(env, args);
        }
    }

    public Version(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "versionString")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object versionString = assignParameter(args, 0, false);
        this.ensureVersionStringIsValid(env, versionString);
        this.versionString = versionString;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "matches", typeHint = "array")
    private Object parseVersion(RuntimeEnv env, Object... args) {
        ReferenceContainer matches = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object preReleaseNumber = null;
        this.major = new VersionNumber(env, matches.arrayGet(env, "Major"));
        this.minor = new VersionNumber(env, matches.arrayGet(env, "Minor"));
        this.patch =
                arrayActionR(ArrayAction.ISSET, matches, env, "Patch")
                        ? new VersionNumber(env, matches.arrayGet(env, "Patch"))
                        : new VersionNumber(env, ZVal.getNull());
        if (arrayActionR(ArrayAction.ISSET, matches, env, "ReleaseType")) {
            preReleaseNumber =
                    ZVal.assign(
                            arrayActionR(ArrayAction.ISSET, matches, env, "ReleaseTypeCount")
                                    ? ZVal.toLong(matches.arrayGet(env, "ReleaseTypeCount"))
                                    : ZVal.getNull());
            this.preReleaseSuffix =
                    new PreReleaseSuffix(
                            env, matches.arrayGet(env, "ReleaseType"), preReleaseNumber);
        }

        return null;
    }

    @ConvertedMethod
    public Object getPreReleaseSuffix(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.preReleaseSuffix);
    }

    @ConvertedMethod
    public Object getVersionString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.versionString);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "version", typeHint = "PharIo\\Version\\Version")
    public Object isGreaterThan(RuntimeEnv env, Object... args) {
        Object version = assignParameter(args, 0, false);
        if (ZVal.isGreaterThan(
                env.callMethod(
                        env.callMethod(version, "getMajor", Version.class),
                        "getValue",
                        Version.class),
                '>',
                env.callMethod(this.getMajor(env), "getValue", Version.class))) {
            return ZVal.assign(false);
        }

        if (ZVal.isLessThan(
                env.callMethod(
                        env.callMethod(version, "getMajor", Version.class),
                        "getValue",
                        Version.class),
                '<',
                env.callMethod(this.getMajor(env), "getValue", Version.class))) {
            return ZVal.assign(true);
        }

        if (ZVal.isGreaterThan(
                env.callMethod(
                        env.callMethod(version, "getMinor", Version.class),
                        "getValue",
                        Version.class),
                '>',
                env.callMethod(this.getMinor(env), "getValue", Version.class))) {
            return ZVal.assign(false);
        }

        if (ZVal.isLessThan(
                env.callMethod(
                        env.callMethod(version, "getMinor", Version.class),
                        "getValue",
                        Version.class),
                '<',
                env.callMethod(this.getMinor(env), "getValue", Version.class))) {
            return ZVal.assign(true);
        }

        if (ZVal.isGreaterThanOrEqualTo(
                env.callMethod(
                        env.callMethod(version, "getPatch", Version.class),
                        "getValue",
                        Version.class),
                ">=",
                env.callMethod(this.getPatch(env), "getValue", Version.class))) {
            return ZVal.assign(false);
        }

        if (ZVal.isLessThan(
                env.callMethod(
                        env.callMethod(version, "getPatch", Version.class),
                        "getValue",
                        Version.class),
                '<',
                env.callMethod(this.getPatch(env), "getValue", Version.class))) {
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
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

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "version")
    private Object ensureVersionStringIsValid(RuntimeEnv env, Object... args) {
        Object version = assignParameter(args, 0, false);
        Object regex = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        regex =
                "/^v?\n            (?<Major>(0|(?:[1-9][0-9]*)))\n            \\.\n            (?<Minor>(0|(?:[1-9][0-9]*)))\n            (\\.\n                (?<Patch>(0|(?:[1-9][0-9]*)))\n            )?\n            (?:\n                -\n                (?<ReleaseType>(?:(dev|beta|b|RC|alpha|a|patch|p)))\n                (?:\n                    (?<ReleaseTypeCount>[0-9])\n                )?\n            )?       \n        $/x";
        if (ZVal.strictNotEqualityCheck(
                function_preg_match
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                        .call(regex, version, matches.getObject())
                        .value(),
                "!==",
                1)) {
            throw ZVal.getException(
                    env,
                    new InvalidVersionException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Version string '%s' does not follow SemVer semantics",
                                            version)
                                    .value()));
        }

        this.parseVersion(env, matches.getObject());
        return null;
    }

    public static final Object CONST_class = "PharIo\\Version\\Version";

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
                    .setName("PharIo\\Version\\Version")
                    .setLookup(
                            Version.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "major", "minor", "patch", "preReleaseSuffix", "versionString")
                    .setFilename("vendor/phar-io/version/src/Version.php")
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
