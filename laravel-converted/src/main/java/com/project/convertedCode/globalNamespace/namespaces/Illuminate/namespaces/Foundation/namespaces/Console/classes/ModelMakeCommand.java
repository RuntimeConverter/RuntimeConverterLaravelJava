package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.classes;

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

 vendor/laravel/framework/src/Illuminate/Foundation/Console/ModelMakeCommand.php

*/

public class ModelMakeCommand extends GeneratorCommand {

    public ModelMakeCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = "make:model";
        this.description = "Create a new Eloquent model class";
        this.type = "Model";
        if (this.getClass() == ModelMakeCommand.class) {
            this.__construct(env, args);
        }
    }

    public ModelMakeCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        if (ZVal.toBool(ZVal.strictEqualityCheck(super.handle(env), "===", false))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(this, "option", ModelMakeCommand.class, "force")))) {
            return null;
        }

        if (ZVal.isTrue(env.callMethod(this, "option", ModelMakeCommand.class, "all"))) {
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("input").value(),
                    "setOption",
                    ModelMakeCommand.class,
                    "factory",
                    true);
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("input").value(),
                    "setOption",
                    ModelMakeCommand.class,
                    "migration",
                    true);
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("input").value(),
                    "setOption",
                    ModelMakeCommand.class,
                    "controller",
                    true);
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("input").value(),
                    "setOption",
                    ModelMakeCommand.class,
                    "resource",
                    true);
        }

        if (ZVal.isTrue(env.callMethod(this, "option", ModelMakeCommand.class, "factory"))) {
            this.createFactory(env);
        }

        if (ZVal.isTrue(env.callMethod(this, "option", ModelMakeCommand.class, "migration"))) {
            this.createMigration(env);
        }

        if (ZVal.toBool(env.callMethod(this, "option", ModelMakeCommand.class, "controller"))
                || ZVal.toBool(
                        env.callMethod(this, "option", ModelMakeCommand.class, "resource"))) {
            this.createController(env);
        }

        return null;
    }

    @ConvertedMethod
    protected Object createFactory(RuntimeEnv env, Object... args) {
        Object factory = null;
        factory =
                Str.runtimeStaticObject.studly(
                        env,
                        class_basename
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(
                                                this, "argument", ModelMakeCommand.class, "name"))
                                .value());
        env.callMethod(
                this,
                "call",
                ModelMakeCommand.class,
                "make:factory",
                ZVal.newArray(
                        new ZPair("name", toStringR(factory, env) + "Factory"),
                        new ZPair(
                                "--model",
                                env.callMethod(this, "argument", ModelMakeCommand.class, "name"))));
        return null;
    }

    @ConvertedMethod
    protected Object createMigration(RuntimeEnv env, Object... args) {
        Object table = null;
        table =
                Str.runtimeStaticObject.plural(
                        env,
                        Str.runtimeStaticObject.snake(
                                env,
                                class_basename
                                        .f
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        this,
                                                        "argument",
                                                        ModelMakeCommand.class,
                                                        "name"))
                                        .value()));
        env.callMethod(
                this,
                "call",
                ModelMakeCommand.class,
                "make:migration",
                ZVal.newArray(
                        new ZPair("name", "create_" + toStringR(table, env) + "_table"),
                        new ZPair("--create", table)));
        return null;
    }

    @ConvertedMethod
    protected Object createController(RuntimeEnv env, Object... args) {
        Object modelName = null;
        Object controller = null;
        controller =
                Str.runtimeStaticObject.studly(
                        env,
                        class_basename
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(
                                                this, "argument", ModelMakeCommand.class, "name"))
                                .value());
        modelName =
                env.callMethod(
                        this,
                        "qualifyClass",
                        ModelMakeCommand.class,
                        env.callMethod(this, "getNameInput", ModelMakeCommand.class));
        env.callMethod(
                this,
                "call",
                ModelMakeCommand.class,
                "make:controller",
                ZVal.newArray(
                        new ZPair("name", toStringR(controller, env) + "Controller"),
                        new ZPair(
                                "--model",
                                ZVal.isTrue(
                                                env.callMethod(
                                                        this,
                                                        "option",
                                                        ModelMakeCommand.class,
                                                        "resource"))
                                        ? modelName
                                        : ZVal.getNull())));
        return null;
    }

    @ConvertedMethod
    protected Object getStub(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(env.callMethod(this, "option", ModelMakeCommand.class, "pivot"))) {
            return ZVal.assign(
                    toStringR(
                                    env.addRootFilesystemPrefix(
                                            "/vendor/laravel/framework/src/Illuminate/Foundation/Console"),
                                    env)
                            + "/stubs/pivot.model.stub");
        }

        return ZVal.assign(
                toStringR(
                                env.addRootFilesystemPrefix(
                                        "/vendor/laravel/framework/src/Illuminate/Foundation/Console"),
                                env)
                        + "/stubs/model.stub");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rootNamespace")
    protected Object getDefaultNamespace(RuntimeEnv env, Object... args) {
        Object rootNamespace = assignParameter(args, 0, false);
        return ZVal.assign(rootNamespace);
    }

    @ConvertedMethod
    protected Object getOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.newArray(
                                        new ZPair(0, "all"),
                                        new ZPair(1, "a"),
                                        new ZPair(2, InputOption.CONST_VALUE_NONE),
                                        new ZPair(
                                                3,
                                                "Generate a migration, factory, and resource controller for the model"))),
                        new ZPair(
                                1,
                                ZVal.newArray(
                                        new ZPair(0, "controller"),
                                        new ZPair(1, "c"),
                                        new ZPair(2, InputOption.CONST_VALUE_NONE),
                                        new ZPair(3, "Create a new controller for the model"))),
                        new ZPair(
                                2,
                                ZVal.newArray(
                                        new ZPair(0, "factory"),
                                        new ZPair(1, "f"),
                                        new ZPair(2, InputOption.CONST_VALUE_NONE),
                                        new ZPair(3, "Create a new factory for the model"))),
                        new ZPair(
                                3,
                                ZVal.newArray(
                                        new ZPair(0, "force"),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, InputOption.CONST_VALUE_NONE),
                                        new ZPair(
                                                3,
                                                "Create the class even if the model already exists."))),
                        new ZPair(
                                4,
                                ZVal.newArray(
                                        new ZPair(0, "migration"),
                                        new ZPair(1, "m"),
                                        new ZPair(2, InputOption.CONST_VALUE_NONE),
                                        new ZPair(
                                                3, "Create a new migration file for the model."))),
                        new ZPair(
                                5,
                                ZVal.newArray(
                                        new ZPair(0, "pivot"),
                                        new ZPair(1, "p"),
                                        new ZPair(2, InputOption.CONST_VALUE_NONE),
                                        new ZPair(
                                                3,
                                                "Indicates if the generated model should be a custom intermediate table model."))),
                        new ZPair(
                                6,
                                ZVal.newArray(
                                        new ZPair(0, "resource"),
                                        new ZPair(1, "r"),
                                        new ZPair(2, InputOption.CONST_VALUE_NONE),
                                        new ZPair(
                                                3,
                                                "Indicates if the generated controller should be a resource controller.")))));
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Console\\ModelMakeCommand";

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
                    .setName("Illuminate\\Foundation\\Console\\ModelMakeCommand")
                    .setLookup(
                            ModelMakeCommand.class,
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
                            "vendor/laravel/framework/src/Illuminate/Foundation/Console/ModelMakeCommand.php")
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
