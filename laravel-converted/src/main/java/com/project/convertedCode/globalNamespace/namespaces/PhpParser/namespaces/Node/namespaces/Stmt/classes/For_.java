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
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Node/Stmt/For_.php

*/

public class For_ extends Stmt {

    public Object init = null;

    public Object cond = null;

    public Object loop = null;

    public Object stmts = null;

    public For_(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == For_.class) {
            this.__construct(env, args);
        }
    }

    public For_(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "subNodes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 1,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        ReferenceContainer subNodes = new BasicReferenceContainer(assignParameter(args, 0, true));
        if (null == subNodes.getObject()) {
            subNodes.setObject(ZVal.newArray());
        }
        Object attributes = assignParameter(args, 1, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        Object ternaryExpressionTemp = null;
        super.__construct(env, attributes);
        this.init =
                ZVal.isDefined(ternaryExpressionTemp = subNodes.arrayGet(env, "init"))
                        ? ternaryExpressionTemp
                        : ZVal.newArray();
        this.cond =
                ZVal.isDefined(ternaryExpressionTemp = subNodes.arrayGet(env, "cond"))
                        ? ternaryExpressionTemp
                        : ZVal.newArray();
        this.loop =
                ZVal.isDefined(ternaryExpressionTemp = subNodes.arrayGet(env, "loop"))
                        ? ternaryExpressionTemp
                        : ZVal.newArray();
        this.stmts =
                ZVal.isDefined(ternaryExpressionTemp = subNodes.arrayGet(env, "stmts"))
                        ? ternaryExpressionTemp
                        : ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    public Object getSubNodeNames(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.arrayFromList("init", "cond", "loop", "stmts"));
    }

    @ConvertedMethod
    public Object getType(RuntimeEnv env, Object... args) {
        return "Stmt_For";
    }

    public static final Object CONST_class = "PhpParser\\Node\\Stmt\\For_";

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
                    .setName("PhpParser\\Node\\Stmt\\For_")
                    .setLookup(
                            For_.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes", "cond", "init", "loop", "stmts")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Node/Stmt/For_.php")
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
