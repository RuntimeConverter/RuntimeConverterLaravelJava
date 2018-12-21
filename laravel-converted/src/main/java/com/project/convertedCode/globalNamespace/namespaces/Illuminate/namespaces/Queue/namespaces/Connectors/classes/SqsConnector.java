package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Connectors.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Connectors.classes.ConnectorInterface;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes.SqsQueue;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Queue/Connectors/SqsConnector.php

*/

public class SqsConnector extends RuntimeClassBase implements ConnectorInterface {

    public SqsConnector(RuntimeEnv env, Object... args) {
        super(env);
    }

    public SqsConnector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    public Object connect(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ternaryExpressionTemp = null;
        config.setObject(this.getDefaultConfiguration(env, config.getObject()));
        if (ZVal.toBool(config.arrayGet(env, "key"))
                && ZVal.toBool(config.arrayGet(env, "secret"))) {
            config.arrayAccess(env, "credentials")
                    .set(
                            Arr.runtimeStaticObject.only(
                                    env,
                                    config.getObject(),
                                    ZVal.arrayFromList("key", "secret", "token")));
        }

        return ZVal.assign(
                new SqsQueue(
                        env,
                        env.createNew(ZVal.resolveClassAlias(env, "SqsClient"), config.getObject()),
                        config.arrayGet(env, "queue"),
                        ZVal.isDefined(ternaryExpressionTemp = config.arrayGet(env, "prefix"))
                                ? ternaryExpressionTemp
                                : ""));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object getDefaultConfiguration(RuntimeEnv env, Object... args) {
        Object config = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair("version", "latest"),
                                        new ZPair(
                                                "http",
                                                ZVal.newArray(
                                                        new ZPair("timeout", 60),
                                                        new ZPair("connect_timeout", 60)))),
                                config)
                        .value());
    }

    public static final Object CONST_class = "Illuminate\\Queue\\Connectors\\SqsConnector";

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
                    .setName("Illuminate\\Queue\\Connectors\\SqsConnector")
                    .setLookup(
                            SqsConnector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Queue/Connectors/SqsConnector.php")
                    .addInterface("Illuminate\\Queue\\Connectors\\ConnectorInterface")
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
