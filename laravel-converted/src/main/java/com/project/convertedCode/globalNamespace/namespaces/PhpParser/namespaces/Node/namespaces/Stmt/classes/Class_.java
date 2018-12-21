package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.Error;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Identifier;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.ClassLike;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Node/Stmt/Class_.php

*/

public class Class_ extends ClassLike {

    public Object flags = null;

    public Object _pExtends = null;

    public Object _pImplements = null;

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
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "subNodes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        ReferenceContainer subNodes = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == subNodes.getObject()) {
            subNodes.setObject(ZVal.newArray());
        }
        Object attributes = assignParameter(args, 2, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        Object ternaryExpressionTemp = null;
        super.__construct(env, attributes);
        this.flags =
                ZVal.isDefined(ternaryExpressionTemp = subNodes.arrayGet(env, "flags"))
                        ? ternaryExpressionTemp
                        : ZVal.isDefined(ternaryExpressionTemp = subNodes.arrayGet(env, "type"))
                                ? ternaryExpressionTemp
                                : 0;
        toObjectR(this)
                .accessProp(this, env)
                .name("name")
                .set(
                        function_is_string.f.env(env).call(name).getBool()
                                ? new Identifier(env, name)
                                : name);
        this._pExtends =
                ZVal.isDefined(ternaryExpressionTemp = subNodes.arrayGet(env, "extends"))
                        ? ternaryExpressionTemp
                        : ZVal.getNull();
        this._pImplements =
                ZVal.isDefined(ternaryExpressionTemp = subNodes.arrayGet(env, "implements"))
                        ? ternaryExpressionTemp
                        : ZVal.newArray();
        toObjectR(this)
                .accessProp(this, env)
                .name("stmts")
                .set(
                        ZVal.isDefined(ternaryExpressionTemp = subNodes.arrayGet(env, "stmts"))
                                ? ternaryExpressionTemp
                                : ZVal.newArray());
        return null;
    }

    @ConvertedMethod
    public Object getSubNodeNames(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.arrayFromList("flags", "name", "extends", "implements", "stmts"));
    }

    @ConvertedMethod
    public Object isAbstract(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(ZVal.toLong(this.flags) & ZVal.toLong(CONST_MODIFIER_ABSTRACT)));
    }

    @ConvertedMethod
    public Object isFinal(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(ZVal.toLong(this.flags) & ZVal.toLong(CONST_MODIFIER_FINAL)));
    }

    @ConvertedMethod
    public Object isAnonymous(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        ZVal.getNull(),
                        "===",
                        toObjectR(this).accessProp(this, env).name("name").value()));
    }

    @ConvertedMethod
    public Object getType(RuntimeEnv env, Object... args) {
        return "Stmt_Class";
    }

    public static final Object CONST_MODIFIER_PUBLIC = 1;

    public static final Object CONST_MODIFIER_PROTECTED = 2;

    public static final Object CONST_MODIFIER_PRIVATE = 4;

    public static final Object CONST_MODIFIER_STATIC = 8;

    public static final Object CONST_MODIFIER_ABSTRACT = 16;

    public static final Object CONST_MODIFIER_FINAL = 32;

    public static final Object CONST_VISIBILITY_MODIFIER_MASK = 7;

    public static final Object CONST_class = "PhpParser\\Node\\Stmt\\Class_";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ClassLike.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "a")
        @ConvertedParameter(index = 1, name = "b")
        public Object verifyModifier(RuntimeEnv env, Object... args) {
            Object a = assignParameter(args, 0, false);
            Object b = assignParameter(args, 1, false);
            if (ZVal.toBool(ZVal.toLong(a) & ZVal.toLong(CONST_VISIBILITY_MODIFIER_MASK))
                    && ZVal.toBool(ZVal.toLong(b) & ZVal.toLong(CONST_VISIBILITY_MODIFIER_MASK))) {
                throw ZVal.getException(
                        env, new Error(env, "Multiple access type modifiers are not allowed"));
            }

            if (ZVal.toBool(ZVal.toLong(a) & ZVal.toLong(CONST_MODIFIER_ABSTRACT))
                    && ZVal.toBool(ZVal.toLong(b) & ZVal.toLong(CONST_MODIFIER_ABSTRACT))) {
                throw ZVal.getException(
                        env, new Error(env, "Multiple abstract modifiers are not allowed"));
            }

            if (ZVal.toBool(ZVal.toLong(a) & ZVal.toLong(CONST_MODIFIER_STATIC))
                    && ZVal.toBool(ZVal.toLong(b) & ZVal.toLong(CONST_MODIFIER_STATIC))) {
                throw ZVal.getException(
                        env, new Error(env, "Multiple static modifiers are not allowed"));
            }

            if (ZVal.toBool(ZVal.toLong(a) & ZVal.toLong(CONST_MODIFIER_FINAL))
                    && ZVal.toBool(ZVal.toLong(b) & ZVal.toLong(CONST_MODIFIER_FINAL))) {
                throw ZVal.getException(
                        env, new Error(env, "Multiple final modifiers are not allowed"));
            }

            if (ZVal.toBool(ZVal.toLong(a) & ZVal.toLong(48))
                    && ZVal.toBool(ZVal.toLong(b) & ZVal.toLong(48))) {
                throw ZVal.getException(
                        env,
                        new Error(
                                env, "Cannot use the final modifier on an abstract class member"));
            }

            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PhpParser\\Node\\Stmt\\Class_")
                    .setLookup(
                            Class_.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "attributes", "extends", "flags", "implements", "name", "stmts")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Node/Stmt/Class_.php")
                    .addInterface("PhpParser\\Node")
                    .addInterface("JsonSerializable")
                    .addExtendsClass("PhpParser\\Node\\Stmt\\ClassLike")
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
