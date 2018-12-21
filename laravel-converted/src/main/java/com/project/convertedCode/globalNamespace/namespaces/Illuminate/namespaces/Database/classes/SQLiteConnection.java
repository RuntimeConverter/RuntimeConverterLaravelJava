package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Schema.classes.SQLiteBuilder;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes.Connection;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.namespaces.Processors.classes.SQLiteProcessor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/SQLiteConnection.php

*/

public class SQLiteConnection extends Connection {

    public SQLiteConnection(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SQLiteConnection.class) {
            this.__construct(env, args);
        }
    }

    public SQLiteConnection(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    protected Object getDefaultQueryGrammar(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this,
                        "withTablePrefix",
                        SQLiteConnection.class,
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Illuminate
                                .namespaces
                                .Database
                                .namespaces
                                .Query
                                .namespaces
                                .Grammars
                                .classes
                                .SQLiteGrammar(env)));
    }

    @ConvertedMethod
    public Object getSchemaBuilder(RuntimeEnv env, Object... args) {
        if (function_is_null
                .f
                .env(env)
                .call(toObjectR(this).accessProp(this, env).name("schemaGrammar").value())
                .getBool()) {
            env.callMethod(this, "useDefaultSchemaGrammar", SQLiteConnection.class);
        }

        return ZVal.assign(new SQLiteBuilder(env, this));
    }

    @ConvertedMethod
    protected Object getDefaultSchemaGrammar(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this,
                        "withTablePrefix",
                        SQLiteConnection.class,
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Illuminate
                                .namespaces
                                .Database
                                .namespaces
                                .Schema
                                .namespaces
                                .Grammars
                                .classes
                                .SQLiteGrammar(env)));
    }

    @ConvertedMethod
    protected Object getDefaultPostProcessor(RuntimeEnv env, Object... args) {
        return ZVal.assign(new SQLiteProcessor(env));
    }

    @ConvertedMethod
    protected Object getDoctrineDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.createNew(ZVal.resolveClassAlias(env, "DoctrineDriver")));
    }

    public static final Object CONST_class = "Illuminate\\Database\\SQLiteConnection";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Connection.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\SQLiteConnection")
                    .setLookup(
                            SQLiteConnection.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "config",
                            "database",
                            "doctrineConnection",
                            "events",
                            "fetchMode",
                            "loggingQueries",
                            "pdo",
                            "postProcessor",
                            "pretending",
                            "queryGrammar",
                            "queryLog",
                            "readPdo",
                            "reconnector",
                            "recordsModified",
                            "schemaGrammar",
                            "tablePrefix",
                            "transactions")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/SQLiteConnection.php")
                    .addInterface("Illuminate\\Database\\ConnectionInterface")
                    .addExtendsClass("Illuminate\\Database\\Connection")
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
