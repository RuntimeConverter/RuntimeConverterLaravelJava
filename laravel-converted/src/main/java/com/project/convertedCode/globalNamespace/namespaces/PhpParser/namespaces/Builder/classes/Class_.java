package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Builder.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.BuilderHelpers;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.TraitUse;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.ClassMethod;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Builder.classes.Declaration;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.ClassConst;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Property;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;
import static com.runtimeconverter.runtime.ZVal.assignParameterVarArgs;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Builder/Class_.php

*/

public class Class_ extends Declaration {

    public Object name = null;

    public Object _pExtends = ZVal.getNull();

    public Object _pImplements = ZVal.newArray();

    public Object flags = 0;

    public Object uses = ZVal.newArray();

    public Object constants = ZVal.newArray();

    public Object properties = ZVal.newArray();

    public Object methods = ZVal.newArray();

    public Class_(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Class_.class) {
            this.__construct(env, args);
        }
    }

    public Class_(NoConstructor n) {
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
    @ConvertedParameter(index = 0, name = "class")
    public Object extend(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        this._pExtends = BuilderHelpers.runtimeStaticObject.normalizeName(env, _pClass);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "interfaces")
    public Object implement(RuntimeEnv env, Object... args) {
        Object interfaces = assignParameterVarArgs(args, 0);
        Object _pInterface = null;
        for (ZPair zpairResult840 : ZVal.getIterable(interfaces, env, true)) {
            _pInterface = ZVal.assign(zpairResult840.getValue());
            new ReferenceClassProperty(this, "implements", env)
                    .arrayAppend(env)
                    .set(BuilderHelpers.runtimeStaticObject.normalizeName(env, _pInterface));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object makeAbstract(RuntimeEnv env, Object... args) {
        this.flags =
                BuilderHelpers.runtimeStaticObject.addModifier(
                        env,
                        this.flags,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Stmt
                                .classes
                                .Class_
                                .CONST_MODIFIER_ABSTRACT);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object makeFinal(RuntimeEnv env, Object... args) {
        this.flags =
                BuilderHelpers.runtimeStaticObject.addModifier(
                        env,
                        this.flags,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PhpParser
                                .namespaces
                                .Node
                                .namespaces
                                .Stmt
                                .classes
                                .Class_
                                .CONST_MODIFIER_FINAL);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stmt")
    public Object addStmt(RuntimeEnv env, Object... args) {
        Object stmt = assignParameter(args, 0, false);
        ReferenceContainer targets = new BasicReferenceContainer(null);
        Object _pClass = null;
        stmt = BuilderHelpers.runtimeStaticObject.normalizeNode(env, stmt);
        targets.setObject(
                ZVal.newArray(
                        new ZPair(TraitUse.CONST_class, this.uses),
                        new ZPair(ClassConst.CONST_class, this.constants),
                        new ZPair(Property.CONST_class, this.properties),
                        new ZPair(ClassMethod.CONST_class, this.methods)));
        _pClass = function_get_class.f.env(env).call(stmt).value();
        if (!arrayActionR(ArrayAction.ISSET, targets, env, _pClass)) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Unexpected node of type \"%s\"",
                                            env.callMethod(stmt, "getType", Class_.class))
                                    .value()));
        }

        targets.arrayAppend(env, _pClass).set(stmt);
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
                        .Class_(
                        env,
                        this.name,
                        ZVal.newArray(
                                new ZPair("flags", this.flags),
                                new ZPair("extends", this._pExtends),
                                new ZPair("implements", this._pImplements),
                                new ZPair(
                                        "stmts",
                                        function_array_merge
                                                .f
                                                .env(env)
                                                .call(
                                                        this.uses,
                                                        this.constants,
                                                        this.properties,
                                                        this.methods)
                                                .value())),
                        toObjectR(this).accessProp(this, env).name("attributes").value()));
    }

    public static final Object CONST_class = "PhpParser\\Builder\\Class_";

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
                    .setName("PhpParser\\Builder\\Class_")
                    .setLookup(
                            Class_.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "attributes",
                            "constants",
                            "extends",
                            "flags",
                            "implements",
                            "methods",
                            "name",
                            "properties",
                            "uses")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Builder/Class_.php")
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
