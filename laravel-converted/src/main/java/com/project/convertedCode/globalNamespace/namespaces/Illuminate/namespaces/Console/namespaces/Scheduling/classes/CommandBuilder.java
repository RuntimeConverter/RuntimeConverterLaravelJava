package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.namespaces.Scheduling.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.ProcessUtils;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.functions.windows_os;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Application;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Console/Scheduling/CommandBuilder.php

*/

public class CommandBuilder extends RuntimeClassBase {

    public CommandBuilder(RuntimeEnv env, Object... args) {
        super(env);
    }

    public CommandBuilder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Illuminate\\Console\\Scheduling\\Event"
    )
    public Object buildCommand(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        if (toObjectR(event).accessProp(this, env).name("runInBackground").getBool()) {
            return ZVal.assign(this.buildBackgroundCommand(env, event));
        }

        return ZVal.assign(this.buildForegroundCommand(env, event));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Illuminate\\Console\\Scheduling\\Event"
    )
    protected Object buildForegroundCommand(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object output = null;
        output =
                ProcessUtils.runtimeStaticObject.escapeArgument(
                        env, toObjectR(event).accessProp(this, env).name("output").value());
        return ZVal.assign(
                this.ensureCorrectUser(
                        env,
                        event,
                        toStringR(
                                        toObjectR(event)
                                                .accessProp(this, env)
                                                .name("command")
                                                .value(),
                                        env)
                                + toStringR(
                                        toObjectR(event)
                                                        .accessProp(this, env)
                                                        .name("shouldAppendOutput")
                                                        .getBool()
                                                ? " >> "
                                                : " > ",
                                        env)
                                + toStringR(output, env)
                                + " 2>&1"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Illuminate\\Console\\Scheduling\\Event"
    )
    protected Object buildBackgroundCommand(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object output = null;
        Object redirect = null;
        Object finished = null;
        output =
                ProcessUtils.runtimeStaticObject.escapeArgument(
                        env, toObjectR(event).accessProp(this, env).name("output").value());
        redirect =
                ZVal.assign(
                        toObjectR(event).accessProp(this, env).name("shouldAppendOutput").getBool()
                                ? " >> "
                                : " > ");
        finished =
                toStringR(
                                Application.runtimeStaticObject.formatCommandString(
                                        env, "schedule:finish"),
                                env)
                        + " \""
                        + toStringR(env.callMethod(event, "mutexName", CommandBuilder.class), env)
                        + "\"";
        return ZVal.assign(
                this.ensureCorrectUser(
                        env,
                        event,
                        "("
                                + toStringR(
                                        toObjectR(event)
                                                .accessProp(this, env)
                                                .name("command")
                                                .value(),
                                        env)
                                + toStringR(redirect, env)
                                + toStringR(output, env)
                                + " 2>&1 "
                                + toStringR(windows_os.f.env(env).call().getBool() ? "&" : ";", env)
                                + " "
                                + toStringR(finished, env)
                                + ") > "
                                + toStringR(
                                        ProcessUtils.runtimeStaticObject.escapeArgument(
                                                env,
                                                env.callMethod(
                                                        event,
                                                        "getDefaultOutput",
                                                        CommandBuilder.class)),
                                        env)
                                + " 2>&1 &"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Illuminate\\Console\\Scheduling\\Event"
    )
    @ConvertedParameter(index = 1, name = "command")
    protected Object ensureCorrectUser(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.toBool(toObjectR(event).accessProp(this, env).name("user").value())
                                && ZVal.toBool(!windows_os.f.env(env).call().getBool())
                        ? "sudo -u "
                                + toStringR(
                                        toObjectR(event).accessProp(this, env).name("user").value(),
                                        env)
                                + " -- sh -c '"
                                + toStringR(command, env)
                                + "'"
                        : command);
    }

    public static final Object CONST_class = "Illuminate\\Console\\Scheduling\\CommandBuilder";

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
                    .setName("Illuminate\\Console\\Scheduling\\CommandBuilder")
                    .setLookup(
                            CommandBuilder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Console/Scheduling/CommandBuilder.php")
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
