package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes.Connection;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Schema.classes.SqlServerBuilder;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.namespaces.Processors.classes.SqlServerProcessor;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.references.ReadOnlyReferenceContainer;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/SqlServerConnection.php

*/

public class SqlServerConnection extends Connection {

    public SqlServerConnection(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SqlServerConnection.class) {
            this.__construct(env, args);
        }
    }

    public SqlServerConnection(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    @ConvertedParameter(
        index = 1,
        name = "attempts",
        defaultValue = "1",
        defaultValueType = "number"
    )
    public Object transaction(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        Object attempts = assignParameter(args, 1, true);
        if (null == attempts) {
            attempts = 1;
        }
        Object result = null;
        ReferenceContainer a = new BasicReferenceContainer(null);
        Object e = null;
        for (a.setObject(1);
                ZVal.isLessThanOrEqualTo(a.getObject(), "<=", attempts);
                a.setObject(ZVal.increment(a.getObject()))) {
            if (ZVal.equalityCheck(
                    env.callMethod(this, "getDriverName", SqlServerConnection.class), "sqlsrv")) {
                return ZVal.assign(super.transaction(env, callback));
            }

            env.callMethod(
                    env.callMethod(this, "getPdo", SqlServerConnection.class),
                    "exec",
                    SqlServerConnection.class,
                    "BEGIN TRAN");
            try {
                result =
                        env.callFunctionDynamic(
                                        callback,
                                        new RuntimeArgsWithReferences()
                                                .add(0, new ReadOnlyReferenceContainer(this)),
                                        this)
                                .value();
                env.callMethod(
                        env.callMethod(this, "getPdo", SqlServerConnection.class),
                        "exec",
                        SqlServerConnection.class,
                        "COMMIT TRAN");
            } catch (ConvertedException convertedException30) {
                if (convertedException30.instanceOf(PHPException.class, "Exception")) {
                    e = convertedException30.getObject();
                    env.callMethod(
                            env.callMethod(this, "getPdo", SqlServerConnection.class),
                            "exec",
                            SqlServerConnection.class,
                            "ROLLBACK TRAN");
                    throw ZVal.getException(env, e);
                } else if (convertedException30.instanceOf(Throwable.class, "Throwable")) {
                    e = convertedException30.getObject();
                    env.callMethod(
                            env.callMethod(this, "getPdo", SqlServerConnection.class),
                            "exec",
                            SqlServerConnection.class,
                            "ROLLBACK TRAN");
                    throw ZVal.getException(env, e);
                } else {
                    throw convertedException30;
                }
            }

            return ZVal.assign(result);
        }

        return null;
    }

    @ConvertedMethod
    protected Object getDefaultQueryGrammar(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this,
                        "withTablePrefix",
                        SqlServerConnection.class,
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
                                .SqlServerGrammar(env)));
    }

    @ConvertedMethod
    public Object getSchemaBuilder(RuntimeEnv env, Object... args) {
        if (function_is_null
                .f
                .env(env)
                .call(toObjectR(this).accessProp(this, env).name("schemaGrammar").value())
                .getBool()) {
            env.callMethod(this, "useDefaultSchemaGrammar", SqlServerConnection.class);
        }

        return ZVal.assign(new SqlServerBuilder(env, this));
    }

    @ConvertedMethod
    protected Object getDefaultSchemaGrammar(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this,
                        "withTablePrefix",
                        SqlServerConnection.class,
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
                                .SqlServerGrammar(env)));
    }

    @ConvertedMethod
    protected Object getDefaultPostProcessor(RuntimeEnv env, Object... args) {
        return ZVal.assign(new SqlServerProcessor(env));
    }

    @ConvertedMethod
    protected Object getDoctrineDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.createNew(ZVal.resolveClassAlias(env, "DoctrineDriver")));
    }

    public static final Object CONST_class = "Illuminate\\Database\\SqlServerConnection";

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
                    .setName("Illuminate\\Database\\SqlServerConnection")
                    .setLookup(
                            SqlServerConnection.class,
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
                            "vendor/laravel/framework/src/Illuminate/Database/SqlServerConnection.php")
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
