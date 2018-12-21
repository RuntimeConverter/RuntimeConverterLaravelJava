package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.namespaces.Scheduling.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Carbon;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Console/Scheduling/ScheduleRunCommand.php

*/

public class ScheduleRunCommand extends Command {

    public Object schedule = null;

    public Object startedAt = null;

    public Object eventsRan = false;

    public ScheduleRunCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = "schedule:run";
        this.description = "Run the scheduled commands";
        if (this.getClass() == ScheduleRunCommand.class) {
            this.__construct(env, args);
        }
    }

    public ScheduleRunCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "schedule",
        typeHint = "Illuminate\\Console\\Scheduling\\Schedule"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object schedule = assignParameter(args, 0, false);
        this.schedule = schedule;
        this.startedAt = Carbon.runtimeStaticObject.now(env);
        super.__construct(env);
        return null;
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object event = null;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult231 :
                ZVal.getIterable(
                        env.callMethod(
                                this.schedule,
                                "dueEvents",
                                ScheduleRunCommand.class,
                                toObjectR(this).accessProp(this, env).name("laravel").value()),
                        env,
                        true)) {
            event = ZVal.assign(zpairResult231.getValue());
            if (!ZVal.isTrue(
                    env.callMethod(
                            event,
                            "filtersPass",
                            ScheduleRunCommand.class,
                            toObjectR(this).accessProp(this, env).name("laravel").value()))) {
                continue;
            }

            if (toObjectR(event).accessProp(this, env).name("onOneServer").getBool()) {
                this.runSingleServerEvent(env, event);

            } else {
                this.runEvent(env, event);
            }

            this.eventsRan = true;
        }

        if (!ZVal.isTrue(this.eventsRan)) {
            env.callMethod(
                    this,
                    "info",
                    ScheduleRunCommand.class,
                    "No scheduled commands are ready to run.");
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    protected Object runSingleServerEvent(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                env.callMethod(
                        this.schedule,
                        "serverShouldRun",
                        ScheduleRunCommand.class,
                        event,
                        this.startedAt))) {
            this.runEvent(env, event);

        } else {
            env.callMethod(
                    this,
                    "line",
                    ScheduleRunCommand.class,
                    "<info>Skipping command (has already run on another server):</info> "
                            + toStringR(
                                    env.callMethod(
                                            event,
                                            "getSummaryForDisplay",
                                            ScheduleRunCommand.class),
                                    env));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    protected Object runEvent(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        env.callMethod(
                this,
                "line",
                ScheduleRunCommand.class,
                "<info>Running scheduled command:</info> "
                        + toStringR(
                                env.callMethod(
                                        event, "getSummaryForDisplay", ScheduleRunCommand.class),
                                env));
        env.callMethod(
                event,
                "run",
                ScheduleRunCommand.class,
                toObjectR(this).accessProp(this, env).name("laravel").value());
        this.eventsRan = true;
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Console\\Scheduling\\ScheduleRunCommand";

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
                    .setName("Illuminate\\Console\\Scheduling\\ScheduleRunCommand")
                    .setLookup(
                            ScheduleRunCommand.class,
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
                            "eventsRan",
                            "help",
                            "helperSet",
                            "hidden",
                            "hidden",
                            "ignoreValidationErrors",
                            "input",
                            "laravel",
                            "name",
                            "name",
                            "name",
                            "output",
                            "processTitle",
                            "schedule",
                            "signature",
                            "startedAt",
                            "synopsis",
                            "usages",
                            "verbosity",
                            "verbosityMap")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Console/Scheduling/ScheduleRunCommand.php")
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
