package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Console.namespaces.Migrations.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Console.namespaces.Migrations.classes.BaseCommand;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Console/Migrations/MigrateMakeCommand.php

*/

public class MigrateMakeCommand extends BaseCommand {

    public Object creator = null;

    public Object composer = null;

    public MigrateMakeCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.signature =
                "make:migration {name : The name of the migration.}\n        {--create= : The table to be created.}\n        {--table= : The table to migrate.}\n        {--path= : The location where the migration file should be created.}\n        {--realpath : Indicate any provided migration file paths are pre-resolved absolute paths.}";
        this.description = "Create a new migration file";
        if (this.getClass() == MigrateMakeCommand.class) {
            this.__construct(env, args);
        }
    }

    public MigrateMakeCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "creator",
        typeHint = "Illuminate\\Database\\Migrations\\MigrationCreator"
    )
    @ConvertedParameter(index = 1, name = "composer", typeHint = "Illuminate\\Support\\Composer")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object creator = assignParameter(args, 0, false);
        Object composer = assignParameter(args, 1, false);
        super.__construct(env);
        this.creator = creator;
        this.composer = composer;
        return null;
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        Object name = null;
        Object create = null;
        Object ternaryExpressionTemp = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        Object table = null;
        name =
                Str.runtimeStaticObject.snake(
                        env,
                        function_trim
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("input")
                                                        .value(),
                                                "getArgument",
                                                MigrateMakeCommand.class,
                                                "name"))
                                .value());
        table =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("input").value(),
                        "getOption",
                        MigrateMakeCommand.class,
                        "table");
        create =
                ZVal.assign(
                        ZVal.isTrue(
                                        ternaryExpressionTemp =
                                                env.callMethod(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("input")
                                                                .value(),
                                                        "getOption",
                                                        MigrateMakeCommand.class,
                                                        "create"))
                                ? ternaryExpressionTemp
                                : false);
        if (ZVal.toBool(!ZVal.isTrue(table))
                && ZVal.toBool(function_is_string.f.env(env).call(create).value())) {
            table = ZVal.assign(create);
            create = true;
        }

        if (!ZVal.isTrue(table)) {
            if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call("/^create_(\\w+)_table$/", name, matches.getObject())
                    .getBool()) {
                table = ZVal.assign(matches.arrayGet(env, 1));
                create = true;
            }
        }

        this.writeMigration(env, name, table, create);
        env.callMethod(this.composer, "dumpAutoloads", MigrateMakeCommand.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "table")
    @ConvertedParameter(index = 2, name = "create")
    protected Object writeMigration(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object table = assignParameter(args, 1, false);
        Object create = assignParameter(args, 2, false);
        Object file = null;
        file =
                NamespaceGlobal.pathinfo
                        .env(env)
                        .call(
                                env.callMethod(
                                        this.creator,
                                        "create",
                                        MigrateMakeCommand.class,
                                        name,
                                        this.getMigrationPath(env),
                                        table,
                                        create),
                                8)
                        .value();
        env.callMethod(
                this,
                "line",
                MigrateMakeCommand.class,
                "<info>Created Migration:</info> " + toStringR(file, env));
        return null;
    }

    @ConvertedMethod
    protected Object getMigrationPath(RuntimeEnv env, Object... args) {
        Object targetPath = null;
        if (!function_is_null
                .f
                .env(env)
                .call(
                        targetPath =
                                env.callMethod(
                                        toObjectR(this).accessProp(this, env).name("input").value(),
                                        "getOption",
                                        MigrateMakeCommand.class,
                                        "path"))
                .getBool()) {
            return ZVal.assign(
                    !ZVal.isTrue(this.usingRealPath(env))
                            ? toStringR(
                                            env.callMethod(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("laravel")
                                                            .value(),
                                                    "basePath",
                                                    MigrateMakeCommand.class),
                                            env)
                                    + "/"
                                    + toStringR(targetPath, env)
                            : targetPath);
        }

        return ZVal.assign(super.getMigrationPath(env));
    }

    @ConvertedMethod
    protected Object usingRealPath(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(
                                env.callMethod(
                                        toObjectR(this).accessProp(this, env).name("input").value(),
                                        "hasOption",
                                        MigrateMakeCommand.class,
                                        "realpath"))
                        && ZVal.toBool(
                                env.callMethod(
                                        this, "option", MigrateMakeCommand.class, "realpath")));
    }

    public static final Object CONST_class =
            "Illuminate\\Database\\Console\\Migrations\\MigrateMakeCommand";

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
                    .setName("Illuminate\\Database\\Console\\Migrations\\MigrateMakeCommand")
                    .setLookup(
                            MigrateMakeCommand.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "aliases",
                            "application",
                            "applicationDefinitionMerged",
                            "applicationDefinitionMergedWithArgs",
                            "code",
                            "composer",
                            "creator",
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
                            "vendor/laravel/framework/src/Illuminate/Database/Console/Migrations/MigrateMakeCommand.php")
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
