package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.If_;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Stmt;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Namespace_;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Exit_;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.CodeCleanerPass;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Expr;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Break_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Expression;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Switch_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Return_;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.NoReturnValue;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/CodeCleaner/ImplicitReturnPass.php

*/

public class ImplicitReturnPass extends CodeCleanerPass {

    public ImplicitReturnPass(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ImplicitReturnPass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes", typeHint = "array")
    public Object beforeTraverse(RuntimeEnv env, Object... args) {
        Object nodes = assignParameter(args, 0, false);
        return ZVal.assign(this.addImplicitReturn(env, nodes));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes", typeHint = "array")
    private Object addImplicitReturn(RuntimeEnv env, Object... args) {
        ReferenceContainer nodes = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object last = null;
        Object elseif = null;
        Object caseLast = null;
        Object _pCase = null;
        if (ZVal.isEmpty(nodes.getObject())) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    0,
                                    new Return_(
                                            env, NoReturnValue.runtimeStaticObject.create(env)))));
        }

        last = function_end.f.env(env).call(nodes.getObject()).value();
        if (ZVal.isTrue(ZVal.checkInstanceType(last, If_.class, "PhpParser\\Node\\Stmt\\If_"))) {
            toObjectR(last)
                    .accessProp(this, env)
                    .name("stmts")
                    .set(
                            this.addImplicitReturn(
                                    env,
                                    toObjectR(last).accessProp(this, env).name("stmts").value()));
            for (ZPair zpairResult1341 :
                    ZVal.getIterable(
                            toObjectR(last).accessProp(this, env).name("elseifs").value(),
                            env,
                            true)) {
                elseif = ZVal.assign(zpairResult1341.getValue());
                toObjectR(elseif)
                        .accessProp(this, env)
                        .name("stmts")
                        .set(
                                this.addImplicitReturn(
                                        env,
                                        toObjectR(elseif)
                                                .accessProp(this, env)
                                                .name("stmts")
                                                .value()));
            }

            if (toObjectR(last).accessProp(this, env).name("else").getBool()) {
                toObjectR(last)
                        .accessProp(this, env)
                        .name("else")
                        .getObject()
                        .accessProp(this, env)
                        .name("stmts")
                        .set(
                                this.addImplicitReturn(
                                        env,
                                        toObjectR(last)
                                                .accessProp(this, env)
                                                .name("else")
                                                .getObject()
                                                .accessProp(this, env)
                                                .name("stmts")
                                                .value()));
            }

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(last, Switch_.class, "PhpParser\\Node\\Stmt\\Switch_"))) {
            for (ZPair zpairResult1342 :
                    ZVal.getIterable(
                            toObjectR(last).accessProp(this, env).name("cases").value(),
                            env,
                            true)) {
                _pCase = ZVal.assign(zpairResult1342.getValue());
                caseLast =
                        function_end
                                .f
                                .env(env)
                                .call(toObjectR(_pCase).accessProp(this, env).name("stmts").value())
                                .value();
                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                caseLast, Break_.class, "PhpParser\\Node\\Stmt\\Break_"))) {
                    toObjectR(_pCase)
                            .accessProp(this, env)
                            .name("stmts")
                            .set(
                                    this.addImplicitReturn(
                                            env,
                                            function_array_slice
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            toObjectR(_pCase)
                                                                    .accessProp(this, env)
                                                                    .name("stmts")
                                                                    .value(),
                                                            0,
                                                            -1)
                                                    .value()));
                    new ReferenceClassProperty(_pCase, "stmts", env).arrayAppend(env).set(caseLast);
                }
            }

        } else if (ZVal.toBool(ZVal.checkInstanceType(last, Expr.class, "PhpParser\\Node\\Expr"))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        last, Exit_.class, "PhpParser\\Node\\Expr\\Exit_")))) {
            nodes.arrayAccess(
                            env,
                            ZVal.subtract(
                                    function_count.f.env(env).call(nodes.getObject()).value(), 1))
                    .set(
                            new Return_(
                                    env,
                                    last,
                                    ZVal.newArray(
                                            new ZPair(
                                                    "startLine",
                                                    env.callMethod(
                                                            last,
                                                            "getLine",
                                                            ImplicitReturnPass.class)),
                                            new ZPair(
                                                    "endLine",
                                                    env.callMethod(
                                                            last,
                                                            "getLine",
                                                            ImplicitReturnPass.class)))));

        } else if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                last, Expression.class, "PhpParser\\Node\\Stmt\\Expression"))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        toObjectR(last).accessProp(this, env).name("expr").value(),
                                        Exit_.class,
                                        "PhpParser\\Node\\Expr\\Exit_")))) {
            nodes.arrayAccess(
                            env,
                            ZVal.subtract(
                                    function_count.f.env(env).call(nodes.getObject()).value(), 1))
                    .set(
                            new Return_(
                                    env,
                                    toObjectR(last).accessProp(this, env).name("expr").value(),
                                    ZVal.newArray(
                                            new ZPair(
                                                    "startLine",
                                                    env.callMethod(
                                                            last,
                                                            "getLine",
                                                            ImplicitReturnPass.class)),
                                            new ZPair(
                                                    "endLine",
                                                    env.callMethod(
                                                            last,
                                                            "getLine",
                                                            ImplicitReturnPass.class)))));

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        last, Namespace_.class, "PhpParser\\Node\\Stmt\\Namespace_"))) {
            toObjectR(last)
                    .accessProp(this, env)
                    .name("stmts")
                    .set(
                            this.addImplicitReturn(
                                    env,
                                    toObjectR(last).accessProp(this, env).name("stmts").value()));
        }

        if (ZVal.isTrue(runtimeStaticObject.isNonExpressionStmt(env, last))) {
            nodes.arrayAppend(env)
                    .set(new Return_(env, NoReturnValue.runtimeStaticObject.create(env)));
        }

        return ZVal.assign(nodes.getObject());
    }

    public static final Object CONST_class = "Psy\\CodeCleaner\\ImplicitReturnPass";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends CodeCleanerPass.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
        private Object isNonExpressionStmt(RuntimeEnv env, Object... args) {
            Object node = assignParameter(args, 0, false);
            return ZVal.assign(
                    ZVal.toBool(
                                    ZVal.toBool(
                                                    ZVal.toBool(
                                                                    ZVal.checkInstanceType(
                                                                            node,
                                                                            Stmt.class,
                                                                            "PhpParser\\Node\\Stmt"))
                                                            && ZVal.toBool(
                                                                    !ZVal.isTrue(
                                                                            ZVal.checkInstanceType(
                                                                                    node,
                                                                                    Expression
                                                                                            .class,
                                                                                    "PhpParser\\Node\\Stmt\\Expression"))))
                                            && ZVal.toBool(
                                                    !ZVal.isTrue(
                                                            ZVal.checkInstanceType(
                                                                    node,
                                                                    Return_.class,
                                                                    "PhpParser\\Node\\Stmt\\Return_"))))
                            && ZVal.toBool(
                                    !ZVal.isTrue(
                                            ZVal.checkInstanceType(
                                                    node,
                                                    Namespace_.class,
                                                    "PhpParser\\Node\\Stmt\\Namespace_"))));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\CodeCleaner\\ImplicitReturnPass")
                    .setLookup(
                            ImplicitReturnPass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/psy/psysh/src/CodeCleaner/ImplicitReturnPass.php")
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
