package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Stmt;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Node/Stmt/Finally_.php

*/

public class Finally_ extends Stmt {

    public Object stmts = null;

    public Finally_(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Finally_.class) {
            this.__construct(env, args);
        }
    }

    public Finally_(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "stmts",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 1,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object stmts = assignParameter(args, 0, true);
        if (null == stmts) {
            stmts = ZVal.newArray();
        }
        Object attributes = assignParameter(args, 1, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        super.__construct(env, attributes);
        this.stmts = stmts;
        return null;
    }

    @ConvertedMethod
    public Object getSubNodeNames(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.arrayFromList("stmts"));
    }

    @ConvertedMethod
    public Object getType(RuntimeEnv env, Object... args) {
        return "Stmt_Finally";
    }

    public static final Object CONST_class = "PhpParser\\Node\\Stmt\\Finally_";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Stmt.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PhpParser\\Node\\Stmt\\Finally_")
                    .setLookup(
                            Finally_.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes", "stmts")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Node/Stmt/Finally_.php")
                    .addInterface("PhpParser\\Node")
                    .addInterface("JsonSerializable")
                    .addExtendsClass("PhpParser\\Node\\Stmt")
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
