package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Loader.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/routing/Loader/ClosureLoader.php

*/

public class ClosureLoader extends RuntimeClassBase {

    public ClosureLoader(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ClosureLoader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "closure")
    @ConvertedParameter(
        index = 1,
        name = "type",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object load(RuntimeEnv env, Object... args) {
        Object closure = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = ZVal.getNull();
        }
        return ZVal.assign(
                env.callFunctionDynamic(closure, new RuntimeArgsWithReferences()).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    @ConvertedParameter(
        index = 1,
        name = "type",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object supports(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = ZVal.getNull();
        }
        return ZVal.assign(
                ZVal.toBool(ZVal.checkInstanceType(resource, Closure.class, "Closure"))
                        && ZVal.toBool(
                                ZVal.toBool(!ZVal.isTrue(type))
                                        || ZVal.toBool(
                                                ZVal.strictEqualityCheck("closure", "===", type))));
    }

    public static final Object CONST_class = "Symfony\\Component\\Routing\\Loader\\ClosureLoader";

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
                    .setName("Symfony\\Component\\Routing\\Loader\\ClosureLoader")
                    .setLookup(
                            ClosureLoader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/routing/Loader/ClosureLoader.php")
                    .addExtendsClass("Symfony\\Component\\Config\\Loader\\Loader")
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
