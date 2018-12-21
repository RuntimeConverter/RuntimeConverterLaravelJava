package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Event.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.classes.Event;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Event/ConsoleEvent.php

*/

public class ConsoleEvent extends Event {

    public Object command = null;

    public Object input = null;

    public Object output = null;

    public ConsoleEvent(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ConsoleEvent.class) {
            this.__construct(env, args);
        }
    }

    public ConsoleEvent(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "command",
        typeHint = "Symfony\\Component\\Console\\Command\\Command",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "input",
        typeHint = "Symfony\\Component\\Console\\Input\\InputInterface"
    )
    @ConvertedParameter(
        index = 2,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, true);
        if (null == command) {
            command = ZVal.getNull();
        }
        Object input = assignParameter(args, 1, false);
        Object output = assignParameter(args, 2, false);
        this.command = command;
        this.input = input;
        this.output = output;
        return null;
    }

    @ConvertedMethod
    public Object getCommand(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.command);
    }

    @ConvertedMethod
    public Object getInput(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.input);
    }

    @ConvertedMethod
    public Object getOutput(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.output);
    }

    public static final Object CONST_class = "Symfony\\Component\\Console\\Event\\ConsoleEvent";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Event.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Event\\ConsoleEvent")
                    .setLookup(
                            ConsoleEvent.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("command", "input", "output", "propagationStopped")
                    .setFilename("vendor/symfony/console/Event/ConsoleEvent.php")
                    .addExtendsClass("Symfony\\Component\\EventDispatcher\\Event")
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
