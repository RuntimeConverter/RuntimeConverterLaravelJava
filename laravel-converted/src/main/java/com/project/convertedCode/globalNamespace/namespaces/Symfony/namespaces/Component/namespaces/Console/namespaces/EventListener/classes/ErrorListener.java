package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.EventListener.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.classes.ConsoleEvents;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.classes.EventSubscriberInterface;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/EventListener/ErrorListener.php

*/

public class ErrorListener extends RuntimeClassBase implements EventSubscriberInterface {

    public Object logger = null;

    public ErrorListener(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ErrorListener.class) {
            this.__construct(env, args);
        }
    }

    public ErrorListener(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "logger",
        typeHint = "Psr\\Log\\LoggerInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object logger = assignParameter(args, 0, true);
        if (null == logger) {
            logger = ZVal.getNull();
        }
        this.logger = logger;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Symfony\\Component\\Console\\Event\\ConsoleErrorEvent"
    )
    public Object onConsoleError(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object inputString = null;
        Object error = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.logger)) {
            return null;
        }

        error = env.callMethod(event, "getError", ErrorListener.class);
        if (!ZVal.isTrue(
                inputString = env.callMethod(this, "getInputString", ErrorListener.class, event))) {
            return ZVal.assign(
                    env.callMethod(
                            this.logger,
                            "error",
                            ErrorListener.class,
                            "An error occurred while using the console. Message: \"{message}\"",
                            ZVal.newArray(
                                    new ZPair("exception", error),
                                    new ZPair(
                                            "message",
                                            env.callMethod(
                                                    error, "getMessage", ErrorListener.class)))));
        }

        env.callMethod(
                this.logger,
                "error",
                ErrorListener.class,
                "Error thrown while running command \"{command}\". Message: \"{message}\"",
                ZVal.newArray(
                        new ZPair("exception", error),
                        new ZPair("command", inputString),
                        new ZPair(
                                "message",
                                env.callMethod(error, "getMessage", ErrorListener.class))));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Symfony\\Component\\Console\\Event\\ConsoleTerminateEvent"
    )
    public Object onConsoleTerminate(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object inputString = null;
        Object exitCode = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.logger)) {
            return null;
        }

        exitCode = env.callMethod(event, "getExitCode", ErrorListener.class);
        if (ZVal.strictEqualityCheck(0, "===", exitCode)) {
            return null;
        }

        if (!ZVal.isTrue(
                inputString = env.callMethod(this, "getInputString", ErrorListener.class, event))) {
            return ZVal.assign(
                    env.callMethod(
                            this.logger,
                            "debug",
                            ErrorListener.class,
                            "The console exited with code \"{code}\"",
                            ZVal.newArray(new ZPair("code", exitCode))));
        }

        env.callMethod(
                this.logger,
                "debug",
                ErrorListener.class,
                "Command \"{command}\" exited with code \"{code}\"",
                ZVal.newArray(new ZPair("command", inputString), new ZPair("code", exitCode)));
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Console\\EventListener\\ErrorListener";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object getSubscribedEvents(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    ConsoleEvents.CONST_ERROR,
                                    ZVal.arrayFromList("onConsoleError", -128)),
                            new ZPair(
                                    ConsoleEvents.CONST_TERMINATE,
                                    ZVal.arrayFromList("onConsoleTerminate", -128))));
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "event",
            typeHint = "Symfony\\Component\\Console\\Event\\ConsoleEvent"
        )
        private Object getInputString(RuntimeEnv env, Object... args) {
            Object event = assignParameter(args, 0, false);
            Object input = null;
            Object commandName = null;
            commandName =
                    ZVal.assign(
                            ZVal.isTrue(env.callMethod(event, "getCommand", ErrorListener.class))
                                    ? env.callMethod(
                                            env.callMethod(
                                                    event, "getCommand", ErrorListener.class),
                                            "getName",
                                            ErrorListener.class)
                                    : ZVal.getNull());
            input = env.callMethod(event, "getInput", ErrorListener.class);
            if (function_method_exists.f.env(env).call(input, "__toString").getBool()) {
                if (ZVal.isTrue(commandName)) {
                    return ZVal.assign(
                            function_str_replace
                                    .f
                                    .env(env)
                                    .call(
                                            ZVal.newArray(
                                                    new ZPair(
                                                            0,
                                                            "'"
                                                                    + toStringR(commandName, env)
                                                                    + "'"),
                                                    new ZPair(
                                                            1,
                                                            "\""
                                                                    + toStringR(commandName, env)
                                                                    + "\"")),
                                            commandName,
                                            toStringR(input, env))
                                    .value());
                }

                return ZVal.assign(toStringR(input, env));
            }

            return ZVal.assign(commandName);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\EventListener\\ErrorListener")
                    .setLookup(
                            ErrorListener.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("logger")
                    .setFilename("vendor/symfony/console/EventListener/ErrorListener.php")
                    .addInterface("Symfony\\Component\\EventDispatcher\\EventSubscriberInterface")
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
