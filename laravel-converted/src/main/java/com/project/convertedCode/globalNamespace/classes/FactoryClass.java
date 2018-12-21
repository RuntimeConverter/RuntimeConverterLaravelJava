package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.classes.FactoryMethod;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/generator/FactoryClass.php

*/

public class FactoryClass extends RuntimeClassBase {

    public Object file = null;

    public Object reflector = null;

    public Object methods = null;

    public FactoryClass(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FactoryClass.class) {
            this.__construct(env, args);
        }
    }

    public FactoryClass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    @ConvertedParameter(index = 1, name = "class", typeHint = "ReflectionClass")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        Object _pClass = assignParameter(args, 1, false);
        this.file = file;
        this.reflector = _pClass;
        this.extractFactoryMethods(env);
        return null;
    }

    @ConvertedMethod
    public Object extractFactoryMethods(RuntimeEnv env, Object... args) {
        Object method = null;
        this.methods = ZVal.newArray();
        for (ZPair zpairResult138 : ZVal.getIterable(this.getPublicStaticMethods(env), env, true)) {
            method = ZVal.assign(zpairResult138.getValue());
            if (ZVal.isTrue(env.callMethod(method, "isFactory", FactoryClass.class))) {
                new ReferenceClassProperty(this, "methods", env).arrayAppend(env).set(method);
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object getPublicStaticMethods(RuntimeEnv env, Object... args) {
        Object method = null;
        ReferenceContainer methods = new BasicReferenceContainer(null);
        methods.setObject(ZVal.newArray());
        for (ZPair zpairResult139 :
                ZVal.getIterable(
                        env.callMethod(this.reflector, "getMethods", FactoryClass.class, 1),
                        env,
                        true)) {
            method = ZVal.assign(zpairResult139.getValue());
            if (ZVal.toBool(env.callMethod(method, "isPublic", FactoryClass.class))
                    && ZVal.toBool(
                            ZVal.equalityCheck(
                                    env.callMethod(method, "getDeclaringClass", FactoryClass.class),
                                    this.reflector))) {
                methods.arrayAppend(env).set(new FactoryMethod(env, this, method));
            }
        }

        return ZVal.assign(methods.getObject());
    }

    @ConvertedMethod
    public Object getFile(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.file);
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this.reflector).accessProp(this, env).name("name").value());
    }

    @ConvertedMethod
    public Object isFactory(RuntimeEnv env, Object... args) {
        return ZVal.assign(!ZVal.isEmpty(this.methods));
    }

    @ConvertedMethod
    public Object getMethods(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.methods);
    }

    public static final Object CONST_class = "FactoryClass";

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
                    .setName("FactoryClass")
                    .setLookup(
                            FactoryClass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("file", "methods", "reflector")
                    .setFilename("vendor/hamcrest/hamcrest-php/generator/FactoryClass.php")
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
