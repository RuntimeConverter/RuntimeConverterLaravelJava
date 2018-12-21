package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.Stub;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/MockObject/Stub/ReturnValueMap.php

*/

public class ReturnValueMap extends RuntimeClassBase implements Stub {

    public Object valueMap = null;

    public ReturnValueMap(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ReturnValueMap.class) {
            this.__construct(env, args);
        }
    }

    public ReturnValueMap(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "valueMap", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object valueMap = assignParameter(args, 0, false);
        this.valueMap = valueMap;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocation",
        typeHint = "PHPUnit\\Framework\\MockObject\\Invocation"
    )
    public Object invoke(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object invocation = assignParameter(args, 0, false);
        Object parameterCount = null;
        Object map = null;
        Object _pReturn = null;
        parameterCount =
                function_count
                        .f
                        .env(env)
                        .call(env.callMethod(invocation, "getParameters", ReturnValueMap.class))
                        .value();
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1168 : ZVal.getIterable(this.valueMap, env, true)) {
            map = ZVal.assign(zpairResult1168.getValue());
            if (ZVal.toBool(!function_is_array.f.env(env).call(map).getBool())
                    || ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    parameterCount,
                                    "!==",
                                    ZVal.subtract(
                                            function_count.f.env(env).call(map).value(), 1)))) {
                continue;
            }

            _pReturn = function_array_pop.f.env(env).call(map).value();
            if (ZVal.strictEqualityCheck(
                    env.callMethod(invocation, "getParameters", ReturnValueMap.class),
                    "===",
                    map)) {
                return ZVal.assign(_pReturn);
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return "return value from a map";
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\MockObject\\Stub\\ReturnValueMap";

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
                    .setName("PHPUnit\\Framework\\MockObject\\Stub\\ReturnValueMap")
                    .setLookup(
                            ReturnValueMap.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("valueMap")
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/MockObject/Stub/ReturnValueMap.php")
                    .addInterface("PHPUnit\\Framework\\MockObject\\Stub")
                    .addInterface("PHPUnit\\Framework\\SelfDescribing")
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
