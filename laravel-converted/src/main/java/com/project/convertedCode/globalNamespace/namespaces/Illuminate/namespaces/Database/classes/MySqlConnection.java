package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes.Connection;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.namespaces.Processors.classes.MySqlProcessor;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeClasses.pdo.PDO;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_float;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Schema.classes.MySqlBuilder;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/MySqlConnection.php

*/

public class MySqlConnection extends Connection {

    public MySqlConnection(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MySqlConnection.class) {
            this.__construct(env, args);
        }
    }

    public MySqlConnection(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    protected Object getDefaultQueryGrammar(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this,
                        "withTablePrefix",
                        MySqlConnection.class,
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
                                .MySqlGrammar(env)));
    }

    @ConvertedMethod
    public Object getSchemaBuilder(RuntimeEnv env, Object... args) {
        if (function_is_null
                .f
                .env(env)
                .call(toObjectR(this).accessProp(this, env).name("schemaGrammar").value())
                .getBool()) {
            env.callMethod(this, "useDefaultSchemaGrammar", MySqlConnection.class);
        }

        return ZVal.assign(new MySqlBuilder(env, this));
    }

    @ConvertedMethod
    protected Object getDefaultSchemaGrammar(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this,
                        "withTablePrefix",
                        MySqlConnection.class,
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
                                .MySqlGrammar(env)));
    }

    @ConvertedMethod
    protected Object getDefaultPostProcessor(RuntimeEnv env, Object... args) {
        return ZVal.assign(new MySqlProcessor(env));
    }

    @ConvertedMethod
    protected Object getDoctrineDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.createNew(ZVal.resolveClassAlias(env, "DoctrineDriver")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "statement")
    @ConvertedParameter(index = 1, name = "bindings")
    public Object bindValues(RuntimeEnv env, Object... args) {
        Object statement = assignParameter(args, 0, false);
        Object bindings = assignParameter(args, 1, false);
        Object value = null;
        Object key = null;
        for (ZPair zpairResult340 : ZVal.getIterable(bindings, env, false)) {
            key = ZVal.assign(zpairResult340.getKey());
            value = ZVal.assign(zpairResult340.getValue());
            env.callMethod(
                    statement,
                    "bindValue",
                    MySqlConnection.class,
                    function_is_string.f.env(env).call(key).getBool() ? key : ZVal.add(key, 1),
                    value,
                    ZVal.toBool(function_is_int.f.env(env).call(value).value())
                                    || ZVal.toBool(function_is_float.f.env(env).call(value).value())
                            ? 1
                            : 2);
        }

        return null;
    }

    public static final Object CONST_class = "Illuminate\\Database\\MySqlConnection";

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
                    .setName("Illuminate\\Database\\MySqlConnection")
                    .setLookup(
                            MySqlConnection.class,
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
                            "vendor/laravel/framework/src/Illuminate/Database/MySqlConnection.php")
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
