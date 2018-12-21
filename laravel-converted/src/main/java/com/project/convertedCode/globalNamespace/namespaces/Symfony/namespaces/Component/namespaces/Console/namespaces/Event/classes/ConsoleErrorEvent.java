package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Event.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionProperty;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Event.classes.ConsoleEvent;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Event/ConsoleErrorEvent.php

*/

public final class ConsoleErrorEvent extends ConsoleEvent {

    public Object error = null;

    public Object exitCode = null;

    public ConsoleErrorEvent(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ConsoleErrorEvent.class) {
            this.__construct(env, args);
        }
    }

    public ConsoleErrorEvent(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "input",
        typeHint = "Symfony\\Component\\Console\\Input\\InputInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    @ConvertedParameter(index = 2, name = "error", typeHint = "Throwable")
    @ConvertedParameter(
        index = 3,
        name = "command",
        typeHint = "Symfony\\Component\\Console\\Command\\Command",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object output = assignParameter(args, 1, false);
        Object error = assignParameter(args, 2, false);
        Object command = assignParameter(args, 3, true);
        if (null == command) {
            command = ZVal.getNull();
        }
        super.__construct(env, command, input, output);
        this.error = error;
        return null;
    }

    @ConvertedMethod
    public Object getError(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.error);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "error", typeHint = "Throwable")
    public Object setError(RuntimeEnv env, Object... args) {
        Object error = assignParameter(args, 0, false);
        this.error = error;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exitCode", typeHint = "int")
    public Object setExitCode(RuntimeEnv env, Object... args) {
        Object exitCode = assignParameter(args, 0, false);
        Object r = null;
        this.exitCode = exitCode;
        r = new ReflectionProperty(env, this.error, "code");
        env.callMethod(r, "setAccessible", ConsoleErrorEvent.class, true);
        env.callMethod(r, "setValue", ConsoleErrorEvent.class, this.error, this.exitCode);
        return null;
    }

    @ConvertedMethod
    public Object getExitCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.exitCode)
                        ? this.exitCode
                        : ZVal.toBool(
                                                function_is_int
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                env.callMethod(
                                                                        this.error,
                                                                        "getCode",
                                                                        ConsoleErrorEvent.class))
                                                        .value())
                                        && ZVal.toBool(
                                                ZVal.strictNotEqualityCheck(
                                                        0,
                                                        "!==",
                                                        env.callMethod(
                                                                this.error,
                                                                "getCode",
                                                                ConsoleErrorEvent.class)))
                                ? env.callMethod(this.error, "getCode", ConsoleErrorEvent.class)
                                : 1);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Console\\Event\\ConsoleErrorEvent";

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
                    .setName("Symfony\\Component\\Console\\Event\\ConsoleErrorEvent")
                    .setLookup(
                            ConsoleErrorEvent.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "command", "error", "exitCode", "input", "output", "propagationStopped")
                    .setFilename("vendor/symfony/console/Event/ConsoleErrorEvent.php")
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
