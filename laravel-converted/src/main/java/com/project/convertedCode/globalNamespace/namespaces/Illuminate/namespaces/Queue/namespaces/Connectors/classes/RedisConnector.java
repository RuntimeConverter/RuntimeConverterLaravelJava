package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Connectors.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes.RedisQueue;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Connectors.classes.ConnectorInterface;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Queue/Connectors/RedisConnector.php

*/

public class RedisConnector extends RuntimeClassBase implements ConnectorInterface {

    public Object redis = null;

    public Object connection = null;

    public RedisConnector(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RedisConnector.class) {
            this.__construct(env, args);
        }
    }

    public RedisConnector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "redis",
        typeHint = "Illuminate\\Contracts\\Redis\\Factory"
    )
    @ConvertedParameter(
        index = 1,
        name = "connection",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object redis = assignParameter(args, 0, false);
        Object connection = assignParameter(args, 1, true);
        if (null == connection) {
            connection = ZVal.getNull();
        }
        this.redis = redis;
        this.connection = connection;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    public Object connect(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                new RedisQueue(
                        env,
                        this.redis,
                        config.arrayGet(env, "queue"),
                        ZVal.isDefined(ternaryExpressionTemp = config.arrayGet(env, "connection"))
                                ? ternaryExpressionTemp
                                : this.connection,
                        ZVal.isDefined(ternaryExpressionTemp = config.arrayGet(env, "retry_after"))
                                ? ternaryExpressionTemp
                                : 60,
                        ZVal.isDefined(ternaryExpressionTemp = config.arrayGet(env, "block_for"))
                                ? ternaryExpressionTemp
                                : ZVal.getNull()));
    }

    public static final Object CONST_class = "Illuminate\\Queue\\Connectors\\RedisConnector";

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
                    .setName("Illuminate\\Queue\\Connectors\\RedisConnector")
                    .setLookup(
                            RedisConnector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("connection", "redis")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Queue/Connectors/RedisConnector.php")
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
