package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Migrations.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Migrations.classes.MigrationRepositoryInterface;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Migrations/DatabaseMigrationRepository.php

*/

public class DatabaseMigrationRepository extends RuntimeClassBase
        implements MigrationRepositoryInterface {

    public Object resolver = null;

    public Object table = null;

    public Object connection = null;

    public DatabaseMigrationRepository(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DatabaseMigrationRepository.class) {
            this.__construct(env, args);
        }
    }

    public DatabaseMigrationRepository(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "resolver",
        typeHint = "Illuminate\\Database\\ConnectionResolverInterface"
    )
    @ConvertedParameter(index = 1, name = "table")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object resolver = assignParameter(args, 0, false);
        Object table = assignParameter(args, 1, false);
        this.table = table;
        this.resolver = resolver;
        return null;
    }

    @ConvertedMethod
    public Object getRan(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                this.table(env),
                                                "orderBy",
                                                DatabaseMigrationRepository.class,
                                                "batch",
                                                "asc"),
                                        "orderBy",
                                        DatabaseMigrationRepository.class,
                                        "migration",
                                        "asc"),
                                "pluck",
                                DatabaseMigrationRepository.class,
                                "migration"),
                        "all",
                        DatabaseMigrationRepository.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "steps")
    public Object getMigrations(RuntimeEnv env, Object... args) {
        Object steps = assignParameter(args, 0, false);
        Object query = null;
        query =
                env.callMethod(
                        this.table(env),
                        "where",
                        DatabaseMigrationRepository.class,
                        "batch",
                        ">=",
                        "1");
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                env.callMethod(
                                                        query,
                                                        "orderBy",
                                                        DatabaseMigrationRepository.class,
                                                        "batch",
                                                        "desc"),
                                                "orderBy",
                                                DatabaseMigrationRepository.class,
                                                "migration",
                                                "desc"),
                                        "take",
                                        DatabaseMigrationRepository.class,
                                        steps),
                                "get",
                                DatabaseMigrationRepository.class),
                        "all",
                        DatabaseMigrationRepository.class));
    }

    @ConvertedMethod
    public Object getLast(RuntimeEnv env, Object... args) {
        Object query = null;
        query =
                env.callMethod(
                        this.table(env),
                        "where",
                        DatabaseMigrationRepository.class,
                        "batch",
                        this.getLastBatchNumber(env));
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        query,
                                        "orderBy",
                                        DatabaseMigrationRepository.class,
                                        "migration",
                                        "desc"),
                                "get",
                                DatabaseMigrationRepository.class),
                        "all",
                        DatabaseMigrationRepository.class));
    }

    @ConvertedMethod
    public Object getMigrationBatches(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                this.table(env),
                                                "orderBy",
                                                DatabaseMigrationRepository.class,
                                                "batch",
                                                "asc"),
                                        "orderBy",
                                        DatabaseMigrationRepository.class,
                                        "migration",
                                        "asc"),
                                "pluck",
                                DatabaseMigrationRepository.class,
                                "batch",
                                "migration"),
                        "all",
                        DatabaseMigrationRepository.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    @ConvertedParameter(index = 1, name = "batch")
    public Object log(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        Object batch = assignParameter(args, 1, false);
        Object record = null;
        record = ZVal.newArray(new ZPair("migration", file), new ZPair("batch", batch));
        env.callMethod(this.table(env), "insert", DatabaseMigrationRepository.class, record);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "migration")
    public Object delete(RuntimeEnv env, Object... args) {
        Object migration = assignParameter(args, 0, false);
        env.callMethod(
                env.callMethod(
                        this.table(env),
                        "where",
                        DatabaseMigrationRepository.class,
                        "migration",
                        toObjectR(migration).accessProp(this, env).name("migration").value()),
                "delete",
                DatabaseMigrationRepository.class);
        return null;
    }

    @ConvertedMethod
    public Object getNextBatchNumber(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.add(this.getLastBatchNumber(env), 1));
    }

    @ConvertedMethod
    public Object getLastBatchNumber(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this.table(env), "max", DatabaseMigrationRepository.class, "batch"));
    }

    @ConvertedMethod
    public Object createRepository(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Migrations")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Migrations/DatabaseMigrationRepository.php");
        Object schema = null;
        schema =
                env.callMethod(
                        this.getConnection(env),
                        "getSchemaBuilder",
                        DatabaseMigrationRepository.class);
        env.callMethod(
                schema,
                "create",
                DatabaseMigrationRepository.class,
                this.table,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Database\\Migrations",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "table")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object table = assignParameter(args, 0, false);
                        env.callMethod(
                                table, "increments", DatabaseMigrationRepository.class, "id");
                        env.callMethod(
                                table, "string", DatabaseMigrationRepository.class, "migration");
                        env.callMethod(
                                table, "integer", DatabaseMigrationRepository.class, "batch");
                        return null;
                    }
                });
        return null;
    }

    @ConvertedMethod
    public Object repositoryExists(RuntimeEnv env, Object... args) {
        Object schema = null;
        schema =
                env.callMethod(
                        this.getConnection(env),
                        "getSchemaBuilder",
                        DatabaseMigrationRepository.class);
        return ZVal.assign(
                env.callMethod(schema, "hasTable", DatabaseMigrationRepository.class, this.table));
    }

    @ConvertedMethod
    protected Object table(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                this.getConnection(env),
                                "table",
                                DatabaseMigrationRepository.class,
                                this.table),
                        "useWritePdo",
                        DatabaseMigrationRepository.class));
    }

    @ConvertedMethod
    public Object getConnectionResolver(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.resolver);
    }

    @ConvertedMethod
    public Object getConnection(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this.resolver,
                        "connection",
                        DatabaseMigrationRepository.class,
                        this.connection));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setSource(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this.connection = name;
        return null;
    }

    public static final Object CONST_class =
            "Illuminate\\Database\\Migrations\\DatabaseMigrationRepository";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Migrations\\DatabaseMigrationRepository")
                    .setLookup(
                            DatabaseMigrationRepository.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("connection", "resolver", "table")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Migrations/DatabaseMigrationRepository.php")
                    .addInterface("Illuminate\\Database\\Migrations\\MigrationRepositoryInterface")
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
