package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Controller.namespaces.ArgumentResolver.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Controller.classes.ArgumentValueResolverInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.arrays.RuntimeIterable;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Controller/ArgumentResolver/VariadicValueResolver.php

*/

public final class VariadicValueResolver extends RuntimeClassBase
        implements ArgumentValueResolverInterface {

    public VariadicValueResolver(RuntimeEnv env, Object... args) {
        super(env);
    }

    public VariadicValueResolver(NoConstructor n) {
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
                ZVal.toBool(env.callMethod(argument, "isVariadic", VariadicValueResolver.class))
                        && ZVal.toBool(
                                env.callMethod(
                                        toObjectR(request)
                                                .accessProp(this, env)
                                                .name("attributes")
                                                .value(),
                                        "has",
                                        VariadicValueResolver.class,
                                        env.callMethod(
                                                argument,
                                                "getName",
                                                VariadicValueResolver.class))));
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
        Object values = null;
        Object value = null;
        values =
                env.callMethod(
                        toObjectR(request).accessProp(this, env).name("attributes").value(),
                        "get",
                        VariadicValueResolver.class,
                        env.callMethod(argument, "getName", VariadicValueResolver.class));
        if (!function_is_array.f.env(env).call(values).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "The action argument \"...$%1$s\" is required to be an array, the request attribute \"%1$s\" contains a type of \"%2$s\" instead.",
                                            env.callMethod(
                                                    argument,
                                                    "getName",
                                                    VariadicValueResolver.class),
                                            NamespaceGlobal.gettype.env(env).call(values).value())
                                    .value()));
        }

        for (ZPair zpairResult1907 : ZVal.getIterable(values, env, true)) {
            value = ZVal.assign(zpairResult1907.getValue());
            runtimeConverterYieldVariable.add(value);
        }

        return runtimeConverterYieldVariable;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\Controller\\ArgumentResolver\\VariadicValueResolver";

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
                            "Symfony\\Component\\HttpKernel\\Controller\\ArgumentResolver\\VariadicValueResolver")
                    .setLookup(
                            VariadicValueResolver.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/symfony/http-kernel/Controller/ArgumentResolver/VariadicValueResolver.php")
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
