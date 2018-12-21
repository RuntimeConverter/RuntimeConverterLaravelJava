package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/ConnectionInterface.php

*/

public interface ConnectionInterface {

    public static final Object CONST_class = "Illuminate\\Database\\ConnectionInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    public Object table(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object raw(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "bindings", defaultValue = "", defaultValueType = "array")
    public Object selectOne(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "bindings", defaultValue = "", defaultValueType = "array")
    public Object select(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "bindings", defaultValue = "", defaultValueType = "array")
    public Object insert(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "bindings", defaultValue = "", defaultValueType = "array")
    public Object update(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "bindings", defaultValue = "", defaultValueType = "array")
    public Object delete(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "bindings", defaultValue = "", defaultValueType = "array")
    public Object statement(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "bindings", defaultValue = "", defaultValueType = "array")
    public Object affectingStatement(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    public Object unprepared(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bindings", typeHint = "array")
    public Object prepareBindings(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    @ConvertedParameter(
        index = 1,
        name = "attempts",
        defaultValue = "1",
        defaultValueType = "number"
    )
    public Object transaction(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object beginTransaction(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object commit(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object rollBack(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object transactionLevel(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    public Object pretend(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\ConnectionInterface")
                    .setLookup(ConnectionInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/ConnectionInterface.php")
                    .get();
}
