package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Error.classes.Warning;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_error_handler;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Error.classes.Notice;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Error.classes.Deprecated;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Error.classes.Error;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_error_reporting;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_error_handler;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/ErrorHandler.php

*/

public final class ErrorHandler extends RuntimeClassBase {

    public ErrorHandler(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ErrorHandler(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "PHPUnit\\Util\\ErrorHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object getErrorStack(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .PHPUnit
                                            .namespaces
                                            .Util
                                            .classes
                                            .ErrorHandler
                                            .RequestStaticProperties
                                            .class)
                            .errorStack);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "errorNumber", typeHint = "int")
        @ConvertedParameter(index = 1, name = "errorString", typeHint = "string")
        @ConvertedParameter(index = 2, name = "errorFile", typeHint = "string")
        @ConvertedParameter(index = 3, name = "errorLine", typeHint = "int")
        public Object handleError(RuntimeEnv env, Object... args) {
            Object errorNumber = assignParameter(args, 0, false);
            Object errorString = assignParameter(args, 1, false);
            Object errorFile = assignParameter(args, 2, false);
            Object errorLine = assignParameter(args, 3, false);
            Object exception = null;
            Object trace = null;
            ReferenceContainer frame = new BasicReferenceContainer(null);
            if (!ZVal.isTrue(
                    ZVal.toLong(errorNumber)
                            & ZVal.toLong(function_error_reporting.f.env(env).call().value()))) {
                return ZVal.assign(false);
            }

            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .PHPUnit
                                    .namespaces
                                    .Util
                                    .classes
                                    .ErrorHandler
                                    .RequestStaticProperties
                                    .class,
                            "errorStack")
                    .arrayAppend(env)
                    .set(
                            ZVal.newArray(
                                    new ZPair(0, errorNumber),
                                    new ZPair(1, errorString),
                                    new ZPair(2, errorFile),
                                    new ZPair(3, errorLine)));
            trace = NamespaceGlobal.debug_backtrace.env(env).call().value();
            function_array_shift.f.env(env).call(trace);
            for (ZPair zpairResult1283 : ZVal.getIterable(trace, env, true)) {
                frame.setObject(ZVal.assign(zpairResult1283.getValue()));
                if (ZVal.strictEqualityCheck(
                        frame.arrayGet(env, "function"), "===", "__toString")) {
                    return ZVal.assign(false);
                }
            }

            if (ZVal.toBool(
                            ZVal.toBool(ZVal.strictEqualityCheck(errorNumber, "===", 8))
                                    || ZVal.toBool(
                                            ZVal.strictEqualityCheck(errorNumber, "===", 1024)))
                    || ZVal.toBool(ZVal.strictEqualityCheck(errorNumber, "===", 2048))) {
                if (ZVal.strictNotEqualityCheck(
                        env.getRequestStaticProperties(Notice.RequestStaticProperties.class)
                                .enabled,
                        "!==",
                        true)) {
                    return ZVal.assign(false);
                }

                exception = ZVal.assign(Notice.CONST_class);

            } else if (ZVal.toBool(ZVal.strictEqualityCheck(errorNumber, "===", 2))
                    || ZVal.toBool(ZVal.strictEqualityCheck(errorNumber, "===", 512))) {
                if (ZVal.strictNotEqualityCheck(
                        env.getRequestStaticProperties(Warning.RequestStaticProperties.class)
                                .enabled,
                        "!==",
                        true)) {
                    return ZVal.assign(false);
                }

                exception = ZVal.assign(Warning.CONST_class);

            } else if (ZVal.toBool(ZVal.strictEqualityCheck(errorNumber, "===", 8192))
                    || ZVal.toBool(ZVal.strictEqualityCheck(errorNumber, "===", 16384))) {
                if (ZVal.strictNotEqualityCheck(
                        env.getRequestStaticProperties(Deprecated.RequestStaticProperties.class)
                                .enabled,
                        "!==",
                        true)) {
                    return ZVal.assign(false);
                }

                exception = ZVal.assign(Deprecated.CONST_class);

            } else {
                exception = ZVal.assign(Error.CONST_class);
            }

            throw ZVal.getException(
                    env, env.createNew(exception, errorString, errorNumber, errorFile, errorLine));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "severity")
        public Object handleErrorOnce(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/phpunit/phpunit/src/Util")
                            .setFile("/vendor/phpunit/phpunit/src/Util/ErrorHandler.php");
            Object severity = assignParameter(args, 0, true);
            if (null == severity) {
                severity = 2;
            }
            Object terminator = null;
            terminator =
                    new Closure(
                            env, runtimeConverterFunctionClassConstants, "PHPUnit\\Util", this) {
                        @Override
                        @ConvertedMethod
                        public Object run(
                                RuntimeEnv env,
                                Object thisvar,
                                PassByReferenceArgs runtimePassByReferenceArgs,
                                Object... args) {
                            ReferenceContainer expired = new BasicReferenceContainer(null);
                            expired = env.getInlineStatic(22, false);
                            if (!ZVal.isTrue(expired.getObject())) {
                                expired.setObject(true);
                                return ZVal.assign(
                                        function_restore_error_handler.f.env(env).call().value());
                            }

                            return null;
                        }
                    };
            function_set_error_handler
                    .f
                    .env(env)
                    .call(
                            new Closure(
                                    env,
                                    runtimeConverterFunctionClassConstants,
                                    "PHPUnit\\Util",
                                    this) {
                                @Override
                                @ConvertedMethod
                                @ConvertedParameter(index = 0, name = "errorNumber")
                                @ConvertedParameter(index = 1, name = "errorString")
                                public Object run(
                                        RuntimeEnv env,
                                        Object thisvar,
                                        PassByReferenceArgs runtimePassByReferenceArgs,
                                        Object... args) {
                                    Object errorNumber = assignParameter(args, 0, false);
                                    Object errorString = assignParameter(args, 1, false);
                                    Object severity = null;
                                    severity = this.contextReferences.getCapturedValue("severity");
                                    if (ZVal.strictEqualityCheck(errorNumber, "===", severity)) {
                                        return null;
                                    }

                                    return ZVal.assign(false);
                                }
                            }.use("severity", severity));
            return ZVal.assign(terminator);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object errorStack = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\ErrorHandler")
                    .setLookup(
                            ErrorHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("errorStack")
                    .setFilename("vendor/phpunit/phpunit/src/Util/ErrorHandler.php")
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
