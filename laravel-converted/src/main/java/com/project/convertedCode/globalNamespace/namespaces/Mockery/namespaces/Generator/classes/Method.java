package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.classes.Mockery;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.classes.Parameter;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Generator/Method.php

*/

public class Method extends RuntimeClassBase {

    public Object method = null;

    public Method(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Method.class) {
            this.__construct(env, args);
        }
    }

    public Method(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method", typeHint = "ReflectionMethod")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        this.method = method;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "args")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object ___args = assignParameter(args, 1, false);
        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                ZVal.newArray(new ZPair(0, this.method), new ZPair(1, method)),
                                ___args)
                        .value());
    }

    @ConvertedMethod
    public Object getParameters(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/mockery/mockery/library/Mockery/Generator")
                        .setFile("/vendor/mockery/mockery/library/Mockery/Generator/Method.php");
        return ZVal.assign(
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Mockery\\Generator",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "parameter")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object parameter = assignParameter(args, 0, false);
                                        return ZVal.assign(new Parameter(env, parameter));
                                    }
                                },
                                env.callMethod(this.method, "getParameters", Method.class))
                        .value());
    }

    @ConvertedMethod
    public Object getReturnType(RuntimeEnv env, Object... args) {
        Object returnType = null;
        if (ZVal.toBool(
                        ZVal.isGreaterThanOrEqualTo(
                                NamespaceGlobal.version_compare
                                        .env(env)
                                        .call("7.2.11-dev", "7.0.0-dev")
                                        .value(),
                                ">=",
                                0))
                && ZVal.toBool(env.callMethod(this.method, "hasReturnType", Method.class))) {
            returnType =
                    ZVal.assign(
                            toStringR(
                                    env.callMethod(this.method, "getReturnType", Method.class),
                                    env));
            if (ZVal.strictEqualityCheck("self", "===", returnType)) {
                returnType =
                        "\\"
                                + toStringR(
                                        env.callMethod(
                                                env.callMethod(
                                                        this.method,
                                                        "getDeclaringClass",
                                                        Method.class),
                                                "getName",
                                                Method.class),
                                        env);

            } else if (!ZVal.isTrue(Mockery.runtimeStaticObject.isBuiltInType(env, returnType))) {
                returnType = "\\" + toStringR(returnType, env);
            }

            if (ZVal.toBool(
                            ZVal.isGreaterThanOrEqualTo(
                                    NamespaceGlobal.version_compare
                                            .env(env)
                                            .call("7.2.11-dev", "7.1.0-dev")
                                            .value(),
                                    ">=",
                                    0))
                    && ZVal.toBool(
                            env.callMethod(
                                    env.callMethod(this.method, "getReturnType", Method.class),
                                    "allowsNull",
                                    Method.class))) {
                returnType = "?" + toStringR(returnType, env);
            }

            return ZVal.assign(returnType);
        }

        return "";
    }

    public static final Object CONST_class = "Mockery\\Generator\\Method";

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
                    .setName("Mockery\\Generator\\Method")
                    .setLookup(
                            Method.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("method")
                    .setFilename("vendor/mockery/mockery/library/Mockery/Generator/Method.php")
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
