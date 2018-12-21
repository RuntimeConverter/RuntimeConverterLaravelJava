package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeInterfaces.Iterator;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/manifest/src/values/BundledComponentCollectionIterator.php

*/

public class BundledComponentCollectionIterator extends RuntimeClassBase implements Iterator {

    public Object bundledComponents = ZVal.newArray();

    public Object position = null;

    public BundledComponentCollectionIterator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == BundledComponentCollectionIterator.class) {
            this.__construct(env, args);
        }
    }

    public BundledComponentCollectionIterator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "bundledComponents",
        typeHint = "PharIo\\Manifest\\BundledComponentCollection"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object bundledComponents = assignParameter(args, 0, false);
        this.bundledComponents =
                env.callMethod(
                        bundledComponents,
                        "getBundledComponents",
                        BundledComponentCollectionIterator.class);
        return null;
    }

    @ConvertedMethod
    public Object rewind(RuntimeEnv env, Object... args) {
        this.position = 0;
        return null;
    }

    @ConvertedMethod
    public Object valid(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isLessThan(
                        this.position,
                        '<',
                        function_count.f.env(env).call(this.bundledComponents).value()));
    }

    @ConvertedMethod
    public Object key(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.position);
    }

    @ConvertedMethod
    public Object current(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "bundledComponents", env)
                        .arrayGet(env, this.position));
    }

    @ConvertedMethod
    public Object next(RuntimeEnv env, Object... args) {
        this.position = ZVal.increment(this.position);
        return null;
    }

    public static final Object CONST_class = "PharIo\\Manifest\\BundledComponentCollectionIterator";

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
                    .setName("PharIo\\Manifest\\BundledComponentCollectionIterator")
                    .setLookup(
                            BundledComponentCollectionIterator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bundledComponents", "position")
                    .setFilename(
                            "vendor/phar-io/manifest/src/values/BundledComponentCollectionIterator.php")
                    .addInterface("Iterator")
                    .addInterface("Traversable")
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
