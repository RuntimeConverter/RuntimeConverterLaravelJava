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
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes.BeanstalkdQueue;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Connectors.classes.ConnectorInterface;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Queue/Connectors/BeanstalkdConnector.php

*/

public class BeanstalkdConnector extends RuntimeClassBase implements ConnectorInterface {

    public BeanstalkdConnector(RuntimeEnv env, Object... args) {
        super(env);
    }

    public BeanstalkdConnector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    public Object connect(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object retryAfter = null;
        Object ternaryExpressionTemp = null;
        retryAfter =
                ZVal.assign(
                        ZVal.isDefined(ternaryExpressionTemp = config.arrayGet(env, "retry_after"))
                                ? ternaryExpressionTemp
                                : ClassConstantUtils.getConstantValueByClass(
                                        env,
                                        ZVal.resolveClassAlias(env, "Pheanstalk"),
                                        "DEFAULT_TTR"));
        return ZVal.assign(
                new BeanstalkdQueue(
                        env,
                        this.pheanstalk(env, config.getObject()),
                        config.arrayGet(env, "queue"),
                        retryAfter));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object pheanstalk(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                env.createNew(
                        ZVal.resolveClassAlias(env, "Pheanstalk"),
                        config.arrayGet(env, "host"),
                        ZVal.isDefined(ternaryExpressionTemp = config.arrayGet(env, "port"))
                                ? ternaryExpressionTemp
                                : ClassConstantUtils.getConstantValueByClass(
                                        env,
                                        ZVal.resolveClassAlias(env, "PheanstalkInterface"),
                                        "DEFAULT_PORT"),
                        ZVal.isDefined(ternaryExpressionTemp = config.arrayGet(env, "timeout"))
                                ? ternaryExpressionTemp
                                : ClassConstantUtils.getConstantValueByClass(
                                        env,
                                        ZVal.resolveClassAlias(env, "Connection"),
                                        "DEFAULT_CONNECT_TIMEOUT"),
                        ZVal.isDefined(ternaryExpressionTemp = config.arrayGet(env, "persistent"))
                                ? ternaryExpressionTemp
                                : false));
    }

    public static final Object CONST_class = "Illuminate\\Queue\\Connectors\\BeanstalkdConnector";

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
                    .setName("Illuminate\\Queue\\Connectors\\BeanstalkdConnector")
                    .setLookup(
                            BeanstalkdConnector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Queue/Connectors/BeanstalkdConnector.php")
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
