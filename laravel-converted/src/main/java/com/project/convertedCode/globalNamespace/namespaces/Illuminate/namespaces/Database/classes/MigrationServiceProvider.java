package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Migrations.classes.DatabaseMigrationRepository;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Migrations.classes.MigrationCreator;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.ServiceProvider;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Migrations.classes.Migrator;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/MigrationServiceProvider.php

*/

public class MigrationServiceProvider extends ServiceProvider {

    public MigrationServiceProvider(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.defer = true;
        if (this.getClass() == MigrationServiceProvider.class) {
            this.__construct(env, args);
        }
    }

    public MigrationServiceProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object register(RuntimeEnv env, Object... args) {
        this.registerRepository(env);
        this.registerMigrator(env);
        this.registerCreator(env);
        return null;
    }

    @ConvertedMethod
    protected Object registerRepository(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/MigrationServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                MigrationServiceProvider.class,
                "migration.repository",
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Database", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ReferenceContainer app =
                                new BasicReferenceContainer(assignParameter(args, 0, false));
                        Object table = null;
                        table = ZVal.assign(app.arrayGet(env, "config", "database.migrations"));
                        return ZVal.assign(
                                new DatabaseMigrationRepository(
                                        env, app.arrayGet(env, "db"), table));
                    }
                });
        return null;
    }

    @ConvertedMethod
    protected Object registerMigrator(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/MigrationServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                MigrationServiceProvider.class,
                "migrator",
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Database", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ReferenceContainer app =
                                new BasicReferenceContainer(assignParameter(args, 0, false));
                        Object repository = null;
                        repository = ZVal.assign(app.arrayGet(env, "migration.repository"));
                        return ZVal.assign(
                                new Migrator(
                                        env,
                                        repository,
                                        app.arrayGet(env, "db"),
                                        app.arrayGet(env, "files")));
                    }
                });
        return null;
    }

    @ConvertedMethod
    protected Object registerCreator(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/MigrationServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                MigrationServiceProvider.class,
                "migration.creator",
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Database", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ReferenceContainer app =
                                new BasicReferenceContainer(assignParameter(args, 0, false));
                        return ZVal.assign(new MigrationCreator(env, app.arrayGet(env, "files")));
                    }
                });
        return null;
    }

    @ConvertedMethod
    public Object provides(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.arrayFromList("migrator", "migration.repository", "migration.creator"));
    }

    public static final Object CONST_class = "Illuminate\\Database\\MigrationServiceProvider";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ServiceProvider.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\MigrationServiceProvider")
                    .setLookup(
                            MigrationServiceProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "defer", "defer")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/MigrationServiceProvider.php")
                    .addExtendsClass("Illuminate\\Support\\ServiceProvider")
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
