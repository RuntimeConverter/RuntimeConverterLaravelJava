package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Console.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Queue/Console/ForgetFailedCommand.php

*/

public class ForgetFailedCommand extends Command {

    public ForgetFailedCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.signature = "queue:forget {id : The ID of the failed job.}";
        this.description = "Delete a failed queue job";
        if (this.getClass() == ForgetFailedCommand.class) {
            this.__construct(env, args);
        }
    }

    public ForgetFailedCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(
                env.callMethod(
                        new ReferenceClassProperty(this, "laravel", env)
                                .arrayGet(env, "queue.failer"),
                        "forget",
                        ForgetFailedCommand.class,
                        env.callMethod(this, "argument", ForgetFailedCommand.class, "id")))) {
            env.callMethod(
                    this, "info", ForgetFailedCommand.class, "Failed job deleted successfully!");

        } else {
            env.callMethod(
                    this,
                    "error",
                    ForgetFailedCommand.class,
                    "No failed job matches the given ID.");
        }

        return null;
    }

    public static final Object CONST_class = "Illuminate\\Queue\\Console\\ForgetFailedCommand";

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
                    .setName("Illuminate\\Queue\\Console\\ForgetFailedCommand")
                    .setLookup(
                            ForgetFailedCommand.class,
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
                            "vendor/laravel/framework/src/Illuminate/Queue/Console/ForgetFailedCommand.php")
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
