package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.namespaces.Processors.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.namespaces.Processors.classes.Processor;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Query/Processors/PostgresProcessor.php

*/

public class PostgresProcessor extends Processor {

    public PostgresProcessor(RuntimeEnv env, Object... args) {
        super(env);
    }

    public PostgresProcessor(NoConstructor n) {
        super(n);
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
        ReferenceContainer result = new BasicReferenceContainer(null);
        Object ternaryExpressionTemp = null;
        Object id = null;
        result.setObject(
                ZVal.assign(
                        handleReturnReference(
                                        env.callMethod(
                                                env.callMethod(
                                                        query,
                                                        "getConnection",
                                                        PostgresProcessor.class),
                                                "selectFromWriteConnection",
                                                PostgresProcessor.class,
                                                sql,
                                                values))
                                .arrayGet(env, 0)));
        sequence =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = sequence)
                                ? ternaryExpressionTemp
                                : "id");
        id =
                ZVal.assign(
                        function_is_object.f.env(env).call(result.getObject()).getBool()
                                ? toObjectR(result.getObject())
                                        .accessProp(this, env)
                                        .name(sequence)
                                        .value()
                                : result.arrayGet(env, sequence));
        return ZVal.assign(
                function_is_numeric.f.env(env).call(id).getBool() ? ZVal.toLong(id) : id);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "results")
    public Object processColumnListing(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Database/Query/Processors")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Query/Processors/PostgresProcessor.php");
        Object results = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Query\\Processors",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "result")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object result = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                toObjectR(toObjectR(result))
                                                        .accessProp(this, env)
                                                        .name("column_name")
                                                        .value());
                                    }
                                },
                                results)
                        .value());
    }

    public static final Object CONST_class =
            "Illuminate\\Database\\Query\\Processors\\PostgresProcessor";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Processor.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Query\\Processors\\PostgresProcessor")
                    .setLookup(
                            PostgresProcessor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Query/Processors/PostgresProcessor.php")
                    .addExtendsClass("Illuminate\\Database\\Query\\Processors\\Processor")
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
