package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Support.namespaces.Providers.classes.EventServiceProvider;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Console/EventGenerateCommand.php

*/

public class EventGenerateCommand extends Command {

    public EventGenerateCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = "event:generate";
        this.description = "Generate the missing events and listeners based on registration";
        if (this.getClass() == EventGenerateCommand.class) {
            this.__construct(env, args);
        }
    }

    public EventGenerateCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        Object listeners = null;
        Object provider = null;
        Object event = null;
        Object providers = null;
        providers =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("laravel").value(),
                        "getProviders",
                        EventGenerateCommand.class,
                        EventServiceProvider.CONST_class);
        for (ZPair zpairResult404 : ZVal.getIterable(providers, env, true)) {
            provider = ZVal.assign(zpairResult404.getValue());
            for (ZPair zpairResult405 :
                    ZVal.getIterable(
                            env.callMethod(provider, "listens", EventGenerateCommand.class),
                            env,
                            false)) {
                event = ZVal.assign(zpairResult405.getKey());
                listeners = ZVal.assign(zpairResult405.getValue());
                this.makeEventAndListeners(env, event, listeners);
            }
        }

        env.callMethod(
                this,
                "info",
                EventGenerateCommand.class,
                "Events and listeners generated successfully!");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    @ConvertedParameter(index = 1, name = "listeners")
    protected Object makeEventAndListeners(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object listeners = assignParameter(args, 1, false);
        if (!ZVal.isTrue(Str.runtimeStaticObject.contains(env, event, "\\"))) {
            return null;
        }

        env.callMethod(
                this,
                "callSilent",
                EventGenerateCommand.class,
                "make:event",
                ZVal.newArray(new ZPair("name", event)));
        this.makeListeners(env, event, listeners);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    @ConvertedParameter(index = 1, name = "listeners")
    protected Object makeListeners(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object listeners = assignParameter(args, 1, false);
        Object listener = null;
        for (ZPair zpairResult406 : ZVal.getIterable(listeners, env, true)) {
            listener = ZVal.assign(zpairResult406.getValue());
            listener = function_preg_replace.f.env(env).call("/@.+$/", "", listener).value();
            env.callMethod(
                    this,
                    "callSilent",
                    EventGenerateCommand.class,
                    "make:listener",
                    function_array_filter
                            .f
                            .env(env)
                            .call(
                                    ZVal.newArray(
                                            new ZPair("name", listener),
                                            new ZPair("--event", event)))
                            .value());
        }

        return null;
    }

    public static final Object CONST_class =
            "Illuminate\\Foundation\\Console\\EventGenerateCommand";

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
                    .setName("Illuminate\\Foundation\\Console\\EventGenerateCommand")
                    .setLookup(
                            EventGenerateCommand.class,
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
                            "name",
                            "output",
                            "processTitle",
                            "signature",
                            "synopsis",
                            "usages",
                            "verbosity",
                            "verbosityMap")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Console/EventGenerateCommand.php")
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
