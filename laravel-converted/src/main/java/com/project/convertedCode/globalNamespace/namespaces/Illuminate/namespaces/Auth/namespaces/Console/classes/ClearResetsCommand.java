package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Console.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Auth/Console/ClearResetsCommand.php

*/

public class ClearResetsCommand extends Command {

    public ClearResetsCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.signature = "auth:clear-resets {name? : The name of the password broker}";
        this.description = "Flush expired password reset tokens";
        if (this.getClass() == ClearResetsCommand.class) {
            this.__construct(env, args);
        }
    }

    public ClearResetsCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                new ReferenceClassProperty(this, "laravel", env)
                                        .arrayGet(env, "auth.password"),
                                "broker",
                                ClearResetsCommand.class,
                                env.callMethod(this, "argument", ClearResetsCommand.class, "name")),
                        "getRepository",
                        ClearResetsCommand.class),
                "deleteExpired",
                ClearResetsCommand.class);
        env.callMethod(this, "info", ClearResetsCommand.class, "Expired reset tokens cleared!");
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Auth\\Console\\ClearResetsCommand";

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
                    .setName("Illuminate\\Auth\\Console\\ClearResetsCommand")
                    .setLookup(
                            ClearResetsCommand.class,
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
                            "vendor/laravel/framework/src/Illuminate/Auth/Console/ClearResetsCommand.php")
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
