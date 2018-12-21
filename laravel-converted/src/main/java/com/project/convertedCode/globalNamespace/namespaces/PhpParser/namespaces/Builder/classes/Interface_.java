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
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.BuilderHelpers;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.ClassMethod;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Builder.classes.Declaration;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.ClassConst;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;
import static com.runtimeconverter.runtime.ZVal.assignParameterVarArgs;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Builder/Interface_.php

*/

public class Interface_ extends Declaration {

    public Object name = null;

    public Object _pExtends = ZVal.newArray();

    public Object constants = ZVal.newArray();

    public Object methods = ZVal.newArray();

    public Interface_(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Interface_.class) {
            this.__construct(env, args);
        }
    }

    public Interface_(NoConstructor n) {
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
    @ConvertedParameter(index = 0, name = "interfaces")
    public Object extend(RuntimeEnv env, Object... args) {
        Object interfaces = assignParameterVarArgs(args, 0);
        Object _pInterface = null;
        for (ZPair zpairResult843 : ZVal.getIterable(interfaces, env, true)) {
            _pInterface = ZVal.assign(zpairResult843.getValue());
            new ReferenceClassProperty(this, "extends", env)
                    .arrayAppend(env)
                    .set(BuilderHelpers.runtimeStaticObject.normalizeName(env, _pInterface));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stmt")
    public Object addStmt(RuntimeEnv env, Object... args) {
        Object stmt = assignParameter(args, 0, false);
        stmt = BuilderHelpers.runtimeStaticObject.normalizeNode(env, stmt);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        stmt, ClassConst.class, "PhpParser\\Node\\Stmt\\ClassConst"))) {
            new ReferenceClassProperty(this, "constants", env).arrayAppend(env).set(stmt);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        stmt, ClassMethod.class, "PhpParser\\Node\\Stmt\\ClassMethod"))) {
            toObjectR(stmt).accessProp(this, env).name("stmts").set(ZVal.getNull());
            new ReferenceClassProperty(this, "methods", env).arrayAppend(env).set(stmt);

        } else {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Unexpected node of type \"%s\"",
                                            env.callMethod(stmt, "getType", Interface_.class))
                                    .value()));
        }

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
                        .Interface_(
                        env,
                        this.name,
                        ZVal.newArray(
                                new ZPair("extends", this._pExtends),
                                new ZPair(
                                        "stmts",
                                        function_array_merge
                                                .f
                                                .env(env)
                                                .call(this.constants, this.methods)
                                                .value())),
                        toObjectR(this).accessProp(this, env).name("attributes").value()));
    }

    public static final Object CONST_class = "PhpParser\\Builder\\Interface_";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Declaration.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PhpParser\\Builder\\Interface_")
                    .setLookup(
                            Interface_.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes", "constants", "extends", "methods", "name")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Builder/Interface_.php")
                    .addInterface("PhpParser\\Builder")
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
