package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.namespaces.Scheduling.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Console/Scheduling/ScheduleFinishCommand.php

*/

public class ScheduleFinishCommand extends Command {

    public Object schedule = null;

    public ScheduleFinishCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.signature = "schedule:finish {id}";
        this.description = "Handle the completion of a scheduled command";
        this.hidden = true;
        if (this.getClass() == ScheduleFinishCommand.class) {
            this.__construct(env, args);
        }
    }

    public ScheduleFinishCommand(NoConstructor n) {
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
        super.__construct(env);
        return null;
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Console/Scheduling")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Console/Scheduling/ScheduleFinishCommand.php");
        env.callMethod(
                toObjectR(
                                env.callMethod(
                                        collect.f
                                                .env(env)
                                                .call(
                                                        env.callMethod(
                                                                this.schedule,
                                                                "events",
                                                                ScheduleFinishCommand.class))
                                                .value(),
                                        "filter",
                                        ScheduleFinishCommand.class,
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Illuminate\\Console\\Scheduling",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(index = 0, name = "value")
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                Object _closureThisVar = this.getClosureThisVar();
                                                Object value = assignParameter(args, 0, false);
                                                return ZVal.assign(
                                                        ZVal.equalityCheck(
                                                                env.callMethod(
                                                                        value,
                                                                        "mutexName",
                                                                        ScheduleFinishCommand
                                                                                .class),
                                                                env.callMethod(
                                                                        _closureThisVar,
                                                                        "argument",
                                                                        ScheduleFinishCommand.class,
                                                                        "id")));
                                            }
                                        }))
                        .accessProp(this, env)
                        .name("each")
                        .value(),
                "callAfterCallbacks",
                ScheduleFinishCommand.class,
                toObjectR(this).accessProp(this, env).name("laravel").value());
        return null;
    }

    public static final Object CONST_class =
            "Illuminate\\Console\\Scheduling\\ScheduleFinishCommand";

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
                    .setName("Illuminate\\Console\\Scheduling\\ScheduleFinishCommand")
                    .setLookup(
                            ScheduleFinishCommand.class,
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
                            "hidden",
                            "ignoreValidationErrors",
                            "input",
                            "laravel",
                            "name",
                            "name",
                            "output",
                            "processTitle",
                            "schedule",
                            "signature",
                            "signature",
                            "synopsis",
                            "usages",
                            "verbosity",
                            "verbosityMap")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Console/Scheduling/ScheduleFinishCommand.php")
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
