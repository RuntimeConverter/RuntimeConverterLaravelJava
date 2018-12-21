package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Migrations.classes.Migration;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Schema;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 database/migrations/2014_10_12_000000_create_users_table.php

*/

public class CreateUsersTable extends Migration {

    public CreateUsersTable(RuntimeEnv env, Object... args) {
        super(env);
    }

    public CreateUsersTable(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object up(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/database/migrations")
                        .setFile("/database/migrations/2014_10_12_000000_create_users_table.php");
        Schema.runtimeStaticObject.callUnknownStaticMethod(
                env,
                "create",
                new RuntimeArgsWithReferences(),
                "users",
                new Closure(env, runtimeConverterFunctionClassConstants, "", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(
                        index = 0,
                        name = "table",
                        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
                    )
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object table = assignParameter(args, 0, false);
                        env.callMethod(table, "increments", CreateUsersTable.class, "id");
                        env.callMethod(table, "string", CreateUsersTable.class, "name");
                        env.callMethod(
                                env.callMethod(table, "string", CreateUsersTable.class, "email"),
                                "unique",
                                CreateUsersTable.class);
                        env.callMethod(table, "string", CreateUsersTable.class, "password");
                        env.callMethod(table, "rememberToken", CreateUsersTable.class);
                        env.callMethod(table, "timestamps", CreateUsersTable.class);
                        return null;
                    }
                });
        return null;
    }

    @ConvertedMethod
    public Object down(RuntimeEnv env, Object... args) {
        Schema.runtimeStaticObject.callUnknownStaticMethod(
                env, "dropIfExists", new RuntimeArgsWithReferences(), "users");
        return null;
    }

    public static final Object CONST_class = "CreateUsersTable";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Migration.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("CreateUsersTable")
                    .setLookup(
                            CreateUsersTable.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("connection", "withinTransaction")
                    .setFilename("database/migrations/2014_10_12_000000_create_users_table.php")
                    .addExtendsClass("Illuminate\\Database\\Migrations\\Migration")
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
