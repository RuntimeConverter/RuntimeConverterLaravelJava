package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.namespaces.Console.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Notifications/Console/NotificationTableCommand.php

*/

public class NotificationTableCommand extends Command {

    public Object files = null;

    public Object composer = null;

    public NotificationTableCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = "notifications:table";
        this.description = "Create a migration for the notifications table";
        if (this.getClass() == NotificationTableCommand.class) {
            this.__construct(env, args);
        }
    }

    public NotificationTableCommand(NoConstructor n) {
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
        Object fullPath = null;
        fullPath = this.createBaseMigration(env);
        env.callMethod(
                this.files,
                "put",
                NotificationTableCommand.class,
                fullPath,
                env.callMethod(
                        this.files,
                        "get",
                        NotificationTableCommand.class,
                        toStringR(
                                        env.addRootFilesystemPrefix(
                                                "/vendor/laravel/framework/src/Illuminate/Notifications/Console"),
                                        env)
                                + "/stubs/notifications.stub"));
        env.callMethod(
                this, "info", NotificationTableCommand.class, "Migration created successfully!");
        env.callMethod(this.composer, "dumpAutoloads", NotificationTableCommand.class);
        return null;
    }

    @ConvertedMethod
    protected Object createBaseMigration(RuntimeEnv env, Object... args) {
        Object path = null;
        Object name = null;
        name = "create_notifications_table";
        path =
                toStringR(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("laravel")
                                                .value(),
                                        "databasePath",
                                        NotificationTableCommand.class),
                                env)
                        + "/migrations";
        return ZVal.assign(
                env.callMethod(
                        new ReferenceClassProperty(this, "laravel", env)
                                .arrayGet(env, "migration.creator"),
                        "create",
                        NotificationTableCommand.class,
                        name,
                        path));
    }

    public static final Object CONST_class =
            "Illuminate\\Notifications\\Console\\NotificationTableCommand";

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
                    .setName("Illuminate\\Notifications\\Console\\NotificationTableCommand")
                    .setLookup(
                            NotificationTableCommand.class,
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
                            "vendor/laravel/framework/src/Illuminate/Notifications/Console/NotificationTableCommand.php")
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
