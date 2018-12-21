package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.namespaces.Exception.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.namespaces.Exception.classes.RuntimeException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/process/Exception/ProcessFailedException.php

*/

public class ProcessFailedException extends RuntimeException {

    public Object process = null;

    public ProcessFailedException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ProcessFailedException.class) {
            this.__construct(env, args);
        }
    }

    public ProcessFailedException(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "process",
        typeHint = "Symfony\\Component\\Process\\Process"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object process = assignParameter(args, 0, false);
        Object error = null;
        if (ZVal.isTrue(env.callMethod(process, "isSuccessful", ProcessFailedException.class))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Expected a failed process, but the given process was successful."));
        }

        error =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "The command \"%s\" failed."
                                        + "\n\nExit Code: %s(%s)\n\nWorking directory: %s",
                                env.callMethod(
                                        process, "getCommandLine", ProcessFailedException.class),
                                env.callMethod(
                                        process, "getExitCode", ProcessFailedException.class),
                                env.callMethod(
                                        process, "getExitCodeText", ProcessFailedException.class),
                                env.callMethod(
                                        process,
                                        "getWorkingDirectory",
                                        ProcessFailedException.class))
                        .value();
        if (!ZVal.isTrue(
                env.callMethod(process, "isOutputDisabled", ProcessFailedException.class))) {
            error =
                    toStringR(error, env)
                            + toStringR(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "\n\nOutput:\n================\n%s\n\nError Output:\n================\n%s",
                                                    env.callMethod(
                                                            process,
                                                            "getOutput",
                                                            ProcessFailedException.class),
                                                    env.callMethod(
                                                            process,
                                                            "getErrorOutput",
                                                            ProcessFailedException.class))
                                            .value(),
                                    env);
        }

        super.__construct(env, error);
        this.process = process;
        return null;
    }

    @ConvertedMethod
    public Object getProcess(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.process);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Process\\Exception\\ProcessFailedException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends RuntimeException.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Process\\Exception\\ProcessFailedException")
                    .setLookup(
                            ProcessFailedException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("process")
                    .setFilename("vendor/symfony/process/Exception/ProcessFailedException.php")
                    .addInterface("Symfony\\Component\\Process\\Exception\\ExceptionInterface")
                    .addInterface("Throwable")
                    .addExtendsClass("Symfony\\Component\\Process\\Exception\\RuntimeException")
                    .addExtendsClass("RuntimeException")
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
