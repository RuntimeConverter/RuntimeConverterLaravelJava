package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.SpecificMajorAndMinorVersionConstraint;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.Version;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.VersionConstraintValue;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.AnyVersionConstraint;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.UnsupportedVersionConstraintException;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.AndVersionConstraintGroup;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.OrVersionConstraintGroup;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.GreaterThanOrEqualToVersionConstraint;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.ExactVersionConstraint;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.SpecificMajorVersionConstraint;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/version/src/VersionConstraintParser.php

*/

public class VersionConstraintParser extends RuntimeClassBase {

    public VersionConstraintParser(RuntimeEnv env, Object... args) {
        super(env);
    }

    public VersionConstraintParser(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object parse(RuntimeEnv env, Object... args) {
        ReferenceContainer value = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object version = null;
        if (ZVal.strictNotEqualityCheck(
                function_strpos.f.env(env).call(value.getObject(), "||").value(), "!==", false)) {
            return ZVal.assign(this.handleOrGroup(env, value.getObject()));
        }

        if (!function_preg_match
                .f
                .env(env)
                .call("/^[\\^~\\*]?[\\d.\\*]+$/", value.getObject())
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new UnsupportedVersionConstraintException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Version constraint %s is not supported.",
                                            value.getObject())
                                    .value()));
        }

        switch (toStringR(value.arrayGet(env, 0))) {
            case "~":
                return ZVal.assign(this.handleTildeOperator(env, value.getObject()));
            case "^":
                return ZVal.assign(this.handleCaretOperator(env, value.getObject()));
        }
        ;
        version = new VersionConstraintValue(env, value.getObject());
        if (ZVal.isTrue(
                env.callMethod(
                        env.callMethod(version, "getMajor", VersionConstraintParser.class),
                        "isAny",
                        VersionConstraintParser.class))) {
            return ZVal.assign(new AnyVersionConstraint(env));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        env.callMethod(version, "getMinor", VersionConstraintParser.class),
                        "isAny",
                        VersionConstraintParser.class))) {
            return ZVal.assign(
                    new SpecificMajorVersionConstraint(
                            env,
                            value.getObject(),
                            env.callMethod(
                                    env.callMethod(
                                            version, "getMajor", VersionConstraintParser.class),
                                    "getValue",
                                    VersionConstraintParser.class)));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        env.callMethod(version, "getPatch", VersionConstraintParser.class),
                        "isAny",
                        VersionConstraintParser.class))) {
            return ZVal.assign(
                    new SpecificMajorAndMinorVersionConstraint(
                            env,
                            value.getObject(),
                            env.callMethod(
                                    env.callMethod(
                                            version, "getMajor", VersionConstraintParser.class),
                                    "getValue",
                                    VersionConstraintParser.class),
                            env.callMethod(
                                    env.callMethod(
                                            version, "getMinor", VersionConstraintParser.class),
                                    "getValue",
                                    VersionConstraintParser.class)));
        }

        return ZVal.assign(new ExactVersionConstraint(env, value.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    private Object handleOrGroup(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object groupSegment = null;
        ReferenceContainer constraints = new BasicReferenceContainer(null);
        constraints.setObject(ZVal.newArray());
        for (ZPair zpairResult921 :
                ZVal.getIterable(
                        function_explode.f.env(env).call("||", value).value(), env, true)) {
            groupSegment = ZVal.assign(zpairResult921.getValue());
            constraints
                    .arrayAppend(env)
                    .set(this.parse(env, function_trim.f.env(env).call(groupSegment).value()));
        }

        return ZVal.assign(new OrVersionConstraintGroup(env, value, constraints.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    private Object handleTildeOperator(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object version = null;
        ReferenceContainer constraints = new BasicReferenceContainer(null);
        version = new Version(env, function_substr.f.env(env).call(value, 1).value());
        constraints.setObject(
                ZVal.newArray(
                        new ZPair(
                                0,
                                new GreaterThanOrEqualToVersionConstraint(env, value, version))));
        if (ZVal.isTrue(
                env.callMethod(
                        env.callMethod(version, "getPatch", VersionConstraintParser.class),
                        "isAny",
                        VersionConstraintParser.class))) {
            constraints
                    .arrayAppend(env)
                    .set(
                            new SpecificMajorVersionConstraint(
                                    env,
                                    value,
                                    env.callMethod(
                                            env.callMethod(
                                                    version,
                                                    "getMajor",
                                                    VersionConstraintParser.class),
                                            "getValue",
                                            VersionConstraintParser.class)));

        } else {
            constraints
                    .arrayAppend(env)
                    .set(
                            new SpecificMajorAndMinorVersionConstraint(
                                    env,
                                    value,
                                    env.callMethod(
                                            env.callMethod(
                                                    version,
                                                    "getMajor",
                                                    VersionConstraintParser.class),
                                            "getValue",
                                            VersionConstraintParser.class),
                                    env.callMethod(
                                            env.callMethod(
                                                    version,
                                                    "getMinor",
                                                    VersionConstraintParser.class),
                                            "getValue",
                                            VersionConstraintParser.class)));
        }

        return ZVal.assign(new AndVersionConstraintGroup(env, value, constraints.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    private Object handleCaretOperator(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object version = null;
        version = new Version(env, function_substr.f.env(env).call(value, 1).value());
        return ZVal.assign(
                new AndVersionConstraintGroup(
                        env,
                        value,
                        ZVal.newArray(
                                new ZPair(
                                        0,
                                        new GreaterThanOrEqualToVersionConstraint(
                                                env, value, version)),
                                new ZPair(
                                        1,
                                        new SpecificMajorVersionConstraint(
                                                env,
                                                value,
                                                env.callMethod(
                                                        env.callMethod(
                                                                version,
                                                                "getMajor",
                                                                VersionConstraintParser.class),
                                                        "getValue",
                                                        VersionConstraintParser.class))))));
    }

    public static final Object CONST_class = "PharIo\\Version\\VersionConstraintParser";

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
                    .setName("PharIo\\Version\\VersionConstraintParser")
                    .setLookup(
                            VersionConstraintParser.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/phar-io/version/src/VersionConstraintParser.php")
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
