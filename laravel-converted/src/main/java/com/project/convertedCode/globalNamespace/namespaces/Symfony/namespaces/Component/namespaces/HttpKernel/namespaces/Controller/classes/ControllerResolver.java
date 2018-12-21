package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Controller.classes;

import com.runtimeconverter.runtime.nativeFunctions.array.function_asort;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Controller.classes.ControllerResolverInterface;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.ReflectionException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeClasses.errors.PHPError;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Controller/ControllerResolver.php

*/

public class ControllerResolver extends RuntimeClassBase implements ControllerResolverInterface {

    public Object logger = null;

    public ControllerResolver(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ControllerResolver.class) {
            this.__construct(env, args);
        }
    }

    public ControllerResolver(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "logger",
        typeHint = "Psr\\Log\\LoggerInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object logger = assignParameter(args, 0, true);
        if (null == logger) {
            logger = ZVal.getNull();
        }
        this.logger = logger;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    public Object getController(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        ReferenceContainer controller = new BasicReferenceContainer(null);
        Object callable = null;
        Object e = null;
        Object reflectionException = null;
        if (!ZVal.isTrue(
                controller.setObject(
                        env.callMethod(
                                toObjectR(request).accessProp(this, env).name("attributes").value(),
                                "get",
                                ControllerResolver.class,
                                "_controller")))) {
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.logger)) {
                env.callMethod(
                        this.logger,
                        "warning",
                        ControllerResolver.class,
                        "Unable to look for the controller as the \"_controller\" parameter is missing.");
            }

            return ZVal.assign(false);
        }

        if (function_is_array.f.env(env).call(controller.getObject()).getBool()) {
            if (ZVal.toBool(
                            ZVal.toBool(arrayActionR(ArrayAction.ISSET, controller, env, 0))
                                    && ZVal.toBool(
                                            function_is_string
                                                    .f
                                                    .env(env)
                                                    .call(controller.arrayGet(env, 0))
                                                    .value()))
                    && ZVal.toBool(arrayActionR(ArrayAction.ISSET, controller, env, 1))) {
                try {
                    controller
                            .arrayAccess(env, 0)
                            .set(this.instantiateController(env, controller.arrayGet(env, 0)));
                } catch (ConvertedException convertedException272) {
                    if (convertedException272.instanceOf(PHPError.class, "Error")
                            | convertedException272.instanceOf(
                                    LogicException.class, "LogicException")) {
                        e = convertedException272.getObject();
                        try {
                            if (ZVal.isTrue(
                                    env.callMethod(
                                            new ReflectionMethod(
                                                    env,
                                                    controller.arrayGet(env, 0),
                                                    controller.arrayGet(env, 1)),
                                            "isStatic",
                                            ControllerResolver.class))) {
                                return ZVal.assign(controller.getObject());
                            }

                        } catch (ConvertedException convertedException273) {
                            if (convertedException273.instanceOf(
                                    ReflectionException.class, "ReflectionException")) {
                                reflectionException = convertedException273.getObject();
                                throw ZVal.getException(env, e);
                            } else {
                                throw convertedException273;
                            }
                        }

                        throw ZVal.getException(env, e);
                    } else {
                        throw convertedException272;
                    }
                }
            }

            if (!function_is_callable.f.env(env).call(controller.getObject()).getBool()) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "The controller for URI \"%s\" is not callable. %s",
                                                env.callMethod(
                                                        request,
                                                        "getPathInfo",
                                                        ControllerResolver.class),
                                                this.getControllerError(
                                                        env, controller.getObject()))
                                        .value()));
            }

            return ZVal.assign(controller.getObject());
        }

        if (function_is_object.f.env(env).call(controller.getObject()).getBool()) {
            if (!function_is_callable.f.env(env).call(controller.getObject()).getBool()) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "The controller for URI \"%s\" is not callable. %s",
                                                env.callMethod(
                                                        request,
                                                        "getPathInfo",
                                                        ControllerResolver.class),
                                                this.getControllerError(
                                                        env, controller.getObject()))
                                        .value()));
            }

            return ZVal.assign(controller.getObject());
        }

        if (function_function_exists.f.env(env).call(controller.getObject()).getBool()) {
            return ZVal.assign(controller.getObject());
        }

        callable = this.createController(env, controller.getObject());
        if (!function_is_callable.f.env(env).call(callable).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "The controller for URI \"%s\" is not callable. %s",
                                            env.callMethod(
                                                    request,
                                                    "getPathInfo",
                                                    ControllerResolver.class),
                                            this.getControllerError(env, callable))
                                    .value()));
        }

        return ZVal.assign(callable);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "controller")
    protected Object createController(RuntimeEnv env, Object... args) {
        Object controller = assignParameter(args, 0, false);
        Object method = null;
        Object e = null;
        Object reflectionException = null;
        Object runtimeTempArrayResult192 = null;
        Object _pClass = null;
        if (ZVal.strictEqualityCheck(
                false, "===", function_strpos.f.env(env).call(controller, "::").value())) {
            return ZVal.assign(this.instantiateController(env, controller));
        }

        ZVal.list(
                runtimeTempArrayResult192 =
                        function_explode.f.env(env).call("::", controller, 2).value(),
                (_pClass = listGet(runtimeTempArrayResult192, 0, env)),
                (method = listGet(runtimeTempArrayResult192, 1, env)));
        try {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(0, this.instantiateController(env, _pClass)),
                            new ZPair(1, method)));
        } catch (ConvertedException convertedException274) {
            if (convertedException274.instanceOf(PHPError.class, "Error")
                    | convertedException274.instanceOf(LogicException.class, "LogicException")) {
                e = convertedException274.getObject();
                try {
                    if (ZVal.isTrue(
                            env.callMethod(
                                    new ReflectionMethod(env, _pClass, method),
                                    "isStatic",
                                    ControllerResolver.class))) {
                        return ZVal.assign(toStringR(_pClass, env) + "::" + toStringR(method, env));
                    }

                } catch (ConvertedException convertedException275) {
                    if (convertedException275.instanceOf(
                            ReflectionException.class, "ReflectionException")) {
                        reflectionException = convertedException275.getObject();
                        throw ZVal.getException(env, e);
                    } else {
                        throw convertedException275;
                    }
                }

                throw ZVal.getException(env, e);
            } else {
                throw convertedException274;
            }
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    protected Object instantiateController(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        return ZVal.assign(env.createNew(_pClass));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callable")
    private Object getControllerError(RuntimeEnv env, Object... args) {
        ReferenceContainer callable = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object availableMethods = null;
        Object controller = null;
        Object item = null;
        Object method = null;
        Object className = null;
        Object collection = null;
        Object message = null;
        Object alternativeMsg = null;
        ReferenceContainer alternatives = new BasicReferenceContainer(null);
        Object runtimeTempArrayResult193 = null;
        Object lev = null;
        if (function_is_string.f.env(env).call(callable.getObject()).getBool()) {
            if (ZVal.strictNotEqualityCheck(
                    false,
                    "!==",
                    function_strpos.f.env(env).call(callable.getObject(), "::").value())) {
                callable.setObject(
                        function_explode.f.env(env).call("::", callable.getObject(), 2).value());

            } else {
                return ZVal.assign(
                        function_sprintf
                                .f
                                .env(env)
                                .call("Function \"%s\" does not exist.", callable.getObject())
                                .value());
            }
        }

        if (function_is_object.f.env(env).call(callable.getObject()).getBool()) {
            availableMethods = this.getClassMethodsWithoutMagicMethods(env, callable.getObject());
            alternativeMsg =
                    ZVal.assign(
                            ZVal.isTrue(availableMethods)
                                    ? function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    " or use one of the available methods: \"%s\"",
                                                    NamespaceGlobal.implode
                                                            .env(env)
                                                            .call("\", \"", availableMethods)
                                                            .value())
                                            .value()
                                    : "");
            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "Controller class \"%s\" cannot be called without a method name. You need to implement \"__invoke\"%s.",
                                    function_get_class
                                            .f
                                            .env(env)
                                            .call(callable.getObject())
                                            .value(),
                                    alternativeMsg)
                            .value());
        }

        if (!function_is_array.f.env(env).call(callable.getObject()).getBool()) {
            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "Invalid type for controller given, expected string, array or object, got \"%s\".",
                                    NamespaceGlobal.gettype
                                            .env(env)
                                            .call(callable.getObject())
                                            .value())
                            .value());
        }

        if (ZVal.toBool(
                        ZVal.toBool(!arrayActionR(ArrayAction.ISSET, callable, env, 0))
                                || ZVal.toBool(!arrayActionR(ArrayAction.ISSET, callable, env, 1)))
                || ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                2,
                                "!==",
                                function_count.f.env(env).call(callable.getObject()).value()))) {
            return "Invalid array callable, expected array(controller, method).";
        }

        ZVal.list(
                runtimeTempArrayResult193 = callable.getObject(),
                (controller = listGet(runtimeTempArrayResult193, 0, env)),
                (method = listGet(runtimeTempArrayResult193, 1, env)));
        if (ZVal.toBool(function_is_string.f.env(env).call(controller).value())
                && ZVal.toBool(!function_class_exists.f.env(env).call(controller).getBool())) {
            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call("Class \"%s\" does not exist.", controller)
                            .value());
        }

        className =
                ZVal.assign(
                        function_is_object.f.env(env).call(controller).getBool()
                                ? function_get_class.f.env(env).call(controller).value()
                                : controller);
        if (function_method_exists.f.env(env).call(controller, method).getBool()) {
            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "Method \"%s\" on class \"%s\" should be public and non-abstract.",
                                    method, className)
                            .value());
        }

        collection = this.getClassMethodsWithoutMagicMethods(env, controller);
        alternatives.setObject(ZVal.newArray());
        for (ZPair zpairResult1908 : ZVal.getIterable(collection, env, true)) {
            item = ZVal.assign(zpairResult1908.getValue());
            lev = NamespaceGlobal.levenshtein.env(env).call(method, item).value();
            if (ZVal.toBool(
                            ZVal.isLessThanOrEqualTo(
                                    lev,
                                    "<=",
                                    ZVal.divide(
                                            function_strlen.f.env(env).call(method).value(), 3)))
                    || ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    false,
                                    "!==",
                                    function_strpos.f.env(env).call(item, method).value()))) {
                alternatives.arrayAppend(env).set(item);
            }
        }

        function_asort.f.env(env).call(alternatives.getObject());
        message =
                function_sprintf
                        .f
                        .env(env)
                        .call("Expected method \"%s\" on class \"%s\"", method, className)
                        .value();
        if (ZVal.isGreaterThan(
                function_count.f.env(env).call(alternatives.getObject()).value(), '>', 0)) {
            message =
                    toStringR(message, env)
                            + toStringR(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    ", did you mean \"%s\"?",
                                                    NamespaceGlobal.implode
                                                            .env(env)
                                                            .call(
                                                                    "\", \"",
                                                                    alternatives.getObject())
                                                            .value())
                                            .value(),
                                    env);

        } else {
            message =
                    toStringR(message, env)
                            + toStringR(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    ". Available methods: \"%s\".",
                                                    NamespaceGlobal.implode
                                                            .env(env)
                                                            .call("\", \"", collection)
                                                            .value())
                                            .value(),
                                    env);
        }

        return ZVal.assign(message);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "classOrObject")
    private Object getClassMethodsWithoutMagicMethods(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/http-kernel/Controller")
                        .setFile("/vendor/symfony/http-kernel/Controller/ControllerResolver.php");
        Object classOrObject = assignParameter(args, 0, false);
        Object methods = null;
        methods = NamespaceGlobal.get_class_methods.env(env).call(classOrObject).value();
        return ZVal.assign(
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                methods,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Symfony\\Component\\HttpKernel\\Controller",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(
                                        index = 0,
                                        name = "method",
                                        typeHint = "string"
                                    )
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object method = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                ZVal.strictNotEqualityCheck(
                                                        0,
                                                        "!==",
                                                        NamespaceGlobal.strncmp
                                                                .env(env)
                                                                .call(method, "__", 2)
                                                                .value()));
                                    }
                                })
                        .value());
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\Controller\\ControllerResolver";

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
                    .setName("Symfony\\Component\\HttpKernel\\Controller\\ControllerResolver")
                    .setLookup(
                            ControllerResolver.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("logger")
                    .setFilename("vendor/symfony/http-kernel/Controller/ControllerResolver.php")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\Controller\\ControllerResolverInterface")
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
