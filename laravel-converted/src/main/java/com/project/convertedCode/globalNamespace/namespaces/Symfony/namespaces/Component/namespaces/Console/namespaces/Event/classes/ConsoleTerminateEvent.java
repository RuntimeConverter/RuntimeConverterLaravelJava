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
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Event/ConsoleTerminateEvent.php

*/

public class ConsoleTerminateEvent extends ConsoleEvent {

    public Object exitCode = null;

    public ConsoleTerminateEvent(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ConsoleTerminateEvent.class) {
            this.__construct(env, args);
        }
    }

    public ConsoleTerminateEvent(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "command",
        typeHint = "Symfony\\Component\\Console\\Command\\Command"
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
    @ConvertedParameter(index = 3, name = "exitCode", typeHint = "int")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        Object input = assignParameter(args, 1, false);
        Object output = assignParameter(args, 2, false);
        Object exitCode = assignParameter(args, 3, false);
        super.__construct(env, command, input, output);
        this.setExitCode(env, exitCode);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exitCode")
    public Object setExitCode(RuntimeEnv env, Object... args) {
        Object exitCode = assignParameter(args, 0, false);
        this.exitCode = ZVal.toLong(exitCode);
        return null;
    }

    @ConvertedMethod
    public Object getExitCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.exitCode);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Console\\Event\\ConsoleTerminateEvent";

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
                    .setName("Symfony\\Component\\Console\\Event\\ConsoleTerminateEvent")
                    .setLookup(
                            ConsoleTerminateEvent.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "command", "exitCode", "input", "output", "propagationStopped")
                    .setFilename("vendor/symfony/console/Event/ConsoleTerminateEvent.php")
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
