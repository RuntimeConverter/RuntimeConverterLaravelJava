package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.namespaces.StringManipulation.namespaces.Pass.classes;

import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reduce;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.classes.Mockery;
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
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass/InterfacePass.php

*/

public class InterfacePass extends RuntimeClassBase implements Pass {

    public InterfacePass(RuntimeEnv env, Object... args) {
        super(env);
    }

    public InterfacePass(NoConstructor n) {
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
                                "/vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass/InterfacePass.php");
        Object code = assignParameter(args, 0, false);
        Object config = assignParameter(args, 1, false);
        Object interfaces = null;
        Object name = null;
        Object i = null;
        for (ZPair zpairResult713 :
                ZVal.getIterable(
                        env.callMethod(config, "getTargetInterfaces", InterfacePass.class),
                        env,
                        true)) {
            i = ZVal.assign(zpairResult713.getValue());
            name =
                    function_ltrim
                            .f
                            .env(env)
                            .call(env.callMethod(i, "getName", InterfacePass.class), "\\")
                            .value();
            if (!NamespaceGlobal.interface_exists.env(env).call(name).getBool()) {
                Mockery.runtimeStaticObject.declareInterface(env, name);
            }
        }

        interfaces =
                function_array_reduce
                        .f
                        .env(env)
                        .call(
                                rToArrayCast(
                                        env.callMethod(
                                                config,
                                                "getTargetInterfaces",
                                                InterfacePass.class)),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Mockery\\Generator\\StringManipulation\\Pass",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "code")
                                    @ConvertedParameter(index = 1, name = "i")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object code = assignParameter(args, 0, false);
                                        Object i = assignParameter(args, 1, false);
                                        return ZVal.assign(
                                                toStringR(code, env)
                                                        + ", \\"
                                                        + toStringR(
                                                                function_ltrim
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                env.callMethod(
                                                                                        i,
                                                                                        "getName",
                                                                                        InterfacePass
                                                                                                .class),
                                                                                "\\")
                                                                        .value(),
                                                                env));
                                    }
                                },
                                "")
                        .value();
        code =
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                "implements MockInterface",
                                "implements MockInterface" + toStringR(interfaces, env),
                                code)
                        .value();
        return ZVal.assign(code);
    }

    public static final Object CONST_class =
            "Mockery\\Generator\\StringManipulation\\Pass\\InterfacePass";

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
                    .setName("Mockery\\Generator\\StringManipulation\\Pass\\InterfacePass")
                    .setLookup(
                            InterfacePass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass/InterfacePass.php")
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
