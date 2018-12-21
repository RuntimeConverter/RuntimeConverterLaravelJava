package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.namespaces.StringManipulation.namespaces.Pass.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
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
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.namespaces.StringManipulation.namespaces.Pass.classes.Pass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass/TraitPass.php

*/

public class TraitPass extends RuntimeClassBase implements Pass {

    public TraitPass(RuntimeEnv env, Object... args) {
        super(env);
    }

    public TraitPass(NoConstructor n) {
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
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass")
                        .setFile(
                                "/vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass/TraitPass.php");
        Object code = assignParameter(args, 0, false);
        Object config = assignParameter(args, 1, false);
        Object useStatements = null;
        Object traits = null;
        traits = env.callMethod(config, "getTargetTraits", TraitPass.class);
        if (ZVal.isEmpty(traits)) {
            return ZVal.assign(code);
        }

        useStatements =
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Mockery\\Generator\\StringManipulation\\Pass",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "trait")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object trait = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                "use \\\\"
                                                        + toStringR(
                                                                function_ltrim
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                env.callMethod(
                                                                                        trait,
                                                                                        "getName",
                                                                                        TraitPass
                                                                                                .class),
                                                                                "\\")
                                                                        .value(),
                                                                env)
                                                        + ";");
                                    }
                                },
                                traits)
                        .value();
        code =
                function_preg_replace
                        .f
                        .env(env)
                        .call(
                                "/^{$/m",
                                "{\n    "
                                        + toStringR(
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call("\n    ", useStatements)
                                                        .value(),
                                                env)
                                        + "\n",
                                code)
                        .value();
        return ZVal.assign(code);
    }

    public static final Object CONST_class =
            "Mockery\\Generator\\StringManipulation\\Pass\\TraitPass";

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
                    .setName("Mockery\\Generator\\StringManipulation\\Pass\\TraitPass")
                    .setLookup(
                            TraitPass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass/TraitPass.php")
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
