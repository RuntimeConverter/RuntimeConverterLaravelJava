package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Pagination.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Pagination.classes.Paginator;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Contracts/Pagination/LengthAwarePaginator.php

*/

public interface LengthAwarePaginator extends Paginator {

    public static final Object CONST_class =
            "Illuminate\\Contracts\\Pagination\\LengthAwarePaginator";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "start")
    @ConvertedParameter(index = 1, name = "end")
    public Object getUrlRange(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object total(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object lastPage(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Contracts\\Pagination\\LengthAwarePaginator")
                    .setLookup(LengthAwarePaginator.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Contracts/Pagination/LengthAwarePaginator.php")
                    .addInterface("Illuminate\\Contracts\\Pagination\\Paginator")
                    .get();
}
