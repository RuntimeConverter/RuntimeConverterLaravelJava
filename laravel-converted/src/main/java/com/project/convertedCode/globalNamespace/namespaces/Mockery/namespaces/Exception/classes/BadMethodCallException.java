package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Exception.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Exception/BadMethodCallException.php

*/

public class BadMethodCallException
        extends com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException {

    public Object dismissed = false;

    public BadMethodCallException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == BadMethodCallException.class) {
            this.__construct(env, args);
        }
    }

    public BadMethodCallException(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object dismiss(RuntimeEnv env, Object... args) {
        this.dismissed = true;
        if (ZVal.toBool(env.callMethod(this, "getPrevious", BadMethodCallException.class))
                && ZVal.toBool(
                        ZVal.checkInstanceType(
                                env.callMethod(this, "getPrevious", BadMethodCallException.class),
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Mockery
                                        .namespaces
                                        .Exception
                                        .classes
                                        .BadMethodCallException
                                        .class,
                                "Mockery\\Exception\\BadMethodCallException"))) {
            env.callMethod(
                    env.callMethod(this, "getPrevious", BadMethodCallException.class),
                    "dismiss",
                    BadMethodCallException.class);
        }

        return null;
    }

    @ConvertedMethod
    public Object dismissed(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.dismissed);
    }

    public static final Object CONST_class = "Mockery\\Exception\\BadMethodCallException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.runtimeconverter
                    .runtime
                    .nativeClasses
                    .spl
                    .exceptions
                    .BadMethodCallException
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Mockery\\Exception\\BadMethodCallException")
                    .setLookup(
                            BadMethodCallException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("dismissed")
                    .setFilename(
                            "vendor/mockery/mockery/library/Mockery/Exception/BadMethodCallException.php")
                    .addInterface("Throwable")
                    .addExtendsClass("BadMethodCallException")
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
