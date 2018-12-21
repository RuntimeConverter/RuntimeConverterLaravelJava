package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prediction.classes;

import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.AnyValuesToken;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.classes.ArgumentsWildcard;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prediction.classes.NoCallsException;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prediction.classes.PredictionInterface;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Util.classes.StringUtil;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Prediction/CallPrediction.php

*/

public class CallPrediction extends RuntimeClassBase implements PredictionInterface {

    public Object util = null;

    public CallPrediction(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CallPrediction.class) {
            this.__construct(env, args);
        }
    }

    public CallPrediction(NoConstructor n) {
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
        Object methodCalls = null;
        if (function_count.f.env(env).call(calls).getBool()) {
            return null;
        }

        methodCalls =
                env.callMethod(
                        _object,
                        "findProphecyMethodCalls",
                        CallPrediction.class,
                        env.callMethod(method, "getMethodName", CallPrediction.class),
                        new ArgumentsWildcard(
                                env, ZVal.newArray(new ZPair(0, new AnyValuesToken(env)))));
        if (function_count.f.env(env).call(methodCalls).getBool()) {
            throw ZVal.getException(
                    env,
                    new NoCallsException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "No calls have been made that match:\n"
                                                    + "  %s->%s(%s)\n"
                                                    + "but expected at least one.\n"
                                                    + "Recorded `%s(...)` calls:\n%s",
                                            function_get_class
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            env.callMethod(
                                                                    _object,
                                                                    "reveal",
                                                                    CallPrediction.class))
                                                    .value(),
                                            env.callMethod(
                                                    method, "getMethodName", CallPrediction.class),
                                            env.callMethod(
                                                    method,
                                                    "getArgumentsWildcard",
                                                    CallPrediction.class),
                                            env.callMethod(
                                                    method, "getMethodName", CallPrediction.class),
                                            env.callMethod(
                                                    this.util,
                                                    "stringifyCalls",
                                                    CallPrediction.class,
                                                    methodCalls))
                                    .value(),
                            method));
        }

        throw ZVal.getException(
                env,
                new NoCallsException(
                        env,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "No calls have been made that match:\n"
                                                + "  %s->%s(%s)\n"
                                                + "but expected at least one.",
                                        function_get_class
                                                .f
                                                .env(env)
                                                .call(
                                                        env.callMethod(
                                                                _object,
                                                                "reveal",
                                                                CallPrediction.class))
                                                .value(),
                                        env.callMethod(
                                                method, "getMethodName", CallPrediction.class),
                                        env.callMethod(
                                                method,
                                                "getArgumentsWildcard",
                                                CallPrediction.class))
                                .value(),
                        method));
    }

    public static final Object CONST_class = "Prophecy\\Prediction\\CallPrediction";

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
                    .setName("Prophecy\\Prediction\\CallPrediction")
                    .setLookup(
                            CallPrediction.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("util")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Prediction/CallPrediction.php")
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
