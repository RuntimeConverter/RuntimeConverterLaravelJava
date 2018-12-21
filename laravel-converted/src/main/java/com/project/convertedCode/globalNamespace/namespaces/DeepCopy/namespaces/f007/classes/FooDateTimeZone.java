package com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.f007.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeZone;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/myclabs/deep-copy/fixtures/f007/FooDateTimeZone.php

*/

public class FooDateTimeZone extends DateTimeZone {

    public Object cloned = false;

    public FooDateTimeZone(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FooDateTimeZone.class) {
            this.__construct(env, args);
        }
    }

    public FooDateTimeZone(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __clone(RuntimeEnv env, Object... args) {
        this.cloned = true;
        return null;
    }

    public static final Object CONST_class = "DeepCopy\\f007\\FooDateTimeZone";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends DateTimeZone.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("DeepCopy\\f007\\FooDateTimeZone")
                    .setLookup(
                            FooDateTimeZone.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("cloned")
                    .setFilename("vendor/myclabs/deep-copy/fixtures/f007/FooDateTimeZone.php")
                    .addExtendsClass("DateTimeZone")
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
