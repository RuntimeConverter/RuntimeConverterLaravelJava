package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Swift_DependencyContainer;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.classes.Swift_Transport_LoadBalancedTransport;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/LoadBalancedTransport.php

*/

public class Swift_LoadBalancedTransport extends Swift_Transport_LoadBalancedTransport {

    public Swift_LoadBalancedTransport(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_LoadBalancedTransport.class) {
            this.__construct(env, args);
        }
    }

    public Swift_LoadBalancedTransport(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "transports",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object transports = assignParameter(args, 0, true);
        if (null == transports) {
            transports = ZVal.newArray();
        }
        function_call_user_func_array
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                .call(
                        ZVal.newArray(
                                new ZPair(0, this),
                                new ZPair(1, "Swift_Transport_LoadBalancedTransport::__construct")),
                        env.callMethod(
                                Swift_DependencyContainer.runtimeStaticObject.getInstance(env),
                                "createDependenciesFor",
                                Swift_LoadBalancedTransport.class,
                                "transport.loadbalanced"));
        env.callMethod(this, "setTransports", Swift_LoadBalancedTransport.class, transports);
        return null;
    }

    public static final Object CONST_class = "Swift_LoadBalancedTransport";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends Swift_Transport_LoadBalancedTransport.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_LoadBalancedTransport")
                    .setLookup(
                            Swift_LoadBalancedTransport.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("deadTransports", "lastUsedTransport", "transports")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/LoadBalancedTransport.php")
                    .addInterface("Swift_Transport")
                    .addExtendsClass("Swift_Transport_LoadBalancedTransport")
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
