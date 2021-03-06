package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.AbstractVersionConstraint;
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

 vendor/phar-io/version/src/AndVersionConstraintGroup.php

*/

public class AndVersionConstraintGroup extends AbstractVersionConstraint {

    public Object constraints = ZVal.newArray();

    public AndVersionConstraintGroup(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AndVersionConstraintGroup.class) {
            this.__construct(env, args);
        }
    }

    public AndVersionConstraintGroup(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "originalValue")
    @ConvertedParameter(index = 1, name = "constraints", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object originalValue = assignParameter(args, 0, false);
        Object constraints = assignParameter(args, 1, false);
        super.__construct(env, originalValue);
        this.constraints = constraints;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "version", typeHint = "PharIo\\Version\\Version")
    public Object complies(RuntimeEnv env, Object... args) {
        Object version = assignParameter(args, 0, false);
        Object constraint = null;
        for (ZPair zpairResult919 : ZVal.getIterable(this.constraints, env, true)) {
            constraint = ZVal.assign(zpairResult919.getValue());
            if (!ZVal.isTrue(
                    env.callMethod(
                            constraint, "complies", AndVersionConstraintGroup.class, version))) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    public static final Object CONST_class = "PharIo\\Version\\AndVersionConstraintGroup";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends AbstractVersionConstraint.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PharIo\\Version\\AndVersionConstraintGroup")
                    .setLookup(
                            AndVersionConstraintGroup.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("constraints", "originalValue")
                    .setFilename("vendor/phar-io/version/src/AndVersionConstraintGroup.php")
                    .addInterface("PharIo\\Version\\VersionConstraint")
                    .addExtendsClass("PharIo\\Version\\AbstractVersionConstraint")
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
