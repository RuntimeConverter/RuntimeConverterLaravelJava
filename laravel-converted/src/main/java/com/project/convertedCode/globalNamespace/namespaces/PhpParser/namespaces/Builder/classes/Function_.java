package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Builder.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.BuilderHelpers;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Builder.classes.FunctionLike;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Builder/Function_.php

*/

public class Function_ extends FunctionLike {

    public Object name = null;

    public Object stmts = ZVal.newArray();

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
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this.name = name;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stmt")
    public Object addStmt(RuntimeEnv env, Object... args) {
        Object stmt = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "stmts", env)
                .arrayAppend(env)
                .set(BuilderHelpers.runtimeStaticObject.normalizeStmt(env, stmt));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getNode(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .PhpParser
                        .namespaces
                        .Node
                        .namespaces
                        .Stmt
                        .classes
                        .Function_(
                        env,
                        this.name,
                        ZVal.newArray(
                                new ZPair(
                                        "byRef",
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("returnByRef")
                                                .value()),
                                new ZPair(
                                        "params",
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("params")
                                                .value()),
                                new ZPair(
                                        "returnType",
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("returnType")
                                                .value()),
                                new ZPair("stmts", this.stmts)),
                        toObjectR(this).accessProp(this, env).name("attributes").value()));
    }

    public static final Object CONST_class = "PhpParser\\Builder\\Function_";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends FunctionLike.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PhpParser\\Builder\\Function_")
                    .setLookup(
                            Function_.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "attributes", "name", "params", "returnByRef", "returnType", "stmts")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Builder/Function_.php")
                    .addInterface("PhpParser\\Builder")
                    .addExtendsClass("PhpParser\\Builder\\FunctionLike")
                    .addExtendsClass("PhpParser\\Builder\\Declaration")
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
