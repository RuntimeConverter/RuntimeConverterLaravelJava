package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Controller.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Controller.classes.ControllerResolver;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeClasses.errors.PHPError;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import java.lang.Class;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.errors.ArgumentCountError;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Controller/ContainerControllerResolver.php

*/

public class ContainerControllerResolver extends ControllerResolver {

    public Object container = null;

    public ContainerControllerResolver(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ContainerControllerResolver.class) {
            this.__construct(env, args);
        }
    }

    public ContainerControllerResolver(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Psr\\Container\\ContainerInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "logger",
        typeHint = "Psr\\Log\\LoggerInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        Object logger = assignParameter(args, 1, true);
        if (null == logger) {
            logger = ZVal.getNull();
        }
        this.container = container;
        super.__construct(env, logger);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "controller")
    protected Object createController(RuntimeEnv env, Object... args) {
        Object controller = assignParameter(args, 0, false);
        if (ZVal.strictEqualityCheck(
                1, "===", NamespaceGlobal.substr_count.env(env).call(controller, ":").value())) {
            controller = function_str_replace.f.env(env).call(":", "::", controller).value();
            NamespaceGlobal.trigger_error
                    .env(env)
                    .call(
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Referencing controllers with a single colon is deprecated since Symfony 4.1. Use %s instead.",
                                            controller)
                                    .value(),
                            16384)
                    .value();
        }

        return ZVal.assign(super.createController(env, controller));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    protected Object instantiateController(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object e = null;
        if (ZVal.isTrue(
                env.callMethod(
                        this.container, "has", ContainerControllerResolver.class, _pClass))) {
            return ZVal.assign(
                    env.callMethod(
                            this.container, "get", ContainerControllerResolver.class, _pClass));
        }

        try {
            return ZVal.assign(super.instantiateController(env, _pClass));
        } catch (ConvertedException convertedException271) {
            if (convertedException271.instanceOf(PHPError.class, "Error")) {
                e = convertedException271.getObject();
            } else {
                throw convertedException271;
            }
        }

        this.throwExceptionIfControllerWasRemoved(env, _pClass, e);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(e, ArgumentCountError.class, "ArgumentCountError"))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Controller \"%s\" has required constructor arguments and does not exist in the container. Did you forget to define such a service?",
                                            _pClass)
                                    .value(),
                            0,
                            e));
        }

        throw ZVal.getException(
                env,
                new InvalidArgumentException(
                        env,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "Controller \"%s\" does neither exist as service nor as class",
                                        _pClass)
                                .value(),
                        0,
                        e));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "controller", typeHint = "string")
    @ConvertedParameter(index = 1, name = "previous", typeHint = "Throwable")
    private Object throwExceptionIfControllerWasRemoved(RuntimeEnv env, Object... args) {
        Object controller = assignParameter(args, 0, false);
        Object previous = assignParameter(args, 1, false);
        if (ZVal.toBool(ZVal.checkInstanceType(this.container, (Class) null, "Container", env))
                && ZVal.toBool(
                        arrayActionR(
                                ArrayAction.ISSET,
                                handleReturnReference(
                                        env.callMethod(
                                                this.container,
                                                "getRemovedIds",
                                                ContainerControllerResolver.class)),
                                env,
                                controller))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Controller \"%s\" cannot be fetched from the container because it is private. Did you forget to tag the service with \"controller.service_arguments\"?",
                                            controller)
                                    .value(),
                            0,
                            previous));
        }

        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\Controller\\ContainerControllerResolver";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ControllerResolver.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\HttpKernel\\Controller\\ContainerControllerResolver")
                    .setLookup(
                            ContainerControllerResolver.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("container", "logger")
                    .setFilename(
                            "vendor/symfony/http-kernel/Controller/ContainerControllerResolver.php")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\Controller\\ControllerResolverInterface")
                    .addExtendsClass(
                            "Symfony\\Component\\HttpKernel\\Controller\\ControllerResolver")
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
