package com.project.convertedCode.globalNamespace.namespaces.NunoMaduro.namespaces.Collision.namespaces.Adapters.namespaces.Laravel.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
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

 vendor/nunomaduro/collision/src/Adapters/Laravel/Inspector.php

*/

public class Inspector
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Whoops
                .namespaces
                .Exception
                .classes
                .Inspector {

    public Inspector(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Inspector.class) {
            this.__construct(env, args);
        }
    }

    public Inspector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e")
    protected Object getTrace(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(e, "getTrace", Inspector.class));
    }

    public static final Object CONST_class = "NunoMaduro\\Collision\\Adapters\\Laravel\\Inspector";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Whoops
                    .namespaces
                    .Exception
                    .classes
                    .Inspector
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("NunoMaduro\\Collision\\Adapters\\Laravel\\Inspector")
                    .setLookup(
                            Inspector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("exception", "frames", "previousExceptionInspector")
                    .setFilename("vendor/nunomaduro/collision/src/Adapters/Laravel/Inspector.php")
                    .addExtendsClass("Whoops\\Exception\\Inspector")
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
