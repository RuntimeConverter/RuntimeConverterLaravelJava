package com.project.convertedCode.globalNamespace.namespaces.Laravel.namespaces.Tinker.namespaces.Console.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.Configuration;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputArgument;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.Shell;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Laravel.namespaces.Tinker.classes.ClassAliasAutoloader;
import com.project.convertedCode.globalNamespace.functions.config;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/tinker/src/Console/TinkerCommand.php

*/

public class TinkerCommand extends Command {

    public Object commandWhitelist =
            ZVal.arrayFromList(
                    "clear-compiled", "down", "env", "inspire", "migrate", "optimize", "up");

    public TinkerCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = "tinker";
        this.description = "Interact with your application";
        if (this.getClass() == TinkerCommand.class) {
            this.__construct(env, args);
        }
    }

    public TinkerCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        Object path = null;
        Object shell = null;
        Object loader = null;
        Object config = null;
        env.callMethod(
                env.callMethod(this, "getApplication", TinkerCommand.class),
                "setCatchExceptions",
                TinkerCommand.class,
                false);
        config = new Configuration(env, ZVal.newArray(new ZPair("updateCheck", "never")));
        env.callMethod(
                env.callMethod(config, "getPresenter", TinkerCommand.class),
                "addCasters",
                TinkerCommand.class,
                this.getCasters(env));
        shell = new Shell(env, config);
        env.callMethod(shell, "addCommands", TinkerCommand.class, this.getCommands(env));
        env.callMethod(
                shell,
                "setIncludes",
                TinkerCommand.class,
                env.callMethod(this, "argument", TinkerCommand.class, "include"));
        path =
                env.callMethod(
                        env.callMethod(this, "getLaravel", TinkerCommand.class),
                        "basePath",
                        TinkerCommand.class,
                        "vendor/composer/autoload_classmap.php");
        loader = ClassAliasAutoloader.runtimeStaticObject.register(env, shell, path);
        try {
            env.callMethod(shell, "run", TinkerCommand.class);
        } catch (ConvertedException convertedException71) {

            throw convertedException71;
        } finally {
            env.callMethod(loader, "unregister", TinkerCommand.class);
        }

        return null;
    }

    @ConvertedMethod
    protected Object getCommands(RuntimeEnv env, Object... args) {
        Object name = null;
        ReferenceContainer commands = new BasicReferenceContainer(null);
        Object command = null;
        commands.setObject(ZVal.newArray());
        for (ZPair zpairResult652 :
                ZVal.getIterable(
                        env.callMethod(
                                env.callMethod(this, "getApplication", TinkerCommand.class),
                                "all",
                                TinkerCommand.class),
                        env,
                        false)) {
            name = ZVal.assign(zpairResult652.getKey());
            command = ZVal.assign(zpairResult652.getValue());
            if (function_in_array.f.env(env).call(name, this.commandWhitelist).getBool()) {
                commands.arrayAppend(env).set(command);
            }
        }

        for (ZPair zpairResult653 :
                ZVal.getIterable(
                        config.f.env(env).call("tinker.commands", ZVal.newArray()).value(),
                        env,
                        true)) {
            command = ZVal.assign(zpairResult653.getValue());
            commands.arrayAppend(env)
                    .set(
                            env.callMethod(
                                    env.callMethod(this, "getApplication", TinkerCommand.class),
                                    "resolve",
                                    TinkerCommand.class,
                                    command));
        }

        return ZVal.assign(commands.getObject());
    }

    @ConvertedMethod
    protected Object getCasters(RuntimeEnv env, Object... args) {
        ReferenceContainer casters = new BasicReferenceContainer(null);
        casters.setObject(
                ZVal.newArray(
                        new ZPair(
                                "Illuminate\\Support\\Collection",
                                "Laravel\\Tinker\\TinkerCaster::castCollection")));
        if (function_class_exists
                .f
                .env(env)
                .call("Illuminate\\Database\\Eloquent\\Model")
                .getBool()) {
            casters.arrayAccess(env, "Illuminate\\Database\\Eloquent\\Model")
                    .set("Laravel\\Tinker\\TinkerCaster::castModel");
        }

        if (function_class_exists
                .f
                .env(env)
                .call("Illuminate\\Foundation\\Application")
                .getBool()) {
            casters.arrayAccess(env, "Illuminate\\Foundation\\Application")
                    .set("Laravel\\Tinker\\TinkerCaster::castApplication");
        }

        return ZVal.assign(casters.getObject());
    }

    @ConvertedMethod
    protected Object getArguments(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.newArray(
                                        new ZPair(0, "include"),
                                        new ZPair(1, InputArgument.CONST_IS_ARRAY),
                                        new ZPair(2, "Include file(s) before starting tinker")))));
    }

    public static final Object CONST_class = "Laravel\\Tinker\\Console\\TinkerCommand";

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
                    .setName("Laravel\\Tinker\\Console\\TinkerCommand")
                    .setLookup(
                            TinkerCommand.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "aliases",
                            "application",
                            "applicationDefinitionMerged",
                            "applicationDefinitionMergedWithArgs",
                            "code",
                            "commandWhitelist",
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
                            "name",
                            "output",
                            "processTitle",
                            "signature",
                            "synopsis",
                            "usages",
                            "verbosity",
                            "verbosityMap")
                    .setFilename("vendor/laravel/tinker/src/Console/TinkerCommand.php")
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
