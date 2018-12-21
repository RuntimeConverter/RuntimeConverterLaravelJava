package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.namespaces.Presets.classes.Vue;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.namespaces.Presets.classes.React;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.namespaces.Presets.classes.Bootstrap;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.namespaces.Presets.classes.None;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Console/PresetCommand.php

*/

public class PresetCommand extends Command {

    public PresetCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.signature = "preset { type : The preset type (none, bootstrap, vue, react) }";
        this.description = "Swap the front-end scaffolding for the application";
        if (this.getClass() == PresetCommand.class) {
            this.__construct(env, args);
        }
    }

    public PresetCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        if (ZVal.isTrue(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, PresetCommand.class)
                        .method("hasMacro")
                        .addReferenceArgs(
                                rLastRefArgs =
                                        new RuntimeArgsWithReferences()
                                                .add(
                                                        0,
                                                        handleReturnReference(
                                                                env.callMethod(
                                                                        this,
                                                                        "argument",
                                                                        PresetCommand.class,
                                                                        "type"))))
                        .call(rLastRefArgs.get(0))
                        .value())) {
            return ZVal.assign(
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Illuminate
                                                            .namespaces
                                                            .Foundation
                                                            .namespaces
                                                            .Console
                                                            .classes
                                                            .PresetCommand
                                                            .RequestStaticProperties
                                                            .class,
                                                    "macros")
                                            .arrayGet(
                                                    env,
                                                    env.callMethod(
                                                            this,
                                                            "argument",
                                                            PresetCommand.class,
                                                            "type")),
                                    this)
                            .value());
        }

        if (!function_in_array
                .f
                .env(env)
                .call(
                        env.callMethod(this, "argument", PresetCommand.class, "type"),
                        ZVal.arrayFromList("none", "bootstrap", "vue", "react"))
                .getBool()) {
            throw ZVal.getException(env, new InvalidArgumentException(env, "Invalid preset."));
        }

        return ZVal.assign(
                env.callMethod(
                        this,
                        toStringR(
                                env.callMethod(this, "argument", PresetCommand.class, "type"), env),
                        PresetCommand.class));
    }

    @ConvertedMethod
    protected Object none(RuntimeEnv env, Object... args) {
        None.runtimeStaticObject.install(env);
        env.callMethod(
                this, "info", PresetCommand.class, "Frontend scaffolding removed successfully.");
        return null;
    }

    @ConvertedMethod
    protected Object bootstrap(RuntimeEnv env, Object... args) {
        Bootstrap.runtimeStaticObject.install(env);
        env.callMethod(
                this, "info", PresetCommand.class, "Bootstrap scaffolding installed successfully.");
        env.callMethod(
                this,
                "comment",
                PresetCommand.class,
                "Please run \"npm install && npm run dev\" to compile your fresh scaffolding.");
        return null;
    }

    @ConvertedMethod
    protected Object vue(RuntimeEnv env, Object... args) {
        Vue.runtimeStaticObject.install(env);
        env.callMethod(
                this, "info", PresetCommand.class, "Vue scaffolding installed successfully.");
        env.callMethod(
                this,
                "comment",
                PresetCommand.class,
                "Please run \"npm install && npm run dev\" to compile your fresh scaffolding.");
        return null;
    }

    @ConvertedMethod
    protected Object react(RuntimeEnv env, Object... args) {
        React.runtimeStaticObject.install(env);
        env.callMethod(
                this, "info", PresetCommand.class, "React scaffolding installed successfully.");
        env.callMethod(
                this,
                "comment",
                PresetCommand.class,
                "Please run \"npm install && npm run dev\" to compile your fresh scaffolding.");
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Console\\PresetCommand";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Command.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Foundation\\Console\\PresetCommand")
                    .setLookup(
                            PresetCommand.class,
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
                            "help",
                            "helperSet",
                            "hidden",
                            "hidden",
                            "ignoreValidationErrors",
                            "input",
                            "laravel",
                            "name",
                            "name",
                            "output",
                            "processTitle",
                            "signature",
                            "signature",
                            "synopsis",
                            "usages",
                            "verbosity",
                            "verbosityMap")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Console/PresetCommand.php")
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
