package com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Handler.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Exception.classes.Formatter;
import com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Handler.classes.Handler;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_num_args;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/filp/whoops/src/Whoops/Handler/JsonResponseHandler.php

*/

public class JsonResponseHandler extends Handler {

    public Object returnFrames = false;

    public Object jsonApi = false;

    public JsonResponseHandler(RuntimeEnv env, Object... args) {
        super(env);
    }

    public JsonResponseHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "jsonApi",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object setJsonApi(RuntimeEnv env, Object... args) {
        Object jsonApi = assignParameter(args, 0, true);
        if (null == jsonApi) {
            jsonApi = false;
        }
        this.jsonApi = ZVal.toBool(jsonApi);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "returnFrames",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object addTraceToOutput(RuntimeEnv env, Object... args) {
        Object returnFrames = assignParameter(args, 0, true);
        if (null == returnFrames) {
            returnFrames = ZVal.getNull();
        }
        if (ZVal.equalityCheck(
                function_func_num_args
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call()
                        .value(),
                0)) {
            return ZVal.assign(this.returnFrames);
        }

        this.returnFrames = ZVal.toBool(returnFrames);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        Object response = null;
        if (ZVal.strictEqualityCheck(this.jsonApi, "===", true)) {
            response =
                    ZVal.newArray(
                            new ZPair(
                                    "errors",
                                    ZVal.newArray(
                                            new ZPair(
                                                    0,
                                                    Formatter.runtimeStaticObject
                                                            .formatExceptionAsDataArray(
                                                                    env,
                                                                    env.callMethod(
                                                                            this,
                                                                            "getInspector",
                                                                            JsonResponseHandler
                                                                                    .class),
                                                                    this.addTraceToOutput(env))))));

        } else {
            response =
                    ZVal.newArray(
                            new ZPair(
                                    "error",
                                    Formatter.runtimeStaticObject.formatExceptionAsDataArray(
                                            env,
                                            env.callMethod(
                                                    this,
                                                    "getInspector",
                                                    JsonResponseHandler.class),
                                            this.addTraceToOutput(env))));
        }

        env.echo(
                NamespaceGlobal.json_encode
                        .env(env)
                        .call(
                                response,
                                function_defined
                                                .f
                                                .env(env)
                                                .call("JSON_PARTIAL_OUTPUT_ON_ERROR")
                                                .getBool()
                                        ? 512
                                        : 0)
                        .value());
        return ZVal.assign(Handler.CONST_QUIT);
    }

    @ConvertedMethod
    public Object contentType(RuntimeEnv env, Object... args) {
        return "application/json";
    }

    public static final Object CONST_class = "Whoops\\Handler\\JsonResponseHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Handler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Whoops\\Handler\\JsonResponseHandler")
                    .setLookup(
                            JsonResponseHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("exception", "inspector", "jsonApi", "returnFrames", "run")
                    .setFilename("vendor/filp/whoops/src/Whoops/Handler/JsonResponseHandler.php")
                    .addInterface("Whoops\\Handler\\HandlerInterface")
                    .addExtendsClass("Whoops\\Handler\\Handler")
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
