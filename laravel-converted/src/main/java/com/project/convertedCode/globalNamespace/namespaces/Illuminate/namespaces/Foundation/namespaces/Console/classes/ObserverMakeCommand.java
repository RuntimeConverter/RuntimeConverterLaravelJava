package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.GeneratorCommand;
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

 vendor/laravel/framework/src/Illuminate/Foundation/Console/ObserverMakeCommand.php

*/

public class ObserverMakeCommand extends GeneratorCommand {

    public ObserverMakeCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = "make:observer";
        this.description = "Create a new observer class";
        this.type = "Observer";
        if (this.getClass() == ObserverMakeCommand.class) {
            this.__construct(env, args);
        }
    }

    public ObserverMakeCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object buildClass(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object stub = null;
        Object model = null;
        stub = super.buildClass(env, name);
        model = env.callMethod(this, "option", ObserverMakeCommand.class, "model");
        return ZVal.assign(ZVal.isTrue(model) ? this.replaceModel(env, stub, model) : stub);
    }

    @ConvertedMethod
    protected Object getStub(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isTrue(env.callMethod(this, "option", ObserverMakeCommand.class, "model"))
                        ? toStringR(
                                        env.addRootFilesystemPrefix(
                                                "/vendor/laravel/framework/src/Illuminate/Foundation/Console"),
                                        env)
                                + "/stubs/observer.stub"
                        : toStringR(
                                        env.addRootFilesystemPrefix(
                                                "/vendor/laravel/framework/src/Illuminate/Foundation/Console"),
                                        env)
                                + "/stubs/observer.plain.stub");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stub")
    @ConvertedParameter(index = 1, name = "model")
    protected Object replaceModel(RuntimeEnv env, Object... args) {
        Object stub = assignParameter(args, 0, false);
        Object model = assignParameter(args, 1, false);
        Object namespaceModel = null;
        model = function_str_replace.f.env(env).call("/", "\\", model).value();
        namespaceModel =
                toStringR(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("laravel")
                                                .value(),
                                        "getNamespace",
                                        ObserverMakeCommand.class),
                                env)
                        + toStringR(model, env);
        if (ZVal.isTrue(Str.runtimeStaticObject.startsWith(env, model, "\\"))) {
            stub =
                    function_str_replace
                            .f
                            .env(env)
                            .call(
                                    "NamespacedDummyModel",
                                    function_trim.f.env(env).call(model, "\\").value(),
                                    stub)
                            .value();

        } else {
            stub =
                    function_str_replace
                            .f
                            .env(env)
                            .call("NamespacedDummyModel", namespaceModel, stub)
                            .value();
        }

        stub =
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                "use "
                                        + toStringR(namespaceModel, env)
                                        + ";\nuse "
                                        + toStringR(namespaceModel, env)
                                        + ";",
                                "use " + toStringR(namespaceModel, env) + ";",
                                stub)
                        .value();
        model =
                class_basename
                        .f
                        .env(env)
                        .call(function_trim.f.env(env).call(model, "\\").value())
                        .value();
        stub =
                function_str_replace
                        .f
                        .env(env)
                        .call("DocDummyModel", Str.runtimeStaticObject.snake(env, model, " "), stub)
                        .value();
        stub = function_str_replace.f.env(env).call("DummyModel", model, stub).value();
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call("dummyModel", Str.runtimeStaticObject.camel(env, model), stub)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rootNamespace")
    protected Object getDefaultNamespace(RuntimeEnv env, Object... args) {
        Object rootNamespace = assignParameter(args, 0, false);
        return ZVal.assign(toStringR(rootNamespace, env) + "\\Observers");
    }

    @ConvertedMethod
    protected Object getOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.newArray(
                                        new ZPair(0, "model"),
                                        new ZPair(1, "m"),
                                        new ZPair(2, InputOption.CONST_VALUE_OPTIONAL),
                                        new ZPair(3, "The model that the observer applies to.")))));
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Console\\ObserverMakeCommand";

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
                    .setName("Illuminate\\Foundation\\Console\\ObserverMakeCommand")
                    .setLookup(
                            ObserverMakeCommand.class,
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
                            "vendor/laravel/framework/src/Illuminate/Foundation/Console/ObserverMakeCommand.php")
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
