package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Builder.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Class_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.BuilderHelpers;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.ClassMethod;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Builder.classes.FunctionLike;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Builder/Method.php

*/

public class Method extends FunctionLike {

    public Object name = null;

    public Object flags = 0;

    public Object stmts = ZVal.newArray();

    public Method(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Method.class) {
            this.__construct(env, args);
        }
    }

    public Method(NoConstructor n) {
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
    public Object makePublic(RuntimeEnv env, Object... args) {
        this.flags =
                BuilderHelpers.runtimeStaticObject.addModifier(
                        env, this.flags, Class_.CONST_MODIFIER_PUBLIC);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object makeProtected(RuntimeEnv env, Object... args) {
        this.flags =
                BuilderHelpers.runtimeStaticObject.addModifier(
                        env, this.flags, Class_.CONST_MODIFIER_PROTECTED);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object makePrivate(RuntimeEnv env, Object... args) {
        this.flags =
                BuilderHelpers.runtimeStaticObject.addModifier(
                        env, this.flags, Class_.CONST_MODIFIER_PRIVATE);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object makeStatic(RuntimeEnv env, Object... args) {
        this.flags =
                BuilderHelpers.runtimeStaticObject.addModifier(
                        env, this.flags, Class_.CONST_MODIFIER_STATIC);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object makeAbstract(RuntimeEnv env, Object... args) {
        if (!ZVal.isEmpty(this.stmts)) {
            throw ZVal.getException(
                    env, new LogicException(env, "Cannot make method with statements abstract"));
        }

        this.flags =
                BuilderHelpers.runtimeStaticObject.addModifier(
                        env, this.flags, Class_.CONST_MODIFIER_ABSTRACT);
        this.stmts = ZVal.getNull();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object makeFinal(RuntimeEnv env, Object... args) {
        this.flags =
                BuilderHelpers.runtimeStaticObject.addModifier(
                        env, this.flags, Class_.CONST_MODIFIER_FINAL);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stmt")
    public Object addStmt(RuntimeEnv env, Object... args) {
        Object stmt = assignParameter(args, 0, false);
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.stmts)) {
            throw ZVal.getException(
                    env, new LogicException(env, "Cannot add statements to an abstract method"));
        }

        new ReferenceClassProperty(this, "stmts", env)
                .arrayAppend(env)
                .set(BuilderHelpers.runtimeStaticObject.normalizeStmt(env, stmt));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getNode(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ClassMethod(
                        env,
                        this.name,
                        ZVal.newArray(
                                new ZPair("flags", this.flags),
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

    public static final Object CONST_class = "PhpParser\\Builder\\Method";

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
                    .setName("PhpParser\\Builder\\Method")
                    .setLookup(
                            Method.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "attributes",
                            "flags",
                            "name",
                            "params",
                            "returnByRef",
                            "returnType",
                            "stmts")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Builder/Method.php")
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
