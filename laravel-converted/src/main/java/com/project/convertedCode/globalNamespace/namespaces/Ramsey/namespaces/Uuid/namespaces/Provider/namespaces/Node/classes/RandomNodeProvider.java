package com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Provider.namespaces.Node.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_random_bytes;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Provider.classes.NodeProviderInterface;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/ramsey/uuid/src/Provider/Node/RandomNodeProvider.php

*/

public class RandomNodeProvider extends RuntimeClassBase implements NodeProviderInterface {

    public RandomNodeProvider(RuntimeEnv env, Object... args) {
        super(env);
    }

    public RandomNodeProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getNode(RuntimeEnv env, Object... args) {
        Object node = null;
        node =
                NamespaceGlobal.hexdec
                        .env(env)
                        .call(
                                NamespaceGlobal.bin2hex
                                        .env(env)
                                        .call(function_random_bytes.f.env(env).call(6).value())
                                        .value())
                        .value();
        node = ZVal.toLong(node) | ZVal.toLong(1099511627776L);
        return ZVal.assign(
                NamespaceGlobal.str_pad
                        .env(env)
                        .call(NamespaceGlobal.dechex.env(env).call(node).value(), 12, "0", 0)
                        .value());
    }

    public static final Object CONST_class = "Ramsey\\Uuid\\Provider\\Node\\RandomNodeProvider";

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
                    .setName("Ramsey\\Uuid\\Provider\\Node\\RandomNodeProvider")
                    .setLookup(
                            RandomNodeProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/ramsey/uuid/src/Provider/Node/RandomNodeProvider.php")
                    .addInterface("Ramsey\\Uuid\\Provider\\NodeProviderInterface")
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
