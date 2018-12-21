package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Controller.namespaces.ArgumentResolver.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.exceptions.missingDefinitions.ClassNotFoundDuringConversion;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Controller.classes.ArgumentValueResolverInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionProperty;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.arrays.RuntimeIterable;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Controller/ArgumentResolver/ServiceValueResolver.php

*/

public final class ServiceValueResolver extends RuntimeClassBase
        implements ArgumentValueResolverInterface {

    public Object container = null;

    public ServiceValueResolver(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ServiceValueResolver.class) {
            this.__construct(env, args);
        }
    }

    public ServiceValueResolver(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Psr\\Container\\ContainerInterface"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        this.container = container;
        return null;
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
        ReferenceContainer controller = new BasicReferenceContainer(null);
        controller.setObject(
                env.callMethod(
                        toObjectR(request).accessProp(this, env).name("attributes").value(),
                        "get",
                        ServiceValueResolver.class,
                        "_controller"));
        if (ZVal.toBool(
                        ZVal.toBool(
                                        function_is_array
                                                .f
                                                .env(env)
                                                .call(controller.getObject())
                                                .value())
                                && ZVal.toBool(
                                        function_is_callable
                                                .f
                                                .env(env)
                                                .call(controller.getObject(), true)
                                                .value()))
                && ZVal.toBool(
                        function_is_string.f.env(env).call(controller.arrayGet(env, 0)).value())) {
            controller.setObject(
                    toStringR(controller.arrayGet(env, 0), env)
                            + "::"
                            + toStringR(controller.arrayGet(env, 1), env));

        } else if (ZVal.toBool(
                        !function_is_string.f.env(env).call(controller.getObject()).getBool())
                || ZVal.toBool(ZVal.strictEqualityCheck("", "===", controller.getObject()))) {
            return ZVal.assign(false);
        }

        if (ZVal.strictEqualityCheck("\\", "===", controller.arrayGet(env, 0))) {
            controller.setObject(
                    function_ltrim.f.env(env).call(controller.getObject(), "\\").value());
        }

        return ZVal.assign(
                ZVal.toBool(
                                env.callMethod(
                                        this.container,
                                        "has",
                                        ServiceValueResolver.class,
                                        controller.getObject()))
                        && ZVal.toBool(
                                env.callMethod(
                                        env.callMethod(
                                                this.container,
                                                "get",
                                                ServiceValueResolver.class,
                                                controller.getObject()),
                                        "has",
                                        ServiceValueResolver.class,
                                        env.callMethod(
                                                argument, "getName", ServiceValueResolver.class))));
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
        ReferenceContainer controller = new BasicReferenceContainer(null);
        Object r = null;
        Object what = null;
        Object e = null;
        Object message = null;
        if (function_is_array
                .f
                .env(env)
                .call(
                        controller.setObject(
                                env.callMethod(
                                        toObjectR(request)
                                                .accessProp(this, env)
                                                .name("attributes")
                                                .value(),
                                        "get",
                                        ServiceValueResolver.class,
                                        "_controller")))
                .getBool()) {
            controller.setObject(
                    toStringR(controller.arrayGet(env, 0), env)
                            + "::"
                            + toStringR(controller.arrayGet(env, 1), env));
        }

        if (ZVal.strictEqualityCheck("\\", "===", controller.arrayGet(env, 0))) {
            controller.setObject(
                    function_ltrim.f.env(env).call(controller.getObject(), "\\").value());
        }

        try {
            runtimeConverterYieldVariable.add(
                    env.callMethod(
                            env.callMethod(
                                    this.container,
                                    "get",
                                    ServiceValueResolver.class,
                                    controller.getObject()),
                            "get",
                            ServiceValueResolver.class,
                            env.callMethod(argument, "getName", ServiceValueResolver.class)));
        } catch (ConvertedException convertedException270) {
            if (ClassNotFoundDuringConversion.missingClassInCatchBlock("RuntimeException")) {
                e = convertedException270.getObject();
                what =
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "argument $%s of \"%s()\"",
                                        env.callMethod(
                                                argument, "getName", ServiceValueResolver.class),
                                        controller.getObject())
                                .value();
                message =
                        function_preg_replace
                                .f
                                .env(env)
                                .call(
                                        "/service \"\\.service_locator\\.[^\"]++\"/",
                                        what,
                                        env.callMethod(e, "getMessage", ServiceValueResolver.class))
                                .value();
                if (ZVal.strictEqualityCheck(
                        env.callMethod(e, "getMessage", ServiceValueResolver.class),
                        "===",
                        message)) {
                    message =
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Cannot resolve %s: %s", what, message)
                                    .value();
                }

                r = new ReflectionProperty(env, e, "message");
                env.callMethod(r, "setAccessible", ServiceValueResolver.class, true);
                env.callMethod(r, "setValue", ServiceValueResolver.class, e, message);
                throw ZVal.getException(env, e);
            } else {
                throw convertedException270;
            }
        }

        return runtimeConverterYieldVariable;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\Controller\\ArgumentResolver\\ServiceValueResolver";

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
                            "Symfony\\Component\\HttpKernel\\Controller\\ArgumentResolver\\ServiceValueResolver")
                    .setLookup(
                            ServiceValueResolver.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("container")
                    .setFilename(
                            "vendor/symfony/http-kernel/Controller/ArgumentResolver/ServiceValueResolver.php")
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
