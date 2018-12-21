package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.namespaces.Exception.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.namespaces.Exception.classes.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
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

 vendor/symfony/process/Exception/ProcessSignaledException.php

*/

public final class ProcessSignaledException extends RuntimeException {

    public Object process = null;

    public ProcessSignaledException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ProcessSignaledException.class) {
            this.__construct(env, args);
        }
    }

    public ProcessSignaledException(NoConstructor n) {
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
        this.process = process;
        super.__construct(
                env,
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "The process has been signaled with signal \"%s\".",
                                env.callMethod(
                                        process, "getTermSignal", ProcessSignaledException.class))
                        .value());
        return null;
    }

    @ConvertedMethod
    public Object getProcess(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.process);
    }

    @ConvertedMethod
    public Object getSignal(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this.getProcess(env), "getTermSignal", ProcessSignaledException.class));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Process\\Exception\\ProcessSignaledException";

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
                    .setName("Symfony\\Component\\Process\\Exception\\ProcessSignaledException")
                    .setLookup(
                            ProcessSignaledException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("process")
                    .setFilename("vendor/symfony/process/Exception/ProcessSignaledException.php")
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
