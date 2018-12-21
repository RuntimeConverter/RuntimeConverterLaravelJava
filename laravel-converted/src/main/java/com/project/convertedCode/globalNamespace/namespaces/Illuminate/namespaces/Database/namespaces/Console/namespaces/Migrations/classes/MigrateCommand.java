package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Console.namespaces.Migrations.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Console.namespaces.Migrations.classes.BaseCommand;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Console/Migrations/MigrateCommand.php

*/

public class MigrateCommand extends BaseCommand {

    public Object migrator = null;

    public MigrateCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.signature =
                "migrate {--database= : The database connection to use.}\n                {--force : Force the operation to run when in production.}\n                {--path= : The path to the migrations files to be executed.}\n                {--realpath : Indicate any provided migration file paths are pre-resolved absolute paths.}\n                {--pretend : Dump the SQL queries that would be run.}\n                {--seed : Indicates if the seed task should be re-run.}\n                {--step : Force the migrations to be run so they can be rolled back individually.}";
        this.description = "Run the database migrations";
        if (this.getClass() == MigrateCommand.class) {
            this.__construct(env, args);
        }
    }

    public MigrateCommand(NoConstructor n) {
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
        Object note = null;
        if (!ZVal.isTrue(this.confirmToProceed(env))) {
            return null;
        }

        this.prepareDatabase(env);
        env.callMethod(
                this.migrator,
                "run",
                MigrateCommand.class,
                env.callMethod(this, "getMigrationPaths", MigrateCommand.class),
                ZVal.newArray(
                        new ZPair(
                                "pretend",
                                env.callMethod(this, "option", MigrateCommand.class, "pretend")),
                        new ZPair(
                                "step",
                                env.callMethod(this, "option", MigrateCommand.class, "step"))));
        for (ZPair zpairResult254 :
                ZVal.getIterable(
                        env.callMethod(this.migrator, "getNotes", MigrateCommand.class),
                        env,
                        true)) {
            note = ZVal.assign(zpairResult254.getValue());
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("output").value(),
                    "writeln",
                    MigrateCommand.class,
                    note);
        }

        if (ZVal.isTrue(env.callMethod(this, "option", MigrateCommand.class, "seed"))) {
            env.callMethod(
                    this,
                    "call",
                    MigrateCommand.class,
                    "db:seed",
                    ZVal.newArray(new ZPair("--force", true)));
        }

        return null;
    }

    @ConvertedMethod
    protected Object prepareDatabase(RuntimeEnv env, Object... args) {
        env.callMethod(
                this.migrator,
                "setConnection",
                MigrateCommand.class,
                env.callMethod(this, "option", MigrateCommand.class, "database"));
        if (!ZVal.isTrue(env.callMethod(this.migrator, "repositoryExists", MigrateCommand.class))) {
            env.callMethod(
                    this,
                    "call",
                    MigrateCommand.class,
                    "migrate:install",
                    ZVal.newArray(
                            new ZPair(
                                    "--database",
                                    env.callMethod(
                                            this, "option", MigrateCommand.class, "database"))));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "warning")
    @ConvertedParameter(
        index = 1,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object confirmToProceed(RuntimeEnv env, Object... args) {
        Object warning = assignParameter(args, 0, true);
        if (null == warning) {
            warning = "Application In Production!";
        }
        Object callback = assignParameter(args, 1, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object shouldConfirm = null;
        Object confirmed = null;
        callback =
                ZVal.assign(
                        function_is_null.f.env(env).call(callback).getBool()
                                ? this.getDefaultConfirmCallback(env)
                                : callback);
        shouldConfirm =
                ZVal.assign(
                        ZVal.isTrue(ZVal.checkInstanceType(callback, Closure.class, "Closure"))
                                ? function_call_user_func
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call(callback)
                                        .value()
                                : callback);
        if (ZVal.isTrue(shouldConfirm)) {
            if (ZVal.isTrue(env.callMethod(this, "option", MigrateCommand.class, "force"))) {
                return ZVal.assign(true);
            }

            env.callMethod(this, "alert", MigrateCommand.class, warning);
            confirmed =
                    env.callMethod(
                            this,
                            "confirm",
                            MigrateCommand.class,
                            "Do you really wish to run this command?");
            if (!ZVal.isTrue(confirmed)) {
                env.callMethod(this, "comment", MigrateCommand.class, "Command Cancelled!");
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    protected Object getDefaultConfirmCallback(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Console")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Console/ConfirmableTrait.php");
        return ZVal.assign(
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Console", this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        return ZVal.assign(
                                ZVal.equalityCheck(
                                        env.callMethod(
                                                env.callMethod(
                                                        _closureThisVar,
                                                        "getLaravel",
                                                        MigrateCommand.class),
                                                "environment",
                                                MigrateCommand.class),
                                        "production"));
                    }
                });
    }

    public static final Object CONST_class =
            "Illuminate\\Database\\Console\\Migrations\\MigrateCommand";

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
                    .setName("Illuminate\\Database\\Console\\Migrations\\MigrateCommand")
                    .setLookup(
                            MigrateCommand.class,
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
                            "output",
                            "processTitle",
                            "signature",
                            "signature",
                            "synopsis",
                            "usages",
                            "verbosity",
                            "verbosityMap")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Console/Migrations/MigrateCommand.php")
                    .addTrait("Illuminate\\Console\\ConfirmableTrait")
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
