package com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Util.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_error_handler;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_end_clean;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_error_reporting;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_error_handler;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_register_shutdown_function;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_exception_handler;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_get_clean;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_start;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_exception_handler;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_error_get_last;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_get_level;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/filp/whoops/src/Whoops/Util/SystemFacade.php

*/

public class SystemFacade extends RuntimeClassBase {

    public SystemFacade(RuntimeEnv env, Object... args) {
        super(env);
    }

    public SystemFacade(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object startOutputBuffering(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_ob_start.f.env(env).call().value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "handler", typeHint = "callable")
    @ConvertedParameter(index = 1, name = "types")
    public Object setErrorHandler(RuntimeEnv env, Object... args) {
        Object handler = assignParameter(args, 0, false);
        Object types = assignParameter(args, 1, true);
        if (null == types) {
            types = "use-php-defaults";
        }
        if (ZVal.strictEqualityCheck(types, "===", "use-php-defaults")) {
            types = ZVal.toLong(32767) | ZVal.toLong(2048);
        }

        return ZVal.assign(function_set_error_handler.f.env(env).call(handler, types).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "handler", typeHint = "callable")
    public Object setExceptionHandler(RuntimeEnv env, Object... args) {
        Object handler = assignParameter(args, 0, false);
        return ZVal.assign(function_set_exception_handler.f.env(env).call(handler).value());
    }

    @ConvertedMethod
    public Object restoreExceptionHandler(RuntimeEnv env, Object... args) {
        function_restore_exception_handler.f.env(env).call();
        return null;
    }

    @ConvertedMethod
    public Object restoreErrorHandler(RuntimeEnv env, Object... args) {
        function_restore_error_handler.f.env(env).call();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "function", typeHint = "callable")
    public Object registerShutdownFunction(RuntimeEnv env, Object... args) {
        Object function = assignParameter(args, 0, false);
        function_register_shutdown_function.f.env(env).call(function);
        return null;
    }

    @ConvertedMethod
    public Object cleanOutputBuffer(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_ob_get_clean.f.env(env).call().value());
    }

    @ConvertedMethod
    public Object getOutputBufferLevel(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_ob_get_level.f.env(env).call().value());
    }

    @ConvertedMethod
    public Object endOutputBuffering(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_ob_end_clean.f.env(env).call().value());
    }

    @ConvertedMethod
    public Object flushOutputBuffer(RuntimeEnv env, Object... args) {
        NamespaceGlobal.flush.env(env).call();
        return null;
    }

    @ConvertedMethod
    public Object getErrorReportingLevel(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_error_reporting.f.env(env).call().value());
    }

    @ConvertedMethod
    public Object getLastError(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_error_get_last.f.env(env).call().value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "httpCode")
    public Object setHttpResponseCode(RuntimeEnv env, Object... args) {
        Object httpCode = assignParameter(args, 0, false);
        return ZVal.assign(NamespaceGlobal.http_response_code.env(env).call(httpCode).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exitStatus")
    public Object stopExecution(RuntimeEnv env, Object... args) {
        Object exitStatus = assignParameter(args, 0, false);
        env.exit(exitStatus);
        return null;
    }

    public static final Object CONST_class = "Whoops\\Util\\SystemFacade";

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
                    .setName("Whoops\\Util\\SystemFacade")
                    .setLookup(
                            SystemFacade.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/filp/whoops/src/Whoops/Util/SystemFacade.php")
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
