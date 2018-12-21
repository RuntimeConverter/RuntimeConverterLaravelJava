package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.namespaces.Rules.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Validation/Rules/NotIn.php

*/

public class NotIn extends RuntimeClassBase {

    public Object rule = "not_in";

    public Object values = null;

    public NotIn(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == NotIn.class) {
            this.__construct(env, args);
        }
    }

    public NotIn(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, false);
        this.values = values;
        return null;
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Validation/Rules")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Validation/Rules/NotIn.php");
        Object values = null;
        values =
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Validation\\Rules",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "value")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object value = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                "\""
                                                        + toStringR(
                                                                function_str_replace
                                                                        .f
                                                                        .env(env)
                                                                        .call("\"", "\"\"", value)
                                                                        .value(),
                                                                env)
                                                        + "\"");
                                    }
                                },
                                this.values)
                        .value();
        return ZVal.assign(
                toStringR(this.rule, env)
                        + ":"
                        + toStringR(
                                NamespaceGlobal.implode.env(env).call(",", values).value(), env));
    }

    public static final Object CONST_class = "Illuminate\\Validation\\Rules\\NotIn";

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
                    .setName("Illuminate\\Validation\\Rules\\NotIn")
                    .setLookup(
                            NotIn.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("rule", "values")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Validation/Rules/NotIn.php")
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
