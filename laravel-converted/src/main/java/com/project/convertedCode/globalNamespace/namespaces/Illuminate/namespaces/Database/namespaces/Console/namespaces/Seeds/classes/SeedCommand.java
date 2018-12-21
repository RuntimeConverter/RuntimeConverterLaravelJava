package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Console.namespaces.Seeds.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.Model;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Console/Seeds/SeedCommand.php

*/

public class SeedCommand extends Command {

    public Object resolver = null;

    public SeedCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = "db:seed";
        this.description = "Seed the database with records";
        if (this.getClass() == SeedCommand.class) {
            this.__construct(env, args);
        }
    }

    public SeedCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "resolver",
        typeHint = "Illuminate\\Database\\ConnectionResolverInterface"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object resolver = assignParameter(args, 0, false);
        super.__construct(env);
        this.resolver = resolver;
        return null;
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Console/Seeds")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Console/Seeds/SeedCommand.php");
        if (!ZVal.isTrue(this.confirmToProceed(env))) {
            return null;
        }

        env.callMethod(
                this.resolver, "setDefaultConnection", SeedCommand.class, this.getDatabase(env));
        Model.runtimeStaticObject.unguarded(
                env,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Database\\Console\\Seeds",
                        this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        env.callMethod(
                                SeedCommand.this.getSeeder(env), "__invoke", SeedCommand.class);
                        return null;
                    }
                });
        return null;
    }

    @ConvertedMethod
    protected Object getSeeder(RuntimeEnv env, Object... args) {
        Object _pClass = null;
        _pClass =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("laravel").value(),
                        "make",
                        SeedCommand.class,
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("input").value(),
                                "getOption",
                                SeedCommand.class,
                                "class"));
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                _pClass,
                                "setContainer",
                                SeedCommand.class,
                                toObjectR(this).accessProp(this, env).name("laravel").value()),
                        "setCommand",
                        SeedCommand.class,
                        this));
    }

    @ConvertedMethod
    protected Object getDatabase(RuntimeEnv env, Object... args) {
        Object database = null;
        Object ternaryExpressionTemp = null;
        database =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("input").value(),
                        "getOption",
                        SeedCommand.class,
                        "database");
        return ZVal.assign(
                ZVal.isTrue(ternaryExpressionTemp = database)
                        ? ternaryExpressionTemp
                        : new ReferenceClassProperty(this, "laravel", env)
                                .arrayGet(env, "config", "database.default"));
    }

    @ConvertedMethod
    protected Object getOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.newArray(
                                        new ZPair(0, "class"),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, InputOption.CONST_VALUE_OPTIONAL),
                                        new ZPair(3, "The class name of the root seeder"),
                                        new ZPair(4, "DatabaseSeeder"))),
                        new ZPair(
                                1,
                                ZVal.newArray(
                                        new ZPair(0, "database"),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, InputOption.CONST_VALUE_OPTIONAL),
                                        new ZPair(3, "The database connection to seed"))),
                        new ZPair(
                                2,
                                ZVal.newArray(
                                        new ZPair(0, "force"),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, InputOption.CONST_VALUE_NONE),
                                        new ZPair(
                                                3,
                                                "Force the operation to run when in production.")))));
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
            if (ZVal.isTrue(env.callMethod(this, "option", SeedCommand.class, "force"))) {
                return ZVal.assign(true);
            }

            env.callMethod(this, "alert", SeedCommand.class, warning);
            confirmed =
                    env.callMethod(
                            this,
                            "confirm",
                            SeedCommand.class,
                            "Do you really wish to run this command?");
            if (!ZVal.isTrue(confirmed)) {
                env.callMethod(this, "comment", SeedCommand.class, "Command Cancelled!");
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
                                                        SeedCommand.class),
                                                "environment",
                                                SeedCommand.class),
                                        "production"));
                    }
                });
    }

    public static final Object CONST_class = "Illuminate\\Database\\Console\\Seeds\\SeedCommand";

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
                    .setName("Illuminate\\Database\\Console\\Seeds\\SeedCommand")
                    .setLookup(
                            SeedCommand.class,
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
                            "resolver",
                            "signature",
                            "synopsis",
                            "usages",
                            "verbosity",
                            "verbosityMap")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Console/Seeds/SeedCommand.php")
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
