package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.GlobalState.classes;

import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_scalar;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
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
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/global-state/src/CodeExporter.php

*/

public class CodeExporter extends RuntimeClassBase {

    public CodeExporter(RuntimeEnv env, Object... args) {
        super(env);
    }

    public CodeExporter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "snapshot",
        typeHint = "SebastianBergmann\\GlobalState\\Snapshot"
    )
    public Object constants(RuntimeEnv env, Object... args) {
        Object snapshot = assignParameter(args, 0, false);
        Object result = null;
        Object name = null;
        Object value = null;
        result = "";
        for (ZPair zpairResult1462 :
                ZVal.getIterable(
                        env.callMethod(snapshot, "constants", CodeExporter.class), env, false)) {
            name = ZVal.assign(zpairResult1462.getKey());
            value = ZVal.assign(zpairResult1462.getValue());
            result =
                    toStringR(result, env)
                            + toStringR(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "if (!defined('%s')) define('%s', %s);" + "\n",
                                                    name, name, this.exportVariable(env, value))
                                            .value(),
                                    env);
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "snapshot",
        typeHint = "SebastianBergmann\\GlobalState\\Snapshot"
    )
    public Object globalVariables(RuntimeEnv env, Object... args) {
        Object snapshot = assignParameter(args, 0, false);
        Object result = null;
        Object name = null;
        Object value = null;
        result = "$GLOBALS = [];" + toStringR("\n", env);
        for (ZPair zpairResult1463 :
                ZVal.getIterable(
                        env.callMethod(snapshot, "globalVariables", CodeExporter.class),
                        env,
                        false)) {
            name = ZVal.assign(zpairResult1463.getKey());
            value = ZVal.assign(zpairResult1463.getValue());
            result =
                    toStringR(result, env)
                            + toStringR(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "$GLOBALS[%s] = %s;" + toStringR("\n", env),
                                                    this.exportVariable(env, name),
                                                    this.exportVariable(env, value))
                                            .value(),
                                    env);
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "snapshot",
        typeHint = "SebastianBergmann\\GlobalState\\Snapshot"
    )
    public Object iniSettings(RuntimeEnv env, Object... args) {
        Object snapshot = assignParameter(args, 0, false);
        Object result = null;
        Object value = null;
        Object key = null;
        result = "";
        for (ZPair zpairResult1464 :
                ZVal.getIterable(
                        env.callMethod(snapshot, "iniSettings", CodeExporter.class), env, false)) {
            key = ZVal.assign(zpairResult1464.getKey());
            value = ZVal.assign(zpairResult1464.getValue());
            result =
                    toStringR(result, env)
                            + toStringR(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "@ini_set(%s, %s);" + "\n",
                                                    this.exportVariable(env, key),
                                                    this.exportVariable(env, value))
                                            .value(),
                                    env);
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "variable")
    private Object exportVariable(RuntimeEnv env, Object... args) {
        Object variable = assignParameter(args, 0, false);
        if (ZVal.toBool(
                        ZVal.toBool(function_is_scalar.f.env(env).call(variable).value())
                                || ZVal.toBool(function_is_null.f.env(env).call(variable).value()))
                || ZVal.toBool(
                        ZVal.toBool(function_is_array.f.env(env).call(variable).value())
                                && ZVal.toBool(this.arrayOnlyContainsScalars(env, variable)))) {
            return ZVal.assign(NamespaceGlobal.var_export.env(env).call(variable, true).value());
        }

        return ZVal.assign(
                "unserialize("
                        + toStringR(
                                NamespaceGlobal.var_export
                                        .env(env)
                                        .call(
                                                function_serialize
                                                        .f
                                                        .env(env)
                                                        .call(variable)
                                                        .value(),
                                                true)
                                        .value(),
                                env)
                        + ")");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "array", typeHint = "array")
    private Object arrayOnlyContainsScalars(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object array = assignParameter(args, 0, false);
        Object result = null;
        Object element = null;
        result = true;
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1465 : ZVal.getIterable(array, env, true)) {
            element = ZVal.assign(zpairResult1465.getValue());
            if (function_is_array.f.env(env).call(element).getBool()) {
                result = this.arrayOnlyContainsScalars(env, element);

            } else if (ZVal.toBool(!function_is_scalar.f.env(env).call(element).getBool())
                    && ZVal.toBool(!function_is_null.f.env(env).call(element).getBool())) {
                result = false;
            }

            if (ZVal.strictEqualityCheck(result, "===", false)) {
                break;
            }
        }

        return ZVal.assign(result);
    }

    public static final Object CONST_class = "SebastianBergmann\\GlobalState\\CodeExporter";

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
                    .setName("SebastianBergmann\\GlobalState\\CodeExporter")
                    .setLookup(
                            CodeExporter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/sebastian/global-state/src/CodeExporter.php")
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
