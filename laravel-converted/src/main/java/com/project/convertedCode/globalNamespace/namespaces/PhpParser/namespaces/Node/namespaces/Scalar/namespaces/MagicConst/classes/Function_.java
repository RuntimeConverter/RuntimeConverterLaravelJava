package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Scalar.namespaces.MagicConst.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Scalar.classes.MagicConst;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Node/Scalar/MagicConst/Function_.php

*/

public class Function_ extends MagicConst {

    public Function_(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Function_.class) {
            this.__construct(env, args);
        }
    }

    public Function_(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "__FUNCTION__";
    }

    @ConvertedMethod
    public Object getType(RuntimeEnv env, Object... args) {
        return "Scalar_MagicConst_Function";
    }

    public static final Object CONST_class = "PhpParser\\Node\\Scalar\\MagicConst\\Function_";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends MagicConst.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PhpParser\\Node\\Scalar\\MagicConst\\Function_")
                    .setLookup(
                            Function_.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes")
                    .setFilename(
                            "vendor/nikic/php-parser/lib/PhpParser/Node/Scalar/MagicConst/Function_.php")
                    .addInterface("PhpParser\\Node")
                    .addInterface("JsonSerializable")
                    .addExtendsClass("PhpParser\\Node\\Scalar\\MagicConst")
                    .addExtendsClass("PhpParser\\Node\\Scalar")
                    .addExtendsClass("PhpParser\\Node\\Expr")
                    .addExtendsClass("PhpParser\\NodeAbstract")
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
