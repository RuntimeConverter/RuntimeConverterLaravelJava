package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
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

 vendor/mockery/mockery/library/Mockery/Generator/MockDefinition.php

*/

public class MockDefinition extends RuntimeClassBase {

    public Object config = null;

    public Object code = null;

    public MockDefinition(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MockDefinition.class) {
            this.__construct(env, args);
        }
    }

    public MockDefinition(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "config",
        typeHint = "Mockery\\Generator\\MockConfiguration"
    )
    @ConvertedParameter(index = 1, name = "code")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object config = assignParameter(args, 0, false);
        Object code = assignParameter(args, 1, false);
        if (!ZVal.isTrue(env.callMethod(config, "getName", MockDefinition.class))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(env, "MockConfiguration must contain a name"));
        }

        this.config = config;
        this.code = code;
        return null;
    }

    @ConvertedMethod
    public Object getConfig(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.config);
    }

    @ConvertedMethod
    public Object getClassName(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.config, "getName", MockDefinition.class));
    }

    @ConvertedMethod
    public Object getCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.code);
    }

    public static final Object CONST_class = "Mockery\\Generator\\MockDefinition";

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
                    .setName("Mockery\\Generator\\MockDefinition")
                    .setLookup(
                            MockDefinition.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("code", "config")
                    .setFilename(
                            "vendor/mockery/mockery/library/Mockery/Generator/MockDefinition.php")
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
