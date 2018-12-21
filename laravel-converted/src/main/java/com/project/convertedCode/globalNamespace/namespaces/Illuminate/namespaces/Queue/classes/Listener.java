package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.classes.Process;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.classes.PhpExecutableFinder;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.ProcessUtils;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Queue/Listener.php

*/

public class Listener extends RuntimeClassBase {

    public Object commandPath = null;

    public Object environment = null;

    public Object sleep = 3;

    public Object maxTries = 0;

    public Object workerCommand = null;

    public Object outputHandler = null;

    public Listener(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Listener.class) {
            this.__construct(env, args);
        }
    }

    public Listener(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "commandPath")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object commandPath = assignParameter(args, 0, false);
        this.commandPath = commandPath;
        this.workerCommand = this.buildCommandTemplate(env);
        return null;
    }

    @ConvertedMethod
    protected Object buildCommandTemplate(RuntimeEnv env, Object... args) {
        Object command = null;
        command = "queue:work %s --once --queue=%s --delay=%s --memory=%s --sleep=%s --tries=%s";
        return ZVal.assign(
                toStringR(this.phpBinary(env), env)
                        + " "
                        + toStringR(this.artisanBinary(env), env)
                        + " "
                        + toStringR(command, env));
    }

    @ConvertedMethod
    protected Object phpBinary(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ProcessUtils.runtimeStaticObject.escapeArgument(
                        env,
                        env.callMethod(
                                new PhpExecutableFinder(env), "find", Listener.class, false)));
    }

    @ConvertedMethod
    protected Object artisanBinary(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_defined.f.env(env).call("ARTISAN_BINARY").getBool()
                        ? ProcessUtils.runtimeStaticObject.escapeArgument(
                                env, function_constant.get(env, "ARTISAN_BINARY"))
                        : ProcessUtils.runtimeStaticObject.escapeArgument(env, "artisan"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection")
    @ConvertedParameter(index = 1, name = "queue")
    @ConvertedParameter(
        index = 2,
        name = "options",
        typeHint = "Illuminate\\Queue\\ListenerOptions"
    )
    public Object listen(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        Object queue = assignParameter(args, 1, false);
        Object options = assignParameter(args, 2, false);
        Object process = null;
        process = this.makeProcess(env, connection, queue, options);
        while (ZVal.isTrue(true)) {
            this.runProcess(
                    env, process, toObjectR(options).accessProp(this, env).name("memory").value());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection")
    @ConvertedParameter(index = 1, name = "queue")
    @ConvertedParameter(
        index = 2,
        name = "options",
        typeHint = "Illuminate\\Queue\\ListenerOptions"
    )
    public Object makeProcess(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        Object queue = assignParameter(args, 1, false);
        Object options = assignParameter(args, 2, false);
        Object command = null;
        command = ZVal.assign(this.workerCommand);
        if (ZVal.isset(toObjectR(options).accessProp(this, env).name("environment").value())) {
            command = this.addEnvironment(env, command, options);
        }

        command = this.formatCommand(env, command, connection, queue, options);
        return ZVal.assign(
                new Process(
                        env,
                        command,
                        this.commandPath,
                        ZVal.getNull(),
                        ZVal.getNull(),
                        toObjectR(options).accessProp(this, env).name("timeout").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    @ConvertedParameter(
        index = 1,
        name = "options",
        typeHint = "Illuminate\\Queue\\ListenerOptions"
    )
    protected Object addEnvironment(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        Object options = assignParameter(args, 1, false);
        return ZVal.assign(
                toStringR(command, env)
                        + " --env="
                        + toStringR(
                                ProcessUtils.runtimeStaticObject.escapeArgument(
                                        env,
                                        toObjectR(options)
                                                .accessProp(this, env)
                                                .name("environment")
                                                .value()),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    @ConvertedParameter(index = 1, name = "connection")
    @ConvertedParameter(index = 2, name = "queue")
    @ConvertedParameter(
        index = 3,
        name = "options",
        typeHint = "Illuminate\\Queue\\ListenerOptions"
    )
    protected Object formatCommand(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        Object connection = assignParameter(args, 1, false);
        Object queue = assignParameter(args, 2, false);
        Object options = assignParameter(args, 3, false);
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                command,
                                ProcessUtils.runtimeStaticObject.escapeArgument(env, connection),
                                ProcessUtils.runtimeStaticObject.escapeArgument(env, queue),
                                toObjectR(options).accessProp(this, env).name("delay").value(),
                                toObjectR(options).accessProp(this, env).name("memory").value(),
                                toObjectR(options).accessProp(this, env).name("sleep").value(),
                                toObjectR(options).accessProp(this, env).name("maxTries").value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "process",
        typeHint = "Symfony\\Component\\Process\\Process"
    )
    @ConvertedParameter(index = 1, name = "memory")
    public Object runProcess(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Queue")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Queue/Listener.php");
        Object process = assignParameter(args, 0, false);
        Object memory = assignParameter(args, 1, false);
        env.callMethod(
                process,
                "run",
                Listener.class,
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Queue", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "type")
                    @ConvertedParameter(index = 1, name = "line")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object type = assignParameter(args, 0, false);
                        Object line = assignParameter(args, 1, false);
                        Listener.this.handleWorkerOutput(env, type, line);
                        return null;
                    }
                });
        if (ZVal.isTrue(this.memoryExceeded(env, memory))) {
            this.stop(env);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(index = 1, name = "line")
    protected Object handleWorkerOutput(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        Object line = assignParameter(args, 1, false);
        if (ZVal.isset(this.outputHandler)) {
            function_call_user_func
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                    .call(this.outputHandler, type, line);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "memoryLimit")
    public Object memoryExceeded(RuntimeEnv env, Object... args) {
        Object memoryLimit = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isGreaterThanOrEqualTo(
                        ZVal.divide(
                                ZVal.divide(
                                        NamespaceGlobal.memory_get_usage.env(env).call().value(),
                                        1024),
                                1024),
                        ">=",
                        memoryLimit));
    }

    @ConvertedMethod
    public Object stop(RuntimeEnv env, Object... args) {
        env.exit();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "outputHandler", typeHint = "Closure")
    public Object setOutputHandler(RuntimeEnv env, Object... args) {
        Object outputHandler = assignParameter(args, 0, false);
        this.outputHandler = outputHandler;
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Queue\\Listener";

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
                    .setName("Illuminate\\Queue\\Listener")
                    .setLookup(
                            Listener.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "commandPath",
                            "environment",
                            "maxTries",
                            "outputHandler",
                            "sleep",
                            "workerCommand")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Queue/Listener.php")
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
