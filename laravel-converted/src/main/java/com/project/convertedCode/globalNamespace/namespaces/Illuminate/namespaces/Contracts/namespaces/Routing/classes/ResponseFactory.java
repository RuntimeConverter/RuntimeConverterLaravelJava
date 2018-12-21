package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Routing.classes;

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

 vendor/laravel/framework/src/Illuminate/Contracts/Routing/ResponseFactory.php

*/

public interface ResponseFactory {

    public static final Object CONST_class = "Illuminate\\Contracts\\Routing\\ResponseFactory";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    @ConvertedParameter(
        index = 1,
        name = "status",
        defaultValue = "200",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 2,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object make(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "view")
    @ConvertedParameter(index = 1, name = "data", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "status",
        defaultValue = "200",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 3,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object view(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 1,
        name = "status",
        defaultValue = "200",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 2,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "options",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object json(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    @ConvertedParameter(index = 1, name = "data", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "status",
        defaultValue = "200",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 3,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 4,
        name = "options",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object jsonp(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    @ConvertedParameter(
        index = 1,
        name = "status",
        defaultValue = "200",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 2,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object stream(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 3, name = "disposition")
    public Object streamDownload(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 3, name = "disposition")
    public Object download(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(
        index = 1,
        name = "status",
        defaultValue = "302",
        defaultValueType = "number"
    )
    @ConvertedParameter(index = 2, name = "headers", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 3,
        name = "secure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object redirectTo(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "route")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "status",
        defaultValue = "302",
        defaultValueType = "number"
    )
    @ConvertedParameter(index = 3, name = "headers", defaultValue = "", defaultValueType = "array")
    public Object redirectToRoute(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "action")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "status",
        defaultValue = "302",
        defaultValueType = "number"
    )
    @ConvertedParameter(index = 3, name = "headers", defaultValue = "", defaultValueType = "array")
    public Object redirectToAction(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(
        index = 1,
        name = "status",
        defaultValue = "302",
        defaultValueType = "number"
    )
    @ConvertedParameter(index = 2, name = "headers", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 3,
        name = "secure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object redirectGuest(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "default")
    @ConvertedParameter(
        index = 1,
        name = "status",
        defaultValue = "302",
        defaultValueType = "number"
    )
    @ConvertedParameter(index = 2, name = "headers", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 3,
        name = "secure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object redirectToIntended(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Contracts\\Routing\\ResponseFactory")
                    .setLookup(ResponseFactory.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Contracts/Routing/ResponseFactory.php")
                    .get();
}
