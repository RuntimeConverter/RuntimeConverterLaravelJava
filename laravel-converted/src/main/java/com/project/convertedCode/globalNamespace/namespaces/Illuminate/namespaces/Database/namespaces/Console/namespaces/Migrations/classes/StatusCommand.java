package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Console.namespaces.Migrations.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Console.namespaces.Migrations.classes.BaseCommand;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Collection;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Console/Migrations/StatusCommand.php

*/

public class StatusCommand extends BaseCommand {

    public Object migrator = null;

    public StatusCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = "migrate:status";
        this.description = "Show the status of each migration";
        if (this.getClass() == StatusCommand.class) {
            this.__construct(env, args);
        }
    }

    public StatusCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "migrator",
        typeHint = "Illuminate\\Database\\Migrations\\Migrator"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object migrator = assignParameter(args, 0, false);
        super.__construct(env);
        this.migrator = migrator;
        return null;
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        Object batches = null;
        Object migrations = null;
        Object ran = null;
        env.callMethod(
                this.migrator,
                "setConnection",
                StatusCommand.class,
                env.callMethod(this, "option", StatusCommand.class, "database"));
        if (!ZVal.isTrue(env.callMethod(this.migrator, "repositoryExists", StatusCommand.class))) {
            return ZVal.assign(
                    env.callMethod(this, "error", StatusCommand.class, "No migrations found."));
        }

        ran =
                env.callMethod(
                        env.callMethod(this.migrator, "getRepository", StatusCommand.class),
                        "getRan",
                        StatusCommand.class);
        batches =
                env.callMethod(
                        env.callMethod(this.migrator, "getRepository", StatusCommand.class),
                        "getMigrationBatches",
                        StatusCommand.class);
        if (ZVal.isGreaterThan(
                function_count
                        .f
                        .env(env)
                        .call(migrations = this.getStatusFor(env, ran, batches))
                        .value(),
                '>',
                0)) {
            env.callMethod(
                    this,
                    "table",
                    StatusCommand.class,
                    ZVal.arrayFromList("Ran?", "Migration", "Batch"),
                    migrations);

        } else {
            env.callMethod(this, "error", StatusCommand.class, "No migrations found");
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ran", typeHint = "array")
    @ConvertedParameter(index = 1, name = "batches", typeHint = "array")
    protected Object getStatusFor(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Database/Console/Migrations")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Console/Migrations/StatusCommand.php");
        Object ran = assignParameter(args, 0, false);
        Object batches = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        Collection.runtimeStaticObject.make(env, this.getAllMigrationFiles(env)),
                        "map",
                        StatusCommand.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Database\\Console\\Migrations",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "migration")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Object migration = assignParameter(args, 0, false);
                                ReferenceContainer batches = new BasicReferenceContainer(null);
                                Object migrationName = null;
                                Object ran = null;
                                batches = this.contextReferences.getReferenceContainer("batches");
                                ran = this.contextReferences.getCapturedValue("ran");
                                migrationName =
                                        env.callMethod(
                                                StatusCommand.this.migrator,
                                                "getMigrationName",
                                                StatusCommand.class,
                                                migration);
                                return ZVal.assign(
                                        function_in_array
                                                        .f
                                                        .env(env)
                                                        .call(migrationName, ran)
                                                        .getBool()
                                                ? ZVal.newArray(
                                                        new ZPair(0, "<info>Y</info>"),
                                                        new ZPair(1, migrationName),
                                                        new ZPair(
                                                                2,
                                                                batches.arrayGet(
                                                                        env, migrationName)))
                                                : ZVal.newArray(
                                                        new ZPair(0, "<fg=red>N</fg=red>"),
                                                        new ZPair(1, migrationName)));
                            }
                        }.use("batches", batches).use("ran", ran)));
    }

    @ConvertedMethod
    protected Object getAllMigrationFiles(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this.migrator,
                        "getMigrationFiles",
                        StatusCommand.class,
                        env.callMethod(this, "getMigrationPaths", StatusCommand.class)));
    }

    @ConvertedMethod
    protected Object getOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.newArray(
                                        new ZPair(0, "database"),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, InputOption.CONST_VALUE_OPTIONAL),
                                        new ZPair(3, "The database connection to use."))),
                        new ZPair(
                                1,
                                ZVal.newArray(
                                        new ZPair(0, "path"),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, InputOption.CONST_VALUE_OPTIONAL),
                                        new ZPair(3, "The path to the migrations files to use."))),
                        new ZPair(
                                2,
                                ZVal.newArray(
                                        new ZPair(0, "realpath"),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, InputOption.CONST_VALUE_NONE),
                                        new ZPair(
                                                3,
                                                "Indicate any provided migration file paths are pre-resolved absolute paths.")))));
    }

    public static final Object CONST_class =
            "Illuminate\\Database\\Console\\Migrations\\StatusCommand";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends BaseCommand.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Console\\Migrations\\StatusCommand")
                    .setLookup(
                            StatusCommand.class,
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
                            "migrator",
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
                            "vendor/laravel/framework/src/Illuminate/Database/Console/Migrations/StatusCommand.php")
                    .addExtendsClass("Illuminate\\Database\\Console\\Migrations\\BaseCommand")
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
