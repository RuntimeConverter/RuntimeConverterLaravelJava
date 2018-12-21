package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Promise.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Promise.classes.PromiseInterface;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Doctrine.namespaces.Instantiator.classes.Instantiator;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_a;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Promise/ThrowPromise.php

*/

public class ThrowPromise extends RuntimeClassBase implements PromiseInterface {

    public Object exception = null;

    public Object instantiator = null;

    public ThrowPromise(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ThrowPromise.class) {
            this.__construct(env, args);
        }
    }

    public ThrowPromise(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, false);
        if (function_is_string.f.env(env).call(exception).getBool()) {
            if (ZVal.toBool(!function_class_exists.f.env(env).call(exception).getBool())
                    || ZVal.toBool(!ZVal.isTrue(this.isAValidThrowable(env, exception)))) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Exception / Throwable class or instance expected as argument to ThrowPromise, but got %s.",
                                                exception)
                                        .value()));
            }

        } else if (ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(exception, PHPException.class, "Exception")))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(exception, Throwable.class, "Throwable")))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Exception / Throwable class or instance expected as argument to ThrowPromise, but got %s.",
                                            function_is_object.f.env(env).call(exception).getBool()
                                                    ? function_get_class
                                                            .f
                                                            .env(env)
                                                            .call(exception)
                                                            .value()
                                                    : NamespaceGlobal.gettype
                                                            .env(env)
                                                            .call(exception)
                                                            .value())
                                    .value()));
        }

        this.exception = exception;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args", typeHint = "array")
    @ConvertedParameter(index = 1, name = "object", typeHint = "Prophecy\\Prophecy\\ObjectProphecy")
    @ConvertedParameter(index = 2, name = "method", typeHint = "Prophecy\\Prophecy\\MethodProphecy")
    public Object execute(RuntimeEnv env, Object... args) {
        Object ___args = assignParameter(args, 0, false);
        Object _object = assignParameter(args, 1, false);
        Object method = assignParameter(args, 2, false);
        Object classname = null;
        Object reflection = null;
        Object constructor = null;
        if (function_is_string.f.env(env).call(this.exception).getBool()) {
            classname = ZVal.assign(this.exception);
            reflection = new ReflectionClass(env, classname);
            constructor = env.callMethod(reflection, "getConstructor", ThrowPromise.class);
            if (ZVal.toBool(env.callMethod(constructor, "isPublic", ThrowPromise.class))
                    && ZVal.toBool(
                            ZVal.equalityCheck(
                                    0,
                                    env.callMethod(
                                            constructor,
                                            "getNumberOfRequiredParameters",
                                            ThrowPromise.class)))) {
                throw ZVal.getException(
                        env, env.callMethod(reflection, "newInstance", ThrowPromise.class));
            }

            if (!ZVal.isTrue(this.instantiator)) {
                this.instantiator = new Instantiator(env);
            }

            throw ZVal.getException(
                    env,
                    env.callMethod(
                            this.instantiator, "instantiate", ThrowPromise.class, classname));
        }

        throw ZVal.getException(env, this.exception);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception")
    private Object isAValidThrowable(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(function_is_a.f.env(env).call(exception, "Exception", true).value())
                        || ZVal.toBool(
                                NamespaceGlobal.is_subclass_of
                                        .env(env)
                                        .call(exception, "Throwable", true)
                                        .value()));
    }

    public static final Object CONST_class = "Prophecy\\Promise\\ThrowPromise";

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
                    .setName("Prophecy\\Promise\\ThrowPromise")
                    .setLookup(
                            ThrowPromise.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("exception", "instantiator")
                    .setFilename("vendor/phpspec/prophecy/src/Prophecy/Promise/ThrowPromise.php")
                    .addInterface("Prophecy\\Promise\\PromiseInterface")
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
