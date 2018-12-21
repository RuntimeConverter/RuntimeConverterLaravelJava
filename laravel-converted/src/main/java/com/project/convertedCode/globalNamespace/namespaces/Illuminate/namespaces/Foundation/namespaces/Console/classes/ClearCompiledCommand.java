package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Console/ClearCompiledCommand.php

*/

public class ClearCompiledCommand extends Command {

    public ClearCompiledCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = "clear-compiled";
        this.description = "Remove the compiled class file";
        if (this.getClass() == ClearCompiledCommand.class) {
            this.__construct(env, args);
        }
    }

    public ClearCompiledCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        Object packagesPath = null;
        Object servicesPath = null;
        if (function_file_exists
                .f
                .env(env)
                .call(
                        servicesPath =
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("laravel")
                                                .value(),
                                        "getCachedServicesPath",
                                        ClearCompiledCommand.class))
                .getBool()) {
            NamespaceGlobal.unlink.env(env).call(servicesPath).value();
        }

        if (function_file_exists
                .f
                .env(env)
                .call(
                        packagesPath =
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("laravel")
                                                .value(),
                                        "getCachedPackagesPath",
                                        ClearCompiledCommand.class))
                .getBool()) {
            NamespaceGlobal.unlink.env(env).call(packagesPath).value();
        }

        env.callMethod(
                this,
                "info",
                ClearCompiledCommand.class,
                "Compiled services and packages files removed!");
        return null;
    }

    public static final Object CONST_class =
            "Illuminate\\Foundation\\Console\\ClearCompiledCommand";

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
                    .setName("Illuminate\\Foundation\\Console\\ClearCompiledCommand")
                    .setLookup(
                            ClearCompiledCommand.class,
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
                            "name",
                            "output",
                            "processTitle",
                            "signature",
                            "synopsis",
                            "usages",
                            "verbosity",
                            "verbosityMap")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Console/ClearCompiledCommand.php")
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
