package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Stmt;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Identifier;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Class_;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.FunctionLike;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Node/Stmt/ClassMethod.php

*/

public class ClassMethod extends Stmt implements FunctionLike {

    public Object flags = null;

    public Object byRef = null;

    public Object name = null;

    public Object params = null;

    public Object returnType = null;

    public Object stmts = null;

    public ClassMethod(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ClassMethod.class) {
            this.__construct(env, args);
        }
    }

    public ClassMethod(NoConstructor n) {
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
        Object returnType = null;
        super.__construct(env, attributes);
        this.flags =
                ZVal.isDefined(ternaryExpressionTemp = subNodes.arrayGet(env, "flags"))
                        ? ternaryExpressionTemp
                        : ZVal.isDefined(ternaryExpressionTemp = subNodes.arrayGet(env, "type"))
                                ? ternaryExpressionTemp
                                : 0;
        this.byRef =
                ZVal.isDefined(ternaryExpressionTemp = subNodes.arrayGet(env, "byRef"))
                        ? ternaryExpressionTemp
                        : false;
        this.name =
                function_is_string.f.env(env).call(name).getBool()
                        ? new Identifier(env, name)
                        : name;
        this.params =
                ZVal.isDefined(ternaryExpressionTemp = subNodes.arrayGet(env, "params"))
                        ? ternaryExpressionTemp
                        : ZVal.newArray();
        returnType =
                ZVal.assign(
                        ZVal.isDefined(ternaryExpressionTemp = subNodes.arrayGet(env, "returnType"))
                                ? ternaryExpressionTemp
                                : ZVal.getNull());
        this.returnType =
                function_is_string.f.env(env).call(returnType).getBool()
                        ? new Identifier(env, returnType)
                        : returnType;
        this.stmts =
                function_array_key_exists.f.env(env).call("stmts", subNodes.getObject()).getBool()
                        ? subNodes.arrayGet(env, "stmts")
                        : ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    public Object getSubNodeNames(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.arrayFromList("flags", "byRef", "name", "params", "returnType", "stmts"));
    }

    @ConvertedMethod
    public Object returnsByRef(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.byRef);
    }

    @ConvertedMethod
    public Object getParams(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.params);
    }

    @ConvertedMethod
    public Object getReturnType(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.returnType);
    }

    @ConvertedMethod
    public Object getStmts(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.stmts);
    }

    @ConvertedMethod
    public Object isPublic(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        ZVal.toLong(this.flags)
                                                & ZVal.toLong(Class_.CONST_MODIFIER_PUBLIC),
                                        "!==",
                                        0))
                        || ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        ZVal.toLong(this.flags)
                                                & ZVal.toLong(
                                                        Class_.CONST_VISIBILITY_MODIFIER_MASK),
                                        "===",
                                        0)));
    }

    @ConvertedMethod
    public Object isProtected(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(
                        ZVal.toLong(this.flags) & ZVal.toLong(Class_.CONST_MODIFIER_PROTECTED)));
    }

    @ConvertedMethod
    public Object isPrivate(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(ZVal.toLong(this.flags) & ZVal.toLong(Class_.CONST_MODIFIER_PRIVATE)));
    }

    @ConvertedMethod
    public Object isAbstract(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(ZVal.toLong(this.flags) & ZVal.toLong(Class_.CONST_MODIFIER_ABSTRACT)));
    }

    @ConvertedMethod
    public Object isFinal(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(ZVal.toLong(this.flags) & ZVal.toLong(Class_.CONST_MODIFIER_FINAL)));
    }

    @ConvertedMethod
    public Object isStatic(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(ZVal.toLong(this.flags) & ZVal.toLong(Class_.CONST_MODIFIER_STATIC)));
    }

    @ConvertedMethod
    public Object isMagic(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        env.getRequestStaticPropertiesReference(
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
                                        .ClassMethod
                                        .RequestStaticProperties
                                        .class,
                                "magicNames"),
                        env,
                        env.callMethod(this.name, "toLowerString", ClassMethod.class)));
    }

    @ConvertedMethod
    public Object getType(RuntimeEnv env, Object... args) {
        return "Stmt_ClassMethod";
    }

    public static final Object CONST_class = "PhpParser\\Node\\Stmt\\ClassMethod";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Stmt.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object magicNames =
                ZVal.newArray(
                        new ZPair("__construct", true),
                        new ZPair("__destruct", true),
                        new ZPair("__call", true),
                        new ZPair("__callstatic", true),
                        new ZPair("__get", true),
                        new ZPair("__set", true),
                        new ZPair("__isset", true),
                        new ZPair("__unset", true),
                        new ZPair("__sleep", true),
                        new ZPair("__wakeup", true),
                        new ZPair("__tostring", true),
                        new ZPair("__set_state", true),
                        new ZPair("__clone", true),
                        new ZPair("__invoke", true),
                        new ZPair("__debuginfo", true));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PhpParser\\Node\\Stmt\\ClassMethod")
                    .setLookup(
                            ClassMethod.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "attributes", "byRef", "flags", "name", "params", "returnType", "stmts")
                    .setStaticPropertyNames("magicNames")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Node/Stmt/ClassMethod.php")
                    .addInterface("PhpParser\\Node\\FunctionLike")
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
