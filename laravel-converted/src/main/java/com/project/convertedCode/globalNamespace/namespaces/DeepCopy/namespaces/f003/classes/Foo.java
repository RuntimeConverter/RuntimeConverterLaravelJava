package com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.f003.classes;

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

 vendor/myclabs/deep-copy/fixtures/f003/Foo.php

*/

public class Foo extends RuntimeClassBase {

    public Object name = null;

    public Object prop = null;

    public Foo(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Foo.class) {
            this.__construct(env, args);
        }
    }

    public Foo(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this.name = name;
        return null;
    }

    @ConvertedMethod
    public Object getProp(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.prop);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prop")
    public Object setProp(RuntimeEnv env, Object... args) {
        Object prop = assignParameter(args, 0, false);
        this.prop = prop;
        return ZVal.assign(this);
    }

    public static final Object CONST_class = "DeepCopy\\f003\\Foo";

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
                    .setName("DeepCopy\\f003\\Foo")
                    .setLookup(
                            Foo.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("name", "prop")
                    .setFilename("vendor/myclabs/deep-copy/fixtures/f003/Foo.php")
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
