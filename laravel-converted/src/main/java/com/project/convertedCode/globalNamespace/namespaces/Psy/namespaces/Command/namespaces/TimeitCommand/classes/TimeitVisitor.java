package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.namespaces.TimeitCommand.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.FunctionLike;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.NodeVisitorAbstract;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Name.classes.FullyQualified;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Expr;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Expression;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Arg;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.StaticCall;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Return_;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.NoReturnValue;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Command/TimeitCommand/TimeitVisitor.php

*/

public class TimeitVisitor extends NodeVisitorAbstract {

    public Object functionDepth = null;

    public TimeitVisitor(RuntimeEnv env, Object... args) {
        super(env);
    }

    public TimeitVisitor(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes", typeHint = "array")
    public Object beforeTraverse(RuntimeEnv env, Object... args) {
        Object nodes = assignParameter(args, 0, false);
        this.functionDepth = 0;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    public Object enterNode(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        node, FunctionLike.class, "PhpParser\\Node\\FunctionLike"))) {
            this.functionDepth = ZVal.increment(this.functionDepth);
            return null;
        }

        if (ZVal.toBool(ZVal.strictEqualityCheck(this.functionDepth, "===", 0))
                && ZVal.toBool(
                        ZVal.checkInstanceType(
                                node, Return_.class, "PhpParser\\Node\\Stmt\\Return_"))) {
            return ZVal.assign(
                    new Return_(
                            env,
                            this.getEndCall(
                                    env,
                                    toObjectR(node).accessProp(this, env).name("expr").value()),
                            env.callMethod(node, "getAttributes", TimeitVisitor.class)));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    public Object leaveNode(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        node, FunctionLike.class, "PhpParser\\Node\\FunctionLike"))) {
            this.functionDepth = ZVal.decrement(this.functionDepth);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes", typeHint = "array")
    public Object afterTraverse(RuntimeEnv env, Object... args) {
        ReferenceContainer nodes = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object last = null;
        function_array_unshift
                .f
                .env(env)
                .call(nodes.getObject(), this.maybeExpression(env, this.getStartCall(env)));
        last =
                ZVal.assign(
                        nodes.arrayGet(
                                env,
                                ZVal.subtract(
                                        function_count.f.env(env).call(nodes.getObject()).value(),
                                        1)));
        if (ZVal.isTrue(ZVal.checkInstanceType(last, Expr.class, "PhpParser\\Node\\Expr"))) {
            function_array_pop.f.env(env).call(nodes.getObject());
            nodes.arrayAppend(env).set(this.getEndCall(env, last));

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        last, Expression.class, "PhpParser\\Node\\Stmt\\Expression"))) {
            function_array_pop.f.env(env).call(nodes.getObject());
            nodes.arrayAppend(env)
                    .set(
                            new Expression(
                                    env,
                                    this.getEndCall(
                                            env,
                                            toObjectR(last)
                                                    .accessProp(this, env)
                                                    .name("expr")
                                                    .value()),
                                    env.callMethod(last, "getAttributes", TimeitVisitor.class)));

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(last, Return_.class, "PhpParser\\Node\\Stmt\\Return_"))) {

        } else {
            nodes.arrayAppend(env).set(this.maybeExpression(env, this.getEndCall(env)));
        }

        return ZVal.assign(nodes.getObject());
    }

    @ConvertedMethod
    private Object getStartCall(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new StaticCall(
                        env, new FullyQualified(env, "Psy\\Command\\TimeitCommand"), "markStart"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "arg",
        typeHint = "PhpParser\\Node\\Expr",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    private Object getEndCall(RuntimeEnv env, Object... args) {
        Object arg = assignParameter(args, 0, true);
        if (null == arg) {
            arg = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(arg, "===", ZVal.getNull())) {
            arg = NoReturnValue.runtimeStaticObject.create(env);
        }

        return ZVal.assign(
                new StaticCall(
                        env,
                        new FullyQualified(env, "Psy\\Command\\TimeitCommand"),
                        "markEnd",
                        ZVal.newArray(new ZPair(0, new Arg(env, arg)))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expr")
    @ConvertedParameter(index = 1, name = "attrs", defaultValue = "", defaultValueType = "array")
    private Object maybeExpression(RuntimeEnv env, Object... args) {
        Object expr = assignParameter(args, 0, false);
        Object attrs = assignParameter(args, 1, true);
        if (null == attrs) {
            attrs = ZVal.newArray();
        }
        return ZVal.assign(
                function_class_exists.f.env(env).call("PhpParser\\Node\\Stmt\\Expression").getBool()
                        ? new Expression(env, expr, attrs)
                        : expr);
    }

    public static final Object CONST_class = "Psy\\Command\\TimeitCommand\\TimeitVisitor";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends NodeVisitorAbstract.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Command\\TimeitCommand\\TimeitVisitor")
                    .setLookup(
                            TimeitVisitor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("functionDepth")
                    .setFilename("vendor/psy/psysh/src/Command/TimeitCommand/TimeitVisitor.php")
                    .addInterface("PhpParser\\NodeVisitor")
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
