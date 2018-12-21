package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.namespaces.Events.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Console/Events/CommandFinished.php

*/

public class CommandFinished extends RuntimeClassBase {

    public Object command = null;

    public Object input = null;

    public Object output = null;

    public Object exitCode = null;

    public CommandFinished(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CommandFinished.class) {
            this.__construct(env, args);
        }
    }

    public CommandFinished(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
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
    @ConvertedParameter(index = 3, name = "exitCode")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        Object input = assignParameter(args, 1, false);
        Object output = assignParameter(args, 2, false);
        Object exitCode = assignParameter(args, 3, false);
        this.input = input;
        this.output = output;
        this.command = command;
        this.exitCode = exitCode;
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Console\\Events\\CommandFinished";

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
                    .setName("Illuminate\\Console\\Events\\CommandFinished")
                    .setLookup(
                            CommandFinished.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("command", "exitCode", "input", "output")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Console/Events/CommandFinished.php")
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
