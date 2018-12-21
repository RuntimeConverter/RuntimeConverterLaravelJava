package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.namespaces.Processors.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Query/Processors/Processor.php

*/

public class Processor extends RuntimeClassBase {

    public Processor(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Processor(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "results")
    public Object processSelect(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object results = assignParameter(args, 1, false);
        return ZVal.assign(results);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "sql")
    @ConvertedParameter(index = 2, name = "values")
    @ConvertedParameter(
        index = 3,
        name = "sequence",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object processInsertGetId(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object sql = assignParameter(args, 1, false);
        Object values = assignParameter(args, 2, false);
        Object sequence = assignParameter(args, 3, true);
        if (null == sequence) {
            sequence = ZVal.getNull();
        }
        Object id = null;
        env.callMethod(
                env.callMethod(query, "getConnection", Processor.class),
                "insert",
                Processor.class,
                sql,
                values);
        id =
                env.callMethod(
                        env.callMethod(
                                env.callMethod(query, "getConnection", Processor.class),
                                "getPdo",
                                Processor.class),
                        "lastInsertId",
                        Processor.class,
                        sequence);
        return ZVal.assign(
                function_is_numeric.f.env(env).call(id).getBool() ? ZVal.toLong(id) : id);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "results")
    public Object processColumnListing(RuntimeEnv env, Object... args) {
        Object results = assignParameter(args, 0, false);
        return ZVal.assign(results);
    }

    public static final Object CONST_class = "Illuminate\\Database\\Query\\Processors\\Processor";

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
                    .setName("Illuminate\\Database\\Query\\Processors\\Processor")
                    .setLookup(
                            Processor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Query/Processors/Processor.php")
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
