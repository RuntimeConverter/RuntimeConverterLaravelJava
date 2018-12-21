package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Console.namespaces.Seeds.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.GeneratorCommand;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Console/Seeds/SeederMakeCommand.php

*/

public class SeederMakeCommand extends GeneratorCommand {

    public Object composer = null;

    public SeederMakeCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = "make:seeder";
        this.description = "Create a new seeder class";
        this.type = "Seeder";
        if (this.getClass() == SeederMakeCommand.class) {
            this.__construct(env, args);
        }
    }

    public SeederMakeCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "files", typeHint = "Illuminate\\Filesystem\\Filesystem")
    @ConvertedParameter(index = 1, name = "composer", typeHint = "Illuminate\\Support\\Composer")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object files = assignParameter(args, 0, false);
        Object composer = assignParameter(args, 1, false);
        super.__construct(env, files);
        this.composer = composer;
        return null;
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        super.handle(env);
        env.callMethod(this.composer, "dumpAutoloads", SeederMakeCommand.class);
        return null;
    }

    @ConvertedMethod
    protected Object getStub(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(
                                env.addRootFilesystemPrefix(
                                        "/vendor/laravel/framework/src/Illuminate/Database/Console/Seeds"),
                                env)
                        + "/stubs/seeder.stub");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object getPath(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("laravel")
                                                .value(),
                                        "databasePath",
                                        SeederMakeCommand.class),
                                env)
                        + "/seeds/"
                        + toStringR(name, env)
                        + ".php");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object qualifyClass(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(name);
    }

    public static final Object CONST_class =
            "Illuminate\\Database\\Console\\Seeds\\SeederMakeCommand";

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
                    .setName("Illuminate\\Database\\Console\\Seeds\\SeederMakeCommand")
                    .setLookup(
                            SeederMakeCommand.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "aliases",
                            "application",
                            "applicationDefinitionMerged",
                            "applicationDefinitionMergedWithArgs",
                            "code",
                            "composer",
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
                            "vendor/laravel/framework/src/Illuminate/Database/Console/Seeds/SeederMakeCommand.php")
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
