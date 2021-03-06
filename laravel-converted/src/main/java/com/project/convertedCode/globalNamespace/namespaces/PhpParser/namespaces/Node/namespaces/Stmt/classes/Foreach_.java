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

 vendor/nikic/php-parser/lib/PhpParser/Node/Stmt/Foreach_.php

*/

public class Foreach_ extends Stmt {

    public Object expr = null;

    public Object keyVar = null;

    public Object byRef = null;

    public Object valueVar = null;

    public Object stmts = null;

    public Foreach_(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Foreach_.class) {
            this.__construct(env, args);
        }
    }

    public Foreach_(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expr", typeHint = "PhpParser\\Node\\Expr")
    @ConvertedParameter(index = 1, name = "valueVar", typeHint = "PhpParser\\Node\\Expr")
    @ConvertedParameter(
        index = 2,
        name = "subNodes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object expr = assignParameter(args, 0, false);
        Object valueVar = assignParameter(args, 1, false);
        ReferenceContainer subNodes = new BasicReferenceContainer(assignParameter(args, 2, true));
        if (null == subNodes.getObject()) {
            subNodes.setObject(ZVal.newArray());
        }
        Object attributes = assignParameter(args, 3, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        Object ternaryExpressionTemp = null;
        super.__construct(env, attributes);
        this.expr = expr;
        this.keyVar =
                ZVal.isDefined(ternaryExpressionTemp = subNodes.arrayGet(env, "keyVar"))
                        ? ternaryExpressionTemp
                        : ZVal.getNull();
        this.byRef =
                ZVal.isDefined(ternaryExpressionTemp = subNodes.arrayGet(env, "byRef"))
                        ? ternaryExpressionTemp
                        : false;
        this.valueVar = valueVar;
        this.stmts =
                ZVal.isDefined(ternaryExpressionTemp = subNodes.arrayGet(env, "stmts"))
                        ? ternaryExpressionTemp
                        : ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    public Object getSubNodeNames(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.arrayFromList("expr", "keyVar", "byRef", "valueVar", "stmts"));
    }

    @ConvertedMethod
    public Object getType(RuntimeEnv env, Object... args) {
        return "Stmt_Foreach";
    }

    public static final Object CONST_class = "PhpParser\\Node\\Stmt\\Foreach_";

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
                    .setName("PhpParser\\Node\\Stmt\\Foreach_")
                    .setLookup(
                            Foreach_.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "attributes", "byRef", "expr", "keyVar", "stmts", "valueVar")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Node/Stmt/Foreach_.php")
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
