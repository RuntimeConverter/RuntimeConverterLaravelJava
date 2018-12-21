package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.namespaces.StringManipulation.namespaces.Pass.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.namespaces.StringManipulation.namespaces.Pass.classes.Pass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass/ClassNamePass.php

*/

public class ClassNamePass extends RuntimeClassBase implements Pass {

    public ClassNamePass(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ClassNamePass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    @ConvertedParameter(
        index = 1,
        name = "config",
        typeHint = "Mockery\\Generator\\MockConfiguration"
    )
    public Object apply(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object config = assignParameter(args, 1, false);
        Object namespace = null;
        Object className = null;
        namespace = env.callMethod(config, "getNamespaceName", ClassNamePass.class);
        namespace = function_ltrim.f.env(env).call(namespace, "\\").value();
        className = env.callMethod(config, "getShortName", ClassNamePass.class);
        code =
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                "namespace Mockery;",
                                ZVal.isTrue(namespace)
                                        ? "namespace " + toStringR(namespace, env) + ";"
                                        : "",
                                code)
                        .value();
        code =
                function_str_replace
                        .f
                        .env(env)
                        .call("class Mock", "class " + toStringR(className, env), code)
                        .value();
        return ZVal.assign(code);
    }

    public static final Object CONST_class =
            "Mockery\\Generator\\StringManipulation\\Pass\\ClassNamePass";

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
                    .setName("Mockery\\Generator\\StringManipulation\\Pass\\ClassNamePass")
                    .setLookup(
                            ClassNamePass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass/ClassNamePass.php")
                    .addInterface("Mockery\\Generator\\StringManipulation\\Pass\\Pass")
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
