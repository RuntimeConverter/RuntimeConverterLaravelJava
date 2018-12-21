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
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.TraitUse;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.ClassMethod;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Builder.classes.Declaration;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Property;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Builder/Trait_.php

*/

public class Trait_ extends Declaration {

    public Object name = null;

    public Object uses = ZVal.newArray();

    public Object properties = ZVal.newArray();

    public Object methods = ZVal.newArray();

    public Trait_(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Trait_.class) {
            this.__construct(env, args);
        }
    }

    public Trait_(NoConstructor n) {
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
        stmt = BuilderHelpers.runtimeStaticObject.normalizeNode(env, stmt);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(stmt, Property.class, "PhpParser\\Node\\Stmt\\Property"))) {
            new ReferenceClassProperty(this, "properties", env).arrayAppend(env).set(stmt);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        stmt, ClassMethod.class, "PhpParser\\Node\\Stmt\\ClassMethod"))) {
            new ReferenceClassProperty(this, "methods", env).arrayAppend(env).set(stmt);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(stmt, TraitUse.class, "PhpParser\\Node\\Stmt\\TraitUse"))) {
            new ReferenceClassProperty(this, "uses", env).arrayAppend(env).set(stmt);

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
                                            env.callMethod(stmt, "getType", Trait_.class))
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
                        .Trait_(
                        env,
                        this.name,
                        ZVal.newArray(
                                new ZPair(
                                        "stmts",
                                        function_array_merge
                                                .f
                                                .env(env)
                                                .call(this.uses, this.properties, this.methods)
                                                .value())),
                        toObjectR(this).accessProp(this, env).name("attributes").value()));
    }

    public static final Object CONST_class = "PhpParser\\Builder\\Trait_";

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
                    .setName("PhpParser\\Builder\\Trait_")
                    .setLookup(
                            Trait_.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes", "methods", "name", "properties", "uses")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Builder/Trait_.php")
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
