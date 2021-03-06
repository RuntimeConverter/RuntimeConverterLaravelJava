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
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.classes.SessionInterface;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Controller/ArgumentResolver/SessionValueResolver.php

*/

public final class SessionValueResolver extends RuntimeClassBase
        implements ArgumentValueResolverInterface {

    public SessionValueResolver(RuntimeEnv env, Object... args) {
        super(env);
    }

    public SessionValueResolver(NoConstructor n) {
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
        Object type = null;
        if (!ZVal.isTrue(env.callMethod(request, "hasSession", SessionValueResolver.class))) {
            return ZVal.assign(false);
        }

        type = env.callMethod(argument, "getType", SessionValueResolver.class);
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(SessionInterface.CONST_class, "!==", type))
                && ZVal.toBool(
                        !NamespaceGlobal.is_subclass_of
                                .env(env)
                                .call(type, SessionInterface.CONST_class)
                                .getBool())) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                ZVal.checkInstanceTypeMatch(
                        env.callMethod(request, "getSession", SessionValueResolver.class), type));
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
                env.callMethod(request, "getSession", SessionValueResolver.class));
        return runtimeConverterYieldVariable;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\Controller\\ArgumentResolver\\SessionValueResolver";

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
                            "Symfony\\Component\\HttpKernel\\Controller\\ArgumentResolver\\SessionValueResolver")
                    .setLookup(
                            SessionValueResolver.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/symfony/http-kernel/Controller/ArgumentResolver/SessionValueResolver.php")
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
