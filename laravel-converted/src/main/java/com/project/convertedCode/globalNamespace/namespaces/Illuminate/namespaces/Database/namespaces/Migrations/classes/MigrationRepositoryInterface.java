package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Migrations.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Migrations/MigrationRepositoryInterface.php

*/

public interface MigrationRepositoryInterface {

    public static final Object CONST_class =
            "Illuminate\\Database\\Migrations\\MigrationRepositoryInterface";

    @ConvertedMethod
    public Object getRan(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "steps")
    public Object getMigrations(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getLast(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getMigrationBatches(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    @ConvertedParameter(index = 1, name = "batch")
    public Object log(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "migration")
    public Object delete(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getNextBatchNumber(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object createRepository(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object repositoryExists(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setSource(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Migrations\\MigrationRepositoryInterface")
                    .setLookup(MigrationRepositoryInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Migrations/MigrationRepositoryInterface.php")
                    .get();
}
