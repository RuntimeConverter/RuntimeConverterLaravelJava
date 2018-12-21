package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Pagination.classes;

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

 vendor/laravel/framework/src/Illuminate/Contracts/Pagination/Paginator.php

*/

public interface Paginator {

    public static final Object CONST_class = "Illuminate\\Contracts\\Pagination\\Paginator";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "page")
    public Object url(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object appends(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "fragment",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object fragment(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object nextPageUrl(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object previousPageUrl(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object items(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object firstItem(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object lastItem(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object perPage(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object currentPage(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object hasPages(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object hasMorePages(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object isEmpty(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object isNotEmpty(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "view",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 1, name = "data", defaultValue = "", defaultValueType = "array")
    public Object render(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Contracts\\Pagination\\Paginator")
                    .setLookup(Paginator.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Contracts/Pagination/Paginator.php")
                    .get();
}
