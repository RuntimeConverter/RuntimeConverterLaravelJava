package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Controller.namespaces.ArgumentResolver.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Controller.classes.ArgumentValueResolverInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.arrays.RuntimeIterable;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Controller/ArgumentResolver/DefaultValueResolver.php

*/

public final class DefaultValueResolver extends RuntimeClassBase
        implements ArgumentValueResolverInterface {

    public DefaultValueResolver(RuntimeEnv env, Object... args) {
        super(env);
    }

    public DefaultValueResolver(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(
        index = 1,
        name = "argument",
        typeHint = "Symfony\\Component\\HttpKernel\\ControllerMetadata\\ArgumentMetadata"
    )
    public Object supports(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object argument = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.toBool(env.callMethod(argument, "hasDefaultValue", DefaultValueResolver.class))
                        || ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.strictNotEqualityCheck(
                                                                        ZVal.getNull(),
                                                                        "!==",
                                                                        env.callMethod(
                                                                                argument,
                                                                                "getType",
                                                                                DefaultValueResolver
                                                                                        .class)))
                                                        && ZVal.toBool(
                                                                env.callMethod(
                                                                        argument,
                                                                        "isNullable",
                                                                        DefaultValueResolver
                                                                                .class)))
                                        && ZVal.toBool(
                                                !ZVal.isTrue(
                                                        env.callMethod(
                                                                argument,
                                                                "isVariadic",
                                                                DefaultValueResolver.class)))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(
        index = 1,
        name = "argument",
        typeHint = "Symfony\\Component\\HttpKernel\\ControllerMetadata\\ArgumentMetadata"
    )
    public Object resolve(RuntimeEnv env, Object... args) {
        RuntimeIterable runtimeConverterYieldVariable = new RuntimeIterable(env);
        Object request = assignParameter(args, 0, false);
        Object argument = assignParameter(args, 1, false);
        runtimeConverterYieldVariable.add(
                ZVal.isTrue(env.callMethod(argument, "hasDefaultValue", DefaultValueResolver.class))
                        ? env.callMethod(argument, "getDefaultValue", DefaultValueResolver.class)
                        : ZVal.getNull());
        return runtimeConverterYieldVariable;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\Controller\\ArgumentResolver\\DefaultValueResolver";

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
                            "Symfony\\Component\\HttpKernel\\Controller\\ArgumentResolver\\DefaultValueResolver")
                    .setLookup(
                            DefaultValueResolver.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/symfony/http-kernel/Controller/ArgumentResolver/DefaultValueResolver.php")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\Controller\\ArgumentValueResolverInterface")
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
