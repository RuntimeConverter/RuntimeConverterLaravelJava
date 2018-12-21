package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.namespaces.StringManipulation.namespaces.Pass.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass/InstanceMockPass.php

*/

public class InstanceMockPass extends RuntimeClassBase {

    public InstanceMockPass(RuntimeEnv env, Object... args) {
        super(env);
    }

    public InstanceMockPass(NoConstructor n) {
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
        if (ZVal.isTrue(env.callMethod(config, "isInstanceMock", InstanceMockPass.class))) {
            code =
                    this.appendToClass(
                            env,
                            code,
                            ClassConstantUtils.getConstantValueLateStatic(
                                    env, this, "INSTANCE_MOCK_CODE"));
        }

        return ZVal.assign(code);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "code")
    protected Object appendToClass(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object code = assignParameter(args, 1, false);
        Object lastBrace = null;
        lastBrace = NamespaceGlobal.strrpos.env(env).call(_pClass, "}").value();
        _pClass =
                toStringR(function_substr.f.env(env).call(_pClass, 0, lastBrace).value(), env)
                        + toStringR(code, env)
                        + "\n    }\n";
        return ZVal.assign(_pClass);
    }

    public static final Object CONST_INSTANCE_MOCK_CODE =
            ZVal.getResourceAsString("stringLiterals/stringLiteral1634.txt");

    public static final Object CONST_class =
            "Mockery\\Generator\\StringManipulation\\Pass\\InstanceMockPass";

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
                    .setName("Mockery\\Generator\\StringManipulation\\Pass\\InstanceMockPass")
                    .setLookup(
                            InstanceMockPass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass/InstanceMockPass.php")
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
