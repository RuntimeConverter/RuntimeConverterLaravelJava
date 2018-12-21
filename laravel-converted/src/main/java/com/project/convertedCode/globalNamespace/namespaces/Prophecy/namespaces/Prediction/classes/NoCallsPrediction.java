package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prediction.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prediction.classes.UnexpectedCallsException;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prediction.classes.PredictionInterface;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Util.classes.StringUtil;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Prediction/NoCallsPrediction.php

*/

public class NoCallsPrediction extends RuntimeClassBase implements PredictionInterface {

    public Object util = null;

    public NoCallsPrediction(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == NoCallsPrediction.class) {
            this.__construct(env, args);
        }
    }

    public NoCallsPrediction(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "util",
        typeHint = "Prophecy\\Util\\StringUtil",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object util = assignParameter(args, 0, true);
        if (null == util) {
            util = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.util =
                ZVal.isTrue(ternaryExpressionTemp = util)
                        ? ternaryExpressionTemp
                        : new StringUtil(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "calls", typeHint = "array")
    @ConvertedParameter(index = 1, name = "object", typeHint = "Prophecy\\Prophecy\\ObjectProphecy")
    @ConvertedParameter(index = 2, name = "method", typeHint = "Prophecy\\Prophecy\\MethodProphecy")
    public Object check(RuntimeEnv env, Object... args) {
        Object calls = assignParameter(args, 0, false);
        Object _object = assignParameter(args, 1, false);
        Object method = assignParameter(args, 2, false);
        Object verb = null;
        if (!function_count.f.env(env).call(calls).getBool()) {
            return null;
        }

        verb =
                ZVal.assign(
                        ZVal.strictEqualityCheck(
                                        function_count.f.env(env).call(calls).value(), "===", 1)
                                ? "was"
                                : "were");
        throw ZVal.getException(
                env,
                new UnexpectedCallsException(
                        env,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "No calls expected that match:\n"
                                                + "  %s->%s(%s)\n"
                                                + "but %d %s made:\n%s",
                                        function_get_class
                                                .f
                                                .env(env)
                                                .call(
                                                        env.callMethod(
                                                                _object,
                                                                "reveal",
                                                                NoCallsPrediction.class))
                                                .value(),
                                        env.callMethod(
                                                method, "getMethodName", NoCallsPrediction.class),
                                        env.callMethod(
                                                method,
                                                "getArgumentsWildcard",
                                                NoCallsPrediction.class),
                                        function_count.f.env(env).call(calls).value(),
                                        verb,
                                        env.callMethod(
                                                this.util,
                                                "stringifyCalls",
                                                NoCallsPrediction.class,
                                                calls))
                                .value(),
                        method,
                        calls));
    }

    public static final Object CONST_class = "Prophecy\\Prediction\\NoCallsPrediction";

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
                    .setName("Prophecy\\Prediction\\NoCallsPrediction")
                    .setLookup(
                            NoCallsPrediction.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("util")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Prediction/NoCallsPrediction.php")
                    .addInterface("Prophecy\\Prediction\\PredictionInterface")
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
