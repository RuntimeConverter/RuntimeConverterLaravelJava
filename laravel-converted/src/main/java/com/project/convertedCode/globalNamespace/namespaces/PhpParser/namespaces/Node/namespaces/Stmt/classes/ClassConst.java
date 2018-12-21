package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Class_;
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

 vendor/nikic/php-parser/lib/PhpParser/Node/Stmt/ClassConst.php

*/

public class ClassConst extends Stmt {

    public Object flags = null;

    public Object consts = null;

    public ClassConst(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ClassConst.class) {
            this.__construct(env, args);
        }
    }

    public ClassConst(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "consts", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "flags",
        typeHint = "int",
        defaultValue = "0",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 2,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object consts = assignParameter(args, 0, false);
        Object flags = assignParameter(args, 1, true);
        if (null == flags) {
            flags = 0;
        }
        Object attributes = assignParameter(args, 2, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        super.__construct(env, attributes);
        this.flags = flags;
        this.consts = consts;
        return null;
    }

    @ConvertedMethod
    public Object getSubNodeNames(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.arrayFromList("flags", "consts"));
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
    public Object getType(RuntimeEnv env, Object... args) {
        return "Stmt_ClassConst";
    }

    public static final Object CONST_class = "PhpParser\\Node\\Stmt\\ClassConst";

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
                    .setName("PhpParser\\Node\\Stmt\\ClassConst")
                    .setLookup(
                            ClassConst.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes", "consts", "flags")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Node/Stmt/ClassConst.php")
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
