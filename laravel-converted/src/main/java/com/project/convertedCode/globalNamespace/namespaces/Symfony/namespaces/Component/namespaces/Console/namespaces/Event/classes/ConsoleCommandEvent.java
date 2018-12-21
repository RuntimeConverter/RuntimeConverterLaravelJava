package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Event.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Event.classes.ConsoleEvent;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Event/ConsoleCommandEvent.php

*/

public class ConsoleCommandEvent extends ConsoleEvent {

    public Object commandShouldRun = true;

    public ConsoleCommandEvent(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ConsoleCommandEvent.class) {
            this.__construct(env, args);
        }
    }

    public ConsoleCommandEvent(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object disableCommand(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.commandShouldRun = false);
    }

    @ConvertedMethod
    public Object enableCommand(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.commandShouldRun = true);
    }

    @ConvertedMethod
    public Object commandShouldRun(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.commandShouldRun);
    }

    public static final Object CONST_RETURN_CODE_DISABLED = 113;

    public static final Object CONST_class =
            "Symfony\\Component\\Console\\Event\\ConsoleCommandEvent";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ConsoleEvent.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Event\\ConsoleCommandEvent")
                    .setLookup(
                            ConsoleCommandEvent.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "command", "commandShouldRun", "input", "output", "propagationStopped")
                    .setFilename("vendor/symfony/console/Event/ConsoleCommandEvent.php")
                    .addExtendsClass("Symfony\\Component\\Console\\Event\\ConsoleEvent")
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
