package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prophecy.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prophecy.classes.ProphecyInterface;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prophecy.classes.RevealerInterface;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Prophecy/Revealer.php

*/

public class Revealer extends RuntimeClassBase implements RevealerInterface {

    public Revealer(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Revealer(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object reveal(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        if (function_is_array.f.env(env).call(value).getBool()) {
            return ZVal.assign(
                    function_array_map
                            .f
                            .env(env)
                            .call(ZVal.newArray(new ZPair(0, this), new ZPair(1, "reveal")), value)
                            .value());
        }

        if (!function_is_object.f.env(env).call(value).getBool()) {
            return ZVal.assign(value);
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        value, ProphecyInterface.class, "Prophecy\\Prophecy\\ProphecyInterface"))) {
            value = env.callMethod(value, "reveal", Revealer.class);
        }

        return ZVal.assign(value);
    }

    public static final Object CONST_class = "Prophecy\\Prophecy\\Revealer";

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
                    .setName("Prophecy\\Prophecy\\Revealer")
                    .setLookup(
                            Revealer.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/phpspec/prophecy/src/Prophecy/Prophecy/Revealer.php")
                    .addInterface("Prophecy\\Prophecy\\RevealerInterface")
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
