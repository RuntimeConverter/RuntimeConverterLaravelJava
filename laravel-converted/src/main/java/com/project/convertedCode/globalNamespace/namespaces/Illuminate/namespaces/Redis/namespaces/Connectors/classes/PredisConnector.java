package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Redis.namespaces.Connectors.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Redis.namespaces.Connections.classes.PredisConnection;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Redis.namespaces.Connections.classes.PredisClusterConnection;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Redis/Connectors/PredisConnector.php

*/

public class PredisConnector extends RuntimeClassBase {

    public PredisConnector(RuntimeEnv env, Object... args) {
        super(env);
    }

    public PredisConnector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    @ConvertedParameter(index = 1, name = "options", typeHint = "array")
    public Object connect(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object options = assignParameter(args, 1, false);
        Object formattedOptions = null;
        formattedOptions =
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(new ZPair("timeout", 10.0)),
                                options,
                                Arr.runtimeStaticObject.pull(
                                        env,
                                        new RuntimeArgsWithReferences().add(0, config),
                                        config.getObject(),
                                        "options",
                                        ZVal.newArray()))
                        .value();
        return ZVal.assign(
                new PredisConnection(
                        env,
                        env.createNew(
                                ZVal.resolveClassAlias(env, "Client"),
                                config.getObject(),
                                formattedOptions)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    @ConvertedParameter(index = 1, name = "clusterOptions", typeHint = "array")
    @ConvertedParameter(index = 2, name = "options", typeHint = "array")
    public Object connectToCluster(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object clusterOptions = assignParameter(args, 1, false);
        Object options = assignParameter(args, 2, false);
        Object clusterSpecificOptions = null;
        clusterSpecificOptions =
                Arr.runtimeStaticObject.pull(
                        env,
                        new RuntimeArgsWithReferences().add(0, config),
                        config.getObject(),
                        "options",
                        ZVal.newArray());
        return ZVal.assign(
                new PredisClusterConnection(
                        env,
                        env.createNew(
                                ZVal.resolveClassAlias(env, "Client"),
                                function_array_values.f.env(env).call(config.getObject()).value(),
                                function_array_merge
                                        .f
                                        .env(env)
                                        .call(options, clusterOptions, clusterSpecificOptions)
                                        .value())));
    }

    public static final Object CONST_class = "Illuminate\\Redis\\Connectors\\PredisConnector";

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
                    .setName("Illuminate\\Redis\\Connectors\\PredisConnector")
                    .setLookup(
                            PredisConnector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Redis/Connectors/PredisConnector.php")
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
