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
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.FunctionLike;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Node/Stmt/Function_.php

*/

public class Function_ extends Stmt implements FunctionLike {

    public Object byRef = null;

    public Object name = null;

    public Object params = null;

    public Object returnType = null;

    public Object stmts = null;

    public Function_(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Function_.class) {
            this.__construct(env, args);
        }
    }

    public Function_(NoConstructor n) {
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
                ZVal.isDefined(ternaryExpressionTemp = subNodes.arrayGet(env, "stmts"))
                        ? ternaryExpressionTemp
                        : ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    public Object getSubNodeNames(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.arrayFromList("byRef", "name", "params", "returnType", "stmts"));
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
    public Object getType(RuntimeEnv env, Object... args) {
        return "Stmt_Function";
    }

    public static final Object CONST_class = "PhpParser\\Node\\Stmt\\Function_";

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
                    .setName("PhpParser\\Node\\Stmt\\Function_")
                    .setLookup(
                            Function_.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "attributes", "byRef", "name", "params", "returnType", "stmts")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Node/Stmt/Function_.php")
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
