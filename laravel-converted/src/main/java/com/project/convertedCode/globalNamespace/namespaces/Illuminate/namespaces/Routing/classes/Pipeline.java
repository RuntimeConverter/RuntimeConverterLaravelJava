package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.classes.Request;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Debug.classes.ExceptionHandler;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes.FatalThrowableError;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Routing/Pipeline.php

*/

public class Pipeline
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Pipeline
                .classes
                .Pipeline {

    public Pipeline(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Pipeline.class) {
            this.__construct(env, args);
        }
    }

    public Pipeline(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "destination", typeHint = "Closure")
    protected Object prepareDestination(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Routing/Pipeline.php");
        Object destination = assignParameter(args, 0, false);
        return ZVal.assign(
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Routing", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "passable")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        ReferenceContainer passable =
                                new BasicReferenceContainer(assignParameter(args, 0, false));
                        Object e = null;
                        Object destination = null;
                        destination = this.contextReferences.getCapturedValue("destination");
                        try {
                            return ZVal.assign(
                                    env.callFunctionDynamic(
                                                    destination,
                                                    new RuntimeArgsWithReferences()
                                                            .add(0, passable),
                                                    passable.getObject())
                                            .value());
                        } catch (ConvertedException convertedException59) {
                            if (convertedException59.instanceOf(PHPException.class, "Exception")) {
                                e = convertedException59.getObject();
                                return ZVal.assign(
                                        Pipeline.this.handleException(
                                                env, passable.getObject(), e));
                            } else if (convertedException59.instanceOf(
                                    Throwable.class, "Throwable")) {
                                e = convertedException59.getObject();
                                return ZVal.assign(
                                        Pipeline.this.handleException(
                                                env,
                                                passable.getObject(),
                                                new FatalThrowableError(env, e)));
                            } else {
                                throw convertedException59;
                            }
                        }
                    }
                }.use("destination", destination));
    }

    @ConvertedMethod
    protected Object carry(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Routing/Pipeline.php");
        return ZVal.assign(
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Routing", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "stack")
                    @ConvertedParameter(index = 1, name = "pipe")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ContextConstants runtimeConverterFunctionClassConstants =
                                new ContextConstants()
                                        .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                                        .setFile(
                                                "/vendor/laravel/framework/src/Illuminate/Routing/Pipeline.php");
                        Object stack = assignParameter(args, 0, false);
                        Object pipe = assignParameter(args, 1, false);
                        return ZVal.assign(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Routing",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "passable")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        ReferenceContainer passable =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 0, false));
                                        ReferenceContainer stack =
                                                new BasicReferenceContainer(null);
                                        Object callable = null;
                                        Object e = null;
                                        Object slice = null;
                                        ReferenceContainer pipe = new BasicReferenceContainer(null);
                                        stack =
                                                this.contextReferences.getReferenceContainer(
                                                        "stack");
                                        pipe = this.contextReferences.getReferenceContainer("pipe");
                                        try {
                                            slice = Pipeline.super.carry(env);
                                            callable =
                                                    env.callFunctionDynamic(
                                                                    slice,
                                                                    new RuntimeArgsWithReferences()
                                                                            .add(0, stack)
                                                                            .add(1, pipe),
                                                                    stack.getObject(),
                                                                    pipe.getObject())
                                                            .value();
                                            return ZVal.assign(
                                                    env.callFunctionDynamic(
                                                                    callable,
                                                                    new RuntimeArgsWithReferences()
                                                                            .add(0, passable),
                                                                    passable.getObject())
                                                            .value());
                                        } catch (ConvertedException convertedException60) {
                                            if (convertedException60.instanceOf(
                                                    PHPException.class, "Exception")) {
                                                e = convertedException60.getObject();
                                                return ZVal.assign(
                                                        Pipeline.this.handleException(
                                                                env, passable.getObject(), e));
                                            } else if (convertedException60.instanceOf(
                                                    Throwable.class, "Throwable")) {
                                                e = convertedException60.getObject();
                                                return ZVal.assign(
                                                        Pipeline.this.handleException(
                                                                env,
                                                                passable.getObject(),
                                                                new FatalThrowableError(env, e)));
                                            } else {
                                                throw convertedException60;
                                            }
                                        }
                                    }
                                }.use("stack", stack).use("pipe", pipe));
                    }
                });
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "passable")
    @ConvertedParameter(index = 1, name = "e", typeHint = "Exception")
    protected Object handleException(RuntimeEnv env, Object... args) {
        Object passable = assignParameter(args, 0, false);
        Object e = assignParameter(args, 1, false);
        Object handler = null;
        Object response = null;
        if (ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("container")
                                                .value(),
                                        "bound",
                                        Pipeline.class,
                                        ExceptionHandler.CONST_class)))
                || ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        passable, Request.class, "Illuminate\\Http\\Request")))) {
            throw ZVal.getException(env, e);
        }

        handler =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("container").value(),
                        "make",
                        Pipeline.class,
                        ExceptionHandler.CONST_class);
        env.callMethod(handler, "report", Pipeline.class, e);
        response = env.callMethod(handler, "render", Pipeline.class, passable, e);
        if (function_method_exists.f.env(env).call(response, "withException").getBool()) {
            env.callMethod(response, "withException", Pipeline.class, e);
        }

        return ZVal.assign(response);
    }

    public static final Object CONST_class = "Illuminate\\Routing\\Pipeline";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Illuminate
                    .namespaces
                    .Pipeline
                    .classes
                    .Pipeline
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Routing\\Pipeline")
                    .setLookup(
                            Pipeline.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("container", "method", "passable", "pipes")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Routing/Pipeline.php")
                    .addInterface("Illuminate\\Contracts\\Pipeline\\Pipeline")
                    .addExtendsClass("Illuminate\\Pipeline\\Pipeline")
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
