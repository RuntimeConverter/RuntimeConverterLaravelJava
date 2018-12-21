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
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Console/Migrations/RollbackCommand.php

*/

public class RollbackCommand extends BaseCommand {

    public Object migrator = null;

    public RollbackCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = "migrate:rollback";
        this.description = "Rollback the last database migration";
        if (this.getClass() == RollbackCommand.class) {
            this.__construct(env, args);
        }
    }

    public RollbackCommand(NoConstructor n) {
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

        env.callMethod(
                this.migrator,
                "setConnection",
                RollbackCommand.class,
                env.callMethod(this, "option", RollbackCommand.class, "database"));
        env.callMethod(
                this.migrator,
                "rollback",
                RollbackCommand.class,
                env.callMethod(this, "getMigrationPaths", RollbackCommand.class),
                ZVal.newArray(
                        new ZPair(
                                "pretend",
                                env.callMethod(this, "option", RollbackCommand.class, "pretend")),
                        new ZPair(
                                "step",
                                ZVal.toLong(
                                        env.callMethod(
                                                this, "option", RollbackCommand.class, "step")))));
        for (ZPair zpairResult256 :
                ZVal.getIterable(
                        env.callMethod(this.migrator, "getNotes", RollbackCommand.class),
                        env,
                        true)) {
            note = ZVal.assign(zpairResult256.getValue());
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("output").value(),
                    "writeln",
                    RollbackCommand.class,
                    note);
        }

        return null;
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
                                        new ZPair(0, "force"),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, InputOption.CONST_VALUE_NONE),
                                        new ZPair(
                                                3,
                                                "Force the operation to run when in production."))),
                        new ZPair(
                                2,
                                ZVal.newArray(
                                        new ZPair(0, "path"),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, InputOption.CONST_VALUE_OPTIONAL),
                                        new ZPair(
                                                3,
                                                "The path to the migrations files to be executed."))),
                        new ZPair(
                                3,
                                ZVal.newArray(
                                        new ZPair(0, "realpath"),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, InputOption.CONST_VALUE_NONE),
                                        new ZPair(
                                                3,
                                                "Indicate any provided migration file paths are pre-resolved absolute paths."))),
                        new ZPair(
                                4,
                                ZVal.newArray(
                                        new ZPair(0, "pretend"),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, InputOption.CONST_VALUE_NONE),
                                        new ZPair(3, "Dump the SQL queries that would be run."))),
                        new ZPair(
                                5,
                                ZVal.newArray(
                                        new ZPair(0, "step"),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, InputOption.CONST_VALUE_OPTIONAL),
                                        new ZPair(
                                                3, "The number of migrations to be reverted.")))));
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
            if (ZVal.isTrue(env.callMethod(this, "option", RollbackCommand.class, "force"))) {
                return ZVal.assign(true);
            }

            env.callMethod(this, "alert", RollbackCommand.class, warning);
            confirmed =
                    env.callMethod(
                            this,
                            "confirm",
                            RollbackCommand.class,
                            "Do you really wish to run this command?");
            if (!ZVal.isTrue(confirmed)) {
                env.callMethod(this, "comment", RollbackCommand.class, "Command Cancelled!");
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
                                                        RollbackCommand.class),
                                                "environment",
                                                RollbackCommand.class),
                                        "production"));
                    }
                });
    }

    public static final Object CONST_class =
            "Illuminate\\Database\\Console\\Migrations\\RollbackCommand";

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
                    .setName("Illuminate\\Database\\Console\\Migrations\\RollbackCommand")
                    .setLookup(
                            RollbackCommand.class,
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
                            "vendor/laravel/framework/src/Illuminate/Database/Console/Migrations/RollbackCommand.php")
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
