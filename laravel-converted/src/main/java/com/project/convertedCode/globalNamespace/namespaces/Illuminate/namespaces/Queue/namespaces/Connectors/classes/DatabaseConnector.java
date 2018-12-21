package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Connectors.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
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
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes.DatabaseQueue;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Queue/Connectors/DatabaseConnector.php

*/

public class DatabaseConnector extends RuntimeClassBase implements ConnectorInterface {

    public Object connections = null;

    public DatabaseConnector(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DatabaseConnector.class) {
            this.__construct(env, args);
        }
    }

    public DatabaseConnector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "connections",
        typeHint = "Illuminate\\Database\\ConnectionResolverInterface"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object connections = assignParameter(args, 0, false);
        this.connections = connections;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    public Object connect(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                new DatabaseQueue(
                        env,
                        env.callMethod(
                                this.connections,
                                "connection",
                                DatabaseConnector.class,
                                ZVal.isDefined(
                                                ternaryExpressionTemp =
                                                        config.arrayGet(env, "connection"))
                                        ? ternaryExpressionTemp
                                        : ZVal.getNull()),
                        config.arrayGet(env, "table"),
                        config.arrayGet(env, "queue"),
                        ZVal.isDefined(ternaryExpressionTemp = config.arrayGet(env, "retry_after"))
                                ? ternaryExpressionTemp
                                : 60));
    }

    public static final Object CONST_class = "Illuminate\\Queue\\Connectors\\DatabaseConnector";

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
                    .setName("Illuminate\\Queue\\Connectors\\DatabaseConnector")
                    .setLookup(
                            DatabaseConnector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("connections")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Queue/Connectors/DatabaseConnector.php")
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
