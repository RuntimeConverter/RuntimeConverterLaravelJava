package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.namespaces.Console.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.GeneratorCommand;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.functions.class_basename;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Routing/Console/ControllerMakeCommand.php

*/

public class ControllerMakeCommand extends GeneratorCommand {

    public ControllerMakeCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = "make:controller";
        this.description = "Create a new controller class";
        this.type = "Controller";
        if (this.getClass() == ControllerMakeCommand.class) {
            this.__construct(env, args);
        }
    }

    public ControllerMakeCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    protected Object getStub(RuntimeEnv env, Object... args) {
        Object stub = null;
        Object ternaryExpressionTemp = null;
        stub = ZVal.getNull();
        if (ZVal.isTrue(env.callMethod(this, "option", ControllerMakeCommand.class, "parent"))) {
            stub = "/stubs/controller.nested.stub";

        } else if (ZVal.isTrue(
                env.callMethod(this, "option", ControllerMakeCommand.class, "model"))) {
            stub = "/stubs/controller.model.stub";

        } else if (ZVal.isTrue(
                env.callMethod(this, "option", ControllerMakeCommand.class, "resource"))) {
            stub = "/stubs/controller.stub";
        }

        if (ZVal.toBool(env.callMethod(this, "option", ControllerMakeCommand.class, "api"))
                && ZVal.toBool(function_is_null.f.env(env).call(stub).value())) {
            stub = "/stubs/controller.api.stub";

        } else if (ZVal.toBool(env.callMethod(this, "option", ControllerMakeCommand.class, "api"))
                && ZVal.toBool(!function_is_null.f.env(env).call(stub).getBool())) {
            stub = function_str_replace.f.env(env).call(".stub", ".api.stub", stub).value();
        }

        stub =
                ZVal.assign(
                        ZVal.isDefined(ternaryExpressionTemp = stub)
                                ? ternaryExpressionTemp
                                : "/stubs/controller.plain.stub");
        return ZVal.assign(
                toStringR(
                                env.addRootFilesystemPrefix(
                                        "/vendor/laravel/framework/src/Illuminate/Routing/Console"),
                                env)
                        + toStringR(stub, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rootNamespace")
    protected Object getDefaultNamespace(RuntimeEnv env, Object... args) {
        Object rootNamespace = assignParameter(args, 0, false);
        return ZVal.assign(toStringR(rootNamespace, env) + "\\Http\\Controllers");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object buildClass(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object controllerNamespace = null;
        ReferenceContainer replace = new BasicReferenceContainer(null);
        controllerNamespace =
                env.callMethod(this, "getNamespace", ControllerMakeCommand.class, name);
        replace.setObject(ZVal.newArray());
        if (ZVal.isTrue(env.callMethod(this, "option", ControllerMakeCommand.class, "parent"))) {
            replace.setObject(this.buildParentReplacements(env));
        }

        if (ZVal.isTrue(env.callMethod(this, "option", ControllerMakeCommand.class, "model"))) {
            replace.setObject(this.buildModelReplacements(env, replace.getObject()));
        }

        replace.arrayAccess(env, "use " + toStringR(controllerNamespace, env) + "\\Controller;\n")
                .set("");
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                function_array_keys.f.env(env).call(replace.getObject()).value(),
                                function_array_values.f.env(env).call(replace.getObject()).value(),
                                super.buildClass(env, name))
                        .value());
    }

    @ConvertedMethod
    protected Object buildParentReplacements(RuntimeEnv env, Object... args) {
        Object parentModelClass = null;
        parentModelClass =
                this.parseModel(
                        env, env.callMethod(this, "option", ControllerMakeCommand.class, "parent"));
        if (!function_class_exists.f.env(env).call(parentModelClass).getBool()) {
            if (ZVal.isTrue(
                    env.callMethod(
                            this,
                            "confirm",
                            ControllerMakeCommand.class,
                            "A "
                                    + toStringR(parentModelClass, env)
                                    + " model does not exist. Do you want to generate it?",
                            true))) {
                env.callMethod(
                        this,
                        "call",
                        ControllerMakeCommand.class,
                        "make:model",
                        ZVal.newArray(new ZPair("name", parentModelClass)));
            }
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("ParentDummyFullModelClass", parentModelClass),
                        new ZPair(
                                "ParentDummyModelClass",
                                class_basename.f.env(env).call(parentModelClass).value()),
                        new ZPair(
                                "ParentDummyModelVariable",
                                NamespaceGlobal.lcfirst
                                        .env(env)
                                        .call(
                                                class_basename
                                                        .f
                                                        .env(env)
                                                        .call(parentModelClass)
                                                        .value())
                                        .value())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "replace", typeHint = "array")
    protected Object buildModelReplacements(RuntimeEnv env, Object... args) {
        Object replace = assignParameter(args, 0, false);
        Object modelClass = null;
        modelClass =
                this.parseModel(
                        env, env.callMethod(this, "option", ControllerMakeCommand.class, "model"));
        if (!function_class_exists.f.env(env).call(modelClass).getBool()) {
            if (ZVal.isTrue(
                    env.callMethod(
                            this,
                            "confirm",
                            ControllerMakeCommand.class,
                            "A "
                                    + toStringR(modelClass, env)
                                    + " model does not exist. Do you want to generate it?",
                            true))) {
                env.callMethod(
                        this,
                        "call",
                        ControllerMakeCommand.class,
                        "make:model",
                        ZVal.newArray(new ZPair("name", modelClass)));
            }
        }

        return ZVal.assign(
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                replace,
                                ZVal.newArray(
                                        new ZPair("DummyFullModelClass", modelClass),
                                        new ZPair(
                                                "DummyModelClass",
                                                class_basename.f.env(env).call(modelClass).value()),
                                        new ZPair(
                                                "DummyModelVariable",
                                                NamespaceGlobal.lcfirst
                                                        .env(env)
                                                        .call(
                                                                class_basename
                                                                        .f
                                                                        .env(env)
                                                                        .call(modelClass)
                                                                        .value())
                                                        .value())))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "model")
    protected Object parseModel(RuntimeEnv env, Object... args) {
        Object model = assignParameter(args, 0, false);
        Object rootNamespace = null;
        if (function_preg_match.f.env(env).call("([^A-Za-z0-9_/\\\\])", model).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(env, "Model name contains invalid characters."));
        }

        model =
                function_trim
                        .f
                        .env(env)
                        .call(function_str_replace.f.env(env).call("/", "\\", model).value(), "\\")
                        .value();
        if (!ZVal.isTrue(
                Str.runtimeStaticObject.startsWith(
                        env,
                        model,
                        rootNamespace =
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("laravel")
                                                .value(),
                                        "getNamespace",
                                        ControllerMakeCommand.class)))) {
            model = toStringR(rootNamespace, env) + toStringR(model, env);
        }

        return ZVal.assign(model);
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
                                        new ZPair(
                                                3,
                                                "Generate a resource controller for the given model."))),
                        new ZPair(
                                1,
                                ZVal.newArray(
                                        new ZPair(0, "resource"),
                                        new ZPair(1, "r"),
                                        new ZPair(2, InputOption.CONST_VALUE_NONE),
                                        new ZPair(3, "Generate a resource controller class."))),
                        new ZPair(
                                2,
                                ZVal.newArray(
                                        new ZPair(0, "parent"),
                                        new ZPair(1, "p"),
                                        new ZPair(2, InputOption.CONST_VALUE_OPTIONAL),
                                        new ZPair(
                                                3,
                                                "Generate a nested resource controller class."))),
                        new ZPair(
                                3,
                                ZVal.newArray(
                                        new ZPair(0, "api"),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, InputOption.CONST_VALUE_NONE),
                                        new ZPair(
                                                3,
                                                "Exclude the create and edit methods from the controller.")))));
    }

    public static final Object CONST_class = "Illuminate\\Routing\\Console\\ControllerMakeCommand";

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
                    .setName("Illuminate\\Routing\\Console\\ControllerMakeCommand")
                    .setLookup(
                            ControllerMakeCommand.class,
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
                            "vendor/laravel/framework/src/Illuminate/Routing/Console/ControllerMakeCommand.php")
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
