package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.CodeCleanerPass;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Name;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.FuncCall;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Class_;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.ConstFetch;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Trait_;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.ErrorException;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/CodeCleaner/CalledClassPass.php

*/

public class CalledClassPass extends CodeCleanerPass {

    public Object inClass = null;

    public CalledClassPass(RuntimeEnv env, Object... args) {
        super(env);
    }

    public CalledClassPass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes", typeHint = "array")
    public Object beforeTraverse(RuntimeEnv env, Object... args) {
        Object nodes = assignParameter(args, 0, false);
        this.inClass = false;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    public Object enterNode(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object msg = null;
        Object name = null;
        if (ZVal.toBool(ZVal.checkInstanceType(node, Class_.class, "PhpParser\\Node\\Stmt\\Class_"))
                || ZVal.toBool(
                        ZVal.checkInstanceType(
                                node, Trait_.class, "PhpParser\\Node\\Stmt\\Trait_"))) {
            this.inClass = true;

        } else if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                node, FuncCall.class, "PhpParser\\Node\\Expr\\FuncCall"))
                && ZVal.toBool(!ZVal.isTrue(this.inClass))) {
            if (ZVal.toBool(
                            !ZVal.isEmpty(
                                    toObjectR(node).accessProp(this, env).name("args").value()))
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    this.isNull(
                                            env,
                                            new ReferenceClassProperty(node, "args", env)
                                                    .arrayGet(env, 0))))) {
                return null;
            }

            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            toObjectR(node).accessProp(this, env).name("name").value(),
                            Name.class,
                            "PhpParser\\Node\\Name"))) {
                return null;
            }

            name =
                    NamespaceGlobal.strtolower
                            .env(env)
                            .call(toObjectR(node).accessProp(this, env).name("name").value())
                            .value();
            if (function_in_array
                    .f
                    .env(env)
                    .call(name, ZVal.arrayFromList("get_class", "get_called_class"))
                    .getBool()) {
                msg =
                        function_sprintf
                                .f
                                .env(env)
                                .call("%s() called without object from outside a class", name)
                                .value();
                throw ZVal.getException(
                        env,
                        new ErrorException(
                                env,
                                msg,
                                0,
                                512,
                                ZVal.getNull(),
                                env.callMethod(node, "getLine", CalledClassPass.class)));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    public Object leaveNode(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(node, Class_.class, "PhpParser\\Node\\Stmt\\Class_"))) {
            this.inClass = false;
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    private Object isNull(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.checkInstanceType(
                                        toObjectR(node).accessProp(this, env).name("value").value(),
                                        ConstFetch.class,
                                        "PhpParser\\Node\\Expr\\ConstFetch"))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        NamespaceGlobal.strtolower
                                                .env(env)
                                                .call(
                                                        toObjectR(node)
                                                                .accessProp(this, env)
                                                                .name("value")
                                                                .getObject()
                                                                .accessProp(this, env)
                                                                .name("name")
                                                                .value())
                                                .value(),
                                        "===",
                                        "null")));
    }

    public static final Object CONST_class = "Psy\\CodeCleaner\\CalledClassPass";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends CodeCleanerPass.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\CodeCleaner\\CalledClassPass")
                    .setLookup(
                            CalledClassPass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("inClass")
                    .setFilename("vendor/psy/psysh/src/CodeCleaner/CalledClassPass.php")
                    .addInterface("PhpParser\\NodeVisitor")
                    .addExtendsClass("Psy\\CodeCleaner\\CodeCleanerPass")
                    .addExtendsClass("PhpParser\\NodeVisitorAbstract")
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
