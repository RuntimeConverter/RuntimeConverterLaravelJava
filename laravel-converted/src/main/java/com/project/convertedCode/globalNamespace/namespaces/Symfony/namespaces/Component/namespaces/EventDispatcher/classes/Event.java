package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/event-dispatcher/Event.php

*/

public class Event extends RuntimeClassBase {

    public Object propagationStopped = false;

    public Event(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Event(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object isPropagationStopped(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.propagationStopped);
    }

    @ConvertedMethod
    public Object stopPropagation(RuntimeEnv env, Object... args) {
        this.propagationStopped = true;
        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\EventDispatcher\\Event";

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
                    .setName("Symfony\\Component\\EventDispatcher\\Event")
                    .setLookup(
                            Event.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("propagationStopped")
                    .setFilename("vendor/symfony/event-dispatcher/Event.php")
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
