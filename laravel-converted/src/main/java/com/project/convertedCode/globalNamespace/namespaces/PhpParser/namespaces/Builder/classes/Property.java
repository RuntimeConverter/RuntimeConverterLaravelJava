package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Builder.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.Builder;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Class_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.BuilderHelpers;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.PropertyProperty;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Builder/Property.php

*/

public class Property extends RuntimeClassBase implements Builder {

    public Object name = null;

    public Object flags = 0;

    public Object _pDefault = ZVal.getNull();

    public Object attributes = ZVal.newArray();

    public Property(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Property.class) {
            this.__construct(env, args);
        }
    }

    public Property(NoConstructor n) {
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
    @ConvertedParameter(index = 0, name = "value")
    public Object setDefault(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        this._pDefault = BuilderHelpers.runtimeStaticObject.normalizeValue(env, value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "docComment")
    public Object setDocComment(RuntimeEnv env, Object... args) {
        Object docComment = assignParameter(args, 0, false);
        this.attributes =
                ZVal.newArray(
                        new ZPair(
                                "comments",
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                BuilderHelpers.runtimeStaticObject
                                                        .normalizeDocComment(env, docComment)))));
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
                        .Property(
                        env,
                        ZVal.strictNotEqualityCheck(this.flags, "!==", 0)
                                ? this.flags
                                : Class_.CONST_MODIFIER_PUBLIC,
                        ZVal.newArray(
                                new ZPair(0, new PropertyProperty(env, this.name, this._pDefault))),
                        this.attributes));
    }

    public static final Object CONST_class = "PhpParser\\Builder\\Property";

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
                    .setName("PhpParser\\Builder\\Property")
                    .setLookup(
                            Property.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes", "default", "flags", "name")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Builder/Property.php")
                    .addInterface("PhpParser\\Builder")
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
