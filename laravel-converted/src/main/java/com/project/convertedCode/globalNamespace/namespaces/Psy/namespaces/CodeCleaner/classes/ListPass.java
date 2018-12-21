package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes;

import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Array_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.List_;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Variable;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.ParseErrorException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.CodeCleanerPass;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.ArrayItem;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Assign;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/CodeCleaner/ListPass.php

*/

public class ListPass extends CodeCleanerPass {

    public Object atLeastPhp71 = null;

    public ListPass(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ListPass.class) {
            this.__construct(env, args);
        }
    }

    public ListPass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        this.atLeastPhp71 =
                NamespaceGlobal.version_compare.env(env).call("7.2.11-dev", "7.1", ">=").value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    public Object enterNode(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object node = assignParameter(args, 0, false);
        Object msg = null;
        Object itemFound = null;
        Object item = null;
        Object items = null;
        Object value = null;
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(node, Assign.class, "PhpParser\\Node\\Expr\\Assign"))) {
            return null;
        }

        if (ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        toObjectR(node).accessProp(this, env).name("var").value(),
                                        Array_.class,
                                        "PhpParser\\Node\\Expr\\Array_")))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        toObjectR(node).accessProp(this, env).name("var").value(),
                                        List_.class,
                                        "PhpParser\\Node\\Expr\\List_")))) {
            return null;
        }

        if (ZVal.toBool(!ZVal.isTrue(this.atLeastPhp71))
                && ZVal.toBool(
                        ZVal.checkInstanceType(
                                toObjectR(node).accessProp(this, env).name("var").value(),
                                Array_.class,
                                "PhpParser\\Node\\Expr\\Array_"))) {
            msg = "syntax error, unexpected '='";
            throw ZVal.getException(
                    env,
                    new ParseErrorException(
                            env,
                            msg,
                            env.callMethod(
                                    toObjectR(node).accessProp(this, env).name("expr").value(),
                                    "getLine",
                                    ListPass.class)));
        }

        items =
                ZVal.assign(
                        ZVal.isset(
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("var")
                                                .getObject()
                                                .accessProp(this, env)
                                                .name("items")
                                                .value())
                                ? toObjectR(node)
                                        .accessProp(this, env)
                                        .name("var")
                                        .getObject()
                                        .accessProp(this, env)
                                        .name("items")
                                        .value()
                                : toObjectR(node)
                                        .accessProp(this, env)
                                        .name("var")
                                        .getObject()
                                        .accessProp(this, env)
                                        .name("vars")
                                        .value());
        if (ZVal.toBool(ZVal.strictEqualityCheck(items, "===", ZVal.newArray()))
                || ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                items, "===", ZVal.newArray(new ZPair(0, ZVal.getNull()))))) {
            throw ZVal.getException(
                    env,
                    new ParseErrorException(
                            env,
                            "Cannot use empty list",
                            env.callMethod(
                                    toObjectR(node).accessProp(this, env).name("var").value(),
                                    "getLine",
                                    ListPass.class)));
        }

        itemFound = false;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1343 : ZVal.getIterable(items, env, true)) {
            item = ZVal.assign(zpairResult1343.getValue());
            if (ZVal.strictEqualityCheck(item, "===", ZVal.getNull())) {
                continue;
            }

            itemFound = true;
            if (ZVal.toBool(
                            ZVal.toBool(!ZVal.isTrue(this.atLeastPhp71))
                                    && ZVal.toBool(
                                            ZVal.checkInstanceType(
                                                    item,
                                                    ArrayItem.class,
                                                    "PhpParser\\Node\\Expr\\ArrayItem")))
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    toObjectR(item).accessProp(this, env).name("key").value(),
                                    "!==",
                                    ZVal.getNull()))) {
                msg = "Syntax error, unexpected T_CONSTANT_ENCAPSED_STRING, expecting ',' or ')'";
                throw ZVal.getException(
                        env,
                        new ParseErrorException(
                                env,
                                msg,
                                env.callMethod(
                                        toObjectR(item).accessProp(this, env).name("key").value(),
                                        "getLine",
                                        ListPass.class)));
            }

            value =
                    ZVal.assign(
                            ZVal.isTrue(
                                            ZVal.checkInstanceType(
                                                    item,
                                                    ArrayItem.class,
                                                    "PhpParser\\Node\\Expr\\ArrayItem"))
                                    ? toObjectR(item).accessProp(this, env).name("value").value()
                                    : item);
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            value, Variable.class, "PhpParser\\Node\\Expr\\Variable"))) {
                msg = "Assignments can only happen to writable values";
                throw ZVal.getException(
                        env,
                        new ParseErrorException(
                                env, msg, env.callMethod(item, "getLine", ListPass.class)));
            }
        }

        if (!ZVal.isTrue(itemFound)) {
            throw ZVal.getException(env, new ParseErrorException(env, "Cannot use empty list"));
        }

        return null;
    }

    public static final Object CONST_class = "Psy\\CodeCleaner\\ListPass";

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
                    .setName("Psy\\CodeCleaner\\ListPass")
                    .setLookup(
                            ListPass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("atLeastPhp71")
                    .setFilename("vendor/psy/psysh/src/CodeCleaner/ListPass.php")
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
