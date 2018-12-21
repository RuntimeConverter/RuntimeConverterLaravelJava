package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Internal.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Class_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Expr;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Internal/PrintableNewAnonClassNode.php

*/

public class PrintableNewAnonClassNode extends Expr {

    public Object ___args = null;

    public Object _pExtends = null;

    public Object _pImplements = null;

    public Object stmts = null;

    public PrintableNewAnonClassNode(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PrintableNewAnonClassNode.class) {
            this.__construct(env, args);
        }
    }

    public PrintableNewAnonClassNode(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "extends",
        typeHint = "PhpParser\\Node\\Name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "implements", typeHint = "array")
    @ConvertedParameter(index = 3, name = "stmts", typeHint = "array")
    @ConvertedParameter(index = 4, name = "attributes", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object ___args = assignParameter(args, 0, false);
        Object _pExtends = assignParameter(args, 1, true);
        if (null == _pExtends) {
            _pExtends = ZVal.getNull();
        }
        Object _pImplements = assignParameter(args, 2, false);
        Object stmts = assignParameter(args, 3, false);
        Object attributes = assignParameter(args, 4, false);
        super.__construct(env, attributes);
        this.___args = ___args;
        this._pExtends = _pExtends;
        this._pImplements = _pImplements;
        this.stmts = stmts;
        return null;
    }

    @ConvertedMethod
    public Object getType(RuntimeEnv env, Object... args) {
        return "Expr_PrintableNewAnonClass";
    }

    @ConvertedMethod
    public Object getSubNodeNames(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.arrayFromList("args", "extends", "implements", "stmts"));
    }

    public static final Object CONST_class = "PhpParser\\Internal\\PrintableNewAnonClassNode";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Expr.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "newNode", typeHint = "PhpParser\\Node\\Expr\\New_")
        public Object fromNewNode(RuntimeEnv env, Object... args) {
            Object newNode = assignParameter(args, 0, false);
            Object _pClass = null;
            _pClass = ZVal.assign(toObjectR(newNode).accessProp(this, env).name("class").value());
            com.runtimeconverter.runtime.ZVal.functionNotFound("_pAssert")
                    .env(env)
                    .call(
                            ZVal.checkInstanceType(
                                    _pClass, Class_.class, "PhpParser\\Node\\Stmt\\Class_"));
            com.runtimeconverter.runtime.ZVal.functionNotFound("_pAssert")
                    .env(env)
                    .call(
                            ZVal.strictEqualityCheck(
                                    toObjectR(_pClass).accessProp(this, env).name("name").value(),
                                    "===",
                                    ZVal.getNull()));
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .PhpParser
                            .namespaces
                            .Internal
                            .classes
                            .PrintableNewAnonClassNode(
                            env,
                            toObjectR(newNode).accessProp(this, env).name("args").value(),
                            toObjectR(_pClass).accessProp(this, env).name("extends").value(),
                            toObjectR(_pClass).accessProp(this, env).name("implements").value(),
                            toObjectR(_pClass).accessProp(this, env).name("stmts").value(),
                            env.callMethod(
                                    newNode, "getAttributes", PrintableNewAnonClassNode.class)));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PhpParser\\Internal\\PrintableNewAnonClassNode")
                    .setLookup(
                            PrintableNewAnonClassNode.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("args", "attributes", "extends", "implements", "stmts")
                    .setFilename(
                            "vendor/nikic/php-parser/lib/PhpParser/Internal/PrintableNewAnonClassNode.php")
                    .addInterface("PhpParser\\Node")
                    .addInterface("JsonSerializable")
                    .addExtendsClass("PhpParser\\Node\\Expr")
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
