package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DependencyInjection.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/DependencyInjection/ServicesResetter.php

*/

public class ServicesResetter extends RuntimeClassBase {

    public Object resettableServices = null;

    public Object resetMethods = null;

    public ServicesResetter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ServicesResetter.class) {
            this.__construct(env, args);
        }
    }

    public ServicesResetter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resettableServices", typeHint = "Traversable")
    @ConvertedParameter(index = 1, name = "resetMethods", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object resettableServices = assignParameter(args, 0, false);
        Object resetMethods = assignParameter(args, 1, false);
        this.resettableServices = resettableServices;
        this.resetMethods = resetMethods;
        return null;
    }

    @ConvertedMethod
    public Object reset(RuntimeEnv env, Object... args) {
        Object service = null;
        Object id = null;
        for (ZPair zpairResult1945 : ZVal.getIterable(this.resettableServices, env, false)) {
            id = ZVal.assign(zpairResult1945.getKey());
            service = ZVal.assign(zpairResult1945.getValue());
            env.callMethod(
                    service,
                    toStringR(
                            new ReferenceClassProperty(this, "resetMethods", env).arrayGet(env, id),
                            env),
                    ServicesResetter.class);
        }

        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\DependencyInjection\\ServicesResetter";

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
                    .setName(
                            "Symfony\\Component\\HttpKernel\\DependencyInjection\\ServicesResetter")
                    .setLookup(
                            ServicesResetter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("resetMethods", "resettableServices")
                    .setFilename(
                            "vendor/symfony/http-kernel/DependencyInjection/ServicesResetter.php")
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
