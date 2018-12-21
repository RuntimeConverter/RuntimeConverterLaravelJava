package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Call.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Call/Call.php

*/

public class Call extends RuntimeClassBase {

    public Object methodName = null;

    public Object arguments = null;

    public Object returnValue = null;

    public Object exception = null;

    public Object file = null;

    public Object line = null;

    public Call(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Call.class) {
            this.__construct(env, args);
        }
    }

    public Call(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methodName")
    @ConvertedParameter(index = 1, name = "arguments", typeHint = "array")
    @ConvertedParameter(index = 2, name = "returnValue")
    @ConvertedParameter(
        index = 3,
        name = "exception",
        typeHint = "Exception",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 4, name = "file")
    @ConvertedParameter(index = 5, name = "line")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object methodName = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, false);
        Object returnValue = assignParameter(args, 2, false);
        Object exception = assignParameter(args, 3, true);
        if (null == exception) {
            exception = ZVal.getNull();
        }
        Object file = assignParameter(args, 4, false);
        Object line = assignParameter(args, 5, false);
        this.methodName = methodName;
        this.arguments = arguments;
        this.returnValue = returnValue;
        this.exception = exception;
        if (ZVal.isTrue(file)) {
            this.file = file;
            this.line = NamespaceGlobal.intval.env(env).call(line).value();
        }

        return null;
    }

    @ConvertedMethod
    public Object getMethodName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.methodName);
    }

    @ConvertedMethod
    public Object getArguments(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.arguments);
    }

    @ConvertedMethod
    public Object getReturnValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.returnValue);
    }

    @ConvertedMethod
    public Object getException(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.exception);
    }

    @ConvertedMethod
    public Object getFile(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.file);
    }

    @ConvertedMethod
    public Object getLine(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.line);
    }

    @ConvertedMethod
    public Object getCallPlace(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.file)) {
            return "unknown";
        }

        return ZVal.assign(function_sprintf.f.env(env).call("%s:%d", this.file, this.line).value());
    }

    public static final Object CONST_class = "Prophecy\\Call\\Call";

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
                    .setName("Prophecy\\Call\\Call")
                    .setLookup(
                            Call.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "arguments", "exception", "file", "line", "methodName", "returnValue")
                    .setFilename("vendor/phpspec/prophecy/src/Prophecy/Call/Call.php")
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
