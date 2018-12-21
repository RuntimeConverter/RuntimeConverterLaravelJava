package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Console.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Queue/Console/FailedTableCommand.php

*/

public class FailedTableCommand extends Command {

    public Object files = null;

    public Object composer = null;

    public FailedTableCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = "queue:failed-table";
        this.description = "Create a migration for the failed queue jobs database table";
        if (this.getClass() == FailedTableCommand.class) {
            this.__construct(env, args);
        }
    }

    public FailedTableCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "files", typeHint = "Illuminate\\Filesystem\\Filesystem")
    @ConvertedParameter(index = 1, name = "composer", typeHint = "Illuminate\\Support\\Composer")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object files = assignParameter(args, 0, false);
        Object composer = assignParameter(args, 1, false);
        super.__construct(env);
        this.files = files;
        this.composer = composer;
        return null;
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        Object table = null;
        table =
                ZVal.assign(
                        new ReferenceClassProperty(this, "laravel", env)
                                .arrayGet(env, "config", "queue.failed.table"));
        this.replaceMigration(
                env,
                this.createBaseMigration(env, table),
                table,
                Str.runtimeStaticObject.studly(env, table));
        env.callMethod(this, "info", FailedTableCommand.class, "Migration created successfully!");
        env.callMethod(this.composer, "dumpAutoloads", FailedTableCommand.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    protected Object createBaseMigration(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, true);
        if (null == table) {
            table = "failed_jobs";
        }
        return ZVal.assign(
                env.callMethod(
                        new ReferenceClassProperty(this, "laravel", env)
                                .arrayGet(env, "migration.creator"),
                        "create",
                        FailedTableCommand.class,
                        "create_" + toStringR(table, env) + "_table",
                        toStringR(
                                        env.callMethod(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("laravel")
                                                        .value(),
                                                "databasePath",
                                                FailedTableCommand.class),
                                        env)
                                + "/migrations"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "table")
    @ConvertedParameter(index = 2, name = "tableClassName")
    protected Object replaceMigration(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object table = assignParameter(args, 1, false);
        Object tableClassName = assignParameter(args, 2, false);
        Object stub = null;
        stub =
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                ZVal.arrayFromList("{{table}}", "{{tableClassName}}"),
                                ZVal.newArray(new ZPair(0, table), new ZPair(1, tableClassName)),
                                env.callMethod(
                                        this.files,
                                        "get",
                                        FailedTableCommand.class,
                                        toStringR(
                                                        env.addRootFilesystemPrefix(
                                                                "/vendor/laravel/framework/src/Illuminate/Queue/Console"),
                                                        env)
                                                + "/stubs/failed_jobs.stub"))
                        .value();
        env.callMethod(this.files, "put", FailedTableCommand.class, path, stub);
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Queue\\Console\\FailedTableCommand";

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
                    .setName("Illuminate\\Queue\\Console\\FailedTableCommand")
                    .setLookup(
                            FailedTableCommand.class,
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
                            "usages",
                            "verbosity",
                            "verbosityMap")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Queue/Console/FailedTableCommand.php")
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
