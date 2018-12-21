package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.View.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.View.classes.ViewFinderInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/View/ViewName.php

*/

public class ViewName extends RuntimeClassBase {

    public ViewName(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ViewName(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Illuminate\\View\\ViewName";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        public Object normalize(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            Object runtimeTempArrayResult102 = null;
            Object delimiter = null;
            Object namespace = null;
            delimiter = ZVal.assign(ViewFinderInterface.CONST_HINT_PATH_DELIMITER);
            if (ZVal.strictEqualityCheck(
                    function_strpos.f.env(env).call(name, delimiter).value(), "===", false)) {
                return ZVal.assign(function_str_replace.f.env(env).call("/", ".", name).value());
            }

            ZVal.list(
                    runtimeTempArrayResult102 =
                            function_explode.f.env(env).call(delimiter, name).value(),
                    (namespace = listGet(runtimeTempArrayResult102, 0, env)),
                    (name = listGet(runtimeTempArrayResult102, 1, env)));
            return ZVal.assign(
                    toStringR(namespace, env)
                            + toStringR(delimiter, env)
                            + toStringR(
                                    function_str_replace.f.env(env).call("/", ".", name).value(),
                                    env));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\View\\ViewName")
                    .setLookup(
                            ViewName.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/laravel/framework/src/Illuminate/View/ViewName.php")
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
