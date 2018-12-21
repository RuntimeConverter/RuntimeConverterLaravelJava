package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Builder.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.Builder;
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
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Builder/Declaration.php

*/

public abstract class Declaration extends RuntimeClassBase implements Builder {

    public Object attributes = ZVal.newArray();

    public Declaration(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Declaration(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stmts", typeHint = "array")
    public Object addStmts(RuntimeEnv env, Object... args) {
        Object stmts = assignParameter(args, 0, false);
        Object stmt = null;
        for (ZPair zpairResult841 : ZVal.getIterable(stmts, env, true)) {
            stmt = ZVal.assign(zpairResult841.getValue());
            env.callMethod(this, "addStmt", Declaration.class, stmt);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "docComment")
    public Object setDocComment(RuntimeEnv env, Object... args) {
        Object docComment = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "attributes", env)
                .arrayAccess(env, "comments")
                .set(
                        ZVal.newArray(
                                new ZPair(
                                        0,
                                        BuilderHelpers.runtimeStaticObject.normalizeDocComment(
                                                env, docComment))));
        return ZVal.assign(this);
    }

    public static final Object CONST_class = "PhpParser\\Builder\\Declaration";

    @ConvertedMethod()
    public abstract Object getNode(RuntimeEnv env, Object... args);

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
                    .setName("PhpParser\\Builder\\Declaration")
                    .setLookup(
                            Declaration.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Builder/Declaration.php")
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
