package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.GeneratorCommand;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.functions.class_basename;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Console/ListenerMakeCommand.php

*/

public class ListenerMakeCommand extends GeneratorCommand {

    public ListenerMakeCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = "make:listener";
        this.description = "Create a new event listener class";
        this.type = "Listener";
        if (this.getClass() == ListenerMakeCommand.class) {
            this.__construct(env, args);
        }
    }

    public ListenerMakeCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object buildClass(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object stub = null;
        Object event = null;
        event = env.callMethod(this, "option", ListenerMakeCommand.class, "event");
        if (!ZVal.isTrue(
                Str.runtimeStaticObject.startsWith(
                        env,
                        event,
                        ZVal.newArray(
                                new ZPair(
                                        0,
                                        env.callMethod(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("laravel")
                                                        .value(),
                                                "getNamespace",
                                                ListenerMakeCommand.class)),
                                new ZPair(1, "Illuminate"),
                                new ZPair(2, "\\"))))) {
            event =
                    toStringR(
                                    env.callMethod(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("laravel")
                                                    .value(),
                                            "getNamespace",
                                            ListenerMakeCommand.class),
                                    env)
                            + "Events\\"
                            + toStringR(event, env);
        }

        stub =
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                "DummyEvent",
                                class_basename.f.env(env).call(event).value(),
                                super.buildClass(env, name))
                        .value();
        return ZVal.assign(
                function_str_replace.f.env(env).call("DummyFullEvent", event, stub).value());
    }

    @ConvertedMethod
    protected Object getStub(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(env.callMethod(this, "option", ListenerMakeCommand.class, "queued"))) {
            return ZVal.assign(
                    ZVal.isTrue(env.callMethod(this, "option", ListenerMakeCommand.class, "event"))
                            ? toStringR(
                                            env.addRootFilesystemPrefix(
                                                    "/vendor/laravel/framework/src/Illuminate/Foundation/Console"),
                                            env)
                                    + "/stubs/listener-queued.stub"
                            : toStringR(
                                            env.addRootFilesystemPrefix(
                                                    "/vendor/laravel/framework/src/Illuminate/Foundation/Console"),
                                            env)
                                    + "/stubs/listener-queued-duck.stub");
        }

        return ZVal.assign(
                ZVal.isTrue(env.callMethod(this, "option", ListenerMakeCommand.class, "event"))
                        ? toStringR(
                                        env.addRootFilesystemPrefix(
                                                "/vendor/laravel/framework/src/Illuminate/Foundation/Console"),
                                        env)
                                + "/stubs/listener.stub"
                        : toStringR(
                                        env.addRootFilesystemPrefix(
                                                "/vendor/laravel/framework/src/Illuminate/Foundation/Console"),
                                        env)
                                + "/stubs/listener-duck.stub");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rawName")
    protected Object alreadyExists(RuntimeEnv env, Object... args) {
        Object rawName = assignParameter(args, 0, false);
        return ZVal.assign(function_class_exists.f.env(env).call(rawName).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rootNamespace")
    protected Object getDefaultNamespace(RuntimeEnv env, Object... args) {
        Object rootNamespace = assignParameter(args, 0, false);
        return ZVal.assign(toStringR(rootNamespace, env) + "\\Listeners");
    }

    @ConvertedMethod
    protected Object getOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.newArray(
                                        new ZPair(0, "event"),
                                        new ZPair(1, "e"),
                                        new ZPair(2, InputOption.CONST_VALUE_OPTIONAL),
                                        new ZPair(3, "The event class being listened for."))),
                        new ZPair(
                                1,
                                ZVal.newArray(
                                        new ZPair(0, "queued"),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, InputOption.CONST_VALUE_NONE),
                                        new ZPair(
                                                3,
                                                "Indicates the event listener should be queued.")))));
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Console\\ListenerMakeCommand";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends GeneratorCommand.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Foundation\\Console\\ListenerMakeCommand")
                    .setLookup(
                            ListenerMakeCommand.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "aliases",
                            "application",
                            "applicationDefinitionMerged",
                            "applicationDefinitionMergedWithArgs",
                            "code",
                            "definition",
                            "description",
                            "description",
                            "description",
                            "files",
                            "help",
                            "helperSet",
                            "hidden",
                            "hidden",
                            "ignoreValidationErrors",
                            "input",
                            "laravel",
                            "name",
                            "name",
                            "name",
                            "output",
                            "processTitle",
                            "signature",
                            "synopsis",
                            "type",
                            "type",
                            "usages",
                            "verbosity",
                            "verbosityMap")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Console/ListenerMakeCommand.php")
                    .addExtendsClass("Illuminate\\Console\\GeneratorCommand")
                    .addExtendsClass("Illuminate\\Console\\Command")
                    .addExtendsClass("Symfony\\Component\\Console\\Command\\Command")
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
