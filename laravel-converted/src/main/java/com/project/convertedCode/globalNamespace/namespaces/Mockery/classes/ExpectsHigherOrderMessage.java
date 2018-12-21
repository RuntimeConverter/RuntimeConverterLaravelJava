package com.project.convertedCode.globalNamespace.namespaces.Mockery.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.classes.HigherOrderMessage;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/ExpectsHigherOrderMessage.php

*/

public class ExpectsHigherOrderMessage extends HigherOrderMessage {

    public ExpectsHigherOrderMessage(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ExpectsHigherOrderMessage.class) {
            this.__construct(env, args);
        }
    }

    public ExpectsHigherOrderMessage(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mock", typeHint = "Mockery\\MockInterface")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object mock = assignParameter(args, 0, false);
        super.__construct(env, mock, "shouldReceive");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "args")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object ___args = assignParameter(args, 1, false);
        Object expectation = null;
        expectation = super.__call(env, method, ___args);
        return ZVal.assign(env.callMethod(expectation, "once", ExpectsHigherOrderMessage.class));
    }

    public static final Object CONST_class = "Mockery\\ExpectsHigherOrderMessage";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends HigherOrderMessage.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Mockery\\ExpectsHigherOrderMessage")
                    .setLookup(
                            ExpectsHigherOrderMessage.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("method", "mock")
                    .setFilename(
                            "vendor/mockery/mockery/library/Mockery/ExpectsHigherOrderMessage.php")
                    .addExtendsClass("Mockery\\HigherOrderMessage")
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
