package com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Handler.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Exception.classes.Formatter;
import com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Handler.classes.Handler;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_num_args;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import java.lang.Class;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/filp/whoops/src/Whoops/Handler/XmlResponseHandler.php

*/

public class XmlResponseHandler extends Handler {

    public Object returnFrames = false;

    public XmlResponseHandler(RuntimeEnv env, Object... args) {
        super(env);
    }

    public XmlResponseHandler(NoConstructor n) {
        super(n);
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
        response =
                ZVal.newArray(
                        new ZPair(
                                "error",
                                Formatter.runtimeStaticObject.formatExceptionAsDataArray(
                                        env,
                                        env.callMethod(
                                                this, "getInspector", XmlResponseHandler.class),
                                        this.addTraceToOutput(env))));
        env.echo(env.callMethod(this, "toXml", XmlResponseHandler.class, response));
        return ZVal.assign(Handler.CONST_QUIT);
    }

    @ConvertedMethod
    public Object contentType(RuntimeEnv env, Object... args) {
        return "application/xml";
    }

    public static final Object CONST_class = "Whoops\\Handler\\XmlResponseHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Handler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "node", typeHint = "SimpleXMLElement")
        @ConvertedParameter(index = 1, name = "data")
        private Object addDataToNode(RuntimeEnv env, Object... args) {
            Object node = assignParameter(args, 0, false);
            Object data = assignParameter(args, 1, false);
            Object value = null;
            Object key = null;
            Object child = null;
            com.runtimeconverter.runtime.ZVal.functionNotFound("_pAssert")
                    .env(env)
                    .call(
                            ZVal.toBool(function_is_array.f.env(env).call(data).value())
                                    || ZVal.toBool(
                                            ZVal.checkInstanceType(
                                                    data, (Class) null, "Traversable", env)));
            for (ZPair zpairResult51 : ZVal.getIterable(data, env, false)) {
                key = ZVal.assign(zpairResult51.getKey());
                value = ZVal.assign(zpairResult51.getValue());
                if (function_is_numeric.f.env(env).call(key).getBool()) {
                    key = "unknownNode_" + toStringR(toStringR(key, env), env);
                }

                key =
                        function_preg_replace
                                .f
                                .env(env)
                                .call("/[^a-z0-9\\-\\_\\.\\:]/i", "", key)
                                .value();
                if (function_is_array.f.env(env).call(value).getBool()) {
                    child = env.callMethod(node, "addChild", XmlResponseHandler.class, key);
                    runtimeStaticObject.addDataToNode(env, child, value);

                } else {
                    value =
                            function_str_replace
                                    .f
                                    .env(env)
                                    .call(
                                            "&",
                                            "&amp;",
                                            NamespaceGlobal.print_r
                                                    .env(env)
                                                    .call(value, true)
                                                    .value())
                                    .value();
                    env.callMethod(node, "addChild", XmlResponseHandler.class, key, value);
                }
            }

            return ZVal.assign(node);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "data")
        private Object toXml(RuntimeEnv env, Object... args) {
            Object data = assignParameter(args, 0, false);
            Object node = null;
            com.runtimeconverter.runtime.ZVal.functionNotFound("_pAssert")
                    .env(env)
                    .call(
                            ZVal.toBool(function_is_array.f.env(env).call(data).value())
                                    || ZVal.toBool(
                                            ZVal.checkInstanceType(
                                                    data, (Class) null, "Traversable", env)));
            node =
                    NamespaceGlobal.simplexml_load_string
                            .env(env)
                            .call("<?xml version='1.0' encoding='utf-8'?><root />")
                            .value();
            return ZVal.assign(
                    env.callMethod(
                            runtimeStaticObject.addDataToNode(env, node, data),
                            "asXML",
                            XmlResponseHandler.class));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Whoops\\Handler\\XmlResponseHandler")
                    .setLookup(
                            XmlResponseHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("exception", "inspector", "returnFrames", "run")
                    .setFilename("vendor/filp/whoops/src/Whoops/Handler/XmlResponseHandler.php")
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
