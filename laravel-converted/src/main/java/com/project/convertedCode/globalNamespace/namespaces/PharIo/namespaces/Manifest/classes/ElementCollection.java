package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeInterfaces.Iterator;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/manifest/src/xml/ElementCollection.php

*/

public abstract class ElementCollection extends RuntimeClassBase implements Iterator {

    public Object nodeList = null;

    public Object position = null;

    public ElementCollection(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ElementCollection.class) {
            this.__construct(env, args);
        }
    }

    public ElementCollection(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodeList", typeHint = "DOMNodeList")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object nodeList = assignParameter(args, 0, false);
        this.nodeList = nodeList;
        this.position = 0;
        return null;
    }

    @ConvertedMethod
    protected Object getCurrentElement(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this.nodeList, "item", ElementCollection.class, this.position));
    }

    @ConvertedMethod
    public Object next(RuntimeEnv env, Object... args) {
        this.position = ZVal.increment(this.position);
        return null;
    }

    @ConvertedMethod
    public Object key(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.position);
    }

    @ConvertedMethod
    public Object valid(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isLessThan(
                        this.position,
                        '<',
                        toObjectR(this.nodeList).accessProp(this, env).name("length").value()));
    }

    @ConvertedMethod
    public Object rewind(RuntimeEnv env, Object... args) {
        this.position = 0;
        return null;
    }

    public static final Object CONST_class = "PharIo\\Manifest\\ElementCollection";

    @ConvertedMethod()
    public abstract Object current(RuntimeEnv env, Object... args);

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
                    .setName("PharIo\\Manifest\\ElementCollection")
                    .setLookup(
                            ElementCollection.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("nodeList", "position")
                    .setFilename("vendor/phar-io/manifest/src/xml/ElementCollection.php")
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
