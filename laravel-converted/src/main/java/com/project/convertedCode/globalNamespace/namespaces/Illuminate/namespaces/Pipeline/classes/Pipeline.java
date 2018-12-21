package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Pipeline.classes;

import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reduce;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reverse;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Responsable;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.classes.Request;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pad;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Pipeline/Pipeline.php

*/

public class Pipeline extends RuntimeClassBase
        implements com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Contracts
                .namespaces
                .Pipeline
                .classes
                .Pipeline {

    public Object container = null;

    public Object passable = null;

    public Object pipes = ZVal.newArray();

    public Object method = "handle";

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
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Illuminate\\Contracts\\Container\\Container",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, true);
        if (null == container) {
            container = ZVal.getNull();
        }
        this.container = container;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "passable")
    public Object send(RuntimeEnv env, Object... args) {
        Object passable = assignParameter(args, 0, false);
        this.passable = passable;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pipes")
    public Object through(RuntimeEnv env, Object... args) {
        Object pipes = assignParameter(args, 0, false);
        this.pipes =
                function_is_array.f.env(env).call(pipes).getBool()
                        ? pipes
                        : function_func_get_args
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call()
                                .value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    public Object via(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        this.method = method;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "destination", typeHint = "Closure")
    public Object then(RuntimeEnv env, Object... args) {
        Object destination = assignParameter(args, 0, false);
        Object pipeline = null;
        pipeline =
                function_array_reduce
                        .f
                        .env(env)
                        .call(
                                function_array_reverse.f.env(env).call(this.pipes).value(),
                                this.carry(env),
                                this.prepareDestination(env, destination))
                        .value();
        return ZVal.assign(
                env.callFunctionDynamic(
                                pipeline,
                                new RuntimeArgsWithReferences()
                                        .add(0, new ReferenceClassProperty(this, "passable", env)),
                                this.passable)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "destination", typeHint = "Closure")
    protected Object prepareDestination(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Pipeline")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Pipeline/Pipeline.php");
        Object destination = assignParameter(args, 0, false);
        return ZVal.assign(
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Pipeline", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "passable")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ReferenceContainer passable =
                                new BasicReferenceContainer(assignParameter(args, 0, false));
                        Object destination = null;
                        destination = this.contextReferences.getCapturedValue("destination");
                        return ZVal.assign(
                                env.callFunctionDynamic(
                                                destination,
                                                new RuntimeArgsWithReferences().add(0, passable),
                                                passable.getObject())
                                        .value());
                    }
                }.use("destination", destination));
    }

    @ConvertedMethod
    protected Object carry(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Pipeline")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Pipeline/Pipeline.php");
        return ZVal.assign(
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Pipeline", this) {
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
                                        .setDir("/vendor/laravel/framework/src/Illuminate/Pipeline")
                                        .setFile(
                                                "/vendor/laravel/framework/src/Illuminate/Pipeline/Pipeline.php");
                        Object stack = assignParameter(args, 0, false);
                        Object pipe = assignParameter(args, 1, false);
                        return ZVal.assign(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Pipeline",
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
                                        Object response = null;
                                        Object name = null;
                                        Object pipe = null;
                                        Object parameters = null;
                                        Object runtimeTempArrayResult67 = null;
                                        stack =
                                                this.contextReferences.getReferenceContainer(
                                                        "stack");
                                        pipe = this.contextReferences.getCapturedValue("pipe");
                                        if (function_is_callable.f.env(env).call(pipe).getBool()) {
                                            return ZVal.assign(
                                                    env.callFunctionDynamic(
                                                                    pipe,
                                                                    new RuntimeArgsWithReferences()
                                                                            .add(0, passable)
                                                                            .add(1, stack),
                                                                    passable.getObject(),
                                                                    stack.getObject())
                                                            .value());

                                        } else if (!function_is_object
                                                .f
                                                .env(env)
                                                .call(pipe)
                                                .getBool()) {
                                            ZVal.list(
                                                    runtimeTempArrayResult67 =
                                                            Pipeline.this.parsePipeString(
                                                                    env, pipe),
                                                    (name =
                                                            listGet(
                                                                    runtimeTempArrayResult67,
                                                                    0,
                                                                    env)),
                                                    (parameters =
                                                            listGet(
                                                                    runtimeTempArrayResult67,
                                                                    1,
                                                                    env)));
                                            pipe =
                                                    env.callMethod(
                                                            Pipeline.this.getContainer(env),
                                                            "make",
                                                            Pipeline.class,
                                                            name);
                                            parameters =
                                                    function_array_merge
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    ZVal.newArray(
                                                                            new ZPair(
                                                                                    0,
                                                                                    passable
                                                                                            .getObject()),
                                                                            new ZPair(
                                                                                    1,
                                                                                    stack
                                                                                            .getObject())),
                                                                    parameters)
                                                            .value();

                                        } else {
                                            parameters =
                                                    ZVal.newArray(
                                                            new ZPair(0, passable.getObject()),
                                                            new ZPair(1, stack.getObject()));
                                        }

                                        response =
                                                ZVal.assign(
                                                        function_method_exists
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                pipe,
                                                                                Pipeline.this
                                                                                        .method)
                                                                        .getBool()
                                                                ? env.callMethod(
                                                                        pipe,
                                                                        new RuntimeArgsWithReferences(),
                                                                        toStringR(
                                                                                Pipeline.this
                                                                                        .method,
                                                                                env),
                                                                        Pipeline.class,
                                                                        PackedVaradicArgs.unpack(
                                                                                new PackedVaradicArgs(
                                                                                        parameters)))
                                                                : env.callFunctionDynamic(
                                                                                pipe,
                                                                                new RuntimeArgsWithReferences(),
                                                                                PackedVaradicArgs
                                                                                        .unpack(
                                                                                                new PackedVaradicArgs(
                                                                                                        parameters)))
                                                                        .value());
                                        return ZVal.assign(
                                                ZVal.isTrue(
                                                                ZVal.checkInstanceType(
                                                                        response,
                                                                        Responsable.class,
                                                                        "Illuminate\\Contracts\\Support\\Responsable"))
                                                        ? env.callMethod(
                                                                response,
                                                                "toResponse",
                                                                Pipeline.class,
                                                                env.callMethod(
                                                                        Pipeline.this.container,
                                                                        "make",
                                                                        Pipeline.class,
                                                                        Request.CONST_class))
                                                        : response);
                                    }
                                }.use("stack", stack).use("pipe", pipe));
                    }
                });
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pipe")
    protected Object parsePipeString(RuntimeEnv env, Object... args) {
        Object pipe = assignParameter(args, 0, false);
        Object name = null;
        Object runtimeTempArrayResult68 = null;
        Object parameters = null;
        ZVal.list(
                runtimeTempArrayResult68 =
                        function_array_pad
                                .f
                                .env(env)
                                .call(
                                        function_explode.f.env(env).call(":", pipe, 2).value(),
                                        2,
                                        ZVal.newArray())
                                .value(),
                (name = listGet(runtimeTempArrayResult68, 0, env)),
                (parameters = listGet(runtimeTempArrayResult68, 1, env)));
        if (function_is_string.f.env(env).call(parameters).getBool()) {
            parameters = function_explode.f.env(env).call(",", parameters).value();
        }

        return ZVal.assign(ZVal.newArray(new ZPair(0, name), new ZPair(1, parameters)));
    }

    @ConvertedMethod
    protected Object getContainer(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.container)) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env, "A container instance has not been passed to the Pipeline."));
        }

        return ZVal.assign(this.container);
    }

    public static final Object CONST_class = "Illuminate\\Pipeline\\Pipeline";

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
                    .setName("Illuminate\\Pipeline\\Pipeline")
                    .setLookup(
                            Pipeline.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("container", "method", "passable", "pipes")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Pipeline/Pipeline.php")
                    .addInterface("Illuminate\\Contracts\\Pipeline\\Pipeline")
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
