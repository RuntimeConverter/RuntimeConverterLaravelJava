package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes;

import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Array_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Empty_;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.FatalErrorException;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.CodeCleanerPass;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.MethodCall;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.FuncCall;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Unset_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Assign;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.StaticCall;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Isset_;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/CodeCleaner/FunctionReturnInWriteContextPass.php

*/

public class FunctionReturnInWriteContextPass extends CodeCleanerPass {

    public Object atLeastPhp55 = null;

    public FunctionReturnInWriteContextPass(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FunctionReturnInWriteContextPass.class) {
            this.__construct(env, args);
        }
    }

    public FunctionReturnInWriteContextPass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        this.atLeastPhp55 =
                NamespaceGlobal.version_compare.env(env).call("7.2.11-dev", "5.5", ">=").value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    public Object enterNode(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object node = assignParameter(args, 0, false);
        Object msg = null;
        Object item = null;
        Object var = null;
        Object items = null;
        if (ZVal.toBool(ZVal.checkInstanceType(node, Array_.class, "PhpParser\\Node\\Expr\\Array_"))
                || ZVal.toBool(this.isCallNode(env, node))) {
            items =
                    ZVal.assign(
                            ZVal.isTrue(
                                            ZVal.checkInstanceType(
                                                    node,
                                                    Array_.class,
                                                    "PhpParser\\Node\\Expr\\Array_"))
                                    ? toObjectR(node).accessProp(this, env).name("items").value()
                                    : toObjectR(node).accessProp(this, env).name("args").value());
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1339 : ZVal.getIterable(items, env, true)) {
                item = ZVal.assign(zpairResult1339.getValue());
                if (ZVal.toBool(
                                ZVal.toBool(item)
                                        && ZVal.toBool(
                                                toObjectR(item)
                                                        .accessProp(this, env)
                                                        .name("byRef")
                                                        .value()))
                        && ZVal.toBool(
                                this.isCallNode(
                                        env,
                                        toObjectR(item)
                                                .accessProp(this, env)
                                                .name("value")
                                                .value()))) {
                    throw ZVal.getException(
                            env,
                            new FatalErrorException(
                                    env,
                                    CONST_EXCEPTION_MESSAGE,
                                    0,
                                    1,
                                    ZVal.getNull(),
                                    env.callMethod(
                                            node,
                                            "getLine",
                                            FunctionReturnInWriteContextPass.class)));
                }
            }

        } else if (ZVal.toBool(
                        ZVal.checkInstanceType(node, Isset_.class, "PhpParser\\Node\\Expr\\Isset_"))
                || ZVal.toBool(
                        ZVal.checkInstanceType(
                                node, Unset_.class, "PhpParser\\Node\\Stmt\\Unset_"))) {
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1340 :
                    ZVal.getIterable(
                            toObjectR(node).accessProp(this, env).name("vars").value(),
                            env,
                            true)) {
                var = ZVal.assign(zpairResult1340.getValue());
                if (!ZVal.isTrue(this.isCallNode(env, var))) {
                    continue;
                }

                msg =
                        ZVal.assign(
                                ZVal.toBool(
                                                        ZVal.checkInstanceType(
                                                                node,
                                                                Isset_.class,
                                                                "PhpParser\\Node\\Expr\\Isset_"))
                                                && ZVal.toBool(this.atLeastPhp55)
                                        ? CONST_PHP55_MESSAGE
                                        : CONST_EXCEPTION_MESSAGE);
                throw ZVal.getException(
                        env,
                        new FatalErrorException(
                                env,
                                msg,
                                0,
                                1,
                                ZVal.getNull(),
                                env.callMethod(
                                        node, "getLine", FunctionReturnInWriteContextPass.class)));
            }

        } else if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.checkInstanceType(
                                                node,
                                                Empty_.class,
                                                "PhpParser\\Node\\Expr\\Empty_"))
                                && ZVal.toBool(!ZVal.isTrue(this.atLeastPhp55)))
                && ZVal.toBool(
                        this.isCallNode(
                                env, toObjectR(node).accessProp(this, env).name("expr").value()))) {
            throw ZVal.getException(
                    env,
                    new FatalErrorException(
                            env,
                            CONST_EXCEPTION_MESSAGE,
                            0,
                            1,
                            ZVal.getNull(),
                            env.callMethod(
                                    node, "getLine", FunctionReturnInWriteContextPass.class)));

        } else if (ZVal.toBool(
                        ZVal.checkInstanceType(node, Assign.class, "PhpParser\\Node\\Expr\\Assign"))
                && ZVal.toBool(
                        this.isCallNode(
                                env, toObjectR(node).accessProp(this, env).name("var").value()))) {
            throw ZVal.getException(
                    env,
                    new FatalErrorException(
                            env,
                            CONST_EXCEPTION_MESSAGE,
                            0,
                            1,
                            ZVal.getNull(),
                            env.callMethod(
                                    node, "getLine", FunctionReturnInWriteContextPass.class)));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    private Object isCallNode(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.checkInstanceType(
                                                        node,
                                                        FuncCall.class,
                                                        "PhpParser\\Node\\Expr\\FuncCall"))
                                        || ZVal.toBool(
                                                ZVal.checkInstanceType(
                                                        node,
                                                        MethodCall.class,
                                                        "PhpParser\\Node\\Expr\\MethodCall")))
                        || ZVal.toBool(
                                ZVal.checkInstanceType(
                                        node,
                                        StaticCall.class,
                                        "PhpParser\\Node\\Expr\\StaticCall")));
    }

    public static final Object CONST_PHP55_MESSAGE =
            "Cannot use isset() on the result of a function call (you can use \"null !== func()\" instead)";

    public static final Object CONST_EXCEPTION_MESSAGE =
            "Can't use function return value in write context";

    public static final Object CONST_class = "Psy\\CodeCleaner\\FunctionReturnInWriteContextPass";

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
                    .setName("Psy\\CodeCleaner\\FunctionReturnInWriteContextPass")
                    .setLookup(
                            FunctionReturnInWriteContextPass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("atLeastPhp55")
                    .setFilename(
                            "vendor/psy/psysh/src/CodeCleaner/FunctionReturnInWriteContextPass.php")
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
