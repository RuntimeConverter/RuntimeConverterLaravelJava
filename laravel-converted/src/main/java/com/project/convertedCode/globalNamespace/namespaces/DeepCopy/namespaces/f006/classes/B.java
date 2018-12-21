package com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.f006.classes;

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

 vendor/myclabs/deep-copy/fixtures/f006/B.php

*/

public class B extends RuntimeClassBase {

    public Object cloned = false;

    public Object bProp = null;

    public B(RuntimeEnv env, Object... args) {
        super(env);
    }

    public B(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getBProp(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.bProp);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prop")
    public Object setBProp(RuntimeEnv env, Object... args) {
        Object prop = assignParameter(args, 0, false);
        this.bProp = prop;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object __clone(RuntimeEnv env, Object... args) {
        this.cloned = true;
        return null;
    }

    public static final Object CONST_class = "DeepCopy\\f006\\B";

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
                    .setName("DeepCopy\\f006\\B")
                    .setLookup(
                            B.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bProp", "cloned")
                    .setFilename("vendor/myclabs/deep-copy/fixtures/f006/B.php")
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
