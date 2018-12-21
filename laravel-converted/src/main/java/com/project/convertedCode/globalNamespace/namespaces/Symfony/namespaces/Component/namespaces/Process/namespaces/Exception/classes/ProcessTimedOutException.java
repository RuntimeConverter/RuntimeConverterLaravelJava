package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.namespaces.Exception.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.namespaces.Exception.classes.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/process/Exception/ProcessTimedOutException.php

*/

public class ProcessTimedOutException extends RuntimeException {

    public Object process = null;

    public Object timeoutType = null;

    public ProcessTimedOutException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ProcessTimedOutException.class) {
            this.__construct(env, args);
        }
    }

    public ProcessTimedOutException(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "process",
        typeHint = "Symfony\\Component\\Process\\Process"
    )
    @ConvertedParameter(index = 1, name = "timeoutType", typeHint = "int")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object process = assignParameter(args, 0, false);
        Object timeoutType = assignParameter(args, 1, false);
        this.process = process;
        this.timeoutType = timeoutType;
        super.__construct(
                env,
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "The process \"%s\" exceeded the timeout of %s seconds.",
                                env.callMethod(
                                        process, "getCommandLine", ProcessTimedOutException.class),
                                this.getExceededTimeout(env))
                        .value());
        return null;
    }

    @ConvertedMethod
    public Object getProcess(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.process);
    }

    @ConvertedMethod
    public Object isGeneralTimeout(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.strictEqualityCheck(CONST_TYPE_GENERAL, "===", this.timeoutType));
    }

    @ConvertedMethod
    public Object isIdleTimeout(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.strictEqualityCheck(CONST_TYPE_IDLE, "===", this.timeoutType));
    }

    @ConvertedMethod
    public Object getExceededTimeout(RuntimeEnv env, Object... args) {
        SwitchEnumType133 switchVariable133 =
                ZVal.getEnum(
                        this.timeoutType,
                        SwitchEnumType133.DEFAULT_CASE,
                        SwitchEnumType133.DYNAMIC_TYPE_397,
                        CONST_TYPE_GENERAL,
                        SwitchEnumType133.DYNAMIC_TYPE_398,
                        CONST_TYPE_IDLE);
        switch (switchVariable133) {
            case DYNAMIC_TYPE_397:
                return ZVal.assign(
                        env.callMethod(this.process, "getTimeout", ProcessTimedOutException.class));
            case DYNAMIC_TYPE_398:
                return ZVal.assign(
                        env.callMethod(
                                this.process, "getIdleTimeout", ProcessTimedOutException.class));
            case DEFAULT_CASE:
                throw ZVal.getException(
                        env,
                        new LogicException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("Unknown timeout type \"%d\".", this.timeoutType)
                                        .value()));
        }
        ;
        return null;
    }

    public static final Object CONST_TYPE_GENERAL = 1;

    public static final Object CONST_TYPE_IDLE = 2;

    public static final Object CONST_class =
            "Symfony\\Component\\Process\\Exception\\ProcessTimedOutException";

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
                    .setName("Symfony\\Component\\Process\\Exception\\ProcessTimedOutException")
                    .setLookup(
                            ProcessTimedOutException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("process", "timeoutType")
                    .setFilename("vendor/symfony/process/Exception/ProcessTimedOutException.php")
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

    private enum SwitchEnumType133 {
        DYNAMIC_TYPE_397,
        DYNAMIC_TYPE_398,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
