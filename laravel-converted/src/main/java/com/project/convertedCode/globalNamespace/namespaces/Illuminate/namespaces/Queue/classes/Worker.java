package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Events.classes.WorkerStopping;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Events.classes.JobExceptionOccurred;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Events.classes.Looping;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes.FailingJob;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes.FatalThrowableError;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Events.classes.JobProcessed;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes.MaxAttemptsExceededException;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Carbon;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_extension_loaded;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Events.classes.JobProcessing;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Queue/Worker.php

*/

public class Worker extends RuntimeClassBase {

    public Object manager = null;

    public Object events = null;

    public Object cache = null;

    public Object exceptions = null;

    public Object shouldQuit = false;

    public Object paused = false;

    public Worker(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Worker.class) {
            this.__construct(env, args);
        }
    }

    public Worker(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "manager", typeHint = "Illuminate\\Queue\\QueueManager")
    @ConvertedParameter(
        index = 1,
        name = "events",
        typeHint = "Illuminate\\Contracts\\Events\\Dispatcher"
    )
    @ConvertedParameter(
        index = 2,
        name = "exceptions",
        typeHint = "Illuminate\\Contracts\\Debug\\ExceptionHandler"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object manager = assignParameter(args, 0, false);
        Object events = assignParameter(args, 1, false);
        Object exceptions = assignParameter(args, 2, false);
        this.events = events;
        this.manager = manager;
        this.exceptions = exceptions;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connectionName")
    @ConvertedParameter(index = 1, name = "queue")
    @ConvertedParameter(index = 2, name = "options", typeHint = "Illuminate\\Queue\\WorkerOptions")
    public Object daemon(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object connectionName = assignParameter(args, 0, false);
        Object queue = assignParameter(args, 1, false);
        Object options = assignParameter(args, 2, false);
        Object lastRestart = null;
        Object job = null;
        if (ZVal.isTrue(this.supportsAsyncSignals(env))) {
            this.listenForSignals(env);
        }

        lastRestart = this.getTimestampOfLastQueueRestart(env);
        runtimeConverterContinueCount = 0;
        while (ZVal.isTrue(true)) {
            if (!ZVal.isTrue(this.daemonShouldRun(env, options, connectionName, queue))) {
                this.pauseWorker(env, options, lastRestart);
                continue;
            }

            job =
                    this.getNextJob(
                            env,
                            env.callMethod(
                                    this.manager, "connection", Worker.class, connectionName),
                            queue);
            if (ZVal.isTrue(this.supportsAsyncSignals(env))) {
                this.registerTimeoutHandler(env, job, options);
            }

            if (ZVal.isTrue(job)) {
                this.runJob(env, job, connectionName, options);

            } else {
                this.sleep(env, toObjectR(options).accessProp(this, env).name("sleep").value());
            }

            this.stopIfNecessary(env, options, lastRestart);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    @ConvertedParameter(index = 1, name = "options", typeHint = "Illuminate\\Queue\\WorkerOptions")
    protected Object registerTimeoutHandler(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Queue")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Queue/Worker.php");
        Object job = assignParameter(args, 0, false);
        Object options = assignParameter(args, 1, false);
        com.runtimeconverter.runtime.ZVal.functionNotFound("pcntl_signal")
                .env(env)
                .call(
                        function_constant.get(env, "SIGALRM"),
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Queue",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Worker.this.kill(env, 1);
                                return null;
                            }
                        });
        com.runtimeconverter.runtime.ZVal.functionNotFound("pcntl_alarm")
                .env(env)
                .call(
                        NamespaceGlobal.max
                                .env(env)
                                .call(this.timeoutForJob(env, job, options), 0)
                                .value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    @ConvertedParameter(index = 1, name = "options", typeHint = "Illuminate\\Queue\\WorkerOptions")
    protected Object timeoutForJob(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        Object options = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.toBool(job)
                                && ZVal.toBool(
                                        !function_is_null
                                                .f
                                                .env(env)
                                                .call(env.callMethod(job, "timeout", Worker.class))
                                                .getBool())
                        ? env.callMethod(job, "timeout", Worker.class)
                        : toObjectR(options).accessProp(this, env).name("timeout").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options", typeHint = "Illuminate\\Queue\\WorkerOptions")
    @ConvertedParameter(index = 1, name = "connectionName")
    @ConvertedParameter(index = 2, name = "queue")
    protected Object daemonShouldRun(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, false);
        Object connectionName = assignParameter(args, 1, false);
        Object queue = assignParameter(args, 2, false);
        return ZVal.assign(
                !ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                env.callMethod(
                                                                        this.manager,
                                                                        "isDownForMaintenance",
                                                                        Worker.class))
                                                        && ZVal.toBool(
                                                                !toObjectR(options)
                                                                        .accessProp(this, env)
                                                                        .name("force")
                                                                        .getBool()))
                                        || ZVal.toBool(this.paused))
                        || ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        env.callMethod(
                                                this.events,
                                                "until",
                                                Worker.class,
                                                new Looping(env, connectionName, queue)),
                                        "===",
                                        false)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options", typeHint = "Illuminate\\Queue\\WorkerOptions")
    @ConvertedParameter(index = 1, name = "lastRestart")
    protected Object pauseWorker(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, false);
        Object lastRestart = assignParameter(args, 1, false);
        this.sleep(
                env,
                ZVal.isGreaterThan(
                                toObjectR(options).accessProp(this, env).name("sleep").value(),
                                '>',
                                0)
                        ? toObjectR(options).accessProp(this, env).name("sleep").value()
                        : 1);
        this.stopIfNecessary(env, options, lastRestart);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options", typeHint = "Illuminate\\Queue\\WorkerOptions")
    @ConvertedParameter(index = 1, name = "lastRestart")
    protected Object stopIfNecessary(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, false);
        Object lastRestart = assignParameter(args, 1, false);
        if (ZVal.isTrue(this.shouldQuit)) {
            this.kill(env);
        }

        if (ZVal.isTrue(
                this.memoryExceeded(
                        env, toObjectR(options).accessProp(this, env).name("memory").value()))) {
            this.stop(env, 12);

        } else if (ZVal.isTrue(this.queueShouldRestart(env, lastRestart))) {
            this.stop(env);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connectionName")
    @ConvertedParameter(index = 1, name = "queue")
    @ConvertedParameter(index = 2, name = "options", typeHint = "Illuminate\\Queue\\WorkerOptions")
    public Object runNextJob(RuntimeEnv env, Object... args) {
        Object connectionName = assignParameter(args, 0, false);
        Object queue = assignParameter(args, 1, false);
        Object options = assignParameter(args, 2, false);
        Object job = null;
        job =
                this.getNextJob(
                        env,
                        env.callMethod(this.manager, "connection", Worker.class, connectionName),
                        queue);
        if (ZVal.isTrue(job)) {
            return ZVal.assign(this.runJob(env, job, connectionName, options));
        }

        this.sleep(env, toObjectR(options).accessProp(this, env).name("sleep").value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection")
    @ConvertedParameter(index = 1, name = "queue")
    protected Object getNextJob(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        Object queue = assignParameter(args, 1, false);
        Object e = null;
        Object job = null;
        try {
            for (ZPair zpairResult512 :
                    ZVal.getIterable(
                            function_explode.f.env(env).call(",", queue).value(), env, true)) {
                queue = ZVal.assign(zpairResult512.getValue());
                if (!function_is_null
                        .f
                        .env(env)
                        .call(job = env.callMethod(connection, "pop", Worker.class, queue))
                        .getBool()) {
                    return ZVal.assign(job);
                }
            }

        } catch (ConvertedException convertedException53) {
            if (convertedException53.instanceOf(PHPException.class, "Exception")) {
                e = convertedException53.getObject();
                env.callMethod(this.exceptions, "report", Worker.class, e);
                this.stopWorkerIfLostConnection(env, e);
            } else if (convertedException53.instanceOf(Throwable.class, "Throwable")) {
                e = convertedException53.getObject();
                env.callMethod(
                        this.exceptions,
                        "report",
                        Worker.class,
                        e = new FatalThrowableError(env, e));
                this.stopWorkerIfLostConnection(env, e);
            } else {
                throw convertedException53;
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    @ConvertedParameter(index = 1, name = "connectionName")
    @ConvertedParameter(index = 2, name = "options", typeHint = "Illuminate\\Queue\\WorkerOptions")
    protected Object runJob(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        Object connectionName = assignParameter(args, 1, false);
        Object options = assignParameter(args, 2, false);
        Object e = null;
        try {
            return ZVal.assign(this.process(env, connectionName, job, options));
        } catch (ConvertedException convertedException54) {
            if (convertedException54.instanceOf(PHPException.class, "Exception")) {
                e = convertedException54.getObject();
                env.callMethod(this.exceptions, "report", Worker.class, e);
                this.stopWorkerIfLostConnection(env, e);
            } else if (convertedException54.instanceOf(Throwable.class, "Throwable")) {
                e = convertedException54.getObject();
                env.callMethod(
                        this.exceptions,
                        "report",
                        Worker.class,
                        e = new FatalThrowableError(env, e));
                this.stopWorkerIfLostConnection(env, e);
            } else {
                throw convertedException54;
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e")
    protected Object stopWorkerIfLostConnection(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.causedByLostConnection(env, e))) {
            this.shouldQuit = true;
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connectionName")
    @ConvertedParameter(index = 1, name = "job")
    @ConvertedParameter(index = 2, name = "options", typeHint = "Illuminate\\Queue\\WorkerOptions")
    public Object process(RuntimeEnv env, Object... args) {
        Object connectionName = assignParameter(args, 0, false);
        Object job = assignParameter(args, 1, false);
        Object options = assignParameter(args, 2, false);
        Object e = null;
        try {
            this.raiseBeforeJobEvent(env, connectionName, job);
            this.markJobAsFailedIfAlreadyExceedsMaxAttempts(
                    env,
                    connectionName,
                    job,
                    ZVal.toLong(toObjectR(options).accessProp(this, env).name("maxTries").value()));
            env.callMethod(job, "fire", Worker.class);
            this.raiseAfterJobEvent(env, connectionName, job);
        } catch (ConvertedException convertedException55) {
            if (convertedException55.instanceOf(PHPException.class, "Exception")) {
                e = convertedException55.getObject();
                this.handleJobException(env, connectionName, job, options, e);
            } else if (convertedException55.instanceOf(Throwable.class, "Throwable")) {
                e = convertedException55.getObject();
                this.handleJobException(
                        env, connectionName, job, options, new FatalThrowableError(env, e));
            } else {
                throw convertedException55;
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connectionName")
    @ConvertedParameter(index = 1, name = "job")
    @ConvertedParameter(index = 2, name = "options", typeHint = "Illuminate\\Queue\\WorkerOptions")
    @ConvertedParameter(index = 3, name = "e")
    protected Object handleJobException(RuntimeEnv env, Object... args) {
        Object connectionName = assignParameter(args, 0, false);
        Object job = assignParameter(args, 1, false);
        Object options = assignParameter(args, 2, false);
        Object e = assignParameter(args, 3, false);
        try {
            if (!ZVal.isTrue(env.callMethod(job, "hasFailed", Worker.class))) {
                this.markJobAsFailedIfWillExceedMaxAttempts(
                        env,
                        connectionName,
                        job,
                        ZVal.toLong(
                                toObjectR(options).accessProp(this, env).name("maxTries").value()),
                        e);
            }

            this.raiseExceptionOccurredJobEvent(env, connectionName, job, e);
        } catch (ConvertedException convertedException56) {

            throw convertedException56;
        } finally {
            if (ZVal.toBool(
                            ZVal.toBool(
                                            !ZVal.isTrue(
                                                    env.callMethod(job, "isDeleted", Worker.class)))
                                    && ZVal.toBool(
                                            !ZVal.isTrue(
                                                    env.callMethod(
                                                            job, "isReleased", Worker.class))))
                    && ZVal.toBool(!ZVal.isTrue(env.callMethod(job, "hasFailed", Worker.class)))) {
                env.callMethod(
                        job,
                        "release",
                        Worker.class,
                        toObjectR(options).accessProp(this, env).name("delay").value());
            }
        }

        throw ZVal.getException(env, e);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connectionName")
    @ConvertedParameter(index = 1, name = "job")
    @ConvertedParameter(index = 2, name = "maxTries")
    protected Object markJobAsFailedIfAlreadyExceedsMaxAttempts(RuntimeEnv env, Object... args) {
        Object connectionName = assignParameter(args, 0, false);
        Object job = assignParameter(args, 1, false);
        Object maxTries = assignParameter(args, 2, false);
        Object timeoutAt = null;
        Object e = null;
        maxTries =
                ZVal.assign(
                        !function_is_null
                                        .f
                                        .env(env)
                                        .call(env.callMethod(job, "maxTries", Worker.class))
                                        .getBool()
                                ? env.callMethod(job, "maxTries", Worker.class)
                                : maxTries);
        timeoutAt = env.callMethod(job, "timeoutAt", Worker.class);
        if (ZVal.toBool(timeoutAt)
                && ZVal.toBool(
                        ZVal.isLessThanOrEqualTo(
                                env.callMethod(
                                        Carbon.runtimeStaticObject.now(env),
                                        "getTimestamp",
                                        Worker.class),
                                "<=",
                                timeoutAt))) {
            return null;
        }

        if (ZVal.toBool(!ZVal.isTrue(timeoutAt))
                && ZVal.toBool(
                        ZVal.toBool(ZVal.strictEqualityCheck(maxTries, "===", 0))
                                || ZVal.toBool(
                                        ZVal.isLessThanOrEqualTo(
                                                env.callMethod(job, "attempts", Worker.class),
                                                "<=",
                                                maxTries)))) {
            return null;
        }

        this.failJob(
                env,
                connectionName,
                job,
                e =
                        new MaxAttemptsExceededException(
                                env,
                                toStringR(env.callMethod(job, "resolveName", Worker.class), env)
                                        + " has been attempted too many times or run too long. The job may have previously timed out."));
        throw ZVal.getException(env, e);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connectionName")
    @ConvertedParameter(index = 1, name = "job")
    @ConvertedParameter(index = 2, name = "maxTries")
    @ConvertedParameter(index = 3, name = "e")
    protected Object markJobAsFailedIfWillExceedMaxAttempts(RuntimeEnv env, Object... args) {
        Object connectionName = assignParameter(args, 0, false);
        Object job = assignParameter(args, 1, false);
        Object maxTries = assignParameter(args, 2, false);
        Object e = assignParameter(args, 3, false);
        maxTries =
                ZVal.assign(
                        !function_is_null
                                        .f
                                        .env(env)
                                        .call(env.callMethod(job, "maxTries", Worker.class))
                                        .getBool()
                                ? env.callMethod(job, "maxTries", Worker.class)
                                : maxTries);
        if (ZVal.toBool(env.callMethod(job, "timeoutAt", Worker.class))
                && ZVal.toBool(
                        ZVal.isLessThanOrEqualTo(
                                env.callMethod(job, "timeoutAt", Worker.class),
                                "<=",
                                env.callMethod(
                                        Carbon.runtimeStaticObject.now(env),
                                        "getTimestamp",
                                        Worker.class)))) {
            this.failJob(env, connectionName, job, e);
        }

        if (ZVal.toBool(ZVal.isGreaterThan(maxTries, '>', 0))
                && ZVal.toBool(
                        ZVal.isGreaterThanOrEqualTo(
                                env.callMethod(job, "attempts", Worker.class), ">=", maxTries))) {
            this.failJob(env, connectionName, job, e);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connectionName")
    @ConvertedParameter(index = 1, name = "job")
    @ConvertedParameter(index = 2, name = "e")
    protected Object failJob(RuntimeEnv env, Object... args) {
        Object connectionName = assignParameter(args, 0, false);
        Object job = assignParameter(args, 1, false);
        Object e = assignParameter(args, 2, false);
        return ZVal.assign(FailingJob.runtimeStaticObject.handle(env, connectionName, job, e));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connectionName")
    @ConvertedParameter(index = 1, name = "job")
    protected Object raiseBeforeJobEvent(RuntimeEnv env, Object... args) {
        Object connectionName = assignParameter(args, 0, false);
        Object job = assignParameter(args, 1, false);
        env.callMethod(
                this.events, "dispatch", Worker.class, new JobProcessing(env, connectionName, job));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connectionName")
    @ConvertedParameter(index = 1, name = "job")
    protected Object raiseAfterJobEvent(RuntimeEnv env, Object... args) {
        Object connectionName = assignParameter(args, 0, false);
        Object job = assignParameter(args, 1, false);
        env.callMethod(
                this.events, "dispatch", Worker.class, new JobProcessed(env, connectionName, job));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connectionName")
    @ConvertedParameter(index = 1, name = "job")
    @ConvertedParameter(index = 2, name = "e")
    protected Object raiseExceptionOccurredJobEvent(RuntimeEnv env, Object... args) {
        Object connectionName = assignParameter(args, 0, false);
        Object job = assignParameter(args, 1, false);
        Object e = assignParameter(args, 2, false);
        env.callMethod(
                this.events,
                "dispatch",
                Worker.class,
                new JobExceptionOccurred(env, connectionName, job, e));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "lastRestart")
    protected Object queueShouldRestart(RuntimeEnv env, Object... args) {
        Object lastRestart = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.notEqualityCheck(this.getTimestampOfLastQueueRestart(env), lastRestart));
    }

    @ConvertedMethod
    protected Object getTimestampOfLastQueueRestart(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.cache)) {
            return ZVal.assign(
                    env.callMethod(this.cache, "get", Worker.class, "illuminate:queue:restart"));
        }

        return null;
    }

    @ConvertedMethod
    protected Object listenForSignals(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Queue")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Queue/Worker.php");
        com.runtimeconverter.runtime.ZVal.functionNotFound("pcntl_async_signals")
                .env(env)
                .call(true);
        com.runtimeconverter.runtime.ZVal.functionNotFound("pcntl_signal")
                .env(env)
                .call(
                        function_constant.get(env, "SIGTERM"),
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Queue",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Worker.this.shouldQuit = true;
                                return null;
                            }
                        });
        com.runtimeconverter.runtime.ZVal.functionNotFound("pcntl_signal")
                .env(env)
                .call(
                        function_constant.get(env, "SIGUSR2"),
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Queue",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Worker.this.paused = true;
                                return null;
                            }
                        });
        com.runtimeconverter.runtime.ZVal.functionNotFound("pcntl_signal")
                .env(env)
                .call(
                        function_constant.get(env, "SIGCONT"),
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Queue",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Worker.this.paused = false;
                                return null;
                            }
                        });
        return null;
    }

    @ConvertedMethod
    protected Object supportsAsyncSignals(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_extension_loaded.f.env(env).call("pcntl").value());
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
    @ConvertedParameter(index = 0, name = "status", defaultValue = "0", defaultValueType = "number")
    public Object stop(RuntimeEnv env, Object... args) {
        Object status = assignParameter(args, 0, true);
        if (null == status) {
            status = 0;
        }
        env.callMethod(this.events, "dispatch", Worker.class, new WorkerStopping(env));
        env.exit(status);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "status", defaultValue = "0", defaultValueType = "number")
    public Object kill(RuntimeEnv env, Object... args) {
        Object status = assignParameter(args, 0, true);
        if (null == status) {
            status = 0;
        }
        env.callMethod(this.events, "dispatch", Worker.class, new WorkerStopping(env));
        if (function_extension_loaded.f.env(env).call("posix").getBool()) {
            NamespaceGlobal.posix_kill
                    .env(env)
                    .call(
                            NamespaceGlobal.getmypid.env(env).call().value(),
                            function_constant.get(env, "SIGKILL"));
        }

        env.exit(status);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "seconds")
    public Object sleep(RuntimeEnv env, Object... args) {
        Object seconds = assignParameter(args, 0, false);
        if (ZVal.isLessThan(seconds, '<', 1)) {
            NamespaceGlobal.usleep.env(env).call(ZVal.multiply(seconds, 1000000));

        } else {
            NamespaceGlobal.sleep.env(env).call(seconds);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "cache",
        typeHint = "Illuminate\\Contracts\\Cache\\Repository"
    )
    public Object setCache(RuntimeEnv env, Object... args) {
        Object cache = assignParameter(args, 0, false);
        this.cache = cache;
        return null;
    }

    @ConvertedMethod
    public Object getManager(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.manager);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "manager", typeHint = "Illuminate\\Queue\\QueueManager")
    public Object setManager(RuntimeEnv env, Object... args) {
        Object manager = assignParameter(args, 0, false);
        this.manager = manager;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Throwable")
    protected Object causedByLostConnection(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        Object message = null;
        message = env.callMethod(e, "getMessage", Worker.class);
        return ZVal.assign(
                Str.runtimeStaticObject.contains(
                        env,
                        message,
                        ZVal.arrayFromList(
                                "server has gone away",
                                "no connection to the server",
                                "Lost connection",
                                "is dead or not enabled",
                                "Error while sending",
                                "decryption failed or bad record mac",
                                "server closed the connection unexpectedly",
                                "SSL connection has been closed unexpectedly",
                                "Error writing data to the connection",
                                "Resource deadlock avoided",
                                "Transaction() on null",
                                "child connection forced to terminate due to client_idle_limit",
                                "query_wait_timeout",
                                "reset by peer",
                                "Physical connection is not usable",
                                "TCP Provider: Error code 0x68")));
    }

    public static final Object CONST_class = "Illuminate\\Queue\\Worker";

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
                    .setName("Illuminate\\Queue\\Worker")
                    .setLookup(
                            Worker.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "cache", "events", "exceptions", "manager", "paused", "shouldQuit")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Queue/Worker.php")
                    .addTrait("Illuminate\\Database\\DetectsLostConnections")
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
