package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Console.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Events.classes.JobProcessed;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Carbon;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Events.classes.JobFailed;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes.WorkerOptions;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Events.classes.JobProcessing;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Queue/Console/WorkCommand.php

*/

public class WorkCommand extends Command {

    public Object worker = null;

    public WorkCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.signature =
                "queue:work\n                            {connection? : The name of the queue connection to work}\n                            {--queue= : The names of the queues to work}\n                            {--daemon : Run the worker in daemon mode (Deprecated)}\n                            {--once : Only process the next job on the queue}\n                            {--delay=0 : The number of seconds to delay failed jobs}\n                            {--force : Force the worker to run even in maintenance mode}\n                            {--memory=128 : The memory limit in megabytes}\n                            {--sleep=3 : Number of seconds to sleep when no job is available}\n                            {--timeout=60 : The number of seconds a child process can run}\n                            {--tries=0 : Number of times to attempt a job before logging it failed}";
        this.description = "Start processing jobs on the queue as a daemon";
        if (this.getClass() == WorkCommand.class) {
            this.__construct(env, args);
        }
    }

    public WorkCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "worker", typeHint = "Illuminate\\Queue\\Worker")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object worker = assignParameter(args, 0, false);
        super.__construct(env);
        this.worker = worker;
        return null;
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        Object connection = null;
        Object ternaryExpressionTemp = null;
        Object queue = null;
        if (ZVal.toBool(this.downForMaintenance(env))
                && ZVal.toBool(env.callMethod(this, "option", WorkCommand.class, "once"))) {
            return ZVal.assign(
                    env.callMethod(
                            this.worker,
                            "sleep",
                            WorkCommand.class,
                            env.callMethod(this, "option", WorkCommand.class, "sleep")));
        }

        this.listenForEvents(env);
        connection =
                ZVal.assign(
                        ZVal.isTrue(
                                        ternaryExpressionTemp =
                                                env.callMethod(
                                                        this,
                                                        "argument",
                                                        WorkCommand.class,
                                                        "connection"))
                                ? ternaryExpressionTemp
                                : new ReferenceClassProperty(this, "laravel", env)
                                        .arrayGet(env, "config", "queue.default"));
        queue = this.getQueue(env, connection);
        this.runWorker(env, connection, queue);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection")
    @ConvertedParameter(index = 1, name = "queue")
    protected Object runWorker(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        ReferenceContainer connection =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer queue = new BasicReferenceContainer(assignParameter(args, 1, false));
        env.callMethod(
                this.worker,
                "setCache",
                WorkCommand.class,
                env.callMethod(
                        new ReferenceClassProperty(this, "laravel", env).arrayGet(env, "cache"),
                        "driver",
                        WorkCommand.class));
        return ZVal.assign(
                env.callMethod(
                        this.worker,
                        rLastRefArgs =
                                new RuntimeArgsWithReferences()
                                        .add(0, connection)
                                        .add(1, queue)
                                        .add(
                                                2,
                                                handleReturnReference(
                                                        this.gatherWorkerOptions(env))),
                        toStringR(
                                ZVal.isTrue(
                                                env.callMethod(
                                                        this, "option", WorkCommand.class, "once"))
                                        ? "runNextJob"
                                        : "daemon",
                                env),
                        WorkCommand.class,
                        connection.getObject(),
                        queue.getObject(),
                        rLastRefArgs.get(2)));
    }

    @ConvertedMethod
    protected Object gatherWorkerOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new WorkerOptions(
                        env,
                        env.callMethod(this, "option", WorkCommand.class, "delay"),
                        env.callMethod(this, "option", WorkCommand.class, "memory"),
                        env.callMethod(this, "option", WorkCommand.class, "timeout"),
                        env.callMethod(this, "option", WorkCommand.class, "sleep"),
                        env.callMethod(this, "option", WorkCommand.class, "tries"),
                        env.callMethod(this, "option", WorkCommand.class, "force")));
    }

    @ConvertedMethod
    protected Object listenForEvents(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Queue/Console")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Queue/Console/WorkCommand.php");
        env.callMethod(
                new ReferenceClassProperty(this, "laravel", env).arrayGet(env, "events"),
                "listen",
                WorkCommand.class,
                JobProcessing.CONST_class,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Queue\\Console",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "event")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object event = assignParameter(args, 0, false);
                        WorkCommand.this.writeOutput(
                                env,
                                toObjectR(event).accessProp(this, env).name("job").value(),
                                "starting");
                        return null;
                    }
                });
        env.callMethod(
                new ReferenceClassProperty(this, "laravel", env).arrayGet(env, "events"),
                "listen",
                WorkCommand.class,
                JobProcessed.CONST_class,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Queue\\Console",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "event")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object event = assignParameter(args, 0, false);
                        WorkCommand.this.writeOutput(
                                env,
                                toObjectR(event).accessProp(this, env).name("job").value(),
                                "success");
                        return null;
                    }
                });
        env.callMethod(
                new ReferenceClassProperty(this, "laravel", env).arrayGet(env, "events"),
                "listen",
                WorkCommand.class,
                JobFailed.CONST_class,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Queue\\Console",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "event")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object event = assignParameter(args, 0, false);
                        WorkCommand.this.writeOutput(
                                env,
                                toObjectR(event).accessProp(this, env).name("job").value(),
                                "failed");
                        WorkCommand.this.logFailedJob(env, event);
                        return null;
                    }
                });
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job", typeHint = "Illuminate\\Contracts\\Queue\\Job")
    @ConvertedParameter(index = 1, name = "status")
    protected Object writeOutput(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        Object status = assignParameter(args, 1, false);
        switch (toStringR(status)) {
            case "starting":
                return ZVal.assign(this.writeStatus(env, job, "Processing", "comment"));
            case "success":
                return ZVal.assign(this.writeStatus(env, job, "Processed", "info"));
            case "failed":
                return ZVal.assign(this.writeStatus(env, job, "Failed", "error"));
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job", typeHint = "Illuminate\\Contracts\\Queue\\Job")
    @ConvertedParameter(index = 1, name = "status")
    @ConvertedParameter(index = 2, name = "type")
    protected Object writeStatus(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        Object status = assignParameter(args, 1, false);
        Object type = assignParameter(args, 2, false);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("output").value(),
                "writeln",
                WorkCommand.class,
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "<"
                                        + toStringR(type, env)
                                        + ">[%s][%s] %s</"
                                        + toStringR(type, env)
                                        + "> %s",
                                env.callMethod(
                                        Carbon.runtimeStaticObject.now(env),
                                        "format",
                                        WorkCommand.class,
                                        "Y-m-d H:i:s"),
                                env.callMethod(job, "getJobId", WorkCommand.class),
                                NamespaceGlobal.str_pad
                                        .env(env)
                                        .call(toStringR(status, env) + ":", 11)
                                        .value(),
                                env.callMethod(job, "resolveName", WorkCommand.class))
                        .value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Illuminate\\Queue\\Events\\JobFailed"
    )
    protected Object logFailedJob(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        env.callMethod(
                new ReferenceClassProperty(this, "laravel", env).arrayGet(env, "queue.failer"),
                "log",
                WorkCommand.class,
                toObjectR(event).accessProp(this, env).name("connectionName").value(),
                env.callMethod(
                        toObjectR(event).accessProp(this, env).name("job").value(),
                        "getQueue",
                        WorkCommand.class),
                env.callMethod(
                        toObjectR(event).accessProp(this, env).name("job").value(),
                        "getRawBody",
                        WorkCommand.class),
                toObjectR(event).accessProp(this, env).name("exception").value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection")
    protected Object getQueue(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isTrue(
                                ternaryExpressionTemp =
                                        env.callMethod(this, "option", WorkCommand.class, "queue"))
                        ? ternaryExpressionTemp
                        : env.callMethod(
                                new ReferenceClassProperty(this, "laravel", env)
                                        .arrayGet(env, "config"),
                                "get",
                                WorkCommand.class,
                                "queue.connections." + toStringR(connection, env) + ".queue",
                                "default"));
    }

    @ConvertedMethod
    protected Object downForMaintenance(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isTrue(env.callMethod(this, "option", WorkCommand.class, "force"))
                        ? false
                        : env.callMethod(
                                toObjectR(this).accessProp(this, env).name("laravel").value(),
                                "isDownForMaintenance",
                                WorkCommand.class));
    }

    public static final Object CONST_class = "Illuminate\\Queue\\Console\\WorkCommand";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Command.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Queue\\Console\\WorkCommand")
                    .setLookup(
                            WorkCommand.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "aliases",
                            "application",
                            "applicationDefinitionMerged",
                            "applicationDefinitionMergedWithArgs",
                            "code",
                            "definition",
                            "description",
                            "description",
                            "description",
                            "help",
                            "helperSet",
                            "hidden",
                            "hidden",
                            "ignoreValidationErrors",
                            "input",
                            "laravel",
                            "name",
                            "name",
                            "output",
                            "processTitle",
                            "signature",
                            "signature",
                            "synopsis",
                            "usages",
                            "verbosity",
                            "verbosityMap",
                            "worker")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Queue/Console/WorkCommand.php")
                    .addExtendsClass("Illuminate\\Console\\Command")
                    .addExtendsClass("Symfony\\Component\\Console\\Command\\Command")
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
