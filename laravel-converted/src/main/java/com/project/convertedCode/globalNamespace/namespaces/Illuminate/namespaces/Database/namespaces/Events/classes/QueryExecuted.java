package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Events.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Events/QueryExecuted.php

*/

public class QueryExecuted extends RuntimeClassBase {

    public Object sql = null;

    public Object bindings = null;

    public Object time = null;

    public Object connection = null;

    public Object connectionName = null;

    public QueryExecuted(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == QueryExecuted.class) {
            this.__construct(env, args);
        }
    }

    public QueryExecuted(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sql")
    @ConvertedParameter(index = 1, name = "bindings")
    @ConvertedParameter(index = 2, name = "time")
    @ConvertedParameter(index = 3, name = "connection")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object sql = assignParameter(args, 0, false);
        Object bindings = assignParameter(args, 1, false);
        Object time = assignParameter(args, 2, false);
        Object connection = assignParameter(args, 3, false);
        this.sql = sql;
        this.time = time;
        this.bindings = bindings;
        this.connection = connection;
        this.connectionName = env.callMethod(connection, "getName", QueryExecuted.class);
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Database\\Events\\QueryExecuted";

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
                    .setName("Illuminate\\Database\\Events\\QueryExecuted")
                    .setLookup(
                            QueryExecuted.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bindings", "connection", "connectionName", "sql", "time")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Events/QueryExecuted.php")
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
