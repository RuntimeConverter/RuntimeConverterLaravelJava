package com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Provider.namespaces.Node.classes;

import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Provider.classes.NodeProviderInterface;
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

 vendor/ramsey/uuid/src/Provider/Node/FallbackNodeProvider.php

*/

public class FallbackNodeProvider extends RuntimeClassBase implements NodeProviderInterface {

    public Object nodeProviders = null;

    public FallbackNodeProvider(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FallbackNodeProvider.class) {
            this.__construct(env, args);
        }
    }

    public FallbackNodeProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "providers", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object providers = assignParameter(args, 0, false);
        this.nodeProviders = providers;
        return null;
    }

    @ConvertedMethod
    public Object getNode(RuntimeEnv env, Object... args) {
        Object node = null;
        Object provider = null;
        for (ZPair zpairResult1428 : ZVal.getIterable(this.nodeProviders, env, true)) {
            provider = ZVal.assign(zpairResult1428.getValue());
            if (ZVal.isTrue(
                    node = env.callMethod(provider, "getNode", FallbackNodeProvider.class))) {
                return ZVal.assign(node);
            }
        }

        return ZVal.assign(ZVal.getNull());
    }

    public static final Object CONST_class = "Ramsey\\Uuid\\Provider\\Node\\FallbackNodeProvider";

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
                    .setName("Ramsey\\Uuid\\Provider\\Node\\FallbackNodeProvider")
                    .setLookup(
                            FallbackNodeProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("nodeProviders")
                    .setFilename("vendor/ramsey/uuid/src/Provider/Node/FallbackNodeProvider.php")
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
