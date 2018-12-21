package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Console.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes.ListenerOptions;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Queue/Console/ListenCommand.php

*/

public class ListenCommand extends Command {

    public Object listener = null;

    public ListenCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.signature =
                "queue:listen\n                            {connection? : The name of connection}\n                            {--delay=0 : The number of seconds to delay failed jobs}\n                            {--force : Force the worker to run even in maintenance mode}\n                            {--memory=128 : The memory limit in megabytes}\n                            {--queue= : The queue to listen on}\n                            {--sleep=3 : Number of seconds to sleep when no job is available}\n                            {--timeout=60 : The number of seconds a child process can run}\n                            {--tries=0 : Number of times to attempt a job before logging it failed}";
        this.description = "Listen to a given queue";
        if (this.getClass() == ListenCommand.class) {
            this.__construct(env, args);
        }
    }

    public ListenCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "listener", typeHint = "Illuminate\\Queue\\Listener")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object listener = assignParameter(args, 0, false);
        super.__construct(env);
        this.setOutputHandler(env, this.listener = listener);
        return null;
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        Object connection = null;
        Object queue = null;
        queue =
                this.getQueue(
                        env,
                        connection =
                                env.callMethod(
                                        toObjectR(this).accessProp(this, env).name("input").value(),
                                        "getArgument",
                                        ListenCommand.class,
                                        "connection"));
        env.callMethod(
                this.listener,
                "listen",
                ListenCommand.class,
                connection,
                queue,
                this.gatherOptions(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection")
    protected Object getQueue(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        connection =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = connection)
                                ? ternaryExpressionTemp
                                : new ReferenceClassProperty(this, "laravel", env)
                                        .arrayGet(env, "config", "queue.default"));
        return ZVal.assign(
                ZVal.isTrue(
                                ternaryExpressionTemp =
                                        env.callMethod(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("input")
                                                        .value(),
                                                "getOption",
                                                ListenCommand.class,
                                                "queue"))
                        ? ternaryExpressionTemp
                        : env.callMethod(
                                new ReferenceClassProperty(this, "laravel", env)
                                        .arrayGet(env, "config"),
                                "get",
                                ListenCommand.class,
                                "queue.connections." + toStringR(connection, env) + ".queue",
                                "default"));
    }

    @ConvertedMethod
    protected Object gatherOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ListenerOptions(
                        env,
                        env.callMethod(this, "option", ListenCommand.class, "env"),
                        env.callMethod(this, "option", ListenCommand.class, "delay"),
                        env.callMethod(this, "option", ListenCommand.class, "memory"),
                        env.callMethod(this, "option", ListenCommand.class, "timeout"),
                        env.callMethod(this, "option", ListenCommand.class, "sleep"),
                        env.callMethod(this, "option", ListenCommand.class, "tries"),
                        env.callMethod(this, "option", ListenCommand.class, "force")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "listener", typeHint = "Illuminate\\Queue\\Listener")
    protected Object setOutputHandler(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Queue/Console")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Queue/Console/ListenCommand.php");
        Object listener = assignParameter(args, 0, false);
        env.callMethod(
                listener,
                "setOutputHandler",
                ListenCommand.class,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Queue\\Console",
                        this) {
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
                        env.callMethod(
                                toObjectR(_closureThisVar)
                                        .accessProp(this, env)
                                        .name("output")
                                        .value(),
                                "write",
                                ListenCommand.class,
                                line);
                        return null;
                    }
                });
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Queue\\Console\\ListenCommand";

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
                    .setName("Illuminate\\Queue\\Console\\ListenCommand")
                    .setLookup(
                            ListenCommand.class,
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
                            "listener",
                            "name",
                            "name",
                            "output",
                            "processTitle",
                            "signature",
                            "signature",
                            "synopsis",
                            "usages",
                            "verbosity",
                            "verbosityMap")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Queue/Console/ListenCommand.php")
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
