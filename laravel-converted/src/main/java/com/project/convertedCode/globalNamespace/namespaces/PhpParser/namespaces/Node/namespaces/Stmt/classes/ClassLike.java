package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Stmt;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.ClassMethod;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Node/Stmt/ClassLike.php

*/

public abstract class ClassLike extends Stmt {

    public Object name = null;

    public Object stmts = null;

    public ClassLike(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ClassLike.class) {
            this.__construct(env, args);
        }
    }

    public ClassLike(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getMethods(RuntimeEnv env, Object... args) {
        ReferenceContainer methods = new BasicReferenceContainer(null);
        Object stmt = null;
        methods.setObject(ZVal.newArray());
        for (ZPair zpairResult855 : ZVal.getIterable(this.stmts, env, true)) {
            stmt = ZVal.assign(zpairResult855.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            stmt, ClassMethod.class, "PhpParser\\Node\\Stmt\\ClassMethod"))) {
                methods.arrayAppend(env).set(stmt);
            }
        }

        return ZVal.assign(methods.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    public Object getMethod(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object lowerName = null;
        Object stmt = null;
        lowerName = NamespaceGlobal.strtolower.env(env).call(name).value();
        for (ZPair zpairResult856 : ZVal.getIterable(this.stmts, env, true)) {
            stmt = ZVal.assign(zpairResult856.getValue());
            if (ZVal.toBool(
                            ZVal.checkInstanceType(
                                    stmt, ClassMethod.class, "PhpParser\\Node\\Stmt\\ClassMethod"))
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    lowerName,
                                    "===",
                                    env.callMethod(
                                            toObjectR(stmt)
                                                    .accessProp(this, env)
                                                    .name("name")
                                                    .value(),
                                            "toLowerString",
                                            ClassLike.class)))) {
                return ZVal.assign(stmt);
            }
        }

        return ZVal.assign(ZVal.getNull());
    }

    public static final Object CONST_class = "PhpParser\\Node\\Stmt\\ClassLike";

    @ConvertedMethod()
    public abstract Object getType(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object getSubNodeNames(RuntimeEnv env, Object... args);

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
                    .setName("PhpParser\\Node\\Stmt\\ClassLike")
                    .setLookup(
                            ClassLike.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes", "name", "stmts")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Node/Stmt/ClassLike.php")
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
