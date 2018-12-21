package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Console.namespaces.Migrations.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Console/Migrations/RefreshCommand.php

*/

public class RefreshCommand extends Command {

    public RefreshCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = "migrate:refresh";
        this.description = "Reset and re-run all migrations";
        if (this.getClass() == RefreshCommand.class) {
            this.__construct(env, args);
        }
    }

    public RefreshCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        Object path = null;
        Object database = null;
        Object force = null;
        Object step = null;
        Object ternaryExpressionTemp = null;
        if (!ZVal.isTrue(this.confirmToProceed(env))) {
            return null;
        }

        database =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("input").value(),
                        "getOption",
                        RefreshCommand.class,
                        "database");
        path =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("input").value(),
                        "getOption",
                        RefreshCommand.class,
                        "path");
        force =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("input").value(),
                        "getOption",
                        RefreshCommand.class,
                        "force");
        step =
                ZVal.assign(
                        ZVal.isTrue(
                                        ternaryExpressionTemp =
                                                env.callMethod(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("input")
                                                                .value(),
                                                        "getOption",
                                                        RefreshCommand.class,
                                                        "step"))
                                ? ternaryExpressionTemp
                                : 0);
        if (ZVal.isGreaterThan(step, '>', 0)) {
            this.runRollback(env, database, path, step, force);

        } else {
            this.runReset(env, database, path, force);
        }

        env.callMethod(
                this,
                "call",
                RefreshCommand.class,
                "migrate",
                ZVal.newArray(
                        new ZPair("--database", database),
                        new ZPair("--path", path),
                        new ZPair(
                                "--realpath",
                                env.callMethod(
                                        toObjectR(this).accessProp(this, env).name("input").value(),
                                        "getOption",
                                        RefreshCommand.class,
                                        "realpath")),
                        new ZPair("--force", force)));
        if (ZVal.isTrue(this.needsSeeding(env))) {
            this.runSeeder(env, database);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "database")
    @ConvertedParameter(index = 1, name = "path")
    @ConvertedParameter(index = 2, name = "step")
    @ConvertedParameter(index = 3, name = "force")
    protected Object runRollback(RuntimeEnv env, Object... args) {
        Object database = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, false);
        Object step = assignParameter(args, 2, false);
        Object force = assignParameter(args, 3, false);
        env.callMethod(
                this,
                "call",
                RefreshCommand.class,
                "migrate:rollback",
                ZVal.newArray(
                        new ZPair("--database", database),
                        new ZPair("--path", path),
                        new ZPair(
                                "--realpath",
                                env.callMethod(
                                        toObjectR(this).accessProp(this, env).name("input").value(),
                                        "getOption",
                                        RefreshCommand.class,
                                        "realpath")),
                        new ZPair("--step", step),
                        new ZPair("--force", force)));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "database")
    @ConvertedParameter(index = 1, name = "path")
    @ConvertedParameter(index = 2, name = "force")
    protected Object runReset(RuntimeEnv env, Object... args) {
        Object database = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, false);
        Object force = assignParameter(args, 2, false);
        env.callMethod(
                this,
                "call",
                RefreshCommand.class,
                "migrate:reset",
                ZVal.newArray(
                        new ZPair("--database", database),
                        new ZPair("--path", path),
                        new ZPair(
                                "--realpath",
                                env.callMethod(
                                        toObjectR(this).accessProp(this, env).name("input").value(),
                                        "getOption",
                                        RefreshCommand.class,
                                        "realpath")),
                        new ZPair("--force", force)));
        return null;
    }

    @ConvertedMethod
    protected Object needsSeeding(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(env.callMethod(this, "option", RefreshCommand.class, "seed"))
                        || ZVal.toBool(
                                env.callMethod(this, "option", RefreshCommand.class, "seeder")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "database")
    protected Object runSeeder(RuntimeEnv env, Object... args) {
        Object database = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        env.callMethod(
                this,
                "call",
                RefreshCommand.class,
                "db:seed",
                ZVal.newArray(
                        new ZPair("--database", database),
                        new ZPair(
                                "--class",
                                ZVal.isTrue(
                                                ternaryExpressionTemp =
                                                        env.callMethod(
                                                                this,
                                                                "option",
                                                                RefreshCommand.class,
                                                                "seeder"))
                                        ? ternaryExpressionTemp
                                        : "DatabaseSeeder"),
                        new ZPair(
                                "--force",
                                env.callMethod(this, "option", RefreshCommand.class, "force"))));
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
                                        new ZPair(0, "seed"),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, InputOption.CONST_VALUE_NONE),
                                        new ZPair(
                                                3,
                                                "Indicates if the seed task should be re-run."))),
                        new ZPair(
                                5,
                                ZVal.newArray(
                                        new ZPair(0, "seeder"),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, InputOption.CONST_VALUE_OPTIONAL),
                                        new ZPair(3, "The class name of the root seeder."))),
                        new ZPair(
                                6,
                                ZVal.newArray(
                                        new ZPair(0, "step"),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, InputOption.CONST_VALUE_OPTIONAL),
                                        new ZPair(
                                                3,
                                                "The number of migrations to be reverted & re-run.")))));
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
            if (ZVal.isTrue(env.callMethod(this, "option", RefreshCommand.class, "force"))) {
                return ZVal.assign(true);
            }

            env.callMethod(this, "alert", RefreshCommand.class, warning);
            confirmed =
                    env.callMethod(
                            this,
                            "confirm",
                            RefreshCommand.class,
                            "Do you really wish to run this command?");
            if (!ZVal.isTrue(confirmed)) {
                env.callMethod(this, "comment", RefreshCommand.class, "Command Cancelled!");
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
                                                        RefreshCommand.class),
                                                "environment",
                                                RefreshCommand.class),
                                        "production"));
                    }
                });
    }

    public static final Object CONST_class =
            "Illuminate\\Database\\Console\\Migrations\\RefreshCommand";

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
                    .setName("Illuminate\\Database\\Console\\Migrations\\RefreshCommand")
                    .setLookup(
                            RefreshCommand.class,
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
                            "vendor/laravel/framework/src/Illuminate/Database/Console/Migrations/RefreshCommand.php")
                    .addTrait("Illuminate\\Console\\ConfirmableTrait")
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
